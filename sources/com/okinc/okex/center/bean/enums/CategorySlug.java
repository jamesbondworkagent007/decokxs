package com.okinc.okex.center.bean.enums;

import androidx.annotation.StringRes;
import com.okinc.okex.center.bean.enums.CategorySlug;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44865sew;
import o.C47315tni;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = C44865sew.class)
public final class CategorySlug {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CategorySlug[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int hintResId;
    private final int titleResId;
    private final String value;
    public static final CategorySlug Announcement = new CategorySlug("Announcement", 0, "announcements", C47315tni.PendingIntent.fLIjIY, C47315tni.PendingIntent.fXHmeK);
    public static final CategorySlug FAQ = new CategorySlug("FAQ", 1, "faq", C47315tni.PendingIntent.AEQbTJ, C47315tni.PendingIntent.dvImUD);
    public static final CategorySlug ProductDoc = new CategorySlug("ProductDoc", 2, "product-documentation", C47315tni.PendingIntent.apNbdB, C47315tni.PendingIntent.dLBcXg);
    public static final CategorySlug Unknown = new CategorySlug("Unknown", 3, "", -1, C47315tni.PendingIntent.gUEfcq);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CategorySlug[] $values() {
        return new CategorySlug[]{Announcement, FAQ, ProductDoc, Unknown};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CategorySlug> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHintResId() {
        return this.hintResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleResId() {
        return this.titleResId;
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

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.enums.CategorySlug.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) CategorySlug.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<CategorySlug> serializer() {
            return EZpvd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44865sew();
    }

    private CategorySlug(String str, @StringRes int i, @StringRes String str2, int i2, int i3) {
        this.value = str2;
        this.titleResId = i2;
        this.hintResId = i3;
    }

    static {
        CategorySlug[] categorySlugArr$values = $values();
        $VALUES = categorySlugArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(categorySlugArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sev
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CategorySlug._init_$_anonymous_();
            }
        });
    }

    public static CategorySlug valueOf(String str) {
        return (CategorySlug) Enum.valueOf(CategorySlug.class, str);
    }

    public static CategorySlug[] values() {
        return (CategorySlug[]) $VALUES.clone();
    }
}
