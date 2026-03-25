package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import o.C35964oKf;

/* JADX INFO: loaded from: classes23.dex */
public final class oNG implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final AppCompatTextView AhwBna;
    public final AppCompatTextView AkhnZx;
    public final AppCompatTextView DbNXlk;
    public final C32238mUp EZpvd;
    public final android.view.View KWHzl;
    public final Group OLrzqt;
    public final C55173xeu copydefault;
    public final android.view.View djBIcL;
    public final AppCompatTextView fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public final AppCompatTextView isConnected;
    public final LineChart valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.djBIcL;
    }

    public oNG(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C32238mUp c32238mUp, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull LineChart lineChart, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6) {
        this.djBIcL = view;
        this.EZpvd = c32238mUp;
        this.AEQbTJ = constraintLayout;
        this.KWHzl = view2;
        this.copydefault = c55173xeu;
        this.OLrzqt = group;
        this.AhwBna = appCompatTextView;
        this.valueOf = lineChart;
        this.AYXKKw = constraintLayout2;
        this.gEmmrt = linearLayout;
        this.isConnected = appCompatTextView2;
        this.values = appCompatTextView3;
        this.DbNXlk = appCompatTextView4;
        this.AkhnZx = appCompatTextView5;
        this.fetchVPNInfo = appCompatTextView6;
    }

    public static oNG AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C35964oKf.Application.heceqZ, viewGroup);
        return copydefault(viewGroup);
    }

    public static oNG copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35964oKf.StateListAnimator.RKDWNf;
        C32238mUp c32238mUp = (C32238mUp) ViewBindings.findChildViewById(view, i);
        if (c32238mUp != null) {
            i = C35964oKf.StateListAnimator.TarCU;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.DPhTBN))) != null) {
                i = C35964oKf.StateListAnimator.invokespecialhlXVux;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = C35964oKf.StateListAnimator.DcMfJKOmnske;
                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                    if (group != null) {
                        i = C35964oKf.StateListAnimator.HJWChPRGtXKCRGtXKC;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            i = C35964oKf.StateListAnimator.DuR;
                            LineChart lineChart = (LineChart) ViewBindings.findChildViewById(view, i);
                            if (lineChart != null) {
                                i = C35964oKf.StateListAnimator.DpxfQh;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout2 != null) {
                                    i = C35964oKf.StateListAnimator.sEcTXd;
                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout != null) {
                                        i = C35964oKf.StateListAnimator.setDescription;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView2 != null) {
                                            i = C35964oKf.StateListAnimator.setMediaId;
                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView3 != null) {
                                                i = C35964oKf.StateListAnimator.onSessionReady;
                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView4 != null) {
                                                    i = C35964oKf.StateListAnimator.onSessionDestroyed;
                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView5 != null) {
                                                        i = C35964oKf.StateListAnimator.getMaxVolume;
                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView6 != null) {
                                                            return new oNG(view, c32238mUp, constraintLayout, viewFindChildViewById, c55173xeu, group, appCompatTextView, lineChart, constraintLayout2, linearLayout, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6);
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
