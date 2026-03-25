package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C34764nic;

/* JADX INFO: renamed from: o.nik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34772nik implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final ConstraintLayout AhwBna;
    public final ConstraintLayout EZpvd;
    public final wYC KWHzl;
    public final C52794wYp OLrzqt;
    public final android.widget.TextView copydefault;
    public final ConstraintLayout djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.ImageView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public C34772nik(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3) {
        this.AhwBna = constraintLayout;
        this.AEQbTJ = linearLayout;
        this.KWHzl = wyc;
        this.EZpvd = constraintLayout2;
        this.OLrzqt = c52794wYp;
        this.copydefault = textView;
        this.valueOf = imageView;
        this.gEmmrt = textView2;
        this.djBIcL = constraintLayout3;
    }

    public static C34772nik OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C34764nic.Activity.copydefault, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C34772nik copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C34764nic.Application.OLrzqt;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C34764nic.Application.KWHzl;
            wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
            if (wyc != null) {
                i = C34764nic.Application.EZpvd;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C34764nic.Application.copydefault;
                    C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                    if (c52794wYp != null) {
                        i = C34764nic.Application.AEQbTJ;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C34764nic.Application.AYXKKw;
                            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = C34764nic.Application.djBIcL;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = C34764nic.Application.gEmmrt;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout2 != null) {
                                        return new C34772nik((ConstraintLayout) view, linearLayout, wyc, constraintLayout, c52794wYp, textView, imageView, textView2, constraintLayout2);
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
