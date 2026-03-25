package com.okinc.buysell.api.data;

import com.okinc.buysell.api.data.OKPaymentSourceLegacy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56423yEv;
import o.C56444yFp;
import o.C56548yJl;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class OKPaymentSourceLegacy {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKPaymentSourceLegacy[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static final InterfaceC56387yDm<Map<String, OKPaymentSourceLegacy>> sourceMap$delegate;
    private final String tag;
    public static final OKPaymentSourceLegacy LITE_ONBOARDING = new OKPaymentSourceLegacy("LITE_ONBOARDING", 0, "lite_onboarding");
    public static final OKPaymentSourceLegacy LITE_ONBOARDING_TOPUP = new OKPaymentSourceLegacy("LITE_ONBOARDING_TOPUP", 1, "lite_onboarding_topup");
    public static final OKPaymentSourceLegacy LITE_USER_CENTER = new OKPaymentSourceLegacy("LITE_USER_CENTER", 2, "lite_user_center");
    public static final OKPaymentSourceLegacy LITE_HOME_PAGE = new OKPaymentSourceLegacy("LITE_HOME_PAGE", 3, "lite_home_page");
    public static final OKPaymentSourceLegacy LITE_HOME_LIST = new OKPaymentSourceLegacy("LITE_HOME_LIST", 4, "lite_home_list");
    public static final OKPaymentSourceLegacy LITE_EXPLORE_LIST = new OKPaymentSourceLegacy("LITE_EXPLORE_LIST", 5, "lite_explore_list");
    public static final OKPaymentSourceLegacy LITE_TOKEN_DETAILS = new OKPaymentSourceLegacy("LITE_TOKEN_DETAILS", 6, "lite_token_details");
    public static final OKPaymentSourceLegacy LITE_TOKEN_DETAILS_BOTTOM = new OKPaymentSourceLegacy("LITE_TOKEN_DETAILS_BOTTOM", 7, "lite_token_details_bottom");
    public static final OKPaymentSourceLegacy LITE_PORTFOLIO_TOKEN = new OKPaymentSourceLegacy("LITE_PORTFOLIO_TOKEN", 8, "lite_portfolio_token");
    public static final OKPaymentSourceLegacy LITE_EARN_TOPUP = new OKPaymentSourceLegacy("LITE_EARN_TOPUP", 9, "lite_earn_topup");
    public static final OKPaymentSourceLegacy LITE_EARN = new OKPaymentSourceLegacy("LITE_EARN", 10, "lite_earn");
    public static final OKPaymentSourceLegacy LITE_PORTFOLIO_HOME = new OKPaymentSourceLegacy("LITE_PORTFOLIO_HOME", 11, "lite_portfolio_home");
    public static final OKPaymentSourceLegacy LITE_CONVERT_TOPUP = new OKPaymentSourceLegacy("LITE_CONVERT_TOPUP", 12, "lite_convert_topup");
    public static final OKPaymentSourceLegacy LITE_PORTFOLIO_EMPTY_STATE = new OKPaymentSourceLegacy("LITE_PORTFOLIO_EMPTY_STATE", 13, "lite_portfolio_empty_state");
    public static final OKPaymentSourceLegacy LITE_ADVANCE_TRADE_TOPUP = new OKPaymentSourceLegacy("LITE_ADVANCE_TRADE_TOPUP", 14, "lite_advance_trade_topup");
    public static final OKPaymentSourceLegacy LITE_PORTFOLIO_TRANSACTION_HISTORY = new OKPaymentSourceLegacy("LITE_PORTFOLIO_TRANSACTION_HISTORY", 15, "lite_portfolio_transaction_history");
    public static final OKPaymentSourceLegacy LITE_REWARD_CENTER = new OKPaymentSourceLegacy("LITE_REWARD_CENTER", 16, "lite_reward_center");
    public static final OKPaymentSourceLegacy LITE_KYC_SUCCESS = new OKPaymentSourceLegacy("LITE_KYC_SUCCESS", 17, "lite_kyc_success");
    public static final OKPaymentSourceLegacy PRO_HOME_PAGE = new OKPaymentSourceLegacy("PRO_HOME_PAGE", 18, "pro_home_page");
    public static final OKPaymentSourceLegacy PRO_USER_CENTER = new OKPaymentSourceLegacy("PRO_USER_CENTER", 19, "pro_user_center");
    public static final OKPaymentSourceLegacy PRO_SPOT_TRADE = new OKPaymentSourceLegacy("PRO_SPOT_TRADE", 20, "pro_spot_trade");
    public static final OKPaymentSourceLegacy PRO_MARGIN_TRADE = new OKPaymentSourceLegacy("PRO_MARGIN_TRADE", 21, "pro_margin_trade");
    public static final OKPaymentSourceLegacy PRO_PERPETUAL_TRADE = new OKPaymentSourceLegacy("PRO_PERPETUAL_TRADE", 22, "pro_perpetual_trade");
    public static final OKPaymentSourceLegacy PRO_FUTURES_TRADE = new OKPaymentSourceLegacy("PRO_FUTURES_TRADE", 23, "pro_futures_trade");
    public static final OKPaymentSourceLegacy PRO_EARN_TOPUP = new OKPaymentSourceLegacy("PRO_EARN_TOPUP", 24, "pro_earn_topup");
    public static final OKPaymentSourceLegacy PRO_REWARD_CENTER = new OKPaymentSourceLegacy("PRO_REWARD_CENTER", 25, "pro_reward_center");
    public static final OKPaymentSourceLegacy PRO_TRADE_NO_ASSET = new OKPaymentSourceLegacy("PRO_TRADE_NO_ASSET", 26, "pro_trade_no_asset");
    public static final OKPaymentSourceLegacy PRO_KYC_SUCCESS = new OKPaymentSourceLegacy("PRO_KYC_SUCCESS", 27, "pro_kyc_success");
    public static final OKPaymentSourceLegacy LITE_ASSET_TOPUP = new OKPaymentSourceLegacy("LITE_ASSET_TOPUP", 28, "lite_asset_topup");
    public static final OKPaymentSourceLegacy PRO_ASSET_TOPUP = new OKPaymentSourceLegacy("PRO_ASSET_TOPUP", 29, "pro_asset_topup");
    public static final OKPaymentSourceLegacy PAYMENT_INTERNAL_FLOW = new OKPaymentSourceLegacy("PAYMENT_INTERNAL_FLOW", 30, "payment_internal_flow");
    public static final OKPaymentSourceLegacy UNKNOWN_SOURCE = new OKPaymentSourceLegacy("UNKNOWN_SOURCE", 31, "unknown_source");
    public static final OKPaymentSourceLegacy SIMPLE_TRADE_TAB = new OKPaymentSourceLegacy("SIMPLE_TRADE_TAB", 32, "simple_trade_tab");
    public static final OKPaymentSourceLegacy PUSH_NOTIFICATION = new OKPaymentSourceLegacy("PUSH_NOTIFICATION", 33, "push_notification");
    public static final OKPaymentSourceLegacy PUSH_NOTIFICATION_RECURRING = new OKPaymentSourceLegacy("PUSH_NOTIFICATION_RECURRING", 34, "push_notification_recurring");
    public static final OKPaymentSourceLegacy KYC_POA = new OKPaymentSourceLegacy("KYC_POA", 35, "kyc_poa");
    public static final OKPaymentSourceLegacy ORDER_RESULT = new OKPaymentSourceLegacy("ORDER_RESULT", 36, "order_result");
    public static final OKPaymentSourceLegacy WEB3_PAY = new OKPaymentSourceLegacy("WEB3_PAY", 37, "web3_pay");
    public static final OKPaymentSourceLegacy WEB3_ADD_FUNDS = new OKPaymentSourceLegacy("WEB3_ADD_FUNDS", 38, "web3_add_funds");
    public static final OKPaymentSourceLegacy RETRY = new OKPaymentSourceLegacy("RETRY", 39, "retry");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKPaymentSourceLegacy[] $values() {
        return new OKPaymentSourceLegacy[]{LITE_ONBOARDING, LITE_ONBOARDING_TOPUP, LITE_USER_CENTER, LITE_HOME_PAGE, LITE_HOME_LIST, LITE_EXPLORE_LIST, LITE_TOKEN_DETAILS, LITE_TOKEN_DETAILS_BOTTOM, LITE_PORTFOLIO_TOKEN, LITE_EARN_TOPUP, LITE_EARN, LITE_PORTFOLIO_HOME, LITE_CONVERT_TOPUP, LITE_PORTFOLIO_EMPTY_STATE, LITE_ADVANCE_TRADE_TOPUP, LITE_PORTFOLIO_TRANSACTION_HISTORY, LITE_REWARD_CENTER, LITE_KYC_SUCCESS, PRO_HOME_PAGE, PRO_USER_CENTER, PRO_SPOT_TRADE, PRO_MARGIN_TRADE, PRO_PERPETUAL_TRADE, PRO_FUTURES_TRADE, PRO_EARN_TOPUP, PRO_REWARD_CENTER, PRO_TRADE_NO_ASSET, PRO_KYC_SUCCESS, LITE_ASSET_TOPUP, PRO_ASSET_TOPUP, PAYMENT_INTERNAL_FLOW, UNKNOWN_SOURCE, SIMPLE_TRADE_TAB, PUSH_NOTIFICATION, PUSH_NOTIFICATION_RECURRING, KYC_POA, ORDER_RESULT, WEB3_PAY, WEB3_ADD_FUNDS, RETRY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKPaymentSourceLegacy> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    private OKPaymentSourceLegacy(String str, int i, String str2) {
        this.tag = str2;
    }

    static {
        OKPaymentSourceLegacy[] oKPaymentSourceLegacyArr$values = $values();
        $VALUES = oKPaymentSourceLegacyArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKPaymentSourceLegacyArr$values);
        Companion = new Companion(null);
        sourceMap$delegate = C56392yDr.copydefault(new Function0() { // from class: o.ltl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKPaymentSourceLegacy.sourceMap_delegate$lambda$0();
            }
        });
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.ltn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKPaymentSourceLegacy._init_$_anonymous_();
            }
        });
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.api.data.OKPaymentSourceLegacy.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) OKPaymentSourceLegacy.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<OKPaymentSourceLegacy> serializer() {
            return KWHzl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.buysell.api.data.OKPaymentSourceLegacy", values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map sourceMap_delegate$lambda$0() {
        OKPaymentSourceLegacy[] oKPaymentSourceLegacyArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(oKPaymentSourceLegacyArrValues.length), 16));
        for (OKPaymentSourceLegacy oKPaymentSourceLegacy : oKPaymentSourceLegacyArrValues) {
            linkedHashMap.put(oKPaymentSourceLegacy.tag, oKPaymentSourceLegacy);
        }
        return linkedHashMap;
    }

    public static OKPaymentSourceLegacy valueOf(String str) {
        return (OKPaymentSourceLegacy) Enum.valueOf(OKPaymentSourceLegacy.class, str);
    }

    public static OKPaymentSourceLegacy[] values() {
        return (OKPaymentSourceLegacy[]) $VALUES.clone();
    }
}
