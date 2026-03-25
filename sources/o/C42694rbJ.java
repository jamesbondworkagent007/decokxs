package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42694rbJ implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final ConstraintLayout DbNXlk;
    public final android.widget.ImageView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.view.View copydefault;
    public final ConstraintLayout djBIcL;
    public final android.widget.TextView ejfBZ;
    public final android.widget.TextView fJNWhG;
    public final android.view.View fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.view.View valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C42694rbJ(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull android.widget.TextView textView9, @androidx.annotation.NonNull android.widget.TextView textView10, @androidx.annotation.NonNull android.widget.TextView textView11) {
        this.djBIcL = constraintLayout;
        this.EZpvd = imageView;
        this.copydefault = view;
        this.KWHzl = textView;
        this.AEQbTJ = textView2;
        this.OLrzqt = textView3;
        this.AhwBna = textView4;
        this.gEmmrt = textView5;
        this.AYXKKw = textView6;
        this.valueOf = view2;
        this.AkhnZx = textView7;
        this.isConnected = textView8;
        this.DbNXlk = constraintLayout2;
        this.fetchVPNInfo = view3;
        this.values = textView9;
        this.fJNWhG = textView10;
        this.ejfBZ = textView11;
    }

    public static C42694rbJ copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.gmHjFq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C42694rbJ AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        android.view.View viewFindChildViewById3;
        int i = qZH.StateListAnimator.init;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.inahnb))) != null) {
            i = qZH.StateListAnimator.sRzUNh;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = qZH.StateListAnimator.hGuIrQ;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = qZH.StateListAnimator.zFtALg;
                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = qZH.StateListAnimator.QOjuYg;
                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = qZH.StateListAnimator.QfZsXX;
                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView5 != null) {
                                i = qZH.StateListAnimator.iLAtSv;
                                android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView6 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.HJWChPQdUnVm))) != null) {
                                    i = qZH.StateListAnimator.setCurrentKeyboardTarget;
                                    android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView7 != null) {
                                        i = qZH.StateListAnimator.apNKau;
                                        android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView8 != null) {
                                            i = qZH.StateListAnimator.ruDxL;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplBase5))) != null) {
                                                i = qZH.StateListAnimator.postOrRun;
                                                android.widget.TextView textView9 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView9 != null) {
                                                    i = qZH.StateListAnimator.MediaBrowserCompatMediaItem;
                                                    android.widget.TextView textView10 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView10 != null) {
                                                        i = qZH.StateListAnimator.fromMediaItem;
                                                        android.widget.TextView textView11 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView11 != null) {
                                                            return new C42694rbJ((ConstraintLayout) view, imageView, viewFindChildViewById, textView, textView2, textView3, textView4, textView5, textView6, viewFindChildViewById2, textView7, textView8, constraintLayout, viewFindChildViewById3, textView9, textView10, textView11);
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
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
