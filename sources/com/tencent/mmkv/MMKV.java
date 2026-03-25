package com.tencent.mmkv;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.InterfaceC58022ytT;
import o.InterfaceC58025ytW;

/* JADX INFO: loaded from: classes12.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {
    public static InterfaceC58022ytT AEQbTJ;
    public static final EnumMap<MMKVRecoverStrategic, Integer> AYXKKw;
    public static String AhwBna;
    public static final Set<Long> EZpvd;
    public static InterfaceC58025ytW KWHzl;
    public static final MMKVLogLevel[] OLrzqt;
    public static boolean copydefault;
    public static final HashMap<String, Parcelable.Creator<?>> djBIcL;
    public static boolean gEmmrt;
    public static final EnumMap<MMKVLogLevel, Integer> valueOf;
    private final long nativeHandle;

    public interface Application {
        void copydefault(String str);
    }

    private native long actualSize(long j);

    private native String[] allKeys(long j, boolean z);

    public static native long backupAllToDirectory(String str);

    public static native boolean backupOneToDirectory(String str, String str2, @Nullable String str3);

    private static native boolean checkProcessMode(long j);

    private native boolean containsKey(long j, String str);

    private native long count(long j, boolean z);

    private static native long createNB(int i);

    private native boolean decodeBool(long j, String str, boolean z);

    private native byte[] decodeBytes(long j, String str);

    private native double decodeDouble(long j, String str, double d);

    private native float decodeFloat(long j, String str, float f);

    private native int decodeInt(long j, String str, int i);

    private native long decodeLong(long j, String str, long j2);

    private native String decodeString(long j, String str, @Nullable String str2);

    private native String[] decodeStringSet(long j, String str);

    private static native void destroyNB(long j, int i);

    private native boolean encodeBool(long j, String str, boolean z);

    private native boolean encodeBool_2(long j, String str, boolean z, int i);

    private native boolean encodeBytes(long j, String str, @Nullable byte[] bArr);

    private native boolean encodeBytes_2(long j, String str, @Nullable byte[] bArr, int i);

    private native boolean encodeDouble(long j, String str, double d);

    private native boolean encodeDouble_2(long j, String str, double d, int i);

    private native boolean encodeFloat(long j, String str, float f);

    private native boolean encodeFloat_2(long j, String str, float f, int i);

    private native boolean encodeInt(long j, String str, int i);

    private native boolean encodeInt_2(long j, String str, int i, int i2);

    private native boolean encodeLong(long j, String str, long j2);

    private native boolean encodeLong_2(long j, String str, long j2, int i);

    private native boolean encodeSet(long j, String str, @Nullable String[] strArr);

    private native boolean encodeSet_2(long j, String str, @Nullable String[] strArr, int i);

    private native boolean encodeString(long j, String str, @Nullable String str2);

    private native boolean encodeString_2(long j, String str, @Nullable String str2, int i);

    private static native long getDefaultMMKV(int i, @Nullable String str);

    private static native long getMMKVWithAshmemFD(String str, int i, int i2, @Nullable String str2);

    private static native long getMMKVWithID(String str, int i, @Nullable String str2, @Nullable String str3, long j);

    private static native long getMMKVWithIDAndSize(String str, int i, int i2, @Nullable String str2);

    private native boolean isCompareBeforeSetEnabled();

    private native boolean isEncryptionEnabled();

    private native boolean isExpirationEnabled();

    public static native boolean isFileValid(String str, @Nullable String str2);

    private static native void jniInitialize(String str, String str2, int i, boolean z);

    private native void nativeEnableCompareBeforeSet();

    public static native void onExit();

    public static native int pageSize();

    public static native boolean removeStorage(String str, @Nullable String str2);

    private native void removeValueForKey(long j, String str);

    public static native long restoreAllFromDirectory(String str);

    public static native boolean restoreOneMMKVFromDirectory(String str, String str2, @Nullable String str3);

    private static native void setCallbackHandler(boolean z, boolean z2);

    private static native void setLogLevel(int i);

    private static native void setWantsContentChangeNotify(boolean z);

    private native void sync(boolean z);

    private native long totalSize(long j);

    private native int valueSize(long j, String str, boolean z);

    public static native String version();

    private native int writeValueToNB(long j, String str, long j2, int i);

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(@Nullable String str);

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    public native String cryptKey();

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this;
    }

    public native boolean enableAutoKeyExpire(int i);

    public native void lock();

    public native String mmapID();

    public native boolean reKey(@Nullable String str);

    public native void removeValuesForKeys(String[] strArr);

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    static {
        EnumMap<MMKVRecoverStrategic, Integer> enumMap = new EnumMap<>(MMKVRecoverStrategic.class);
        AYXKKw = enumMap;
        enumMap.put(MMKVRecoverStrategic.OnErrorDiscard, 0);
        enumMap.put(MMKVRecoverStrategic.OnErrorRecover, 1);
        EnumMap<MMKVLogLevel, Integer> enumMap2 = new EnumMap<>(MMKVLogLevel.class);
        valueOf = enumMap2;
        MMKVLogLevel mMKVLogLevel = MMKVLogLevel.LevelDebug;
        enumMap2.put(mMKVLogLevel, 0);
        MMKVLogLevel mMKVLogLevel2 = MMKVLogLevel.LevelInfo;
        enumMap2.put(mMKVLogLevel2, 1);
        MMKVLogLevel mMKVLogLevel3 = MMKVLogLevel.LevelWarning;
        enumMap2.put(mMKVLogLevel3, 2);
        MMKVLogLevel mMKVLogLevel4 = MMKVLogLevel.LevelError;
        enumMap2.put(mMKVLogLevel4, 3);
        MMKVLogLevel mMKVLogLevel5 = MMKVLogLevel.LevelNone;
        enumMap2.put(mMKVLogLevel5, 4);
        OLrzqt = new MMKVLogLevel[]{mMKVLogLevel, mMKVLogLevel2, mMKVLogLevel3, mMKVLogLevel4, mMKVLogLevel5};
        EZpvd = new HashSet();
        AhwBna = null;
        gEmmrt = true;
        djBIcL = new HashMap<>();
        copydefault = false;
    }

    public static String AEQbTJ(@NonNull Context context) {
        return KWHzl(context, context.getFilesDir().getAbsolutePath() + "/mmkv", null, MMKVLogLevel.LevelInfo, null);
    }

    public static String KWHzl(@NonNull Context context, String str, Application application, MMKVLogLevel mMKVLogLevel, InterfaceC58022ytT interfaceC58022ytT) {
        if ((context.getApplicationInfo().flags & 2) == 0) {
            KWHzl();
        } else {
            EZpvd();
        }
        String absolutePath = context.getCacheDir().getAbsolutePath();
        AEQbTJ = interfaceC58022ytT;
        if (interfaceC58022ytT != null && interfaceC58022ytT.OLrzqt()) {
            copydefault = true;
        }
        String strCopydefault = copydefault(str, absolutePath, application, mMKVLogLevel, copydefault);
        if (AEQbTJ != null) {
            setCallbackHandler(copydefault, true);
        }
        return strCopydefault;
    }

    public static String copydefault(String str, String str2, Application application, MMKVLogLevel mMKVLogLevel, boolean z) {
        if (application != null) {
            application.copydefault("mmkv");
        } else {
            System.loadLibrary("mmkv");
        }
        jniInitialize(str, str2, EZpvd(mMKVLogLevel), z);
        AhwBna = str;
        return str;
    }

    /* JADX INFO: renamed from: com.tencent.mmkv.MMKV$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[MMKVLogLevel.values().length];
            copydefault = iArr;
            try {
                iArr[MMKVLogLevel.LevelDebug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                copydefault[MMKVLogLevel.LevelWarning.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                copydefault[MMKVLogLevel.LevelError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                copydefault[MMKVLogLevel.LevelNone.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                copydefault[MMKVLogLevel.LevelInfo.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int EZpvd(@NonNull MMKVLogLevel mMKVLogLevel) {
        int i = AnonymousClass3.copydefault[mMKVLogLevel.ordinal()];
        if (i == 1) {
            return 0;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    return 1;
                }
            }
        }
        return i2;
    }

    public static MMKV EZpvd(String str) throws RuntimeException {
        if (AhwBna == null) {
            throw new IllegalStateException("You should Call MMKV.initialize() first.");
        }
        return AEQbTJ(getMMKVWithID(str, 1, null, null, 0L), str, 1);
    }

    public static MMKV KWHzl(String str, String str2) throws RuntimeException {
        if (AhwBna == null) {
            throw new IllegalStateException("You should Call MMKV.initialize() first.");
        }
        return AEQbTJ(getMMKVWithID(str, 1, null, str2, 0L), str, 1);
    }

    public static MMKV AEQbTJ(long j, String str, int i) throws RuntimeException {
        String str2;
        if (j == 0) {
            throw new RuntimeException("Fail to create an MMKV instance [" + str + "] in JNI");
        }
        if (!gEmmrt) {
            return new MMKV(j);
        }
        Set<Long> set = EZpvd;
        synchronized (set) {
            if (!set.contains(Long.valueOf(j))) {
                if (!checkProcessMode(j)) {
                    if (i == 1) {
                        str2 = "Opening a multi-process MMKV instance [" + str + "] with SINGLE_PROCESS_MODE!";
                    } else {
                        str2 = ("Opening an MMKV instance [" + str + "] with MULTI_PROCESS_MODE, ") + "while it's already been opened with SINGLE_PROCESS_MODE by someone somewhere else!";
                    }
                    throw new IllegalArgumentException(str2);
                }
                set.add(Long.valueOf(j));
            }
        }
        return new MMKV(j);
    }

    public static void EZpvd() {
        synchronized (EZpvd) {
            gEmmrt = true;
        }
    }

    public static void KWHzl() {
        synchronized (EZpvd) {
            gEmmrt = false;
        }
    }

    public boolean KWHzl(String str, int i) {
        return encodeInt(this.nativeHandle, str, i);
    }

    public int OLrzqt(String str) {
        return decodeInt(this.nativeHandle, str, 0);
    }

    public long AEQbTJ(String str) {
        return decodeLong(this.nativeHandle, str, 0L);
    }

    public boolean EZpvd(String str, @Nullable String str2) {
        return encodeString(this.nativeHandle, str, str2);
    }

    public String KWHzl(String str) {
        return decodeString(this.nativeHandle, str, null);
    }

    public boolean AEQbTJ(String str, @Nullable Set<String> set) {
        return encodeSet(this.nativeHandle, str, set == null ? null : (String[]) set.toArray(new String[0]));
    }

    public Set<String> EZpvd(String str, @Nullable Set<String> set) {
        return KWHzl(str, set, HashSet.class);
    }

    public Set<String> KWHzl(String str, @Nullable Set<String> set, Class<? extends Set> cls) {
        String[] strArrDecodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (strArrDecodeStringSet == null) {
            return set;
        }
        try {
            Set<String> setNewInstance = cls.newInstance();
            setNewInstance.addAll(Arrays.asList(strArrDecodeStringSet));
            return setNewInstance;
        } catch (IllegalAccessException | InstantiationException unused) {
            return set;
        }
    }

    public final byte[] OLrzqt(@NonNull Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        parcelable.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public boolean OLrzqt(String str, @Nullable Parcelable parcelable) {
        if (parcelable == null) {
            return encodeBytes(this.nativeHandle, str, null);
        }
        return encodeBytes(this.nativeHandle, str, OLrzqt(parcelable));
    }

    public <T extends Parcelable> T copydefault(String str, Class<T> cls) {
        return (T) AEQbTJ(str, cls, (Parcelable) null);
    }

    public <T extends Parcelable> T AEQbTJ(String str, Class<T> cls, @Nullable T t) {
        byte[] bArrDecodeBytes;
        Parcelable.Creator<?> creator;
        if (cls == null || (bArrDecodeBytes = decodeBytes(this.nativeHandle, str)) == null) {
            return t;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArrDecodeBytes, 0, bArrDecodeBytes.length);
        parcelObtain.setDataPosition(0);
        try {
            String string = cls.toString();
            HashMap<String, Parcelable.Creator<?>> map = djBIcL;
            synchronized (map) {
                creator = map.get(string);
                if (creator == null && (creator = (Parcelable.Creator) cls.getField("CREATOR").get(null)) != null) {
                    map.put(string, creator);
                }
            }
            if (creator != null) {
                return (T) creator.createFromParcel(parcelObtain);
            }
            throw new Exception("Parcelable protocol requires a non-null static Parcelable.Creator object called CREATOR on class " + string);
        } catch (Exception e) {
            OLrzqt(MMKVLogLevel.LevelError, e.toString());
            return t;
        } finally {
            parcelObtain.recycle();
        }
    }

    public boolean copydefault(String str) {
        return containsKey(this.nativeHandle, str);
    }

    public String[] AEQbTJ() {
        return allKeys(this.nativeHandle, false);
    }

    public long OLrzqt() {
        return count(this.nativeHandle, false);
    }

    public void djBIcL(String str) {
        removeValueForKey(this.nativeHandle, str);
    }

    public void AhwBna() {
        sync(true);
    }

    public void copydefault() {
        sync(false);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        throw new UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, @Nullable String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putString(String str, @Nullable String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, @Nullable Set<String> set) {
        return EZpvd(str, set);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putStringSet(String str, @Nullable Set<String> set) {
        AEQbTJ(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        return decodeInt(this.nativeHandle, str, i);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putInt(String str, int i) {
        encodeInt(this.nativeHandle, str, i);
        return this;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        return decodeLong(this.nativeHandle, str, j);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putLong(String str, long j) {
        encodeLong(this.nativeHandle, str, j);
        return this;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        return decodeFloat(this.nativeHandle, str, f);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putFloat(String str, float f) {
        encodeFloat(this.nativeHandle, str, f);
        return this;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        return decodeBool(this.nativeHandle, str, z);
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putBoolean(String str, boolean z) {
        encodeBool(this.nativeHandle, str, z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor remove(String str) {
        djBIcL(str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    @Deprecated
    public boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences.Editor
    @Deprecated
    public void apply() {
        sync(false);
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return copydefault(str);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    private static int onMMKVCRCCheckFail(String str) {
        MMKVRecoverStrategic mMKVRecoverStrategicAEQbTJ = MMKVRecoverStrategic.OnErrorDiscard;
        InterfaceC58022ytT interfaceC58022ytT = AEQbTJ;
        if (interfaceC58022ytT != null) {
            mMKVRecoverStrategicAEQbTJ = interfaceC58022ytT.AEQbTJ(str);
        }
        OLrzqt(MMKVLogLevel.LevelInfo, "Recover strategic for " + str + " is " + mMKVRecoverStrategicAEQbTJ);
        Integer num = AYXKKw.get(mMKVRecoverStrategicAEQbTJ);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String str) {
        MMKVRecoverStrategic mMKVRecoverStrategicOLrzqt = MMKVRecoverStrategic.OnErrorDiscard;
        InterfaceC58022ytT interfaceC58022ytT = AEQbTJ;
        if (interfaceC58022ytT != null) {
            mMKVRecoverStrategicOLrzqt = interfaceC58022ytT.OLrzqt(str);
        }
        OLrzqt(MMKVLogLevel.LevelInfo, "Recover strategic for " + str + " is " + mMKVRecoverStrategicOLrzqt);
        Integer num = AYXKKw.get(mMKVRecoverStrategicOLrzqt);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static void mmkvLogImp(int i, String str, int i2, String str2, String str3) {
        InterfaceC58022ytT interfaceC58022ytT = AEQbTJ;
        if (interfaceC58022ytT != null && copydefault) {
            interfaceC58022ytT.AEQbTJ(OLrzqt[i], str, i2, str2, str3);
        } else {
            int i3 = AnonymousClass3.copydefault[OLrzqt[i].ordinal()];
        }
    }

    public static void OLrzqt(MMKVLogLevel mMKVLogLevel, String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[r0.length - 1];
        Integer num = valueOf.get(mMKVLogLevel);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    private static void onContentChangedByOuterProcess(String str) {
        InterfaceC58025ytW interfaceC58025ytW = KWHzl;
        if (interfaceC58025ytW != null) {
            interfaceC58025ytW.OLrzqt(str);
        }
    }

    public MMKV(long j) {
        this.nativeHandle = j;
    }
}
