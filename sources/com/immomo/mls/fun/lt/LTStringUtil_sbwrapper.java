package com.immomo.mls.fun.lt;

import o.C8017aul;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public class LTStringUtil_sbwrapper {
    public static final String[] methods = {"md5", "length", "jsonToMap", "jsonToArray", "arrayToJSON", "mapToJSON", "sizeWithContentFontSize", "sizeWithContentFontNameSize", "rangeOfString", "prependSign", "appendSymbol"};

    @InterfaceC60044zuT
    public static LuaValue[] md5(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LTStringUtil.md5((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString()));
    }

    @InterfaceC60044zuT
    public static LuaValue[] length(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.valueOf(LTStringUtil.length((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString())));
    }

    @InterfaceC60044zuT
    public static LuaValue[] jsonToMap(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(Globals.EZpvd(j), LTStringUtil.jsonToMap(luaValueArr.length > 0 ? luaValueArr[0] : null)));
    }

    @InterfaceC60044zuT
    public static LuaValue[] jsonToArray(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(Globals.EZpvd(j), LTStringUtil.jsonToArray(luaValueArr.length > 0 ? luaValueArr[0] : null)));
    }

    @InterfaceC60044zuT
    public static LuaValue[] arrayToJSON(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(LTStringUtil.arrayToJSON(luaValueArr.length > 0 ? luaValueArr[0] : null)));
    }

    @InterfaceC60044zuT
    public static LuaValue[] mapToJSON(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(LTStringUtil.mapToJSON(luaValueArr.length > 0 ? luaValueArr[0] : null)));
    }

    @InterfaceC60044zuT
    public static LuaValue[] sizeWithContentFontSize(long j, LuaValue[] luaValueArr) {
        Globals globalsEZpvd = Globals.EZpvd(j);
        return LuaValue.varargsOf(C8017aul.copydefault(globalsEZpvd, LTStringUtil.sizeWithContentFontSize(globalsEZpvd, (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (float) luaValueArr[1].toDouble())));
    }

    @InterfaceC60044zuT
    public static LuaValue[] sizeWithContentFontNameSize(long j, LuaValue[] luaValueArr) {
        Globals globalsEZpvd = Globals.EZpvd(j);
        String javaString = null;
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && luaValueArr[1].isString()) {
            javaString = luaValueArr[1].toJavaString();
        }
        return LuaValue.varargsOf(C8017aul.copydefault(globalsEZpvd, LTStringUtil.sizeWithContentFontNameSize(globalsEZpvd, javaString2, javaString, (float) luaValueArr[2].toDouble())));
    }

    @InterfaceC60044zuT
    public static LuaValue[] rangeOfString(long j, LuaValue[] luaValueArr) {
        Globals globalsEZpvd = Globals.EZpvd(j);
        String javaString = null;
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && luaValueArr[1].isString()) {
            javaString = luaValueArr[1].toJavaString();
        }
        return LuaValue.varargsOf(LTStringUtil.rangeOfString(globalsEZpvd, javaString2, javaString));
    }

    @InterfaceC60044zuT
    public static LuaValue[] prependSign(long j, LuaValue[] luaValueArr) {
        String javaString = null;
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && luaValueArr[1].isString()) {
            javaString = luaValueArr[1].toJavaString();
        }
        return LuaValue.varargsOf(LuaString.copydefault(LTStringUtil.prependSign(javaString2, javaString)));
    }

    @InterfaceC60044zuT
    public static LuaValue[] appendSymbol(long j, LuaValue[] luaValueArr) {
        String javaString = null;
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && luaValueArr[1].isString()) {
            javaString = luaValueArr[1].toJavaString();
        }
        return LuaValue.varargsOf(LuaString.copydefault(LTStringUtil.appendSymbol(javaString2, javaString)));
    }
}
