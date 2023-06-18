package com.cvMohamedAyman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class MainActivity extends AppCompatActivity {
	
	private ScrollView vscroll2;
	private LinearLayout linear1;
	private TextView textview73;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear13;
	private TextView textview70;
	private LinearLayout linear16;
	private TextView textview34;
	private TextView textview43;
	private TextView textview45;
	private TextView textview47;
	private LinearLayout linear30;
	private TextView textview46;
	private TextView textview49;
	private TextView textview48;
	private TextView textview50;
	private TextView textview44;
	private LinearLayout linear17;
	private TextView textview51;
	private TextView textview52;
	private TextView textview53;
	private TextView textview54;
	private TextView textview55;
	private TextView textview56;
	private TextView textview57;
	private TextView textview58;
	private LinearLayout linear20;
	private TextView textview68;
	private TextView textview69;
	private LinearLayout linear22;
	private ImageView imageview1;
	private TextView personal;
	private TextView textview4;
	private TextView name;
	private TextView textview6;
	private TextView city;
	private TextView textview8;
	private TextView number;
	private TextView textview24;
	private TextView email;
	private ImageView imageview3;
	private TextView skalis;
	private ImageView imageview7;
	private TextView textview71;
	private ImageView imageview4;
	private TextView projects;
	private ImageView imageview6;
	private TextView education;
	private LinearLayout linear12;
	private LinearLayout linear24;
	private LinearLayout linear26;
	private LinearLayout linear28;
	private LinearLayout linear23;
	private LinearLayout linear25;
	private LinearLayout linear27;
	private LinearLayout linear29;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		textview73 = (TextView) findViewById(R.id.textview73);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		textview70 = (TextView) findViewById(R.id.textview70);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		textview34 = (TextView) findViewById(R.id.textview34);
		textview43 = (TextView) findViewById(R.id.textview43);
		textview45 = (TextView) findViewById(R.id.textview45);
		textview47 = (TextView) findViewById(R.id.textview47);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		textview46 = (TextView) findViewById(R.id.textview46);
		textview49 = (TextView) findViewById(R.id.textview49);
		textview48 = (TextView) findViewById(R.id.textview48);
		textview50 = (TextView) findViewById(R.id.textview50);
		textview44 = (TextView) findViewById(R.id.textview44);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		textview51 = (TextView) findViewById(R.id.textview51);
		textview52 = (TextView) findViewById(R.id.textview52);
		textview53 = (TextView) findViewById(R.id.textview53);
		textview54 = (TextView) findViewById(R.id.textview54);
		textview55 = (TextView) findViewById(R.id.textview55);
		textview56 = (TextView) findViewById(R.id.textview56);
		textview57 = (TextView) findViewById(R.id.textview57);
		textview58 = (TextView) findViewById(R.id.textview58);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		textview68 = (TextView) findViewById(R.id.textview68);
		textview69 = (TextView) findViewById(R.id.textview69);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		personal = (TextView) findViewById(R.id.personal);
		textview4 = (TextView) findViewById(R.id.textview4);
		name = (TextView) findViewById(R.id.name);
		textview6 = (TextView) findViewById(R.id.textview6);
		city = (TextView) findViewById(R.id.city);
		textview8 = (TextView) findViewById(R.id.textview8);
		number = (TextView) findViewById(R.id.number);
		textview24 = (TextView) findViewById(R.id.textview24);
		email = (TextView) findViewById(R.id.email);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		skalis = (TextView) findViewById(R.id.skalis);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview71 = (TextView) findViewById(R.id.textview71);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		projects = (TextView) findViewById(R.id.projects);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		education = (TextView) findViewById(R.id.education);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		
		linear12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_ICC(imageview1, "#3F51B5", "#3F51B5");
				_ICC(imageview3, "#3F51B5", "#3F51B5");
				_ICC(imageview4, "#3F51B5", "#3F51B5");
				_ICC(imageview6, "#3F51B5", "#3F51B5");
				_ICC(imageview7, "#3F51B5", "#3F51B5");
				personal.setTextColor(0xFF3F51B5);
				skalis.setTextColor(0xFF3F51B5);
				projects.setTextColor(0xFF3F51B5);
				education.setTextColor(0xFF3F51B5);
				textview71.setTextColor(0xFF3F51B5);
			}
		});
		
		linear24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_ICC(imageview1, "#FF4CAF50", "#FF4CAF50");
				_ICC(imageview3, "#FF4CAF50", "#FF4CAF50");
				_ICC(imageview4, "#FF4CAF50", "#3F51B5");
				_ICC(imageview6, "#FF4CAF50", "#FF4CAF50");
				_ICC(imageview7, "#FF4CAF50", "#FF4CAF50");
				personal.setTextColor(0xFF4CAF50);
				skalis.setTextColor(0xFF4CAF50);
				projects.setTextColor(0xFF4CAF50);
				education.setTextColor(0xFF4CAF50);
				textview71.setTextColor(0xFF4CAF50);
			}
		});
		
		linear26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_ICC(imageview1, "#FFFF5722", "#FFFF5722");
				_ICC(imageview3, "#FFFF5722", "#FFFF5722");
				_ICC(imageview4, "#FFFF5722", "#FFFF5722");
				_ICC(imageview6, "#FFFF5722", "#FFFF5722");
				_ICC(imageview7, "#FFFF5722", "#FFFF5722");
				personal.setTextColor(0xFFFF5722);
				skalis.setTextColor(0xFFFF5722);
				projects.setTextColor(0xFFFF5722);
				education.setTextColor(0xFFFF5722);
				textview71.setTextColor(0xFFFF5722);
			}
		});
		
		linear28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_ICC(imageview1, "#00BCD4", "#00BCD4");
				_ICC(imageview3, "#00BCD4", "#00BCD4");
				_ICC(imageview4, "#00BCD4", "#00BCD4");
				_ICC(imageview6, "#00BCD4", "#00BCD4");
				_ICC(imageview7, "#00BCD4", "#00BCD4");
				personal.setTextColor(0xFF00BCD4);
				skalis.setTextColor(0xFF00BCD4);
				projects.setTextColor(0xFF00BCD4);
				education.setTextColor(0xFF00BCD4);
				textview71.setTextColor(0xFF00BCD4);
			}
		});
	}
	
	private void initializeLogic() {
		name.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/almarai.ttf"), 0);
		_radius_to(linear1, 58, 2, "#ffffff");
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _ICC (final ImageView _img, final String _c1, final String _c2) {
		_img.setImageTintList(new android.content.res.ColorStateList(new int[][] {{-android.R.attr.state_pressed},{android.R.attr.state_pressed}},new int[]{Color.parseColor(_c1), Color.parseColor(_c2)}));
	}
	
	
	public void _radius_to (final View _view, final double _radius, final double _shadow, final String _color) {
		android.graphics.drawable.GradientDrawable ab = new android.graphics.drawable.GradientDrawable();
		
		ab.setColor(Color.parseColor(_color));
		ab.setCornerRadius((float) _radius);
		_view.setElevation((float) _shadow);
		_view.setBackground(ab);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}