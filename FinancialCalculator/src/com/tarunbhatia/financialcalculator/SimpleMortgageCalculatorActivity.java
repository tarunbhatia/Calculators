package com.tarunbhatia.financialcalculator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBar.TabListener;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

@SuppressWarnings("deprecation")
public class SimpleMortgageCalculatorActivity extends ActionBarActivity implements
TabListener {
	private static final String STATE_SELECTED_NAVIGATION_ITEM = "selected_navigation_item";

	public SimpleMortgageCalculatorActivity() {
		super();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home_page, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_monthly_payment_calc_page);
		if (savedInstanceState == null) {
			getFragmentManager()
					.beginTransaction()
					.add(R.id.mortgage_calc,
							new SimpleMortgageCalculatorFragment(),"TEST").commit();
		}

		ActionBar actionBar = getSupportActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		// for each of the sections in the app, add a tab to the action bar.
		actionBar.addTab(actionBar.newTab()
				.setText(R.string.mort_payment_tab_title_section1)
				.setTabListener((TabListener) this));
		actionBar.addTab(actionBar.newTab()
				.setText(R.string.mort_payment_tab_title_section2)
				.setTabListener((TabListener) this));
	}

	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState) {
		// Restore the previously serialized current tab position.
		if (savedInstanceState.containsKey(STATE_SELECTED_NAVIGATION_ITEM)) {
			getActionBar().setSelectedNavigationItem(
					savedInstanceState.getInt(STATE_SELECTED_NAVIGATION_ITEM));
		}
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		// Serialize the current tab position.
		outState.putInt(STATE_SELECTED_NAVIGATION_ITEM, getActionBar()
				.getSelectedNavigationIndex());
	}

	@Override
	public void onTabReselected(Tab arg0,
			android.support.v4.app.FragmentTransaction arg1) {
		// When the given tab is selected, show the tab contents in the
		// container view.
        android.app.Fragment fragment = new SimpleMortgageCalculatorFragment();
		Bundle args = new Bundle();
		args.putInt(SimpleMortgageCalculatorFragment.ARG_SECTION_NUMBER,
				arg0.getPosition() + 1);
		fragment.setArguments(args);
		getFragmentManager().beginTransaction()
				.replace(R.id.mortgage_calc, fragment).commit();
		
	}

	@Override
	public void onTabSelected(Tab arg0,
			android.support.v4.app.FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabUnselected(Tab arg0,
			android.support.v4.app.FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}

	

}
