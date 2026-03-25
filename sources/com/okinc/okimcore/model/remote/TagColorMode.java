package com.okinc.okimcore.model.remote;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class TagColorMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TagColorMode[] $VALUES;
    public static final TagColorMode LIGHT = new TagColorMode("LIGHT", 0);
    public static final TagColorMode DARK = new TagColorMode("DARK", 1);
    public static final TagColorMode NORMAL = new TagColorMode("NORMAL", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TagColorMode[] $values() {
        return new TagColorMode[]{LIGHT, DARK, NORMAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TagColorMode> getEntries() {
        return $ENTRIES;
    }

    private TagColorMode(String str, int i) {
    }

    static {
        TagColorMode[] tagColorModeArr$values = $values();
        $VALUES = tagColorModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tagColorModeArr$values);
    }

    public static TagColorMode valueOf(String str) {
        return (TagColorMode) Enum.valueOf(TagColorMode.class, str);
    }

    public static TagColorMode[] values() {
        return (TagColorMode[]) $VALUES.clone();
    }
}
