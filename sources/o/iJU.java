package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes23.dex */
public final class iJU implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final C52794wYp EZpvd;
    public final C52794wYp OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public iJU(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = constraintLayout;
        this.EZpvd = c52794wYp;
        this.OLrzqt = c52794wYp2;
        this.AEQbTJ = textView;
    }

    public static iJU EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.QDqgQU, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static iJU EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.accept;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C25493ixk.ActionBar.QKudOq;
            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp2 != null) {
                i = C25493ixk.ActionBar.IPostMessageService;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new iJU((ConstraintLayout) view, c52794wYp, c52794wYp2, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
