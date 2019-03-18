package edu.utd.cse.cerbac.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy;
import edu.utd.cse.cerbac.profile.cerbacprofile.CloudResource;
import edu.utd.cse.cerbac.profile.cerbacprofile.NegativeAuthorization;
import edu.utd.cse.cerbac.profile.cerbacprofile.NegativeObligation;
import edu.utd.cse.cerbac.profile.cerbacprofile.PolicyGroup;
import edu.utd.cse.cerbac.profile.cerbacprofile.PositiveAuthorization;
import edu.utd.cse.cerbac.profile.cerbacprofile.PositiveObligation;
import edu.utd.cse.cerbac.profile.cerbacprofile.impl.HowImpl;
import edu.utd.cse.cerbac.profile.cerbacprofile.impl.NegativeAuthorizationImpl;
import edu.utd.cse.cerbac.profile.cerbacprofile.impl.NegativeObligationImpl;
import edu.utd.cse.cerbac.profile.cerbacprofile.impl.PositiveAuthorizationImpl;
import edu.utd.cse.cerbac.profile.cerbacprofile.impl.PositiveObligationImpl;
import edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhatImpl;
import edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhenImpl;
import edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhereImpl;
import edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhoImpl;
import edu.utd.cse.cerbac.profile.cerbacprofile.impl.WhyImpl;

public class CerbacRulesConstraint extends AbstractModelConstraint {

	List<String> positiveAuthList = null;;
	List<String> negativeAuthList = null;

	List<String> positiveObligationList = null;
	List<String> negativeObligationList = null;
	
	List<PositiveAuthorizationImpl> positiveAuthCerbacList = null;;
	List<NegativeAuthorizationImpl> negativeAuthCerbacList = null;

	List<PositiveObligationImpl> positiveObligationCerbacList = null;
	List<NegativeObligationImpl> negativeObligationCerbacList = null;
	
	
//Integer count = 0;

