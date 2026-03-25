package com.okinc.im.imui.messages.audio.call.ringing;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class RingingMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RingingMode[] $VALUES;
    private final int code;
    public static final RingingMode Incoming = new RingingMode("Incoming", 0, 0);
    public static final RingingMode Outgoing = new RingingMode("Outgoing", 1, 1);
    public static final RingingMode IncomingCustom = new RingingMode("IncomingCustom", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RingingMode[] $values() {
        return new RingingMode[]{Incoming, Outgoing, IncomingCustom};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RingingMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    private RingingMode(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        RingingMode[] ringingModeArr$values = $values();
        $VALUES = ringingModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(ringingModeArr$values);
    }

    public static RingingMode valueOf(String str) {
        return (RingingMode) Enum.valueOf(RingingMode.class, str);
    }

    public static RingingMode[] values() {
        return (RingingMode[]) $VALUES.clone();
    }
}
