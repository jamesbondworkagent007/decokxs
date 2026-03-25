package com.okinc.business.dexlogic.track.enums;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class DexHistoryDetailsFullPageClick {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DexHistoryDetailsFullPageClick[] $VALUES;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DexHistoryDetailsFullPageClick[] $values() {
        return new DexHistoryDetailsFullPageClick[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        DexHistoryDetailsFullPageClick[] dexHistoryDetailsFullPageClickArr$values = $values();
        $VALUES = dexHistoryDetailsFullPageClickArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dexHistoryDetailsFullPageClickArr$values);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DexHistoryDetailsFullPageClick> getEntries() {
        return $ENTRIES;
    }

    private DexHistoryDetailsFullPageClick(String str, int i) {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ButtonName {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ButtonName[] $VALUES;
        private final String value;
        public static final ButtonName TRADE_AGAIN = new ButtonName("TRADE_AGAIN", 0, "trade_again");
        public static final ButtonName SPEED_UP = new ButtonName("SPEED_UP", 1, "speed_up");
        public static final ButtonName CANCEL = new ButtonName("CANCEL", 2, OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
        public static final ButtonName SPEED_UP_CANCEL = new ButtonName("SPEED_UP_CANCEL", 3, "speed_up_cancel");
        public static final ButtonName CUSTOMER_SUPPORT_TOP = new ButtonName("CUSTOMER_SUPPORT_TOP", 4, "customer_support_top");
        public static final ButtonName CUSTOMER_SUPPORT_SINGLE_CHAIN_SWAP = new ButtonName("CUSTOMER_SUPPORT_SINGLE_CHAIN_SWAP", 5, "customer_support_singlechainswap");
        public static final ButtonName CUSTOMER_SUPPORT_FROM_SWAP = new ButtonName("CUSTOMER_SUPPORT_FROM_SWAP", 6, "customer_support_fromswap");
        public static final ButtonName CUSTOMER_SUPPORT_BRIDGE = new ButtonName("CUSTOMER_SUPPORT_BRIDGE", 7, "customer_support_bridge");
        public static final ButtonName CUSTOMER_SUPPORT_TO_SWAP = new ButtonName("CUSTOMER_SUPPORT_TO_SWAP", 8, "customer_support_toswap");
        public static final ButtonName BRIDGE_TOKEN_EXCHANGE = new ButtonName("BRIDGE_TOKEN_EXCHANGE", 9, "bridge_token_exchange");
        public static final ButtonName CANCEL_LIMIT_ORDER = new ButtonName("CANCEL_LIMIT_ORDER", 10, "cancel_limit_order");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ButtonName[] $values() {
            return new ButtonName[]{TRADE_AGAIN, SPEED_UP, CANCEL, SPEED_UP_CANCEL, CUSTOMER_SUPPORT_TOP, CUSTOMER_SUPPORT_SINGLE_CHAIN_SWAP, CUSTOMER_SUPPORT_FROM_SWAP, CUSTOMER_SUPPORT_BRIDGE, CUSTOMER_SUPPORT_TO_SWAP, BRIDGE_TOKEN_EXCHANGE, CANCEL_LIMIT_ORDER};
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

    public static DexHistoryDetailsFullPageClick valueOf(String str) {
        return (DexHistoryDetailsFullPageClick) Enum.valueOf(DexHistoryDetailsFullPageClick.class, str);
    }

    public static DexHistoryDetailsFullPageClick[] values() {
        return (DexHistoryDetailsFullPageClick[]) $VALUES.clone();
    }
}
