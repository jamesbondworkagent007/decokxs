package com.okinc.okx.paymentapi.service;

import com.okinc.okx.paymentapi.service.OKPaymentSource;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56403yEb;
import o.C56423yEv;
import o.C56444yFp;
import o.C56548yJl;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKPaymentSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKPaymentSource[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static final InterfaceC56387yDm<Map<String, OKPaymentSource>> sourceMap$delegate;
    private final String tag;
    public static final OKPaymentSource LITE_ONBOARDING = new OKPaymentSource("LITE_ONBOARDING", 0, "lite_onboarding");
    public static final OKPaymentSource LITE_ONBOARDING_TOPUP = new OKPaymentSource("LITE_ONBOARDING_TOPUP", 1, "lite_onboarding_topup");
    public static final OKPaymentSource LITE_USER_CENTER = new OKPaymentSource("LITE_USER_CENTER", 2, "lite_user_center");
    public static final OKPaymentSource LITE_HOME_PAGE = new OKPaymentSource("LITE_HOME_PAGE", 3, "lite_home_page");
    public static final OKPaymentSource LITE_HOME_LIST = new OKPaymentSource("LITE_HOME_LIST", 4, "lite_home_list");
    public static final OKPaymentSource LITE_EXPLORE_LIST = new OKPaymentSource("LITE_EXPLORE_LIST", 5, "lite_explore_list");
    public static final OKPaymentSource LITE_TOKEN_DETAILS = new OKPaymentSource("LITE_TOKEN_DETAILS", 6, "lite_token_details");
    public static final OKPaymentSource LITE_TOKEN_DETAILS_BOTTOM = new OKPaymentSource("LITE_TOKEN_DETAILS_BOTTOM", 7, "lite_token_details_bottom");
    public static final OKPaymentSource LITE_PORTFOLIO_TOKEN = new OKPaymentSource("LITE_PORTFOLIO_TOKEN", 8, "lite_portfolio_token");
    public static final OKPaymentSource LITE_EARN_TOPUP = new OKPaymentSource("LITE_EARN_TOPUP", 9, "lite_earn_topup");
    public static final OKPaymentSource LITE_EARN = new OKPaymentSource("LITE_EARN", 10, "lite_earn");
    public static final OKPaymentSource LITE_PORTFOLIO_HOME = new OKPaymentSource("LITE_PORTFOLIO_HOME", 11, "lite_portfolio_home");
    public static final OKPaymentSource LITE_CONVERT_TOPUP = new OKPaymentSource("LITE_CONVERT_TOPUP", 12, "lite_convert_topup");
    public static final OKPaymentSource LITE_PORTFOLIO_EMPTY_STATE = new OKPaymentSource("LITE_PORTFOLIO_EMPTY_STATE", 13, "lite_portfolio_empty_state");
    public static final OKPaymentSource LITE_ADVANCE_TRADE_TOPUP = new OKPaymentSource("LITE_ADVANCE_TRADE_TOPUP", 14, "lite_advance_trade_topup");
    public static final OKPaymentSource LITE_PORTFOLIO_TRANSACTION_HISTORY = new OKPaymentSource("LITE_PORTFOLIO_TRANSACTION_HISTORY", 15, "lite_portfolio_transaction_history");
    public static final OKPaymentSource LITE_REWARD_CENTER = new OKPaymentSource("LITE_REWARD_CENTER", 16, "lite_reward_center");
    public static final OKPaymentSource LITE_KYC_SUCCESS = new OKPaymentSource("LITE_KYC_SUCCESS", 17, "lite_kyc_success");
    public static final OKPaymentSource PRO_HOME_PAGE = new OKPaymentSource("PRO_HOME_PAGE", 18, "pro_home_page");
    public static final OKPaymentSource PRO_USER_CENTER = new OKPaymentSource("PRO_USER_CENTER", 19, "pro_user_center");
    public static final OKPaymentSource PRO_SPOT_TRADE = new OKPaymentSource("PRO_SPOT_TRADE", 20, "pro_spot_trade");
    public static final OKPaymentSource PRO_MARGIN_TRADE = new OKPaymentSource("PRO_MARGIN_TRADE", 21, "pro_margin_trade");
    public static final OKPaymentSource PRO_PERPETUAL_TRADE = new OKPaymentSource("PRO_PERPETUAL_TRADE", 22, "pro_perpetual_trade");
    public static final OKPaymentSource PRO_FUTURES_TRADE = new OKPaymentSource("PRO_FUTURES_TRADE", 23, "pro_futures_trade");
    public static final OKPaymentSource PRO_EARN_TOPUP = new OKPaymentSource("PRO_EARN_TOPUP", 24, "pro_earn_topup");
    public static final OKPaymentSource PRO_REWARD_CENTER = new OKPaymentSource("PRO_REWARD_CENTER", 25, "pro_reward_center");
    public static final OKPaymentSource PRO_TRADE_NO_ASSET = new OKPaymentSource("PRO_TRADE_NO_ASSET", 26, "pro_trade_no_asset");
    public static final OKPaymentSource PRO_KYC_SUCCESS = new OKPaymentSource("PRO_KYC_SUCCESS", 27, "pro_kyc_success");
    public static final OKPaymentSource LITE_ASSET_TOPUP = new OKPaymentSource("LITE_ASSET_TOPUP", 28, "lite_asset_topup");
    public static final OKPaymentSource PRO_ASSET_TOPUP = new OKPaymentSource("PRO_ASSET_TOPUP", 29, "pro_asset_topup");
    public static final OKPaymentSource PAYMENT_INTERNAL_FLOW = new OKPaymentSource("PAYMENT_INTERNAL_FLOW", 30, "payment_internal_flow");
    public static final OKPaymentSource UNKNOWN_SOURCE = new OKPaymentSource("UNKNOWN_SOURCE", 31, "unknown_source");
    public static final OKPaymentSource TOPUP_PIX_ORDER_DETAIL = new OKPaymentSource("TOPUP_PIX_ORDER_DETAIL", 32, "topup_pix_order_detail");
    public static final OKPaymentSource SIMPLE_TRADE_TAB = new OKPaymentSource("SIMPLE_TRADE_TAB", 33, "simple_trade_tab");
    public static final OKPaymentSource PUSH_NOTIFICATION = new OKPaymentSource("PUSH_NOTIFICATION", 34, "push_notification");
    public static final OKPaymentSource PUSH_NOTIFICATION_RECURRING = new OKPaymentSource("PUSH_NOTIFICATION_RECURRING", 35, "push_notification_recurring");
    public static final OKPaymentSource KYC_POA = new OKPaymentSource("KYC_POA", 36, "kyc_poa");
    public static final OKPaymentSource ORDER_RESULT = new OKPaymentSource("ORDER_RESULT", 37, "order_result");
    public static final OKPaymentSource BUY_WITH_REWARDS = new OKPaymentSource("BUY_WITH_REWARDS", 38, "buy_with_rewards");
    public static final OKPaymentSource ACTIVITY_RECURRING_BUY = new OKPaymentSource("ACTIVITY_RECURRING_BUY", 39, "activity_recurring_buy");
    public static final OKPaymentSource WEB3_PAY = new OKPaymentSource("WEB3_PAY", 40, "web3_pay");
    public static final OKPaymentSource WEB3_ADD_FUNDS = new OKPaymentSource("WEB3_ADD_FUNDS", 41, "web3_add_funds");
    public static final OKPaymentSource FTT = new OKPaymentSource("FTT", 42, "ftt");
    public static final OKPaymentSource RETRY = new OKPaymentSource("RETRY", 43, "retry");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKPaymentSource[] $values() {
        return new OKPaymentSource[]{LITE_ONBOARDING, LITE_ONBOARDING_TOPUP, LITE_USER_CENTER, LITE_HOME_PAGE, LITE_HOME_LIST, LITE_EXPLORE_LIST, LITE_TOKEN_DETAILS, LITE_TOKEN_DETAILS_BOTTOM, LITE_PORTFOLIO_TOKEN, LITE_EARN_TOPUP, LITE_EARN, LITE_PORTFOLIO_HOME, LITE_CONVERT_TOPUP, LITE_PORTFOLIO_EMPTY_STATE, LITE_ADVANCE_TRADE_TOPUP, LITE_PORTFOLIO_TRANSACTION_HISTORY, LITE_REWARD_CENTER, LITE_KYC_SUCCESS, PRO_HOME_PAGE, PRO_USER_CENTER, PRO_SPOT_TRADE, PRO_MARGIN_TRADE, PRO_PERPETUAL_TRADE, PRO_FUTURES_TRADE, PRO_EARN_TOPUP, PRO_REWARD_CENTER, PRO_TRADE_NO_ASSET, PRO_KYC_SUCCESS, LITE_ASSET_TOPUP, PRO_ASSET_TOPUP, PAYMENT_INTERNAL_FLOW, UNKNOWN_SOURCE, TOPUP_PIX_ORDER_DETAIL, SIMPLE_TRADE_TAB, PUSH_NOTIFICATION, PUSH_NOTIFICATION_RECURRING, KYC_POA, ORDER_RESULT, BUY_WITH_REWARDS, ACTIVITY_RECURRING_BUY, WEB3_PAY, WEB3_ADD_FUNDS, FTT, RETRY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKPaymentSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    private OKPaymentSource(String str, int i, String str2) {
        this.tag = str2;
    }

    static {
        OKPaymentSource[] oKPaymentSourceArr$values = $values();
        $VALUES = oKPaymentSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKPaymentSourceArr$values);
        Companion = new Companion(null);
        sourceMap$delegate = C56392yDr.copydefault(new Function0() { // from class: o.tna
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKPaymentSource.sourceMap_delegate$lambda$0();
            }
        });
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.tnf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKPaymentSource._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.service.OKPaymentSource.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) OKPaymentSource.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<OKPaymentSource> serializer() {
            return OLrzqt();
        }

        public final Map<String, OKPaymentSource> copydefault() {
            return (Map) OKPaymentSource.sourceMap$delegate.getValue();
        }

        public final OKPaymentSource KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            OKPaymentSource oKPaymentSource = copydefault().get(str);
            return oKPaymentSource == null ? OKPaymentSource.UNKNOWN_SOURCE : oKPaymentSource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.okx.paymentapi.service.OKPaymentSource", values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map sourceMap_delegate$lambda$0() {
        InterfaceC56445yFq<OKPaymentSource> entries = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(entries, 10)), 16));
        for (OKPaymentSource oKPaymentSource : entries) {
            linkedHashMap.put(oKPaymentSource.tag, oKPaymentSource);
        }
        return linkedHashMap;
    }

    public static OKPaymentSource valueOf(String str) {
        return (OKPaymentSource) Enum.valueOf(OKPaymentSource.class, str);
    }

    public static OKPaymentSource[] values() {
        return (OKPaymentSource[]) $VALUES.clone();
    }
}
