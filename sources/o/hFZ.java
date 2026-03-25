package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hFZ implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final RecyclerView AhwBna;
    public final C55320xhi AkhnZx;
    public final C55008xbo EZpvd;
    public final AppCompatImageView KWHzl;
    public final C55008xbo OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final AppCompatTextView djBIcL;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView isConnected;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AYXKKw;
    }

    public hFZ(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C55008xbo c55008xbo, @androidx.annotation.NonNull C55008xbo c55008xbo2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull C55320xhi c55320xhi) {
        this.AYXKKw = linearLayout;
        this.AEQbTJ = linearLayout2;
        this.OLrzqt = c55008xbo;
        this.EZpvd = c55008xbo2;
        this.copydefault = linearLayout3;
        this.KWHzl = appCompatImageView;
        this.AhwBna = recyclerView;
        this.valueOf = appCompatTextView;
        this.gEmmrt = appCompatTextView2;
        this.djBIcL = appCompatTextView3;
        this.isConnected = appCompatTextView4;
        this.AkhnZx = c55320xhi;
    }

    public static hFZ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.QfZsXX, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hFZ EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.GiPPlLRPuVlr;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C23274hvD.Application.unregister;
            C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
            if (c55008xbo != null) {
                i = C23274hvD.Application.OKSWiw;
                C55008xbo c55008xbo2 = (C55008xbo) ViewBindings.findChildViewById(view, i);
                if (c55008xbo2 != null) {
                    i = C23274hvD.Application.IKQXqd;
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = C23274hvD.Application.DjzMc;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView != null) {
                            i = C23274hvD.Application.ComponentActivityReportFullyDrawnExecutorApi1;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = C23274hvD.Application.selectContentView;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    i = C23274hvD.Application.onScroll;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView2 != null) {
                                        i = C23274hvD.Application.createImageView;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView3 != null) {
                                            i = C23274hvD.Application.createRatingBar;
                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView4 != null) {
                                                i = C23274hvD.Application.parseItem;
                                                C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
                                                if (c55320xhi != null) {
                                                    return new hFZ((android.widget.LinearLayout) view, linearLayout, c55008xbo, c55008xbo2, linearLayout2, appCompatImageView, recyclerView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, c55320xhi);
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
