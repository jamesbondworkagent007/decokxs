package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42724rbn implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final ConstraintLayout AhwBna;
    public final AppCompatImageView EZpvd;
    public final C40895qga KWHzl;
    public final C55173xeu OLrzqt;
    public final Group copydefault;
    public final C40896qgb djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.ImageView gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.ImageView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public C42724rbn(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C40895qga c40895qga, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull C40896qgb c40896qgb, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.AhwBna = constraintLayout;
        this.copydefault = group;
        this.AEQbTJ = constraintLayout2;
        this.OLrzqt = c55173xeu;
        this.KWHzl = c40895qga;
        this.EZpvd = appCompatImageView;
        this.valueOf = imageView;
        this.gEmmrt = imageView2;
        this.djBIcL = c40896qgb;
        this.AYXKKw = textView;
        this.isConnected = textView2;
        this.fetchVPNInfo = textView3;
    }

    public static C42724rbn EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.fvQaOB;
        Group group = (Group) ViewBindings.findChildViewById(view, i);
        if (group != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = qZH.StateListAnimator.Swccd;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = qZH.StateListAnimator.geLlBI;
                C40895qga c40895qga = (C40895qga) ViewBindings.findChildViewById(view, i);
                if (c40895qga != null) {
                    i = qZH.StateListAnimator.DxnCrt;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null) {
                        i = qZH.StateListAnimator.svhCHd;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = qZH.StateListAnimator.FQMcgEfQMcgE;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = qZH.StateListAnimator.fAklCm;
                                C40896qgb c40896qgb = (C40896qgb) ViewBindings.findChildViewById(view, i);
                                if (c40896qgb != null) {
                                    i = qZH.StateListAnimator.ijmTNW;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = qZH.StateListAnimator.MediaBrowserCompatCustomActionResultReceiver;
                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = qZH.StateListAnimator.onReceiveResult;
                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                return new C42724rbn(constraintLayout, group, constraintLayout, c55173xeu, c40895qga, appCompatImageView, imageView, imageView2, c40896qgb, textView, textView2, textView3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
