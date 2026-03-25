package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C50891vch implements ViewBinding {
    public final wYS AEQbTJ;
    public final android.view.View AhwBna;
    public final LinearLayoutCompat EZpvd;
    public final C47988uAv KWHzl;
    public final wYS OLrzqt;
    public final wYS copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AhwBna;
    }

    public C50891vch(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull wYS wys, @androidx.annotation.NonNull wYS wys2, @androidx.annotation.NonNull wYS wys3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C47988uAv c47988uAv) {
        this.AhwBna = view;
        this.AEQbTJ = wys;
        this.OLrzqt = wys2;
        this.copydefault = wys3;
        this.EZpvd = linearLayoutCompat;
        this.KWHzl = c47988uAv;
    }

    public static C50891vch copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C48033uCm.Activity.IYdWPz, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C50891vch OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.DxnCrt;
        wYS wys = (wYS) ViewBindings.findChildViewById(view, i);
        if (wys != null) {
            i = C48033uCm.Application.glVQsU;
            wYS wys2 = (wYS) ViewBindings.findChildViewById(view, i);
            if (wys2 != null) {
                i = C48033uCm.Application.DwQSDd;
                wYS wys3 = (wYS) ViewBindings.findChildViewById(view, i);
                if (wys3 != null) {
                    i = C48033uCm.Application.MediaSessionCompatCallbackStubApi21;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = C48033uCm.Application.getErrorMessage;
                        C47988uAv c47988uAv = (C47988uAv) ViewBindings.findChildViewById(view, i);
                        if (c47988uAv != null) {
                            return new C50891vch(view, wys, wys2, wys3, linearLayoutCompat, c47988uAv);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
