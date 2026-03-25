package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes18.dex */
public final class oNY implements ViewBinding {
    public final C34412nbb AEQbTJ;
    public final C34390nbF AYXKKw;
    public final C34431nbu AhwBna;
    public final C33603mza AkhnZx;
    public final NestedScrollView DbNXlk;
    public final C34404nbT EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final C55173xeu OLrzqt;
    public final C34429nbs copydefault;
    public final LinearLayoutCompat djBIcL;
    public final ConstraintLayout fetchVPNInfo;
    public final C34396nbL gEmmrt;
    public final C33546myW isConnected;
    public final C55113xdn valueOf;
    public final C34400nbP values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.fetchVPNInfo;
    }

    public oNY(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C34404nbT c34404nbT, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C34429nbs c34429nbs, @androidx.annotation.NonNull C34412nbb c34412nbb, @androidx.annotation.NonNull C34431nbu c34431nbu, @androidx.annotation.NonNull C34390nbF c34390nbF, @androidx.annotation.NonNull C34396nbL c34396nbL, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C34400nbP c34400nbP) {
        this.fetchVPNInfo = constraintLayout;
        this.EZpvd = c34404nbT;
        this.OLrzqt = c55173xeu;
        this.KWHzl = frameLayout;
        this.copydefault = c34429nbs;
        this.AEQbTJ = c34412nbb;
        this.AhwBna = c34431nbu;
        this.AYXKKw = c34390nbF;
        this.gEmmrt = c34396nbL;
        this.djBIcL = linearLayoutCompat;
        this.valueOf = c55113xdn;
        this.DbNXlk = nestedScrollView;
        this.AkhnZx = c33603mza;
        this.isConnected = c33546myW;
        this.values = c34400nbP;
    }

    public static oNY EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.UscePu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static oNY copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.gtdfxv;
        C34404nbT c34404nbT = (C34404nbT) ViewBindings.findChildViewById(view, i);
        if (c34404nbT != null) {
            i = C35964oKf.StateListAnimator.invokespecialhlXVux;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C35964oKf.StateListAnimator.DcMfJKDCKfqPDCfLja;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C35964oKf.StateListAnimator.onLocationChanged;
                    C34429nbs c34429nbs = (C34429nbs) ViewBindings.findChildViewById(view, i);
                    if (c34429nbs != null) {
                        i = C35964oKf.StateListAnimator.sEAkxl;
                        C34412nbb c34412nbb = (C34412nbb) ViewBindings.findChildViewById(view, i);
                        if (c34412nbb != null) {
                            i = C35964oKf.StateListAnimator.DAgZj;
                            C34431nbu c34431nbu = (C34431nbu) ViewBindings.findChildViewById(view, i);
                            if (c34431nbu != null) {
                                i = C35964oKf.StateListAnimator.onProviderEnabled;
                                C34390nbF c34390nbF = (C34390nbF) ViewBindings.findChildViewById(view, i);
                                if (c34390nbF != null) {
                                    i = C35964oKf.StateListAnimator.gZKUVK;
                                    C34396nbL c34396nbL = (C34396nbL) ViewBindings.findChildViewById(view, i);
                                    if (c34396nbL != null) {
                                        i = C35964oKf.StateListAnimator.OeawrH;
                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat != null) {
                                            i = C35964oKf.StateListAnimator.OhcwxsRkSIEV;
                                            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                            if (c55113xdn != null) {
                                                i = C35964oKf.StateListAnimator.ZGRCNj;
                                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                                if (nestedScrollView != null) {
                                                    i = C35964oKf.StateListAnimator.ICustomTabsCallback;
                                                    C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                                    if (c33603mza != null) {
                                                        i = C35964oKf.StateListAnimator.getNotifyChildrenChangedOptions;
                                                        C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                                        if (c33546myW != null) {
                                                            i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2;
                                                            C34400nbP c34400nbP = (C34400nbP) ViewBindings.findChildViewById(view, i);
                                                            if (c34400nbP != null) {
                                                                return new oNY((ConstraintLayout) view, c34404nbT, c55173xeu, frameLayout, c34429nbs, c34412nbb, c34431nbu, c34390nbF, c34396nbL, linearLayoutCompat, c55113xdn, nestedScrollView, c33603mza, c33546myW, c34400nbP);
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
