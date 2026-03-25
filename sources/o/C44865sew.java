package o;

import com.okinc.okex.center.bean.enums.CategorySlug;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.sew, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44865sew extends C6984aZg<CategorySlug> {
    public C44865sew() {
        super("CategorySlug", new Function1() { // from class: o.sez
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44865sew.KWHzl((CategorySlug) obj);
            }
        }, new Function1() { // from class: o.seB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44865sew.KWHzl((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String KWHzl(CategorySlug categorySlug) {
        Intrinsics.checkNotNullParameter(categorySlug, "");
        return categorySlug.getValue();
    }

    public static final CategorySlug KWHzl(java.lang.String str) {
        CategorySlug categorySlug;
        Intrinsics.checkNotNullParameter(str, "");
        CategorySlug[] categorySlugArrValues = CategorySlug.values();
        int length = categorySlugArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                categorySlug = null;
                break;
            }
            categorySlug = categorySlugArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) categorySlug.getValue(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        return categorySlug == null ? CategorySlug.Unknown : categorySlug;
    }
}
