package com.amplifyframework.predictions.aws.models.liveness;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class LightChallengeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LightChallengeType[] $VALUES;
    public static final LightChallengeType SEQUENTIAL = new LightChallengeType("SEQUENTIAL", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LightChallengeType[] $values() {
        return new LightChallengeType[]{SEQUENTIAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LightChallengeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static LightChallengeType valueOf(String str) {
        return (LightChallengeType) Enum.valueOf(LightChallengeType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static LightChallengeType[] values() {
        return (LightChallengeType[]) $VALUES.clone();
    }

    private LightChallengeType(String str, int i) {
    }

    static {
        LightChallengeType[] lightChallengeTypeArr$values = $values();
        $VALUES = lightChallengeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(lightChallengeTypeArr$values);
    }
}
