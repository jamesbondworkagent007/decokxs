package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42698rbN implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.ImageView AhwBna;
    public final android.widget.ImageView EZpvd;
    public final android.widget.TextView KWHzl;
    public final C41084qkD OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.ImageView djBIcL;
    public final AppCompatTextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C42698rbN(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C41084qkD c41084qkD, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.AEQbTJ = constraintLayout;
        this.OLrzqt = c41084qkD;
        this.EZpvd = imageView;
        this.copydefault = textView;
        this.KWHzl = textView2;
        this.AhwBna = imageView2;
        this.djBIcL = imageView3;
        this.gEmmrt = appCompatTextView;
    }

    public static C42698rbN copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.sTzBva, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C42698rbN EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.OJuSTm;
        C41084qkD c41084qkD = (C41084qkD) ViewBindings.findChildViewById(view, i);
        if (c41084qkD != null) {
            i = qZH.StateListAnimator.gdmIOq;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = qZH.StateListAnimator.itxZVF;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = qZH.StateListAnimator.OqCbbx;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = qZH.StateListAnimator.znKlvJ;
                        android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = qZH.StateListAnimator.keyboardTargetTextChanged;
                            android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = qZH.StateListAnimator.apNKau;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    return new C42698rbN((ConstraintLayout) view, c41084qkD, imageView, textView, textView2, imageView2, imageView3, appCompatTextView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
