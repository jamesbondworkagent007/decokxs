package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes18.dex */
public final class oNU implements ViewBinding {
    public final android.widget.RelativeLayout AEQbTJ;
    public final pGY AYXKKw;
    public final C55173xeu AhwBna;
    public final C55113xdn AkhnZx;
    public final C32238mUp EZpvd;
    public final C55052xcf KWHzl;
    public final android.view.View OLrzqt;
    public final C36250oUv copydefault;
    public final pGX djBIcL;
    public final android.widget.LinearLayout fetchVPNInfo;
    public final AppCompatImageView gEmmrt;
    public final ConstraintLayout isConnected;
    public final Group valueOf;
    public final AppCompatImageView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.isConnected;
    }

    public oNU(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C32238mUp c32238mUp, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C36250oUv c36250oUv, @androidx.annotation.NonNull C55052xcf c55052xcf, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull pGX pgx, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull pGY pgy, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.isConnected = constraintLayout;
        this.EZpvd = c32238mUp;
        this.OLrzqt = view;
        this.copydefault = c36250oUv;
        this.KWHzl = c55052xcf;
        this.AEQbTJ = relativeLayout;
        this.djBIcL = pgx;
        this.AhwBna = c55173xeu;
        this.valueOf = group;
        this.AYXKKw = pgy;
        this.gEmmrt = appCompatImageView;
        this.values = appCompatImageView2;
        this.fetchVPNInfo = linearLayout;
        this.AkhnZx = c55113xdn;
    }

    public static oNU KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.aJFbMH, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static oNU EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35964oKf.StateListAnimator.DGgnkA;
        C32238mUp c32238mUp = (C32238mUp) ViewBindings.findChildViewById(view, i);
        if (c32238mUp != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.DaRZkR))) != null) {
            i = C35964oKf.StateListAnimator.DsrFlB;
            C36250oUv c36250oUv = (C36250oUv) ViewBindings.findChildViewById(view, i);
            if (c36250oUv != null) {
                i = C35964oKf.StateListAnimator.QIZEnU;
                C55052xcf c55052xcf = (C55052xcf) ViewBindings.findChildViewById(view, i);
                if (c55052xcf != null) {
                    i = C35964oKf.StateListAnimator.DrqXHJ;
                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = C35964oKf.StateListAnimator.DUUtXg;
                        pGX pgx = (pGX) ViewBindings.findChildViewById(view, i);
                        if (pgx != null) {
                            i = C35964oKf.StateListAnimator.invokespecialODCBUN;
                            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                            if (c55173xeu != null) {
                                i = C35964oKf.StateListAnimator.fcfzuX;
                                Group group = (Group) ViewBindings.findChildViewById(view, i);
                                if (group != null) {
                                    i = C35964oKf.StateListAnimator.FQMcgE;
                                    pGY pgy = (pGY) ViewBindings.findChildViewById(view, i);
                                    if (pgy != null) {
                                        i = C35964oKf.StateListAnimator.RLmrWm;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatImageView != null) {
                                            i = C35964oKf.StateListAnimator.pause;
                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatImageView2 != null) {
                                                i = C35964oKf.StateListAnimator.onServiceDisconnected;
                                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout != null) {
                                                    i = C35964oKf.StateListAnimator.onSkipToQueueItem;
                                                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                                    if (c55113xdn != null) {
                                                        return new oNU((ConstraintLayout) view, c32238mUp, viewFindChildViewById, c36250oUv, c55052xcf, relativeLayout, pgx, c55173xeu, group, pgy, appCompatImageView, appCompatImageView2, linearLayout, c55113xdn);
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
