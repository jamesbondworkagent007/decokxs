package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.planet.biz_onboarding.OrbitEditProfileScenario;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tAj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45899tAj {
    public static final C45899tAj copydefault = new C45899tAj();

    private C45899tAj() {
    }

    public final void copydefault(@NotNull final FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        tKX.Companion.OLrzqt().AEQbTJ(fragmentActivity, OrbitEditProfileScenario.OrbitOnboarding.AEQbTJ, false, new Function2() { // from class: o.tAh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C45899tAj.KWHzl(fragmentActivity, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
            }
        });
    }

    public static final Unit KWHzl(FragmentActivity fragmentActivity, boolean z, java.lang.String str) {
        if (z) {
            if (C46437tUh.OLrzqt.AEQbTJ()) {
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: o.tAg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C45899tAj.copydefault();
                    }
                }, 150L);
            } else {
                ActivityC47938tzZ.Companion.OLrzqt(fragmentActivity);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault() {
        C55284xgz c55284xgzKWHzl;
        android.view.View viewEZpvd = tUB.copydefault.EZpvd();
        if (viewEZpvd == null || (c55284xgzKWHzl = C55284xgz.Companion.KWHzl(viewEZpvd, C33070mpX.AYXKKw(C47501trL.Fragment.DsrFlB))) == null) {
            return;
        }
        c55284xgzKWHzl.isConnected(3);
        c55284xgzKWHzl.djBIcL(0);
        c55284xgzKWHzl.hDKMBd();
    }
}
