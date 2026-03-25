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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$14;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.tradeapi.bean.TradeGroupData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C27915kIa;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kIa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27915kIa extends AbstractC27870kGj {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int uzCIH = 8;
    public int AuCTelauCTel;
    public int getFieldNames;
    public MutableLiveData<SourceResp<AbstractC54646xQb>> getNewProxyInstance;
    public xQJ hDKMBd;
    public final Observer<SourceResp<AbstractC54646xQb>> zsXlph = new Observer() { // from class: o.kHZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            C27915kIa.KWHzl(this.copydefault, (SourceResp) obj);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27870kGj
    public AbstractC54646xQb AhwBna() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27870kGj
    public java.lang.String ejfBZ() {
        return "SPOT";
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

    /* JADX INFO: renamed from: o.kIa$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kIa.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C27915kIa KWHzl(@NotNull TradeGroupData tradeGroupData) {
            Intrinsics.checkNotNullParameter(tradeGroupData, "");
            C27915kIa c27915kIa = new C27915kIa();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("market_tab_group_data", tradeGroupData);
            c27915kIa.setArguments(bundle);
            return c27915kIa;
        }
    }

    public static final void KWHzl(final C27915kIa c27915kIa, SourceResp sourceResp) {
        xQJ xqj;
        Intrinsics.checkNotNullParameter(sourceResp, "");
        if (Intrinsics.EZpvd(sourceResp.isSuccess(), java.lang.Boolean.TRUE)) {
            java.lang.Object data = sourceResp.getData();
            xQJ xqj2 = data instanceof xQJ ? (xQJ) data : null;
            c27915kIa.hDKMBd = xqj2;
            if (xqj2 != null) {
                xqj2.OLrzqt(false);
            }
            c27915kIa.getFieldNames();
            int i = c27915kIa.AuCTelauCTel;
            if ((i != 0 || c27915kIa.getFieldNames != 0) && (xqj = c27915kIa.hDKMBd) != null) {
                xqj.EZpvd(i, c27915kIa.getFieldNames);
            }
            xQJ xqj3 = c27915kIa.hDKMBd;
            if (xqj3 != null) {
                xqj3.copydefault(new Function1() { // from class: o.kHY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C27915kIa.OLrzqt(this.OLrzqt, (java.util.ArrayList) obj);
                    }
                });
            }
            xQJ xqj4 = c27915kIa.hDKMBd;
            if (xqj4 != null) {
                xqj4.gEmmrt(new Function1() { // from class: o.kIb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C27915kIa.EZpvd(this.AEQbTJ, (java.lang.String) obj);
                    }
                });
                return;
            }
            return;
        }
        c27915kIa.hDKMBd();
    }

    public static final Unit OLrzqt(final C27915kIa c27915kIa, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C27889kHb.AEQbTJ.EZpvd(arrayList, new Function1() { // from class: o.kIf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27915kIa.KWHzl(this.EZpvd, (java.util.List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C27915kIa c27915kIa, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c27915kIa.KWHzl((java.util.List<CoinQuote>) list);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C27915kIa c27915kIa, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c27915kIa.hDKMBd();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void copydefault(InterfaceC54581xNr interfaceC54581xNr) {
        qTI qtiKWHzl;
        qTT qttKWHzl;
        C40395qUg c40395qUg;
        qTK qtk;
        MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.observe(this, this.zsXlph);
        final androidx.fragment.app.Fragment parentFragment = getParentFragment();
        final Function0 function0 = null;
        if (parentFragment != null) {
            final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$1
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
            final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$2
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
            InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(parentFragment, C56524yIo.AEQbTJ(qTK.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$3
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
            }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$4
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
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$5
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
                final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$6
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
                final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$7
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
                qtiKWHzl = ((qTK) FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(qTK.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$8
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
                }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$9
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
                }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$10
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
            Function0 function04 = new Function0() { // from class: o.kIg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C27915kIa.AuCTelauCTel();
                }
            };
            final Function0<androidx.fragment.app.Fragment> function05 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$11
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
            final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$12
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
            InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy2 = FragmentViewModelLazyKt.createViewModelLazy(parentFragment2, C56524yIo.AEQbTJ(C40395qUg.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$13
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
            }, new SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$14(null, interfaceC56387yDmEZpvd3), function04);
            if (interfaceC56387yDmCreateViewModelLazy2 == null || (c40395qUg = (C40395qUg) interfaceC56387yDmCreateViewModelLazy2.getValue()) == null || (qttKWHzl = c40395qUg.KWHzl()) == null) {
                Function0 function06 = new Function0() { // from class: o.kId
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C27915kIa.zsXlph();
                    }
                };
                final Function0<androidx.fragment.app.Fragment> function07 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$16
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
                final InterfaceC56387yDm interfaceC56387yDmEZpvd4 = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$17
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
                qttKWHzl = ((C40395qUg) FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C40395qUg.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$18
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
                }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.SpotQuoteNewFragment$handleTradeData$lambda$6$$inlined$viewModels$default$19
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
        C55608xnE.copydefault(interfaceC54581xNr, (129 & 1) != 0 ? java.lang.Boolean.FALSE : null, (129 & 2) != 0 ? false : true, (129 & 4) != 0 ? false : true, mutableLiveData, LifecycleOwnerKt.getLifecycleScope(this), qti, qttKWHzl, (129 & 128) != 0 ? "unknown" : null);
        this.getNewProxyInstance = mutableLiveData;
    }

    public static final ViewModelProvider.Factory AuCTelauCTel() {
        return new C40392qUd("SPOT", null, 2, null);
    }

    public static final ViewModelProvider.Factory zsXlph() {
        return new C40392qUd("SPOT", null, 2, null);
    }

    @Override // o.AbstractC27870kGj, o.AbstractC32998moE
    public void onVisible() {
        java.lang.String type;
        super.onVisible();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            copydefault(interfaceC54581xNrOLrzqt);
        }
        TradeGroupData tradeGroupDataAYXKKw = AYXKKw();
        if (tradeGroupDataAYXKKw == null || (type = tradeGroupDataAYXKKw.getType()) == null) {
            return;
        }
        KWHzl(type);
    }

    private final void KWHzl(java.lang.String str) {
        new C27989kKu().OLrzqt("SPOT", str);
    }

    @Override // o.AbstractC27870kGj, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData = this.getNewProxyInstance;
        if (mutableLiveData != null) {
            mutableLiveData.removeObserver(this.zsXlph);
        }
        xQJ xqj = this.hDKMBd;
        if (xqj != null) {
            xqj.valueOf();
        }
        C27889kHb.AEQbTJ.EZpvd();
    }

    @Override // o.AbstractC27870kGj, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        RecyclerView recyclerViewGEmmrt = gEmmrt();
        if (recyclerViewGEmmrt != null) {
            recyclerViewGEmmrt.setHasFixedSize(true);
        }
        wlaJM();
    }

    @Override // o.AbstractC27870kGj
    public void fARcdN() {
        getFieldNames();
    }

    @Override // o.AbstractC27870kGj
    public void EZpvd(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        kJO kjo = new kJO(djBIcL(), this);
        kjo.OLrzqt("spot");
        kjo.copydefault("Discover_Market");
        Unit unit = Unit.INSTANCE;
        c59534zip.register(CoinQuote.class, kjo);
    }

    @Override // o.AbstractC27870kGj
    public void getFieldNames() {
        java.lang.String id;
        xQJ xqj = this.hDKMBd;
        if (xqj != null) {
            java.lang.String strFetchVPNInfo = fetchVPNInfo();
            java.lang.String str = "";
            if (strFetchVPNInfo == null) {
                strFetchVPNInfo = "";
            }
            TradeGroupData tradeGroupDataAYXKKw = AYXKKw();
            if (tradeGroupDataAYXKKw != null && (id = tradeGroupDataAYXKKw.getId()) != null) {
                str = id;
            }
            xqj.copydefault(strFetchVPNInfo, str);
        }
        xQJ xqj2 = this.hDKMBd;
        if (xqj2 != null) {
            xqj2.copydefault(valueOf());
        }
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

    /* JADX INFO: renamed from: o.kIa$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar extends RecyclerView.OnScrollListener {
        public ActionBar() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            xQJ xqj;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                final C27915kIa c27915kIa = C27915kIa.this;
                c27915kIa.EZpvd(new Function2() { // from class: o.kIc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C27915kIa.ActionBar.AEQbTJ(c27915kIa, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
                    }
                });
            } else if (i == 1 && (xqj = C27915kIa.this.hDKMBd) != null) {
                xqj.AEQbTJ();
            }
        }

        public static final Unit AEQbTJ(C27915kIa c27915kIa, int i, int i2) {
            xQJ xqj;
            C43296rmc.EZpvd("SpotQuoteFragment:isVisible", java.lang.String.valueOf(c27915kIa.isVisible()));
            if (c27915kIa.isVisible() && (xqj = c27915kIa.hDKMBd) != null) {
                xqj.EZpvd(i, i2);
            }
            return Unit.INSTANCE;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
        }
    }

    private final void wlaJM() {
        RecyclerView recyclerViewGEmmrt = gEmmrt();
        if (recyclerViewGEmmrt != null) {
            recyclerViewGEmmrt.addOnScrollListener(new ActionBar());
        }
    }

    public final void EZpvd(@NotNull Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        RecyclerView recyclerViewGEmmrt = gEmmrt();
        RecyclerView.LayoutManager layoutManager = recyclerViewGEmmrt != null ? recyclerViewGEmmrt.getLayoutManager() : null;
        Intrinsics.copydefault(layoutManager, "");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        this.AuCTelauCTel = linearLayoutManager.findFirstVisibleItemPosition();
        this.getFieldNames = linearLayoutManager.findLastVisibleItemPosition();
        function2.invoke(java.lang.Integer.valueOf(this.AuCTelauCTel), java.lang.Integer.valueOf(this.getFieldNames));
    }
}
