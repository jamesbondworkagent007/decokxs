package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C28102kOz;

/* JADX INFO: loaded from: classes23.dex */
public final class kOW implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView AuCTel;
    public final android.widget.TextView DbNXlk;
    public final android.widget.ImageView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final android.view.View ejfBZ;
    public final android.view.View fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final ConstraintLayout gEmmrt;
    public final android.widget.TextView isConnected;
    public final C6995aZr valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public kOW(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.ImageView imageView4, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull C6995aZr c6995aZr, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2) {
        this.gEmmrt = constraintLayout;
        this.copydefault = frameLayout;
        this.OLrzqt = imageView;
        this.KWHzl = imageView2;
        this.AEQbTJ = imageView3;
        this.EZpvd = imageView4;
        this.AYXKKw = linearLayout;
        this.djBIcL = linearLayout2;
        this.AhwBna = linearLayout3;
        this.valueOf = c6995aZr;
        this.isConnected = textView;
        this.AkhnZx = textView2;
        this.fetchVPNInfo = textView3;
        this.values = textView4;
        this.DbNXlk = textView5;
        this.AuCTel = textView6;
        this.fJNWhG = view;
        this.ejfBZ = view2;
    }

    public static kOW copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C28102kOz.Activity.djBIcL, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static kOW copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C28102kOz.StateListAnimator.gEmmrt;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C28102kOz.StateListAnimator.AYXKKw;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C28102kOz.StateListAnimator.values;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C28102kOz.StateListAnimator.isConnected;
                    android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = C28102kOz.StateListAnimator.AkhnZx;
                        android.widget.ImageView imageView4 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView4 != null) {
                            i = C28102kOz.StateListAnimator.fIwbmz;
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = C28102kOz.StateListAnimator.AuCTel;
                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = C28102kOz.StateListAnimator.fARcdN;
                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout3 != null) {
                                        i = C28102kOz.StateListAnimator.ejfBZ;
                                        C6995aZr c6995aZr = (C6995aZr) ViewBindings.findChildViewById(view, i);
                                        if (c6995aZr != null) {
                                            i = C28102kOz.StateListAnimator.getFieldNames;
                                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                i = C28102kOz.StateListAnimator.iwGUEr;
                                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    i = C28102kOz.StateListAnimator.uzCIH;
                                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null) {
                                                        i = C28102kOz.StateListAnimator.getNewProxyInstance;
                                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView4 != null) {
                                                            i = C28102kOz.StateListAnimator.AuCTelauCTel;
                                                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView5 != null) {
                                                                i = C28102kOz.StateListAnimator.AubY;
                                                                android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView6 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C28102kOz.StateListAnimator.zLjUOn))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C28102kOz.StateListAnimator.wlaJM))) != null) {
                                                                    return new kOW((ConstraintLayout) view, frameLayout, imageView, imageView2, imageView3, imageView4, linearLayout, linearLayout2, linearLayout3, c6995aZr, textView, textView2, textView3, textView4, textView5, textView6, viewFindChildViewById, viewFindChildViewById2);
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
