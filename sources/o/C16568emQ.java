package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16568emQ implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final C33546myW AYXKKw;
    public final android.widget.FrameLayout AhwBna;
    public final android.widget.TextView DbNXlk;
    public final LinearLayoutCompat EZpvd;
    public final C55173xeu KWHzl;
    public final C52794wYp OLrzqt;
    public final C52794wYp copydefault;
    public final RecyclerView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final C33603mza gEmmrt;
    public final android.widget.TextView isConnected;
    public final C33604mzb valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AhwBna;
    }

    public C16568emQ(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull C52794wYp c52794wYp3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C33604mzb c33604mzb, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.AhwBna = frameLayout;
        this.OLrzqt = c52794wYp;
        this.AEQbTJ = c52794wYp2;
        this.copydefault = c52794wYp3;
        this.EZpvd = linearLayoutCompat;
        this.KWHzl = c55173xeu;
        this.AYXKKw = c33546myW;
        this.valueOf = c33604mzb;
        this.gEmmrt = c33603mza;
        this.djBIcL = recyclerView;
        this.DbNXlk = textView;
        this.fetchVPNInfo = textView2;
        this.isConnected = textView3;
        this.values = textView4;
    }

    public static C16568emQ copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.zlvcHA;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C13754dXa.ActionBar.DGUQLIDGUQLI;
            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp2 != null) {
                i = C13754dXa.ActionBar.gwwfep;
                C52794wYp c52794wYp3 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp3 != null) {
                    i = C13754dXa.ActionBar.fiXcQa;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = C13754dXa.ActionBar.zXhzOT;
                        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                        if (c55173xeu != null) {
                            i = C13754dXa.ActionBar.getSupportedCipherSuites;
                            C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                            if (c33546myW != null) {
                                i = C13754dXa.ActionBar.getShuffleMode;
                                C33604mzb c33604mzb = (C33604mzb) ViewBindings.findChildViewById(view, i);
                                if (c33604mzb != null) {
                                    i = C13754dXa.ActionBar.getVolumeAttributes;
                                    C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                    if (c33603mza != null) {
                                        i = C13754dXa.ActionBar.MediaControllerCompatCallbackStubApi21;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                        if (recyclerView != null) {
                                            i = C13754dXa.ActionBar.postWhenReportersAreDone;
                                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                i = C13754dXa.ActionBar.BackHandlerKtBackHandler11;
                                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    i = C13754dXa.ActionBar.accessBackHandlerlambda0;
                                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null) {
                                                        i = C13754dXa.ActionBar.clearObservers;
                                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView4 != null) {
                                                            return new C16568emQ((android.widget.FrameLayout) view, c52794wYp, c52794wYp2, c52794wYp3, linearLayoutCompat, c55173xeu, c33546myW, c33604mzb, c33603mza, recyclerView, textView, textView2, textView3, textView4);
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
