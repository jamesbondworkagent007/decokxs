package com.okinc.business.dexlogic.main.swap.trade.status.helper;

import com.reown.android.pulse.model.EventType;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class CheckStep {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CheckStep[] $VALUES;
    public static final CheckStep INIT = new CheckStep(EventType.INIT, 0);
    public static final CheckStep WALLET = new CheckStep("WALLET", 1);
    public static final CheckStep INPUT = new CheckStep("INPUT", 2);
    public static final CheckStep QUOTES = new CheckStep("QUOTES", 3);
    public static final CheckStep BALANCE = new CheckStep("BALANCE", 4);
    public static final CheckStep APPROVE = new CheckStep("APPROVE", 5);
    public static final CheckStep SWAP = new CheckStep("SWAP", 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CheckStep[] $values() {
        return new CheckStep[]{INIT, WALLET, INPUT, QUOTES, BALANCE, APPROVE, SWAP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CheckStep> getEntries() {
        return $ENTRIES;
    }

    private CheckStep(String str, int i) {
    }

    static {
        CheckStep[] checkStepArr$values = $values();
        $VALUES = checkStepArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(checkStepArr$values);
    }

    public static CheckStep valueOf(String str) {
        return (CheckStep) Enum.valueOf(CheckStep.class, str);
    }

    public static CheckStep[] values() {
        return (CheckStep[]) $VALUES.clone();
    }
}
