package com.okinc.im.imui.tracking.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class ResultState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ResultState[] $VALUES;
    public static final ResultState SUCCESS = new ResultState("SUCCESS", 0);
    public static final ResultState FAILURE = new ResultState("FAILURE", 1);
    public static final ResultState CANCELLED = new ResultState("CANCELLED", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ResultState[] $values() {
        return new ResultState[]{SUCCESS, FAILURE, CANCELLED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ResultState> getEntries() {
        return $ENTRIES;
    }

    private ResultState(String str, int i) {
    }

    static {
        ResultState[] resultStateArr$values = $values();
        $VALUES = resultStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(resultStateArr$values);
    }

    public static ResultState valueOf(String str) {
        return (ResultState) Enum.valueOf(ResultState.class, str);
    }

    public static ResultState[] values() {
        return (ResultState[]) $VALUES.clone();
    }
}
