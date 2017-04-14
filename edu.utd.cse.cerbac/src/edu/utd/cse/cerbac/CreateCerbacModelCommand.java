/*****************************************************************************

 *****************************************************************************/

package edu.utd.cse.cerbac;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.uml.diagram.common.commands.ModelCreationCommandBase;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;


/**
 * Creates a Cerbac model
 *
 */
public class CreateCerbacModelCommand extends ModelCreationCommandBase {

	public static final String COMMAND_ID = "edu.utd.cse.cerbac.model";
	public static final String PROFILES_PATHMAP = "pathmap://CERBAC_PROFILES/"; //$NON-NLS-1$
	public static final String PROFILE_URI = PROFILES_PATHMAP + "cerbac.profile.uml"; //$NON-NLS-1$

	/**
	 * @see org.eclipse.papyrus.core.extension.commands.ModelCreationCommandBase#createRootElement()
	 *
	 * @return
	 */

	@Override
	protected EObject createRootElement() {
		return UMLFactory.eINSTANCE.createModel();
	}

	/**
	 * @see org.eclipse.papyrus.core.extension.commands.ModelCreationCommandBase#initializeModel(org.eclipse.emf.ecore.EObject)
	 *
	 * @param owner
	 */

	@Override
	protected void initializeModel(EObject owner) {
		super.initializeModel(owner);
		((org.eclipse.uml2.uml.Package) owner).setName(getModelName());

		org.eclipse.uml2.uml.Package profile = PackageUtil.loadPackage(URI.createURI(PROFILE_URI), owner.eResource().getResourceSet());
		if ((profile != null) && (profile instanceof Profile)) {
			PackageUtil.applyProfile(((org.eclipse.uml2.uml.Package) owner), (Profile) profile, true);
		}
	}

	/**
	 * Gets the model name.
	 *
	 * @return the model name
	 */
	protected String getModelName() {
		return "PapyrusCerbacModel";
	}


}
