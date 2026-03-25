package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes15.dex */
public final class hAT implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final AppCompatImageView AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final C28067kNr AkhnZx;
    public final android.widget.TextView AuCTel;
    public final ConstraintLayout DbNXlk;
    public final AppCompatImageView EZpvd;
    public final AppCompatImageView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final AppCompatImageView djBIcL;
    public final AppCompatTextView ejfBZ;
    public final AppCompatTextView fARcdN;
    public final C31222lpu fIwbmz;
    public final AppCompatTextView fJNWhG;
    public final kNE fetchVPNInfo;
    public final AppCompatImageView gEmmrt;
    public final LinearLayoutCompat isConnected;
    public final LinearLayoutCompat valueOf;
    public final android.view.View values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.values;
    }

    public hAT(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull AppCompatImageView appCompatImageView4, @androidx.annotation.NonNull AppCompatImageView appCompatImageView5, @androidx.annotation.NonNull AppCompatImageView appCompatImageView6, @androidx.annotation.NonNull AppCompatImageView appCompatImageView7, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull C28067kNr c28067kNr, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull kNE kne, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull C31222lpu c31222lpu) {
        this.values = view;
        this.copydefault = frameLayout;
        this.OLrzqt = appCompatImageView;
        this.KWHzl = appCompatImageView2;
        this.EZpvd = appCompatImageView3;
        this.AEQbTJ = appCompatImageView4;
        this.gEmmrt = appCompatImageView5;
        this.djBIcL = appCompatImageView6;
        this.AYXKKw = appCompatImageView7;
        this.valueOf = linearLayoutCompat;
        this.AhwBna = linearLayoutCompat2;
        this.isConnected = linearLayoutCompat3;
        this.AkhnZx = c28067kNr;
        this.DbNXlk = constraintLayout;
        this.fetchVPNInfo = kne;
        this.AuCTel = textView;
        this.ejfBZ = appCompatTextView;
        this.fARcdN = appCompatTextView2;
        this.fJNWhG = appCompatTextView3;
        this.fIwbmz = c31222lpu;
    }

    public static hAT OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.zSsVtY, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static hAT OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DMb;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C23274hvD.Application.sQOHWT;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C23274hvD.Application.RZOtbZ;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = C23274hvD.Application.UlpNxW;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView3 != null) {
                        i = C23274hvD.Application.UnZVfqExternalSyntheticApiModelOutline0;
                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView4 != null) {
                            i = C23274hvD.Application.GVpNrs;
                            AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView5 != null) {
                                i = C23274hvD.Application.cancelAll;
                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView6 != null) {
                                    i = C23274hvD.Application.MediaBrowserCompatItemReceiver;
                                    AppCompatImageView appCompatImageView7 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatImageView7 != null) {
                                        i = C23274hvD.Application.IMediaControllerCallbackStubProxy;
                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat != null) {
                                            i = C23274hvD.Application.addQueueItemAt;
                                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                            if (linearLayoutCompat2 != null) {
                                                i = C23274hvD.Application.getMetadata;
                                                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                if (linearLayoutCompat3 != null) {
                                                    i = C23274hvD.Application.requestExtraBinder;
                                                    C28067kNr c28067kNr = (C28067kNr) ViewBindings.findChildViewById(view, i);
                                                    if (c28067kNr != null) {
                                                        i = C23274hvD.Application.createItem;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                        if (constraintLayout != null) {
                                                            i = C23274hvD.Application.registerForActivityResultlambda0;
                                                            kNE kne = (kNE) ViewBindings.findChildViewById(view, i);
                                                            if (kne != null) {
                                                                i = C23274hvD.Application.setHomeAsUpIndicator;
                                                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView != null) {
                                                                    i = C23274hvD.Application.generateConfigDelta_colorMode;
                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (appCompatTextView != null) {
                                                                        i = C23274hvD.Application.onInterceptTouchEvent;
                                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (appCompatTextView2 != null) {
                                                                            i = C23274hvD.Application.parseItem;
                                                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (appCompatTextView3 != null) {
                                                                                i = C23274hvD.Application.resetGroup;
                                                                                C31222lpu c31222lpu = (C31222lpu) ViewBindings.findChildViewById(view, i);
                                                                                if (c31222lpu != null) {
                                                                                    return new hAT(view, frameLayout, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, appCompatImageView7, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, c28067kNr, constraintLayout, kne, textView, appCompatTextView, appCompatTextView2, appCompatTextView3, c31222lpu);
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
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
