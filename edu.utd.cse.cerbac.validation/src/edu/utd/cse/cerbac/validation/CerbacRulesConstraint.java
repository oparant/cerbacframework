package edu.utd.cse.cerbac.validation;

import java.util.ListIterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;

import edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy;
import edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroup;
import edu.utd.cse.cerbac.profile.cerbacprofile.PositiveAuthorization;

public class CerbacRulesConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext context) {

		EObject target = context.getTarget();
		
		if (target instanceof PolicyGroup) {
			PolicyGroup container = (PolicyGroup) target;
			
			EList<CerbacPolicy> cp = container.getCerbacpolicy();
			ListIterator<CerbacPolicy> li = cp.listIterator();
			while(li.hasNext()){
				CerbacPolicy cerbacPolicy  = li.next();
				PositiveAuthorization pa = (PositiveAuthorization)cerbacPolicy;
				System.out.println("<<positive authorzation::" + pa.eClass().getEAttributes());
				pa.eContents().forEach(r ->{
					System.out.println("<<Type of Target::" + r);
				});
				
				
			}
			
			System.out.println("<<Type of Target::" + container.getCerbacpolicy());
		}

		return context.createSuccessStatus();

	}

}
