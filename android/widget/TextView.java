package android.widget;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;

public class TextView extends View{


	public TextView(int i) {
		super(i);
	}

	public void setTypeface(Typeface font) {
		// TODO Auto-generated method stub
		
	}

	public String getText() {
		return text;
	}

	public void setTextColor(int parseColor) {
		// TODO Auto-generated method stub
		
	}

	private String text;
	public void setText(String replace) {
		this.text = replace;
	}

}
