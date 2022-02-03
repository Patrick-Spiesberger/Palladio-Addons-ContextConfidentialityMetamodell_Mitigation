/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datamodel Attacker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getReferenceName <em>Reference Name</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getSource <em>Source</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getMethod <em>Method</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getEncryptionLevel <em>Encryption Level</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getRequiredDecryptionKey <em>Required Decryption Key</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getDatamodelAttacker()
 * @model
 * @generated
 */
public interface DatamodelAttacker extends Entity
{
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataType)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getDatamodelAttacker_DataType()
	 * @model
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Name</em>' attribute.
	 * @see #setReferenceName(String)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getDatamodelAttacker_ReferenceName()
	 * @model
	 * @generated
	 */
	String getReferenceName();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getReferenceName <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Name</em>' attribute.
	 * @see #getReferenceName()
	 * @generated
	 */
	void setReferenceName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EObject)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getDatamodelAttacker_Source()
	 * @model
	 * @generated
	 */
	EObject getSource();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EObject value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(OperationSignature)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getDatamodelAttacker_Method()
	 * @model
	 * @generated
	 */
	OperationSignature getMethod();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(OperationSignature value);

	/**
	 * Returns the value of the '<em><b>Encryption Level</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.EncryptionLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Level</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.EncryptionLevel
	 * @see #setEncryptionLevel(EncryptionLevel)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getDatamodelAttacker_EncryptionLevel()
	 * @model default="None" required="true"
	 * @generated
	 */
	EncryptionLevel getEncryptionLevel();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getEncryptionLevel <em>Encryption Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Level</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.EncryptionLevel
	 * @see #getEncryptionLevel()
	 * @generated
	 */
	void setEncryptionLevel(EncryptionLevel value);

	/**
	 * Returns the value of the '<em><b>Required Decryption Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Decryption Key</em>' attribute.
	 * @see #setRequiredDecryptionKey(String)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getDatamodelAttacker_RequiredDecryptionKey()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRequiredDecryptionKey();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.DatamodelAttacker#getRequiredDecryptionKey <em>Required Decryption Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Decryption Key</em>' attribute.
	 * @see #getRequiredDecryptionKey()
	 * @generated
	 */
	void setRequiredDecryptionKey(String value);

} // DatamodelAttacker
