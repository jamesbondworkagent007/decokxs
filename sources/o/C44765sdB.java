package o;

import com.okinc.okex.campaign.bean.RedirectType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.sdB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44765sdB extends C6984aZg<RedirectType> {
    public C44765sdB() {
        super("RedirectType", new Function1() { // from class: o.sdE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44765sdB.copydefault((RedirectType) obj);
            }
        }, new Function1() { // from class: o.sdF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44765sdB.AEQbTJ((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String copydefault(RedirectType redirectType) {
        Intrinsics.checkNotNullParameter(redirectType, "");
        return redirectType.name();
    }

    public static final RedirectType AEQbTJ(java.lang.String str) {
        RedirectType redirectType;
        Intrinsics.checkNotNullParameter(str, "");
        RedirectType[] redirectTypeArrValues = RedirectType.values();
        int length = redirectTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                redirectType = null;
                break;
            }
            redirectType = redirectTypeArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) redirectType.name(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        return redirectType == null ? RedirectType.UNKNOWN : redirectType;
    }
}
