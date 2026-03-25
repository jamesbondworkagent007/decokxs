package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import o.qZH;

/* JADX INFO: renamed from: o.ram, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42670ram implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C42963rgN AhwBna;
    public final AppCompatTextView AkhnZx;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final C42920rfX copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final FlexboxLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public C42670ram(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C42920rfX c42920rfX, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull FlexboxLayout flexboxLayout, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull C42963rgN c42963rgN, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.EZpvd = linearLayout;
        this.KWHzl = linearLayout2;
        this.OLrzqt = imageView;
        this.AEQbTJ = linearLayoutCompat;
        this.copydefault = c42920rfX;
        this.gEmmrt = textView;
        this.AYXKKw = textView2;
        this.valueOf = flexboxLayout;
        this.djBIcL = textView3;
        this.AhwBna = c42963rgN;
        this.AkhnZx = appCompatTextView;
    }

    public static C42670ram copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.fZBcTu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C42670ram EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
        int i = qZH.StateListAnimator.fVjYLc;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = qZH.StateListAnimator.OrsvgJ;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = qZH.StateListAnimator.RgaQzq;
                C42920rfX c42920rfX = (C42920rfX) ViewBindings.findChildViewById(view, i);
                if (c42920rfX != null) {
                    i = qZH.StateListAnimator.dHAKvv;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = qZH.StateListAnimator.DbvGUJ;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = qZH.StateListAnimator.ZxnNGp;
                            FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i);
                            if (flexboxLayout != null) {
                                i = qZH.StateListAnimator.DhEJvI;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = qZH.StateListAnimator.onTransact;
                                    C42963rgN c42963rgN = (C42963rgN) ViewBindings.findChildViewById(view, i);
                                    if (c42963rgN != null) {
                                        i = qZH.StateListAnimator.readTypedObject;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView != null) {
                                            return new C42670ram(linearLayout, linearLayout, imageView, linearLayoutCompat, c42920rfX, textView, textView2, flexboxLayout, textView3, c42963rgN, appCompatTextView);
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
