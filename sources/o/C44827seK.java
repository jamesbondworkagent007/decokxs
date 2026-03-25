package o;

import com.okinc.okex.center.bean.enums.RecommendSection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.seK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44827seK extends C6984aZg<RecommendSection> {
    public C44827seK() {
        super("RecommendSection", new Function1() { // from class: o.seI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44827seK.AEQbTJ((RecommendSection) obj);
            }
        }, new Function1() { // from class: o.seH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44827seK.AEQbTJ((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String AEQbTJ(RecommendSection recommendSection) {
        Intrinsics.checkNotNullParameter(recommendSection, "");
        return recommendSection.name();
    }

    public static final RecommendSection AEQbTJ(java.lang.String str) {
        RecommendSection recommendSection;
        Intrinsics.checkNotNullParameter(str, "");
        RecommendSection[] recommendSectionArrValues = RecommendSection.values();
        int length = recommendSectionArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                recommendSection = null;
                break;
            }
            recommendSection = recommendSectionArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) recommendSection.name(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        return recommendSection == null ? RecommendSection.UNKNOWN : recommendSection;
    }
}
