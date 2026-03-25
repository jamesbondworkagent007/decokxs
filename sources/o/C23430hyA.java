package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hyA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23430hyA implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C25308iuK AYXKKw;
    public final C30807liC EZpvd;
    public final C25337iun KWHzl;
    public final wYF OLrzqt;
    public final C25299iuB copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C23430hyA(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull C30807liC c30807liC, @androidx.annotation.NonNull C25337iun c25337iun, @androidx.annotation.NonNull C25299iuB c25299iuB, @androidx.annotation.NonNull C25308iuK c25308iuK) {
        this.AEQbTJ = constraintLayout;
        this.OLrzqt = wyf;
        this.EZpvd = c30807liC;
        this.KWHzl = c25337iun;
        this.copydefault = c25299iuB;
        this.AYXKKw = c25308iuK;
    }

    public static C23430hyA KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.OuxcSI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C23430hyA AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.onVolumeChanged;
        wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
        if (wyf != null) {
            i = C23274hvD.Application.ViewPropertyAnimatorCompatSet1;
            C30807liC c30807liC = (C30807liC) ViewBindings.findChildViewById(view, i);
            if (c30807liC != null) {
                i = C23274hvD.Application.getSupportActionProvider;
                C25337iun c25337iun = (C25337iun) ViewBindings.findChildViewById(view, i);
                if (c25337iun != null) {
                    i = C23274hvD.Application.getSubMenu;
                    C25299iuB c25299iuB = (C25299iuB) ViewBindings.findChildViewById(view, i);
                    if (c25299iuB != null) {
                        i = C23274hvD.Application.getTitleCondensed;
                        C25308iuK c25308iuK = (C25308iuK) ViewBindings.findChildViewById(view, i);
                        if (c25308iuK != null) {
                            return new C23430hyA((ConstraintLayout) view, wyf, c30807liC, c25337iun, c25299iuB, c25308iuK);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
