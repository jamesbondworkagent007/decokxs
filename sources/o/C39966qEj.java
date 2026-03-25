package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ViewKt;
import com.bumptech.glide.Glide;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qEj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39966qEj extends AbstractC39964qEh<C39992qFi, C42946rfx> {
    public final java.lang.String copydefault = "active";

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42946rfx AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42946rfx c42946rfxOLrzqt = C42946rfx.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42946rfxOLrzqt, "");
        return c42946rfxOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42946rfx c42946rfx, int i, @NotNull C39992qFi c39992qFi) {
        Intrinsics.checkNotNullParameter(c42946rfx, "");
        Intrinsics.checkNotNullParameter(c39992qFi, "");
        if (c42946rfx.copydefault.getContext() != null) {
            java.lang.String icon = c39992qFi.copydefault().getIcon();
            if (icon != null && icon.length() != 0) {
                Intrinsics.copydefault(Glide.AEQbTJ(c42946rfx.copydefault.getContext()).EZpvd(C55297xhL.KWHzl(c39992qFi.copydefault().getIcon(), C55298xhM.dp2px$default(32.0f, null, 1, null), C55298xhM.dp2px$default(32.0f, null, 1, null))).KWHzl(qZH.Activity.AEQbTJ).copydefault(qZH.Activity.AEQbTJ).OLrzqt((RX<?>) C5448Sc.KWHzl((NN<android.graphics.Bitmap>) new C5417Qx(4))).EZpvd(c42946rfx.copydefault));
            } else {
                c42946rfx.copydefault.setImageResource(qZH.Activity.AEQbTJ);
            }
        }
        c42946rfx.OLrzqt.setText(c39992qFi.copydefault().getTitle());
        android.widget.TextView textView = c42946rfx.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        AEQbTJ(textView, java.lang.String.valueOf(c39992qFi.copydefault().getTitle()));
        if (Intrinsics.EZpvd((java.lang.Object) c39992qFi.copydefault().getCampaignStatus(), (java.lang.Object) this.copydefault)) {
            c42946rfx.KWHzl.setText(qZH.PendingIntent.gLWkOL);
            c42946rfx.KWHzl.setOKDSStyle(14);
        } else {
            c42946rfx.KWHzl.setText(qZH.PendingIntent.iOIMNp);
            c42946rfx.KWHzl.setOKDSStyle(6);
        }
        c42946rfx.AEQbTJ.setText(c39992qFi.EZpvd());
        ConstraintLayout root = c42946rfx.getRoot();
        root.setOnClickListener(new Application(root, 1000L, c42946rfx, c39992qFi, i));
    }

    /* JADX INFO: renamed from: o.qEj$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C39992qFi AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C42946rfx OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C42946rfx c42946rfx, C39992qFi c39992qFi, int i) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c42946rfx;
            this.AEQbTJ = c39992qFi;
            this.EZpvd = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ConstraintLayout root = this.OLrzqt.getRoot();
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
                        qhm.AEQbTJ(this.AEQbTJ, this.EZpvd);
                    }
                }
            }
        }
    }
}
