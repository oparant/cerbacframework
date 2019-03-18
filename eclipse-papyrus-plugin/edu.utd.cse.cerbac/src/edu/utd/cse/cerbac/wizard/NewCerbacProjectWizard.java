/*****************************************************************************

 *
 *****************************************************************************/
package edu.utd.cse.cerbac.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.papyrus.uml.diagram.wizards.wizards.NewPapyrusProjectWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

/**
 * Wizard to create a new Cerbac project
 *
 */
public class NewCerbacProjectWizard extends NewPapyrusProjectWizard {

	/**
	 * @see org.eclipse.papyrus.wizards.NewPapyrusProjectWizard#init(org.eclipse.ui.IWorkbench,
	 *      org.eclipse.jface.viewers.IStructuredSelection)
	 *
	 * @param workbench
	 * @param selection
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		setWindowTitle("New Cerbac Project");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected WizardNewProjectCreationPage createNewProjectCreationPage() {
		WizardNewProjectCreationPage newProjectPage = super.createNewProjectCreationPage();
		newProjectPage.setTitle("Papyrus Cerbac Project");
		newProjectPage.setDescription("Create a New Papyrus Cerbac Project");
		return newProjectPage;
	}
	
//	@Override
//	protected SelectDiagramCategoryPage createSelectDiagramCategoryPage() {
//		return new SelectDiagramCategoryPage(true);
//	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String[] getDiagramCategoryIds() {
		return new String[] { "Cerbac" };
	}
	
	@Override
	public boolean isPapyrusRootWizard() {
		return false;
	}

}
