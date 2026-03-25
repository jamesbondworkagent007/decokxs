package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ViewKt;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qEt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39976qEt extends AbstractC39964qEh<C39991qFh, C42878rei> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42878rei AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42878rei c42878reiCopydefault = C42878rei.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42878reiCopydefault, "");
        return c42878reiCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42878rei c42878rei, int i, @NotNull C39991qFh c39991qFh) {
        Intrinsics.checkNotNullParameter(c42878rei, "");
        Intrinsics.checkNotNullParameter(c39991qFh, "");
        AppCompatImageView appCompatImageView = c42878rei.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        java.lang.String strOLrzqt = c39991qFh.OLrzqt();
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        C33054mpH.loadAvatar$default(appCompatImageView, strOLrzqt, null, null, 6, null);
        AppCompatTextView appCompatTextView = c42878rei.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        AEQbTJ(appCompatTextView, c39991qFh.AEQbTJ());
        c42878rei.EZpvd.setText(c39991qFh.copydefault());
        android.widget.TextView textView = c42878rei.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(c39991qFh.valueOf() ? 0 : 8);
        c42878rei.valueOf.setText(c39991qFh.EZpvd());
        android.widget.ImageView imageView = c42878rei.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(c39991qFh.djBIcL() ? 0 : 8);
        ConstraintLayout root = c42878rei.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, c42878rei, c39991qFh, i));
    }

    /* JADX INFO: renamed from: o.qEt$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C42878rei AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C39991qFh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C42878rei c42878rei, C39991qFh c39991qFh, int i) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c42878rei;
            this.copydefault = c39991qFh;
            this.EZpvd = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
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
                        qhm.AEQbTJ(this.copydefault, this.EZpvd);
                    }
                }
            }
        }
    }
}
