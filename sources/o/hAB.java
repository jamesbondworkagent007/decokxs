package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hAB implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final C55251xgS AkhnZx;
    public final AppCompatTextView AuCTel;
    public final C55251xgS DbNXlk;
    public final android.widget.ImageView EZpvd;
    public final ConstraintLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.ImageView copydefault;
    public final C55251xgS djBIcL;
    public final AppCompatTextView ejfBZ;
    public final C52794wYp fARcdN;
    public final android.widget.TextView fIwbmz;
    public final C55251xgS fJNWhG;
    public final C55251xgS fetchVPNInfo;
    public final LinearLayoutCompat gEmmrt;
    public final C55251xgS isConnected;
    public final ConstraintLayout valueOf;
    public final C55251xgS values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public hAB(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull C55251xgS c55251xgS3, @androidx.annotation.NonNull C55251xgS c55251xgS4, @androidx.annotation.NonNull C55251xgS c55251xgS5, @androidx.annotation.NonNull C55251xgS c55251xgS6, @androidx.annotation.NonNull C55251xgS c55251xgS7, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.valueOf = constraintLayout;
        this.OLrzqt = constraintLayout2;
        this.KWHzl = constraintLayout3;
        this.EZpvd = imageView;
        this.AEQbTJ = imageView2;
        this.copydefault = imageView3;
        this.gEmmrt = linearLayoutCompat;
        this.AYXKKw = linearLayoutCompat2;
        this.AhwBna = linearLayoutCompat3;
        this.djBIcL = c55251xgS;
        this.isConnected = c55251xgS2;
        this.AkhnZx = c55251xgS3;
        this.fetchVPNInfo = c55251xgS4;
        this.DbNXlk = c55251xgS5;
        this.values = c55251xgS6;
        this.fJNWhG = c55251xgS7;
        this.fIwbmz = textView;
        this.ejfBZ = appCompatTextView;
        this.fARcdN = c52794wYp;
        this.AuCTel = appCompatTextView2;
    }

    public static hAB EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.swzYdv, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static hAB OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C23274hvD.Application.OAjjVP;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout2 != null) {
            i = C23274hvD.Application.hQkvHM;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C23274hvD.Application.newSessionWithExtras;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C23274hvD.Application.onReceiveResult;
                    android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = C23274hvD.Application.adjustVolume;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            i = C23274hvD.Application.MediaControllerCompatMediaControllerImplApi24;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat2 != null) {
                                i = C23274hvD.Application.MediaSessionCompatApi21;
                                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat3 != null) {
                                    i = C23274hvD.Application.ContextAware;
                                    C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                    if (c55251xgS != null) {
                                        i = C23274hvD.Application.OnContextAvailableListener;
                                        C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                        if (c55251xgS2 != null) {
                                            i = C23274hvD.Application.ContextAwareKtwithContextAvailable21;
                                            C55251xgS c55251xgS3 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                            if (c55251xgS3 != null) {
                                                i = C23274hvD.Application.ActivityResultCallerLauncher;
                                                C55251xgS c55251xgS4 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                if (c55251xgS4 != null) {
                                                    i = C23274hvD.Application.getCallerContract;
                                                    C55251xgS c55251xgS5 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                    if (c55251xgS5 != null) {
                                                        i = C23274hvD.Application.launchUnitdefault;
                                                        C55251xgS c55251xgS6 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                        if (c55251xgS6 != null) {
                                                            i = C23274hvD.Application.generateRandomNumber;
                                                            C55251xgS c55251xgS7 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                            if (c55251xgS7 != null) {
                                                                i = C23274hvD.Application.getActionBarThemedContext;
                                                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView != null) {
                                                                    i = C23274hvD.Application.bypassOnContentChanged;
                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (appCompatTextView != null) {
                                                                        i = C23274hvD.Application.createViewFromTag;
                                                                        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                                                                        if (c52794wYp != null) {
                                                                            i = C23274hvD.Application.createImageButton;
                                                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (appCompatTextView2 != null) {
                                                                                return new hAB(constraintLayout, constraintLayout, constraintLayout2, imageView, imageView2, imageView3, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, c55251xgS, c55251xgS2, c55251xgS3, c55251xgS4, c55251xgS5, c55251xgS6, c55251xgS7, textView, appCompatTextView, c52794wYp, appCompatTextView2);
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
