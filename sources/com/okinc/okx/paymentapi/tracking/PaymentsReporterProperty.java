package com.okinc.okx.paymentapi.tracking;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes19.dex */
public final class PaymentsReporterProperty {
    public static final PaymentsReporterProperty KWHzl = new PaymentsReporterProperty();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class PaymentsReportSource {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PaymentsReportSource[] $VALUES;
        private final String type;
        public static final PaymentsReportSource PAYMENT_ENTRANCE = new PaymentsReportSource("PAYMENT_ENTRANCE", 0, "payment_entrance");
        public static final PaymentsReportSource MANAGEMENT_CENTER_ENTRANCE = new PaymentsReportSource("MANAGEMENT_CENTER_ENTRANCE", 1, "management_center_entrance");
        public static final PaymentsReportSource CRYPTO_LIST = new PaymentsReportSource("CRYPTO_LIST", 2, "crypto_list");
        public static final PaymentsReportSource PAYMENT_AMOUNT = new PaymentsReportSource("PAYMENT_AMOUNT", 3, "payment_amount");
        public static final PaymentsReportSource PAYMENT_LIST = new PaymentsReportSource("PAYMENT_LIST", 4, "payment_list");
        public static final PaymentsReportSource ORDER_PREVIEW = new PaymentsReportSource("ORDER_PREVIEW", 5, "order_preview");
        public static final PaymentsReportSource DEFI_ENTRANCE = new PaymentsReportSource("DEFI_ENTRANCE", 6, "defi_entrance");
        public static final PaymentsReportSource CONVERT_ENTRANCE = new PaymentsReportSource("CONVERT_ENTRANCE", 7, "convert_entrance");
        public static final PaymentsReportSource SIMPLE_TRADE_L1_ENTRANCE = new PaymentsReportSource("SIMPLE_TRADE_L1_ENTRANCE", 8, "simple_trade_l1_entrance");
        public static final PaymentsReportSource SIMPLE_TRADE_L2_ENTRANCE = new PaymentsReportSource("SIMPLE_TRADE_L2_ENTRANCE", 9, "simple_trade_l2_entrance");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PaymentsReportSource[] $values() {
            return new PaymentsReportSource[]{PAYMENT_ENTRANCE, MANAGEMENT_CENTER_ENTRANCE, CRYPTO_LIST, PAYMENT_AMOUNT, PAYMENT_LIST, ORDER_PREVIEW, DEFI_ENTRANCE, CONVERT_ENTRANCE, SIMPLE_TRADE_L1_ENTRANCE, SIMPLE_TRADE_L2_ENTRANCE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PaymentsReportSource> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        private PaymentsReportSource(String str, int i, String str2) {
            this.type = str2;
        }

        static {
            PaymentsReportSource[] paymentsReportSourceArr$values = $values();
            $VALUES = paymentsReportSourceArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(paymentsReportSourceArr$values);
        }

        public static PaymentsReportSource valueOf(String str) {
            return (PaymentsReportSource) Enum.valueOf(PaymentsReportSource.class, str);
        }

        public static PaymentsReportSource[] values() {
            return (PaymentsReportSource[]) $VALUES.clone();
        }
    }

    private PaymentsReporterProperty() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class PaymentsReportAttrPage {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PaymentsReportAttrPage[] $VALUES;
        private final String type;
        public static final PaymentsReportAttrPage CRYPTO_LIST = new PaymentsReportAttrPage("CRYPTO_LIST", 0, "crypto_list");
        public static final PaymentsReportAttrPage FIAT_LIST = new PaymentsReportAttrPage("FIAT_LIST", 1, "fiat_list");
        public static final PaymentsReportAttrPage PAYMENT_AMOUNT = new PaymentsReportAttrPage("PAYMENT_AMOUNT", 2, "payment_amount");
        public static final PaymentsReportAttrPage PAYMENT_LIST = new PaymentsReportAttrPage("PAYMENT_LIST", 3, "payment_list");
        public static final PaymentsReportAttrPage PAYMENT_TIPS = new PaymentsReportAttrPage("PAYMENT_TIPS", 4, "payment_tips");
        public static final PaymentsReportAttrPage PAYMENT_INSTRUCTION = new PaymentsReportAttrPage("PAYMENT_INSTRUCTION", 5, "payment_instruction");
        public static final PaymentsReportAttrPage PAYMENT_ADD_ACCOUNT = new PaymentsReportAttrPage("PAYMENT_ADD_ACCOUNT", 6, "payment_add_account");
        public static final PaymentsReportAttrPage ORDER_PREVIEW = new PaymentsReportAttrPage("ORDER_PREVIEW", 7, "order_preview");
        public static final PaymentsReportAttrPage ORDER_PROCESSING = new PaymentsReportAttrPage("ORDER_PROCESSING", 8, "order_processing");
        public static final PaymentsReportAttrPage ADD_PAYMENT = new PaymentsReportAttrPage("ADD_PAYMENT", 9, "add_payment");
        public static final PaymentsReportAttrPage PAYMENT_CREATE_VIRTUAL_ACCOUNT = new PaymentsReportAttrPage("PAYMENT_CREATE_VIRTUAL_ACCOUNT", 10, "payment_create_virtual_account");
        public static final PaymentsReportAttrPage MANAGEMENT_CENTER_LIST = new PaymentsReportAttrPage("MANAGEMENT_CENTER_LIST", 11, "management_center_list");
        public static final PaymentsReportAttrPage WEB3 = new PaymentsReportAttrPage("WEB3", 12, "web3");
        public static final PaymentsReportAttrPage CHANNEL_QUOTATION = new PaymentsReportAttrPage("CHANNEL_QUOTATION", 13, "channel_quotation");
        public static final PaymentsReportAttrPage CHANNEL_QUOTATION_ORDER_PROCESSING = new PaymentsReportAttrPage("CHANNEL_QUOTATION_ORDER_PROCESSING", 14, "channel_quotation_order_processing");
        public static final PaymentsReportAttrPage CONVERT_PREVIEW = new PaymentsReportAttrPage("CONVERT_PREVIEW", 15, "convert_preview");
        public static final PaymentsReportAttrPage BSC_SIMPLE_TRADE = new PaymentsReportAttrPage("BSC_SIMPLE_TRADE", 16, "bsc_simple_trade");
        public static final PaymentsReportAttrPage DYNAMIC = new PaymentsReportAttrPage("DYNAMIC", 17, "dynamic");
        public static final PaymentsReportAttrPage LEAN = new PaymentsReportAttrPage("LEAN", 18, "lean");
        public static final PaymentsReportAttrPage PAYPAL = new PaymentsReportAttrPage("PAYPAL", 19, "paypal");
        public static final PaymentsReportAttrPage PLAID = new PaymentsReportAttrPage("PLAID", 20, "plaid");
        public static final PaymentsReportAttrPage THIRD_PARTY_POST_LOAD = new PaymentsReportAttrPage("THIRD_PARTY_POST_LOAD", 21, "third_party_post_load");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PaymentsReportAttrPage[] $values() {
            return new PaymentsReportAttrPage[]{CRYPTO_LIST, FIAT_LIST, PAYMENT_AMOUNT, PAYMENT_LIST, PAYMENT_TIPS, PAYMENT_INSTRUCTION, PAYMENT_ADD_ACCOUNT, ORDER_PREVIEW, ORDER_PROCESSING, ADD_PAYMENT, PAYMENT_CREATE_VIRTUAL_ACCOUNT, MANAGEMENT_CENTER_LIST, WEB3, CHANNEL_QUOTATION, CHANNEL_QUOTATION_ORDER_PROCESSING, CONVERT_PREVIEW, BSC_SIMPLE_TRADE, DYNAMIC, LEAN, PAYPAL, PLAID, THIRD_PARTY_POST_LOAD};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PaymentsReportAttrPage> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        private PaymentsReportAttrPage(String str, int i, String str2) {
            this.type = str2;
        }

        static {
            PaymentsReportAttrPage[] paymentsReportAttrPageArr$values = $values();
            $VALUES = paymentsReportAttrPageArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(paymentsReportAttrPageArr$values);
        }

        public static PaymentsReportAttrPage valueOf(String str) {
            return (PaymentsReportAttrPage) Enum.valueOf(PaymentsReportAttrPage.class, str);
        }

        public static PaymentsReportAttrPage[] values() {
            return (PaymentsReportAttrPage[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class PaymentsReportAttrType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PaymentsReportAttrType[] $VALUES;
        private final String type;
        public static final PaymentsReportAttrType BUY = new PaymentsReportAttrType("BUY", 0, "buy");
        public static final PaymentsReportAttrType SELL = new PaymentsReportAttrType("SELL", 1, "sell");
        public static final PaymentsReportAttrType DEPOSIT = new PaymentsReportAttrType("DEPOSIT", 2, "deposit");
        public static final PaymentsReportAttrType WITHDRAW = new PaymentsReportAttrType("WITHDRAW", 3, "withdraw");
        public static final PaymentsReportAttrType MANAGE = new PaymentsReportAttrType("MANAGE", 4, "manage");
        public static final PaymentsReportAttrType CONVERT = new PaymentsReportAttrType("CONVERT", 5, "convert");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PaymentsReportAttrType[] $values() {
            return new PaymentsReportAttrType[]{BUY, SELL, DEPOSIT, WITHDRAW, MANAGE, CONVERT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PaymentsReportAttrType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        private PaymentsReportAttrType(String str, int i, String str2) {
            this.type = str2;
        }

        static {
            PaymentsReportAttrType[] paymentsReportAttrTypeArr$values = $values();
            $VALUES = paymentsReportAttrTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(paymentsReportAttrTypeArr$values);
        }

        public static PaymentsReportAttrType valueOf(String str) {
            return (PaymentsReportAttrType) Enum.valueOf(PaymentsReportAttrType.class, str);
        }

        public static PaymentsReportAttrType[] values() {
            return (PaymentsReportAttrType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class PaymentsReportAttrChannel {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PaymentsReportAttrChannel[] $VALUES;
        private final String type;
        public static final PaymentsReportAttrChannel P2P = new PaymentsReportAttrChannel(CustomMessageData.SERVICE_NAME_P2P, 0, "OKX P2P");
        public static final PaymentsReportAttrChannel CARD = new PaymentsReportAttrChannel("CARD", 1, "CARD");
        public static final PaymentsReportAttrChannel PIX = new PaymentsReportAttrChannel("PIX", 2, "PIX");
        public static final PaymentsReportAttrChannel SEPA = new PaymentsReportAttrChannel("SEPA", 3, "SEPA");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PaymentsReportAttrChannel[] $values() {
            return new PaymentsReportAttrChannel[]{P2P, CARD, PIX, SEPA};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PaymentsReportAttrChannel> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        private PaymentsReportAttrChannel(String str, int i, String str2) {
            this.type = str2;
        }

        static {
            PaymentsReportAttrChannel[] paymentsReportAttrChannelArr$values = $values();
            $VALUES = paymentsReportAttrChannelArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(paymentsReportAttrChannelArr$values);
        }

        public static PaymentsReportAttrChannel valueOf(String str) {
            return (PaymentsReportAttrChannel) Enum.valueOf(PaymentsReportAttrChannel.class, str);
        }

        public static PaymentsReportAttrChannel[] values() {
            return (PaymentsReportAttrChannel[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class PaymentsReportOrderStatusCode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PaymentsReportOrderStatusCode[] $VALUES;
        private final String type;
        public static final PaymentsReportOrderStatusCode SUCCESS = new PaymentsReportOrderStatusCode("SUCCESS", 0, "");
        public static final PaymentsReportOrderStatusCode PENDING = new PaymentsReportOrderStatusCode(CardSyncResponse.PENDING, 1, "0");
        public static final PaymentsReportOrderStatusCode FAILURE = new PaymentsReportOrderStatusCode("FAILURE", 2, MultiTransferSignData.DEFAULT_INTERVAL);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PaymentsReportOrderStatusCode[] $values() {
            return new PaymentsReportOrderStatusCode[]{SUCCESS, PENDING, FAILURE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PaymentsReportOrderStatusCode> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        private PaymentsReportOrderStatusCode(String str, int i, String str2) {
            this.type = str2;
        }

        static {
            PaymentsReportOrderStatusCode[] paymentsReportOrderStatusCodeArr$values = $values();
            $VALUES = paymentsReportOrderStatusCodeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(paymentsReportOrderStatusCodeArr$values);
        }

        public static PaymentsReportOrderStatusCode valueOf(String str) {
            return (PaymentsReportOrderStatusCode) Enum.valueOf(PaymentsReportOrderStatusCode.class, str);
        }

        public static PaymentsReportOrderStatusCode[] values() {
            return (PaymentsReportOrderStatusCode[]) $VALUES.clone();
        }
    }
}
