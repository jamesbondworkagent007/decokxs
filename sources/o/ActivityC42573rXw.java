package o;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.os.BundleKt;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.okcomponents.feature.okcallkit_api.VoiceCallSetupActivity$dispatchResult$1;
import com.okinc.okcomponents.feature.okcallkit_api.VoiceCallSetupViewModel;
import com.okinc.rxutils.RxBus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC42573rXw;
import o.C42568rXr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rXw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC42573rXw extends AbstractActivityC33041mov {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public static final java.lang.String[] OLrzqt = {"android.permission.RECORD_AUDIO"};
    public final InterfaceC56387yDm KWHzl;
    public final ActivityResultLauncher<android.content.Intent> copydefault;

    /* JADX INFO: renamed from: o.rXw$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[VoiceCallSetupViewModel.Action.values().length];
            try {
                iArr[VoiceCallSetupViewModel.Action.Complete.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[VoiceCallSetupViewModel.Action.TerminateWithFailedToGetPermission.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[VoiceCallSetupViewModel.Action.TerminateWithFailedToDownloadCallkit.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[VoiceCallSetupViewModel.Action.SetupCallKit.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[VoiceCallSetupViewModel.Action.SetupPermission.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            OLrzqt = iArr;
        }
    }

    public ActivityC42573rXw() {
        final Function0 function0 = null;
        this.KWHzl = new ViewModelLazy(C56524yIo.AEQbTJ(VoiceCallSetupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okcomponents.feature.okcallkit_api.VoiceCallSetupActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: o.rXA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC42573rXw.OLrzqt(this.copydefault);
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.okcomponents.feature.okcallkit_api.VoiceCallSetupActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.rXx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC42573rXw.copydefault(this.AEQbTJ, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.copydefault = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.rXw$Activity */
    public static final class Activity implements RxBus.Application {
        public final int AEQbTJ;
        public final android.os.Bundle KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, android.os.Bundle bundle, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = activity.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                bundle = activity.KWHzl;
            }
            return activity.KWHzl(i, bundle);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.os.Bundle KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(int i, @NotNull android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "");
            return new Activity(i, bundle);
        }

        @Override // com.okinc.rxutils.RxBus.Application
        public boolean check(java.lang.String str) {
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.AEQbTJ == activity.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.AEQbTJ) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ResultEvent(resultCode=" + this.AEQbTJ + ", extras=" + this.KWHzl + ")";
        }

        public Activity(int i, @NotNull android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "");
            this.AEQbTJ = i;
            this.KWHzl = bundle;
        }
    }

    /* JADX INFO: renamed from: o.rXw$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rXw.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC42573rXw.class);
        }
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        AYXKKw();
    }

    private final void KWHzl(int i) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new VoiceCallSetupActivity$dispatchResult$1(this, i, null), 3, null);
    }

    private final void AYXKKw() {
        overridePendingTransition(0, 0);
    }

    private final void AhwBna() {
        KWHzl(1);
    }

    public final void KWHzl() {
        KWHzl(2);
    }

    public final void copydefault() {
        KWHzl(3);
    }

    /* JADX INFO: renamed from: o.rXw$TaskDescription */
    public static final class TaskDescription extends AbstractSavedStateViewModelFactory {
        public TaskDescription(ActivityC42573rXw activityC42573rXw, android.os.Bundle bundle) {
            super(activityC42573rXw, bundle);
        }

        @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
        public <T extends ViewModel> T create(java.lang.String str, java.lang.Class<T> cls, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(cls, "");
            Intrinsics.checkNotNullParameter(savedStateHandle, "");
            return new VoiceCallSetupViewModel(savedStateHandle);
        }
    }

    public final VoiceCallSetupViewModel OLrzqt() {
        return (VoiceCallSetupViewModel) this.KWHzl.getValue();
    }

    public static final ViewModelProvider.Factory OLrzqt(ActivityC42573rXw activityC42573rXw) {
        return new TaskDescription(activityC42573rXw, BundleKt.bundleOf());
    }

    public static final void copydefault(final ActivityC42573rXw activityC42573rXw, ActivityResult activityResult) {
        final int resultCode = activityResult.getResultCode();
        final android.content.Intent data = activityResult.getData();
        C42567rXq.EZpvd("onActivityResult", new Function1() { // from class: o.rXy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC42573rXw.KWHzl(this.EZpvd, resultCode, data, (C42565rXo) obj);
            }
        });
        activityC42573rXw.OLrzqt().copydefault(C43251rlk.OLrzqt(InterfaceC42569rXs.class) != null);
    }

    public static final Unit KWHzl(ActivityC42573rXw activityC42573rXw, int i, android.content.Intent intent, C42565rXo c42565rXo) {
        Intrinsics.checkNotNullParameter(c42565rXo, "");
        c42565rXo.copydefault(activityC42573rXw.getTAG(), "callKitDownloaderLauncher");
        c42565rXo.copydefault("receiving activity result");
        c42565rXo.OLrzqt("resultCode", java.lang.Integer.valueOf(i));
        c42565rXo.EZpvd("data", intent != null ? intent.getExtras() : null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(final android.os.Bundle bundle) {
        super.onCreate(bundle);
        AYXKKw();
        setContentView(C42568rXr.ActionBar.OLrzqt);
        C42567rXq.EZpvd("onCreate", new Function1() { // from class: o.rXz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC42573rXw.EZpvd(this.KWHzl, bundle, (C42565rXo) obj);
            }
        });
        getOnBackPressedDispatcher().addCallback(new ActionBar());
        OLrzqt().copydefault().observe(this, new C32991mny(new Function1() { // from class: o.rXD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC42573rXw.OLrzqt(this.OLrzqt, (VoiceCallSetupViewModel.Action) obj);
            }
        }));
    }

    public static final Unit EZpvd(ActivityC42573rXw activityC42573rXw, android.os.Bundle bundle, C42565rXo c42565rXo) {
        Intrinsics.checkNotNullParameter(c42565rXo, "");
        c42565rXo.copydefault(activityC42573rXw.getTAG());
        c42565rXo.copydefault("on create activity");
        c42565rXo.EZpvd("hasSaveInstanceState", java.lang.Boolean.valueOf(bundle != null));
        c42565rXo.EZpvd("hasBackPressDispatchers", java.lang.Boolean.valueOf(activityC42573rXw.getOnBackPressedDispatcher().hasEnabledCallbacks()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rXw$ActionBar */
    public static final class ActionBar extends OnBackPressedCallback {
        public ActionBar() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            final ActivityC42573rXw activityC42573rXw = ActivityC42573rXw.this;
            C42567rXq.EZpvd("handleOnBackPressed", new Function1() { // from class: o.rXC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC42573rXw.ActionBar.KWHzl(activityC42573rXw, (C42565rXo) obj);
                }
            });
        }

        public static final Unit KWHzl(ActivityC42573rXw activityC42573rXw, C42565rXo c42565rXo) {
            Intrinsics.checkNotNullParameter(c42565rXo, "");
            c42565rXo.copydefault(activityC42573rXw.getTAG(), "OnBackPressedCallback");
            c42565rXo.copydefault("user on back pressed, do nothing");
            return Unit.INSTANCE;
        }
    }

    public static final Unit OLrzqt(ActivityC42573rXw activityC42573rXw, VoiceCallSetupViewModel.Action action) {
        Intrinsics.checkNotNullParameter(action, "");
        int i = StateListAnimator.OLrzqt[action.ordinal()];
        if (i == 1) {
            activityC42573rXw.AhwBna();
        } else if (i == 2) {
            activityC42573rXw.KWHzl();
        } else if (i == 3) {
            activityC42573rXw.copydefault();
        } else if (i == 4) {
            activityC42573rXw.AEQbTJ();
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            activityC42573rXw.EZpvd();
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        java.lang.String[] strArr = OLrzqt;
        if (C60121zwJ.KWHzl(this, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length))) {
            OLrzqt().EZpvd(true);
        } else {
            requestPermissions(strArr, 100);
        }
    }

    @Override // o.AbstractActivityC33041mov, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NotNull java.lang.String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 100) {
            java.lang.String[] strArr2 = OLrzqt;
            OLrzqt().EZpvd(C60121zwJ.KWHzl(this, (java.lang.String[]) java.util.Arrays.copyOf(strArr2, strArr2.length)));
        }
    }

    public final void AEQbTJ() {
        if (C43251rlk.OLrzqt(InterfaceC42569rXs.class) == null) {
            this.copydefault.launch(ActivityC42562rXl.Companion.copydefault(this));
        } else {
            OLrzqt().copydefault(true);
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
