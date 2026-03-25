package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vdf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50942vdf implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C55258xgZ AhwBna;
    public final LinearLayoutCompat EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final C55258xgZ OLrzqt;
    public final C55258xgZ copydefault;
    public final android.widget.TextView djBIcL;
    public final android.view.View gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.gEmmrt;
    }

    public C50942vdf(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull C55258xgZ c55258xgZ2, @androidx.annotation.NonNull C55258xgZ c55258xgZ3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.gEmmrt = view;
        this.KWHzl = linearLayoutCompat;
        this.EZpvd = linearLayoutCompat2;
        this.AEQbTJ = linearLayoutCompat3;
        this.copydefault = c55258xgZ;
        this.OLrzqt = c55258xgZ2;
        this.AhwBna = c55258xgZ3;
        this.AYXKKw = textView;
        this.valueOf = textView2;
        this.djBIcL = textView3;
    }

    public static C50942vdf EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.RlQdEF;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C48033uCm.Application.DAIeex;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat2 != null) {
                i = C48033uCm.Application.QKudOq;
                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat3 != null) {
                    i = C48033uCm.Application.accept;
                    C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                    if (c55258xgZ != null) {
                        i = C48033uCm.Application.AxsJAYsNCnLh;
                        C55258xgZ c55258xgZ2 = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                        if (c55258xgZ2 != null) {
                            i = C48033uCm.Application.ODWQjV;
                            C55258xgZ c55258xgZ3 = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                            if (c55258xgZ3 != null) {
                                i = C48033uCm.Application.OqFWZa;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = C48033uCm.Application.getPostValueLengthLimit;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = C48033uCm.Application.ffGIBT;
                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            return new C50942vdf(view, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, c55258xgZ, c55258xgZ2, c55258xgZ3, textView, textView2, textView3);
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
