/**
 */
package edu.utd.cse.cerbac.profile.cerbacprofile.impl;

import edu.utd.cse.cerbac.profile.cerbacprofile.Action;
import edu.utd.cse.cerbac.profile.cerbacprofile.CerbacPolicy;
import edu.utd.cse.cerbac.profile.cerbacprofile.CerbacProfilePackage;
import edu.utd.cse.cerbac.profile.cerbacprofile.How;
import edu.utd.cse.cerbac.profile.cerbacprofile.What;
import edu.utd.cse.cerbac.profile.cerbacprofile.When;
import edu.utd.cse.cerbac.profile.cerbacprofile.Where;
import edu.utd.cse.cerbac.profile.cerbacprofile.Who;
import edu.utd.cse.cerbac.profile.cerbacprofile.Why;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cerbac Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacPolicyImpl#getAction <em>Action</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacPolicyImpl#getWho <em>Who</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacPolicyImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacPolicyImpl#getWhy <em>Why</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacPolicyImpl#getHow <em>How</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacPolicyImpl#getWhen <em>When</em>}</li>
 *   <li>{@link edu.utd.cse.cerbac.profile.cerbacprofile.impl.CerbacPolicyImpl#getWhat <em>What</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CerbacPolicyImpl extends CloudSecurityAndPrivacyPolicyImpl implements CerbacPolicy {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * The cached value of the '{@link #getWho() <em>Who</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWho()
	 * @generated
	 * @ordered
	 */
	protected Who who;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected Where where;

	/**
	 * The cached value of the '{@link #getWhy() <em>Why</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhy()
	 * @generated
	 * @ordered
	 */
	protected Why why;

	/**
	 * The cached value of the '{@link #getHow() <em>How</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHow()
	 * @generated
	 * @ordered
	 */
	protected How how;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected When when;

	/**
	 * The cached value of the '{@link #getWhat() <em>What</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhat()
	 * @generated
	 * @ordered
	 */
	protected What what;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CerbacPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CerbacProfilePackage.Literals.CERBAC_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectResolvingEList<Action>(Action.class, this, CerbacProfilePackage.CERBAC_POLICY__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Who getWho() {
		if (who != null && who.eIsProxy()) {
			InternalEObject oldWho = (InternalEObject)who;
			who = (Who)eResolveProxy(oldWho);
			if (who != oldWho) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CerbacProfilePackage.CERBAC_POLICY__WHO, oldWho, who));
			}
		}
		return who;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Who basicGetWho() {
		return who;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWho(Who newWho) {
		Who oldWho = who;
		who = newWho;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CerbacProfilePackage.CERBAC_POLICY__WHO, oldWho, who));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Where getWhere() {
		if (where != null && where.eIsProxy()) {
			InternalEObject oldWhere = (InternalEObject)where;
			where = (Where)eResolveProxy(oldWhere);
			if (where != oldWhere) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CerbacProfilePackage.CERBAC_POLICY__WHERE, oldWhere, where));
			}
		}
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Where basicGetWhere() {
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(Where newWhere) {
		Where oldWhere = where;
		where = newWhere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CerbacProfilePackage.CERBAC_POLICY__WHERE, oldWhere, where));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Why getWhy() {
		if (why != null && why.eIsProxy()) {
			InternalEObject oldWhy = (InternalEObject)why;
			why = (Why)eResolveProxy(oldWhy);
			if (why != oldWhy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CerbacProfilePackage.CERBAC_POLICY__WHY, oldWhy, why));
			}
		}
		return why;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Why basicGetWhy() {
		return why;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhy(Why newWhy) {
		Why oldWhy = why;
		why = newWhy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CerbacProfilePackage.CERBAC_POLICY__WHY, oldWhy, why));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public How getHow() {
		if (how != null && how.eIsProxy()) {
			InternalEObject oldHow = (InternalEObject)how;
			how = (How)eResolveProxy(oldHow);
			if (how != oldHow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CerbacProfilePackage.CERBAC_POLICY__HOW, oldHow, how));
			}
		}
		return how;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public How basicGetHow() {
		return how;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHow(How newHow) {
		How oldHow = how;
		how = newHow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CerbacProfilePackage.CERBAC_POLICY__HOW, oldHow, how));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public When getWhen() {
		if (when != null && when.eIsProxy()) {
			InternalEObject oldWhen = (InternalEObject)when;
			when = (When)eResolveProxy(oldWhen);
			if (when != oldWhen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CerbacProfilePackage.CERBAC_POLICY__WHEN, oldWhen, when));
			}
		}
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public When basicGetWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(When newWhen) {
		When oldWhen = when;
		when = newWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CerbacProfilePackage.CERBAC_POLICY__WHEN, oldWhen, when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public What getWhat() {
		if (what != null && what.eIsProxy()) {
			InternalEObject oldWhat = (InternalEObject)what;
			what = (What)eResolveProxy(oldWhat);
			if (what != oldWhat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CerbacProfilePackage.CERBAC_POLICY__WHAT, oldWhat, what));
			}
		}
		return what;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public What basicGetWhat() {
		return what;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhat(What newWhat) {
		What oldWhat = what;
		what = newWhat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CerbacProfilePackage.CERBAC_POLICY__WHAT, oldWhat, what));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CerbacProfilePackage.CERBAC_POLICY__ACTION:
				return getAction();
			case CerbacProfilePackage.CERBAC_POLICY__WHO:
				if (resolve) return getWho();
				return basicGetWho();
			case CerbacProfilePackage.CERBAC_POLICY__WHERE:
				if (resolve) return getWhere();
				return basicGetWhere();
			case CerbacProfilePackage.CERBAC_POLICY__WHY:
				if (resolve) return getWhy();
				return basicGetWhy();
			case CerbacProfilePackage.CERBAC_POLICY__HOW:
				if (resolve) return getHow();
				return basicGetHow();
			case CerbacProfilePackage.CERBAC_POLICY__WHEN:
				if (resolve) return getWhen();
				return basicGetWhen();
			case CerbacProfilePackage.CERBAC_POLICY__WHAT:
				if (resolve) return getWhat();
				return basicGetWhat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CerbacProfilePackage.CERBAC_POLICY__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case CerbacProfilePackage.CERBAC_POLICY__WHO:
				setWho((Who)newValue);
				return;
			case CerbacProfilePackage.CERBAC_POLICY__WHERE:
				setWhere((Where)newValue);
				return;
			case CerbacProfilePackage.CERBAC_POLICY__WHY:
				setWhy((Why)newValue);
				return;
			case CerbacProfilePackage.CERBAC_POLICY__HOW:
				setHow((How)newValue);
				return;
			case CerbacProfilePackage.CERBAC_POLICY__WHEN:
				setWhen((When)newValue);
				return;
			case CerbacProfilePackage.CERBAC_POLICY__WHAT:
				setWhat((What)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CerbacProfilePackage.CERBAC_POLICY__ACTION:
				getAction().clear();
				return;
			case CerbacProfilePackage.CERBAC_POLICY__WHO:
				setWho((Who)null);
				return;
			case CerbacProfilePackage.CERBAC_POLICY__WHERE:
				setWhere((Where)null);
				return;
			case CerbacProfilePackage.CERBAC_POLICY__WHY:
				setWhy((Why)null);
				return;
			case CerbacProfilePackage.CERBAC_POLICY__HOW:
				setHow((How)null);
				return;
			case CerbacProfilePackage.CERBAC_POLICY__WHEN:
				setWhen((When)null);
				return;
			case CerbacProfilePackage.CERBAC_POLICY__WHAT:
				setWhat((What)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CerbacProfilePackage.CERBAC_POLICY__ACTION:
				return action != null && !action.isEmpty();
			case CerbacProfilePackage.CERBAC_POLICY__WHO:
				return who != null;
			case CerbacProfilePackage.CERBAC_POLICY__WHERE:
				return where != null;
			case CerbacProfilePackage.CERBAC_POLICY__WHY:
				return why != null;
			case CerbacProfilePackage.CERBAC_POLICY__HOW:
				return how != null;
			case CerbacProfilePackage.CERBAC_POLICY__WHEN:
				return when != null;
			case CerbacProfilePackage.CERBAC_POLICY__WHAT:
				return what != null;
		}
		return super.eIsSet(featureID);
	}

} //CerbacPolicyImpl
