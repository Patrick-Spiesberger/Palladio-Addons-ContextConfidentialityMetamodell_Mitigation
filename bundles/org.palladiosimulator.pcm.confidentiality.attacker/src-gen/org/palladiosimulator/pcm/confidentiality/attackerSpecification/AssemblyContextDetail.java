/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Context Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AssemblyContextDetail#getCompromisedComponents <em>Compromised Components</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AssemblyContextDetail#isChangeAttackVectorToLocal <em>Change Attack Vector To Local</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAssemblyContextDetail()
 * @model
 * @generated
 */
public interface AssemblyContextDetail extends Entity
{
	/**
	 * Returns the value of the '<em><b>Compromised Components</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.core.composition.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compromised Components</em>' reference list.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAssemblyContextDetail_CompromisedComponents()
	 * @model
	 * @generated
	 */
	EList<AssemblyContext> getCompromisedComponents();

	/**
	 * Returns the value of the '<em><b>Change Attack Vector To Local</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Attack Vector To Local</em>' attribute.
	 * @see #setChangeAttackVectorToLocal(boolean)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage#getAssemblyContextDetail_ChangeAttackVectorToLocal()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isChangeAttackVectorToLocal();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.AssemblyContextDetail#isChangeAttackVectorToLocal <em>Change Attack Vector To Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Attack Vector To Local</em>' attribute.
	 * @see #isChangeAttackVectorToLocal()
	 * @generated
	 */
	void setChangeAttackVectorToLocal(boolean value);

} // AssemblyContextDetail
