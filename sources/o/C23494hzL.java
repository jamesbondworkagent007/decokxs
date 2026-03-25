package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23494hzL implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final android.widget.LinearLayout AhwBna;
    public final C24736ijU EZpvd;
    public final ConstraintLayout KWHzl;
    public final C24739ijX OLrzqt;
    public final AppCompatImageView copydefault;
    public final android.widget.TextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AhwBna;
    }

    public C23494hzL(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C24736ijU c24736ijU, @androidx.annotation.NonNull C24739ijX c24739ijX, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AhwBna = linearLayout;
        this.KWHzl = constraintLayout;
        this.EZpvd = c24736ijU;
        this.OLrzqt = c24739ijX;
        this.AEQbTJ = appCompatImageView;
        this.copydefault = appCompatImageView2;
        this.djBIcL = textView;
    }

    public static C23494hzL AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.UrRBLY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23494hzL OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.invokespecialRuDPQV;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C23274hvD.Application.RhjxDW;
            C24736ijU c24736ijU = (C24736ijU) ViewBindings.findChildViewById(view, i);
            if (c24736ijU != null) {
                i = C23274hvD.Application.iWlNch;
                C24739ijX c24739ijX = (C24739ijX) ViewBindings.findChildViewById(view, i);
                if (c24739ijX != null) {
                    i = C23274hvD.Application.dxTXDv;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null) {
                        i = C23274hvD.Application.setInternalConnectionCallback;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView2 != null) {
                            i = C23274hvD.Application.setDrawerSlideAnimationEnabled;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                return new C23494hzL((android.widget.LinearLayout) view, constraintLayout, c24736ijU, c24739ijX, appCompatImageView, appCompatImageView2, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
