package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nOR implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final C55230xfy EZpvd;
    public final LinearLayoutCompat KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.KWHzl;
    }

    public nOR(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2) {
        this.KWHzl = linearLayoutCompat;
        this.EZpvd = c55230xfy;
        this.AEQbTJ = linearLayoutCompat2;
    }

    public static nOR copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.invokespecialatDTRm, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static nOR OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.QUSxYX;
        C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
        if (c55230xfy != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
            return new nOR(linearLayoutCompat, c55230xfy, linearLayoutCompat);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
