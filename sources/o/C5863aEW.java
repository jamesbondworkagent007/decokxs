package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.impl.mfa.ui.MfaViewModel;
import com.okinc.auth.impl.mfa.ui.verifymfaotp.VerifyMfaOtpFragment$initView$10;
import com.okinc.auth.impl.mfa.ui.verifymfaotp.VerifyMfaOtpFragment$initView$2;
import com.okinc.auth.impl.mfa.ui.verifymfaotp.VerifyMfaOtpFragment$initView$3;
import com.okinc.auth.impl.mfa.ui.verifymfaotp.VerifyMfaOtpFragment$initView$4;
import com.okinc.auth.impl.mfa.ui.verifymfaotp.VerifyMfaOtpFragment$initView$5;
import com.okinc.auth.impl.mfa.ui.verifymfaotp.VerifyMfaOtpFragment$initView$6;
import com.okinc.auth.impl.mfa.ui.verifymfaotp.VerifyMfaOtpFragment$initView$7;
import com.okinc.auth.impl.mfa.ui.verifymfaotp.VerifyMfaOtpFragment$initView$8;
import com.okinc.auth.impl.mfa.ui.verifymfaotp.VerifyMfaOtpFragment$initView$9;
import com.okinc.auth.impl.mfa.ui.verifymfaotp.VerifyMfaOtpViewModel;
import com.okinc.uilab.code.OKCodeInput;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aEW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5863aEW extends AbstractC5859aES {
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm djBIcL;
    public final int gEmmrt;
    public C5629aAA valueOf;

    /* JADX INFO: renamed from: o.aEW$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5863aEW() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ayP.Application.DarRvM int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:30) call: o.aEW.<init>(int):void type: THIS */
    public /* synthetic */ C5863aEW(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C8206ayP.Application.DarRvM : i);
    }

    public C5863aEW(int i) {
        this.gEmmrt = i;
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.mfa.ui.verifymfaotp.VerifyMfaOtpFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.mfa.ui.verifymfaotp.VerifyMfaOtpFragment$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(VerifyMfaOtpViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.mfa.ui.verifymfaotp.VerifyMfaOtpFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.mfa.ui.verifymfaotp.VerifyMfaOtpFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.mfa.ui.verifymfaotp.VerifyMfaOtpFragment$special$$inlined$viewModels$default$5
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MfaViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.mfa.ui.verifymfaotp.VerifyMfaOtpFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.mfa.ui.verifymfaotp.VerifyMfaOtpFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.mfa.ui.verifymfaotp.VerifyMfaOtpFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.aES.KWHzl()V */
    public final VerifyMfaOtpViewModel KWHzl() {
        return (VerifyMfaOtpViewModel) this.AhwBna.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MfaViewModel djBIcL() {
        return (MfaViewModel) this.djBIcL.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C5629aAA c5629aAACopydefault = C5629aAA.copydefault(layoutInflater, viewGroup, false);
        this.valueOf = c5629aAACopydefault;
        if (c5629aAACopydefault != null) {
            return c5629aAACopydefault.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.valueOf = null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C5629aAA c5629aAA = this.valueOf;
        if (c5629aAA != null) {
            djBIcL().uzCIH();
            android.widget.TextView textView = c5629aAA.djBIcL;
            textView.setOnClickListener(new Activity(textView, 1000L, this, c5629aAA, view));
            android.widget.TextView textView2 = c5629aAA.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(djBIcL().getFieldNames() ? 0 : 8);
            android.widget.TextView textView3 = c5629aAA.copydefault;
            textView3.setOnClickListener(new StateListAnimator(textView3, 1000L, this));
            C52794wYp c52794wYp = c5629aAA.KWHzl;
            c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this, c5629aAA));
            c5629aAA.AEQbTJ.setOnCodeCompleteListener(new Function1() { // from class: o.aEU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C5863aEW.copydefault(this.EZpvd, (java.lang.String) obj);
                }
            });
        }
        C6690aUB.KWHzl(KWHzl().AhwBna(), this, new VerifyMfaOtpFragment$initView$2(this, null));
        C6690aUB.KWHzl(KWHzl().KWHzl(), this, new VerifyMfaOtpFragment$initView$3(this, null));
        C6690aUB.KWHzl(KWHzl().EZpvd(), this, new VerifyMfaOtpFragment$initView$4(this, null));
        C6690aUB.KWHzl(KWHzl().djBIcL(), this, new VerifyMfaOtpFragment$initView$5(this, null));
        C6690aUB.KWHzl(KWHzl().OLrzqt(), this, new VerifyMfaOtpFragment$initView$6(this, null));
        C6690aUB.KWHzl(KWHzl().AEQbTJ(), this, new VerifyMfaOtpFragment$initView$7(this, null));
        C6690aUB.KWHzl(djBIcL().fetchVPNInfo(), this, new VerifyMfaOtpFragment$initView$8(this, null));
        C6690aUB.KWHzl(KWHzl().gEmmrt(), this, new VerifyMfaOtpFragment$initView$9(this, null));
        C6690aUB.KWHzl(KWHzl().AYXKKw(), this, new VerifyMfaOtpFragment$initView$10(this, null));
        djBIcL().KWHzl().observe(this, new ActionBar(new Function1() { // from class: o.aET
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C5863aEW.KWHzl(this.copydefault, (java.lang.Long) obj);
            }
        }));
        djBIcL().QbewEr();
        VerifyMfaOtpViewModel verifyMfaOtpViewModelKWHzl = KWHzl();
        java.lang.String value = djBIcL().values().getValue();
        verifyMfaOtpViewModelKWHzl.copydefault(value != null ? value : "", djBIcL().valueOf().getValue(), djBIcL().fIwbmz(), djBIcL().DbNXlk());
    }

    /* JADX INFO: renamed from: o.aEW$Application */
    public static final class Application implements java.lang.Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5863aEW.this.djBIcL().copydefault(C5863aEW.this.KWHzl().copydefault().getValue());
        }
    }

    public static final Unit copydefault(C5863aEW c5863aEW, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c5863aEW.KWHzl().OLrzqt(str);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C5863aEW c5863aEW, java.lang.Long l) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        if (l.longValue() > 0) {
            C5629aAA c5629aAA = c5863aEW.valueOf;
            if (c5629aAA != null && (textView6 = c5629aAA.copydefault) != null) {
                textView6.setEnabled(false);
            }
            C5629aAA c5629aAA2 = c5863aEW.valueOf;
            if (c5629aAA2 != null && (textView5 = c5629aAA2.copydefault) != null) {
                textView5.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
            }
            C5629aAA c5629aAA3 = c5863aEW.valueOf;
            if (c5629aAA3 != null && (textView4 = c5629aAA3.copydefault) != null) {
                android.content.Context context = c5863aEW.getContext();
                textView4.setText(context != null ? C33069mpW.KWHzl(context, C8206ayP.Dialog.dvKsVJ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("timer", l.toString()))) : null);
            }
        } else {
            C5629aAA c5629aAA4 = c5863aEW.valueOf;
            if (c5629aAA4 != null && (textView3 = c5629aAA4.copydefault) != null) {
                textView3.setEnabled(true);
            }
            C5629aAA c5629aAA5 = c5863aEW.valueOf;
            if (c5629aAA5 != null && (textView2 = c5629aAA5.copydefault) != null) {
                textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
            }
            C5629aAA c5629aAA6 = c5863aEW.valueOf;
            if (c5629aAA6 != null && (textView = c5629aAA6.copydefault) != null) {
                textView.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.finit));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.aEW$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C5863aEW AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C5629aAA OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C5863aEW c5863aEW, C5629aAA c5629aAA, android.view.View view2) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c5863aEW;
            this.OLrzqt = c5629aAA;
            this.KWHzl = view2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                FragmentActivity activity = this.AEQbTJ.getActivity();
                if (activity == null) {
                    return;
                }
                C33570myu.copydefault((android.app.Activity) activity);
                this.OLrzqt.AEQbTJ.clearFocus();
                this.KWHzl.post(this.AEQbTJ.new Application());
                this.AEQbTJ.djBIcL().AwvSrB();
            }
        }
    }

    /* JADX INFO: renamed from: o.aEW$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C5863aEW OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C5863aEW c5863aEW) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = c5863aEW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.KWHzl().valueOf();
                this.OLrzqt.djBIcL().gHZMYf();
            }
        }
    }

    /* JADX INFO: renamed from: o.aEW$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C5863aEW EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C5629aAA copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C5863aEW c5863aEW, C5629aAA c5629aAA) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c5863aEW;
            this.copydefault = c5629aAA;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                VerifyMfaOtpViewModel verifyMfaOtpViewModelKWHzl = this.EZpvd.KWHzl();
                java.lang.String strEZpvd = this.copydefault.AEQbTJ.EZpvd();
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                verifyMfaOtpViewModelKWHzl.EZpvd(strEZpvd);
                this.EZpvd.djBIcL().sSMYrx();
            }
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        OKCodeInput oKCodeInput;
        super.onResume();
        C5629aAA c5629aAA = this.valueOf;
        if (c5629aAA != null && (oKCodeInput = c5629aAA.AEQbTJ) != null) {
            oKCodeInput.OLrzqt();
        }
        C33054mpH.showKeyBoardDelay$default(this, 0L, 1, null);
    }
}
