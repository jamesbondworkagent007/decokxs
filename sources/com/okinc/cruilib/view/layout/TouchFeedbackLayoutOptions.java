package com.okinc.cruilib.view.layout;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class TouchFeedbackLayoutOptions {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TouchFeedbackLayoutOptions[] $VALUES;
    public static final TouchFeedbackLayoutOptions DEFAULT_ANIMATION = new TouchFeedbackLayoutOptions("DEFAULT_ANIMATION", 0, 5);
    public static final TouchFeedbackLayoutOptions SMALL_SIZE_ONLY = new TouchFeedbackLayoutOptions("SMALL_SIZE_ONLY", 1, 2);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TouchFeedbackLayoutOptions[] $values() {
        return new TouchFeedbackLayoutOptions[]{DEFAULT_ANIMATION, SMALL_SIZE_ONLY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TouchFeedbackLayoutOptions> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private TouchFeedbackLayoutOptions(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        TouchFeedbackLayoutOptions[] touchFeedbackLayoutOptionsArr$values = $values();
        $VALUES = touchFeedbackLayoutOptionsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(touchFeedbackLayoutOptionsArr$values);
    }

    public static TouchFeedbackLayoutOptions valueOf(String str) {
        return (TouchFeedbackLayoutOptions) Enum.valueOf(TouchFeedbackLayoutOptions.class, str);
    }

    public static TouchFeedbackLayoutOptions[] values() {
        return (TouchFeedbackLayoutOptions[]) $VALUES.clone();
    }
}
