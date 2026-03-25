package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C44105sDn;

/* JADX INFO: renamed from: o.sDo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44106sDo implements ViewBinding {
    public final C35893oHp AEQbTJ;
    public final ConstraintLayout AhwBna;
    public final android.view.View EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final C35893oHp djBIcL;
    public final ConstraintLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public C44106sDo(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C35893oHp c35893oHp, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull C35893oHp c35893oHp2) {
        this.AhwBna = constraintLayout;
        this.EZpvd = view;
        this.copydefault = textView;
        this.OLrzqt = textView2;
        this.KWHzl = constraintLayout2;
        this.AEQbTJ = c35893oHp;
        this.gEmmrt = constraintLayout3;
        this.djBIcL = c35893oHp2;
    }

    public static C44106sDo OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C44105sDn.ActionBar.EZpvd;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C44105sDn.ActionBar.valueOf;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C44105sDn.ActionBar.DbNXlk;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C44105sDn.ActionBar.AkhnZx;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C44105sDn.ActionBar.fARcdN;
                        C35893oHp c35893oHp = (C35893oHp) ViewBindings.findChildViewById(view, i);
                        if (c35893oHp != null) {
                            i = C44105sDn.ActionBar.ejfBZ;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout2 != null) {
                                i = C44105sDn.ActionBar.fJNWhG;
                                C35893oHp c35893oHp2 = (C35893oHp) ViewBindings.findChildViewById(view, i);
                                if (c35893oHp2 != null) {
                                    return new C44106sDo((ConstraintLayout) view, viewFindChildViewById, textView, textView2, constraintLayout, c35893oHp, constraintLayout2, c35893oHp2);
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