	@Override
	public IStatus validate(IValidationContext context) {
		
		 positiveAuthList = new ArrayList<String>();
		 negativeAuthList = new ArrayList<String>();

		 positiveObligationList = new ArrayList<String>();
		 negativeObligationList = new ArrayList<String>();
		 
		 positiveAuthCerbacList = new ArrayList<PositiveAuthorizationImpl>();
		 negativeAuthCerbacList = new ArrayList<NegativeAuthorizationImpl>();

		 positiveObligationCerbacList = new ArrayList<PositiveObligationImpl>();
		 negativeObligationCerbacList = new ArrayList<NegativeObligationImpl>();
		 StringBuilder builder = new StringBuilder();
		 //count = 0;

		EObject target = context.getTarget();

		if (target instanceof PolicyGroup) {
			PolicyGroup container = (PolicyGroup) target;

			EList<CerbacPolicy> cp = container.getCerbacpolicy();
			ListIterator<CerbacPolicy> li = cp.listIterator();
		
			
			while (li.hasNext()) {
				CerbacPolicy cerbacPolicy = li.next();

				if (cerbacPolicy instanceof PositiveAuthorization) {
					
					
					
					PositiveAuthorizationImpl pa = (PositiveAuthorizationImpl) cerbacPolicy;
					positiveAuthCerbacList.add(pa);
					WhoImpl who = (WhoImpl)cerbacPolicy.getWho();
					WhatImpl what = (WhatImpl)cerbacPolicy.getWhat();
					WhereImpl where = (WhereImpl)cerbacPolicy.getWhere();
					WhyImpl why = (WhyImpl)cerbacPolicy.getWhy();
					WhenImpl when = (WhenImpl)cerbacPolicy.getWhen();
					HowImpl how = (HowImpl)cerbacPolicy.getHow();
					
					
					String policyString = getPolicyString(pa.getBase_Class().getName(), "A+", 
							who, cerbacPolicy.getAction(),  what, 
							where, why, how, when);
					positiveAuthList.add(policyString);


				} else if (cerbacPolicy instanceof NegativeAuthorization) {
					NegativeAuthorizationImpl pa = (NegativeAuthorizationImpl) cerbacPolicy;
					negativeAuthCerbacList.add(pa);
					WhoImpl who = (WhoImpl)cerbacPolicy.getWho();
					WhatImpl what = (WhatImpl)cerbacPolicy.getWhat();
					WhereImpl where = (WhereImpl)cerbacPolicy.getWhere();
					WhyImpl why = (WhyImpl)cerbacPolicy.getWhy();
					WhenImpl when = (WhenImpl)cerbacPolicy.getWhen();
					HowImpl how = (HowImpl)cerbacPolicy.getHow();
					
					
					String policyString = getPolicyString(pa.getBase_Class().getName(), "A-", 
							who, cerbacPolicy.getAction(),  what, 
							where, why, how, when);
					negativeAuthList.add(policyString);


				} else if (cerbacPolicy instanceof PositiveObligation) {
					PositiveObligationImpl pa = (PositiveObligationImpl) cerbacPolicy;
					positiveObligationCerbacList.add(pa);
					
					WhoImpl who = (WhoImpl)cerbacPolicy.getWho();
					WhatImpl what = (WhatImpl)cerbacPolicy.getWhat();
					WhereImpl where = (WhereImpl)cerbacPolicy.getWhere();
					WhyImpl why = (WhyImpl)cerbacPolicy.getWhy();
					WhenImpl when = (WhenImpl)cerbacPolicy.getWhen();
					HowImpl how = (HowImpl)cerbacPolicy.getHow();
					
					
					String policyString = getPolicyString(pa.getBase_Class().getName(), "O+", 
							who, cerbacPolicy.getAction(),  what, 
							where, why, how, when);
					positiveObligationList.add(policyString);


				} else if (cerbacPolicy instanceof NegativeObligation) {
					NegativeObligationImpl pa = (NegativeObligationImpl) cerbacPolicy;
					negativeObligationCerbacList.add(pa);
					WhoImpl who = (WhoImpl)cerbacPolicy.getWho();
					WhatImpl what = (WhatImpl)cerbacPolicy.getWhat();
					WhereImpl where = (WhereImpl)cerbacPolicy.getWhere();
					WhyImpl why = (WhyImpl)cerbacPolicy.getWhy();
					WhenImpl when = (WhenImpl)cerbacPolicy.getWhen();
					HowImpl how = (HowImpl)cerbacPolicy.getHow();
					
					
					String policyString = getPolicyString(pa.getBase_Class().getName(), "O-", 
							who, cerbacPolicy.getAction(),  what, 
							where, why, how, when);
					negativeObligationList.add(policyString);

				} else {

				}
			
			}

			System.out.println("@@@ Policy Type::" + container.getCerbacpolicy()  + " @@@");
		}
		
		positiveAuthList.stream().forEach(s -> System.out.println(s));
		negativeAuthList.stream().forEach(s -> System.out.println(s));
		positiveObligationList.stream().forEach(s -> System.out.println(s));
		negativeObligationList.stream().forEach(s -> System.out.println(s));
		
		//A+/A- Check Conflict
		System.out.println("@@@ Positive Authorization Size:" + positiveAuthCerbacList.size() + " @@@");
		System.out.println("@@@ Negative Authorization Size:" + negativeAuthCerbacList.size()+ " @@@");
		System.out.println("@@@ Positive Obligation Size:" + positiveObligationCerbacList.size() + " @@@");
		System.out.println("@@@ Negative Obligation Size:" + negativeObligationCerbacList.size() + " @@@");
		
		
		//check inconsistencies
		checkAuthorizationConflict(positiveAuthCerbacList, negativeAuthCerbacList, positiveObligationCerbacList, negativeObligationCerbacList, builder);
		checkObligationConflict(positiveAuthCerbacList, negativeAuthCerbacList, positiveObligationCerbacList, negativeObligationCerbacList, builder);
		checkAuthorizationInconsistency(positiveAuthCerbacList, negativeAuthCerbacList, positiveObligationCerbacList, negativeObligationCerbacList, builder);
		checkObligationInconsistency(positiveAuthCerbacList, negativeAuthCerbacList, positiveObligationCerbacList, negativeObligationCerbacList, builder);
		
		
		if(builder.length() > 0){
			
			return context.createFailureStatus(builder.toString());
		}

		return context.createSuccessStatus();

	}

	
	private void checkAuthorizationConflict(List<PositiveAuthorizationImpl> positiveAuthCerbacList,
			List<NegativeAuthorizationImpl> negativeAuthCerbacList,
			List<PositiveObligationImpl> positiveObligationCerbacList,
			List<NegativeObligationImpl> negativeObligationCerbacList, StringBuilder builder) {
		// TODO Auto-generated method stub
		
		positiveAuthCerbacList.stream().forEach(p ->{
			String action = p.getAction();
			String principal = p.getWho().getPrincipal();
			String what = p.getWhat().getResource();
			
			negativeAuthCerbacList.stream().forEach(n->{
				String action1 = n.getAction();
				String principal1 = n.getWho().getPrincipal();
				String what1 = n.getWhat().getResource();
				
				String when = null;
				if(n.getWhen() != null){
					 when = n.getWhen().getTimeBetween();
				}
				
				String why = null;
				if(n.getWhy() != null){
					 why = n.getWhy().getPurpose();
				}
				
				String how = null;
				if(n.getHow() != null){
					 how = n.getHow().getDevice();
				}
				

				String where = null;
				if(n.getWhere() != null){
					 where = n.getWhere().getOrigin();
				}
				
				//next
				String where1 = null;
				if(p.getWhere() != null){
					 where1 = p.getWhere().getOrigin();
				}
				
				
				String when1 = null;
				if(p.getWhen() != null){
					 when1 = p.getWhen().getTimeBetween();
				}
				
				String why1 = null;
				if(p.getWhy() != null){
					 why1 = p.getWhy().getPurpose();
				}
				
				String how1 = null;
				if(p.getHow() != null){
					 how1 = p.getHow().getDevice();
				}
	     		if(principal.trim().equalsIgnoreCase(principal1.trim()) && action.trim().equalsIgnoreCase(action1.trim()) && what.trim().equalsIgnoreCase(what1.trim())){
					System.out.println(p.getId() + " conflicts check " + n.getId());
					if((when == null && when1 != null) || (when1 == null && when == null)){
						builder.append("Conflict Between " + p.getId() + " and " + n.getId() + " | ");
						
						
					}else if((where == null && where1 != null) || (where1 == null && where == null)){
						builder.append("Conflict Between " + p.getId() + " and " + n.getId() + " | ");
				
						
					}else if((how == null && how1 != null) || (how1 == null && how == null)){
						builder.append("Conflict Between " + p.getId() + " and " + n.getId() + " | ");
						
						
					}else if((why == null && why1 != null) || (why1 == null && why == null)){
						builder.append("Conflict Between " + p.getId() + " and " + n.getId() + " | ");
					
					}
					System.out.println(builder.toString());
				
				}
				
				
			});
			
		});
	
	}
	
