/**
 */
package bowling.impl;

import bowling.BowlingPackage;
import bowling.Matchup;
import bowling.Tournament;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bowling.impl.TournamentImpl#getMatchups <em>Matchups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TournamentImpl extends MinimalEObjectImpl.Container implements Tournament {
	/**
	 * The cached value of the '{@link #getMatchups() <em>Matchups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchups()
	 * @generated
	 * @ordered
	 */
	protected EList<Matchup> matchups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TournamentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BowlingPackage.Literals.TOURNAMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Matchup> getMatchups() {
		if (matchups == null) {
			matchups = new EObjectResolvingEList<Matchup>(Matchup.class, this, BowlingPackage.TOURNAMENT__MATCHUPS);
		}
		return matchups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BowlingPackage.TOURNAMENT__MATCHUPS:
				return getMatchups();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BowlingPackage.TOURNAMENT__MATCHUPS:
				getMatchups().clear();
				getMatchups().addAll((Collection<? extends Matchup>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BowlingPackage.TOURNAMENT__MATCHUPS:
				getMatchups().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BowlingPackage.TOURNAMENT__MATCHUPS:
				return matchups != null && !matchups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TournamentImpl
