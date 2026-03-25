package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iJu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23800iJu implements ViewBinding {
    public final C27127jpN AEQbTJ;
    public final C55251xgS AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final android.widget.TextView DbNXlk;
    public final android.widget.TextView EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.FrameLayout djBIcL;
    public final ConstraintLayout gEmmrt;
    public final C27212jqt valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public C23800iJu(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C27127jpN c27127jpN, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull C27212jqt c27212jqt, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.gEmmrt = constraintLayout;
        this.KWHzl = linearLayoutCompat;
        this.OLrzqt = imageView;
        this.EZpvd = textView;
        this.AEQbTJ = c27127jpN;
        this.copydefault = textView2;
        this.AYXKKw = c55251xgS;
        this.valueOf = c27212jqt;
        this.djBIcL = frameLayout;
        this.AhwBna = linearLayoutCompat2;
        this.DbNXlk = textView3;
    }

    public static C23800iJu OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.fetchVPNInfo;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C25493ixk.ActionBar.geLlBI;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C25493ixk.ActionBar.DcMfJK;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C25493ixk.ActionBar.hOMIpD;
                    C27127jpN c27127jpN = (C27127jpN) ViewBindings.findChildViewById(view, i);
                    if (c27127jpN != null) {
                        i = C25493ixk.ActionBar.IKQXqd;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C25493ixk.ActionBar.iTrKTi;
                            C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                            if (c55251xgS != null) {
                                i = C25493ixk.ActionBar.RXxsjQ;
                                C27212jqt c27212jqt = (C27212jqt) ViewBindings.findChildViewById(view, i);
                                if (c27212jqt != null) {
                                    i = C25493ixk.ActionBar.DYICSh;
                                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout != null) {
                                        i = C25493ixk.ActionBar.OqIZjC;
                                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat2 != null) {
                                            i = C25493ixk.ActionBar.QgUVrU;
                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                return new C23800iJu((ConstraintLayout) view, linearLayoutCompat, imageView, textView, c27127jpN, textView2, c55251xgS, c27212jqt, frameLayout, linearLayoutCompat2, textView3);
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
