package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23395hxS implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C22312hcw EZpvd;
    public final wYF KWHzl;
    public final C25337iun OLrzqt;
    public final C25299iuB copydefault;
    public final C25308iuK gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C23395hxS(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull C22312hcw c22312hcw, @androidx.annotation.NonNull C25337iun c25337iun, @androidx.annotation.NonNull C25299iuB c25299iuB, @androidx.annotation.NonNull C25308iuK c25308iuK) {
        this.AEQbTJ = constraintLayout;
        this.KWHzl = wyf;
        this.EZpvd = c22312hcw;
        this.OLrzqt = c25337iun;
        this.copydefault = c25299iuB;
        this.gEmmrt = c25308iuK;
    }

    public static C23395hxS KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.QUSxYX, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C23395hxS EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.onVolumeChanged;
        wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
        if (wyf != null) {
            i = C23274hvD.Application.onScrollChanged;
            C22312hcw c22312hcw = (C22312hcw) ViewBindings.findChildViewById(view, i);
            if (c22312hcw != null) {
                i = C23274hvD.Application.getSupportActionProvider;
                C25337iun c25337iun = (C25337iun) ViewBindings.findChildViewById(view, i);
                if (c25337iun != null) {
                    i = C23274hvD.Application.getSubMenu;
                    C25299iuB c25299iuB = (C25299iuB) ViewBindings.findChildViewById(view, i);
                    if (c25299iuB != null) {
                        i = C23274hvD.Application.getTitleCondensed;
                        C25308iuK c25308iuK = (C25308iuK) ViewBindings.findChildViewById(view, i);
                        if (c25308iuK != null) {
                            return new C23395hxS((ConstraintLayout) view, wyf, c22312hcw, c25337iun, c25299iuB, c25308iuK);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
