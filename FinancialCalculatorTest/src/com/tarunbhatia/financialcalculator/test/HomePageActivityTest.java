package com.tarunbhatia.financialcalculator.test;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onData;
import static com.google.android.apps.common.testing.ui.espresso.Espresso.*;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.hasToString;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.ListView;

import com.tarunbhatia.financialcalculator.HomePageActivity;

public class HomePageActivityTest extends
		ActivityInstrumentationTestCase2<HomePageActivity> {
	@SuppressWarnings("deprecation")
	public HomePageActivityTest() {
		super("com.google.android.apps.common.testing.ui.testapp",
				HomePageActivity.class);
	}

	// Constructor
	public HomePageActivityTest(Class<HomePageActivity> activityClass) {
		super(activityClass);
	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
		// Espresso will not launch our activity for us, we must launch it via
		// getActivity().
		getActivity();
	}

	//This test does not work. 
	@SuppressWarnings("unchecked")
	public void testLaunchingSimpleCalculator() {
		ListView listView = (ListView)getActivity().findViewById(android.R.id.list);
		
//		onData(hasToString("Simple Calculator")).perform(click());

		onData(allOf(is(instanceOf(String.class)), is("Simple Calculator")))
				.perform(click());

	}
}
