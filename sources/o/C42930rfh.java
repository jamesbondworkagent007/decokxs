package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.view.OKSortTextView;
import o.qZH;

/* JADX INFO: renamed from: o.rfh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42930rfh implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final OKSortTextView AYXKKw;
    public final AppCompatTextView EZpvd;
    public final OKSortTextView KWHzl;
    public final Flow OLrzqt;
    public final AppCompatTextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C42930rfh(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Flow flow, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull OKSortTextView oKSortTextView2) {
        this.AEQbTJ = view;
        this.OLrzqt = flow;
        this.EZpvd = appCompatTextView;
        this.copydefault = appCompatTextView2;
        this.KWHzl = oKSortTextView;
        this.AYXKKw = oKSortTextView2;
    }

    public static C42930rfh copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.QKDJJA, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C42930rfh EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.RZNAhV;
        Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
        if (flow != null) {
            i = qZH.StateListAnimator.doTurnConnection;
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
                            return new C42930rfh(view, flow, appCompatTextView, appCompatTextView2, oKSortTextView, oKSortTextView2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
