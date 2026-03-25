package com.okinc.im.imui.livestream.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class SnackBarEvent {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SnackBarEvent[] $VALUES;
    public static final SnackBarEvent TooFrequent = new SnackBarEvent("TooFrequent", 0);
    public static final SnackBarEvent NetworkError = new SnackBarEvent("NetworkError", 1);
    public static final SnackBarEvent ExceedCharacter = new SnackBarEvent("ExceedCharacter", 2);
    public static final SnackBarEvent BeingMuted = new SnackBarEvent("BeingMuted", 3);
    public static final SnackBarEvent StreamEnded = new SnackBarEvent("StreamEnded", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SnackBarEvent[] $values() {
        return new SnackBarEvent[]{TooFrequent, NetworkError, ExceedCharacter, BeingMuted, StreamEnded};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SnackBarEvent> getEntries() {
        return $ENTRIES;
    }

    private SnackBarEvent(String str, int i) {
    }

    static {
        SnackBarEvent[] snackBarEventArr$values = $values();
        $VALUES = snackBarEventArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(snackBarEventArr$values);
    }

    public static SnackBarEvent valueOf(String str) {
        return (SnackBarEvent) Enum.valueOf(SnackBarEvent.class, str);
    }

    public static SnackBarEvent[] values() {
        return (SnackBarEvent[]) $VALUES.clone();
    }
}
