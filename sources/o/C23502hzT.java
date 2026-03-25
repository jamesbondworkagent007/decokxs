package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23502hzT implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final LineChart AhwBna;
    public final AppCompatTextView AkhnZx;
    public final AppCompatTextView DbNXlk;
    public final C21970hTb EZpvd;
    public final C55173xeu KWHzl;
    public final Group OLrzqt;
    public final android.view.View copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final AppCompatTextView fetchVPNInfo;
    public final ConstraintLayout gEmmrt;
    public final AppCompatTextView isConnected;
    public final android.view.View valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.valueOf;
    }

    public C23502hzT(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C21970hTb c21970hTb, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull LineChart lineChart, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6) {
        this.valueOf = view;
        this.EZpvd = c21970hTb;
        this.AEQbTJ = constraintLayout;
        this.copydefault = view2;
        this.KWHzl = c55173xeu;
        this.OLrzqt = group;
        this.AYXKKw = appCompatTextView;
        this.AhwBna = lineChart;
        this.gEmmrt = constraintLayout2;
        this.djBIcL = linearLayout;
        this.isConnected = appCompatTextView2;
        this.fetchVPNInfo = appCompatTextView3;
        this.values = appCompatTextView4;
        this.AkhnZx = appCompatTextView5;
        this.DbNXlk = appCompatTextView6;
    }

    public static C23502hzT KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.heceqZ, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C23502hzT EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.gdmIOq;
        C21970hTb c21970hTb = (C21970hTb) ViewBindings.findChildViewById(view, i);
        if (c21970hTb != null) {
            i = C23274hvD.Application.invokespecialgBtXYZ;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.OStAOF))) != null) {
                i = C23274hvD.Application.sZqaRl;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = C23274hvD.Application.RidNCX;
                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                    if (group != null) {
                        i = C23274hvD.Application.getLong;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            i = C23274hvD.Application.getRating;
                            LineChart lineChart = (LineChart) ViewBindings.findChildViewById(view, i);
                            if (lineChart != null) {
                                i = C23274hvD.Application.onMetadataChanged;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout2 != null) {
                                    i = C23274hvD.Application.removeQueueItem;
                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout != null) {
                                        i = C23274hvD.Application.RequiresPermissionRead;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView2 != null) {
                                            i = C23274hvD.Application.RestrictTo;
                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView3 != null) {
                                                i = C23274hvD.Application.getSupportParentActivityIntent;
                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView4 != null) {
                                                    i = C23274hvD.Application.onPostResume;
                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView5 != null) {
                                                        i = C23274hvD.Application.createFromXmlInner;
                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView6 != null) {
                                                            return new C23502hzT(view, c21970hTb, constraintLayout, viewFindChildViewById, c55173xeu, group, appCompatTextView, lineChart, constraintLayout2, linearLayout, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6);
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
