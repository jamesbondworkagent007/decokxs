package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.tradeapi.bean.TradeGroupData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.kGP;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class kGP extends AbstractC27870kGj {
    public static final Application Companion = new Application(null);
    public static final int hDKMBd = 8;
    public int AubY;
    public MutableLiveData<SourceResp<java.lang.Object>> getFieldNames;
    public int getNewProxyInstance;
    public C54640xPw uzCIH;
    public final Observer<SourceResp<java.lang.Object>> zLjUOn = new Observer() { // from class: o.kGT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            kGP.AEQbTJ(this.copydefault, (SourceResp) obj);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27870kGj
    public AbstractC54646xQb AhwBna() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27870kGj
    public java.lang.String ejfBZ() {
        return "COIN";
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
        return new java.lang.Boolean[]{bool, bool, bool, java.lang.Boolean.FALSE};
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kGP.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final kGP EZpvd(@NotNull TradeGroupData tradeGroupData) {
            Intrinsics.checkNotNullParameter(tradeGroupData, "");
            kGP kgp = new kGP();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("market_tab_group_data", tradeGroupData);
            kgp.setArguments(bundle);
            return kgp;
        }
    }

    public static final void AEQbTJ(final kGP kgp, SourceResp sourceResp) {
        C54640xPw c54640xPw;
        Intrinsics.checkNotNullParameter(sourceResp, "");
        if (Intrinsics.EZpvd(sourceResp.isSuccess(), java.lang.Boolean.TRUE)) {
            java.lang.Object data = sourceResp.getData();
            C54640xPw c54640xPw2 = data instanceof C54640xPw ? (C54640xPw) data : null;
            kgp.uzCIH = c54640xPw2;
            if (c54640xPw2 != null) {
                c54640xPw2.OLrzqt(false);
            }
            kgp.getFieldNames();
            int i = kgp.AubY;
            if ((i != 0 || kgp.getNewProxyInstance != 0) && (c54640xPw = kgp.uzCIH) != null) {
                c54640xPw.EZpvd(i, kgp.getNewProxyInstance);
            }
            C54640xPw c54640xPw3 = kgp.uzCIH;
            if (c54640xPw3 != null) {
                c54640xPw3.copydefault(new Function1() { // from class: o.kGU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return kGP.copydefault(this.AEQbTJ, (java.util.ArrayList) obj);
                    }
                });
            }
            C54640xPw c54640xPw4 = kgp.uzCIH;
            if (c54640xPw4 != null) {
                c54640xPw4.gEmmrt(new Function1() { // from class: o.kGX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return kGP.EZpvd(this.KWHzl, (java.lang.String) obj);
                    }
                });
                return;
            }
            return;
        }
        kgp.hDKMBd();
    }

    public static final Unit copydefault(final kGP kgp, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C27889kHb.AEQbTJ.EZpvd(arrayList, new Function1() { // from class: o.kGV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kGP.EZpvd(this.KWHzl, (java.util.List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(kGP kgp, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        kgp.KWHzl((java.util.List<CoinQuote>) list);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(kGP kgp, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        kgp.hDKMBd();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void OLrzqt(InterfaceC54581xNr interfaceC54581xNr) {
        qTI qtiKWHzl;
        qTK qtk;
        MutableLiveData<SourceResp<java.lang.Object>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.observe(this, this.zLjUOn);
        final androidx.fragment.app.Fragment parentFragment = getParentFragment();
        byte b = 0;
        byte b2 = 0;
        if (parentFragment != null) {
            final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.CoinQuoteNewFragment$handleTradeData$lambda$4$$inlined$viewModels$default$1
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
            final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.CoinQuoteNewFragment$handleTradeData$lambda$4$$inlined$viewModels$default$2
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
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(qTK.class);
            Function0<ViewModelStore> function02 = new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.CoinQuoteNewFragment$handleTradeData$lambda$4$$inlined$viewModels$default$3
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
            };
            final byte b3 = b2 == true ? 1 : 0;
            InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(parentFragment, interfaceC56551yJoAEQbTJ, function02, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.CoinQuoteNewFragment$handleTradeData$lambda$4$$inlined$viewModels$default$4
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
                    Function0 function03 = b3;
                    if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                        return creationExtras;
                    }
                    ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                    CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                    return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
                }
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.market.fragment.CoinQuoteNewFragment$handleTradeData$lambda$4$$inlined$viewModels$default$5
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
                final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.CoinQuoteNewFragment$handleTradeData$lambda$4$$inlined$viewModels$default$6
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
                final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.CoinQuoteNewFragment$handleTradeData$lambda$4$$inlined$viewModels$default$7
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
                InterfaceC56551yJo interfaceC56551yJoAEQbTJ2 = C56524yIo.AEQbTJ(qTK.class);
                Function0<ViewModelStore> function04 = new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.CoinQuoteNewFragment$handleTradeData$lambda$4$$inlined$viewModels$default$8
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
                };
                final byte b4 = b == true ? 1 : 0;
                qtiKWHzl = ((qTK) FragmentViewModelLazyKt.createViewModelLazy(this, interfaceC56551yJoAEQbTJ2, function04, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.CoinQuoteNewFragment$handleTradeData$lambda$4$$inlined$viewModels$default$9
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
                        Function0 function05 = b4;
                        if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                            return creationExtras;
                        }
                        ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                        CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                        return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
                    }
                }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.market.fragment.CoinQuoteNewFragment$handleTradeData$lambda$4$$inlined$viewModels$default$10
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
        TradeGroupData tradeGroupDataAYXKKw = AYXKKw();
        C55608xnE.OLrzqt(interfaceC54581xNr, this, mutableLiveData, qtiKWHzl, tradeGroupDataAYXKKw != null ? tradeGroupDataAYXKKw.getId() : null);
        this.getFieldNames = mutableLiveData;
    }

    @Override // o.AbstractC27870kGj, o.AbstractC32998moE
    public void onVisible() {
        Unit unit;
        java.lang.String type;
        super.onVisible();
        try {
            Result.Application application = Result.Companion;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                OLrzqt(interfaceC54581xNrOLrzqt);
            }
            TradeGroupData tradeGroupDataAYXKKw = AYXKKw();
            if (tradeGroupDataAYXKKw == null || (type = tradeGroupDataAYXKKw.getType()) == null) {
                unit = null;
            } else {
                EZpvd(type);
                unit = Unit.INSTANCE;
            }
            Result.m7377constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    private final void EZpvd(java.lang.String str) {
        new C27989kKu().OLrzqt("COIN", str);
    }

    @Override // o.AbstractC27870kGj, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        MutableLiveData<SourceResp<java.lang.Object>> mutableLiveData = this.getFieldNames;
        if (mutableLiveData != null) {
            mutableLiveData.removeObserver(this.zLjUOn);
        }
        C54640xPw c54640xPw = this.uzCIH;
        if (c54640xPw != null) {
            c54640xPw.valueOf();
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
        getNewProxyInstance();
    }

    @Override // o.AbstractC27870kGj
    public void fARcdN() {
        getFieldNames();
    }

    @Override // o.AbstractC27870kGj
    public void EZpvd(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        kJH kjh = new kJH(this);
        kjh.gEmmrt();
        kjh.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK);
        kjh.copydefault(false);
        kjh.AEQbTJ("markets");
        Unit unit = Unit.INSTANCE;
        c59534zip.register(CoinQuote.class, kjh);
    }

    @Override // o.AbstractC27870kGj
    public void getFieldNames() {
        java.lang.String id;
        C54640xPw c54640xPw = this.uzCIH;
        if (c54640xPw != null) {
            TradeGroupData tradeGroupDataAYXKKw = AYXKKw();
            if (tradeGroupDataAYXKKw == null || (id = tradeGroupDataAYXKKw.getId()) == null) {
                id = "";
            }
            c54640xPw.AEQbTJ(id);
        }
        C54640xPw c54640xPw2 = this.uzCIH;
        if (c54640xPw2 != null) {
            c54640xPw2.OLrzqt(valueOf());
        }
    }

    @Override // o.AbstractC27870kGj
    public java.lang.String[] DbNXlk() {
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw((interfaceC46557tYt == null || interfaceC46557tYt.EZpvd() != 0) ? qZH.PendingIntent.zsXlph : qZH.PendingIntent.ihnvzI);
        if (Intrinsics.EZpvd((java.lang.Object) "Turnover", (java.lang.Object) C42955rgF.copydefault.OLrzqt())) {
            C33070mpX.AYXKKw(qZH.PendingIntent.AubY);
        } else {
            C33070mpX.AYXKKw(qZH.PendingIntent.AuCTelauCTel);
        }
        return new java.lang.String[]{C33070mpX.AYXKKw(qZH.PendingIntent.zLjUOn), C33070mpX.AYXKKw(qZH.PendingIntent.gdmIOq), strAYXKKw, ""};
    }

    public static final class TaskDescription extends RecyclerView.OnScrollListener {
        public TaskDescription() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C54640xPw c54640xPw;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                final kGP kgp = kGP.this;
                kgp.EZpvd(new Function2() { // from class: o.kGY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return kGP.TaskDescription.AEQbTJ(kgp, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
                    }
                });
            } else if (i == 1 && (c54640xPw = kGP.this.uzCIH) != null) {
                c54640xPw.AEQbTJ();
            }
        }

        public static final Unit AEQbTJ(kGP kgp, int i, int i2) {
            C54640xPw c54640xPw;
            if (kgp.isVisible() && (c54640xPw = kgp.uzCIH) != null) {
                c54640xPw.EZpvd(i, i2);
            }
            return Unit.INSTANCE;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* JADX DEBUG: Possible override for method o.kGj.getNewProxyInstance()Lo/pWt; */
    public final void getNewProxyInstance() {
        RecyclerView recyclerViewGEmmrt = gEmmrt();
        if (recyclerViewGEmmrt != null) {
            recyclerViewGEmmrt.addOnScrollListener(new TaskDescription());
        }
    }

    public final void EZpvd(@NotNull Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        RecyclerView recyclerViewGEmmrt = gEmmrt();
        RecyclerView.LayoutManager layoutManager = recyclerViewGEmmrt != null ? recyclerViewGEmmrt.getLayoutManager() : null;
        Intrinsics.copydefault(layoutManager, "");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        this.AubY = linearLayoutManager.findFirstVisibleItemPosition();
        this.getNewProxyInstance = linearLayoutManager.findLastVisibleItemPosition();
        function2.invoke(java.lang.Integer.valueOf(this.AubY), java.lang.Integer.valueOf(this.getNewProxyInstance));
    }
}
