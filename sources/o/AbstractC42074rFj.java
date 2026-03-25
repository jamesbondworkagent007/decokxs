package o;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.gms.common.Scopes;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.common.Constant;
import com.okinc.ok_kyc_core.common.From;
import com.okinc.ok_kyc_core.common.VendorSource;
import com.okinc.ok_kyc_core.data.NavOptions;
import com.okinc.ok_kyc_core.data.amani.AmaniVideoCallParams;
import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AccountMergeActionParams;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ActionParams;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncRequest;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CommonPopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CreateSessionIdResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCheckboxAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogInformation;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MergeAccountBottomPopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MergeAccountCenterPopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorTokenResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ProcessingAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.QuestionItem;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Quit;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SSLErrorModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SelectPopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ToastModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UpgradeActionParams;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UpgradePopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VerificationPayload;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VirtualActionAppModel;
import com.okinc.ok_kyc_core.ocrvendor.VendorEvent;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCViewModel$aliFaceAction$2;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCViewModel$cancelLoading$1;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCViewModel$checkMRAccountResultWithAliGlobal$1;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCViewModel$getOnboarding$1;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCViewModel$getSessionForVendor$1;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCViewModel$ocrMergeAccountAction$1;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCViewModel$postOnboarding$1;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCViewModel$reportCardSync$1;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCViewModel$startLoading$1;
import com.okinc.ok_kyc_core.service.EopImageInfo;
import com.okinc.ok_kyc_core_api.ComplianceTheme;
import com.okinc.ok_kyc_core_api.Playbook;
import com.okinc.ok_kyc_core_api.model.CompliancePostOnboardingModel;
import com.okinc.ok_kyc_core_api.model.UrlVendorTokenResp;
import com.okinc.okrisk.OKRiskConstantKeys;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web.WebActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC43419rot;
import o.AbstractC43697ruF;
import o.ActivityC42054rEq;
import o.ActivityC42162rIq;
import o.C43662rtX;
import o.rFW;
import o.rRP;
import o.rSF;
import o.rTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rFj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC42074rFj extends AbstractC33073mpa {
    public final MutableLiveData<C43734ruq<java.lang.Boolean>> AEQbTJ;
    public final MutableLiveData<C43734ruq<java.lang.String>> AYXKKw;
    public final MutableLiveData<C43734ruq<kotlin.Pair<From, ResultStatus>>> AhwBna;
    public kotlin.Pair<java.lang.String, java.lang.String> AuCTel;
    public final MutableLiveData<C43734ruq<java.lang.Boolean>> DbNXlk;
    public final java.lang.String KWHzl;
    public LocationListener ejfBZ;
    public C52794wYp fARcdN;
    public Job fIwbmz;
    public final MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> fJNWhG;
    public final MutableSharedFlow<java.lang.Boolean> fetchVPNInfo;
    public java.util.HashMap<java.lang.String, java.lang.String> getFieldNames;
    public java.lang.String getNewProxyInstance;
    public Function2<? super java.lang.String, ? super java.lang.String, Unit> hDKMBd;
    public final MutableLiveData<C43734ruq<kotlin.Pair<java.lang.String, java.lang.Integer>>> isConnected;
    public final C41957rBa iwGUEr;
    public final SharedFlow<java.lang.Boolean> uzCIH;
    public final MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> values;
    public MutableLiveData<java.lang.Boolean> wlaJM;
    public VendorSource zsXlph;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public static final java.util.List<VendorEvent> EZpvd = yDY.gEmmrt(VendorEvent.VENDOR_VERIFY_FAILED, VendorEvent.VENDOR_SDK_TOKEN_ERROR, VendorEvent.VENDOR_BACKEND_INIT_ERROR, VendorEvent.VENDOR_CRASH_ERROR);
    public final MutableLiveData<C43734ruq<rFW>> gEmmrt = new MutableLiveData<>();
    public final MutableLiveData<C43734ruq<kotlin.Pair<C43700ruI, C52794wYp>>> AkhnZx = new MutableLiveData<>();
    public final MutableLiveData<C43734ruq<rFR>> valueOf = new MutableLiveData<>();
    public final MutableLiveData<C43734ruq<AmaniVideoCallParams>> OLrzqt = new MutableLiveData<>();
    public final MutableLiveData<C43734ruq<kotlin.Pair<android.view.View, java.lang.Boolean>>> djBIcL = new MutableLiveData<>();

    /* JADX INFO: renamed from: o.rFj$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ButtonAction.values().length];
            try {
                iArr[ButtonAction.AmaniVideoCall.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonAction.MultiVendor.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonAction.GeneralVendor.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonAction.Submit.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonAction.SubmitGps.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[ButtonAction.Exit.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[ButtonAction.Onboarding.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[ButtonAction.Skip.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[ButtonAction.AliFace.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[ButtonAction.AlifaceMergeAccount.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[ButtonAction.OnlineSupport.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[ButtonAction.Dialog.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[ButtonAction.Deeplink.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[ButtonAction.RiskWarning.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[ButtonAction.Withdrawal.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[ButtonAction.HomePage.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[ButtonAction.GoBack.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[ButtonAction.InitWallet.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[ButtonAction.CheckWallet.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[ButtonAction.ImportWallet.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr[ButtonAction.BackUpWallet.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr[ButtonAction.CallApi.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr[ButtonAction.SatoshiTest.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr[ButtonAction.GoVerifyCenter.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr[ButtonAction.LeanTech.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr[ButtonAction.StartImageUploadFlow.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C43734ruq<AmaniVideoCallParams>> AEQbTJ() {
        return this.OLrzqt;
    }

    public abstract void AEQbTJ(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> AYXKKw() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C43734ruq<rFR>> AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C43734ruq<rFW>> AkhnZx() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AuCTel() {
        return this.wlaJM;
    }

    public abstract rBQ DbNXlk();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull VendorSource vendorSource) {
        Intrinsics.checkNotNullParameter(vendorSource, "");
        this.zsXlph = vendorSource;
    }

    public abstract void EZpvd(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, C52794wYp c52794wYp, @NotNull C41957rBa c41957rBa, @NotNull java.util.Map<java.lang.String, java.lang.String> map, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(c41957rBa, "");
        Intrinsics.checkNotNullParameter(map, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.util.HashMap<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getFieldNames = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C43734ruq<java.lang.Boolean>> KWHzl() {
        return this.AEQbTJ;
    }

    public abstract void KWHzl(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions);

    public abstract void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull java.util.HashMap<java.lang.String, java.lang.Integer> map2, java.lang.Integer num, java.lang.Integer num2, java.lang.String str3, @NotNull java.util.ArrayList<EopImageInfo> arrayList, @NotNull java.lang.String str4, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map3, PageComponentProfile pageComponentProfile, java.lang.String str5, java.lang.Integer num3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(kotlin.Pair<java.lang.String, java.lang.String> pair) {
        this.AuCTel = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52794wYp OLrzqt() {
        return this.fARcdN;
    }

    public abstract void OLrzqt(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(C52794wYp c52794wYp, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str3, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str3, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull java.lang.String str, java.lang.String str2, C52794wYp c52794wYp, @NotNull C41957rBa c41957rBa, @NotNull java.util.Map<java.lang.String, java.lang.String> map, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c41957rBa, "");
        Intrinsics.checkNotNullParameter(map, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C43734ruq<kotlin.Pair<From, ResultStatus>>> djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> ejfBZ() {
        return this.values;
    }

    public abstract rBJ fARcdN();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41957rBa fIwbmz() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.lang.Boolean> fJNWhG() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C43734ruq<kotlin.Pair<C43700ruI, C52794wYp>>> fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C43734ruq<kotlin.Pair<android.view.View, java.lang.Boolean>>> gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VendorSource getFieldNames() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C43734ruq<java.lang.String>> getNewProxyInstance() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C43734ruq<java.lang.Boolean>> hDKMBd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C43734ruq<java.lang.String>> isConnected() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C43734ruq<kotlin.Pair<C43700ruI, C52794wYp>>> iwGUEr() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C43734ruq<kotlin.Pair<java.lang.String, java.lang.Integer>>> uzCIH() {
        return this.isConnected;
    }

    public abstract rBG valueOf();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getNewProxyInstance = str;
    }

    public abstract rBT values();

    public AbstractC42074rFj() {
        MutableSharedFlow<java.lang.Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.fetchVPNInfo = mutableSharedFlowMutableSharedFlow$default;
        this.uzCIH = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.AYXKKw = new MutableLiveData<>();
        this.isConnected = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
        this.DbNXlk = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        this.fJNWhG = new MutableLiveData<>();
        this.iwGUEr = new C41957rBa();
        this.getNewProxyInstance = "";
        this.getFieldNames = new java.util.HashMap<>();
        this.KWHzl = "BaseKYCViewModel";
        this.zsXlph = VendorSource.UNKNOWN;
        this.wlaJM = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: o.rFj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rFj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.util.List<VendorEvent> EZpvd() {
            return AbstractC42074rFj.EZpvd;
        }
    }

    public final void copydefault() {
        this.djBIcL.setValue(null);
    }

    public static /* synthetic */ void navigate$default(AbstractC42074rFj abstractC42074rFj, int i, android.os.Bundle bundle, NavOptions navOptions, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i2 & 4) != 0) {
            navOptions = NavOptions.Default;
        }
        abstractC42074rFj.copydefault(i, bundle, navOptions);
    }

    public final void copydefault(int i, @NotNull android.os.Bundle bundle, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        this.gEmmrt.setValue(new C43734ruq<>(new rFW.TaskDescription(i, bundle, navOptions)));
    }

    public final void wlaJM() {
        this.gEmmrt.setValue(new C43734ruq<>(rFW.StateListAnimator.AEQbTJ));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: o.rFj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigateVirtualAction$default(AbstractC42074rFj abstractC42074rFj, PageComponentAppModel pageComponentAppModel, C52794wYp c52794wYp, java.lang.String str, java.lang.String str2, java.util.HashMap map, ComplianceTheme complianceTheme, FragmentActivity fragmentActivity, java.lang.Boolean bool, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateVirtualAction");
        }
        abstractC42074rFj.EZpvd(pageComponentAppModel, (i & 2) != 0 ? null : c52794wYp, str, str2, map, (i & 32) != 0 ? ComplianceTheme.OKX : complianceTheme, (i & 64) != 0 ? null : fragmentActivity, (i & 128) != 0 ? java.lang.Boolean.FALSE : bool, (i & 256) != 0 ? null : function1);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ruv.reportFullPageView$default(o.ruv, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, java.lang.String, java.util.HashMap, java.lang.Integer, java.lang.Integer, int, java.lang.Object):void */
    public final void EZpvd(final PageComponentAppModel pageComponentAppModel, final C52794wYp c52794wYp, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull final ComplianceTheme complianceTheme, final FragmentActivity fragmentActivity, final java.lang.Boolean bool, final Function1<? super java.util.HashMap<java.lang.String, java.lang.String>, Unit> function1) {
        java.lang.String id;
        CtaAppModel cta;
        java.util.List<UIComponentAppModel> items;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(complianceTheme, "");
        C43739ruv c43739ruv = new C43739ruv();
        if (pageComponentAppModel == null || (id = pageComponentAppModel.getId()) == null) {
            id = "Virtual";
        }
        c43739ruv.AEQbTJ(id, str, "form", (456 & 8) != 0 ? null : null, map, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), (456 & 64) != 0 ? null : null, (456 & 128) != 0 ? null : null, (456 & 256) != 0 ? null : null);
        VirtualActionAppModel virtualActionAppModel = pageComponentAppModel instanceof VirtualActionAppModel ? (VirtualActionAppModel) pageComponentAppModel : null;
        UIComponentAppModel uIComponentAppModel = (virtualActionAppModel == null || (cta = virtualActionAppModel.getCta()) == null || (items = cta.getItems()) == null) ? null : items.get(0);
        CTAButtonAppModel cTAButtonAppModel = uIComponentAppModel instanceof CTAButtonAppModel ? (CTAButtonAppModel) uIComponentAppModel : null;
        if (cTAButtonAppModel != null) {
            if (cTAButtonAppModel.getAction() != ButtonAction.Exit || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) Playbook.NOTABENE_OKX.getValue()) || C59449zhJ.startsWith$default(str, "okx_travel_", false, 2, null) || C59449zhJ.startsWith$default(str, "okcoin_travel_", false, 2, null) || C59449zhJ.startsWith$default(str, "common_travel_", false, 2, null)) {
                onButtonClicked$default(this, c52794wYp, cTAButtonAppModel, str, str2, C33129mqd.gEmmrt(((VirtualActionAppModel) pageComponentAppModel).getId()), map, new C43739ruv(), complianceTheme, fragmentActivity, null, ResultStatus.Success, bool, null, null, null, null, function1, 61952, null);
            } else if (fragmentActivity != null) {
                final CTAButtonAppModel cTAButtonAppModel2 = cTAButtonAppModel;
                ((rSF) C43251rlk.copydefault(rSF.class)).OLrzqt(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), new Function1() { // from class: o.rFs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC42074rFj.copydefault(this.KWHzl, c52794wYp, cTAButtonAppModel2, str, str2, pageComponentAppModel, map, complianceTheme, fragmentActivity, bool, function1, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
            }
        }
    }

    public static final Unit copydefault(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, CTAButtonAppModel cTAButtonAppModel, java.lang.String str, java.lang.String str2, PageComponentAppModel pageComponentAppModel, java.util.HashMap map, ComplianceTheme complianceTheme, FragmentActivity fragmentActivity, java.lang.Boolean bool, Function1 function1, boolean z) {
        onButtonClicked$default(abstractC42074rFj, c52794wYp, cTAButtonAppModel, str, str2, C33129mqd.gEmmrt(((VirtualActionAppModel) pageComponentAppModel).getId()), map, new C43739ruv(), complianceTheme, fragmentActivity, null, ResultStatus.Success, bool, null, null, null, null, function1, 61952, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.rFj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigatePopUpAction$default(AbstractC42074rFj abstractC42074rFj, PageComponentAppModel pageComponentAppModel, FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.util.HashMap map, ActivityResultLauncher activityResultLauncher, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigatePopUpAction");
        }
        if ((i & 32) != 0) {
            activityResultLauncher = null;
        }
        abstractC42074rFj.OLrzqt(pageComponentAppModel, fragmentActivity, fragmentManager, str, (java.util.HashMap<java.lang.String, java.lang.String>) map, (ActivityResultLauncher<android.content.Intent>) activityResultLauncher);
    }

    public final void OLrzqt(PageComponentAppModel pageComponentAppModel, final FragmentActivity fragmentActivity, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, final ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        AccountMergeActionParams actionParams;
        java.util.List<PopUpComponentAppModel> items;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        PopUpAppModel popUpAppModel = pageComponentAppModel instanceof PopUpAppModel ? (PopUpAppModel) pageComponentAppModel : null;
        PopUpComponentAppModel popUpComponentAppModel = (popUpAppModel == null || (items = popUpAppModel.getItems()) == null) ? null : items.get(0);
        if (popUpComponentAppModel instanceof MergeAccountCenterPopUpAppModel) {
            if (fragmentActivity != null) {
                rQZ.KWHzl.OLrzqt(fragmentActivity, new Function0() { // from class: o.rFM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return AbstractC42074rFj.OLrzqt(this.KWHzl, fragmentActivity, activityResultLauncher);
                    }
                });
                return;
            }
            return;
        }
        if (popUpComponentAppModel instanceof MergeAccountBottomPopUpAppModel) {
            if (fragmentActivity == null || (actionParams = ((MergeAccountBottomPopUpAppModel) popUpComponentAppModel).getActionParams()) == null) {
                return;
            }
            rQV.Companion.KWHzl(fragmentActivity, actionParams);
            AEQbTJ("", (ResultStatus) null);
            return;
        }
        if (popUpComponentAppModel instanceof UpgradePopUpAppModel) {
            pUU.EZpvd("qjf", "navigatePopUpAction-->UpgradePopUpAppModel----------->");
            UpgradeActionParams actionParams2 = ((UpgradePopUpAppModel) popUpComponentAppModel).getActionParams();
            if (actionParams2 != null) {
                rQZ.KWHzl.OLrzqt(fragmentActivity, actionParams2);
                return;
            }
            return;
        }
        if (popUpComponentAppModel instanceof CommonPopUpAppModel) {
            if (fragmentActivity != null) {
                C43739ruv c43739ruv = new C43739ruv();
                PopUpAppModel popUpAppModel2 = (PopUpAppModel) pageComponentAppModel;
                java.lang.String id = popUpAppModel2.getId();
                if (id == null) {
                    id = "CommonPopUp";
                }
                c43739ruv.AEQbTJ(id, str, "form", (456 & 8) != 0 ? null : null, map, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), (456 & 64) != 0 ? null : null, (456 & 128) != 0 ? null : null, (456 & 256) != 0 ? null : null);
                CommonPopUpAppModel commonPopUpAppModel = (CommonPopUpAppModel) popUpComponentAppModel;
                final ButtonDialog buttonDialog = new ButtonDialog(commonPopUpAppModel.getPosition(), popUpAppModel2.getId(), (java.lang.String) null, commonPopUpAppModel.getTitle(), commonPopUpAppModel.getSubtitle(), commonPopUpAppModel.getIconState(), (java.lang.Boolean) null, (java.lang.Boolean) null, commonPopUpAppModel.getCta(), commonPopUpAppModel.getItems(), commonPopUpAppModel.getAllowClose(), commonPopUpAppModel.getDialogBottomText(), (java.lang.Boolean) null, (DialogCheckboxAppModel) null, commonPopUpAppModel.isDismissable(), 12484, (DefaultConstructorMarker) null);
                rQZ.KWHzl.AEQbTJ(fragmentActivity, buttonDialog, new Function1() { // from class: o.rFO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC42074rFj.AEQbTJ(this.copydefault, buttonDialog, (CTAButtonAppModel) obj);
                    }
                });
                return;
            }
            return;
        }
        PopUpComponentAppModel popUpComponentAppModel2 = popUpComponentAppModel;
        if (popUpComponentAppModel2 instanceof SelectPopUpAppModel) {
            Intrinsics.copydefault(popUpComponentAppModel2, "");
            SelectPopUpAppModel selectPopUpAppModel = (SelectPopUpAppModel) popUpComponentAppModel2;
            PopUpAppModel popUpAppModel3 = (PopUpAppModel) pageComponentAppModel;
            selectPopUpAppModel.setId(popUpAppModel3.getId());
            if (fragmentActivity != null) {
                C43739ruv c43739ruv2 = new C43739ruv();
                java.lang.String id2 = popUpAppModel3.getId();
                if (id2 == null) {
                    id2 = "SelectPopUp";
                }
                c43739ruv2.AEQbTJ(id2, str, "form", (456 & 8) != 0 ? null : null, map, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), (456 & 64) != 0 ? null : null, (456 & 128) != 0 ? null : null, (456 & 256) != 0 ? null : null);
                rQZ.KWHzl.KWHzl(fragmentActivity, selectPopUpAppModel);
                return;
            }
            return;
        }
        if (!(popUpComponentAppModel2 instanceof ListPickerPopUpAppModel)) {
            pUU.KWHzl(this.KWHzl, "navigatePopUpAction | Unsupported AppModel");
        } else if (fragmentActivity != null) {
            rQZ.KWHzl.OLrzqt(fragmentActivity, (ListPickerPopUpAppModel) popUpComponentAppModel2, pageComponentAppModel);
        }
    }

    public static final Unit OLrzqt(AbstractC42074rFj abstractC42074rFj, FragmentActivity fragmentActivity, ActivityResultLauncher activityResultLauncher) {
        C43693ruB.OLrzqt("KYC_MergeAccount_Dialog_Click");
        abstractC42074rFj.copydefault(null, fragmentActivity, ComplianceTheme.OKX, ButtonStyle.Text, activityResultLauncher);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC42074rFj abstractC42074rFj, ButtonDialog buttonDialog, CTAButtonAppModel cTAButtonAppModel) {
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        abstractC42074rFj.values.setValue(new C43734ruq<>(new kotlin.Pair(cTAButtonAppModel, new DialogInformation(C33129mqd.gEmmrt(buttonDialog.getPageId()), true, null, 4, null))));
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull CTAButtonAppModel cTAButtonAppModel) {
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        this.values.setValue(new C43734ruq<>(new kotlin.Pair(cTAButtonAppModel, new DialogInformation("", false, null, 4, null))));
    }

    public static /* synthetic */ void navigateToResultPage$default(AbstractC42074rFj abstractC42074rFj, PageComponentAppModel pageComponentAppModel, java.lang.String str, java.util.HashMap map, PageComponentProfile pageComponentProfile, NavOptions navOptions, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToResultPage");
        }
        if ((i & 16) != 0) {
            navOptions = NavOptions.Default;
        }
        abstractC42074rFj.AEQbTJ(pageComponentAppModel, str, (java.util.HashMap<java.lang.String, java.lang.String>) map, pageComponentProfile, navOptions);
    }

    public static /* synthetic */ void navigateToSelectWalletVerificationPage$default(AbstractC42074rFj abstractC42074rFj, PageComponentAppModel pageComponentAppModel, java.lang.String str, java.util.HashMap map, PageComponentProfile pageComponentProfile, NavOptions navOptions, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToSelectWalletVerificationPage");
        }
        if ((i & 16) != 0) {
            navOptions = NavOptions.Default;
        }
        abstractC42074rFj.KWHzl(pageComponentAppModel, str, map, pageComponentProfile, navOptions);
    }

    public static /* synthetic */ void navigateToFormPage$default(AbstractC42074rFj abstractC42074rFj, PageComponentAppModel pageComponentAppModel, java.lang.String str, java.util.HashMap map, PageComponentProfile pageComponentProfile, NavOptions navOptions, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToFormPage");
        }
        if ((i & 16) != 0) {
            navOptions = NavOptions.Default;
        }
        abstractC42074rFj.EZpvd(pageComponentAppModel, str, map, pageComponentProfile, navOptions);
    }

    public static /* synthetic */ void navigateToProcessingPage$default(AbstractC42074rFj abstractC42074rFj, PageComponentAppModel pageComponentAppModel, java.lang.String str, java.lang.String str2, java.util.HashMap map, PageComponentProfile pageComponentProfile, NavOptions navOptions, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToProcessingPage");
        }
        if ((i & 32) != 0) {
            navOptions = NavOptions.Default;
        }
        abstractC42074rFj.OLrzqt(pageComponentAppModel, str, str2, (java.util.HashMap<java.lang.String, java.lang.String>) map, pageComponentProfile, navOptions);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: o.rFj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigateToOcrVendor$default(AbstractC42074rFj abstractC42074rFj, java.lang.String str, java.lang.String str2, java.util.HashMap map, java.util.HashMap map2, java.lang.Integer num, java.lang.Integer num2, java.lang.String str3, java.util.ArrayList arrayList, java.lang.String str4, java.util.HashMap map3, PageComponentProfile pageComponentProfile, java.lang.String str5, java.lang.Integer num3, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToOcrVendor");
        }
        abstractC42074rFj.KWHzl(str, str2, (java.util.HashMap<java.lang.String, java.lang.String>) ((i & 4) != 0 ? new java.util.HashMap() : map), (java.util.HashMap<java.lang.String, java.lang.Integer>) ((i & 8) != 0 ? new java.util.HashMap() : map2), (i & 16) != 0 ? java.lang.Integer.valueOf(Constant.VendorType.EOP.getVendorType()) : num, (i & 32) != 0 ? 1 : num2, (i & 64) != 0 ? "" : str3, (java.util.ArrayList<EopImageInfo>) ((i & 128) != 0 ? new java.util.ArrayList() : arrayList), str4, (java.util.HashMap<java.lang.String, java.lang.String>) map3, pageComponentProfile, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? 0 : num3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: o.rFj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigateToProcessPage$default(AbstractC42074rFj abstractC42074rFj, java.lang.String str, java.lang.String str2, java.util.HashMap map, java.lang.String str3, VendorConfig vendorConfig, java.lang.String str4, java.lang.String str5, java.lang.Integer num, int i, java.lang.String str6, java.util.HashMap map2, PageComponentProfile pageComponentProfile, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToProcessPage");
        }
        abstractC42074rFj.EZpvd(str, str2, (i2 & 4) != 0 ? new java.util.HashMap() : map, str3, vendorConfig, str4, str5, num, i, str6, map2, pageComponentProfile);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull java.lang.String str3, @NotNull VendorConfig vendorConfig, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.Integer num, int i, @NotNull java.lang.String str6, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map2, PageComponentProfile pageComponentProfile) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(vendorConfig, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(map2, "");
        navigate$default(this, C43662rtX.ActionBar.AEQbTJ, BundleKt.bundleOf(C56390yDp.OLrzqt("PROCESS_TYPE", "CARD_PROCESS"), C56390yDp.OLrzqt("CARD_SESSION_ID", str5), C56390yDp.OLrzqt(EopTrackEvent.KEY_COR, str3), C56390yDp.OLrzqt("vendorConfig", vendorConfig), C56390yDp.OLrzqt("resultId", str), C56390yDp.OLrzqt("resultTarget", str2), C56390yDp.OLrzqt("ctaValue", new java.util.HashMap(map)), C56390yDp.OLrzqt(OtcExtraKeys.SESSIONID, str4), C56390yDp.OLrzqt("vendorType", num), C56390yDp.OLrzqt("verifyType", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt(OtcExtraKeys.SESSIONID, str4), C56390yDp.OLrzqt("playbook", str6), C56390yDp.OLrzqt("playbookParams", map2), C56390yDp.OLrzqt(Scopes.PROFILE, pageComponentProfile)), null, 4, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r21v0, resolved type: o.rFj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onButtonClicked$default(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, CTAButtonAppModel cTAButtonAppModel, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.HashMap map, C43739ruv c43739ruv, ComplianceTheme complianceTheme, FragmentActivity fragmentActivity, java.lang.Boolean bool, ResultStatus resultStatus, java.lang.Boolean bool2, java.lang.String str4, java.lang.String str5, java.lang.String str6, ActivityResultLauncher activityResultLauncher, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onButtonClicked");
        }
        abstractC42074rFj.AEQbTJ((i & 1) != 0 ? null : c52794wYp, cTAButtonAppModel, str, str2, str3, map, c43739ruv, (i & 128) != 0 ? ComplianceTheme.OKX : complianceTheme, (i & 256) != 0 ? null : fragmentActivity, (i & 512) != 0 ? java.lang.Boolean.FALSE : bool, (i & 1024) != 0 ? null : resultStatus, (i & 2048) != 0 ? java.lang.Boolean.FALSE : bool2, (i & 4096) != 0 ? "" : str4, (i & 8192) != 0 ? "" : str5, (i & 16384) != 0 ? "" : str6, (32768 & i) != 0 ? null : activityResultLauncher, (i & 65536) != 0 ? null : function1);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.rSF.Application.gotoMain$default(o.rSF, android.content.Context, android.os.Bundle, int, java.lang.Object):void */
    /* JADX DEBUG: Class process forced to load method for inline: o.rTu.deepLinkJump$default(o.rTu, android.content.Context, java.lang.String, java.lang.String, int, java.lang.Object):void */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01dc A[PHI: r16
  0x01dc: PHI (r16v20 java.lang.String) = 
  (r16v14 java.lang.String)
  (r16v15 java.lang.String)
  (r16v15 java.lang.String)
  (r16v15 java.lang.String)
  (r16v15 java.lang.String)
  (r16v16 java.lang.String)
  (r16v16 java.lang.String)
  (r16v16 java.lang.String)
  (r16v16 java.lang.String)
  (r16v17 java.lang.String)
  (r16v17 java.lang.String)
  (r16v17 java.lang.String)
  (r16v18 java.lang.String)
  (r16v18 java.lang.String)
  (r16v19 java.lang.String)
  (r16v19 java.lang.String)
  (r16v21 java.lang.String)
  (r16v22 java.lang.String)
 binds: [B:106:0x0328, B:97:0x02e5, B:99:0x02eb, B:100:0x02ed, B:101:0x02ef, B:91:0x02ac, B:93:0x02b2, B:94:0x02b4, B:95:0x02b6, B:36:0x0195, B:38:0x019b, B:40:0x01a1, B:31:0x0154, B:32:0x0156, B:26:0x013a, B:27:0x013c, B:24:0x0134, B:23:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(final C52794wYp c52794wYp, @NotNull final CTAButtonAppModel cTAButtonAppModel, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull C43739ruv c43739ruv, @NotNull final ComplianceTheme complianceTheme, final FragmentActivity fragmentActivity, java.lang.Boolean bool, ResultStatus resultStatus, java.lang.Boolean bool2, java.lang.String str4, java.lang.String str5, java.lang.String str6, ActivityResultLauncher<android.content.Intent> activityResultLauncher, Function1<? super java.util.HashMap<java.lang.String, java.lang.String>, Unit> function1) {
        java.lang.String str7;
        final java.lang.String str8;
        CTAButtonAppModel secondaryButton;
        CTAButtonAppModel primaryButton;
        CTAButtonAppModel secondaryButton2;
        CTAButtonAppModel primaryButton2;
        java.lang.String deeplink;
        java.lang.Integer subCurrencyId;
        VerificationPayload verificationPayload;
        VerificationPayload verificationPayload2;
        VerificationPayload verificationPayload3;
        java.util.HashMap<java.lang.String, java.lang.String> map2;
        CallApiModel create;
        CallApiModel create2;
        CallApiModel create3;
        java.util.HashMap<java.lang.String, java.lang.String> map3;
        CallApiModel update;
        CallApiModel update2;
        CallApiModel update3;
        ActionParams actionParams;
        CallApiModel delete;
        ButtonAction action;
        final AbstractC42074rFj abstractC42074rFj = this;
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(c43739ruv, "");
        Intrinsics.checkNotNullParameter(complianceTheme, "");
        pUU.KWHzl("CTA_SUBMIT", "onButtonClicked->pageId = " + str3 + ", ctaModel.target = " + cTAButtonAppModel.getTarget());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        cTAButtonAppModel.getId();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) cTAButtonAppModel.getValue())) {
            java.lang.String id = cTAButtonAppModel.getId();
            java.lang.String value = cTAButtonAppModel.getValue();
            Intrinsics.copydefault((java.lang.Object) value);
            linkedHashMap.put(id, value);
        }
        Unit unit = Unit.INSTANCE;
        kotlin.Pair<java.lang.String, java.lang.String> pair = abstractC42074rFj.AuCTel;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (pair != null ? pair.getFirst() : null))) {
            kotlin.Pair<java.lang.String, java.lang.String> pair2 = abstractC42074rFj.AuCTel;
            Intrinsics.copydefault(pair2);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) pair2.getSecond())) {
                kotlin.Pair<java.lang.String, java.lang.String> pair3 = abstractC42074rFj.AuCTel;
                Intrinsics.copydefault(pair3);
                java.lang.String first = pair3.getFirst();
                Intrinsics.copydefault((java.lang.Object) first);
                kotlin.Pair<java.lang.String, java.lang.String> pair4 = abstractC42074rFj.AuCTel;
                Intrinsics.copydefault(pair4);
                java.lang.String second = pair4.getSecond();
                Intrinsics.copydefault((java.lang.Object) second);
                linkedHashMap.put(first, second);
            }
        }
        pUU.KWHzl("zhoulijuan---->", java.lang.String.valueOf(cTAButtonAppModel.getAction()));
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(cTAButtonAppModel.getTarget());
        ButtonAction action2 = cTAButtonAppModel.getAction();
        switch (action2 == null ? -1 : StateListAnimator.OLrzqt[action2.ordinal()]) {
            case 1:
                str7 = strGEmmrt;
                ActionParams actionParams2 = cTAButtonAppModel.getActionParams();
                if (actionParams2 == null) {
                    str8 = str7;
                } else {
                    cancelLoading$default(this, c52794wYp, fragmentActivity, false, 4, null);
                    str8 = str7;
                    abstractC42074rFj.OLrzqt.setValue(new C43734ruq<>(new AmaniVideoCallParams(str3, str7, linkedHashMap, actionParams2.getName() + " " + actionParams2.getSurname(), actionParams2.getServerURL(), actionParams2.getStunServerURL(), actionParams2.getTurnServerURL(), actionParams2.getToken(), actionParams2.getTurnUsername(), actionParams2.getTurnPassword(), actionParams2.getVideoCallWaitingInterval(), actionParams2.getVideoCallWaitingPeople())));
                }
                break;
            case 2:
                str7 = strGEmmrt;
                EZpvd(cTAButtonAppModel, c52794wYp, str7, linkedHashMap, str, str2, str3, map, complianceTheme, fragmentActivity, bool2);
                str8 = str7;
                break;
            case 3:
                str7 = strGEmmrt;
                copydefault(cTAButtonAppModel, c52794wYp, str7, linkedHashMap, str, str2, str3, map, complianceTheme, fragmentActivity);
                str8 = str7;
                break;
            case 4:
                str7 = strGEmmrt;
                OLrzqt(cTAButtonAppModel, c52794wYp, str7, linkedHashMap, str, str2, map, str3, complianceTheme, fragmentActivity, str4, str5, str6);
                str8 = str7;
                break;
            case 5:
                str7 = strGEmmrt;
                KWHzl(cTAButtonAppModel, c52794wYp, str7, linkedHashMap, str, str2, map, str3, complianceTheme, fragmentActivity, str4, str5, str6);
                str8 = str7;
                break;
            case 6:
                str7 = strGEmmrt;
                abstractC42074rFj.AEQbTJ(str7, resultStatus);
                str8 = str7;
                break;
            case 7:
                str8 = strGEmmrt;
                copydefault(cTAButtonAppModel, c52794wYp, str, str2, map, complianceTheme, fragmentActivity, function1);
                break;
            case 8:
                str8 = strGEmmrt;
                AEQbTJ(cTAButtonAppModel, c52794wYp, str8, linkedHashMap, str, str2, map, str3, complianceTheme, fragmentActivity);
                break;
            case 9:
                str8 = strGEmmrt;
                OLrzqt(cTAButtonAppModel, c52794wYp, str3, str8, linkedHashMap, str, str2, map, complianceTheme, fragmentActivity);
                break;
            case 10:
                str8 = strGEmmrt;
                if (fragmentActivity != null) {
                    ButtonStyle style = cTAButtonAppModel.getStyle();
                    if (style == null) {
                        style = ButtonStyle.Text;
                    }
                    copydefault(c52794wYp, fragmentActivity, complianceTheme, style, activityResultLauncher);
                }
                break;
            case 11:
                str8 = strGEmmrt;
                cancelLoading$default(this, c52794wYp, fragmentActivity, false, 4, null);
                abstractC42074rFj.EZpvd(fragmentActivity);
                break;
            case 12:
                str8 = strGEmmrt;
                cancelLoading$default(this, c52794wYp, fragmentActivity, false, 4, null);
                ButtonDialog dialog = cTAButtonAppModel.getDialog();
                if (dialog != null) {
                    CtaPopUp cta = dialog.getCta();
                    if (cta != null && (primaryButton2 = cta.getPrimaryButton()) != null) {
                        primaryButton2.setInfoFormId(cTAButtonAppModel.getInfoFormId());
                    }
                    CtaPopUp cta2 = dialog.getCta();
                    if (cta2 != null && (secondaryButton2 = cta2.getSecondaryButton()) != null) {
                        secondaryButton2.setInfoFormId(cTAButtonAppModel.getInfoFormId());
                    }
                    CtaPopUp cta3 = dialog.getCta();
                    if (cta3 != null && (primaryButton = cta3.getPrimaryButton()) != null) {
                        primaryButton.setDelete(cTAButtonAppModel.isDelete());
                    }
                    CtaPopUp cta4 = dialog.getCta();
                    if (cta4 != null && (secondaryButton = cta4.getSecondaryButton()) != null) {
                        secondaryButton.setDelete(cTAButtonAppModel.isDelete());
                    }
                    abstractC42074rFj.AEQbTJ(dialog, c52794wYp, fragmentActivity);
                }
                break;
            case 13:
                str8 = strGEmmrt;
                cancelLoading$default(this, c52794wYp, fragmentActivity, false, 4, null);
                ActionParams actionParams3 = cTAButtonAppModel.getActionParams();
                if (actionParams3 != null && (deeplink = actionParams3.getDeeplink()) != null && fragmentActivity != null) {
                    ActionParams actionParams4 = cTAButtonAppModel.getActionParams();
                    Intrinsics.copydefault(actionParams4);
                    if (Intrinsics.EZpvd((java.lang.Object) actionParams4.getUrlType(), (java.lang.Object) "url")) {
                        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, fragmentActivity, BundleKt.bundleOf(C56390yDp.OLrzqt("url", deeplink)), null, 4, null);
                    } else {
                        C42463rTu.deepLinkJump$default(C42463rTu.KWHzl, fragmentActivity, deeplink, null, 4, null);
                    }
                    ActionParams actionParams5 = cTAButtonAppModel.getActionParams();
                    Intrinsics.copydefault(actionParams5);
                    if (Intrinsics.EZpvd(actionParams5.getShouldClosePage(), java.lang.Boolean.TRUE)) {
                        abstractC42074rFj.AEQbTJ("", (ResultStatus) null);
                    }
                }
                break;
            case 14:
                str8 = strGEmmrt;
                cancelLoading$default(this, c52794wYp, fragmentActivity, false, 4, null);
                if (fragmentActivity != null) {
                    rTU.Application.checkUKRiskStatus$default((rTU) C43251rlk.copydefault(rTU.class), fragmentActivity, null, null, null, null, new Function1() { // from class: o.rFw
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return AbstractC42074rFj.OLrzqt(this.EZpvd, ((java.lang.Integer) obj).intValue());
                        }
                    }, null, null, 222, null);
                }
                break;
            case 15:
                str8 = strGEmmrt;
                cancelLoading$default(this, c52794wYp, fragmentActivity, false, 4, null);
                if (fragmentActivity != null) {
                    rTM.KWHzl.EZpvd(fragmentActivity);
                }
                break;
            case 16:
                str8 = strGEmmrt;
                cancelLoading$default(this, c52794wYp, fragmentActivity, false, 4, null);
                if (fragmentActivity != null) {
                    rSF.Application.gotoMain$default((rSF) C43251rlk.copydefault(rSF.class), fragmentActivity, null, 2, null);
                }
                break;
            case 17:
                str8 = strGEmmrt;
                cancelLoading$default(this, c52794wYp, fragmentActivity, false, 4, null);
                wlaJM();
                break;
            case 18:
                str8 = strGEmmrt;
                abstractC42074rFj.EZpvd(c52794wYp, fragmentActivity, cTAButtonAppModel.getStyle(), complianceTheme);
                ActionParams actionParams6 = cTAButtonAppModel.getActionParams();
                if (actionParams6 != null && (subCurrencyId = actionParams6.getSubCurrencyId()) != null) {
                    call().AEQbTJ(rSW.KWHzl.copydefault(subCurrencyId.intValue(), new Function1() { // from class: o.rFA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return AbstractC42074rFj.copydefault(this.copydefault, c52794wYp, str8, str, str2, map, str3, fragmentActivity, ((java.lang.Integer) obj).intValue());
                        }
                    }));
                } else {
                    cancelLoading$default(this, c52794wYp, fragmentActivity, false, 4, null);
                }
                break;
            case 19:
                str8 = strGEmmrt;
                ActionParams actionParams7 = cTAButtonAppModel.getActionParams();
                if (actionParams7 == null || (verificationPayload = actionParams7.getVerificationPayload()) == null) {
                    abstractC42074rFj = this;
                    cancelLoading$default(this, c52794wYp, fragmentActivity, false, 4, null);
                } else if (fragmentActivity == null) {
                    abstractC42074rFj = this;
                } else {
                    abstractC42074rFj = this;
                    abstractC42074rFj.EZpvd(c52794wYp, fragmentActivity, cTAButtonAppModel.getStyle(), complianceTheme);
                    call().AEQbTJ(rSW.KWHzl.KWHzl(fragmentActivity, verificationPayload, new Function0() { // from class: o.rFB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return AbstractC42074rFj.KWHzl(this.copydefault, c52794wYp, fragmentActivity);
                        }
                    }, new Function1() { // from class: o.rFz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return AbstractC42074rFj.OLrzqt(this.AEQbTJ, c52794wYp, str8, str, str2, map, str3, fragmentActivity, (java.util.Map) obj);
                        }
                    }));
                }
                break;
            case 20:
                str8 = strGEmmrt;
                ActionParams actionParams8 = cTAButtonAppModel.getActionParams();
                if (actionParams8 != null && (verificationPayload2 = actionParams8.getVerificationPayload()) != null && fragmentActivity != null) {
                    rSW.KWHzl.OLrzqt(fragmentActivity, verificationPayload2, new Function0() { // from class: o.rFy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return AbstractC42074rFj.OLrzqt(this.KWHzl, c52794wYp, fragmentActivity);
                        }
                    }, new Function1() { // from class: o.rFx
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return AbstractC42074rFj.copydefault(this.copydefault, c52794wYp, fragmentActivity, cTAButtonAppModel, complianceTheme, str8, str, str2, map, str3, (java.util.Map) obj);
                        }
                    });
                }
                abstractC42074rFj = this;
                break;
            case 21:
                str8 = strGEmmrt;
                ActionParams actionParams9 = cTAButtonAppModel.getActionParams();
                if (actionParams9 != null && (verificationPayload3 = actionParams9.getVerificationPayload()) != null && fragmentActivity != null) {
                    rSW.KWHzl.EZpvd(fragmentActivity, verificationPayload3, new Function0() { // from class: o.rFG
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return AbstractC42074rFj.gEmmrt(this.OLrzqt, c52794wYp, fragmentActivity);
                        }
                    }, new Function1() { // from class: o.rFC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return AbstractC42074rFj.OLrzqt(this.EZpvd, c52794wYp, fragmentActivity, cTAButtonAppModel, complianceTheme, str8, str, str2, map, str3, (java.util.Map) obj);
                        }
                    });
                }
                abstractC42074rFj = this;
                break;
            case 22:
                str8 = strGEmmrt;
                if (Intrinsics.EZpvd(cTAButtonAppModel.isDelete(), java.lang.Boolean.TRUE)) {
                    java.lang.String infoFormId = cTAButtonAppModel.getInfoFormId();
                    if (infoFormId != null && (actionParams = cTAButtonAppModel.getActionParams()) != null && (delete = actionParams.getDelete()) != null) {
                        C43693ruB.OLrzqt("KYC_PEP_InfoForm_Delete_Click");
                        abstractC42074rFj = this;
                        abstractC42074rFj.EZpvd(c52794wYp, fragmentActivity, cTAButtonAppModel.getStyle(), complianceTheme);
                        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(delete.getApi());
                        java.lang.String successMessage = delete.getSuccessMessage();
                        java.util.HashMap<java.lang.String, java.lang.String> extraParams = delete.getExtraParams();
                        if (extraParams == null) {
                            extraParams = new java.util.HashMap<>();
                        }
                        OLrzqt(c52794wYp, strGEmmrt2, successMessage, extraParams, infoFormId, fragmentActivity);
                        break;
                    }
                } else {
                    abstractC42074rFj = this;
                    abstractC42074rFj.EZpvd(c52794wYp, fragmentActivity, cTAButtonAppModel.getStyle(), complianceTheme);
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) cTAButtonAppModel.getInfoFormId())) {
                        C43693ruB.OLrzqt("KYC_PEP_InfoForm_Update_Click");
                        ActionParams actionParams10 = cTAButtonAppModel.getActionParams();
                        java.lang.String strGEmmrt3 = C33129mqd.gEmmrt((actionParams10 == null || (update3 = actionParams10.getUpdate()) == null) ? null : update3.getApi());
                        ActionParams actionParams11 = cTAButtonAppModel.getActionParams();
                        if (actionParams11 != null && (update2 = actionParams11.getUpdate()) != null) {
                            successMessage = update2.getSuccessMessage();
                        }
                        java.lang.String infoFormId2 = cTAButtonAppModel.getInfoFormId();
                        Intrinsics.copydefault((java.lang.Object) infoFormId2);
                        C41957rBa c41957rBa = abstractC42074rFj.iwGUEr;
                        ActionParams actionParams12 = cTAButtonAppModel.getActionParams();
                        if (actionParams12 == null || (update = actionParams12.getUpdate()) == null || (map3 = update.getExtraParams()) == null) {
                            map3 = new java.util.HashMap<>();
                        }
                        EZpvd(strGEmmrt3, successMessage, infoFormId2, c52794wYp, c41957rBa, map3, fragmentActivity);
                    } else {
                        C43693ruB.OLrzqt("KYC_PEP_InfoForm_Add_Click");
                        ActionParams actionParams13 = cTAButtonAppModel.getActionParams();
                        java.lang.String strGEmmrt4 = C33129mqd.gEmmrt((actionParams13 == null || (create3 = actionParams13.getCreate()) == null) ? null : create3.getApi());
                        ActionParams actionParams14 = cTAButtonAppModel.getActionParams();
                        java.lang.String successMessage2 = (actionParams14 == null || (create2 = actionParams14.getCreate()) == null) ? null : create2.getSuccessMessage();
                        C41957rBa c41957rBa2 = abstractC42074rFj.iwGUEr;
                        ActionParams actionParams15 = cTAButtonAppModel.getActionParams();
                        if (actionParams15 == null || (create = actionParams15.getCreate()) == null || (map2 = create.getExtraParams()) == null) {
                            map2 = new java.util.HashMap<>();
                        }
                        copydefault(strGEmmrt4, successMessage2, c52794wYp, c41957rBa2, map2, fragmentActivity);
                    }
                    break;
                }
                break;
            case 23:
                str8 = strGEmmrt;
                ActionParams actionParams16 = cTAButtonAppModel.getActionParams();
                successMessage = actionParams16 != null ? actionParams16.getTravelRuleId() : null;
                if (successMessage != null) {
                    CompliancePostOnboardingModel compliancePostOnboardingModel = new CompliancePostOnboardingModel(str, map, str8, linkedHashMap, str3);
                    cancelLoading$default(this, c52794wYp, fragmentActivity, false, 4, null);
                    C42435rSt.KWHzl.EZpvd(fragmentActivity, C33129mqd.valueOf(successMessage), compliancePostOnboardingModel);
                }
                abstractC42074rFj = this;
                break;
            case 24:
                str8 = strGEmmrt;
                if (fragmentActivity != null) {
                    rTM.KWHzl.EZpvd((android.content.Context) fragmentActivity);
                    fragmentActivity.finish();
                }
                abstractC42074rFj = this;
                break;
            case 25:
                cancelLoading$default(this, c52794wYp, fragmentActivity, false, 4, null);
                if (fragmentActivity != null) {
                    str8 = strGEmmrt;
                    ((InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class)).OLrzqt(fragmentActivity, OKPaymentSource.KYC_POA, new Activity(c52794wYp, fragmentActivity, cTAButtonAppModel, complianceTheme, str8, linkedHashMap, str, str2, map, str3));
                } else {
                    str8 = strGEmmrt;
                }
                abstractC42074rFj = this;
                break;
            case 26:
                abstractC42074rFj.wlaJM.setValue(java.lang.Boolean.TRUE);
                str8 = strGEmmrt;
                break;
            default:
                str8 = strGEmmrt;
                pUU.KWHzl(abstractC42074rFj.KWHzl, "onButtonClicked | Unsupported buttonAction");
                break;
        }
        if (!Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE) || (action = cTAButtonAppModel.getAction()) == null) {
            return;
        }
        java.lang.String strName = action.name();
        java.lang.String playbook = cTAButtonAppModel.getPlaybook();
        if (playbook == null) {
            playbook = str;
        }
        c43739ruv.OLrzqt(strName, playbook, str3, str8, C33129mqd.OLrzqt((java.lang.CharSequence) cTAButtonAppModel.getPlaybook()) ? abstractC42074rFj.EZpvd(cTAButtonAppModel) : map);
    }

    public static final Unit OLrzqt(AbstractC42074rFj abstractC42074rFj, int i) {
        if (i == 1) {
            abstractC42074rFj.DbNXlk.setValue(new C43734ruq<>(java.lang.Boolean.TRUE));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.HashMap map, java.lang.String str4, FragmentActivity fragmentActivity, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("walletStatusCode", java.lang.String.valueOf(i));
        postOnboarding$default(abstractC42074rFj, c52794wYp, str, linkedHashMap, str2, str3, new C41957rBa(), map, str4, fragmentActivity, null, null, null, null, null, null, null, 65024, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, FragmentActivity fragmentActivity) {
        cancelLoading$default(abstractC42074rFj, c52794wYp, fragmentActivity, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.HashMap map, java.lang.String str4, FragmentActivity fragmentActivity, java.util.Map map2) {
        Intrinsics.checkNotNullParameter(map2, "");
        postOnboarding$default(abstractC42074rFj, c52794wYp, str, map2, str2, str3, new C41957rBa(), map, str4, fragmentActivity, null, null, null, null, null, null, null, 65024, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, FragmentActivity fragmentActivity) {
        cancelLoading$default(abstractC42074rFj, c52794wYp, fragmentActivity, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, FragmentActivity fragmentActivity, CTAButtonAppModel cTAButtonAppModel, ComplianceTheme complianceTheme, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.HashMap map, java.lang.String str4, java.util.Map map2) {
        Intrinsics.checkNotNullParameter(map2, "");
        abstractC42074rFj.EZpvd(c52794wYp, fragmentActivity, cTAButtonAppModel.getStyle(), complianceTheme);
        postOnboarding$default(abstractC42074rFj, null, str, map2, str2, str3, new C41957rBa(), map, str4, fragmentActivity, null, null, null, null, null, null, null, 65024, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, FragmentActivity fragmentActivity) {
        cancelLoading$default(abstractC42074rFj, c52794wYp, fragmentActivity, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, FragmentActivity fragmentActivity, CTAButtonAppModel cTAButtonAppModel, ComplianceTheme complianceTheme, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.HashMap map, java.lang.String str4, java.util.Map map2) {
        Intrinsics.checkNotNullParameter(map2, "");
        abstractC42074rFj.EZpvd(c52794wYp, fragmentActivity, cTAButtonAppModel.getStyle(), complianceTheme);
        postOnboarding$default(abstractC42074rFj, null, str, map2, str2, str3, new C41957rBa(), map, str4, fragmentActivity, null, null, null, null, null, null, null, 65024, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rFj$Activity */
    public static final class Activity implements InterfaceC47250tmW {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ C52794wYp AYXKKw;
        public final /* synthetic */ java.util.HashMap<java.lang.String, java.lang.String> AhwBna;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ CTAButtonAppModel KWHzl;
        public final /* synthetic */ java.util.Map<java.lang.String, java.lang.String> OLrzqt;
        public final /* synthetic */ FragmentActivity copydefault;
        public final /* synthetic */ java.lang.String djBIcL;
        public final /* synthetic */ java.lang.String gEmmrt;
        public final /* synthetic */ ComplianceTheme valueOf;

        public Activity(C52794wYp c52794wYp, FragmentActivity fragmentActivity, CTAButtonAppModel cTAButtonAppModel, ComplianceTheme complianceTheme, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.lang.String str3, java.util.HashMap<java.lang.String, java.lang.String> map2, java.lang.String str4) {
            this.AYXKKw = c52794wYp;
            this.copydefault = fragmentActivity;
            this.KWHzl = cTAButtonAppModel;
            this.valueOf = complianceTheme;
            this.gEmmrt = str;
            this.OLrzqt = map;
            this.djBIcL = str2;
            this.AEQbTJ = str3;
            this.AhwBna = map2;
            this.EZpvd = str4;
        }
    }

    public static /* synthetic */ void connectToOnlineSupport$default(AbstractC42074rFj abstractC42074rFj, FragmentActivity fragmentActivity, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connectToOnlineSupport");
        }
        if ((i & 1) != 0) {
            fragmentActivity = null;
        }
        abstractC42074rFj.EZpvd(fragmentActivity);
    }

    public final void EZpvd(FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            ((InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class)).copydefault(fragmentActivity, new ChatBotRequest());
        }
    }

    public static /* synthetic */ void ocrVenderAction$default(AbstractC42074rFj abstractC42074rFj, CTAButtonAppModel cTAButtonAppModel, C52794wYp c52794wYp, java.lang.String str, java.util.Map map, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map2, ComplianceTheme complianceTheme, FragmentActivity fragmentActivity, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ocrVenderAction");
        }
        abstractC42074rFj.EZpvd(cTAButtonAppModel, (i & 2) != 0 ? null : c52794wYp, str, (java.util.Map<java.lang.String, java.lang.String>) map, str2, str3, str4, (java.util.Map<java.lang.String, java.lang.String>) map2, (i & 256) != 0 ? ComplianceTheme.OKX : complianceTheme, (i & 512) != 0 ? null : fragmentActivity, (i & 1024) != 0 ? java.lang.Boolean.FALSE : bool);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.okinc.ok_kyc_core.data.remote.networkmodel.SSLErrorModel] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, com.okinc.ok_kyc_core.data.remote.networkmodel.SSLErrorModel] */
    public final void EZpvd(@NotNull CTAButtonAppModel cTAButtonAppModel, final C52794wYp c52794wYp, @NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.util.Map<java.lang.String, java.lang.String> map2, @NotNull ComplianceTheme complianceTheme, final FragmentActivity fragmentActivity, final java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(complianceTheme, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final Ref.IntRef intRef = new Ref.IntRef();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new SSLErrorModel((java.lang.Integer) null, 0, (java.util.ArrayList) null, (java.lang.String) null, 15, (DefaultConstructorMarker) null);
        ActionParams actionParams = cTAButtonAppModel.getActionParams();
        if (actionParams != null) {
            java.lang.Integer verifyIdFront = actionParams.getVerifyIdFront();
            if (verifyIdFront != null) {
                arrayList.add(java.lang.Integer.valueOf(verifyIdFront.intValue()));
            }
            java.lang.Integer verifyIdBack = actionParams.getVerifyIdBack();
            if (verifyIdBack != null) {
                arrayList.add(java.lang.Integer.valueOf(verifyIdBack.intValue()));
            }
            java.lang.Integer verifySelfi = actionParams.getVerifySelfi();
            if (verifySelfi != null) {
                arrayList.add(java.lang.Integer.valueOf(verifySelfi.intValue()));
            }
            java.lang.Integer forceBackEndConfig = actionParams.getForceBackEndConfig();
            if (forceBackEndConfig != null) {
                intRef.element = forceBackEndConfig.intValue();
            }
            objectRef.element = new SSLErrorModel(actionParams.getSdkErrorSwitch(), actionParams.getSdkErrorNumber(), actionParams.getSdkErrorMsg(), actionParams.getSdkErrorTarget());
        }
        copydefault(cTAButtonAppModel, c52794wYp, str, map, str2, str3, str4, new java.util.HashMap<>(map2), complianceTheme, fragmentActivity, bool, arrayList, new Function2() { // from class: o.rFL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC42074rFj.EZpvd(str2, map2, this, fragmentActivity, c52794wYp, str, map, str3, str4, arrayList, intRef, objectRef, bool, (MultiVendorTokenResp) obj, (CreateSessionIdResponse) obj2);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0088 -> B:42:0x00a3). Please report as a decompilation issue!!! */
    public static final Unit EZpvd(final java.lang.String str, final java.util.Map map, final AbstractC42074rFj abstractC42074rFj, final FragmentActivity fragmentActivity, C52794wYp c52794wYp, java.lang.String str2, java.util.Map map2, java.lang.String str3, java.lang.String str4, java.util.List list, Ref.IntRef intRef, Ref.ObjectRef objectRef, final java.lang.Boolean bool, final MultiVendorTokenResp multiVendorTokenResp, CreateSessionIdResponse createSessionIdResponse) {
        java.lang.String str5 = "singpass_installed";
        Intrinsics.checkNotNullParameter(multiVendorTokenResp, "");
        if (Intrinsics.EZpvd((java.lang.Object) multiVendorTokenResp.getMode(), (java.lang.Object) "url") && C33129mqd.OLrzqt((java.lang.CharSequence) multiVendorTokenResp.getUrl())) {
            java.util.HashMap map3 = new java.util.HashMap();
            map3.put("vendor_type", C33129mqd.gEmmrt(multiVendorTokenResp.getVendorType()));
            map3.put("playbook", new C43739ruv().KWHzl(str));
            map3.put("action_params", new Gson().toJson(map));
            map3.put("refresh_type", C33129mqd.gEmmrt(map.get("refreshType")));
            try {
                if (abstractC42074rFj.EZpvd(fragmentActivity, "sg.ndi.sp") != null) {
                    map3.put("singpass_installed", "yes");
                    pUU.EZpvd(abstractC42074rFj.KWHzl, "zhouzhouzhou-----getPackageManager>  singpass 已安装");
                } else {
                    map3.put("singpass_installed", "no");
                }
            } catch (java.lang.Exception e) {
                map3.put(str5, "no");
                str5 = abstractC42074rFj.KWHzl;
                pUU.EZpvd(str5, "-----" + e.getMessage());
            }
            try {
                if (abstractC42074rFj.EZpvd(fragmentActivity, "be.bmid.itsme") != null) {
                    map3.put("itsme_installed", "yes");
                    pUU.EZpvd(abstractC42074rFj.KWHzl, "zhouzhouzhou-----getPackageManager>  itsme 已安装");
                } else {
                    map3.put("itsme_installed", "no");
                }
            } catch (java.lang.Exception e2) {
                map3.put("itsme_installed", "no");
                pUU.EZpvd(abstractC42074rFj.KWHzl, "-----" + e2.getMessage());
            }
            try {
                if (abstractC42074rFj.EZpvd(fragmentActivity, "com.governikus.ausweisapp2") != null) {
                    map3.put("ausweisapp_installed", "yes");
                    pUU.EZpvd(abstractC42074rFj.KWHzl, "zhouzhouzhou-----getPackageManager>  ausweisapp 已安装");
                } else {
                    map3.put("ausweisapp_installed", "no");
                }
            } catch (java.lang.Exception e3) {
                map3.put("ausweisapp_installed", "no");
                pUU.EZpvd(abstractC42074rFj.KWHzl, "-----" + e3.getMessage());
            }
            C43693ruB.copydefault("KYC_URL_Vendor_Start", map3);
            C43693ruB.copydefault("KYC_URL_VendorStart_View", map3);
            postOnboarding$default(abstractC42074rFj, c52794wYp, str2, map2, str, str3, new C41957rBa(), map, str4, fragmentActivity, multiVendorTokenResp.getUrl(), null, null, null, new Function1() { // from class: o.rFm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC42074rFj.EZpvd(bool, abstractC42074rFj, (java.lang.String) obj);
                }
            }, new Function0() { // from class: o.rFv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC42074rFj.EZpvd(fragmentActivity, multiVendorTokenResp, str, map);
                }
            }, null, 39936, null);
        } else {
            MutableLiveData<C43734ruq<rFR>> mutableLiveData = abstractC42074rFj.valueOf;
            Intrinsics.copydefault(map2, "");
            mutableLiveData.setValue(new C43734ruq<>(new rFR(str4, str2, (java.util.HashMap) map2, list, intRef.element, (SSLErrorModel) objectRef.element, multiVendorTokenResp, createSessionIdResponse != null ? createSessionIdResponse.getConfig() : null, createSessionIdResponse != null ? createSessionIdResponse.getCardSessionId() : null, createSessionIdResponse != null ? createSessionIdResponse.getCardCheckType() : null)));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.rEq.Application.openPage$default(o.rEq$Application, android.content.Context, android.os.Bundle, java.lang.Integer, int, java.lang.Object):void */
    public static final Unit EZpvd(FragmentActivity fragmentActivity, MultiVendorTokenResp multiVendorTokenResp, java.lang.String str, java.util.Map map) {
        if (fragmentActivity != null) {
            if (Intrinsics.EZpvd(multiVendorTokenResp.getUseWebview(), java.lang.Boolean.TRUE)) {
                ActivityC42054rEq.Application.openPage$default(ActivityC42054rEq.Companion, fragmentActivity, BundleKt.bundleOf(C56390yDp.OLrzqt("url", multiVendorTokenResp.getUrl()), C56390yDp.OLrzqt("listener_url", multiVendorTokenResp.getRedirectUrl()), C56390yDp.OLrzqt("enable_listener", multiVendorTokenResp.getEnableListener()), C56390yDp.OLrzqt("callBack_params", multiVendorTokenResp.getParams()), C56390yDp.OLrzqt("playbook", str), C56390yDp.OLrzqt("playbookParams", map)), null, 4, null);
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(android.net.Uri.parse(multiVendorTokenResp.getUrl()));
                try {
                    fragmentActivity.startActivity(intent);
                    Unit unit = Unit.INSTANCE;
                } catch (java.lang.Exception e) {
                    java.lang.String stackTraceString = android.util.Log.getStackTraceString(e);
                    Intrinsics.checkNotNullExpressionValue(stackTraceString, "");
                    C43296rmc.KWHzl("ProcessingFragment", stackTraceString);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.Boolean bool, AbstractC42074rFj abstractC42074rFj, java.lang.String str) {
        C43693ruB.copydefault("KYC_Vendor_Processing_Error", C56424yEw.AYXKKw(C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_MSG, java.lang.String.valueOf(str))));
        C43693ruB.copydefault("KYC_VendorProcessing_Error_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_MSG, java.lang.String.valueOf(str))));
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            abstractC42074rFj.wlaJM();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void urlVendorAction$default(AbstractC42074rFj abstractC42074rFj, CTAButtonAppModel cTAButtonAppModel, C52794wYp c52794wYp, java.lang.String str, java.util.Map map, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map2, ComplianceTheme complianceTheme, FragmentActivity fragmentActivity, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: urlVendorAction");
        }
        abstractC42074rFj.copydefault(cTAButtonAppModel, (i & 2) != 0 ? null : c52794wYp, str, map, str2, str3, str4, map2, (i & 256) != 0 ? ComplianceTheme.OKX : complianceTheme, (i & 512) != 0 ? null : fragmentActivity);
    }

    public final void copydefault(@NotNull CTAButtonAppModel cTAButtonAppModel, final C52794wYp c52794wYp, @NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.util.Map<java.lang.String, java.lang.String> map2, @NotNull ComplianceTheme complianceTheme, final FragmentActivity fragmentActivity) {
        java.lang.String transactionId;
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(complianceTheme, "");
        if (fragmentActivity != null) {
            ActionParams actionParams = cTAButtonAppModel.getActionParams();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (actionParams != null ? actionParams.getTransactionId() : null))) {
                EZpvd(c52794wYp, fragmentActivity, cTAButtonAppModel.getStyle(), complianceTheme);
                rTU rtu = (rTU) C43251rlk.copydefault(rTU.class);
                ActionParams actionParams2 = cTAButtonAppModel.getActionParams();
                rtu.EZpvd((actionParams2 == null || (transactionId = actionParams2.getTransactionId()) == null) ? "" : transactionId, fragmentActivity, new Function2() { // from class: o.rFF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return AbstractC42074rFj.EZpvd(this.AEQbTJ, c52794wYp, fragmentActivity, map, str4, str, str2, str3, map2, (java.lang.String) obj, (UrlVendorTokenResp) obj2);
                    }
                }, java.lang.Boolean.FALSE);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: o.rIE */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, FragmentActivity fragmentActivity, java.util.Map map, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map2, java.lang.String str5, UrlVendorTokenResp urlVendorTokenResp) {
        NavOptions navOptions;
        cancelLoading$default(abstractC42074rFj, c52794wYp, fragmentActivity, false, 4, null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (urlVendorTokenResp != null ? urlVendorTokenResp.getPollingUrl() : null))) {
            java.util.HashMap map3 = new java.util.HashMap();
            for (Map.Entry entry : map.entrySet()) {
                map3.put(entry.getKey(), entry.getValue());
            }
            rIE rie = rIE.KWHzl;
            Intrinsics.copydefault(urlVendorTokenResp);
            ProcessingAppModel processingAppModelOLrzqt = rie.OLrzqt(str, str2, urlVendorTokenResp, map3);
            if (processingAppModelOLrzqt.getItems().isEmpty()) {
                navOptions = NavOptions.CleanBackStackWithNoAmin;
            } else {
                navOptions = NavOptions.CleanBackStack;
            }
            abstractC42074rFj.AkhnZx.setValue(new C43734ruq<>(new kotlin.Pair(new C43700ruI(new OnDemandKYCAppModel(false, false, (PageComponentProfile) null, (PageComponentAppModel) processingAppModelOLrzqt, 7, (DefaultConstructorMarker) null), str3, str4, new java.util.HashMap(map2), navOptions, null, 32, null), c52794wYp)));
        } else {
            abstractC42074rFj.AYXKKw.setValue(new C43734ruq<>(C33129mqd.gEmmrt(str5)));
        }
        return Unit.INSTANCE;
    }

    public final android.content.pm.PackageInfo EZpvd(android.content.Context context, @NotNull java.lang.String str) {
        android.content.pm.PackageManager packageManager;
        Intrinsics.checkNotNullParameter(str, "");
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            return null;
        }
        return packageManager.getPackageInfo(str, 128);
    }

    public final java.lang.String OLrzqt(@NotNull java.util.HashMap<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return map.get("refreshType") != null ? "kyc_refresh" : "kyc_main_flow";
    }

    public static /* synthetic */ void getSessionForVendor$default(AbstractC42074rFj abstractC42074rFj, CTAButtonAppModel cTAButtonAppModel, C52794wYp c52794wYp, java.lang.String str, java.util.Map map, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.HashMap map2, ComplianceTheme complianceTheme, FragmentActivity fragmentActivity, java.lang.Boolean bool, java.util.List list, Function2 function2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSessionForVendor");
        }
        abstractC42074rFj.copydefault(cTAButtonAppModel, (i & 2) != 0 ? null : c52794wYp, str, map, str2, str3, str4, map2, (i & 256) != 0 ? ComplianceTheme.OKX : complianceTheme, (i & 512) != 0 ? null : fragmentActivity, (i & 1024) != 0 ? java.lang.Boolean.FALSE : bool, list, function2);
    }

    public final void copydefault(CTAButtonAppModel cTAButtonAppModel, C52794wYp c52794wYp, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.HashMap<java.lang.String, java.lang.String> map2, ComplianceTheme complianceTheme, FragmentActivity fragmentActivity, java.lang.Boolean bool, java.util.List<java.lang.Integer> list, Function2<? super MultiVendorTokenResp, ? super CreateSessionIdResponse, Unit> function2) {
        C43701ruJ c43701ruJ = C43701ruJ.EZpvd;
        java.util.ArrayList<EopImageInfo> arrayListKWHzl = c43701ruJ.KWHzl();
        java.lang.Integer numOLrzqt = c43701ruJ.OLrzqt();
        if (C33129mqd.KWHzl((java.util.Collection) arrayListKWHzl)) {
            int vendorType = Constant.VendorType.EOP.getVendorType();
            if (numOLrzqt != null && numOLrzqt.intValue() == vendorType && c43701ruJ.copydefault()) {
                pUU.KWHzl("qjf", "OKComplianceActivity reCreate-->");
                c43701ruJ.AEQbTJ();
                if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
                    wlaJM();
                    return;
                }
                return;
            }
        }
        EZpvd(c52794wYp, fragmentActivity, cTAButtonAppModel.getStyle(), complianceTheme);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseKYCViewModel$getSessionForVendor$1(this, list, function2, c52794wYp, fragmentActivity, str, map, str2, str3, str4, map2, bool, numOLrzqt, null), 3, null);
    }

    public static /* synthetic */ void getSessionTokenError$default(AbstractC42074rFj abstractC42074rFj, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.HashMap map2, C52794wYp c52794wYp, FragmentActivity fragmentActivity, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSessionTokenError");
        }
        abstractC42074rFj.AEQbTJ((i & 1) != 0 ? "" : str, str2, (java.util.Map<java.lang.String, java.lang.String>) map, str3, str4, str5, (java.util.HashMap<java.lang.String, java.lang.String>) map2, (i & 128) != 0 ? null : c52794wYp, (i & 256) != 0 ? null : fragmentActivity, (i & 512) != 0 ? java.lang.Boolean.FALSE : bool);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.HashMap<java.lang.String, java.lang.String> map2, C52794wYp c52794wYp, FragmentActivity fragmentActivity, final java.lang.Boolean bool) {
        pUU.KWHzl(this.KWHzl, "getSessionTokenError-->");
        AEQbTJ(new AbstractC43697ruF.StateListAnimator(VendorEvent.VENDOR_SDK_TOKEN_ERROR, str2, map, str), str3, str4, str5, map2, c52794wYp, fragmentActivity, new Function0() { // from class: o.rFE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC42074rFj.EZpvd(bool, this);
            }
        });
    }

    public static final Unit EZpvd(java.lang.Boolean bool, AbstractC42074rFj abstractC42074rFj) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            abstractC42074rFj.wlaJM();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: o.rFj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void signalCompletionAndPop$default(AbstractC42074rFj abstractC42074rFj, AbstractC43697ruF abstractC43697ruF, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.HashMap map, C52794wYp c52794wYp, FragmentActivity fragmentActivity, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signalCompletionAndPop");
        }
        abstractC42074rFj.AEQbTJ(abstractC43697ruF, str, str2, str3, map, (i & 32) != 0 ? null : c52794wYp, (i & 64) != 0 ? null : fragmentActivity, (i & 128) != 0 ? null : function0);
    }

    public final void AEQbTJ(@NotNull AbstractC43697ruF abstractC43697ruF, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, C52794wYp c52794wYp, FragmentActivity fragmentActivity, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(abstractC43697ruF, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        pUU.KWHzl("qjf", "signalCompletionAndPop result=" + abstractC43697ruF);
        if (abstractC43697ruF instanceof AbstractC43697ruF.Activity) {
            AbstractC43697ruF.Activity activity = (AbstractC43697ruF.Activity) abstractC43697ruF;
            pUU.KWHzl("qjf", "signalCompletionAndPop eventCode = " + activity.AEQbTJ());
            if (VendorEvent.VENDOR_NO_PIC == activity.AEQbTJ()) {
                C55326xho.toast$default(DbNXlk(C43662rtX.Dialog.Dmq), C33070mpX.KWHzl(C43662rtX.Activity.OqFWZa), 0, (java.lang.Integer) null, 0, 0, 30, (java.lang.Object) null);
            }
            cancelLoading$default(this, c52794wYp, fragmentActivity, false, 4, null);
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (abstractC43697ruF instanceof AbstractC43697ruF.TaskDescription) {
            AbstractC43697ruF.TaskDescription taskDescription = (AbstractC43697ruF.TaskDescription) abstractC43697ruF;
            postOnboarding$default(this, c52794wYp, taskDescription.OLrzqt(), taskDescription.copydefault(), str, str2, new C41957rBa(), map, str3, fragmentActivity, null, null, null, null, new Function1() { // from class: o.rFu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC42074rFj.OLrzqt(function0, (java.lang.String) obj);
                }
            }, null, null, 56832, null);
            return;
        }
        if (!(abstractC43697ruF instanceof AbstractC43697ruF.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43697ruF.StateListAnimator stateListAnimator = (AbstractC43697ruF.StateListAnimator) abstractC43697ruF;
        pUU.KWHzl("qjf", "signalCompletionAndPop eventCode = " + stateListAnimator.KWHzl());
        if (VendorEvent.VENDOR_VERIFY_FAILED == stateListAnimator.KWHzl() || VendorEvent.VENDOR_SDK_TOKEN_ERROR == stateListAnimator.KWHzl()) {
            C55326xho.toast$default(stateListAnimator.OLrzqt(), C33070mpX.KWHzl(C43662rtX.Activity.OqFWZa), 0, (java.lang.Integer) null, 0, 0, 30, (java.lang.Object) null);
            cancelLoading$default(this, c52794wYp, fragmentActivity, false, 4, null);
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (EZpvd.contains(stateListAnimator.KWHzl())) {
            C55326xho.toast$default(DbNXlk(C43662rtX.Dialog.ejfBZ), C33070mpX.KWHzl(C43662rtX.Activity.OqFWZa), 0, (java.lang.Integer) null, 0, 0, 30, (java.lang.Object) null);
            cancelLoading$default(this, c52794wYp, fragmentActivity, false, 4, null);
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        postOnboarding$default(this, c52794wYp, stateListAnimator.copydefault(), stateListAnimator.AEQbTJ(), str, str2, new C41957rBa(), map, str3, fragmentActivity, null, null, null, null, new Function1() { // from class: o.rFt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC42074rFj.EZpvd(function0, (java.lang.String) obj);
            }
        }, null, null, 56832, null);
    }

    public static final Unit OLrzqt(Function0 function0, java.lang.String str) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function0 function0, java.lang.String str) {
        C43693ruB.EZpvd("KYC_Vendor_Error_Post_Error", C33129mqd.gEmmrt(str));
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void aliFaceAction$default(AbstractC42074rFj abstractC42074rFj, CTAButtonAppModel cTAButtonAppModel, C52794wYp c52794wYp, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3, java.lang.String str4, java.util.HashMap map2, ComplianceTheme complianceTheme, FragmentActivity fragmentActivity, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: aliFaceAction");
        }
        abstractC42074rFj.OLrzqt(cTAButtonAppModel, (i & 2) != 0 ? null : c52794wYp, str, str2, map, str3, str4, map2, (i & 256) != 0 ? ComplianceTheme.OKX : complianceTheme, (i & 512) != 0 ? null : fragmentActivity);
    }

    public final void OLrzqt(CTAButtonAppModel cTAButtonAppModel, C52794wYp c52794wYp, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, final java.lang.String str3, java.lang.String str4, final java.util.HashMap<java.lang.String, java.lang.String> map2, ComplianceTheme complianceTheme, FragmentActivity fragmentActivity) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KYC_China_Aliface_Entrance", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rFD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC42074rFj.AEQbTJ(str3, map2, (EventParamsList) obj);
            }
        });
        EZpvd(c52794wYp, fragmentActivity, cTAButtonAppModel.getStyle(), complianceTheme);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new BaseKYCViewModel$aliFaceAction$2(fragmentActivity, str3, map2, this, c52794wYp, cTAButtonAppModel, complianceTheme, str2, str, map, str4, null), 2, null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.util.HashMap map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("playbook", new C43739ruv().KWHzl(str), false);
        java.lang.String json = new Gson().toJson(map);
        Intrinsics.checkNotNullExpressionValue(json, "");
        eventParamsList.put("action_params", json, false);
        eventParamsList.put("refresh_type", C33129mqd.gEmmrt(map.get("refreshType")), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.rFj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void ocrMergeAccountAction$default(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, FragmentActivity fragmentActivity, ComplianceTheme complianceTheme, ButtonStyle buttonStyle, ActivityResultLauncher activityResultLauncher, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ocrMergeAccountAction");
        }
        C52794wYp c52794wYp2 = (i & 1) != 0 ? null : c52794wYp;
        if ((i & 4) != 0) {
            complianceTheme = ComplianceTheme.OKX;
        }
        abstractC42074rFj.copydefault(c52794wYp2, fragmentActivity, complianceTheme, buttonStyle, (i & 16) != 0 ? null : activityResultLauncher);
    }

    public final void copydefault(C52794wYp c52794wYp, FragmentActivity fragmentActivity, ComplianceTheme complianceTheme, ButtonStyle buttonStyle, ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        EZpvd(c52794wYp, fragmentActivity, buttonStyle, complianceTheme);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseKYCViewModel$ocrMergeAccountAction$1(this, c52794wYp, fragmentActivity, activityResultLauncher, null), 3, null);
    }

    public static /* synthetic */ void checkMRAccountResultWithAliGlobal$default(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, FragmentActivity fragmentActivity, ButtonStyle buttonStyle, ComplianceTheme complianceTheme, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkMRAccountResultWithAliGlobal");
        }
        if ((i & 2) != 0) {
            fragmentActivity = null;
        }
        abstractC42074rFj.OLrzqt(c52794wYp, fragmentActivity, buttonStyle, complianceTheme);
    }

    public final void OLrzqt(C52794wYp c52794wYp, FragmentActivity fragmentActivity, @NotNull ButtonStyle buttonStyle, @NotNull ComplianceTheme complianceTheme) {
        Intrinsics.checkNotNullParameter(buttonStyle, "");
        Intrinsics.checkNotNullParameter(complianceTheme, "");
        EZpvd(c52794wYp, fragmentActivity, buttonStyle, complianceTheme);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseKYCViewModel$checkMRAccountResultWithAliGlobal$1(this, fragmentActivity, null), 3, null);
    }

    public static /* synthetic */ void dialogAction$default(AbstractC42074rFj abstractC42074rFj, ButtonDialog buttonDialog, C52794wYp c52794wYp, FragmentActivity fragmentActivity, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dialogAction");
        }
        if ((i & 2) != 0) {
            c52794wYp = null;
        }
        if ((i & 4) != 0) {
            fragmentActivity = null;
        }
        abstractC42074rFj.AEQbTJ(buttonDialog, c52794wYp, fragmentActivity);
    }

    public final void AEQbTJ(@NotNull ButtonDialog buttonDialog, C52794wYp c52794wYp, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(buttonDialog, "");
        if (fragmentActivity != null) {
            rQZ.KWHzl.AEQbTJ(fragmentActivity, buttonDialog, new Function1() { // from class: o.rFN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC42074rFj.KWHzl(this.AEQbTJ, (CTAButtonAppModel) obj);
                }
            });
            this.fARcdN = c52794wYp;
        }
    }

    public static final Unit KWHzl(AbstractC42074rFj abstractC42074rFj, CTAButtonAppModel cTAButtonAppModel) {
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        abstractC42074rFj.values.setValue(new C43734ruq<>(new kotlin.Pair(cTAButtonAppModel, new DialogInformation("", false, null, 4, null))));
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull java.lang.String str, ResultStatus resultStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna.setValue(new C43734ruq<>(new kotlin.Pair(AhwBna(str), resultStatus)));
    }

    public static /* synthetic */ void showSnackbarAction$default(AbstractC42074rFj abstractC42074rFj, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSnackbarAction");
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        abstractC42074rFj.EZpvd(str, i);
    }

    public final void EZpvd(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isConnected.setValue(new C43734ruq<>(new kotlin.Pair(str, java.lang.Integer.valueOf(i))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1695=13] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final From AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1899438817:
                if (str.equals("kyc1Refresh")) {
                    return From.KYC1REFRESH;
                }
                break;
            case -1629586251:
                if (str.equals("withdrawal")) {
                    return From.WITHDRAWAL;
                }
                break;
            case -1017049693:
                if (str.equals("questionnaire")) {
                    return From.QUESTIONNAIRE;
                }
                break;
            case -974297739:
                if (str.equals("additionalInfo")) {
                    return From.ADDITIONALINFO;
                }
                break;
            case -156628482:
                if (str.equals("kyc2Refresh")) {
                    return From.KYC2REFRESH;
                }
                break;
            case 100261:
                if (str.equals("edd")) {
                    return From.EDD;
                }
                break;
            case 3208415:
                if (str.equals("home")) {
                    return From.HOME;
                }
                break;
            case 3307036:
                if (str.equals("kyc1")) {
                    return From.KYC1;
                }
                break;
            case 3307037:
                if (str.equals("kyc2")) {
                    return From.KYC2;
                }
                break;
            case 3307038:
                if (str.equals("kyc3")) {
                    return From.KYC3;
                }
                break;
            case 1140645955:
                if (str.equals("derivativeAgreement")) {
                    return From.DERIVATIVE_AGREEMENT;
                }
                break;
            case 1577852456:
                if (str.equals("notabene")) {
                    return From.NOTABENE;
                }
                break;
            case 1928287881:
                if (str.equals("questionNotNow")) {
                    return From.QUESTION_NOTNOW;
                }
                break;
        }
        return From.NONE;
    }

    public static /* synthetic */ void skipAction$default(AbstractC42074rFj abstractC42074rFj, CTAButtonAppModel cTAButtonAppModel, C52794wYp c52794wYp, java.lang.String str, java.util.Map map, java.lang.String str2, java.lang.String str3, java.util.Map map2, java.lang.String str4, ComplianceTheme complianceTheme, FragmentActivity fragmentActivity, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: skipAction");
        }
        abstractC42074rFj.AEQbTJ(cTAButtonAppModel, (i & 2) != 0 ? null : c52794wYp, str, (java.util.Map<java.lang.String, java.lang.String>) map, str2, str3, (java.util.Map<java.lang.String, java.lang.String>) map2, str4, (i & 256) != 0 ? ComplianceTheme.OKX : complianceTheme, (i & 512) != 0 ? null : fragmentActivity);
    }

    public final void AEQbTJ(@NotNull CTAButtonAppModel cTAButtonAppModel, C52794wYp c52794wYp, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, java.lang.String> map2, @NotNull java.lang.String str4, @NotNull ComplianceTheme complianceTheme, FragmentActivity fragmentActivity) {
        java.util.HashMap<java.lang.String, java.lang.String> localParams;
        java.util.HashMap<java.lang.String, java.lang.String> submitParams;
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(complianceTheme, "");
        EZpvd(c52794wYp, fragmentActivity, cTAButtonAppModel.getStyle(), complianceTheme);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ActionParams actionParams = cTAButtonAppModel.getActionParams();
        if (actionParams != null && (submitParams = actionParams.getSubmitParams()) != null) {
            for (Map.Entry<java.lang.String, java.lang.String> entry : submitParams.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ActionParams actionParams2 = cTAButtonAppModel.getActionParams();
        if (actionParams2 != null && (localParams = actionParams2.getLocalParams()) != null) {
            for (Map.Entry<java.lang.String, java.lang.String> entry2 : localParams.entrySet()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (Map.Entry<java.lang.String, java.lang.String> entry3 : map.entrySet()) {
            linkedHashMap.put(entry3.getKey(), entry3.getValue());
        }
        postOnboarding$default(this, c52794wYp, str, linkedHashMap, str2, str3, new C41957rBa(), map2, str4, fragmentActivity, null, null, null, null, new Function1() { // from class: o.rFI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC42074rFj.OLrzqt((java.lang.String) obj);
            }
        }, null, null, 56832, null);
    }

    public static final Unit OLrzqt(java.lang.String str) {
        C43693ruB.EZpvd("KYC_Skip_Error", C33129mqd.gEmmrt(str));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void submitAction$default(AbstractC42074rFj abstractC42074rFj, CTAButtonAppModel cTAButtonAppModel, C52794wYp c52794wYp, java.lang.String str, java.util.Map map, java.lang.String str2, java.lang.String str3, java.util.Map map2, java.lang.String str4, ComplianceTheme complianceTheme, FragmentActivity fragmentActivity, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitAction");
        }
        abstractC42074rFj.OLrzqt(cTAButtonAppModel, (i & 2) != 0 ? null : c52794wYp, str, map, str2, str3, map2, str4, (i & 256) != 0 ? ComplianceTheme.OKX : complianceTheme, (i & 512) != 0 ? null : fragmentActivity, (i & 1024) != 0 ? "" : str5, (i & 2048) != 0 ? "" : str6, (i & 4096) != 0 ? "" : str7);
    }

    public final void OLrzqt(@NotNull final CTAButtonAppModel cTAButtonAppModel, C52794wYp c52794wYp, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, java.lang.String> map2, @NotNull java.lang.String str4, @NotNull ComplianceTheme complianceTheme, final FragmentActivity fragmentActivity, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        java.lang.String strEZpvd;
        java.util.HashMap<java.lang.String, java.lang.String> localParams;
        java.util.HashMap<java.lang.String, java.lang.String> submitParams;
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.util.Map<java.lang.String, java.lang.String> mapEZpvd = map2;
        Intrinsics.checkNotNullParameter(mapEZpvd, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(complianceTheme, "");
        pUU.KWHzl("CTA_SUBMIT", "submitAction->pageId = " + str4 + ", ctaModel.target = " + cTAButtonAppModel.getTarget());
        if (this.iwGUEr.gEmmrt()) {
            EZpvd(c52794wYp, fragmentActivity, cTAButtonAppModel.getStyle(), complianceTheme);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ActionParams actionParams = cTAButtonAppModel.getActionParams();
            if (actionParams != null && (submitParams = actionParams.getSubmitParams()) != null) {
                for (Map.Entry<java.lang.String, java.lang.String> entry : submitParams.entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ActionParams actionParams2 = cTAButtonAppModel.getActionParams();
            if (actionParams2 != null && (localParams = actionParams2.getLocalParams()) != null) {
                for (Map.Entry<java.lang.String, java.lang.String> entry2 : localParams.entrySet()) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            for (Map.Entry<java.lang.String, java.lang.String> entry3 : map.entrySet()) {
                linkedHashMap.put(entry3.getKey(), entry3.getValue());
            }
            java.lang.String playbook = cTAButtonAppModel.getPlaybook();
            java.lang.String str8 = playbook == null ? str2 : playbook;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) cTAButtonAppModel.getPlaybook())) {
                ActivityC42162rIq.TaskDescription taskDescription = ActivityC42162rIq.Companion;
                java.lang.String playbook2 = cTAButtonAppModel.getPlaybook();
                Intrinsics.copydefault((java.lang.Object) playbook2);
                strEZpvd = taskDescription.EZpvd(playbook2);
            } else {
                strEZpvd = str3;
            }
            C41957rBa c41957rBa = this.iwGUEr;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) cTAButtonAppModel.getPlaybook())) {
                mapEZpvd = EZpvd(cTAButtonAppModel);
            }
            postOnboarding$default(this, c52794wYp, str, linkedHashMap, str8, strEZpvd, c41957rBa, mapEZpvd, str4, fragmentActivity, null, str5, str6, str7, new Function1() { // from class: o.rFl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC42074rFj.djBIcL((java.lang.String) obj);
                }
            }, new Function0() { // from class: o.rFr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC42074rFj.KWHzl(cTAButtonAppModel, fragmentActivity);
                }
            }, cTAButtonAppModel.getAction(), 512, null);
        }
    }

    public static final Unit KWHzl(CTAButtonAppModel cTAButtonAppModel, FragmentActivity fragmentActivity) {
        ToastModel toast = cTAButtonAppModel.getToast();
        if (toast != null) {
            java.lang.String text = toast.getText();
            if (Intrinsics.EZpvd((java.lang.Object) toast.getType(), (java.lang.Object) Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                C55326xho.toastWithFailedIcon$default(text, 0, 1, (java.lang.Object) null);
            } else {
                C55326xho.toastWithSuccessfulIcon$default(text, 0, 1, (java.lang.Object) null);
            }
        }
        ActionParams actionParams = cTAButtonAppModel.getActionParams();
        if (actionParams != null && C33129mqd.OLrzqt((java.lang.CharSequence) actionParams.getOpenerNewTabUrl()) && fragmentActivity != null) {
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, fragmentActivity, BundleKt.bundleOf(C56390yDp.OLrzqt("url", actionParams.getOpenerNewTabUrl())), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(java.lang.String str) {
        C43693ruB.EZpvd("KYC_Submit_Error", C33129mqd.gEmmrt(str));
        return Unit.INSTANCE;
    }

    public final java.util.HashMap<java.lang.String, java.lang.String> EZpvd(@NotNull CTAButtonAppModel cTAButtonAppModel) {
        java.util.HashMap<java.lang.String, java.lang.String> onboarding;
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        ActionParams actionParams = cTAButtonAppModel.getActionParams();
        return (actionParams == null || (onboarding = actionParams.getOnboarding()) == null) ? new java.util.HashMap<>() : onboarding;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: o.rFj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onboardingAction$default(AbstractC42074rFj abstractC42074rFj, CTAButtonAppModel cTAButtonAppModel, C52794wYp c52794wYp, java.lang.String str, java.lang.String str2, java.util.HashMap map, ComplianceTheme complianceTheme, FragmentActivity fragmentActivity, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onboardingAction");
        }
        abstractC42074rFj.copydefault(cTAButtonAppModel, (i & 2) != 0 ? null : c52794wYp, str, str2, map, (i & 32) != 0 ? ComplianceTheme.OKX : complianceTheme, (i & 64) != 0 ? null : fragmentActivity, (i & 128) != 0 ? null : function1);
    }

    public final void copydefault(@NotNull CTAButtonAppModel cTAButtonAppModel, C52794wYp c52794wYp, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull ComplianceTheme complianceTheme, FragmentActivity fragmentActivity, Function1<? super java.util.HashMap<java.lang.String, java.lang.String>, Unit> function1) {
        java.lang.String strEZpvd;
        java.util.HashMap<java.lang.String, java.lang.String> mapEZpvd;
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(complianceTheme, "");
        EZpvd(c52794wYp, fragmentActivity, cTAButtonAppModel.getStyle(), complianceTheme);
        java.lang.String playbook = cTAButtonAppModel.getPlaybook();
        if (playbook == null) {
            playbook = str;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) cTAButtonAppModel.getPlaybook())) {
            ActivityC42162rIq.TaskDescription taskDescription = ActivityC42162rIq.Companion;
            java.lang.String playbook2 = cTAButtonAppModel.getPlaybook();
            Intrinsics.copydefault((java.lang.Object) playbook2);
            strEZpvd = taskDescription.EZpvd(playbook2);
        } else {
            strEZpvd = str2;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) cTAButtonAppModel.getPlaybook())) {
            if (function1 != null) {
                function1.invoke(EZpvd(cTAButtonAppModel));
            }
            mapEZpvd = EZpvd(cTAButtonAppModel);
        } else {
            mapEZpvd = map;
        }
        copydefault(c52794wYp, playbook, strEZpvd, mapEZpvd, fragmentActivity, Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) Playbook.OKX_APP_KYC_OVERVIEW.getValue()) ? cTAButtonAppModel.getCloseVerifyCenter() : false, new Function1() { // from class: o.rFH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC42074rFj.KWHzl((java.lang.String) obj);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str) {
        C43693ruB.EZpvd("KYC_Onboarding_Action_Error", C33129mqd.gEmmrt(str));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.rFj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getOnboarding$default(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, java.lang.String str, java.lang.String str2, java.util.Map map, FragmentActivity fragmentActivity, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOnboarding");
        }
        abstractC42074rFj.copydefault((i & 1) != 0 ? null : c52794wYp, str, str2, map, (i & 16) != 0 ? null : fragmentActivity, (i & 32) != 0 ? true : z, (i & 64) != 0 ? null : function1);
    }

    public final void copydefault(C52794wYp c52794wYp, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map, FragmentActivity fragmentActivity, boolean z, Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseKYCViewModel$getOnboarding$1(this, str, str2, map, c52794wYp, fragmentActivity, z, function1, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r20v0, resolved type: o.rFj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void postOnboarding$default(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, java.lang.String str, java.util.Map map, java.lang.String str2, java.lang.String str3, C41957rBa c41957rBa, java.util.Map map2, java.lang.String str4, FragmentActivity fragmentActivity, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, Function1 function1, Function0 function0, ButtonAction buttonAction, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnboarding");
        }
        abstractC42074rFj.AEQbTJ((i & 1) != 0 ? null : c52794wYp, str, map, str2, str3, c41957rBa, map2, str4, (i & 256) != 0 ? null : fragmentActivity, (i & 512) != 0 ? "" : str5, (i & 1024) != 0 ? "" : str6, (i & 2048) != 0 ? "" : str7, (i & 4096) != 0 ? "" : str8, (i & 8192) != 0 ? null : function1, (i & 16384) != 0 ? null : function0, (i & 32768) != 0 ? null : buttonAction);
    }

    public final void AEQbTJ(C52794wYp c52794wYp, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull C41957rBa c41957rBa, @NotNull java.util.Map<java.lang.String, java.lang.String> map2, @NotNull java.lang.String str4, FragmentActivity fragmentActivity, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, Function1<? super java.lang.String, Unit> function1, Function0<Unit> function0, ButtonAction buttonAction) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(c41957rBa, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        pUU.KWHzl("CTA_SUBMIT", "postOnboarding->pageId = " + str4 + ",target = " + str);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseKYCViewModel$postOnboarding$1(str6, this, str2, str3, str, map, str4, c41957rBa, map2, str7, str8, c52794wYp, fragmentActivity, str5, function0, function1, buttonAction, null), 3, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.rRV.ActionBar.newInstance$default(o.rRV$ActionBar, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, java.lang.String, java.lang.String, java.util.HashMap, java.lang.String, java.lang.Boolean, java.lang.Integer, int, java.lang.Object):o.rRV */
    /* JADX DEBUG: Class process forced to load method for inline: o.rSl.initFileUploadDialog$default(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle, int, java.lang.Object):com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog */
    public final void copydefault(@NotNull Quit quit, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(quit, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str3, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KycQuit_Full_Page_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rFn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC42074rFj.AEQbTJ(str, str3, str2, map, (EventParamsList) obj);
            }
        });
        ButtonDialog buttonDialogInitFileUploadDialog$default = C42427rSl.initFileUploadDialog$default(quit.getTitle(), quit.getContent(), quit.getSecondaryLabel(), quit.getPrimaryLabel(), quit.getIconState(), ButtonAction.Cancel, ButtonAction.Quit, null, quit.getSecondaryStyle(), quit.getPrimaryStyle(), 128, null);
        if (C33129mqd.KWHzl((java.util.Collection) quit.getQuestionList())) {
            rRP.StateListAnimator stateListAnimator = rRP.Companion;
            java.util.ArrayList<QuestionItem> questionList = quit.getQuestionList();
            Intrinsics.copydefault(questionList);
            stateListAnimator.copydefault(buttonDialogInitFileUploadDialog$default, questionList, str, str2, map, str3).show(fragmentManager);
            return;
        }
        rRV.Companion.EZpvd(buttonDialogInitFileUploadDialog$default, (192 & 2) != 0 ? null : quit.getQuestionModule(), (192 & 4) != 0 ? null : str, (192 & 8) != 0 ? null : str2, (192 & 16) != 0 ? null : map, (192 & 32) == 0 ? str3 : null, (192 & 64) != 0 ? java.lang.Boolean.FALSE : null, (192 & 128) != 0 ? -1 : null).show(fragmentManager);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.HashMap map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("entity_id", ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).AuCTelauCTel(), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, str, false);
        eventParamsList.put("page_id", str2, false);
        eventParamsList.put("playbook", new C43739ruv().KWHzl(str3), false);
        java.lang.String json = new Gson().toJson(map);
        Intrinsics.checkNotNullExpressionValue(json, "");
        eventParamsList.put("action_params", json, false);
        eventParamsList.put("refresh_type", C33129mqd.gEmmrt(map.get("refreshType")), false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        BaseKYCViewModel$reportCardSync$1 baseKYCViewModel$reportCardSync$1;
        if (continuation instanceof BaseKYCViewModel$reportCardSync$1) {
            baseKYCViewModel$reportCardSync$1 = (BaseKYCViewModel$reportCardSync$1) continuation;
            int i = baseKYCViewModel$reportCardSync$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseKYCViewModel$reportCardSync$1.label = i - Integer.MIN_VALUE;
            } else {
                baseKYCViewModel$reportCardSync$1 = new BaseKYCViewModel$reportCardSync$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = baseKYCViewModel$reportCardSync$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = baseKYCViewModel$reportCardSync$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC43709ruR interfaceC43709ruRAEQbTJ = InterfaceC43709ruR.Companion.AEQbTJ(str, map);
                CardSyncRequest cardSyncRequest = new CardSyncRequest(str2, str3, str4);
                baseKYCViewModel$reportCardSync$1.label = 1;
                objOLrzqt = interfaceC43709ruRAEQbTJ.OLrzqt(cardSyncRequest, baseKYCViewModel$reportCardSync$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            ResponseData responseData = (ResponseData) objOLrzqt;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void startLoading$default(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, FragmentActivity fragmentActivity, ButtonStyle buttonStyle, ComplianceTheme complianceTheme, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startLoading");
        }
        if ((i & 1) != 0) {
            c52794wYp = null;
        }
        if ((i & 2) != 0) {
            fragmentActivity = null;
        }
        if ((i & 4) != 0) {
            buttonStyle = ButtonStyle.Text;
        }
        if ((i & 8) != 0) {
            complianceTheme = ComplianceTheme.OKX;
        }
        abstractC42074rFj.EZpvd(c52794wYp, fragmentActivity, buttonStyle, complianceTheme);
    }

    public final void EZpvd(C52794wYp c52794wYp, FragmentActivity fragmentActivity, ButtonStyle buttonStyle, @NotNull ComplianceTheme complianceTheme) {
        Intrinsics.checkNotNullParameter(complianceTheme, "");
        if (buttonStyle != ButtonStyle.Text && c52794wYp != null) {
            this.djBIcL.setValue(new C43734ruq<>(new kotlin.Pair(c52794wYp, java.lang.Boolean.TRUE)));
        } else if (fragmentActivity instanceof AbstractActivityC33041mov) {
            ((AbstractActivityC33041mov) fragmentActivity).showLoading(0L);
        }
        Job job = this.fIwbmz;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.fIwbmz = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseKYCViewModel$startLoading$1(this, null), 3, null);
    }

    public static /* synthetic */ void cancelLoading$default(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, FragmentActivity fragmentActivity, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancelLoading");
        }
        if ((i & 1) != 0) {
            c52794wYp = null;
        }
        if ((i & 2) != 0) {
            fragmentActivity = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        abstractC42074rFj.copydefault(c52794wYp, fragmentActivity, z);
    }

    public final void copydefault(C52794wYp c52794wYp, FragmentActivity fragmentActivity, boolean z) {
        if (fragmentActivity instanceof AbstractActivityC33041mov) {
            ((AbstractActivityC33041mov) fragmentActivity).dismissLoading();
        }
        if (c52794wYp != null) {
            this.djBIcL.setValue(new C43734ruq<>(new kotlin.Pair(c52794wYp, java.lang.Boolean.FALSE)));
        }
        Job job = this.fIwbmz;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.fIwbmz = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseKYCViewModel$cancelLoading$1(this, z, null), 3, null);
    }

    public static /* synthetic */ void deleteInfoFormEntry$default(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3, FragmentActivity fragmentActivity, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteInfoFormEntry");
        }
        abstractC42074rFj.OLrzqt((i & 1) != 0 ? null : c52794wYp, str, str2, (java.util.Map<java.lang.String, java.lang.String>) map, str3, (i & 32) != 0 ? null : fragmentActivity);
    }

    public static /* synthetic */ void submitGpsAction$default(AbstractC42074rFj abstractC42074rFj, CTAButtonAppModel cTAButtonAppModel, C52794wYp c52794wYp, java.lang.String str, java.util.Map map, java.lang.String str2, java.lang.String str3, java.util.HashMap map2, java.lang.String str4, ComplianceTheme complianceTheme, FragmentActivity fragmentActivity, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitGpsAction");
        }
        abstractC42074rFj.KWHzl(cTAButtonAppModel, (i & 2) != 0 ? null : c52794wYp, str, (java.util.Map<java.lang.String, java.lang.String>) map, str2, str3, (java.util.HashMap<java.lang.String, java.lang.String>) map2, str4, (i & 256) != 0 ? ComplianceTheme.OKX : complianceTheme, (i & 512) != 0 ? null : fragmentActivity, (i & 1024) != 0 ? "" : str5, (i & 2048) != 0 ? "" : str6, (i & 4096) != 0 ? "" : str7);
    }

    public final void KWHzl(@NotNull final CTAButtonAppModel cTAButtonAppModel, final C52794wYp c52794wYp, @NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.util.HashMap<java.lang.String, java.lang.String> map2, @NotNull final java.lang.String str4, @NotNull final ComplianceTheme complianceTheme, final FragmentActivity fragmentActivity, final java.lang.String str5, final java.lang.String str6, final java.lang.String str7) {
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(complianceTheme, "");
        if (fragmentActivity == null) {
            return;
        }
        this.fARcdN = c52794wYp;
        pUU.KWHzl("CTA_SUBMIT", "submitGpsAction->pageId = " + str4 + ", ctaModel.target = " + cTAButtonAppModel.getTarget());
        EZpvd(c52794wYp, fragmentActivity, cTAButtonAppModel.getStyle(), complianceTheme);
        C43693ruB.OLrzqt("KYC_GpsPoa_RequestLocation_Click");
        java.lang.String[] strArr = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
        final Function2 function2 = new Function2() { // from class: o.rFp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC42074rFj.OLrzqt(this.AEQbTJ, fragmentActivity, map, map2, cTAButtonAppModel, c52794wYp, str, str2, str3, str4, complianceTheme, str5, str6, str7, (java.lang.String) obj, (java.lang.String) obj2);
            }
        };
        if (EZpvd((android.content.Context) fragmentActivity)) {
            Location locationOLrzqt = OLrzqt(fragmentActivity);
            if (locationOLrzqt != null) {
                function2.invoke(java.lang.String.valueOf(locationOLrzqt.getLatitude()), java.lang.String.valueOf(locationOLrzqt.getLongitude()));
                C43693ruB.copydefault("KYC_GpsPoa_Permission_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("status", "allowed"), C56390yDp.OLrzqt("authorisation_type", "alreadyAllowed")));
                return;
            } else {
                OLrzqt(fragmentActivity, new Function1() { // from class: o.rFq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC42074rFj.KWHzl(function2, (Location) obj);
                    }
                });
                return;
            }
        }
        this.hDKMBd = new Function2() { // from class: o.rFo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC42074rFj.KWHzl(function2, (java.lang.String) obj, (java.lang.String) obj2);
            }
        };
        C43693ruB.copydefault("KYC_GpsPoa_Permission_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("status", "requested")));
        ActivityCompat.requestPermissions(fragmentActivity, strArr, 1001);
    }

    public static final java.lang.Object OLrzqt(AbstractC42074rFj abstractC42074rFj, FragmentActivity fragmentActivity, java.util.Map map, java.util.HashMap map2, CTAButtonAppModel cTAButtonAppModel, C52794wYp c52794wYp, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, ComplianceTheme complianceTheme, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        if (str8 == null || str9 == null) {
            abstractC42074rFj.copydefault(fragmentActivity);
            return C55326xho.toast$default(abstractC42074rFj.DbNXlk(C43662rtX.Dialog.ejfBZ), C33070mpX.KWHzl(C43662rtX.Activity.OqFWZa), 0, (java.lang.Integer) null, 0, 0, 30, (java.lang.Object) null);
        }
        java.util.HashMap map3 = new java.util.HashMap(map);
        map3.put(MTPushConstants.Geofence.KEY_LATITUDE, str8);
        map3.put(MTPushConstants.Geofence.KEY_LONGITUDE, str9);
        java.util.HashMap map4 = new java.util.HashMap(map2);
        map4.put(OKRiskConstantKeys.NO_SEC.getValue(), "false");
        abstractC42074rFj.OLrzqt(cTAButtonAppModel, c52794wYp, str, map3, str2, str3, map4, str4, complianceTheme, fragmentActivity, str5, str6, str7);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Function2 function2, Location location) {
        function2.invoke(location != null ? java.lang.Double.valueOf(location.getLatitude()).toString() : null, location != null ? java.lang.Double.valueOf(location.getLongitude()).toString() : null);
        C43693ruB.copydefault("KYC_GpsPoa_Permission_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("status", "allowed"), C56390yDp.OLrzqt("authorisation_type", "alreadyAllowed")));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Function2 function2, java.lang.String str, java.lang.String str2) {
        function2.invoke(str, str2);
        return Unit.INSTANCE;
    }

    public final boolean EZpvd(android.content.Context context) {
        return ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public final Location OLrzqt(FragmentActivity fragmentActivity) {
        if (!EZpvd((android.content.Context) fragmentActivity)) {
            return null;
        }
        java.lang.Object systemService = fragmentActivity.getSystemService("location");
        Intrinsics.copydefault(systemService, "");
        LocationManager locationManager = (LocationManager) systemService;
        try {
            java.lang.String strEZpvd = EZpvd(locationManager);
            if (strEZpvd == null) {
                return null;
            }
            return locationManager.getLastKnownLocation(strEZpvd);
        } catch (java.lang.SecurityException e) {
            pUU.KWHzl("GPS_SUBMIT", "fetchLocation->SecurityException " + e.getMessage());
            return null;
        } catch (java.lang.Exception e2) {
            pUU.KWHzl("GPS_SUBMIT", "fetchLocation->Exception " + e2.getMessage());
            return null;
        }
    }

    public final void OLrzqt(FragmentActivity fragmentActivity, final Function1<? super Location, Unit> function1) {
        if (!EZpvd((android.content.Context) fragmentActivity)) {
            function1.invoke(null);
            return;
        }
        java.lang.Object systemService = fragmentActivity.getSystemService("location");
        Intrinsics.copydefault(systemService, "");
        LocationManager locationManager = (LocationManager) systemService;
        java.lang.String strEZpvd = EZpvd(locationManager);
        if (strEZpvd == null) {
            pUU.KWHzl("GPS_SUBMIT", "requestLocationUpdate->no enabled providers found");
            function1.invoke(null);
            return;
        }
        LocationListener locationListener = this.ejfBZ;
        if (locationListener != null) {
            locationManager.removeUpdates(locationListener);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            locationManager.getCurrentLocation(strEZpvd, null, ContextCompat.getMainExecutor(fragmentActivity), new java.util.function.Consumer() { // from class: o.rFK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    AbstractC42074rFj.OLrzqt(function1, (Location) obj);
                }
            });
            return;
        }
        TaskDescription taskDescription = new TaskDescription(locationManager, this, function1);
        this.ejfBZ = taskDescription;
        Intrinsics.copydefault(taskDescription);
        locationManager.requestLocationUpdates(strEZpvd, 0L, 0.0f, taskDescription, android.os.Looper.getMainLooper());
    }

    public static final void OLrzqt(Function1 function1, Location location) {
        function1.invoke(location);
    }

    /* JADX INFO: renamed from: o.rFj$TaskDescription */
    public static final class TaskDescription implements LocationListener {
        public final /* synthetic */ AbstractC42074rFj AEQbTJ;
        public final /* synthetic */ LocationManager EZpvd;
        public final /* synthetic */ Function1<Location, Unit> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.location.LocationListener
        public void onProviderDisabled(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.location.LocationListener
        public void onProviderEnabled(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String str, int i, android.os.Bundle bundle) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super android.location.Location, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(LocationManager locationManager, AbstractC42074rFj abstractC42074rFj, Function1<? super Location, Unit> function1) {
            this.EZpvd = locationManager;
            this.AEQbTJ = abstractC42074rFj;
            this.KWHzl = function1;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            Intrinsics.checkNotNullParameter(location, "");
            this.EZpvd.removeUpdates(this);
            this.AEQbTJ.ejfBZ = null;
            this.KWHzl.invoke(location);
        }
    }

    public final java.lang.String EZpvd(LocationManager locationManager) {
        java.util.List<java.lang.String> providers = locationManager.getProviders(true);
        Intrinsics.checkNotNullExpressionValue(providers, "");
        if (providers.contains("network")) {
            return "network";
        }
        if (providers.contains("gps")) {
            return "gps";
        }
        return (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(providers);
    }

    public final void KWHzl(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        if (!EZpvd((android.content.Context) fragmentActivity)) {
            copydefault(fragmentActivity);
            return;
        }
        C43693ruB.copydefault("KYC_GpsPoa_Permission_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("status", "allowed")));
        Location locationOLrzqt = OLrzqt(fragmentActivity);
        if (locationOLrzqt == null) {
            OLrzqt(fragmentActivity, new Function1() { // from class: o.rFJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC42074rFj.AEQbTJ(this.AEQbTJ, (Location) obj);
                }
            });
            return;
        }
        Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = this.hDKMBd;
        if (function2 != null) {
            function2.invoke(java.lang.String.valueOf(locationOLrzqt.getLatitude()), java.lang.String.valueOf(locationOLrzqt.getLongitude()));
        }
        this.hDKMBd = null;
    }

    public static final Unit AEQbTJ(AbstractC42074rFj abstractC42074rFj, Location location) {
        Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = abstractC42074rFj.hDKMBd;
        if (function2 != null) {
            function2.invoke(location != null ? java.lang.Double.valueOf(location.getLatitude()).toString() : null, location != null ? java.lang.Double.valueOf(location.getLongitude()).toString() : null);
        }
        abstractC42074rFj.hDKMBd = null;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onLocationPermissionDenied$default(AbstractC42074rFj abstractC42074rFj, FragmentActivity fragmentActivity, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLocationPermissionDenied");
        }
        if ((i & 1) != 0) {
            fragmentActivity = null;
        }
        abstractC42074rFj.copydefault(fragmentActivity);
    }

    public final void copydefault(FragmentActivity fragmentActivity) {
        this.hDKMBd = null;
        C43693ruB.copydefault("KYC_GpsPoa_Permission_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("status", "denied")));
        cancelLoading$default(this, this.fARcdN, fragmentActivity, false, 4, null);
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.hDKMBd = null;
        LocationListener locationListener = this.ejfBZ;
        if (locationListener != null) {
            java.lang.Object systemService = C43246rlf.OLrzqt.valueOf().getSystemService("location");
            LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
            if (locationManager != null) {
                locationManager.removeUpdates(locationListener);
            }
        }
        this.ejfBZ = null;
    }
}
