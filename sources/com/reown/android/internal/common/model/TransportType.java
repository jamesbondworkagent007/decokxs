package com.reown.android.internal.common.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class TransportType {
    public static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    public static final /* synthetic */ TransportType[] $VALUES;
    public static final TransportType RELAY = new TransportType("RELAY", 0);
    public static final TransportType LINK_MODE = new TransportType("LINK_MODE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ TransportType[] $values() {
        return new TransportType[]{RELAY, LINK_MODE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransportType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static TransportType valueOf(String str) {
        return (TransportType) Enum.valueOf(TransportType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static TransportType[] values() {
        return (TransportType[]) $VALUES.clone();
    }

    public TransportType(String str, int i) {
    }

    static {
        TransportType[] transportTypeArr$values = $values();
        $VALUES = transportTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transportTypeArr$values);
    }
}
