package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hEL implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final AppCompatImageView AhwBna;
    public final C52794wYp AkhnZx;
    public final AppCompatImageView DbNXlk;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final android.widget.LinearLayout fARcdN;
    public final android.widget.TextView fetchVPNInfo;
    public final ShapeableImageView gEmmrt;
    public final AppCompatImageView isConnected;
    public final android.widget.TextView valueOf;
    public final C55251xgS values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.fARcdN;
    }

    public hEL(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.TextView textView8, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull C55251xgS c55251xgS) {
        this.fARcdN = linearLayout;
        this.OLrzqt = textView;
        this.copydefault = textView2;
        this.AEQbTJ = textView3;
        this.EZpvd = textView4;
        this.KWHzl = textView5;
        this.AhwBna = appCompatImageView;
        this.valueOf = textView6;
        this.gEmmrt = shapeableImageView;
        this.djBIcL = linearLayout2;
        this.AYXKKw = textView7;
        this.isConnected = appCompatImageView2;
        this.AkhnZx = c52794wYp;
        this.fetchVPNInfo = textView8;
        this.DbNXlk = appCompatImageView3;
        this.values = c55251xgS;
    }

    public static hEL AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.GLcwwN, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static hEL OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.AhwBna;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C23274hvD.Application.gEmmrt;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C23274hvD.Application.AYXKKw;
                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = C23274hvD.Application.AkhnZx;
                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = C23274hvD.Application.DbNXlk;
                        android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView5 != null) {
                            i = C23274hvD.Application.fetchVPNInfo;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView != null) {
                                i = C23274hvD.Application.isConnected;
                                android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView6 != null) {
                                    i = C23274hvD.Application.hDKMBd;
                                    ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                                    if (shapeableImageView != null) {
                                        i = C23274hvD.Application.zLjUOn;
                                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = C23274hvD.Application.wlaJM;
                                            android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView7 != null) {
                                                i = C23274hvD.Application.DAIeex;
                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatImageView2 != null) {
                                                    i = C23274hvD.Application.fBE;
                                                    C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                                                    if (c52794wYp != null) {
                                                        i = C23274hvD.Application.gVEiQJ;
                                                        android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView8 != null) {
                                                            i = C23274hvD.Application.MediaSessionCompatApi24;
                                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatImageView3 != null) {
                                                                i = C23274hvD.Application.getErrorCode;
                                                                C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                                if (c55251xgS != null) {
                                                                    return new hEL((android.widget.LinearLayout) view, textView, textView2, textView3, textView4, textView5, appCompatImageView, textView6, shapeableImageView, linearLayout, textView7, appCompatImageView2, c52794wYp, textView8, appCompatImageView3, c55251xgS);
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
