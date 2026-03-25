package com.engagelab.privates.common.handler;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.engagelab.privates.common.log.MTCommonLog;
import java.lang.Thread;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class MTHandler {
    private static final int DEFAULT_RELEASE_INTERVAL = 300000;
    private static final String TAG = "MTHandler";
    private static volatile MTHandler instance;
    private final ConcurrentHashMap<String, CommonHandlerThread> handlerThreadMap = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, CommonHandler> handlerMap = new ConcurrentHashMap<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CommonHandler buildHandler(Context context, String str) {
        return buildHandler(context, str, DEFAULT_RELEASE_INTERVAL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void postMessageDelayed(Context context, String str, Runnable runnable, long j) {
        try {
            CommonHandler commonHandlerBuildHandler = buildHandler(context, str);
            if (commonHandlerBuildHandler == null) {
                return;
            }
            commonHandlerBuildHandler.postDelayed(runnable, j);
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "sendMessageDelayed failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void releaseHandler(Context context, String str) {
        try {
            if (this.handlerMap.containsKey(str)) {
                CommonHandler commonHandler = this.handlerMap.get(str);
                if (commonHandler != null) {
                    MTCommonLog.d(TAG, "releaseHandler:" + str);
                    commonHandler.removeCallbacksAndMessages(null);
                }
                this.handlerMap.remove(str);
            }
            if (this.handlerThreadMap.containsKey(str)) {
                CommonHandlerThread commonHandlerThread = this.handlerThreadMap.get(str);
                if (commonHandlerThread != null) {
                    commonHandlerThread.quit();
                }
                this.handlerThreadMap.remove(str);
            }
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "releaseHandler failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void removeMessages(Context context, String str, int i) {
        try {
            CommonHandler commonHandlerBuildHandler = buildHandler(context, str);
            if (commonHandlerBuildHandler == null) {
                return;
            }
            commonHandlerBuildHandler.removeMessages(i);
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "removeMessages failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void sendMessage(Context context, String str, int i, Bundle bundle) {
        try {
            Message messageObtain = Message.obtain();
            messageObtain.arg1 = 0;
            messageObtain.obj = str;
            messageObtain.what = i;
            messageObtain.setData(bundle);
            CommonHandler commonHandlerBuildHandler = buildHandler(context, str);
            if (commonHandlerBuildHandler == null) {
                return;
            }
            commonHandlerBuildHandler.sendMessage(messageObtain);
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "sendMessage failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void sendMessageDelayed(Context context, String str, int i, Bundle bundle, long j) {
        try {
            Message messageObtain = Message.obtain();
            messageObtain.arg1 = 1;
            messageObtain.obj = str;
            messageObtain.what = i;
            messageObtain.setData(bundle);
            CommonHandler commonHandlerBuildHandler = buildHandler(context, str);
            if (commonHandlerBuildHandler == null) {
                return;
            }
            commonHandlerBuildHandler.sendMessageDelayed(messageObtain, j);
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "sendMessageDelayed failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static MTHandler getInstance() {
        if (instance == null) {
            synchronized (MTHandler.class) {
                instance = new MTHandler();
            }
        }
        return instance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CommonHandler buildHandler(Context context, String str, int i) {
        CommonHandler commonHandler;
        synchronized (this) {
            try {
                CommonHandlerThread commonHandlerThread = this.handlerThreadMap.get(str);
                if (commonHandlerThread == null) {
                    commonHandlerThread = new CommonHandlerThread(str);
                    this.handlerThreadMap.put(str, commonHandlerThread);
                }
                if (commonHandlerThread.getState() == Thread.State.NEW) {
                    commonHandlerThread.start();
                }
                commonHandler = this.handlerMap.get(str);
                if (commonHandlerThread.getState() == Thread.State.TERMINATED) {
                    if (commonHandler != null) {
                        commonHandler.removeCallbacksAndMessages(null);
                    }
                    commonHandlerThread = new CommonHandlerThread(str);
                    commonHandlerThread.start();
                    this.handlerThreadMap.put(str, commonHandlerThread);
                    commonHandler = new CommonHandler(commonHandlerThread.getLooper(), context, i);
                    this.handlerMap.put(str, commonHandler);
                    MTCommonLog.d(TAG, "buildHandler：" + str);
                }
                if (commonHandler == null) {
                    commonHandler = new CommonHandler(commonHandlerThread.getLooper(), context, i);
                    this.handlerMap.put(str, commonHandler);
                    MTCommonLog.d(TAG, "buildHandler：" + str);
                }
            } catch (Throwable th) {
                MTCommonLog.w(TAG, "buildHandler failed " + th.getMessage());
                return null;
            }
        }
        return commonHandler;
    }
}
