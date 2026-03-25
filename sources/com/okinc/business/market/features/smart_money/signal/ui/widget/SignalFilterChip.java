package com.okinc.business.market.features.smart_money.signal.ui.widget;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class SignalFilterChip {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignalFilterChip[] $VALUES;
    public static final SignalFilterChip GEM_TYPE = new SignalFilterChip("GEM_TYPE", 0);
    public static final SignalFilterChip INFLUENCER = new SignalFilterChip("INFLUENCER", 1);
    public static final SignalFilterChip CHAIN = new SignalFilterChip("CHAIN", 2);
    public static final SignalFilterChip SORT_TYPE = new SignalFilterChip("SORT_TYPE", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignalFilterChip[] $values() {
        return new SignalFilterChip[]{GEM_TYPE, INFLUENCER, CHAIN, SORT_TYPE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignalFilterChip> getEntries() {
        return $ENTRIES;
    }

    private SignalFilterChip(String str, int i) {
    }

    static {
        SignalFilterChip[] signalFilterChipArr$values = $values();
        $VALUES = signalFilterChipArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signalFilterChipArr$values);
    }

    public static SignalFilterChip valueOf(String str) {
        return (SignalFilterChip) Enum.valueOf(SignalFilterChip.class, str);
    }

    public static SignalFilterChip[] values() {
        return (SignalFilterChip[]) $VALUES.clone();
    }
}
