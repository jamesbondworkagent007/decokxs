package com.okinc.buysell.util;

import com.okinc.buysell.util.ABTestFeatureFlag;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class ABTestFeatureFlag {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ABTestFeatureFlag[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String tag;
    public static final ABTestFeatureFlag BSC_TRADING_ACCOUNT = new ABTestFeatureFlag("BSC_TRADING_ACCOUNT", 0, "bsc-trading-account");
    public static final ABTestFeatureFlag BSC_FUZZY_SEARCH = new ABTestFeatureFlag("BSC_FUZZY_SEARCH", 1, "bsc-fuzzy-search");
    public static final ABTestFeatureFlag BSC_RECURRING_BUY = new ABTestFeatureFlag("BSC_RECURRING_BUY", 2, "bsc-recurring-buy");
    public static final ABTestFeatureFlag BANK_LIST_FUZZY_SEARCH = new ABTestFeatureFlag("BANK_LIST_FUZZY_SEARCH", 3, "bank-list-fuzzy-search");
    public static final ABTestFeatureFlag BUY_MCLAREN_CAMPAIGN = new ABTestFeatureFlag("BUY_MCLAREN_CAMPAIGN", 4, "buy-mclaren-campaign");
    public static final ABTestFeatureFlag CRYPTO_DROPDOWN_LIVE_CHANGES = new ABTestFeatureFlag("CRYPTO_DROPDOWN_LIVE_CHANGES", 5, "bsc-chip-percentage");
    public static final ABTestFeatureFlag BSC_ONE_CLICK_EARN = new ABTestFeatureFlag("BSC_ONE_CLICK_EARN", 6, "bsc-one-click-earn");
    public static final ABTestFeatureFlag RECURRING_BUY_EDIT_AMOUNT_AND_FREQUENCY = new ABTestFeatureFlag("RECURRING_BUY_EDIT_AMOUNT_AND_FREQUENCY", 7, "recurring_buy_edit_amount_and_frequency");
    public static final ABTestFeatureFlag RECURRING_BUY_EDIT_PAYMENT_METHOD = new ABTestFeatureFlag("RECURRING_BUY_EDIT_PAYMENT_METHOD", 8, "recurring_buy_edit_payment_method");
    public static final ABTestFeatureFlag SDUI_WITHDRAW = new ABTestFeatureFlag("SDUI_WITHDRAW", 9, "withdrawal-sdui");
    public static final ABTestFeatureFlag PAYMENT_BOTTOMSHEET = new ABTestFeatureFlag("PAYMENT_BOTTOMSHEET", 10, "payment_bottomsheet");
    public static final ABTestFeatureFlag CONTEXTUAL_SMART_BOT = new ABTestFeatureFlag("CONTEXTUAL_SMART_BOT", 11, "fiat_payments_chatbot_unified_entrance");
    public static final ABTestFeatureFlag DW_INPUT_DEBOUNCE = new ABTestFeatureFlag("DW_INPUT_DEBOUNCE", 12, "deposit-withdraw-input-debounce");
    public static final ABTestFeatureFlag SHOW_ALL_PAYMENTS = new ABTestFeatureFlag("SHOW_ALL_PAYMENTS", 13, "show_all_payments");
    public static final ABTestFeatureFlag RECURRING_BUY_PNL_REVAMP = new ABTestFeatureFlag("RECURRING_BUY_PNL_REVAMP", 14, "recurring_buy_pnl_revamp");
    public static final ABTestFeatureFlag CR_CEDEFI_SEARCH_CAP = new ABTestFeatureFlag("CR_CEDEFI_SEARCH_CAP", 15, "cr_cedefi_search_cap");
    public static final ABTestFeatureFlag BSC_CRYPTO_LIST_L2 = new ABTestFeatureFlag("BSC_CRYPTO_LIST_L2", 16, "buysell-token-list-preselect");
    public static final ABTestFeatureFlag BUY_CAMPAIGN = new ABTestFeatureFlag("BUY_CAMPAIGN", 17, "buy_crypto_with_rewards_campaign");
    public static final ABTestFeatureFlag BSC_NEW_AMOUNT_DISPLAY = new ABTestFeatureFlag("BSC_NEW_AMOUNT_DISPLAY", 18, "bsc_new_amount_display");
    public static final ABTestFeatureFlag ANDROID_SUBMIT_LIST_CRASH_FIX = new ABTestFeatureFlag("ANDROID_SUBMIT_LIST_CRASH_FIX", 19, "android_submit_list_crash_fix");
    public static final ABTestFeatureFlag OEX_OTC_AGENT_ENTRY = new ABTestFeatureFlag("OEX_OTC_AGENT_ENTRY", 20, "oex_otc_agent_entry");
    public static final ABTestFeatureFlag RUST_BSC_ORDER_DETAIL = new ABTestFeatureFlag("RUST_BSC_ORDER_DETAIL", 21, "rust_bsc_order_detail");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ABTestFeatureFlag[] $values() {
        return new ABTestFeatureFlag[]{BSC_TRADING_ACCOUNT, BSC_FUZZY_SEARCH, BSC_RECURRING_BUY, BANK_LIST_FUZZY_SEARCH, BUY_MCLAREN_CAMPAIGN, CRYPTO_DROPDOWN_LIVE_CHANGES, BSC_ONE_CLICK_EARN, RECURRING_BUY_EDIT_AMOUNT_AND_FREQUENCY, RECURRING_BUY_EDIT_PAYMENT_METHOD, SDUI_WITHDRAW, PAYMENT_BOTTOMSHEET, CONTEXTUAL_SMART_BOT, DW_INPUT_DEBOUNCE, SHOW_ALL_PAYMENTS, RECURRING_BUY_PNL_REVAMP, CR_CEDEFI_SEARCH_CAP, BSC_CRYPTO_LIST_L2, BUY_CAMPAIGN, BSC_NEW_AMOUNT_DISPLAY, ANDROID_SUBMIT_LIST_CRASH_FIX, OEX_OTC_AGENT_ENTRY, RUST_BSC_ORDER_DETAIL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ABTestFeatureFlag> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.util.ABTestFeatureFlag.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) ABTestFeatureFlag.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ABTestFeatureFlag> serializer() {
            return EZpvd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.buysell.util.ABTestFeatureFlag", values());
    }

    private ABTestFeatureFlag(String str, int i, String str2) {
        this.tag = str2;
    }

    static {
        ABTestFeatureFlag[] aBTestFeatureFlagArr$values = $values();
        $VALUES = aBTestFeatureFlagArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(aBTestFeatureFlagArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.lTQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ABTestFeatureFlag._init_$_anonymous_();
            }
        });
    }

    public static ABTestFeatureFlag valueOf(String str) {
        return (ABTestFeatureFlag) Enum.valueOf(ABTestFeatureFlag.class, str);
    }

    public static ABTestFeatureFlag[] values() {
        return (ABTestFeatureFlag[]) $VALUES.clone();
    }
}
