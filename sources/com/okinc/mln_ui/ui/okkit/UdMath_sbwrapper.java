package com.okinc.mln_ui.ui.okkit;

import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes23.dex */
@InterfaceC60044zuT
public class UdMath_sbwrapper {
    public static final String[] methods = {"addString", "subString", "multiString", "divString", "format", "formatData", "formatWithMaxPrecision", "grouped", "isGreater", "isLess", "isEqual", "fromHexToDecimal", "fromDecimalToHex", "treatAsPercentage", "formatPercentage", "percentify", "prependPlusSign", "formatNumberKmb", "property"};

    @InterfaceC60044zuT
    public static LuaValue[] addString(long j, LuaValue[] luaValueArr) {
        String javaString = null;
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && luaValueArr[1].isString()) {
            javaString = luaValueArr[1].toJavaString();
        }
        return LuaValue.varargsOf(LuaString.copydefault(UdMath.addString(javaString2, javaString)));
    }

    @InterfaceC60044zuT
    public static LuaValue[] subString(long j, LuaValue[] luaValueArr) {
        String javaString = null;
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && luaValueArr[1].isString()) {
            javaString = luaValueArr[1].toJavaString();
        }
        return LuaValue.varargsOf(LuaString.copydefault(UdMath.subString(javaString2, javaString)));
    }

    @InterfaceC60044zuT
    public static LuaValue[] multiString(long j, LuaValue[] luaValueArr) {
        String javaString = null;
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && luaValueArr[1].isString()) {
            javaString = luaValueArr[1].toJavaString();
        }
        return LuaValue.varargsOf(LuaString.copydefault(UdMath.multiString(javaString2, javaString)));
    }

    @InterfaceC60044zuT
    public static LuaValue[] divString(long j, LuaValue[] luaValueArr) {
        String javaString = null;
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && luaValueArr[1].isString()) {
            javaString = luaValueArr[1].toJavaString();
        }
        return LuaValue.varargsOf(LuaString.copydefault(UdMath.divString(javaString2, javaString)));
    }

    @InterfaceC60044zuT
    public static LuaValue[] format(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(UdMath.format((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), luaValueArr[1].toInt(), luaValueArr[2].toInt(), luaValueArr[3].toInt())));
    }

    @InterfaceC60044zuT
    public static LuaValue[] formatData(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(UdMath.formatData((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), luaValueArr[1].toInt(), luaValueArr[2].toInt(), luaValueArr[3].toInt())));
    }

    @InterfaceC60044zuT
    public static LuaValue[] formatWithMaxPrecision(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(UdMath.formatWithMaxPrecision((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), luaValueArr[1].toInt(), luaValueArr[2].toInt(), luaValueArr[3].toInt())));
    }

    @InterfaceC60044zuT
    public static LuaValue[] grouped(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(UdMath.grouped((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString())));
    }

    @InterfaceC60044zuT
    public static LuaValue[] isGreater(long j, LuaValue[] luaValueArr) {
        String javaString = null;
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && luaValueArr[1].isString()) {
            javaString = luaValueArr[1].toJavaString();
        }
        LuaValue[] luaValueArr2 = new LuaValue[1];
        luaValueArr2[0] = UdMath.isGreater(javaString2, javaString) ? LuaValue.True() : LuaValue.False();
        return LuaValue.varargsOf(luaValueArr2);
    }

    @InterfaceC60044zuT
    public static LuaValue[] isLess(long j, LuaValue[] luaValueArr) {
        String javaString = null;
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && luaValueArr[1].isString()) {
            javaString = luaValueArr[1].toJavaString();
        }
        LuaValue[] luaValueArr2 = new LuaValue[1];
        luaValueArr2[0] = UdMath.isLess(javaString2, javaString) ? LuaValue.True() : LuaValue.False();
        return LuaValue.varargsOf(luaValueArr2);
    }

    @InterfaceC60044zuT
    public static LuaValue[] isEqual(long j, LuaValue[] luaValueArr) {
        String javaString = null;
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && luaValueArr[1].isString()) {
            javaString = luaValueArr[1].toJavaString();
        }
        LuaValue[] luaValueArr2 = new LuaValue[1];
        luaValueArr2[0] = UdMath.isEqual(javaString2, javaString) ? LuaValue.True() : LuaValue.False();
        return LuaValue.varargsOf(luaValueArr2);
    }

    @InterfaceC60044zuT
    public static LuaValue[] fromHexToDecimal(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(UdMath.fromHexToDecimal((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString())));
    }

    @InterfaceC60044zuT
    public static LuaValue[] fromDecimalToHex(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(UdMath.fromDecimalToHex((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString())));
    }

    @InterfaceC60044zuT
    public static LuaValue[] treatAsPercentage(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(UdMath.treatAsPercentage((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), luaValueArr[1].toInt())));
    }

    @InterfaceC60044zuT
    public static LuaValue[] formatPercentage(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(UdMath.formatPercentage((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), luaValueArr[1].toInt(), luaValueArr[2].toInt(), luaValueArr[3].toInt(), luaValueArr[4].toInt())));
    }

    @InterfaceC60044zuT
    public static LuaValue[] percentify(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(UdMath.percentify((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString())));
    }

    @InterfaceC60044zuT
    public static LuaValue[] prependPlusSign(long j, LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(UdMath.prependPlusSign((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString())));
    }

    @InterfaceC60044zuT
    public static LuaValue[] formatNumberKmb(long j, LuaValue[] luaValueArr) {
        Integer numValueOf = null;
        String javaString = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && luaValueArr[1].isNumber()) {
            numValueOf = Integer.valueOf(luaValueArr[1].toInt());
        }
        return LuaValue.varargsOf(LuaString.copydefault(UdMath.formatNumberKmb(javaString, numValueOf, luaValueArr[2].toInt(), luaValueArr[3].toInt(), luaValueArr[4].toInt())));
    }

    @InterfaceC60044zuT
    public static LuaValue[] property(long j, LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.varargsOf(LuaNumber.valueOf(UdMath.KWHzl));
        }
        UdMath.KWHzl = luaValueArr[0].toInt();
        return null;
    }
}
