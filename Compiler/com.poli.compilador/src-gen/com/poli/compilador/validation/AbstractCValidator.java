/*
 * generated by Xtext 2.12.0
 */
package com.poli.compilador.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractCValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.poli.compilador.c.CPackage.eINSTANCE);
		return result;
	}
	
}
