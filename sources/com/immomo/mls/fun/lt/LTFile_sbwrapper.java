package com.immomo.mls.fun.lt;

import java.util.List;
import java.util.Map;
import o.C8017aul;
import o.InterfaceC60044zuT;
import o.InterfaceC7835arN;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public class LTFile_sbwrapper {
    public static final String[] methods = {"syncMoveFile", "getStorageDir", "rootPath", "asyncCreateFile", "asyncCreateDirs", "asyncDelete", "asyncMoveFile", "asyncCopyFile", "asyncGetFileList", "getFileInfo", "exist", "isDir", "isFile", "asyncReadFile", "asyncReadMapFile", "asyncReadArrayFile", "asyncWriteFile", "asyncWriteMap", "asyncWriteArray", "asyncUnzipFile", "asyncMd5File", "syncReadString", "syncWriteFile", "syncWriteMap", "syncWriteArray", "syncUnzipFile", "syncMd5File"};

    @InterfaceC60044zuT
    public static LuaValue[] syncMoveFile(long j, LuaValue[] luaValueArr) {
        String javaString = null;
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && luaValueArr[1].isString()) {
            javaString = luaValueArr[1].toJavaString();
        }
        return LuaValue.varargsOf(LuaNumber.valueOf(LTFile.syncMoveFile(javaString2, javaString)));
    }

    @InterfaceC60044zuT
    public static LuaValue[] getStorageDir(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(LTFile.getStorageDir()));
    }

    @InterfaceC60044zuT
    public static LuaValue[] rootPath(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(LTFile.rootPath()));
    }

    @InterfaceC60044zuT
    public static LuaValue[] asyncCreateFile(long j, LuaValue[] luaValueArr) {
        LTFile.asyncCreateFile((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[1], InterfaceC7835arN.class));
        return null;
    }

    @InterfaceC60044zuT
    public static LuaValue[] asyncCreateDirs(long j, LuaValue[] luaValueArr) {
        LTFile.asyncCreateDirs((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[1], InterfaceC7835arN.class));
        return null;
    }

    @InterfaceC60044zuT
    public static LuaValue[] asyncDelete(long j, LuaValue[] luaValueArr) {
        LTFile.asyncDelete((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[1], InterfaceC7835arN.class));
        return null;
    }

    @InterfaceC60044zuT
    public static LuaValue[] asyncMoveFile(long j, LuaValue[] luaValueArr) {
        LTFile.asyncMoveFile(Globals.EZpvd(j), (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? null : luaValueArr[1].toJavaString(), (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[2], InterfaceC7835arN.class));
        return null;
    }

    @InterfaceC60044zuT
    public static LuaValue[] asyncCopyFile(long j, LuaValue[] luaValueArr) {
        LTFile.asyncCopyFile((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? null : luaValueArr[1].toJavaString(), (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[2], InterfaceC7835arN.class));
        return null;
    }

    @InterfaceC60044zuT
    public static LuaValue[] asyncGetFileList(long j, LuaValue[] luaValueArr) {
        LTFile.asyncGetFileList((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), luaValueArr[1].toBoolean(), (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[2], InterfaceC7835arN.class));
        return null;
    }

    @InterfaceC60044zuT
    public static LuaValue[] getFileInfo(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(Globals.EZpvd(j), LTFile.getFileInfo((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString())));
    }

    @InterfaceC60044zuT
    public static LuaValue[] exist(long j, LuaValue[] luaValueArr) {
        String javaString = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        LuaValue[] luaValueArr2 = new LuaValue[1];
        luaValueArr2[0] = LTFile.exist(javaString) ? LuaValue.True() : LuaValue.False();
        return LuaValue.varargsOf(luaValueArr2);
    }

    @InterfaceC60044zuT
    public static LuaValue[] isDir(long j, LuaValue[] luaValueArr) {
        String javaString = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        LuaValue[] luaValueArr2 = new LuaValue[1];
        luaValueArr2[0] = LTFile.isDir(javaString) ? LuaValue.True() : LuaValue.False();
        return LuaValue.varargsOf(luaValueArr2);
    }

    @InterfaceC60044zuT
    public static LuaValue[] isFile(long j, LuaValue[] luaValueArr) {
        String javaString = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        LuaValue[] luaValueArr2 = new LuaValue[1];
        luaValueArr2[0] = LTFile.isFile(javaString) ? LuaValue.True() : LuaValue.False();
        return LuaValue.varargsOf(luaValueArr2);
    }

    @InterfaceC60044zuT
    public static LuaValue[] asyncReadFile(long j, LuaValue[] luaValueArr) {
        LTFile.asyncReadFile((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[1], InterfaceC7835arN.class));
        return null;
    }

    @InterfaceC60044zuT
    public static LuaValue[] asyncReadMapFile(long j, LuaValue[] luaValueArr) {
        LTFile.asyncReadMapFile((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[1], InterfaceC7835arN.class));
        return null;
    }

    @InterfaceC60044zuT
    public static LuaValue[] asyncReadArrayFile(long j, LuaValue[] luaValueArr) {
        LTFile.asyncReadArrayFile((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[1], InterfaceC7835arN.class));
        return null;
    }

    @InterfaceC60044zuT
    public static LuaValue[] asyncWriteFile(long j, LuaValue[] luaValueArr) {
        LTFile.asyncWriteFile((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? null : luaValueArr[1].toJavaString(), (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[2], InterfaceC7835arN.class));
        return null;
    }

    @InterfaceC60044zuT
    public static LuaValue[] asyncWriteMap(long j, LuaValue[] luaValueArr) {
        LTFile.asyncWriteMap((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (Map) C8017aul.AEQbTJ(luaValueArr[1], Map.class), (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[2], InterfaceC7835arN.class));
        return null;
    }

    @InterfaceC60044zuT
    public static LuaValue[] asyncWriteArray(long j, LuaValue[] luaValueArr) {
        LTFile.asyncWriteArray((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (List) C8017aul.AEQbTJ(luaValueArr[1], List.class), (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[2], InterfaceC7835arN.class));
        return null;
    }

    @InterfaceC60044zuT
    public static LuaValue[] asyncUnzipFile(long j, LuaValue[] luaValueArr) {
        LTFile.asyncUnzipFile((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? null : luaValueArr[1].toJavaString(), (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[2], InterfaceC7835arN.class));
        return null;
    }

    @InterfaceC60044zuT
    public static LuaValue[] asyncMd5File(long j, LuaValue[] luaValueArr) {
        LTFile.asyncMd5File(Globals.EZpvd(j), (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[1], InterfaceC7835arN.class));
        return null;
    }

    @InterfaceC60044zuT
    public static LuaValue[] syncReadString(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(LTFile.syncReadString((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString())));
    }

    @InterfaceC60044zuT
    public static LuaValue[] syncWriteFile(long j, LuaValue[] luaValueArr) {
        String javaString = null;
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && luaValueArr[1].isString()) {
            javaString = luaValueArr[1].toJavaString();
        }
        return LuaValue.varargsOf(LuaNumber.valueOf(LTFile.syncWriteFile(javaString2, javaString)));
    }

    @InterfaceC60044zuT
    public static LuaValue[] syncWriteMap(long j, LuaValue[] luaValueArr) {
        Map map = null;
        String javaString = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && !luaValueArr[1].isNil()) {
            map = (Map) C8017aul.AEQbTJ(luaValueArr[1], Map.class);
        }
        return LuaValue.varargsOf(LuaNumber.valueOf(LTFile.syncWriteMap(javaString, map)));
    }

    @InterfaceC60044zuT
    public static LuaValue[] syncWriteArray(long j, LuaValue[] luaValueArr) {
        List list = null;
        String javaString = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && !luaValueArr[1].isNil()) {
            list = (List) C8017aul.AEQbTJ(luaValueArr[1], List.class);
        }
        return LuaValue.varargsOf(LuaNumber.valueOf(LTFile.syncWriteArray(javaString, list)));
    }

    @InterfaceC60044zuT
    public static LuaValue[] syncUnzipFile(long j, LuaValue[] luaValueArr) {
        String javaString = null;
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && luaValueArr[1].isString()) {
            javaString = luaValueArr[1].toJavaString();
        }
        return LuaValue.varargsOf(LuaNumber.valueOf(LTFile.syncUnzipFile(javaString2, javaString)));
    }

    @InterfaceC60044zuT
    public static LuaValue[] syncMd5File(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LTFile.syncMd5File((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString()));
    }
}
