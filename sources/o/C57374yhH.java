package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57374yhH implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.view.View AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final C55251xgS AkhnZx;
    public final android.view.View EZpvd;
    public final android.widget.ImageView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.ImageView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public final android.widget.TextView valueOf;
    public final android.view.View values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AYXKKw;
    }

    public C57374yhH(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.ImageView imageView4, @androidx.annotation.NonNull android.widget.ImageView imageView5, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull android.view.View view3) {
        this.AYXKKw = view;
        this.OLrzqt = constraintLayout;
        this.EZpvd = view2;
        this.AEQbTJ = imageView;
        this.copydefault = imageView2;
        this.KWHzl = imageView3;
        this.AhwBna = imageView4;
        this.djBIcL = imageView5;
        this.gEmmrt = linearLayout;
        this.valueOf = textView;
        this.fetchVPNInfo = textView2;
        this.AkhnZx = c55251xgS;
        this.values = view3;
    }

    public static C57374yhH EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.getFieldNames, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C57374yhH OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C57406yhn.StateListAnimator.fetchVPNInfo;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C57406yhn.StateListAnimator.getNewProxyInstance))) != null) {
            i = C57406yhn.StateListAnimator.zsXlph;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C57406yhn.StateListAnimator.AubY;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C57406yhn.StateListAnimator.ORxRYg;
                    android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = C57406yhn.StateListAnimator.QUSxYX;
                        android.widget.ImageView imageView4 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView4 != null) {
                            i = C57406yhn.StateListAnimator.QfsBiF;
                            android.widget.ImageView imageView5 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView5 != null) {
                                i = C57406yhn.StateListAnimator.accept;
                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = C57406yhn.StateListAnimator.Dmq;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = C57406yhn.StateListAnimator.spnCvw;
                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = C57406yhn.StateListAnimator.RVsVBY;
                                            C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                            if (c55251xgS != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C57406yhn.StateListAnimator.fXHmeK))) != null) {
                                                return new C57374yhH(view, constraintLayout, viewFindChildViewById, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, textView, textView2, c55251xgS, viewFindChildViewById2);
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
