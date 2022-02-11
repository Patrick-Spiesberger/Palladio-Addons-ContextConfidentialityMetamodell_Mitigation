/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mitigation Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.MitigationSpecification#getMitigationName <em>Mitigation Name</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.MitigationSpecification#getNecessaryCredentials <em>Necessary Credentials</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.MitigationSpecification#getVulnerabilities <em>Vulnerabilities</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getMitigationSpecification()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface MitigationSpecification extends CDOObject
{
	/**
	 * Returns the value of the '<em><b>Mitigation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigation Name</em>' attribute.
	 * @see #setMitigationName(String)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getMitigationSpecification_MitigationName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getMitigationName();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.MitigationSpecification#getMitigationName <em>Mitigation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mitigation Name</em>' attribute.
	 * @see #getMitigationName()
	 * @generated
	 */
	void setMitigationName(String value);

	/**
	 * Returns the value of the '<em><b>Necessary Credentials</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Necessary Credentials</em>' reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getMitigationSpecification_NecessaryCredentials()
	 * @model
	 * @generated
	 */
	EList<UsageSpecification> getNecessaryCredentials();

	/**
	 * Returns the value of the '<em><b>Vulnerabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vulnerabilities</em>' containment reference.
	 * @see #setVulnerabilities(VulnerabilityContainer)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getMitigationSpecification_Vulnerabilities()
	 * @model containment="true"
	 * @generated
	 */
	VulnerabilityContainer getVulnerabilities();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.MitigationSpecification#getVulnerabilities <em>Vulnerabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vulnerabilities</em>' containment reference.
	 * @see #getVulnerabilities()
	 * @generated
	 */
	void setVulnerabilities(VulnerabilityContainer value);

} // MitigationSpecification
