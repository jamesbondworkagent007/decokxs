package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54947xag implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.view.View AYXKKw;
    public final C52794wYp AhwBna;
    public final android.widget.ImageView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.widget.ImageView djBIcL;
    public final C52794wYp gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AYXKKw;
    }

    public C54947xag(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.ImageView imageView2) {
        this.AYXKKw = view;
        this.KWHzl = linearLayout;
        this.AEQbTJ = linearLayout2;
        this.EZpvd = imageView;
        this.copydefault = linearLayout3;
        this.OLrzqt = textView;
        this.AhwBna = c52794wYp;
        this.gEmmrt = c52794wYp2;
        this.valueOf = textView2;
        this.djBIcL = imageView2;
    }

    public static C54947xag copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C52761wXj.Fragment.zLjUOn, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C54947xag KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.gHZMYf;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C52761wXj.FragmentManager.QKudOq;
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = C52761wXj.FragmentManager.DAIeex;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C52761wXj.FragmentManager.Dmq;
                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        i = C52761wXj.FragmentManager.DcqEDu;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C52761wXj.FragmentManager.RVsVBY;
                            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                            if (c52794wYp != null) {
                                i = C52761wXj.FragmentManager.zhUgOk;
                                C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                                if (c52794wYp2 != null) {
                                    i = C52761wXj.FragmentManager.aJZHYI;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = C52761wXj.FragmentManager.RbVjfb;
                                        android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView2 != null) {
                                            return new C54947xag(view, linearLayout, linearLayout2, imageView, linearLayout3, textView, c52794wYp, c52794wYp2, textView2, imageView2);
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
