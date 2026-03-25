package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hEk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21574hEk implements ViewBinding {
    public final C22312hcw AEQbTJ;
    public final C24380icj AYXKKw;
    public final C25308iuK AhwBna;
    public final C25337iun EZpvd;
    public final C55173xeu KWHzl;
    public final ConstraintLayout OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C21574hEk(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C25337iun c25337iun, @androidx.annotation.NonNull C22312hcw c22312hcw, @androidx.annotation.NonNull C25308iuK c25308iuK, @androidx.annotation.NonNull C24380icj c24380icj) {
        this.copydefault = constraintLayout;
        this.OLrzqt = constraintLayout2;
        this.KWHzl = c55173xeu;
        this.EZpvd = c25337iun;
        this.AEQbTJ = c22312hcw;
        this.AhwBna = c25308iuK;
        this.AYXKKw = c24380icj;
    }

    public static C21574hEk OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DcMfJKsuEgdN;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C23274hvD.Application.gdLjtZ;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C23274hvD.Application.setSessionImpl;
                C25337iun c25337iun = (C25337iun) ViewBindings.findChildViewById(view, i);
                if (c25337iun != null) {
                    i = C23274hvD.Application.onScrollChanged;
                    C22312hcw c22312hcw = (C22312hcw) ViewBindings.findChildViewById(view, i);
                    if (c22312hcw != null) {
                        i = C23274hvD.Application.ViewTreeOnBackPressedDispatcherOwnerfindViewTreeOnBackPressedDispatcherOwner1;
                        C25308iuK c25308iuK = (C25308iuK) ViewBindings.findChildViewById(view, i);
                        if (c25308iuK != null) {
                            i = C23274hvD.Application.ViewPropertyAnimatorCompatSet1;
                            C24380icj c24380icj = (C24380icj) ViewBindings.findChildViewById(view, i);
                            if (c24380icj != null) {
                                return new C21574hEk((ConstraintLayout) view, constraintLayout, c55173xeu, c25337iun, c22312hcw, c25308iuK, c24380icj);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
