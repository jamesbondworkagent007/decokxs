package com.okinc.planet.biz_content.input.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class InputDraftType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InputDraftType[] $VALUES;
    public static final InputDraftType AUTO_SAVE = new InputDraftType("AUTO_SAVE", 0);
    public static final InputDraftType USER_SAVE = new InputDraftType("USER_SAVE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InputDraftType[] $values() {
        return new InputDraftType[]{AUTO_SAVE, USER_SAVE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InputDraftType> getEntries() {
        return $ENTRIES;
    }

    private InputDraftType(String str, int i) {
    }

    static {
        InputDraftType[] inputDraftTypeArr$values = $values();
        $VALUES = inputDraftTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(inputDraftTypeArr$values);
    }

    public static InputDraftType valueOf(String str) {
        return (InputDraftType) Enum.valueOf(InputDraftType.class, str);
    }

    public static InputDraftType[] values() {
        return (InputDraftType[]) $VALUES.clone();
    }
}
