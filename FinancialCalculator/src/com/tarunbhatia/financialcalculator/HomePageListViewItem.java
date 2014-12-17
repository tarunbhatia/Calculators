package com.tarunbhatia.financialcalculator;

import android.graphics.drawable.Drawable;

public class HomePageListViewItem {
	public final Drawable icon;       // the drawable for the ListView item ImageView
    public final String title;        // the text for the ListView item title
    public final String description;  // the text for the ListView item description
    
    public HomePageListViewItem(Drawable icon, String title, String description) {
        this.icon = icon;
        this.title = title;
        this.description = description;
    }

}
