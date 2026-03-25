package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.planet.biz_home.feed_tab.PlanetFeedContainerFragment$observeViewModels$1;
import com.okinc.planet.biz_home.feed_tab.PlanetFeedContainerFragment$observeViewModels$2;
import com.okinc.planet.ext.FragmentExtKt$repeatListenRxEventOnResume$1;
import com.okinc.rxutils.RxBus;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C46370tRv;
import o.C47501trL;
import o.C7323ahf;
import o.InterfaceC58217yxC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tyc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47888tyc extends AbstractC32996moC {
    private static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.txZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C47888tyc.copydefault(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm KWHzl;
    public tNI OLrzqt;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.AxsJAYsNCnLh;
    }

    public C47888tyc() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_home.feed_tab.PlanetFeedContainerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_home.feed_tab.PlanetFeedContainerFragment$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47906tyu.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_home.feed_tab.PlanetFeedContainerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_home.feed_tab.PlanetFeedContainerFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_home.feed_tab.PlanetFeedContainerFragment$special$$inlined$viewModels$default$5
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47911tyz.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_home.feed_tab.PlanetFeedContainerFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_home.feed_tab.PlanetFeedContainerFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_home.feed_tab.PlanetFeedContainerFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.tyc$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tyc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final C47503trN copydefault(C47888tyc c47888tyc) {
        androidx.fragment.app.FragmentManager childFragmentManager = c47888tyc.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Lifecycle lifecycle = c47888tyc.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        return new C47503trN(childFragmentManager, lifecycle);
    }

    public final C47503trN OLrzqt() {
        return (C47503trN) this.EZpvd.getValue();
    }

    public final C47906tyu EZpvd() {
        return (C47906tyu) this.valueOf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C47911tyz copydefault() {
        return (C47911tyz) this.KWHzl.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void AEQbTJ(tNI tni) {
        OLrzqt().AEQbTJ(AEQbTJ());
        tni.copydefault.setAdapter(OLrzqt());
        tni.copydefault.setUserInputEnabled(false);
    }

    public final java.util.List<AbstractC32996moC> AEQbTJ() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new C47571tsd());
        arrayList.add(new C47513trX());
        arrayList.add(new C47570tsc());
        return arrayList;
    }

    private final void KWHzl() {
        EZpvd().KWHzl(copydefault().AEQbTJ());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PlanetFeedContainerFragment$observeViewModels$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PlanetFeedContainerFragment$observeViewModels$2(this, null), 3, null);
    }

    public final void EZpvd(C47908tyw c47908tyw) {
        ViewPager2 viewPager2;
        tNI tni = this.OLrzqt;
        if (tni == null || (viewPager2 = tni.copydefault) == null || viewPager2.getCurrentItem() == c47908tyw.AEQbTJ()) {
            return;
        }
        viewPager2.setCurrentItem(c47908tyw.AEQbTJ(), false);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        final java.lang.String[] strArr = {"event.main_planet_tab_reselect"};
        getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.planet.biz_home.feed_tab.PlanetFeedContainerFragment$initView$$inlined$repeatListenRxEventOnResume$1
            public InterfaceC58217yxC OLrzqt;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onResume(lifecycleOwner);
                String[] strArr2 = strArr;
                this.OLrzqt = RxBus.AEQbTJ((String[]) Arrays.copyOf(strArr2, strArr2.length)).AEQbTJ(new C46370tRv.TaskDescription(new Function1<String, Unit>() { // from class: com.okinc.planet.biz_home.feed_tab.PlanetFeedContainerFragment$initView$$inlined$repeatListenRxEventOnResume$1.2
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(String str) {
                        copydefault(str);
                        return Unit.INSTANCE;
                    }

                    public final void copydefault(String str) {
                        Intrinsics.copydefault((Object) str);
                        C7323ahf.KWHzl().AEQbTJ("MarketFeeds_TabBar_Refresh_Notification_Key", null, null);
                    }
                }), new C46370tRv.TaskDescription(FragmentExtKt$repeatListenRxEventOnResume$1.TaskDescription.EZpvd));
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                super.onPause(lifecycleOwner);
            }
        });
        tNI tniKWHzl = tNI.KWHzl(view);
        Intrinsics.copydefault(tniKWHzl);
        AEQbTJ(tniKWHzl);
        this.OLrzqt = tniKWHzl;
        KWHzl();
    }
}
