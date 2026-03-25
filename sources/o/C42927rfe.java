package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.view.OKSortTextView;
import o.qZH;

/* JADX INFO: renamed from: o.rfe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42927rfe implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final OKSortTextView AYXKKw;
    public final AppCompatTextView EZpvd;
    public final android.view.View KWHzl;
    public final android.widget.TextView OLrzqt;
    public final OKSortTextView copydefault;
    public final OKSortTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public C42927rfe(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull OKSortTextView oKSortTextView2, @androidx.annotation.NonNull OKSortTextView oKSortTextView3) {
        this.KWHzl = view;
        this.EZpvd = appCompatTextView;
        this.OLrzqt = textView;
        this.AEQbTJ = textView2;
        this.copydefault = oKSortTextView;
        this.AYXKKw = oKSortTextView2;
        this.valueOf = oKSortTextView3;
    }

    public static C42927rfe OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.iUnTnt, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C42927rfe OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.zeUJxr;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = qZH.StateListAnimator.areNotificationsEnabled;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = qZH.StateListAnimator.ITrustedWebActivityService;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = qZH.StateListAnimator.getSmallIconBitmap;
                    OKSortTextView oKSortTextView = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                    if (oKSortTextView != null) {
                        i = qZH.StateListAnimator.getSmallIconId;
                        OKSortTextView oKSortTextView2 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                        if (oKSortTextView2 != null) {
                            i = qZH.StateListAnimator.ITrustedWebActivityServiceDefault;
                            OKSortTextView oKSortTextView3 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                            if (oKSortTextView3 != null) {
                                return new C42927rfe(view, appCompatTextView, textView, textView2, oKSortTextView, oKSortTextView2, oKSortTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
