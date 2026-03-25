package com.okinc.wallet.mln.service;

import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.api.bean.CurrencyPrependSign;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C43251rlk;
import o.C56390yDp;
import o.C56424yEw;
import o.InterfaceC9857bdW;
import o.yDV;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@LuaClass
public final class UDWeb3PrecisionFormatterService {
    public static final Application Companion = new Application(null);

    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DisplaySign.values().length];
            try {
                iArr[DisplaySign.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplaySign.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplaySign.EXCEPT_ZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.mln.service.UDWeb3PrecisionFormatterService.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:4:0x0005, B:6:0x000d, B:8:0x0013, B:13:0x001e, B:15:0x0027, B:19:0x0031, B:21:0x003a, B:25:0x0044, B:27:0x004d, B:32:0x0058, B:34:0x0061, B:36:0x0067, B:38:0x0070, B:40:0x0076, B:42:0x007e, B:45:0x008b, B:47:0x0094, B:48:0x0098, B:10:0x0019), top: B:52:0x0005 }] */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LuaValue[] localizedCryptoAmount(LuaValue[] luaValueArr) {
        String javaString;
        BigDecimal bigDecimalEZpvd;
        LuaValue luaValue;
        LuaValue luaValue2;
        LuaValue luaValue3;
        LuaValue luaValue4;
        LuaValue luaValue5;
        boolean z = false;
        if (luaValueArr != null) {
            try {
                LuaValue luaValue6 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                if (luaValue6 == null || (javaString = luaValue6.toJavaString()) == null || (bigDecimalEZpvd = C33129mqd.EZpvd(javaString)) == null) {
                    bigDecimalEZpvd = BigDecimal.ZERO;
                }
            } catch (Throwable unused) {
                InterfaceC9857bdW interfaceC9857bdW = (InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class);
                BigDecimal bigDecimal = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
                return LuaValue.rString(InterfaceC9857bdW.TaskDescription.localizeCryptoAmount$default(interfaceC9857bdW, bigDecimal, 0, 6, null, null, null, null, false, 250, null));
            }
        }
        BigDecimal bigDecimal2 = bigDecimalEZpvd;
        int i = (luaValueArr == null || (luaValue5 = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) == null) ? 0 : luaValue5.toInt();
        int i2 = (luaValueArr == null || (luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 2)) == null) ? 6 : luaValue4.toInt();
        String javaString2 = (luaValueArr == null || (luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 3)) == null) ? null : luaValue3.toJavaString();
        if (javaString2 == null) {
            javaString2 = "";
        }
        DisplaySign displaySignAEQbTJ = AEQbTJ(luaValueArr != null ? (LuaValue) yDV.gEmmrt(luaValueArr, 4) : null);
        RoundingMode roundingModeEZpvd = EZpvd(luaValueArr != null ? (LuaValue) yDV.gEmmrt(luaValueArr, 5) : null);
        Boolean boolValueOf = (luaValueArr == null || (luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 6)) == null) ? null : Boolean.valueOf(luaValue2.toBoolean());
        if (luaValueArr != null && (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 7)) != null) {
            z = luaValue.toBoolean();
        }
        InterfaceC9857bdW interfaceC9857bdW2 = (InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class);
        Intrinsics.copydefault(bigDecimal2);
        return LuaValue.rString(interfaceC9857bdW2.EZpvd(bigDecimal2, i, i2, javaString2, displaySignAEQbTJ, roundingModeEZpvd, boolValueOf, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x0011, B:12:0x001b, B:14:0x0024, B:17:0x002b, B:19:0x0034, B:21:0x003a, B:22:0x0042, B:10:0x0017), top: B:26:0x0003 }] */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LuaValue[] localizedCryptoPrice(LuaValue[] luaValueArr) {
        String javaString;
        BigDecimal bigDecimalEZpvd;
        LuaValue luaValue;
        boolean z = false;
        if (luaValueArr != null) {
            try {
                LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                if (luaValue2 == null || (javaString = luaValue2.toJavaString()) == null || (bigDecimalEZpvd = C33129mqd.EZpvd(javaString)) == null) {
                    bigDecimalEZpvd = BigDecimal.ZERO;
                }
            } catch (Throwable unused) {
                InterfaceC9857bdW interfaceC9857bdW = (InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class);
                BigDecimal bigDecimal = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
                return LuaValue.rString(InterfaceC9857bdW.TaskDescription.localizeCryptoPrice$default(interfaceC9857bdW, bigDecimal, false, null, null, 14, null));
            }
        }
        if (luaValueArr != null && (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) != null) {
            z = luaValue.toBoolean();
        }
        DisplaySign displaySignAEQbTJ = AEQbTJ(luaValueArr != null ? (LuaValue) yDV.gEmmrt(luaValueArr, 2) : null);
        CurrencyDisplayStyle currencyDisplayStyleKWHzl = KWHzl(luaValueArr != null ? (LuaValue) yDV.gEmmrt(luaValueArr, 3) : null);
        InterfaceC9857bdW interfaceC9857bdW2 = (InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class);
        Intrinsics.copydefault(bigDecimalEZpvd);
        return LuaValue.rString(interfaceC9857bdW2.OLrzqt(bigDecimalEZpvd, z, OLrzqt(bigDecimalEZpvd, displaySignAEQbTJ), currencyDisplayStyleKWHzl));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[Catch: all -> 0x007e, TryCatch #0 {all -> 0x007e, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x0011, B:13:0x001d, B:15:0x0026, B:18:0x002f, B:20:0x0037, B:23:0x003f, B:25:0x0048, B:27:0x004e, B:29:0x0057, B:31:0x005d, B:32:0x0065, B:10:0x0017), top: B:36:0x0003 }] */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LuaValue[] localizedFiatAmount(LuaValue[] luaValueArr) {
        BigDecimal bigDecimalEZpvd;
        LuaValue luaValue;
        LuaValue luaValue2;
        String javaString;
        if (luaValueArr != null) {
            try {
                LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                if (luaValue3 == null || (javaString = luaValue3.toJavaString()) == null || (bigDecimalEZpvd = C33129mqd.EZpvd(javaString)) == null) {
                    bigDecimalEZpvd = BigDecimal.ZERO;
                }
            } catch (Throwable unused) {
                InterfaceC9857bdW interfaceC9857bdW = (InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class);
                BigDecimal bigDecimal = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
                return LuaValue.rString(InterfaceC9857bdW.TaskDescription.localizeFiatAmount$default(interfaceC9857bdW, bigDecimal, 0, 0, null, null, null, 62, null));
            }
        }
        BigDecimal bigDecimal2 = bigDecimalEZpvd;
        int i = 2;
        int i2 = (luaValueArr == null || (luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) == null) ? 2 : luaValue2.toInt();
        if (luaValueArr != null && (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 2)) != null) {
            i = luaValue.toInt();
        }
        int i3 = i;
        DisplaySign displaySignAEQbTJ = AEQbTJ(luaValueArr != null ? (LuaValue) yDV.gEmmrt(luaValueArr, 3) : null);
        RoundingMode roundingModeEZpvd = EZpvd(luaValueArr != null ? (LuaValue) yDV.gEmmrt(luaValueArr, 4) : null);
        CurrencyDisplayStyle currencyDisplayStyleKWHzl = KWHzl(luaValueArr != null ? (LuaValue) yDV.gEmmrt(luaValueArr, 5) : null);
        InterfaceC9857bdW interfaceC9857bdW2 = (InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class);
        Intrinsics.copydefault(bigDecimal2);
        return LuaValue.rString(interfaceC9857bdW2.EZpvd(bigDecimal2, i2, i3, displaySignAEQbTJ, currencyDisplayStyleKWHzl, roundingModeEZpvd));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x0011, B:13:0x001c, B:15:0x0025, B:19:0x002f, B:21:0x0037, B:24:0x003e, B:26:0x0047, B:29:0x004f, B:31:0x0058, B:33:0x005e, B:34:0x0066, B:10:0x0017), top: B:38:0x0003 }] */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LuaValue[] localizedPriceChangePercentage(LuaValue[] luaValueArr) {
        String javaString;
        BigDecimal bigDecimalEZpvd;
        LuaValue luaValue;
        LuaValue luaValue2;
        LuaValue luaValue3;
        boolean z = false;
        if (luaValueArr != null) {
            try {
                LuaValue luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                if (luaValue4 == null || (javaString = luaValue4.toJavaString()) == null || (bigDecimalEZpvd = C33129mqd.EZpvd(javaString)) == null) {
                    bigDecimalEZpvd = BigDecimal.ZERO;
                }
            } catch (Throwable unused) {
                InterfaceC9857bdW interfaceC9857bdW = (InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class);
                BigDecimal bigDecimal = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
                return LuaValue.rString(InterfaceC9857bdW.TaskDescription.localizePriceChangePercentage$default(interfaceC9857bdW, bigDecimal, 0, 0, false, null, null, 62, null));
            }
        }
        BigDecimal bigDecimal2 = bigDecimalEZpvd;
        int i = (luaValueArr == null || (luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) == null) ? 0 : luaValue3.toInt();
        int i2 = 2;
        if (luaValueArr != null && (luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 2)) != null) {
            i2 = luaValue2.toInt();
        }
        int i3 = i2;
        if (luaValueArr != null && (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 3)) != null) {
            z = luaValue.toBoolean();
        }
        boolean z2 = z;
        DisplaySign displaySignAEQbTJ = AEQbTJ(luaValueArr != null ? (LuaValue) yDV.gEmmrt(luaValueArr, 4) : null);
        RoundingMode roundingModeEZpvd = EZpvd(luaValueArr != null ? (LuaValue) yDV.gEmmrt(luaValueArr, 5) : null);
        InterfaceC9857bdW interfaceC9857bdW2 = (InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class);
        Intrinsics.copydefault(bigDecimal2);
        return LuaValue.rString(interfaceC9857bdW2.AEQbTJ(bigDecimal2, i, i3, z2, displaySignAEQbTJ, roundingModeEZpvd));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x0011, B:13:0x001c, B:15:0x0025, B:17:0x002b, B:19:0x0034, B:21:0x003a, B:22:0x0042, B:10:0x0017), top: B:26:0x0003 }] */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LuaValue[] localizedLargeFiatAmount(LuaValue[] luaValueArr) {
        BigDecimal bigDecimalEZpvd;
        String javaString;
        if (luaValueArr != null) {
            try {
                LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                if (luaValue == null || (javaString = luaValue.toJavaString()) == null || (bigDecimalEZpvd = C33129mqd.EZpvd(javaString)) == null) {
                    bigDecimalEZpvd = BigDecimal.ZERO;
                }
            } catch (Throwable unused) {
                InterfaceC9857bdW interfaceC9857bdW = (InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class);
                BigDecimal bigDecimal = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
                return LuaValue.rString(InterfaceC9857bdW.TaskDescription.localizeLargeValueStrategy$default(interfaceC9857bdW, bigDecimal, null, null, null, 14, null));
            }
        }
        DisplaySign displaySignAEQbTJ = AEQbTJ(luaValueArr != null ? (LuaValue) yDV.gEmmrt(luaValueArr, 1) : null);
        RoundingMode roundingModeEZpvd = EZpvd(luaValueArr != null ? (LuaValue) yDV.gEmmrt(luaValueArr, 2) : null);
        CurrencyDisplayStyle currencyDisplayStyleKWHzl = KWHzl(luaValueArr != null ? (LuaValue) yDV.gEmmrt(luaValueArr, 3) : null);
        InterfaceC9857bdW interfaceC9857bdW2 = (InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class);
        Intrinsics.copydefault(bigDecimalEZpvd);
        return LuaValue.rString(interfaceC9857bdW2.copydefault(bigDecimalEZpvd, OLrzqt(bigDecimalEZpvd, displaySignAEQbTJ), currencyDisplayStyleKWHzl, roundingModeEZpvd));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x0011, B:13:0x001c, B:15:0x0025, B:17:0x002b, B:18:0x0033, B:10:0x0017), top: B:22:0x0003 }] */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LuaValue[] localizedLargeNumber(LuaValue[] luaValueArr) {
        BigDecimal bigDecimalEZpvd;
        String javaString;
        if (luaValueArr != null) {
            try {
                LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                if (luaValue == null || (javaString = luaValue.toJavaString()) == null || (bigDecimalEZpvd = C33129mqd.EZpvd(javaString)) == null) {
                    bigDecimalEZpvd = BigDecimal.ZERO;
                }
            } catch (Throwable unused) {
                InterfaceC9857bdW interfaceC9857bdW = (InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class);
                BigDecimal bigDecimal = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
                return LuaValue.rString(InterfaceC9857bdW.TaskDescription.localizeSpecificNumber$default(interfaceC9857bdW, bigDecimal, null, null, 6, null));
            }
        }
        DisplaySign displaySignAEQbTJ = AEQbTJ(luaValueArr != null ? (LuaValue) yDV.gEmmrt(luaValueArr, 1) : null);
        RoundingMode roundingModeEZpvd = EZpvd(luaValueArr != null ? (LuaValue) yDV.gEmmrt(luaValueArr, 2) : null);
        InterfaceC9857bdW interfaceC9857bdW2 = (InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class);
        Intrinsics.copydefault(bigDecimalEZpvd);
        return LuaValue.rString(interfaceC9857bdW2.AEQbTJ(bigDecimalEZpvd, OLrzqt(bigDecimalEZpvd, displaySignAEQbTJ), roundingModeEZpvd));
    }

    public final RoundingMode EZpvd(LuaValue luaValue) {
        Enum r11;
        Enum r0 = RoundingMode.DOWN;
        Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(0, RoundingMode.CEILING), C56390yDp.OLrzqt(1, RoundingMode.FLOOR), C56390yDp.OLrzqt(2, r0), C56390yDp.OLrzqt(3, RoundingMode.UP), C56390yDp.OLrzqt(4, RoundingMode.HALF_EVEN), C56390yDp.OLrzqt(5, RoundingMode.HALF_DOWN), C56390yDp.OLrzqt(6, RoundingMode.HALF_UP));
        if (luaValue != null && (r11 = (Enum) mapGEmmrt.get(Integer.valueOf(luaValue.toInt()))) != null) {
            r0 = r11;
        }
        Intrinsics.checkNotNullExpressionValue(r0, "");
        return (RoundingMode) r0;
    }

    public final DisplaySign AEQbTJ(LuaValue luaValue) {
        Enum r6;
        Enum r0 = DisplaySign.AUTO;
        Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(0, r0), C56390yDp.OLrzqt(1, DisplaySign.EXCEPT_ZERO), C56390yDp.OLrzqt(2, DisplaySign.ALWAYS));
        if (luaValue != null && (r6 = (Enum) mapGEmmrt.get(Integer.valueOf(luaValue.toInt()))) != null) {
            r0 = r6;
        }
        return (DisplaySign) r0;
    }

    public final CurrencyDisplayStyle KWHzl(LuaValue luaValue) {
        Enum r5;
        Enum r0 = CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY;
        Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(0, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX), C56390yDp.OLrzqt(1, CurrencyDisplayStyle.CURRENCY_CODE_SUFFIX), C56390yDp.OLrzqt(2, r0));
        if (luaValue != null && (r5 = (Enum) mapGEmmrt.get(Integer.valueOf(luaValue.toInt()))) != null) {
            r0 = r5;
        }
        return (CurrencyDisplayStyle) r0;
    }

    public final CurrencyPrependSign OLrzqt(BigDecimal bigDecimal, DisplaySign displaySign) {
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        boolean z = bigDecimal.compareTo(bigDecimal2) < 0;
        boolean z2 = bigDecimal.compareTo(bigDecimal2) == 0;
        int i = TaskDescription.EZpvd[displaySign.ordinal()];
        if (i == 1) {
            if (z) {
                return CurrencyPrependSign.CURRENCY_SIGN_MINUS;
            }
            return CurrencyPrependSign.CURRENCY_SIGN_NONE;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return CurrencyPrependSign.CURRENCY_SIGN_MINUS;
        }
        if (z2) {
            return CurrencyPrependSign.CURRENCY_SIGN_NONE;
        }
        return CurrencyPrependSign.CURRENCY_SIGN_PLUS;
    }
}
