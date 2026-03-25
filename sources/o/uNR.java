package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes19.dex */
public final class uNR implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final C54120wyP AkhnZx;
    public final LinearLayoutCompat DbNXlk;
    public final android.widget.ImageView EZpvd;
    public final android.widget.TextView KWHzl;
    public final C55258xgZ OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final android.widget.TextView djBIcL;
    public final C55258xgZ fetchVPNInfo;
    public final android.widget.ImageView gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.TextView valueOf;
    public final C54120wyP values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AYXKKw;
    }

    public uNR(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat4, @androidx.annotation.NonNull C55258xgZ c55258xgZ2, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull C54120wyP c54120wyP, @androidx.annotation.NonNull C54120wyP c54120wyP2) {
        this.AYXKKw = linearLayoutCompat;
        this.AEQbTJ = textView;
        this.KWHzl = textView2;
        this.EZpvd = imageView;
        this.copydefault = linearLayoutCompat2;
        this.OLrzqt = c55258xgZ;
        this.djBIcL = textView3;
        this.AhwBna = linearLayoutCompat3;
        this.valueOf = textView4;
        this.gEmmrt = imageView2;
        this.DbNXlk = linearLayoutCompat4;
        this.fetchVPNInfo = c55258xgZ2;
        this.isConnected = textView5;
        this.values = c54120wyP;
        this.AkhnZx = c54120wyP2;
    }

    public static uNR KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.DarRvM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static uNR AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.zuWLRA;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C48033uCm.Application.GLcwwN;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C48033uCm.Application.HrFqwD;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C48033uCm.Application.fzHEvu;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = C48033uCm.Application.onLocationChanged;
                        C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                        if (c55258xgZ != null) {
                            i = C48033uCm.Application.sEAkxl;
                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = C48033uCm.Application.SUwuXE;
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat2 != null) {
                                    i = C48033uCm.Application.SaJVGb;
                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        i = C48033uCm.Application.onRestoreInstanceState;
                                        android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView2 != null) {
                                            i = C48033uCm.Application.ActivityResultRegistry2;
                                            LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                            if (linearLayoutCompat3 != null) {
                                                i = C48033uCm.Application.ActivityResultRegistry1;
                                                C55258xgZ c55258xgZ2 = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                                if (c55258xgZ2 != null) {
                                                    i = C48033uCm.Application.dispatchResult;
                                                    android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView5 != null) {
                                                        i = C48033uCm.Application.register;
                                                        C54120wyP c54120wyP = (C54120wyP) ViewBindings.findChildViewById(view, i);
                                                        if (c54120wyP != null) {
                                                            i = C48033uCm.Application.getHotspotBounds;
                                                            C54120wyP c54120wyP2 = (C54120wyP) ViewBindings.findChildViewById(view, i);
                                                            if (c54120wyP2 != null) {
                                                                return new uNR((LinearLayoutCompat) view, textView, textView2, imageView, linearLayoutCompat, c55258xgZ, textView3, linearLayoutCompat2, textView4, imageView2, linearLayoutCompat3, c55258xgZ2, textView5, c54120wyP, c54120wyP2);
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
