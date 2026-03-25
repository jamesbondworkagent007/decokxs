package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.impl.passkey.model.Fido2VerificationOption;
import com.okinc.auth.impl.passkey.model.GetAuthenticationTypeResponse;
import com.okinc.auth.impl.passkey.model.UnlockTokenResponse;
import com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aRr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC6573aRr extends AbstractActivityC6571aRp {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final FragmentResultListener AYXKKw = new FragmentResultListener() { // from class: o.aRs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.fragment.app.FragmentResultListener
        public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
            ActivityC6573aRr.EZpvd(this.OLrzqt, str, bundle);
        }
    };
    public final InterfaceC56387yDm djBIcL;

    public ActivityC6573aRr() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(PasskeyTwoFaViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.aRr$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aRr.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, @NotNull GetAuthenticationTypeResponse getAuthenticationTypeResponse) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(getAuthenticationTypeResponse, "");
            android.content.Intent intentPutExtras = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC6573aRr.class).putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_AUTH_TYPE_RESPONSE", getAuthenticationTypeResponse)));
            Intrinsics.checkNotNullExpressionValue(intentPutExtras, "");
            return intentPutExtras;
        }
    }

    /* JADX DEBUG: Possible override for method o.aRp.KWHzl()V */
    public final PasskeyTwoFaViewModel KWHzl() {
        return (PasskeyTwoFaViewModel) this.djBIcL.getValue();
    }

    public static final void EZpvd(ActivityC6573aRr activityC6573aRr, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.io.Serializable serializable = bundle.getSerializable("KEY_SELECTED_OPTION");
        Fido2VerificationOption fido2VerificationOption = serializable instanceof Fido2VerificationOption ? (Fido2VerificationOption) serializable : null;
        if (fido2VerificationOption != null) {
            activityC6573aRr.KWHzl().KWHzl(new PasskeyTwoFaViewModel.ActionBar.StateListAnimator(fido2VerificationOption));
        } else {
            activityC6573aRr.finish();
        }
    }

    @Override // o.AbstractActivityC6571aRp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int i = C52761wXj.Application.fetchVPNInfo;
        overridePendingTransition(i, i);
        final C8212ayV c8212ayVOLrzqt = C8212ayV.OLrzqt(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c8212ayVOLrzqt, "");
        setContentView(c8212ayVOLrzqt.getRoot());
        getSupportFragmentManager().setFragmentResultListener("KEY_2FA_OPTION_BOTTOM_SHEET", this, this.AYXKKw);
        KWHzl().AEQbTJ().observe(this, new C32991mny(new Function1() { // from class: o.aRv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6573aRr.AEQbTJ(this.copydefault, c8212ayVOLrzqt, (PasskeyTwoFaViewModel.Activity) obj);
            }
        }));
        KWHzl().OLrzqt();
    }

    public static final Unit AEQbTJ(final ActivityC6573aRr activityC6573aRr, C8212ayV c8212ayV, PasskeyTwoFaViewModel.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof PasskeyTwoFaViewModel.Activity.FragmentManager) {
            C55326xho.toast$default(((PasskeyTwoFaViewModel.Activity.FragmentManager) activity).AEQbTJ(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        } else if (activity instanceof PasskeyTwoFaViewModel.Activity.TaskDescription) {
            if (((PasskeyTwoFaViewModel.Activity.TaskDescription) activity).copydefault()) {
                activityC6573aRr.showLoadingAtOnce();
            } else {
                activityC6573aRr.releaseLoading();
            }
        } else if (Intrinsics.EZpvd(activity, PasskeyTwoFaViewModel.Activity.ActionBar.OLrzqt)) {
            activityC6573aRr.finish();
        } else if (activity instanceof PasskeyTwoFaViewModel.Activity.C0241Activity) {
            UnlockTokenResponse unlockTokenResponseAEQbTJ = ((PasskeyTwoFaViewModel.Activity.C0241Activity) activity).AEQbTJ();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_UNLOCK_TOKEN_RESPONSE", unlockTokenResponseAEQbTJ);
            activityC6573aRr.EZpvd(intent);
        } else if (activity instanceof PasskeyTwoFaViewModel.Activity.StateListAnimator) {
            final C6576aRu c6576aRuOLrzqt = C6576aRu.Companion.OLrzqt("KEY_2FA_OPTION_BOTTOM_SHEET", ((PasskeyTwoFaViewModel.Activity.StateListAnimator) activity).EZpvd());
            c8212ayV.getRoot().post(new java.lang.Runnable() { // from class: o.aRt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC6573aRr.copydefault(c6576aRuOLrzqt, activityC6573aRr);
                }
            });
        } else if (activity instanceof PasskeyTwoFaViewModel.Activity.Application) {
            activityC6573aRr.getSupportFragmentManager().beginTransaction().replace(C8206ayP.StateListAnimator.hBpjJd, C6535aRF.Companion.EZpvd(((PasskeyTwoFaViewModel.Activity.Application) activity).copydefault()), C6535aRF.class.getName()).commitAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(C6576aRu c6576aRu, ActivityC6573aRr activityC6573aRr) {
        c6576aRu.show(activityC6573aRr.getSupportFragmentManager(), "");
    }

    public static /* synthetic */ void finishAction$default(ActivityC6573aRr activityC6573aRr, android.content.Intent intent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            intent = null;
        }
        activityC6573aRr.EZpvd(intent);
    }

    public final void EZpvd(android.content.Intent intent) {
        setResult(-1, intent);
        finish();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(C52761wXj.Application.fetchVPNInfo, C52761wXj.Application.valueOf);
    }

    @Override // o.AbstractActivityC6571aRp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6571aRp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6571aRp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6571aRp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
