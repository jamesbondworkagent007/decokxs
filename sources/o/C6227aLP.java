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
import com.okinc.auth.impl.passkey.ui.receive.ReceiveCrossDeviceVerificationRequestActivity;
import com.okinc.auth.impl.passkey.ui.receive.ReceiveCrossDeviceVerificationRequestViewModel;
import com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$initView$10;
import com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$initView$11;
import com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$initView$12;
import com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$initView$13;
import com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$initView$14;
import com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$initView$4;
import com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$initView$5;
import com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$initView$6;
import com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$initView$7;
import com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$initView$8;
import com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$initView$9;
import com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoViewModel;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aLP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6227aLP extends AbstractC6230aLS implements InterfaceC33040mou {
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm gEmmrt;
    public C8279azj valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AYXKKw = 8;

    @Override // o.InterfaceC33040mou
    public boolean AhwBna() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C8206ayP.Application.fIwbmz;
    }

    public C6227aLP() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(VerificationInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$special$$inlined$viewModels$default$5
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ReceiveCrossDeviceVerificationRequestViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoFragment$special$$inlined$activityViewModels$default$3
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

    public final VerificationInfoViewModel gEmmrt() {
        return (VerificationInfoViewModel) this.gEmmrt.getValue();
    }

    /* JADX DEBUG: Possible override for method o.aLS.KWHzl()V */
    public final ReceiveCrossDeviceVerificationRequestViewModel KWHzl() {
        return (ReceiveCrossDeviceVerificationRequestViewModel) this.AhwBna.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        wYC wyc;
        OKReminder oKReminder;
        OKReminder oKReminder2;
        OKReminder oKReminder3;
        Intrinsics.checkNotNullParameter(view, "");
        C8279azj c8279azjCopydefault = C8279azj.copydefault(view);
        this.valueOf = c8279azjCopydefault;
        if (c8279azjCopydefault != null && (oKReminder3 = c8279azjCopydefault.AYXKKw) != null) {
            oKReminder3.setCloseIconVisibility(false);
        }
        C8279azj c8279azj = this.valueOf;
        if (c8279azj != null && (oKReminder2 = c8279azj.AYXKKw) != null) {
            oKReminder2.setStyle(2);
        }
        C8279azj c8279azj2 = this.valueOf;
        if (c8279azj2 != null && (oKReminder = c8279azj2.AYXKKw) != null) {
            oKReminder.setMessage(getString(C8206ayP.Dialog.DIIpTV));
        }
        C8279azj c8279azj3 = this.valueOf;
        if (c8279azj3 != null && (wyc = c8279azj3.OLrzqt) != null) {
            wyc.setOnClickListener(new ActionBar(wyc, 1000L, this));
        }
        C8279azj c8279azj4 = this.valueOf;
        if (c8279azj4 != null && (c52794wYp2 = c8279azj4.copydefault) != null) {
            c52794wYp2.setOnClickListener(new Activity(c52794wYp2, 1000L, this));
        }
        C8279azj c8279azj5 = this.valueOf;
        if (c8279azj5 != null && (c52794wYp = c8279azj5.AhwBna) != null) {
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        }
        C6690aUB.KWHzl(gEmmrt().EZpvd(), this, new VerificationInfoFragment$initView$4(this, null));
        C6690aUB.KWHzl(gEmmrt().gEmmrt(), this, new VerificationInfoFragment$initView$5(this, null));
        C6690aUB.KWHzl(gEmmrt().KWHzl(), this, new VerificationInfoFragment$initView$6(null));
        C6690aUB.KWHzl(gEmmrt().valueOf(), this, new VerificationInfoFragment$initView$7(this, null));
        C6690aUB.KWHzl(gEmmrt().copydefault(), this, new VerificationInfoFragment$initView$8(this, null));
        C6690aUB.observeState$default(gEmmrt().AhwBna(), this, (Lifecycle.State) null, new VerificationInfoFragment$initView$9(this, null), 2, (java.lang.Object) null);
        C6690aUB.KWHzl(gEmmrt().AEQbTJ(), this, new VerificationInfoFragment$initView$10(this, null));
        C6690aUB.KWHzl(gEmmrt().djBIcL(), this, new VerificationInfoFragment$initView$11(this, null));
        C6690aUB.observeState$default(gEmmrt().fetchVPNInfo(), this, (Lifecycle.State) null, new VerificationInfoFragment$initView$12(this, null), 2, (java.lang.Object) null);
        C6690aUB.observeState$default(gEmmrt().OLrzqt(), this, (Lifecycle.State) null, new VerificationInfoFragment$initView$13(this, null), 2, (java.lang.Object) null);
        C6690aUB.KWHzl(gEmmrt().AYXKKw(), this, new VerificationInfoFragment$initView$14(this, null));
        VerificationInfoViewModel verificationInfoViewModelGEmmrt = gEmmrt();
        ReceiveCrossDeviceVerificationRequestActivity.Input inputAEQbTJ = KWHzl().AEQbTJ();
        java.lang.String strKWHzl = inputAEQbTJ != null ? inputAEQbTJ.KWHzl() : null;
        verificationInfoViewModelGEmmrt.copydefault(strKWHzl != null ? strKWHzl : "");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.valueOf = null;
    }

    /* JADX INFO: renamed from: o.aLP$TaskDescription */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aLP.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C6227aLP OLrzqt() {
            return new C6227aLP();
        }
    }

    /* JADX INFO: renamed from: o.aLP$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C6227aLP AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C6227aLP c6227aLP) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = c6227aLP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.gEmmrt().AkhnZx();
                this.AEQbTJ.KWHzl().djBIcL();
            }
        }
    }

    /* JADX INFO: renamed from: o.aLP$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C6227aLP KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C6227aLP c6227aLP) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c6227aLP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.gEmmrt().copydefault(this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.aLP$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C6227aLP KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C6227aLP c6227aLP) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c6227aLP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.gEmmrt().values();
            }
        }
    }
}
