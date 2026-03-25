package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.ret, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42889ret implements ViewBinding {
    public final C40358qSx AEQbTJ;
    public final AppCompatImageView EZpvd;
    public final C40492qXw KWHzl;
    public final AppCompatImageView OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C42889ret(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C40492qXw c40492qXw, @androidx.annotation.NonNull C40358qSx c40358qSx, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2) {
        this.copydefault = constraintLayout;
        this.KWHzl = c40492qXw;
        this.AEQbTJ = c40358qSx;
        this.OLrzqt = appCompatImageView;
        this.EZpvd = appCompatImageView2;
    }

    public static C42889ret KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.stopBehavioSecDataCollection, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C42889ret OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.apNbdB;
        C40492qXw c40492qXw = (C40492qXw) ViewBindings.findChildViewById(view, i);
        if (c40492qXw != null) {
            i = qZH.StateListAnimator.sTzBva;
            C40358qSx c40358qSx = (C40358qSx) ViewBindings.findChildViewById(view, i);
            if (c40358qSx != null) {
                i = qZH.StateListAnimator.DcMfJKgMxgjU;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = qZH.StateListAnimator.jNexW;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView2 != null) {
                        return new C42889ret((ConstraintLayout) view, c40492qXw, c40358qSx, appCompatImageView, appCompatImageView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
