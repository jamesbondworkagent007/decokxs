package com.okinc.business.dexui.main.swap.mememode.dialog.adapter;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class MemeIntroType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MemeIntroType[] $VALUES;
    public static final MemeIntroType MEME_MODE = new MemeIntroType("MEME_MODE", 0);
    public static final MemeIntroType MEME_MODE_STRATEGY = new MemeIntroType("MEME_MODE_STRATEGY", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MemeIntroType[] $values() {
        return new MemeIntroType[]{MEME_MODE, MEME_MODE_STRATEGY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MemeIntroType> getEntries() {
        return $ENTRIES;
    }

    private MemeIntroType(String str, int i) {
    }

    static {
        MemeIntroType[] memeIntroTypeArr$values = $values();
        $VALUES = memeIntroTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(memeIntroTypeArr$values);
    }

    public static MemeIntroType valueOf(String str) {
        return (MemeIntroType) Enum.valueOf(MemeIntroType.class, str);
    }

    public static MemeIntroType[] values() {
        return (MemeIntroType[]) $VALUES.clone();
    }
}
