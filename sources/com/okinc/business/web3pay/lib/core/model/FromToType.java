package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class FromToType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FromToType[] $VALUES;
    public static final StateListAnimator Companion;
    private final int value;
    public static final FromToType PAY_BALANCE = new FromToType("PAY_BALANCE", 0, 1);
    public static final FromToType SMART_WALLET = new FromToType("SMART_WALLET", 1, 2);
    public static final FromToType PHONE_NUMBER_RECEIVER = new FromToType("PHONE_NUMBER_RECEIVER", 2, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FromToType[] $values() {
        return new FromToType[]{PAY_BALANCE, SMART_WALLET, PHONE_NUMBER_RECEIVER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FromToType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private FromToType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        FromToType[] fromToTypeArr$values = $values();
        $VALUES = fromToTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(fromToTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.FromToType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final FromToType copydefault(Integer num) {
            for (FromToType fromToType : FromToType.values()) {
                int value = fromToType.getValue();
                if (num != null && value == num.intValue()) {
                    return fromToType;
                }
            }
            return null;
        }
    }

    public static FromToType valueOf(String str) {
        return (FromToType) Enum.valueOf(FromToType.class, str);
    }

    public static FromToType[] values() {
        return (FromToType[]) $VALUES.clone();
    }
}
