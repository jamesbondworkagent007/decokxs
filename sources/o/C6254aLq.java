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
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.api.passkey.PasskeyRebindState;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$initView$10;
import com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$initView$11;
import com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$initView$12;
import com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$initView$13;
import com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$initView$14;
import com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$initView$15;
import com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$initView$2;
import com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$initView$3;
import com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$initView$4;
import com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$initView$5;
import com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$initView$6;
import com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$initView$7;
import com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$initView$8;
import com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$initView$9;
import com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aLq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6254aLq extends AbstractC6244aLg {
    public final InterfaceC56387yDm AYXKKw;
    public final int AkhnZx;
    public final ActivityResultLauncher<Unit> DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm fARcdN;
    public java.lang.String gEmmrt;
    public AbstractC5666aAl isConnected;
    public final InterfaceC56387yDm valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C6254aLq() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg
    public void copydefault(@NotNull PasskeySdkResult passkeySdkResult) {
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public int getLayoutId() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public java.lang.String getTAG() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ayP.Application.gGvvIC int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:47) call: o.aLq.<init>(int):void type: THIS */
    public /* synthetic */ C6254aLq(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C8206ayP.Application.gGvvIC : i);
    }

    public C6254aLq(int i) {
        this.AkhnZx = i;
        this.gEmmrt = "PasskeyRebindServiceFragment";
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.aLw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6254aLq.isConnected(this.OLrzqt);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.aLy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6254aLq.values(this.EZpvd);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.aLu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6254aLq.DbNXlk(this.KWHzl);
            }
        });
        ActivityResultLauncher<Unit> activityResultLauncherRegisterForActivityResult = registerForActivityResult(((InterfaceC5697aBP) C43251rlk.copydefault(InterfaceC5697aBP.class)).copydefault(), new ActivityResultCallback() { // from class: o.aLz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C6254aLq.AEQbTJ(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.DbNXlk = activityResultLauncherRegisterForActivityResult;
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$special$$inlined$viewModels$default$2
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
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PasskeyRebindServiceViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.rebind.PasskeyRebindServiceFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: renamed from: o.aLq$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aLq.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C6254aLq OLrzqt(@NotNull java.lang.String str, @NotNull PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, @NotNull PasskeyScenario passkeyScenario) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(passkeyPromotionAuthenticator, "");
            Intrinsics.checkNotNullParameter(passkeyScenario, "");
            C6254aLq c6254aLq = new C6254aLq(0, 1, null);
            c6254aLq.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_WORKFLOW_TOKEN", str), C56390yDp.OLrzqt("KEY_PROMOTION_AUTHENTICATOR", passkeyPromotionAuthenticator), C56390yDp.OLrzqt("KEY_PASSKEY_SCENARIO", passkeyScenario)));
            return c6254aLq;
        }
    }

    public final java.lang.String gEmmrt() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String isConnected(C6254aLq c6254aLq) {
        android.os.Bundle arguments = c6254aLq.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("KEY_WORKFLOW_TOKEN") : null;
        return string == null ? "" : string;
    }

    public final PasskeyPromotionAuthenticator djBIcL() {
        return (PasskeyPromotionAuthenticator) this.djBIcL.getValue();
    }

    public static final PasskeyPromotionAuthenticator values(C6254aLq c6254aLq) {
        PasskeyPromotionAuthenticator passkeyPromotionAuthenticator;
        android.os.Bundle arguments = c6254aLq.getArguments();
        return (arguments == null || (passkeyPromotionAuthenticator = (PasskeyPromotionAuthenticator) arguments.getParcelable("KEY_PROMOTION_AUTHENTICATOR")) == null) ? PasskeyPromotionAuthenticator.All.KWHzl : passkeyPromotionAuthenticator;
    }

    public final PasskeyScenario AhwBna() {
        return (PasskeyScenario) this.valueOf.getValue();
    }

    public static final PasskeyScenario DbNXlk(C6254aLq c6254aLq) {
        PasskeyScenario passkeyScenario;
        android.os.Bundle arguments = c6254aLq.getArguments();
        return (arguments == null || (passkeyScenario = (PasskeyScenario) arguments.getParcelable("KEY_PASSKEY_SCENARIO")) == null) ? PasskeyScenario.Account.AEQbTJ : passkeyScenario;
    }

    public static final void AEQbTJ(C6254aLq c6254aLq, java.lang.Boolean bool) {
        pUU.KWHzl("PasskeyRebindServiceFragment", "biometric enabled=" + bool);
        if (bool.booleanValue()) {
            c6254aLq.isConnected().AEQbTJ(c6254aLq.gEmmrt(), c6254aLq.djBIcL(), c6254aLq, c6254aLq.AhwBna());
        }
    }

    public final PasskeyRebindServiceViewModel isConnected() {
        return (PasskeyRebindServiceViewModel) this.fARcdN.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC5666aAl abstractC5666aAlOLrzqt = AbstractC5666aAl.OLrzqt(layoutInflater, viewGroup, false);
        this.isConnected = abstractC5666aAlOLrzqt;
        if (abstractC5666aAlOLrzqt != null) {
            return abstractC5666aAlOLrzqt.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC5666aAl abstractC5666aAl = this.isConnected;
        if (abstractC5666aAl != null) {
            abstractC5666aAl.KWHzl.AEQbTJ().setVisibility(8);
            abstractC5666aAl.KWHzl.setNavigationIconVisible(true);
            abstractC5666aAl.KWHzl.setNavigationOnClickListener(new Function0() { // from class: o.aLs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C6254aLq.fetchVPNInfo(this.AEQbTJ);
                }
            });
            C52794wYp c52794wYp = abstractC5666aAl.copydefault;
            Intrinsics.copydefault(c52794wYp);
            C6738aUz.EZpvd(c52794wYp);
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
            C52794wYp c52794wYp2 = abstractC5666aAl.AEQbTJ;
            c52794wYp2.setOnClickListener(new ActionBar(c52794wYp2, 1000L, this));
            abstractC5666aAl.EZpvd.setAnimation(C33492mxV.OLrzqt() ? C8206ayP.FragmentManager.AEQbTJ : C8206ayP.FragmentManager.EZpvd);
        }
        C6690aUB.KWHzl(isConnected().djBIcL(), this, new PasskeyRebindServiceFragment$initView$2(this, null));
        C6690aUB.KWHzl(isConnected().AuCTel(), this, new PasskeyRebindServiceFragment$initView$3(view, null));
        C6690aUB.KWHzl(isConnected().DbNXlk(), this, new PasskeyRebindServiceFragment$initView$4(this, null));
        C6690aUB.KWHzl(isConnected().AkhnZx(), this, new PasskeyRebindServiceFragment$initView$5(this, null));
        C6690aUB.KWHzl(isConnected().values(), this, new PasskeyRebindServiceFragment$initView$6(null));
        C6690aUB.KWHzl(isConnected().isConnected(), this, new PasskeyRebindServiceFragment$initView$7(null));
        C6690aUB.KWHzl(isConnected().fIwbmz(), this, new PasskeyRebindServiceFragment$initView$8(this, null));
        C6690aUB.KWHzl(isConnected().KWHzl(), this, new PasskeyRebindServiceFragment$initView$9(this, null));
        C6690aUB.KWHzl(isConnected().AhwBna(), this, new PasskeyRebindServiceFragment$initView$10(this, null));
        C6690aUB.KWHzl(isConnected().AYXKKw(), this, new PasskeyRebindServiceFragment$initView$11(this, null));
        C6690aUB.KWHzl(isConnected().copydefault(), this, new PasskeyRebindServiceFragment$initView$12(this, null));
        C6690aUB.KWHzl(isConnected().AEQbTJ(), this, new PasskeyRebindServiceFragment$initView$13(this, null));
        C6690aUB.KWHzl(isConnected().valueOf(), this, new PasskeyRebindServiceFragment$initView$14(this, null));
        C6690aUB.KWHzl(isConnected().fetchVPNInfo(), this, new PasskeyRebindServiceFragment$initView$15(this, null));
        FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.addCallback(this, new Activity());
        }
        isConnected().AEQbTJ(gEmmrt(), djBIcL(), this, AhwBna());
        isConnected().fJNWhG();
    }

    public static final Unit fetchVPNInfo(C6254aLq c6254aLq) {
        c6254aLq.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.aLq$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C6254aLq EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C6254aLq c6254aLq) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c6254aLq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C6307aMq.EZpvd.EZpvd();
                C6288aMX.Companion.EZpvd(null).show(this.EZpvd.getParentFragmentManager(), "PasskeyLearnMoreBottomSheet");
            }
        }
    }

    /* JADX INFO: renamed from: o.aLq$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C6254aLq copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C6254aLq c6254aLq) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = c6254aLq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                PasskeyRebindServiceViewModel passkeyRebindServiceViewModelIsConnected = this.copydefault.isConnected();
                java.lang.String strGEmmrt = this.copydefault.gEmmrt();
                PasskeyPromotionAuthenticator passkeyPromotionAuthenticatorDjBIcL = this.copydefault.djBIcL();
                C6254aLq c6254aLq = this.copydefault;
                passkeyRebindServiceViewModelIsConnected.AEQbTJ(strGEmmrt, passkeyPromotionAuthenticatorDjBIcL, c6254aLq, c6254aLq.AhwBna());
            }
        }
    }

    /* JADX INFO: renamed from: o.aLq$Activity */
    public static final class Activity extends OnBackPressedCallback {
        public Activity() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            C6254aLq.this.isConnected().EZpvd();
        }
    }

    public final void EZpvd(android.content.Context context) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.gwwfep));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C8206ayP.Dialog.zzQwtT));
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C8206ayP.Dialog.hrjNmC), new View.OnClickListener() { // from class: o.aLt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C6254aLq.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C8206ayP.Dialog.dzCpvv), new View.OnClickListener() { // from class: o.aLp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C6254aLq.KWHzl(this.EZpvd, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void KWHzl(C6254aLq c6254aLq, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        if (c6254aLq.isAdded()) {
            c6254aLq.DbNXlk.launch(Unit.INSTANCE);
            viewOnClickListenerC54939xaY.dismiss();
        }
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        isConnected().OLrzqt();
        copydefault(new PasskeyRebindState.Success(str, str2));
    }

    public final void AYXKKw() {
        copydefault(PasskeyRebindState.AlreadyExisted.KWHzl);
    }

    @Override // o.AbstractC5926aFg
    public void OLrzqt(@NotNull PasskeySdkResult passkeySdkResult) {
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
        isConnected().OLrzqt(passkeySdkResult, AhwBna());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(PasskeyRebindState passkeyRebindState) {
        C5922aFc c5922aFc = C5922aFc.KWHzl;
        C5922aFc.log$default(c5922aFc, "[REBIND]", null, "finishWith: " + passkeyRebindState, 2, null);
        C5922aFc.log$default(c5922aFc, "[REBIND]", null, "success: " + (passkeyRebindState instanceof PasskeyRebindState.Success), 2, null);
        FragmentActivity activity = getActivity();
        ActivityC6250aLm activityC6250aLm = activity instanceof ActivityC6250aLm ? (ActivityC6250aLm) activity : null;
        if (activityC6250aLm != null) {
            activityC6250aLm.OLrzqt(passkeyRebindState);
        }
    }

    private final void fetchVPNInfo() {
        C6290aMZ c6290aMZKWHzl = C6290aMZ.Companion.KWHzl(null);
        c6290aMZKWHzl.AEQbTJ(new Function0() { // from class: o.aLx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6254aLq.valueOf();
            }
        });
        c6290aMZKWHzl.EZpvd(new Function0() { // from class: o.aLv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6254aLq.AkhnZx(this.AEQbTJ);
            }
        });
        c6290aMZKWHzl.show(getParentFragmentManager(), "PasskeyQuitBottomSheet");
    }

    public static final Unit valueOf() {
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(C6254aLq c6254aLq) {
        c6254aLq.isConnected().EZpvd();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.isConnected = null;
    }
}
