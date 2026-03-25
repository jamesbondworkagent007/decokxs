package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.gms.common.Scopes;
import com.okinc.base.utils.commmon.ThreadUtils;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.common.From;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UpdateFormAppModel;
import com.okinc.ok_kyc_core.presentation.host.OKComplianceActivity$Companion$startActivityIfAllowedWithLifecycleScope$1;
import com.okinc.ok_kyc_core.presentation.host.OKComplianceActivity$Companion$startActivityIfAllowedWithLifecycleScope$2;
import com.okinc.ok_kyc_core.presentation.host.OKComplianceActivity$Companion$startActivityWithPostOnboarding$2;
import com.okinc.ok_kyc_core.presentation.host.OKComplianceActivity$iniDetectionConfig$1;
import com.okinc.ok_kyc_core.presentation.host.OKComplianceActivity$initObserve$1;
import com.okinc.ok_kyc_core_api.ComplianceFlowStatus;
import com.okinc.ok_kyc_core_api.ComplianceTheme;
import com.okinc.ok_kyc_core_api.PermissionState;
import com.okinc.ok_kyc_core_api.Playbook;
import com.okinc.ok_kyc_core_api.ResultBackStatus;
import com.okinc.ok_kyc_core_api.model.CompliancePostOnboardingModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC43737rut;
import o.ActivityC42162rIq;
import o.C43662rtX;
import o.rSF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rIq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC42162rIq extends AbstractActivityC42160rIo {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AhwBna;
    public AbstractC43757rvM gEmmrt;

    /* JADX INFO: renamed from: o.rIq$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ComplianceTheme.values().length];
            try {
                iArr[ComplianceTheme.OKX.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ComplianceTheme.OKX_LITE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[ResultStatus.values().length];
            try {
                iArr2[ResultStatus.QuestionSuccess.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[ResultStatus.Success.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[ResultStatus.SuccessConfetti.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            KWHzl = iArr2;
            int[] iArr3 = new int[From.values().length];
            try {
                iArr3[From.KYC2.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[From.HOME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[From.WITHDRAWAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            AEQbTJ = iArr3;
        }
    }

    public ActivityC42162rIq() {
        final Function0 function0 = null;
        this.AhwBna = new ViewModelLazy(C56524yIo.AEQbTJ(C42163rIr.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.host.OKComplianceActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.ok_kyc_core.presentation.host.OKComplianceActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.host.OKComplianceActivity$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    private final C42163rIr AYXKKw() {
        return (C42163rIr) this.AhwBna.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    @Override // o.AbstractActivityC42160rIo, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        this.gEmmrt = (AbstractC43757rvM) DataBindingUtil.setContentView(this, C43662rtX.TaskDescription.djBIcL);
        pUU.KWHzl("qjf", "OKComplianceActivity isRecreate = " + (bundle != null));
        C43701ruJ.EZpvd.copydefault(bundle != null);
        EZpvd(AYXKKw());
        android.os.Bundle extras = getIntent().getExtras();
        if ((extras != null ? extras.getString("playbook") : null) != null) {
            android.os.Bundle extras2 = getIntent().getExtras();
            if ((extras2 != null ? extras2.getString("featureUri") : null) == null) {
            }
        } else {
            finish();
        }
        C42163rIr c42163rIrAYXKKw = AYXKKw();
        android.os.Bundle extras3 = getIntent().getExtras();
        if (extras3 == null || (string = extras3.getString("playbook")) == null) {
            string = "";
        }
        c42163rIrAYXKKw.KWHzl(string);
        C42163rIr c42163rIrAYXKKw2 = AYXKKw();
        java.io.Serializable serializableExtra = getIntent().getSerializableExtra("playbookParams");
        c42163rIrAYXKKw2.AEQbTJ(serializableExtra instanceof java.util.HashMap ? (java.util.HashMap) serializableExtra : null);
        AYXKKw().OLrzqt((PageComponentAppModel) getIntent().getParcelableExtra("pageComponentAppModel"));
        if (bundle != null) {
            C42163rIr c42163rIrAYXKKw3 = AYXKKw();
            java.lang.String string2 = bundle.getString("playbook");
            c42163rIrAYXKKw3.KWHzl(string2 != null ? string2 : "");
            C42163rIr c42163rIrAYXKKw4 = AYXKKw();
            java.io.Serializable serializable = bundle.getSerializable("playbookParams");
            c42163rIrAYXKKw4.AEQbTJ(serializable instanceof java.util.HashMap ? (java.util.HashMap) serializable : null);
        }
        AYXKKw().OLrzqt((PageComponentProfile) getIntent().getParcelableExtra(Scopes.PROFILE));
        rSF rsf = (rSF) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(rSF.class));
        ComplianceTheme complianceThemeCopydefault = rsf != null ? rsf.copydefault() : null;
        int i = complianceThemeCopydefault == null ? -1 : StateListAnimator.EZpvd[complianceThemeCopydefault.ordinal()];
        if (i == 1) {
            AYXKKw().EZpvd(ComplianceTheme.OKX);
            setTheme(C43662rtX.FragmentManager.copydefault);
        } else if (i == 2) {
            AYXKKw().EZpvd(ComplianceTheme.OKX_LITE);
            setTheme(C43662rtX.FragmentManager.EZpvd);
        }
        AYXKKw().AEQbTJ(this);
        KWHzl();
    }

    @Override // o.AbstractActivityC42160rIo, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        java.lang.String[] strArr = android.os.Build.SUPPORTED_64_BIT_ABIS;
        Intrinsics.checkNotNullExpressionValue(strArr, "");
        if (!(strArr.length == 0)) {
            java.lang.String string = java.util.Arrays.toString(strArr);
            Intrinsics.checkNotNullExpressionValue(string, "");
            pUU.KWHzl("qjf", "64 bit abis support = " + string);
            return;
        }
        java.lang.String[] strArr2 = android.os.Build.SUPPORTED_32_BIT_ABIS;
        Intrinsics.checkNotNullExpressionValue(strArr2, "");
        if (!(strArr2.length == 0)) {
            java.lang.String string2 = java.util.Arrays.toString(strArr2);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            pUU.KWHzl("qjf", "32 bit abis support = " + string2);
            return;
        }
        pUU.KWHzl("qjf", "unknown bit abis support");
    }

    public final void KWHzl() {
        C42467rTy c42467rTy = C42467rTy.KWHzl;
        if (c42467rTy.QKVWgx() && c42467rTy.ORxRYg()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OKComplianceActivity$iniDetectionConfig$1(this, null), 3, null);
            return;
        }
        rSC rsc = (rSC) C43251rlk.OLrzqt(rSC.class);
        if (rsc != null) {
            rsc.KWHzl(null);
        }
    }

    public final void EZpvd(C42163rIr c42163rIr) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new OKComplianceActivity$initObserve$1(c42163rIr, this, null));
        C43733rup.copydefault(AYXKKw().EZpvd(), this, new Function1() { // from class: o.rIp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC42162rIq.copydefault(this.copydefault, (C43734ruq) obj);
            }
        });
        C43733rup.copydefault(AYXKKw().djBIcL(), this, new Function1() { // from class: o.rIm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC42162rIq.KWHzl(this.copydefault, (C43734ruq) obj);
            }
        });
    }

    public static final Unit copydefault(ActivityC42162rIq activityC42162rIq, C43734ruq c43734ruq) {
        java.util.ArrayList arrayList;
        if (c43734ruq != null && (arrayList = (java.util.ArrayList) c43734ruq.EZpvd()) != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("info_form_data", arrayList);
            activityC42162rIq.setResult(-1, intent);
            activityC42162rIq.finish();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC42162rIq activityC42162rIq, C43734ruq c43734ruq) {
        UpdateFormAppModel updateFormAppModel;
        if (c43734ruq != null && (updateFormAppModel = (UpdateFormAppModel) c43734ruq.EZpvd()) != null) {
            if (activityC42162rIq.AYXKKw().AkhnZx()) {
                activityC42162rIq.AYXKKw().copydefault().setValue(new C43734ruq<>(updateFormAppModel));
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("update_form_data", updateFormAppModel);
                activityC42162rIq.setResult(-1, intent);
                activityC42162rIq.finish();
            }
        }
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        finish();
    }

    public final void EZpvd(AbstractC43737rut abstractC43737rut) {
        rSF rsf = (rSF) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(rSF.class));
        if (rsf != null) {
            rSF.Application.refreshFeatureRestrictionRepository$default(rsf, LifecycleOwnerKt.getLifecycleScope(this), null, 2, null);
        }
        rSF rsf2 = (rSF) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(rSF.class));
        ComplianceTheme complianceThemeCopydefault = rsf2 != null ? rsf2.copydefault() : null;
        int i = complianceThemeCopydefault == null ? -1 : StateListAnimator.EZpvd[complianceThemeCopydefault.ordinal()];
        if (i != 1) {
            if (i == 2) {
                OLrzqt(abstractC43737rut);
                return;
            } else {
                OLrzqt(abstractC43737rut);
                return;
            }
        }
        if (AYXKKw().DbNXlk() == 1) {
            rSF rsf3 = (rSF) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(rSF.class));
            if (rsf3 != null) {
                rsf3.KWHzl((android.content.Context) this);
            }
            finish();
            return;
        }
        OLrzqt(abstractC43737rut);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putString("playbook", AYXKKw().fetchVPNInfo());
        bundle.putSerializable("playbookParams", AYXKKw().AhwBna());
    }

    public final void OLrzqt(AbstractC43737rut abstractC43737rut) {
        InterfaceC7298ahG interfaceC7298ahGKWHzl;
        android.content.Intent intent = new android.content.Intent();
        boolean z = abstractC43737rut instanceof AbstractC43737rut.Application;
        if (!z && (interfaceC7298ahGKWHzl = C7323ahf.KWHzl()) != null) {
            interfaceC7298ahGKWHzl.AEQbTJ("derivatives_flow_competion_notification", null, null);
        }
        if (abstractC43737rut instanceof AbstractC43737rut.StateListAnimator) {
            ResultStatus resultStatusKWHzl = ((AbstractC43737rut.StateListAnimator) abstractC43737rut).KWHzl();
            int i = resultStatusKWHzl == null ? -1 : StateListAnimator.KWHzl[resultStatusKWHzl.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                Intrinsics.copydefault(intent.putExtra("kyc_result_data", ResultBackStatus.Success));
            }
        } else if (abstractC43737rut instanceof AbstractC43737rut.TaskDescription) {
            AbstractC43737rut.TaskDescription taskDescription = (AbstractC43737rut.TaskDescription) abstractC43737rut;
            ResultStatus resultStatusCopydefault = taskDescription.copydefault();
            int i2 = resultStatusCopydefault == null ? -1 : StateListAnimator.KWHzl[resultStatusCopydefault.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                Intrinsics.copydefault(intent.putExtra("kyc_result_data", ResultBackStatus.Success));
            }
            int i3 = StateListAnimator.AEQbTJ[taskDescription.KWHzl().ordinal()];
            if (i3 == 1 || i3 == 2) {
                setResult(-1, intent);
                finish();
                rSF rsf = (rSF) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(rSF.class));
                if (rsf != null) {
                    rSF.Application.gotoMain$default(rsf, this, null, 2, null);
                    return;
                }
                return;
            }
            if (i3 == 3) {
                rTM.KWHzl.EZpvd((FragmentActivity) this);
            }
        }
        if (z) {
            intent.putExtra("kyc_flow_result_status_data", ComplianceFlowStatus.Back);
        } else {
            intent.putExtra("kyc_flow_result_status_data", ComplianceFlowStatus.Close);
        }
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: renamed from: o.rIq$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rIq.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC42162rIq.class);
            Playbook playbook = Playbook.OKX_APP_KYC_OVERVIEW;
            intent.putExtra("playbook", playbook.getValue());
            intent.putExtra("featureUri", playbook.getFeatureUri());
            intent.putExtra("playbookParams", new java.util.HashMap());
            context.startActivity(intent);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: android.content.Context */
        /* JADX WARN: Multi-variable type inference failed */
        public final void AEQbTJ(@NotNull android.content.Context context, LifecycleCoroutineScope lifecycleCoroutineScope, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, ActivityResultLauncher<android.content.Intent> activityResultLauncher, Function0<Unit> function0, Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(map, "");
            rBD rbd = new rBD(new C43746rvB(new rAP(), InterfaceC43709ruR.Companion.AEQbTJ(str, map), null, 4, null));
            if (function0 == null) {
                if (context instanceof FragmentActivity) {
                    BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope == null ? LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) context) : lifecycleCoroutineScope, Dispatchers.getMain(), null, new OKComplianceActivity$Companion$startActivityIfAllowedWithLifecycleScope$1(rbd, str, str2, map, function02, context, activityResultLauncher, null), 2, null);
                    return;
                } else {
                    goActivity$default(this, context, str, str2, map, null, activityResultLauncher, null, 64, null);
                    return;
                }
            }
            if (context instanceof FragmentActivity) {
                BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope == null ? LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) context) : lifecycleCoroutineScope, Dispatchers.getMain(), null, new OKComplianceActivity$Companion$startActivityIfAllowedWithLifecycleScope$2(rbd, str, str2, map, function0, context, activityResultLauncher, null), 2, null);
            }
        }

        public final void OLrzqt(@NotNull FragmentActivity fragmentActivity, LifecycleCoroutineScope lifecycleCoroutineScope, @NotNull CompliancePostOnboardingModel compliancePostOnboardingModel, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, Function0<Unit> function0, ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            Intrinsics.checkNotNullParameter(compliancePostOnboardingModel, "");
            Intrinsics.checkNotNullParameter(map, "");
            if (C33129mqd.OLrzqt((java.lang.CharSequence) compliancePostOnboardingModel.getPlaybook())) {
                rBP rbp = new rBP(new C43746rvB(new rAP(), InterfaceC43709ruR.Companion.AEQbTJ(compliancePostOnboardingModel.getPlaybook(), compliancePostOnboardingModel.getPlaybookParams()), null, 4, null));
                LifecycleCoroutineScope lifecycleScope = lifecycleCoroutineScope == null ? LifecycleOwnerKt.getLifecycleScope(fragmentActivity) : lifecycleCoroutineScope;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<java.lang.String, java.lang.String> entry : compliancePostOnboardingModel.getCtaValue().entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                BuildersKt__Builders_commonKt.launch$default(lifecycleScope, Dispatchers.getMain(), null, new OKComplianceActivity$Companion$startActivityWithPostOnboarding$2(rbp, compliancePostOnboardingModel, linkedHashMap, map, function0, fragmentActivity, activityResultLauncher, null), 2, null);
            }
        }

        public final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, ActivityResultLauncher<android.content.Intent> activityResultLauncher, Function0<Unit> function0, Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(map, "");
            AEQbTJ(context, null, str, str2, map, activityResultLauncher, function0, function02);
        }

        public static /* synthetic */ void goActivity$default(TaskDescription taskDescription, android.content.Context context, java.lang.String str, java.lang.String str2, java.util.HashMap map, OnDemandKYCAppModel onDemandKYCAppModel, ActivityResultLauncher activityResultLauncher, java.lang.Boolean bool, int i, java.lang.Object obj) {
            taskDescription.OLrzqt(context, str, str2, map, onDemandKYCAppModel, activityResultLauncher, (i & 64) != 0 ? java.lang.Boolean.FALSE : bool);
        }

        public final void OLrzqt(@NotNull final android.content.Context context, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.util.HashMap<java.lang.String, java.lang.String> map, final OnDemandKYCAppModel onDemandKYCAppModel, final ActivityResultLauncher<android.content.Intent> activityResultLauncher, final java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(map, "");
            ThreadUtils.copydefault(new java.lang.Runnable() { // from class: o.rIu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC42162rIq.TaskDescription.copydefault(context, activityResultLauncher, str, str2, map, bool, onDemandKYCAppModel);
                }
            });
        }

        public static final void copydefault(android.content.Context context, ActivityResultLauncher activityResultLauncher, java.lang.String str, java.lang.String str2, java.util.HashMap map, java.lang.Boolean bool, OnDemandKYCAppModel onDemandKYCAppModel) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC42162rIq.class);
            intent.putExtra("playbook", str);
            intent.putExtra("featureUri", str2);
            intent.putExtra("playbookParams", map);
            intent.putExtra("sendCloseNotification", bool);
            if (onDemandKYCAppModel != null) {
                intent.putExtra("pageComponentAppModel", onDemandKYCAppModel.getViewModel());
                intent.putExtra(Scopes.PROFILE, onDemandKYCAppModel.getProfile());
            }
            if (activityResultLauncher != null) {
                try {
                    activityResultLauncher.launch(intent);
                    return;
                } catch (java.lang.Exception e) {
                    C32866mlf.onEvent$default("KYC_flow_start_error", (TrackChannel[]) null, new Function1() { // from class: o.rIn
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ActivityC42162rIq.TaskDescription.OLrzqt(e, (EventParamsList) obj);
                        }
                    }, 1, (java.lang.Object) null);
                    return;
                }
            }
            TaskDescription taskDescription = ActivityC42162rIq.Companion;
            context.startActivity(intent);
        }

        public static final Unit OLrzqt(java.lang.Exception exc, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "msg", java.lang.String.valueOf(exc.getMessage()), false, 4, null);
            eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
            return Unit.INSTANCE;
        }

        public final java.lang.String EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) Playbook.NOTABENE_OKCOIN.getValue()) && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) Playbook.NOTABENE_OKX.getValue())) {
                if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) Playbook.OKX_QUESTION.getValue()) && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) Playbook.DERIVATIVE_AGREEMENT.getValue())) {
                    Playbook playbook = Playbook.OKX_APP_UK_CATEGORIZATION;
                    if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) playbook.getValue())) {
                        return playbook.getFeatureUri();
                    }
                    Playbook playbook2 = Playbook.TRAVEL_RULE_INTERNAL;
                    if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) playbook2.getValue())) {
                        return playbook2.getFeatureUri();
                    }
                    if (!C59449zhJ.startsWith$default(str, "okx_travel_", false, 2, null) && !C59449zhJ.startsWith$default(str, "okcoin_travel_", false, 2, null) && !C59449zhJ.startsWith$default(str, "common_travel_", false, 2, null)) {
                        if (!C59449zhJ.startsWith$default(str, "okx_app_question", false, 2, null)) {
                            return "kyc";
                        }
                    }
                }
                return "question";
            }
            return "notabene";
        }
    }

    @Override // o.AbstractActivityC33041mov, o.C60121zwJ.Activity
    public void onPermissionsGranted(int i, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        super.onPermissionsGranted(i, list);
        AYXKKw().AYXKKw().setValue(new C43734ruq<>(new Triple(PermissionState.Granted, java.lang.Integer.valueOf(i), list)));
    }

    @Override // o.AbstractActivityC33041mov, o.C60121zwJ.Activity
    public void onPermissionsDenied(int i, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        super.onPermissionsDenied(i, list);
        AYXKKw().AYXKKw().setValue(new C43734ruq<>(new Triple(PermissionState.DENIED, java.lang.Integer.valueOf(i), list)));
    }

    @Override // o.AbstractActivityC42160rIo, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AYXKKw().fIwbmz();
    }

    @Override // o.AbstractActivityC42160rIo, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.attachBaseContext(context);
        C34717nhc.Companion.copydefault(this);
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            android.view.View currentFocus = getCurrentFocus();
            if (currentFocus instanceof android.widget.EditText) {
                android.graphics.Rect rect = new android.graphics.Rect();
                android.widget.EditText editText = (android.widget.EditText) currentFocus;
                editText.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    C33570myu.copydefault((android.app.Activity) this);
                    editText.clearFocus();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // o.AbstractActivityC42160rIo, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC42160rIo, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
