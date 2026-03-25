package com.okinc.network.okg.core;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class ThreadPoolType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ThreadPoolType[] $VALUES;
    public static final ThreadPoolType DOH = new ThreadPoolType("DOH", 0);
    public static final ThreadPoolType HTTP = new ThreadPoolType("HTTP", 1);
    public static final ThreadPoolType WEBSOCKET = new ThreadPoolType("WEBSOCKET", 2);
    public static final ThreadPoolType OTHER = new ThreadPoolType("OTHER", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ThreadPoolType[] $values() {
        return new ThreadPoolType[]{DOH, HTTP, WEBSOCKET, OTHER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ThreadPoolType> getEntries() {
        return $ENTRIES;
    }

    private ThreadPoolType(String str, int i) {
    }

    static {
        ThreadPoolType[] threadPoolTypeArr$values = $values();
        $VALUES = threadPoolTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(threadPoolTypeArr$values);
    }

    public static ThreadPoolType valueOf(String str) {
        return (ThreadPoolType) Enum.valueOf(ThreadPoolType.class, str);
    }

    public static ThreadPoolType[] values() {
        return (ThreadPoolType[]) $VALUES.clone();
    }
}
