package o;

import android.view.View;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.impl.passkey.ui.receive.ReceiveCrossDeviceVerificationRequestActivity;
import com.okinc.auth.impl.passkey.ui.receive.ReceiveCrossDeviceVerificationRequestViewModel;
import com.okinc.auth.impl.passkey.ui.receive.kickout.KickOutFragment$initView$5;
import com.okinc.auth.impl.passkey.ui.receive.kickout.KickOutFragment$initView$6;
import com.okinc.auth.impl.passkey.ui.receive.kickout.KickOutFragment$initView$7;
import com.okinc.auth.impl.passkey.ui.receive.kickout.KickOutFragment$initView$8;
import com.okinc.auth.impl.passkey.ui.receive.kickout.KickOutFragment$initView$9;
import com.okinc.auth.impl.passkey.ui.receive.kickout.KickOutViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aLU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6232aLU extends AbstractC6233aLV {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public C8283azn AhwBna;
    public final InterfaceC56387yDm djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C8206ayP.Application.fARcdN;
    }

    public C6232aLU() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.passkey.ui.receive.kickout.KickOutFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.passkey.ui.receive.kickout.KickOutFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(KickOutViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.receive.kickout.KickOutFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.receive.kickout.KickOutFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.receive.kickout.KickOutFragment$special$$inlined$viewModels$default$5
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ReceiveCrossDeviceVerificationRequestViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.receive.kickout.KickOutFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.receive.kickout.KickOutFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.receive.kickout.KickOutFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.aLV.OLrzqt()V */
    public final KickOutViewModel OLrzqt() {
        return (KickOutViewModel) this.djBIcL.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReceiveCrossDeviceVerificationRequestViewModel AYXKKw() {
        return (ReceiveCrossDeviceVerificationRequestViewModel) this.AYXKKw.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C55178xez c55178xez;
        android.widget.ImageView imageViewAEQbTJ;
        C55178xez c55178xez2;
        wYF wyfOLrzqt;
        C52794wYp c52794wYpAEQbTJ;
        C55178xez c55178xez3;
        wYF wyfOLrzqt2;
        C52794wYp c52794wYpAEQbTJ2;
        C55178xez c55178xez4;
        wYF wyfOLrzqt3;
        C52794wYp c52794wYpCopydefault;
        C55178xez c55178xez5;
        wYF wyfOLrzqt4;
        C52794wYp c52794wYpCopydefault2;
        C55178xez c55178xez6;
        wYF wyfOLrzqt5;
        C55178xez c55178xez7;
        android.widget.TextView textViewCopydefault;
        C55178xez c55178xez8;
        C55178xez c55178xez9;
        C55178xez c55178xez10;
        Intrinsics.checkNotNullParameter(view, "");
        C8283azn c8283aznKWHzl = C8283azn.KWHzl(view);
        this.AhwBna = c8283aznKWHzl;
        if (c8283aznKWHzl != null && (c55178xez10 = c8283aznKWHzl.OLrzqt) != null) {
            c55178xez10.setStatus(5);
        }
        C8283azn c8283azn = this.AhwBna;
        if (c8283azn != null && (c55178xez9 = c8283azn.OLrzqt) != null) {
            c55178xez9.setTitleText(getString(C8206ayP.Dialog.QfJbVf));
        }
        C8283azn c8283azn2 = this.AhwBna;
        if (c8283azn2 != null && (c55178xez8 = c8283azn2.OLrzqt) != null) {
            c55178xez8.setSubTitleText(getString(C8206ayP.Dialog.DSiOMJ));
        }
        C8283azn c8283azn3 = this.AhwBna;
        if (c8283azn3 != null && (c55178xez7 = c8283azn3.OLrzqt) != null && (textViewCopydefault = c55178xez7.copydefault()) != null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            TextViewCompat.setLineHeight(textViewCopydefault, C55298xhM.OLrzqt(24, contextRequireContext));
        }
        C8283azn c8283azn4 = this.AhwBna;
        if (c8283azn4 != null && (c55178xez6 = c8283azn4.OLrzqt) != null && (wyfOLrzqt5 = c55178xez6.OLrzqt()) != null) {
            wyfOLrzqt5.setType(6);
        }
        C8283azn c8283azn5 = this.AhwBna;
        if (c8283azn5 != null && (c55178xez5 = c8283azn5.OLrzqt) != null && (wyfOLrzqt4 = c55178xez5.OLrzqt()) != null && (c52794wYpCopydefault2 = wyfOLrzqt4.copydefault()) != null) {
            c52794wYpCopydefault2.setText(getString(C8206ayP.Dialog.DGUQLIekVPG));
        }
        C8283azn c8283azn6 = this.AhwBna;
        if (c8283azn6 != null && (c55178xez4 = c8283azn6.OLrzqt) != null && (wyfOLrzqt3 = c55178xez4.OLrzqt()) != null && (c52794wYpCopydefault = wyfOLrzqt3.copydefault()) != null) {
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
        C8283azn c8283azn7 = this.AhwBna;
        if (c8283azn7 != null && (c55178xez3 = c8283azn7.OLrzqt) != null && (wyfOLrzqt2 = c55178xez3.OLrzqt()) != null && (c52794wYpAEQbTJ2 = wyfOLrzqt2.AEQbTJ()) != null) {
            c52794wYpAEQbTJ2.setText(getString(C8206ayP.Dialog.fBE));
        }
        C8283azn c8283azn8 = this.AhwBna;
        if (c8283azn8 != null && (c55178xez2 = c8283azn8.OLrzqt) != null && (wyfOLrzqt = c55178xez2.OLrzqt()) != null && (c52794wYpAEQbTJ = wyfOLrzqt.AEQbTJ()) != null) {
            c52794wYpAEQbTJ.setOnClickListener(new Application(c52794wYpAEQbTJ, 1000L, this));
        }
        C8283azn c8283azn9 = this.AhwBna;
        if (c8283azn9 != null && (c55178xez = c8283azn9.OLrzqt) != null && (imageViewAEQbTJ = c55178xez.AEQbTJ()) != null) {
            imageViewAEQbTJ.setOnClickListener(new StateListAnimator(imageViewAEQbTJ, 1000L, this));
        }
        C6690aUB.KWHzl(OLrzqt().KWHzl(), this, new KickOutFragment$initView$5(null));
        C6690aUB.KWHzl(OLrzqt().EZpvd(), this, new KickOutFragment$initView$6(this, null));
        C6690aUB.KWHzl(OLrzqt().AEQbTJ(), this, new KickOutFragment$initView$7(this, null));
        C6690aUB.KWHzl(OLrzqt().copydefault(), this, new KickOutFragment$initView$8(this, null));
        C6690aUB.KWHzl(OLrzqt().OLrzqt(), this, new KickOutFragment$initView$9(this, null));
        KickOutViewModel kickOutViewModelOLrzqt = OLrzqt();
        ReceiveCrossDeviceVerificationRequestActivity.Input inputAEQbTJ = AYXKKw().AEQbTJ();
        java.lang.String strKWHzl = inputAEQbTJ != null ? inputAEQbTJ.KWHzl() : null;
        kickOutViewModelOLrzqt.AEQbTJ(strKWHzl != null ? strKWHzl : "");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AhwBna = null;
    }

    /* JADX INFO: renamed from: o.aLU$TaskDescription */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aLU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C6232aLU KWHzl() {
            return new C6232aLU();
        }
    }

    /* JADX INFO: renamed from: o.aLU$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C6232aLU copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C6232aLU c6232aLU) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c6232aLU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.OLrzqt().copydefault(this.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.aLU$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C6232aLU KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C6232aLU c6232aLU) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c6232aLU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.AYXKKw().djBIcL();
            }
        }
    }

    /* JADX INFO: renamed from: o.aLU$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C6232aLU AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C6232aLU c6232aLU) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c6232aLU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.AYXKKw().djBIcL();
            }
        }
    }
}
