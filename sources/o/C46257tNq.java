package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tNq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46257tNq implements ViewBinding {
    public final FragmentContainerView AEQbTJ;
    public final C33604mzb EZpvd;
    public final C46478tVv KWHzl;
    public final tUD OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final C33546myW djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.copydefault;
    }

    public C46257tNq(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull tUD tud, @androidx.annotation.NonNull C46478tVv c46478tVv, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull C33604mzb c33604mzb, @androidx.annotation.NonNull C33546myW c33546myW) {
        this.copydefault = linearLayoutCompat;
        this.OLrzqt = tud;
        this.KWHzl = c46478tVv;
        this.AEQbTJ = fragmentContainerView;
        this.EZpvd = c33604mzb;
        this.djBIcL = c33546myW;
    }

    public static C46257tNq copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static C46257tNq KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.djSkpj, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C46257tNq KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.valueOf;
        tUD tud = (tUD) ViewBindings.findChildViewById(view, i);
        if (tud != null) {
            i = C47501trL.TaskDescription.fERRXa;
            C46478tVv c46478tVv = (C46478tVv) ViewBindings.findChildViewById(view, i);
            if (c46478tVv != null) {
                i = C47501trL.TaskDescription.DCUTEIdCUTEI;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                if (fragmentContainerView != null) {
                    i = C47501trL.TaskDescription.iKEqwx;
                    C33604mzb c33604mzb = (C33604mzb) ViewBindings.findChildViewById(view, i);
                    if (c33604mzb != null) {
                        i = C47501trL.TaskDescription.DBAlnt;
                        C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                        if (c33546myW != null) {
                            return new C46257tNq((LinearLayoutCompat) view, tud, c46478tVv, fragmentContainerView, c33604mzb, c33546myW);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
