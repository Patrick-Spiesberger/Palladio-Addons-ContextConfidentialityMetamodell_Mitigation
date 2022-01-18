/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Attack#getCrackableEncryptedComponents <em>Crackable Encrypted Components</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage#getAttack()
 * @model abstract="true"
 * @generated
 */
public interface Attack extends Entity
{
	/**
	 * Returns the value of the '<em><b>Crackable Encrypted Components</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crackable Encrypted Components</em>' reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.AttackSpecificationPackage#getAttack_CrackableEncryptedComponents()
	 * @model
	 * @generated
	 */
	EList<PCMElement> getCrackableEncryptedComponents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model authentificatedDataType="org.eclipse.emf.ecore.xml.type.Boolean" authentificatedRequired="true"
	 * @generated
	 */
	boolean canExploit(Vulnerability vulnerability, boolean authentificated, AttackVector attackVector);

} // Attack