	private void checkObligationConflict(List<PositiveAuthorizationImpl> positiveAuthCerbacList,
			List<NegativeAuthorizationImpl> negativeAuthCerbacList,
			List<PositiveObligationImpl> positiveObligationCerbacList,
			List<NegativeObligationImpl> negativeObligationCerbacList, StringBuilder builder) {
		// TODO Auto-generated method stub
		
		positiveObligationCerbacList.stream().forEach(p ->{
			String action = p.getAction();
			String principal = p.getWho().getPrincipal();
			String what = p.getWhat().getResource();
			String pId  = p.getId().replaceAll("\r", "").replaceAll("\n", "");
			
			
			negativeObligationCerbacList.stream().forEach(n->{
				String action1 = n.getAction();
				String principal1 = n.getWho().getPrincipal();
				String what1 = n.getWhat().getResource();
				
				String when = null;
				if(n.getWhen() != null){
					 when = n.getWhen().getTimeBetween();
				}
				
				String why = null;
				if(n.getWhy() != null){
					 why = n.getWhy().getPurpose();
				}
				
				String how = null;
				if(n.getHow() != null){
					 how = n.getHow().getDevice();
				}
				

				String where = null;
				if(n.getWhere() != null){
					 where = n.getWhere().getOrigin();
				}
				
				//next
				String where1 = null;
				if(p.getWhere() != null){
					 where1 = p.getWhere().getOrigin();
				}
				
				
				String when1 = null;
				if(p.getWhen() != null){
					 when1 = p.getWhen().getTimeBetween();
				}
				
				String why1 = null;
				if(p.getWhy() != null){
					 why1 = p.getWhy().getPurpose();
				}
				
				String how1 = null;
				if(p.getHow() != null){
					 how1 = p.getHow().getDevice();
				}
	     		if(principal.trim().equalsIgnoreCase(principal1.trim()) && action.trim().equalsIgnoreCase(action1.trim()) && what.trim().equalsIgnoreCase(what1.trim())){
					System.out.println(pId + " conflicts check " + n.getId());
					if((when == null && when1 != null) || (when1 == null && when == null)){
						builder.append("Conflict Between " + pId + " and " + n.getId() + " | ");
						
						
					}else if((where == null && where1 != null) || (where1 == null && where == null)){
						builder.append("Conflict Between " + pId + " and " + n.getId() + " | ");
				
						
					}else if((how == null && how1 != null) || (how1 == null && how == null)){
						builder.append("Conflict Between " + pId + " and " + n.getId() + " | ");
						
						
					}else if((why == null && why1 != null) || (why1 == null && why == null)){
						builder.append("Conflict Between " + pId + " and " + n.getId() + " | ");
					
					}
				
				}
				
				
			});
			
		});
		
		 
		
	}

	
	
