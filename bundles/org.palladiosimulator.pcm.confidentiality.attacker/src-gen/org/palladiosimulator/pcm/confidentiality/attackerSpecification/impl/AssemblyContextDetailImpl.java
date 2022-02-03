/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AssemblyContextDetail;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Context Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AssemblyContextDetailImpl#getCompromisedComponents <em>Compromised Components</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AssemblyContextDetailImpl#isChangeAttackVectorToLocal <em>Change Attack Vector To Local</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyContextDetailImpl extends EntityImpl implements AssemblyContextDetail
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContextDetailImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return AttackerPackage.Literals.ASSEMBLY_CONTEXT_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AssemblyContext> getCompromisedComponents()
	{
		return (EList<AssemblyContext>)eGet(AttackerPackage.Literals.ASSEMBLY_CONTEXT_DETAIL__COMPROMISED_COMPONENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChangeAttackVectorToLocal()
	{
		return (Boolean)eGet(AttackerPackage.Literals.ASSEMBLY_CONTEXT_DETAIL__CHANGE_ATTACK_VECTOR_TO_LOCAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeAttackVectorToLocal(boolean newChangeAttackVectorToLocal)
	{
		eSet(AttackerPackage.Literals.ASSEMBLY_CONTEXT_DETAIL__CHANGE_ATTACK_VECTOR_TO_LOCAL, newChangeAttackVectorToLocal);
	}

} //AssemblyContextDetailImpl
