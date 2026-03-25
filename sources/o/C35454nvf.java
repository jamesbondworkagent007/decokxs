package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.im.imui.broadcastmessages.BroadcastMessagePageParam;
import com.okinc.im.imui.broadcastmessages.inputpanel.BroadcastMessageInputPanelFragment$initView$2;
import com.okinc.im.imui.broadcastmessages.inputpanel.BroadcastMessageInputPanelFragment$initView$3;
import com.okinc.im.imui.broadcastmessages.inputpanel.BroadcastMessageInputPanelFragment$initView$4;
import com.okinc.im.imui.broadcastmessages.inputpanel.BroadcastMessageInputPanelFragmentViewModel;
import com.okinc.im.usecase.ObserveKeyboardInputStateUseCase;
import com.okinc.im.widgets.inputpanel.InputMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nvf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35454nvf extends AbstractC35462nvn {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final int AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public C33893nJt KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    public C35454nvf() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.broadcastmessages.inputpanel.BroadcastMessageInputPanelFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.broadcastmessages.inputpanel.BroadcastMessageInputPanelFragment$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BroadcastMessageInputPanelFragmentViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.broadcastmessages.inputpanel.BroadcastMessageInputPanelFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.broadcastmessages.inputpanel.BroadcastMessageInputPanelFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.broadcastmessages.inputpanel.BroadcastMessageInputPanelFragment$special$$inlined$viewModels$default$5
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C35461nvm.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.broadcastmessages.inputpanel.BroadcastMessageInputPanelFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.broadcastmessages.inputpanel.BroadcastMessageInputPanelFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.broadcastmessages.inputpanel.BroadcastMessageInputPanelFragment$special$$inlined$activityViewModels$default$3
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
        this.OLrzqt = C35377nuF.copydefault(this);
    }

    /* JADX INFO: renamed from: o.nvf$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nvf.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C35454nvf AEQbTJ(@NotNull BroadcastMessagePageParam broadcastMessagePageParam) {
            Intrinsics.checkNotNullParameter(broadcastMessagePageParam, "");
            C35454nvf c35454nvf = new C35454nvf();
            c35454nvf.setArguments(C35377nuF.OLrzqt(broadcastMessagePageParam));
            return c35454nvf;
        }
    }

    public final BroadcastMessageInputPanelFragmentViewModel AYXKKw() {
        return (BroadcastMessageInputPanelFragmentViewModel) this.gEmmrt.getValue();
    }

    public final C35461nvm EZpvd() {
        return (C35461nvm) this.EZpvd.getValue();
    }

    /* JADX DEBUG: Possible override for method o.nvn.KWHzl()V */
    public final BroadcastMessagePageParam KWHzl() {
        return (BroadcastMessagePageParam) this.OLrzqt.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.KWHzl = null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33893nJt c33893nJtEZpvd = C33893nJt.EZpvd(layoutInflater, viewGroup, false);
        this.KWHzl = c33893nJtEZpvd;
        if (c33893nJtEZpvd != null) {
            return c33893nJtEZpvd.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C35934oJc c35934oJc;
        Intrinsics.checkNotNullParameter(view, "");
        C33893nJt c33893nJt = this.KWHzl;
        if (c33893nJt != null && (c35934oJc = c33893nJt.OLrzqt) != null) {
            c35934oJc.djBIcL().addTextChangedListener(new TaskDescription());
            c35934oJc.setOnProduceKeyboardInputState(new Function0() { // from class: o.nvh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C35454nvf.OLrzqt();
                }
            });
            c35934oJc.setOnClickSendButton(new Function0() { // from class: o.nve
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C35454nvf.AhwBna(this.OLrzqt);
                }
            });
            c35934oJc.setOnInputModeChange(new Function1() { // from class: o.nvd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C35454nvf.OLrzqt(this.OLrzqt, (InputMode) obj);
                }
            });
        }
        FlowKt.launchIn(FlowKt.onEach(AYXKKw().copydefault(), new BroadcastMessageInputPanelFragment$initView$2(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(AYXKKw().EZpvd(), new BroadcastMessageInputPanelFragment$initView$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(AYXKKw().KWHzl(), new BroadcastMessageInputPanelFragment$initView$4(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        view.post(new java.lang.Runnable() { // from class: o.nvg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C35454nvf.gEmmrt(this.copydefault);
            }
        });
    }

    public static final ObserveKeyboardInputStateUseCase.KeyboardInputState OLrzqt() {
        return ObserveKeyboardInputStateUseCase.KeyboardInputState.AllowInput;
    }

    public static final Unit AhwBna(C35454nvf c35454nvf) {
        c35454nvf.djBIcL();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C35454nvf c35454nvf, InputMode inputMode) {
        Intrinsics.checkNotNullParameter(inputMode, "");
        c35454nvf.EZpvd().EZpvd(inputMode);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.nvf$TaskDescription */
    public static final class TaskDescription implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C35454nvf.this.EZpvd().OLrzqt(editable != null ? editable.toString() : null);
        }
    }

    public static final void gEmmrt(C35454nvf c35454nvf) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c35454nvf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void djBIcL() {
        C35934oJc c35934oJc;
        android.widget.EditText editTextDjBIcL;
        android.text.Editable text;
        C33893nJt c33893nJt = this.KWHzl;
        java.lang.String string = (c33893nJt == null || (c35934oJc = c33893nJt.OLrzqt) == null || (editTextDjBIcL = c35934oJc.djBIcL()) == null || (text = editTextDjBIcL.getText()) == null) ? null : text.toString();
        if (string != null) {
            AYXKKw().EZpvd(false, yDY.copydefault(new SendMessageRequestParam.Text(string, null, 2, null)));
        }
    }
}
