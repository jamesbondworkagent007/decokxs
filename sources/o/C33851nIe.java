package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nIe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33851nIe implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final FragmentContainerView EZpvd;
    public final FragmentContainerView KWHzl;
    public final wYC OLrzqt;
    public final android.widget.TextView copydefault;
    public final androidx.appcompat.widget.Toolbar gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C33851nIe(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull androidx.appcompat.widget.Toolbar toolbar) {
        this.AEQbTJ = linearLayout;
        this.EZpvd = fragmentContainerView;
        this.OLrzqt = wyc;
        this.KWHzl = fragmentContainerView2;
        this.copydefault = textView;
        this.gEmmrt = toolbar;
    }

    public static C33851nIe AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, null, false);
    }

    public static C33851nIe EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.DbNXlk, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C33851nIe AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.invokespecialROgMPW;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = C35399nuc.StateListAnimator.abAflu;
            wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
            if (wyc != null) {
                i = C35399nuc.StateListAnimator.OrsvgJ;
                FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                if (fragmentContainerView2 != null) {
                    i = C35399nuc.StateListAnimator.OFqMGB;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C35399nuc.StateListAnimator.zbGDDc;
                        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) ViewBindings.findChildViewById(view, i);
                        if (toolbar != null) {
                            return new C33851nIe((android.widget.LinearLayout) view, fragmentContainerView, wyc, fragmentContainerView2, textView, toolbar);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
