package com.example.slidingmenudemo;


import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;
import android.os.Bundle;


public class MainActivity extends SlidingFragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//ÉèÖÃ²à±ßÀ¸
		setBehindContentView(R.layout.left_menu);
		SlidingMenu slidingMenu=getSlidingMenu();
		
		//ÉèÖÃÓÒ²à²à±ßÀ¸
		slidingMenu.setSecondaryMenu(R.layout.right_menu);
		
		//ÉèÖÃ²à±ßÀ¸Ä£Ê½£º×óÓÒ¶¼ÓĞ
		slidingMenu.setMode(SlidingMenu.LEFT_RIGHT);
		
		//ÉèÖÃ²à±ßÀ¸È«ÆÁ´¥Ãş
		slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
	
		//ÉèÖÃ²à±ßÀ¸ÆÁÄ»¿í¶È
		slidingMenu.setBehindOffset(200);//ÉèÖÃÆÁÄ»Ô¤Áô¿í¶È
	
	}

	
	
}
