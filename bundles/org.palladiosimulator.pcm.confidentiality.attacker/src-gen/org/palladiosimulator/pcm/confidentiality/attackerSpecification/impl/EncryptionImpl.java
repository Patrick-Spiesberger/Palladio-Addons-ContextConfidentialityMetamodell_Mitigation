/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.Encryption;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.EncryptionLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encryption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.EncryptionImpl#getEncryptionLevel <em>Encryption Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncryptionImpl extends MitigationSpecificationImpl implements Encryption
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncryptionImpl()
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
		return AttackerPackage.Literals.ENCRYPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncryptionLevel getEncryptionLevel()
	{
		return (EncryptionLevel)eGet(AttackerPackage.Literals.ENCRYPTION__ENCRYPTION_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncryptionLevel(EncryptionLevel newEncryptionLevel)
	{
		eSet(AttackerPackage.Literals.ENCRYPTION__ENCRYPTION_LEVEL, newEncryptionLevel);
	}

} //EncryptionImpl
