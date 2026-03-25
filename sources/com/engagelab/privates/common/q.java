package com.engagelab.privates.common;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.observer.MTObservable;
import com.engagelab.privates.common.observer.MTObserver;
import com.engagelab.privates.common.utils.AESUtil;
import com.engagelab.privates.common.utils.SM4Util;
import com.engagelab.privates.common.utils.SystemUtil;
import com.engagelab.privates.core.MTCore;
import com.engagelab.privates.core.api.MTProtocol;
import com.engagelab.privates.core.api.Outputer;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.core.global.MTCoreGlobal;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentMap<MTProtocol, String> f343a = new ConcurrentHashMap();
    public boolean b;
    public boolean c;

    public abstract String a();

    public abstract void a(Context context);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(Context context, String str, int i) {
        try {
        } catch (Throwable th) {
            MTCommonLog.w(a(), "tcp connect failed " + th.getMessage());
            a(context, false);
        }
        if (!SystemUtil.isNetworkConnecting(context)) {
            MTCommonLog.e(a(), "can't connect, network is disConnected");
            return false;
        }
        MTCommonLog.d(a(), "tcp connect " + str + ":" + i);
        if (b(context, str, i)) {
            MTCommonLog.d(a(), "tcp connect success");
            this.b = true;
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean b() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(Context context) {
        MTProtocol threadName = new MTProtocol().setRid(MTCoreGlobal.getRid()).setCommand(1).setVersion(23).setBody(x.d(context)).setThreadName(MTCore.c);
        if (threadName == null) {
            MTCommonLog.w(a(), "login failed, send request failed");
            return false;
        }
        MTCommonLog.d(a(), "send " + threadName.toString());
        b(context, a(context, threadName));
        MTProtocol mTProtocolA = a(context, d(context));
        if (mTProtocolA == null) {
            MTCommonLog.w(a(), "login failed, receive response failed");
            return false;
        }
        MTCommonLog.d(a(), "receive " + mTProtocolA.toString());
        if (x.a(context, mTProtocolA.getBody()) != 0) {
            MTCommonPrivatesApi.sendMessageToMainProcess(context, MTCoreConstants.MainWhat.ON_TCP_DISCONNECTED, null);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.ON_TCP_DISCONNECTED, null);
            return false;
        }
        m.a().a(context);
        MTCommonPrivatesApi.sendMessageToMainProcess(context, MTCoreConstants.MainWhat.ON_TCP_CONNECTED, null);
        MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.ON_TCP_CONNECTED, null);
        return true;
    }

    public abstract boolean b(Context context, String str, int i) throws Throwable;

    public abstract List<String> c(Context context);

    public abstract boolean c(Context context, byte[] bArr) throws IOException;

    public abstract byte[] d(Context context);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(Context context) {
        byte[] bArrD;
        MTCommonLog.d(a(), "receiving......");
        while (this.b && (bArrD = d(context)) != null) {
            MTProtocol mTProtocolA = a(context, bArrD);
            if (mTProtocolA == null) {
                MTCommonLog.d(a(), "parseResponse failed");
            } else {
                b(context, mTProtocolA);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f(Context context) {
        long jO = w.o(context);
        String strH = w.h(context);
        String strE = w.e(context);
        MTCommonLog.d(a(), "register uid:" + jO + ",rid:" + strH + ",password:" + strE);
        if (jO > 0 && !TextUtils.isEmpty(strH) && !TextUtils.isEmpty(strE)) {
            return true;
        }
        MTProtocol threadName = new MTProtocol().setRid(MTCoreGlobal.getRid()).setCommand(0).setVersion(19).setBody(x.e(context)).setThreadName(MTCore.c);
        if (threadName == null) {
            MTCommonLog.w(a(), "register failed, send request failed");
            return false;
        }
        MTCommonLog.d(a(), "send " + threadName.toString());
        b(context, a(context, threadName));
        MTProtocol mTProtocolA = a(context, d(context));
        if (mTProtocolA == null) {
            MTCommonLog.w(a(), "register failed, receive response failed");
            return false;
        }
        MTCommonLog.d(a(), "receive " + mTProtocolA.toString());
        if (x.b(context, mTProtocolA.getBody()) != 0) {
            MTCommonPrivatesApi.sendMessageToMainProcess(context, MTCoreConstants.MainWhat.ON_TCP_DISCONNECTED, null);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.ON_TCP_DISCONNECTED, null);
            return false;
        }
        m.a().b(context);
        String strH2 = w.h(context);
        Bundle bundle = new Bundle();
        bundle.putString(MTCoreConstants.Register.KEY_REGISTRATION_ID, strH2);
        MTCommonPrivatesApi.sendMessageToMainProcess(context, MTCoreConstants.MainWhat.ON_REGISTER_SUCCESS, bundle);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void h(Context context) {
        this.c = false;
        a(context, false);
        MTCommonPrivatesApi.sendMessageToMainProcess(context, MTCoreConstants.MainWhat.ON_TCP_DISCONNECTED, null);
        MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.ON_TCP_DISCONNECTED, null);
    }

    public void g(Context context) {
        this.c = true;
        if (this.b) {
            MTCommonLog.d(a(), "can't connect, isTcpConnecting");
            return;
        }
        this.b = true;
        List<String> listC = c(context);
        if (listC.isEmpty()) {
            MTCommonLog.w(a(), "there are no tcp connect address");
            a(context, false);
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(listC);
        int connectRetryCount = MTCoreGlobal.getConnectRetryCount();
        for (int i = 0; i < connectRetryCount; i++) {
            MTCommonLog.d(a(), "connect retry count is " + i);
            for (String str : arrayList) {
                if (!w.b(context)) {
                    MTCommonLog.d(a(), "can't connect ,connect state is false");
                    return;
                }
                if (!this.c) {
                    MTCommonLog.d(a(), "can't connect ,tcp state is false");
                    return;
                }
                String[] strArrSplit = str.split(":");
                String str2 = strArrSplit[strArrSplit.length - 1];
                if (!a(context, str.substring(0, (str.length() - str2.length()) - 1), Integer.parseInt(str2))) {
                    a(context, false);
                } else if (!f(context)) {
                    a(context, false);
                } else if (!b(context)) {
                    a(context, false);
                } else {
                    e(context);
                }
            }
        }
    }

    public void a(Context context, Bundle bundle) {
        try {
            if (bundle == null) {
                MTCommonLog.d(a(), "can't send, bundle is null");
                return;
            }
            if (bundle.containsKey("data")) {
                if (this.b && SystemUtil.isNetworkConnecting(context)) {
                    b(context, bundle.getByteArray("data"));
                    return;
                }
                MTCommonLog.d(a(), "can't send data, tcp is not connected");
                a(context, false);
                return;
            }
            bundle.setClassLoader(MTProtocol.class.getClassLoader());
            MTProtocol mTProtocol = (MTProtocol) bundle.getParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL);
            if (!SystemUtil.isNetworkConnecting(context)) {
                MTCommonLog.d(a(), "can't send command:" + mTProtocol.getCommand() + ", network is disConnected");
                a(context, false);
                MTCommonPrivatesApi.sendMessageDelayed(context, mTProtocol.getThreadName(), mTProtocol.getCommand(), bundle, 0L);
                return;
            }
            if (!this.b) {
                MTCommonLog.d(a(), "can't send command:" + mTProtocol.getCommand() + ", tcp is disConnected");
                a(context, false);
                MTCommonPrivatesApi.sendMessageDelayed(context, mTProtocol.getThreadName(), mTProtocol.getCommand(), bundle, 0L);
                return;
            }
            if (mTProtocol.getRid() == 0) {
                mTProtocol.setRid(MTCoreGlobal.getRid());
            }
            MTCommonLog.d(a(), "send " + mTProtocol.toString());
            String threadName = mTProtocol.getThreadName();
            byte[] bArrA = a(context, mTProtocol);
            if (bArrA == null) {
                return;
            }
            b(context, bArrA);
            if (TextUtils.isEmpty(threadName)) {
                return;
            }
            this.f343a.put(mTProtocol, threadName);
            MTCommonPrivatesApi.sendMessageDelayed(context, threadName, mTProtocol.getCommand(), bundle, WorkRequest.MIN_BACKOFF_MILLIS);
        } catch (Throwable th) {
            MTCommonLog.w(a(), "send failed " + th.getMessage());
            a(context, true);
        }
    }

    public final void b(Context context, byte[] bArr) {
        try {
            if (!this.b) {
                MTCommonLog.d(a(), "can't send, tcp is not connected");
                return;
            }
            boolean zC = c(context, bArr);
            MTCommonLog.d(a(), "sendImp :" + zC);
        } catch (IOException e) {
            String message = e.getMessage();
            MTCommonLog.w(a(), "send IOException " + message);
            if (message != null && message.startsWith("MyCertificateException:")) {
                w.a(context, (String) null);
            }
            a(context, true);
        } catch (NotYetConnectedException e2) {
            MTCommonLog.w(a(), "send NotYetConnectedException " + e2.getMessage());
            a(context, true);
        } catch (Throwable th) {
            MTCommonLog.w(a(), "send throwable " + th.getMessage());
            a(context, true);
        }
    }

    public final void b(Context context, MTProtocol mTProtocol) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, mTProtocol);
        Iterator<MTProtocol> it = this.f343a.keySet().iterator();
        while (it.hasNext()) {
            MTProtocol next = it.next();
            if (next.getRid() == mTProtocol.getRid()) {
                String str = this.f343a.get(next);
                mTProtocol.setThreadName(str);
                MTCommonLog.d(a(), "receive " + mTProtocol.toString());
                it.remove();
                MTCommonPrivatesApi.removeMessages(context, str, next.getCommand());
                MTCommonPrivatesApi.sendMessage(context, str, mTProtocol.getCommand(), bundle);
                return;
            }
        }
        for (MTObserver mTObserver : MTObservable.getInstance().observeQueue) {
            if (mTObserver.isSupport(mTProtocol.getCommand())) {
                String str2 = mTObserver.getThreadName()[0];
                mTProtocol.setThreadName(str2);
                MTCommonLog.d(a(), "receive " + mTProtocol.toString());
                MTCommonPrivatesApi.sendMessage(context, str2, mTProtocol.getCommand(), bundle);
            }
        }
    }

    public void a(Context context, boolean z) {
        MTCommonLog.d(a(), "tcp disconnect");
        this.b = false;
        MTCommonPrivatesApi.removeMessages(context, MTCore.f351a, MTCoreConstants.RemoteWhat.START_HEARTBEAT);
        try {
            a(context);
        } catch (Throwable th) {
            MTCommonLog.w(a(), "disconnect failed " + th.getMessage());
        }
        if (z) {
            MTCommonLog.d(a(), "tcp retry connect");
            if (!SystemUtil.isNetworkConnecting(context)) {
                MTCommonLog.d(a(), "tcp retry connect not has net");
                return;
            }
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.STOP_CONNECT, null);
            String str = MTCore.f351a;
            MTCommonPrivatesApi.removeMessages(context, str, MTCoreConstants.RemoteWhat.RETRY_CONNECT);
            MTCommonPrivatesApi.sendMessageDelayed(context, str, MTCoreConstants.RemoteWhat.RETRY_CONNECT, null, 2000L);
        }
    }

    public final byte[] a(Context context, MTProtocol mTProtocol) {
        int i;
        int i2;
        int i3;
        try {
            int command = mTProtocol.getCommand();
            int version = mTProtocol.getVersion();
            long jO = w.o(context);
            int i4 = w.i(context);
            long rid = mTProtocol.getRid();
            int encryptType = MTGlobal.getEncryptType();
            if (encryptType == 1 || encryptType == 2) {
                i = 27;
                i2 = 1;
            } else {
                i = 24;
                i2 = 0;
            }
            Outputer outputer = new Outputer(i);
            if (i2 != 0) {
                outputer.writeU8(i);
                outputer.writeU8(i2);
                i3 = 1;
            } else {
                i3 = 0;
            }
            outputer.writeU8(command ^ 90);
            outputer.writeU8(version ^ 90);
            outputer.writeU64(jO ^ 6510615555426900570L);
            outputer.writeU32(i4);
            outputer.writeU64(rid ^ 6510615555426900570L);
            outputer.writeU16(0);
            if (i2 == 1) {
                outputer.writeU8(encryptType);
            }
            byte[] byteArray = outputer.toByteArray();
            byte[] body = mTProtocol.getBody();
            String md5AesKey = AESUtil.getMd5AesKey(w.o(context));
            if (encryptType == 0) {
                body = AESUtil.encryptBytes(body, md5AesKey);
            } else if (encryptType == 1) {
                body = AESUtil.encryptBytes(body, md5AesKey, md5AesKey.substring(0, 16));
            } else if (encryptType == 2) {
                body = SM4Util.encryptBytes(body, md5AesKey, md5AesKey.substring(0, 16));
            }
            int length = body.length;
            int i5 = i + 2;
            int i6 = i5 + length;
            byte b = (byte) ((i6 >>> 8) & 255);
            byte[] bArr = body;
            byte[] bArr2 = {b, (byte) (i6 & 255)};
            byte b2 = (byte) (b | UnsignedBytes.MAX_POWER_OF_TWO);
            bArr2[0] = b2;
            if (i3 != 0) {
                bArr2[0] = (byte) (b2 | SignedBytes.MAX_POWER_OF_TWO);
            }
            MTCommonLog.d(a(), "send ahead length:2, encryption:1, expand:" + i3 + ", totalLength:" + i6);
            MTCommonLog.d(a(), "send head  length:" + i + ", headVersion:" + i2 + ", command:" + command + ", version:" + version + ", uid:" + jO + ", rid:" + rid + ", crc16:0, encrypt:" + encryptType);
            String strA = a();
            StringBuilder sb = new StringBuilder();
            sb.append("send body  length:");
            sb.append(length);
            MTCommonLog.d(strA, sb.toString());
            byte[] bArr3 = new byte[i6];
            System.arraycopy(bArr2, 0, bArr3, 0, 2);
            System.arraycopy(byteArray, 0, bArr3, 2, i);
            System.arraycopy(bArr, 0, bArr3, i5, length);
            return bArr3;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final MTProtocol a(Context context, byte[] bArr) {
        byte b;
        byte b2;
        byte[] bArrDecryptBytes;
        if (bArr == null) {
            return null;
        }
        try {
            MTProtocol mTProtocol = new MTProtocol();
            byte[] bArr2 = new byte[2];
            System.arraycopy(bArr, 0, bArr2, 0, 2);
            short s = ByteBuffer.wrap(bArr2).getShort();
            int i = (s >>> 14) & 1;
            int i2 = s & 16383;
            MTCommonLog.d(a(), "receive ahead length:2, encryption:" + ((s >>> 15) & 1) + ", expand:" + i + ", totalLength:" + i2);
            int i3 = i2 + (-2);
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, 2, bArr3, 0, i3);
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr3);
            if (i == 1) {
                b = byteBufferWrap.get();
                b2 = byteBufferWrap.get();
            } else {
                b = Ascii.DC4;
                b2 = 0;
            }
            int i4 = byteBufferWrap.get() ^ 90;
            int i5 = byteBufferWrap.get() ^ 90;
            long j = byteBufferWrap.getLong();
            byte b3 = b;
            long j2 = byteBufferWrap.getLong() ^ 6510615555426900570L;
            short s2 = byteBufferWrap.getShort();
            byte b4 = (i == 1 && b2 == 1) ? byteBufferWrap.get() : (byte) 0;
            mTProtocol.setCommand(i4);
            mTProtocol.setVersion(i5);
            mTProtocol.setRid(j2);
            MTCommonLog.d(a(), "receive head  length:" + ((int) b3) + ", headVersion:" + ((int) b2) + ", command:" + i4 + ", version:" + i5 + ", uid:" + (j ^ 6510615555426900570L) + ", rid:" + j2 + ", crc16:" + ((int) s2) + ", encrypt:" + ((int) b4));
            int i6 = (i2 - b3) - 2;
            byte[] bArr4 = new byte[i6];
            System.arraycopy(bArr3, b3, bArr4, 0, i6);
            String md5AesKey = AESUtil.getMd5AesKey(w.o(context));
            if (b4 == 0) {
                bArrDecryptBytes = AESUtil.decryptBytes(bArr4, md5AesKey);
            } else if (b4 == 1) {
                bArrDecryptBytes = AESUtil.decryptBytes(bArr4, md5AesKey, md5AesKey.substring(0, 16));
            } else if (b4 == 2) {
                bArrDecryptBytes = SM4Util.decryptBytes(bArr4, md5AesKey);
            } else {
                mTProtocol.setBody(bArr4);
                MTCommonLog.d(a(), "receive body  length:" + i6 + ", decryptBodyLength:" + bArr4.length);
                return mTProtocol;
            }
            bArr4 = bArrDecryptBytes;
            mTProtocol.setBody(bArr4);
            MTCommonLog.d(a(), "receive body  length:" + i6 + ", decryptBodyLength:" + bArr4.length);
            return mTProtocol;
        } catch (Throwable unused) {
            return null;
        }
    }
}
