package android.widget;

import android.text.TextWatcher;
import android.view.View;

public class EditText extends View{

	public EditText(int i) {
		super(i);
	}

	private String text;
	public void setText(String name) {
		text = name;
		
	}

	public String getText() {
		return text;
	}

	public void addTextChangedListener(TextWatcher textWatcher) {
		
	}

	public void setInputType(int typeClassPhone) {
		
	}

	public int length() {
		return text.length();
	}

}
