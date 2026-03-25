package com.okinc.base.thread.pool;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class PoolType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PoolType[] $VALUES;
    private final long keepAliveTime;
    private final int queueSize;
    public static final PoolType CPU = new PoolType("CPU", 0, 60, 1);
    public static final PoolType IO = new PoolType("IO", 1, 60, 128);
    public static final PoolType SINGLE = new PoolType("SINGLE", 2, 60, 128);
    public static final PoolType SCHEDULE = new PoolType("SCHEDULE", 3, 60, 128);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PoolType[] $values() {
        return new PoolType[]{CPU, IO, SINGLE, SCHEDULE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PoolType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getKeepAliveTime() {
        return this.keepAliveTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getQueueSize() {
        return this.queueSize;
    }

    private PoolType(String str, int i, long j, int i2) {
        this.keepAliveTime = j;
        this.queueSize = i2;
    }

    static {
        PoolType[] poolTypeArr$values = $values();
        $VALUES = poolTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(poolTypeArr$values);
    }

    public static PoolType valueOf(String str) {
        return (PoolType) Enum.valueOf(PoolType.class, str);
    }

    public static PoolType[] values() {
        return (PoolType[]) $VALUES.clone();
    }
}
