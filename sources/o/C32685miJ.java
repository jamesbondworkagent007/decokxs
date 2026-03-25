package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C32726miy;

/* JADX INFO: renamed from: o.miJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32685miJ implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final ConstraintLayout AhwBna;
    public final C52794wYp EZpvd;
    public final wYK KWHzl;
    public final wYF OLrzqt;
    public final wYK copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.ImageView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public C32685miJ(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull wYK wyk2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AhwBna = constraintLayout;
        this.EZpvd = c52794wYp;
        this.OLrzqt = wyf;
        this.AEQbTJ = constraintLayout2;
        this.KWHzl = wyk;
        this.copydefault = wyk2;
        this.gEmmrt = imageView;
        this.valueOf = textView;
        this.djBIcL = textView2;
    }

    public static C32685miJ AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C32726miy.ActionBar.KWHzl, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C32685miJ AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C32726miy.Activity.KWHzl;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C32726miy.Activity.gEmmrt;
            wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
            if (wyf != null) {
                i = C32726miy.Activity.AYXKKw;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C32726miy.Activity.valueOf;
                    wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
                    if (wyk != null) {
                        i = C32726miy.Activity.djBIcL;
                        wYK wyk2 = (wYK) ViewBindings.findChildViewById(view, i);
                        if (wyk2 != null) {
                            i = C32726miy.Activity.DbNXlk;
                            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = C32726miy.Activity.RJOkX;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = C32726miy.Activity.QUSxYX;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        return new C32685miJ((ConstraintLayout) view, c52794wYp, wyf, constraintLayout, wyk, wyk2, imageView, textView, textView2);
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
