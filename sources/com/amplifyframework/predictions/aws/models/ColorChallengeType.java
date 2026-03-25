package com.amplifyframework.predictions.aws.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@InternalAmplifyApi
public final class ColorChallengeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ColorChallengeType[] $VALUES;
    public static final ColorChallengeType SEQUENTIAL = new ColorChallengeType("SEQUENTIAL", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ColorChallengeType[] $values() {
        return new ColorChallengeType[]{SEQUENTIAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ColorChallengeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static ColorChallengeType valueOf(String str) {
        return (ColorChallengeType) Enum.valueOf(ColorChallengeType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static ColorChallengeType[] values() {
        return (ColorChallengeType[]) $VALUES.clone();
    }

    private ColorChallengeType(String str, int i) {
    }

    static {
        ColorChallengeType[] colorChallengeTypeArr$values = $values();
        $VALUES = colorChallengeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(colorChallengeTypeArr$values);
    }
}
