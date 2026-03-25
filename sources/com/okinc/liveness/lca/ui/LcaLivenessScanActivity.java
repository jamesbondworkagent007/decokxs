package com.okinc.liveness.lca.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.CameraState;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.liveness.lca.LcaLivenessCheckOnCancel;
import com.okinc.liveness.lca.LcaLivenessCheckOnCloseSelfieView;
import com.okinc.liveness.lca.LcaLivenessCheckOnFarSelfieView;
import com.okinc.liveness.lca.LcaLivenessCheckOnFinalCheckView;
import com.okinc.liveness.lca.LcaLivenessCheckOnFirstFreshnessView;
import com.okinc.liveness.lca.LcaLivenessCheckOnReloadScreenClicked;
import com.okinc.liveness.lca.LcaLivenessCheckOnReloadScreenView;
import com.okinc.liveness.lca.LcaLivenessCheckOnRestartDialogClicked;
import com.okinc.liveness.lca.LcaLivenessCheckOnRetryDialogPop;
import com.okinc.liveness.lca.LcaLivenessCheckOnSocketConnected;
import com.okinc.liveness.lca.LcaLivenessCheckOnStartingUpView;
import com.okinc.liveness.lca.LcaLivenessCheckResult;
import com.okinc.liveness.lca.LcaLivenessCheckSuccess;
import com.okinc.liveness.lca.LcaSdkConfiguration;
import com.okinc.liveness.lca.ai.FaceDetector;
import com.okinc.liveness.lca.components.ClippedOvalImageView;
import com.okinc.liveness.lca.components.FaceOvalView;
import com.okinc.liveness.lca.components.PreviewTextureView;
import com.okinc.liveness.lca.data.FaceCheckState;
import com.okinc.liveness.lca.data.ScoreData;
import com.okinc.liveness.lca.data.VideoViewportSize;
import com.okinc.liveness.lca.debugtool.data.LcaDebugInfo;
import com.okinc.liveness.lca.debugtool.data.LivenessResponse;
import com.okinc.liveness.lca.manager.BrightnessManager;
import com.okinc.liveness.lca.manager.CameraManager;
import com.okinc.liveness.lca.manager.ConfigManager;
import com.okinc.liveness.lca.manager.FaceCaptchaManager;
import com.okinc.liveness.lca.manager.LcaPermissionManager;
import com.okinc.liveness.lca.manager.LcaSdkManager;
import com.okinc.liveness.lca.manager.TimeoutType;
import com.okinc.liveness.lca.manager.TimerManager;
import com.okinc.liveness.lca.ui.LcaLivenessScanViewModel;
import com.okinc.liveness.lca.ui.LivenessProcessState;
import com.okinc.liveness.lca.ui.LivenessUIState;
import com.okinc.liveness.lca.utils.VibratorUtils;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigCollectedVideoConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C33054mpH;
import o.C34717nhc;
import o.C42467rTy;
import o.C45697sut;
import o.C45702suy;
import o.C52761wXj;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.ViewOnClickListenerC54939xaY;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaLivenessScanActivity extends AbstractActivityC33041mov {
    public static final String KYC_LOG_TAG = "kyc_in_house";
    public static final String LCA_LOG_TAG = "LCA liveness -";
    public C45702suy binding;
    public BrightnessManager brightnessManager;
    public CameraManager cameraManager;
    public LcaPermissionManager lcaPermissionManager;
    public final Function0<Unit> onLcaRelease = new Function0() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$$ExternalSyntheticLambda3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LcaLivenessScanActivity.onLcaRelease$lambda$1(this.f$0);
        }
    };
    public boolean onNewIntent;
    public boolean onPausedDuringLiveness;
    public boolean onRestarted;
    public ViewOnClickListenerC54939xaY retryDialog;
    public TimerManager timerManager;
    public final InterfaceC56387yDm viewModel$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.ui.LcaLivenessScanActivity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public LcaLivenessScanActivity() {
        final Function0 function0 = null;
        this.viewModel$delegate = new ViewModelLazy(C56524yIo.AEQbTJ(LcaLivenessScanViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LcaLivenessScanActivity.viewModel_delegate$lambda$0(this.f$0);
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.okinc.liveness.lca.ui.LcaLivenessScanActivity$displayRetry$1$$ExternalSyntheticLambda0.onClick(android.view.View):void] */
    public static final /* synthetic */ void access$restartLivenessByReloadPage(LcaLivenessScanActivity lcaLivenessScanActivity, String str, Throwable th) {
        lcaLivenessScanActivity.restartLivenessByReloadPage(str, th);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.okinc.liveness.lca.ui.LcaLivenessScanActivity$displayRetry$1$$ExternalSyntheticLambda1.onClick(android.view.View):void] */
    public static final /* synthetic */ void access$restartLivenessByRetryDialog(LcaLivenessScanActivity lcaLivenessScanActivity, String str, Throwable th) {
        lcaLivenessScanActivity.restartLivenessByRetryDialog(str, th);
    }

    public final LcaLivenessScanViewModel getViewModel() {
        return (LcaLivenessScanViewModel) this.viewModel$delegate.getValue();
    }

    public static final ViewModelProvider.Factory viewModel_delegate$lambda$0(LcaLivenessScanActivity lcaLivenessScanActivity) {
        Context applicationContext = lcaLivenessScanActivity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        return new LcaLivenessScanViewModel.Factory(applicationContext, new ConfigManager());
    }

    public static final Unit onLcaRelease$lambda$1(LcaLivenessScanActivity lcaLivenessScanActivity) {
        pUU.KWHzl("kyc_in_house", "LCA liveness - release callback invoke");
        lcaLivenessScanActivity.dismissLoading();
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = lcaLivenessScanActivity.retryDialog;
        if (viewOnClickListenerC54939xaY != null) {
            viewOnClickListenerC54939xaY.dismiss();
        }
        lcaLivenessScanActivity.finishLiveness();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        pUU.KWHzl(getTAG() + "-Lifecycle", "onCreate");
        LcaSdkManager.Companion companion = LcaSdkManager.Companion;
        if (companion.getInstance().getConfiguration().getDebugMode()) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - onCreate, configuration=" + companion.getInstance().getConfiguration());
        }
        C45702suy c45702suyCopydefault = C45702suy.copydefault(getLayoutInflater());
        this.binding = c45702suyCopydefault;
        if (c45702suyCopydefault == null) {
            Intrinsics.gEmmrt("");
            c45702suyCopydefault = null;
        }
        setContentView(c45702suyCopydefault.getRoot());
        this.brightnessManager = new BrightnessManager(this);
        valueOf();
        bindPermissionHandling();
        AEQbTJ();
        KWHzl();
        initTimer(TimeoutType.LIVENESS_TIMEOUT_TYPE);
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        pUU.KWHzl(getTAG() + "-Lifecycle", "onNewIntent");
        super.onNewIntent(intent);
        setIntent(intent);
        this.onNewIntent = true;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.attachBaseContext(context);
        C42467rTy c42467rTy = C42467rTy.KWHzl;
        pUU.KWHzl("qjf", "isLcaDynamicOpen = " + c42467rTy.QVAiDq());
        if (c42467rTy.QVAiDq()) {
            C34717nhc.Companion.copydefault(this);
        }
    }

    @Override // o.AbstractActivityC33041mov
    public void setRequestedOrientation(@NotNull Activity activity, @NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(configuration, "");
        activity.setRequestedOrientation(1);
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        pUU.KWHzl("kyc_in_house", "lca onConfigurationChanged");
        displayRetry(C45697sut.Application.gEmmrt, C45697sut.Application.AYXKKw, LcaSdkConfiguration.Companion.getRETRY_REASON_RESUME_CONFIG_CHANGE(), null, true);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        pUU.KWHzl(getTAG() + "-Lifecycle", "onResume");
        super.onResume();
        if (this.onRestarted) {
            this.onRestarted = false;
            displayRetry(C45697sut.Application.gEmmrt, C45697sut.Application.AYXKKw, LcaSdkConfiguration.Companion.getRETRY_REASON_RESUME_FROM_BACKGROUND(), null, true);
        } else if (this.onPausedDuringLiveness) {
            this.onPausedDuringLiveness = false;
            pUU.KWHzl("kyc_in_house", "LCA liveness - resuming from brief pause during liveness, camera still active");
        } else if (this.onNewIntent) {
            this.onNewIntent = false;
            recreateActivity();
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        pUU.KWHzl(getTAG() + "-Lifecycle", EopTrackEvent.ONPAUSE);
        if (this.cameraManager != null) {
            this.onPausedDuringLiveness = true;
        }
        dismissLoading();
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.retryDialog;
        if (viewOnClickListenerC54939xaY != null) {
            viewOnClickListenerC54939xaY.dismiss();
        }
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        pUU.KWHzl(getTAG() + "-Lifecycle", "onStop");
        djBIcL();
        super.onStop();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void onRestart() {
        pUU.KWHzl(getTAG() + "-Lifecycle", "onRestart");
        super.onRestart();
        this.onRestarted = true;
        this.onPausedDuringLiveness = false;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        pUU.KWHzl(getTAG() + "-Lifecycle", "onDestroy");
        CameraManager cameraManager = this.cameraManager;
        if (cameraManager != null) {
            cameraManager.releaseAsStop();
        }
        this.cameraManager = null;
        super.onDestroy();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        pUU.KWHzl("kyc_in_house", "LCA liveness - on back pressed");
        copydefault();
    }

    private final void valueOf() {
        OLrzqt();
        initFaceOval();
        positionTipsLayout();
        C45702suy c45702suy = this.binding;
        if (c45702suy == null) {
            Intrinsics.gEmmrt("");
            c45702suy = null;
        }
        TextView textView = c45702suy.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.addTextChangedListener(new TextWatcher() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$setupUI$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C45702suy c45702suy2 = this.this$0.binding;
                if (c45702suy2 == null) {
                    Intrinsics.gEmmrt("");
                    c45702suy2 = null;
                }
                c45702suy2.ejfBZ.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
            }
        });
    }

    public final void positionTipsLayout() {
        int i = (int) (getResources().getDisplayMetrics().heightPixels * 0.76f);
        C45702suy c45702suy = this.binding;
        C45702suy c45702suy2 = null;
        if (c45702suy == null) {
            Intrinsics.gEmmrt("");
            c45702suy = null;
        }
        ViewGroup.LayoutParams layoutParams = c45702suy.valueOf.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = i;
        layoutParams2.gravity = 81;
        C45702suy c45702suy3 = this.binding;
        if (c45702suy3 == null) {
            Intrinsics.gEmmrt("");
            c45702suy3 = null;
        }
        c45702suy3.valueOf.setLayoutParams(layoutParams2);
        C45702suy c45702suy4 = this.binding;
        if (c45702suy4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c45702suy2 = c45702suy4;
        }
        LottieAnimationView lottieAnimationView = c45702suy2.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        lottieAnimationView.setVisibility(8);
    }

    private final void OLrzqt() {
        C45702suy c45702suy = this.binding;
        if (c45702suy == null) {
            Intrinsics.gEmmrt("");
            c45702suy = null;
        }
        c45702suy.copydefault.getBackImage().setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$$ExternalSyntheticLambda4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LcaLivenessScanActivity.initAppBar$lambda$3(this.f$0, view);
            }
        });
    }

    public static final void initAppBar$lambda$3(LcaLivenessScanActivity lcaLivenessScanActivity, View view) {
        pUU.KWHzl("kyc_in_house", "LCA liveness - click app bar back button");
        lcaLivenessScanActivity.copydefault();
    }

    public final void initFaceOval() {
        C45702suy c45702suy = this.binding;
        if (c45702suy == null) {
            Intrinsics.gEmmrt("");
            c45702suy = null;
        }
        c45702suy.EZpvd.setOnBlurBackgroundReadyListener(new FaceOvalView.OnBlurBackgroundReadyListener() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity.initFaceOval.1
            @Override // com.okinc.liveness.lca.components.FaceOvalView.OnBlurBackgroundReadyListener
            public void onBlurBackgroundReady() {
                pUU.KWHzl("kyc_in_house", "LCA liveness - face oval background ready");
                LcaLivenessScanActivity.this.getViewModel().setFaceOvalReady(true);
            }
        });
    }

    private final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new LcaLivenessScanActivity$observeViewModel$1(this, null), 3, null);
        getViewModel().getProcessState().observe(this, new LcaLivenessScanActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$$ExternalSyntheticLambda9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LcaLivenessScanActivity.observeViewModel$lambda$4(this.f$0, (LivenessProcessState) obj);
            }
        }));
        getViewModel().getNetworkErrorEvent().observe(this, new Observer() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$$ExternalSyntheticLambda10
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                LcaLivenessScanActivity.observeViewModel$lambda$5(this.f$0, (Pair) obj);
            }
        });
        getViewModel().getTimeoutEvent().observe(this, new Observer() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$$ExternalSyntheticLambda11
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                LcaLivenessScanActivity.observeViewModel$lambda$6(this.f$0, (Unit) obj);
            }
        });
        getViewModel().getLocalErrorEvent().observe(this, new Observer() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$$ExternalSyntheticLambda12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                LcaLivenessScanActivity.observeViewModel$lambda$7(this.f$0, (Pair) obj);
            }
        });
    }

    public static final Unit observeViewModel$lambda$4(LcaLivenessScanActivity lcaLivenessScanActivity, LivenessProcessState livenessProcessState) {
        Intrinsics.copydefault(livenessProcessState);
        lcaLivenessScanActivity.handleProcessState(livenessProcessState);
        return Unit.INSTANCE;
    }

    public static final void observeViewModel$lambda$5(LcaLivenessScanActivity lcaLivenessScanActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        displayRetry$default(lcaLivenessScanActivity, C45697sut.Application.AEQbTJ, C45697sut.Application.KWHzl, (String) pair.component1(), (Throwable) pair.component2(), false, 16, null);
    }

    public static final void observeViewModel$lambda$6(LcaLivenessScanActivity lcaLivenessScanActivity, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        pUU.KWHzl("kyc_in_house", "LCA liveness - timeout event received");
        displayRetry$default(lcaLivenessScanActivity, C45697sut.Application.EZpvd, C45697sut.Application.copydefault, LcaSdkConfiguration.Companion.getRETRY_REASON_TIMEOUT(), null, false, 16, null);
    }

    public static final void observeViewModel$lambda$7(LcaLivenessScanActivity lcaLivenessScanActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        displayRetry$default(lcaLivenessScanActivity, C45697sut.Application.gEmmrt, C45697sut.Application.AYXKKw, (String) pair.component1(), (Throwable) pair.component2(), false, 16, null);
    }

    public final void updateUIForState(LivenessUIState livenessUIState) {
        String strM6783getDetectionInfo;
        String strM6783getDetectionInfo2;
        pUU.KWHzl("kyc_in_house", "LCA liveness - UI state changed to " + livenessUIState);
        C45702suy c45702suy = null;
        if (!Intrinsics.EZpvd(livenessUIState, LivenessUIState.StartingUp.INSTANCE)) {
            if (!Intrinsics.EZpvd(livenessUIState, LivenessUIState.FarSelfie.INSTANCE)) {
                if (!Intrinsics.EZpvd(livenessUIState, LivenessUIState.CloseSelfie.INSTANCE)) {
                    if (!Intrinsics.EZpvd(livenessUIState, LivenessUIState.FinalCheck.INSTANCE)) {
                        if (!Intrinsics.EZpvd(livenessUIState, LivenessUIState.Error.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C45702suy c45702suy2 = this.binding;
                        if (c45702suy2 == null) {
                            Intrinsics.gEmmrt("");
                            c45702suy2 = null;
                        }
                        FrameLayout frameLayout = c45702suy2.fetchVPNInfo;
                        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                        frameLayout.setVisibility(8);
                        C45702suy c45702suy3 = this.binding;
                        if (c45702suy3 == null) {
                            Intrinsics.gEmmrt("");
                            c45702suy3 = null;
                        }
                        LinearLayout linearLayout = c45702suy3.gEmmrt;
                        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                        linearLayout.setVisibility(8);
                        C45702suy c45702suy4 = this.binding;
                        if (c45702suy4 == null) {
                            Intrinsics.gEmmrt("");
                            c45702suy4 = null;
                        }
                        LinearLayout linearLayout2 = c45702suy4.djBIcL;
                        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                        linearLayout2.setVisibility(0);
                        C45702suy c45702suy5 = this.binding;
                        if (c45702suy5 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            c45702suy = c45702suy5;
                        }
                        c45702suy.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$$ExternalSyntheticLambda0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                LcaLivenessScanActivity.updateUIForState$lambda$8(this.f$0, view);
                            }
                        });
                        return;
                    }
                    C45702suy c45702suy6 = this.binding;
                    if (c45702suy6 == null) {
                        Intrinsics.gEmmrt("");
                        c45702suy6 = null;
                    }
                    FrameLayout frameLayout2 = c45702suy6.fetchVPNInfo;
                    Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
                    frameLayout2.setVisibility(8);
                    C45702suy c45702suy7 = this.binding;
                    if (c45702suy7 == null) {
                        Intrinsics.gEmmrt("");
                        c45702suy7 = null;
                    }
                    LinearLayout linearLayout3 = c45702suy7.gEmmrt;
                    Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                    linearLayout3.setVisibility(0);
                    C45702suy c45702suy8 = this.binding;
                    if (c45702suy8 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c45702suy = c45702suy8;
                    }
                    LinearLayout linearLayout4 = c45702suy.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
                    linearLayout4.setVisibility(8);
                    Function2<LcaLivenessCheckResult, Function0<Unit>, Unit> livenessResultCallback = LcaSdkManager.Companion.getInstance().getLivenessResultCallback();
                    if (livenessResultCallback != null) {
                        FaceCaptchaManager faceCaptchaManager = getViewModel().getFaceCaptchaManager();
                        if (faceCaptchaManager == null || (strM6783getDetectionInfo = faceCaptchaManager.m6783getDetectionInfo()) == null) {
                            strM6783getDetectionInfo = "";
                        }
                        FaceCaptchaManager faceCaptchaManager2 = getViewModel().getFaceCaptchaManager();
                        int splashCount = faceCaptchaManager2 != null ? faceCaptchaManager2.getSplashCount() : 0;
                        FaceCaptchaManager faceCaptchaManager3 = getViewModel().getFaceCaptchaManager();
                        livenessResultCallback.invoke(new LcaLivenessCheckOnFinalCheckView("", strM6783getDetectionInfo, splashCount, faceCaptchaManager3 != null ? faceCaptchaManager3.getSplashInterruptCount() : 0), this.onLcaRelease);
                        return;
                    }
                    return;
                }
                C45702suy c45702suy9 = this.binding;
                if (c45702suy9 == null) {
                    Intrinsics.gEmmrt("");
                    c45702suy9 = null;
                }
                FrameLayout frameLayout3 = c45702suy9.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
                frameLayout3.setVisibility(8);
                C45702suy c45702suy10 = this.binding;
                if (c45702suy10 == null) {
                    Intrinsics.gEmmrt("");
                    c45702suy10 = null;
                }
                LinearLayout linearLayout5 = c45702suy10.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(linearLayout5, "");
                linearLayout5.setVisibility(8);
                C45702suy c45702suy11 = this.binding;
                if (c45702suy11 == null) {
                    Intrinsics.gEmmrt("");
                    c45702suy11 = null;
                }
                LinearLayout linearLayout6 = c45702suy11.djBIcL;
                Intrinsics.checkNotNullExpressionValue(linearLayout6, "");
                linearLayout6.setVisibility(8);
                C45702suy c45702suy12 = this.binding;
                if (c45702suy12 == null) {
                    Intrinsics.gEmmrt("");
                    c45702suy12 = null;
                }
                c45702suy12.EZpvd.updateCloseFaceOval(getViewModel().getFaceCaptchaManager());
                C45702suy c45702suy13 = this.binding;
                if (c45702suy13 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c45702suy = c45702suy13;
                }
                c45702suy.OLrzqt.setOvalClipBounds(getViewModel().getFaceCaptchaManager());
                Function2<LcaLivenessCheckResult, Function0<Unit>, Unit> livenessResultCallback2 = LcaSdkManager.Companion.getInstance().getLivenessResultCallback();
                if (livenessResultCallback2 != null) {
                    FaceCaptchaManager faceCaptchaManager4 = getViewModel().getFaceCaptchaManager();
                    if (faceCaptchaManager4 == null || (strM6783getDetectionInfo2 = faceCaptchaManager4.m6783getDetectionInfo()) == null) {
                        strM6783getDetectionInfo2 = "";
                    }
                    FaceCaptchaManager faceCaptchaManager5 = getViewModel().getFaceCaptchaManager();
                    int splashCount2 = faceCaptchaManager5 != null ? faceCaptchaManager5.getSplashCount() : 0;
                    FaceCaptchaManager faceCaptchaManager6 = getViewModel().getFaceCaptchaManager();
                    livenessResultCallback2.invoke(new LcaLivenessCheckOnCloseSelfieView("", strM6783getDetectionInfo2, splashCount2, faceCaptchaManager6 != null ? faceCaptchaManager6.getSplashInterruptCount() : 0), this.onLcaRelease);
                    return;
                }
                return;
            }
            C45702suy c45702suy14 = this.binding;
            if (c45702suy14 == null) {
                Intrinsics.gEmmrt("");
                c45702suy14 = null;
            }
            FrameLayout frameLayout4 = c45702suy14.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(frameLayout4, "");
            frameLayout4.setVisibility(8);
            C45702suy c45702suy15 = this.binding;
            if (c45702suy15 == null) {
                Intrinsics.gEmmrt("");
                c45702suy15 = null;
            }
            LinearLayout linearLayout7 = c45702suy15.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(linearLayout7, "");
            linearLayout7.setVisibility(8);
            C45702suy c45702suy16 = this.binding;
            if (c45702suy16 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45702suy = c45702suy16;
            }
            LinearLayout linearLayout8 = c45702suy.djBIcL;
            Intrinsics.checkNotNullExpressionValue(linearLayout8, "");
            linearLayout8.setVisibility(8);
            TimerManager timerManager = this.timerManager;
            if (timerManager != null) {
                timerManager.startTimer(TimeoutType.LIVENESS_TIMEOUT_TYPE);
            }
            Function2<LcaLivenessCheckResult, Function0<Unit>, Unit> livenessResultCallback3 = LcaSdkManager.Companion.getInstance().getLivenessResultCallback();
            if (livenessResultCallback3 != null) {
                livenessResultCallback3.invoke(new LcaLivenessCheckOnFarSelfieView(""), this.onLcaRelease);
                return;
            }
            return;
        }
        C45702suy c45702suy17 = this.binding;
        if (c45702suy17 == null) {
            Intrinsics.gEmmrt("");
            c45702suy17 = null;
        }
        FrameLayout frameLayout5 = c45702suy17.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(frameLayout5, "");
        frameLayout5.setVisibility(0);
        C45702suy c45702suy18 = this.binding;
        if (c45702suy18 == null) {
            Intrinsics.gEmmrt("");
            c45702suy18 = null;
        }
        LinearLayout linearLayout9 = c45702suy18.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayout9, "");
        linearLayout9.setVisibility(8);
        C45702suy c45702suy19 = this.binding;
        if (c45702suy19 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c45702suy = c45702suy19;
        }
        LinearLayout linearLayout10 = c45702suy.djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayout10, "");
        linearLayout10.setVisibility(8);
        Function2<LcaLivenessCheckResult, Function0<Unit>, Unit> livenessResultCallback4 = LcaSdkManager.Companion.getInstance().getLivenessResultCallback();
        if (livenessResultCallback4 != null) {
            livenessResultCallback4.invoke(new LcaLivenessCheckOnStartingUpView(""), this.onLcaRelease);
        }
    }

    public static final void updateUIForState$lambda$8(LcaLivenessScanActivity lcaLivenessScanActivity, View view) {
        lcaLivenessScanActivity.restartLivenessByReloadPage(LcaSdkConfiguration.Companion.getRETRY_REASON_HTTP_ERROR(), null);
    }

    public final void handleProcessState(LivenessProcessState livenessProcessState) {
        String strM6783getDetectionInfo;
        String strM6783getDetectionInfo2;
        String strM6783getDetectionInfo3;
        if (livenessProcessState instanceof LivenessProcessState.VideoRecordingStarted) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - video recording started");
            CameraManager cameraManager = this.cameraManager;
            if (cameraManager != null) {
                cameraManager.startVideoRecording();
                return;
            }
            return;
        }
        if (livenessProcessState instanceof LivenessProcessState.FaceDistanceCheckStarted) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - face distance check started");
            CameraManager cameraManager2 = this.cameraManager;
            if (cameraManager2 != null) {
                cameraManager2.onActionChange(((LivenessProcessState.FaceDistanceCheckStarted) livenessProcessState).getTimestamp());
                return;
            }
            return;
        }
        if (livenessProcessState instanceof LivenessProcessState.FaceDistanceCheckEnded) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - face distance check ended");
            CameraManager cameraManager3 = this.cameraManager;
            if (cameraManager3 != null) {
                cameraManager3.onActionChange(((LivenessProcessState.FaceDistanceCheckEnded) livenessProcessState).getTimestamp());
                return;
            }
            return;
        }
        if (livenessProcessState instanceof LivenessProcessState.FaceStateChanged) {
            LivenessProcessState.FaceStateChanged faceStateChanged = (LivenessProcessState.FaceStateChanged) livenessProcessState;
            updateFaceStateUI(faceStateChanged.getFace(), faceStateChanged.getDistancePercentage());
            return;
        }
        String str = "";
        if (livenessProcessState instanceof LivenessProcessState.FarFaceOvalMatched) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - far face oval matched");
            VibratorUtils vibratorUtils = VibratorUtils.INSTANCE;
            Context baseContext = getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "");
            VibratorUtils.vibrateOnce$default(vibratorUtils, baseContext, 0L, 2, null);
            return;
        }
        if (Intrinsics.EZpvd(livenessProcessState, LivenessProcessState.FarFaceOvalAborted.INSTANCE)) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - far face oval aborted");
            return;
        }
        if (Intrinsics.EZpvd(livenessProcessState, LivenessProcessState.CloseFaceOvalMatched.INSTANCE)) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - close face oval matched");
            VibratorUtils vibratorUtils2 = VibratorUtils.INSTANCE;
            Context baseContext2 = getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext2, "");
            VibratorUtils.vibrateOnce$default(vibratorUtils2, baseContext2, 0L, 2, null);
            getViewModel().startColorChallenge();
            return;
        }
        if (Intrinsics.EZpvd(livenessProcessState, LivenessProcessState.FreshnessFirstTriggered.INSTANCE)) {
            initTimer(TimeoutType.FLASH_TIMEOUT_TYPE);
            getViewModel().sendSplashColorTimeoutEvent();
            pUU.KWHzl("kyc_in_house", "LCA liveness - freshness first triggered");
            Function2<LcaLivenessCheckResult, Function0<Unit>, Unit> livenessResultCallback = LcaSdkManager.Companion.getInstance().getLivenessResultCallback();
            if (livenessResultCallback != null) {
                FaceCaptchaManager faceCaptchaManager = getViewModel().getFaceCaptchaManager();
                if (faceCaptchaManager == null || (strM6783getDetectionInfo3 = faceCaptchaManager.m6783getDetectionInfo()) == null) {
                    strM6783getDetectionInfo3 = "";
                }
                livenessResultCallback.invoke(new LcaLivenessCheckOnFirstFreshnessView("", strM6783getDetectionInfo3), this.onLcaRelease);
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd(livenessProcessState, LivenessProcessState.CloseFaceOvalAborted.INSTANCE)) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - close face oval aborted");
            getViewModel().cancelColorChallenge();
            return;
        }
        if (livenessProcessState instanceof LivenessProcessState.FaceOvalInitialized) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - face oval initialized");
            C45702suy c45702suy = this.binding;
            C45702suy c45702suy2 = null;
            if (c45702suy == null) {
                Intrinsics.gEmmrt("");
                c45702suy = null;
            }
            c45702suy.EZpvd.reset();
            C45702suy c45702suy3 = this.binding;
            if (c45702suy3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45702suy2 = c45702suy3;
            }
            c45702suy2.EZpvd.updateFarFaceOval(getViewModel().getFaceCaptchaManager());
            return;
        }
        if (livenessProcessState instanceof LivenessProcessState.ColorChallengeStart) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - color challenge started");
            CameraManager cameraManager4 = this.cameraManager;
            if (cameraManager4 != null) {
                cameraManager4.startColorChallenge();
                return;
            }
            return;
        }
        if (livenessProcessState instanceof LivenessProcessState.ColorChanged) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - color changed");
            CameraManager cameraManager5 = this.cameraManager;
            if (cameraManager5 != null) {
                cameraManager5.onActionChange(((LivenessProcessState.ColorChanged) livenessProcessState).getTimestamp());
                return;
            }
            return;
        }
        if (livenessProcessState instanceof LivenessProcessState.ColorChallengeComplete) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - color challenge completed");
            return;
        }
        if (livenessProcessState instanceof LivenessProcessState.ColorChallengeCancelled) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - color challenge cancelled");
            CameraManager cameraManager6 = this.cameraManager;
            if (cameraManager6 != null) {
                cameraManager6.stopColorChallenge();
                return;
            }
            return;
        }
        if (livenessProcessState instanceof LivenessProcessState.Success) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - liveness check success");
            Function2<LcaLivenessCheckResult, Function0<Unit>, Unit> livenessResultCallback2 = LcaSdkManager.Companion.getInstance().getLivenessResultCallback();
            if (livenessResultCallback2 != null) {
                LivenessResponse response = ((LivenessProcessState.Success) livenessProcessState).getResponse();
                FaceCaptchaManager faceCaptchaManager2 = getViewModel().getFaceCaptchaManager();
                if (faceCaptchaManager2 != null && (strM6783getDetectionInfo2 = faceCaptchaManager2.m6783getDetectionInfo()) != null) {
                    str = strM6783getDetectionInfo2;
                }
                FaceCaptchaManager faceCaptchaManager3 = getViewModel().getFaceCaptchaManager();
                int splashCount = faceCaptchaManager3 != null ? faceCaptchaManager3.getSplashCount() : 0;
                FaceCaptchaManager faceCaptchaManager4 = getViewModel().getFaceCaptchaManager();
                livenessResultCallback2.invoke(new LcaLivenessCheckSuccess(response, str, splashCount, faceCaptchaManager4 != null ? faceCaptchaManager4.getSplashInterruptCount() : 0), this.onLcaRelease);
                return;
            }
            return;
        }
        if (livenessProcessState instanceof LivenessProcessState.VideoSegmentReady) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - video segment ready");
            return;
        }
        if (livenessProcessState instanceof LivenessProcessState.DescriptiveDataReady) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - descriptive data ready");
            return;
        }
        if (Intrinsics.EZpvd(livenessProcessState, LivenessProcessState.ConfigurationReady.INSTANCE)) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - configuration data ready");
            initTimer(TimeoutType.LIVENESS_TIMEOUT_TYPE);
            EZpvd();
            return;
        }
        if (Intrinsics.EZpvd(livenessProcessState, LivenessProcessState.ColorFreshnessStarted.INSTANCE)) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - color challenge started");
            CameraManager cameraManager7 = this.cameraManager;
            if (cameraManager7 != null) {
                cameraManager7.startColorFreshness();
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd(livenessProcessState, LivenessProcessState.ColorFreshnessCompleted.INSTANCE)) {
            pUU.KWHzl("kyc_in_house", "LCA liveness - color freshness completed");
            CameraManager cameraManager8 = this.cameraManager;
            if (cameraManager8 != null) {
                cameraManager8.stopColorFreshness(true);
                return;
            }
            return;
        }
        if (!(livenessProcessState instanceof LivenessProcessState.SocketConnected)) {
            throw new NoWhenBranchMatchedException();
        }
        Function2<LcaLivenessCheckResult, Function0<Unit>, Unit> livenessResultCallback3 = LcaSdkManager.Companion.getInstance().getLivenessResultCallback();
        if (livenessResultCallback3 != null) {
            FaceCaptchaManager faceCaptchaManager5 = getViewModel().getFaceCaptchaManager();
            if (faceCaptchaManager5 != null && (strM6783getDetectionInfo = faceCaptchaManager5.m6783getDetectionInfo()) != null) {
                str = strM6783getDetectionInfo;
            }
            livenessResultCallback3.invoke(new LcaLivenessCheckOnSocketConnected(str, ((LivenessProcessState.SocketConnected) livenessProcessState).getDuration()), this.onLcaRelease);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateFaceStateUI(FaceCheckState faceCheckState, Float f) {
        if (faceCheckState.getInstructionId() != null) {
            C45702suy c45702suy = this.binding;
            C45702suy c45702suy2 = null;
            if (c45702suy == null) {
                Intrinsics.gEmmrt("");
                c45702suy = null;
            }
            c45702suy.ejfBZ.setText(getString(faceCheckState.getInstructionId().intValue()));
            LcaSdkManager.Companion companion = LcaSdkManager.Companion;
            if (companion.getInstance().getConfiguration().getDebugMode()) {
                pUU.EZpvd("updateFaceStateUI", "face=" + faceCheckState);
            }
            if (faceCheckState instanceof FaceCheckState.Running) {
                int faceOvalGuideAnimation = companion.getInstance().getConfiguration().getFaceOvalGuideAnimation();
                LcaSdkConfiguration.Companion companion2 = LcaSdkConfiguration.Companion;
                if (faceOvalGuideAnimation == companion2.getFACE_OVAL_ANIMATION_A()) {
                    Integer instructionId = faceCheckState.getInstructionId();
                    int instructionStringRes = FaceDetector.FaceOvalPosition.MATCHED.getInstructionStringRes();
                    if (instructionId != null && instructionId.intValue() == instructionStringRes) {
                        if (companion.getInstance().getConfiguration().getFaceOvalGuideAnimation() == companion2.getFACE_OVAL_ANIMATION_B()) {
                            C45702suy c45702suy3 = this.binding;
                            if (c45702suy3 == null) {
                                Intrinsics.gEmmrt("");
                                c45702suy3 = null;
                            }
                            LottieAnimationView lottieAnimationView = c45702suy3.AYXKKw;
                            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
                            lottieAnimationView.setVisibility(8);
                            C45702suy c45702suy4 = this.binding;
                            if (c45702suy4 == null) {
                                Intrinsics.gEmmrt("");
                                c45702suy4 = null;
                            }
                            ClippedOvalImageView clippedOvalImageView = c45702suy4.OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(clippedOvalImageView, "");
                            clippedOvalImageView.setVisibility(0);
                        } else {
                            C45702suy c45702suy5 = this.binding;
                            if (c45702suy5 == null) {
                                Intrinsics.gEmmrt("");
                                c45702suy5 = null;
                            }
                            LottieAnimationView lottieAnimationView2 = c45702suy5.AYXKKw;
                            Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
                            lottieAnimationView2.setVisibility(8);
                            C45702suy c45702suy6 = this.binding;
                            if (c45702suy6 == null) {
                                Intrinsics.gEmmrt("");
                                c45702suy6 = null;
                            }
                            ClippedOvalImageView clippedOvalImageView2 = c45702suy6.OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(clippedOvalImageView2, "");
                            clippedOvalImageView2.setVisibility(8);
                        }
                    } else {
                        C45702suy c45702suy7 = this.binding;
                        if (c45702suy7 == null) {
                            Intrinsics.gEmmrt("");
                            c45702suy7 = null;
                        }
                        LottieAnimationView lottieAnimationView3 = c45702suy7.AYXKKw;
                        Intrinsics.checkNotNullExpressionValue(lottieAnimationView3, "");
                        lottieAnimationView3.setVisibility(0);
                        C45702suy c45702suy8 = this.binding;
                        if (c45702suy8 == null) {
                            Intrinsics.gEmmrt("");
                            c45702suy8 = null;
                        }
                        ClippedOvalImageView clippedOvalImageView3 = c45702suy8.OLrzqt;
                        Intrinsics.checkNotNullExpressionValue(clippedOvalImageView3, "");
                        clippedOvalImageView3.setVisibility(8);
                    }
                }
            } else {
                C45702suy c45702suy9 = this.binding;
                if (c45702suy9 == null) {
                    Intrinsics.gEmmrt("");
                    c45702suy9 = null;
                }
                LottieAnimationView lottieAnimationView4 = c45702suy9.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView4, "");
                lottieAnimationView4.setVisibility(8);
                C45702suy c45702suy10 = this.binding;
                if (c45702suy10 == null) {
                    Intrinsics.gEmmrt("");
                    c45702suy10 = null;
                }
                ClippedOvalImageView clippedOvalImageView4 = c45702suy10.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(clippedOvalImageView4, "");
                clippedOvalImageView4.setVisibility(8);
            }
            int instructionColorType = faceCheckState.getInstructionColorType();
            if (instructionColorType == 0) {
                C45702suy c45702suy11 = this.binding;
                if (c45702suy11 == null) {
                    Intrinsics.gEmmrt("");
                    c45702suy11 = null;
                }
                c45702suy11.ejfBZ.setTextColor(getColor(C52761wXj.Activity.fjfviF));
            } else if (instructionColorType != 1) {
                C45702suy c45702suy12 = this.binding;
                if (c45702suy12 == null) {
                    Intrinsics.gEmmrt("");
                    c45702suy12 = null;
                }
                c45702suy12.ejfBZ.setTextColor(getColor(C52761wXj.Activity.fjfviF));
            } else {
                C45702suy c45702suy13 = this.binding;
                if (c45702suy13 == null) {
                    Intrinsics.gEmmrt("");
                    c45702suy13 = null;
                }
                c45702suy13.ejfBZ.setTextColor(getColor(C52761wXj.Activity.geLlBI));
            }
            C45702suy c45702suy14 = this.binding;
            if (c45702suy14 == null) {
                Intrinsics.gEmmrt("");
                c45702suy14 = null;
            }
            c45702suy14.EZpvd.setProgress((int) (100 * (f != null ? f.floatValue() : 0.0f)));
            int ovalColorType = faceCheckState.getOvalColorType();
            if (ovalColorType == 0) {
                C45702suy c45702suy15 = this.binding;
                if (c45702suy15 == null) {
                    Intrinsics.gEmmrt("");
                    c45702suy15 = null;
                }
                c45702suy15.EZpvd.setStrokeColor(getColor(C52761wXj.Activity.RzdrRQ));
                C45702suy c45702suy16 = this.binding;
                if (c45702suy16 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c45702suy2 = c45702suy16;
                }
                c45702suy2.EZpvd.setProgressColor(getColor(C52761wXj.Activity.geLlBI));
                return;
            }
            if (ovalColorType == 1) {
                C45702suy c45702suy17 = this.binding;
                if (c45702suy17 == null) {
                    Intrinsics.gEmmrt("");
                    c45702suy17 = null;
                }
                c45702suy17.EZpvd.setStrokeColor(getColor(C52761wXj.Activity.RzdrRQ));
                C45702suy c45702suy18 = this.binding;
                if (c45702suy18 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c45702suy2 = c45702suy18;
                }
                c45702suy2.EZpvd.setProgressColor(getColor(C52761wXj.Activity.geLlBI));
                return;
            }
            if (ovalColorType != 2) {
                C45702suy c45702suy19 = this.binding;
                if (c45702suy19 == null) {
                    Intrinsics.gEmmrt("");
                    c45702suy19 = null;
                }
                c45702suy19.EZpvd.setStrokeColor(getColor(C52761wXj.Activity.RzdrRQ));
                C45702suy c45702suy20 = this.binding;
                if (c45702suy20 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c45702suy2 = c45702suy20;
                }
                c45702suy2.EZpvd.setProgressColor(getColor(C52761wXj.Activity.geLlBI));
                return;
            }
            C45702suy c45702suy21 = this.binding;
            if (c45702suy21 == null) {
                Intrinsics.gEmmrt("");
                c45702suy21 = null;
            }
            c45702suy21.EZpvd.setStrokeColor(getColor(C52761wXj.Activity.gsvlRV));
            C45702suy c45702suy22 = this.binding;
            if (c45702suy22 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45702suy2 = c45702suy22;
            }
            c45702suy2.EZpvd.setProgressColor(getColor(C52761wXj.Activity.gsvlRV));
        }
    }

    public final void bindPermissionHandling() {
        this.lcaPermissionManager = new LcaPermissionManager(this, "android.permission.CAMERA", new Function0() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$$ExternalSyntheticLambda6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LcaLivenessScanActivity.bindPermissionHandling$lambda$9(this.f$0);
            }
        }, new Function0() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$$ExternalSyntheticLambda7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LcaLivenessScanActivity.bindPermissionHandling$lambda$10(this.f$0);
            }
        }, new Function0() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$$ExternalSyntheticLambda8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LcaLivenessScanActivity.bindPermissionHandling$lambda$11(this.f$0);
            }
        });
    }

    public static final Unit bindPermissionHandling$lambda$9(LcaLivenessScanActivity lcaLivenessScanActivity) {
        pUU.KWHzl("kyc_in_house", "LCA liveness - camera permission onReady");
        lcaLivenessScanActivity.AhwBna();
        return Unit.INSTANCE;
    }

    public static final Unit bindPermissionHandling$lambda$10(LcaLivenessScanActivity lcaLivenessScanActivity) {
        pUU.KWHzl("kyc_in_house", "LCA liveness - camera permission onGranted");
        lcaLivenessScanActivity.recreateActivity();
        return Unit.INSTANCE;
    }

    public static final Unit bindPermissionHandling$lambda$11(LcaLivenessScanActivity lcaLivenessScanActivity) {
        pUU.KWHzl("kyc_in_house", "LCA liveness - camera permission onDenied");
        lcaLivenessScanActivity.handleError(LcaSdkConfiguration.Companion.getRETRY_REASON_CAMERA_PERMISSION(), null);
        return Unit.INSTANCE;
    }

    private final void KWHzl() {
        pUU.KWHzl("kyc_in_house", "LCA liveness - init liveness");
        C45702suy c45702suy = this.binding;
        LcaPermissionManager lcaPermissionManager = null;
        if (c45702suy == null) {
            Intrinsics.gEmmrt("");
            c45702suy = null;
        }
        FrameLayout frameLayout = c45702suy.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(0);
        C45702suy c45702suy2 = this.binding;
        if (c45702suy2 == null) {
            Intrinsics.gEmmrt("");
            c45702suy2 = null;
        }
        LinearLayout linearLayout = c45702suy2.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        C45702suy c45702suy3 = this.binding;
        if (c45702suy3 == null) {
            Intrinsics.gEmmrt("");
            c45702suy3 = null;
        }
        LinearLayout linearLayout2 = c45702suy3.djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(8);
        getViewModel().initLiveness();
        LcaPermissionManager lcaPermissionManager2 = this.lcaPermissionManager;
        if (lcaPermissionManager2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            lcaPermissionManager = lcaPermissionManager2;
        }
        lcaPermissionManager.checkAndRequestPermission();
    }

    private final void AhwBna() {
        if (C33054mpH.copydefault((Activity) this)) {
            pUU.KWHzl(getTAG(), "LCA liveness - startLiveness return, activity destroyed");
            return;
        }
        BrightnessManager brightnessManager = this.brightnessManager;
        if (brightnessManager == null) {
            Intrinsics.gEmmrt("");
            brightnessManager = null;
        }
        brightnessManager.setMaxBrightness();
        getViewModel().startLiveness();
    }

    public final void initTimer(final TimeoutType timeoutType) {
        TimerManager timerManager = this.timerManager;
        if (timerManager != null) {
            timerManager.cancelTimer();
        }
        TimerManager timerManager2 = new TimerManager(getViewModel().getConfig(), new Function0() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$$ExternalSyntheticLambda5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LcaLivenessScanActivity.initTimer$lambda$12(this.f$0, timeoutType);
            }
        });
        this.timerManager = timerManager2;
        timerManager2.startTimer(timeoutType);
    }

    public static final Unit initTimer$lambda$12(LcaLivenessScanActivity lcaLivenessScanActivity, TimeoutType timeoutType) {
        lcaLivenessScanActivity.getViewModel().handleTimeout(timeoutType);
        return Unit.INSTANCE;
    }

    private final void EZpvd() {
        LcaSdkLivenessConfig config;
        LiveData<CameraState> cameraState;
        if (this.cameraManager == null && (config = getViewModel().getConfig()) != null) {
            FaceCaptchaManager faceCaptchaManager = getViewModel().getFaceCaptchaManager();
            Intrinsics.copydefault(faceCaptchaManager);
            CameraManager cameraManager = new CameraManager(this, faceCaptchaManager, config, new LcaLivenessScanActivity$initCamera$1$1(this));
            this.cameraManager = cameraManager;
            cameraManager.initCamera();
            CameraManager cameraManager2 = this.cameraManager;
            if (cameraManager2 != null) {
                cameraManager2.bindCamera();
            }
            CameraManager cameraManager3 = this.cameraManager;
            if (cameraManager3 == null || (cameraState = cameraManager3.getCameraState()) == null) {
                return;
            }
            cameraState.observe(this, new LcaLivenessScanActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LcaLivenessScanActivity.initCamera$lambda$15$lambda$14(this.f$0, (CameraState) obj);
                }
            }));
        }
    }

    public static final Unit initCamera$lambda$15$lambda$14(final LcaLivenessScanActivity lcaLivenessScanActivity, CameraState cameraState) {
        LcaSdkLivenessConfigCollectedVideoConfig collectedVideoConfig;
        LcaSdkLivenessConfigCollectedVideoConfig collectedVideoConfig2;
        if (cameraState.getType() == CameraState.Type.OPEN) {
            LcaSdkLivenessConfig config = lcaLivenessScanActivity.getViewModel().getConfig();
            C45702suy c45702suy = null;
            if (!lcaLivenessScanActivity.isNullOrZero((config == null || (collectedVideoConfig2 = config.getCollectedVideoConfig()) == null) ? null : collectedVideoConfig2.getResolutionWidth())) {
                LcaSdkLivenessConfig config2 = lcaLivenessScanActivity.getViewModel().getConfig();
                if (!lcaLivenessScanActivity.isNullOrZero((config2 == null || (collectedVideoConfig = config2.getCollectedVideoConfig()) == null) ? null : collectedVideoConfig.getResolutionHeight())) {
                    lcaLivenessScanActivity.getViewModel().setCameraReady(true);
                    LcaLivenessScanViewModel viewModel = lcaLivenessScanActivity.getViewModel();
                    C45702suy c45702suy2 = lcaLivenessScanActivity.binding;
                    if (c45702suy2 == null) {
                        Intrinsics.gEmmrt("");
                        c45702suy2 = null;
                    }
                    int width = c45702suy2.getRoot().getWidth();
                    C45702suy c45702suy3 = lcaLivenessScanActivity.binding;
                    if (c45702suy3 == null) {
                        Intrinsics.gEmmrt("");
                        c45702suy3 = null;
                    }
                    VideoViewportSize videoViewportSizeCalculateVideoViewportSize = viewModel.calculateVideoViewportSize(new Size(width, c45702suy3.getRoot().getHeight()), lcaLivenessScanActivity);
                    if (videoViewportSizeCalculateVideoViewportSize != null) {
                        lcaLivenessScanActivity.getViewModel().updateVideoViewportSize(videoViewportSizeCalculateVideoViewportSize);
                        C45702suy c45702suy4 = lcaLivenessScanActivity.binding;
                        if (c45702suy4 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            c45702suy = c45702suy4;
                        }
                        PreviewTextureView previewTextureView = c45702suy.values;
                        ViewGroup.LayoutParams layoutParams = previewTextureView.getLayoutParams();
                        Intrinsics.copydefault(layoutParams, "");
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        Size viewportPixelSize = videoViewportSizeCalculateVideoViewportSize.getViewportPixelSize();
                        layoutParams2.width = viewportPixelSize.getWidth();
                        layoutParams2.height = viewportPixelSize.getHeight();
                        layoutParams2.gravity = 17;
                        previewTextureView.setLayoutParams(layoutParams2);
                        CameraManager cameraManager = lcaLivenessScanActivity.cameraManager;
                        if (cameraManager != null) {
                            Intrinsics.copydefault(previewTextureView);
                            cameraManager.initPreview(previewTextureView);
                        }
                        previewTextureView.setOnPreviewDisplayedListener(new PreviewTextureView.OnPreviewDisplayedListener() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$initCamera$1$2$1$1
                            @Override // com.okinc.liveness.lca.components.PreviewTextureView.OnPreviewDisplayedListener
                            public void onPreviewDisplayed() {
                                if (C33054mpH.copydefault((Activity) this.this$0)) {
                                    return;
                                }
                                this.this$0.getViewModel().setPreviewReady(true);
                            }
                        });
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void djBIcL() {
        pUU.KWHzl("kyc_in_house", "LCA liveness - stopping liveness detection");
        TimerManager timerManager = this.timerManager;
        if (timerManager != null) {
            timerManager.cancelTimer();
        }
        C45702suy c45702suy = null;
        this.timerManager = null;
        BrightnessManager brightnessManager = this.brightnessManager;
        if (brightnessManager == null) {
            Intrinsics.gEmmrt("");
            brightnessManager = null;
        }
        brightnessManager.restoreOriginalBrightness();
        C45702suy c45702suy2 = this.binding;
        if (c45702suy2 == null) {
            Intrinsics.gEmmrt("");
            c45702suy2 = null;
        }
        c45702suy2.KWHzl.stop();
        CameraManager cameraManager = this.cameraManager;
        if (cameraManager != null) {
            cameraManager.releaseAsStop();
        }
        this.cameraManager = null;
        C45702suy c45702suy3 = this.binding;
        if (c45702suy3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c45702suy = c45702suy3;
        }
        c45702suy.values.cleanup();
        getViewModel().stopLiveness();
        try {
            System.gc();
        } catch (Exception e) {
            pUU.AEQbTJ(getTAG(), "Error during final cleanup", e);
        }
    }

    public final void finishLiveness() {
        ScoreData qcScoreResult;
        pUU.KWHzl("kyc_in_house", "LCA liveness - finish liveness");
        Function1<LcaDebugInfo, Unit> debugInfoCallback = LcaSdkManager.Companion.getInstance().getDebugInfoCallback();
        if (debugInfoCallback != null) {
            FaceCaptchaManager faceCaptchaManager = getViewModel().getFaceCaptchaManager();
            debugInfoCallback.invoke(new LcaDebugInfo(null, null, null, (faceCaptchaManager == null || (qcScoreResult = faceCaptchaManager.getQcScoreResult()) == null) ? null : qcScoreResult.toJson(), 7, null));
        }
        finish();
    }

    private final void copydefault() {
        String strM6783getDetectionInfo;
        finishLiveness();
        Function2<LcaLivenessCheckResult, Function0<Unit>, Unit> livenessResultCallback = LcaSdkManager.Companion.getInstance().getLivenessResultCallback();
        if (livenessResultCallback != null) {
            String currentProcessState = getViewModel().getCurrentProcessState();
            FaceCaptchaManager faceCaptchaManager = getViewModel().getFaceCaptchaManager();
            if (faceCaptchaManager == null || (strM6783getDetectionInfo = faceCaptchaManager.m6783getDetectionInfo()) == null) {
                strM6783getDetectionInfo = "";
            }
            FaceCaptchaManager faceCaptchaManager2 = getViewModel().getFaceCaptchaManager();
            int splashCount = faceCaptchaManager2 != null ? faceCaptchaManager2.getSplashCount() : 0;
            FaceCaptchaManager faceCaptchaManager3 = getViewModel().getFaceCaptchaManager();
            livenessResultCallback.invoke(new LcaLivenessCheckOnCancel(currentProcessState, strM6783getDetectionInfo, splashCount, faceCaptchaManager3 != null ? faceCaptchaManager3.getSplashInterruptCount() : 0), null);
        }
    }

    public final void recreateActivity() {
        if (!C33054mpH.copydefault((Activity) this)) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C17121(null), 3, null);
        } else {
            pUU.KWHzl(getTAG(), "recreateActivity() return, activity destroyed");
        }
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$recreateActivity$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17121(Continuation<? super C17121> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LcaLivenessScanActivity.this.new C17121(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                LcaLivenessScanActivity.this.dismissLoading();
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = LcaLivenessScanActivity.this.retryDialog;
                if (viewOnClickListenerC54939xaY != null) {
                    viewOnClickListenerC54939xaY.dismiss();
                }
                LcaLivenessScanActivity.this.getIntent().addFlags(65536);
                LcaLivenessScanActivity.this.finish();
                LcaLivenessScanActivity lcaLivenessScanActivity = LcaLivenessScanActivity.this;
                lcaLivenessScanActivity.startActivity(lcaLivenessScanActivity.getIntent());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void restartLivenessByRetryDialog(String str, Throwable th) {
        pUU.KWHzl("kyc_in_house", "LCA liveness - restart liveness triggered by retry dialog");
        showLoadingAtOnce();
        LcaSdkManager.Companion companion = LcaSdkManager.Companion;
        if (companion.getInstance().getConfiguration().getApiMode() != LcaSdkConfiguration.Companion.getAPI_COMPLIANCE()) {
            recreateActivity();
            return;
        }
        Function2<LcaLivenessCheckResult, Function0<Unit>, Unit> livenessResultCallback = companion.getInstance().getLivenessResultCallback();
        if (livenessResultCallback != null) {
            livenessResultCallback.invoke(new LcaLivenessCheckOnRestartDialogClicked(getViewModel().getCurrentProcessState(), str, th), this.onLcaRelease);
        }
    }

    public final void restartLivenessByReloadPage(String str, Throwable th) {
        pUU.KWHzl("kyc_in_house", "LCA liveness - restart liveness triggered by reload page");
        showLoadingAtOnce();
        LcaSdkManager.Companion companion = LcaSdkManager.Companion;
        if (companion.getInstance().getConfiguration().getApiMode() != LcaSdkConfiguration.Companion.getAPI_COMPLIANCE()) {
            recreateActivity();
            return;
        }
        Function2<LcaLivenessCheckResult, Function0<Unit>, Unit> livenessResultCallback = companion.getInstance().getLivenessResultCallback();
        if (livenessResultCallback != null) {
            livenessResultCallback.invoke(new LcaLivenessCheckOnReloadScreenClicked(getViewModel().getCurrentProcessState(), str, th), this.onLcaRelease);
        }
    }

    public static /* synthetic */ void displayRetry$default(LcaLivenessScanActivity lcaLivenessScanActivity, int i, int i2, String str, Throwable th, boolean z, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z = false;
        }
        lcaLivenessScanActivity.displayRetry(i, i2, str, th, z);
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$displayRetry$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $errorResId;
        final /* synthetic */ Throwable $exception;
        final /* synthetic */ boolean $override;
        final /* synthetic */ String $reason;
        final /* synthetic */ int $titleResId;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, int i2, String str, Throwable th, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$titleResId = i;
            this.$errorResId = i2;
            this.$reason = str;
            this.$exception = th;
            this.$override = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LcaLivenessScanActivity.this.new AnonymousClass1(this.$titleResId, this.$errorResId, this.$reason, this.$exception, this.$override, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strM6783getDetectionInfo;
            String strM6783getDetectionInfo2;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!C33054mpH.copydefault((Activity) LcaLivenessScanActivity.this)) {
                    C45702suy c45702suy = LcaLivenessScanActivity.this.binding;
                    C45702suy c45702suy2 = null;
                    if (c45702suy == null) {
                        Intrinsics.gEmmrt("");
                        c45702suy = null;
                    }
                    LinearLayout linearLayout = c45702suy.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                    if (linearLayout.getVisibility() != 0) {
                        C45702suy c45702suy3 = LcaLivenessScanActivity.this.binding;
                        if (c45702suy3 == null) {
                            Intrinsics.gEmmrt("");
                            c45702suy3 = null;
                        }
                        FrameLayout frameLayout = c45702suy3.fetchVPNInfo;
                        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                        if (frameLayout.getVisibility() != 0) {
                            C45702suy c45702suy4 = LcaLivenessScanActivity.this.binding;
                            if (c45702suy4 == null) {
                                Intrinsics.gEmmrt("");
                                c45702suy4 = null;
                            }
                            LinearLayout linearLayout2 = c45702suy4.gEmmrt;
                            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                            if (linearLayout2.getVisibility() == 0) {
                                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = LcaLivenessScanActivity.this.retryDialog;
                                if (viewOnClickListenerC54939xaY != null) {
                                    viewOnClickListenerC54939xaY.dismiss();
                                }
                                C45702suy c45702suy5 = LcaLivenessScanActivity.this.binding;
                                if (c45702suy5 == null) {
                                    Intrinsics.gEmmrt("");
                                    c45702suy5 = null;
                                }
                                LinearLayout linearLayout3 = c45702suy5.djBIcL;
                                Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                                linearLayout3.setVisibility(0);
                                pUU.KWHzl("kyc_in_house", "LCA liveness - Display retry full screen, reason is: " + LcaLivenessScanActivity.this.getString(this.$titleResId) + ", message: " + LcaLivenessScanActivity.this.getString(this.$errorResId));
                                Function2<LcaLivenessCheckResult, Function0<Unit>, Unit> livenessResultCallback = LcaSdkManager.Companion.getInstance().getLivenessResultCallback();
                                if (livenessResultCallback != null) {
                                    String currentProcessState = LcaLivenessScanActivity.this.getViewModel().getCurrentProcessState();
                                    String str = this.$reason;
                                    Throwable th = this.$exception;
                                    FaceCaptchaManager faceCaptchaManager = LcaLivenessScanActivity.this.getViewModel().getFaceCaptchaManager();
                                    String str2 = (faceCaptchaManager == null || (strM6783getDetectionInfo = faceCaptchaManager.m6783getDetectionInfo()) == null) ? "" : strM6783getDetectionInfo;
                                    FaceCaptchaManager faceCaptchaManager2 = LcaLivenessScanActivity.this.getViewModel().getFaceCaptchaManager();
                                    int splashCount = faceCaptchaManager2 != null ? faceCaptchaManager2.getSplashCount() : 0;
                                    FaceCaptchaManager faceCaptchaManager3 = LcaLivenessScanActivity.this.getViewModel().getFaceCaptchaManager();
                                    livenessResultCallback.invoke(new LcaLivenessCheckOnReloadScreenView(currentProcessState, str, th, str2, splashCount, faceCaptchaManager3 != null ? faceCaptchaManager3.getSplashInterruptCount() : 0), LcaLivenessScanActivity.this.onLcaRelease);
                                }
                                LcaLivenessScanActivity.this.djBIcL();
                                C45702suy c45702suy6 = LcaLivenessScanActivity.this.binding;
                                if (c45702suy6 == null) {
                                    Intrinsics.gEmmrt("");
                                } else {
                                    c45702suy2 = c45702suy6;
                                }
                                C52794wYp c52794wYp = c45702suy2.AEQbTJ;
                                final LcaLivenessScanActivity lcaLivenessScanActivity = LcaLivenessScanActivity.this;
                                final String str3 = this.$reason;
                                final Throwable th2 = this.$exception;
                                c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$displayRetry$1$$ExternalSyntheticLambda0
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        LcaLivenessScanActivity.access$restartLivenessByReloadPage(lcaLivenessScanActivity, str3, th2);
                                    }
                                });
                            } else {
                                try {
                                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = LcaLivenessScanActivity.this.retryDialog;
                                    if (viewOnClickListenerC54939xaY2 != null && viewOnClickListenerC54939xaY2.isShowing()) {
                                        if (this.$override) {
                                            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY3 = LcaLivenessScanActivity.this.retryDialog;
                                            if (viewOnClickListenerC54939xaY3 != null) {
                                                viewOnClickListenerC54939xaY3.dismiss();
                                            }
                                        } else {
                                            pUU.KWHzl(LcaLivenessScanActivity.this.getTAG(), "LCA liveness - Retry dialog is already showing, skip duplicate dialog");
                                            return Unit.INSTANCE;
                                        }
                                    }
                                    pUU.KWHzl("kyc_in_house", "LCA liveness - Display retry dialog, reason is: " + LcaLivenessScanActivity.this.getString(this.$titleResId) + ", message: " + LcaLivenessScanActivity.this.getString(this.$errorResId));
                                    Function2<LcaLivenessCheckResult, Function0<Unit>, Unit> livenessResultCallback2 = LcaSdkManager.Companion.getInstance().getLivenessResultCallback();
                                    if (livenessResultCallback2 != null) {
                                        String currentProcessState2 = LcaLivenessScanActivity.this.getViewModel().getCurrentProcessState();
                                        String str4 = this.$reason;
                                        Throwable th3 = this.$exception;
                                        FaceCaptchaManager faceCaptchaManager4 = LcaLivenessScanActivity.this.getViewModel().getFaceCaptchaManager();
                                        String str5 = (faceCaptchaManager4 == null || (strM6783getDetectionInfo2 = faceCaptchaManager4.m6783getDetectionInfo()) == null) ? "" : strM6783getDetectionInfo2;
                                        FaceCaptchaManager faceCaptchaManager5 = LcaLivenessScanActivity.this.getViewModel().getFaceCaptchaManager();
                                        int splashCount2 = faceCaptchaManager5 != null ? faceCaptchaManager5.getSplashCount() : 0;
                                        FaceCaptchaManager faceCaptchaManager6 = LcaLivenessScanActivity.this.getViewModel().getFaceCaptchaManager();
                                        livenessResultCallback2.invoke(new LcaLivenessCheckOnRetryDialogPop(currentProcessState2, str4, th3, str5, splashCount2, faceCaptchaManager6 != null ? faceCaptchaManager6.getSplashInterruptCount() : 0), LcaLivenessScanActivity.this.onLcaRelease);
                                    }
                                    LcaLivenessScanActivity.this.djBIcL();
                                    LcaLivenessScanActivity lcaLivenessScanActivity2 = LcaLivenessScanActivity.this;
                                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY4 = new ViewOnClickListenerC54939xaY(LcaLivenessScanActivity.this);
                                    int i = this.$titleResId;
                                    int i2 = this.$errorResId;
                                    final LcaLivenessScanActivity lcaLivenessScanActivity3 = LcaLivenessScanActivity.this;
                                    final String str6 = this.$reason;
                                    final Throwable th4 = this.$exception;
                                    viewOnClickListenerC54939xaY4.setTitle(i);
                                    viewOnClickListenerC54939xaY4.copydefault(i2);
                                    viewOnClickListenerC54939xaY4.EZpvd(C45697sut.Application.OLrzqt, new View.OnClickListener() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$displayRetry$1$$ExternalSyntheticLambda1
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            LcaLivenessScanActivity.access$restartLivenessByRetryDialog(lcaLivenessScanActivity3, str6, th4);
                                        }
                                    });
                                    viewOnClickListenerC54939xaY4.setCancelable(false);
                                    if (!lcaLivenessScanActivity3.isFinishing() && !lcaLivenessScanActivity3.isDestroyed()) {
                                        viewOnClickListenerC54939xaY4.show();
                                    }
                                    lcaLivenessScanActivity2.retryDialog = viewOnClickListenerC54939xaY4;
                                } catch (Exception e) {
                                    pUU.OLrzqt(LcaLivenessScanActivity.this.getTAG(), "LCA liveness - Error showing retry dialog", e);
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    pUU.KWHzl(LcaLivenessScanActivity.this.getTAG(), "LCA liveness - Retry screen is already showing, skip duplicate screen");
                    return Unit.INSTANCE;
                }
                pUU.KWHzl(LcaLivenessScanActivity.this.getTAG(), "LCA liveness - Activity is finishing or destroyed, skip showing dialog");
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void displayRetry(int i, int i2, String str, Throwable th, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(i, i2, str, th, z, null), 3, null);
    }

    public final void handleError(String str, Throwable th) {
        pUU.valueOf("kyc_in_house", "LCA liveness - handle error: reason=" + str + ", exception=" + th);
        if (C33054mpH.copydefault((Activity) this)) {
            pUU.KWHzl(getTAG(), "LCA liveness - handleError return, activity destroyed");
        } else {
            displayRetry$default(this, C45697sut.Application.AEQbTJ, C45697sut.Application.KWHzl, str, th, false, 16, null);
        }
    }

    public final boolean isNullOrZero(Integer num) {
        return num == null || num.intValue() == 0;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
