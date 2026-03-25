package o;

import androidx.viewbinding.ViewBinding;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hAu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C21476hAu implements ViewBinding {
    public final C22079hXc OLrzqt;
    public final C22079hXc copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C22079hXc getRoot() {
        return this.OLrzqt;
    }

    public C21476hAu(@androidx.annotation.NonNull C22079hXc c22079hXc, @androidx.annotation.NonNull C22079hXc c22079hXc2) {
        this.OLrzqt = c22079hXc;
        this.copydefault = c22079hXc2;
    }

    public static C21476hAu KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.fsSxsn, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C21476hAu OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        C22079hXc c22079hXc = (C22079hXc) view;
        return new C21476hAu(c22079hXc, c22079hXc);
    }
}
