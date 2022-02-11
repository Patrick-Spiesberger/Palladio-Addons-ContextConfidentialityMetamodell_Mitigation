/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.MitigationSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prevention</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.Prevention#getPreventionLevel <em>Prevention Level</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage#getPrevention()
 * @model
 * @generated
 */
public interface Prevention extends MitigationSpecification
{
	/**
	 * Returns the value of the '<em><b>Prevention Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PreventLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prevention Level</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PreventLevel
	 * @see #setPreventionLevel(PreventLevel)
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage#getPrevention_PreventionLevel()
	 * @model
	 * @generated
	 */
	PreventLevel getPreventionLevel();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.Prevention#getPreventionLevel <em>Prevention Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prevention Level</em>' attribute.
	 * @see org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PreventLevel
	 * @see #getPreventionLevel()
	 * @generated
	 */
	void setPreventionLevel(PreventLevel value);

} // Prevention
