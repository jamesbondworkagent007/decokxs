package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oOg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C36073oOg implements ViewBinding {
    public final C32238mUp AEQbTJ;
    public final Group AYXKKw;
    public final android.view.View AhwBna;
    public final AppCompatTextView AkhnZx;
    public final AppCompatTextView AuCTel;
    public final ConstraintLayout DbNXlk;
    public final android.view.View EZpvd;
    public final android.view.View KWHzl;
    public final C55173xeu OLrzqt;
    public final ConstraintLayout copydefault;
    public final LineChart djBIcL;
    public final AppCompatTextView ejfBZ;
    public final AppCompatTextView fARcdN;
    public final AppCompatTextView fIwbmz;
    public final AppCompatTextView fJNWhG;
    public final android.view.View fetchVPNInfo;
    public final android.view.View gEmmrt;
    public final AppCompatTextView getNewProxyInstance;
    public final AppCompatTextView hDKMBd;
    public final android.widget.LinearLayout isConnected;
    public final AppCompatTextView iwGUEr;
    public final AppCompatTextView uzCIH;
    public final Group valueOf;
    public final ConstraintLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.fetchVPNInfo;
    }

    public C36073oOg(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C32238mUp c32238mUp, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull Group group2, @androidx.annotation.NonNull android.view.View view4, @androidx.annotation.NonNull android.view.View view5, @androidx.annotation.NonNull LineChart lineChart, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7, @androidx.annotation.NonNull AppCompatTextView appCompatTextView8, @androidx.annotation.NonNull AppCompatTextView appCompatTextView9, @androidx.annotation.NonNull AppCompatTextView appCompatTextView10) {
        this.fetchVPNInfo = view;
        this.AEQbTJ = c32238mUp;
        this.copydefault = constraintLayout;
        this.KWHzl = view2;
        this.EZpvd = view3;
        this.OLrzqt = c55173xeu;
        this.valueOf = group;
        this.AYXKKw = group2;
        this.AhwBna = view4;
        this.gEmmrt = view5;
        this.djBIcL = lineChart;
        this.DbNXlk = constraintLayout2;
        this.values = constraintLayout3;
        this.isConnected = linearLayout;
        this.AkhnZx = appCompatTextView;
        this.fARcdN = appCompatTextView2;
        this.AuCTel = appCompatTextView3;
        this.fJNWhG = appCompatTextView4;
        this.fIwbmz = appCompatTextView5;
        this.ejfBZ = appCompatTextView6;
        this.uzCIH = appCompatTextView7;
        this.getNewProxyInstance = appCompatTextView8;
        this.hDKMBd = appCompatTextView9;
        this.iwGUEr = appCompatTextView10;
    }

    public static C36073oOg copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C35964oKf.Application.hlkKmr, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C36073oOg AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        android.view.View viewFindChildViewById3;
        android.view.View viewFindChildViewById4;
        int i = C35964oKf.StateListAnimator.RKDWNf;
        C32238mUp c32238mUp = (C32238mUp) ViewBindings.findChildViewById(view, i);
        if (c32238mUp != null) {
            i = C35964oKf.StateListAnimator.TarCU;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.RAQtXZ))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.DQYQgr))) != null) {
                i = C35964oKf.StateListAnimator.invokespecialhlXVux;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = C35964oKf.StateListAnimator.jh;
                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                    if (group != null) {
                        i = C35964oKf.StateListAnimator.DcMfJKRKUgwx;
                        Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                        if (group2 != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.apAOXX))) != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.gqOnQv))) != null) {
                            i = C35964oKf.StateListAnimator.DuR;
                            LineChart lineChart = (LineChart) ViewBindings.findChildViewById(view, i);
                            if (lineChart != null) {
                                i = C35964oKf.StateListAnimator.aBDePw;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout2 != null) {
                                    i = C35964oKf.StateListAnimator.aWJMta;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout3 != null) {
                                        i = C35964oKf.StateListAnimator.sEcTXd;
                                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = C35964oKf.StateListAnimator.getMediaUri;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView != null) {
                                                i = C35964oKf.StateListAnimator.fromMediaDescription;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView2 != null) {
                                                    i = C35964oKf.StateListAnimator.newUnratedRating;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView3 != null) {
                                                        i = C35964oKf.StateListAnimator.newStarRating;
                                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView4 != null) {
                                                            i = C35964oKf.StateListAnimator.getRatingStyle;
                                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatTextView5 != null) {
                                                                i = C35964oKf.StateListAnimator.getStarRating;
                                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView6 != null) {
                                                                    i = C35964oKf.StateListAnimator.onRepeatModeChanged;
                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (appCompatTextView7 != null) {
                                                                        i = C35964oKf.StateListAnimator.onShuffleModeChangedRemoved;
                                                                        AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (appCompatTextView8 != null) {
                                                                            i = C35964oKf.StateListAnimator.onVolumeInfoChanged;
                                                                            AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (appCompatTextView9 != null) {
                                                                                i = C35964oKf.StateListAnimator.getMaxVolume;
                                                                                AppCompatTextView appCompatTextView10 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (appCompatTextView10 != null) {
                                                                                    return new C36073oOg(view, c32238mUp, constraintLayout, viewFindChildViewById, viewFindChildViewById2, c55173xeu, group, group2, viewFindChildViewById3, viewFindChildViewById4, lineChart, constraintLayout2, constraintLayout3, linearLayout, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, appCompatTextView10);
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
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
