package com.okinc.business.dexlogic.track.enums;

import com.huawei.hms.support.api.entity.core.CommonCode;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class DexSwapSignatureActionClick {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DexSwapSignatureActionClick[] $VALUES;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DexSwapSignatureActionClick[] $values() {
        return new DexSwapSignatureActionClick[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        DexSwapSignatureActionClick[] dexSwapSignatureActionClickArr$values = $values();
        $VALUES = dexSwapSignatureActionClickArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dexSwapSignatureActionClickArr$values);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DexSwapSignatureActionClick> getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ButtonName {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ButtonName[] $VALUES;
        private final String value;
        public static final ButtonName CONFIRM = new ButtonName("CONFIRM", 0, Web3SecurityTrackEvent.VALUE_CONFIRM);
        public static final ButtonName BACK = new ButtonName("BACK", 1, "back");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ButtonName[] $values() {
            return new ButtonName[]{CONFIRM, BACK};
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

    private DexSwapSignatureActionClick(String str, int i) {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BusinessType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ BusinessType[] $VALUES;
        public static final ActionBar Companion;
        private final String value;
        public static final BusinessType LIMIT = new BusinessType("LIMIT", 0, "limit");
        public static final BusinessType INTENT = new BusinessType("INTENT", 1, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        public static final BusinessType BUY_DIP = new BusinessType("BUY_DIP", 2, "buy_dip");
        public static final BusinessType TAKE_PROFIT = new BusinessType("TAKE_PROFIT", 3, "take_profit");
        public static final BusinessType STOP_LOSS = new BusinessType("STOP_LOSS", 4, "stop_loss");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ BusinessType[] $values() {
            return new BusinessType[]{LIMIT, INTENT, BUY_DIP, TAKE_PROFIT, STOP_LOSS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<BusinessType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private BusinessType(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            BusinessType[] businessTypeArr$values = $values();
            $VALUES = businessTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(businessTypeArr$values);
            Companion = new ActionBar(null);
        }

        public static final class ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.track.enums.DexSwapSignatureActionClick.BusinessType.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ActionBar() {
            }
        }

        public static BusinessType valueOf(String str) {
            return (BusinessType) Enum.valueOf(BusinessType.class, str);
        }

        public static BusinessType[] values() {
            return (BusinessType[]) $VALUES.clone();
        }
    }

    public static DexSwapSignatureActionClick valueOf(String str) {
        return (DexSwapSignatureActionClick) Enum.valueOf(DexSwapSignatureActionClick.class, str);
    }

    public static DexSwapSignatureActionClick[] values() {
        return (DexSwapSignatureActionClick[]) $VALUES.clone();
    }
}
