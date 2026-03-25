package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oOd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36070oOd implements ViewBinding {
    public final C34603nfH AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final android.widget.ImageView EZpvd;
    public final wYC KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final ConstraintLayout djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C36070oOd(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C34603nfH c34603nfH, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5) {
        this.djBIcL = constraintLayout;
        this.AEQbTJ = c34603nfH;
        this.KWHzl = wyc;
        this.EZpvd = imageView;
        this.copydefault = linearLayout;
        this.OLrzqt = linearLayout2;
        this.AhwBna = appCompatTextView;
        this.AYXKKw = textView;
        this.valueOf = textView2;
        this.gEmmrt = textView3;
        this.isConnected = textView4;
        this.values = textView5;
    }

    public static C36070oOd OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.fXHmeK, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C36070oOd EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.DKtBnz;
        C34603nfH c34603nfH = (C34603nfH) ViewBindings.findChildViewById(view, i);
        if (c34603nfH != null) {
            i = C35964oKf.StateListAnimator.DzkRMH;
            wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
            if (wyc != null) {
                i = C35964oKf.StateListAnimator.GQzpsZgQzpsZ;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C35964oKf.StateListAnimator.DzCpqu;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C35964oKf.StateListAnimator.gCiISl;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = C35964oKf.StateListAnimator.getIconUri;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView != null) {
                                i = C35964oKf.StateListAnimator.MediaDescriptionCompatBuilder;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = C35964oKf.StateListAnimator.setShuffleMode;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = C35964oKf.StateListAnimator.MediaControllerCompatMediaControllerImplApi21;
                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = C35964oKf.StateListAnimator.getMediaSession;
                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = C35964oKf.StateListAnimator.getController;
                                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    return new C36070oOd((ConstraintLayout) view, c34603nfH, wyc, imageView, linearLayout, linearLayout2, appCompatTextView, textView, textView2, textView3, textView4, textView5);
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
