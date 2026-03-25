package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rfq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42939rfq implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final android.widget.TextView AkhnZx;
    public final AppCompatTextView DbNXlk;
    public final LinearLayoutCompat EZpvd;
    public final wYX KWHzl;
    public final wYX OLrzqt;
    public final Group copydefault;
    public final AppCompatTextView djBIcL;
    public final AppCompatTextView fetchVPNInfo;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView isConnected;
    public final android.view.View valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.valueOf;
    }

    public C42939rfq(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull wYX wyx, @androidx.annotation.NonNull wYX wyx2, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6) {
        this.valueOf = view;
        this.OLrzqt = wyx;
        this.KWHzl = wyx2;
        this.copydefault = group;
        this.AEQbTJ = appCompatImageView;
        this.EZpvd = linearLayoutCompat;
        this.AhwBna = linearLayoutCompat2;
        this.AYXKKw = linearLayoutCompat3;
        this.gEmmrt = appCompatTextView;
        this.djBIcL = appCompatTextView2;
        this.AkhnZx = textView;
        this.fetchVPNInfo = appCompatTextView3;
        this.DbNXlk = appCompatTextView4;
        this.values = appCompatTextView5;
        this.isConnected = appCompatTextView6;
    }

    public static C42939rfq AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.gCZUJG, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C42939rfq OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.fERRXa;
        wYX wyx = (wYX) ViewBindings.findChildViewById(view, i);
        if (wyx != null) {
            i = qZH.StateListAnimator.htlTjW;
            wYX wyx2 = (wYX) ViewBindings.findChildViewById(view, i);
            if (wyx2 != null) {
                i = qZH.StateListAnimator.DGUQLIOvDItG;
                Group group = (Group) ViewBindings.findChildViewById(view, i);
                if (group != null) {
                    i = qZH.StateListAnimator.zDGrpR;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null) {
                        i = qZH.StateListAnimator.fdt;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            i = qZH.StateListAnimator.setPageName;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat2 != null) {
                                i = qZH.StateListAnimator.dlRikr;
                                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat3 != null) {
                                    i = qZH.StateListAnimator.sanitizeSessionIdIgnoreCase;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView != null) {
                                        i = qZH.StateListAnimator.validateAndPutInMap;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView2 != null) {
                                            i = qZH.StateListAnimator.onPostMessage;
                                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                i = qZH.StateListAnimator.connect;
                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView3 != null) {
                                                    i = qZH.StateListAnimator.getExtras;
                                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView4 != null) {
                                                        i = qZH.StateListAnimator.getServiceComponent;
                                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView5 != null) {
                                                            i = qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi213;
                                                            AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatTextView6 != null) {
                                                                return new C42939rfq(view, wyx, wyx2, group, appCompatImageView, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, appCompatTextView, appCompatTextView2, textView, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6);
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
