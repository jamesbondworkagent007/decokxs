package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57446yia implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.ImageView EZpvd;
    public final C55251xgS KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final C55251xgS copydefault;
    public final android.widget.TextView djBIcL;
    public final C57479yjG gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C57446yia(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull C57479yjG c57479yjG, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.AEQbTJ = view;
        this.OLrzqt = imageView;
        this.EZpvd = imageView2;
        this.KWHzl = c55251xgS;
        this.copydefault = c55251xgS2;
        this.gEmmrt = c57479yjG;
        this.AYXKKw = textView;
        this.AhwBna = textView2;
        this.valueOf = textView3;
        this.djBIcL = textView4;
    }

    public static C57446yia EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.OcIXYQ, viewGroup);
        return copydefault(viewGroup);
    }

    public static C57446yia copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.RJOkX;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C57406yhn.StateListAnimator.QVAiDq;
            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C57406yhn.StateListAnimator.dmfpNf;
                C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                if (c55251xgS != null) {
                    i = C57406yhn.StateListAnimator.OFhtUX;
                    C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                    if (c55251xgS2 != null) {
                        i = C57406yhn.StateListAnimator.call;
                        C57479yjG c57479yjG = (C57479yjG) ViewBindings.findChildViewById(view, i);
                        if (c57479yjG != null) {
                            i = C57406yhn.StateListAnimator.fHqPtx;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C57406yhn.StateListAnimator.DWgRXt;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = C57406yhn.StateListAnimator.OTwTPd;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = C57406yhn.StateListAnimator.Ufzxmz;
                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            return new C57446yia(view, imageView, imageView2, c55251xgS, c55251xgS2, c57479yjG, textView, textView2, textView3, textView4);
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
