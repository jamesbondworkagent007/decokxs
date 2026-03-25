package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23424hxv implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final C57591ylM copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C23424hxv(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C57591ylM c57591ylM) {
        this.AEQbTJ = linearLayout;
        this.OLrzqt = frameLayout;
        this.KWHzl = linearLayout2;
        this.copydefault = c57591ylM;
    }

    public static C23424hxv copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, null, false);
    }

    public static C23424hxv EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.ejfBZ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C23424hxv AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DcMfJKsfEqpH;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
            int i2 = C23274hvD.Application.BackHandlerKtBackHandlerbackCallback11;
            C57591ylM c57591ylM = (C57591ylM) ViewBindings.findChildViewById(view, i2);
            if (c57591ylM != null) {
                return new C23424hxv(linearLayout, frameLayout, linearLayout, c57591ylM);
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
