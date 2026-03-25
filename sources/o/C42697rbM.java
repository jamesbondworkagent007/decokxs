package o;

import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42697rbM implements ViewBinding {
    public final C41129qkw AEQbTJ;
    public final Group AYXKKw;
    public final android.widget.TextView AhwBna;
    public final Group EZpvd;
    public final C41129qkw KWHzl;
    public final Group OLrzqt;
    public final C41129qkw copydefault;
    public final C41129qkw djBIcL;
    public final C41129qkw gEmmrt;
    public final android.view.View valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.valueOf;
    }

    public C42697rbM(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull C41129qkw c41129qkw, @androidx.annotation.NonNull C41129qkw c41129qkw2, @androidx.annotation.NonNull Group group2, @androidx.annotation.NonNull C41129qkw c41129qkw3, @androidx.annotation.NonNull Group group3, @androidx.annotation.NonNull C41129qkw c41129qkw4, @androidx.annotation.NonNull C41129qkw c41129qkw5, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.valueOf = view;
        this.OLrzqt = group;
        this.KWHzl = c41129qkw;
        this.AEQbTJ = c41129qkw2;
        this.EZpvd = group2;
        this.copydefault = c41129qkw3;
        this.AYXKKw = group3;
        this.djBIcL = c41129qkw4;
        this.gEmmrt = c41129qkw5;
        this.AhwBna = textView;
    }

    public static C42697rbM OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.hvKCwS, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C42697rbM AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DNMMPQ;
        Group group = (Group) ViewBindings.findChildViewById(view, i);
        if (group != null) {
            i = qZH.StateListAnimator.DsrFlB;
            C41129qkw c41129qkw = (C41129qkw) ViewBindings.findChildViewById(view, i);
            if (c41129qkw != null) {
                i = qZH.StateListAnimator.DaRZkR;
                C41129qkw c41129qkw2 = (C41129qkw) ViewBindings.findChildViewById(view, i);
                if (c41129qkw2 != null) {
                    i = qZH.StateListAnimator.OTwTPd;
                    Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                    if (group2 != null) {
                        i = qZH.StateListAnimator.DGgnkA;
                        C41129qkw c41129qkw3 = (C41129qkw) ViewBindings.findChildViewById(view, i);
                        if (c41129qkw3 != null) {
                            i = qZH.StateListAnimator.QXDzTk;
                            Group group3 = (Group) ViewBindings.findChildViewById(view, i);
                            if (group3 != null) {
                                i = qZH.StateListAnimator.RVsVBY;
                                C41129qkw c41129qkw4 = (C41129qkw) ViewBindings.findChildViewById(view, i);
                                if (c41129qkw4 != null) {
                                    i = qZH.StateListAnimator.QDqgQU;
                                    C41129qkw c41129qkw5 = (C41129qkw) ViewBindings.findChildViewById(view, i);
                                    if (c41129qkw5 != null) {
                                        i = qZH.StateListAnimator.f1064a;
                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            return new C42697rbM(view, group, c41129qkw, c41129qkw2, group2, c41129qkw3, group3, c41129qkw4, c41129qkw5, textView);
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
