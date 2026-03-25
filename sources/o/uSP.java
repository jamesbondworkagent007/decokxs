package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uSP implements ViewBinding {
    public final C55379xio AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final C55379xio AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final C55251xgS gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AYXKKw;
    }

    public uSP(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55379xio c55379xio, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull C55379xio c55379xio2, @androidx.annotation.NonNull C55251xgS c55251xgS) {
        this.AYXKKw = linearLayoutCompat;
        this.AEQbTJ = c55379xio;
        this.KWHzl = textView;
        this.OLrzqt = textView2;
        this.EZpvd = textView3;
        this.copydefault = textView4;
        this.AhwBna = c55379xio2;
        this.gEmmrt = c55251xgS;
    }

    public static uSP copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.DPHOMC, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static uSP copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.gSBher;
        C55379xio c55379xio = (C55379xio) ViewBindings.findChildViewById(view, i);
        if (c55379xio != null) {
            i = C48033uCm.Application.finishInit;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C48033uCm.Application.sanitizeSessionIdIgnoreCase;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C48033uCm.Application.validateAndPutInMap;
                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = C48033uCm.Application.MediaControllerCompatMediaControllerImplApi23;
                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = C48033uCm.Application.fromCustomAction;
                            C55379xio c55379xio2 = (C55379xio) ViewBindings.findChildViewById(view, i);
                            if (c55379xio2 != null) {
                                i = C48033uCm.Application.to;
                                C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                if (c55251xgS != null) {
                                    return new uSP((LinearLayoutCompat) view, c55379xio, textView, textView2, textView3, textView4, c55379xio2, c55251xgS);
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
