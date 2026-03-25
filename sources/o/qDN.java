package o;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface qDN {
    public static final StateListAnimator Companion = StateListAnimator.KWHzl;

    void AEQbTJ(@NotNull android.view.View view, @NotNull BizInstrument bizInstrument, int i, java.lang.String str);

    void OLrzqt(@NotNull BizInstrument bizInstrument, int i, boolean z);

    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
        }

        public final qDN KWHzl(@NotNull androidx.fragment.app.Fragment fragment) {
            java.lang.Object obj;
            java.lang.Object obj2;
            Intrinsics.checkNotNullParameter(fragment, "");
            android.view.View viewRequireView = fragment.requireView();
            Intrinsics.checkNotNullExpressionValue(viewRequireView, "");
            if (fragment instanceof qOD) {
                obj = fragment;
            } else {
                androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof qOD)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                boolean z = parentFragment instanceof qOD;
                java.lang.Object obj3 = parentFragment;
                if (!z) {
                    obj3 = null;
                }
                obj = (qOD) obj3;
            }
            if (obj != null) {
                return new C40173qMa(qPS.AEQbTJ(viewRequireView), qKO.OLrzqt(viewRequireView));
            }
            if (fragment instanceof qHM) {
                obj2 = fragment;
            } else {
                androidx.fragment.app.Fragment parentFragment2 = fragment.getParentFragment();
                while (parentFragment2 != null && !(parentFragment2 instanceof qHM)) {
                    parentFragment2 = parentFragment2.getParentFragment();
                }
                boolean z2 = parentFragment2 instanceof qHM;
                java.lang.Object obj4 = parentFragment2;
                if (!z2) {
                    obj4 = null;
                }
                obj2 = (qHM) obj4;
            }
            qHM qhm = (qHM) obj2;
            boolean z3 = fragment instanceof qHR;
            java.lang.Object obj5 = fragment;
            if (!z3) {
                androidx.fragment.app.Fragment parentFragment3 = fragment.getParentFragment();
                while (parentFragment3 != null && !(parentFragment3 instanceof qHR)) {
                    parentFragment3 = parentFragment3.getParentFragment();
                }
                obj5 = (qHR) (parentFragment3 instanceof qHR ? parentFragment3 : null);
            }
            return new qDL(qhm, (qHR) obj5);
        }
    }
}
