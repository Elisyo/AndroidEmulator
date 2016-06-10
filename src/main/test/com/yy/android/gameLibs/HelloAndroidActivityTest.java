package com.yy.android.gameLibs;

import com.yy.android.gameLibs.HelloAndroidActivity;
import com.yy.android.gameLibs.R;
import android.test.ActivityUnitTestCase;;
import android.app.Instrumentation;
import android.content.Intent;
import android.widget.TextView;
import org.junit.Test;
import static org.junit.Assert.*;

//public class HelloAndroidActivityTest {
public class HelloAndroidActivityTest extends ActivityUnitTestCase<HelloAndroidActivity> {

    HelloAndroidActivity mHelloAndroidActivity;

    TextView mTextView;

    public HelloAndroidActivityTest(){
        super(HelloAndroidActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        startActivity(new Intent(getInstrumentation().getTargetContext(), HelloAndroidActivity.class), null, null);
  
        mHelloAndroidActivity = (HelloAndroidActivity) getActivity();
       //mInstrumentation = getInstrumentation();
 
        mTextView = (TextView) mHelloAndroidActivity.findViewById(com.yy.android.gameLibs.R.id.txview);
 
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testAppName() throws Exception {

 		String ac = mTextView.getText().toString();
    	//HelloAndroidActivity haa = new HelloAndroidActivity();
        //String appName = haa.getResources().getString(R.string.app_name);
        String test = "Hello world!";
        //assertEquals(appName, "Maven Quickstart");
        assertEquals(test,ac);

    }

}
