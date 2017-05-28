package com.example.slidingmenudemo;


import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;
import android.os.Bundle;


public class MainActivity extends SlidingFragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//���ò����
		setBehindContentView(R.layout.left_menu);
		SlidingMenu slidingMenu=getSlidingMenu();
		
		//�����Ҳ�����
		slidingMenu.setSecondaryMenu(R.layout.right_menu);
		
		//���ò����ģʽ�����Ҷ���
		slidingMenu.setMode(SlidingMenu.LEFT_RIGHT);
		
		//���ò����ȫ������
		slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
	
		//���ò������Ļ���
		slidingMenu.setBehindOffset(200);//������ĻԤ�����
	
	}

	
	
}
