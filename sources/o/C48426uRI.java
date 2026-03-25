package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uRI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48426uRI implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final C52794wYp EZpvd;
    public final ShapeableImageView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final wYX copydefault;
    public final ConstraintLayout djBIcL;
    public final AppCompatTextView fetchVPNInfo;
    public final AppCompatTextView gEmmrt;
    public final wYE valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C48426uRI(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull wYX wyx, @androidx.annotation.NonNull wYE wye, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5) {
        this.djBIcL = constraintLayout;
        this.EZpvd = c52794wYp;
        this.KWHzl = shapeableImageView;
        this.AEQbTJ = imageView;
        this.OLrzqt = constraintLayout2;
        this.copydefault = wyx;
        this.valueOf = wye;
        this.gEmmrt = appCompatTextView;
        this.AYXKKw = appCompatTextView2;
        this.AhwBna = appCompatTextView3;
        this.fetchVPNInfo = appCompatTextView4;
        this.values = appCompatTextView5;
    }

    public static C48426uRI EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.iCPUKe, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C48426uRI AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.processStrongAuthMessage;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C48033uCm.Application.getSmallIconId;
            ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
            if (shapeableImageView != null) {
                i = C48033uCm.Application.read;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C48033uCm.Application.setCallbacksMessenger;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C48033uCm.Application.createItem;
                        wYX wyx = (wYX) ViewBindings.findChildViewById(view, i);
                        if (wyx != null) {
                            i = C48033uCm.Application.createSubDecor;
                            wYE wye = (wYE) ViewBindings.findChildViewById(view, i);
                            if (wye != null) {
                                i = C48033uCm.Application.AppCompatDelegateImplContextThemeWrapperCompatApi17Impl;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    i = C48033uCm.Application.applyOverrideConfiguration;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView2 != null) {
                                        i = C48033uCm.Application.checkOnClickListener;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView3 != null) {
                                            i = C48033uCm.Application.backportAccessibilityAttributes;
                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView4 != null) {
                                                i = C48033uCm.Application.onNothingSelected;
                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView5 != null) {
                                                    return new C48426uRI((ConstraintLayout) view, c52794wYp, shapeableImageView, imageView, constraintLayout, wyx, wye, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
