package com.okinc.okex.center.bean.enums;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class IntegratedSolutionPageType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IntegratedSolutionPageType[] $VALUES;
    private final String chatbotSuffix;
    private final String value;
    public static final IntegratedSolutionPageType RecommendationCard = new IntegratedSolutionPageType("RecommendationCard", 0, "recommendation_card", "recommendation-card");
    public static final IntegratedSolutionPageType Transaction = new IntegratedSolutionPageType("Transaction", 1, "transaction", "recent-activities");
    public static final IntegratedSolutionPageType HotTopic = new IntegratedSolutionPageType("HotTopic", 2, "hot_topic", "hot-topics");
    public static final IntegratedSolutionPageType MiniSupport = new IntegratedSolutionPageType("MiniSupport", 3, "mini_support_page", "mini-support-page");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IntegratedSolutionPageType[] $values() {
        return new IntegratedSolutionPageType[]{RecommendationCard, Transaction, HotTopic, MiniSupport};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IntegratedSolutionPageType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChatbotSuffix() {
        return this.chatbotSuffix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    private IntegratedSolutionPageType(String str, int i, String str2, String str3) {
        this.value = str2;
        this.chatbotSuffix = str3;
    }

    static {
        IntegratedSolutionPageType[] integratedSolutionPageTypeArr$values = $values();
        $VALUES = integratedSolutionPageTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(integratedSolutionPageTypeArr$values);
    }

    public static IntegratedSolutionPageType valueOf(String str) {
        return (IntegratedSolutionPageType) Enum.valueOf(IntegratedSolutionPageType.class, str);
    }

    public static IntegratedSolutionPageType[] values() {
        return (IntegratedSolutionPageType[]) $VALUES.clone();
    }
}
