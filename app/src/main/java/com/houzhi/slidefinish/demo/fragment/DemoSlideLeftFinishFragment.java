package com.houzhi.slidefinish.demo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.houzhi.slidefinish.fragment.SlideLeftFinishFragment;
import com.houzhi.slidefinish.R;

public class DemoSlideLeftFinishFragment extends SlideLeftFinishFragment {
	
	private static final String ARG_BG_COLOR = "backgroundcolor";
	
	private int bgColor;
	@Override
	protected View onCreateContentView(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_blank, container, false);
		v.setBackgroundColor(bgColor);
		TextView tv = (TextView)v.findViewById(R.id.tv_hint);
		tv.setText(R.string.slide_left);
		
		return v;
	}

	public static DemoSlideLeftFinishFragment newInstance(int bgColor) {
		DemoSlideLeftFinishFragment fragment = new DemoSlideLeftFinishFragment();
		Bundle args = new Bundle();
		args.putInt(ARG_BG_COLOR, bgColor);
		fragment.setArguments(args);
		return fragment;
	}

	public DemoSlideLeftFinishFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (getArguments() != null) {
			bgColor = getArguments().getInt(ARG_BG_COLOR);
		}
	}
	
}