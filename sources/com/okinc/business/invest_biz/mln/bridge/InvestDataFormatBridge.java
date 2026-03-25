package com.okinc.business.invest_biz.mln.bridge;

import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C27492jwH;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes6.dex */
@LuaClass
public final class InvestDataFormatBridge {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.mln.bridge.InvestDataFormatBridge.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LuaValue[] percentNumberDisplay(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        String javaString;
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length == 0 || (luaValue = luaValueArr[0]) == null) {
                    javaString = "";
                } else {
                    Intrinsics.copydefault(luaValue);
                    javaString = luaValue.toJavaString();
                }
            } catch (Throwable unused) {
                LuaValue[] luaValueArrRString = LuaValue.rString("");
                Intrinsics.checkNotNullExpressionValue(luaValueArrRString, "");
                return luaValueArrRString;
            }
        }
        LuaValue[] luaValueArrRString2 = LuaValue.rString(C27492jwH.OLrzqt.copydefault(javaString));
        Intrinsics.checkNotNullExpressionValue(luaValueArrRString2, "");
        return luaValueArrRString2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LuaValue[] formatCurrencyDataWithKMB(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        String javaString;
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length == 0 || (luaValue = luaValueArr[0]) == null) {
                    javaString = "";
                } else {
                    Intrinsics.copydefault(luaValue);
                    javaString = luaValue.toJavaString();
                }
            } catch (Throwable unused) {
                LuaValue[] luaValueArrRString = LuaValue.rString("");
                Intrinsics.checkNotNullExpressionValue(luaValueArrRString, "");
                return luaValueArrRString;
            }
        }
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        Intrinsics.copydefault((Object) javaString);
        LuaValue[] luaValueArrRString2 = LuaValue.rString(C27492jwH.formatCurrencyData$default(c27492jwH, javaString, null, null, Boolean.TRUE, 6, null));
        Intrinsics.checkNotNullExpressionValue(luaValueArrRString2, "");
        return luaValueArrRString2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LuaValue[] formatCurrencyDataWithMB(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        String javaString;
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length == 0 || (luaValue = luaValueArr[0]) == null) {
                    javaString = "";
                } else {
                    Intrinsics.copydefault(luaValue);
                    javaString = luaValue.toJavaString();
                }
            } catch (Throwable unused) {
                LuaValue[] luaValueArrRString = LuaValue.rString("");
                Intrinsics.checkNotNullExpressionValue(luaValueArrRString, "");
                return luaValueArrRString;
            }
        }
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        Intrinsics.copydefault((Object) javaString);
        LuaValue[] luaValueArrRString2 = LuaValue.rString(C27492jwH.formatCurrencyData$default(c27492jwH, javaString, null, null, null, 14, null));
        Intrinsics.checkNotNullExpressionValue(luaValueArrRString2, "");
        return luaValueArrRString2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LuaValue[] formatCurrencyDataWithoutKMB(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        String javaString;
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length == 0 || (luaValue = luaValueArr[0]) == null) {
                    javaString = "";
                } else {
                    Intrinsics.copydefault(luaValue);
                    javaString = luaValue.toJavaString();
                }
            } catch (Throwable unused) {
                LuaValue[] luaValueArrRString = LuaValue.rString("");
                Intrinsics.checkNotNullExpressionValue(luaValueArrRString, "");
                return luaValueArrRString;
            }
        }
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        Intrinsics.copydefault((Object) javaString);
        LuaValue[] luaValueArrRString2 = LuaValue.rString(c27492jwH.OLrzqt(javaString));
        Intrinsics.checkNotNullExpressionValue(luaValueArrRString2, "");
        return luaValueArrRString2;
    }
}
