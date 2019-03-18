package edu.utd.cse.cerbac.wizard;

import org.eclipse.papyrus.uml.diagram.wizards.wizards.CreateModelWizard;

/**
 * Wizard to create a new ArchiMate model
 *
 */
public class NewCerbacModelWizard extends CreateModelWizard {

	/**
	 * @see org.eclipse.papyrus.wizards.CreateModelWizard#init(org.eclipse.ui.IWorkbench,
	 *      org.eclipse.jface.viewers.IStructuredSelection)
	 *
	 * @param workbench
	 * @param selection
	 */

	/*@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		setWindowTitle("New ArchiMate Model");
	}*/

	/**
	 * Instantiates a new new ArchiMate model wizard.
	 */
	/*public NewArchiMateModelWizard() {
		super();
	}*/

	@Override
	public String getModelKindName() {
		return "Cerbac";
	}

	/*@Override
	protected String[] getDiagramCategoryIds() {
		return new String[] { "ArchiMate" };
	}*/

	/*@Override
	protected void applyProfile(ModelSet modelSet) {
		// TODO Auto-generated method stub
		super.applyProfile(modelSet);
	}*/
	
	
}
