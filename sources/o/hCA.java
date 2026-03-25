package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hCA implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView DbNXlk;
    public final AppCompatImageView EZpvd;
    public final ShapeableImageView KWHzl;
    public final C55064xcr OLrzqt;
    public final AppCompatImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final ConstraintLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public hCA(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C55064xcr c55064xcr, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5) {
        this.valueOf = constraintLayout;
        this.KWHzl = shapeableImageView;
        this.copydefault = appCompatImageView;
        this.OLrzqt = c55064xcr;
        this.EZpvd = appCompatImageView2;
        this.AEQbTJ = appCompatImageView3;
        this.djBIcL = textView;
        this.gEmmrt = textView2;
        this.AhwBna = textView3;
        this.AYXKKw = textView4;
        this.DbNXlk = textView5;
    }

    public static hCA KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.zpGcln, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hCA EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.RlQdEF;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            i = C23274hvD.Application.RAQtXZ;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C23274hvD.Application.resume;
                C55064xcr c55064xcr = (C55064xcr) ViewBindings.findChildViewById(view, i);
                if (c55064xcr != null) {
                    i = C23274hvD.Application.fWSAZA;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView2 != null) {
                        i = C23274hvD.Application.RhlVAI;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView3 != null) {
                            i = C23274hvD.Application.IntRange;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C23274hvD.Application.min;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = C23274hvD.Application.onCreateActionMode;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = C23274hvD.Application.WindowDecorActionBarActionModeImpl;
                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            i = C23274hvD.Application.setVisible;
                                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView5 != null) {
                                                return new hCA((ConstraintLayout) view, shapeableImageView, appCompatImageView, c55064xcr, appCompatImageView2, appCompatImageView3, textView, textView2, textView3, textView4, textView5);
                                            }
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
