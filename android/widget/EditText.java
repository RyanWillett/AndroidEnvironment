package android.widget;

import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText.OnEditorActionListener;

public class EditText extends View{

	public interface OnEditorActionListener {

	}

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

	public void setOnEditorActionListener(OnEditorActionListener onEditorActionListener) {
		// TODO Auto-generated method stub
		
	}

	public void post(Runnable runnable) {
		// TODO Auto-generated method stub
		
	}

	public void requestFocusFromTouch() {
		// TODO Auto-generated method stub
		
	}

	

	public void removeTextChangedListener(TextWatcher textWatcher) {
		// TODO Auto-generated method stub
		
	}

}
