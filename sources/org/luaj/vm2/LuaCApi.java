package org.luaj.vm2;

import android.content.res.AssetManager;
import o.InterfaceC60044zuT;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC60044zuT
class LuaCApi {
    public static Boolean KWHzl;

    public static native long _allLvmMemUse();

    public static native void _callMethod(long j, long j2, long j3);

    private static native boolean _check32bit();

    public static native void _clearTable(long j, long j2);

    public static native void _clearTableArray(long j, long j2, int i, int i2);

    public static native void _close(long j);

    public static native long _createLState(boolean z);

    public static native long _createTable(long j);

    public static native Object _createUserdataAndSet(long j, String str, String str2, LuaValue[] luaValueArr);

    public static native int _doLoadedData(long j);

    public static native LuaValue[] _doLoadedDataAndGetResult(long j);

    public static native int _dumpFunction(long j, long j2, String str);

    public static native LuaValue[] _dumpStack(long j);

    public static native void _endTraverseTable(long j);

    public static native String _getFunctionSource(long j, long j2);

    public static native long _getMetatable(long j, long j2);

    public static native Object _getTableEntry(long j, long j2);

    public static native int _getTableSize(long j, long j2);

    public static native Object _getTableValue(long j, long j2, int i);

    public static native Object _getTableValue(long j, long j2, String str);

    public static native boolean _hasNativeValue(long j, long j2, int i);

    public static native LuaValue[] _invoke(long j, long j2, LuaValue[] luaValueArr, int i);

    public static native boolean _isEmpty(long j, long j2);

    public static native boolean _isSAESFile(String str);

    public static native void _lgc(long j);

    public static native int _loadAssetsFile(long j, String str, String str2);

    public static native int _loadData(long j, String str, byte[] bArr);

    public static native int _loadFile(long j, String str, String str2);

    public static native void _logMemoryInfo();

    public static native long _lvmMemUse(long j);

    public static native LuaValue[] _nextEntry(long j, boolean z);

    public static native void _notifyRequireCallback();

    public static native void _notifyStatisticsCallback();

    public static native void _openDebug(long j);

    public static native void _openSAES(boolean z);

    public static native void _preRegisterEmptyMethods(String[] strArr);

    public static native void _preRegisterStatic(String str, String[] strArr);

    public static native void _preRegisterUD(String str, String[] strArr);

    public static native void _preloadAssets(long j, String str, String str2);

    public static native int _preloadAssetsAndSave(long j, String str, String str2, String str3);

    public static native void _preloadData(long j, String str, byte[] bArr);

    public static native void _preloadFile(long j, String str, String str2);

    public static native void _registerAllStaticClass(long j, String[] strArr, String[] strArr2, String[] strArr3);

    public static native void _registerAllUserdata(long j, String[] strArr, String[] strArr2, String[] strArr3, boolean[] zArr);

    public static native void _registerJavaMetatable(long j, String str, String str2);

    public static native void _registerNumberEnum(long j, String str, String[] strArr, double[] dArr);

    public static native void _registerStringEnum(long j, String str, String[] strArr, String[] strArr2);

    public static native int _removeNativeValue(long j, long j2, int i);

    public static native void _removeTableIndex(long j, long j2, int i);

    public static native int _require(long j, String str);

    public static native void _setAndroidVersion(int i);

    public static native void _setAssetManager(AssetManager assetManager);

    public static native void _setBasePath(long j, String str, boolean z);

    public static native void _setDatabasePath(String str);

    public static native void _setGcOffset(int i);

    public static native boolean _setMainEntryFromPreload(long j, String str);

    public static native long _setMetatable(long j, long j2, long j3);

    public static native void _setSoPath(long j, String str);

    public static native void _setStatisticsOpen(boolean z);

    public static native void _setTableBoolean(long j, long j2, int i, boolean z);

    public static native void _setTableBoolean(long j, long j2, String str, boolean z);

    public static native void _setTableChild(long j, long j2, int i, long j3, int i2);

    public static native void _setTableChild(long j, long j2, int i, Object obj);

    public static native void _setTableChild(long j, long j2, String str, long j3, int i);

    public static native void _setTableChild(long j, long j2, String str, Object obj);

    public static native void _setTableMethod(long j, long j2, int i, String str, String str2);

    public static native void _setTableMethod(long j, long j2, String str, String str2, String str3);

    public static native void _setTableNil(long j, long j2, int i);

    public static native void _setTableNil(long j, long j2, String str);

    public static native void _setTableNumber(long j, long j2, int i, double d);

    public static native void _setTableNumber(long j, long j2, String str, double d);

    public static native void _setTableString(long j, long j2, int i, String str);

    public static native void _setTableString(long j, long j2, String str, String str2);

    public static native int _startDebug(long j, byte[] bArr, String str, int i);

    public static native boolean _startTraverseTable(long j, long j2);

    public static native String _traceback(long j);

    public static boolean EZpvd() {
        if (KWHzl == null) {
            KWHzl = Boolean.valueOf(_check32bit());
        }
        return KWHzl.booleanValue();
    }
}
