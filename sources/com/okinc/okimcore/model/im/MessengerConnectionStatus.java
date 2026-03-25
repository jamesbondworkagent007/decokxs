package com.okinc.okimcore.model.im;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class MessengerConnectionStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MessengerConnectionStatus[] $VALUES;
    public static final MessengerConnectionStatus Disconnected = new MessengerConnectionStatus("Disconnected", 0);
    public static final MessengerConnectionStatus Connected = new MessengerConnectionStatus("Connected", 1);
    public static final MessengerConnectionStatus Failure = new MessengerConnectionStatus("Failure", 2);
    public static final MessengerConnectionStatus Connecting = new MessengerConnectionStatus("Connecting", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MessengerConnectionStatus[] $values() {
        return new MessengerConnectionStatus[]{Disconnected, Connected, Failure, Connecting};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MessengerConnectionStatus> getEntries() {
        return $ENTRIES;
    }

    private MessengerConnectionStatus(String str, int i) {
    }

    static {
        MessengerConnectionStatus[] messengerConnectionStatusArr$values = $values();
        $VALUES = messengerConnectionStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(messengerConnectionStatusArr$values);
    }

    public static MessengerConnectionStatus valueOf(String str) {
        return (MessengerConnectionStatus) Enum.valueOf(MessengerConnectionStatus.class, str);
    }

    public static MessengerConnectionStatus[] values() {
        return (MessengerConnectionStatus[]) $VALUES.clone();
    }
}
