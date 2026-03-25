package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.view.OKSortTextView;
import o.qZH;

/* JADX INFO: renamed from: o.reZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42869reZ implements ViewBinding {
    public final OKSortTextView AEQbTJ;
    public final OKSortTextView AhwBna;
    public final AppCompatTextView EZpvd;
    public final android.view.View KWHzl;
    public final OKSortTextView OLrzqt;
    public final OKSortTextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public C42869reZ(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull OKSortTextView oKSortTextView2, @androidx.annotation.NonNull OKSortTextView oKSortTextView3, @androidx.annotation.NonNull OKSortTextView oKSortTextView4) {
        this.KWHzl = view;
        this.EZpvd = appCompatTextView;
        this.AEQbTJ = oKSortTextView;
        this.copydefault = oKSortTextView2;
        this.OLrzqt = oKSortTextView3;
        this.AhwBna = oKSortTextView4;
    }

    public static C42869reZ EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.DlmWDR, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C42869reZ OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.QqiRNA;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = qZH.StateListAnimator.getSmallIconBitmap;
            OKSortTextView oKSortTextView = (OKSortTextView) ViewBindings.findChildViewById(view, i);
            if (oKSortTextView != null) {
                i = qZH.StateListAnimator.getActiveNotifications;
                OKSortTextView oKSortTextView2 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                if (oKSortTextView2 != null) {
                    i = qZH.StateListAnimator.getSmallIconId;
                    OKSortTextView oKSortTextView3 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                    if (oKSortTextView3 != null) {
                        i = qZH.StateListAnimator.ITrustedWebActivityServiceDefault;
                        OKSortTextView oKSortTextView4 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                        if (oKSortTextView4 != null) {
                            return new C42869reZ(view, appCompatTextView, oKSortTextView, oKSortTextView2, oKSortTextView3, oKSortTextView4);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
