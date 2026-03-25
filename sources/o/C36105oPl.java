package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oPl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C36105oPl implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final android.widget.TextView OLrzqt;
    public final android.widget.ProgressBar copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C36105oPl(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ProgressBar progressBar, @androidx.annotation.NonNull C52794wYp c52794wYp) {
        this.EZpvd = constraintLayout;
        this.OLrzqt = textView;
        this.copydefault = progressBar;
        this.AEQbTJ = c52794wYp;
    }

    public static C36105oPl AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.invokespecialatDTRm;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C35964oKf.StateListAnimator.OFnBcz;
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) ViewBindings.findChildViewById(view, i);
            if (progressBar != null) {
                i = C35964oKf.StateListAnimator.onRelationshipValidationResult;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    return new C36105oPl((ConstraintLayout) view, textView, progressBar, c52794wYp);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
