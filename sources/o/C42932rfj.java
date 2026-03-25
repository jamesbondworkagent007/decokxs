package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.view.OKSortTextView;
import o.qZH;

/* JADX INFO: renamed from: o.rfj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42932rfj implements ViewBinding {
    public final OKSortTextView AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final AppCompatTextView KWHzl;
    public final OKSortTextView OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C42932rfj(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull OKSortTextView oKSortTextView2) {
        this.copydefault = view;
        this.EZpvd = appCompatTextView;
        this.KWHzl = appCompatTextView2;
        this.OLrzqt = oKSortTextView;
        this.AEQbTJ = oKSortTextView2;
    }

    public static C42932rfj EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.DGGHxk, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C42932rfj OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.doTurnConnection;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = qZH.StateListAnimator.aRClCA;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                i = qZH.StateListAnimator.getSmallIconId;
                OKSortTextView oKSortTextView = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                if (oKSortTextView != null) {
                    i = qZH.StateListAnimator.cancelAll;
                    OKSortTextView oKSortTextView2 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                    if (oKSortTextView2 != null) {
                        return new C42932rfj(view, appCompatTextView, appCompatTextView2, oKSortTextView, oKSortTextView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
