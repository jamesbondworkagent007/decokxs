package com.engagelab.privates.common.handler;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.observer.MTObservable;

/* JADX INFO: loaded from: classes2.dex */
public class CommonHandler extends Handler {
    private static final String TAG = "CommonHandler";
    private static final int WHAT_RELEASE = -1000;
    private final Context context;
    private final int releaseInterval;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CommonHandler(Looper looper, Context context, int i) {
        super(looper);
        this.context = context;
        this.releaseInterval = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            int i = message.arg1;
            String strValueOf = String.valueOf(message.obj);
            int i2 = message.what;
            Bundle data = message.getData();
            if (i2 == -1000) {
                MTHandler.getInstance().releaseHandler(this.context, getLooper().getThread().getName());
                return;
            }
            removeMessages(-1000);
            sendEmptyMessageDelayed(-1000, this.releaseInterval);
            MTObservable.getInstance().handleMessage(this.context, i, strValueOf, i2, data);
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "handleMessage failed " + th.getMessage());
        }
    }
}
