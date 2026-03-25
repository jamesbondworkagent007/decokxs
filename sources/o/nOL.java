package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nOL implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C35893oHp AhwBna;
    public final android.widget.ImageView AkhnZx;
    public final LinearLayoutCompat AuCTel;
    public final oIV DbNXlk;
    public final AppCompatImageView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final Flow OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView fARcdN;
    public final LinearLayoutCompat fetchVPNInfo;
    public final android.widget.ImageView gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.TextView valueOf;
    public final android.widget.ImageView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AuCTel;
    }

    public nOL(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Flow flow, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull C35893oHp c35893oHp, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull oIV oiv, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.ImageView imageView4, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6) {
        this.AuCTel = linearLayoutCompat;
        this.EZpvd = appCompatImageView;
        this.copydefault = constraintLayout;
        this.OLrzqt = flow;
        this.KWHzl = imageView;
        this.AEQbTJ = textView;
        this.valueOf = textView2;
        this.AYXKKw = textView3;
        this.gEmmrt = imageView2;
        this.AhwBna = c35893oHp;
        this.djBIcL = textView4;
        this.DbNXlk = oiv;
        this.values = imageView3;
        this.AkhnZx = imageView4;
        this.fetchVPNInfo = linearLayoutCompat2;
        this.isConnected = textView5;
        this.fARcdN = textView6;
    }

    public static nOL OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.invokespecialhlXVux, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static nOL EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.DGOPHZDGOPHZ;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C35399nuc.StateListAnimator.UscePu;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C35399nuc.StateListAnimator.reset;
                Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
                if (flow != null) {
                    i = C35399nuc.StateListAnimator.gBtXYZ;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C35399nuc.StateListAnimator.v;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C35399nuc.StateListAnimator.aeJQwa;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C35399nuc.StateListAnimator.clearRegistrations;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = C35399nuc.StateListAnimator.sIqKDg;
                                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView2 != null) {
                                        i = C35399nuc.StateListAnimator.FQNKFG;
                                        C35893oHp c35893oHp = (C35893oHp) ViewBindings.findChildViewById(view, i);
                                        if (c35893oHp != null) {
                                            i = C35399nuc.StateListAnimator.setPageName;
                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = C35399nuc.StateListAnimator.FSMca;
                                                oIV oiv = (oIV) ViewBindings.findChildViewById(view, i);
                                                if (oiv != null) {
                                                    i = C35399nuc.StateListAnimator.finishInit;
                                                    android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView3 != null) {
                                                        i = C35399nuc.StateListAnimator.dlRikr;
                                                        android.widget.ImageView imageView4 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                        if (imageView4 != null) {
                                                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                                                            i = C35399nuc.StateListAnimator.GcnicV;
                                                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView5 != null) {
                                                                i = C35399nuc.StateListAnimator.hfFNez;
                                                                android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView6 != null) {
                                                                    return new nOL(linearLayoutCompat, appCompatImageView, constraintLayout, flow, imageView, textView, textView2, textView3, imageView2, c35893oHp, textView4, oiv, imageView3, imageView4, linearLayoutCompat, textView5, textView6);
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
