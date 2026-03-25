package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57370yhD implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.view.View KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.RelativeLayout copydefault;
    public final C55251xgS djBIcL;
    public final android.view.View gEmmrt;
    public final C55251xgS valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public C57370yhD(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull android.view.View view2) {
        this.KWHzl = view;
        this.copydefault = relativeLayout;
        this.EZpvd = textView;
        this.AEQbTJ = imageView;
        this.OLrzqt = imageView2;
        this.AhwBna = textView2;
        this.AYXKKw = textView3;
        this.djBIcL = c55251xgS;
        this.valueOf = c55251xgS2;
        this.gEmmrt = view2;
    }

    public static C57370yhD KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.fIwbmz, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C57370yhD AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C57406yhn.StateListAnimator.DbNXlk;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = C57406yhn.StateListAnimator.hDKMBd;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C57406yhn.StateListAnimator.zsXlph;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C57406yhn.StateListAnimator.zuBGHE;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = C57406yhn.StateListAnimator.fdOvFl;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C57406yhn.StateListAnimator.QDqgQU;
                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = C57406yhn.StateListAnimator.ULRxlR;
                                C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                if (c55251xgS != null) {
                                    i = C57406yhn.StateListAnimator.TarCU;
                                    C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                    if (c55251xgS2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C57406yhn.StateListAnimator.UscePu))) != null) {
                                        return new C57370yhD(view, relativeLayout, textView, imageView, imageView2, textView2, textView3, c55251xgS, c55251xgS2, viewFindChildViewById);
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
