package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import o.C35964oKf;

/* JADX INFO: loaded from: classes23.dex */
public final class oNQ implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final Group AYXKKw;
    public final Group AhwBna;
    public final AppCompatTextView AkhnZx;
    public final android.widget.LinearLayout AuCTel;
    public final AppCompatTextView AuCTelauCTel;
    public final AppCompatTextView AubY;
    public final android.view.View DbNXlk;
    public final C32238mUp EZpvd;
    public final android.view.View KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.view.View copydefault;
    public final Group djBIcL;
    public final ConstraintLayout ejfBZ;
    public final android.view.View fARcdN;
    public final AppCompatTextView fIwbmz;
    public final ConstraintLayout fJNWhG;
    public final LineChart fetchVPNInfo;
    public final android.view.View gEmmrt;
    public final AppCompatTextView getFieldNames;
    public final AppCompatTextView getNewProxyInstance;
    public final AppCompatTextView hDKMBd;
    public final ConstraintLayout isConnected;
    public final AppCompatTextView iwGUEr;
    public final AppCompatTextView uzCIH;
    public final C55173xeu valueOf;
    public final android.view.View values;
    public final AppCompatTextView wlaJM;
    public final AppCompatTextView zLjUOn;
    public final AppCompatTextView zsXlph;
    public final AppCompatTextView zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.fARcdN;
    }

    public oNQ(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C32238mUp c32238mUp, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull android.view.View view4, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull Group group2, @androidx.annotation.NonNull Group group3, @androidx.annotation.NonNull android.view.View view5, @androidx.annotation.NonNull android.view.View view6, @androidx.annotation.NonNull android.view.View view7, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull LineChart lineChart, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7, @androidx.annotation.NonNull AppCompatTextView appCompatTextView8, @androidx.annotation.NonNull AppCompatTextView appCompatTextView9, @androidx.annotation.NonNull AppCompatTextView appCompatTextView10, @androidx.annotation.NonNull AppCompatTextView appCompatTextView11, @androidx.annotation.NonNull AppCompatTextView appCompatTextView12, @androidx.annotation.NonNull AppCompatTextView appCompatTextView13) {
        this.fARcdN = view;
        this.EZpvd = c32238mUp;
        this.OLrzqt = constraintLayout;
        this.AEQbTJ = view2;
        this.KWHzl = view3;
        this.copydefault = view4;
        this.valueOf = c55173xeu;
        this.djBIcL = group;
        this.AYXKKw = group2;
        this.AhwBna = group3;
        this.gEmmrt = view5;
        this.values = view6;
        this.DbNXlk = view7;
        this.AkhnZx = appCompatTextView;
        this.fetchVPNInfo = lineChart;
        this.isConnected = constraintLayout2;
        this.ejfBZ = constraintLayout3;
        this.AuCTel = linearLayout;
        this.fJNWhG = constraintLayout4;
        this.fIwbmz = appCompatTextView2;
        this.iwGUEr = appCompatTextView3;
        this.getNewProxyInstance = appCompatTextView4;
        this.getFieldNames = appCompatTextView5;
        this.hDKMBd = appCompatTextView6;
        this.uzCIH = appCompatTextView7;
        this.AuCTelauCTel = appCompatTextView8;
        this.wlaJM = appCompatTextView9;
        this.zsXlph = appCompatTextView10;
        this.AubY = appCompatTextView11;
        this.zLjUOn = appCompatTextView12;
        this.zuBGHE = appCompatTextView13;
    }

    public static oNQ copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C35964oKf.Application.TarCU, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static oNQ AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        android.view.View viewFindChildViewById3;
        android.view.View viewFindChildViewById4;
        android.view.View viewFindChildViewById5;
        android.view.View viewFindChildViewById6;
        int i = C35964oKf.StateListAnimator.RKDWNf;
        C32238mUp c32238mUp = (C32238mUp) ViewBindings.findChildViewById(view, i);
        if (c32238mUp != null) {
            i = C35964oKf.StateListAnimator.TarCU;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.ihnvzI))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.fXYAwm))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.Th))) != null) {
                i = C35964oKf.StateListAnimator.invokespecialhlXVux;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = C35964oKf.StateListAnimator.DcMfJKDcMfJK;
                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                    if (group != null) {
                        i = C35964oKf.StateListAnimator.DcMfJKdMCrTj;
                        Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                        if (group2 != null) {
                            i = C35964oKf.StateListAnimator.getStatusCode;
                            Group group3 = (Group) ViewBindings.findChildViewById(view, i);
                            if (group3 != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.OEgNct))) != null && (viewFindChildViewById5 = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.OijiEz))) != null && (viewFindChildViewById6 = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.dPkBzA))) != null) {
                                i = C35964oKf.StateListAnimator.getSerial;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    i = C35964oKf.StateListAnimator.DuR;
                                    LineChart lineChart = (LineChart) ViewBindings.findChildViewById(view, i);
                                    if (lineChart != null) {
                                        i = C35964oKf.StateListAnimator.OKSWiw;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout2 != null) {
                                            i = C35964oKf.StateListAnimator.IYdWPz;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout3 != null) {
                                                i = C35964oKf.StateListAnimator.sEcTXd;
                                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout != null) {
                                                    i = C35964oKf.StateListAnimator.OUcgGI;
                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                    if (constraintLayout4 != null) {
                                                        i = C35964oKf.StateListAnimator.MediaMetadataCompatTextKey;
                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView2 != null) {
                                                            i = C35964oKf.StateListAnimator.MediaMetadataCompatLongKey;
                                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatTextView3 != null) {
                                                                i = C35964oKf.StateListAnimator.hasHeart;
                                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView4 != null) {
                                                                    i = C35964oKf.StateListAnimator.RatingCompat1;
                                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (appCompatTextView5 != null) {
                                                                        i = C35964oKf.StateListAnimator.isRated;
                                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (appCompatTextView6 != null) {
                                                                            i = C35964oKf.StateListAnimator.onShuffleModeChanged;
                                                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (appCompatTextView7 != null) {
                                                                                i = C35964oKf.StateListAnimator.addQueueItem;
                                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (appCompatTextView8 != null) {
                                                                                    i = C35964oKf.StateListAnimator.IMediaSession;
                                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (appCompatTextView9 != null) {
                                                                                        i = C35964oKf.StateListAnimator.onSessionEvent;
                                                                                        AppCompatTextView appCompatTextView10 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (appCompatTextView10 != null) {
                                                                                            i = C35964oKf.StateListAnimator.MediaControllerCompatCallbackStubCompat;
                                                                                            AppCompatTextView appCompatTextView11 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (appCompatTextView11 != null) {
                                                                                                i = C35964oKf.StateListAnimator.MediaControllerCompatCallbackStubApi21;
                                                                                                AppCompatTextView appCompatTextView12 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (appCompatTextView12 != null) {
                                                                                                    i = C35964oKf.StateListAnimator.getMaxVolume;
                                                                                                    AppCompatTextView appCompatTextView13 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (appCompatTextView13 != null) {
                                                                                                        return new oNQ(view, c32238mUp, constraintLayout, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, c55173xeu, group, group2, group3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, appCompatTextView, lineChart, constraintLayout2, constraintLayout3, linearLayout, constraintLayout4, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, appCompatTextView10, appCompatTextView11, appCompatTextView12, appCompatTextView13);
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
