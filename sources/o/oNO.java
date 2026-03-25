package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import o.C35964oKf;

/* JADX INFO: loaded from: classes23.dex */
public final class oNO implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final Group AYXKKw;
    public final Group AhwBna;
    public final android.widget.LinearLayout AkhnZx;
    public final AppCompatTextView AuCTel;
    public final AppCompatTextView AuCTelauCTel;
    public final AppCompatTextView AubY;
    public final AppCompatTextView AwvSrB;
    public final AppCompatTextView AxsJAY;
    public final LineChart DbNXlk;
    public final android.view.View EZpvd;
    public final android.view.View KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C32238mUp copydefault;
    public final android.view.View djBIcL;
    public final ConstraintLayout ejfBZ;
    public final ConstraintLayout fARcdN;
    public final android.view.View fIwbmz;
    public final AppCompatTextView fJNWhG;
    public final android.view.View fetchVPNInfo;
    public final C55173xeu gEmmrt;
    public final AppCompatTextView gHZMYf;
    public final AppCompatTextView getFieldNames;
    public final AppCompatTextView getNewProxyInstance;
    public final AppCompatTextView hDKMBd;
    public final android.view.View isConnected;
    public final AppCompatTextView iwGUEr;
    public final AppCompatTextView sSMYrx;
    public final AppCompatTextView uzCIH;
    public final Group valueOf;
    public final ConstraintLayout values;
    public final AppCompatTextView wlaJM;
    public final AppCompatTextView zLjUOn;
    public final AppCompatTextView zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.fIwbmz;
    }

    public oNO(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C32238mUp c32238mUp, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull android.view.View view4, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull Group group2, @androidx.annotation.NonNull Group group3, @androidx.annotation.NonNull android.view.View view5, @androidx.annotation.NonNull android.view.View view6, @androidx.annotation.NonNull android.view.View view7, @androidx.annotation.NonNull LineChart lineChart, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull ConstraintLayout constraintLayout4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7, @androidx.annotation.NonNull AppCompatTextView appCompatTextView8, @androidx.annotation.NonNull AppCompatTextView appCompatTextView9, @androidx.annotation.NonNull AppCompatTextView appCompatTextView10, @androidx.annotation.NonNull AppCompatTextView appCompatTextView11, @androidx.annotation.NonNull AppCompatTextView appCompatTextView12, @androidx.annotation.NonNull AppCompatTextView appCompatTextView13, @androidx.annotation.NonNull AppCompatTextView appCompatTextView14, @androidx.annotation.NonNull AppCompatTextView appCompatTextView15, @androidx.annotation.NonNull AppCompatTextView appCompatTextView16) {
        this.fIwbmz = view;
        this.copydefault = c32238mUp;
        this.OLrzqt = constraintLayout;
        this.EZpvd = view2;
        this.AEQbTJ = view3;
        this.KWHzl = view4;
        this.gEmmrt = c55173xeu;
        this.valueOf = group;
        this.AYXKKw = group2;
        this.AhwBna = group3;
        this.djBIcL = view5;
        this.fetchVPNInfo = view6;
        this.isConnected = view7;
        this.DbNXlk = lineChart;
        this.AkhnZx = linearLayout;
        this.values = constraintLayout2;
        this.ejfBZ = constraintLayout3;
        this.fARcdN = constraintLayout4;
        this.AuCTel = appCompatTextView;
        this.fJNWhG = appCompatTextView2;
        this.hDKMBd = appCompatTextView3;
        this.iwGUEr = appCompatTextView4;
        this.uzCIH = appCompatTextView5;
        this.getFieldNames = appCompatTextView6;
        this.getNewProxyInstance = appCompatTextView7;
        this.AuCTelauCTel = appCompatTextView8;
        this.zLjUOn = appCompatTextView9;
        this.zsXlph = appCompatTextView10;
        this.wlaJM = appCompatTextView11;
        this.AubY = appCompatTextView12;
        this.sSMYrx = appCompatTextView13;
        this.AwvSrB = appCompatTextView14;
        this.AxsJAY = appCompatTextView15;
        this.gHZMYf = appCompatTextView16;
    }

    public static oNO copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C35964oKf.Application.RVsVBY, viewGroup);
        return EZpvd(viewGroup);
    }

    public static oNO EZpvd(@androidx.annotation.NonNull android.view.View view) {
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
            if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.isReflectionWorking))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.DQzvGNdrmXxudrmXxu))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.RSDDiY))) != null) {
                i = C35964oKf.StateListAnimator.invokespecialhlXVux;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = C35964oKf.StateListAnimator.fbC;
                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                    if (group != null) {
                        i = C35964oKf.StateListAnimator.DcMfJKfbSiEC;
                        Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                        if (group2 != null) {
                            i = C35964oKf.StateListAnimator.DcMfJKfNLfdT;
                            Group group3 = (Group) ViewBindings.findChildViewById(view, i);
                            if (group3 != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.FQMcgEfQMcgE))) != null && (viewFindChildViewById5 = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.Dap))) != null && (viewFindChildViewById6 = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.svhCHd))) != null) {
                                i = C35964oKf.StateListAnimator.DuR;
                                LineChart lineChart = (LineChart) ViewBindings.findChildViewById(view, i);
                                if (lineChart != null) {
                                    i = C35964oKf.StateListAnimator.sEcTXd;
                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout != null) {
                                        i = C35964oKf.StateListAnimator.QYNZmZ;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout2 != null) {
                                            i = C35964oKf.StateListAnimator.OeawrHOeawrH;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout3 != null) {
                                                i = C35964oKf.StateListAnimator.fmdvVn;
                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout4 != null) {
                                                    i = C35964oKf.StateListAnimator.IMediaControllerCallbackStub;
                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView != null) {
                                                        i = C35964oKf.StateListAnimator.IMediaControllerCallbackStubProxy;
                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView2 != null) {
                                                            i = C35964oKf.StateListAnimator.getLaunchPendingIntent;
                                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatTextView3 != null) {
                                                                i = C35964oKf.StateListAnimator.addQueueItemAt;
                                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView4 != null) {
                                                                    i = C35964oKf.StateListAnimator.adjustVolume;
                                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (appCompatTextView5 != null) {
                                                                        i = C35964oKf.StateListAnimator.getMaxVolume;
                                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (appCompatTextView6 != null) {
                                                                            i = C35964oKf.StateListAnimator.fromToken;
                                                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (appCompatTextView7 != null) {
                                                                                i = C35964oKf.StateListAnimator.MediaControllerCompatTransportControlsApi24;
                                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (appCompatTextView8 != null) {
                                                                                    i = C35964oKf.StateListAnimator.MediaControllerCompatTransportControlsBase;
                                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (appCompatTextView9 != null) {
                                                                                        i = C35964oKf.StateListAnimator.createCallback;
                                                                                        AppCompatTextView appCompatTextView10 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (appCompatTextView10 != null) {
                                                                                            i = C35964oKf.StateListAnimator.MediaControllerCompatApi21Callback;
                                                                                            AppCompatTextView appCompatTextView11 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (appCompatTextView11 != null) {
                                                                                                i = C35964oKf.StateListAnimator.getAudioAttributes;
                                                                                                AppCompatTextView appCompatTextView12 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (appCompatTextView12 != null) {
                                                                                                    i = C35964oKf.StateListAnimator.getLegacyAudioStream;
                                                                                                    AppCompatTextView appCompatTextView13 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (appCompatTextView13 != null) {
                                                                                                        i = C35964oKf.StateListAnimator.MediaControllerCompatApi21CallbackProxy;
                                                                                                        AppCompatTextView appCompatTextView14 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (appCompatTextView14 != null) {
                                                                                                            i = C35964oKf.StateListAnimator.MediaControllerCompatApi21PlaybackInfo;
                                                                                                            AppCompatTextView appCompatTextView15 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (appCompatTextView15 != null) {
                                                                                                                i = C35964oKf.StateListAnimator.toLegacyStreamType;
                                                                                                                AppCompatTextView appCompatTextView16 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (appCompatTextView16 != null) {
                                                                                                                    return new oNO(view, c32238mUp, constraintLayout, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, c55173xeu, group, group2, group3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, lineChart, linearLayout, constraintLayout2, constraintLayout3, constraintLayout4, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, appCompatTextView10, appCompatTextView11, appCompatTextView12, appCompatTextView13, appCompatTextView14, appCompatTextView15, appCompatTextView16);
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
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
