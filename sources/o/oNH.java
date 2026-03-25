package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes18.dex */
public final class oNH implements ViewBinding {
    public final C32246mUx AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final C32247mUy AkhnZx;
    public final ConstraintLayout EZpvd;
    public final C34546neC KWHzl;
    public final ConstraintLayout OLrzqt;
    public final AppCompatTextView copydefault;
    public final AppCompatTextView djBIcL;
    public final C32247mUy fetchVPNInfo;
    public final C32247mUy gEmmrt;
    public final C32247mUy isConnected;
    public final C32247mUy valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public oNH(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C32246mUx c32246mUx, @androidx.annotation.NonNull C34546neC c34546neC, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C32247mUy c32247mUy, @androidx.annotation.NonNull C32247mUy c32247mUy2, @androidx.annotation.NonNull C32247mUy c32247mUy3, @androidx.annotation.NonNull C32247mUy c32247mUy4, @androidx.annotation.NonNull C32247mUy c32247mUy5) {
        this.EZpvd = constraintLayout;
        this.OLrzqt = constraintLayout2;
        this.AEQbTJ = c32246mUx;
        this.KWHzl = c34546neC;
        this.copydefault = appCompatTextView;
        this.AhwBna = appCompatTextView2;
        this.djBIcL = appCompatTextView3;
        this.AYXKKw = textView;
        this.valueOf = c32247mUy;
        this.gEmmrt = c32247mUy2;
        this.AkhnZx = c32247mUy3;
        this.isConnected = c32247mUy4;
        this.fetchVPNInfo = c32247mUy5;
    }

    public static oNH KWHzl(@androidx.annotation.NonNull android.view.View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C35964oKf.StateListAnimator.vLaW;
        C32246mUx c32246mUx = (C32246mUx) ViewBindings.findChildViewById(view, i);
        if (c32246mUx != null) {
            i = C35964oKf.StateListAnimator.dzkkkq;
            C34546neC c34546neC = (C34546neC) ViewBindings.findChildViewById(view, i);
            if (c34546neC != null) {
                i = C35964oKf.StateListAnimator.putBitmap;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = C35964oKf.StateListAnimator.setRepeatMode;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        i = C35964oKf.StateListAnimator.setMediaButtonReceiver;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView3 != null) {
                            i = C35964oKf.StateListAnimator.setFlags;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C35964oKf.StateListAnimator.onRemoveQueueItem;
                                C32247mUy c32247mUy = (C32247mUy) ViewBindings.findChildViewById(view, i);
                                if (c32247mUy != null) {
                                    i = C35964oKf.StateListAnimator.setSessionImpl;
                                    C32247mUy c32247mUy2 = (C32247mUy) ViewBindings.findChildViewById(view, i);
                                    if (c32247mUy2 != null) {
                                        i = C35964oKf.StateListAnimator.onSkipToPrevious;
                                        C32247mUy c32247mUy3 = (C32247mUy) ViewBindings.findChildViewById(view, i);
                                        if (c32247mUy3 != null) {
                                            i = C35964oKf.StateListAnimator.setRccState;
                                            C32247mUy c32247mUy4 = (C32247mUy) ViewBindings.findChildViewById(view, i);
                                            if (c32247mUy4 != null) {
                                                i = C35964oKf.StateListAnimator.getRccTransportControlFlagsFromActions;
                                                C32247mUy c32247mUy5 = (C32247mUy) ViewBindings.findChildViewById(view, i);
                                                if (c32247mUy5 != null) {
                                                    return new oNH(constraintLayout, constraintLayout, c32246mUx, c34546neC, appCompatTextView, appCompatTextView2, appCompatTextView3, textView, c32247mUy, c32247mUy2, c32247mUy3, c32247mUy4, c32247mUy5);
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
