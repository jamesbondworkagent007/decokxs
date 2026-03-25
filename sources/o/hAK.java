package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hAK implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final LinearLayoutCompat AkhnZx;
    public final android.widget.LinearLayout DbNXlk;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.HorizontalScrollView OLrzqt;
    public final android.view.View copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final android.widget.TextView fARcdN;
    public final android.widget.TextView fJNWhG;
    public final android.widget.LinearLayout fetchVPNInfo;
    public final android.widget.ImageView gEmmrt;
    public final android.widget.LinearLayout isConnected;
    public final C23508hzZ valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AkhnZx;
    }

    public hAK(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.HorizontalScrollView horizontalScrollView, @androidx.annotation.NonNull C23508hzZ c23508hzZ, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout4, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout5, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout6, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.AkhnZx = linearLayoutCompat;
        this.EZpvd = frameLayout;
        this.copydefault = view;
        this.AEQbTJ = linearLayout;
        this.KWHzl = frameLayout2;
        this.OLrzqt = horizontalScrollView;
        this.valueOf = c23508hzZ;
        this.AYXKKw = imageView;
        this.gEmmrt = imageView2;
        this.djBIcL = linearLayout2;
        this.AhwBna = linearLayout3;
        this.isConnected = linearLayout4;
        this.DbNXlk = linearLayout5;
        this.fetchVPNInfo = linearLayout6;
        this.values = textView;
        this.fARcdN = textView2;
        this.fJNWhG = textView3;
    }

    public static hAK EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.zqTOFw, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static hAK copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C23274hvD.Application.Hx;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.dNxZaP))) != null) {
            i = C23274hvD.Application.RZMhtF;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C23274hvD.Application.iMXFZQ;
                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = C23274hvD.Application.QYvkLl;
                    android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                    if (horizontalScrollView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.SePrCP))) != null) {
                        C23508hzZ c23508hzZEZpvd = C23508hzZ.EZpvd(viewFindChildViewById2);
                        i = C23274hvD.Application.zNQIcI;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C23274hvD.Application.arDRxL;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = C23274hvD.Application.getTag;
                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = C23274hvD.Application.binderDied;
                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout3 != null) {
                                        i = C23274hvD.Application.MediaControllerCompatMediaControllerImplBase;
                                        android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout4 != null) {
                                            i = C23274hvD.Application.skipToNext;
                                            android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout5 != null) {
                                                i = C23274hvD.Application.findOwner;
                                                android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout6 != null) {
                                                    i = C23274hvD.Application.setDrawerIndicatorEnabled;
                                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView != null) {
                                                        i = C23274hvD.Application.ActionBarDrawerToggle1;
                                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView2 != null) {
                                                            i = C23274hvD.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl;
                                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView3 != null) {
                                                                return new hAK((LinearLayoutCompat) view, frameLayout, viewFindChildViewById, linearLayout, frameLayout2, horizontalScrollView, c23508hzZEZpvd, imageView, imageView2, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, textView, textView2, textView3);
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
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
