package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42779rcp implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C49352umt AYXKKw;
    public final android.widget.TextView AhwBna;
    public final AppCompatImageView AkhnZx;
    public final android.widget.LinearLayout DbNXlk;
    public final Group EZpvd;
    public final AppCompatTextView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatImageView copydefault;
    public final android.widget.FrameLayout djBIcL;
    public final AppCompatTextView fetchVPNInfo;
    public final AppCompatImageView gEmmrt;
    public final android.widget.TextView isConnected;
    public final jIR valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.djBIcL;
    }

    public C42779rcp(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull C49352umt c49352umt, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull jIR jir, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView4, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout) {
        this.djBIcL = frameLayout;
        this.OLrzqt = appCompatImageView;
        this.AEQbTJ = constraintLayout;
        this.EZpvd = group;
        this.copydefault = appCompatImageView2;
        this.KWHzl = appCompatTextView;
        this.AYXKKw = c49352umt;
        this.gEmmrt = appCompatImageView3;
        this.valueOf = jir;
        this.AhwBna = textView;
        this.isConnected = textView2;
        this.fetchVPNInfo = appCompatTextView2;
        this.AkhnZx = appCompatImageView4;
        this.values = textView3;
        this.DbNXlk = linearLayout;
    }

    public static C42779rcp OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.AxsJAYaxsJAY;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = qZH.StateListAnimator.dvImUD;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = qZH.StateListAnimator.DPHsZd;
                Group group = (Group) ViewBindings.findChildViewById(view, i);
                if (group != null) {
                    i = qZH.StateListAnimator.DPHNDa;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView2 != null) {
                        i = qZH.StateListAnimator.DPhTBN;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            i = qZH.StateListAnimator.RqmePg;
                            C49352umt c49352umt = (C49352umt) ViewBindings.findChildViewById(view, i);
                            if (c49352umt != null) {
                                i = qZH.StateListAnimator.DcMfJKDCKfqP;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView3 != null) {
                                    i = qZH.StateListAnimator.sanrWj;
                                    jIR jir = (jIR) ViewBindings.findChildViewById(view, i);
                                    if (jir != null) {
                                        i = qZH.StateListAnimator.ITrustedWebActivityCallback;
                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            i = qZH.StateListAnimator.onError;
                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView2 != null) {
                                                i = qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi215;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView2 != null) {
                                                    i = qZH.StateListAnimator.MediaBrowserCompatSearchResultReceiver;
                                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatImageView4 != null) {
                                                        i = qZH.StateListAnimator.MediaBrowserCompatSearchCallback;
                                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView3 != null) {
                                                            i = qZH.StateListAnimator.newArray;
                                                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayout != null) {
                                                                return new C42779rcp((android.widget.FrameLayout) view, appCompatImageView, constraintLayout, group, appCompatImageView2, appCompatTextView, c49352umt, appCompatImageView3, jir, textView, textView2, appCompatTextView2, appCompatImageView4, textView3, linearLayout);
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
