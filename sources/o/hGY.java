package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hGY implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final C55251xgS AkhnZx;
    public final C55258xgZ AuCTel;
    public final AppCompatTextView DbNXlk;
    public final AppCompatTextView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final AppCompatImageView copydefault;
    public final android.widget.FrameLayout djBIcL;
    public final ConstraintLayout fIwbmz;
    public final C55251xgS fetchVPNInfo;
    public final ConstraintLayout gEmmrt;
    public final C55251xgS isConnected;
    public final C55251xgS valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AYXKKw;
    }

    public hGY(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull C55251xgS c55251xgS3, @androidx.annotation.NonNull C55251xgS c55251xgS4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull ConstraintLayout constraintLayout3) {
        this.AYXKKw = constraintLayout;
        this.KWHzl = imageView;
        this.AEQbTJ = appCompatImageView;
        this.OLrzqt = linearLayoutCompat;
        this.EZpvd = appCompatTextView;
        this.copydefault = appCompatImageView2;
        this.AhwBna = linearLayout;
        this.gEmmrt = constraintLayout2;
        this.djBIcL = frameLayout;
        this.valueOf = c55251xgS;
        this.isConnected = c55251xgS2;
        this.AkhnZx = c55251xgS3;
        this.fetchVPNInfo = c55251xgS4;
        this.DbNXlk = appCompatTextView2;
        this.values = appCompatTextView3;
        this.AuCTel = c55258xgZ;
        this.fIwbmz = constraintLayout3;
    }

    public static hGY KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.zlzhuY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hGY EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.fruYXx;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C23274hvD.Application.iflRwn;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C23274hvD.Application.DKr;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = C23274hvD.Application.svUkWZ;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = C23274hvD.Application.ZNPcth;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView2 != null) {
                            i = C23274hvD.Application.onSessionDestroyed;
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = C23274hvD.Application.hasCallback;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout != null) {
                                    i = C23274hvD.Application.MediaSessionCompatApi21Callback;
                                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout != null) {
                                        i = C23274hvD.Application.r8lambdaSjF4PZlnE9fmKbolD64Sz5ghy6c;
                                        C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                        if (c55251xgS != null) {
                                            i = C23274hvD.Application.ActivityResultCallback;
                                            C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                            if (c55251xgS2 != null) {
                                                i = C23274hvD.Application.r8lambda7lLdjm1L5OSJIz1pWP4kzityPws;
                                                C55251xgS c55251xgS3 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                if (c55251xgS3 != null) {
                                                    i = C23274hvD.Application.getCallerContract;
                                                    C55251xgS c55251xgS4 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                    if (c55251xgS4 != null) {
                                                        i = C23274hvD.Application.Rstyle;
                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView2 != null) {
                                                            i = C23274hvD.Application.Rstring;
                                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatTextView3 != null) {
                                                                i = C23274hvD.Application.createAutoCompleteTextView;
                                                                C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                                                if (c55258xgZ != null) {
                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                                                    return new hGY(constraintLayout2, imageView, appCompatImageView, linearLayoutCompat, appCompatTextView, appCompatImageView2, linearLayout, constraintLayout, frameLayout, c55251xgS, c55251xgS2, c55251xgS3, c55251xgS4, appCompatTextView2, appCompatTextView3, c55258xgZ, constraintLayout2);
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
