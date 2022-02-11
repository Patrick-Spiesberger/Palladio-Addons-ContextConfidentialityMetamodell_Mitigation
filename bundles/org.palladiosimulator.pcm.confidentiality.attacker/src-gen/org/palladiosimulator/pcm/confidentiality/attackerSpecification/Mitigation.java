/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mitigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Mitigation#getNecessaryCredentials <em>Necessary Credentials</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Mitigation#getMitigationspecification <em>Mitigationspecification</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getMitigation()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Mitigation extends CDOObject
{
	/**
	 * Returns the value of the '<em><b>Necessary Credentials</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Necessary Credentials</em>' reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getMitigation_NecessaryCredentials()
	 * @model
	 * @generated
	 */
	EList<UsageSpecification> getNecessaryCredentials();

	/**
	 * Returns the value of the '<em><b>Mitigationspecification</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.MitigationSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigationspecification</em>' reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getMitigation_Mitigationspecification()
	 * @model
	 * @generated
	 */
	EList<MitigationSpecification> getMitigationspecification();

} // Mitigation