	/**
	 * 
	 * @param positiveAuthCerbacList
	 * @param negativeAuthCerbacList
	 * @param positiveObligationCerbacList
	 * @param negativeObligationCerbacList
	 * @param builder
	 */
	private void checkAuthorizationInconsistency(List<PositiveAuthorizationImpl> positiveAuthCerbacList,
			List<NegativeAuthorizationImpl> negativeAuthCerbacList,
			List<PositiveObligationImpl> positiveObligationCerbacList,
			List<NegativeObligationImpl> negativeObligationCerbacList, StringBuilder builder) {
		// TODO Auto-generated method stub
		
		positiveAuthCerbacList.stream().forEach(p ->{
			String action = p.getAction();
			String principal = p.getWho().getPrincipal();
			String what = p.getWhat().getResource();
			
			negativeObligationCerbacList.stream().forEach(n->{
				String action1 = n.getAction();
				String principal1 = n.getWho().getPrincipal();
				String what1 = n.getWhat().getResource();
				
				String when = null;
				if(n.getWhen() != null){
					 when = n.getWhen().getTimeBetween();
				}
				
				String why = null;
				if(n.getWhy() != null){
					 why = n.getWhy().getPurpose();
				}
				
				String how = null;
				if(n.getHow() != null){
					 how = n.getHow().getDevice();
				}
				

				String where = null;
				if(n.getWhere() != null){
					 where = n.getWhere().getOrigin();
				}
				
				//next
				String where1 = null;
				if(p.getWhere() != null){
					 where1 = p.getWhere().getOrigin();
				}
				
				
				String when1 = null;
				if(p.getWhen() != null){
					 when1 = p.getWhen().getTimeBetween();
				}
				
				String why1 = null;
				if(p.getWhy() != null){
					 why1 = p.getWhy().getPurpose();
				}
				
				String how1 = null;
				if(p.getHow() != null){
					 how1 = p.getHow().getDevice();
				}
	     		if(principal.trim().equalsIgnoreCase(principal1.trim()) && action.trim().equalsIgnoreCase(action1.trim()) && what.trim().equalsIgnoreCase(what1.trim())){
					System.out.println(p.getId() + " conflicts check " + n.getId());
					if((when == null && when1 != null) || (when1 == null && when == null)){
						builder.append("Conflict Between " + p.getId() + " and " + n.getId() + " | ");
						
						
					}else if((where == null && where1 != null) || (where1 == null && where == null)){
						builder.append("Conflict Between " + p.getId() + " and " + n.getId() + " | ");
				
						
					}else if((how == null && how1 != null) || (how1 == null && how == null)){
						builder.append("Conflict Between " + p.getId() + " and " + n.getId() + " | ");
						
						
					}else if((why == null && why1 != null) || (why1 == null && why == null)){
						builder.append("Conflict Between " + p.getId() + " and " + n.getId() + " | ");
					
					}
				
				}
				
				
			});
			
		});
	
	}
	/**
	 * 
	 * @param positiveAuthCerbacList
	 * @param negativeAuthCerbacList
	 * @param positiveObligationCerbacList
	 * @param negativeObligationCerbacList
	 * @param builder
	 */
	private void checkObligationInconsistency(List<PositiveAuthorizationImpl> positiveAuthCerbacList,
			List<NegativeAuthorizationImpl> negativeAuthCerbacList,
			List<PositiveObligationImpl> positiveObligationCerbacList,
			List<NegativeObligationImpl> negativeObligationCerbacList, StringBuilder builder) {
		// TODO Auto-generated method stub
		
		negativeObligationCerbacList.stream().forEach(p ->{
			String action = p.getAction();
			String principal = p.getWho().getPrincipal();
			String what = p.getWhat().getResource();
			
			positiveAuthCerbacList.stream().forEach(n->{
				String action1 = n.getAction();
				String principal1 = n.getWho().getPrincipal();
				String what1 = n.getWhat().getResource();
				
				String when = null;
				if(n.getWhen() != null){
					 when = n.getWhen().getTimeBetween();
				}
				
				String why = null;
				if(n.getWhy() != null){
					 why = n.getWhy().getPurpose();
				}
				
				String how = null;
				if(n.getHow() != null){
					 how = n.getHow().getDevice();
				}
				

				String where = null;
				if(n.getWhere() != null){
					 where = n.getWhere().getOrigin();
				}
				
				//next
				String where1 = null;
				if(p.getWhere() != null){
					 where1 = p.getWhere().getOrigin();
				}
				
				
				String when1 = null;
				if(p.getWhen() != null){
					 when1 = p.getWhen().getTimeBetween();
				}
				
				String why1 = null;
				if(p.getWhy() != null){
					 why1 = p.getWhy().getPurpose();
				}
				
				String how1 = null;
				if(p.getHow() != null){
					 how1 = p.getHow().getDevice();
				}
	     		if(principal.trim().equalsIgnoreCase(principal1.trim()) && action.trim().equalsIgnoreCase(action1.trim()) && what.trim().equalsIgnoreCase(what1.trim())){
					System.out.println(p.getId() + " conflicts check " + n.getId());
					if((when == null && when1 != null) || (when1 == null && when == null)){
						builder.append("Conflict Between " + p.getId() + " and " + n.getId() + " | ");
						
						
					}else if((where == null && where1 != null) || (where1 == null && where == null)){
						builder.append("Conflict Between " + p.getId() + " and " + n.getId() + " | ");
				
						
					}else if((how == null && how1 != null) || (how1 == null && how == null)){
						builder.append("Conflict Between " + p.getId() + " and " + n.getId() + " | ");
						
						
					}else if((why == null && why1 != null) || (why1 == null && why == null)){
						builder.append("Conflict Between " + p.getId() + " and " + n.getId() + " | ");
					
					}
				
				}
				
				
			});
			
		});
	
		
	}




