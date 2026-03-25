package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.broadcastmessages.BroadcastMessagePageParam;
import com.okinc.im.imui.broadcastmessages.messagelist.BroadcastMessageListFragment$initView$3;
import com.okinc.im.imui.broadcastmessages.messagelist.BroadcastMessageListFragment$initView$4;
import com.okinc.im.imui.broadcastmessages.messagelist.BroadcastMessageListFragment$initView$6;
import com.okinc.im.imui.broadcastmessages.messagelist.BroadcastMessageListFragment$initView$7;
import com.okinc.im.imui.broadcastmessages.messagelist.BroadcastMessageListFragmentViewModel;
import com.okinc.rxutils.RxBus;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nvF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35428nvF extends AbstractC35438nvP {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final C37002olc AEQbTJ = new C37002olc();
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final int EZpvd;
    public InterfaceC58217yxC KWHzl;
    public C37005olf copydefault;
    public final InterfaceC56387yDm djBIcL;
    public C33891nJr valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    public C35428nvF() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.broadcastmessages.messagelist.BroadcastMessageListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.broadcastmessages.messagelist.BroadcastMessageListFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BroadcastMessageListFragmentViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.broadcastmessages.messagelist.BroadcastMessageListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.broadcastmessages.messagelist.BroadcastMessageListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.broadcastmessages.messagelist.BroadcastMessageListFragment$special$$inlined$viewModels$default$5
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C35431nvI.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.broadcastmessages.messagelist.BroadcastMessageListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.broadcastmessages.messagelist.BroadcastMessageListFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.broadcastmessages.messagelist.BroadcastMessageListFragment$special$$inlined$activityViewModels$default$3
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
        this.AYXKKw = C35377nuF.copydefault(this);
    }

    /* JADX INFO: renamed from: o.nvF$Activity */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nvF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C35428nvF EZpvd(@NotNull BroadcastMessagePageParam broadcastMessagePageParam) {
            Intrinsics.checkNotNullParameter(broadcastMessagePageParam, "");
            C35428nvF c35428nvF = new C35428nvF();
            c35428nvF.setArguments(C35377nuF.OLrzqt(broadcastMessagePageParam));
            return c35428nvF;
        }
    }

    /* JADX DEBUG: Possible override for method o.nvP.AEQbTJ()V */
    public final BroadcastMessageListFragmentViewModel AEQbTJ() {
        return (BroadcastMessageListFragmentViewModel) this.djBIcL.getValue();
    }

    public final C35431nvI KWHzl() {
        return (C35431nvI) this.AhwBna.getValue();
    }

    private final BroadcastMessagePageParam AhwBna() {
        return (BroadcastMessagePageParam) this.AYXKKw.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.KWHzl = null;
        this.valueOf = null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33891nJr c33891nJrOLrzqt = C33891nJr.OLrzqt(layoutInflater, viewGroup, false);
        this.valueOf = c33891nJrOLrzqt;
        if (c33891nJrOLrzqt != null) {
            return c33891nJrOLrzqt.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(oAU.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.nvJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35428nvF.copydefault(this.copydefault, (oAU) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.nvL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C35428nvF.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.nvH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35428nvF.EZpvd((java.lang.Throwable) obj);
            }
        };
        this.KWHzl = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.nvK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C35428nvF.copydefault(function12, obj);
            }
        });
        FlowKt.launchIn(FlowKt.onEach(KWHzl().OLrzqt(), new BroadcastMessageListFragment$initView$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(AEQbTJ().copydefault(), new BroadcastMessageListFragment$initView$4(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        C33891nJr c33891nJr = this.valueOf;
        if (c33891nJr != null && (recyclerView = c33891nJr.EZpvd) != null) {
            recyclerView.setItemAnimator(null);
            C37002olc c37002olc = this.AEQbTJ;
            C35693oAe c35693oAe = C35693oAe.AEQbTJ;
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            C37005olf c37005olfOLrzqt = c37002olc.OLrzqt(c35693oAe, true, (10112 & 4) != 0 ? null : null, (10112 & 8) != 0 ? false : false, (10112 & 16) != 0 ? null : null, (10112 & 32) != 0 ? null : null, (10112 & 64) != 0 ? null : null, (10112 & 128) != 0 ? null : null, (10112 & 256) != 0 ? null : null, (10112 & 512) != 0 ? null : null, (10112 & 1024) != 0 ? null : null, viewLifecycleOwner, (10112 & 4096) != 0 ? false : false, (10112 & 8192) != 0 ? null : null);
            this.copydefault = c37005olfOLrzqt;
            recyclerView.setAdapter(c37005olfOLrzqt);
        }
        FlowKt.launchIn(FlowKt.onEach(AEQbTJ().AEQbTJ(), new BroadcastMessageListFragment$initView$6(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(AEQbTJ().OLrzqt(), new BroadcastMessageListFragment$initView$7(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        AEQbTJ().OLrzqt(AhwBna());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C35428nvF c35428nvF, oAU oau) {
        c35428nvF.AEQbTJ().AEQbTJ(oau.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }
}
