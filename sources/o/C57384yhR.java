package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57384yhR implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final android.widget.ImageView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C57384yhR(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.AEQbTJ = view;
        this.EZpvd = imageView;
        this.OLrzqt = imageView2;
        this.copydefault = imageView3;
        this.KWHzl = textView;
        this.AhwBna = textView2;
        this.valueOf = textView3;
        this.gEmmrt = textView4;
    }

    public static C57384yhR AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.zLjUOn, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C57384yhR KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.RJOkX;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C57406yhn.StateListAnimator.dvKsVJ;
            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C57406yhn.StateListAnimator.dxcTrN;
                android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = C57406yhn.StateListAnimator.QXDzTk;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C57406yhn.StateListAnimator.RKcVTr;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C57406yhn.StateListAnimator.Ufzxmz;
                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = C57406yhn.StateListAnimator.RXzakW;
                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    return new C57384yhR(view, imageView, imageView2, imageView3, textView, textView2, textView3, textView4);
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
