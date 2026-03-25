package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iLy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23858iLy implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final LinearLayoutCompat EZpvd;
    public final C27382juD KWHzl;
    public final C27382juD OLrzqt;
    public final C27424jut copydefault;
    public final LinearLayoutCompat djBIcL;
    public final android.widget.FrameLayout gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.gEmmrt;
    }

    public C23858iLy(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C27424jut c27424jut, @androidx.annotation.NonNull C27382juD c27382juD, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull C27382juD c27382juD2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.gEmmrt = frameLayout;
        this.copydefault = c27424jut;
        this.OLrzqt = c27382juD;
        this.AEQbTJ = frameLayout2;
        this.KWHzl = c27382juD2;
        this.EZpvd = linearLayoutCompat;
        this.djBIcL = linearLayoutCompat2;
        this.AhwBna = textView;
        this.AYXKKw = textView2;
        this.valueOf = textView3;
    }

    public static C23858iLy copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.DLGVGj, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C23858iLy EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.QbewEr;
        C27424jut c27424jut = (C27424jut) ViewBindings.findChildViewById(view, i);
        if (c27424jut != null) {
            i = C25493ixk.ActionBar.dmfpNf;
            C27382juD c27382juD = (C27382juD) ViewBindings.findChildViewById(view, i);
            if (c27382juD != null) {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
                i = C25493ixk.ActionBar.hcetpZ;
                C27382juD c27382juD2 = (C27382juD) ViewBindings.findChildViewById(view, i);
                if (c27382juD2 != null) {
                    i = C25493ixk.ActionBar.HJWChPURsaBn;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = C25493ixk.ActionBar.HJWChPRGtXKC;
                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat2 != null) {
                            i = C25493ixk.ActionBar.zLnOGN;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C25493ixk.ActionBar.onItemLoaded;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = C25493ixk.ActionBar.MediaBrowserCompatItemCallback;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        return new C23858iLy(frameLayout, c27424jut, c27382juD, frameLayout, c27382juD2, linearLayoutCompat, linearLayoutCompat2, textView, textView2, textView3);
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
