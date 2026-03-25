package o;

import com.okinc.okex.center.bean.enums.TopCategory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.seQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44833seQ extends C6984aZg<TopCategory> {
    public C44833seQ() {
        super("TopCategory", new Function1() { // from class: o.seV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44833seQ.OLrzqt((TopCategory) obj);
            }
        }, new Function1() { // from class: o.seU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44833seQ.OLrzqt((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String OLrzqt(TopCategory topCategory) {
        Intrinsics.checkNotNullParameter(topCategory, "");
        return topCategory.getValue();
    }

    public static final TopCategory OLrzqt(java.lang.String str) {
        TopCategory topCategory;
        Intrinsics.checkNotNullParameter(str, "");
        TopCategory[] topCategoryArrValues = TopCategory.values();
        int length = topCategoryArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                topCategory = null;
                break;
            }
            topCategory = topCategoryArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) topCategory.getValue(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        return topCategory == null ? TopCategory.Unknown : topCategory;
    }
}
