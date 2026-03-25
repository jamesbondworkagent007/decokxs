package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public final class uRJ implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final ConstraintLayout AkhnZx;
    public final android.widget.ImageView DbNXlk;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final C55258xgZ OLrzqt;
    public final android.widget.ImageView copydefault;
    public final ConstraintLayout djBIcL;
    public final C55258xgZ fetchVPNInfo;
    public final wUO gEmmrt;
    public final android.widget.TextView isConnected;
    public final C55258xgZ valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AkhnZx;
    }

    public uRJ(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull wUO wuo, @androidx.annotation.NonNull C55258xgZ c55258xgZ2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull C55258xgZ c55258xgZ3, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.AkhnZx = constraintLayout;
        this.AEQbTJ = linearLayoutCompat;
        this.copydefault = imageView;
        this.OLrzqt = c55258xgZ;
        this.EZpvd = textView;
        this.KWHzl = textView2;
        this.djBIcL = constraintLayout2;
        this.gEmmrt = wuo;
        this.valueOf = c55258xgZ2;
        this.AYXKKw = linearLayoutCompat2;
        this.AhwBna = linearLayoutCompat3;
        this.DbNXlk = imageView2;
        this.fetchVPNInfo = c55258xgZ3;
        this.values = textView3;
        this.isConnected = textView4;
    }

    public static uRJ AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.iKEqwx, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static uRJ copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.fLIjIY;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C48033uCm.Application.hlkKmr;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C48033uCm.Application.fsSxsn;
                C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                if (c55258xgZ != null) {
                    i = C48033uCm.Application.gUEfcq;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C48033uCm.Application.gmHjFq;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C48033uCm.Application.DcMfJKDcMfJK;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                i = C48033uCm.Application.DcMfJKfbSiEC;
                                wUO wuo = (wUO) ViewBindings.findChildViewById(view, i);
                                if (wuo != null) {
                                    i = C48033uCm.Application.zUtmHU;
                                    C55258xgZ c55258xgZ2 = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                    if (c55258xgZ2 != null) {
                                        i = C48033uCm.Application.dump;
                                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat2 != null) {
                                            i = C48033uCm.Application.setActiveQueueItemId;
                                            LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                            if (linearLayoutCompat3 != null) {
                                                i = C48033uCm.Application.addCustomAction;
                                                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView2 != null) {
                                                    i = C48033uCm.Application.setActions;
                                                    C55258xgZ c55258xgZ3 = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                                                    if (c55258xgZ3 != null) {
                                                        i = C48033uCm.Application.getCustomAction;
                                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView3 != null) {
                                                            i = C48033uCm.Application.getAction;
                                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView4 != null) {
                                                                return new uRJ((ConstraintLayout) view, linearLayoutCompat, imageView, c55258xgZ, textView, textView2, constraintLayout, wuo, c55258xgZ2, linearLayoutCompat2, linearLayoutCompat3, imageView2, c55258xgZ3, textView3, textView4);
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
