package o;

import androidx.viewbinding.ViewBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nKr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33918nKr implements ViewBinding {
    public final C36484obo KWHzl;
    public final C36484obo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C36484obo getRoot() {
        return this.copydefault;
    }

    public C33918nKr(@androidx.annotation.NonNull C36484obo c36484obo, @androidx.annotation.NonNull C36484obo c36484obo2) {
        this.copydefault = c36484obo;
        this.KWHzl = c36484obo2;
    }

    public static C33918nKr OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.fERRXa, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C33918nKr AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C36484obo c36484obo = (C36484obo) view;
        return new C33918nKr(c36484obo, c36484obo);
    }
}
