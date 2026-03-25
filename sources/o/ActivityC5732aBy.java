package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.api.facerecognition.FacialRecognitionResponse;
import com.okinc.auth.impl.facerecognition.ui.FaceRecognitionActivity$observeFaceVerify$1;
import com.okinc.auth.impl.facerecognition.ui.FaceRecognitionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;
import pub.devrel.easypermissions.AppSettingsDialog;

/* JADX INFO: renamed from: o.aBy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC5732aBy extends AbstractActivityC5690aBI {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final ActivityResultLauncher<android.content.Intent> KWHzl;

    public ActivityC5732aBy() {
        final Function0 function0 = null;
        this.AEQbTJ = new ViewModelLazy(C56524yIo.AEQbTJ(FaceRecognitionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.facerecognition.ui.FaceRecognitionActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.facerecognition.ui.FaceRecognitionActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.facerecognition.ui.FaceRecognitionActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.aBC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC5732aBy.AEQbTJ(this.KWHzl, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.KWHzl = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.aBy$StateListAnimator */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aBy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Possible override for method o.aBI.AEQbTJ()V */
    public final FaceRecognitionViewModel AEQbTJ() {
        return (FaceRecognitionViewModel) this.AEQbTJ.getValue();
    }

    public static final void AEQbTJ(ActivityC5732aBy activityC5732aBy, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "");
        int resultCode = activityResult.getResultCode();
        if (resultCode == -1) {
            pUU.KWHzl("Face Verify Result", "Result OK");
            activityC5732aBy.AEQbTJ().copydefault();
        } else {
            if (resultCode != 0) {
                return;
            }
            pUU.KWHzl("Face Verify Result", "Result Canceled");
            activityC5732aBy.KWHzl(FacialRecognitionResponse.Cancel.OLrzqt);
        }
    }

    @Override // o.AbstractActivityC5690aBI, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C8206ayP.Application.OLrzqt);
        KWHzl();
        valueOf();
        AEQbTJ().OLrzqt();
    }

    private final void valueOf() {
        AEQbTJ().EZpvd().observe(this, new C32991mny(new Function1() { // from class: o.aBB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC5732aBy.OLrzqt(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
    }

    public static final Unit OLrzqt(ActivityC5732aBy activityC5732aBy, boolean z) {
        if (z) {
            activityC5732aBy.showLoadingAtOnce();
        } else {
            activityC5732aBy.releaseLoading();
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        SharedFlow<AbstractC5688aBG> sharedFlowKWHzl = AEQbTJ().KWHzl();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(sharedFlowKWHzl, lifecycle, null, 2, null), new FaceRecognitionActivity$observeFaceVerify$1(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    @Override // o.AbstractActivityC33041mov, o.C60121zwJ.Activity
    public void onPermissionsGranted(int i, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        super.onPermissionsGranted(i, list);
        if (i == 3) {
            AEQbTJ().OLrzqt();
        }
    }

    @Override // o.AbstractActivityC33041mov, o.C60121zwJ.Activity
    public void onPermissionsDenied(int i, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        super.onPermissionsDenied(i, list);
        if (i == 3) {
            if (C60121zwJ.copydefault(this, list)) {
                new AppSettingsDialog.ActionBar(this).AEQbTJ().AEQbTJ();
            } else {
                KWHzl(FacialRecognitionResponse.PermissionDenied.AEQbTJ);
            }
        }
        pUU.copydefault("Account Grant Camera Permissions Denied");
    }

    public final void KWHzl(FacialRecognitionResponse facialRecognitionResponse) {
        pUU.KWHzl("FacialRecognitionActivity", "Face Verify Finish: " + facialRecognitionResponse);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_RESPONSE", facialRecognitionResponse);
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }

    @Override // o.AbstractActivityC5690aBI, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC5690aBI, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC5690aBI, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC5690aBI, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
