package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uQt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48418uQt implements ViewBinding {
    public final C55052xcf AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final C55052xcf KWHzl;
    public final android.widget.FrameLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C48418uQt(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55052xcf c55052xcf, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55052xcf c55052xcf2) {
        this.EZpvd = constraintLayout;
        this.AEQbTJ = c55052xcf;
        this.OLrzqt = frameLayout;
        this.KWHzl = c55052xcf2;
    }

    public static C48418uQt copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.zEkrwr;
        C55052xcf c55052xcf = (C55052xcf) ViewBindings.findChildViewById(view, i);
        if (c55052xcf != null) {
            i = C48033uCm.Application.RjCdvpRjCdvp;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C48033uCm.Application.BackHandlerlambda0;
                C55052xcf c55052xcf2 = (C55052xcf) ViewBindings.findChildViewById(view, i);
                if (c55052xcf2 != null) {
                    return new C48418uQt((ConstraintLayout) view, c55052xcf, frameLayout, c55052xcf2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
