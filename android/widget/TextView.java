package android.widget;

import android.graphics.Typeface;
import android.view.View;

public class TextView extends View{


	public TextView(int i) {
		super(i);
	}

	public void setTypeface(Typeface font) {
		
	}

	public String getText() {
		return text;
	}

	public void setTextColor(int parseColor) {
		
	}

	private String text;
	public void setText(String replace) {
		this.text = replace;
	}

	public void setTextSize(Float textSize) {
		
	}

}
