package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes19.dex */
public final class uNX implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final C55258xgZ AYXKKw;
    public final android.widget.TextView AhwBna;
    public final C49946uyD EZpvd;
    public final android.widget.TextView KWHzl;
    public final C55251xgS OLrzqt;
    public final C55251xgS copydefault;
    public final LinearLayoutCompat djBIcL;
    public final C55258xgZ gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.djBIcL;
    }

    public uNX(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C49946uyD c49946uyD, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull C55258xgZ c55258xgZ2, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.djBIcL = linearLayoutCompat;
        this.EZpvd = c49946uyD;
        this.KWHzl = textView;
        this.AEQbTJ = textView2;
        this.OLrzqt = c55251xgS;
        this.copydefault = c55251xgS2;
        this.AYXKKw = c55258xgZ;
        this.AhwBna = textView3;
        this.gEmmrt = c55258xgZ2;
        this.valueOf = textView4;
    }

    public static uNX OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.DXXBbs, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static uNX OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.fJNWhG;
        C49946uyD c49946uyD = (C49946uyD) ViewBindings.findChildViewById(view, i);
        if (c49946uyD != null) {
            i = C48033uCm.Application.geLlBI;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C48033uCm.Application.gCNefq;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C48033uCm.Application.iOIMNp;
                    C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                    if (c55251xgS != null) {
                        i = C48033uCm.Application.MediaBrowserCompatMediaBrowserImplBase5;
                        C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                        if (c55251xgS2 != null) {
                            i = C48033uCm.Application.MediaSessionCompatMediaSessionImplApi28;
                            C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                            if (c55258xgZ != null) {
                                i = C48033uCm.Application.onMetadataUpdate;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = C48033uCm.Application.MediaSessionCompatMediaSessionImplApi28ExternalSyntheticApiModelOutline0;
                                    C55258xgZ c55258xgZ2 = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                    if (c55258xgZ2 != null) {
                                        i = C48033uCm.Application.MediaSessionCompatMediaSessionImplApi21;
                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            return new uNX((LinearLayoutCompat) view, c49946uyD, textView, textView2, c55251xgS, c55251xgS2, c55258xgZ, textView3, c55258xgZ2, textView4);
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
