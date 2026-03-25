package com.okinc.crcore.shared.service.mln;

import com.appsflyer.AppsFlyerProperties;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.crcore.shared.formatter.AmountDisplayType;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.p2p.api.OtcExtraKeys;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31775mDl;
import o.C33129mqd;
import o.C43251rlk;
import o.C56390yDp;
import o.C56424yEw;
import o.C7910asj;
import o.InterfaceC31780mDq;
import o.pUU;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes8.dex */
@LuaClass
public final class OKCRCoreBridge {
    public static final int $stable = 0;
    private static final String DEFAULT_EMPTY_STRING = "";
    private static final int DEFAULT_PRECISION = 8;
    public static final String LUA_CLASS_NAME = "OKCRCoreBridge";
    public static final Activity Companion = new Activity(null);
    private static final Map<Integer, AmountDisplayType> AMOUNT_DISPLAY_TYPE_MAP = C56424yEw.gEmmrt(C56390yDp.OLrzqt(0, AmountDisplayType.DETAIL), C56390yDp.OLrzqt(1, AmountDisplayType.INPUT), C56390yDp.OLrzqt(2, AmountDisplayType.OVERVIEW), C56390yDp.OLrzqt(3, AmountDisplayType.CASH));
    private static final Map<Integer, RoundingMode> ROUNDING_MODE_MAP = C56424yEw.gEmmrt(C56390yDp.OLrzqt(0, RoundingMode.DOWN), C56390yDp.OLrzqt(1, RoundingMode.UP), C56390yDp.OLrzqt(2, RoundingMode.FLOOR), C56390yDp.OLrzqt(3, RoundingMode.CEILING), C56390yDp.OLrzqt(4, RoundingMode.HALF_UP), C56390yDp.OLrzqt(5, RoundingMode.HALF_DOWN), C56390yDp.OLrzqt(6, RoundingMode.HALF_EVEN));
    private static final Map<Integer, DisplaySign> DISPLAY_SIGN_MAP = C56424yEw.gEmmrt(C56390yDp.OLrzqt(0, DisplaySign.AUTO), C56390yDp.OLrzqt(1, DisplaySign.EXCEPT_ZERO));

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.service.mln.OKCRCoreBridge.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final AmountDisplayType OLrzqt(Object obj) {
            AmountDisplayType amountDisplayType = (AmountDisplayType) OKCRCoreBridge.AMOUNT_DISPLAY_TYPE_MAP.get(Integer.valueOf(C33129mqd.AhwBna(obj)));
            return amountDisplayType == null ? AmountDisplayType.DETAIL : amountDisplayType;
        }

        public final RoundingMode AEQbTJ(Object obj) {
            RoundingMode roundingMode = (RoundingMode) OKCRCoreBridge.ROUNDING_MODE_MAP.get(Integer.valueOf(C33129mqd.AhwBna(obj)));
            return roundingMode == null ? RoundingMode.DOWN : roundingMode;
        }

