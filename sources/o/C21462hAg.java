package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hAg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21462hAg implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout EZpvd;
    public final jPJ KWHzl;
    public final C55173xeu OLrzqt;
    public final android.widget.ImageView copydefault;
    public final LinearLayoutCompat gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C21462hAg(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull jPJ jpj, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.EZpvd = constraintLayout;
        this.OLrzqt = c55173xeu;
        this.KWHzl = jpj;
        this.copydefault = imageView;
        this.AEQbTJ = imageView2;
        this.gEmmrt = linearLayoutCompat;
        this.valueOf = textView;
        this.AYXKKw = textView2;
        this.AhwBna = textView3;
    }

    public static C21462hAg KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.dXcUrg;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C23274hvD.Application.BVXAa;
            jPJ jpj = (jPJ) ViewBindings.findChildViewById(view, i);
            if (jpj != null) {
                i = C23274hvD.Application.isPlayable;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C23274hvD.Application.writeToParcel;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = C23274hvD.Application.ActivityResultCallerKt;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            i = C23274hvD.Application.onSubDecorInstalled;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C23274hvD.Application.onCreateView;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = C23274hvD.Application.setConstantSize;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        return new C21462hAg((ConstraintLayout) view, c55173xeu, jpj, imageView, imageView2, linearLayoutCompat, textView, textView2, textView3);
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
