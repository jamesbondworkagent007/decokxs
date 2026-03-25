package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.api.passkey.PasskeyAuthenticateScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.api.passkey.PasskeyRecoverState;
import com.okinc.auth.api.passkey.PasskeyResetRemoveRequest;
import com.okinc.auth.api.passkey.PasskeyResetRemoveState;
import com.okinc.auth.impl.passkey.ui.recover.PasskeyRecoverActivity$onCreate$4;
import com.okinc.auth.impl.passkey.ui.recover.PasskeyRecoverActivity$onCreate$5;
import com.okinc.auth.impl.passkey.ui.recover.PasskeyRecoverActivity$onCreate$6;
import com.okinc.auth.impl.passkey.ui.recover.PasskeyRecoverActivity$onCreate$7;
import com.okinc.auth.impl.passkey.ui.recover.PasskeyRecoverActivity$onCreate$8;
import com.okinc.auth.impl.passkey.ui.recover.PasskeyRecoverActivity$onCreate$9;
import com.okinc.auth.impl.passkey.ui.recover.PasskeyRecoverViewModel;
import com.okinc.auth.impl.widget.SimpleToolBar;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C7343ahz;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aLY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC6236aLY extends AbstractActivityC6291aMa {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public java.lang.String AYXKKw = "PasskeyRecoveryActivity";
    public final ActivityResultLauncher<PasskeyResetRemoveRequest> AhwBna;
    public final InterfaceC56387yDm djBIcL;
    public C8273azd gEmmrt;
    public final ActivityResultLauncher<PasskeyAuthenticateScenarioRequest> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public java.lang.String getTAG() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    public ActivityC6236aLY() {
        ActivityResultLauncher<PasskeyAuthenticateScenarioRequest> activityResultLauncherRegisterForActivityResult = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).OLrzqt(), new ActivityResultCallback() { // from class: o.aLZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6236aLY.OLrzqt(this.copydefault, (PasskeyAuthenticateState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.valueOf = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<PasskeyResetRemoveRequest> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).KWHzl(this), new ActivityResultCallback() { // from class: o.aMg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC6236aLY.AEQbTJ(this.AEQbTJ, (PasskeyResetRemoveState) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.AhwBna = activityResultLauncherRegisterForActivityResult2;
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(PasskeyRecoverViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.recover.PasskeyRecoverActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.recover.PasskeyRecoverActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.recover.PasskeyRecoverActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.aLY$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aLY.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC6236aLY.class);
        }
    }

    public static final void OLrzqt(ActivityC6236aLY activityC6236aLY, PasskeyAuthenticateState passkeyAuthenticateState) {
        pUU.KWHzl(activityC6236aLY.getTAG(), "authenticatePasskeyLauncher: " + passkeyAuthenticateState);
        PasskeyRecoverViewModel passkeyRecoverViewModelEZpvd = activityC6236aLY.EZpvd();
        Intrinsics.copydefault(passkeyAuthenticateState);
        passkeyRecoverViewModelEZpvd.EZpvd(passkeyAuthenticateState);
    }

    public static final void AEQbTJ(ActivityC6236aLY activityC6236aLY, PasskeyResetRemoveState passkeyResetRemoveState) {
        pUU.KWHzl(activityC6236aLY.getTAG(), "resetRemoveLauncher: " + passkeyResetRemoveState);
        if (Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.Cancel.copydefault)) {
            return;
        }
        if (Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.PendingReview.copydefault) || Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.TicketSubmitted.AEQbTJ)) {
            activityC6236aLY.EZpvd(PasskeyRecoverState.ResetInProgress.AEQbTJ);
        } else {
            if (!Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.RebindSuccess.AEQbTJ) && !Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.RemoveSuccess.AEQbTJ)) {
                throw new NoWhenBranchMatchedException();
            }
            activityC6236aLY.EZpvd(PasskeyRecoverState.Success.copydefault);
        }
    }

    /* JADX DEBUG: Possible override for method o.aMa.EZpvd()V */
    public final PasskeyRecoverViewModel EZpvd() {
        return (PasskeyRecoverViewModel) this.djBIcL.getValue();
    }

    @Override // o.AbstractActivityC6291aMa, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        android.widget.ImageView imageView;
        SimpleToolBar simpleToolBar;
        SimpleToolBar simpleToolBar2;
        super.onCreate(bundle);
        overridePendingTransition(C52761wXj.Application.AEQbTJ, C52761wXj.Application.fetchVPNInfo);
        C8273azd c8273azdCopydefault = C8273azd.copydefault(getLayoutInflater());
        this.gEmmrt = c8273azdCopydefault;
        setContentView(c8273azdCopydefault != null ? c8273azdCopydefault.getRoot() : null);
        C8273azd c8273azd = this.gEmmrt;
        if (c8273azd != null && (simpleToolBar2 = c8273azd.KWHzl) != null) {
            simpleToolBar2.setNavigationIconVisible(false);
        }
        C8273azd c8273azd2 = this.gEmmrt;
        if (c8273azd2 != null && (simpleToolBar = c8273azd2.KWHzl) != null) {
            simpleToolBar.setRightIconOnClickListener(new Function0() { // from class: o.aMb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC6236aLY.AEQbTJ(this.copydefault);
                }
            });
        }
        C8273azd c8273azd3 = this.gEmmrt;
        if (c8273azd3 != null && (imageView = c8273azd3.EZpvd) != null) {
            C33054mpH.EZpvd(imageView, C43454rpb.copydefault("images/account/common/passkey/mfa_passkey.webp", this, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        }
        C8273azd c8273azd4 = this.gEmmrt;
        if (c8273azd4 != null && (c52794wYp2 = c8273azd4.OLrzqt) != null) {
            c52794wYp2.setOnClickListener(new StateListAnimator(c52794wYp2, 1000L, this));
        }
        C8273azd c8273azd5 = this.gEmmrt;
        if (c8273azd5 != null && (c52794wYp = c8273azd5.copydefault) != null) {
            c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        }
        C6690aUB.AEQbTJ(EZpvd().djBIcL(), this, new PasskeyRecoverActivity$onCreate$4(null));
        C6690aUB.AEQbTJ(EZpvd().AEQbTJ(), this, new PasskeyRecoverActivity$onCreate$5(this, null));
        C6690aUB.AEQbTJ(EZpvd().AhwBna(), this, new PasskeyRecoverActivity$onCreate$6(this, null));
        C6690aUB.AEQbTJ(EZpvd().valueOf(), this, new PasskeyRecoverActivity$onCreate$7(this, null));
        C6690aUB.AEQbTJ(EZpvd().EZpvd(), this, new PasskeyRecoverActivity$onCreate$8(this, null));
        C6690aUB.AEQbTJ(EZpvd().OLrzqt(), this, new PasskeyRecoverActivity$onCreate$9(this, null));
        if (bundle == null) {
            EZpvd().copydefault();
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: o.aMc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6236aLY.KWHzl(this.OLrzqt, (OnBackPressedCallback) obj);
            }
        }, 2, null);
    }

    public static final Unit AEQbTJ(ActivityC6236aLY activityC6236aLY) {
        activityC6236aLY.EZpvd(PasskeyRecoverState.Close.OLrzqt);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC6236aLY activityC6236aLY, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        activityC6236aLY.EZpvd(PasskeyRecoverState.Close.OLrzqt);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull PasskeyRecoverState passkeyRecoverState) {
        Intrinsics.checkNotNullParameter(passkeyRecoverState, "");
        pUU.KWHzl(getTAG(), "setStateAndFinish: " + passkeyRecoverState);
        setResult(-1, new android.content.Intent().putExtra("KEY_RESPONSE", passkeyRecoverState));
        finish();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(C52761wXj.Application.fetchVPNInfo, C7343ahz.ActionBar.valueOf);
    }

    /* JADX INFO: renamed from: o.aLY$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC6236aLY EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC6236aLY activityC6236aLY) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = activityC6236aLY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.EZpvd().copydefault();
            }
        }
    }

    /* JADX INFO: renamed from: o.aLY$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ActivityC6236aLY EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC6236aLY activityC6236aLY) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = activityC6236aLY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.EZpvd().KWHzl();
            }
        }
    }

    @Override // o.AbstractActivityC6291aMa, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6291aMa, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6291aMa, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6291aMa, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
