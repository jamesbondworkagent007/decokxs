package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.eop.fragment.EopFaceResultFragment$refreshUI$4$4;
import com.okinc.liveness.eop.fragment.EopFaceResultFragment$refreshUI$6$3;
import com.okinc.liveness.eop.fragment.EopFaceResultFragment$refreshUI$6$4;
import com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C45508srO;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pRb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38231pRb extends AbstractC32996moC {
    public C52794wYp AEQbTJ;
    public final int AYXKKw = C45508srO.Activity.copydefault;
    public android.widget.LinearLayout AhwBna;
    public android.widget.LinearLayout AkhnZx;
    public android.widget.TextView DbNXlk;
    public C52794wYp EZpvd;
    public pRZ KWHzl;
    public C33537myN OLrzqt;
    public EopLivenessBasicViewModel copydefault;
    public android.widget.LinearLayout djBIcL;
    public C55113xdn fetchVPNInfo;
    public android.widget.FrameLayout gEmmrt;
    public android.widget.TextView isConnected;
    public android.widget.LinearLayout valueOf;
    public android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String strIsConnected;
        super.onCreate(bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        this.copydefault = (EopLivenessBasicViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(EopLivenessBasicViewModel.class);
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
        this.KWHzl = (pRZ) new ViewModelProvider(fragmentActivityRequireActivity2).get(pRZ.class);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("AWSSelfieCaptured_Full_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38231pRb.DbNXlk(this.OLrzqt, (EventParamsList) obj);
            }
        });
        java.lang.String strCopydefault = copydefault();
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.copydefault;
        if (eopLivenessBasicViewModel != null && (strIsConnected = eopLivenessBasicViewModel.isConnected()) != null) {
            str = strIsConnected;
        }
        pUU.KWHzl("kyc_in_house", "AWSSelfieCaptured_Full_Page_View onCreate " + strCopydefault + " " + str);
    }

    public static final Unit DbNXlk(C38231pRb c38231pRb, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ENTRANCE, "onCreate", false, 4, null);
        EventParamsList.put$default(eventParamsList, "status", c38231pRb.copydefault(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, c38231pRb.EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", c38231pRb.OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, c38231pRb.AEQbTJ(), false, 4, null);
        EopLivenessBasicViewModel eopLivenessBasicViewModel = c38231pRb.copydefault;
        EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, (eopLivenessBasicViewModel == null || !eopLivenessBasicViewModel.zsXlph()) ? "false" : "true", false, 4, null);
        return Unit.INSTANCE;
    }

    private final java.lang.String EZpvd() {
        java.lang.String strIsConnected;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.copydefault;
        return (eopLivenessBasicViewModel == null || (strIsConnected = eopLivenessBasicViewModel.isConnected()) == null) ? "" : strIsConnected;
    }

    private final java.lang.String OLrzqt() {
        java.lang.String strOcIXYQ;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.copydefault;
        return (eopLivenessBasicViewModel == null || (strOcIXYQ = eopLivenessBasicViewModel.OcIXYQ()) == null) ? "" : strOcIXYQ;
    }

    private final java.lang.String AEQbTJ() {
        java.lang.String strORxRYg;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.copydefault;
        return (eopLivenessBasicViewModel == null || (strORxRYg = eopLivenessBasicViewModel.ORxRYg()) == null) ? "" : strORxRYg;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return layoutInflater.inflate(C45508srO.Activity.copydefault, viewGroup, false);
    }

    public static /* synthetic */ AppCompatTextView createNoteTextView$default(C38231pRb c38231pRb, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c38231pRb.AEQbTJ(str, z);
    }

    public final AppCompatTextView AEQbTJ(java.lang.String str, boolean z) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(requireActivity());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z ? -1 : -2, -2);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        int iCopydefault = C55298xhM.copydefault(4.0f, (android.content.Context) fragmentActivityRequireActivity);
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
        int iCopydefault2 = C55298xhM.copydefault(24.0f, (android.content.Context) fragmentActivityRequireActivity2);
        layoutParams.setMarginStart(iCopydefault2);
        layoutParams.topMargin = iCopydefault;
        layoutParams.setMarginEnd(iCopydefault2);
        layoutParams.bottomMargin = iCopydefault;
        if (z) {
            layoutParams.gravity = 1;
        }
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setText(str);
        appCompatTextView.setTextAppearance(C52761wXj.LoaderManager.KWHzl);
        appCompatTextView.setTextColor(ContextCompat.getColor(requireContext(), C52761wXj.Activity.Dmq));
        if (!z) {
            appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(C45508srO.ActionBar.EZpvd, 0, 0, 0);
            appCompatTextView.setCompoundDrawablePadding(iCopydefault);
        } else {
            appCompatTextView.setGravity(17);
        }
        return appCompatTextView;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        pRV<java.lang.Boolean> prvZuBGHE;
        LiveData<C43734ruq<java.lang.Boolean>> liveDataWlaJM;
        LiveData<C43734ruq<java.lang.Boolean>> liveDataZLjUOn;
        pRV<java.lang.String> prvFARcdN;
        Intrinsics.checkNotNullParameter(view, "");
        this.OLrzqt = (C33537myN) view.findViewById(C45508srO.TaskDescription.AEQbTJ);
        this.AEQbTJ = (C52794wYp) view.findViewById(C45508srO.TaskDescription.gEmmrt);
        this.EZpvd = (C52794wYp) view.findViewById(C45508srO.TaskDescription.KWHzl);
        this.AkhnZx = (android.widget.LinearLayout) view.findViewById(C45508srO.TaskDescription.fARcdN);
        this.valueOf = (android.widget.LinearLayout) view.findViewById(C45508srO.TaskDescription.isConnected);
        this.values = (android.widget.TextView) view.findViewById(C45508srO.TaskDescription.hDKMBd);
        this.AhwBna = (android.widget.LinearLayout) view.findViewById(C45508srO.TaskDescription.values);
        this.isConnected = (android.widget.TextView) view.findViewById(C45508srO.TaskDescription.getNewProxyInstance);
        this.gEmmrt = (android.widget.FrameLayout) view.findViewById(C45508srO.TaskDescription.djBIcL);
        this.fetchVPNInfo = (C55113xdn) view.findViewById(C45508srO.TaskDescription.fJNWhG);
        this.djBIcL = (android.widget.LinearLayout) view.findViewById(C45508srO.TaskDescription.AYXKKw);
        this.DbNXlk = (android.widget.TextView) view.findViewById(C45508srO.TaskDescription.fIwbmz);
        android.widget.FrameLayout frameLayout = this.gEmmrt;
        C33537myN c33537myN = null;
        if (frameLayout == null) {
            Intrinsics.gEmmrt("");
            frameLayout = null;
        }
        frameLayout.setPadding(0, C33570myu.gEmmrt(requireActivity()), 0, 0);
        C33537myN c33537myN2 = this.OLrzqt;
        if (c33537myN2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c33537myN = c33537myN2;
        }
        c33537myN.setSubDoImageVisible(0);
        c33537myN.setBackImageVisible(8);
        c33537myN.setSubDoListener(new View.OnClickListener() { // from class: o.pRg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C38231pRb.KWHzl(this.KWHzl, view2);
            }
        });
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.copydefault;
        if (eopLivenessBasicViewModel != null && (prvFARcdN = eopLivenessBasicViewModel.fARcdN()) != null) {
            C43733rup.copydefault(prvFARcdN, this, new Function1() { // from class: o.pRi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38231pRb.OLrzqt(this.copydefault, (java.lang.String) obj);
                }
            });
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel2 = this.copydefault;
        if (eopLivenessBasicViewModel2 != null && (liveDataZLjUOn = eopLivenessBasicViewModel2.zLjUOn()) != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            C43733rup.copydefault(liveDataZLjUOn, viewLifecycleOwner, new Function1() { // from class: o.pRj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38231pRb.KWHzl(this.EZpvd, (C43734ruq) obj);
                }
            });
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel3 = this.copydefault;
        if (eopLivenessBasicViewModel3 != null && (liveDataWlaJM = eopLivenessBasicViewModel3.wlaJM()) != null) {
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
            C43733rup.copydefault(liveDataWlaJM, viewLifecycleOwner2, new Function1() { // from class: o.pRk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38231pRb.copydefault(this.EZpvd, (C43734ruq) obj);
                }
            });
        }
        EopLivenessBasicViewModel eopLivenessBasicViewModel4 = this.copydefault;
        if (eopLivenessBasicViewModel4 != null && (prvZuBGHE = eopLivenessBasicViewModel4.zuBGHE()) != null) {
            C43733rup.copydefault(prvZuBGHE, this, new Function1() { // from class: o.pRm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38231pRb.OLrzqt(this.EZpvd, (java.lang.Boolean) obj);
                }
            });
        }
        AhwBna();
    }

    public static final void KWHzl(final C38231pRb c38231pRb, android.view.View view) {
        EopLivenessBasicViewModel eopLivenessBasicViewModel = c38231pRb.copydefault;
        if (eopLivenessBasicViewModel != null) {
            eopLivenessBasicViewModel.copydefault("AWS_RESULT_CLOSE");
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("AWSSelfieCaptured_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38231pRb.djBIcL(this.KWHzl, (EventParamsList) obj);
            }
        });
        pUU.KWHzl("kyc_in_house", "AWSSelfieCaptured_Full_Button_Click subDo close " + c38231pRb.copydefault());
    }

    public static final Unit djBIcL(C38231pRb c38231pRb, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, EopTrackEvent.CLOSE, false, 4, null);
        EventParamsList.put$default(eventParamsList, "status", c38231pRb.copydefault(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, c38231pRb.EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", c38231pRb.OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, c38231pRb.AEQbTJ(), false, 4, null);
        EopLivenessBasicViewModel eopLivenessBasicViewModel = c38231pRb.copydefault;
        EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, (eopLivenessBasicViewModel == null || !eopLivenessBasicViewModel.zsXlph()) ? "false" : "true", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C38231pRb c38231pRb, java.lang.String str) {
        EopLivenessBasicViewModel.TaskDescription taskDescription = EopLivenessBasicViewModel.Companion;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) taskDescription.KWHzl())) {
            EopLivenessBasicViewModel eopLivenessBasicViewModel = c38231pRb.copydefault;
            if (eopLivenessBasicViewModel != null) {
                eopLivenessBasicViewModel.copydefault("AWS_RESULT_RETRY");
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) taskDescription.copydefault())) {
            C52794wYp c52794wYp = c38231pRb.AEQbTJ;
            if (c52794wYp == null) {
                Intrinsics.gEmmrt("");
                c52794wYp = null;
            }
            c52794wYp.fIwbmz();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C38231pRb c38231pRb, C43734ruq c43734ruq) {
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        java.lang.Boolean bool = (java.lang.Boolean) c43734ruq.EZpvd();
        if (bool != null) {
            c38231pRb.KWHzl(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C38231pRb c38231pRb, C43734ruq c43734ruq) {
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        java.lang.Boolean bool = (java.lang.Boolean) c43734ruq.EZpvd();
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            pUU.KWHzl("qjf", "EopFaceLivenessErrorFragment->needLoading = " + zBooleanValue);
            android.view.View view = null;
            if (zBooleanValue) {
                android.widget.FrameLayout frameLayout = c38231pRb.gEmmrt;
                if (frameLayout == null) {
                    Intrinsics.gEmmrt("");
                    frameLayout = null;
                }
                if (frameLayout.getVisibility() != 0) {
                    android.widget.FrameLayout frameLayout2 = c38231pRb.gEmmrt;
                    if (frameLayout2 == null) {
                        Intrinsics.gEmmrt("");
                        frameLayout2 = null;
                    }
                    frameLayout2.setVisibility(0);
                    C55113xdn c55113xdn = c38231pRb.fetchVPNInfo;
                    if (c55113xdn == null) {
                        Intrinsics.gEmmrt("");
                        c55113xdn = null;
                    }
                    c55113xdn.setAutoMirrored(true);
                    C55113xdn c55113xdn2 = c38231pRb.fetchVPNInfo;
                    if (c55113xdn2 == null) {
                        Intrinsics.gEmmrt("");
                        c55113xdn2 = null;
                    }
                    c55113xdn2.KWHzl(0L);
                    android.widget.LinearLayout linearLayout = c38231pRb.djBIcL;
                    if (linearLayout == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        view = linearLayout;
                    }
                    view.setVisibility(8);
                }
            } else {
                android.widget.LinearLayout linearLayout2 = c38231pRb.djBIcL;
                if (linearLayout2 == null) {
                    Intrinsics.gEmmrt("");
                    linearLayout2 = null;
                }
                linearLayout2.setVisibility(0);
                C55113xdn c55113xdn3 = c38231pRb.fetchVPNInfo;
                if (c55113xdn3 == null) {
                    Intrinsics.gEmmrt("");
                    c55113xdn3 = null;
                }
                c55113xdn3.copydefault();
                android.widget.FrameLayout frameLayout3 = c38231pRb.gEmmrt;
                if (frameLayout3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    view = frameLayout3;
                }
                view.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C38231pRb c38231pRb, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c38231pRb.AhwBna();
        }
        return Unit.INSTANCE;
    }

    private final void KWHzl(boolean z) {
        C52794wYp c52794wYp = null;
        if (z) {
            C52794wYp c52794wYp2 = this.AEQbTJ;
            if (c52794wYp2 == null) {
                Intrinsics.gEmmrt("");
                c52794wYp2 = null;
            }
            C52794wYp.startLoading$default(c52794wYp2, 0L, 1, null);
            return;
        }
        C52794wYp c52794wYp3 = this.AEQbTJ;
        if (c52794wYp3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c52794wYp = c52794wYp3;
        }
        c52794wYp.fIwbmz();
    }

    private final java.lang.String AYXKKw() {
        java.lang.String strQbewEr;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.copydefault;
        return (eopLivenessBasicViewModel == null || (strQbewEr = eopLivenessBasicViewModel.QbewEr()) == null) ? "" : strQbewEr;
    }

    public final java.lang.String copydefault() {
        java.lang.String strAubY;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.copydefault;
        return (eopLivenessBasicViewModel == null || (strAubY = eopLivenessBasicViewModel.AubY()) == null) ? "" : strAubY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AhwBna() {
        java.util.ArrayList<java.lang.String> arrayListAxsJAY;
        java.lang.String str;
        java.lang.String strAYXKKw;
        java.util.ArrayList<java.lang.String> arrayListAxsJAY2;
        C52794wYp c52794wYp = this.EZpvd;
        C52794wYp c52794wYp2 = null;
        if (c52794wYp == null) {
            Intrinsics.gEmmrt("");
            c52794wYp = null;
        }
        c52794wYp.fIwbmz();
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.copydefault;
        if (Intrinsics.EZpvd((java.lang.Object) (eopLivenessBasicViewModel != null ? eopLivenessBasicViewModel.sSMYrx() : null), (java.lang.Object) CardSyncResponse.FAILED)) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("LivenessRetake_Liveness_FullPage_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38231pRb.AkhnZx(this.EZpvd, (EventParamsList) obj);
                }
            });
            android.widget.LinearLayout linearLayout = this.AkhnZx;
            if (linearLayout == null) {
                Intrinsics.gEmmrt("");
                linearLayout = null;
            }
            linearLayout.setVisibility(0);
            android.widget.LinearLayout linearLayout2 = this.valueOf;
            if (linearLayout2 == null) {
                Intrinsics.gEmmrt("");
                linearLayout2 = null;
            }
            linearLayout2.setVisibility(8);
            android.widget.TextView textView = this.values;
            if (textView == null) {
                Intrinsics.gEmmrt("");
                textView = null;
            }
            EopLivenessBasicViewModel eopLivenessBasicViewModel2 = this.copydefault;
            textView.setText(eopLivenessBasicViewModel2 != null ? eopLivenessBasicViewModel2.DbNXlk() : null);
            android.widget.LinearLayout linearLayout3 = this.AhwBna;
            if (linearLayout3 == null) {
                Intrinsics.gEmmrt("");
                linearLayout3 = null;
            }
            linearLayout3.removeAllViews();
            if (KWHzl()) {
                android.widget.TextView textView2 = this.isConnected;
                if (textView2 == null) {
                    Intrinsics.gEmmrt("");
                    textView2 = null;
                }
                textView2.setVisibility(0);
                EopLivenessBasicViewModel eopLivenessBasicViewModel3 = this.copydefault;
                if (eopLivenessBasicViewModel3 != null && (arrayListAxsJAY2 = eopLivenessBasicViewModel3.AxsJAY()) != null) {
                    for (java.lang.String str2 : arrayListAxsJAY2) {
                        android.widget.LinearLayout linearLayout4 = this.AhwBna;
                        if (linearLayout4 == null) {
                            Intrinsics.gEmmrt("");
                            linearLayout4 = null;
                        }
                        linearLayout4.addView(createNoteTextView$default(this, str2, false, 2, null));
                    }
                }
                android.widget.TextView textView3 = this.isConnected;
                if (textView3 == null) {
                    Intrinsics.gEmmrt("");
                    textView3 = null;
                }
                EopLivenessBasicViewModel eopLivenessBasicViewModel4 = this.copydefault;
                if (C33129mqd.OLrzqt((java.lang.CharSequence) (eopLivenessBasicViewModel4 != null ? eopLivenessBasicViewModel4.gHZMYf() : null))) {
                    EopLivenessBasicViewModel eopLivenessBasicViewModel5 = this.copydefault;
                    strAYXKKw = eopLivenessBasicViewModel5 != null ? eopLivenessBasicViewModel5.gHZMYf() : null;
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(C45508srO.Application.values);
                }
                textView3.setText(strAYXKKw);
            } else {
                android.widget.TextView textView4 = this.isConnected;
                if (textView4 == null) {
                    Intrinsics.gEmmrt("");
                    textView4 = null;
                }
                textView4.setVisibility(8);
                EopLivenessBasicViewModel eopLivenessBasicViewModel6 = this.copydefault;
                if (eopLivenessBasicViewModel6 != null && (arrayListAxsJAY = eopLivenessBasicViewModel6.AxsJAY()) != null && (str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(arrayListAxsJAY)) != null) {
                    android.widget.LinearLayout linearLayout5 = this.AhwBna;
                    if (linearLayout5 == null) {
                        Intrinsics.gEmmrt("");
                        linearLayout5 = null;
                    }
                    linearLayout5.addView(AEQbTJ(str, true));
                }
            }
            C52794wYp c52794wYp3 = this.AEQbTJ;
            if (c52794wYp3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c52794wYp2 = c52794wYp3;
            }
            c52794wYp2.setOnClickListener(new View.OnClickListener() { // from class: o.pRq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C38231pRb.copydefault(this.OLrzqt, view);
                }
            });
            return;
        }
        TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("LivenessReconnect_Liveness_FullPage_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38231pRb.AuCTel(this.EZpvd, (EventParamsList) obj);
            }
        });
        android.widget.LinearLayout linearLayout6 = this.AkhnZx;
        if (linearLayout6 == null) {
            Intrinsics.gEmmrt("");
            linearLayout6 = null;
        }
        linearLayout6.setVisibility(8);
        android.widget.LinearLayout linearLayout7 = this.valueOf;
        if (linearLayout7 == null) {
            Intrinsics.gEmmrt("");
            linearLayout7 = null;
        }
        linearLayout7.setVisibility(0);
        android.widget.TextView textView5 = this.DbNXlk;
        if (textView5 == null) {
            Intrinsics.gEmmrt("");
            textView5 = null;
        }
        textView5.setText(getString(C45508srO.Application.fetchVPNInfo));
        C52794wYp c52794wYp4 = this.EZpvd;
        if (c52794wYp4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c52794wYp2 = c52794wYp4;
        }
        c52794wYp2.setOnClickListener(new View.OnClickListener() { // from class: o.pRt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C38231pRb.valueOf(this.OLrzqt, view);
            }
        });
    }

    public static final Unit AkhnZx(C38231pRb c38231pRb, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", c38231pRb.AYXKKw(), true);
        EventParamsList.put$default(eventParamsList, "status", c38231pRb.copydefault(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, c38231pRb.EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", c38231pRb.OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, c38231pRb.AEQbTJ(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(final C38231pRb c38231pRb, android.view.View view) {
        pRV<java.lang.String> prvFARcdN;
        C32868mlh c32868mlh = C32868mlh.OLrzqt;
        TrackChannel[] trackChannelArrCopydefault = c32868mlh.copydefault();
        C32866mlf.EZpvd("LivenessRetake_Liveness_TryAgain_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38231pRb.isConnected(this.copydefault, (EventParamsList) obj);
            }
        });
        TrackChannel[] trackChannelArrCopydefault2 = c32868mlh.copydefault();
        C32866mlf.EZpvd("KYC_FailedSelfieVerification_TryAgain_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38231pRb.fetchVPNInfo(this.KWHzl, (EventParamsList) obj);
            }
        });
        EopLivenessBasicViewModel eopLivenessBasicViewModel = c38231pRb.copydefault;
        if (Intrinsics.EZpvd((java.lang.Object) ((eopLivenessBasicViewModel == null || (prvFARcdN = eopLivenessBasicViewModel.fARcdN()) == null) ? null : prvFARcdN.getValue()), (java.lang.Object) EopLivenessBasicViewModel.Companion.KWHzl())) {
            TrackChannel[] trackChannelArrCopydefault3 = c32868mlh.copydefault();
            C32866mlf.EZpvd("AWSSelfieCaptured_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38231pRb.values(this.AEQbTJ, (EventParamsList) obj);
                }
            });
            pUU.KWHzl("kyc_in_house", "AWSSelfieCaptured_Full_Button_Click take again " + c38231pRb.copydefault());
        }
        C52794wYp c52794wYp = c38231pRb.AEQbTJ;
        if (c52794wYp == null) {
            Intrinsics.gEmmrt("");
            c52794wYp = null;
        }
        C52794wYp.startLoading$default(c52794wYp, 0L, 1, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c38231pRb), null, null, new EopFaceResultFragment$refreshUI$4$4(c38231pRb, null), 3, null);
    }

    public static final Unit isConnected(C38231pRb c38231pRb, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", c38231pRb.AYXKKw(), true);
        EventParamsList.put$default(eventParamsList, "status", c38231pRb.copydefault(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, c38231pRb.EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", c38231pRb.OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, c38231pRb.AEQbTJ(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C38231pRb c38231pRb, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, c38231pRb.EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", c38231pRb.OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, c38231pRb.AEQbTJ(), false, 4, null);
        EopLivenessBasicViewModel eopLivenessBasicViewModel = c38231pRb.copydefault;
        EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, (eopLivenessBasicViewModel == null || !eopLivenessBasicViewModel.zsXlph()) ? "false" : "true", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit values(C38231pRb c38231pRb, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "take again", false, 4, null);
        EventParamsList.put$default(eventParamsList, "status", c38231pRb.copydefault(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, c38231pRb.EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", c38231pRb.OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, c38231pRb.AEQbTJ(), false, 4, null);
        EopLivenessBasicViewModel eopLivenessBasicViewModel = c38231pRb.copydefault;
        EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, (eopLivenessBasicViewModel == null || !eopLivenessBasicViewModel.zsXlph()) ? "false" : "true", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(C38231pRb c38231pRb, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", c38231pRb.AYXKKw(), true);
        EventParamsList.put$default(eventParamsList, "status", c38231pRb.copydefault(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, c38231pRb.EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", c38231pRb.OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, c38231pRb.AEQbTJ(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void valueOf(final C38231pRb c38231pRb, android.view.View view) {
        pRV<java.lang.String> prvFARcdN;
        C32868mlh c32868mlh = C32868mlh.OLrzqt;
        TrackChannel[] trackChannelArrCopydefault = c32868mlh.copydefault();
        C32866mlf.EZpvd("LivenessReconnect_Liveness_Reconnect_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38231pRb.fJNWhG(this.EZpvd, (EventParamsList) obj);
            }
        });
        C52794wYp c52794wYp = c38231pRb.EZpvd;
        if (c52794wYp == null) {
            Intrinsics.gEmmrt("");
            c52794wYp = null;
        }
        C52794wYp.startLoading$default(c52794wYp, 0L, 1, null);
        EopLivenessBasicViewModel eopLivenessBasicViewModel = c38231pRb.copydefault;
        java.lang.String value = (eopLivenessBasicViewModel == null || (prvFARcdN = eopLivenessBasicViewModel.fARcdN()) == null) ? null : prvFARcdN.getValue();
        EopLivenessBasicViewModel.TaskDescription taskDescription = EopLivenessBasicViewModel.Companion;
        if (Intrinsics.EZpvd((java.lang.Object) value, (java.lang.Object) taskDescription.KWHzl())) {
            TrackChannel[] trackChannelArrCopydefault2 = c32868mlh.copydefault();
            C32866mlf.EZpvd("AWSSelfieCaptured_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38231pRb.fIwbmz(this.AEQbTJ, (EventParamsList) obj);
                }
            });
            pUU.KWHzl("kyc_in_house", "AWSSelfieCaptured_Full_Button_Click reconnect " + c38231pRb.copydefault());
            C52794wYp c52794wYp2 = c38231pRb.EZpvd;
            if (c52794wYp2 == null) {
                Intrinsics.gEmmrt("");
                c52794wYp2 = null;
            }
            C52794wYp.startLoading$default(c52794wYp2, 0L, 1, null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c38231pRb), null, null, new EopFaceResultFragment$refreshUI$6$3(c38231pRb, null), 3, null);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) value, (java.lang.Object) taskDescription.OLrzqt())) {
            pUU.KWHzl("kyc_in_house", "LCA exception retry button click " + c38231pRb.copydefault());
            C52794wYp c52794wYp3 = c38231pRb.EZpvd;
            if (c52794wYp3 == null) {
                Intrinsics.gEmmrt("");
                c52794wYp3 = null;
            }
            C52794wYp.startLoading$default(c52794wYp3, 0L, 1, null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c38231pRb), null, null, new EopFaceResultFragment$refreshUI$6$4(c38231pRb, null), 3, null);
        }
    }

    public static final Unit fJNWhG(C38231pRb c38231pRb, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", c38231pRb.AYXKKw(), true);
        EventParamsList.put$default(eventParamsList, "status", c38231pRb.copydefault(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, c38231pRb.EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", c38231pRb.OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, c38231pRb.AEQbTJ(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(C38231pRb c38231pRb, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "reconnect", false, 4, null);
        EventParamsList.put$default(eventParamsList, "status", c38231pRb.copydefault(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, c38231pRb.EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", c38231pRb.OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, c38231pRb.AEQbTJ(), false, 4, null);
        EopLivenessBasicViewModel eopLivenessBasicViewModel = c38231pRb.copydefault;
        EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, (eopLivenessBasicViewModel == null || !eopLivenessBasicViewModel.zsXlph()) ? "false" : "true", false, 4, null);
        return Unit.INSTANCE;
    }

    public final boolean KWHzl() {
        java.util.ArrayList<java.lang.String> arrayListAxsJAY;
        EopLivenessBasicViewModel eopLivenessBasicViewModel = this.copydefault;
        return (eopLivenessBasicViewModel == null || (arrayListAxsJAY = eopLivenessBasicViewModel.AxsJAY()) == null || arrayListAxsJAY.size() <= 1) ? false : true;
    }
}
