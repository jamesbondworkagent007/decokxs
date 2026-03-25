package com.okinc.business.featureflag;

import com.okinc.components.track.amplitude.AmplitudeName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.DebugKt;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class FeatureFlag {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FeatureFlag[] $VALUES;
    public static final FeatureFlag ADVANCED_MODE;
    public static final FeatureFlag ADVANCED_MODE_V6;
    public static final FeatureFlag AUTO_CONFIRM_EOA_ENABLED;
    public static final FeatureFlag AUTO_CONFIRM_SA_ENABLED;
    public static final FeatureFlag COPY_TRADING;
    public static final FeatureFlag DEX_CORE_TOKEN_LIST;
    public static final FeatureFlag DEX_CORE_TRADE_CHAIN_LIST;
    public static final FeatureFlag DEX_CORE_TRADE_PRESET_RESET;
    public static final FeatureFlag DEX_CORE_TRADE_PRESET_SAVE;
    public static final FeatureFlag DEX_DISABLE_BASE64;
    public static final FeatureFlag DEX_MARKET_DATA_RUST;
    public static final FeatureFlag DEX_TRADE_BRIDGE_APPROVE_DATA;
    public static final FeatureFlag DEX_TRADE_BRIDGE_PLATFORM_CHECK;
    public static final FeatureFlag DEX_TRADE_QUICK_MODE_PRE_LOAD;
    public static final FeatureFlag DEX_TRADE_SA_MARKET_ORDER_USE_EOA_ROUTE;
    public static final FeatureFlag DEX_TRADE_SUPPORT_BATCH_BROADCAST;
    public static final FeatureFlag DEX_TRADE_SUPPORT_DAG_ROUTER;
    public static final FeatureFlag E2E_DEX_DISABLE_DYNAMIC_UI;
    public static final FeatureFlag E2E_DEX_DISABLE_POPUPS_COPY_TRADING_BUY_SETTINGS_GUIDE;
    public static final FeatureFlag E2E_DEX_DISABLE_POPUPS_MEMEFUN_SWIPE_GUIDE;
    public static final FeatureFlag E2E_DEX_DISABLE_POPUPS_MEME_GUIDANCE;
    public static final FeatureFlag E2E_DEX_DISABLE_POPUPS_SIGNAL_DISCLAIMER;
    public static final FeatureFlag E2E_DEX_DISABLE_POPUPS_TRADE_MODE_GUIDE;
    public static final FeatureFlag E2E_DEX_DISABLE_POPUPS_VIBES_DISCLAIMER;
    public static final FeatureFlag E2E_DEX_DISABLE_POPUPS_WATCHLIST_GROUP_GUIDE;
    public static final FeatureFlag FD_PRELOAD_DISABLED;
    public static final FeatureFlag SCANNER_DISABLE_ENTRY_POINT;
    public static final FeatureFlag SCANNER_DISABLE_TAB_SWIPE;
    public static final FeatureFlag WEB3_DEX_TRADE_SAVING_SURPLUS;
    private final AmplitudeName amplitudeName;
    private final String key;
    private final String treatment;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FeatureFlag[] $values() {
        return new FeatureFlag[]{ADVANCED_MODE, DEX_TRADE_SUPPORT_DAG_ROUTER, DEX_CORE_TRADE_PRESET_SAVE, DEX_CORE_TRADE_PRESET_RESET, DEX_CORE_TRADE_CHAIN_LIST, DEX_CORE_TOKEN_LIST, DEX_DISABLE_BASE64, COPY_TRADING, ADVANCED_MODE_V6, DEX_TRADE_QUICK_MODE_PRE_LOAD, DEX_TRADE_SUPPORT_BATCH_BROADCAST, DEX_TRADE_BRIDGE_APPROVE_DATA, DEX_TRADE_BRIDGE_PLATFORM_CHECK, SCANNER_DISABLE_ENTRY_POINT, SCANNER_DISABLE_TAB_SWIPE, WEB3_DEX_TRADE_SAVING_SURPLUS, DEX_MARKET_DATA_RUST, E2E_DEX_DISABLE_POPUPS_TRADE_MODE_GUIDE, E2E_DEX_DISABLE_POPUPS_WATCHLIST_GROUP_GUIDE, E2E_DEX_DISABLE_POPUPS_MEMEFUN_SWIPE_GUIDE, E2E_DEX_DISABLE_POPUPS_SIGNAL_DISCLAIMER, E2E_DEX_DISABLE_POPUPS_MEME_GUIDANCE, E2E_DEX_DISABLE_POPUPS_COPY_TRADING_BUY_SETTINGS_GUIDE, E2E_DEX_DISABLE_POPUPS_VIBES_DISCLAIMER, E2E_DEX_DISABLE_DYNAMIC_UI, DEX_TRADE_SA_MARKET_ORDER_USE_EOA_ROUTE, AUTO_CONFIRM_EOA_ENABLED, AUTO_CONFIRM_SA_ENABLED, FD_PRELOAD_DISABLED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FeatureFlag> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AmplitudeName getAmplitudeName() {
        return this.amplitudeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTreatment() {
        return this.treatment;
    }

    private FeatureFlag(String str, int i, String str2, String str3, AmplitudeName amplitudeName) {
        this.key = str2;
        this.treatment = str3;
        this.amplitudeName = amplitudeName;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 int)
  (r9v0 java.lang.String)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0004: SGET  A[WRAPPED] kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_ON java.lang.String) : (r10v0 java.lang.String))
  (wrap:com.okinc.components.track.amplitude.AmplitudeName:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.components.track.amplitude.AmplitudeName:0x000b: SGET  A[WRAPPED] (LINE:8) com.okinc.components.track.amplitude.AmplitudeName.WEB3 com.okinc.components.track.amplitude.AmplitudeName) : (r11v0 com.okinc.components.track.amplitude.AmplitudeName))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, com.okinc.components.track.amplitude.AmplitudeName):void (m)] (LINE:5) call: com.okinc.business.featureflag.FeatureFlag.<init>(java.lang.String, int, java.lang.String, java.lang.String, com.okinc.components.track.amplitude.AmplitudeName):void type: THIS */
    public /* synthetic */ FeatureFlag(String str, int i, String str2, String str3, AmplitudeName amplitudeName, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? DebugKt.DEBUG_PROPERTY_VALUE_ON : str3, (i2 & 4) != 0 ? AmplitudeName.WEB3 : amplitudeName);
    }

    static {
        AmplitudeName amplitudeName = AmplitudeName.CEFI;
        ADVANCED_MODE = new FeatureFlag("ADVANCED_MODE", 0, "feature_dex_advanced_mode", "treatment", amplitudeName);
        DEX_TRADE_SUPPORT_DAG_ROUTER = new FeatureFlag("DEX_TRADE_SUPPORT_DAG_ROUTER", 1, "dex_trade_support_dag_router", null, null, 6, null);
        DEX_CORE_TRADE_PRESET_SAVE = new FeatureFlag("DEX_CORE_TRADE_PRESET_SAVE", 2, "web3_mobile_4_0_dex_trade_preset_save", null, null, 6, null);
        String str = null;
        int i = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        DEX_CORE_TRADE_PRESET_RESET = new FeatureFlag("DEX_CORE_TRADE_PRESET_RESET", 3, "web3_mobile_4_0_dex_trade_preset_reset", str, 0 == true ? 1 : 0, i, defaultConstructorMarker);
        String str2 = null;
        int i2 = 6;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        DEX_CORE_TRADE_CHAIN_LIST = new FeatureFlag("DEX_CORE_TRADE_CHAIN_LIST", 4, "web3_mobile_4_0_dex_trade_chainlist", str2, 0 == true ? 1 : 0, i2, defaultConstructorMarker2);
        DEX_CORE_TOKEN_LIST = new FeatureFlag("DEX_CORE_TOKEN_LIST", 5, "web3_mobile_4_0_dex_token_list", str, 0 == true ? 1 : 0, i, defaultConstructorMarker);
        DEX_DISABLE_BASE64 = new FeatureFlag("DEX_DISABLE_BASE64", 6, "dex_meme_pump_disable_base_64", str2, 0 == true ? 1 : 0, i2, defaultConstructorMarker2);
        COPY_TRADING = new FeatureFlag("COPY_TRADING", 7, "web3_mobile_dex_copy_trading_entrance", "true", 0 == true ? 1 : 0, 4, defaultConstructorMarker);
        ADVANCED_MODE_V6 = new FeatureFlag("ADVANCED_MODE_V6", 8, "dex_trade_flow_support_advance", str2, 0 == true ? 1 : 0, i2, defaultConstructorMarker2);
        String str3 = null;
        int i3 = 6;
        DEX_TRADE_QUICK_MODE_PRE_LOAD = new FeatureFlag("DEX_TRADE_QUICK_MODE_PRE_LOAD", 9, "dex_trade_quick_mode_pre_load", str3, 0 == true ? 1 : 0, i3, defaultConstructorMarker);
        DEX_TRADE_SUPPORT_BATCH_BROADCAST = new FeatureFlag("DEX_TRADE_SUPPORT_BATCH_BROADCAST", 10, "web3_mobile_dex_support_batch_broadcast", str2, 0 == true ? 1 : 0, i2, defaultConstructorMarker2);
        DEX_TRADE_BRIDGE_APPROVE_DATA = new FeatureFlag("DEX_TRADE_BRIDGE_APPROVE_DATA", 11, "web3_mobile_4_0_dex_trade_bridge_approve", str3, 0 == true ? 1 : 0, i3, defaultConstructorMarker);
        DEX_TRADE_BRIDGE_PLATFORM_CHECK = new FeatureFlag("DEX_TRADE_BRIDGE_PLATFORM_CHECK", 12, "web3_mobile_4_0_dex_trade_bridge_platform_check", str2, 0 == true ? 1 : 0, i2, defaultConstructorMarker2);
        SCANNER_DISABLE_ENTRY_POINT = new FeatureFlag("SCANNER_DISABLE_ENTRY_POINT", 13, "web3_mobile_dex_scanner_disable_entrance", str3, 0 == true ? 1 : 0, i3, defaultConstructorMarker);
        SCANNER_DISABLE_TAB_SWIPE = new FeatureFlag("SCANNER_DISABLE_TAB_SWIPE", 14, "web3_mobile_dex_scanner_swipe_tabs_disabled", str2, 0 == true ? 1 : 0, i2, defaultConstructorMarker2);
        WEB3_DEX_TRADE_SAVING_SURPLUS = new FeatureFlag("WEB3_DEX_TRADE_SAVING_SURPLUS", 15, "web3_dex_enable_aggregator_saving_surplus", str3, 0 == true ? 1 : 0, i3, defaultConstructorMarker);
        DEX_MARKET_DATA_RUST = new FeatureFlag("DEX_MARKET_DATA_RUST", 16, "web3_mobile_4_0_dex_market_data_rust", str2, 0 == true ? 1 : 0, i2, defaultConstructorMarker2);
        E2E_DEX_DISABLE_POPUPS_TRADE_MODE_GUIDE = new FeatureFlag("E2E_DEX_DISABLE_POPUPS_TRADE_MODE_GUIDE", 17, "e2e_dex_disable_popups_trade_mode_guide", DebugKt.DEBUG_PROPERTY_VALUE_ON, amplitudeName);
        E2E_DEX_DISABLE_POPUPS_WATCHLIST_GROUP_GUIDE = new FeatureFlag("E2E_DEX_DISABLE_POPUPS_WATCHLIST_GROUP_GUIDE", 18, "e2e_dex_disable_popups_watchlist_group_guide", DebugKt.DEBUG_PROPERTY_VALUE_ON, amplitudeName);
        E2E_DEX_DISABLE_POPUPS_MEMEFUN_SWIPE_GUIDE = new FeatureFlag("E2E_DEX_DISABLE_POPUPS_MEMEFUN_SWIPE_GUIDE", 19, "e2e_dex_disable_popups_memefun_swipe_guide", DebugKt.DEBUG_PROPERTY_VALUE_ON, amplitudeName);
        E2E_DEX_DISABLE_POPUPS_SIGNAL_DISCLAIMER = new FeatureFlag("E2E_DEX_DISABLE_POPUPS_SIGNAL_DISCLAIMER", 20, "e2e_dex_disable_popups_signal_disclaimer", DebugKt.DEBUG_PROPERTY_VALUE_ON, amplitudeName);
        E2E_DEX_DISABLE_POPUPS_MEME_GUIDANCE = new FeatureFlag("E2E_DEX_DISABLE_POPUPS_MEME_GUIDANCE", 21, "e2e_dex_disable_popups_meme_guidance", DebugKt.DEBUG_PROPERTY_VALUE_ON, amplitudeName);
        E2E_DEX_DISABLE_POPUPS_COPY_TRADING_BUY_SETTINGS_GUIDE = new FeatureFlag("E2E_DEX_DISABLE_POPUPS_COPY_TRADING_BUY_SETTINGS_GUIDE", 22, "e2e_dex_disable_popups_copy_trading_buy_settings_guide", DebugKt.DEBUG_PROPERTY_VALUE_ON, amplitudeName);
        E2E_DEX_DISABLE_POPUPS_VIBES_DISCLAIMER = new FeatureFlag("E2E_DEX_DISABLE_POPUPS_VIBES_DISCLAIMER", 23, "e2e_dex_disable_popups_vibes_disclaimer", DebugKt.DEBUG_PROPERTY_VALUE_ON, amplitudeName);
        E2E_DEX_DISABLE_DYNAMIC_UI = new FeatureFlag("E2E_DEX_DISABLE_DYNAMIC_UI", 24, "e2e_dex_disable_dynamic_ui", DebugKt.DEBUG_PROPERTY_VALUE_ON, amplitudeName);
        DEX_TRADE_SA_MARKET_ORDER_USE_EOA_ROUTE = new FeatureFlag("DEX_TRADE_SA_MARKET_ORDER_USE_EOA_ROUTE", 25, "web3_dex_sa_market_order_use_eoa_route", 0 == true ? 1 : 0, null, 6, null);
        String str4 = null;
        AmplitudeName amplitudeName2 = null;
        int i4 = 6;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        AUTO_CONFIRM_EOA_ENABLED = new FeatureFlag("AUTO_CONFIRM_EOA_ENABLED", 26, "dex_auto_confirm_eoa_enabled", str4, amplitudeName2, i4, defaultConstructorMarker3);
        AUTO_CONFIRM_SA_ENABLED = new FeatureFlag("AUTO_CONFIRM_SA_ENABLED", 27, "dex_auto_confirm_sa_enabled", 0 == true ? 1 : 0, null, 6, null);
        FD_PRELOAD_DISABLED = new FeatureFlag("FD_PRELOAD_DISABLED", 28, "web3_mobile_dex_android_fd_preload_disabled", str4, amplitudeName2, i4, defaultConstructorMarker3);
        FeatureFlag[] featureFlagArr$values = $values();
        $VALUES = featureFlagArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(featureFlagArr$values);
    }

    public static FeatureFlag valueOf(String str) {
        return (FeatureFlag) Enum.valueOf(FeatureFlag.class, str);
    }

    public static FeatureFlag[] values() {
        return (FeatureFlag[]) $VALUES.clone();
    }
}
