package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hAF implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final Group AYXKKw;
    public final Group AhwBna;
    public final ConstraintLayout AkhnZx;
    public final ConstraintLayout AuCTel;
    public final AppCompatTextView AuCTelauCTel;
    public final AppCompatTextView AubY;
    public final LineChart DbNXlk;
    public final android.view.View EZpvd;
    public final android.view.View KWHzl;
    public final C21970hTb OLrzqt;
    public final android.view.View copydefault;
    public final C55173xeu djBIcL;
    public final android.view.View ejfBZ;
    public final AppCompatTextView fARcdN;
    public final ConstraintLayout fIwbmz;
    public final android.widget.LinearLayout fJNWhG;
    public final android.view.View fetchVPNInfo;
    public final android.view.View gEmmrt;
    public final AppCompatTextView getFieldNames;
    public final AppCompatTextView getNewProxyInstance;
    public final AppCompatTextView hDKMBd;
    public final AppCompatTextView isConnected;
    public final AppCompatTextView iwGUEr;
    public final AppCompatTextView sSMYrx;
    public final AppCompatTextView uzCIH;
    public final Group valueOf;
    public final android.view.View values;
    public final AppCompatTextView wlaJM;
    public final AppCompatTextView zLjUOn;
    public final AppCompatTextView zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.ejfBZ;
    }

    public hAF(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C21970hTb c21970hTb, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull android.view.View view4, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull Group group2, @androidx.annotation.NonNull Group group3, @androidx.annotation.NonNull android.view.View view5, @androidx.annotation.NonNull android.view.View view6, @androidx.annotation.NonNull android.view.View view7, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull LineChart lineChart, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7, @androidx.annotation.NonNull AppCompatTextView appCompatTextView8, @androidx.annotation.NonNull AppCompatTextView appCompatTextView9, @androidx.annotation.NonNull AppCompatTextView appCompatTextView10, @androidx.annotation.NonNull AppCompatTextView appCompatTextView11, @androidx.annotation.NonNull AppCompatTextView appCompatTextView12, @androidx.annotation.NonNull AppCompatTextView appCompatTextView13) {
        this.ejfBZ = view;
        this.OLrzqt = c21970hTb;
        this.AEQbTJ = constraintLayout;
        this.EZpvd = view2;
        this.KWHzl = view3;
        this.copydefault = view4;
        this.djBIcL = c55173xeu;
        this.AhwBna = group;
        this.valueOf = group2;
        this.AYXKKw = group3;
        this.gEmmrt = view5;
        this.fetchVPNInfo = view6;
        this.values = view7;
        this.isConnected = appCompatTextView;
        this.DbNXlk = lineChart;
        this.AkhnZx = constraintLayout2;
        this.AuCTel = constraintLayout3;
        this.fJNWhG = linearLayout;
        this.fIwbmz = constraintLayout4;
        this.fARcdN = appCompatTextView2;
        this.iwGUEr = appCompatTextView3;
        this.getNewProxyInstance = appCompatTextView4;
        this.uzCIH = appCompatTextView5;
        this.getFieldNames = appCompatTextView6;
        this.hDKMBd = appCompatTextView7;
        this.zsXlph = appCompatTextView8;
        this.AuCTelauCTel = appCompatTextView9;
        this.AubY = appCompatTextView10;
        this.wlaJM = appCompatTextView11;
        this.zLjUOn = appCompatTextView12;
        this.sSMYrx = appCompatTextView13;
    }

    public static hAF OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.tIwhY, viewGroup);
        return KWHzl(viewGroup);
    }

    public static hAF KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        android.view.View viewFindChildViewById3;
        android.view.View viewFindChildViewById4;
        android.view.View viewFindChildViewById5;
        android.view.View viewFindChildViewById6;
        int i = C23274hvD.Application.gdmIOq;
        C21970hTb c21970hTb = (C21970hTb) ViewBindings.findChildViewById(view, i);
        if (c21970hTb != null) {
            i = C23274hvD.Application.invokespecialgBtXYZ;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.GiPPlL))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.RihMUf))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.config))) != null) {
                i = C23274hvD.Application.sZqaRl;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = C23274hvD.Application.OeawrHOeawrH;
                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                    if (group != null) {
                        i = C23274hvD.Application.isTimeProfileEmpty;
                        Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                        if (group2 != null) {
                            i = C23274hvD.Application.gvFztT;
                            Group group3 = (Group) ViewBindings.findChildViewById(view, i);
                            if (group3 != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.Srftgn))) != null && (viewFindChildViewById5 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.Slwtri))) != null && (viewFindChildViewById6 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.ibrGus))) != null) {
                                i = C23274hvD.Application.getBundle;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    i = C23274hvD.Application.getRating;
                                    LineChart lineChart = (LineChart) ViewBindings.findChildViewById(view, i);
                                    if (lineChart != null) {
                                        i = C23274hvD.Application.getRatingType;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout2 != null) {
                                            i = C23274hvD.Application.previous;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout3 != null) {
                                                i = C23274hvD.Application.removeQueueItem;
                                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout != null) {
                                                    i = C23274hvD.Application.MediaControllerCompatMediaControllerImplApi21;
                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                    if (constraintLayout4 != null) {
                                                        i = C23274hvD.Application.getDrawerArrowDrawable;
                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView2 != null) {
                                                            i = C23274hvD.Application.onTabUnselected;
                                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatTextView3 != null) {
                                                                i = C23274hvD.Application.setIconAttribute;
                                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView4 != null) {
                                                                    i = C23274hvD.Application.setAdapter;
                                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (appCompatTextView5 != null) {
                                                                        i = C23274hvD.Application.getContext;
                                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (appCompatTextView6 != null) {
                                                                            i = C23274hvD.Application.onMenuOpened;
                                                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (appCompatTextView7 != null) {
                                                                                i = C23274hvD.Application.onNightModeChanged;
                                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (appCompatTextView8 != null) {
                                                                                    i = C23274hvD.Application.onPrepareSupportNavigateUpTaskStack;
                                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (appCompatTextView9 != null) {
                                                                                        i = C23274hvD.Application.completeDeferredDestroyActionMode;
                                                                                        AppCompatTextView appCompatTextView10 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (appCompatTextView10 != null) {
                                                                                            i = C23274hvD.Application.enableContentAnimations;
                                                                                            AppCompatTextView appCompatTextView11 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (appCompatTextView11 != null) {
                                                                                                i = C23274hvD.Application.hideForSystem;
                                                                                                AppCompatTextView appCompatTextView12 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (appCompatTextView12 != null) {
                                                                                                    i = C23274hvD.Application.createFromXmlInner;
                                                                                                    AppCompatTextView appCompatTextView13 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (appCompatTextView13 != null) {
                                                                                                        return new hAF(view, c21970hTb, constraintLayout, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, c55173xeu, group, group2, group3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, appCompatTextView, lineChart, constraintLayout2, constraintLayout3, linearLayout, constraintLayout4, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, appCompatTextView10, appCompatTextView11, appCompatTextView12, appCompatTextView13);
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
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
