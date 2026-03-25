package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21664hHt implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C55254xgV EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final C57597ylS copydefault;
    public final ViewPager2 gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.OLrzqt;
    }

    public C21664hHt(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C57597ylS c57597ylS, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.OLrzqt = frameLayout;
        this.copydefault = c57597ylS;
        this.AEQbTJ = linearLayout;
        this.KWHzl = imageView;
        this.EZpvd = c55254xgV;
        this.AYXKKw = textView;
        this.gEmmrt = viewPager2;
    }

    public static C21664hHt EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.values;
        C57597ylS c57597ylS = (C57597ylS) ViewBindings.findChildViewById(view, i);
        if (c57597ylS != null) {
            i = C23274hvD.Application.zdxASf;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C23274hvD.Application.sendRequest;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C23274hvD.Application.getData;
                    C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
                    if (c55254xgV != null) {
                        i = C23274hvD.Application.createCheckBox;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C23274hvD.Application.getIntent;
                            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                            if (viewPager2 != null) {
                                return new C21664hHt((android.widget.FrameLayout) view, c57597ylS, linearLayout, imageView, c55254xgV, textView, viewPager2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
