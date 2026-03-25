package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nIn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C33860nIn implements ViewBinding {
    public final android.widget.LinearLayout EZpvd;
    public final androidx.appcompat.widget.Toolbar KWHzl;
    public final android.widget.TextView OLrzqt;
    public final FragmentContainerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public C33860nIn(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull androidx.appcompat.widget.Toolbar toolbar, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.EZpvd = linearLayout;
        this.copydefault = fragmentContainerView;
        this.KWHzl = toolbar;
        this.OLrzqt = textView;
    }

    public static C33860nIn AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C33860nIn OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.fJNWhG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C33860nIn OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.ORmwhf;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = C35399nuc.StateListAnimator.iRgjgR;
            androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) ViewBindings.findChildViewById(view, i);
            if (toolbar != null) {
                i = C35399nuc.StateListAnimator.ORrpqH;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C33860nIn((android.widget.LinearLayout) view, fragmentContainerView, toolbar, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
