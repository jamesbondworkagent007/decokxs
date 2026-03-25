package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ekw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16494ekw implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final AppCompatImageView AYXKKw;
    public final ConstraintLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C55251xgS copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C16494ekw(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull AppCompatImageView appCompatImageView) {
        this.OLrzqt = constraintLayout;
        this.KWHzl = textView;
        this.EZpvd = constraintLayout2;
        this.AEQbTJ = textView2;
        this.copydefault = c55251xgS;
        this.AYXKKw = appCompatImageView;
    }

    public static C16494ekw OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.DTwDnp;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C13754dXa.ActionBar.RWIpjU;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C13754dXa.ActionBar.setExtraBinder;
                C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                if (c55251xgS != null) {
                    i = C13754dXa.ActionBar.newTab;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null) {
                        return new C16494ekw(constraintLayout, textView, constraintLayout, textView2, c55251xgS, appCompatImageView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
