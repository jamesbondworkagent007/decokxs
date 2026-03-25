package com.okinc.planet.biz_content.input.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class InputHyperlinkType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InputHyperlinkType[] $VALUES;
    public static final InputHyperlinkType TOKEN = new InputHyperlinkType("TOKEN", 0);
    public static final InputHyperlinkType TOPIC = new InputHyperlinkType("TOPIC", 1);
    public static final InputHyperlinkType LINK = new InputHyperlinkType("LINK", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InputHyperlinkType[] $values() {
        return new InputHyperlinkType[]{TOKEN, TOPIC, LINK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InputHyperlinkType> getEntries() {
        return $ENTRIES;
    }

    private InputHyperlinkType(String str, int i) {
    }

    static {
        InputHyperlinkType[] inputHyperlinkTypeArr$values = $values();
        $VALUES = inputHyperlinkTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(inputHyperlinkTypeArr$values);
    }

    public static InputHyperlinkType valueOf(String str) {
        return (InputHyperlinkType) Enum.valueOf(InputHyperlinkType.class, str);
    }

    public static InputHyperlinkType[] values() {
        return (InputHyperlinkType[]) $VALUES.clone();
    }
}
