package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rat, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42677rat implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final C40492qXw KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.view.View djBIcL;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.OLrzqt;
    }

    public C42677rat(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C40492qXw c40492qXw, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.view.View view) {
        this.OLrzqt = frameLayout;
        this.KWHzl = c40492qXw;
        this.copydefault = imageView;
        this.AEQbTJ = appCompatTextView;
        this.EZpvd = linearLayout;
        this.gEmmrt = textView;
        this.djBIcL = view;
    }

    public static C42677rat copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = qZH.StateListAnimator.dLBcXg;
        C40492qXw c40492qXw = (C40492qXw) ViewBindings.findChildViewById(view, i);
        if (c40492qXw != null) {
            i = qZH.StateListAnimator.gSBher;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = qZH.StateListAnimator.DSiOMJ;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = qZH.StateListAnimator.DrqXHJ;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = qZH.StateListAnimator.apNKau;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.describeContents))) != null) {
                            return new C42677rat((android.widget.FrameLayout) view, c40492qXw, imageView, appCompatTextView, linearLayout, textView, viewFindChildViewById);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
