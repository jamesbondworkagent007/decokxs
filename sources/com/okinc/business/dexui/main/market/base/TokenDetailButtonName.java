package com.okinc.business.dexui.main.market.base;

import com.okinc.business.defi.api.bean.VerifyDAppDomainResponse;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.transactionhistory.FilterTimeDuration;
import com.okinc.business.market.data.constant.LiquidityChangeType;
import com.okinc.business.market.domain.model.coininfo.Social;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.productmatrix.biz.bean.ProductMatrixRemoteConfig;
import com.okinc.search.bean.SearchResultContentPo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC26302jZk;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class TokenDetailButtonName {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenDetailButtonName[] $VALUES;
    public static final Application Companion;
    private final String trackingValue;
    public static final TokenDetailButtonName ACTIVITIES = new TokenDetailButtonName("ACTIVITIES", 0, "activities");
    public static final TokenDetailButtonName ACTIVITIES_DETAIL = new TokenDetailButtonName("ACTIVITIES_DETAIL", 1, "activities_detail");
    public static final TokenDetailButtonName ADDRESS_COPY = new TokenDetailButtonName("ADDRESS_COPY", 2, "address_copy");
    public static final TokenDetailButtonName ADD_TO_WATCHLIST = new TokenDetailButtonName("ADD_TO_WATCHLIST", 3, "add_to_watchlist");
    public static final TokenDetailButtonName ALERT = new TokenDetailButtonName("ALERT", 4, ProductMatrixRemoteConfig.ALERT);
    public static final TokenDetailButtonName CHART = new TokenDetailButtonName("CHART", 5, "charts");
    public static final TokenDetailButtonName DATA = new TokenDetailButtonName("DATA", 6, "data");
    public static final TokenDetailButtonName DATA_LIQUIDITY_TIME_CHANGE = new TokenDetailButtonName("DATA_LIQUIDITY_TIME_CHANGE", 7, "liquidity_change_time_dimension");
    public static final TokenDetailButtonName DATA_LIQUIDITY_POOL_ADDRESS_COPY = new TokenDetailButtonName("DATA_LIQUIDITY_POOL_ADDRESS_COPY", 8, "pool_address_copy");
    public static final TokenDetailButtonName DATA_LIQUIDITY_POOL_LIST_ITEM = new TokenDetailButtonName("DATA_LIQUIDITY_POOL_LIST_ITEM", 9, "pool_list_item");
    public static final TokenDetailButtonName DATA_LIQUIDITY_POOL_EXTERNAL_LINK = new TokenDetailButtonName("DATA_LIQUIDITY_POOL_EXTERNAL_LINK", 10, "pool_details_external_link");
    public static final TokenDetailButtonName DEFI = new TokenDetailButtonName("DEFI", 11, "defi");
    public static final TokenDetailButtonName EXPAND_STOCK_INFO = new TokenDetailButtonName("EXPAND_STOCK_INFO", 12, "expand_stock_info");
    public static final TokenDetailButtonName HOLDERS = new TokenDetailButtonName("HOLDERS", 13, "holders");
    public static final TokenDetailButtonName HOLDERS_TOP_100 = new TokenDetailButtonName("HOLDERS_TOP_100", 14, "top_hundred");
    public static final TokenDetailButtonName HOLDERS_GREATER_THAN_10 = new TokenDetailButtonName("HOLDERS_GREATER_THAN_10", 15, "holding_greater_than_10u");
    public static final TokenDetailButtonName HOLDERS_BUBBLE_MAP = new TokenDetailButtonName("HOLDERS_BUBBLE_MAP", 16, "token_detail_bubble_map_entry");
    public static final TokenDetailButtonName HOLDERS_DETAIL = new TokenDetailButtonName("HOLDERS_DETAIL", 17, "holder_detail");
    public static final TokenDetailButtonName INFO = new TokenDetailButtonName("INFO", 18, "info");
    public static final TokenDetailButtonName INFO_CONTRACT_ADDRESS_COPY = new TokenDetailButtonName("INFO_CONTRACT_ADDRESS_COPY", 19, "info_contract_address_copy");
    public static final TokenDetailButtonName INFO_DEFI = new TokenDetailButtonName("INFO_DEFI", 20, "info_defi");
    public static final TokenDetailButtonName INFO_EXPAND = new TokenDetailButtonName("INFO_EXPAND", 21, "info_expand");
    public static final TokenDetailButtonName INFO_FDV_EXPLAIN = new TokenDetailButtonName("INFO_FDV_EXPLAIN", 22, "info_fdv_explain");
    public static final TokenDetailButtonName INFO_HOLDERS = new TokenDetailButtonName("INFO_HOLDERS", 23, "info_holders");
    public static final TokenDetailButtonName INFO_LABEL_DEFINITION = new TokenDetailButtonName("INFO_LABEL_DEFINITION", 24, "info_label_definition");
    public static final TokenDetailButtonName INFO_LIQUIDITY = new TokenDetailButtonName("INFO_LIQUIDITY", 25, "info_liquidity");
    public static final TokenDetailButtonName INFO_MARKET_CAP_EXPLAIN = new TokenDetailButtonName("INFO_MARKET_CAP_EXPLAIN", 26, "info_marketcap_explain");
    public static final TokenDetailButtonName INFO_READ_MORE = new TokenDetailButtonName("INFO_READ_MORE", 27, "info_read_more");
    public static final TokenDetailButtonName INFO_RISK = new TokenDetailButtonName("INFO_RISK", 28, "info_risk");
    public static final TokenDetailButtonName INFO_SEARCH_X = new TokenDetailButtonName("INFO_SEARCH_X", 29, "search_x");
    public static final TokenDetailButtonName INFO_SOCIAL_X = new TokenDetailButtonName("INFO_SOCIAL_X", 30, "info_x");
    public static final TokenDetailButtonName INFO_SOCIAL_MEDIA = new TokenDetailButtonName("INFO_SOCIAL_MEDIA", 31, "social_media");
    public static final TokenDetailButtonName INFO_VIBES_CLICK = new TokenDetailButtonName("INFO_VIBES_CLICK", 32, "vibes_click");
    public static final TokenDetailButtonName INFO_VOL_5M = new TokenDetailButtonName("INFO_VOL_5M", 33, "info_vol_5m");
    public static final TokenDetailButtonName INFO_VOL_1H = new TokenDetailButtonName("INFO_VOL_1H", 34, "info_vol_1h");
    public static final TokenDetailButtonName INFO_VOL_4H = new TokenDetailButtonName("INFO_VOL_4H", 35, "info_vol_4h");
    public static final TokenDetailButtonName INFO_VOL_24H = new TokenDetailButtonName("INFO_VOL_24H", 36, "info_vol_24h");
    public static final TokenDetailButtonName LIQUIDITY = new TokenDetailButtonName("LIQUIDITY", 37, "liquidity");
    public static final TokenDetailButtonName LIQUIDITY_ADD = new TokenDetailButtonName("LIQUIDITY_ADD", 38, "liquidity_add");
    public static final TokenDetailButtonName LIQUIDITY_ALL = new TokenDetailButtonName("LIQUIDITY_ALL", 39, "liquidity_all");
    public static final TokenDetailButtonName LIQUIDITY_DEFI = new TokenDetailButtonName("LIQUIDITY_DEFI", 40, "liquidity_defi");
    public static final TokenDetailButtonName LIQUIDITY_DETAIL = new TokenDetailButtonName("LIQUIDITY_DETAIL", 41, "liquidity_detail");
    public static final TokenDetailButtonName LIQUIDITY_REMOVE = new TokenDetailButtonName("LIQUIDITY_REMOVE", 42, "liquidity_remove");
    public static final TokenDetailButtonName LIQUIDITY_TOTAL = new TokenDetailButtonName("LIQUIDITY_TOTAL", 43, "total_liquidity");
    public static final TokenDetailButtonName MARKET_STATUS = new TokenDetailButtonName("MARKET_STATUS", 44, "market_status");
    public static final TokenDetailButtonName QUICK_BUY_BUTTON = new TokenDetailButtonName("QUICK_BUY_BUTTON", 45, "quick_buy_button");
    public static final TokenDetailButtonName RISK = new TokenDetailButtonName("RISK", 46, VerifyDAppDomainResponse.LEVEL_RISK);
    public static final TokenDetailButtonName SHARE = new TokenDetailButtonName("SHARE", 47, "share");
    public static final TokenDetailButtonName SUBTABS_ADDRESS_EXPLANATION = new TokenDetailButtonName("SUBTABS_ADDRESS_EXPLANATION", 48, "address_label");
    public static final TokenDetailButtonName SUBTABS_CURRENCY_MODE = new TokenDetailButtonName("SUBTABS_CURRENCY_MODE", 49, "currency_mode_filter_is_token");
    public static final TokenDetailButtonName TOP_TRADERS = new TokenDetailButtonName("TOP_TRADERS", 50, "top_traders");
    public static final TokenDetailButtonName TRADER_ADDRESS_DETAIL = new TokenDetailButtonName("TRADER_ADDRESS_DETAIL", 51, "trader_address_detail");
    public static final TokenDetailButtonName TRADE = new TokenDetailButtonName("TRADE", 52, ExtJson.BRC20TYPE_TRADE);
    public static final TokenDetailButtonName VIBES = new TokenDetailButtonName("VIBES", 53, "vibes");
    public static final TokenDetailButtonName X_LAUNCH_TAG = new TokenDetailButtonName("X_LAUNCH_TAG", 54, "xboost_launch_tag");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenDetailButtonName[] $values() {
        return new TokenDetailButtonName[]{ACTIVITIES, ACTIVITIES_DETAIL, ADDRESS_COPY, ADD_TO_WATCHLIST, ALERT, CHART, DATA, DATA_LIQUIDITY_TIME_CHANGE, DATA_LIQUIDITY_POOL_ADDRESS_COPY, DATA_LIQUIDITY_POOL_LIST_ITEM, DATA_LIQUIDITY_POOL_EXTERNAL_LINK, DEFI, EXPAND_STOCK_INFO, HOLDERS, HOLDERS_TOP_100, HOLDERS_GREATER_THAN_10, HOLDERS_BUBBLE_MAP, HOLDERS_DETAIL, INFO, INFO_CONTRACT_ADDRESS_COPY, INFO_DEFI, INFO_EXPAND, INFO_FDV_EXPLAIN, INFO_HOLDERS, INFO_LABEL_DEFINITION, INFO_LIQUIDITY, INFO_MARKET_CAP_EXPLAIN, INFO_READ_MORE, INFO_RISK, INFO_SEARCH_X, INFO_SOCIAL_X, INFO_SOCIAL_MEDIA, INFO_VIBES_CLICK, INFO_VOL_5M, INFO_VOL_1H, INFO_VOL_4H, INFO_VOL_24H, LIQUIDITY, LIQUIDITY_ADD, LIQUIDITY_ALL, LIQUIDITY_DEFI, LIQUIDITY_DETAIL, LIQUIDITY_REMOVE, LIQUIDITY_TOTAL, MARKET_STATUS, QUICK_BUY_BUTTON, RISK, SHARE, SUBTABS_ADDRESS_EXPLANATION, SUBTABS_CURRENCY_MODE, TOP_TRADERS, TRADER_ADDRESS_DETAIL, TRADE, VIBES, X_LAUNCH_TAG};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenDetailButtonName> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackingValue() {
        return this.trackingValue;
    }

    private TokenDetailButtonName(String str, int i, String str2) {
        this.trackingValue = str2;
    }

    static {
        TokenDetailButtonName[] tokenDetailButtonNameArr$values = $values();
        $VALUES = tokenDetailButtonNameArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenDetailButtonNameArr$values);
        Companion = new Application(null);
    }

    public static final class Application {

        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] AEQbTJ;
            public static final /* synthetic */ int[] KWHzl;
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[CoinDetailTabType.values().length];
                try {
                    iArr[CoinDetailTabType.CHART.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CoinDetailTabType.INFO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CoinDetailTabType.DATA.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CoinDetailTabType.ASSESSMENT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CoinDetailTabType.FEEDS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[CoinDetailTabType.EARN.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                OLrzqt = iArr;
                int[] iArr2 = new int[LiquidityChangeType.values().length];
                try {
                    iArr2[LiquidityChangeType.All.ordinal()] = 1;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[LiquidityChangeType.Add.ordinal()] = 2;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[LiquidityChangeType.Remove.ordinal()] = 3;
                } catch (NoSuchFieldError unused9) {
                }
                KWHzl = iArr2;
                int[] iArr3 = new int[FilterTimeDuration.values().length];
                try {
                    iArr3[FilterTimeDuration.FIVE_MIN_CHANGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr3[FilterTimeDuration.ONE_HOUR_SELECTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr3[FilterTimeDuration.FOUR_HOUR_SELECTION.ordinal()] = 3;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr3[FilterTimeDuration.TWENTY_FOUR_HOURS_SELECTION.ordinal()] = 4;
                } catch (NoSuchFieldError unused13) {
                }
                AEQbTJ = iArr3;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.market.base.TokenDetailButtonName.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final TokenDetailButtonName KWHzl(@NotNull CoinDetailTabType coinDetailTabType) {
            Intrinsics.checkNotNullParameter(coinDetailTabType, "");
            switch (TaskDescription.OLrzqt[coinDetailTabType.ordinal()]) {
                case 1:
                    return TokenDetailButtonName.CHART;
                case 2:
                    return TokenDetailButtonName.INFO;
                case 3:
                    return TokenDetailButtonName.DATA;
                case 4:
                    return TokenDetailButtonName.RISK;
                case 5:
                    return TokenDetailButtonName.VIBES;
                case 6:
                    return TokenDetailButtonName.DEFI;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final TokenDetailButtonName KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.EZpvd((Object) str, (Object) ChartDetailFragment.Companion.SubChartTabType.HOLDER.getTrackingValue())) {
                return TokenDetailButtonName.HOLDERS;
            }
            if (Intrinsics.EZpvd((Object) str, (Object) ChartDetailFragment.Companion.SubChartTabType.TRADER.getTrackingValue())) {
                return TokenDetailButtonName.TOP_TRADERS;
            }
            if (Intrinsics.EZpvd((Object) str, (Object) ChartDetailFragment.Companion.SubChartTabType.HISTORY.getTrackingValue())) {
                return TokenDetailButtonName.ACTIVITIES;
            }
            if (Intrinsics.EZpvd((Object) str, (Object) ChartDetailFragment.Companion.SubChartTabType.LIQUIDITY.getTrackingValue())) {
                return TokenDetailButtonName.LIQUIDITY;
            }
            return null;
        }

        public final TokenDetailButtonName OLrzqt(@NotNull InterfaceC26302jZk.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            if (activity instanceof InterfaceC26302jZk.Activity.Dialog) {
                return TokenDetailButtonName.HOLDERS_TOP_100;
            }
            if (activity instanceof InterfaceC26302jZk.Activity.TaskDescription) {
                return TokenDetailButtonName.HOLDERS_GREATER_THAN_10;
            }
            if (activity instanceof InterfaceC26302jZk.Activity.StateListAnimator) {
                return TokenDetailButtonName.HOLDERS_BUBBLE_MAP;
            }
            if (activity instanceof InterfaceC26302jZk.Activity.C0864Activity) {
                return TokenDetailButtonName.SUBTABS_CURRENCY_MODE;
            }
            if (activity instanceof InterfaceC26302jZk.Activity.ActionBar) {
                return TokenDetailButtonName.SUBTABS_ADDRESS_EXPLANATION;
            }
            if ((activity instanceof InterfaceC26302jZk.Activity.PendingIntent) || (activity instanceof InterfaceC26302jZk.Activity.Application)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final TokenDetailButtonName OLrzqt(@NotNull LiquidityChangeType liquidityChangeType) {
            Intrinsics.checkNotNullParameter(liquidityChangeType, "");
            int i = TaskDescription.KWHzl[liquidityChangeType.ordinal()];
            if (i == 1) {
                return TokenDetailButtonName.LIQUIDITY_ALL;
            }
            if (i == 2) {
                return TokenDetailButtonName.LIQUIDITY_ADD;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return TokenDetailButtonName.LIQUIDITY_REMOVE;
        }

        public final TokenDetailButtonName OLrzqt(@NotNull FilterTimeDuration filterTimeDuration) {
            Intrinsics.checkNotNullParameter(filterTimeDuration, "");
            int i = TaskDescription.AEQbTJ[filterTimeDuration.ordinal()];
            if (i == 1) {
                return TokenDetailButtonName.INFO_VOL_5M;
            }
            if (i == 2) {
                return TokenDetailButtonName.INFO_VOL_1H;
            }
            if (i == 3) {
                return TokenDetailButtonName.INFO_VOL_4H;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return TokenDetailButtonName.INFO_VOL_24H;
        }

        public final TokenDetailButtonName EZpvd(@NotNull Social social) {
            Intrinsics.checkNotNullParameter(social, "");
            return Intrinsics.EZpvd((Object) social.OLrzqt(), (Object) SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER) ? TokenDetailButtonName.INFO_SOCIAL_X : TokenDetailButtonName.INFO_SOCIAL_MEDIA;
        }
    }

    public static TokenDetailButtonName valueOf(String str) {
        return (TokenDetailButtonName) Enum.valueOf(TokenDetailButtonName.class, str);
    }

    public static TokenDetailButtonName[] values() {
        return (TokenDetailButtonName[]) $VALUES.clone();
    }
}
