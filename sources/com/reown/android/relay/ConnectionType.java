package com.reown.android.relay;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class ConnectionType {
    public static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    public static final /* synthetic */ ConnectionType[] $VALUES;
    public static final ConnectionType AUTOMATIC = new ConnectionType("AUTOMATIC", 0);
    public static final ConnectionType MANUAL = new ConnectionType("MANUAL", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ ConnectionType[] $values() {
        return new ConnectionType[]{AUTOMATIC, MANUAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ConnectionType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static ConnectionType valueOf(String str) {
        return (ConnectionType) Enum.valueOf(ConnectionType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static ConnectionType[] values() {
        return (ConnectionType[]) $VALUES.clone();
    }

    public ConnectionType(String str, int i) {
    }

    static {
        ConnectionType[] connectionTypeArr$values = $values();
        $VALUES = connectionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(connectionTypeArr$values);
    }
}
