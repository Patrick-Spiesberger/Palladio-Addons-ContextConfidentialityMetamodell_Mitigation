/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encryption</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Encryption#getEncryptionLevel <em>Encryption Level</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getEncryption()
 * @model
 * @generated
 */
public interface Encryption extends MitigationSpecification
{
	/**
	 * Returns the value of the '<em><b>Encryption Level</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.EncryptionLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Level</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.EncryptionLevel
	 * @see #setEncryptionLevel(EncryptionLevel)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getEncryption_EncryptionLevel()
	 * @model default="None" required="true"
	 * @generated
	 */
	EncryptionLevel getEncryptionLevel();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.Encryption#getEncryptionLevel <em>Encryption Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Level</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.EncryptionLevel
	 * @see #getEncryptionLevel()
	 * @generated
	 */
	void setEncryptionLevel(EncryptionLevel value);

} // Encryption