        public final DisplaySign copydefault(Object obj) {
            DisplaySign displaySign = (DisplaySign) OKCRCoreBridge.DISPLAY_SIGN_MAP.get(Integer.valueOf(C33129mqd.AhwBna(obj)));
            return displaySign == null ? DisplaySign.AUTO : displaySign;
        }
    }

    private final C31775mDl parseAmountFormatRequest(LuaValue[] luaValueArr) {
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        if (luaValue == null) {
            return null;
        }
        Map mapAEQbTJ = C7910asj.AEQbTJ(luaValue.toLuaTable());
        Intrinsics.checkNotNullExpressionValue(mapAEQbTJ, "");
        if (mapAEQbTJ.get(AppsFlyerProperties.CURRENCY_CODE) == null || mapAEQbTJ.get(OtcExtraKeys.AMOUNT) == null) {
            return null;
        }
        String strGEmmrt = C33129mqd.gEmmrt(mapAEQbTJ.get(AppsFlyerProperties.CURRENCY_CODE));
        Activity activity = Companion;
        AmountDisplayType amountDisplayTypeOLrzqt = activity.OLrzqt(mapAEQbTJ.get("amountDisplayType"));
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(mapAEQbTJ.get(OtcExtraKeys.AMOUNT));
        Object obj = mapAEQbTJ.get("smallValueHandlingRequired");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        return new C31775mDl(strGEmmrt, amountDisplayTypeOLrzqt, bigDecimalEZpvd, bool != null ? bool.booleanValue() : false, activity.AEQbTJ(mapAEQbTJ.get("roundingMode")), activity.copydefault(mapAEQbTJ.get("signDisplay")));
    }

    @LuaBridge
    public final LuaNumber getPrecision(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length == 0) {
            LuaNumber luaNumberValueOf = LuaNumber.valueOf(8);
            Intrinsics.checkNotNullExpressionValue(luaNumberValueOf, "");
            return luaNumberValueOf;
        }
        try {
            C31775mDl amountFormatRequest = parseAmountFormatRequest(luaValueArr);
            if (amountFormatRequest == null) {
                LuaNumber luaNumberValueOf2 = LuaNumber.valueOf(8);
                Intrinsics.checkNotNullExpressionValue(luaNumberValueOf2, "");
                return luaNumberValueOf2;
            }
            LuaNumber luaNumberValueOf3 = LuaNumber.valueOf(((InterfaceC31780mDq) C43251rlk.copydefault(InterfaceC31780mDq.class)).AEQbTJ(amountFormatRequest));
            Intrinsics.copydefault(luaNumberValueOf3);
            return luaNumberValueOf3;
        } catch (Exception e) {
            pUU.copydefault(LUA_CLASS_NAME, "getPrecision: " + e.getMessage());
            LuaNumber luaNumberValueOf4 = LuaNumber.valueOf(8);
            Intrinsics.copydefault(luaNumberValueOf4);
            return luaNumberValueOf4;
        }
    }

    @LuaBridge
    public final LuaValue formatAmount(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length == 0) {
            LuaValue luaValueCopydefault = LuaString.copydefault("");
            Intrinsics.checkNotNullExpressionValue(luaValueCopydefault, "");
            return luaValueCopydefault;
        }
        try {
            C31775mDl amountFormatRequest = parseAmountFormatRequest(luaValueArr);
            if (amountFormatRequest == null) {
                LuaValue luaValueCopydefault2 = LuaString.copydefault("");
                Intrinsics.checkNotNullExpressionValue(luaValueCopydefault2, "");
                return luaValueCopydefault2;
            }
            LuaValue luaValueCopydefault3 = LuaString.copydefault(((InterfaceC31780mDq) C43251rlk.copydefault(InterfaceC31780mDq.class)).KWHzl(amountFormatRequest));
            Intrinsics.copydefault(luaValueCopydefault3);
            return luaValueCopydefault3;
        } catch (Exception e) {
            pUU.copydefault(LUA_CLASS_NAME, "formatAmount: " + e.getMessage());
            LuaValue luaValueCopydefault4 = LuaString.copydefault("");
            Intrinsics.copydefault(luaValueCopydefault4);
            return luaValueCopydefault4;
        }
    }

    @LuaBridge
    public final LuaValue formatAmountWithCode(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length == 0) {
            LuaValue luaValueCopydefault = LuaString.copydefault("");
            Intrinsics.checkNotNullExpressionValue(luaValueCopydefault, "");
            return luaValueCopydefault;
        }
        try {
            C31775mDl amountFormatRequest = parseAmountFormatRequest(luaValueArr);
            if (amountFormatRequest == null) {
                LuaValue luaValueCopydefault2 = LuaString.copydefault("");
                Intrinsics.checkNotNullExpressionValue(luaValueCopydefault2, "");
                return luaValueCopydefault2;
            }
            LuaValue luaValueCopydefault3 = LuaString.copydefault(((InterfaceC31780mDq) C43251rlk.copydefault(InterfaceC31780mDq.class)).copydefault(amountFormatRequest));
            Intrinsics.copydefault(luaValueCopydefault3);
            return luaValueCopydefault3;
        } catch (Exception e) {
            pUU.copydefault(LUA_CLASS_NAME, "formatAmountWithCode: " + e.getMessage());
            LuaValue luaValueCopydefault4 = LuaString.copydefault("");
            Intrinsics.copydefault(luaValueCopydefault4);
            return luaValueCopydefault4;
        }
    }
}
