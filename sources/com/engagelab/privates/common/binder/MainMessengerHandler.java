package com.engagelab.privates.common.binder;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.observer.MTObservable;

/* JADX INFO: loaded from: classes14.dex */
public class MainMessengerHandler extends Handler {
    private static final String TAG = "MainMessengerHandler";
    private final Context context;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MainMessengerHandler(Context context, Looper looper) {
        super(looper);
        this.context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            MTObservable.getInstance().dispatchMessage(this.context, message.what, message.getData());
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "handleMessage failed " + th.getMessage());
        }
    }
}
