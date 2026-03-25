package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mhk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32659mhk {
    public static final C32659mhk AEQbTJ = new C32659mhk();

    private C32659mhk() {
    }

    public final void copydefault(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        C42543rWt c42543rWt = C42543rWt.KWHzl;
        c42543rWt.EZpvd(new Function1() { // from class: o.mhi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32659mhk.KWHzl((androidx.fragment.app.Fragment) obj);
            }
        });
        c42543rWt.KWHzl(new Function1() { // from class: o.mhj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32659mhk.EZpvd((android.app.Activity) obj);
            }
        });
        c42543rWt.AEQbTJ(new Function1() { // from class: o.mhm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32659mhk.EZpvd((androidx.fragment.app.Fragment) obj);
            }
        });
        c42543rWt.OLrzqt(new Function1() { // from class: o.mho
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32659mhk.AEQbTJ((android.app.Activity) obj);
            }
        });
        C42544rWu.AEQbTJ.OLrzqt(application);
    }

    public static final AbstractC42536rWm KWHzl(androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        if (fragment instanceof AbstractC32996moC) {
            return ((AbstractC32996moC) fragment).getOkQPL();
        }
        return null;
    }

    public static final AbstractC42536rWm EZpvd(android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof AbstractActivityC33041mov) {
            return ((AbstractActivityC33041mov) activity).getOkQPL();
        }
        return null;
    }

    public static final java.lang.String EZpvd(androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return fragment instanceof AbstractC32996moC ? ((AbstractC32996moC) fragment).getQPLSourceName() : "";
    }

    public static final java.lang.String AEQbTJ(android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        return activity instanceof AbstractActivityC33041mov ? ((AbstractActivityC33041mov) activity).getQPLSourceName() : "";
    }
}
