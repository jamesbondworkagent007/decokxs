package com.okinc.okex.lite.onboarding.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class SegmentationRecommendationStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SegmentationRecommendationStatus[] $VALUES;
    private final String value;
    public static final SegmentationRecommendationStatus CHOSEN_QUESTIONNAIRES = new SegmentationRecommendationStatus("CHOSEN_QUESTIONNAIRES", 0, "CHOSEN_QUESTIONNAIRES");
    public static final SegmentationRecommendationStatus CHOSEN_PREFERENCE = new SegmentationRecommendationStatus("CHOSEN_PREFERENCE", 1, "CHOSEN_PREFERENCE");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SegmentationRecommendationStatus[] $values() {
        return new SegmentationRecommendationStatus[]{CHOSEN_QUESTIONNAIRES, CHOSEN_PREFERENCE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SegmentationRecommendationStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private SegmentationRecommendationStatus(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        SegmentationRecommendationStatus[] segmentationRecommendationStatusArr$values = $values();
        $VALUES = segmentationRecommendationStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(segmentationRecommendationStatusArr$values);
    }

    public static SegmentationRecommendationStatus valueOf(String str) {
        return (SegmentationRecommendationStatus) Enum.valueOf(SegmentationRecommendationStatus.class, str);
    }

    public static SegmentationRecommendationStatus[] values() {
        return (SegmentationRecommendationStatus[]) $VALUES.clone();
    }
}
