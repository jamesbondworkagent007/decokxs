package com.okinc.tradingbot.impl.botList.domain.model;

import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import o.C48033uCm;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class BacktestFilter {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BacktestFilter[] $VALUES;
    private final int label;
    public static final BacktestFilter ALL = new BacktestFilter("ALL", 0, C48033uCm.Fragment.AwvSrB);
    public static final BacktestFilter RUNNING = new BacktestFilter(DebugCoroutineInfoImplKt.RUNNING, 1, C48033uCm.Fragment.ORxRYg);
    public static final BacktestFilter COMPLETED = new BacktestFilter("COMPLETED", 2, C48033uCm.Fragment.DTwDnp);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BacktestFilter[] $values() {
        return new BacktestFilter[]{ALL, RUNNING, COMPLETED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BacktestFilter> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLabel() {
        return this.label;
    }

    private BacktestFilter(String str, int i, int i2) {
        this.label = i2;
    }

    static {
        BacktestFilter[] backtestFilterArr$values = $values();
        $VALUES = backtestFilterArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(backtestFilterArr$values);
    }

    public static BacktestFilter valueOf(String str) {
        return (BacktestFilter) Enum.valueOf(BacktestFilter.class, str);
    }

    public static BacktestFilter[] values() {
        return (BacktestFilter[]) $VALUES.clone();
    }
}
