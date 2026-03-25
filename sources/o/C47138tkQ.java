package o;

import android.icu.text.SimpleDateFormat;
import android.icu.util.TimeZone;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Build;
import android.provider.Settings;
import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.okrisk.signals.utils.SystemUtils$1;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.tkQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47138tkQ {
    public static final C47138tkQ EZpvd = new C47138tkQ();
    public static final int KWHzl;
    public static StateListAnimator copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getNewProxyInstance() {
        return "Android";
    }

    private C47138tkQ() {
    }

    /* JADX INFO: renamed from: o.tkQ$StateListAnimator */
    public static final class StateListAnimator {
        public final java.lang.String AEQbTJ;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.AEQbTJ(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new StateListAnimator(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GPUInfo(name=" + this.OLrzqt + ", vendor=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.AEQbTJ = str2;
        }
    }

    static {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new SystemUtils$1(null), 2, null);
        KWHzl = 8;
    }

    public final java.lang.String copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            java.lang.String str = context.getApplicationInfo().sourceDir;
            if (str != null && str.length() != 0) {
                java.io.File file = new java.io.File(str);
                return (file.exists() && file.isFile()) ? java.lang.String.valueOf(file.length()) : "";
            }
            return "";
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public final int isConnected() {
        return Settings.Global.getInt(C32979mnm.EZpvd.OLrzqt().getApplicationContext().getContentResolver(), "development_settings_enabled", 0);
    }

    public final int AEQbTJ() {
        try {
            return Settings.Global.getInt(C32979mnm.EZpvd.OLrzqt().getApplicationContext().getContentResolver(), "airplane_mode_on", 0);
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public final int zuBGHE() {
        try {
            return Settings.Global.getInt(C32979mnm.EZpvd.OLrzqt().getApplicationContext().getContentResolver(), "stay_on_while_plugged_in", 0);
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public final int copydefault() {
        try {
            return Settings.Global.getInt(C32979mnm.EZpvd.OLrzqt().getApplicationContext().getContentResolver(), "boot_count", 0);
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public final java.lang.String getFieldNames() {
        java.lang.String string;
        try {
            string = Settings.Global.getString(C32979mnm.EZpvd.OLrzqt().getApplicationContext().getContentResolver(), "http_proxy");
        } catch (java.lang.Exception unused) {
        }
        return string == null ? "" : string;
    }

    public final int QbewEr() {
        try {
            java.lang.String string = Settings.Global.getString(C32979mnm.EZpvd.OLrzqt().getApplicationContext().getContentResolver(), "http_proxy");
            if (string != null && string.length() != 0) {
                return 1;
            }
            java.lang.String property = java.lang.System.getProperty("http.proxyHost");
            java.lang.String str = "";
            if (property == null) {
                property = "";
            }
            java.lang.String property2 = java.lang.System.getProperty("http.proxyPort");
            if (property2 != null) {
                str = property2;
            }
            if (property.length() <= 0) {
                if (str.length() <= 0) {
                    return 0;
                }
            }
            return 1;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public final int QVAiDq() {
        try {
            java.io.File parentFile = new java.io.File(C32979mnm.EZpvd.OLrzqt().getApplicationContext().getApplicationInfo().dataDir).getParentFile();
            if (parentFile != null && parentFile.exists()) {
                if (parentFile.canRead()) {
                    return 1;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return 0;
    }

    public final int EZpvd() {
        try {
            return Settings.Secure.getInt(C32979mnm.EZpvd.OLrzqt().getApplicationContext().getContentResolver(), "accessibility_enabled", 0);
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public final java.util.List<java.lang.String> fJNWhG() {
        try {
            java.lang.String string = Settings.Secure.getString(C32979mnm.EZpvd.OLrzqt().getApplicationContext().getContentResolver(), "enabled_accessibility_services");
            if (string == null) {
                string = "";
            }
            java.lang.String str = string;
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
                return yDY.AhwBna();
            }
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listSplit$default) {
                if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) obj)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (java.lang.Exception unused) {
            return yDY.AhwBna();
        }
    }

    public final int RJOkX() {
        try {
            java.lang.Object systemService = C32979mnm.EZpvd.OLrzqt().getApplicationContext().getSystemService("bluetooth");
            android.bluetooth.BluetoothManager bluetoothManager = systemService instanceof android.bluetooth.BluetoothManager ? (android.bluetooth.BluetoothManager) systemService : null;
            return (bluetoothManager != null ? bluetoothManager.getAdapter() : null) != null ? 1 : 0;
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    public final java.lang.String KWHzl() {
        java.lang.Object systemService = C32979mnm.EZpvd.OLrzqt().getSystemService("sensor");
        Intrinsics.copydefault(systemService, "");
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) systemService;
        return "{\"accelerometerAvailability\": \"" + (sensorManager.getDefaultSensor(1) != null ? 0 : -2) + "\", \"gyroscopeAvailability\": \"" + (sensorManager.getDefaultSensor(4) != null ? 0 : -2) + "\", \"gravitySensorAvailability\": \"" + (sensorManager.getDefaultSensor(9) != null ? 0 : -2) + "\", \"magneticFieldAvailability\": \"" + (sensorManager.getDefaultSensor(2) == null ? -2 : 0) + "\"}";
    }

    public final java.lang.String gHZMYf() {
        java.lang.String str = android.os.Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String AxsJAY() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String AwvSrB() {
        java.lang.String str = android.os.Build.BOARD;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String sSMYrx() {
        java.lang.String str = android.os.Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String OcIXYQ() {
        java.lang.String str = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String AuCTelauCTel() {
        java.lang.String str = Build.VERSION.SECURITY_PATCH;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String QOLQEE() {
        return android.os.Build.CPU_ABI2 + android.os.Build.CPU_ABI;
    }

    public final java.lang.String AkhnZx() {
        java.lang.String str = android.os.Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String uzCIH() {
        java.lang.String str = Build.VERSION.INCREMENTAL;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String gEmmrt() {
        java.lang.String str = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String valueOf() {
        java.lang.String str = android.os.Build.TAGS;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String iwGUEr() {
        java.lang.String property = java.lang.System.getProperty("os.version");
        return property == null ? "" : property;
    }

    public final java.lang.String fIwbmz() {
        java.lang.String str = android.os.Build.HARDWARE;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String ejfBZ() {
        java.lang.String str = android.os.Build.HOST;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String DbNXlk() {
        java.lang.String str = android.os.Build.DISPLAY;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String zLjUOn() {
        try {
            java.lang.String radioVersion = android.os.Build.getRadioVersion();
            Intrinsics.copydefault((java.lang.Object) radioVersion);
            return radioVersion;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public final java.lang.String AubY() {
        java.lang.String str = android.os.Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String wlaJM() {
        java.lang.String str = android.os.Build.SERIAL;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String fetchVPNInfo() {
        java.lang.String str = android.os.Build.DEVICE;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String QKVWgx() {
        return java.lang.String.valueOf(java.lang.System.currentTimeMillis());
    }

    public final java.lang.String hDKMBd() {
        java.lang.String string = java.util.Locale.getDefault().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String ORxRYg() {
        return java.lang.String.valueOf(Build.VERSION.SDK_INT);
    }

    public final java.lang.String AYXKKw() {
        return java.lang.String.valueOf(java.lang.System.currentTimeMillis() - android.os.SystemClock.elapsedRealtime());
    }

    public final java.lang.String QfsBiF() {
        return java.lang.String.valueOf(android.os.SystemClock.uptimeMillis());
    }

    public final java.lang.String DTwDnp() {
        java.lang.String id = TimeZone.getDefault().getID();
        Intrinsics.checkNotNullExpressionValue(id, "");
        return id;
    }

    public final java.lang.String djBIcL() {
        return TimeZone.getDefault().inDaylightTime(new Date()) ? "1" : "0";
    }

    public final java.lang.String EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String strValueOf = C34703nhO.valueOf(context);
        return strValueOf == null ? "" : strValueOf;
    }

    public final int valueOf(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C34703nhO.copydefault(context);
    }

    public final java.lang.String zsXlph() {
        java.lang.String displayLanguage = java.util.Locale.getDefault().getDisplayLanguage();
        Intrinsics.checkNotNullExpressionValue(displayLanguage, "");
        return displayLanguage;
    }

    public final java.lang.String OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String strAEQbTJ = C34703nhO.AEQbTJ(context);
        return strAEQbTJ == null ? "" : strAEQbTJ;
    }

    public final java.lang.String KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String strOLrzqt = C34703nhO.OLrzqt(context);
        return strOLrzqt == null ? "" : strOLrzqt;
    }

    public final java.lang.String djBIcL(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        android.view.inputmethod.InputMethodSubtype currentInputMethodSubtype = ((android.view.inputmethod.InputMethodManager) systemService).getCurrentInputMethodSubtype();
        java.lang.String languageTag = currentInputMethodSubtype != null ? currentInputMethodSubtype.getLanguageTag() : null;
        return languageTag == null ? "" : languageTag;
    }

    public final java.lang.String AhwBna() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        java.lang.String str = simpleDateFormat.format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String QUSxYX() {
        return C43384roK.KWHzl.copydefault();
    }

    public final java.lang.String values() {
        return C33129mqd.divS$default(java.lang.Integer.valueOf(TimeZone.getDefault().getRawOffset()), 1000, null, null, null, 14, null).toString();
    }

    public final JSONObject fJNWhG(android.content.Context context) throws JSONException {
        java.lang.Object systemService = context.getSystemService("storage");
        Intrinsics.copydefault(systemService, "");
        java.util.List<android.os.storage.StorageVolume> storageVolumes = ((android.os.storage.StorageManager) systemService).getStorageVolumes();
        Intrinsics.checkNotNullExpressionValue(storageVolumes, "");
        java.lang.Object systemService2 = context.getSystemService("storagestats");
        Intrinsics.copydefault(systemService2, "");
        android.app.usage.StorageStatsManager storageStatsManagerDA_ = C47205tle.dA_(systemService2);
        JSONObject jSONObject = new JSONObject();
        long totalSpace = 0;
        long freeSpace = 0;
        for (android.os.storage.StorageVolume storageVolume : storageVolumes) {
            Intrinsics.copydefault(storageVolume);
            java.lang.String strAEQbTJ = AEQbTJ(context, storageVolume);
            if (storageVolume.isPrimary()) {
                totalSpace += storageStatsManagerDA_.getTotalBytes(android.os.storage.StorageManager.UUID_DEFAULT);
                freeSpace += storageStatsManagerDA_.getFreeBytes(android.os.storage.StorageManager.UUID_DEFAULT);
            } else if (strAEQbTJ != null) {
                java.io.File file = new java.io.File(strAEQbTJ);
                freeSpace += file.getFreeSpace();
                totalSpace += file.getTotalSpace();
            }
            android.text.format.Formatter.formatFileSize(context, freeSpace);
            android.text.format.Formatter.formatFileSize(context, totalSpace);
        }
        jSONObject.put("diskSpace", java.lang.String.valueOf(totalSpace));
        jSONObject.put("diskFreeSpace", java.lang.String.valueOf(freeSpace));
        return jSONObject;
    }

    public final java.lang.String AEQbTJ(android.content.Context context, android.os.storage.StorageVolume storageVolume) {
        java.io.File directory;
        java.lang.String absolutePath;
        if (Build.VERSION.SDK_INT >= 30 && (directory = storageVolume.getDirectory()) != null && (absolutePath = directory.getAbsolutePath()) != null) {
            return absolutePath;
        }
        try {
            try {
                java.lang.Object objInvoke = storageVolume.getClass().getMethod("getPath", new java.lang.Class[0]).invoke(storageVolume, new java.lang.Object[0]);
                Intrinsics.copydefault(objInvoke, "");
                return (java.lang.String) objInvoke;
            } catch (java.lang.Exception unused) {
                java.util.Iterator itEZpvd = yHX.EZpvd(context.getExternalFilesDirs(null));
                while (itEZpvd.hasNext()) {
                    java.io.File file = (java.io.File) itEZpvd.next();
                    java.lang.Object systemService = context.getSystemService("storage");
                    Intrinsics.copydefault(systemService, "");
                    android.os.storage.StorageManager storageManager = (android.os.storage.StorageManager) systemService;
                    android.os.storage.StorageVolume storageVolume2 = storageManager.getStorageVolume(file);
                    if (storageVolume2 != null && Intrinsics.EZpvd(storageVolume2, storageVolume)) {
                        while (true) {
                            java.io.File parentFile = file.getParentFile();
                            if (parentFile == null) {
                                return file.getAbsolutePath();
                            }
                            android.os.storage.StorageVolume storageVolume3 = storageManager.getStorageVolume(parentFile);
                            if (storageVolume3 == null) {
                                return file.getAbsolutePath();
                            }
                            if (!Intrinsics.EZpvd(storageVolume3, storageVolume)) {
                                return file.getAbsolutePath();
                            }
                            file = parentFile;
                        }
                    }
                }
                try {
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    Intrinsics.checkNotNullExpressionValue(parcelObtain, "");
                    storageVolume.writeToParcel(parcelObtain, 0);
                    parcelObtain.setDataPosition(0);
                    parcelObtain.readString();
                    return parcelObtain.readString();
                } catch (java.lang.Exception unused2) {
                    return null;
                }
            }
        } catch (java.lang.Exception unused3) {
            java.lang.Object objInvoke2 = storageVolume.getClass().getMethod("getPathFile", new java.lang.Class[0]).invoke(storageVolume, new java.lang.Object[0]);
            Intrinsics.copydefault(objInvoke2, "");
            return ((java.io.File) objInvoke2).getAbsolutePath();
        }
    }

    public static final JSONObject OLrzqt() {
        JSONObject jSONObject = new JSONObject();
        if (android.os.Environment.getExternalStorageState().equals("mounted")) {
            try {
                android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getExternalStorageDirectory().getAbsolutePath());
                long blockSizeLong = statFs.getBlockSizeLong();
                long blockCountLong = statFs.getBlockCountLong();
                long availableBlocksLong = statFs.getAvailableBlocksLong();
                jSONObject.put("diskSpace", java.lang.String.valueOf(blockCountLong * blockSizeLong));
                jSONObject.put("diskFreeSpace", java.lang.String.valueOf(blockSizeLong * availableBlocksLong));
            } catch (java.lang.Exception unused) {
            }
        }
        return jSONObject;
    }

    public final JSONObject AhwBna(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (Build.VERSION.SDK_INT >= 26) {
            return fJNWhG(context);
        }
        return OLrzqt();
    }

    public final java.lang.String AYXKKw(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return java.lang.String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime);
    }

    public final java.lang.String gEmmrt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return java.lang.String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime);
    }

    public final java.lang.String fARcdN(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return context.getResources().getConfiguration().keyboard == 2 ? "1" : "0";
    }

    public final java.lang.String fARcdN() {
        java.lang.String strKWHzl;
        StateListAnimator stateListAnimator = copydefault;
        return (stateListAnimator == null || (strKWHzl = stateListAnimator.KWHzl()) == null) ? "" : strKWHzl;
    }

    public final java.lang.String AuCTel() {
        java.lang.String strAEQbTJ;
        StateListAnimator stateListAnimator = copydefault;
        return (stateListAnimator == null || (strAEQbTJ = stateListAnimator.AEQbTJ()) == null) ? "" : strAEQbTJ;
    }

    public final java.lang.String copydefault(android.content.Context context, int i) {
        try {
            java.lang.Object systemService = context.getSystemService("sensor");
            android.hardware.SensorManager sensorManager = systemService instanceof android.hardware.SensorManager ? (android.hardware.SensorManager) systemService : null;
            android.hardware.Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(i) : null;
            if (defaultSensor != null) {
                return defaultSensor.getName() + ":" + defaultSensor.getVendor();
            }
        } catch (java.lang.Exception unused) {
        }
        return "";
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return copydefault(context, 1);
    }

    public final java.lang.String fetchVPNInfo(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return copydefault(context, 6);
    }

    public final java.lang.String AkhnZx(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return copydefault(context, 8);
    }

    public final java.lang.String DbNXlk(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return copydefault(context, 19);
    }

    public final java.lang.String values(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return copydefault(context, 18);
    }

    public final java.lang.Object copydefault(Continuation<? super Unit> continuation) {
        try {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            int[] iArr = new int[2];
            EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12351, 12430, 12329, 0, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
                EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 1, 12344}, 0));
            }
        } catch (java.lang.Exception unused) {
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String isConnected(@NotNull android.content.Context context) throws java.io.IOException {
        long jLastModified;
        long jLastModified2;
        Intrinsics.checkNotNullParameter(context, "");
        java.io.File file = new java.io.File(context.getFilesDir(), "mc.txt");
        if (file.exists() && file.length() > 0) {
            byte[] bArrDecode = android.util.Base64.decode(yFI.readText$default(file, null, 1, null), 2);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
            java.lang.String str = new java.lang.String(bArrDecode, Charsets.UTF_8);
            if (Build.VERSION.SDK_INT >= 26) {
                FileTime fileTimeCreationTime = Files.readAttributes(Paths.get(file.getAbsolutePath(), new java.lang.String[0]), C47143tkV.EZpvd(), new LinkOption[0]).creationTime();
                Intrinsics.checkNotNullExpressionValue(fileTimeCreationTime, "");
                jLastModified2 = ds_(fileTimeCreationTime);
            } else {
                jLastModified2 = file.lastModified();
            }
            java.lang.System.out.println((java.lang.Object) ("Creation file exists at: " + file.getAbsolutePath() + " with content: " + str + "metadata time: " + jLastModified2));
            return jLastModified2 + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + str;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            java.nio.file.Path path = Paths.get(file.getAbsolutePath(), new java.lang.String[0]);
            Files.write(path, new byte[0], StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            BasicFileAttributes attributes = Files.readAttributes(path, (java.lang.Class<BasicFileAttributes>) C47143tkV.EZpvd(), new LinkOption[0]);
            Intrinsics.checkNotNullExpressionValue(attributes, "");
            FileTime fileTimeCreationTime2 = attributes.creationTime();
            Intrinsics.checkNotNullExpressionValue(fileTimeCreationTime2, "");
            jLastModified = ds_(fileTimeCreationTime2);
        } else {
            yFI.writeText$default(file, "", null, 2, null);
            jLastModified = file.lastModified();
        }
        java.lang.String str2 = jLastModified + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + android.os.Build.BRAND + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + android.os.Build.MODEL + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + android.os.Build.PRODUCT;
        byte[] bytes = str2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        java.lang.String strEncodeToString = android.util.Base64.encodeToString(bytes, 2);
        Intrinsics.copydefault((java.lang.Object) strEncodeToString);
        yFI.writeText$default(file, strEncodeToString, null, 2, null);
        java.lang.System.out.println((java.lang.Object) ("Creation file created at: " + file.getAbsolutePath() + " with content: " + str2 + "metadata time: " + jLastModified));
        return jLastModified + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + str2;
    }

    public final long ds_(@NotNull FileTime fileTime) {
        Intrinsics.checkNotNullParameter(fileTime, "");
        if (Build.VERSION.SDK_INT < 26) {
            return 0L;
        }
        long millis = fileTime.toMillis();
        return millis < 1000000000000L ? millis * ((long) 1000) : millis;
    }
}