	private String getPolicyString(String id, String policyType, WhoImpl who, String actions, WhatImpl what, WhereImpl where,
			WhyImpl why, HowImpl how, WhenImpl when) {
		
		StringBuffer policyBuffer = new StringBuffer();
		policyBuffer.append("{Id:" + id + ",Type:" + policyType + " ");
	
		if(who != null){
			//String name = who.basicGetBase_Class().getName();
			
			policyBuffer.append("Who:" + who.getPrincipal() + ",");
		}
		
		policyBuffer.append(" Action:[");
		
		
		//List<String> actionList = actionElist.stream().map(a -> a.getBase_Class().getName()).collect(Collectors.toList());
	   // String actions = String.join(",", actionList);
	    policyBuffer.append(actions + "]");
	
		
		if(what != null){
		
				policyBuffer.append(",What:" + what.getResource());
		}
		
	
		if(how != null){
			//String name = how.basicGetBase_Class().getName();
			policyBuffer.append(", How:" + how.getDevice());
		}else{
			policyBuffer.append(", How:*");
		}
		
	
		if(why != null){
			//String name = why.basicGetBase_Class().getName();
			policyBuffer.append(", Why:" + why.getPurpose());
		}else{
			policyBuffer.append(", Why:*");
		}
	
		if(when != null){
			//String name = when.basicGetBase_Class().getName();
			policyBuffer.append(", When:" + when.getTimeBetween());
		}else{
			policyBuffer.append(", When:*");
		}
		
		
		if(where != null){
			//String name = where.basicGetBase_Class().getName();
			policyBuffer.append(", Where:{Resource:" + where.getOrigin() + "}");
		}else{
			policyBuffer.append(", Where:{*}");
		}
		policyBuffer.append(" }");
		return policyBuffer.toString();
	}

}
