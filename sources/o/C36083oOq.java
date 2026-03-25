package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oOq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36083oOq implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final C34393nbI AYXKKw;
    public final C34393nbI AhwBna;
    public final android.widget.HorizontalScrollView DbNXlk;
    public final C34393nbI EZpvd;
    public final C34393nbI KWHzl;
    public final AppCompatImageView OLrzqt;
    public final C34393nbI copydefault;
    public final android.view.View djBIcL;
    public final LinearLayoutCompat gEmmrt;
    public final ConstraintLayout isConnected;
    public final C34393nbI valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.djBIcL;
    }

    public C36083oOq(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C34393nbI c34393nbI, @androidx.annotation.NonNull C34393nbI c34393nbI2, @androidx.annotation.NonNull C34393nbI c34393nbI3, @androidx.annotation.NonNull C34393nbI c34393nbI4, @androidx.annotation.NonNull C34393nbI c34393nbI5, @androidx.annotation.NonNull C34393nbI c34393nbI6, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.HorizontalScrollView horizontalScrollView, @androidx.annotation.NonNull ConstraintLayout constraintLayout) {
        this.djBIcL = view;
        this.AEQbTJ = view2;
        this.OLrzqt = appCompatImageView;
        this.EZpvd = c34393nbI;
        this.KWHzl = c34393nbI2;
        this.copydefault = c34393nbI3;
        this.AhwBna = c34393nbI4;
        this.valueOf = c34393nbI5;
        this.AYXKKw = c34393nbI6;
        this.gEmmrt = linearLayoutCompat;
        this.DbNXlk = horizontalScrollView;
        this.isConnected = constraintLayout;
    }

    public static C36083oOq KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C35964oKf.Application.tIwhY, viewGroup);
        return copydefault(viewGroup);
    }

    public static C36083oOq copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.fVjYLc;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C35964oKf.StateListAnimator.zFtALg;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C35964oKf.StateListAnimator.fDu;
                C34393nbI c34393nbI = (C34393nbI) ViewBindings.findChildViewById(view, i);
                if (c34393nbI != null) {
                    i = C35964oKf.StateListAnimator.DjwCMv;
                    C34393nbI c34393nbI2 = (C34393nbI) ViewBindings.findChildViewById(view, i);
                    if (c34393nbI2 != null) {
                        i = C35964oKf.StateListAnimator.HJWChPOKBmQN;
                        C34393nbI c34393nbI3 = (C34393nbI) ViewBindings.findChildViewById(view, i);
                        if (c34393nbI3 != null) {
                            i = C35964oKf.StateListAnimator.QsIRgs;
                            C34393nbI c34393nbI4 = (C34393nbI) ViewBindings.findChildViewById(view, i);
                            if (c34393nbI4 != null) {
                                i = C35964oKf.StateListAnimator.HJWChPQPAeHI;
                                C34393nbI c34393nbI5 = (C34393nbI) ViewBindings.findChildViewById(view, i);
                                if (c34393nbI5 != null) {
                                    i = C35964oKf.StateListAnimator.HJWChPQdUnVm;
                                    C34393nbI c34393nbI6 = (C34393nbI) ViewBindings.findChildViewById(view, i);
                                    if (c34393nbI6 != null) {
                                        i = C35964oKf.StateListAnimator.icKaHr;
                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat != null) {
                                            i = C35964oKf.StateListAnimator.ITrustedWebActivityCallbackDefault;
                                            android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                                            if (horizontalScrollView != null) {
                                                i = C35964oKf.StateListAnimator.MediaSessionCompatCallbackStubApi24;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout != null) {
                                                    return new C36083oOq(view, viewFindChildViewById, appCompatImageView, c34393nbI, c34393nbI2, c34393nbI3, c34393nbI4, c34393nbI5, c34393nbI6, linearLayoutCompat, horizontalScrollView, constraintLayout);
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
