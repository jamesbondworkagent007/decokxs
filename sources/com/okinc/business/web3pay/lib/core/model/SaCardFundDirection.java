package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C31267lqm;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Serializable(with = C31267lqm.class)
public final class SaCardFundDirection {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SaCardFundDirection[] $VALUES;
    public static final Companion Companion;
    private final int value;
    public static final SaCardFundDirection DEBIT = new SaCardFundDirection("DEBIT", 0, 10);
    public static final SaCardFundDirection CREDIT = new SaCardFundDirection("CREDIT", 1, 20);
    public static final SaCardFundDirection NEUTRAL = new SaCardFundDirection("NEUTRAL", 2, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SaCardFundDirection[] $values() {
        return new SaCardFundDirection[]{DEBIT, CREDIT, NEUTRAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SaCardFundDirection> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private SaCardFundDirection(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        SaCardFundDirection[] saCardFundDirectionArr$values = $values();
        $VALUES = saCardFundDirectionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(saCardFundDirectionArr$values);
        Companion = new Companion(null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.SaCardFundDirection.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SaCardFundDirection> serializer() {
            return C31267lqm.copydefault;
        }

        public final SaCardFundDirection EZpvd(Integer num) {
            for (SaCardFundDirection saCardFundDirection : SaCardFundDirection.values()) {
                int value = saCardFundDirection.getValue();
                if (num != null && value == num.intValue()) {
                    return saCardFundDirection;
                }
            }
            return null;
        }
    }

    public static SaCardFundDirection valueOf(String str) {
        return (SaCardFundDirection) Enum.valueOf(SaCardFundDirection.class, str);
    }

    public static SaCardFundDirection[] values() {
        return (SaCardFundDirection[]) $VALUES.clone();
    }
}
