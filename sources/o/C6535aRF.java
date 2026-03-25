package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.impl.passkey.model.Fido2VerificationOption;
import com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaOtpFragment$setupObserver$1;
import com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaOtpFragment$setupObserver$2;
import com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaOtpFragment$setupObserver$3;
import com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaOtpFragment$setupObserver$5;
import com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaOtpFragment$setupObserver$6;
import com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaOtpFragment$setupObserver$7;
import com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaOtpFragment$setupObserver$8;
import com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaOtpViewModel;
import com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaViewModel;
import com.okinc.auth.impl.widget.SimpleToolBar;
import com.okinc.uilab.edit.OKEditText;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aRF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6535aRF extends AbstractC6572aRq {
    public final int AYXKKw;
    public C5663aAi djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;

    /* JADX INFO: renamed from: o.aRF$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Fido2VerificationOption.values().length];
            try {
                iArr[Fido2VerificationOption.SMS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Fido2VerificationOption.EMAIL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C6535aRF() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ayP.Application.iZzfmt int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:27) call: o.aRF.<init>(int):void type: THIS */
    public /* synthetic */ C6535aRF(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C8206ayP.Application.iZzfmt : i);
    }

    public C6535aRF(int i) {
        this.AYXKKw = i;
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.aRI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6535aRF.valueOf(this.AEQbTJ);
            }
        });
        final Function0 function0 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PasskeyTwoFaViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaOtpFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaOtpFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaOtpFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaOtpFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaOtpFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PasskeyTwoFaOtpViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaOtpFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaOtpFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.twofa.PasskeyTwoFaOtpFragment$special$$inlined$viewModels$default$5
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

    /* JADX INFO: renamed from: o.aRF$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aRF.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C6535aRF EZpvd(@NotNull Fido2VerificationOption fido2VerificationOption) {
            Intrinsics.checkNotNullParameter(fido2VerificationOption, "");
            C6535aRF c6535aRF = new C6535aRF(0, 1, null);
            c6535aRF.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_OPTION", fido2VerificationOption)));
            return c6535aRF;
        }
    }

    public final Fido2VerificationOption AhwBna() {
        return (Fido2VerificationOption) this.gEmmrt.getValue();
    }

    public static final Fido2VerificationOption valueOf(C6535aRF c6535aRF) {
        android.os.Bundle arguments = c6535aRF.getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("KEY_OPTION") : null;
        Fido2VerificationOption fido2VerificationOption = serializable instanceof Fido2VerificationOption ? (Fido2VerificationOption) serializable : null;
        return fido2VerificationOption == null ? Fido2VerificationOption.EMAIL : fido2VerificationOption;
    }

    /* JADX DEBUG: Possible override for method o.aRq.OLrzqt()V */
    public final PasskeyTwoFaViewModel OLrzqt() {
        return (PasskeyTwoFaViewModel) this.valueOf.getValue();
    }

    public final PasskeyTwoFaOtpViewModel valueOf() {
        return (PasskeyTwoFaOtpViewModel) this.values.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C5663aAi c5663aAiCopydefault = C5663aAi.copydefault(getLayoutInflater(), viewGroup, false);
        this.djBIcL = c5663aAiCopydefault;
        if (c5663aAiCopydefault != null) {
            return c5663aAiCopydefault.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.view.Window window;
        Intrinsics.checkNotNullParameter(view, "");
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setStatusBarColor(ContextCompat.getColor(requireContext(), C52761wXj.Activity.EZpvd));
        }
        gEmmrt();
        djBIcL();
    }

    /* JADX INFO: renamed from: o.aRF$Application */
    public static final class Application implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C52794wYp c52794wYp;
            C5663aAi c5663aAi = C6535aRF.this.djBIcL;
            if (c5663aAi == null || (c52794wYp = c5663aAi.EZpvd) == null) {
                return;
            }
            c52794wYp.setEnabled(java.lang.String.valueOf(editable).length() > 0);
        }
    }

    private final void gEmmrt() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        OKEditText oKEditText;
        android.widget.TextView textView3;
        C52794wYp c52794wYp;
        C5663aAi c5663aAi;
        SimpleToolBar simpleToolBar;
        SimpleToolBar simpleToolBar2;
        C5663aAi c5663aAi2 = this.djBIcL;
        if (c5663aAi2 != null && (simpleToolBar2 = c5663aAi2.copydefault) != null) {
            simpleToolBar2.setNavigationOnClickListener(new Function0() { // from class: o.aRG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C6535aRF.gEmmrt(this.AEQbTJ);
                }
            });
        }
        if (AhwBna() == Fido2VerificationOption.SMS && (c5663aAi = this.djBIcL) != null && (simpleToolBar = c5663aAi.copydefault) != null) {
            simpleToolBar.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.QOLQEE));
        }
        C5663aAi c5663aAi3 = this.djBIcL;
        if (c5663aAi3 != null && (c52794wYp = c5663aAi3.EZpvd) != null) {
            c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        }
        valueOf().OLrzqt(AhwBna());
        C5663aAi c5663aAi4 = this.djBIcL;
        if (c5663aAi4 != null && (textView3 = c5663aAi4.AhwBna) != null) {
            int i = ActionBar.OLrzqt[AhwBna().ordinal()];
            textView3.setVisibility((i == 1 || i == 2) ? 0 : 8);
        }
        C5663aAi c5663aAi5 = this.djBIcL;
        if (c5663aAi5 != null && (oKEditText = c5663aAi5.gEmmrt) != null) {
            oKEditText.addTextChangedListener(new Application());
        }
        C5663aAi c5663aAi6 = this.djBIcL;
        if (c5663aAi6 != null && (textView2 = c5663aAi6.AhwBna) != null) {
            textView2.setOnClickListener(new FragmentManager(textView2, 1000L, this));
        }
        C5663aAi c5663aAi7 = this.djBIcL;
        if (c5663aAi7 == null || (textView = c5663aAi7.AkhnZx) == null) {
            return;
        }
        textView.setOnClickListener(new LoaderManager(textView, 1000L, this));
    }

    public static final Unit gEmmrt(C6535aRF c6535aRF) {
        if (c6535aRF.getActivity() instanceof ActivityC6573aRr) {
            FragmentActivity activity = c6535aRF.getActivity();
            Intrinsics.copydefault(activity, "");
            ActivityC6573aRr.finishAction$default((ActivityC6573aRr) activity, null, 1, null);
        } else {
            FragmentActivity activity2 = c6535aRF.getActivity();
            if (activity2 != null) {
                activity2.onBackPressed();
            }
        }
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        android.widget.TextView textView;
        C6690aUB.KWHzl(valueOf().valueOf(), this, new PasskeyTwoFaOtpFragment$setupObserver$1(this, null));
        C6690aUB.KWHzl(valueOf().AhwBna(), this, new PasskeyTwoFaOtpFragment$setupObserver$2(null));
        C6690aUB.KWHzl(valueOf().KWHzl(), this, new PasskeyTwoFaOtpFragment$setupObserver$3(this, null));
        C5663aAi c5663aAi = this.djBIcL;
        if (c5663aAi != null && (textView = c5663aAi.DbNXlk) != null) {
            textView.setOnClickListener(new TaskDescription(textView, 1000L, this));
        }
        C6690aUB.KWHzl(valueOf().copydefault(), this, new PasskeyTwoFaOtpFragment$setupObserver$5(this, null));
        C6690aUB.KWHzl(valueOf().EZpvd(), this, new PasskeyTwoFaOtpFragment$setupObserver$6(this, null));
        C6690aUB.KWHzl(valueOf().OLrzqt(), this, new PasskeyTwoFaOtpFragment$setupObserver$7(this, null));
        C6690aUB.KWHzl(valueOf().AEQbTJ(), this, new PasskeyTwoFaOtpFragment$setupObserver$8(this, null));
    }

    /* JADX INFO: renamed from: o.aRF$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C6535aRF copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C6535aRF c6535aRF) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c6535aRF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            OKEditText oKEditText;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                PasskeyTwoFaOtpViewModel passkeyTwoFaOtpViewModelValueOf = this.copydefault.valueOf();
                Fido2VerificationOption fido2VerificationOptionAhwBna = this.copydefault.AhwBna();
                C5663aAi c5663aAi = this.copydefault.djBIcL;
                passkeyTwoFaOtpViewModelValueOf.KWHzl(fido2VerificationOptionAhwBna, java.lang.String.valueOf((c5663aAi == null || (oKEditText = c5663aAi.gEmmrt) == null) ? null : oKEditText.getText()));
            }
        }
    }

    /* JADX INFO: renamed from: o.aRF$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ C6535aRF EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C6535aRF c6535aRF) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c6535aRF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                PasskeyTwoFaOtpViewModel passkeyTwoFaOtpViewModelValueOf = this.EZpvd.valueOf();
                Fido2VerificationOption fido2VerificationOptionAhwBna = this.EZpvd.AhwBna();
                FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                passkeyTwoFaOtpViewModelValueOf.OLrzqt(fido2VerificationOptionAhwBna, fragmentActivityRequireActivity);
            }
        }
    }

    /* JADX INFO: renamed from: o.aRF$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ C6535aRF EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C6535aRF c6535aRF) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c6535aRF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                PasskeyTwoFaOtpViewModel passkeyTwoFaOtpViewModelValueOf = this.EZpvd.valueOf();
                Fido2VerificationOption fido2VerificationOptionAhwBna = this.EZpvd.AhwBna();
                FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                passkeyTwoFaOtpViewModelValueOf.copydefault(fido2VerificationOptionAhwBna, fragmentActivityRequireActivity);
            }
        }
    }

    /* JADX INFO: renamed from: o.aRF$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C6535aRF copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C6535aRF c6535aRF) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = c6535aRF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            android.widget.LinearLayout linearLayout;
            android.widget.LinearLayout linearLayout2;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C5663aAi c5663aAi = this.copydefault.djBIcL;
                if (c5663aAi == null || (linearLayout = c5663aAi.values) == null) {
                    return;
                }
                C5663aAi c5663aAi2 = this.copydefault.djBIcL;
                linearLayout.setVisibility((c5663aAi2 == null || (linearLayout2 = c5663aAi2.values) == null || linearLayout2.getVisibility() != 0) ? 0 : 8);
            }
        }
    }
}
