package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hCu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21530hCu implements ViewBinding {
    public final C21970hTb AEQbTJ;
    public final android.view.View AYXKKw;
    public final Group AhwBna;
    public final android.widget.LinearLayout AkhnZx;
    public final AppCompatTextView AuCTel;
    public final android.view.View DbNXlk;
    public final android.view.View EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.view.View OLrzqt;
    public final C55173xeu copydefault;
    public final android.view.View djBIcL;
    public final AppCompatTextView ejfBZ;
    public final AppCompatTextView fARcdN;
    public final AppCompatTextView fIwbmz;
    public final AppCompatTextView fJNWhG;
    public final ConstraintLayout fetchVPNInfo;
    public final Group gEmmrt;
    public final AppCompatTextView getFieldNames;
    public final AppCompatTextView getNewProxyInstance;
    public final AppCompatTextView hDKMBd;
    public final ConstraintLayout isConnected;
    public final AppCompatTextView iwGUEr;
    public final LineChart valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.DbNXlk;
    }

    public C21530hCu(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C21970hTb c21970hTb, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull Group group2, @androidx.annotation.NonNull android.view.View view4, @androidx.annotation.NonNull android.view.View view5, @androidx.annotation.NonNull LineChart lineChart, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7, @androidx.annotation.NonNull AppCompatTextView appCompatTextView8, @androidx.annotation.NonNull AppCompatTextView appCompatTextView9, @androidx.annotation.NonNull AppCompatTextView appCompatTextView10) {
        this.DbNXlk = view;
        this.AEQbTJ = c21970hTb;
        this.KWHzl = constraintLayout;
        this.EZpvd = view2;
        this.OLrzqt = view3;
        this.copydefault = c55173xeu;
        this.gEmmrt = group;
        this.AhwBna = group2;
        this.djBIcL = view4;
        this.AYXKKw = view5;
        this.valueOf = lineChart;
        this.isConnected = constraintLayout2;
        this.fetchVPNInfo = constraintLayout3;
        this.AkhnZx = linearLayout;
        this.values = appCompatTextView;
        this.AuCTel = appCompatTextView2;
        this.ejfBZ = appCompatTextView3;
        this.fJNWhG = appCompatTextView4;
        this.fARcdN = appCompatTextView5;
        this.fIwbmz = appCompatTextView6;
        this.iwGUEr = appCompatTextView7;
        this.getFieldNames = appCompatTextView8;
        this.getNewProxyInstance = appCompatTextView9;
        this.hDKMBd = appCompatTextView10;
    }

    public static C21530hCu OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.atDTRm, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C21530hCu KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        android.view.View viewFindChildViewById3;
        android.view.View viewFindChildViewById4;
        int i = C23274hvD.Application.gdmIOq;
        C21970hTb c21970hTb = (C21970hTb) ViewBindings.findChildViewById(view, i);
        if (c21970hTb != null) {
            i = C23274hvD.Application.invokespecialgBtXYZ;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.idLUrz))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.hgxRZI))) != null) {
                i = C23274hvD.Application.sZqaRl;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = C23274hvD.Application.fmdvVn;
                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                    if (group != null) {
                        i = C23274hvD.Application.OeawrHRnVkix;
                        Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                        if (group2 != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.zMXLsR))) != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.SqfPTR))) != null) {
                            i = C23274hvD.Application.getRating;
                            LineChart lineChart = (LineChart) ViewBindings.findChildViewById(view, i);
                            if (lineChart != null) {
                                i = C23274hvD.Application.onExtrasChanged;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout2 != null) {
                                    i = C23274hvD.Application.prepare;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout3 != null) {
                                        i = C23274hvD.Application.removeQueueItem;
                                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = C23274hvD.Application.MenuRes;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView != null) {
                                                i = C23274hvD.Application.NonNull;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView2 != null) {
                                                    i = C23274hvD.Application.createListView;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView3 != null) {
                                                        i = C23274hvD.Application.newView;
                                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView4 != null) {
                                                            i = C23274hvD.Application.AlertControllerAlertParams3;
                                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatTextView5 != null) {
                                                                i = C23274hvD.Application.bindView;
                                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView6 != null) {
                                                                    i = C23274hvD.Application.onCreateSupportNavigateUpTaskStack;
                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (appCompatTextView7 != null) {
                                                                        i = C23274hvD.Application.onContentChanged;
                                                                        AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (appCompatTextView8 != null) {
                                                                            i = C23274hvD.Application.onPostCreate;
                                                                            AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (appCompatTextView9 != null) {
                                                                                i = C23274hvD.Application.createFromXmlInner;
                                                                                AppCompatTextView appCompatTextView10 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (appCompatTextView10 != null) {
                                                                                    return new C21530hCu(view, c21970hTb, constraintLayout, viewFindChildViewById, viewFindChildViewById2, c55173xeu, group, group2, viewFindChildViewById3, viewFindChildViewById4, lineChart, constraintLayout2, constraintLayout3, linearLayout, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, appCompatTextView10);
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
