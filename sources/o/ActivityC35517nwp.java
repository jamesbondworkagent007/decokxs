package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.camera.OKIMCaptureMode;
import com.okinc.im.imui.capture.BroadcastMessageSightRecordActivityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35445nvW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nwp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC35517nwp extends AbstractActivityC35524nww {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.nwr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(ActivityC35517nwp.AEQbTJ(this.KWHzl));
        }
    });

    /* JADX INFO: renamed from: o.nwp$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nwp.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull OKIMCaptureMode oKIMCaptureMode, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(oKIMCaptureMode, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC35517nwp.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_CAPTURE_MODE", oKIMCaptureMode.name()), C56390yDp.OLrzqt("KEY_TOTAL_RECIPIENT", java.lang.Integer.valueOf(i))));
            return intent;
        }
    }

    public ActivityC35517nwp() {
        final Function0 function0 = null;
        this.KWHzl = new ViewModelLazy(C56524yIo.AEQbTJ(BroadcastMessageSightRecordActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.capture.BroadcastMessageSightRecordActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.capture.BroadcastMessageSightRecordActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.capture.BroadcastMessageSightRecordActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.nww.AEQbTJ()V */
    public final BroadcastMessageSightRecordActivityViewModel AEQbTJ() {
        return (BroadcastMessageSightRecordActivityViewModel) this.KWHzl.getValue();
    }

    /* JADX DEBUG: Possible override for method o.nww.KWHzl()V */
    public final int KWHzl() {
        return ((java.lang.Number) this.copydefault.getValue()).intValue();
    }

    public static final int AEQbTJ(ActivityC35517nwp activityC35517nwp) {
        android.content.Intent intent = activityC35517nwp.getIntent();
        if (intent != null) {
            return intent.getIntExtra("KEY_TOTAL_RECIPIENT", 0);
        }
        return 0;
    }

    @Override // o.ActivityC35526nwy
    public void AEQbTJ(@NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        AEQbTJ().copydefault(new Function0() { // from class: o.nwt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC35517nwp.AEQbTJ(this.AEQbTJ, function0, function02);
            }
        }, new Function0() { // from class: o.nwu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC35517nwp.KWHzl(function0);
            }
        });
    }

    public static final Unit AEQbTJ(ActivityC35517nwp activityC35517nwp, final Function0 function0, final Function0 function02) {
        C35445nvW.Activity activity = C35445nvW.Companion;
        C35445nvW c35445nvWOLrzqt = activity.OLrzqt("FRAGMENT_RESULT_KEY_SEND_CONFIRMATION", activityC35517nwp.KWHzl());
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC35517nwp.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c35445nvWOLrzqt.show(supportFragmentManager, (java.lang.String) null);
        FragmentKt.setFragmentResultListener(c35445nvWOLrzqt, activity.EZpvd("FRAGMENT_RESULT_KEY_SEND_CONFIRMATION"), new Function2() { // from class: o.nwm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC35517nwp.copydefault(function0, (java.lang.String) obj, (android.os.Bundle) obj2);
            }
        });
        FragmentKt.setFragmentResultListener(c35445nvWOLrzqt, activity.AEQbTJ("FRAGMENT_RESULT_KEY_SEND_CONFIRMATION"), new Function2() { // from class: o.nwo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC35517nwp.EZpvd(function02, (java.lang.String) obj, (android.os.Bundle) obj2);
            }
        });
        FragmentKt.setFragmentResultListener(c35445nvWOLrzqt, activity.KWHzl("FRAGMENT_RESULT_KEY_SEND_CONFIRMATION"), new Function2() { // from class: o.nws
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC35517nwp.valueOf(function02, (java.lang.String) obj, (android.os.Bundle) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function0 function0, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function0 function0, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(Function0 function0, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC35524nww, o.ActivityC35526nwy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC35524nww, o.ActivityC35526nwy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC35524nww, o.ActivityC35526nwy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC35524nww, o.ActivityC35526nwy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.AbstractActivityC35524nww, o.ActivityC35526nwy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
