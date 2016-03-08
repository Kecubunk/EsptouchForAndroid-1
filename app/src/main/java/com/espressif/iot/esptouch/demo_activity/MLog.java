/**
 * Name:MLog.java
 * Created:2013-1-15
 * Author:peitao
 * 
 */


package com.espressif.iot.esptouch.demo_activity;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class MLog {
	private static final Boolean LOG_OUT = true;
	private static final int LENGTH = 5;
	private Handler mLogHandler;
//	private Handler mLogHandler;

	public MLog(Handler handler){
		mLogHandler = handler;
	}

	public int d(String TAG, String msg) {
		if (!LOG_OUT) {
			return -1;
		}
		Message message=new Message();
		message.obj=msg;
		message.what=1;
		mLogHandler.sendMessage(message);
		return Log.d(TAG, msg);
	}

	public int i(String TAG, String msg) {
		if (!LOG_OUT) {
			return -1;
		}
		Message message=new Message();
		message.obj=msg;
		message.what=1;
		mLogHandler.sendMessage(message);
		return Log.i(TAG, msg);
	}

	public int v(String TAG, String msg) {
		if (!LOG_OUT) {
			return -1;
		}
		Message message=new Message();
		message.obj=msg;
		message.what=1;
		mLogHandler.sendMessage(message);
		return Log.v(TAG, msg);
	}

	public int w(String TAG, String msg) {
		if (!LOG_OUT) {
			return -1;
		}
		Message message=new Message();
		message.obj=msg;
		message.what=1;
		mLogHandler.sendMessage(message);
		return Log.w(TAG, msg);
	}

	public int e(String TAG, String msg) {
		if (!LOG_OUT) {
			return -1;
		}
		Message message=new Message();
		message.obj=msg;
		message.what=1;
		mLogHandler.sendMessage(message);
		return Log.e(TAG, msg);
	}

	public static int printMethodName(String TAG) {
		if (!LOG_OUT) {
			return -1;
		}
		String msg = "";
		StackTraceElement info = LogInfo.getInfoInternal(LENGTH);
		if (info != null) {
			msg = info.getMethodName() + " # Line " + info.getLineNumber();
		}
		
		return Log.i(TAG, msg);

	}

	public static int printStackTrace(String TAG) {
		if (!LOG_OUT) {
			return -1;
		}

		StackTraceElement[] stackTraceElements = new Exception().getStackTrace();
		
		if (stackTraceElements != null) {
			Log.d(TAG, "printStackTrace:");
			for (int i = 1; i < stackTraceElements.length; i++) {
				Log.d(TAG, stackTraceElements[i].toString());
			}
		}

		return 0;
	}

}
