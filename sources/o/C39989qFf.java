package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ViewKt;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39989qFf extends AbstractC39964qEh<C40006qFw, C42887rer> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42887rer AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42887rer c42887rerAEQbTJ = C42887rer.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42887rerAEQbTJ, "");
        return c42887rerAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    public void AEQbTJ(@NotNull C42887rer c42887rer, int i, @NotNull C40006qFw c40006qFw) {
        Intrinsics.checkNotNullParameter(c42887rer, "");
        Intrinsics.checkNotNullParameter(c40006qFw, "");
        java.lang.String strKWHzl = C55297xhL.KWHzl(c40006qFw.KWHzl(), C55298xhM.dp2px$default(32.0f, null, 1, null), C55298xhM.dp2px$default(32.0f, null, 1, null));
        AppCompatImageView appCompatImageView = c42887rer.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C33054mpH.loadAvatar$default(appCompatImageView, strKWHzl == null ? "" : strKWHzl, null, null, 6, null);
        android.widget.TextView textView = c42887rer.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        AEQbTJ(textView, c40006qFw.copydefault());
        if (!c40006qFw.AEQbTJ()) {
            c42887rer.AYXKKw.setVisibility(8);
            c42887rer.KWHzl.setVisibility(8);
        } else {
            c42887rer.AYXKKw.setVisibility(0);
            c42887rer.KWHzl.setVisibility(0);
            c42887rer.AYXKKw.setText(c40006qFw.OLrzqt());
        }
        ConstraintLayout root = c42887rer.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, c42887rer, c40006qFw, i));
    }

    /* JADX INFO: renamed from: o.qFf$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C42887rer AEQbTJ;
        public final /* synthetic */ C40006qFw EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C42887rer c42887rer, C40006qFw c40006qFw, int i) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c42887rer;
            this.EZpvd = c40006qFw;
            this.copydefault = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ConstraintLayout root = this.AEQbTJ.getRoot();
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
                        qhm.copydefault(this.EZpvd.EZpvd(), this.copydefault);
                    }
                }
            }
        }
    }
}
