package com.engagelab.privates.common;

import android.content.Context;
import android.os.Build;
import com.engagelab.privates.common.cache.MTCommonConfig;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.observer.MTObservable;
import com.engagelab.privates.common.observer.MTObserver;
import com.engagelab.privates.common.utils.DeviceUtil;
import com.engagelab.privates.common.utils.StringUtil;
import com.engagelab.privates.common.utils.SystemUtil;
import com.engagelab.privates.core.api.Outputer;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes14.dex */
public class x {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(Context context, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        short s = byteBufferWrap.getShort();
        w.a(context, (int) s);
        if (s == 0) {
            int i = byteBufferWrap.getInt();
            byteBufferWrap.getShort();
            StringUtil.getTlv2(byteBufferWrap);
            int i2 = byteBufferWrap.getInt();
            byteBufferWrap.get();
            w.c(context, i);
            w.a(context, i2);
            MTCommonLog.d("MTCoreProtocol", "onLoginSuccess seedId:" + i + ", serverTime:" + i2);
        } else if (s != 108) {
            MTCommonLog.e("MTCoreProtocol", "login failed code:" + ((int) s) + ", message:" + StringUtil.getTlv2(byteBufferWrap));
        } else {
            w.b(context, 0L);
            w.c(context, "");
            w.b(context, "");
            w.c(context, 0);
            w.a(context, 0L);
            MTCommonLog.e("MTCoreProtocol", "onLoginFailed, will re-register");
        }
        return s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int b(Context context, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        short s = byteBufferWrap.getShort();
        w.b(context, (int) s);
        if (s != 0) {
            MTCommonLog.e("MTCoreProtocol", "onRegisterFailed code:" + ((int) s) + ", message:" + StringUtil.getTlv2(byteBufferWrap));
        } else {
            long j = byteBufferWrap.getLong();
            String tlv2 = StringUtil.getTlv2(byteBufferWrap);
            String tlv22 = StringUtil.getTlv2(byteBufferWrap);
            w.b(context, j);
            w.c(context, tlv22);
            w.b(context, tlv2);
            MTCommonLog.d("MTCoreProtocol", "onRegisterSuccess uid:" + j + ", registrationId:" + tlv22 + ", password:" + tlv2);
        }
        return s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] c(Context context) {
        Outputer outputer = new Outputer(1);
        outputer.writeU8(c());
        return outputer.toByteArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] d(Context context) {
        String md5 = StringUtil.toMD5(w.e(context));
        String strA = a();
        String appKey = MTGlobal.getAppKey(context);
        short sC = c();
        byte bF = w.f(context);
        int networkType = MTGlobal.getNetworkType();
        String deviceId = MTCommonConfig.getDeviceId(context);
        String countryCode = MTGlobal.getCountryCode(context);
        MTCommonLog.e("MTCoreProtocol", "login with uid:" + w.o(context) + ", registrationId:" + w.h(context) + ", platform:" + ((int) bF));
        byte[] bytes = md5.getBytes();
        byte[] bytes2 = strA.getBytes();
        byte[] bytes3 = appKey.getBytes();
        byte[] bytes4 = deviceId.getBytes();
        byte[] bytes5 = "".getBytes();
        byte[] bytes6 = countryCode.getBytes();
        byte[] bytes7 = "".getBytes();
        int length = bytes.length;
        int length2 = bytes2.length;
        int length3 = bytes3.length;
        int length4 = bytes4.length;
        Outputer outputer = new Outputer(length + 4 + length2 + length3 + 7 + length4 + bytes5.length + bytes6.length + bytes7.length);
        outputer.writeU8(97);
        outputer.writeU8(0);
        outputer.writeU16(0);
        outputer.writeByteArrayIncludeLength(bytes);
        outputer.writeByteArrayIncludeLength(bytes2);
        outputer.writeByteArrayIncludeLength(bytes3);
        outputer.writeU8(0);
        outputer.writeU32(sC);
        outputer.writeU8(bF);
        outputer.writeU8(networkType);
        outputer.writeByteArrayIncludeLength(bytes4);
        outputer.writeByteArrayIncludeLength(bytes5);
        outputer.writeByteArrayIncludeLength(bytes6);
        outputer.writeByteArrayIncludeLength(bytes7);
        return outputer.toByteArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] e(Context context) {
        w.b(context, 0L);
        w.c(context, "");
        w.b(context, "");
        w.c(context, 0);
        w.a(context, 0L);
        String str = " $$ $$" + context.getPackageName() + "$$" + MTGlobal.getAppKey(context);
        String appVersionName = MTGlobal.getAppVersionName(context);
        String strA = a(context);
        String strB = b(context);
        short sC = c();
        MTCommonLog.d("MTCoreProtocol", "register with clientInfo:" + strA + ", deviceInfo:" + strB);
        byte[] bytes = str.getBytes();
        byte[] bytes2 = appVersionName.getBytes();
        byte[] bytes3 = strA.getBytes();
        byte[] bytes4 = strB.getBytes();
        byte[] bytes5 = "".getBytes();
        int length = bytes.length;
        int length2 = bytes2.length;
        Outputer outputer = new Outputer(length + length2 + bytes3.length + 1 + bytes4.length + 4 + bytes5.length);
        outputer.writeByteArrayIncludeLength(bytes);
        outputer.writeByteArrayIncludeLength(bytes2);
        outputer.writeByteArrayIncludeLength(bytes3);
        outputer.writeU8(0);
        outputer.writeByteArrayIncludeLength(bytes4);
        outputer.writeU32(sC);
        outputer.writeByteArrayIncludeLength(bytes5);
        return outputer.toByteArray();
    }

    public static short c() {
        int sdkPriority;
        int i = 0;
        for (MTObserver mTObserver : MTObservable.getInstance().observeQueue) {
            if (mTObserver.isSdk() && i < (sdkPriority = mTObserver.getSdkPriority())) {
                i = sdkPriority;
            }
        }
        short sdkFlag = 0;
        for (int i2 = 0; i2 <= i; i2++) {
            for (MTObserver mTObserver2 : MTObservable.getInstance().observeQueue) {
                if (mTObserver2.isSdk() && mTObserver2.getSdkPriority() == i2) {
                    sdkFlag = (short) (sdkFlag | mTObserver2.getSdkFlag());
                }
            }
        }
        return sdkFlag;
    }

    public static String b(Context context) {
        return "0$$" + MTGlobal.getDeviceId(context) + "$$ $$ $$ $$ ";
    }

    public static String b() {
        int sdkPriority;
        int i = 0;
        for (MTObserver mTObserver : MTObservable.getInstance().observeQueue) {
            if (mTObserver.isSdk() && i < (sdkPriority = mTObserver.getSdkPriority())) {
                i = sdkPriority;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 <= i; i2++) {
            for (MTObserver mTObserver2 : MTObservable.getInstance().observeQueue) {
                if (mTObserver2.isSdk() && mTObserver2.getSdkPriority() == i2) {
                    sb.append(mTObserver2.getSdkVersion());
                    sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                }
            }
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static String a(Context context) {
        return Build.VERSION.RELEASE.toLowerCase() + "," + Build.VERSION.SDK_INT + "$$" + Build.MODEL.toLowerCase() + "$$$$" + Build.DEVICE.toLowerCase() + "$$" + MTGlobal.getAppChannel(context) + "$$" + b() + "$$" + SystemUtil.isSystemApp(context) + "$$" + DeviceUtil.getResolution(context) + "$$" + Build.MANUFACTURER.toLowerCase();
    }

    public static String a() {
        int sdkPriority;
        int i = 0;
        for (MTObserver mTObserver : MTObservable.getInstance().observeQueue) {
            if (mTObserver.isSdk() && i < (sdkPriority = mTObserver.getSdkPriority())) {
                i = sdkPriority;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 1; i2 <= i; i2++) {
            for (MTObserver mTObserver2 : MTObservable.getInstance().observeQueue) {
                if (mTObserver2.isSdk() && mTObserver2.getSdkPriority() == i2) {
                    String[] strArrSplit = mTObserver2.getSdkVersion().split("\\.");
                    sb.append((Integer.parseInt(strArrSplit[0]) << 16) + (Integer.parseInt(strArrSplit[1]) << 8) + Integer.parseInt(strArrSplit[2]));
                }
            }
        }
        return sb.toString();
    }
}
