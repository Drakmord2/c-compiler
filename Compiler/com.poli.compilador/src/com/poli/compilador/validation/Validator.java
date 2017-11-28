package com.poli.compilador.validation;

import com.poli.compilador.c.*;
import java.util.*;

public class Validator {

	public static enum Tipo { INT, BOOL, STR}
	
	public static boolean correct(Command c, Map<String,Tipo> binds) {
		
		if (c instanceof IfCmd) {
			Expression exp = ((IfCmd) c).getExp();
			
			if ( tipode(exp, binds) == Tipo.BOOL) {
				return true;
			}else {
				return false;	
			}
		}
		
		return false;
	}
	
	public static Tipo tipode(Expression e, Map<String,Tipo> binds) {

		if (e instanceof IntLit) {
			return Tipo.INT;
		}
		
		if (e instanceof TrueLit) { 
			return Tipo.BOOL;
		}
		
		if (e instanceof FalseLit) { 
			return Tipo.BOOL;
		}
		
		if (e instanceof LogicExp) {
			LogicExp le = (LogicExp)e;
			
			for (Object a : le.getArgs()) {
				Expression exp	= (Expression) a;
				Tipo tipo 		= tipode(exp, binds);
				
				if ( tipo != Tipo.BOOL) {
					return null;
				}
			}
			
			return Tipo.BOOL;
		}
		
		if (e instanceof RelExp) {
			RelExp re = (RelExp)e;
			
			for (Object a : re.getArgs()) {
				Expression exp	= (Expression) a;
				Tipo tipo 		= tipode(exp, binds);
				
				if ( tipo != Tipo.INT) {
					return null;
				}
			}
			
			return Tipo.BOOL;
		}
		
		if (e instanceof ArithExp) {
			ArithExp ar = (ArithExp)e;
			
			for (Object a : ar.getArgs()) {
				Expression exp	= (Expression) a;
				Tipo tipo 		= tipode(exp, binds);
				
				if ( tipo != Tipo.INT) {
					return null;
				}
			}
			
			return Tipo.INT;
		}
		
		if (e instanceof Term) {
			Term t = (Term)e;
			
			for (Object a : t.getArgs()) {
				Expression exp 	= (Expression) a;
				Tipo tipo 		= tipode(exp, binds);
				
				if ( tipo != Tipo.INT) {
					return null;
				}
			}
			
			return Tipo.INT;
		}
		
		if (e instanceof PostfixOp) {
			return Tipo.INT;
		}
		
		if (e instanceof PrefixOp) {
			String op = ((PrefixOp) e).getUo();

			if (op.equals("!")) {
				return Tipo.BOOL;
			}
			
			return Tipo.INT;
		}
		
		if (e instanceof Parenteses) {
			Expression exp = ((Parenteses) e).getExp();
			
			return tipode(exp, binds);
		}
		
		if (e instanceof Var) {
			Definition def	= ((Var) e).getValor();
			Type tipoDecl	= ((VarDecl) def).getTipo();
			
			switch (tipoDecl.getTipo()) {
				case "int": 
					return Tipo.INT;
				case "bool":
					return Tipo.BOOL;
				case "string":
					return Tipo.STR;
				default:
					return null;
			}
		}
		
		return null;
	}
	
}
