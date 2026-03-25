package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.Gson;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.common.From;
import com.okinc.ok_kyc_core.common.VendorSource;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogInformation;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Exit;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FieldDisplay;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Quit;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UpdateFormAppModel;
import com.okinc.ok_kyc_core.presentation.host.OKComplianceActivityViewModel$emitOnDemandFeatureEnabledEvent$1;
import com.okinc.ok_kyc_core.presentation.host.OKComplianceActivityViewModel$updateKycInfo$1;
import com.okinc.ok_kyc_core.presentation.host.OKComplianceActivityViewModel$verifyBack$1;
import com.okinc.ok_kyc_core.presentation.host.OKComplianceActivityViewModel$verifyCancel$2$1;
import com.okinc.ok_kyc_core.presentation.host.OKComplianceActivityViewModel$verifyCancel$3;
import com.okinc.ok_kyc_core.presentation.host.OKComplianceActivityViewModel$verifyExit$1;
import com.okinc.ok_kyc_core.presentation.host.OKComplianceActivityViewModel$verifySuccess$1;
import com.okinc.ok_kyc_core_api.ComplianceTheme;
import com.okinc.ok_kyc_core_api.PermissionState;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rIr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42163rIr extends ViewModel {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public ComplianceTheme AEQbTJ;
    public final MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> AYXKKw;
    public final MutableLiveData<C43734ruq<java.util.ArrayList<FieldDisplay>>> AhwBna;
    public MutableLiveData<C43734ruq<java.lang.Boolean>> AkhnZx;
    public PageComponentProfile AuCTel;
    public boolean DbNXlk;
    public final MutableLiveData<C43734ruq<UpdateFormAppModel>> EZpvd;
    public final SharedFlow<StateListAnimator> OLrzqt;
    public final MutableSharedFlow<StateListAnimator> copydefault;
    public PageComponentAppModel djBIcL;
    public VendorSource fARcdN;
    public final yDQ<java.util.HashMap<java.lang.String, java.lang.String>> fIwbmz;
    public java.util.HashMap<java.lang.String, java.lang.String> fJNWhG;
    public java.lang.String fetchVPNInfo;
    public java.util.HashMap<java.lang.String, java.lang.String> gEmmrt;
    public final MutableLiveData<C43734ruq<UpdateFormAppModel>> isConnected;
    public int valueOf;
    public final MutableLiveData<C43734ruq<Triple<PermissionState, java.lang.Integer, java.util.List<java.lang.String>>>> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<StateListAnimator> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C43734ruq<Triple<PermissionState, java.lang.Integer, java.util.List<java.lang.String>>>> AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, java.lang.String> AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DbNXlk() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C43734ruq<java.util.ArrayList<FieldDisplay>>> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull ComplianceTheme complianceTheme) {
        Intrinsics.checkNotNullParameter(complianceTheme, "");
        this.AEQbTJ = complianceTheme;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.valueOf = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.DbNXlk = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ComplianceTheme OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(PageComponentAppModel pageComponentAppModel) {
        this.djBIcL = pageComponentAppModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(PageComponentProfile pageComponentProfile) {
        this.AuCTel = pageComponentProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C43734ruq<UpdateFormAppModel>> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull VendorSource vendorSource) {
        Intrinsics.checkNotNullParameter(vendorSource, "");
        this.fARcdN = vendorSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C43734ruq<UpdateFormAppModel>> djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PageComponentAppModel gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PageComponentProfile isConnected() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C43734ruq<java.lang.Boolean>> valueOf() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VendorSource values() {
        return this.fARcdN;
    }

    /* JADX INFO: renamed from: o.rIr$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rIr.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public C42163rIr() {
        MutableSharedFlow<StateListAnimator> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.OLrzqt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.AYXKKw = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.isConnected = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
        this.fetchVPNInfo = "";
        this.valueOf = -1;
        this.fIwbmz = new yDQ<>();
        this.gEmmrt = new java.util.HashMap<>();
        this.AEQbTJ = ComplianceTheme.OKX;
        this.AkhnZx = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        this.fJNWhG = new java.util.HashMap<>();
        this.fARcdN = VendorSource.UNKNOWN;
    }

    public final void AEQbTJ(java.util.HashMap<java.lang.String, java.lang.String> map) {
        java.util.HashMap<java.lang.String, java.lang.String> map2 = this.gEmmrt;
        if (map != map2) {
            map2.clear();
            if (map != null) {
                this.gEmmrt.putAll(map);
            }
        }
    }

    public static /* synthetic */ void verifySuccess$default(C42163rIr c42163rIr, ResultStatus resultStatus, From from, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            resultStatus = null;
        }
        c42163rIr.KWHzl(resultStatus, from);
    }

    public final void KWHzl(ResultStatus resultStatus, @NotNull From from) {
        Intrinsics.checkNotNullParameter(from, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OKComplianceActivityViewModel$verifySuccess$1(this, resultStatus, from, null), 3, null);
    }

    public static /* synthetic */ void verifyExit$default(C42163rIr c42163rIr, ResultStatus resultStatus, From from, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            resultStatus = null;
        }
        c42163rIr.AEQbTJ(resultStatus, from);
    }

    public final void AEQbTJ(ResultStatus resultStatus, @NotNull From from) {
        Intrinsics.checkNotNullParameter(from, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OKComplianceActivityViewModel$verifyExit$1(this, resultStatus, from, null), 3, null);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new OKComplianceActivityViewModel$updateKycInfo$1(new C43746rvB(new rAP(), InterfaceC43709ruR.Companion.AEQbTJ(str, map), null, 4, null), null), 3, null);
    }

    public final void OLrzqt(ResultStatus resultStatus, @NotNull From from, @NotNull final java.lang.String str, @NotNull final java.util.HashMap<java.lang.String, java.lang.String> map, Exit exit, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(from, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KYC_SelectID_Quit_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rIs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42163rIr.AEQbTJ(str2, str, map, (EventParamsList) obj);
            }
        });
        if (exit != null && Intrinsics.EZpvd(exit.isNotifyServer(), java.lang.Boolean.TRUE)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OKComplianceActivityViewModel$verifyCancel$2$1(new C43746rvB(new rAP(), InterfaceC43709ruR.Companion.AEQbTJ(str, map), null, 4, null), exit, null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OKComplianceActivityViewModel$verifyCancel$3(this, resultStatus, from, null), 3, null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.util.HashMap map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "pageid", str == null ? "" : str, false, 4, null);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        eventParamsList.put("playbook", new C43739ruv().KWHzl(str2), false);
        java.lang.String json = new Gson().toJson(map);
        Intrinsics.checkNotNullExpressionValue(json, "");
        eventParamsList.put("action_params", json, false);
        java.lang.String str3 = (java.lang.String) map.get("refreshType");
        eventParamsList.put("refresh_type", str3 != null ? str3 : "", false);
        return Unit.INSTANCE;
    }

    public final void AuCTel() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OKComplianceActivityViewModel$verifyBack$1(this, null), 3, null);
    }

    public final void OLrzqt(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OKComplianceActivityViewModel$emitOnDemandFeatureEnabledEvent$1(this, z, null), 3, null);
    }

    public static /* synthetic */ Quit getQuitContent$default(C42163rIr c42163rIr, FragmentActivity fragmentActivity, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fragmentActivity = null;
        }
        return c42163rIr.KWHzl(fragmentActivity);
    }

    public final Quit KWHzl(FragmentActivity fragmentActivity) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String strAYXKKw3;
        java.lang.String strAYXKKw4;
        android.content.res.Resources resources;
        android.content.res.Resources resources2;
        android.content.res.Resources resources3;
        android.content.res.Resources resources4;
        if (fragmentActivity == null || (resources4 = fragmentActivity.getResources()) == null || (strAYXKKw = resources4.getString(C43662rtX.Dialog.AEQbTJ)) == null) {
            strAYXKKw = C33070mpX.AYXKKw(C43662rtX.Dialog.AEQbTJ);
        }
        java.lang.String str = strAYXKKw;
        if (fragmentActivity == null || (resources3 = fragmentActivity.getResources()) == null || (strAYXKKw2 = resources3.getString(C43662rtX.Dialog.copydefault)) == null) {
            strAYXKKw2 = C33070mpX.AYXKKw(C43662rtX.Dialog.copydefault);
        }
        java.lang.String str2 = strAYXKKw2;
        if (fragmentActivity == null || (resources2 = fragmentActivity.getResources()) == null || (strAYXKKw3 = resources2.getString(C43662rtX.Dialog.EZpvd)) == null) {
            strAYXKKw3 = C33070mpX.AYXKKw(C43662rtX.Dialog.EZpvd);
        }
        java.lang.String str3 = strAYXKKw3;
        if (fragmentActivity == null || (resources = fragmentActivity.getResources()) == null || (strAYXKKw4 = resources.getString(C43662rtX.Dialog.OLrzqt)) == null) {
            strAYXKKw4 = C33070mpX.AYXKKw(C43662rtX.Dialog.OLrzqt);
        }
        java.lang.String str4 = strAYXKKw4;
        PageComponentAppModel pageComponentAppModel = this.djBIcL;
        if (pageComponentAppModel instanceof FormAppModel) {
            Intrinsics.copydefault(pageComponentAppModel, "");
            FormAppModel formAppModel = (FormAppModel) pageComponentAppModel;
            if (formAppModel.getQuit() != null) {
                return formAppModel.getQuit();
            }
            pUU.KWHzl(OKGroupNotificationMessage.GROUP_OPERATION_QUIT, "Quit data is null, fallback to local Quit content.");
            return new Quit(java.lang.Boolean.TRUE, str, str2, (java.lang.String) null, str3, str4, (Quit) null, (java.util.ArrayList) null, (ButtonStyle) null, (ButtonStyle) null, 960, (DefaultConstructorMarker) null);
        }
        return new Quit(java.lang.Boolean.TRUE, str, str2, (java.lang.String) null, str3, str4, (Quit) null, (java.util.ArrayList) null, (ButtonStyle) null, (ButtonStyle) null, 960, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: o.rIr$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rIr.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX INFO: renamed from: o.rIr$StateListAnimator$ActionBar */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class ActionBar extends StateListAnimator {
            public final ResultStatus AEQbTJ;
            public final From copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, ResultStatus resultStatus, From from, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    resultStatus = actionBar.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    from = actionBar.copydefault;
                }
                return actionBar.OLrzqt(resultStatus, from);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ResultStatus OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar OLrzqt(ResultStatus resultStatus, @NotNull From from) {
                Intrinsics.checkNotNullParameter(from, "");
                return new ActionBar(resultStatus, from);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final From copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return this.AEQbTJ == actionBar.AEQbTJ && this.copydefault == actionBar.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                ResultStatus resultStatus = this.AEQbTJ;
                return ((resultStatus == null ? 0 : resultStatus.hashCode()) * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(resultStatus=" + this.AEQbTJ + ", from=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(ResultStatus resultStatus, @NotNull From from) {
                super(null);
                Intrinsics.checkNotNullParameter(from, "");
                this.AEQbTJ = resultStatus;
                this.copydefault = from;
            }
        }

        /* JADX INFO: renamed from: o.rIr$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class C0928StateListAnimator extends StateListAnimator {
            public final ResultStatus EZpvd;
            public final From copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0928StateListAnimator copy$default(C0928StateListAnimator c0928StateListAnimator, ResultStatus resultStatus, From from, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    resultStatus = c0928StateListAnimator.EZpvd;
                }
                if ((i & 2) != 0) {
                    from = c0928StateListAnimator.copydefault;
                }
                return c0928StateListAnimator.EZpvd(resultStatus, from);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0928StateListAnimator EZpvd(ResultStatus resultStatus, @NotNull From from) {
                Intrinsics.checkNotNullParameter(from, "");
                return new C0928StateListAnimator(resultStatus, from);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ResultStatus KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final From OLrzqt() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0928StateListAnimator)) {
                    return false;
                }
                C0928StateListAnimator c0928StateListAnimator = (C0928StateListAnimator) obj;
                return this.EZpvd == c0928StateListAnimator.EZpvd && this.copydefault == c0928StateListAnimator.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                ResultStatus resultStatus = this.EZpvd;
                return ((resultStatus == null ? 0 : resultStatus.hashCode()) * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Exit(resultStatus=" + this.EZpvd + ", from=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0928StateListAnimator(ResultStatus resultStatus, @NotNull From from) {
                super(null);
                Intrinsics.checkNotNullParameter(from, "");
                this.EZpvd = resultStatus;
                this.copydefault = from;
            }
        }

        /* JADX INFO: renamed from: o.rIr$StateListAnimator$TaskDescription */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class TaskDescription extends StateListAnimator {
            public final ResultStatus EZpvd;
            public final From KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, ResultStatus resultStatus, From from, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    resultStatus = taskDescription.EZpvd;
                }
                if ((i & 2) != 0) {
                    from = taskDescription.KWHzl;
                }
                return taskDescription.copydefault(resultStatus, from);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ResultStatus OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final From copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription copydefault(ResultStatus resultStatus, @NotNull From from) {
                Intrinsics.checkNotNullParameter(from, "");
                return new TaskDescription(resultStatus, from);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                TaskDescription taskDescription = (TaskDescription) obj;
                return this.EZpvd == taskDescription.EZpvd && this.KWHzl == taskDescription.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                ResultStatus resultStatus = this.EZpvd;
                return ((resultStatus == null ? 0 : resultStatus.hashCode()) * 31) + this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Cancel(resultStatus=" + this.EZpvd + ", from=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(ResultStatus resultStatus, @NotNull From from) {
                super(null);
                Intrinsics.checkNotNullParameter(from, "");
                this.EZpvd = resultStatus;
                this.KWHzl = from;
            }
        }

        /* JADX INFO: renamed from: o.rIr$StateListAnimator$Activity */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class Activity extends StateListAnimator {
            public final boolean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = activity.OLrzqt;
                }
                return activity.copydefault(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity copydefault(boolean z) {
                return new Activity(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && this.OLrzqt == ((Activity) obj).OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Boolean.hashCode(this.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "FeatureEnabled(enabled=" + this.OLrzqt + ")";
            }

            public Activity(boolean z) {
                super(null);
                this.OLrzqt = z;
            }
        }

        /* JADX INFO: renamed from: o.rIr$StateListAnimator$Application */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class Application extends StateListAnimator {
            public static final Application AEQbTJ = new Application();

            private Application() {
                super(null);
            }
        }
    }

    public final void AEQbTJ(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        rQZ.KWHzl.AEQbTJ(fragmentActivity);
        C42435rSt.KWHzl.KWHzl(fragmentActivity);
    }

    public final void fIwbmz() {
        rQZ.KWHzl.EZpvd();
        C42435rSt.KWHzl.KWHzl();
    }

    public final void ejfBZ() {
        this.fIwbmz.addLast(new java.util.HashMap<>(this.gEmmrt));
        pUU.EZpvd("OKComplianceActivityViewModel", "Add playbook to stack | Current stack " + this.fIwbmz);
    }

    public final boolean fJNWhG() {
        pUU.EZpvd("OKComplianceActivityViewModel", "Pop playbook from stack");
        if (this.fIwbmz.size() < 2) {
            return false;
        }
        this.fIwbmz.removeLast();
        AEQbTJ(this.fIwbmz.OLrzqt());
        return true;
    }
}
