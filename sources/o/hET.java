package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hET implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final C55113xdn AhwBna;
    public final ConstraintLayout AkhnZx;
    public final C54989xbV DbNXlk;
    public final RecyclerView EZpvd;
    public final C55173xeu KWHzl;
    public final android.view.View OLrzqt;
    public final AppCompatImageView copydefault;
    public final ConstraintLayout djBIcL;
    public final RecyclerView ejfBZ;
    public final android.widget.TextView fIwbmz;
    public final C54989xbV fJNWhG;
    public final C33546myW fetchVPNInfo;
    public final C54989xbV gEmmrt;
    public final C55249xgQ isConnected;
    public final AppCompatImageView valueOf;
    public final C33603mza values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AkhnZx;
    }

    public hET(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull C54989xbV c54989xbV, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C55249xgQ c55249xgQ, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C54989xbV c54989xbV2, @androidx.annotation.NonNull C54989xbV c54989xbV3, @androidx.annotation.NonNull RecyclerView recyclerView2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AkhnZx = constraintLayout;
        this.EZpvd = recyclerView;
        this.KWHzl = c55173xeu;
        this.OLrzqt = view;
        this.AEQbTJ = linearLayoutCompat;
        this.copydefault = appCompatImageView;
        this.AYXKKw = constraintLayout2;
        this.valueOf = appCompatImageView2;
        this.AhwBna = c55113xdn;
        this.djBIcL = constraintLayout3;
        this.gEmmrt = c54989xbV;
        this.values = c33603mza;
        this.isConnected = c55249xgQ;
        this.fetchVPNInfo = c33546myW;
        this.DbNXlk = c54989xbV2;
        this.fJNWhG = c54989xbV3;
        this.ejfBZ = recyclerView2;
        this.fIwbmz = textView;
    }

    public static hET AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.fARcdN;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C23274hvD.Application.sZqaRl;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.dNxZaP))) != null) {
                i = C23274hvD.Application.UCQKYV;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = C23274hvD.Application.DzCpqu;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null) {
                        i = C23274hvD.Application.sVaiLC;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = C23274hvD.Application.asBinder;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView2 != null) {
                                i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                if (c55113xdn != null) {
                                    i = C23274hvD.Application.MediaSessionCompatMediaSessionImplApi28ExternalSyntheticApiModelOutline0;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout2 != null) {
                                        i = C23274hvD.Application.MediaSessionCompatApi21CallbackProxy;
                                        C54989xbV c54989xbV = (C54989xbV) ViewBindings.findChildViewById(view, i);
                                        if (c54989xbV != null) {
                                            i = C23274hvD.Application.ComponentActivityReportFullyDrawnExecutor;
                                            C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                            if (c33603mza != null) {
                                                i = C23274hvD.Application.setOnBackInvokedDispatcher;
                                                C55249xgQ c55249xgQ = (C55249xgQ) ViewBindings.findChildViewById(view, i);
                                                if (c55249xgQ != null) {
                                                    i = C23274hvD.Application.getLauncher;
                                                    C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                                    if (c33546myW != null) {
                                                        i = C23274hvD.Application.ActivityResultRegistryKtrememberLauncherForActivityResultkey1;
                                                        C54989xbV c54989xbV2 = (C54989xbV) ViewBindings.findChildViewById(view, i);
                                                        if (c54989xbV2 != null) {
                                                            i = C23274hvD.Application.getSystemFallbackPickeractivity_release;
                                                            C54989xbV c54989xbV3 = (C54989xbV) ViewBindings.findChildViewById(view, i);
                                                            if (c54989xbV3 != null) {
                                                                i = C23274hvD.Application.DimensionCompanion;
                                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                if (recyclerView2 != null) {
                                                                    i = C23274hvD.Application.mask;
                                                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView != null) {
                                                                        return new hET((ConstraintLayout) view, recyclerView, c55173xeu, viewFindChildViewById, linearLayoutCompat, appCompatImageView, constraintLayout, appCompatImageView2, c55113xdn, constraintLayout2, c54989xbV, c33603mza, c55249xgQ, c33546myW, c54989xbV2, c54989xbV3, recyclerView2, textView);
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
