package com.okinc.oklive.api.model;

import com.reown.android.pulse.model.EventType;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class StreamStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ StreamStatus[] $VALUES;
    public static final StreamStatus IDLE = new StreamStatus("IDLE", 0);
    public static final StreamStatus STARTING = new StreamStatus("STARTING", 1);
    public static final StreamStatus LIVE = new StreamStatus("LIVE", 2);
    public static final StreamStatus STOPPED = new StreamStatus("STOPPED", 3);
    public static final StreamStatus ERROR = new StreamStatus(EventType.ERROR, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ StreamStatus[] $values() {
        return new StreamStatus[]{IDLE, STARTING, LIVE, STOPPED, ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<StreamStatus> getEntries() {
        return $ENTRIES;
    }

    private StreamStatus(String str, int i) {
    }

    static {
        StreamStatus[] streamStatusArr$values = $values();
        $VALUES = streamStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(streamStatusArr$values);
    }

    public static StreamStatus valueOf(String str) {
        return (StreamStatus) Enum.valueOf(StreamStatus.class, str);
    }

    public static StreamStatus[] values() {
        return (StreamStatus[]) $VALUES.clone();
    }
}
