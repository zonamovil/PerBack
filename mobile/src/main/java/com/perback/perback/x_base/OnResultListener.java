package com.perback.perback.x_base;

import android.app.Activity;
import android.content.Intent;

/**
 * Callback for receiving results from different modules, such as from a BaseDialog.
 * : Interface for common data communication support. 
 */
public interface OnResultListener
{
	/**
	 * Alias for Activity.RESULT_OK;
	 */
	static final int RESULT_OK = Activity.RESULT_OK;
	/**
	 * Alias for Activity.RESULT_CANCELED;
	 */
	static final int RESULT_CANCELED = Activity.RESULT_CANCELED;
	
	/**
	 * Implement to receive the result from a module, such as from a BaseDialog.
	 * @param resultCode The result code with which the module has finished.
	 * @param data The result data returned by the module.
	 */
	void onResult(int resultCode, Intent data);
}