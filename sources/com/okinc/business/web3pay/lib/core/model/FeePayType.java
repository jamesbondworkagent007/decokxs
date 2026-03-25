package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class FeePayType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FeePayType[] $VALUES;
    public static final StateListAnimator Companion;
    public static final FeePayType FREE = new FeePayType("FREE", 0, 1);
    public static final FeePayType NOT_FREE = new FeePayType("NOT_FREE", 1, 2);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FeePayType[] $values() {
        return new FeePayType[]{FREE, NOT_FREE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FeePayType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private FeePayType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        FeePayType[] feePayTypeArr$values = $values();
        $VALUES = feePayTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(feePayTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.FeePayType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static FeePayType valueOf(String str) {
        return (FeePayType) Enum.valueOf(FeePayType.class, str);
    }

    public static FeePayType[] values() {
        return (FeePayType[]) $VALUES.clone();
    }
}
