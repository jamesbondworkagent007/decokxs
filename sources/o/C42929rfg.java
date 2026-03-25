package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rfg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42929rfg implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final android.view.View EZpvd;
    public final android.widget.TextView KWHzl;
    public final C42964rgO OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C42929rfg(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C42964rgO c42964rgO, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.view.View view2) {
        this.copydefault = view;
        this.OLrzqt = c42964rgO;
        this.AEQbTJ = appCompatImageView;
        this.KWHzl = textView;
        this.EZpvd = view2;
    }

    public static C42929rfg AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.QWpYiD, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C42929rfg KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = qZH.StateListAnimator.DQYQgr;
        C42964rgO c42964rgO = (C42964rgO) ViewBindings.findChildViewById(view, i);
        if (c42964rgO != null) {
            i = qZH.StateListAnimator.fcfzuX;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = qZH.StateListAnimator.MediaBrowserCompatConnectionCallbackConnectionCallbackApi21;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.MediaBrowserCompatMediaBrowserServiceCallbackImpl))) != null) {
                    return new C42929rfg(view, c42964rgO, appCompatImageView, textView, viewFindChildViewById);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
