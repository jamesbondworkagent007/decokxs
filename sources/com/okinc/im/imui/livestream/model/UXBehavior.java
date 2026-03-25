package com.okinc.im.imui.livestream.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class UXBehavior {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UXBehavior[] $VALUES;
    public static final UXBehavior Init = new UXBehavior("Init", 0);
    public static final UXBehavior ReceiveOtherMessage = new UXBehavior("ReceiveOtherMessage", 1);
    public static final UXBehavior NoOperation = new UXBehavior("NoOperation", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UXBehavior[] $values() {
        return new UXBehavior[]{Init, ReceiveOtherMessage, NoOperation};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UXBehavior> getEntries() {
        return $ENTRIES;
    }

    private UXBehavior(String str, int i) {
    }

    static {
        UXBehavior[] uXBehaviorArr$values = $values();
        $VALUES = uXBehaviorArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(uXBehaviorArr$values);
    }

    public static UXBehavior valueOf(String str) {
        return (UXBehavior) Enum.valueOf(UXBehavior.class, str);
    }

    public static UXBehavior[] values() {
        return (UXBehavior[]) $VALUES.clone();
    }
}
