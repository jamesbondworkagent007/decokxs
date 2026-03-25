package com.okinc.business.dexlogic.track.enums;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class DexSwapPopConfirmClick {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DexSwapPopConfirmClick[] $VALUES;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DexSwapPopConfirmClick[] $values() {
        return new DexSwapPopConfirmClick[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        DexSwapPopConfirmClick[] dexSwapPopConfirmClickArr$values = $values();
        $VALUES = dexSwapPopConfirmClickArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dexSwapPopConfirmClickArr$values);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DexSwapPopConfirmClick> getEntries() {
        return $ENTRIES;
    }

    private DexSwapPopConfirmClick(String str, int i) {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PopupType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PopupType[] $VALUES;
        private final String value;
        public static final PopupType REPEAT_ORDER_WITHOUT_ENOUGH_BALANCE = new PopupType("REPEAT_ORDER_WITHOUT_ENOUGH_BALANCE", 0, "repeatorderwithoutenoughbalance");
        public static final PopupType ZERO_VALUE = new PopupType("ZERO_VALUE", 1, "zeroValue");
        public static final PopupType REPEAT_ORDER_WITH_ENOUGH_BALANCE = new PopupType("REPEAT_ORDER_WITH_ENOUGH_BALANCE", 2, "repeatorderwithenoughbalance");
        public static final PopupType VALUE_DIFFERENCE = new PopupType("VALUE_DIFFERENCE", 3, "valuedifference");
        public static final PopupType MIN_RECEIVE = new PopupType("MIN_RECEIVE", 4, "minreceive");
        public static final PopupType CROSS_CHAIN = new PopupType("CROSS_CHAIN", 5, "crosschain");
        public static final PopupType GAS_MORE_THAN_RECEIVE = new PopupType("GAS_MORE_THAN_RECEIVE", 6, "gasmorethanreceive");
        public static final PopupType SWFT_RISK = new PopupType("SWFT_RISK", 7, "swftrisk");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PopupType[] $values() {
            return new PopupType[]{REPEAT_ORDER_WITHOUT_ENOUGH_BALANCE, ZERO_VALUE, REPEAT_ORDER_WITH_ENOUGH_BALANCE, VALUE_DIFFERENCE, MIN_RECEIVE, CROSS_CHAIN, GAS_MORE_THAN_RECEIVE, SWFT_RISK};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PopupType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private PopupType(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            PopupType[] popupTypeArr$values = $values();
            $VALUES = popupTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(popupTypeArr$values);
        }

        public static PopupType valueOf(String str) {
            return (PopupType) Enum.valueOf(PopupType.class, str);
        }

        public static PopupType[] values() {
            return (PopupType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ButtonName {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ButtonName[] $VALUES;
        private final String value;
        public static final ButtonName CONFIRM = new ButtonName("CONFIRM", 0, Web3SecurityTrackEvent.VALUE_CONFIRM);
        public static final ButtonName CANCEL = new ButtonName("CANCEL", 1, OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
        public static final ButtonName VIEW_LAST_ORDER = new ButtonName("VIEW_LAST_ORDER", 2, "view_last_order");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ButtonName[] $values() {
            return new ButtonName[]{CONFIRM, CANCEL, VIEW_LAST_ORDER};
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

    public static DexSwapPopConfirmClick valueOf(String str) {
        return (DexSwapPopConfirmClick) Enum.valueOf(DexSwapPopConfirmClick.class, str);
    }

    public static DexSwapPopConfirmClick[] values() {
        return (DexSwapPopConfirmClick[]) $VALUES.clone();
    }
}
