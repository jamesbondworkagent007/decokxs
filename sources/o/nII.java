package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes16.dex */
public final class nII implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final C35893oHp AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView AuCTel;
    public final ConstraintLayout DbNXlk;
    public final Group EZpvd;
    public final Group KWHzl;
    public final android.view.View OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.ImageView djBIcL;
    public final android.widget.TextView fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.ImageView gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.ImageView valueOf;
    public final android.widget.ImageView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.DbNXlk;
    }

    public nII(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull Group group2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.ImageView imageView4, @androidx.annotation.NonNull C35893oHp c35893oHp, @androidx.annotation.NonNull android.widget.ImageView imageView5, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7) {
        this.DbNXlk = constraintLayout;
        this.AEQbTJ = textView;
        this.OLrzqt = view;
        this.KWHzl = group;
        this.EZpvd = group2;
        this.copydefault = textView2;
        this.djBIcL = imageView;
        this.valueOf = imageView2;
        this.gEmmrt = imageView3;
        this.AhwBna = imageView4;
        this.AYXKKw = c35893oHp;
        this.values = imageView5;
        this.fetchVPNInfo = textView3;
        this.isConnected = textView4;
        this.AkhnZx = textView5;
        this.AuCTel = textView6;
        this.fJNWhG = textView7;
    }

    public static nII AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, null, false);
    }

    public static nII AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.sSMYrx, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static nII EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35399nuc.StateListAnimator.EZpvd;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35399nuc.StateListAnimator.getNewProxyInstance))) != null) {
            i = C35399nuc.StateListAnimator.spnCvw;
            Group group = (Group) ViewBindings.findChildViewById(view, i);
            if (group != null) {
                i = C35399nuc.StateListAnimator.Dmq;
                Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                if (group2 != null) {
                    i = C35399nuc.StateListAnimator.UhxbNG;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C35399nuc.StateListAnimator.DGUQLIhJrIAr;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C35399nuc.StateListAnimator.DPHsZd;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = C35399nuc.StateListAnimator.RZNAhV;
                                android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = C35399nuc.StateListAnimator.dbwnZN;
                                    android.widget.ImageView imageView4 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView4 != null) {
                                        i = C35399nuc.StateListAnimator.GPCHlQ;
                                        C35893oHp c35893oHp = (C35893oHp) ViewBindings.findChildViewById(view, i);
                                        if (c35893oHp != null) {
                                            i = C35399nuc.StateListAnimator.HJWChPzRXNTw;
                                            android.widget.ImageView imageView5 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView5 != null) {
                                                i = C35399nuc.StateListAnimator.HrMTQN;
                                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView3 != null) {
                                                    i = C35399nuc.StateListAnimator.onLost;
                                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView4 != null) {
                                                        i = C35399nuc.StateListAnimator.DRtzUu;
                                                        android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView5 != null) {
                                                            i = C35399nuc.StateListAnimator.DRuYWY;
                                                            android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView6 != null) {
                                                                i = C35399nuc.StateListAnimator.DvMhtu;
                                                                android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView7 != null) {
                                                                    return new nII((ConstraintLayout) view, textView, viewFindChildViewById, group, group2, textView2, imageView, imageView2, imageView3, imageView4, c35893oHp, imageView5, textView3, textView4, textView5, textView6, textView7);
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
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
