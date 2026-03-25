package o;

import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
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
import com.okinc.auth.impl.mfa.ui.MfaViewModel;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$10;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$11;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$12;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$13;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$14;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$15;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$16;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$17;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$18;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$19;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$2;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$3;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$4;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$5;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$6;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$7;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$8;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$9;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyViewModel;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.SendCrossDeviceVerificationRequestActivity;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyActivity;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C8206ayP;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aDC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5790aDC extends AbstractC5838aDy {
    public final ActivityResultLauncher<PasskeyCrossDeviceVerifyActivity.Input> AYXKKw;
    public java.lang.String AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final ActivityResultLauncher<SendCrossDeviceVerificationRequestActivity.Input> DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final int gEmmrt;
    public ActivityResultLauncher<PasskeyResetRemoveRequest> isConnected;
    public C5677aAw valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5790aDC() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg
    public void OLrzqt(@NotNull PasskeySdkResult passkeySdkResult) {
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public java.lang.String getTAG() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ayP.Application.OqFWZa int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:50) call: o.aDC.<init>(int):void type: THIS */
    public /* synthetic */ C5790aDC(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C8206ayP.Application.OqFWZa : i);
    }

    public C5790aDC(int i) {
        this.gEmmrt = i;
        this.AhwBna = "VerifyMfaPasskeyFragment";
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(VerifyMfaPasskeyViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$special$$inlined$viewModels$default$5
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MfaViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$special$$inlined$activityViewModels$default$3
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
        ActivityResultLauncher<SendCrossDeviceVerificationRequestActivity.Input> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new SendCrossDeviceVerificationRequestActivity.Application(), new ActivityResultCallback() { // from class: o.aDI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C5790aDC.copydefault(this.OLrzqt, (SendCrossDeviceVerificationRequestActivity.Result) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.DbNXlk = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<PasskeyCrossDeviceVerifyActivity.Input> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new PasskeyCrossDeviceVerifyActivity.ActionBar(), new ActivityResultCallback() { // from class: o.aDG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C5790aDC.AEQbTJ(this.KWHzl, (PasskeyCrossDeviceVerifyActivity.Output) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.AYXKKw = activityResultLauncherRegisterForActivityResult2;
    }

    public final VerifyMfaPasskeyViewModel fetchVPNInfo() {
        return (VerifyMfaPasskeyViewModel) this.AkhnZx.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MfaViewModel ejfBZ() {
        return (MfaViewModel) this.djBIcL.getValue();
    }

    public static final void copydefault(C5790aDC c5790aDC, SendCrossDeviceVerificationRequestActivity.Result result) {
        if (Intrinsics.EZpvd(result, SendCrossDeviceVerificationRequestActivity.Result.Success.copydefault)) {
            c5790aDC.fetchVPNInfo().EZpvd(c5790aDC.ejfBZ().DbNXlk());
            return;
        }
        if (Intrinsics.EZpvd(result, SendCrossDeviceVerificationRequestActivity.Result.Cancelled.EZpvd)) {
            Unit unit = Unit.INSTANCE;
        } else if (Intrinsics.EZpvd(result, SendCrossDeviceVerificationRequestActivity.Result.ResetPasskey.EZpvd)) {
            c5790aDC.ejfBZ().wlaJM();
        } else {
            if (!(result instanceof SendCrossDeviceVerificationRequestActivity.Result.MfaError)) {
                throw new NoWhenBranchMatchedException();
            }
            c5790aDC.ejfBZ().EZpvd(((SendCrossDeviceVerificationRequestActivity.Result.MfaError) result).KWHzl());
        }
    }

    public static final void AEQbTJ(C5790aDC c5790aDC, PasskeyCrossDeviceVerifyActivity.Output output) {
        if (Intrinsics.EZpvd(output, PasskeyCrossDeviceVerifyActivity.Output.Success.OLrzqt)) {
            c5790aDC.fetchVPNInfo().EZpvd(c5790aDC.ejfBZ().DbNXlk());
            return;
        }
        if (Intrinsics.EZpvd(output, PasskeyCrossDeviceVerifyActivity.Output.Cancelled.AEQbTJ)) {
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (!(output instanceof PasskeyCrossDeviceVerifyActivity.Output.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        PasskeyCrossDeviceVerifyActivity.Output.Error error = (PasskeyCrossDeviceVerifyActivity.Output.Error) output;
        pUU.copydefault(c5790aDC.getTAG(), "result: " + error.OLrzqt());
        c5790aDC.fetchVPNInfo().OLrzqt(c5790aDC, c5790aDC.ejfBZ().DbNXlk(), error.OLrzqt());
    }

    @Override // o.AbstractC5838aDy, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        this.isConnected = registerForActivityResult(((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).KWHzl(context), new ActivityResultCallback() { // from class: o.aDB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C5790aDC.OLrzqt(this.KWHzl, (PasskeyResetRemoveState) obj);
            }
        });
    }

    public static final void OLrzqt(C5790aDC c5790aDC, PasskeyResetRemoveState passkeyResetRemoveState) {
        pUU.EZpvd(c5790aDC.getTAG(), "resetRemovePasskeyState: " + passkeyResetRemoveState);
        if (Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.PendingReview.copydefault) || Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.RebindSuccess.AEQbTJ) || Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.RemoveSuccess.AEQbTJ) || Intrinsics.EZpvd(passkeyResetRemoveState, PasskeyResetRemoveState.TicketSubmitted.AEQbTJ)) {
            c5790aDC.ejfBZ().copydefault();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C5677aAw c5677aAwCopydefault = C5677aAw.copydefault(layoutInflater, viewGroup, false);
        this.valueOf = c5677aAwCopydefault;
        if (c5677aAwCopydefault != null) {
            return c5677aAwCopydefault.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.valueOf = null;
    }

    @Override // o.AbstractC5926aFg, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C5677aAw c5677aAw = this.valueOf;
        if (c5677aAw != null) {
            ejfBZ().uzCIH();
            C52794wYp c52794wYp = c5677aAw.KWHzl;
            c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
            C52794wYp c52794wYp2 = c5677aAw.valueOf;
            c52794wYp2.setOnClickListener(new Application(c52794wYp2, 1000L, this));
            C52794wYp c52794wYp3 = c5677aAw.valueOf;
            Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
            c52794wYp3.setVisibility(ejfBZ().getFieldNames() ? 0 : 8);
            android.widget.ImageView imageView = c5677aAw.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C33054mpH.EZpvd(imageView, C43454rpb.copydefault("images/account/common/passkey/mfa_passkey.webp", contextRequireContext, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        }
        C6690aUB.KWHzl(fetchVPNInfo().KWHzl(), this, new VerifyMfaPasskeyFragment$initView$2(this, null));
        C6690aUB.KWHzl(fetchVPNInfo().AEQbTJ(), this, new VerifyMfaPasskeyFragment$initView$3(null));
        C6690aUB.KWHzl(fetchVPNInfo().AhwBna(), this, new VerifyMfaPasskeyFragment$initView$4(this, null));
        C6690aUB.KWHzl(fetchVPNInfo().valueOf(), this, new VerifyMfaPasskeyFragment$initView$5(this, null));
        C6690aUB.KWHzl(ejfBZ().fetchVPNInfo(), this, new VerifyMfaPasskeyFragment$initView$6(this, null));
        C6690aUB.KWHzl(fetchVPNInfo().DbNXlk(), this, new VerifyMfaPasskeyFragment$initView$7(this, null));
        C6690aUB.KWHzl(fetchVPNInfo().AYXKKw(), this, new VerifyMfaPasskeyFragment$initView$8(this, null));
        C6690aUB.KWHzl(fetchVPNInfo().gEmmrt(), this, new VerifyMfaPasskeyFragment$initView$9(this, null));
        C6690aUB.KWHzl(fetchVPNInfo().AkhnZx(), this, new VerifyMfaPasskeyFragment$initView$10(this, null));
        C6690aUB.KWHzl(fetchVPNInfo().djBIcL(), this, new VerifyMfaPasskeyFragment$initView$11(this, null));
        C6690aUB.KWHzl(fetchVPNInfo().fARcdN(), this, new VerifyMfaPasskeyFragment$initView$12(this, null));
        C6690aUB.KWHzl(fetchVPNInfo().values(), this, new VerifyMfaPasskeyFragment$initView$13(this, null));
        C6690aUB.KWHzl(fetchVPNInfo().AuCTel(), this, new VerifyMfaPasskeyFragment$initView$14(this, null));
        C6690aUB.KWHzl(fetchVPNInfo().fetchVPNInfo(), this, new VerifyMfaPasskeyFragment$initView$15(this, null));
        C6690aUB.KWHzl(fetchVPNInfo().isConnected(), this, new VerifyMfaPasskeyFragment$initView$16(this, null));
        C6690aUB.KWHzl(fetchVPNInfo().fIwbmz(), this, new VerifyMfaPasskeyFragment$initView$17(this, null));
        C6690aUB.KWHzl(fetchVPNInfo().OLrzqt(), this, new VerifyMfaPasskeyFragment$initView$18(this, null));
        C6690aUB.KWHzl(fetchVPNInfo().EZpvd(), this, new VerifyMfaPasskeyFragment$initView$19(this, null));
        VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModelFetchVPNInfo = fetchVPNInfo();
        java.lang.String value = ejfBZ().values().getValue();
        verifyMfaPasskeyViewModelFetchVPNInfo.OLrzqt(value != null ? value : "", ejfBZ().fIwbmz(), ejfBZ().DbNXlk(), ejfBZ().hDKMBd());
        ejfBZ().QUSxYX();
    }

    /* JADX INFO: renamed from: o.aDC$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C5790aDC EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C5790aDC c5790aDC) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c5790aDC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                VerifyMfaPasskeyViewModel.clickVerify$default(this.EZpvd.fetchVPNInfo(), false, this.EZpvd.ejfBZ().DbNXlk(), 1, null);
                this.EZpvd.ejfBZ().QKVWgx();
            }
        }
    }

    /* JADX INFO: renamed from: o.aDC$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C5790aDC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C5790aDC c5790aDC) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c5790aDC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.fetchVPNInfo().copydefault();
            }
        }
    }

    public final void EZpvd(final java.lang.String str, final AuthenticationStartResponse authenticationStartResponse) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || getChildFragmentManager().isStateSaved()) {
            return;
        }
        C5873aEg.Companion.KWHzl(new Function0() { // from class: o.aDN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C5790aDC.KWHzl(this.EZpvd, str, authenticationStartResponse);
            }
        }, new Function0() { // from class: o.aDE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C5790aDC.AYXKKw();
            }
        }).show(getChildFragmentManager(), C5873aEg.class.getName());
    }

    public static final Unit KWHzl(C5790aDC c5790aDC, java.lang.String str, AuthenticationStartResponse authenticationStartResponse) {
        c5790aDC.copydefault(str, authenticationStartResponse);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw() {
        return Unit.INSTANCE;
    }

    public final void copydefault(java.lang.String str, AuthenticationStartResponse authenticationStartResponse) {
        this.DbNXlk.launch(new SendCrossDeviceVerificationRequestActivity.Input(str, authenticationStartResponse));
    }

    public final void isConnected() {
        if (getChildFragmentManager().isStateSaved()) {
            return;
        }
        C5879aEm.Companion.KWHzl(new Function0() { // from class: o.aDK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C5790aDC.valueOf();
            }
        }, new Function0() { // from class: o.aDM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C5790aDC.gEmmrt(this.EZpvd);
            }
        }).show(getChildFragmentManager(), C5879aEm.class.getName());
    }

    public static final Unit valueOf() {
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C5790aDC c5790aDC) {
        c5790aDC.ejfBZ().getNewProxyInstance();
        return Unit.INSTANCE;
    }

    public final void AkhnZx() {
        if (getChildFragmentManager().isStateSaved()) {
            return;
        }
        C5878aEl.Companion.KWHzl(new Function0() { // from class: o.aDF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C5790aDC.AkhnZx(this.copydefault);
            }
        }, new Function0() { // from class: o.aDJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C5790aDC.AhwBna();
            }
        }).show(getChildFragmentManager(), C5878aEl.class.getName());
    }

    public static final Unit AkhnZx(C5790aDC c5790aDC) {
        c5790aDC.ejfBZ().wlaJM();
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna() {
        return Unit.INSTANCE;
    }

    public final void DbNXlk() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.QDqgQU));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C8206ayP.Dialog.hCLrkq));
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C8206ayP.Dialog.QfsBiF), new View.OnClickListener() { // from class: o.aDA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C5790aDC.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C8206ayP.Dialog.DGOPHZDGOPHZ), new View.OnClickListener() { // from class: o.aDH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C5790aDC.OLrzqt(this.EZpvd, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(C5790aDC c5790aDC, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c5790aDC.startActivity(new android.content.Intent("android.settings.SETTINGS"));
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.AbstractC5926aFg
    public void copydefault(@NotNull PasskeySdkResult passkeySdkResult) {
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
        fetchVPNInfo().EZpvd(passkeySdkResult, this, ejfBZ().DbNXlk());
    }
}
