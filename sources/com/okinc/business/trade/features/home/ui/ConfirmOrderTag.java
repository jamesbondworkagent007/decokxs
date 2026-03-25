package com.okinc.business.trade.features.home.ui;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ConfirmOrderTag {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ConfirmOrderTag[] $VALUES;
    public static final ConfirmOrderTag ORDER_TYPE = new ConfirmOrderTag("ORDER_TYPE", 0);
    public static final ConfirmOrderTag MARKET_PRICE = new ConfirmOrderTag("MARKET_PRICE", 1);
    public static final ConfirmOrderTag MIN_RECEIVE = new ConfirmOrderTag("MIN_RECEIVE", 2);
    public static final ConfirmOrderTag NETWORK_FEE = new ConfirmOrderTag("NETWORK_FEE", 3);
    public static final ConfirmOrderTag SERVICE_FEE = new ConfirmOrderTag("SERVICE_FEE", 4);
    public static final ConfirmOrderTag SLIPPAGE = new ConfirmOrderTag("SLIPPAGE", 5);
    public static final ConfirmOrderTag EST_RECEIVE = new ConfirmOrderTag("EST_RECEIVE", 6);
    public static final ConfirmOrderTag SELL_AMOUNT = new ConfirmOrderTag("SELL_AMOUNT", 7);
    public static final ConfirmOrderTag FROM_AMOUNT = new ConfirmOrderTag("FROM_AMOUNT", 8);
    public static final ConfirmOrderTag EXPIRES_AFTER = new ConfirmOrderTag("EXPIRES_AFTER", 9);
    public static final ConfirmOrderTag TRIGGER_PRICE = new ConfirmOrderTag("TRIGGER_PRICE", 10);
    public static final ConfirmOrderTag ROUTER = new ConfirmOrderTag("ROUTER", 11);
    public static final ConfirmOrderTag VALUE_DIFF = new ConfirmOrderTag("VALUE_DIFF", 12);
    public static final ConfirmOrderTag BOOST = new ConfirmOrderTag("BOOST", 13);

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ConfirmOrderTag.values().length];
            try {
                iArr[ConfirmOrderTag.ORDER_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConfirmOrderTag.MARKET_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConfirmOrderTag.FROM_AMOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConfirmOrderTag.MIN_RECEIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ConfirmOrderTag.NETWORK_FEE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ConfirmOrderTag.ROUTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ConfirmOrderTag.SERVICE_FEE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ConfirmOrderTag[] $values() {
        return new ConfirmOrderTag[]{ORDER_TYPE, MARKET_PRICE, MIN_RECEIVE, NETWORK_FEE, SERVICE_FEE, SLIPPAGE, EST_RECEIVE, SELL_AMOUNT, FROM_AMOUNT, EXPIRES_AFTER, TRIGGER_PRICE, ROUTER, VALUE_DIFF, BOOST};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ConfirmOrderTag> getEntries() {
        return $ENTRIES;
    }

    private ConfirmOrderTag(String str, int i) {
    }

    static {
        ConfirmOrderTag[] confirmOrderTagArr$values = $values();
        $VALUES = confirmOrderTagArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(confirmOrderTagArr$values);
    }

    public final String getContentDescription() {
        switch (Activity.AEQbTJ[ordinal()]) {
            case 1:
                return "web3_dex_advance_order_confirmation_order_type_row";
            case 2:
                return "web3_dex_advance_order_confirmation_price_row";
            case 3:
                return "web3_dex_advance_order_confirmation_paying_row";
            case 4:
                return "web3_dex_advance_order_confirmation_min_receive_row";
            case 5:
                return "web3_dex_advance_order_confirmation_network_fee_row";
            case 6:
                return "web3_dex_advance_order_confirmation_provider_row";
            case 7:
                return "web3_dex_advance_order_confirmation_est_service_fee_row";
            default:
                return "";
        }
    }

    public static ConfirmOrderTag valueOf(String str) {
        return (ConfirmOrderTag) Enum.valueOf(ConfirmOrderTag.class, str);
    }

    public static ConfirmOrderTag[] values() {
        return (ConfirmOrderTag[]) $VALUES.clone();
    }
}
