package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.common.Constant;
import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncRequest;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ProcessingAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UpdateFormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VendorVerifyRequest;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VirtualActionAppModel;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import com.okinc.ok_kyc_core.presentation.verify.OcrVerifyFragment$eopLivenessLauncher$1$1;
import com.okinc.ok_kyc_core.presentation.verify.OcrVerifyFragment$onViewCreated$2;
import com.okinc.ok_kyc_core.presentation.verify.OcrVerifyFragment$syncCardResult$2;
import com.okinc.ok_kyc_core.presentation.verify.OcrVerifyFragment$syncCardResultTask$1;
import com.okinc.ok_kyc_core.service.EopImageInfo;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import o.AbstractC43419rot;
import o.ActivityC42162rIq;
import o.C43662rtX;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rJF extends AbstractC42060rEw<AbstractC43846rww, C42203rKd> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int iwGUEr = 8;
    public java.lang.String AuCTelauCTel;
    public java.util.HashMap<java.lang.String, java.lang.String> AubY;
    public java.lang.Integer AwvSrB;
    public java.lang.String AxsJAY;
    public java.lang.String DTwDnp;
    public VendorConfig ORxRYg;
    public java.lang.Integer OcIXYQ;
    public Job QKVWgx;
    public java.lang.Integer QOLQEE;
    public final InterfaceC56387yDm RJOkX;
    public java.lang.String gHZMYf;
    public final InterfaceC56387yDm getNewProxyInstance;
    public java.lang.String sSMYrx;
    public java.lang.String wlaJM;
    public java.util.ArrayList<EopImageInfo> zLjUOn;
    public final ActivityResultLauncher<android.content.Intent> zsXlph;
    public final int zuBGHE = C43662rtX.TaskDescription.AubY;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42060rEw
    public void AEQbTJ(@NotNull UpdateFormAppModel updateFormAppModel) {
        Intrinsics.checkNotNullParameter(updateFormAppModel, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42060rEw
    public int OLrzqt() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Job job) {
        this.QKVWgx = job;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Job fJNWhG() {
        return this.QKVWgx;
    }

    public rJF() {
        final Function0 function0 = null;
        this.getNewProxyInstance = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C42163rIr.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.verify.OcrVerifyFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.verify.OcrVerifyFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.ok_kyc_core.presentation.verify.OcrVerifyFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        Function0 function02 = new Function0() { // from class: o.rJQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rJF.ejfBZ(this.AEQbTJ);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.ok_kyc_core.presentation.verify.OcrVerifyFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.ok_kyc_core.presentation.verify.OcrVerifyFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.RJOkX = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C42203rKd.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.verify.OcrVerifyFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.verify.OcrVerifyFragment$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function04 = function0;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function02);
        this.AxsJAY = "";
        this.gHZMYf = "";
        this.AubY = new java.util.HashMap<>();
        this.OcIXYQ = java.lang.Integer.valueOf(Constant.VendorType.EOP.getVendorType());
        this.QOLQEE = 1;
        this.DTwDnp = "";
        this.zLjUOn = new java.util.ArrayList<>();
        this.AuCTelauCTel = "";
        this.wlaJM = "";
        this.sSMYrx = "";
        this.AwvSrB = 0;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.rJO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                rJF.AEQbTJ(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.zsXlph = activityResultLauncherRegisterForActivityResult;
    }

    @Override // o.AbstractC42060rEw
    public C42163rIr KWHzl() {
        return (C42163rIr) this.getNewProxyInstance.getValue();
    }

    public static final class Application implements ViewModelProvider.Factory {
        public Application() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            C43746rvB c43746rvB = new C43746rvB(new rAP(), InterfaceC43709ruR.Companion.AEQbTJ(rJF.this.AYXKKw(), rJF.this.valueOf()), null, 4, null);
            return new C42203rKd(new C41970rBn(new rBD(c43746rvB), new rBP(c43746rvB), new C41973rBq(c43746rvB), new C41975rBs(c43746rvB), new rBF(c43746rvB), new rBE(c43746rvB), new rBB(c43746rvB), new C41979rBw(c43746rvB), new SingleFileUploadUseCase(c43746rvB), new rBA(c43746rvB)), new rBT(new C41977rBu(c43746rvB), new C41981rBy(c43746rvB), new C41971rBo(c43746rvB), new C41968rBl(c43746rvB)), new rBQ(new C41978rBv(c43746rvB), new C41982rBz(c43746rvB)));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Lo/rFj; */
    @Override // o.AbstractC42060rEw
    /* JADX INFO: renamed from: fIwbmz, reason: merged with bridge method [inline-methods] */
    public C42203rKd fetchVPNInfo() {
        return (C42203rKd) this.RJOkX.getValue();
    }

    public static final ViewModelProvider.Factory ejfBZ(rJF rjf) {
        return rjf.new Application();
    }

    @Override // o.AbstractC42060rEw, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.util.ArrayList<EopImageInfo> arrayList;
        java.lang.String string4;
        java.lang.String string5;
        java.lang.String string6;
        VendorConfig vendorConfig;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl(java.lang.Boolean.FALSE);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("PROCESS_TYPE")) == null) {
            string = "";
        }
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("resultId")) == null) {
            string2 = "";
        }
        this.gHZMYf = string2;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (string3 = arguments3.getString("resultTarget")) == null) {
            string3 = "";
        }
        this.AxsJAY = string3;
        android.os.Bundle arguments4 = getArguments();
        java.io.Serializable serializable = arguments4 != null ? arguments4.getSerializable("ctaValue") : null;
        java.util.HashMap<java.lang.String, java.lang.String> map = serializable instanceof java.util.HashMap ? (java.util.HashMap) serializable : null;
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        this.AubY = map;
        android.os.Bundle arguments5 = getArguments();
        this.OcIXYQ = arguments5 != null ? java.lang.Integer.valueOf(arguments5.getInt("vendorType")) : null;
        android.os.Bundle arguments6 = getArguments();
        this.QOLQEE = arguments6 != null ? java.lang.Integer.valueOf(arguments6.getInt("verifyType")) : null;
        android.os.Bundle arguments7 = getArguments();
        this.DTwDnp = arguments7 != null ? arguments7.getString(OtcExtraKeys.SESSIONID) : null;
        android.os.Bundle arguments8 = getArguments();
        if (arguments8 == null || (arrayList = arguments8.getParcelableArrayList("eopImageFiles")) == null) {
            arrayList = new java.util.ArrayList<>();
        }
        this.zLjUOn = arrayList;
        android.os.Bundle arguments9 = getArguments();
        if (arguments9 == null || (string4 = arguments9.getString(EopTrackEvent.KEY_COR)) == null) {
            string4 = "";
        }
        this.AuCTelauCTel = string4;
        android.os.Bundle arguments10 = getArguments();
        if (arguments10 == null || (string5 = arguments10.getString("CARD_SESSION_ID")) == null) {
            string5 = "";
        }
        this.wlaJM = string5;
        android.os.Bundle arguments11 = getArguments();
        if (arguments11 == null || (string6 = arguments11.getString("NFC_MRZ")) == null) {
            string6 = "";
        }
        this.sSMYrx = string6;
        android.os.Bundle arguments12 = getArguments();
        this.AwvSrB = arguments12 != null ? java.lang.Integer.valueOf(arguments12.getInt("NFC_TYPE")) : null;
        android.os.Bundle arguments13 = getArguments();
        if (arguments13 == null || (vendorConfig = (VendorConfig) arguments13.getParcelable("vendorConfig")) == null) {
            vendorConfig = new VendorConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 1048575, (DefaultConstructorMarker) null);
        }
        this.ORxRYg = vendorConfig;
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, new TaskDescription());
        AuCTel();
        if (Intrinsics.EZpvd((java.lang.Object) "CARD_PROCESS", (java.lang.Object) string)) {
            fARcdN();
            return;
        }
        java.lang.Integer num = this.OcIXYQ;
        int vendorType = Constant.VendorType.EOP.getVendorType();
        if (num == null || num.intValue() != vendorType) {
            int vendorType2 = Constant.VendorType.AMANI.getVendorType();
            if (num == null || num.intValue() != vendorType2) {
                int vendorType3 = Constant.VendorType.AMANI_VIDEO_CALL.getVendorType();
                if (num != null && num.intValue() == vendorType3) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OcrVerifyFragment$onViewCreated$2(this, null), 3, null);
                    return;
                }
                return;
            }
        }
        pUU.KWHzl("qjf", "nfcType = " + this.AwvSrB + " ,mrz = " + this.sSMYrx);
        java.lang.Integer num2 = this.AwvSrB;
        if (num2 != null && num2.intValue() == 1) {
            OLrzqt(this.zLjUOn, this.OcIXYQ, this.QOLQEE, this.DTwDnp, this.sSMYrx);
        } else {
            EZpvd(this.zLjUOn, this.OcIXYQ, this.QOLQEE, this.DTwDnp);
        }
    }

    public static final class TaskDescription extends OnBackPressedCallback {
        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
        }

        public TaskDescription() {
            super(true);
        }
    }

    public final void AuCTel() {
        LiveData<C43734ruq<kotlin.Pair<C43700ruI, C52794wYp>>> liveDataFetchVPNInfo = fetchVPNInfo().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C43733rup.copydefault(liveDataFetchVPNInfo, viewLifecycleOwner, new Function1() { // from class: o.rJR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rJF.EZpvd(this.AEQbTJ, (C43734ruq) obj);
            }
        });
    }

    public static final Unit EZpvd(rJF rjf, C43734ruq c43734ruq) {
        PageComponentProfile pageComponentProfile;
        PageComponentAppModel viewModel;
        java.lang.Integer maxLevel;
        C55113xdn c55113xdn;
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        kotlin.Pair pair = (kotlin.Pair) c43734ruq.EZpvd();
        if (pair != null) {
            C43700ruI c43700ruI = (C43700ruI) pair.getFirst();
            if (c43700ruI.OLrzqt().getOnDemandFeatureFlagEnabled()) {
                AbstractC43846rww abstractC43846rwwAEQbTJ = rjf.AEQbTJ();
                if (abstractC43846rwwAEQbTJ != null && (c55113xdn = abstractC43846rwwAEQbTJ.KWHzl) != null) {
                    c55113xdn.cancelAnimation();
                }
                PageComponentProfile profile = c43700ruI.OLrzqt().getProfile();
                if (profile != null) {
                    if (profile.getMaxLevel() == null || ((maxLevel = profile.getMaxLevel()) != null && maxLevel.intValue() == -1)) {
                        profile = null;
                    }
                    pageComponentProfile = profile;
                } else {
                    pageComponentProfile = null;
                }
                rjf.KWHzl().KWHzl(c43700ruI.KWHzl());
                rjf.KWHzl().AEQbTJ(c43700ruI.EZpvd());
                if (!(c43700ruI.OLrzqt().getViewModel() instanceof PopUpAppModel) && !(c43700ruI.OLrzqt().getViewModel() instanceof UpdateFormAppModel) && (viewModel = c43700ruI.OLrzqt().getViewModel()) != null && Intrinsics.EZpvd(viewModel.getPageStack(), java.lang.Boolean.TRUE)) {
                    ActivityC42162rIq.TaskDescription taskDescription = ActivityC42162rIq.Companion;
                    FragmentActivity fragmentActivityRequireActivity = rjf.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    ActivityC42162rIq.TaskDescription.goActivity$default(taskDescription, fragmentActivityRequireActivity, rjf.AYXKKw(), rjf.copydefault(), rjf.valueOf(), c43700ruI.OLrzqt(), rjf.gEmmrt(), null, 64, null);
                } else {
                    PageComponentAppModel viewModel2 = c43700ruI.OLrzqt().getViewModel();
                    if (viewModel2 instanceof FormAppModel) {
                        rjf.fetchVPNInfo().EZpvd(c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.EZpvd(), pageComponentProfile, c43700ruI.copydefault());
                    } else if (viewModel2 instanceof ResultAppModel) {
                        rjf.fetchVPNInfo().AEQbTJ(c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.EZpvd(), pageComponentProfile, c43700ruI.copydefault());
                    } else if (viewModel2 instanceof VirtualActionAppModel) {
                        rjf.KWHzl(pageComponentProfile);
                        AbstractC42074rFj.navigateVirtualAction$default(rjf.fetchVPNInfo(), c43700ruI.OLrzqt().getViewModel(), (C52794wYp) pair.getSecond(), c43700ruI.KWHzl(), ActivityC42162rIq.Companion.EZpvd(c43700ruI.KWHzl()), c43700ruI.EZpvd(), rjf.KWHzl().OLrzqt(), rjf.requireActivity(), null, null, MLKEMEngine.KyberPolyBytes, null);
                    } else if (viewModel2 instanceof ProcessingAppModel) {
                        rjf.fetchVPNInfo().OLrzqt(c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.AEQbTJ(), c43700ruI.EZpvd(), pageComponentProfile, c43700ruI.copydefault());
                    } else if (viewModel2 instanceof UpdateFormAppModel) {
                        MutableLiveData<C43734ruq<UpdateFormAppModel>> mutableLiveDataDjBIcL = rjf.KWHzl().djBIcL();
                        PageComponentAppModel viewModel3 = c43700ruI.OLrzqt().getViewModel();
                        Intrinsics.copydefault(viewModel3, "");
                        mutableLiveDataDjBIcL.setValue(new C43734ruq<>((UpdateFormAppModel) viewModel3));
                    }
                }
            } else {
                rjf.KWHzl().OLrzqt(false);
            }
        }
        return Unit.INSTANCE;
    }

    public final void fARcdN() {
        AbstractC43846rww abstractC43846rwwAEQbTJ = AEQbTJ();
        if (abstractC43846rwwAEQbTJ != null) {
            abstractC43846rwwAEQbTJ.KWHzl.setVisibility(0);
            abstractC43846rwwAEQbTJ.KWHzl.setAutoMirrored(true);
            abstractC43846rwwAEQbTJ.KWHzl.KWHzl(0L);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OcrVerifyFragment$syncCardResult$2(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OcrVerifyFragment$syncCardResultTask$1 ocrVerifyFragment$syncCardResultTask$1;
        rJF rjf;
        AbstractC43419rot actionBar;
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        rJF rjf2;
        rJF rjf3;
        ResponseData responseData;
        Job job;
        if (continuation instanceof OcrVerifyFragment$syncCardResultTask$1) {
            ocrVerifyFragment$syncCardResultTask$1 = (OcrVerifyFragment$syncCardResultTask$1) continuation;
            int i = ocrVerifyFragment$syncCardResultTask$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ocrVerifyFragment$syncCardResultTask$1.label = i - Integer.MIN_VALUE;
            } else {
                ocrVerifyFragment$syncCardResultTask$1 = new OcrVerifyFragment$syncCardResultTask$1(this, continuation);
            }
        }
        OcrVerifyFragment$syncCardResultTask$1 ocrVerifyFragment$syncCardResultTask$12 = ocrVerifyFragment$syncCardResultTask$1;
        java.lang.Object objOLrzqt = ocrVerifyFragment$syncCardResultTask$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = ocrVerifyFragment$syncCardResultTask$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            try {
                InterfaceC43709ruR interfaceC43709ruRAEQbTJ = InterfaceC43709ruR.Companion.AEQbTJ(AYXKKw(), valueOf());
                java.lang.String str = this.DTwDnp;
                CardSyncRequest cardSyncRequest = new CardSyncRequest(str == null ? "" : str, this.wlaJM, (java.lang.String) null, 4, (DefaultConstructorMarker) null);
                ocrVerifyFragment$syncCardResultTask$12.L$0 = this;
                ocrVerifyFragment$syncCardResultTask$12.label = 1;
                objOLrzqt = interfaceC43709ruRAEQbTJ.OLrzqt(cardSyncRequest, ocrVerifyFragment$syncCardResultTask$12);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                rjf = this;
                responseData = (ResponseData) objOLrzqt;
                if (responseData.getCode() != 0) {
                }
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            } catch (java.lang.Throwable th) {
                th = th;
                rjf = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    rjf2 = (rJF) ocrVerifyFragment$syncCardResultTask$12.L$0;
                    C56391yDq.AEQbTJ(objOLrzqt);
                    job = rjf2.QKVWgx;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objOLrzqt);
                    return Unit.INSTANCE;
                }
                rjf3 = (rJF) ocrVerifyFragment$syncCardResultTask$12.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                ocrVerifyFragment$syncCardResultTask$12.L$0 = null;
                ocrVerifyFragment$syncCardResultTask$12.label = 4;
                if (rjf3.OLrzqt(ocrVerifyFragment$syncCardResultTask$12) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            rjf = (rJF) ocrVerifyFragment$syncCardResultTask$12.L$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
                responseData = (ResponseData) objOLrzqt;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        }
        final rJF rjf4 = rjf;
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            CardSyncResponse cardSyncResponse = (CardSyncResponse) ((AbstractC43419rot.StateListAnimator) actionBar).copydefault();
            final java.lang.String status = cardSyncResponse != null ? cardSyncResponse.getStatus() : null;
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("OKCard_Get_AsyncResult_Result", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rJL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rJF.EZpvd(status, rjf4, (EventParamsList) obj);
                }
            });
            if (status != null) {
                int iHashCode = status.hashCode();
                if (iHashCode != -562638271) {
                    if (iHashCode != 35394935) {
                        if (iHashCode == 2066319421 && status.equals(CardSyncResponse.FAILED)) {
                            AbstractC43846rww abstractC43846rwwAEQbTJ = rjf4.AEQbTJ();
                            if (abstractC43846rwwAEQbTJ != null) {
                                abstractC43846rwwAEQbTJ.KWHzl.cancelAnimation();
                                abstractC43846rwwAEQbTJ.KWHzl.setVisibility(8);
                                abstractC43846rwwAEQbTJ.EZpvd.getRoot().setVisibility(0);
                                abstractC43846rwwAEQbTJ.copydefault.getRoot().setVisibility(8);
                                abstractC43846rwwAEQbTJ.EZpvd.copydefault.setOKDSType(257);
                                abstractC43846rwwAEQbTJ.EZpvd.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.rJK
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(android.view.View view) {
                                        rJF.djBIcL(this.copydefault, view);
                                    }
                                });
                                abstractC43846rwwAEQbTJ.EZpvd.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.rJN
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(android.view.View view) {
                                        rJF.AhwBna(this.copydefault, view);
                                    }
                                });
                            }
                            Job job2 = rjf4.QKVWgx;
                            if (job2 != null) {
                                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
                            }
                        }
                    } else if (status.equals(CardSyncResponse.PENDING)) {
                        AbstractC43846rww abstractC43846rwwAEQbTJ2 = rjf4.AEQbTJ();
                        if (abstractC43846rwwAEQbTJ2 != null) {
                            abstractC43846rwwAEQbTJ2.KWHzl.setVisibility(0);
                            abstractC43846rwwAEQbTJ2.KWHzl.setAutoMirrored(true);
                            abstractC43846rwwAEQbTJ2.KWHzl.KWHzl(0L);
                            abstractC43846rwwAEQbTJ2.copydefault.getRoot().setVisibility(8);
                            abstractC43846rwwAEQbTJ2.EZpvd.getRoot().setVisibility(8);
                        }
                        ocrVerifyFragment$syncCardResultTask$12.L$0 = rjf4;
                        ocrVerifyFragment$syncCardResultTask$12.label = 3;
                        if (DelayKt.delay(1000L, ocrVerifyFragment$syncCardResultTask$12) == objCopydefault) {
                            return objCopydefault;
                        }
                        rjf3 = rjf4;
                        ocrVerifyFragment$syncCardResultTask$12.L$0 = null;
                        ocrVerifyFragment$syncCardResultTask$12.label = 4;
                        if (rjf3.OLrzqt(ocrVerifyFragment$syncCardResultTask$12) == objCopydefault) {
                        }
                        return Unit.INSTANCE;
                    }
                } else if (status.equals(CardSyncResponse.SUCCEEDED)) {
                    AbstractC43846rww abstractC43846rwwAEQbTJ3 = rjf4.AEQbTJ();
                    if (abstractC43846rwwAEQbTJ3 != null) {
                        abstractC43846rwwAEQbTJ3.KWHzl.cancelAnimation();
                        abstractC43846rwwAEQbTJ3.KWHzl.setVisibility(8);
                        abstractC43846rwwAEQbTJ3.copydefault.getRoot().setVisibility(8);
                        abstractC43846rwwAEQbTJ3.EZpvd.getRoot().setVisibility(8);
                    }
                    rTM rtm = rTM.KWHzl;
                    FragmentActivity fragmentActivityRequireActivity = rjf4.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    VendorConfig vendorConfig = rjf4.ORxRYg;
                    if (vendorConfig == null) {
                        vendorConfig = new VendorConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 1048575, (DefaultConstructorMarker) null);
                    }
                    java.lang.String str2 = rjf4.DTwDnp;
                    if (str2 == null) {
                        str2 = "";
                    }
                    java.lang.String str3 = rjf4.AuCTelauCTel;
                    ActivityResultLauncher<android.content.Intent> activityResultLauncher = rjf4.zsXlph;
                    ocrVerifyFragment$syncCardResultTask$12.L$0 = rjf4;
                    ocrVerifyFragment$syncCardResultTask$12.label = 2;
                    if (rtm.OLrzqt(fragmentActivityRequireActivity, vendorConfig, str2, str3, activityResultLauncher, ocrVerifyFragment$syncCardResultTask$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    rjf2 = rjf4;
                    job = rjf2.QKVWgx;
                    if (job != null) {
                    }
                }
            }
        } else if (actionBar instanceof AbstractC43419rot.ActionBar) {
            AbstractC43846rww abstractC43846rwwAEQbTJ4 = rjf4.AEQbTJ();
            if (abstractC43846rwwAEQbTJ4 != null && (c55113xdn2 = abstractC43846rwwAEQbTJ4.KWHzl) != null) {
                c55113xdn2.cancelAnimation();
            }
            AbstractC43846rww abstractC43846rwwAEQbTJ5 = rjf4.AEQbTJ();
            if (abstractC43846rwwAEQbTJ5 != null && (c55113xdn = abstractC43846rwwAEQbTJ5.KWHzl) != null) {
                c55113xdn.setVisibility(8);
            }
            AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
            final java.lang.String message = ((OKServerException) actionBar2.KWHzl()).getMessage();
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("OKCard_Get_AsyncResult_Result", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rJM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rJF.OLrzqt(message, rjf4, (EventParamsList) obj);
                }
            });
            pUU.KWHzl("OcrVerifyFragment", "syncCardResult code=" + ((OKServerException) actionBar2.KWHzl()).getCode() + ",message=" + ((OKServerException) actionBar2.KWHzl()).getMessage() + ",origin=" + ((OKServerException) actionBar2.KWHzl()).getOrigin() + " ");
            if (((OKServerException) actionBar2.KWHzl()).getOrigin() != null) {
                AbstractC43846rww abstractC43846rwwAEQbTJ6 = rjf4.AEQbTJ();
                if (abstractC43846rwwAEQbTJ6 != null) {
                    abstractC43846rwwAEQbTJ6.copydefault.getRoot().setVisibility(0);
                    abstractC43846rwwAEQbTJ6.EZpvd.getRoot().setVisibility(8);
                    abstractC43846rwwAEQbTJ6.copydefault.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.rJJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            rJF.gEmmrt(this.copydefault, view);
                        }
                    });
                }
            } else {
                AbstractC43846rww abstractC43846rwwAEQbTJ7 = rjf4.AEQbTJ();
                if (abstractC43846rwwAEQbTJ7 != null) {
                    abstractC43846rwwAEQbTJ7.EZpvd.getRoot().setVisibility(0);
                    abstractC43846rwwAEQbTJ7.copydefault.getRoot().setVisibility(8);
                    abstractC43846rwwAEQbTJ7.EZpvd.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.rJP
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            rJF.valueOf(this.EZpvd, view);
                        }
                    });
                    abstractC43846rwwAEQbTJ7.EZpvd.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.rJS
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            rJF.AYXKKw(this.AEQbTJ, view);
                        }
                    });
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String str, rJF rjf, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("result", C33129mqd.gEmmrt(str), false);
        VendorConfig vendorConfig = rjf.ORxRYg;
        eventParamsList.put("flow_source", C33129mqd.gEmmrt(vendorConfig != null ? vendorConfig.getSource() : null), false);
        VendorConfig vendorConfig2 = rjf.ORxRYg;
        eventParamsList.put(EopTrackEvent.KEY_SOURCE_CODE, C33129mqd.gEmmrt(vendorConfig2 != null ? vendorConfig2.getSourceCode() : null), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(rJF rjf, android.view.View view) {
        rjf.fetchVPNInfo().wlaJM();
    }

    public static final void AhwBna(rJF rjf, android.view.View view) {
        rjf.fetchVPNInfo().wlaJM();
    }

    public static final Unit OLrzqt(java.lang.String str, rJF rjf, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("result", EopTrackEvent.KEY_RESULT_FAILED, false);
        eventParamsList.put(EopTrackEvent.KEY_ERROR_MESSAGE, C33129mqd.gEmmrt(str), false);
        VendorConfig vendorConfig = rjf.ORxRYg;
        eventParamsList.put("flow_source", C33129mqd.gEmmrt(vendorConfig != null ? vendorConfig.getSource() : null), false);
        VendorConfig vendorConfig2 = rjf.ORxRYg;
        eventParamsList.put(EopTrackEvent.KEY_SOURCE_CODE, C33129mqd.gEmmrt(vendorConfig2 != null ? vendorConfig2.getSourceCode() : null), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(rJF rjf, android.view.View view) {
        rjf.fARcdN();
    }

    public static final void valueOf(rJF rjf, android.view.View view) {
        rjf.fetchVPNInfo().wlaJM();
    }

    public static final void AYXKKw(rJF rjf, android.view.View view) {
        rjf.fetchVPNInfo().wlaJM();
    }

    public static final void AEQbTJ(rJF rjf, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(rjf), null, null, new OcrVerifyFragment$eopLivenessLauncher$1$1(rjf, activityResult, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rJF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getMultiVendorEopVerificationResult$default(rJF rjf, java.util.ArrayList arrayList, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            arrayList = new java.util.ArrayList();
        }
        if ((i & 2) != 0) {
            num = java.lang.Integer.valueOf(Constant.VendorType.EOP.getVendorType());
        }
        if ((i & 4) != 0) {
            num2 = 1;
        }
        if ((i & 8) != 0) {
            str = "";
        }
        rjf.EZpvd(arrayList, num, num2, str);
    }

    public final void EZpvd(java.util.ArrayList<EopImageInfo> arrayList, java.lang.Integer num, java.lang.Integer num2, java.lang.String str) {
        AbstractC43846rww abstractC43846rwwAEQbTJ = AEQbTJ();
        if (abstractC43846rwwAEQbTJ != null) {
            abstractC43846rwwAEQbTJ.KWHzl.setAutoMirrored(true);
            abstractC43846rwwAEQbTJ.KWHzl.KWHzl(0L);
        }
        VendorVerifyRequest vendorVerifyRequest = new VendorVerifyRequest(-1L, arrayList, num, num2, str, this.gHZMYf, this.AxsJAY, this.AubY, AYXKKw(), copydefault(), valueOf());
        fetchVPNInfo().AEQbTJ(vendorVerifyRequest, (2 & 2) != 0 ? null : null, (2 & 4) != 0 ? null : this, (2 & 8) != 0 ? null : AhwBna(), (2 & 16) != 0 ? null : valueOf(), C33129mqd.gEmmrt(KWHzl().values().getValue()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.rJF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void postEncryptVerify$default(rJF rjf, java.util.ArrayList arrayList, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            arrayList = new java.util.ArrayList();
        }
        if ((i & 2) != 0) {
            num = java.lang.Integer.valueOf(Constant.VendorType.EOP.getVendorType());
        }
        java.lang.Integer num3 = num;
        if ((i & 4) != 0) {
            num2 = 1;
        }
        java.lang.Integer num4 = num2;
        if ((i & 8) != 0) {
            str = "";
        }
        java.lang.String str3 = str;
        if ((i & 16) != 0) {
            str2 = null;
        }
        rjf.OLrzqt((java.util.ArrayList<EopImageInfo>) arrayList, num3, num4, str3, str2);
    }

    public final void OLrzqt(java.util.ArrayList<EopImageInfo> arrayList, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, java.lang.String str2) {
        AbstractC43846rww abstractC43846rwwAEQbTJ = AEQbTJ();
        if (abstractC43846rwwAEQbTJ != null) {
            abstractC43846rwwAEQbTJ.KWHzl.setAutoMirrored(true);
            abstractC43846rwwAEQbTJ.KWHzl.KWHzl(0L);
        }
        VendorVerifyRequest vendorVerifyRequest = new VendorVerifyRequest(-1L, arrayList, num, num2, str, this.gHZMYf, this.AxsJAY, this.AubY, AYXKKw(), copydefault(), valueOf());
        fetchVPNInfo().AEQbTJ(vendorVerifyRequest, (2 & 2) != 0 ? null : null, (2 & 4) != 0 ? null : this, (2 & 8) != 0 ? null : AhwBna(), (2 & 16) != 0 ? null : valueOf(), C33129mqd.gEmmrt(KWHzl().values().getValue()), (2 & 64) != 0 ? null : str2);
    }

    @Override // o.AbstractC42060rEw, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ejfBZ();
        fetchVPNInfo().fetchVPNInfo().removeObservers(getViewLifecycleOwner());
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rJF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
