package com.okinc.okex.center.bean.enums;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.okex.center.bean.enums.TopCategory;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44833seQ;
import o.C47315tni;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = C44833seQ.class)
public final class TopCategory {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TopCategory[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final Integer displayStringId;
    private final String value;
    public static final TopCategory Trending = new TopCategory("Trending", 0, "trending", Integer.valueOf(C47315tni.PendingIntent.UlJrfe));
    public static final TopCategory MostViewed = new TopCategory("MostViewed", 1, "most_viewed", Integer.valueOf(C47315tni.PendingIntent.QCjLjM));
    public static final TopCategory New = new TopCategory("New", 2, OtpEventTracker.OTP_EVENT_VALUE_NEW, Integer.valueOf(C47315tni.PendingIntent.OxVOHk));
    public static final TopCategory Unknown = new TopCategory("Unknown", 3, "", null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TopCategory[] $values() {
        return new TopCategory[]{Trending, MostViewed, New, Unknown};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TopCategory> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDisplayStringId() {
        return this.displayStringId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.enums.TopCategory.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) TopCategory.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TopCategory> serializer() {
            return OLrzqt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44833seQ();
    }

    private TopCategory(String str, int i, String str2, Integer num) {
        this.value = str2;
        this.displayStringId = num;
    }

    static {
        TopCategory[] topCategoryArr$values = $values();
        $VALUES = topCategoryArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(topCategoryArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.seO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TopCategory._init_$_anonymous_();
            }
        });
    }

    public static TopCategory valueOf(String str) {
        return (TopCategory) Enum.valueOf(TopCategory.class, str);
    }

    public static TopCategory[] values() {
        return (TopCategory[]) $VALUES.clone();
    }
}
