package com.engagelab.privates.common;

import android.content.Context;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.core.global.MTCoreGlobal;

/* JADX INFO: loaded from: classes14.dex */
public class n {
    public static volatile n c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f341a = 0;
    public long b = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(Context context) {
        boolean zB = w.b(context);
        MTCommonLog.d("MTActiveBusiness", "toForeground connectState:" + zB);
        if (zB) {
            if (!o.a().b()) {
                MTCommonLog.d("MTActiveBusiness", "re connect toForeground");
                MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.START_CONNECT, null);
            } else {
                if (this.b == 0) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f341a = jCurrentTimeMillis;
                if (jCurrentTimeMillis - this.b < MTCoreGlobal.getHeartbeatInterval() / 2) {
                    return;
                }
                MTCommonLog.d("MTActiveBusiness", "re heartbeat");
                o.a().g(context);
                o.a().e(context);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static n a() {
        if (c == null) {
            synchronized (n.class) {
                c = new n();
            }
        }
        return c;
    }

    public void a(Context context) {
        if (w.b(context)) {
            this.b = System.currentTimeMillis();
        }
    }
}
