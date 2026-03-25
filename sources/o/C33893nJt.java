package o;

import androidx.viewbinding.ViewBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nJt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C33893nJt implements ViewBinding {
    public final C35934oJc EZpvd;
    public final C35934oJc OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C35934oJc getRoot() {
        return this.EZpvd;
    }

    public C33893nJt(@androidx.annotation.NonNull C35934oJc c35934oJc, @androidx.annotation.NonNull C35934oJc c35934oJc2) {
        this.EZpvd = c35934oJc;
        this.OLrzqt = c35934oJc2;
    }

    public static C33893nJt EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.AxsJAYaxsJAY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C33893nJt KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C35934oJc c35934oJc = (C35934oJc) view;
        return new C33893nJt(c35934oJc, c35934oJc);
    }
}
