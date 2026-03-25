package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C34786niy;

/* JADX INFO: renamed from: o.niC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34738niC implements ViewBinding {
    public final C55239xgG AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public C34738niC(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55239xgG c55239xgG, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.EZpvd = linearLayout;
        this.copydefault = textView;
        this.AEQbTJ = c55239xgG;
        this.KWHzl = linearLayout2;
    }

    public static C34738niC AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C34786niy.ActionBar.KWHzl, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C34738niC KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C34786niy.Application.DbNXlk;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C34786niy.Application.AkhnZx;
            C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
            if (c55239xgG != null) {
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
                return new C34738niC(linearLayout, textView, c55239xgG, linearLayout);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
