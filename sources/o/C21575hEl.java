package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hEl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21575hEl implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final AppCompatImageView AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final AppCompatTextView AkhnZx;
    public final wYF EZpvd;
    public final C55173xeu KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final AppCompatImageView copydefault;
    public final LinearLayoutCompat djBIcL;
    public final C55244xgL fetchVPNInfo;
    public final AppCompatImageView gEmmrt;
    public final ViewPager2 valueOf;
    public final android.view.View values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.djBIcL;
    }

    public C21575hEl(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.djBIcL = linearLayoutCompat;
        this.EZpvd = wyf;
        this.OLrzqt = linearLayoutCompat2;
        this.AEQbTJ = view;
        this.KWHzl = c55173xeu;
        this.copydefault = appCompatImageView;
        this.AYXKKw = appCompatImageView2;
        this.gEmmrt = appCompatImageView3;
        this.AhwBna = linearLayoutCompat3;
        this.valueOf = viewPager2;
        this.values = view2;
        this.fetchVPNInfo = c55244xgL;
        this.AkhnZx = appCompatTextView;
    }

    public static C21575hEl AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C23274hvD.Application.alsFma;
        wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
        if (wyf != null) {
            i = C23274hvD.Application.fbC;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.hGuIrQ))) != null) {
                i = C23274hvD.Application.gdLjtZ;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = C23274hvD.Application.shErWi;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null) {
                        i = C23274hvD.Application.sGvRiA;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView2 != null) {
                            i = C23274hvD.Application.gezFCt;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView3 != null) {
                                i = C23274hvD.Application.putBitmap;
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat2 != null) {
                                    i = C23274hvD.Application.MediaSessionCompatToken1;
                                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                    if (viewPager2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.setContentdefault))) != null) {
                                        i = C23274hvD.Application.clearAvailableContext;
                                        C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
                                        if (c55244xgL != null) {
                                            i = C23274hvD.Application.getIntrinsicHeight;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView != null) {
                                                return new C21575hEl((LinearLayoutCompat) view, wyf, linearLayoutCompat, viewFindChildViewById, c55173xeu, appCompatImageView, appCompatImageView2, appCompatImageView3, linearLayoutCompat2, viewPager2, viewFindChildViewById2, c55244xgL, appCompatTextView);
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
