package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57372yhF implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final RecyclerView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.view.View djBIcL;
    public final RecyclerView gEmmrt;
    public final android.widget.TextView valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.djBIcL;
    }

    public C57372yhF(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout4, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull RecyclerView recyclerView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.djBIcL = view;
        this.AEQbTJ = imageView;
        this.OLrzqt = linearLayout;
        this.EZpvd = linearLayout2;
        this.KWHzl = linearLayout3;
        this.copydefault = linearLayout4;
        this.AYXKKw = recyclerView;
        this.gEmmrt = recyclerView2;
        this.valueOf = textView;
        this.AhwBna = appCompatTextView;
        this.values = appCompatTextView2;
        this.AkhnZx = textView2;
    }

    public static C57372yhF KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.fARcdN, viewGroup);
        return copydefault(viewGroup);
    }

    public static C57372yhF copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.QOLQEE;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C57406yhn.StateListAnimator.fvQaOB;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C57406yhn.StateListAnimator.giSNqX;
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = C57406yhn.StateListAnimator.gasjUx;
                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        i = C57406yhn.StateListAnimator.gGvvIC;
                        android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout4 != null) {
                            i = C57406yhn.StateListAnimator.OBJEWx;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = C57406yhn.StateListAnimator.dHguZz;
                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView2 != null) {
                                    i = C57406yhn.StateListAnimator.htlTjW;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = C57406yhn.StateListAnimator.DGOPHZ;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView != null) {
                                            i = C57406yhn.StateListAnimator.heceqZ;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView2 != null) {
                                                i = C57406yhn.StateListAnimator.Ufzxmz;
                                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    return new C57372yhF(view, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, recyclerView, recyclerView2, textView, appCompatTextView, appCompatTextView2, textView2);
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
