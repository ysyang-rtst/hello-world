/**
 */
package bowling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bowling.Tournament#getMatchups <em>Matchups</em>}</li>
 * </ul>
 *
 * @see bowling.BowlingPackage#getTournament()
 * @model
 * @generated
 */
public interface Tournament extends EObject {
	/**
	 * Returns the value of the '<em><b>Matchups</b></em>' reference list.
	 * The list contents are of type {@link bowling.Matchup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchups</em>' reference list.
	 * @see bowling.BowlingPackage#getTournament_Matchups()
	 * @model
	 * @generated
	 */
	EList<Matchup> getMatchups();

} // Tournament
