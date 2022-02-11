/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.MitigationSpecificationImpl;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PcmIntegrationPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PreventLevel;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.Prevention;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prevention</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.impl.PreventionImpl#getPreventionLevel <em>Prevention Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreventionImpl extends MitigationSpecificationImpl implements Prevention
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreventionImpl()
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
		return PcmIntegrationPackage.Literals.PREVENTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreventLevel getPreventionLevel()
	{
		return (PreventLevel)eGet(PcmIntegrationPackage.Literals.PREVENTION__PREVENTION_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreventionLevel(PreventLevel newPreventionLevel)
	{
		eSet(PcmIntegrationPackage.Literals.PREVENTION__PREVENTION_LEVEL, newPreventionLevel);
	}

} //PreventionImpl
