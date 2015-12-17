package android.app;

import java.util.HashMap;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import voss.android.R;
import voss.shared.logic.Narrator;

public abstract class Activity extends ContextThemeWrapper{
	
	public static final int WIFI_SERVICE = 0;
	
	
	public Activity(){
		
	}
	
	public void setRequestedOrientation(int i){
		
	}
	
	protected void requestWindowFeature(int featureNoTitle) {
		
	}
	protected void setContentView(int activity_home) {
		
	}
	
	protected Intent getIntent() {
		return intent;
	}
	protected void onCreate(Bundle b) {
		
	}
	
	protected void onSaveInstanceState(Bundle b) {
		
	}
	
	public HashMap<Integer, View> i_view = new HashMap<>();
	boolean constructor = true;
	public View findViewById(int id) {
		if (constructor){
			initiate();
			constructor = false;
		}
		return i_view.get(id);
	}
	
	private void initiate(){
		addView(R.id.day_horizontalShimmy);
		
		addTextView(R.id.home_join);
		addTextView(R.id.home_host);
		addTextView(R.id.home_login_signup);
		addTextView(R.id.home_tutorial);
		addTextView(R.id.home_currentGames);

		addRecyclerView(R.id.day_playerNavigationPane);

		addEditText(R.id.day_chatET);
		
		addScrollView(R.id.day_chatHolder);
		
		addListView(R.id.day_rolesList, R.id.roles_categories_LV);
		addListView(R.id.roles_bottomLV, R.id.day_membersLV);
		addListView(R.id.roles_rolesList);
		addListView(R.id.day_actionList);
		
		addTextView(R.id.roles_categories_title, R.id.day_chatTV);
		addTextView(R.id.roles_bottomLV_title);
		addTextView(R.id.day_membersLabel, R.id.day_title);
		addTextView(R.id.day_commandsLabel, R.id.day_rolesList_label);
		addTextView(R.id.roles_rightLV_title);
		addTextView(R.id.roles_hint_title);
		addTextView(R.id.day_currentPlayerTV, R.id.day_role_info);
		
		addButton(R.id.roles_show_Players);
		addButton(R.id.roles_startGame);
		addButton(R.id.day_messagesButton);
		addButton(R.id.day_infoButton);
		addButton(R.id.day_button);
		addButton(R.id.day_playerDrawerButton);
		addButton(R.id.day_actionButton);
		addButton(R.id.day_chatButton);
		
		addDrawerLayout(R.id.day_main);
		
		addSpinner(R.id.day_frameSpinner);
	}
	
	private void addRecyclerView(int id){
		View tv = new RecyclerView(id);
		i_view.put(id, tv);
	}
	private void addEditText(int id) {
		View tv = new EditText(id);
		i_view.put(id, tv);
		
	}
	private void addScrollView(int id){
		View tv = new ScrollView(id);
		i_view.put(id, tv);
	}
	private void addSpinner(int id){
		View tv = new Spinner(id);
		i_view.put(id, tv);
	}
	
	private void addDrawerLayout(int id){
		View tv = new DrawerLayout(id);
		i_view.put(id, tv);
	}
	
	protected void addView(int id){
		View tv = new View(id);
		i_view.put(id, tv);
	}
	
	private void addTextView(int ... id){
		for(int i = 0; i < id.length; i++){
			View tv = new TextView(id[i]);
			i_view.put(id[i], tv);
		}
	}
	
	private void addButton(int i){
		Button b = new Button(i);
		i_view.put(i, b);
	}
	
	private void addListView(int ... id){
		for(int i = 0; i < id.length; i++){
			View tv = new ListView(id[i]);
			i_view.put(id[i], tv);
		}
	}
	

	public Object getAssets() {
		return null;
	}
	public boolean dispatchTouchEvent(MotionEvent me) {
		return false;
	}
	
	public void startActivity(Intent i) {
		
		i.startActivity();
	}
	
	public void finish(){
		
	}
	
	
	private FragmentManager fm = new FragmentManager(this);
	public FragmentManager getFragmentManager() {
		return fm;
	}
	
	SharedPreferences shared = new SharedPreferences();
	protected SharedPreferences getPreferences(int modePrivate) {
		return shared;
	}
	
	protected Object getBaseContext() {

		return null;
	}
	protected void onResume() {
		
	}
	public void onPause() {
		
	}
	public LayoutInflater getLayoutInflater() {
		return new LayoutInflater();
	}
	public Context getApplicationContext() {
		return this;
	}

	

	

	

	private Intent intent;
	public void setIntent(Intent i) {
		this.intent = i;
	}
	
	
	
	
	
	
	
	public void registerReceiver(BroadcastReceiver intentReceiver2, IntentFilter iF2) {
		
	}

	public abstract Narrator getNarrator();
}
