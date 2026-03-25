package o;

import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42706rbV implements ViewBinding {
    public final C41081qkA AEQbTJ;
    public final android.view.View AYXKKw;
    public final C41081qkA AhwBna;
    public final C41081qkA EZpvd;
    public final C41081qkA KWHzl;
    public final Group OLrzqt;
    public final Group copydefault;
    public final Group djBIcL;
    public final C41081qkA gEmmrt;
    public final C41081qkA valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AYXKKw;
    }

    public C42706rbV(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull C41081qkA c41081qkA, @androidx.annotation.NonNull C41081qkA c41081qkA2, @androidx.annotation.NonNull Group group2, @androidx.annotation.NonNull C41081qkA c41081qkA3, @androidx.annotation.NonNull C41081qkA c41081qkA4, @androidx.annotation.NonNull Group group3, @androidx.annotation.NonNull C41081qkA c41081qkA5, @androidx.annotation.NonNull C41081qkA c41081qkA6) {
        this.AYXKKw = view;
        this.copydefault = group;
        this.EZpvd = c41081qkA;
        this.AEQbTJ = c41081qkA2;
        this.OLrzqt = group2;
        this.KWHzl = c41081qkA3;
        this.AhwBna = c41081qkA4;
        this.djBIcL = group3;
        this.gEmmrt = c41081qkA5;
        this.valueOf = c41081qkA6;
    }

    public static C42706rbV copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.zDUObI, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C42706rbV KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DNMMPQ;
        Group group = (Group) ViewBindings.findChildViewById(view, i);
        if (group != null) {
            i = qZH.StateListAnimator.DsrFlB;
            C41081qkA c41081qkA = (C41081qkA) ViewBindings.findChildViewById(view, i);
            if (c41081qkA != null) {
                i = qZH.StateListAnimator.DaRZkR;
                C41081qkA c41081qkA2 = (C41081qkA) ViewBindings.findChildViewById(view, i);
                if (c41081qkA2 != null) {
                    i = qZH.StateListAnimator.OTwTPd;
                    Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                    if (group2 != null) {
                        i = qZH.StateListAnimator.DGgnkA;
                        C41081qkA c41081qkA3 = (C41081qkA) ViewBindings.findChildViewById(view, i);
                        if (c41081qkA3 != null) {
                            i = qZH.StateListAnimator.RKcVTr;
                            C41081qkA c41081qkA4 = (C41081qkA) ViewBindings.findChildViewById(view, i);
                            if (c41081qkA4 != null) {
                                i = qZH.StateListAnimator.QXDzTk;
                                Group group3 = (Group) ViewBindings.findChildViewById(view, i);
                                if (group3 != null) {
                                    i = qZH.StateListAnimator.RVsVBY;
                                    C41081qkA c41081qkA5 = (C41081qkA) ViewBindings.findChildViewById(view, i);
                                    if (c41081qkA5 != null) {
                                        i = qZH.StateListAnimator.QDqgQU;
                                        C41081qkA c41081qkA6 = (C41081qkA) ViewBindings.findChildViewById(view, i);
                                        if (c41081qkA6 != null) {
                                            return new C42706rbV(view, group, c41081qkA, c41081qkA2, group2, c41081qkA3, c41081qkA4, group3, c41081qkA5, c41081qkA6);
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
