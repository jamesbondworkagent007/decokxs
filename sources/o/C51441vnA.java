package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewStubProxy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.biz.TacticsType;
import com.okinc.rxutils.RxBus;
import com.okinc.tradingbot.impl.market_place.MarketPlacePresenter;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.MpCategory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC52122vzt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vnA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51441vnA extends android.widget.FrameLayout {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public C47977uAk gEmmrt;
    public InterfaceC58217yxC valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51441vnA(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final boolean OLrzqt(android.view.View view) {
        return true;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:53) call: o.vnA.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C51441vnA(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51441vnA(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.vnB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51441vnA.AYXKKw(this.copydefault);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.vnx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51441vnA.gEmmrt(this.copydefault);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vnF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51441vnA.KWHzl(context, this);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vnD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51441vnA.AhwBna(this.KWHzl);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vnG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51441vnA.valueOf(this.AEQbTJ);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.vnC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51441vnA.EZpvd();
            }
        });
    }

    /* JADX INFO: renamed from: o.vnA$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vnA.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    private final androidx.fragment.app.Fragment AYXKKw() {
        return (androidx.fragment.app.Fragment) this.AhwBna.getValue();
    }

    public static final androidx.fragment.app.Fragment AYXKKw(C51441vnA c51441vnA) {
        return ViewKt.findFragment(c51441vnA);
    }

    public static final InterfaceC56387yDm gEmmrt(C51441vnA c51441vnA) {
        final androidx.fragment.app.Fragment fragmentAYXKKw = c51441vnA.AYXKKw();
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.market_place.home.create_bot.view.MarketPlaceBotCreateView$presenter_delegate$lambda$1$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragmentAYXKKw;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.market_place.home.create_bot.view.MarketPlaceBotCreateView$presenter_delegate$lambda$1$$inlined$viewModels$default$2
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
        return FragmentViewModelLazyKt.createViewModelLazy(fragmentAYXKKw, C56524yIo.AEQbTJ(MarketPlacePresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.home.create_bot.view.MarketPlaceBotCreateView$presenter_delegate$lambda$1$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.home.create_bot.view.MarketPlaceBotCreateView$presenter_delegate$lambda$1$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.home.create_bot.view.MarketPlaceBotCreateView$presenter_delegate$lambda$1$$inlined$viewModels$default$5
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
                    defaultViewModelProviderFactory = fragmentAYXKKw.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final InterfaceC56387yDm<MarketPlacePresenter> isConnected() {
        return (InterfaceC56387yDm) this.AYXKKw.getValue();
    }

    private final AbstractC48578uWp AEQbTJ() {
        return (AbstractC48578uWp) this.copydefault.getValue();
    }

    public static final AbstractC48578uWp KWHzl(android.content.Context context, C51441vnA c51441vnA) {
        return (AbstractC48578uWp) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.gqOnQv, c51441vnA, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC48575uWm AhwBna() {
        return (AbstractC48575uWm) this.KWHzl.getValue();
    }

    public static final AbstractC48575uWm AhwBna(C51441vnA c51441vnA) {
        ViewStubProxy viewStubProxy = c51441vnA.AEQbTJ().KWHzl;
        Intrinsics.checkNotNullExpressionValue(viewStubProxy, "");
        return (AbstractC48575uWm) C33131mqf.OLrzqt(viewStubProxy);
    }

    private final AbstractC48571uWi valueOf() {
        return (AbstractC48571uWi) this.AEQbTJ.getValue();
    }

    public static final AbstractC48571uWi valueOf(C51441vnA c51441vnA) {
        ViewStubProxy viewStubProxy = c51441vnA.AEQbTJ().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(viewStubProxy, "");
        return (AbstractC48571uWi) C33131mqf.OLrzqt(viewStubProxy);
    }

    public static final C59534zip EZpvd() {
        return new C59534zip();
    }

    private final C59534zip gEmmrt() {
        return (C59534zip) this.OLrzqt.getValue();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        C55867xrz.KWHzl.AEQbTJ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("event_update_layout");
        final Function1 function1 = new Function1() { // from class: o.vnK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51441vnA.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        this.valueOf = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.vny
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C51441vnA.copydefault(function1, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C51441vnA c51441vnA, java.lang.String str) {
        C47977uAk c47977uAk = c51441vnA.gEmmrt;
        if (c47977uAk != null) {
            c47977uAk.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarketPlacePresenter djBIcL() {
        return isConnected().getValue();
    }

    public final void OLrzqt() {
        MpCategory mpCategoryAEQbTJ;
        java.util.List<java.lang.String> defaultContent;
        java.util.List<C51488vnv> listDbNXlk = djBIcL().DbNXlk();
        if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(listDbNXlk.size()), (java.lang.Object) 1)) {
            C51488vnv c51488vnv = (C51488vnv) CollectionsKt___CollectionsKt.firstOrNull(listDbNXlk);
            if (C33129mqd.valueOf((c51488vnv == null || (mpCategoryAEQbTJ = c51488vnv.AEQbTJ()) == null || (defaultContent = mpCategoryAEQbTJ.getDefaultContent()) == null) ? null : java.lang.Integer.valueOf(defaultContent.size()), 2)) {
                AEQbTJ(listDbNXlk);
                return;
            }
        }
        OLrzqt(listDbNXlk);
    }

    public final void OLrzqt(java.util.List<C51488vnv> list) {
        if (AEQbTJ().KWHzl.isInflated()) {
            return;
        }
        copydefault();
        KWHzl(list);
    }

    public final void KWHzl(final java.util.List<C51488vnv> list) {
        AppCompatTextView appCompatTextView = AhwBna().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        wPQ.KWHzl(appCompatTextView, C56071xvr.gEmmrt.DbNXlk());
        androidx.fragment.app.FragmentManager childFragmentManager = AYXKKw().getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Lifecycle lifecycle = AYXKKw().getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        C47976uAj c47976uAj = new C47976uAj(childFragmentManager, list, lifecycle, null, 8, null);
        ViewPager2 viewPager2 = AhwBna().EZpvd;
        if (!list.isEmpty()) {
            viewPager2.setOffscreenPageLimit(list.size());
        }
        viewPager2.setAdapter(c47976uAj);
        C47977uAk c47977uAk = this.gEmmrt;
        if (c47977uAk != null) {
            c47977uAk.EZpvd();
        }
        Intrinsics.copydefault(viewPager2);
        C47977uAk c47977uAk2 = new C47977uAk(viewPager2, childFragmentManager);
        this.gEmmrt = c47977uAk2;
        c47977uAk2.KWHzl(c47976uAj);
        AhwBna().copydefault.KWHzl(false);
        new TabLayoutMediator(AhwBna().copydefault.copydefault(), AhwBna().EZpvd, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.vnI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C51441vnA.EZpvd(list, this, tab, i);
            }
        }).attach();
    }

    public static final void EZpvd(java.util.List list, C51441vnA c51441vnA, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.vnz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C51441vnA.OLrzqt(view);
            }
        });
        MpCategory mpCategoryAEQbTJ = ((C51488vnv) list.get(i)).AEQbTJ();
        tab.setText(c51441vnA.djBIcL().AEQbTJ(mpCategoryAEQbTJ.getName()));
        tab.setTag(mpCategoryAEQbTJ);
    }

    public final void copydefault() {
        AhwBna().OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.vnE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51441vnA.OLrzqt(this.KWHzl, view);
            }
        });
        AhwBna().copydefault.AEQbTJ(new TaskDescription());
    }

    public static final void OLrzqt(C51441vnA c51441vnA, android.view.View view) {
        if (!view.isSelected()) {
            C55867xrz.botCreateCardClick$default(C55867xrz.KWHzl, "more", null, 2, null);
        }
        view.setSelected(!view.isSelected());
        c51441vnA.AhwBna().OLrzqt.setText(C33070mpX.AYXKKw(view.isSelected() ? C55688xof.Application.invokeSuspendlambda1 : C55688xof.Application.r8lambdatX1ZAZ_6mxGyPSL59qbNSbD0n4g));
        java.lang.Object tag = view.getTag();
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str != null) {
            c51441vnA.AYXKKw().getChildFragmentManager().setFragmentResult("bot_category_fold" + str, BundleKt.bundleOf(C56390yDp.OLrzqt("bot_category_state", java.lang.Boolean.valueOf(view.isSelected()))));
        }
    }

    /* JADX INFO: renamed from: o.vnA$TaskDescription */
    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public TaskDescription() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.Object tag = tab != null ? tab.getTag() : null;
            MpCategory mpCategory = tag instanceof MpCategory ? (MpCategory) tag : null;
            if (mpCategory != null) {
                C51441vnA c51441vnA = C51441vnA.this;
                AppCompatTextView appCompatTextView = c51441vnA.AhwBna().OLrzqt;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                appCompatTextView.setVisibility(c51441vnA.djBIcL().OLrzqt(mpCategory) > 1 ? 0 : 8);
                c51441vnA.AhwBna().OLrzqt.setTag(mpCategory.getName());
                C55867xrz.botCreateCardClick$default(C55867xrz.KWHzl, mpCategory.getName(), null, 2, null);
            }
        }
    }

    public final void AEQbTJ(java.util.List<C51488vnv> list) {
        java.util.List<java.lang.String> listAhwBna;
        java.lang.String strAYXKKw;
        C51484vnr c51484vnr;
        MpCategory mpCategoryAEQbTJ;
        if (AEQbTJ().OLrzqt.isInflated()) {
            return;
        }
        C56071xvr c56071xvr = C56071xvr.gEmmrt;
        android.view.View root = valueOf().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        wPQ.OLrzqt(root, c56071xvr.fIwbmz());
        gEmmrt().register(C51484vnr.class, new C51487vnu(new Function1() { // from class: o.vnL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51441vnA.OLrzqt(this.KWHzl, (C51484vnr) obj);
            }
        }));
        RecyclerView recyclerView = valueOf().OLrzqt;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
        recyclerView.addItemDecoration(new C57584ylF(2, C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null)));
        recyclerView.setAdapter(gEmmrt());
        C51488vnv c51488vnv = (C51488vnv) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (c51488vnv == null || (mpCategoryAEQbTJ = c51488vnv.AEQbTJ()) == null || (listAhwBna = mpCategoryAEQbTJ.getDefaultContent()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listAhwBna) {
            if (TacticsType.Companion.EZpvd().contains((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.String str : arrayList) {
            C51469vnc c51469vncConvertSelectBotConfig$default = C51468vnb.convertSelectBotConfig$default(str, false, 2, null);
            if (c51469vncConvertSelectBotConfig$default == null) {
                c51484vnr = null;
            } else {
                int iCopydefault = c51469vncConvertSelectBotConfig$default.copydefault();
                TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(str);
                if (tacticsTypeAEQbTJ == null || (strAYXKKw = C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName())) == null) {
                    strAYXKKw = "";
                }
                c51484vnr = new C51484vnr("", str, iCopydefault, strAYXKKw);
            }
            if (c51484vnr != null) {
                arrayList2.add(c51484vnr);
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList2) {
            if (hashSet.add(((C51484vnr) obj2).AEQbTJ())) {
                arrayList3.add(obj2);
            }
        }
        C33064mpR.OLrzqt(gEmmrt(), arrayList3);
    }

    public static final Unit OLrzqt(C51441vnA c51441vnA, C51484vnr c51484vnr) {
        Intrinsics.checkNotNullParameter(c51484vnr, "");
        BotTradeData botTradeData = new BotTradeData(c51484vnr.AEQbTJ(), c51441vnA.isConnected().getValue().values().KWHzl(), c51441vnA.isConnected().getValue().values().copydefault(), (android.os.Parcelable) null, false, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, (DefaultConstructorMarker) null);
        ActivityC52122vzt.Application application = ActivityC52122vzt.Companion;
        android.content.Context context = c51441vnA.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        application.OLrzqt(context, botTradeData, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "bot_home_recommend", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
        return Unit.INSTANCE;
    }
}
