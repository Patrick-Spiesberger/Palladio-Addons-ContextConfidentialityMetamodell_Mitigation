/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.MitigationSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mitigation Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.MitigationSpecificationImpl#getMitigationName <em>Mitigation Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MitigationSpecificationImpl extends CDOObjectImpl implements MitigationSpecification
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MitigationSpecificationImpl()
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
		return AttackerPackage.Literals.MITIGATION_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount()
	{
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMitigationName()
	{
		return (String)eGet(AttackerPackage.Literals.MITIGATION_SPECIFICATION__MITIGATION_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMitigationName(String newMitigationName)
	{
		eSet(AttackerPackage.Literals.MITIGATION_SPECIFICATION__MITIGATION_NAME, newMitigationName);
	}

} //MitigationSpecificationImpl
