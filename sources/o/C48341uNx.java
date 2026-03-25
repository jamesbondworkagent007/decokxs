package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uNx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48341uNx implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.view.View EZpvd;
    public final android.widget.TextView KWHzl;
    public final C51348vlN OLrzqt;
    public final C55237xgE copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C48341uNx(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55237xgE c55237xgE, @androidx.annotation.NonNull C51348vlN c51348vlN, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.EZpvd = view;
        this.copydefault = c55237xgE;
        this.OLrzqt = c51348vlN;
        this.AEQbTJ = linearLayoutCompat;
        this.KWHzl = textView;
        this.valueOf = textView2;
        this.AYXKKw = textView3;
    }

    public static C48341uNx copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C48033uCm.Activity.fZBcTu, viewGroup);
        return copydefault(viewGroup);
    }

    public static C48341uNx copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.Hx;
        C55237xgE c55237xgE = (C55237xgE) ViewBindings.findChildViewById(view, i);
        if (c55237xgE != null) {
            i = C48033uCm.Application.DcMfJKffREWX;
            C51348vlN c51348vlN = (C51348vlN) ViewBindings.findChildViewById(view, i);
            if (c51348vlN != null) {
                i = C48033uCm.Application.ComponentActivity4;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = C48033uCm.Application.ActivityResultContractsTakeVideo;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C48033uCm.Application.RestrictTo;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C48033uCm.Application.getCustomView;
                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                return new C48341uNx(view, c55237xgE, c51348vlN, linearLayoutCompat, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
