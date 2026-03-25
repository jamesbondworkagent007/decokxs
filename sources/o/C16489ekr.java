package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ekr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16489ekr implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final AppCompatImageView AhwBna;
    public final wYC EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final wYC OLrzqt;
    public final ShapeableImageView copydefault;
    public final C55230xfy djBIcL;
    public final ConstraintLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public C16489ekr(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull wYC wyc2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C55230xfy c55230xfy) {
        this.valueOf = constraintLayout;
        this.EZpvd = wyc;
        this.KWHzl = frameLayout;
        this.copydefault = shapeableImageView;
        this.OLrzqt = wyc2;
        this.AEQbTJ = textView;
        this.AhwBna = appCompatImageView;
        this.AYXKKw = constraintLayout2;
        this.djBIcL = c55230xfy;
    }

    public static C16489ekr KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.zSsVtY;
        wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
        if (wyc != null) {
            i = C13754dXa.ActionBar.DjwCMv;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C13754dXa.ActionBar.QzqeNH;
                ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                if (shapeableImageView != null) {
                    i = C13754dXa.ActionBar.hpmliR;
                    wYC wyc2 = (wYC) ViewBindings.findChildViewById(view, i);
                    if (wyc2 != null) {
                        i = C13754dXa.ActionBar.aWuQzD;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C13754dXa.ActionBar.QhsCdE;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i = C13754dXa.ActionBar.ResultReceiverMyRunnable;
                                C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                                if (c55230xfy != null) {
                                    return new C16489ekr(constraintLayout, wyc, frameLayout, shapeableImageView, wyc2, textView, appCompatImageView, constraintLayout, c55230xfy);
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
