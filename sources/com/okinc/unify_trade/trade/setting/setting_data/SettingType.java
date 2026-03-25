package com.okinc.unify_trade.trade.setting.setting_data;

import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class SettingType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SettingType[] $VALUES;
    public static final SettingType ACCOUNT_MODE;
    public static final SettingType ALLOW_BOT_SHARING;
    public static final SettingType APPEARANCE_SETTING;
    public static final SettingType AUTO_BORROW_LEVERAGE;
    public static final SettingType AUTO_LOAN;
    public static final SettingType CHASE_ORDER_CONFIRMATION;
    public static final SettingType CLICK_DEPTH_AMOUNT;
    public static final SettingType CLICK_HALF_KLINE_PRICE;
    public static final SettingType CLICK_KLINE_OPEN;
    public static final SettingType CLOSE_ALL;
    public static final SettingType COLOR_SETTING;
    public static final SettingType CONTRACT_TRADE_UNIT_PREFERENCES;
    public static final SettingType COST_PRICE;
    public static final SettingType CURRENCY;
    public static final SettingType DEX_ORDER_CONFIRMATION;
    public static final SettingType DOUBLE_CONFIRM;
    public static final SettingType FEE_TYPE;
    public static final SettingType FUNDING_RATE_NOTIFICATION;
    public static final SettingType GREEKSUNIT;
    public static final SettingType LIGUIDATION_GEAR;
    public static final SettingType LIMIT_ORDER_NOTIFICATION;
    public static final SettingType LIQUIDATIONS_NOTIFICATION;
    public static final SettingType MARKET_ORDER_NOTIFICATION;
    public static final SettingType MTK_CLOSE_ALL_CONFIRMATION;
    public static final SettingType OPEN_MARKET_PLACE;
    public static final SettingType OPTION_TRADE_UNIT_PREFERENCES;
    public static final SettingType ORDER_CONFIRM;
    public static final SettingType ORDER_NOTICE;
    public static final SettingType ORDER_PANEL;
    public static final SettingType POSITION_TYPE;
    public static final SettingType POS_BUTTON_MANAGER;
    public static final SettingType POS_FLOAT_WINDOW;
    public static final SettingType REDUCE_ONLY_ORDER_NOTIFICATION;
    public static final SettingType REVERSE_POS_CONFIRM;
    public static final SettingType REVERSE_POS_ENABLE;
    public static final SettingType SELF_TRADE_PREVENTION;
    public static final SettingType SHOW_LIU_PX;
    public static final SettingType SIGNAL_CLONE_ORDER;
    public static final SettingType SIMPLE_MODE_LOAN;
    public static final SettingType STABLE_COIN;
    public static final SettingType TAB_SEQUENCE;
    public static final SettingType TPSL_ORDER_NOTIFICATION;
    public static final SettingType TRADE_ISO_TYPE_FUTURE;
    public static final SettingType TRADE_ISO_TYPE_MARGIN;
    public static final SettingType TRADING_LEGAL_UNIT;
    public static final SettingType TRADING_UNIT_FUTURES_SWAP_COIN;
    public static final SettingType TRADING_UNIT_FUTURES_SWAP_USDT;
    public static final SettingType TRADING_UNIT_OPTIONS;
    public static final SettingType USD_SETTLE_CCY;
    private final SettingType parentSettingType;
    private final SettingPageType settingPageType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SettingType[] $values() {
        return new SettingType[]{ACCOUNT_MODE, AUTO_LOAN, AUTO_BORROW_LEVERAGE, POSITION_TYPE, TRADE_ISO_TYPE_FUTURE, TRADE_ISO_TYPE_MARGIN, CONTRACT_TRADE_UNIT_PREFERENCES, TRADING_UNIT_FUTURES_SWAP_USDT, TRADING_UNIT_FUTURES_SWAP_COIN, OPTION_TRADE_UNIT_PREFERENCES, TRADING_UNIT_OPTIONS, GREEKSUNIT, STABLE_COIN, COST_PRICE, FEE_TYPE, USD_SETTLE_CCY, CLICK_DEPTH_AMOUNT, CLICK_HALF_KLINE_PRICE, OPEN_MARKET_PLACE, LIGUIDATION_GEAR, REVERSE_POS_ENABLE, DOUBLE_CONFIRM, ALLOW_BOT_SHARING, ORDER_CONFIRM, MTK_CLOSE_ALL_CONFIRMATION, REVERSE_POS_CONFIRM, CHASE_ORDER_CONFIRMATION, DEX_ORDER_CONFIRMATION, POS_FLOAT_WINDOW, ORDER_NOTICE, LIMIT_ORDER_NOTIFICATION, LIQUIDATIONS_NOTIFICATION, REDUCE_ONLY_ORDER_NOTIFICATION, MARKET_ORDER_NOTIFICATION, TPSL_ORDER_NOTIFICATION, FUNDING_RATE_NOTIFICATION, SHOW_LIU_PX, SELF_TRADE_PREVENTION, SIMPLE_MODE_LOAN, SIGNAL_CLONE_ORDER, CLICK_KLINE_OPEN, ORDER_PANEL, TAB_SEQUENCE, POS_BUTTON_MANAGER, CLOSE_ALL, APPEARANCE_SETTING, COLOR_SETTING, CURRENCY, TRADING_LEGAL_UNIT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SettingType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SettingType getParentSettingType() {
        return this.parentSettingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SettingPageType getSettingPageType() {
        return this.settingPageType;
    }

    private SettingType(String str, int i, SettingPageType settingPageType, SettingType settingType) {
        this.settingPageType = settingPageType;
        this.parentSettingType = settingType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (r3v0 int)
  (wrap:com.okinc.unify_trade.trade.setting.setting_data.SettingPageType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.trade.setting.setting_data.SettingPageType) : (r4v0 com.okinc.unify_trade.trade.setting.setting_data.SettingPageType))
  (wrap:com.okinc.unify_trade.trade.setting.setting_data.SettingType:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.trade.setting.setting_data.SettingType) : (r5v0 com.okinc.unify_trade.trade.setting.setting_data.SettingType))
 A[MD:(java.lang.String, int, com.okinc.unify_trade.trade.setting.setting_data.SettingPageType, com.okinc.unify_trade.trade.setting.setting_data.SettingType):void (m)] (LINE:23) call: com.okinc.unify_trade.trade.setting.setting_data.SettingType.<init>(java.lang.String, int, com.okinc.unify_trade.trade.setting.setting_data.SettingPageType, com.okinc.unify_trade.trade.setting.setting_data.SettingType):void type: THIS */
    public /* synthetic */ SettingType(String str, int i, SettingPageType settingPageType, SettingType settingType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 1) != 0 ? null : settingPageType, (i2 & 2) != 0 ? null : settingType);
    }

    static {
        SettingPageType settingPageType = SettingPageType.TRADE_MODE;
        SettingType settingType = null;
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ACCOUNT_MODE = new SettingType("ACCOUNT_MODE", 0, settingPageType, settingType, i, defaultConstructorMarker);
        AUTO_LOAN = new SettingType("AUTO_LOAN", 1, settingPageType, settingType, i, defaultConstructorMarker);
        AUTO_BORROW_LEVERAGE = new SettingType("AUTO_BORROW_LEVERAGE", 2, settingPageType, settingType, i, defaultConstructorMarker);
        POSITION_TYPE = new SettingType("POSITION_TYPE", 3, settingPageType, settingType, i, defaultConstructorMarker);
        TRADE_ISO_TYPE_FUTURE = new SettingType("TRADE_ISO_TYPE_FUTURE", 4, settingPageType, settingType, i, defaultConstructorMarker);
        TRADE_ISO_TYPE_MARGIN = new SettingType("TRADE_ISO_TYPE_MARGIN", 5, settingPageType, settingType, i, defaultConstructorMarker);
        SettingType settingType2 = new SettingType("CONTRACT_TRADE_UNIT_PREFERENCES", 6, settingPageType, settingType, i, defaultConstructorMarker);
        CONTRACT_TRADE_UNIT_PREFERENCES = settingType2;
        SettingPageType settingPageType2 = null;
        int i2 = 1;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        TRADING_UNIT_FUTURES_SWAP_USDT = new SettingType("TRADING_UNIT_FUTURES_SWAP_USDT", 7, settingPageType2, settingType2, i2, defaultConstructorMarker2);
        TRADING_UNIT_FUTURES_SWAP_COIN = new SettingType("TRADING_UNIT_FUTURES_SWAP_COIN", 8, settingPageType2, settingType2, i2, defaultConstructorMarker2);
        SettingType settingType3 = new SettingType("OPTION_TRADE_UNIT_PREFERENCES", 9, settingPageType, settingType, i, defaultConstructorMarker);
        OPTION_TRADE_UNIT_PREFERENCES = settingType3;
        SettingPageType settingPageType3 = null;
        int i3 = 1;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        TRADING_UNIT_OPTIONS = new SettingType("TRADING_UNIT_OPTIONS", 10, settingPageType3, settingType3, i3, defaultConstructorMarker3);
        GREEKSUNIT = new SettingType("GREEKSUNIT", 11, settingPageType3, settingType3, i3, defaultConstructorMarker3);
        STABLE_COIN = new SettingType("STABLE_COIN", 12, settingPageType, settingType, i, defaultConstructorMarker);
        COST_PRICE = new SettingType("COST_PRICE", 13, settingPageType, settingType, i, defaultConstructorMarker);
        FEE_TYPE = new SettingType("FEE_TYPE", 14, settingPageType, settingType, i, defaultConstructorMarker);
        USD_SETTLE_CCY = new SettingType("USD_SETTLE_CCY", 15, settingPageType, settingType, i, defaultConstructorMarker);
        SettingPageType settingPageType4 = SettingPageType.PREFERENCES;
        SettingType settingType4 = null;
        int i4 = 2;
        CLICK_DEPTH_AMOUNT = new SettingType("CLICK_DEPTH_AMOUNT", 16, settingPageType4, settingType4, i4, defaultConstructorMarker2);
        CLICK_HALF_KLINE_PRICE = new SettingType("CLICK_HALF_KLINE_PRICE", 17, settingPageType4, settingType4, i4, defaultConstructorMarker2);
        OPEN_MARKET_PLACE = new SettingType("OPEN_MARKET_PLACE", 18, settingPageType4, settingType4, i4, defaultConstructorMarker2);
        LIGUIDATION_GEAR = new SettingType("LIGUIDATION_GEAR", 19, settingPageType4, settingType4, i4, defaultConstructorMarker2);
        REVERSE_POS_ENABLE = new SettingType("REVERSE_POS_ENABLE", 20, settingPageType4, settingType4, i4, defaultConstructorMarker2);
        SettingType settingType5 = new SettingType("DOUBLE_CONFIRM", 21, settingPageType4, settingType4, i4, defaultConstructorMarker2);
        DOUBLE_CONFIRM = settingType5;
        ALLOW_BOT_SHARING = new SettingType("ALLOW_BOT_SHARING", 22, settingPageType4, settingType4, i4, defaultConstructorMarker2);
        SettingPageType settingPageType5 = null;
        int i5 = 1;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        ORDER_CONFIRM = new SettingType("ORDER_CONFIRM", 23, settingPageType5, settingType5, i5, defaultConstructorMarker4);
        MTK_CLOSE_ALL_CONFIRMATION = new SettingType("MTK_CLOSE_ALL_CONFIRMATION", 24, settingPageType5, settingType5, i5, defaultConstructorMarker4);
        REVERSE_POS_CONFIRM = new SettingType("REVERSE_POS_CONFIRM", 25, settingPageType5, settingType5, i5, defaultConstructorMarker4);
        CHASE_ORDER_CONFIRMATION = new SettingType("CHASE_ORDER_CONFIRMATION", 26, settingPageType5, settingType5, i5, defaultConstructorMarker4);
        DEX_ORDER_CONFIRMATION = new SettingType("DEX_ORDER_CONFIRMATION", 27, settingPageType5, settingType5, i5, defaultConstructorMarker4);
        POS_FLOAT_WINDOW = new SettingType("POS_FLOAT_WINDOW", 28, settingPageType4, settingType4, i4, defaultConstructorMarker2);
        SettingType settingType6 = new SettingType("ORDER_NOTICE", 29, settingPageType4, settingType4, i4, defaultConstructorMarker2);
        ORDER_NOTICE = settingType6;
        LIMIT_ORDER_NOTIFICATION = new SettingType("LIMIT_ORDER_NOTIFICATION", 30, settingPageType5, settingType6, i5, defaultConstructorMarker4);
        LIQUIDATIONS_NOTIFICATION = new SettingType("LIQUIDATIONS_NOTIFICATION", 31, settingPageType5, settingType6, i5, defaultConstructorMarker4);
        REDUCE_ONLY_ORDER_NOTIFICATION = new SettingType("REDUCE_ONLY_ORDER_NOTIFICATION", 32, settingPageType5, settingType6, i5, defaultConstructorMarker4);
        MARKET_ORDER_NOTIFICATION = new SettingType("MARKET_ORDER_NOTIFICATION", 33, settingPageType5, settingType6, i5, defaultConstructorMarker4);
        TPSL_ORDER_NOTIFICATION = new SettingType("TPSL_ORDER_NOTIFICATION", 34, settingPageType5, settingType6, i5, defaultConstructorMarker4);
        FUNDING_RATE_NOTIFICATION = new SettingType("FUNDING_RATE_NOTIFICATION", 35, settingPageType5, settingType6, i5, defaultConstructorMarker4);
        SHOW_LIU_PX = new SettingType("SHOW_LIU_PX", 36, settingPageType4, settingType4, i4, defaultConstructorMarker2);
        SELF_TRADE_PREVENTION = new SettingType("SELF_TRADE_PREVENTION", 37, settingPageType4, settingType4, i4, defaultConstructorMarker2);
        SIMPLE_MODE_LOAN = new SettingType("SIMPLE_MODE_LOAN", 38, settingPageType4, settingType4, i4, defaultConstructorMarker2);
        SIGNAL_CLONE_ORDER = new SettingType("SIGNAL_CLONE_ORDER", 39, settingPageType4, settingType4, i4, defaultConstructorMarker2);
        SettingPageType settingPageType6 = SettingPageType.LAYOUT;
        SettingType settingType7 = null;
        int i6 = 2;
        CLICK_KLINE_OPEN = new SettingType("CLICK_KLINE_OPEN", 40, settingPageType6, settingType7, i6, defaultConstructorMarker4);
        ORDER_PANEL = new SettingType("ORDER_PANEL", 41, settingPageType6, settingType7, i6, defaultConstructorMarker4);
        TAB_SEQUENCE = new SettingType("TAB_SEQUENCE", 42, settingPageType6, settingType7, i6, defaultConstructorMarker4);
        POS_BUTTON_MANAGER = new SettingType("POS_BUTTON_MANAGER", 43, settingPageType6, settingType7, i6, defaultConstructorMarker4);
        CLOSE_ALL = new SettingType("CLOSE_ALL", 44, settingPageType6, settingType7, i6, defaultConstructorMarker4);
        APPEARANCE_SETTING = new SettingType("APPEARANCE_SETTING", 45, settingPageType6, settingType7, i6, defaultConstructorMarker4);
        COLOR_SETTING = new SettingType("COLOR_SETTING", 46, settingPageType6, settingType7, i6, defaultConstructorMarker4);
        CURRENCY = new SettingType("CURRENCY", 47, null, settingType4, 3, defaultConstructorMarker2);
        TRADING_LEGAL_UNIT = new SettingType("TRADING_LEGAL_UNIT", 48, null, null, 3, null);
        SettingType[] settingTypeArr$values = $values();
        $VALUES = settingTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(settingTypeArr$values);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    @Override // java.lang.Enum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String str;
        String str2;
        String string;
        String string2;
        SettingPageType settingPageType = this.settingPageType;
        if (settingPageType == null || (string2 = settingPageType.toString()) == null) {
            str = "";
        } else {
            String lowerCase = string2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase != null) {
                str = lowerCase + "_";
                if (str == null) {
                }
            }
        }
        SettingType settingType = this.parentSettingType;
        if (settingType == null || (string = settingType.toString()) == null) {
            str2 = "";
        } else {
            String lowerCase2 = string.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (lowerCase2 != null) {
                str2 = lowerCase2 + "_";
                if (str2 == null) {
                }
            }
        }
        String lowerCase3 = super.toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
        return str + str2 + lowerCase3;
    }

    public static SettingType valueOf(String str) {
        return (SettingType) Enum.valueOf(SettingType.class, str);
    }

    public static SettingType[] values() {
        return (SettingType[]) $VALUES.clone();
    }
}
