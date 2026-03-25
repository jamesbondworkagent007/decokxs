package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rfE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42901rfE implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final Group EZpvd;
    public final qYH KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final AppCompatTextView copydefault;
    public final AppCompatTextView djBIcL;
    public final AppCompatTextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C42901rfE(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull qYH qyh, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3) {
        this.AEQbTJ = view;
        this.EZpvd = group;
        this.KWHzl = qyh;
        this.OLrzqt = linearLayoutCompat;
        this.copydefault = appCompatTextView;
        this.djBIcL = appCompatTextView2;
        this.gEmmrt = appCompatTextView3;
    }

    public static C42901rfE AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.fdt, viewGroup);
        return copydefault(viewGroup);
    }

    public static C42901rfE copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.RKDWNf;
        Group group = (Group) ViewBindings.findChildViewById(view, i);
        if (group != null) {
            i = qZH.StateListAnimator.RdAHlO;
            qYH qyh = (qYH) ViewBindings.findChildViewById(view, i);
            if (qyh != null) {
                i = qZH.StateListAnimator.DBAlnt;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = qZH.StateListAnimator.DRuYWY;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = qZH.StateListAnimator.onConnected;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = qZH.StateListAnimator.MediaBrowserCompatConnectionCallback;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView3 != null) {
                                return new C42901rfE(view, group, qyh, linearLayoutCompat, appCompatTextView, appCompatTextView2, appCompatTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
