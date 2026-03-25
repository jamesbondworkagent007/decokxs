package o;

import androidx.viewbinding.ViewBinding;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nJW implements ViewBinding {
    public final C35934oJc KWHzl;
    public final C35934oJc copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C35934oJc getRoot() {
        return this.copydefault;
    }

    public nJW(@androidx.annotation.NonNull C35934oJc c35934oJc, @androidx.annotation.NonNull C35934oJc c35934oJc2) {
        this.copydefault = c35934oJc;
        this.KWHzl = c35934oJc2;
    }

    public static nJW OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.dmfpNf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static nJW AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C35934oJc c35934oJc = (C35934oJc) view;
        return new nJW(c35934oJc, c35934oJc);
    }
}
