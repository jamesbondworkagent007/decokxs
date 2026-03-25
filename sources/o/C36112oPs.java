package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oPs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36112oPs implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C36112oPs(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.EZpvd = constraintLayout;
        this.OLrzqt = textView;
        this.AEQbTJ = textView2;
        this.KWHzl = textView3;
    }

    public static C36112oPs AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.fGQ;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C35964oKf.StateListAnimator.hlXVux;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C35964oKf.StateListAnimator.MediaSessionCompatCallback;
                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    return new C36112oPs((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
