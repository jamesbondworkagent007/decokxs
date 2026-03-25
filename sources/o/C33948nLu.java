package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nLu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33948nLu implements ViewBinding {
    public final C54989xbV AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout DbNXlk;
    public final C54989xbV EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.ImageView djBIcL;
    public final ConstraintLayout gEmmrt;
    public final ConstraintLayout valueOf;
    public final C54989xbV values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.DbNXlk;
    }

    public C33948nLu(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C54989xbV c54989xbV, @androidx.annotation.NonNull C54989xbV c54989xbV2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull C54989xbV c54989xbV3) {
        this.DbNXlk = constraintLayout;
        this.OLrzqt = textView;
        this.EZpvd = c54989xbV;
        this.AEQbTJ = c54989xbV2;
        this.copydefault = textView2;
        this.KWHzl = imageView;
        this.valueOf = constraintLayout2;
        this.AhwBna = textView3;
        this.djBIcL = imageView2;
        this.gEmmrt = constraintLayout3;
        this.AYXKKw = textView4;
        this.values = c54989xbV3;
    }

    public static C33948nLu copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.RXzakW, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C33948nLu KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.KWHzl;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C35399nuc.StateListAnimator.djBIcL;
            C54989xbV c54989xbV = (C54989xbV) ViewBindings.findChildViewById(view, i);
            if (c54989xbV != null) {
                i = C35399nuc.StateListAnimator.DGUQLIdZmdUa;
                C54989xbV c54989xbV2 = (C54989xbV) ViewBindings.findChildViewById(view, i);
                if (c54989xbV2 != null) {
                    i = C35399nuc.StateListAnimator.gtCCJH;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C35399nuc.StateListAnimator.OEgNct;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C35399nuc.StateListAnimator.OijiEz;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                i = C35399nuc.StateListAnimator.gqOnQv;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = C35399nuc.StateListAnimator.dPkBzA;
                                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView2 != null) {
                                        i = C35399nuc.StateListAnimator.UfveVb;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout2 != null) {
                                            i = C35399nuc.StateListAnimator.zDGrpR;
                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = C35399nuc.StateListAnimator.QfgJNx;
                                                C54989xbV c54989xbV3 = (C54989xbV) ViewBindings.findChildViewById(view, i);
                                                if (c54989xbV3 != null) {
                                                    return new C33948nLu((ConstraintLayout) view, textView, c54989xbV, c54989xbV2, textView2, imageView, constraintLayout, textView3, imageView2, constraintLayout2, textView4, c54989xbV3);
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
