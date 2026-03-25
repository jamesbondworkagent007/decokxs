package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23527hzs implements ViewBinding {
    public final C55320xhi AEQbTJ;
    public final C55239xgG AYXKKw;
    public final C19919gUe AhwBna;
    public final C19938gUx EZpvd;
    public final C55320xhi KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.view.View gEmmrt;
    public final C55239xgG valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.gEmmrt;
    }

    public C23527hzs(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C19938gUx c19938gUx, @androidx.annotation.NonNull C55320xhi c55320xhi, @androidx.annotation.NonNull C55320xhi c55320xhi2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C19919gUe c19919gUe, @androidx.annotation.NonNull C55239xgG c55239xgG, @androidx.annotation.NonNull C55239xgG c55239xgG2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.gEmmrt = view;
        this.EZpvd = c19938gUx;
        this.KWHzl = c55320xhi;
        this.AEQbTJ = c55320xhi2;
        this.copydefault = imageView;
        this.OLrzqt = linearLayout;
        this.AhwBna = c19919gUe;
        this.valueOf = c55239xgG;
        this.AYXKKw = c55239xgG2;
        this.djBIcL = textView;
    }

    public static C23527hzs AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.USBtdM, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C23527hzs OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.AxsJAYsNCnLh;
        C19938gUx c19938gUx = (C19938gUx) ViewBindings.findChildViewById(view, i);
        if (c19938gUx != null) {
            i = C23274hvD.Application.zHQtTQ;
            C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
            if (c55320xhi != null) {
                i = C23274hvD.Application.zAGdSp;
                C55320xhi c55320xhi2 = (C55320xhi) ViewBindings.findChildViewById(view, i);
                if (c55320xhi2 != null) {
                    i = C23274hvD.Application.UNDaji;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C23274hvD.Application.MediaControllerCompatMediaControllerImplApi23;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C23274hvD.Application.OnBackPressedDispatcherKtaddCallbackcallback1;
                            C19919gUe c19919gUe = (C19919gUe) ViewBindings.findChildViewById(view, i);
                            if (c19919gUe != null) {
                                i = C23274hvD.Application.ReportDrawnWhen;
                                C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
                                if (c55239xgG != null) {
                                    i = C23274hvD.Application.ReportDrawnKt;
                                    C55239xgG c55239xgG2 = (C55239xgG) ViewBindings.findChildViewById(view, i);
                                    if (c55239xgG2 != null) {
                                        i = C23274hvD.Application.resolveMethod;
                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            return new C23527hzs(view, c19938gUx, c55320xhi, c55320xhi2, imageView, linearLayout, c19919gUe, c55239xgG, c55239xgG2, textView);
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
