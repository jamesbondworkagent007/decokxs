package com.okinc.uilib.core.icon;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class TextEndLineIconAlignment {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TextEndLineIconAlignment[] $VALUES;
    public static final TextEndLineIconAlignment ALIGN_BASELINE = new TextEndLineIconAlignment("ALIGN_BASELINE", 0, 1);
    public static final TextEndLineIconAlignment ALIGN_BOTTOM = new TextEndLineIconAlignment("ALIGN_BOTTOM", 1, 0);
    public static final TextEndLineIconAlignment ALIGN_CENTER = new TextEndLineIconAlignment("ALIGN_CENTER", 2, 2);
    private final int id;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TextEndLineIconAlignment[] $values() {
        return new TextEndLineIconAlignment[]{ALIGN_BASELINE, ALIGN_BOTTOM, ALIGN_CENTER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TextEndLineIconAlignment> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    private TextEndLineIconAlignment(String str, int i, int i2) {
        this.id = i2;
    }

    static {
        TextEndLineIconAlignment[] textEndLineIconAlignmentArr$values = $values();
        $VALUES = textEndLineIconAlignmentArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(textEndLineIconAlignmentArr$values);
    }

    public static TextEndLineIconAlignment valueOf(String str) {
        return (TextEndLineIconAlignment) Enum.valueOf(TextEndLineIconAlignment.class, str);
    }

    public static TextEndLineIconAlignment[] values() {
        return (TextEndLineIconAlignment[]) $VALUES.clone();
    }
}
