package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hHA implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final C55113xdn AYXKKw;
    public final ConstraintLayout AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView AuCTel;
    public final android.widget.TextView DbNXlk;
    public final C55173xeu EZpvd;
    public final ConstraintLayout KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final C52794wYp copydefault;
    public final android.view.View djBIcL;
    public final android.widget.TextView fIwbmz;
    public final android.widget.TextView fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final AppCompatImageView gEmmrt;
    public final android.widget.TextView isConnected;
    public final AppCompatImageView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public hHA(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8) {
        this.AhwBna = constraintLayout;
        this.copydefault = c52794wYp;
        this.KWHzl = constraintLayout2;
        this.OLrzqt = linearLayoutCompat;
        this.EZpvd = c55173xeu;
        this.AEQbTJ = appCompatImageView;
        this.gEmmrt = appCompatImageView2;
        this.valueOf = appCompatImageView3;
        this.djBIcL = view;
        this.AYXKKw = c55113xdn;
        this.fetchVPNInfo = textView;
        this.isConnected = textView2;
        this.DbNXlk = textView3;
        this.AkhnZx = textView4;
        this.values = textView5;
        this.AuCTel = textView6;
        this.fJNWhG = textView7;
        this.fIwbmz = textView8;
    }

    public static hHA copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.ORrpqH, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static hHA copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.vLaW;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C23274hvD.Application.DUUtXg;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C23274hvD.Application.FQMcgE;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = C23274hvD.Application.hcetpZ;
                    C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                    if (c55173xeu != null) {
                        i = C23274hvD.Application.UnZVfqExternalSyntheticApiModelOutline0;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView != null) {
                            i = C23274hvD.Application.OmPrLP;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView2 != null) {
                                i = C23274hvD.Application.MediaBrowserCompatCustomActionCallback;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.getMediaMetadata))) != null) {
                                    i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                    if (c55113xdn != null) {
                                        i = C23274hvD.Application.IntegerRes;
                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            i = C23274hvD.Application.AppCompatDelegateImplActionModeCallbackWrapperV9;
                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView2 != null) {
                                                i = C23274hvD.Application.onDestroyActionMode;
                                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView3 != null) {
                                                    i = C23274hvD.Application.createCheckedTextView;
                                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView4 != null) {
                                                        i = C23274hvD.Application.doHide;
                                                        android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView5 != null) {
                                                            i = C23274hvD.Application.prepareDrawable;
                                                            android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView6 != null) {
                                                                i = C23274hvD.Application.getEnterFadeDuration;
                                                                android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView7 != null) {
                                                                    i = C23274hvD.Application.getStateSet;
                                                                    android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView8 != null) {
                                                                        return new hHA((ConstraintLayout) view, c52794wYp, constraintLayout, linearLayoutCompat, c55173xeu, appCompatImageView, appCompatImageView2, appCompatImageView3, viewFindChildViewById, c55113xdn, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
