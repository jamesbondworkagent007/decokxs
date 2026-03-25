package com.okinc.mln_ui.ui.okkit;

import android.text.TextUtils;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import o.C33129mqd;
import o.C33491mxU;
import o.C43154rjt;
import o.pTB;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass(isStatic = true)
public class UdMath {

    @LuaBridge
    public static int KWHzl;

    @LuaBridge
    public static String addString(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return C43154rjt.OLrzqt.copydefault(str, str2);
    }

    @LuaBridge
    public static String subString(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return C43154rjt.OLrzqt.EZpvd(str, str2);
    }

    @LuaBridge
    public static String multiString(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return C43154rjt.OLrzqt.KWHzl(str, str2);
    }

    @LuaBridge
    public static String divString(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return C43154rjt.OLrzqt.OLrzqt(str, str2);
    }

    @LuaBridge
    public static String format(String str, int i, int i2, int i3) {
        return C43154rjt.OLrzqt.AEQbTJ(str, i, i2, i3);
    }

    @LuaBridge
    public static String formatData(String str, int i, int i2, int i3) {
        return C43154rjt.OLrzqt.KWHzl(str, i + "", i2, i3 + "");
    }

    @LuaBridge
    public static String formatWithMaxPrecision(String str, int i, int i2, int i3) {
        return C43154rjt.OLrzqt.KWHzl(str, i, i2, i3);
    }

    @LuaBridge
    public static String grouped(String str) {
        return !TextUtils.isEmpty(str) ? C43154rjt.OLrzqt.KWHzl(str) : "0";
    }

    @LuaBridge
    public static boolean isGreater(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return C33129mqd.AEQbTJ(str, str2);
    }

    @LuaBridge
    public static boolean isLess(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return C33129mqd.gEmmrt(str, str2);
    }

    @LuaBridge
    public static boolean isEqual(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return C33129mqd.OLrzqt(str, str2);
    }

    @LuaBridge
    public static String fromHexToDecimal(String str) {
        return !TextUtils.isEmpty(str) ? C33491mxU.OLrzqt(str) : "";
    }

    @LuaBridge
    public static String fromDecimalToHex(String str) {
        return !TextUtils.isEmpty(str) ? C33491mxU.copydefault(str) : "";
    }

    @LuaBridge
    public static String treatAsPercentage(String str, int i) {
        return !TextUtils.isEmpty(str) ? pTB.KWHzl(pTB.OLrzqt((Object) str), i, RoundingMode.UP) : "";
    }

    @LuaBridge
    public static String formatPercentage(String str, int i, int i2, int i3, int i4) {
        return !TextUtils.isEmpty(str) ? C43154rjt.OLrzqt.OLrzqt(str, i, i2, i3, i4) : "";
    }

    @LuaBridge
    @Deprecated
    public static String percentify(String str) {
        return !TextUtils.isEmpty(str) ? pTB.OLrzqt(str) : "";
    }

    @LuaBridge
    public static String prependPlusSign(String str) {
        return !TextUtils.isEmpty(str) ? pTB.AEQbTJ(pTB.OLrzqt((Object) str), 2, 2, RoundingMode.UP) : "";
    }

    @LuaBridge
    public static String formatNumberKmb(String str, Integer num, int i, int i2, int i3) {
        if (str == null || TextUtils.isEmpty(str)) {
            return "";
        }
        DisplaySign displaySign = DisplaySign.AUTO;
        if (i3 != 0) {
            if (i3 == 1) {
                displaySign = DisplaySign.EXCEPT_ZERO;
            } else if (i3 == 2) {
                displaySign = DisplaySign.ALWAYS;
            }
        }
        return C43154rjt.OLrzqt.OLrzqt(str, num.intValue(), i2, i, displaySign);
    }
}
