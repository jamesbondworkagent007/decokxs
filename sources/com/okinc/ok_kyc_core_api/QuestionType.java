package com.okinc.ok_kyc_core_api;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class QuestionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ QuestionType[] $VALUES;
    public static final QuestionType LIMIT_INCREASE = new QuestionType("LIMIT_INCREASE", 0, "16");
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ QuestionType[] $values() {
        return new QuestionType[]{LIMIT_INCREASE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<QuestionType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private QuestionType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        QuestionType[] questionTypeArr$values = $values();
        $VALUES = questionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(questionTypeArr$values);
    }

    public static QuestionType valueOf(String str) {
        return (QuestionType) Enum.valueOf(QuestionType.class, str);
    }

    public static QuestionType[] values() {
        return (QuestionType[]) $VALUES.clone();
    }
}
