package com.okinc.okex.feedback;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class FeedbackType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FeedbackType[] $VALUES;
    public static final FeedbackType FEEDBACK = new FeedbackType("FEEDBACK", 0);
    public static final FeedbackType SECURITY_BUG = new FeedbackType("SECURITY_BUG", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FeedbackType[] $values() {
        return new FeedbackType[]{FEEDBACK, SECURITY_BUG};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FeedbackType> getEntries() {
        return $ENTRIES;
    }

    private FeedbackType(String str, int i) {
    }

    static {
        FeedbackType[] feedbackTypeArr$values = $values();
        $VALUES = feedbackTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(feedbackTypeArr$values);
    }

    public static FeedbackType valueOf(String str) {
        return (FeedbackType) Enum.valueOf(FeedbackType.class, str);
    }

    public static FeedbackType[] values() {
        return (FeedbackType[]) $VALUES.clone();
    }
}
