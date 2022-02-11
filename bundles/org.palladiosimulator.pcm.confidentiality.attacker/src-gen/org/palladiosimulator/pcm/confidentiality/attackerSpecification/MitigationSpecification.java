/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;

import org.eclipse.emf.cdo.CDOObject;

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
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getMitigationSpecification()
 * @model
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

} // MitigationSpecification
