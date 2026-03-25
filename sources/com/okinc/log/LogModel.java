package com.okinc.log;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class LogModel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LogModel[] $VALUES;
    public static final LogModel Async = new LogModel("Async", 0, 0);
    public static final LogModel Sync = new LogModel("Sync", 1, 1);
    private int model;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LogModel[] $values() {
        return new LogModel[]{Async, Sync};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LogModel> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getModel() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setModel(int i) {
        this.model = i;
    }

    private LogModel(String str, int i, int i2) {
        this.model = i2;
    }

    static {
        LogModel[] logModelArr$values = $values();
        $VALUES = logModelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(logModelArr$values);
    }

    public static LogModel valueOf(String str) {
        return (LogModel) Enum.valueOf(LogModel.class, str);
    }

    public static LogModel[] values() {
        return (LogModel[]) $VALUES.clone();
    }
}
