package com.engagelab.privates.common;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.component.MTCommonReceiver;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.observer.MTObserver;
import com.engagelab.privates.core.api.MTProtocol;
import com.engagelab.privates.core.api.MTReporter;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.core.global.MTCoreGlobal;
import com.engagelab.privates.push.MTPush;
import com.engagelab.privates.push.api.PlatformTokenMessage;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.common.primitives.UnsignedBytes;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f0 extends b0 {
    public static volatile f0 f;
    public final ConcurrentMap<Long, PlatformTokenMessage> b = new ConcurrentHashMap();
    public boolean c = false;
    public final ConcurrentMap<Byte, PlatformTokenMessage> d = new ConcurrentHashMap();
    public Bundle e;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f330a;
        public final /* synthetic */ Bundle b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(f0 f0Var, Context context, Bundle bundle) {
            this.f330a = context;
            this.b = bundle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public void run() {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(this.f330a, MTPushConstants.RemoteWhat.ON_PLATFORM_TOKEN, this.b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean c() {
        String strA = a("ro.build.version.emui");
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        String lowerCase = strA.toLowerCase();
        return lowerCase.contains("magicui") || lowerCase.contains("magicos");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(Bundle bundle) {
        this.e = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void c(Context context) {
        this.c = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(Context context, String str) {
        try {
            if (TextUtils.equals(str, "CN")) {
                return;
            }
            MTCommonPrivatesApi.observer(context, (MTObserver) Class.forName("com.engagelab.privates.push.platform.google.MTGoogle").newInstance());
        } catch (Throwable unused) {
            MTCommonLog.d("MTPlatformBusiness", "not integrated google.aar");
            a(context, (byte) 8, 3001, 0, "");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(Context context, String str) {
        if (!TextUtils.equals(str, MTPushConstants.Manufacturer.HUAWEI) && (!TextUtils.equals(str, MTPushConstants.Manufacturer.HONOR) || d(context) || !c())) {
            MTCommonLog.d("MTPlatformBusiness", "not integrate huawei");
            return;
        }
        try {
            MTCommonPrivatesApi.observer(context, (MTObserver) Class.forName("com.engagelab.privates.push.platform.huawei.MTHuawei").newInstance());
        } catch (Throwable unused) {
            MTCommonLog.d("MTPlatformBusiness", "not integrated huawei.aar");
            a(context, (byte) 2, 3001, 0, "");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(Context context, String str) {
        if (TextUtils.equals(str, MTPushConstants.Manufacturer.HONOR)) {
            try {
                MTCommonPrivatesApi.observer(context, (MTObserver) Class.forName("com.engagelab.privates.push.platform.honor.MTHonor").newInstance());
            } catch (Throwable unused) {
                MTCommonLog.d("MTPlatformBusiness", "not integrated honor.aar");
                a(context, (byte) 7, 3001, 0, "");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(Context context, String str) {
        if (TextUtils.equals(str, MTPushConstants.Manufacturer.XIAOMI) || TextUtils.equals(str, MTPushConstants.Manufacturer.BLACKSHARK)) {
            try {
                MTCommonPrivatesApi.observer(context, (MTObserver) Class.forName("com.engagelab.privates.push.platform.mi.MTMi").newInstance());
            } catch (Throwable unused) {
                MTCommonLog.d("MTPlatformBusiness", "not integrated mi.aar");
                a(context, (byte) 1, 3001, 0, "");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(Context context, String str) {
        if (TextUtils.equals(str, MTPushConstants.Manufacturer.MEIZU)) {
            try {
                MTCommonPrivatesApi.observer(context, (MTObserver) Class.forName("com.engagelab.privates.push.platform.meizu.MTMeizu").newInstance());
            } catch (Throwable unused) {
                MTCommonLog.d("MTPlatformBusiness", "not integrated meizu.aar");
                a(context, (byte) 3, 3001, 0, "");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(Context context, String str) {
        if (TextUtils.equals(str, MTPushConstants.Manufacturer.OPPO) || TextUtils.equals(str, MTPushConstants.Manufacturer.REALME) || TextUtils.equals(str, MTPushConstants.Manufacturer.ONEPLUS)) {
            try {
                MTCommonPrivatesApi.observer(context, (MTObserver) Class.forName("com.engagelab.privates.push.platform.oppo.MTOppo").newInstance());
            } catch (Throwable unused) {
                MTCommonLog.d("MTPlatformBusiness", "not integrated oppo.aar");
                a(context, (byte) 4, 3001, 0, "");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(Context context, String str) {
        if (TextUtils.equals(str, MTPushConstants.Manufacturer.VIVO)) {
            try {
                MTCommonPrivatesApi.observer(context, (MTObserver) Class.forName("com.engagelab.privates.push.platform.vivo.MTVivo").newInstance());
            } catch (Throwable unused) {
                MTCommonLog.d("MTPlatformBusiness", "not integrated vivo.aar");
                a(context, (byte) 5, 3001, 0, "");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static f0 b() {
        if (f == null) {
            synchronized (f0.class) {
                f = new f0();
            }
        }
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void a(Context context) {
        MTCommonLog.d("MTPlatformBusiness", "on_tcp_connected init");
        try {
            int iB = m0.b(context);
            MTCommonLog.d("MTPlatformBusiness", "lastFrom:" + iB);
            if (iB > 0) {
                String strA = m0.a(context);
                if (!TextUtils.isEmpty(strA)) {
                    String[] strArrSplit = strA.split("_");
                    byte b = Byte.parseByte(strArrSplit[0]);
                    int iIntValue = Integer.valueOf(strArrSplit[1]).intValue();
                    int iIntValue2 = Integer.valueOf(strArrSplit[2]).intValue();
                    MTCommonLog.d("MTPlatformBusiness", "init lastPlatformNode platform=" + ((int) b) + " code=" + iIntValue + " m_code=" + iIntValue2);
                    a(context, b, iIntValue, iIntValue2, "");
                    m0.a(context, "");
                }
            }
        } catch (Throwable th) {
            MTCommonLog.w("MTPlatformBusiness", "lastFrom failed " + th.getMessage());
        }
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        if (TextUtils.isEmpty(lowerCase)) {
            return;
        }
        String countryCode = MTGlobal.getCountryCode(context);
        MTCommonLog.d("MTPlatformBusiness", "manufacturer is " + lowerCase + ", countryCode:" + countryCode);
        b(context);
        d(context, countryCode);
        e(context, lowerCase);
        f(context, lowerCase);
        g(context, lowerCase);
        c(context, lowerCase);
        h(context, lowerCase);
        i(context, lowerCase);
        j(context, lowerCase);
        MTCommonPrivatesApi.sendMessageToMainProcess(context, 3101, this.e);
    }

    public final void c(Context context, String str) {
        if (TextUtils.equals(str, MTPushConstants.Manufacturer.XIAOMI) || TextUtils.equals(str, MTPushConstants.Manufacturer.BLACKSHARK)) {
            try {
                MTCommonPrivatesApi.observer(context, (MTObserver) Class.forName("com.engagelab.privates.push.platform.mi.global.MTMiGlobal").newInstance());
            } catch (Throwable unused) {
                MTCommonLog.d("MTPlatformBusiness", "not integrated global mi.aar");
                a(context, (byte) 1, 3001, 0, "");
            }
        }
    }

    public final void b(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (notificationManager.getNotificationChannel("MTPush_Private") != null) {
            return;
        }
        notificationManager.createNotificationChannel(NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m("MTPush_Private", "Notification", 3));
    }

    public final boolean d(Context context) {
        try {
            Class<?> cls = Class.forName("com.hihonor.push.sdk.HonorPushClient");
            Object objInvoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(cls, new Object[0]);
            boolean zBooleanValue = ((Boolean) objInvoke.getClass().getDeclaredMethod("checkSupportHonorPush", Context.class).invoke(objInvoke, context)).booleanValue();
            MTCommonLog.d("MTPlatformBusiness", "honor available :" + zBooleanValue);
            return zBooleanValue;
        } catch (Throwable th) {
            MTCommonLog.d("MTPlatformBusiness", "isSupportHonorPush error:" + th);
            return false;
        }
    }

    public void f(Context context, Bundle bundle) {
        bundle.setClassLoader(PlatformTokenMessage.class.getClassLoader());
        PlatformTokenMessage platformTokenMessage = (PlatformTokenMessage) bundle.getParcelable("message");
        if (!this.c) {
            a(context, platformTokenMessage, true);
            MTCommonLog.w("MTPlatformBusiness", "stop send platformToken Login first, platformToken:" + platformTokenMessage.toString());
            return;
        }
        if (a(platformTokenMessage, bundle)) {
            MTCommonLog.w("MTPlatformBusiness", "stop send repetition platformToken, platformToken:" + platformTokenMessage.toString());
            return;
        }
        long rid = MTCoreGlobal.getRid();
        this.b.put(Long.valueOf(rid), platformTokenMessage);
        MTCommonLog.e("MTPlatformBusiness", "send platformToken, rid:" + rid + ", platformToken:" + platformTokenMessage.toString());
        MTProtocol threadName = new MTProtocol().setRid(rid).setCommand(27).setVersion(2).setBody(n0.a(platformTokenMessage.getPlatform(), platformTokenMessage.getToken(), platformTokenMessage.getRegion())).setThreadName(MTPush.f352a);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, threadName);
        MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.UPLOAD, bundle2);
    }

    public void c(Context context, Bundle bundle) {
        long rid = ((MTProtocol) bundle.getParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL)).getRid();
        if (this.b.containsKey(Long.valueOf(rid))) {
            PlatformTokenMessage platformTokenMessage = this.b.get(Long.valueOf(rid));
            this.b.remove(Long.valueOf(rid));
            byte platform = platformTokenMessage.getPlatform();
            String token = platformTokenMessage.getToken();
            MTCommonLog.d("MTPlatformBusiness", "onPlatformTokenFailed, rid:" + rid + ", platformToken:" + platformTokenMessage.toString());
            if (TextUtils.equals(token, l0.b(context, platform))) {
                MTCommonLog.d("MTPlatformBusiness", "no need update platform state");
                a(context, platform, 3006, 0, token);
                a(context, platformTokenMessage, true);
                return;
            }
            byte platformState = (byte) (MTCoreGlobal.getPlatformState(context) | platform);
            byte b = (byte) (platform == 8 ? platformState & 223 : platformState | UnsignedBytes.MAX_POWER_OF_TWO);
            MTCommonLog.d("MTPlatformBusiness", "set platform state:" + ((int) b));
            MTCoreGlobal.setPlatformState(context, b);
            a(context, platform, 3006, 0, token);
            a(context, platformTokenMessage, true);
        }
    }

    public void b(Context context, Bundle bundle) {
        try {
            byte b = bundle.getByte(MTPushConstants.PlatformNode.KEY_PLATFORM);
            int i = bundle.getInt("code");
            int i2 = bundle.getInt(MTPushConstants.PlatformNode.KEY_M_CODE);
            int i3 = bundle.getInt("type");
            int i4 = bundle.getInt("from");
            String strB = l0.b(context, b);
            MTCommonLog.d("MTPlatformBusiness", "onPlatformNode platform=" + ((int) b) + " code=" + i + " m_code=" + i2 + " mToken=" + strB + " type=" + i3 + " currentFrom=" + i4);
            if (3900 == i3) {
                int iB = m0.b(context);
                int i5 = iB ^ i4;
                if (i5 == 3) {
                    MTCommonLog.d("MTPlatformBusiness", "onTokenFailed, all method obtain orFrom=" + i5 + " lastFrom=" + iB + " currentFrom=" + i4);
                    a(context, b, 3005, i2, strB);
                    m0.a(context, 0);
                    m0.a(context, "");
                } else {
                    m0.a(context, i4);
                    m0.a(context, ((int) b) + "_" + i + "_" + i2);
                    MTCommonLog.d("MTPlatformBusiness", "oneTokenFailed, one method obtain, orFrom=" + i5 + " lastFrom=" + iB + " currentFrom=" + i4);
                }
            } else {
                a(context, b, i, i2, strB);
                if (3901 == i3) {
                    m0.a(context, 0);
                    m0.a(context, "");
                }
            }
        } catch (Throwable th) {
            MTCommonLog.w("MTPlatformBusiness", "reportPlatformNode failed " + th.getMessage());
        }
    }

    public void e(Context context, Bundle bundle) {
        MTCommonReceiver commonReceiver;
        PlatformTokenMessage platformTokenMessage = (PlatformTokenMessage) bundle.getParcelable("message");
        if (platformTokenMessage == null || (commonReceiver = MTGlobal.getCommonReceiver(context)) == null) {
            return;
        }
        String token = platformTokenMessage.getToken();
        l0.a(context, platformTokenMessage.getPlatform(), token);
        MTCommonLog.e("MTPlatformBusiness", "processMainToken:" + token);
        commonReceiver.onPlatformToken(context, platformTokenMessage);
        MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTPushConstants.RemoteWhat.ON_PLATFORM_TOKEN, bundle);
    }

    public void d(Context context, Bundle bundle) {
        MTProtocol mTProtocol = (MTProtocol) bundle.getParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL);
        long rid = mTProtocol.getRid();
        short s = ByteBuffer.wrap(mTProtocol.getBody()).getShort();
        if (!this.b.containsKey(Long.valueOf(rid))) {
            MTCommonLog.d("MTPlatformBusiness", "onPlatformTokenFailed, rid:" + rid + ", internal error");
            return;
        }
        PlatformTokenMessage platformTokenMessage = this.b.get(Long.valueOf(rid));
        this.b.remove(Long.valueOf(rid));
        byte platform = platformTokenMessage.getPlatform();
        String token = platformTokenMessage.getToken();
        if (s != 0) {
            MTCommonLog.d("MTPlatformBusiness", "onPlatformTokenFailed, rid:" + rid + ", code:" + ((int) s));
            a(context, platform, 3006, s, token);
            a(context, platformTokenMessage, false);
            return;
        }
        MTCommonLog.d("MTPlatformBusiness", "onPlatformTokenSuccess, rid:" + rid + ", platformToken:" + platformTokenMessage.toString());
        if (TextUtils.equals(token, l0.b(context, platform))) {
            MTCommonLog.d("MTPlatformBusiness", "no need update platform state");
            a(context, platform, MTPushConstants.PlatformNode.CODE_UPLOAD_TOKEN_SUCCESS, 0, token);
            return;
        }
        l0.a(context, platform, token);
        byte platformState = (byte) (MTCoreGlobal.getPlatformState(context) | platform);
        byte b = (byte) (platform == 8 ? platformState | 32 : platformState & 127);
        MTCommonLog.d("MTPlatformBusiness", "set platform state:" + ((int) b));
        MTCoreGlobal.setPlatformState(context, b);
        a(context, platform, MTPushConstants.PlatformNode.CODE_UPLOAD_TOKEN_SUCCESS, 0, token);
    }

    public static String a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str2 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
            MTCommonLog.d("MTPlatformBusiness", "get " + str + " version is:" + str2);
            return str2;
        } catch (Throwable th) {
            MTCommonLog.e("MTPlatformBusiness", " get " + str + " wrong error:" + th.getMessage());
            return "";
        }
    }

    public final boolean a(PlatformTokenMessage platformTokenMessage, Bundle bundle) {
        PlatformTokenMessage platformTokenMessage2 = this.d.get(Byte.valueOf(platformTokenMessage.getPlatform()));
        if (platformTokenMessage2 != null) {
            if (platformTokenMessage2.getToken().equals(platformTokenMessage.getToken())) {
                return true;
            }
            boolean z = bundle.getBoolean("is_repetition_send", false);
            if (z) {
                MTCommonLog.e("MTPlatformBusiness", "isRepetitionToken is_repetition_send:" + z);
                return true;
            }
        }
        this.d.put(Byte.valueOf(platformTokenMessage.getPlatform()), platformTokenMessage);
        return false;
    }

    public final String b(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, str);
        } catch (Throwable th) {
            MTCommonLog.w("MTPlatformBusiness", "getPropertiesStringValue failed " + th.getMessage());
            return "";
        }
    }

    public final void a(Context context, PlatformTokenMessage platformTokenMessage, boolean z) {
        PlatformTokenMessage platformTokenMessage2 = this.d.get(Byte.valueOf(platformTokenMessage.getPlatform()));
        if (platformTokenMessage2 != null) {
            if (platformTokenMessage2.getToken().equals(platformTokenMessage.getToken())) {
                this.d.remove(Byte.valueOf(platformTokenMessage.getPlatform()));
                if (z) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("message", platformTokenMessage);
                    bundle.putBoolean("is_repetition_send", true);
                    MTCommonPrivatesApi.postMessageDelayed(context, MTPush.f352a, new a(this, context, bundle), 1000L);
                    return;
                }
                return;
            }
            return;
        }
        MTCommonLog.e("MTPlatformBusiness", "cache not has platformToken, platformToken:" + platformTokenMessage.toString());
    }

    public final void a(Context context, byte b, int i, int i2, String str) {
        try {
            byte platformState = MTCoreGlobal.getPlatformState(context);
            String countryCode = MTGlobal.getCountryCode(context);
            String str2 = Build.PRODUCT;
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            String str3 = Build.VERSION.RELEASE;
            String strA = a(context, lowerCase);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MTPushConstants.PlatformNode.KEY_PLATFORM, (int) b);
            jSONObject.put("code", i);
            jSONObject.put("m_code", i2);
            jSONObject.put("m_flag", (int) platformState);
            jSONObject.put("m_token", str);
            jSONObject.put("country_code", countryCode);
            jSONObject.put("product", str2);
            jSONObject.put("manufacturer", lowerCase);
            jSONObject.put("system_version", str3);
            jSONObject.put("m_system_version", strA);
            MTReporter content = new MTReporter().setType("platform_node").setContent(jSONObject.toString());
            Bundle bundle = new Bundle();
            bundle.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, content);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.REPORT, bundle);
        } catch (Throwable th) {
            MTCommonLog.w("MTPlatformBusiness", "reportPlatformNode failed " + th.getMessage());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(Context context, String str) {
        str.hashCode();
        switch (str) {
            case "blackshark":
                return b(context, "ro.joyui.ui.version.code");
            case "oneplus":
                String strB = b(context, "ro.rom.version");
                return TextUtils.isEmpty(strB) ? b(context, "ro.build.version.opporom") : strB;
            case "huawei":
                String strB2 = b(context, "ro.build.version.emui");
                return TextUtils.isEmpty(strB2) ? b(context, "hw_sc.build.platform.version") : strB2;
            case "realme":
                return b(context, "ro.build.version.realmeui");
            case "xiaomi":
                return b(context, "ro.miui.ui.version.name");
            case "oppo":
                return b(context, "ro.build.version.opporom");
            case "vivo":
                return b(context, "ro.vivo.os.build.display.id");
            case "honor":
                return b(context, "ro.build.version.magic");
            case "meizu":
                return b(context, "ro.flyme.version.id");
            default:
                return "";
        }
    }
}
