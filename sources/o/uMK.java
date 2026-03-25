package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes16.dex */
public final class uMK implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView AuCTel;
    public final android.widget.TextView DbNXlk;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final wYD OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final LinearLayoutCompat djBIcL;
    public final LinearLayoutCompat fetchVPNInfo;
    public final LinearLayoutCompat gEmmrt;
    public final LinearLayoutCompat isConnected;
    public final android.widget.TextView valueOf;
    public final android.view.View values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.values;
    }

    public uMK(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull wYD wyd, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat4, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat5, @androidx.annotation.NonNull android.widget.TextView textView8, @androidx.annotation.NonNull android.widget.TextView textView9) {
        this.values = view;
        this.copydefault = linearLayoutCompat;
        this.OLrzqt = wyd;
        this.KWHzl = textView;
        this.AEQbTJ = textView2;
        this.EZpvd = textView3;
        this.gEmmrt = linearLayoutCompat2;
        this.valueOf = textView4;
        this.AYXKKw = textView5;
        this.djBIcL = linearLayoutCompat3;
        this.AhwBna = textView6;
        this.isConnected = linearLayoutCompat4;
        this.DbNXlk = textView7;
        this.fetchVPNInfo = linearLayoutCompat5;
        this.AkhnZx = textView8;
        this.AuCTel = textView9;
    }

    public static uMK copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C48033uCm.Activity.getNewProxyInstance, viewGroup);
        return KWHzl(viewGroup);
    }

    public static uMK KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.DSiOMJ;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C48033uCm.Application.DUUtXg;
            wYD wyd = (wYD) ViewBindings.findChildViewById(view, i);
            if (wyd != null) {
                i = C48033uCm.Application.DrqXHJ;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C48033uCm.Application.DGUQLIhJrIAr;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C48033uCm.Application.frkDMe;
                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = C48033uCm.Application.aJZHYI;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat2 != null) {
                                i = C48033uCm.Application.DrNnAm;
                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = C48033uCm.Application.DPHNDa;
                                    android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        i = C48033uCm.Application.Th;
                                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat3 != null) {
                                            i = C48033uCm.Application.DTeKQX;
                                            android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView6 != null) {
                                                i = C48033uCm.Application.pXZxY;
                                                LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                if (linearLayoutCompat4 != null) {
                                                    i = C48033uCm.Application.Dff;
                                                    android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView7 != null) {
                                                        i = C48033uCm.Application.ComponentActivity4;
                                                        LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayoutCompat5 != null) {
                                                            i = C48033uCm.Application.addCancellableCallbackactivity_release;
                                                            android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView8 != null) {
                                                                i = C48033uCm.Application.getACTION_SYSTEM_FALLBACK_PICK_IMAGESannotations;
                                                                android.widget.TextView textView9 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView9 != null) {
                                                                    return new uMK(view, linearLayoutCompat, wyd, textView, textView2, textView3, linearLayoutCompat2, textView4, textView5, linearLayoutCompat3, textView6, linearLayoutCompat4, textView7, linearLayoutCompat5, textView8, textView9);
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
