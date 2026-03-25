package com.okinc.business.invest_biz.ui.screens.transaction.invest;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class InvestSubscriptionState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InvestSubscriptionState[] $VALUES;
    public static final InvestSubscriptionState Error = new InvestSubscriptionState("Error", 0);
    public static final InvestSubscriptionState Success = new InvestSubscriptionState("Success", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InvestSubscriptionState[] $values() {
        return new InvestSubscriptionState[]{Error, Success};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InvestSubscriptionState> getEntries() {
        return $ENTRIES;
    }

    private InvestSubscriptionState(String str, int i) {
    }

    static {
        InvestSubscriptionState[] investSubscriptionStateArr$values = $values();
        $VALUES = investSubscriptionStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(investSubscriptionStateArr$values);
    }

    public static InvestSubscriptionState valueOf(String str) {
        return (InvestSubscriptionState) Enum.valueOf(InvestSubscriptionState.class, str);
    }

    public static InvestSubscriptionState[] values() {
        return (InvestSubscriptionState[]) $VALUES.clone();
    }
}
