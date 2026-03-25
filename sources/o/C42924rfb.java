package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.view.OKSortTextView;
import o.qZH;

/* JADX INFO: renamed from: o.rfb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42924rfb implements ViewBinding {
    public final OKSortTextView AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final AppCompatTextView KWHzl;
    public final Guideline OLrzqt;
    public final android.view.View copydefault;
    public final OKSortTextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C42924rfb(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Guideline guideline, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull OKSortTextView oKSortTextView2) {
        this.copydefault = view;
        this.OLrzqt = guideline;
        this.EZpvd = appCompatTextView;
        this.KWHzl = appCompatTextView2;
        this.AEQbTJ = oKSortTextView;
        this.djBIcL = oKSortTextView2;
    }

    public static C42924rfb AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.QFTsTN, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C42924rfb EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.gBtXYZ;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
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
                            return new C42924rfb(view, guideline, appCompatTextView, appCompatTextView2, oKSortTextView, oKSortTextView2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
