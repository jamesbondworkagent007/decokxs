package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ViewKt;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qEC extends AbstractC39964qEh<C39996qFm, C42880rek> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42880rek AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42880rek c42880rekKWHzl = C42880rek.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42880rekKWHzl, "");
        return c42880rekKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42880rek c42880rek, int i, @NotNull C39996qFm c39996qFm) {
        Intrinsics.checkNotNullParameter(c42880rek, "");
        Intrinsics.checkNotNullParameter(c39996qFm, "");
        java.lang.String strKWHzl = C55297xhL.KWHzl(c39996qFm.OLrzqt(), C55298xhM.dp2px$default(32.0f, null, 1, null), C55298xhM.dp2px$default(32.0f, null, 1, null));
        if (strKWHzl != null) {
            AppCompatImageView appCompatImageView = c42880rek.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C57659ymb.EZpvd(appCompatImageView, strKWHzl, qZH.Activity.AhwBna);
        }
        AppCompatTextView appCompatTextView = c42880rek.AhwBna;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        AEQbTJ(appCompatTextView, c39996qFm.copydefault());
        c42880rek.valueOf.setText(c39996qFm.AEQbTJ());
        c42880rek.copydefault.setText(c39996qFm.KWHzl());
        ConstraintLayout root = c42880rek.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, c42880rek, c39996qFm, i));
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C39996qFm EZpvd;
        public final /* synthetic */ C42880rek KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C42880rek c42880rek, C39996qFm c39996qFm, int i) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c42880rek;
            this.EZpvd = c39996qFm;
            this.copydefault = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ConstraintLayout root = this.KWHzl.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(root));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
                if (fragment != null) {
                    boolean z = fragment instanceof qHM;
                    java.lang.Object obj = fragment;
                    if (!z) {
                        androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                        while (parentFragment != null && !(parentFragment instanceof qHM)) {
                            parentFragment = parentFragment.getParentFragment();
                        }
                        obj = (qHM) (parentFragment instanceof qHM ? parentFragment : null);
                    }
                    qHM qhm = (qHM) obj;
                    if (qhm != null) {
                        qhm.OLrzqt(this.EZpvd.EZpvd(), this.copydefault);
                    }
                }
            }
        }
    }
}
