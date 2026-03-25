package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ViewKt;
import com.okinc.search.bean.SearchResultContentPo;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qEw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39979qEw extends AbstractC39964qEh<C39997qFn, C42877reh> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42877reh AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42877reh c42877rehAEQbTJ = C42877reh.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42877rehAEQbTJ, "");
        return c42877rehAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42877reh c42877reh, int i, @NotNull C39997qFn c39997qFn) {
        java.lang.String strEZpvd;
        java.lang.Integer followerCount;
        Intrinsics.checkNotNullParameter(c42877reh, "");
        Intrinsics.checkNotNullParameter(c39997qFn, "");
        AppCompatImageView appCompatImageView = c42877reh.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        java.lang.String strOLrzqt = c39997qFn.OLrzqt();
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        C33054mpH.loadAvatar$default(appCompatImageView, strOLrzqt, null, null, 6, null);
        AppCompatTextView appCompatTextView = c42877reh.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        java.lang.String strCopydefault = c39997qFn.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        AEQbTJ(appCompatTextView, strCopydefault);
        android.widget.TextView textView = c42877reh.OLrzqt;
        android.content.Context context = c42877reh.getRoot().getContext();
        if (context != null) {
            int i2 = qZH.Dialog.AEQbTJ;
            SearchResultContentPo.SearchResultContentKolPo searchResultContentKolPoAYXKKw = c39997qFn.AYXKKw();
            strEZpvd = pTD.EZpvd(context, i2, (searchResultContentKolPoAYXKKw == null || (followerCount = searchResultContentKolPoAYXKKw.getFollowerCount()) == null) ? 0 : followerCount.intValue(), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", c39997qFn.KWHzl())));
        } else {
            strEZpvd = null;
        }
        textView.setText(strEZpvd);
        c42877reh.KWHzl.setText(c39997qFn.EZpvd());
        android.widget.ImageView imageView = c42877reh.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(c39997qFn.gEmmrt() ? 0 : 8);
        ConstraintLayout root = c42877reh.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, c42877reh, c39997qFn, i));
    }

    /* JADX INFO: renamed from: o.qEw$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C39997qFn AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C42877reh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C42877reh c42877reh, C39997qFn c39997qFn, int i) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c42877reh;
            this.AEQbTJ = c39997qFn;
            this.EZpvd = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
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
                        qhm.EZpvd(this.AEQbTJ, this.EZpvd);
                    }
                }
            }
        }
    }
}
