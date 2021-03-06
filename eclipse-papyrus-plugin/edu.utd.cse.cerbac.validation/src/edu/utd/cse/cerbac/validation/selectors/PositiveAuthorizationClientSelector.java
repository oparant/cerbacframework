/**
 * Created by the Papyrus DSML plugin generator
 */

package edu.utd.cse.cerbac.validation.selectors;

import org.eclipse.emf.validation.model.IClientSelector;


import edu.utd.cse.cerbac.profile.cerbacprofile.PositiveAuthorization;

/**
 * This class filters (selects) passed stereotype applications. It returns true, if the
 * associated stereotype (or one of its super-stereotypes) has the name '[stereotype.name/]'.
 *
 * @generated
 */
public class PositiveAuthorizationClientSelector implements IClientSelector {

	public boolean selects(Object stereoApplicationObj) {
		return stereoApplicationObj instanceof PositiveAuthorization;
	}
}
