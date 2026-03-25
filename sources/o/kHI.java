package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$1$1;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.tradeapi.bean.TradeGroupData;
import com.okinc.unify_trade.trade.source.SwapMarketDataSource;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class kHI extends AbstractC27870kGj {
    public static final Application Companion = new Application(null);
    public static final int uzCIH = 8;
    public MutableLiveData<SourceResp<AbstractC54646xQb>> getFieldNames;
    public SwapMarketDataSource getNewProxyInstance;
    public final Observer<SourceResp<AbstractC54646xQb>> hDKMBd = new Observer() { // from class: o.kHR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            kHI.OLrzqt(this.KWHzl, (SourceResp) obj);
        }
    };

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27870kGj
    public AbstractC54646xQb AhwBna() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27870kGj
    public java.lang.String ejfBZ() {
        return "SWAP";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27870kGj
    public java.lang.Boolean[] values() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        return new java.lang.Boolean[]{bool, bool, bool, bool};
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kHI.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final kHI AEQbTJ(@NotNull TradeGroupData tradeGroupData) {
            Intrinsics.checkNotNullParameter(tradeGroupData, "");
            kHI khi = new kHI();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("market_tab_group_data", tradeGroupData);
            khi.setArguments(bundle);
            return khi;
        }
    }

    public static final void OLrzqt(final kHI khi, SourceResp sourceResp) {
        Intrinsics.checkNotNullParameter(sourceResp, "");
        if (Intrinsics.EZpvd(sourceResp.isSuccess(), java.lang.Boolean.TRUE)) {
            java.lang.Object data = sourceResp.getData();
            SwapMarketDataSource swapMarketDataSource = data instanceof SwapMarketDataSource ? (SwapMarketDataSource) data : null;
            khi.getNewProxyInstance = swapMarketDataSource;
            if (swapMarketDataSource != null) {
                swapMarketDataSource.OLrzqt(false);
            }
            khi.getFieldNames();
            SwapMarketDataSource swapMarketDataSource2 = khi.getNewProxyInstance;
            if (swapMarketDataSource2 != null) {
                swapMarketDataSource2.copydefault(new Function1() { // from class: o.kHP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return kHI.EZpvd(this.EZpvd, (java.util.ArrayList) obj);
                    }
                });
            }
            SwapMarketDataSource swapMarketDataSource3 = khi.getNewProxyInstance;
            if (swapMarketDataSource3 != null) {
                swapMarketDataSource3.gEmmrt(new Function1() { // from class: o.kHN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return kHI.copydefault(this.AEQbTJ, (java.lang.String) obj);
                    }
                });
                return;
            }
            return;
        }
        khi.hDKMBd();
    }

    public static final Unit EZpvd(final kHI khi, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C27889kHb.AEQbTJ.EZpvd(arrayList, new Function1() { // from class: o.kHJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kHI.KWHzl(this.EZpvd, (java.util.List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(kHI khi, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        khi.KWHzl((java.util.List<CoinQuote>) list);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(kHI khi, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        khi.hDKMBd();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC27870kGj, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        RecyclerView recyclerViewGEmmrt = gEmmrt();
        if (recyclerViewGEmmrt != null) {
            recyclerViewGEmmrt.setHasFixedSize(true);
        }
        isConnected().copydefault().observe(this, new ActionBar(new Function1() { // from class: o.kHV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kHI.AEQbTJ(this.KWHzl, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(kHI khi, java.lang.String str) {
        if (khi.isVisibled()) {
            khi.fARcdN();
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        isConnected().copydefault().removeObservers(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void EZpvd(InterfaceC54581xNr interfaceC54581xNr) {
        qTI qtiKWHzl;
        qTT qttKWHzl;
        C40395qUg c40395qUg;
        qTK qtk;
        MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.observe(this, this.hDKMBd);
        final androidx.fragment.app.Fragment parentFragment = getParentFragment();
        final Function0 function0 = null;
        if (parentFragment != null) {
            final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$lambda$7$$inlined$viewModels$default$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Fragment invoke() {
                    return parentFragment;
                }
            };
            final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$lambda$7$$inlined$viewModels$default$2
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
            InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(parentFragment, C56524yIo.AEQbTJ(qTK.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$lambda$7$$inlined$viewModels$default$3
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
            }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$lambda$7$$inlined$viewModels$default$4
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
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$lambda$7$$inlined$viewModels$default$5
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
                        defaultViewModelProviderFactory = parentFragment.getDefaultViewModelProviderFactory();
                    }
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                    return defaultViewModelProviderFactory;
                }
            });
            if (interfaceC56387yDmCreateViewModelLazy == null || (qtk = (qTK) interfaceC56387yDmCreateViewModelLazy.getValue()) == null || (qtiKWHzl = qtk.KWHzl()) == null) {
                final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$lambda$7$$inlined$viewModels$default$6
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
                final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$lambda$7$$inlined$viewModels$default$7
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final ViewModelStoreOwner invoke() {
                        return (ViewModelStoreOwner) function03.invoke();
                    }
                });
                qtiKWHzl = ((qTK) FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(qTK.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$lambda$7$$inlined$viewModels$default$8
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final ViewModelStore invoke() {
                        ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                        Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                        return viewModelStore;
                    }
                }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$lambda$7$$inlined$viewModels$default$9
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
                        Function0 function04 = function0;
                        if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                            return creationExtras;
                        }
                        ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                        CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                        return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
                    }
                }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$lambda$7$$inlined$viewModels$default$10
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
                        ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                        if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                            defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                        }
                        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                        return defaultViewModelProviderFactory;
                    }
                }).getValue()).KWHzl();
            }
        }
        qTI qti = qtiKWHzl;
        final androidx.fragment.app.Fragment parentFragment2 = getParentFragment();
        if (parentFragment2 != null) {
            Function0 function04 = new Function0() { // from class: o.kHO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return kHI.AubY();
                }
            };
            final Function0<androidx.fragment.app.Fragment> function05 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$lambda$7$$inlined$viewModels$default$11
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Fragment invoke() {
                    return parentFragment2;
                }
            };
            final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$lambda$7$$inlined$viewModels$default$12
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStoreOwner invoke() {
                    return (ViewModelStoreOwner) function05.invoke();
                }
            });
            InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy2 = FragmentViewModelLazyKt.createViewModelLazy(parentFragment2, C56524yIo.AEQbTJ(C40395qUg.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$lambda$7$$inlined$viewModels$default$13
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStore invoke() {
                    ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3).getViewModelStore();
                    Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                    return viewModelStore;
                }
            }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$lambda$7$$inlined$viewModels$default$14
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
                    Function0 function06 = function0;
                    if (function06 != null && (creationExtras = (CreationExtras) function06.invoke()) != null) {
                        return creationExtras;
                    }
                    ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                    CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                    return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
                }
            }, function04);
            if (interfaceC56387yDmCreateViewModelLazy2 == null || (c40395qUg = (C40395qUg) interfaceC56387yDmCreateViewModelLazy2.getValue()) == null || (qttKWHzl = c40395qUg.KWHzl()) == null) {
                Function0 function06 = new Function0() { // from class: o.kHQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return kHI.AuCTelauCTel();
                    }
                };
                final Function0<androidx.fragment.app.Fragment> function07 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$lambda$7$$inlined$viewModels$default$16
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
                final InterfaceC56387yDm interfaceC56387yDmEZpvd4 = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$lambda$7$$inlined$viewModels$default$17
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final ViewModelStoreOwner invoke() {
                        return (ViewModelStoreOwner) function07.invoke();
                    }
                });
                qttKWHzl = ((C40395qUg) FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C40395qUg.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$lambda$7$$inlined$viewModels$default$18
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final ViewModelStore invoke() {
                        ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd4).getViewModelStore();
                        Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                        return viewModelStore;
                    }
                }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.PerpetuaQuoteNewFragment$handleTradeData$lambda$7$$inlined$viewModels$default$19
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
                        Function0 function08 = function0;
                        if (function08 != null && (creationExtras = (CreationExtras) function08.invoke()) != null) {
                            return creationExtras;
                        }
                        ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd4);
                        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                        CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                        return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
                    }
                }, function06).getValue()).KWHzl();
            }
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PerpetuaQuoteNewFragment$handleTradeData$1$1(interfaceC54581xNr, mutableLiveData, this, qti, qttKWHzl, null), 3, null);
        this.getFieldNames = mutableLiveData;
    }

    public static final ViewModelProvider.Factory AubY() {
        return new C40392qUd("SWAP", "FUTURES");
    }

    public static final ViewModelProvider.Factory AuCTelauCTel() {
        return new C40392qUd("SWAP", "FUTURES");
    }

    @Override // o.AbstractC27870kGj, o.AbstractC32998moE
    public void onVisible() {
        java.lang.String type;
        super.onVisible();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            EZpvd(interfaceC54581xNrOLrzqt);
        }
        TradeGroupData tradeGroupDataAYXKKw = AYXKKw();
        if (tradeGroupDataAYXKKw == null || (type = tradeGroupDataAYXKKw.getType()) == null) {
            return;
        }
        AEQbTJ(type);
    }

    private final void AEQbTJ(java.lang.String str) {
        new C27989kKu().OLrzqt("SWAP", str);
    }

    @Override // o.AbstractC27870kGj, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData = this.getFieldNames;
        if (mutableLiveData != null) {
            mutableLiveData.removeObserver(this.hDKMBd);
        }
        SwapMarketDataSource swapMarketDataSource = this.getNewProxyInstance;
        if (swapMarketDataSource != null) {
            swapMarketDataSource.valueOf();
        }
        C27889kHb.AEQbTJ.EZpvd();
    }

    @Override // o.AbstractC27870kGj
    public void fARcdN() {
        getFieldNames();
    }

    @Override // o.AbstractC27870kGj
    public void EZpvd(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        kJS kjs = new kJS(djBIcL(), this, false, 4, null);
        kjs.OLrzqt("derivative");
        kjs.copydefault("Discover_Market");
        Unit unit = Unit.INSTANCE;
        c59534zip.register(CoinQuote.class, kjs);
        InterfaceC59537zis interfaceC59537zisRegister = c59534zip.register(CoinQuote.class);
        kJS kjs2 = new kJS(djBIcL(), this, false, 4, null);
        kjs2.OLrzqt("derivative");
        kjs2.copydefault("Discover_Market");
        kJM kjm = new kJM(this);
        kjm.OLrzqt("derivative");
        kjm.copydefault("Discover_Market");
        interfaceC59537zisRegister.copydefault(kjs2, kjm).AEQbTJ(new InterfaceC59531zim() { // from class: o.kHS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59531zim
            public final int OLrzqt(int i, java.lang.Object obj) {
                return kHI.KWHzl(i, (CoinQuote) obj);
            }
        });
    }

    public static final int KWHzl(int i, CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return !Intrinsics.EZpvd((java.lang.Object) coinQuote.getInstType(), (java.lang.Object) "SWAP") ? 1 : 0;
    }

    @Override // o.AbstractC27870kGj
    public java.lang.String[] DbNXlk() {
        java.lang.String strAYXKKw;
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw((interfaceC46557tYt == null || interfaceC46557tYt.EZpvd() != 0) ? qZH.PendingIntent.zsXlph : qZH.PendingIntent.ihnvzI);
        if (Intrinsics.EZpvd((java.lang.Object) "Turnover", (java.lang.Object) C42955rgF.copydefault.OLrzqt())) {
            strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.AubY);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.AuCTelauCTel);
        }
        return new java.lang.String[]{C33070mpX.AYXKKw(qZH.PendingIntent.zLjUOn), C33070mpX.AYXKKw(qZH.PendingIntent.gdmIOq), strAYXKKw2, " / " + strAYXKKw};
    }

    @Override // o.AbstractC27870kGj
    public void getFieldNames() {
        java.lang.String id;
        SwapMarketDataSource swapMarketDataSource = this.getNewProxyInstance;
        if (swapMarketDataSource != null) {
            java.lang.String strFetchVPNInfo = fetchVPNInfo();
            if (strFetchVPNInfo == null) {
                strFetchVPNInfo = "";
            }
            TradeGroupData tradeGroupDataAYXKKw = AYXKKw();
            if (tradeGroupDataAYXKKw == null || (id = tradeGroupDataAYXKKw.getId()) == null) {
                id = "";
            }
            java.lang.String value = isConnected().copydefault().getValue();
            if (value == null) {
                value = "";
            }
            SwapMarketDataSource.setFilterCondition$default(swapMarketDataSource, strFetchVPNInfo, id, value, null, 8, null);
        }
        SwapMarketDataSource swapMarketDataSource2 = this.getNewProxyInstance;
        if (swapMarketDataSource2 != null) {
            swapMarketDataSource2.EZpvd(valueOf());
        }
    }
}
