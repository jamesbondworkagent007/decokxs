package o;

import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uTo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48496uTo implements ViewBinding {
    public final C48208uIz AEQbTJ;
    public final uII AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final FragmentContainerView OLrzqt;
    public final ComposeView copydefault;
    public final NestedScrollView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.gEmmrt;
    }

    public C48496uTo(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C48208uIz c48208uIz, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull ComposeView composeView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull uII uii) {
        this.gEmmrt = nestedScrollView;
        this.AEQbTJ = c48208uIz;
        this.OLrzqt = fragmentContainerView;
        this.copydefault = composeView;
        this.KWHzl = textView;
        this.EZpvd = textView2;
        this.AhwBna = uii;
    }

    public static C48496uTo copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.DIIpTV;
        C48208uIz c48208uIz = (C48208uIz) ViewBindings.findChildViewById(view, i);
        if (c48208uIz != null) {
            i = C48033uCm.Application.DPHsZd;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView != null) {
                i = C48033uCm.Application.DPhTBN;
                ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                if (composeView != null) {
                    i = C48033uCm.Application.ilfrrN;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C48033uCm.Application.OeawrHRnVkix;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C48033uCm.Application.verifyToken;
                            uII uii = (uII) ViewBindings.findChildViewById(view, i);
                            if (uii != null) {
                                return new C48496uTo((NestedScrollView) view, c48208uIz, fragmentContainerView, composeView, textView, textView2, uii);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
