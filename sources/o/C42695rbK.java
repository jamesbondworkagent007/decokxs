package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42695rbK implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final ConstraintLayout KWHzl;
    public final C41128qkv OLrzqt;
    public final C55173xeu copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C42695rbK(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C41128qkv c41128qkv, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.KWHzl = constraintLayout;
        this.OLrzqt = c41128qkv;
        this.copydefault = c55173xeu;
        this.AEQbTJ = textView;
    }

    public static C42695rbK copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.dHguZz;
        C41128qkv c41128qkv = (C41128qkv) ViewBindings.findChildViewById(view, i);
        if (c41128qkv != null) {
            i = qZH.StateListAnimator.Swccd;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = qZH.StateListAnimator.getNotifyChildrenChangedOptions;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C42695rbK((ConstraintLayout) view, c41128qkv, c55173xeu, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
