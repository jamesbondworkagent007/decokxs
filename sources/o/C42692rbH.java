package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42692rbH implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final pGS AhwBna;
    public final android.widget.TextView AkhnZx;
    public final ConstraintLayout DbNXlk;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.Space OLrzqt;
    public final android.widget.TextView copydefault;
    public final Group djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.view.View isConnected;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.DbNXlk;
    }

    public C42692rbH(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.Space space, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull pGS pgs, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8, @androidx.annotation.NonNull android.view.View view) {
        this.DbNXlk = constraintLayout;
        this.copydefault = textView;
        this.EZpvd = textView2;
        this.OLrzqt = space;
        this.AEQbTJ = textView3;
        this.KWHzl = textView4;
        this.djBIcL = group;
        this.AYXKKw = imageView;
        this.valueOf = textView5;
        this.gEmmrt = textView6;
        this.AhwBna = pgs;
        this.AkhnZx = textView7;
        this.values = textView8;
        this.isConnected = view;
    }

    public static C42692rbH AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.gSBher, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C42692rbH KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = qZH.StateListAnimator.EZpvd;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = qZH.StateListAnimator.OLrzqt;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = qZH.StateListAnimator.gasjUx;
                android.widget.Space space = (android.widget.Space) ViewBindings.findChildViewById(view, i);
                if (space != null) {
                    i = qZH.StateListAnimator.UhxbNG;
                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = qZH.StateListAnimator.ULRxlR;
                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = qZH.StateListAnimator.YqksP;
                            Group group = (Group) ViewBindings.findChildViewById(view, i);
                            if (group != null) {
                                i = qZH.StateListAnimator.init;
                                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = qZH.StateListAnimator.HJWChPiaHEvk;
                                    android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        i = qZH.StateListAnimator.aBDePw;
                                        android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            i = qZH.StateListAnimator.DPVBvL;
                                            pGS pgs = (pGS) ViewBindings.findChildViewById(view, i);
                                            if (pgs != null) {
                                                i = qZH.StateListAnimator.setCurrentKeyboardTarget;
                                                android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView7 != null) {
                                                    i = qZH.StateListAnimator.apNKau;
                                                    android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView8 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.getMediaId))) != null) {
                                                        return new C42692rbH((ConstraintLayout) view, textView, textView2, space, textView3, textView4, group, imageView, textView5, textView6, pgs, textView7, textView8, viewFindChildViewById);
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
