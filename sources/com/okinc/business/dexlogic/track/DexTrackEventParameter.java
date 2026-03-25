package com.okinc.business.dexlogic.track;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.invest_biz.data.bean.InvestButtonAction;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import o.C23316hvt;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DexTrackEventParameter {
    public static final DexTrackEventParameter AEQbTJ = new DexTrackEventParameter();

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.Buy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.Sell.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt(boolean z) {
        return z ? "swap" : "cross_chain_swap";
    }

    private DexTrackEventParameter() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class PresetOrOnceOff {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PresetOrOnceOff[] $VALUES;
        public static final PresetOrOnceOff ONCE_OFF = new PresetOrOnceOff("ONCE_OFF", 0, "once_off");
        private final String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PresetOrOnceOff[] $values() {
            return new PresetOrOnceOff[]{ONCE_OFF};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PresetOrOnceOff> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private PresetOrOnceOff(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            PresetOrOnceOff[] presetOrOnceOffArr$values = $values();
            $VALUES = presetOrOnceOffArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(presetOrOnceOffArr$values);
        }

        public static PresetOrOnceOff valueOf(String str) {
            return (PresetOrOnceOff) Enum.valueOf(PresetOrOnceOff.class, str);
        }

        public static PresetOrOnceOff[] values() {
            return (PresetOrOnceOff[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class SettingType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SettingType[] $VALUES;
        private final String value;
        public static final SettingType PRESET_DETAIL = new SettingType("PRESET_DETAIL", 0, "preset_detail");
        public static final SettingType SLIPPAGE = new SettingType("SLIPPAGE", 1, "slippage");
        public static final SettingType LIQUIDITY = new SettingType("LIQUIDITY", 2, "liquidity");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SettingType[] $values() {
            return new SettingType[]{PRESET_DETAIL, SLIPPAGE, LIQUIDITY};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SettingType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private SettingType(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            SettingType[] settingTypeArr$values = $values();
            $VALUES = settingTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(settingTypeArr$values);
        }

        public static SettingType valueOf(String str) {
            return (SettingType) Enum.valueOf(SettingType.class, str);
        }

        public static SettingType[] values() {
            return (SettingType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EventMevType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ EventMevType[] $VALUES;
        public static final EventMevType ANTI_MEV = new EventMevType("ANTI_MEV", 0, "anti_mev");
        public static final EventMevType FAST = new EventMevType("FAST", 1, "fast");
        private final String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ EventMevType[] $values() {
            return new EventMevType[]{ANTI_MEV, FAST};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<EventMevType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private EventMevType(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            EventMevType[] eventMevTypeArr$values = $values();
            $VALUES = eventMevTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(eventMevTypeArr$values);
        }

        public static EventMevType valueOf(String str) {
            return (EventMevType) Enum.valueOf(EventMevType.class, str);
        }

        public static EventMevType[] values() {
            return (EventMevType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class ButtonType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ButtonType[] $VALUES;
        private final String value;
        public static final ButtonType EXPLAIN = new ButtonType("EXPLAIN", 0, "explain");
        public static final ButtonType TRADE = new ButtonType("TRADE", 1, ExtJson.BRC20TYPE_TRADE);
        public static final ButtonType QUICK_BUTTON = new ButtonType("QUICK_BUTTON", 2, "quick_button");
        public static final ButtonType OTHERS = new ButtonType("OTHERS", 3, "others");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ButtonType[] $values() {
            return new ButtonType[]{EXPLAIN, TRADE, QUICK_BUTTON, OTHERS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ButtonType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private ButtonType(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            ButtonType[] buttonTypeArr$values = $values();
            $VALUES = buttonTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(buttonTypeArr$values);
        }

        public static ButtonType valueOf(String str) {
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }

        public static ButtonType[] values() {
            return (ButtonType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ButtonName {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ButtonName[] $VALUES;
        private final String value;
        public static final ButtonName BACK = new ButtonName("BACK", 0, "back");
        public static final ButtonName CLOSE = new ButtonName(InvestButtonAction.ACTION_CALLBACK_CLOSE, 1, EopTrackEvent.CLOSE);
        public static final ButtonName BUY = new ButtonName("BUY", 2, "buy");
        public static final ButtonName SELL = new ButtonName("SELL", 3, "sell");
        public static final ButtonName SWAP = new ButtonName("SWAP", 4, "swap");
        public static final ButtonName LIMIT = new ButtonName("LIMIT", 5, "limit");
        public static final ButtonName LOW = new ButtonName(VerifyDAppDomainUrlResponse.LEVEL_LOW, 6, "low");
        public static final ButtonName MID = new ButtonName("MID", 7, "mid");
        public static final ButtonName HIGH = new ButtonName(VerifyDAppDomainUrlResponse.LEVEL_HIGH, 8, "high");
        public static final ButtonName CUSTOM = new ButtonName("CUSTOM", 9, "custom");
        public static final ButtonName CUSTOM_PERCENTAGE = new ButtonName("CUSTOM_PERCENTAGE", 10, "custom_percentage");
        public static final ButtonName CUSTOM_AMOUNT = new ButtonName("CUSTOM_AMOUNT", 11, "custom_amount");
        public static final ButtonName CONFIRM = new ButtonName("CONFIRM", 12, Web3SecurityTrackEvent.VALUE_CONFIRM);
        public static final ButtonName CANCEL = new ButtonName("CANCEL", 13, OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
        public static final ButtonName FEE_LOW = new ButtonName("FEE_LOW", 14, "fee_low");
        public static final ButtonName FEE_MID = new ButtonName("FEE_MID", 15, "fee_mid");
        public static final ButtonName FEE_HIGH = new ButtonName("FEE_HIGH", 16, "fee_high");
        public static final ButtonName FEE_CUSTOM = new ButtonName("FEE_CUSTOM", 17, "fee_custom");
        public static final ButtonName RESET = new ButtonName("RESET", 18, "reset");
        public static final ButtonName SLIPPAGE = new ButtonName("SLIPPAGE", 19, "slippage");
        public static final ButtonName KLINE = new ButtonName("KLINE", 20, "kline");
        public static final ButtonName MORE = new ButtonName("MORE", 21, "more");
        public static final ButtonName ORDER_HISTORY = new ButtonName("ORDER_HISTORY", 22, "order_history");
        public static final ButtonName FAQ = new ButtonName("FAQ", 23, "faq");
        public static final ButtonName BUY_TAB = new ButtonName("BUY_TAB", 24, "tab_buy");
        public static final ButtonName SELL_TAB = new ButtonName("SELL_TAB", 25, "tab_sell");
        public static final ButtonName TAB_SWAP = new ButtonName("TAB_SWAP", 26, "tab_swap");
        public static final ButtonName TAB_LIMIT = new ButtonName("TAB_LIMIT", 27, "tab_limit");
        public static final ButtonName ADVANCED_TAB = new ButtonName("ADVANCED_TAB", 28, "advanced_tab");
        public static final ButtonName MEME_MODE = new ButtonName("MEME_MODE", 29, "meme_mode");
        public static final ButtonName SHARE = new ButtonName("SHARE", 30, "share");
        public static final ButtonName BACK_UP = new ButtonName("BACK_UP", 31, "back_up");
        public static final ButtonName SELECT_CHAIN = new ButtonName("SELECT_CHAIN", 32, "select_chain");
        public static final ButtonName SERVICE_EXPLAIN = new ButtonName("SERVICE_EXPLAIN", 33, "servicefee_explain");
        public static final ButtonName DIRECTION = new ButtonName("DIRECTION", 34, "Direction");
        public static final ButtonName TIME_EDIT = new ButtonName("TIME_EDIT", 35, "time_edit");
        public static final ButtonName Mev_On = new ButtonName("Mev_On", 36, "mev_on");
        public static final ButtonName Mev_off = new ButtonName("Mev_off", 37, "mev_off");
        public static final ButtonName ON = new ButtonName("ON", 38, DebugKt.DEBUG_PROPERTY_VALUE_ON);
        public static final ButtonName OFF = new ButtonName("OFF", 39, DebugKt.DEBUG_PROPERTY_VALUE_OFF);
        public static final ButtonName MODIFY = new ButtonName("MODIFY", 40, "modify");
        public static final ButtonName BRIDGE_CLAIM_CLICK = new ButtonName("BRIDGE_CLAIM_CLICK", 41, "bridge_claim_click");
        public static final ButtonName REJECT = new ButtonName("REJECT", 42, "reject");
        public static final ButtonName GOTOADVANCED_MODE = new ButtonName("GOTOADVANCED_MODE", 43, "go_to_advanced_mode");
        public static final ButtonName BUTTON_AMT_SETTING = new ButtonName("BUTTON_AMT_SETTING", 44, "button_amt_setting");
        public static final ButtonName TOKEN_FROM = new ButtonName("TOKEN_FROM", 45, "token_from");
        public static final ButtonName RESUME = new ButtonName("RESUME", 46, "resume");
        public static final ButtonName ORDER_DETAIL = new ButtonName("ORDER_DETAIL", 47, "order_detail");
        public static final ButtonName ORDER_STATUS_FILTER = new ButtonName("ORDER_STATUS_FILTER", 48, "order_status_filter");
        public static final ButtonName ORDER_TYPE_FILTER = new ButtonName("ORDER_TYPE_FILTER", 49, "order_type_filter");
        public static final ButtonName OPEN_OR_HISTORY = new ButtonName("OPEN_OR_HISTORY", 50, "open_or_history");
        public static final ButtonName AUTO_CONFIRM = new ButtonName("AUTO_CONFIRM", 51, "auto_confirm");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ButtonName[] $values() {
            return new ButtonName[]{BACK, CLOSE, BUY, SELL, SWAP, LIMIT, LOW, MID, HIGH, CUSTOM, CUSTOM_PERCENTAGE, CUSTOM_AMOUNT, CONFIRM, CANCEL, FEE_LOW, FEE_MID, FEE_HIGH, FEE_CUSTOM, RESET, SLIPPAGE, KLINE, MORE, ORDER_HISTORY, FAQ, BUY_TAB, SELL_TAB, TAB_SWAP, TAB_LIMIT, ADVANCED_TAB, MEME_MODE, SHARE, BACK_UP, SELECT_CHAIN, SERVICE_EXPLAIN, DIRECTION, TIME_EDIT, Mev_On, Mev_off, ON, OFF, MODIFY, BRIDGE_CLAIM_CLICK, REJECT, GOTOADVANCED_MODE, BUTTON_AMT_SETTING, TOKEN_FROM, RESUME, ORDER_DETAIL, ORDER_STATUS_FILTER, ORDER_TYPE_FILTER, OPEN_OR_HISTORY, AUTO_CONFIRM};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ButtonName> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private ButtonName(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            ButtonName[] buttonNameArr$values = $values();
            $VALUES = buttonNameArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(buttonNameArr$values);
        }

        public static ButtonName valueOf(String str) {
            return (ButtonName) Enum.valueOf(ButtonName.class, str);
        }

        public static ButtonName[] values() {
            return (ButtonName[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LeaderBoardButtonName {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ LeaderBoardButtonName[] $VALUES;
        private final String value;
        public static final LeaderBoardButtonName MONITOR_TAB = new LeaderBoardButtonName("MONITOR_TAB", 0, "monitor_tab");
        public static final LeaderBoardButtonName ADDRESS_SOURCES_FILTER = new LeaderBoardButtonName("ADDRESS_SOURCES_FILTER", 1, "address_sources_filter");
        public static final LeaderBoardButtonName SORT_BY_FILTER = new LeaderBoardButtonName("SORT_BY_FILTER", 2, "sort_by_filter");
        public static final LeaderBoardButtonName TIME_WINDOW_FILTER = new LeaderBoardButtonName("TIME_WINDOW_FILTER", 3, "time_window_filter");
        public static final LeaderBoardButtonName CURRENCY_MODE_IS_TOKEN_FILTER_TOGGLE = new LeaderBoardButtonName("CURRENCY_MODE_IS_TOKEN_FILTER_TOGGLE", 4, "currency_mode_is_token_filter_toggle");
        public static final LeaderBoardButtonName FILTER_ICON = new LeaderBoardButtonName("FILTER_ICON", 5, "filter_icon");
        public static final LeaderBoardButtonName FILTER_APPLY = new LeaderBoardButtonName("FILTER_APPLY", 6, "filter_apply_button");
        public static final LeaderBoardButtonName ADDRESS_INFO_CARD = new LeaderBoardButtonName("ADDRESS_INFO_CARD", 7, "address_info_card");
        public static final LeaderBoardButtonName FOLLOW_UNFOLLOW_ICON = new LeaderBoardButtonName("FOLLOW_UNFOLLOW_ICON", 8, "follow_unfollow_icon");
        public static final LeaderBoardButtonName COPY_BUTTON = new LeaderBoardButtonName("COPY_BUTTON", 9, "copy_button");
        public static final LeaderBoardButtonName FOLLOWING_ADDRESS_ICON = new LeaderBoardButtonName("FOLLOWING_ADDRESS_ICON", 10, "following_addresses_icon");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ LeaderBoardButtonName[] $values() {
            return new LeaderBoardButtonName[]{MONITOR_TAB, ADDRESS_SOURCES_FILTER, SORT_BY_FILTER, TIME_WINDOW_FILTER, CURRENCY_MODE_IS_TOKEN_FILTER_TOGGLE, FILTER_ICON, FILTER_APPLY, ADDRESS_INFO_CARD, FOLLOW_UNFOLLOW_ICON, COPY_BUTTON, FOLLOWING_ADDRESS_ICON};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<LeaderBoardButtonName> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private LeaderBoardButtonName(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            LeaderBoardButtonName[] leaderBoardButtonNameArr$values = $values();
            $VALUES = leaderBoardButtonNameArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(leaderBoardButtonNameArr$values);
        }

        public static LeaderBoardButtonName valueOf(String str) {
            return (LeaderBoardButtonName) Enum.valueOf(LeaderBoardButtonName.class, str);
        }

        public static LeaderBoardButtonName[] values() {
            return (LeaderBoardButtonName[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MonitorButtonName {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ MonitorButtonName[] $VALUES;
        private final String value;
        public static final MonitorButtonName LEADERBOARD_TAB = new MonitorButtonName("LEADERBOARD_TAB", 0, "leaderboard_tab");
        public static final MonitorButtonName ACTIVITY_TAB = new MonitorButtonName("ACTIVITY_TAB", 1, "activity_tab");
        public static final MonitorButtonName TRENDS_TAB = new MonitorButtonName("TRENDS_TAB", 2, "trends_tab");
        public static final MonitorButtonName ADDRESS_SOURCES_FILTER = new MonitorButtonName("ADDRESS_SOURCES_FILTER", 3, "address_sources_filter");
        public static final MonitorButtonName CURRENCY_MODE_IS_TOKEN_FILTER_TOGGLE = new MonitorButtonName("CURRENCY_MODE_IS_TOKEN_FILTER_TOGGLE", 4, "currency_mode_is_token_filter_toggle");
        public static final MonitorButtonName TIME_WINDOW_FILTER = new MonitorButtonName("TIME_WINDOW_FILTER", 5, "time_window_filter");
        public static final MonitorButtonName FILTER_ICON = new MonitorButtonName("FILTER_ICON", 6, "filter_icon");
        public static final MonitorButtonName ADDRESS_INFO_CARD = new MonitorButtonName("ADDRESS_INFO_CARD", 7, "address_info_card");
        public static final MonitorButtonName QUICK_BUY_BUTTON = new MonitorButtonName("QUICK_BUY_BUTTON", 8, "quick_buy_button");
        public static final MonitorButtonName TOKEN_DETAIL_PAGE_CARD = new MonitorButtonName("TOKEN_DETAIL_PAGE_CARD", 9, "token_detail_page_card");
        public static final MonitorButtonName FILTER_APPLY = new MonitorButtonName("FILTER_APPLY", 10, "filter_apply_button");
        public static final MonitorButtonName FILTER_RESET = new MonitorButtonName("FILTER_RESET", 11, "filter_reset_button");
        public static final MonitorButtonName FOLLOWING_ADDRESS_ICON = new MonitorButtonName("FOLLOWING_ADDRESS_ICON", 12, "following_addresses_icon");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ MonitorButtonName[] $values() {
            return new MonitorButtonName[]{LEADERBOARD_TAB, ACTIVITY_TAB, TRENDS_TAB, ADDRESS_SOURCES_FILTER, CURRENCY_MODE_IS_TOKEN_FILTER_TOGGLE, TIME_WINDOW_FILTER, FILTER_ICON, ADDRESS_INFO_CARD, QUICK_BUY_BUTTON, TOKEN_DETAIL_PAGE_CARD, FILTER_APPLY, FILTER_RESET, FOLLOWING_ADDRESS_ICON};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<MonitorButtonName> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private MonitorButtonName(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            MonitorButtonName[] monitorButtonNameArr$values = $values();
            $VALUES = monitorButtonNameArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(monitorButtonNameArr$values);
        }

        public static MonitorButtonName valueOf(String str) {
            return (MonitorButtonName) Enum.valueOf(MonitorButtonName.class, str);
        }

        public static MonitorButtonName[] values() {
            return (MonitorButtonName[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AddressManagementButtonName {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ AddressManagementButtonName[] $VALUES;
        private final String value;
        public static final AddressManagementButtonName MANAGEMENT = new AddressManagementButtonName("MANAGEMENT", 0, "manage");
        public static final AddressManagementButtonName GROUP_ALL = new AddressManagementButtonName("GROUP_ALL", 1, "group_all");
        public static final AddressManagementButtonName GROUP_CUSTOM = new AddressManagementButtonName("GROUP_CUSTOM", 2, "group_custom");
        public static final AddressManagementButtonName ADDRESS_INFO_CARD = new AddressManagementButtonName("ADDRESS_INFO_CARD", 3, "address_info_card");
        public static final AddressManagementButtonName MANAGE_ALL_GROUPS = new AddressManagementButtonName("MANAGE_ALL_GROUPS", 4, "manage_all_groups");
        public static final AddressManagementButtonName FOLLOWING_ALERT_BUTTON = new AddressManagementButtonName("FOLLOWING_ALERT_BUTTON", 5, "following_alert_button");
        public static final AddressManagementButtonName ADD_ADDRESS = new AddressManagementButtonName("ADD_ADDRESS", 6, "add_address");
        public static final AddressManagementButtonName SAVE_GROUP_NAME = new AddressManagementButtonName("SAVE_GROUP_NAME", 7, "save_group_name");
        public static final AddressManagementButtonName DELETE_GROUP = new AddressManagementButtonName("DELETE_GROUP", 8, "delete_group");
        public static final AddressManagementButtonName CREATE_GROUP = new AddressManagementButtonName("CREATE_GROUP", 9, "create_group");
        public static final AddressManagementButtonName BULK_IMPORT = new AddressManagementButtonName("BULK_IMPORT", 10, "bulk_import");
        public static final AddressManagementButtonName ADD_TO_GROUP = new AddressManagementButtonName("ADD_TO_GROUP", 11, "add_to_group");
        public static final AddressManagementButtonName TURN_ON = new AddressManagementButtonName("TURN_ON", 12, "turn_on");
        public static final AddressManagementButtonName TURN_OFF = new AddressManagementButtonName("TURN_OFF", 13, "turn_off");
        public static final AddressManagementButtonName MOVE = new AddressManagementButtonName("MOVE", 14, "move");
        public static final AddressManagementButtonName UNFOLLOW = new AddressManagementButtonName("UNFOLLOW", 15, "unfollow");
        public static final AddressManagementButtonName SELECT_ALL = new AddressManagementButtonName("SELECT_ALL", 16, "select_all");
        public static final AddressManagementButtonName MANAGE_ALERT_BUTTON = new AddressManagementButtonName("MANAGE_ALERT_BUTTON", 17, "manage_alert_button");
        public static final AddressManagementButtonName ALL_GROUPS_OPTIONS = new AddressManagementButtonName("ALL_GROUPS_OPTIONS", 18, "all_groups_options");
        public static final AddressManagementButtonName MOVE_GROUP = new AddressManagementButtonName("MOVE_GROUP", 19, "move_group");
        public static final AddressManagementButtonName BACK = new AddressManagementButtonName("BACK", 20, "back");
        public static final AddressManagementButtonName APPLY_EDIT_ALERT = new AddressManagementButtonName("APPLY_EDIT_ALERT", 21, "apply_edit_alert");
        public static final AddressManagementButtonName DELETE_ALERT = new AddressManagementButtonName("DELETE_ALERT", 22, "delete_alert");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ AddressManagementButtonName[] $values() {
            return new AddressManagementButtonName[]{MANAGEMENT, GROUP_ALL, GROUP_CUSTOM, ADDRESS_INFO_CARD, MANAGE_ALL_GROUPS, FOLLOWING_ALERT_BUTTON, ADD_ADDRESS, SAVE_GROUP_NAME, DELETE_GROUP, CREATE_GROUP, BULK_IMPORT, ADD_TO_GROUP, TURN_ON, TURN_OFF, MOVE, UNFOLLOW, SELECT_ALL, MANAGE_ALERT_BUTTON, ALL_GROUPS_OPTIONS, MOVE_GROUP, BACK, APPLY_EDIT_ALERT, DELETE_ALERT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<AddressManagementButtonName> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private AddressManagementButtonName(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            AddressManagementButtonName[] addressManagementButtonNameArr$values = $values();
            $VALUES = addressManagementButtonNameArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(addressManagementButtonNameArr$values);
        }

        public static AddressManagementButtonName valueOf(String str) {
            return (AddressManagementButtonName) Enum.valueOf(AddressManagementButtonName.class, str);
        }

        public static AddressManagementButtonName[] values() {
            return (AddressManagementButtonName[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TabName {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ TabName[] $VALUES;
        public static final TabName BUY_NOW = new TabName("BUY_NOW", 0, "buy_now");
        public static final TabName SELL_NOW = new TabName("SELL_NOW", 1, "sell_now");
        private final String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ TabName[] $values() {
            return new TabName[]{BUY_NOW, SELL_NOW};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<TabName> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private TabName(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            TabName[] tabNameArr$values = $values();
            $VALUES = tabNameArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(tabNameArr$values);
        }

        public static TabName valueOf(String str) {
            return (TabName) Enum.valueOf(TabName.class, str);
        }

        public static TabName[] values() {
            return (TabName[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LevelValue {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ LevelValue[] $VALUES;
        private final String value;
        public static final LevelValue MARKET = new LevelValue("MARKET", 0, "market");
        public static final LevelValue LOW = new LevelValue(VerifyDAppDomainUrlResponse.LEVEL_LOW, 1, "low");
        public static final LevelValue MID = new LevelValue("MID", 2, "mid");
        public static final LevelValue HIGH = new LevelValue(VerifyDAppDomainUrlResponse.LEVEL_HIGH, 3, "high");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ LevelValue[] $values() {
            return new LevelValue[]{MARKET, LOW, MID, HIGH};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<LevelValue> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private LevelValue(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            LevelValue[] levelValueArr$values = $values();
            $VALUES = levelValueArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(levelValueArr$values);
        }

        public static LevelValue valueOf(String str) {
            return (LevelValue) Enum.valueOf(LevelValue.class, str);
        }

        public static LevelValue[] values() {
            return (LevelValue[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DurationAnalyticType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ DurationAnalyticType[] $VALUES;
        private final String analyticsValue;
        public static final DurationAnalyticType ONE_DAY = new DurationAnalyticType("ONE_DAY", 0, "1d");
        public static final DurationAnalyticType THREE_DAYS = new DurationAnalyticType("THREE_DAYS", 1, "3d");
        public static final DurationAnalyticType SEVEN_DAYS = new DurationAnalyticType("SEVEN_DAYS", 2, "7d");
        public static final DurationAnalyticType ONE_MONTH = new DurationAnalyticType("ONE_MONTH", 3, "1m");
        public static final DurationAnalyticType THREE_MONTH = new DurationAnalyticType("THREE_MONTH", 4, "3m");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ DurationAnalyticType[] $values() {
            return new DurationAnalyticType[]{ONE_DAY, THREE_DAYS, SEVEN_DAYS, ONE_MONTH, THREE_MONTH};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<DurationAnalyticType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAnalyticsValue() {
            return this.analyticsValue;
        }

        private DurationAnalyticType(String str, int i, String str2) {
            this.analyticsValue = str2;
        }

        static {
            DurationAnalyticType[] durationAnalyticTypeArr$values = $values();
            $VALUES = durationAnalyticTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(durationAnalyticTypeArr$values);
        }

        public static DurationAnalyticType valueOf(String str) {
            return (DurationAnalyticType) Enum.valueOf(DurationAnalyticType.class, str);
        }

        public static DurationAnalyticType[] values() {
            return (DurationAnalyticType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StrategyType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ StrategyType[] $VALUES;
        private final String value;
        public static final StrategyType ONGOING_RUNNING_STRATEGY = new StrategyType("ONGOING_RUNNING_STRATEGY", 0, "ongoing_running_strategy");
        public static final StrategyType ONGOING_PAUSED_STRATEGY = new StrategyType("ONGOING_PAUSED_STRATEGY", 1, "ongoing_paused_strategy");
        public static final StrategyType HISTORY_STRATEGY = new StrategyType("HISTORY_STRATEGY", 2, "history_strategy");
        public static final StrategyType CREATE_NEW = new StrategyType("CREATE_NEW", 3, "create_new");
        public static final StrategyType EDIT_EXISTING = new StrategyType("EDIT_EXISTING", 4, "edit_existing");
        public static final StrategyType COPY_AGAIN = new StrategyType("COPY_AGAIN", 5, "copy_again");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ StrategyType[] $values() {
            return new StrategyType[]{ONGOING_RUNNING_STRATEGY, ONGOING_PAUSED_STRATEGY, HISTORY_STRATEGY, CREATE_NEW, EDIT_EXISTING, COPY_AGAIN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<StrategyType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private StrategyType(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            StrategyType[] strategyTypeArr$values = $values();
            $VALUES = strategyTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(strategyTypeArr$values);
        }

        public static StrategyType valueOf(String str) {
            return (StrategyType) Enum.valueOf(StrategyType.class, str);
        }

        public static StrategyType[] values() {
            return (StrategyType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EditStrategyFrom {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ EditStrategyFrom[] $VALUES;
        private final String value;
        public static final EditStrategyFrom LEADERBOARD = new EditStrategyFrom("LEADERBOARD", 0, "leaderboard");
        public static final EditStrategyFrom DASHBOARD = new EditStrategyFrom("DASHBOARD", 1, "dashboard");
        public static final EditStrategyFrom STRATEGY_PAGE = new EditStrategyFrom("STRATEGY_PAGE", 2, "strategy_page");
        public static final EditStrategyFrom DEEPLINK = new EditStrategyFrom("DEEPLINK", 3, "deeplink");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ EditStrategyFrom[] $values() {
            return new EditStrategyFrom[]{LEADERBOARD, DASHBOARD, STRATEGY_PAGE, DEEPLINK};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<EditStrategyFrom> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private EditStrategyFrom(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            EditStrategyFrom[] editStrategyFromArr$values = $values();
            $VALUES = editStrategyFromArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(editStrategyFromArr$values);
        }

        public static EditStrategyFrom valueOf(String str) {
            return (EditStrategyFrom) Enum.valueOf(EditStrategyFrom.class, str);
        }

        public static EditStrategyFrom[] values() {
            return (EditStrategyFrom[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class TxStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ TxStatus[] $VALUES;
        private final String status;
        public static final TxStatus SUCCESS = new TxStatus("SUCCESS", 0, "success");
        public static final TxStatus FAILURE = new TxStatus("FAILURE", 1, "failure");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ TxStatus[] $values() {
            return new TxStatus[]{SUCCESS, FAILURE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<TxStatus> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStatus() {
            return this.status;
        }

        private TxStatus(String str, int i, String str2) {
            this.status = str2;
        }

        static {
            TxStatus[] txStatusArr$values = $values();
            $VALUES = txStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(txStatusArr$values);
        }

        public static TxStatus valueOf(String str) {
            return (TxStatus) Enum.valueOf(TxStatus.class, str);
        }

        public static TxStatus[] values() {
            return (TxStatus[]) $VALUES.clone();
        }
    }

    public final String KWHzl(TransactionType transactionType) {
        int i = transactionType == null ? -1 : TaskDescription.AEQbTJ[transactionType.ordinal()];
        if (i != 1) {
            return i != 2 ? "" : TabName.SELL_NOW.getValue();
        }
        return TabName.BUY_NOW.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1171865311:
                return !str.equals("nft_trade") ? "DEX" : "NFT";
            case -628088350:
                if (str.equals("dapp_trade")) {
                    return "DAPP";
                }
                break;
            case 920262194:
                if (str.equals("yield_trade")) {
                    return "YIELD";
                }
                break;
            case 921962910:
                if (str.equals("wallet_trade")) {
                    return "WALLET";
                }
                break;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator {
        public final String AEQbTJ;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.copydefault;
            }
            return stateListAnimator.copydefault(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new StateListAnimator(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) stateListAnimator.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Slippage(type=" + this.AEQbTJ + ", amount=" + this.copydefault + ")";
        }

        public StateListAnimator(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.copydefault = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:806) call: com.okinc.business.dexlogic.track.DexTrackEventParameter.StateListAnimator.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ StateListAnimator(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar {
        public final String OLrzqt;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.copydefault;
            }
            return actionBar.AEQbTJ(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ActionBar(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) actionBar.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) actionBar.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "NetworkFeeDetails(gas_level=" + this.OLrzqt + ", pay_with=" + this.copydefault + ")";
        }

        public ActionBar(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.copydefault = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:811) call: com.okinc.business.dexlogic.track.DexTrackEventParameter.ActionBar.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ ActionBar(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Application {
        public final String KWHzl;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = application.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = application.KWHzl;
            }
            return application.OLrzqt(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Application(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) application.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) application.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Authorize(type=" + this.copydefault + ", amount=" + this.KWHzl + ")";
        }

        public Application(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.KWHzl = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:816) call: com.okinc.business.dexlogic.track.DexTrackEventParameter.Application.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Application(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    public final String copydefault(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C23316hvt.OLrzqt(new StateListAnimator(z ? "custom" : "default", str));
    }

    public final String copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C23316hvt.OLrzqt(new ActionBar(str, str2));
    }

    public final String AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C23316hvt.OLrzqt(new Application(str, str2));
    }
}
