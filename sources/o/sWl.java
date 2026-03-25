package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import o.sWj;

/* JADX INFO: loaded from: classes19.dex */
public final class sWl implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final ConstraintLayout EZpvd;
    public final android.widget.ProgressBar KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final C55389xiy djBIcL;
    public final android.widget.LinearLayout fARcdN;
    public final MaterialCardView fIwbmz;
    public final android.widget.FrameLayout fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final android.view.View gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.LinearLayout valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public sWl(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ProgressBar progressBar, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55389xiy c55389xiy, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull MaterialCardView materialCardView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3) {
        this.EZpvd = constraintLayout;
        this.OLrzqt = imageView;
        this.KWHzl = progressBar;
        this.AEQbTJ = view;
        this.copydefault = frameLayout;
        this.djBIcL = c55389xiy;
        this.AhwBna = imageView2;
        this.AYXKKw = linearLayout;
        this.valueOf = linearLayout2;
        this.gEmmrt = view2;
        this.isConnected = textView;
        this.values = textView2;
        this.AkhnZx = textView3;
        this.DbNXlk = textView4;
        this.fetchVPNInfo = textView5;
        this.fIwbmz = materialCardView;
        this.fJNWhG = frameLayout2;
        this.fARcdN = linearLayout3;
    }

    public static sWl KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(sWj.TaskDescription.copydefault, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static sWl KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = sWj.Application.EZpvd;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = sWj.Application.KWHzl;
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) ViewBindings.findChildViewById(view, i);
            if (progressBar != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = sWj.Application.djBIcL))) != null) {
                i = sWj.Application.AkhnZx;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = sWj.Application.AuCTel;
                    C55389xiy c55389xiy = (C55389xiy) ViewBindings.findChildViewById(view, i);
                    if (c55389xiy != null) {
                        i = sWj.Application.fIwbmz;
                        android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = sWj.Application.ejfBZ;
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = sWj.Application.getFieldNames;
                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = sWj.Application.getNewProxyInstance))) != null) {
                                    i = sWj.Application.AubY;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = sWj.Application.zsXlph;
                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = sWj.Application.AuCTelauCTel;
                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                i = sWj.Application.wlaJM;
                                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView4 != null) {
                                                    i = sWj.Application.zLjUOn;
                                                    android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView5 != null) {
                                                        i = sWj.Application.gHZMYf;
                                                        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, i);
                                                        if (materialCardView != null) {
                                                            i = sWj.Application.AwvSrB;
                                                            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                                            if (frameLayout2 != null) {
                                                                i = sWj.Application.sSMYrx;
                                                                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                if (linearLayout3 != null) {
                                                                    return new sWl((ConstraintLayout) view, imageView, progressBar, viewFindChildViewById, frameLayout, c55389xiy, imageView2, linearLayout, linearLayout2, viewFindChildViewById2, textView, textView2, textView3, textView4, textView5, materialCardView, frameLayout2, linearLayout3);
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
