/**
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.poli.compilador.c.Argument;
import com.poli.compilador.c.Assignment;
import com.poli.compilador.c.Command;
import com.poli.compilador.c.Declaration;
import com.poli.compilador.c.Definition;
import com.poli.compilador.c.Expression;
import com.poli.compilador.c.Function;
import com.poli.compilador.c.IfCmd;
import com.poli.compilador.c.PrintCmd;
import com.poli.compilador.c.Program;
import com.poli.compilador.c.ReturnCmd;
import com.poli.compilador.c.Struct;
import com.poli.compilador.c.VarCmd;
import com.poli.compilador.validation.Validator;
import java.util.Stack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class CGenerator extends AbstractGenerator {
  public int label = 0;
  
  public Stack<String> fName = new Stack<String>();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Program p = IteratorExtensions.<Program>head(Iterators.<Program>filter(resource.getAllContents(), Program.class));
    String filename = resource.getURI().lastSegment().split("\\.")[0];
    fsa.generateFile((filename + ".asm"), this.compile(p));
  }
  
  public CharSequence compile(final Program P) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".data");
    _builder.newLine();
    {
      EList<Definition> _definition = P.getDefinition();
      for(final Definition D : _definition) {
        CharSequence _definition_1 = this.definition(D);
        _builder.append(_definition_1);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("exit:");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("li $v0, 10");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("syscall");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence definition(final Definition D) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if ((D instanceof Function)) {
      _matched=true;
      _switchResult = this.function(((Function) D));
    }
    if (!_matched) {
      if ((D instanceof Declaration)) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("# Declaration");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if ((D instanceof Struct)) {
        _matched=true;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("# Struct");
        _switchResult = _builder_1;
      }
    }
    return _switchResult;
  }
  
  public String function(final Function F) {
    this.fName.push(F.getName());
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".text");
    _builder.newLine();
    {
      boolean _equals = F.getName().equals("main");
      if (_equals) {
        _builder.append(".globl main");
        _builder.newLine();
        String _name = F.getName();
        _builder.append(_name);
        _builder.append(":");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("_");
        String _name_1 = F.getName();
        _builder.append(_name_1);
        _builder.append(":");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    CharSequence _functionEntry = this.functionEntry(0, 8);
    _builder.append(_functionEntry, "\t");
    _builder.newLineIfNotEmpty();
    {
      EList<Command> _commands = F.getCommands();
      for(final Command C : _commands) {
        _builder.append("\t");
        CharSequence _command = this.command(C);
        _builder.append(_command, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    CharSequence _functionExit = this.functionExit(0);
    _builder.append(_functionExit, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    String str = _builder.toString();
    return str;
  }
  
  public CharSequence functionEntry(final int paramSize, final int localSize) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("sw\t \t$ra, 0($sp)");
    _builder.newLine();
    _builder.append("addiu \t$sp, $sp, -4");
    _builder.newLine();
    _builder.append("sw   \t$fp, 0($sp)");
    _builder.newLine();
    _builder.append("addiu\t$sp, $sp, -4");
    _builder.newLine();
    _builder.append("addu \t$fp, $sp, ");
    _builder.append((paramSize + 8));
    _builder.newLineIfNotEmpty();
    _builder.append("subu \t$sp, $sp, ");
    _builder.append(localSize);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence functionExit(final int paramSize) {
    StringConcatenation _builder = new StringConcatenation();
    String _pop = this.fName.pop();
    _builder.append(_pop);
    _builder.append("_return:");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("lw   $ra, ");
    _builder.append(paramSize, "  ");
    _builder.append("($fp)");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("move $t0, $fp");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("lw   $fp, ");
    _builder.append((paramSize + 4), "  ");
    _builder.append("($fp)");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("move $sp, $t0");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("jr   $ra");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence command(final Command C) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if ((C instanceof PrintCmd)) {
      _matched=true;
      _switchResult = this.printCommand(((PrintCmd) C));
    }
    if (!_matched) {
      if ((C instanceof IfCmd)) {
        _matched=true;
        _switchResult = this.ifCommand(((IfCmd) C));
      }
    }
    if (!_matched) {
      if ((C instanceof ReturnCmd)) {
        _matched=true;
        _switchResult = this.returnCommand(((ReturnCmd) C));
      }
    }
    return _switchResult;
  }
  
  public CharSequence printCommand(final PrintCmd C) {
    StringConcatenation _builder = new StringConcatenation();
    String str = _builder.toString();
    final Validator.Tipo tipo = Validator.tipode(C.getExp(), null);
    String _str = str;
    CharSequence _expression = this.expression(C.getExp());
    str = (_str + _expression);
    String _str_1 = str;
    CharSequence _pop = this.pop("a0");
    str = (_str_1 + _pop);
    if ((Objects.equal(tipo, Validator.Tipo.INT) || Objects.equal(tipo, Validator.Tipo.BOOL))) {
      String _str_2 = str;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("li $v0, 1");
      str = (_str_2 + _builder_1);
    } else {
      boolean _equals = Objects.equal(tipo, Validator.Tipo.STR);
      if (_equals) {
        String _str_3 = str;
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("li $v0, 4");
        str = (_str_3 + _builder_2);
      }
    }
    String _str_4 = str;
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.newLine();
    _builder_3.append("syscall");
    _builder_3.newLine();
    _builder_3.newLine();
    str = (_str_4 + _builder_3);
    return str;
  }
  
  public CharSequence ifCommand(final IfCmd C) {
    StringConcatenation _builder = new StringConcatenation();
    String str = _builder.toString();
    final String falsel = this.nextLabel();
    final String truel = this.nextLabel();
    String _str = str;
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.newLine();
    CharSequence _expression = this.expression(C.getExp());
    _builder_1.append(_expression);
    _builder_1.newLineIfNotEmpty();
    _builder_1.newLine();
    str = (_str + _builder_1);
    String _str_1 = str;
    CharSequence _pop = this.pop("t0");
    str = (_str_1 + _pop);
    String _str_2 = str;
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("bne $t0, 1, ");
    _builder_2.append(falsel);
    _builder_2.newLineIfNotEmpty();
    _builder_2.newLine();
    str = (_str_2 + _builder_2);
    EList<Command> _trueCommands = C.getTrueCommands();
    for (final Command tc : _trueCommands) {
      String _str_3 = str;
      StringConcatenation _builder_3 = new StringConcatenation();
      CharSequence _command = this.command(tc);
      _builder_3.append(_command);
      _builder_3.newLineIfNotEmpty();
      str = (_str_3 + _builder_3);
    }
    String _str_4 = str;
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("j ");
    _builder_4.append(truel);
    _builder_4.newLineIfNotEmpty();
    _builder_4.newLine();
    str = (_str_4 + _builder_4);
    String _str_5 = str;
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append(falsel);
    _builder_5.append(":");
    _builder_5.newLineIfNotEmpty();
    str = (_str_5 + _builder_5);
    EList<Command> _falseCommands = C.getFalseCommands();
    boolean _tripleNotEquals = (_falseCommands != null);
    if (_tripleNotEquals) {
      EList<Command> _falseCommands_1 = C.getFalseCommands();
      for (final Command fc : _falseCommands_1) {
        String _str_6 = str;
        StringConcatenation _builder_6 = new StringConcatenation();
        CharSequence _command_1 = this.command(fc);
        _builder_6.append(_command_1);
        _builder_6.newLineIfNotEmpty();
        str = (_str_6 + _builder_6);
      }
    }
    String _str_7 = str;
    StringConcatenation _builder_7 = new StringConcatenation();
    _builder_7.newLine();
    _builder_7.append(truel);
    _builder_7.append(":");
    _builder_7.newLineIfNotEmpty();
    str = (_str_7 + _builder_7);
    return str;
  }
  
  public String returnCommand(final ReturnCmd C) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      String str = _builder.toString();
      Expression _exp = C.getExp();
      boolean _tripleNotEquals = (_exp != null);
      if (_tripleNotEquals) {
        String _str = str;
        CharSequence _expression = this.expression(C.getExp());
        str = (_str + _expression);
        String _str_1 = str;
        CharSequence _pop = this.pop("v0");
        str = (_str_1 + _pop);
      }
      String _str_2 = str;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("j ");
      String _peek = this.fName.peek();
      _builder_1.append(_peek);
      _builder_1.append("_return");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _xblockexpression = str = (_str_2 + _builder_1);
    }
    return _xblockexpression;
  }
  
  public CharSequence varCommand(final VarCmd V) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _val = V.getVal();
      boolean _hasElements = false;
      for(final EObject v : _val) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("");
        } else {
          _builder.appendImmediate(" ", "");
        }
        {
          if ((v instanceof Expression)) {
            CharSequence _expression = this.expression(((Expression)v));
            _builder.append(_expression);
            _builder.newLineIfNotEmpty();
          } else {
            if ((v instanceof Assignment)) {
              Assignment atr = ((Assignment) v);
              _builder.newLineIfNotEmpty();
              CharSequence _assign = this.assign(atr);
              _builder.append(_assign);
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      if (_hasElements) {
        _builder.append("");
      }
    }
    return _builder;
  }
  
  public CharSequence expression(final Expression E) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence assign(final Assignment A) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# load, move");
    _builder.newLine();
    CharSequence _expression = this.expression(A.getExp());
    _builder.append(_expression);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence argument(final Argument A) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# arg");
    _builder.newLine();
    return _builder;
  }
  
  public String nextLabel() {
    this.label++;
    return ("L" + Integer.valueOf(this.label));
  }
  
  public CharSequence push(final String reg) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("addiu\t$sp, $sp, -4");
    _builder.newLine();
    _builder.append("sw\t\t$");
    _builder.append(reg);
    _builder.append(", ($sp)");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence pop(final String reg) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("lw \t\t$");
    _builder.append(reg);
    _builder.append(", ($sp)");
    _builder.newLineIfNotEmpty();
    _builder.append("addiu\t$sp, $sp, 4");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
