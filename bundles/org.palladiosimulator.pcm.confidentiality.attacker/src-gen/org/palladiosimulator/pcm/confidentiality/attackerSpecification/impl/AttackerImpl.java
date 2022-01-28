/**
 */
package org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AssemblyContextDetail;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.Attacker;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerPackage;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.ListOperationEffort;

import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Attack;

import org.palladiosimulator.pcm.confidentiality.context.system.UsageSpecification;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attacker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerImpl#getAttacks <em>Attacks</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerImpl#getCompromisedComponentsDetails <em>Compromised Components Details</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerImpl#getCompromisedResources <em>Compromised Resources</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerImpl#getCompromisedLinkingResources <em>Compromised Linking Resources</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerImpl#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerImpl#isExploitContextProviders <em>Exploit Context Providers</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerImpl#getAttackerListEffort <em>Attacker List Effort</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.attackerSpecification.impl.AttackerImpl#getCalculateMaxTime <em>Calculate Max Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackerImpl extends EntityImpl implements Attacker
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackerImpl()
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
		return AttackerPackage.Literals.ATTACKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Attack> getAttacks()
	{
		return (EList<Attack>)eGet(AttackerPackage.Literals.ATTACKER__ATTACKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AssemblyContextDetail> getCompromisedComponentsDetails()
	{
		return (EList<AssemblyContextDetail>)eGet(AttackerPackage.Literals.ATTACKER__COMPROMISED_COMPONENTS_DETAILS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResourceContainer> getCompromisedResources()
	{
		return (EList<ResourceContainer>)eGet(AttackerPackage.Literals.ATTACKER__COMPROMISED_RESOURCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LinkingResource> getCompromisedLinkingResources()
	{
		return (EList<LinkingResource>)eGet(AttackerPackage.Literals.ATTACKER__COMPROMISED_LINKING_RESOURCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UsageSpecification> getCredentials()
	{
		return (EList<UsageSpecification>)eGet(AttackerPackage.Literals.ATTACKER__CREDENTIALS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExploitContextProviders()
	{
		return (Boolean)eGet(AttackerPackage.Literals.ATTACKER__EXPLOIT_CONTEXT_PROVIDERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExploitContextProviders(boolean newExploitContextProviders)
	{
		eSet(AttackerPackage.Literals.ATTACKER__EXPLOIT_CONTEXT_PROVIDERS, newExploitContextProviders);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOperationEffort getAttackerListEffort()
	{
		return (ListOperationEffort)eGet(AttackerPackage.Literals.ATTACKER__ATTACKER_LIST_EFFORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackerListEffort(ListOperationEffort newAttackerListEffort)
	{
		eSet(AttackerPackage.Literals.ATTACKER__ATTACKER_LIST_EFFORT, newAttackerListEffort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCalculateMaxTime()
	{
		return (Integer)eGet(AttackerPackage.Literals.ATTACKER__CALCULATE_MAX_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculateMaxTime(int newCalculateMaxTime)
	{
		eSet(AttackerPackage.Literals.ATTACKER__CALCULATE_MAX_TIME, newCalculateMaxTime);
	}

} //AttackerImpl
