package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ViewKt;
import com.okinc.market.search.features.main.root.data.po.TradingStrategy;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qEi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39965qEi extends AbstractC39964qEh<C39995qFl, C42875ref> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42875ref AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42875ref c42875refEZpvd = C42875ref.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42875refEZpvd, "");
        return c42875refEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42875ref c42875ref, int i, @NotNull C39995qFl c39995qFl) {
        java.lang.CharSequence charSequenceOLrzqt;
        Intrinsics.checkNotNullParameter(c42875ref, "");
        Intrinsics.checkNotNullParameter(c39995qFl, "");
        android.widget.TextView textView = c42875ref.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        TradingStrategy tradingStrategyCopydefault = c39995qFl.copydefault();
        if (!(tradingStrategyCopydefault instanceof TradingStrategy)) {
            tradingStrategyCopydefault = null;
        }
        if (tradingStrategyCopydefault == null || (charSequenceOLrzqt = qGH.KWHzl(tradingStrategyCopydefault, c42875ref.getRoot().getContext())) == null) {
            charSequenceOLrzqt = c39995qFl.OLrzqt();
        }
        AEQbTJ(textView, charSequenceOLrzqt);
        AppCompatImageView appCompatImageView = c42875ref.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C33054mpH.EZpvd(appCompatImageView, C55297xhL.KWHzl(c39995qFl.EZpvd(), C55298xhM.dp2px$default(32.0f, null, 1, null), C55298xhM.dp2px$default(32.0f, null, 1, null)), qZH.Activity.AhwBna);
        c42875ref.AYXKKw.setText(c39995qFl.djBIcL());
        if (c39995qFl.valueOf()) {
            AppCompatTextView appCompatTextView = c42875ref.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            C41426qqb.setText$default((android.widget.TextView) appCompatTextView, c39995qFl.AEQbTJ(), (java.lang.CharSequence) c39995qFl.KWHzl(), 0, 0, 0, false, 60, (java.lang.Object) null);
            AppCompatTextView appCompatTextView2 = c42875ref.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(0);
            android.widget.TextView textView2 = c42875ref.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
        } else {
            AppCompatTextView appCompatTextView3 = c42875ref.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
            appCompatTextView3.setVisibility(8);
            android.widget.TextView textView3 = c42875ref.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(8);
        }
        ConstraintLayout root = c42875ref.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, c42875ref, c39995qFl, i));
    }

    /* JADX INFO: renamed from: o.qEi$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C42875ref AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ C39995qFl copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C42875ref c42875ref, C39995qFl c39995qFl, int i) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c42875ref;
            this.copydefault = c39995qFl;
            this.OLrzqt = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
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
                        qhm.KWHzl(this.copydefault.copydefault(), this.OLrzqt);
                    }
                }
            }
        }
    }
}
