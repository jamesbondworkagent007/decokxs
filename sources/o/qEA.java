package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ViewKt;
import com.bumptech.glide.Glide;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qEA extends AbstractC39964qEh<C39999qFp, C42898rfB> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42898rfB AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42898rfB c42898rfBOLrzqt = C42898rfB.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42898rfBOLrzqt, "");
        return c42898rfBOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42898rfB c42898rfB, int i, @NotNull C39999qFp c39999qFp) {
        Intrinsics.checkNotNullParameter(c42898rfB, "");
        Intrinsics.checkNotNullParameter(c39999qFp, "");
        android.widget.ImageView imageView = c42898rfB.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.EZpvd(imageView, C55297xhL.KWHzl(c39999qFp.copydefault(), C55298xhM.dp2px$default(32.0f, null, 1, null), C55298xhM.dp2px$default(32.0f, null, 1, null)), C52761wXj.TaskDescription.aHXSQp);
        android.widget.ImageView imageView2 = c42898rfB.AEQbTJ;
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrKWHzl = Glide.KWHzl(imageView2);
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrKWHzl, "");
        java.lang.String strKWHzl = C55297xhL.KWHzl(c39999qFp.gEmmrt(), C55298xhM.dp2px$default(32.0f, null, 1, null), C55298xhM.dp2px$default(32.0f, null, 1, null));
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrKWHzl, strKWHzl, "lfit", C55298xhM.dp2px$default(32.0f, null, 1, null), C55298xhM.dp2px$default(32.0f, null, 1, null)).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(imageView2.getContext(), 0.5f, C33070mpX.copydefault(C52761wXj.Activity.EZpvd), false, 8, null)).KWHzl(C52761wXj.TaskDescription.aHXSQp).EZpvd(imageView2);
        android.widget.TextView textView = c42898rfB.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        AEQbTJ(textView, c39999qFp.OLrzqt());
        if (C59449zhJ.gEmmrt(c39999qFp.valueOf().getTokenContractAddress(), AEQbTJ(), true)) {
            android.widget.TextView textView2 = c42898rfB.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            C40359qSy.addHighLightTv$default(textView2, c39999qFp.KWHzl(), c39999qFp.KWHzl(), false, 8, null);
        } else {
            c42898rfB.valueOf.setText(c39999qFp.KWHzl());
        }
        android.widget.TextView textView3 = c42898rfB.gEmmrt;
        java.lang.CharSequence charSequenceEZpvd = c39999qFp.EZpvd();
        int color = c42898rfB.getRoot().getContext().getColor(C52761wXj.Activity.zuBGHE);
        android.content.Context context = c42898rfB.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView3.setText(qIP.copydefault(charSequenceEZpvd, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, color, context));
        c42898rfB.OLrzqt.setText(c39999qFp.AYXKKw());
        android.widget.TextView textView4 = c42898rfB.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        C41426qqb.setText$default(textView4, c39999qFp.AhwBna(), (java.lang.CharSequence) c39999qFp.djBIcL(), 0, 0, 0, false, 60, (java.lang.Object) null);
        C42991rgp c42991rgp = c42898rfB.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c42991rgp, "");
        c42991rgp.setVisibility(8);
        AppCompatImageView appCompatImageView = c42898rfB.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(Intrinsics.EZpvd(c39999qFp.valueOf().getCommunityRecognized(), java.lang.Boolean.TRUE) ? 0 : 8);
        ConstraintLayout root = c42898rfB.getRoot();
        root.setOnClickListener(new Application(root, 1000L, c42898rfB, c39999qFp, i));
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C39999qFp AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C42898rfB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C42898rfB c42898rfB, C39999qFp c39999qFp, int i) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c42898rfB;
            this.AEQbTJ = c39999qFp;
            this.KWHzl = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ConstraintLayout root = this.copydefault.getRoot();
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
                        qhm.EZpvd(this.AEQbTJ.valueOf(), this.KWHzl);
                    }
                }
            }
        }
    }
}
