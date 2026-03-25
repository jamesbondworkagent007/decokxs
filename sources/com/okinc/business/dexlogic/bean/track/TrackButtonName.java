package com.okinc.business.dexlogic.bean.track;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.invest_biz.data.bean.InvestButtonAction;
import com.okinc.liveness.lca.EopTrackEvent;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class TrackButtonName {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TrackButtonName[] $VALUES;
    private final String buttonName;
    public static final TrackButtonName K_LINE = new TrackButtonName("K_LINE", 0, "k_line");
    public static final TrackButtonName GENERAL_INFO = new TrackButtonName("GENERAL_INFO", 1, "general_info");
    public static final TrackButtonName TRANSACTION_HISTORY = new TrackButtonName("TRANSACTION_HISTORY", 2, "transaction_history");
    public static final TrackButtonName FAQ = new TrackButtonName("FAQ", 3, "faq");
    public static final TrackButtonName GENERAL_INFO_BASE = new TrackButtonName("GENERAL_INFO_BASE", 4, "general_info_base");
    public static final TrackButtonName MODE_SELECT_MEME = new TrackButtonName("MODE_SELECT_MEME", 5, "mode_select_meme");
    public static final TrackButtonName MODE_SELECT_SWAP = new TrackButtonName("MODE_SELECT_SWAP", 6, "mode_select_swap");
    public static final TrackButtonName MODE_SELECT_BRIDGE = new TrackButtonName("MODE_SELECT_BRIDGE", 7, "mode_select_bridge");
    public static final TrackButtonName MODE_SELECT = new TrackButtonName("MODE_SELECT", 8, "mode_select");
    public static final TrackButtonName BUY_TAB = new TrackButtonName("BUY_TAB", 9, "buy_tab");
    public static final TrackButtonName SELL_TAB = new TrackButtonName("SELL_TAB", 10, "sell_tab");
    public static final TrackButtonName TOKEN_TO = new TrackButtonName("TOKEN_TO", 11, "token_to");
    public static final TrackButtonName TOKEN_FROM = new TrackButtonName("TOKEN_FROM", 12, "token_from");
    public static final TrackButtonName MAX = new TrackButtonName("MAX", 13, "max");
    public static final TrackButtonName DEPOSIT = new TrackButtonName("DEPOSIT", 14, "deposit");
    public static final TrackButtonName CA_PASTE = new TrackButtonName("CA_PASTE", 15, "ca_paste");
    public static final TrackButtonName QTY_LOW = new TrackButtonName("QTY_LOW", 16, "qty_low");
    public static final TrackButtonName QTY_MID = new TrackButtonName("QTY_MID", 17, "qty_mid");
    public static final TrackButtonName QTY_HIGH = new TrackButtonName("QTY_HIGH", 18, "qty_high");
    public static final TrackButtonName QTY_CUSTOM = new TrackButtonName("QTY_CUSTOM", 19, "qty_custom");
    public static final TrackButtonName ORDER_TYPE_SELECT = new TrackButtonName("ORDER_TYPE_SELECT", 20, "ordertype_select");
    public static final TrackButtonName ORDER_TYPE_MARKET = new TrackButtonName("ORDER_TYPE_MARKET", 21, "ordertype_market");
    public static final TrackButtonName CONDITION_QUICK_MARKET = new TrackButtonName("CONDITION_QUICK_MARKET", 22, "condition_quick_market");
    public static final TrackButtonName CONDITION_QUICK_LOW = new TrackButtonName("CONDITION_QUICK_LOW", 23, "condition_quick_low");
    public static final TrackButtonName CONDITION_QUICK_MID = new TrackButtonName("CONDITION_QUICK_MID", 24, "condition_quick_mid");
    public static final TrackButtonName CONDITION_QUICK_CUSTOM = new TrackButtonName("CONDITION_QUICK_CUSTOM", 25, "condition_quick_custom");
    public static final TrackButtonName PRESET_ENTER = new TrackButtonName("PRESET_ENTER", 26, "preset_enter");
    public static final TrackButtonName MARKET_TAB = new TrackButtonName("MARKET_TAB", 27, "market_tab");
    public static final TrackButtonName LIMIT_TAB = new TrackButtonName("LIMIT_TAB", 28, "limit_tab");
    public static final TrackButtonName TRADE_DIRECTION_SWITCH = new TrackButtonName("TRADE_DIRECTION_SWITCH", 29, "trade_direction_switch");
    public static final TrackButtonName KB_QUICK_LOW = new TrackButtonName("KB_QUICK_LOW", 30, "kb_quick_low");
    public static final TrackButtonName KB_QUICK_MID = new TrackButtonName("KB_QUICK_MID", 31, "kb_quick_mid");
    public static final TrackButtonName KB_QUICK_HIGH = new TrackButtonName("KB_QUICK_HIGH", 32, "kb_quick_high");
    public static final TrackButtonName KB_QUICK_FULL = new TrackButtonName("KB_QUICK_FULL", 33, "kb_quick_full");
    public static final TrackButtonName RATE_DIFF_EXPLAIN = new TrackButtonName("RATE_DIFF_EXPLAIN", 34, "rate_diff_explain");
    public static final TrackButtonName LIMIT_RATE_DIFF_EXPLAIN = new TrackButtonName("LIMIT_RATE_DIFF_EXPLAIN", 35, "limit_rate_diff_explain");
    public static final TrackButtonName PROVIDER_ENTER = new TrackButtonName("PROVIDER_ENTER", 36, "provider_enter");
    public static final TrackButtonName RATE_SWITCH = new TrackButtonName("RATE_SWITCH", 37, "rate_switch");
    public static final TrackButtonName SLIPPAGE_ENTER = new TrackButtonName("SLIPPAGE_ENTER", 38, "slippage_enter");
    public static final TrackButtonName LIQUIDITY_ENTER = new TrackButtonName("LIQUIDITY_ENTER", 39, "liquidity_enter");
    public static final TrackButtonName SLIPPAGE_EXPLAIN = new TrackButtonName("SLIPPAGE_EXPLAIN", 40, "slippage_explain");
    public static final TrackButtonName LIQUIDITY_EXPLAIN = new TrackButtonName("LIQUIDITY_EXPLAIN", 41, "liquidity_explain");
    public static final TrackButtonName SERVICE_FEE_EXPLAIN = new TrackButtonName("SERVICE_FEE_EXPLAIN", 42, "service_fee_explain");
    public static final TrackButtonName SETTINGS = new TrackButtonName("SETTINGS", 43, "settings");
    public static final TrackButtonName LIMIT_RATE_SWITCH = new TrackButtonName("LIMIT_RATE_SWITCH", 44, "limit_rate_switch");
    public static final TrackButtonName EXPIRE_TIME_ENTER = new TrackButtonName("EXPIRE_TIME_ENTER", 45, "expire_time_enter");
    public static final TrackButtonName BRIDGE_RATE_EXPLAIN = new TrackButtonName("BRIDGE_RATE_EXPLAIN", 46, "bridge_rate_explain");
    public static final TrackButtonName BRIDGE_ROUTER_EXPLAIN = new TrackButtonName("BRIDGE_ROUTER_EXPLAIN", 47, "bridge_router_explain");
    public static final TrackButtonName BRIDGE_ROUTER_ENTER = new TrackButtonName("BRIDGE_ROUTER_ENTER", 48, "bridge_router_enter");
    public static final TrackButtonName CLOSE = new TrackButtonName(InvestButtonAction.ACTION_CALLBACK_CLOSE, 49, EopTrackEvent.CLOSE);
    public static final TrackButtonName BACK = new TrackButtonName("BACK", 50, "back");
    public static final TrackButtonName DAPP_SELECT = new TrackButtonName("DAPP_SELECT", 51, "dapp_select");
    public static final TrackButtonName GO_TO_DAPP = new TrackButtonName("GO_TO_DAPP", 52, "go_to_dapp");
    public static final TrackButtonName COPY_FROM_TOKEN = new TrackButtonName("COPY_FROM_TOKEN", 53, "copy_from_token");
    public static final TrackButtonName COPY_TO_TOKEN = new TrackButtonName("COPY_TO_TOKEN", 54, "copy_to_token");
    public static final TrackButtonName COPY_TRADE = new TrackButtonName("COPY_TRADE", 55, "copy_trade");
    public static final TrackButtonName COPY_ADDRESS_FROM_ICON = new TrackButtonName("COPY_ADDRESS_FROM_ICON", 56, "copy_address_from_icon");
    public static final TrackButtonName START_BUTTON = new TrackButtonName("START_BUTTON", 57, "start_button");
    public static final TrackButtonName PAUSE_BUTTON = new TrackButtonName("PAUSE_BUTTON", 58, "pause_button");
    public static final TrackButtonName POSITIONS_TAB = new TrackButtonName("POSITIONS_TAB", 59, "positions_tab");
    public static final TrackButtonName OPEN_ORDERS_TAB = new TrackButtonName("OPEN_ORDERS_TAB", 60, "open_orders_tab");
    public static final TrackButtonName ORDER_HISTORY_TAB = new TrackButtonName("ORDER_HISTORY_TAB", 61, "order_history_tab");
    public static final TrackButtonName FILTERED_TAB = new TrackButtonName("FILTERED_TAB", 62, "filtered_tab");
    public static final TrackButtonName TRADES_TAB = new TrackButtonName("TRADES_TAB", 63, "trades_tab");
    public static final TrackButtonName ORDER_DETAILS = new TrackButtonName("ORDER_DETAILS", 64, "order_details");
    public static final TrackButtonName TRADE_DETAILS = new TrackButtonName("TRADE_DETAILS", 65, "trade_details");
    public static final TrackButtonName POSITIONS_DETAILS = new TrackButtonName("POSITIONS_DETAILS", 66, "positions_token_detail");
    public static final TrackButtonName MANAGE_STRATEGY = new TrackButtonName("MANAGE_STRATEGY", 67, "manage_strategy");
    public static final TrackButtonName EDIT_STRATEGY = new TrackButtonName("EDIT_STRATEGY", 68, "edit_strategy");
    public static final TrackButtonName STOP_STRATEGY = new TrackButtonName("STOP_STRATEGY", 69, "stop_strategy");
    public static final TrackButtonName CANCEL = new TrackButtonName("CANCEL", 70, OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
    public static final TrackButtonName COPY_AGAIN = new TrackButtonName("COPY_AGAIN", 71, "copy_again");
    public static final TrackButtonName LEADERBOARD = new TrackButtonName("LEADERBOARD", 72, "leaderboard_button");
    public static final TrackButtonName CREATE_TRADE = new TrackButtonName("CREATE_TRADE", 73, "create_copy_trade_button");
    public static final TrackButtonName ONGOING_TAB = new TrackButtonName("ONGOING_TAB", 74, "ongoing_tab");
    public static final TrackButtonName HISTORY_TAB = new TrackButtonName("HISTORY_TAB", 75, "history_tab");
    public static final TrackButtonName COPY_DETAILS = new TrackButtonName("COPY_DETAILS", 76, "copy_details_card");
    public static final TrackButtonName EDIT_STRATEGY_NAME = new TrackButtonName("EDIT_STRATEGY_NAME", 77, "edit_strategy_name");
    public static final TrackButtonName CHANGE_NETWORK = new TrackButtonName("CHANGE_NETWORK", 78, "change_network");
    public static final TrackButtonName QUOTE_TOKEN = new TrackButtonName("QUOTE_TOKEN", 79, "quote_token");
    public static final TrackButtonName COPY_BUY_CONFIG = new TrackButtonName("COPY_BUY_CONFIG", 80, "copy_buy_config");
    public static final TrackButtonName COPY_SELL_CONFIG = new TrackButtonName("COPY_SELL_CONFIG", 81, "copy_sell_config");
    public static final TrackButtonName EXPAND_SELL_SETTINGS = new TrackButtonName("EXPAND_SELL_SETTINGS", 82, "expand_sell_settings");
    public static final TrackButtonName EXPAND_FILTERS = new TrackButtonName("EXPAND_FILTERS", 83, "expand_filters");
    public static final TrackButtonName ADD_STRATEGY = new TrackButtonName("ADD_STRATEGY", 84, "add_strategy");
    public static final TrackButtonName MIN_TOKEN_AGE_UNIT = new TrackButtonName("MIN_TOKEN_AGE_UNIT", 85, "min_token_age_unit");
    public static final TrackButtonName MAX_TOKEN_AGE_UNIT = new TrackButtonName("MAX_TOKEN_AGE_UNIT", 86, "max_token_age_unit");
    public static final TrackButtonName ADD_BLOCK_TOKEN = new TrackButtonName("ADD_BLOCK_TOKEN", 87, "add_block_token");
    public static final TrackButtonName BUY_PERCENT_EXPLAIN = new TrackButtonName("BUY_PERCENT_EXPLAIN", 88, "buy_percentage_explain");
    public static final TrackButtonName MAX_BUY_EXPLAIN = new TrackButtonName("MAX_BUY_EXPLAIN", 89, "max_buy_explain");
    public static final TrackButtonName SKIP_HOLDINGS_EXPLAIN = new TrackButtonName("SKIP_HOLDINGS_EXPLAIN", 90, "skip_holdings_explain");
    public static final TrackButtonName BUY_AMOUNT_EXPLAIN = new TrackButtonName("BUY_AMOUNT_EXPLAIN", 91, "buy_amount_explain");
    public static final TrackButtonName COPY_SELL_EXPLAIN = new TrackButtonName("COPY_SELL_EXPLAIN", 92, "copy_sell_explain");
    public static final TrackButtonName AUTO_SELL_EXPLAIN = new TrackButtonName("AUTO_SELL_EXPLAIN", 93, "auto_sell_explain");
    public static final TrackButtonName EXPIRATION_EXPLAIN = new TrackButtonName("EXPIRATION_EXPLAIN", 94, "expiration_explain");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TrackButtonName[] $values() {
        return new TrackButtonName[]{K_LINE, GENERAL_INFO, TRANSACTION_HISTORY, FAQ, GENERAL_INFO_BASE, MODE_SELECT_MEME, MODE_SELECT_SWAP, MODE_SELECT_BRIDGE, MODE_SELECT, BUY_TAB, SELL_TAB, TOKEN_TO, TOKEN_FROM, MAX, DEPOSIT, CA_PASTE, QTY_LOW, QTY_MID, QTY_HIGH, QTY_CUSTOM, ORDER_TYPE_SELECT, ORDER_TYPE_MARKET, CONDITION_QUICK_MARKET, CONDITION_QUICK_LOW, CONDITION_QUICK_MID, CONDITION_QUICK_CUSTOM, PRESET_ENTER, MARKET_TAB, LIMIT_TAB, TRADE_DIRECTION_SWITCH, KB_QUICK_LOW, KB_QUICK_MID, KB_QUICK_HIGH, KB_QUICK_FULL, RATE_DIFF_EXPLAIN, LIMIT_RATE_DIFF_EXPLAIN, PROVIDER_ENTER, RATE_SWITCH, SLIPPAGE_ENTER, LIQUIDITY_ENTER, SLIPPAGE_EXPLAIN, LIQUIDITY_EXPLAIN, SERVICE_FEE_EXPLAIN, SETTINGS, LIMIT_RATE_SWITCH, EXPIRE_TIME_ENTER, BRIDGE_RATE_EXPLAIN, BRIDGE_ROUTER_EXPLAIN, BRIDGE_ROUTER_ENTER, CLOSE, BACK, DAPP_SELECT, GO_TO_DAPP, COPY_FROM_TOKEN, COPY_TO_TOKEN, COPY_TRADE, COPY_ADDRESS_FROM_ICON, START_BUTTON, PAUSE_BUTTON, POSITIONS_TAB, OPEN_ORDERS_TAB, ORDER_HISTORY_TAB, FILTERED_TAB, TRADES_TAB, ORDER_DETAILS, TRADE_DETAILS, POSITIONS_DETAILS, MANAGE_STRATEGY, EDIT_STRATEGY, STOP_STRATEGY, CANCEL, COPY_AGAIN, LEADERBOARD, CREATE_TRADE, ONGOING_TAB, HISTORY_TAB, COPY_DETAILS, EDIT_STRATEGY_NAME, CHANGE_NETWORK, QUOTE_TOKEN, COPY_BUY_CONFIG, COPY_SELL_CONFIG, EXPAND_SELL_SETTINGS, EXPAND_FILTERS, ADD_STRATEGY, MIN_TOKEN_AGE_UNIT, MAX_TOKEN_AGE_UNIT, ADD_BLOCK_TOKEN, BUY_PERCENT_EXPLAIN, MAX_BUY_EXPLAIN, SKIP_HOLDINGS_EXPLAIN, BUY_AMOUNT_EXPLAIN, COPY_SELL_EXPLAIN, AUTO_SELL_EXPLAIN, EXPIRATION_EXPLAIN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TrackButtonName> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getButtonName() {
        return this.buttonName;
    }

    private TrackButtonName(String str, int i, String str2) {
        this.buttonName = str2;
    }

    static {
        TrackButtonName[] trackButtonNameArr$values = $values();
        $VALUES = trackButtonNameArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(trackButtonNameArr$values);
    }

    public static TrackButtonName valueOf(String str) {
        return (TrackButtonName) Enum.valueOf(TrackButtonName.class, str);
    }

    public static TrackButtonName[] values() {
        return (TrackButtonName[]) $VALUES.clone();
    }
}
