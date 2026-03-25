package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.SendCrossDeviceVerificationRequestActivity;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.SendCrossDeviceVerificationRequestViewModel;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification.VerificationRequestFragment$initView$10;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification.VerificationRequestFragment$initView$11;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification.VerificationRequestFragment$initView$6;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification.VerificationRequestFragment$initView$7;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification.VerificationRequestFragment$initView$8;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification.VerificationRequestFragment$initView$9;
import com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification.VerificationRequestViewModel;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aEE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5845aEE extends AbstractC5891aEy {
    public final InterfaceC56387yDm AhwBna;
    public C8282azm djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public static final Activity Companion = new Activity(null);
    public static final int AYXKKw = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C8206ayP.Application.ejfBZ;
    }

    public C5845aEE() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification.VerificationRequestFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification.VerificationRequestFragment$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(VerificationRequestViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification.VerificationRequestFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification.VerificationRequestFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification.VerificationRequestFragment$special$$inlined$viewModels$default$5
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SendCrossDeviceVerificationRequestViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification.VerificationRequestFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification.VerificationRequestFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification.VerificationRequestFragment$special$$inlined$activityViewModels$default$3
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
    }

    /* JADX DEBUG: Possible override for method o.aEy.AEQbTJ()V */
    public final VerificationRequestViewModel AEQbTJ() {
        return (VerificationRequestViewModel) this.gEmmrt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SendCrossDeviceVerificationRequestViewModel AYXKKw() {
        return (SendCrossDeviceVerificationRequestViewModel) this.AhwBna.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        wYC wyc;
        wYC wyc2;
        C55317xhf c55317xhf;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        Intrinsics.checkNotNullParameter(view, "");
        this.djBIcL = C8282azm.AEQbTJ(view);
        AuthenticationStartResponse.AdditionalData value = AYXKKw().AYXKKw().getValue();
        SendCrossDeviceVerificationRequestActivity.Input inputOLrzqt = AYXKKw().OLrzqt();
        java.lang.String strEZpvd = inputOLrzqt != null ? inputOLrzqt.EZpvd() : null;
        java.lang.String str = strEZpvd == null ? "" : strEZpvd;
        java.lang.String credentialId = value != null ? value.getCredentialId() : null;
        java.lang.String str2 = credentialId == null ? "" : credentialId;
        C8282azm c8282azm = this.djBIcL;
        if (c8282azm != null && (textView2 = c8282azm.AhwBna) != null) {
            java.lang.String deviceName = value != null ? value.getDeviceName() : null;
            if (deviceName == null) {
                deviceName = "";
            }
            textView2.setText(deviceName);
        }
        C8282azm c8282azm2 = this.djBIcL;
        if (c8282azm2 != null && (textView = c8282azm2.gEmmrt) != null) {
            textView.setText(C33069mpW.copydefault(this, C8206ayP.Dialog.DGUQLIhJrIAr, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("date", AEQbTJ().copydefault(value != null ? value.getLastUsedTimestamp() : null)))));
        }
        C8282azm c8282azm3 = this.djBIcL;
        if (c8282azm3 != null && (imageView2 = c8282azm3.OLrzqt) != null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C33054mpH.EZpvd(imageView2, C43454rpb.copydefault("images/account/common/passkey/cross_device_check.webp", contextRequireContext, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        }
        C8282azm c8282azm4 = this.djBIcL;
        if (c8282azm4 != null && (imageView = c8282azm4.OLrzqt) != null) {
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            C33054mpH.EZpvd(imageView, C43454rpb.copydefault("images/account/common/passkey/cross_device_check.webp", contextRequireContext2, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        }
        C8282azm c8282azm5 = this.djBIcL;
        if (c8282azm5 != null && (c55317xhf = c8282azm5.valueOf) != null) {
            c55317xhf.setOnClickListener(new StateListAnimator(c55317xhf, 1000L, this, str, value));
        }
        C8282azm c8282azm6 = this.djBIcL;
        if (c8282azm6 != null && (wyc2 = c8282azm6.KWHzl) != null) {
            wyc2.setOnClickListener(new TaskDescription(wyc2, 1000L, this));
        }
        C8282azm c8282azm7 = this.djBIcL;
        if (c8282azm7 != null && (wyc = c8282azm7.copydefault) != null) {
            wyc.setOnClickListener(new ActionBar(wyc, 1000L, this));
        }
        C8282azm c8282azm8 = this.djBIcL;
        if (c8282azm8 != null && (c52794wYp2 = c8282azm8.EZpvd) != null) {
            c52794wYp2.setOnClickListener(new Application(c52794wYp2, 1000L, this));
        }
        C8282azm c8282azm9 = this.djBIcL;
        if (c8282azm9 != null && (c52794wYp = c8282azm9.AEQbTJ) != null) {
            c52794wYp.setOnClickListener(new PendingIntent(c52794wYp, 1000L, this, str, str2));
        }
        C6690aUB.KWHzl(AEQbTJ().KWHzl(), this, new VerificationRequestFragment$initView$6(this, null));
        C6690aUB.observeState$default(AEQbTJ().AEQbTJ(), this, (Lifecycle.State) null, new VerificationRequestFragment$initView$7(this, null), 2, (java.lang.Object) null);
        C6690aUB.observeState$default(AEQbTJ().AYXKKw(), this, (Lifecycle.State) null, new VerificationRequestFragment$initView$8(this, null), 2, (java.lang.Object) null);
        C6690aUB.KWHzl(AEQbTJ().OLrzqt(), this, new VerificationRequestFragment$initView$9(this, null));
        C6690aUB.KWHzl(AEQbTJ().EZpvd(), this, new VerificationRequestFragment$initView$10(null));
        C6690aUB.KWHzl(AEQbTJ().copydefault(), this, new VerificationRequestFragment$initView$11(this, null));
        AEQbTJ().KWHzl(str, str2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
    }

    /* JADX INFO: renamed from: o.aEE$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aEE.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C5845aEE KWHzl() {
            return new C5845aEE();
        }
    }

    /* JADX INFO: renamed from: o.aEE$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C5845aEE EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C5845aEE c5845aEE) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c5845aEE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.AYXKKw().valueOf();
            }
        }
    }

    /* JADX INFO: renamed from: o.aEE$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C5845aEE KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C5845aEE c5845aEE) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c5845aEE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.AYXKKw().AkhnZx();
            }
        }
    }

    /* JADX INFO: renamed from: o.aEE$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ C5845aEE OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C5845aEE c5845aEE, java.lang.String str, java.lang.String str2) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = c5845aEE;
            this.EZpvd = str;
            this.KWHzl = str2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ().copydefault(this.EZpvd, this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.aEE$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ C5845aEE EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ AuthenticationStartResponse.AdditionalData OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C5845aEE c5845aEE, java.lang.String str, AuthenticationStartResponse.AdditionalData additionalData) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c5845aEE;
            this.AEQbTJ = str;
            this.OLrzqt = additionalData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                VerificationRequestViewModel verificationRequestViewModelAEQbTJ = this.EZpvd.AEQbTJ();
                java.lang.String str = this.AEQbTJ;
                AuthenticationStartResponse.AdditionalData additionalData = this.OLrzqt;
                java.lang.String credentialId = additionalData != null ? additionalData.getCredentialId() : null;
                if (credentialId == null) {
                    credentialId = "";
                }
                verificationRequestViewModelAEQbTJ.AEQbTJ(str, credentialId);
            }
        }
    }

    /* JADX INFO: renamed from: o.aEE$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C5845aEE AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C5845aEE c5845aEE) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c5845aEE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.AYXKKw().DbNXlk();
            }
        }
    }
}
