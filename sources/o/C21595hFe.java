package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hFe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21595hFe implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final ViewPager2 AYXKKw;
    public final AppCompatImageView AhwBna;
    public final C29629kxJ EZpvd;
    public final OKAlertBanner KWHzl;
    public final AppCompatImageView OLrzqt;
    public final OKAlertBanner copydefault;
    public final C55254xgV djBIcL;
    public final LinearLayoutCompat gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.gEmmrt;
    }

    public C21595hFe(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull OKAlertBanner oKAlertBanner, @androidx.annotation.NonNull OKAlertBanner oKAlertBanner2, @androidx.annotation.NonNull C29629kxJ c29629kxJ, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.gEmmrt = linearLayoutCompat;
        this.KWHzl = oKAlertBanner;
        this.copydefault = oKAlertBanner2;
        this.EZpvd = c29629kxJ;
        this.AEQbTJ = appCompatImageView;
        this.OLrzqt = appCompatImageView2;
        this.AhwBna = appCompatImageView3;
        this.djBIcL = c55254xgV;
        this.valueOf = textView;
        this.AYXKKw = viewPager2;
    }

    public static C21595hFe copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.zFtALg, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21595hFe KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.OqFWZa;
        OKAlertBanner oKAlertBanner = (OKAlertBanner) ViewBindings.findChildViewById(view, i);
        if (oKAlertBanner != null) {
            i = C23274hvD.Application.zuWLRA;
            OKAlertBanner oKAlertBanner2 = (OKAlertBanner) ViewBindings.findChildViewById(view, i);
            if (oKAlertBanner2 != null) {
                i = C23274hvD.Application.UCQKYV;
                C29629kxJ c29629kxJ = (C29629kxJ) ViewBindings.findChildViewById(view, i);
                if (c29629kxJ != null) {
                    i = C23274hvD.Application.UnZVfq;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null) {
                        i = C23274hvD.Application.onTransact;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView2 != null) {
                            i = C23274hvD.Application.getRccTransportControlFlagsFromActions;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView3 != null) {
                                i = C23274hvD.Application.invokeSuspendlambda0;
                                C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
                                if (c55254xgV != null) {
                                    i = C23274hvD.Application.parseItem;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = C23274hvD.Application.getShortcut;
                                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                        if (viewPager2 != null) {
                                            return new C21595hFe((LinearLayoutCompat) view, oKAlertBanner, oKAlertBanner2, c29629kxJ, appCompatImageView, appCompatImageView2, appCompatImageView3, c55254xgV, textView, viewPager2);
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
