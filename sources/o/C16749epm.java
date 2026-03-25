package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16749epm implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final ConstraintLayout KWHzl;
    public final C57440yiU OLrzqt;
    public final C52794wYp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C16749epm(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C57440yiU c57440yiU, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.KWHzl = constraintLayout;
        this.copydefault = c52794wYp;
        this.EZpvd = constraintLayout2;
        this.OLrzqt = c57440yiU;
        this.AEQbTJ = appCompatTextView;
    }

    public static C16749epm EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.apNbdB;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C13754dXa.ActionBar.getStarRating;
            C57440yiU c57440yiU = (C57440yiU) ViewBindings.findChildViewById(view, i);
            if (c57440yiU != null) {
                i = C13754dXa.ActionBar.RatingCompat1;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    return new C16749epm(constraintLayout, c52794wYp, constraintLayout, c57440yiU, appCompatTextView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
