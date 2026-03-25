package com.okinc.business.web3pay.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class Web3PaySaCardFundDirection {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Web3PaySaCardFundDirection[] $VALUES;
    public static final TaskDescription Companion;
    private final int value;
    public static final Web3PaySaCardFundDirection DEBIT = new Web3PaySaCardFundDirection("DEBIT", 0, 10);
    public static final Web3PaySaCardFundDirection CREDIT = new Web3PaySaCardFundDirection("CREDIT", 1, 20);
    public static final Web3PaySaCardFundDirection NEUTRAL = new Web3PaySaCardFundDirection("NEUTRAL", 2, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Web3PaySaCardFundDirection[] $values() {
        return new Web3PaySaCardFundDirection[]{DEBIT, CREDIT, NEUTRAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Web3PaySaCardFundDirection> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private Web3PaySaCardFundDirection(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        Web3PaySaCardFundDirection[] web3PaySaCardFundDirectionArr$values = $values();
        $VALUES = web3PaySaCardFundDirectionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(web3PaySaCardFundDirectionArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.Web3PaySaCardFundDirection.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static Web3PaySaCardFundDirection valueOf(String str) {
        return (Web3PaySaCardFundDirection) Enum.valueOf(Web3PaySaCardFundDirection.class, str);
    }

    public static Web3PaySaCardFundDirection[] values() {
        return (Web3PaySaCardFundDirection[]) $VALUES.clone();
    }
}
