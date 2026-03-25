package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iLg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23840iLg implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final android.widget.FrameLayout KWHzl;
    public final C55113xdn OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public C23840iLg(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.KWHzl = frameLayout;
        this.AEQbTJ = c55173xeu;
        this.OLrzqt = c55113xdn;
    }

    public static C23840iLg KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.DGUQLIhJrIAr, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23840iLg copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.QfJbVf;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C25493ixk.ActionBar.itxZVF;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                return new C23840iLg((android.widget.FrameLayout) view, c55173xeu, c55113xdn);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
