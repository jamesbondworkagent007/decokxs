package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C21490hBh implements ViewBinding {
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C29020klk OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public C21490hBh(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C29020klk c29020klk, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.EZpvd = linearLayout;
        this.OLrzqt = c29020klk;
        this.KWHzl = linearLayout2;
    }

    public static C21490hBh KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.dzCpvv;
        C29020klk c29020klk = (C29020klk) ViewBindings.findChildViewById(view, i);
        if (c29020klk != null) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
            return new C21490hBh(linearLayout, c29020klk, linearLayout);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
