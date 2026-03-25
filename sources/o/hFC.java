package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hFC implements ViewBinding {
    public final kNE AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final android.widget.TextView DbNXlk;
    public final C55251xgS EZpvd;
    public final Barrier KWHzl;
    public final C21983hTo OLrzqt;
    public final Barrier copydefault;
    public final android.widget.TextView djBIcL;
    public final Flow fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final android.view.View isConnected;
    public final LinearLayoutCompat valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.isConnected;
    }

    public hFC(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull Barrier barrier2, @androidx.annotation.NonNull kNE kne, @androidx.annotation.NonNull C21983hTo c21983hTo, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull Flow flow, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.isConnected = view;
        this.copydefault = barrier;
        this.KWHzl = barrier2;
        this.AEQbTJ = kne;
        this.OLrzqt = c21983hTo;
        this.EZpvd = c55251xgS;
        this.gEmmrt = textView;
        this.djBIcL = textView2;
        this.AhwBna = imageView;
        this.AYXKKw = constraintLayout;
        this.valueOf = linearLayoutCompat;
        this.fetchVPNInfo = flow;
        this.DbNXlk = textView3;
    }

    public static hFC AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.resume, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static hFC OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.QHmsKR;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C23274hvD.Application.ODXsMY;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier2 != null) {
                i = C23274hvD.Application.HJWChPRGtXKCRGtXKC;
                kNE kne = (kNE) ViewBindings.findChildViewById(view, i);
                if (kne != null) {
                    i = C23274hvD.Application.OTJFaA;
                    C21983hTo c21983hTo = (C21983hTo) ViewBindings.findChildViewById(view, i);
                    if (c21983hTo != null) {
                        i = C23274hvD.Application.QWSkGZ;
                        C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                        if (c55251xgS != null) {
                            i = C23274hvD.Application.QfgJNx;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C23274hvD.Application.DvMhtu;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = C23274hvD.Application.notify;
                                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = C23274hvD.Application.MediaDescriptionCompatApi21;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout != null) {
                                            i = C23274hvD.Application.MediaSessionCompatApi23Callback;
                                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                            if (linearLayoutCompat != null) {
                                                i = C23274hvD.Application.ActivityResultRegistry3;
                                                Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
                                                if (flow != null) {
                                                    i = C23274hvD.Application.setDefaultDisplayHomeAsUpEnabled;
                                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null) {
                                                        return new hFC(view, barrier, barrier2, kne, c21983hTo, c55251xgS, textView, textView2, imageView, constraintLayout, linearLayoutCompat, flow, textView3);
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
