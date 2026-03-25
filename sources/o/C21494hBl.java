package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.uilab.view.OKSortTextView;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21494hBl implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final OKSortTextView AhwBna;
    public final OKReminder AkhnZx;
    public final android.widget.LinearLayout DbNXlk;
    public final wYC EZpvd;
    public final wYC KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final android.widget.ImageView djBIcL;
    public final android.widget.TextView fARcdN;
    public final android.widget.TextView fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final OKSortTextView gEmmrt;
    public final C29147koE isConnected;
    public final android.widget.ImageView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.DbNXlk;
    }

    public C21494hBl(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull wYC wyc2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull OKSortTextView oKSortTextView2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull C29147koE c29147koE, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.DbNXlk = linearLayout;
        this.copydefault = linearLayoutCompat;
        this.AEQbTJ = c52794wYp;
        this.OLrzqt = linearLayoutCompat2;
        this.KWHzl = wyc;
        this.EZpvd = wyc2;
        this.valueOf = imageView;
        this.djBIcL = imageView2;
        this.AhwBna = oKSortTextView;
        this.gEmmrt = oKSortTextView2;
        this.AYXKKw = linearLayoutCompat3;
        this.AkhnZx = oKReminder;
        this.isConnected = c29147koE;
        this.values = textView;
        this.fetchVPNInfo = textView2;
        this.fJNWhG = textView3;
        this.fARcdN = textView4;
    }

    public static C21494hBl OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.hrjNmC, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21494hBl EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DCJXGO;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C23274hvD.Application.tIwhY;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C23274hvD.Application.bindToGooglePlayService;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat2 != null) {
                    i = C23274hvD.Application.glXhWM;
                    wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
                    if (wyc != null) {
                        i = C23274hvD.Application.onAvailable;
                        wYC wyc2 = (wYC) ViewBindings.findChildViewById(view, i);
                        if (wyc2 != null) {
                            i = C23274hvD.Application.access000;
                            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = C23274hvD.Application.MediaBrowserCompatMediaBrowserImplApi216;
                                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = C23274hvD.Application.getOptionsList;
                                    OKSortTextView oKSortTextView = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                                    if (oKSortTextView != null) {
                                        i = C23274hvD.Application.getIconBitmap;
                                        OKSortTextView oKSortTextView2 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
                                        if (oKSortTextView2 != null) {
                                            i = C23274hvD.Application.onCaptioningEnabledChanged;
                                            LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                            if (linearLayoutCompat3 != null) {
                                                i = C23274hvD.Application.sendShuffleMode;
                                                OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                                                if (oKReminder != null) {
                                                    i = C23274hvD.Application.getLastPositionUpdateTime;
                                                    C29147koE c29147koE = (C29147koE) ViewBindings.findChildViewById(view, i);
                                                    if (c29147koE != null) {
                                                        i = C23274hvD.Application.setMediaTypeactivity_release;
                                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView != null) {
                                                            i = C23274hvD.Application.setMediaType;
                                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView2 != null) {
                                                                i = C23274hvD.Application.fromInclusive;
                                                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView3 != null) {
                                                                    i = C23274hvD.Application.setOnKeyListener;
                                                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView4 != null) {
                                                                        return new C21494hBl((android.widget.LinearLayout) view, linearLayoutCompat, c52794wYp, linearLayoutCompat2, wyc, wyc2, imageView, imageView2, oKSortTextView, oKSortTextView2, linearLayoutCompat3, oKReminder, c29147koE, textView, textView2, textView3, textView4);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
