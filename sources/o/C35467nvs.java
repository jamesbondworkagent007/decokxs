package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.config.serviceprovider.ObserverSource;
import com.okinc.im.imui.broadcastmessages.BroadcastMessagePageParam;
import com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$initView$2;
import com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$initView$3;
import com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$initView$4;
import com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$initView$5;
import com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$initView$6;
import com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$initView$7;
import com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$initView$8;
import com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$initView$9;
import com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragmentViewModel;
import com.okinc.rxutils.RxBus;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nvs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35467nvs extends AbstractC35426nvD {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public android.app.Dialog AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm KWHzl;
    public final int OLrzqt;
    public final InterfaceC56387yDm copydefault = C35377nuF.copydefault(this);
    public C33895nJv djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    public C35467nvs() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$viewModels$default$2
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BroadcastMessagesMainFragmentViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$viewModels$default$5
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C35474nvz.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$activityViewModels$default$3
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C35431nvI.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$activityViewModels$default$6
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C35461nvm.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$activityViewModels$default$9
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C35443nvU.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$activityViewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$activityViewModels$default$12
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C35450nvb.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$activityViewModels$default$13
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$activityViewModels$default$14
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragment$special$$inlined$activityViewModels$default$15
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

    /* JADX INFO: renamed from: o.nvs$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nvs.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C35467nvs KWHzl(@NotNull BroadcastMessagePageParam broadcastMessagePageParam) {
            Intrinsics.checkNotNullParameter(broadcastMessagePageParam, "");
            C35467nvs c35467nvs = new C35467nvs();
            c35467nvs.setArguments(C35377nuF.OLrzqt(broadcastMessagePageParam));
            return c35467nvs;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BroadcastMessagePageParam DbNXlk() {
        return (BroadcastMessagePageParam) this.copydefault.getValue();
    }

    public final BroadcastMessagesMainFragmentViewModel gEmmrt() {
        return (BroadcastMessagesMainFragmentViewModel) this.values.getValue();
    }

    /* JADX DEBUG: Possible override for method o.nvD.EZpvd()V */
    public final C35474nvz EZpvd() {
        return (C35474nvz) this.KWHzl.getValue();
    }

    public final C35431nvI AEQbTJ() {
        return (C35431nvI) this.AhwBna.getValue();
    }

    public final C35461nvm OLrzqt() {
        return (C35461nvm) this.valueOf.getValue();
    }

    public final C35443nvU AYXKKw() {
        return (C35443nvU) this.AYXKKw.getValue();
    }

    public final C35450nvb KWHzl() {
        return (C35450nvb) this.gEmmrt.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        android.app.Dialog dialog = this.AEQbTJ;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.AEQbTJ = null;
        this.djBIcL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        RxBus.KWHzl("event_created_affiliate_group");
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33895nJv c33895nJvOLrzqt = C33895nJv.OLrzqt(layoutInflater, viewGroup, false);
        this.djBIcL = c33895nJvOLrzqt;
        if (c33895nJvOLrzqt != null) {
            return c33895nJvOLrzqt.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        djBIcL();
        AhwBna();
        valueOf();
        isConnected();
        C35290nsY.AEQbTJ(this, ObserverSource.MessageListMainFragment, (Function1<? super java.util.ArrayList<GeneralAction>, Unit>) new Function1() { // from class: o.nvB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35467nvs.AEQbTJ(this.AEQbTJ, (java.util.ArrayList) obj);
            }
        });
        FlowKt.launchIn(FlowKt.onEach(OLrzqt().EZpvd(), new BroadcastMessagesMainFragment$initView$2(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(AEQbTJ().EZpvd(), new BroadcastMessagesMainFragment$initView$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(gEmmrt().EZpvd(), new BroadcastMessagesMainFragment$initView$4(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(gEmmrt().AEQbTJ(), new BroadcastMessagesMainFragment$initView$5(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(gEmmrt().KWHzl(), new BroadcastMessagesMainFragment$initView$6(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(gEmmrt().OLrzqt(), new BroadcastMessagesMainFragment$initView$7(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(gEmmrt().copydefault(), new BroadcastMessagesMainFragment$initView$8(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(gEmmrt().AYXKKw(), new BroadcastMessagesMainFragment$initView$9(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        view.post(new java.lang.Runnable() { // from class: o.nvx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C35467nvs.djBIcL(this.copydefault);
            }
        });
    }

    public static final void djBIcL(C35467nvs c35467nvs) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c35467nvs, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AhwBna() {
        getChildFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.QSAYLr, C35441nvS.Companion.copydefault(DbNXlk())).commitAllowingStateLoss();
    }

    public final void djBIcL() {
        getChildFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.iqeXgQ, C35428nvF.Companion.EZpvd(DbNXlk())).commitAllowingStateLoss();
    }

    public final void valueOf() {
        getChildFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.HJWChPRGtXKCDKRTZD, C35454nvf.Companion.AEQbTJ(DbNXlk())).commitAllowingStateLoss();
    }

    public final void isConnected() {
        getChildFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.HJWChPfvRMlC, C36965oks.Companion.OLrzqt()).commitAllowingStateLoss();
    }

    public static final Unit AEQbTJ(C35467nvs c35467nvs, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            GeneralAction generalAction = (GeneralAction) it.next();
            if (generalAction instanceof GeneralAction.SendMessages) {
                c35467nvs.gEmmrt().OLrzqt(c35467nvs.DbNXlk().AEQbTJ().AEQbTJ(), ((GeneralAction.SendMessages) generalAction).copydefault());
            } else if (generalAction instanceof GeneralAction.OpenDialog) {
                Function1<android.content.Context, android.app.Dialog> function1AEQbTJ = ((GeneralAction.OpenDialog) generalAction).AEQbTJ();
                android.content.Context contextRequireContext = c35467nvs.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                android.app.Dialog dialogInvoke = function1AEQbTJ.invoke(contextRequireContext);
                android.app.Dialog dialog = c35467nvs.AEQbTJ;
                if (dialog != null) {
                    dialog.dismiss();
                }
                c35467nvs.AEQbTJ = dialogInvoke;
                if (dialogInvoke != null) {
                    dialogInvoke.show();
                }
            } else if (generalAction instanceof GeneralAction.OpenMediaPickerToast) {
                C55326xho.toastWithFailedIcon$default(((GeneralAction.OpenMediaPickerToast) generalAction).OLrzqt(), 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }
}
