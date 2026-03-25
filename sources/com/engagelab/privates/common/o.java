package com.engagelab.privates.common;

import android.content.Context;
import android.os.Bundle;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.component.MTCommonReceiver;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.core.MTCore;
import com.engagelab.privates.core.api.MTProtocol;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.core.global.MTCoreGlobal;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class o {
    public static volatile o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f342a = new u();
    public final q b = s.a();
    public int c = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(Context context) {
        MTCommonReceiver commonReceiver = MTGlobal.getCommonReceiver(context);
        if (commonReceiver == null) {
            return;
        }
        commonReceiver.onConnectStatus(context, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(Context context, Bundle bundle) {
        this.b.a(context, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(Context context) {
        if (!w.b(context)) {
            MTCommonLog.w("MTConnectBusiness", "connect state is false, can't startConnect");
            return;
        }
        MTCommonLog.d("MTConnectBusiness", "startConnect");
        this.f342a.d(context);
        this.b.g(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(Context context) {
        MTCommonLog.d("MTConnectBusiness", "startHeartbeat");
        String str = MTCore.f351a;
        MTCommonPrivatesApi.sendMessageDelayed(context, str, MTCoreConstants.RemoteWhat.START_HEARTBEAT, null, MTCoreGlobal.getHeartbeatInterval());
        MTProtocol threadName = new MTProtocol().setCommand(2).setVersion(4).setBody(x.c(context)).setThreadName(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, threadName);
        c(context, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f(Context context) {
        MTCommonLog.d("MTConnectBusiness", "stopConnect");
        this.f342a.f(context);
        this.b.h(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g(Context context) {
        MTCommonLog.d("MTConnectBusiness", "stopHeartbeat");
        MTCommonPrivatesApi.removeMessages(context, MTCore.f351a, MTCoreConstants.RemoteWhat.START_HEARTBEAT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void h(Context context) {
        MTCommonLog.d("MTConnectBusiness", "turnOffConnect");
        w.a(context, false);
        MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.STOP_CONNECT, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void i(Context context) {
        MTCommonLog.d("MTConnectBusiness", "turnOnConnect");
        w.a(context, true);
        MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.START_CONNECT, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static o a() {
        if (d == null) {
            synchronized (o.class) {
                if (d == null) {
                    d = new o();
                }
            }
        }
        return d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void c(Context context) {
        MTCommonReceiver commonReceiver = MTGlobal.getCommonReceiver(context);
        if (commonReceiver == null) {
            return;
        }
        commonReceiver.onConnectStatus(context, false);
    }

    public void b(Context context, Bundle bundle) {
        MTCommonReceiver commonReceiver = MTGlobal.getCommonReceiver(context);
        if (commonReceiver == null || bundle == null) {
            return;
        }
        commonReceiver.onRegister(context, bundle.getString(MTCoreConstants.Register.KEY_REGISTRATION_ID));
    }

    public void a(Context context, Bundle bundle) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(((MTProtocol) bundle.getParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL)).getBody());
        byte b = byteBufferWrap.get();
        byte b2 = byteBufferWrap.get();
        byte b3 = byteBufferWrap.get();
        MTCommonLog.d("MTConnectBusiness", "onAckSuccess command:" + ((int) b) + ", result:" + ((int) b2) + ", code:" + ((int) b3) + ", serverTime:" + byteBufferWrap.getLong());
        if (b == 2) {
            MTCommonLog.i("MTConnectBusiness", "onHeartbeatSuccess");
            this.c = 0;
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.MainWhat.ON_HEARTBEAT, null);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.ON_HEARTBEAT, null);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.REPORT, null);
        }
    }

    public boolean b() {
        return this.b.b();
    }

    public void a(Context context) {
        this.c++;
        MTCommonLog.d("MTConnectBusiness", "onAckFailed :" + this.c);
        if (this.c < 5) {
            g(context);
            e(context);
        } else {
            this.c = 0;
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.STOP_CONNECT, null);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.START_CONNECT, null);
        }
    }
}
