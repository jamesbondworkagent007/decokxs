package com.okinc.okassetslite.api.assets_lite_api.appreview;

import com.okinc.okassetslite.api.assets_lite_api.appreview.AppReviewSource;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AppReviewSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AppReviewSource[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String tag;
    public static final AppReviewSource TRIGGER_SIMPLE_BUY = new AppReviewSource("TRIGGER_SIMPLE_BUY", 0, "SIMPLE_BUY");
    public static final AppReviewSource TRIGGER_ORDER_BOOK = new AppReviewSource("TRIGGER_ORDER_BOOK", 1, "ORDER_BOOK");
    public static final AppReviewSource VIEW_AT_SIMPLE_BUY = new AppReviewSource("VIEW_AT_SIMPLE_BUY", 2, "SIMPLE_BUY_HOME_PAGE");
    public static final AppReviewSource VIEW_AT_PORTFOLIO = new AppReviewSource("VIEW_AT_PORTFOLIO", 3, "ORDER_BOOK_PORTFOLIO_PAGE");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AppReviewSource[] $values() {
        return new AppReviewSource[]{TRIGGER_SIMPLE_BUY, TRIGGER_ORDER_BOOK, VIEW_AT_SIMPLE_BUY, VIEW_AT_PORTFOLIO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AppReviewSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okassetslite.api.assets_lite_api.appreview.AppReviewSource.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) AppReviewSource.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<AppReviewSource> serializer() {
            return copydefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.okassetslite.api.assets_lite_api.appreview.AppReviewSource", values());
    }

    private AppReviewSource(String str, int i, String str2) {
        this.tag = str2;
    }

    static {
        AppReviewSource[] appReviewSourceArr$values = $values();
        $VALUES = appReviewSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(appReviewSourceArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rWI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AppReviewSource._init_$_anonymous_();
            }
        });
    }

    public static AppReviewSource valueOf(String str) {
        return (AppReviewSource) Enum.valueOf(AppReviewSource.class, str);
    }

    public static AppReviewSource[] values() {
        return (AppReviewSource[]) $VALUES.clone();
    }
}
