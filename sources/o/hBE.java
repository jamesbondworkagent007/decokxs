package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hBE implements ViewBinding {
    public final C19976gWh AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final C22359hdq KWHzl;
    public final AppCompatTextView OLrzqt;
    public final C52794wYp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public hBE(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C22359hdq c22359hdq, @androidx.annotation.NonNull C19976gWh c19976gWh, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.EZpvd = constraintLayout;
        this.copydefault = c52794wYp;
        this.KWHzl = c22359hdq;
        this.AEQbTJ = c19976gWh;
        this.OLrzqt = appCompatTextView;
    }

    public static hBE copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.fXYAwm, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hBE EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.run;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C23274hvD.Application.getActions;
            C22359hdq c22359hdq = (C22359hdq) ViewBindings.findChildViewById(view, i);
            if (c22359hdq != null) {
                i = C23274hvD.Application.LocalOnBackPressedDispatcherOwnerLocalOnBackPressedDispatcherOwner1;
                C19976gWh c19976gWh = (C19976gWh) ViewBindings.findChildViewById(view, i);
                if (c19976gWh != null) {
                    i = C23274hvD.Application.getIntrinsicWidth;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        return new hBE((ConstraintLayout) view, c52794wYp, c22359hdq, c19976gWh, appCompatTextView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
