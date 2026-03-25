package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class PaymasterNameType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PaymasterNameType[] $VALUES;
    public static final Application Companion;
    private final int value;
    public static final PaymasterNameType NONE = new PaymasterNameType("NONE", 0, 1);
    public static final PaymasterNameType FREE_GAS = new PaymasterNameType("FREE_GAS", 1, 2);
    public static final PaymasterNameType TOKEN_SWAP = new PaymasterNameType("TOKEN_SWAP", 2, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PaymasterNameType[] $values() {
        return new PaymasterNameType[]{NONE, FREE_GAS, TOKEN_SWAP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PaymasterNameType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private PaymasterNameType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        PaymasterNameType[] paymasterNameTypeArr$values = $values();
        $VALUES = paymasterNameTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(paymasterNameTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.PaymasterNameType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final PaymasterNameType OLrzqt(int i) {
            for (PaymasterNameType paymasterNameType : PaymasterNameType.values()) {
                if (paymasterNameType.getValue() == i) {
                    return paymasterNameType;
                }
            }
            return null;
        }
    }

    public static PaymasterNameType valueOf(String str) {
        return (PaymasterNameType) Enum.valueOf(PaymasterNameType.class, str);
    }

    public static PaymasterNameType[] values() {
        return (PaymasterNameType[]) $VALUES.clone();
    }
}
