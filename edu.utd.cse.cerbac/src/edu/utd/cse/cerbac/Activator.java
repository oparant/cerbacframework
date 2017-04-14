
package edu.utd.cse.cerbac;

import org.eclipse.papyrus.infra.core.log.LogHelper;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {


	// The plug-in ID
	public static final String PLUGIN_ID = "edu.utd.cse.cerbac"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;



	/** Logging helper. */
	private static LogHelper logHelper;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}



	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		logHelper = new LogHelper(plugin);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns the log helper
	 * @return the log helper
	 */
	public static LogHelper getLogHelper() {
		return logHelper;
	}	

}
