package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadSystemException;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.wallet.WalletConstants;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.location.LocationCallback;
import com.just.agentweb.DefaultWebClient;
import com.onesignal.OneSignal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import o.C57721ynk;
import o.C57733ynw;
import o.C57791ypA;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class OSUtils {
    public static final int[] OLrzqt = {401, 402, 403, 404, WalletConstants.ERROR_CODE_INVALID_TRANSACTION};
    public static int copydefault = 3;

    public static boolean AYXKKw() {
        return true;
    }

    public static boolean AhwBna() {
        return true;
    }

    private static boolean opaqueHasClass(Class<?> cls) {
        return true;
    }

    public static boolean valueOf() {
        return true;
    }

    /* JADX INFO: loaded from: classes17.dex */
    public enum SchemaType {
        DATA("data"),
        HTTPS("https"),
        HTTP("http");

        private final String text;

        SchemaType(String str) {
            this.text = str;
        }

        public static SchemaType fromString(String str) {
            for (SchemaType schemaType : values()) {
                if (schemaType.text.equalsIgnoreCase(str)) {
                    return schemaType;
                }
            }
            return null;
        }
    }

    public static boolean AEQbTJ(int i) {
        for (int i2 : OLrzqt) {
            if (i == i2) {
                return false;
            }
        }
        return true;
    }

    public int EZpvd(Context context, String str) {
        Integer numFARcdN;
        int iUzCIH = uzCIH();
        try {
            UUID.fromString(str);
            if ("b2f7f966-d8cc-11e4-bed1-df8f05be55ba".equals(str) || "5eb5a37e-b458-11e3-ac11-000c2940e62c".equals(str)) {
                OneSignal.KWHzl(OneSignal.LOG_LEVEL.ERROR, "OneSignal Example AppID detected, please update to your app's id found on OneSignal.com");
            }
            int iIntValue = 1;
            if (iUzCIH == 1 && (numFARcdN = fARcdN()) != null) {
                iIntValue = numFARcdN.intValue();
            }
            Integer numKWHzl = KWHzl(context);
            return numKWHzl != null ? numKWHzl.intValue() : iIntValue;
        } catch (Throwable th) {
            OneSignal.OLrzqt(OneSignal.LOG_LEVEL.FATAL, "OneSignal AppId format is invalid.\nExample: 'b2f7f966-d8cc-11e4-bed1-df8f05be55ba'\n", th);
            return -999;
        }
    }

    public static boolean OLrzqt() {
        try {
            return opaqueHasClass(FirebaseMessaging.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean AEQbTJ() {
        try {
            return opaqueHasClass(LocationListener.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean EZpvd() {
        try {
            return opaqueHasClass(HuaweiApiAvailability.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean gEmmrt() {
        try {
            return opaqueHasClass(HmsInstanceId.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean KWHzl() {
        try {
            return opaqueHasClass(AGConnectServicesConfig.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean djBIcL() {
        try {
            return opaqueHasClass(LocationCallback.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean copydefault() {
        return KWHzl() && gEmmrt();
    }

    public Integer fARcdN() {
        if (OLrzqt()) {
            return null;
        }
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.FATAL, "The Firebase FCM library is missing! Please make sure to include it in your project.");
        return -4;
    }

    public final Integer KWHzl(Context context) {
        boolean zAhwBna = AhwBna();
        boolean zAYXKKw = AYXKKw();
        if (!zAhwBna && !zAYXKKw) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.FATAL, "Could not find the Android Support Library. Please make sure it has been correctly added to your project.");
            return -3;
        }
        if (!zAhwBna || !zAYXKKw) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
            return -5;
        }
        if (Build.VERSION.SDK_INT < 26 || copydefault(context) < 26 || valueOf()) {
            return null;
        }
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
        return -5;
    }

    public static boolean KWHzl(@NonNull String str) {
        PackageInfo packageInfoOLrzqt;
        C57733ynw c57733ynwEZpvd = C57791ypA.Companion.EZpvd(OneSignal.AEQbTJ, str, 128);
        if (c57733ynwEZpvd.EZpvd() && (packageInfoOLrzqt = c57733ynwEZpvd.OLrzqt()) != null) {
            return packageInfoOLrzqt.applicationInfo.enabled;
        }
        return false;
    }

    public static boolean AkhnZx() {
        return KWHzl("com.google.android.gms");
    }

    public static boolean isConnected() {
        try {
            return HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(OneSignal.AEQbTJ) == 0;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof DeadSystemException) {
                return false;
            }
            throw e;
        }
    }

    public static boolean values() {
        return KWHzl("com.huawei.hwid");
    }

    public final boolean getFieldNames() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final boolean getNewProxyInstance() {
        if (EZpvd() && copydefault()) {
            return isConnected();
        }
        return false;
    }

    public final boolean hDKMBd() {
        if (OLrzqt()) {
            return AkhnZx();
        }
        return false;
    }

    public int uzCIH() {
        if (getFieldNames()) {
            return 2;
        }
        boolean newProxyInstance = getNewProxyInstance();
        boolean zHDKMBd = hDKMBd();
        if (zHDKMBd && newProxyInstance) {
            Context context = OneSignal.AEQbTJ;
            return (context == null || !AEQbTJ(context, "com.onesignal.preferHMS")) ? 1 : 13;
        }
        if (zHDKMBd) {
            return 1;
        }
        if (newProxyInstance) {
            return 13;
        }
        return (!AkhnZx() && values()) ? 13 : 1;
    }

    public static boolean DbNXlk() {
        return new OSUtils().uzCIH() == 1;
    }

    public static boolean fetchVPNInfo() {
        return new OSUtils().uzCIH() == 2;
    }

    public static boolean fJNWhG() {
        return new OSUtils().uzCIH() == 13;
    }

    public Integer iwGUEr() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) OneSignal.AEQbTJ.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1 || type == 9) {
            return 0;
        }
        return 1;
    }

    public String ejfBZ() {
        try {
            String networkOperatorName = ((TelephonyManager) OneSignal.AEQbTJ.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getNetworkOperatorName();
            if ("".equals(networkOperatorName)) {
                return null;
            }
            return networkOperatorName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static Bundle OLrzqt(Context context) {
        ApplicationInfo applicationInfoKWHzl = C57721ynk.Companion.KWHzl(context);
        if (applicationInfoKWHzl == null) {
            return null;
        }
        return applicationInfoKWHzl.metaData;
    }

    public static boolean AEQbTJ(Context context, String str) {
        Bundle bundleOLrzqt = OLrzqt(context);
        if (bundleOLrzqt != null) {
            return bundleOLrzqt.getBoolean(str);
        }
        return false;
    }

    public static String OLrzqt(Context context, String str) {
        Bundle bundleOLrzqt = OLrzqt(context);
        if (bundleOLrzqt != null) {
            return bundleOLrzqt.getString(str);
        }
        return null;
    }

    public static String AEQbTJ(Context context, String str, String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : str2;
    }

    public static boolean EZpvd(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean AEQbTJ(Context context) {
        try {
            return NotificationManagerCompat.from(OneSignal.AEQbTJ).areNotificationsEnabled();
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean fIwbmz() {
        return Thread.currentThread().equals(Looper.getMainLooper().getThread());
    }

    public static void EZpvd(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public static void copydefault(Runnable runnable, int i) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, i);
    }

    public static int copydefault(Context context) {
        ApplicationInfo applicationInfoKWHzl = C57721ynk.Companion.KWHzl(context);
        if (applicationInfoKWHzl == null) {
            return 15;
        }
        return applicationInfoKWHzl.targetSdkVersion;
    }

    public static boolean OLrzqt(String str) {
        return (str == null || str.matches("^[0-9]")) ? false : true;
    }

    public static Uri KWHzl(Context context, String str) {
        int identifier;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if (OLrzqt(str) && (identifier = resources.getIdentifier(str, "raw", packageName)) != 0) {
            return Uri.parse("android.resource://" + packageName + "/" + identifier);
        }
        int identifier2 = resources.getIdentifier("onesignal_default_sound", "raw", packageName);
        if (identifier2 == 0) {
            return null;
        }
        return Uri.parse("android.resource://" + packageName + "/" + identifier2);
    }

    public static long[] EZpvd(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            Object objOpt = jSONObject.opt("vib_pt");
            if (objOpt instanceof String) {
                jSONArray = new JSONArray((String) objOpt);
            } else {
                jSONArray = (JSONArray) objOpt;
            }
            long[] jArr = new long[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                jArr[i] = jSONArray.optLong(i);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void OLrzqt(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void copydefault(@NonNull String str) {
        KWHzl(Uri.parse(str.trim()));
    }

    public static void KWHzl(@NonNull Uri uri) {
        OneSignal.AEQbTJ.startActivity(OLrzqt(uri));
    }

    public static Intent OLrzqt(@NonNull Uri uri) {
        Intent intentMakeMainSelectorActivity;
        SchemaType schemaTypeFromString = uri.getScheme() != null ? SchemaType.fromString(uri.getScheme()) : null;
        if (schemaTypeFromString == null) {
            schemaTypeFromString = SchemaType.HTTP;
            if (!uri.toString().contains("://")) {
                uri = Uri.parse(DefaultWebClient.HTTP_SCHEME + uri.toString());
            }
        }
        if (AnonymousClass2.copydefault[schemaTypeFromString.ordinal()] == 1) {
            intentMakeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            intentMakeMainSelectorActivity.setData(uri);
        } else {
            intentMakeMainSelectorActivity = new Intent("android.intent.action.VIEW", uri);
        }
        intentMakeMainSelectorActivity.addFlags(268435456);
        return intentMakeMainSelectorActivity;
    }

    /* JADX INFO: renamed from: com.onesignal.OSUtils$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[SchemaType.values().length];
            copydefault = iArr;
            try {
                iArr[SchemaType.DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                copydefault[SchemaType.HTTPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                copydefault[SchemaType.HTTP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static <T> Set<T> AuCTel() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static Set<String> copydefault(JSONArray jSONArray) throws JSONException {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    public static boolean KWHzl(Activity activity, int i) {
        try {
            return (activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).configChanges & i) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Bundle AEQbTJ(@NonNull String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
            return bundle;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean djBIcL(@Nullable String str) {
        if (str != null) {
            return false;
        }
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, "OneSignal was not initialized, ensure to always initialize OneSignal from the onCreate of your Application class.");
        return true;
    }

    public static int AEQbTJ(int i, int i2) {
        return new Random().nextInt((i2 + 1) - i) + i;
    }

    public static Throwable AEQbTJ(@NonNull Throwable th) {
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        return th;
    }

    public static String OLrzqt(@NonNull Throwable th) {
        return AEQbTJ(th).getMessage();
    }

    public static void KWHzl(@NonNull Thread thread) {
        boolean z = false;
        while (!z) {
            try {
                thread.start();
                z = true;
            } catch (OutOfMemoryError unused) {
                try {
                    Thread.sleep(250L);
                } catch (InterruptedException unused2) {
                }
            }
        }
    }
}
