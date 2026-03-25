package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes23.dex */
public final class oOX implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final C36110oPq KWHzl;
    public final ConstraintLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public oOX(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull C36110oPq c36110oPq, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout) {
        this.OLrzqt = constraintLayout;
        this.EZpvd = appCompatTextView;
        this.KWHzl = c36110oPq;
        this.AEQbTJ = linearLayout;
    }

    public static oOX EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi212;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.onCommand))) != null) {
            C36110oPq c36110oPqKWHzl = C36110oPq.KWHzl(viewFindChildViewById);
            int i2 = C35964oKf.StateListAnimator.onPrepareFromSearch;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i2);
            if (linearLayout != null) {
                return new oOX((ConstraintLayout) view, appCompatTextView, c36110oPqKWHzl, linearLayout);
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
