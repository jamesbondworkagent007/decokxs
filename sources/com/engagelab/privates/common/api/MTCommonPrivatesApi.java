package com.engagelab.privates.common.api;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.common.MTCommon;
import com.engagelab.privates.common.binder.MTMessenger;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.handler.MTHandler;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.observer.MTObservable;
import com.engagelab.privates.common.observer.MTObserver;

/* JADX INFO: loaded from: classes2.dex */
public class MTCommonPrivatesApi {
    public static final int SDK_VERSION_CODE = 439;
    public static final String SDK_VERSION_NAME = "4.3.9";
    private static final String TAG = "MTCommonPrivatesApi";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void buildHandler(Context context, String str) {
        MTHandler.getInstance().buildHandler(context, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void init(Context context, boolean z) {
        if (context == null) {
            MTCommonLog.e(TAG, "can't init with empty context");
            return;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTGlobal.context = context.getApplicationContext();
            MTGlobal.isNeedRemoteProcess = z || MTGlobal.isNeedRemoteProcess;
            if (MTGlobal.isMainProcess(context.getApplicationContext())) {
                sendMessage(context, MTCommon.THREAD_COMMON, 1000, null);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void observer(Context context, MTObserver mTObserver) {
        if (context == null) {
            MTCommonLog.e(TAG, "can't observer with empty context");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTObservable.getInstance().observer(context.getApplicationContext(), mTObserver);
        } else {
            MTCommonLog.e(TAG, "can't observer in another process");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void postMessageDelayed(Context context, String str, Runnable runnable, long j) {
        if (context == null) {
            MTCommonLog.e(TAG, "can't postMessageDelayed with empty context");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.e(TAG, "can't postMessageDelayed with empty name");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTHandler.getInstance().postMessageDelayed(context, str, runnable, j);
        } else {
            MTCommonLog.e(TAG, "can't postMessageDelayed in another process");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void releaseHandler(Context context, String str) {
        MTHandler.getInstance().releaseHandler(context, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void removeMessages(Context context, String str, int i) {
        MTHandler.getInstance().removeMessages(context, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void sendMessage(Context context, String str, int i, Bundle bundle) {
        if (context == null) {
            MTCommonLog.e(TAG, "can't sendMessage with empty context");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.e(TAG, "can't sendMessage with empty name");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTHandler.getInstance().sendMessage(context, str, i, bundle);
        } else {
            MTCommonLog.e(TAG, "can't sendMessage in another process");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void sendMessageDelayed(Context context, String str, int i, Bundle bundle, long j) {
        if (context == null) {
            MTCommonLog.e(TAG, "can't sendMessageDelayed with empty context");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.e(TAG, "can't sendMessageDelayed with empty name");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTHandler.getInstance().sendMessageDelayed(context, str, i, bundle, j);
        } else {
            MTCommonLog.e(TAG, "can't sendMessageDelayed in another process");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void sendMessageToMainProcess(Context context, int i, Bundle bundle) {
        if (context == null) {
            MTCommonLog.e(TAG, "can't sendMessageToMainProcess with empty context");
        } else {
            MTMessenger.getInstance().sendMessageToMainProcess(context.getApplicationContext(), i, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void sendMessageToRemoteProcess(Context context, int i, Bundle bundle) {
        if (context == null) {
            MTCommonLog.e(TAG, "can't sendMessageToRemoteProcess with empty context");
        } else {
            MTMessenger.getInstance().sendMessageToRemoteProcess(context.getApplicationContext(), i, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void buildHandler(Context context, String str, int i) {
        MTHandler.getInstance().buildHandler(context, str, i);
    }
}
