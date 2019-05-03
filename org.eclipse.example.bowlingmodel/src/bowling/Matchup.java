/**
 */
package bowling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matchup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bowling.Matchup#getGames <em>Games</em>}</li>
 * </ul>
 *
 * @see bowling.BowlingPackage#getMatchup()
 * @model
 * @generated
 */
public interface Matchup extends EObject {
	/**
	 * Returns the value of the '<em><b>Games</b></em>' reference list.
	 * The list contents are of type {@link bowling.Game}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Games</em>' reference list.
	 * @see bowling.BowlingPackage#getMatchup_Games()
	 * @model upper="2"
	 * @generated
	 */
	EList<Game> getGames();

} // Matchup
