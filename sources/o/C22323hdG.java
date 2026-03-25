package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C22366hdx;

/* JADX INFO: renamed from: o.hdG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22323hdG implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public C22323hdG(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8) {
        this.KWHzl = frameLayout;
        this.AEQbTJ = constraintLayout;
        this.copydefault = imageView;
        this.OLrzqt = imageView2;
        this.EZpvd = textView;
        this.valueOf = textView2;
        this.AhwBna = textView3;
        this.gEmmrt = textView4;
        this.djBIcL = textView5;
        this.AYXKKw = textView6;
        this.AkhnZx = textView7;
        this.isConnected = textView8;
    }

    public static C22323hdG EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C22366hdx.Activity.djBIcL, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C22323hdG copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C22366hdx.ActionBar.AuCTel;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C22366hdx.ActionBar.QVAiDq;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C22366hdx.ActionBar.fFgQHt;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C22366hdx.ActionBar.heceqZ;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C22366hdx.ActionBar.DaRZkR;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C22366hdx.ActionBar.OTwTPd;
                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = C22366hdx.ActionBar.DGgnkA;
                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = C22366hdx.ActionBar.QDqgQU;
                                    android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        i = C22366hdx.ActionBar.QXDzTk;
                                        android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            i = C22366hdx.ActionBar.gUEfcq;
                                            android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView7 != null) {
                                                i = C22366hdx.ActionBar.gSBher;
                                                android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView8 != null) {
                                                    return new C22323hdG((android.widget.FrameLayout) view, constraintLayout, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
