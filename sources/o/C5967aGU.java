package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.api.passkey.PasskeyResetRemoveRequest;
import com.okinc.auth.api.passkey.PasskeyResetRemoveState;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.api.passkey.PasskeyState;
import com.okinc.auth.impl.passkey.ui.authenticate.asset.PasskeyAuthenticateServiceFragment$initView$2;
import com.okinc.auth.impl.passkey.ui.authenticate.asset.PasskeyAuthenticateServiceFragment$initView$3;
import com.okinc.auth.impl.passkey.ui.authenticate.asset.PasskeyAuthenticateServiceFragment$initView$4;
import com.okinc.auth.impl.passkey.ui.authenticate.asset.PasskeyAuthenticateServiceFragment$initView$5;
import com.okinc.auth.impl.passkey.ui.authenticate.asset.PasskeyAuthenticateServiceFragment$initView$6;
import com.okinc.auth.impl.passkey.ui.authenticate.asset.PasskeyAuthenticateServiceFragment$initView$7;
import com.okinc.auth.impl.passkey.ui.authenticate.asset.PasskeyAuthenticateServiceFragment$initView$8;
import com.okinc.auth.impl.passkey.ui.authenticate.asset.PasskeyAuthenticateServiceViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5967aGU extends AbstractC5965aGS {
    public AbstractC8264azU AYXKKw;
    public ActivityResultLauncher<PasskeyResetRemoveRequest> AkhnZx;
    public final ActivityResultLauncher<java.lang.String> djBIcL;
    public java.lang.String gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final ActivityResultLauncher<android.app.PendingIntent> valueOf;
    public final int values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5967aGU() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public java.lang.String getTAG() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ayP.Application.UeEOUB int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:34) call: o.aGU.<init>(int):void type: THIS */
    public /* synthetic */ C5967aGU(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C8206ayP.Application.UeEOUB : i);
    }

    public C5967aGU(int i) {
        this.values = i;
        this.gEmmrt = "PasskeyAuthenticateServiceFragment";
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.passkey.ui.authenticate.asset.PasskeyAuthenticateServiceFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.passkey.ui.authenticate.asset.PasskeyAuthenticateServiceFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PasskeyAuthenticateServiceViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.authenticate.asset.PasskeyAuthenticateServiceFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.authenticate.asset.PasskeyAuthenticateServiceFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.authenticate.asset.PasskeyAuthenticateServiceFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        ActivityResultLauncher<android.app.PendingIntent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).AEQbTJ(), new ActivityResultCallback() { // from class: o.aGW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C5967aGU.copydefault(this.KWHzl, (PasskeySdkResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.valueOf = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<java.lang.String> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).copydefault(), new ActivityResultCallback() { // from class: o.aGV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C5967aGU.AEQbTJ(this.EZpvd, (PasskeySdkResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.djBIcL = activityResultLauncherRegisterForActivityResult2;
    }

    /* JADX INFO: renamed from: o.aGU$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aGU.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C5967aGU EZpvd(boolean z) {
            C5967aGU c5967aGU = new C5967aGU(0, 1, null);
            c5967aGU.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_SKIP_CHECK_PASSKEY", java.lang.Boolean.valueOf(z))));
            return c5967aGU;
        }
    }

    /* JADX DEBUG: Possible override for method o.aGS.AEQbTJ()V */
    public final PasskeyAuthenticateServiceViewModel AEQbTJ() {
        return (PasskeyAuthenticateServiceViewModel) this.isConnected.getValue();
    }

    public static final void copydefault(C5967aGU c5967aGU, PasskeySdkResult passkeySdkResult) {
        C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[FIDO2]", c5967aGU.getTAG() + " launcher: " + passkeySdkResult.EZpvd());
        c5967aGU.releaseLoading();
        PasskeyAuthenticateServiceViewModel passkeyAuthenticateServiceViewModelAEQbTJ = c5967aGU.AEQbTJ();
        Intrinsics.copydefault(passkeySdkResult);
        passkeyAuthenticateServiceViewModelAEQbTJ.OLrzqt(passkeySdkResult);
    }

    public static final void AEQbTJ(C5967aGU c5967aGU, PasskeySdkResult passkeySdkResult) {
        C5922aFc.KWHzl.copydefault("[AUTHENTICATE]", "[CREDENTIAL MANAGER]", c5967aGU.getTAG() + " launcher: " + passkeySdkResult.EZpvd());
        c5967aGU.releaseLoading();
        PasskeyAuthenticateServiceViewModel passkeyAuthenticateServiceViewModelAEQbTJ = c5967aGU.AEQbTJ();
        Intrinsics.copydefault(passkeySdkResult);
        passkeyAuthenticateServiceViewModelAEQbTJ.OLrzqt(passkeySdkResult);
    }

    @Override // o.AbstractC5965aGS, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        this.AkhnZx = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).KWHzl(context), new ActivityResultCallback() { // from class: o.aGT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C5967aGU.KWHzl(this.EZpvd, (PasskeyResetRemoveState) obj);
            }
        });
    }

    public static final void KWHzl(C5967aGU c5967aGU, PasskeyResetRemoveState passkeyResetRemoveState) {
        pUU.EZpvd(c5967aGU.getTAG(), "resetRemovePasskeyState: " + passkeyResetRemoveState);
        if (Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.PendingReview.copydefault) || Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.RebindSuccess.AEQbTJ) || Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.RemoveSuccess.AEQbTJ) || Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.TicketSubmitted.AEQbTJ)) {
            c5967aGU.EZpvd(PasskeyState.Cancel.INSTANCE);
        } else if (!Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.Cancel.copydefault)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC8264azU abstractC8264azUAEQbTJ = AbstractC8264azU.AEQbTJ(layoutInflater);
        this.AYXKKw = abstractC8264azUAEQbTJ;
        if (abstractC8264azUAEQbTJ != null) {
            return abstractC8264azUAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC8264azU abstractC8264azU = this.AYXKKw;
        if (abstractC8264azU != null) {
            abstractC8264azU.copydefault.setNavigationOnClickListener(new Function0() { // from class: o.aGX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C5967aGU.valueOf(this.KWHzl);
                }
            });
            C52794wYp c52794wYp = abstractC8264azU.AEQbTJ;
            c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
            C52794wYp c52794wYp2 = abstractC8264azU.EZpvd;
            c52794wYp2.setOnClickListener(new TaskDescription(c52794wYp2, 1000L, this));
        }
        C6690aUB.KWHzl(AEQbTJ().AYXKKw(), this, new PasskeyAuthenticateServiceFragment$initView$2(view, null));
        C6690aUB.KWHzl(AEQbTJ().gEmmrt(), this, new PasskeyAuthenticateServiceFragment$initView$3(this, null));
        C6690aUB.KWHzl(AEQbTJ().EZpvd(), this, new PasskeyAuthenticateServiceFragment$initView$4(this, null));
        C6690aUB.KWHzl(AEQbTJ().OLrzqt(), this, new PasskeyAuthenticateServiceFragment$initView$5(this, null));
        C6690aUB.KWHzl(AEQbTJ().AhwBna(), this, new PasskeyAuthenticateServiceFragment$initView$6(this, null));
        C6690aUB.KWHzl(AEQbTJ().AEQbTJ(), this, new PasskeyAuthenticateServiceFragment$initView$7(this, null));
        C6690aUB.KWHzl(AEQbTJ().copydefault(), this, new PasskeyAuthenticateServiceFragment$initView$8(this, null));
        FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.addCallback(this, new Application());
        }
        AEQbTJ(true);
        AEQbTJ().KWHzl();
    }

    public static final Unit valueOf(C5967aGU c5967aGU) {
        c5967aGU.EZpvd(PasskeyState.Cancel.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.aGU$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C5967aGU KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C5967aGU c5967aGU) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c5967aGU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ().KWHzl();
            }
        }
    }

    /* JADX INFO: renamed from: o.aGU$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C5967aGU EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C5967aGU c5967aGU) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c5967aGU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.EZpvd(PasskeyState.Fallback.INSTANCE);
            }
        }
    }

    /* JADX INFO: renamed from: o.aGU$Application */
    public static final class Application extends OnBackPressedCallback {
        public Application() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            C5967aGU.this.EZpvd(PasskeyState.Cancel.INSTANCE);
        }
    }

    public final void AEQbTJ(boolean z) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        C5959aGM c5959aGM;
        AbstractC8264azU abstractC8264azU = this.AYXKKw;
        if (abstractC8264azU != null && (c5959aGM = abstractC8264azU.KWHzl) != null) {
            c5959aGM.setReadyToVerify(z);
        }
        AbstractC8264azU abstractC8264azU2 = this.AYXKKw;
        if (abstractC8264azU2 != null && (c52794wYp2 = abstractC8264azU2.AEQbTJ) != null) {
            c52794wYp2.setVisibility(z ^ true ? 0 : 8);
        }
        AbstractC8264azU abstractC8264azU3 = this.AYXKKw;
        if (abstractC8264azU3 == null || (c52794wYp = abstractC8264azU3.EZpvd) == null) {
            return;
        }
        c52794wYp.setVisibility(z ^ true ? 0 : 8);
    }

    public final void EZpvd(PasskeyState passkeyState) {
        C5922aFc.log$default(C5922aFc.KWHzl, "[AUTHENTICATE]", null, getTAG() + " finish with: " + passkeyState.log(), 2, null);
        FragmentActivity activity = getActivity();
        ActivityC5964aGR activityC5964aGR = activity instanceof ActivityC5964aGR ? (ActivityC5964aGR) activity : null;
        if (activityC5964aGR != null) {
            activityC5964aGR.EZpvd(passkeyState);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AYXKKw = null;
    }
}
