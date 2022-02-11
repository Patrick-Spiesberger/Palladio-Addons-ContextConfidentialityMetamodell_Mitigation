/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.Mitigation;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.MitigationSpecification;

import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mitigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.MitigationImpl#getNecessaryCredentials <em>Necessary Credentials</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.MitigationImpl#getMitigationspecification <em>Mitigationspecification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MitigationImpl extends CDOObjectImpl implements Mitigation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MitigationImpl()
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
		return AttackerPackage.Literals.MITIGATION;
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
	@SuppressWarnings("unchecked")
	public EList<UsageSpecification> getNecessaryCredentials()
	{
		return (EList<UsageSpecification>)eGet(AttackerPackage.Literals.MITIGATION__NECESSARY_CREDENTIALS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MitigationSpecification> getMitigationspecification()
	{
		return (EList<MitigationSpecification>)eGet(AttackerPackage.Literals.MITIGATION__MITIGATIONSPECIFICATION, true);
	}

} //MitigationImpl
