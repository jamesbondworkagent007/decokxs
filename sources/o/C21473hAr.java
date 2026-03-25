package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hAr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21473hAr implements ViewBinding {
    public final kLP AEQbTJ;
    public final C33604mzb AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final kMB DbNXlk;
    public final C55173xeu EZpvd;
    public final wYC KWHzl;
    public final C55052xcf OLrzqt;
    public final C55113xdn copydefault;
    public final C33603mza djBIcL;
    public final android.widget.FrameLayout gEmmrt;
    public final C33546myW isConnected;
    public final RecyclerView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AhwBna;
    }

    public C21473hAr(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull kLP klp, @androidx.annotation.NonNull C55052xcf c55052xcf, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33604mzb c33604mzb, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull kMB kmb) {
        this.AhwBna = linearLayoutCompat;
        this.AEQbTJ = klp;
        this.OLrzqt = c55052xcf;
        this.EZpvd = c55173xeu;
        this.KWHzl = wyc;
        this.copydefault = c55113xdn;
        this.gEmmrt = frameLayout;
        this.valueOf = recyclerView;
        this.AYXKKw = c33604mzb;
        this.djBIcL = c33603mza;
        this.isConnected = c33546myW;
        this.DbNXlk = kmb;
    }

    public static C21473hAr EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.aJZHYI;
        kLP klp = (kLP) ViewBindings.findChildViewById(view, i);
        if (klp != null) {
            i = C23274hvD.Application.invokespecialDPHOMC;
            C55052xcf c55052xcf = (C55052xcf) ViewBindings.findChildViewById(view, i);
            if (c55052xcf != null) {
                i = C23274hvD.Application.QsIRgs;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = C23274hvD.Application.RIsQag;
                    wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
                    if (wyc != null) {
                        i = C23274hvD.Application.MediaControllerCompatApi21TransportControls;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = C23274hvD.Application.getStateWithUpdatedPosition;
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout != null) {
                                i = C23274hvD.Application.ComponentActivity22;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = C23274hvD.Application.execute;
                                    C33604mzb c33604mzb = (C33604mzb) ViewBindings.findChildViewById(view, i);
                                    if (c33604mzb != null) {
                                        i = C23274hvD.Application.ComponentActivityReportFullyDrawnExecutor;
                                        C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                        if (c33603mza != null) {
                                            i = C23274hvD.Application.ActivityResultLauncherHolder;
                                            C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                            if (c33546myW != null) {
                                                i = C23274hvD.Application.BaseMenuWrapper;
                                                kMB kmb = (kMB) ViewBindings.findChildViewById(view, i);
                                                if (kmb != null) {
                                                    return new C21473hAr((LinearLayoutCompat) view, klp, c55052xcf, c55173xeu, wyc, c55113xdn, frameLayout, recyclerView, c33604mzb, c33603mza, c33546myW, kmb);
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
