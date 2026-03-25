package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23398hxV implements ViewBinding {
    public final wYF AEQbTJ;
    public final C55008xbo EZpvd;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C23398hxV(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull wYF wyf) {
        this.copydefault = linearLayout;
        this.EZpvd = c55008xbo;
        this.AEQbTJ = wyf;
    }

    public static C23398hxV EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RcXXUw, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23398hxV copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.RJOkX;
        C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
        if (c55008xbo != null) {
            i = C23274hvD.Application.DGUQLIDGUQLI;
            wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
            if (wyf != null) {
                return new C23398hxV((android.widget.LinearLayout) view, c55008xbo, wyf);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
