/**
 * 
 */
package com.tarunbhatia.financialcalculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * @author tarunbhatia
 * 
 */
public class CalculatorActivity extends ActionBarActivity {

	// Empty Constructor
	public CalculatorActivity() {
		super();
	}

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_calc);
		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.calc, new CalculatorFragment()).commit();
		}
	}
}
