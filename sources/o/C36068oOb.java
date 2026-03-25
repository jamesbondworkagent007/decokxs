package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oOb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36068oOb implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.view.View AhwBna;
    public final AppCompatImageView AkhnZx;
    public final AppCompatTextView DbNXlk;
    public final AppCompatImageView EZpvd;
    public final C32243mUu KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final AppCompatTextView fetchVPNInfo;
    public final LinearLayoutCompat gEmmrt;
    public final AppCompatTextView isConnected;
    public final LinearLayoutCompat valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AhwBna;
    }

    public C36068oOb(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull C32243mUu c32243mUu, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatImageView appCompatImageView4) {
        this.AhwBna = view;
        this.OLrzqt = appCompatImageView;
        this.copydefault = appCompatImageView2;
        this.EZpvd = appCompatImageView3;
        this.KWHzl = c32243mUu;
        this.AEQbTJ = linearLayoutCompat;
        this.gEmmrt = linearLayoutCompat2;
        this.valueOf = linearLayoutCompat3;
        this.AYXKKw = constraintLayout;
        this.djBIcL = textView;
        this.isConnected = appCompatTextView;
        this.DbNXlk = appCompatTextView2;
        this.fetchVPNInfo = appCompatTextView3;
        this.AkhnZx = appCompatImageView4;
    }

    public static C36068oOb OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C35964oKf.Application.apNbdB, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C36068oOb OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.getFieldNames;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C35964oKf.StateListAnimator.hdpuIA;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                i = C35964oKf.StateListAnimator.hNurIN;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView3 != null) {
                    i = C35964oKf.StateListAnimator.ORWKdN;
                    C32243mUu c32243mUu = (C32243mUu) ViewBindings.findChildViewById(view, i);
                    if (c32243mUu != null) {
                        i = C35964oKf.StateListAnimator.HrMTQN;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            i = C35964oKf.StateListAnimator.onProviderDisabled;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat2 != null) {
                                i = C35964oKf.StateListAnimator.onStatusChanged;
                                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat3 != null) {
                                    i = C35964oKf.StateListAnimator.ZaDspl;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = C35964oKf.StateListAnimator.getText;
                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            i = C35964oKf.StateListAnimator.setShuffleMode;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView != null) {
                                                i = C35964oKf.StateListAnimator.IMediaSessionStub;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView2 != null) {
                                                    i = C35964oKf.StateListAnimator.getVolumeControl;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView3 != null) {
                                                        i = C35964oKf.StateListAnimator.onPause;
                                                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatImageView4 != null) {
                                                            return new C36068oOb(view, appCompatImageView, appCompatImageView2, appCompatImageView3, c32243mUu, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, constraintLayout, textView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatImageView4);
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
