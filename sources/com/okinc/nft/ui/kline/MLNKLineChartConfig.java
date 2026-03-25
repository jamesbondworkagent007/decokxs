package com.okinc.nft.ui.kline;

import android.app.Activity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33512mxp;
import o.C35969oKk;
import o.C54819xWm;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC60044zuT
public final class MLNKLineChartConfig extends LuaUserdata<C35969oKk> {
    public static final String LUA_CLASS_NAME = "OKKLineChartConfig";
    public C35969oKk mConfig;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;
    public static final String[] methods = {"setInstId", "setInstType", "setDigits", "setFromType", "setOrientation", "setHideIndicatorSetting", "setShowFullScreen", "setHideSetting", "setShowTradeSetting", "setShowGuide", "setShowLandscape", "setShowVolume", "setHideSubIndicator", "setSupportTradingData", "setCoinVol", "setShowOrder", "setNeedLoadData", "setChartTheme", "setShowTimeCountDown", "setPriceType", "setMaxEfficientDigits", "setAmountDisplaySymbol", "setPositiveColor", "setNegativeColor", "setChartTag", "setMode"};
    private static final String TAG = MLNKLineChart.class.getSimpleName();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMConfig(@NotNull C35969oKk c35969oKk) {
        Intrinsics.checkNotNullParameter(c35969oKk, "");
        this.mConfig = c35969oKk;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.nft.ui.kline.MLNKLineChartConfig.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final C35969oKk getMConfig() {
        C35969oKk c35969oKk = this.mConfig;
        if (c35969oKk != null) {
            return c35969oKk;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @InterfaceC60044zuT
    public MLNKLineChartConfig(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        setMConfig(new C35969oKk("", "", 0, "", 0, false, false, false, false, false, false, false, false, false, 0, false, false, false, false, false, null, 0, null, false, null, null, false, null, null, 0, 0, false, false, false, -12, 3, null));
    }

    @InterfaceC60044zuT
    public final LuaValue[] setPositiveColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C35969oKk mConfig = getMConfig();
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
        mConfig.gEmmrt(C33512mxp.tradeRiseAlternative$default(c33512mxp, activityAEQbTJ, 0.0f, 2, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setNegativeColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C35969oKk mConfig = getMConfig();
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
        mConfig.EZpvd(C33512mxp.tradeFallAlternative$default(c33512mxp, activityAEQbTJ, 0.0f, 2, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setInstId(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        getMConfig().EZpvd(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setInstType(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        getMConfig().gEmmrt(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setDigits(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        getMConfig().AEQbTJ(luaValue.toInt());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setFromType(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        getMConfig().OLrzqt(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setOrientation(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        getMConfig().OLrzqt(luaValue.toInt());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setHideIndicatorSetting(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        getMConfig().AEQbTJ(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setShowFullScreen(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        getMConfig().KWHzl(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setHideSetting(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        getMConfig().OLrzqt(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setShowTradeSetting(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        getMConfig().djBIcL(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setShowGuide(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        getMConfig().valueOf(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setShowLandscape(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        getMConfig().gEmmrt(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setShowVolume(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        getMConfig().DbNXlk(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setHideSubIndicator(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        getMConfig().copydefault(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSupportTradingData(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        getMConfig().values(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setCoinVol(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        getMConfig().copydefault(luaValue.toInt());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setShowOrder(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        getMConfig().AYXKKw(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setNeedLoadData(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        getMConfig().EZpvd(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setChartTheme(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        getMConfig().KWHzl(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setShowTimeCountDown(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        getMConfig().AhwBna(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setPriceType(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        getMConfig().valueOf(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setMaxEfficientDigits(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        getMConfig().KWHzl(luaValue.toInt());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setAmountDisplaySymbol(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        getMConfig().AEQbTJ(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setChartTag(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        getMConfig().copydefault(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setMode(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        getMConfig().AhwBna(javaString);
        return null;
    }
}
