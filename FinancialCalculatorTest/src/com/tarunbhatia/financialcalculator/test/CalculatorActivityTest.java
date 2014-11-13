/**
 * 
 */
package com.tarunbhatia.financialcalculator.test;

import android.test.ActivityInstrumentationTestCase2;
import static com.google.android.apps.common.testing.ui.espresso.Espresso.onData;
import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.Espresso.pressBack;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.closeSoftKeyboard;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.typeText;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;

import com.tarunbhatia.financialcalculator.CalculatorActivity;
import com.tarunbhatia.financialcalculator.R;

/**
 * @author tarunbhatia
 * 
 */
public class CalculatorActivityTest extends
		ActivityInstrumentationTestCase2<CalculatorActivity> {

	@SuppressWarnings("deprecation")
	public CalculatorActivityTest() {
		super("com.google.android.apps.common.testing.ui.testapp",
				CalculatorActivity.class);
	}

	// Constructor
	public CalculatorActivityTest(Class<CalculatorActivity> activityClass) {
		super(activityClass);
	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
		// Espresso will not launch our activity for us, we must launch it via
		// getActivity().
		getActivity();
	}

	public void testSimpleMathOperations() {
		// Subtract 5 from 55
		onView(withId(R.id.button5)).perform(click());
		onView(withId(R.id.button5)).perform(click());
		onView(withId(R.id.buttonMinus)).perform(click());
		onView(withId(R.id.button5)).perform(click());
		onView(withId(R.id.buttonEqual)).perform(click());
		onView(withId(R.id.secondInput)).check(matches(withText("50.0")));
		// Test Division
		onView(withId(R.id.buttonDiv)).perform(click());
		onView(withId(R.id.button1)).perform(click());
		onView(withId(R.id.button0)).perform(click());
		onView(withId(R.id.buttonEqual)).perform(click());
		onView(withId(R.id.secondInput)).check(matches(withText("5.0")));

		// Test Multiplication
		onView(withId(R.id.buttonMulti)).perform(click());
		onView(withId(R.id.button1)).perform(click());
		onView(withId(R.id.button0)).perform(click());
		onView(withId(R.id.buttonEqual)).perform(click());
		onView(withId(R.id.secondInput)).check(matches(withText("50.0")));

		// Test Addition
		onView(withId(R.id.buttonPlus)).perform(click());
		onView(withId(R.id.button1)).perform(click());
		onView(withId(R.id.button0)).perform(click());
		onView(withId(R.id.buttonEqual)).perform(click());
		onView(withId(R.id.secondInput)).check(matches(withText("60.0")));
		
		// Test Clear
		onView(withId(R.id.buttonClear)).perform(click());
		onView(withId(R.id.secondInput)).check(matches(withText("")));
	}
}
