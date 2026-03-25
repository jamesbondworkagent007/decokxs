package com.engagelab.privates.common.binder;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.observer.MTObservable;

/* JADX INFO: loaded from: classes14.dex */
public class RemoteMessengerHandler extends Handler {
    private static final String TAG = "RemoteMessengerHandler";
    private final Context context;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RemoteMessengerHandler(Context context, Looper looper) {
        super(looper);
        this.context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            MTMessenger.getInstance().initMainMessenger(message.replyTo);
            int i = message.what;
            Bundle data = message.getData();
            if (i == 101) {
                MTObservable.getInstance().observerOnRemoteProcess(this.context, data);
            } else {
                MTObservable.getInstance().dispatchMessage(this.context, i, data);
            }
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "handleMessage failed " + th.getMessage());
        }
    }
}
