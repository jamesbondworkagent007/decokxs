package com.okinc.okex.center.bean.enums;

import com.okinc.okex.center.bean.enums.RecommendSection;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44827seK;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
@Serializable(with = C44827seK.class)
public final class RecommendSection {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecommendSection[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final RecommendSection SEARCH_BAR = new RecommendSection("SEARCH_BAR", 0);
    public static final RecommendSection RECOMMENDATION_CARDS = new RecommendSection("RECOMMENDATION_CARDS", 1);
    public static final RecommendSection RECENT_ACTIVITIES = new RecommendSection("RECENT_ACTIVITIES", 2);
    public static final RecommendSection TOP_TOPICS = new RecommendSection("TOP_TOPICS", 3);
    public static final RecommendSection SELF_SERVICE_TOOLS = new RecommendSection("SELF_SERVICE_TOOLS", 4);
    public static final RecommendSection CONTACT_US = new RecommendSection("CONTACT_US", 5);
    public static final RecommendSection CONTACT_INFORMATION = new RecommendSection("CONTACT_INFORMATION", 6);
    public static final RecommendSection TOP_TOPICS_VIEW_ALL = new RecommendSection("TOP_TOPICS_VIEW_ALL", 7);
    public static final RecommendSection UNKNOWN = new RecommendSection("UNKNOWN", 8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecommendSection[] $values() {
        return new RecommendSection[]{SEARCH_BAR, RECOMMENDATION_CARDS, RECENT_ACTIVITIES, TOP_TOPICS, SELF_SERVICE_TOOLS, CONTACT_US, CONTACT_INFORMATION, TOP_TOPICS_VIEW_ALL, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecommendSection> getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.enums.RecommendSection.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) RecommendSection.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<RecommendSection> serializer() {
            return copydefault();
        }
    }

    private RecommendSection(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44827seK();
    }

    static {
        RecommendSection[] recommendSectionArr$values = $values();
        $VALUES = recommendSectionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recommendSectionArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.seL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RecommendSection._init_$_anonymous_();
            }
        });
    }

    public static RecommendSection valueOf(String str) {
        return (RecommendSection) Enum.valueOf(RecommendSection.class, str);
    }

    public static RecommendSection[] values() {
        return (RecommendSection[]) $VALUES.clone();
    }
}
