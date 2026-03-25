package o;

import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.track.EventTrackingRouteMode;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.bean.track.TrackPageName;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC30614leV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.leU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30613leU implements InterfaceC30614leV {
    public final C19700gMb copydefault;

    /* JADX INFO: renamed from: o.leU$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PresetRouteType.values().length];
            try {
                iArr[PresetRouteType.RouteTypeAuto.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PresetRouteType.RouteTypeMev.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PresetRouteType.RouteTypeFast.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[SlippageMode.values().length];
            try {
                iArr2[SlippageMode.Fixed.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[SlippageMode.Dynamic.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            OLrzqt = iArr2;
        }
    }

    @yCM
    public C30613leU(@NotNull C19700gMb c19700gMb) {
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        this.copydefault = c19700gMb;
    }

    @Override // o.InterfaceC30614leV
    public void OLrzqt(@NotNull java.lang.String str, @NotNull final TrackOrderType trackOrderType, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final TradeMode tradeMode, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackOrderType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tradeMode, "");
        final java.lang.String strEZpvd = EZpvd(str);
        final java.lang.String str4 = this.copydefault.AYXKKw() ? "yes" : "no";
        C32866mlf.onEvent$default(tradeMode.isCopyTrading() ? "DEXTrade_CopyTrade_BuySellConfig_View" : "DEXTrade_Setting_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.leS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30613leU.AEQbTJ(strEZpvd, trackOrderType, str2, str4, this, str3, tradeMode, i, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, TrackOrderType trackOrderType, java.lang.String str2, java.lang.String str3, C30613leU c30613leU, java.lang.String str4, TradeMode tradeMode, int i, EventParamsList eventParamsList) {
        java.lang.String pageName;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "business_type", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.CRYPTO_ORDER_TYPE, trackOrderType.getType(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_tee", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "preset_or_once_off", DexTrackEventParameter.PresetOrOnceOff.ONCE_OFF.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "setting_type", DexTrackEventParameter.SettingType.PRESET_DETAIL.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "wallet_address", c30613leU.copydefault.KWHzl(str4), false, 4, null);
        if (tradeMode.isCopyTrading()) {
            TrackButtonName trackButtonName = TrackButtonName.COPY_TRADE;
            EventParamsList.put$default(eventParamsList, "module", trackButtonName.getButtonName(), false, 4, null);
            EventParamsList.put$default(eventParamsList, "product_type", trackButtonName.getButtonName(), false, 4, null);
            if (i == 0) {
                pageName = TrackPageName.BUY_CONFIG.getPageName();
            } else {
                pageName = TrackPageName.SELL_CONFIG.getPageName();
            }
            EventParamsList.put$default(eventParamsList, "page_name", pageName, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC30614leV
    public void EZpvd(@NotNull java.lang.String str, @NotNull final TrackOrderType trackOrderType, @NotNull final TradeMode tradeMode, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, final java.lang.String str5, @NotNull final java.util.Map<java.lang.String, java.lang.String> map, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackOrderType, "");
        Intrinsics.checkNotNullParameter(tradeMode, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map, "");
        final java.lang.String strEZpvd = EZpvd(str);
        C32866mlf.onEvent$default(tradeMode.isCopyTrading() ? "DEXTrade_CopyTrade_BuySellConfig_Click" : "DEXTrade_Setting_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.leR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30613leU.EZpvd(strEZpvd, trackOrderType, str2, str4, str5, this, str3, tradeMode, i, map, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, TrackOrderType trackOrderType, java.lang.String str2, java.lang.String str3, java.lang.String str4, C30613leU c30613leU, java.lang.String str5, TradeMode tradeMode, int i, java.util.Map map, EventParamsList eventParamsList) {
        java.lang.String pageName;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "business_type", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.CRYPTO_ORDER_TYPE, trackOrderType.getType(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str3, false, 4, null);
        if (str4 != null) {
            EventParamsList.put$default(eventParamsList, "button_type", str4, false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.CRYPTO_ORDER_TYPE, trackOrderType.getType(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_tee", c30613leU.copydefault.AYXKKw() ? "yes" : "no", false, 4, null);
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "preset_or_once_off", DexTrackEventParameter.PresetOrOnceOff.ONCE_OFF.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "setting_type", DexTrackEventParameter.SettingType.PRESET_DETAIL.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "wallet_address", c30613leU.copydefault.KWHzl(str5), false, 4, null);
        if (tradeMode.isCopyTrading()) {
            TrackButtonName trackButtonName = TrackButtonName.COPY_TRADE;
            EventParamsList.put$default(eventParamsList, "module", trackButtonName.getButtonName(), false, 4, null);
            EventParamsList.put$default(eventParamsList, "product_type", trackButtonName.getButtonName(), false, 4, null);
            if (i == 0) {
                pageName = TrackPageName.BUY_CONFIG.getPageName();
            } else {
                pageName = TrackPageName.SELL_CONFIG.getPageName();
            }
            EventParamsList.put$default(eventParamsList, "page_name", pageName, false, 4, null);
        }
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // o.InterfaceC30614leV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void KWHzl(@NotNull java.lang.String str, @NotNull final TrackOrderType trackOrderType, @NotNull final TradeMode tradeMode, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, final boolean z, PresetRouteType presetRouteType, @NotNull SlippageMode slippageMode, final AdvancedPriorityFeeType advancedPriorityFeeType, @NotNull java.lang.String str5, final int i, @NotNull final java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String mode;
        java.lang.String str6;
        int i2;
        int i3;
        java.lang.String str7;
        java.lang.String value = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackOrderType, "");
        Intrinsics.checkNotNullParameter(tradeMode, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(map, "");
        final java.lang.String strEZpvd = EZpvd(str);
        final java.lang.String str8 = z ? "yes" : "no";
        int i4 = presetRouteType == null ? -1 : Application.EZpvd[presetRouteType.ordinal()];
        if (i4 == 1) {
            mode = EventTrackingRouteMode.Auto.getMode();
        } else if (i4 == 2 || i4 == 3) {
            mode = EventTrackingRouteMode.Manual.getMode();
        } else {
            str6 = "";
            if (presetRouteType != PresetRouteType.RouteTypeAuto) {
                EventTrackingRouteMode.Auto.getMode();
            } else {
                EventTrackingRouteMode.Manual.getMode();
            }
            i2 = presetRouteType != null ? -1 : Application.EZpvd[presetRouteType.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    value = DexTrackEventParameter.EventMevType.ANTI_MEV.getValue();
                } else if (i2 == 3) {
                    value = DexTrackEventParameter.EventMevType.FAST.getValue();
                }
            }
            i3 = Application.OLrzqt[slippageMode.ordinal()];
            if (i3 != 1) {
                str7 = str5;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str7 = "slippage_dynamic";
            }
            final java.lang.String str9 = str6;
            final java.lang.String str10 = value;
            final java.lang.String str11 = str7;
            C32866mlf.onEvent$default(!tradeMode.isCopyTrading() ? "DEXTrade_CopyTrade_BuySellConfigSubmit_Click" : "DEXTrade_Setting_PageSubmit_Click", (TrackChannel[]) null, new Function1() { // from class: o.leY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C30613leU.OLrzqt(strEZpvd, str4, trackOrderType, str2, str8, this, str3, str9, z, str10, str11, advancedPriorityFeeType, tradeMode, i, map, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            if (tradeMode.isCopyTrading()) {
                return;
            }
            InterfaceC30614leV.ActionBar.trackSettingsClick$default(this, str, trackOrderType, tradeMode, str2, str3, str4, null, map, i, 64, null);
            return;
        }
        str6 = mode;
        if (presetRouteType != PresetRouteType.RouteTypeAuto) {
        }
        if (presetRouteType != null) {
        }
        if (i2 != 1) {
        }
        i3 = Application.OLrzqt[slippageMode.ordinal()];
        if (i3 != 1) {
        }
        final java.lang.String str92 = str6;
        final java.lang.String str102 = value;
        final java.lang.String str112 = str7;
        C32866mlf.onEvent$default(!tradeMode.isCopyTrading() ? "DEXTrade_CopyTrade_BuySellConfigSubmit_Click" : "DEXTrade_Setting_PageSubmit_Click", (TrackChannel[]) null, new Function1() { // from class: o.leY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30613leU.OLrzqt(strEZpvd, str4, trackOrderType, str2, str8, this, str3, str92, z, str102, str112, advancedPriorityFeeType, tradeMode, i, map, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (tradeMode.isCopyTrading()) {
        }
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, TrackOrderType trackOrderType, java.lang.String str3, java.lang.String str4, C30613leU c30613leU, java.lang.String str5, java.lang.String str6, boolean z, java.lang.String str7, java.lang.String str8, AdvancedPriorityFeeType advancedPriorityFeeType, TradeMode tradeMode, int i, java.util.Map map, EventParamsList eventParamsList) {
        java.lang.String pageName;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "business_type", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.CRYPTO_ORDER_TYPE, trackOrderType.getType(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "preset_or_once_off", DexTrackEventParameter.PresetOrOnceOff.ONCE_OFF.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "setting_type", DexTrackEventParameter.SettingType.PRESET_DETAIL.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "mev_protection", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "wallet_address", c30613leU.copydefault.KWHzl(str5), false, 4, null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str6) || z) {
            EventParamsList.put$default(eventParamsList, "MEV_route_select", str6, false, 4, null);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str7)) {
            EventParamsList.put$default(eventParamsList, "MEV_route_type", str7, false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "slippage_config", str8, false, 4, null);
        if (advancedPriorityFeeType != null) {
            EventParamsList.put$default(eventParamsList, "gas_amount", advancedPriorityFeeType.name(), false, 4, null);
        }
        if (tradeMode.isCopyTrading()) {
            TrackButtonName trackButtonName = TrackButtonName.COPY_TRADE;
            EventParamsList.put$default(eventParamsList, "module", trackButtonName.getButtonName(), false, 4, null);
            EventParamsList.put$default(eventParamsList, "product_type", trackButtonName.getButtonName(), false, 4, null);
            if (i == 0) {
                pageName = TrackPageName.BUY_CONFIG.getPageName();
            } else {
                pageName = TrackPageName.SELL_CONFIG.getPageName();
            }
            EventParamsList.put$default(eventParamsList, "page_name", pageName, false, 4, null);
        }
        for (Map.Entry entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC30614leV
    public yHO<java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, Unit> AEQbTJ(@NotNull final java.lang.String str, @NotNull final TrackOrderType trackOrderType, @NotNull final TradeMode tradeMode, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackOrderType, "");
        Intrinsics.checkNotNullParameter(tradeMode, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new yHO() { // from class: o.leT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C30613leU.AEQbTJ(this.OLrzqt, str, trackOrderType, tradeMode, str2, str3, i, (java.lang.String) obj, (java.lang.String) obj2, (java.util.Map) obj3);
            }
        };
    }

    public static final Unit AEQbTJ(C30613leU c30613leU, java.lang.String str, TrackOrderType trackOrderType, TradeMode tradeMode, java.lang.String str2, java.lang.String str3, int i, java.lang.String str4, java.lang.String str5, java.util.Map map) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(map, "");
        c30613leU.EZpvd(str, trackOrderType, tradeMode, str2, str3, str4, str5, map, i);
        return Unit.INSTANCE;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "cefi_mode") && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "default_trade")) ? "swap" : "advanced";
    }
}
