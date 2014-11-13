package com.tarunbhatia.financialcalculator;

import java.util.ArrayList;
import java.util.List;

import android.app.ListFragment;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

/**
 * HomePage fragment containing a simple view.
 */
public class HomePageFragment extends ListFragment {
	private List<ListViewItem> mItems = null;

	// Empty Constructor
	public HomePageFragment() {
		mItems = null;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mItems = new ArrayList<ListViewItem>();
		Resources resources = getResources();
		mItems.add(new ListViewItem(resources
				.getDrawable(R.drawable.ic_launcher_calc),
				getString(R.string.simple_calculator),
				getString(R.string.simple_calculator_desc)));

		// initialize and set the list adapter
		setListAdapter(new ListViewAdapter(getActivity(), mItems));
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		// remove the dividers from the ListView of the ListFragment
		getListView().setDivider(null);
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// retrieve theListView item
		if (position >= 0) {
			ListViewItem item = mItems.get(position);
			// If simple calculator option is pressed, launch Calculator
			// Activity
			if (position == 0) {
				Intent intent = new Intent(getActivity()
						.getApplicationContext(), CalculatorActivity.class);
				startActivity(intent);
			}

			// do something
			Toast.makeText(getActivity(), item.title, Toast.LENGTH_SHORT)
					.show();
		}
	}
}
