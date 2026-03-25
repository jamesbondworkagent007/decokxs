package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31513lvT implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final C55113xdn AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.FrameLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.valueOf;
    }

    public C31513lvT(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.valueOf = frameLayout;
        this.AEQbTJ = constraintLayout;
        this.copydefault = imageView;
        this.EZpvd = textView;
        this.OLrzqt = textView2;
        this.KWHzl = imageView2;
        this.AYXKKw = imageView3;
        this.AhwBna = c55113xdn;
        this.gEmmrt = textView3;
        this.djBIcL = textView4;
    }

    public static C31513lvT OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C31351lsQ.Application.QCjLjM;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C31351lsQ.Application.fXYAwm;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C31351lsQ.Application.FYtjSf;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C31351lsQ.Application.finishInit;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C31351lsQ.Application.GFUIi;
                        android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = C31351lsQ.Application.GGlJim;
                            android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = C31351lsQ.Application.GcnicV;
                                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                if (c55113xdn != null) {
                                    i = C31351lsQ.Application.GiPPlLRPuVlr;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = C31351lsQ.Application.DjwCMv;
                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            return new C31513lvT((android.widget.FrameLayout) view, constraintLayout, imageView, textView, textView2, imageView2, imageView3, c55113xdn, textView3, textView4);
                                        }
                                    }
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
