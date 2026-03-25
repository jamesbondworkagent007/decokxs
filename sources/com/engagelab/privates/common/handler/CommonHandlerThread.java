package com.engagelab.privates.common.handler;

import android.os.HandlerThread;
import com.engagelab.privates.common.log.MTCommonLog;

/* JADX INFO: loaded from: classes2.dex */
public class CommonHandlerThread extends HandlerThread {
    private static final String TAG = "CommonHandlerThread";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CommonHandlerThread(String str) {
        super(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            super.run();
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "run failed " + th.getMessage());
        }
    }
}
