package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.ui.KLineMoreTradeFragment$addToOrRemoveFromWatchlist$1;
import com.okinc.kline.ui.KLineMoreTradeFragment$initBizData$1;
import com.okinc.kline.ui.KLineMoreTradeFragment$initDsWatch$1;
import com.okinc.kline.ui.KLineMoreTradeFragment$subscribeOnUiChange$1;
import com.okinc.kline.ui.KLineMoreTradeFragment$subscribeOnUiChange$2;
import com.okinc.kline.ui.viewmodel.KlineHeaderViewModel;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.uilab.stateful.StatefulView;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.TokenBusinessData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32113mPz;
import o.C35964oKf;
import o.C38358pVv;
import o.C52761wXj;
import o.InterfaceC43294rma;
import o.InterfaceC54581xNr;
import o.xMJ;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.pck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38614pck extends AbstractC32998moE {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public int AEQbTJ;
    public java.lang.String AYXKKw;
    public InterfaceC54647xQc AhwBna;
    public android.widget.LinearLayout AkhnZx;
    public InterfaceC58217yxC AuCTel;
    public C55113xdn AubY;
    public android.widget.LinearLayout AwvSrB;
    public final InterfaceC56387yDm AxsJAY;
    public boolean DbNXlk;
    public InterfaceC39502ptZ OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public java.lang.String ejfBZ;
    public java.lang.String fARcdN;
    public MarketArbCoinInfo fIwbmz;
    public InterfaceC58217yxC fJNWhG;
    public android.widget.TextView gHZMYf;
    public final InterfaceC56387yDm iwGUEr;
    public C55237xgE sSMYrx;
    public java.lang.String uzCIH;
    public java.lang.String valueOf;
    public final InterfaceC56387yDm wlaJM;
    public C55173xeu zLjUOn;
    public RecyclerView zsXlph;
    public C33546myW zuBGHE;
    public java.util.ArrayList<TokenBusinessData> copydefault = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> gEmmrt = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> values = new java.util.ArrayList<>();
    public C38358pVv AuCTelauCTel = new C38358pVv();
    public java.lang.String hDKMBd = "";
    public java.lang.String getFieldNames = "";
    public java.lang.String getNewProxyInstance = "";
    public boolean isConnected = true;
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.pcw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C38614pck.DbNXlk();
        }
    });
    public final AtomicInteger EZpvd = new AtomicInteger();

    /* JADX INFO: renamed from: o.pck$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull MarketArbCoinInfo marketArbCoinInfo) {
        Intrinsics.checkNotNullParameter(marketArbCoinInfo, "");
        this.fIwbmz = marketArbCoinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(InterfaceC39502ptZ interfaceC39502ptZ) {
        this.OLrzqt = interfaceC39502ptZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.fFgQHt;
    }

    public C38614pck() {
        final Function0 function0 = null;
        this.wlaJM = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C54472xJr.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.KLineMoreTradeFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.KLineMoreTradeFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.KLineMoreTradeFragment$special$$inlined$activityViewModels$default$3
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
        this.AxsJAY = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C54822xWp.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.KLineMoreTradeFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.KLineMoreTradeFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.KLineMoreTradeFragment$special$$inlined$activityViewModels$default$6
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
        this.iwGUEr = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pCW.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.KLineMoreTradeFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.KLineMoreTradeFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.KLineMoreTradeFragment$special$$inlined$activityViewModels$default$9
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(KlineHeaderViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.KLineMoreTradeFragment$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.KLineMoreTradeFragment$special$$inlined$activityViewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.KLineMoreTradeFragment$special$$inlined$activityViewModels$default$12
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

    private final C54472xJr AYXKKw() {
        return (C54472xJr) this.wlaJM.getValue();
    }

    private final C54822xWp valueOf() {
        return (C54822xWp) this.AxsJAY.getValue();
    }

    private final pCW djBIcL() {
        return (pCW) this.iwGUEr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KlineHeaderViewModel gEmmrt() {
        return (KlineHeaderViewModel) this.djBIcL.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C59534zip AhwBna() {
        return (C59534zip) this.fetchVPNInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C59534zip DbNXlk() {
        return new C59534zip();
    }

    /* JADX INFO: renamed from: o.pck$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pck.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C38614pck AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull InterfaceC39502ptZ interfaceC39502ptZ) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(interfaceC39502ptZ, "");
            C38614pck c38614pck = new C38614pck();
            c38614pck.copydefault(interfaceC39502ptZ);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(oLT.gEmmrt(), str);
            bundle.putString(oLT.valueOf(), str2);
            bundle.putString("from_scene", str4);
            bundle.putString("from", str3);
            bundle.putString("tag", str5);
            c38614pck.setArguments(bundle);
            return c38614pck;
        }

        public final C38614pck AEQbTJ(@NotNull MarketArbCoinInfo marketArbCoinInfo, @NotNull InterfaceC39502ptZ interfaceC39502ptZ) {
            Intrinsics.checkNotNullParameter(marketArbCoinInfo, "");
            Intrinsics.checkNotNullParameter(interfaceC39502ptZ, "");
            C38614pck c38614pck = new C38614pck();
            c38614pck.copydefault(interfaceC39502ptZ);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(oLT.copydefault(), marketArbCoinInfo);
            c38614pck.setArguments(bundle);
            return c38614pck;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        pXB.registerTradeFragmentTrack$default(pXB.EZpvd, this, "KLineMoreTradeFragment", new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        AkhnZx();
        InterfaceC58217yxC interfaceC58217yxC = this.fJNWhG;
        if (interfaceC58217yxC == null || !interfaceC58217yxC.isDisposed()) {
            return;
        }
        copydefault();
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        InterfaceC58217yxC interfaceC58217yxC = this.fJNWhG;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.AuCTel;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull final android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        this.ejfBZ = arguments != null ? arguments.getString(oLT.gEmmrt()) : null;
        android.os.Bundle arguments2 = getArguments();
        this.uzCIH = arguments2 != null ? arguments2.getString(oLT.valueOf()) : null;
        android.os.Bundle arguments3 = getArguments();
        this.fIwbmz = arguments3 != null ? (MarketArbCoinInfo) arguments3.getParcelable(oLT.copydefault()) : null;
        android.os.Bundle arguments4 = getArguments();
        this.fARcdN = arguments4 != null ? arguments4.getString("from") : null;
        android.os.Bundle arguments5 = getArguments();
        this.valueOf = arguments5 != null ? arguments5.getString("from_scene") : null;
        android.os.Bundle arguments6 = getArguments();
        this.AYXKKw = arguments6 != null ? arguments6.getString("tag") : null;
        this.AwvSrB = (android.widget.LinearLayout) view.findViewById(C32113mPz.FragmentManager.DCJXGO);
        this.zsXlph = (RecyclerView) view.findViewById(C35964oKf.StateListAnimator.postMessage);
        this.zuBGHE = (C33546myW) view.findViewById(C35964oKf.StateListAnimator.getSessionToken);
        this.AubY = (C55113xdn) view.findViewById(C35964oKf.StateListAnimator.OhcwxsRkSIEV);
        this.sSMYrx = (C55237xgE) view.findViewById(C35964oKf.StateListAnimator.search);
        this.AkhnZx = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.dYepVG);
        this.zLjUOn = (C55173xeu) view.findViewById(C35964oKf.StateListAnimator.sWlOSi);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.MediaMetadataCompatApi21);
        this.gHZMYf = textView;
        if (textView != null) {
            textView.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.zqTOFw));
        }
        C55173xeu c55173xeu = this.zLjUOn;
        if (c55173xeu != null) {
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.pcm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C38614pck.EZpvd(view, this, view2);
                }
            });
        }
        ejfBZ();
        fetchVPNInfo();
        isConnected();
        fARcdN();
    }

    public static final void EZpvd(android.view.View view, C38614pck c38614pck, android.view.View view2) {
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (c43453rpa.KWHzl(context)) {
            c38614pck.values();
            c38614pck.ejfBZ();
            c38614pck.KWHzl(false);
        } else {
            C33546myW c33546myW = c38614pck.zuBGHE;
            if (c33546myW != null) {
                c33546myW.AEQbTJ();
            }
            c38614pck.KWHzl(true);
        }
    }

    private final void fARcdN() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KLineMoreTradeFragment$subscribeOnUiChange$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KLineMoreTradeFragment$subscribeOnUiChange$2(this, null), 3, null);
    }

    private final void ejfBZ() {
        C55113xdn c55113xdn;
        C55237xgE c55237xgE = this.sSMYrx;
        android.view.View viewAEQbTJ = c55237xgE != null ? c55237xgE.AEQbTJ(StatefulView.Status.Loading) : null;
        if (viewAEQbTJ != null && (c55113xdn = (C55113xdn) viewAEQbTJ.findViewById(C52761wXj.FragmentManager.zblBkD)) != null) {
            C55113xdn.showLoading$default(c55113xdn, 0L, 1, null);
        }
        C55237xgE c55237xgE2 = this.sSMYrx;
        if (c55237xgE2 != null) {
            c55237xgE2.setLoadingDelayedTime(0L);
        }
        C55237xgE c55237xgE3 = this.sSMYrx;
        if (c55237xgE3 != null) {
            c55237xgE3.setStatus(StatefulView.Status.Loading);
        }
        C55237xgE c55237xgE4 = this.sSMYrx;
        if (c55237xgE4 != null) {
            c55237xgE4.setVisibility(0);
        }
    }

    private final void EZpvd() {
        C55237xgE c55237xgE = this.sSMYrx;
        if (c55237xgE == null || c55237xgE.getVisibility() != 0) {
            return;
        }
        c55237xgE.setStatus(StatefulView.Status.None);
        c55237xgE.setVisibility(8);
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KLineMoreTradeFragment$initBizData$1(this, null), 3, null);
    }

    private final void AkhnZx() {
        AYXKKw().ejfBZ().observe(this, new TaskDescription(new Function1() { // from class: o.pcq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38614pck.EZpvd(this.EZpvd, (java.util.ArrayList) obj);
            }
        }));
        valueOf().KWHzl().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.pct
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38614pck.EZpvd(this.OLrzqt, (MarketCoinInfo) obj);
            }
        }));
        C33546myW c33546myW = this.zuBGHE;
        if (c33546myW != null) {
            c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.pcs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    C38614pck.copydefault(this.OLrzqt, interfaceC57934yrl);
                }
            });
        }
        RecyclerView recyclerView = this.zsXlph;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new StateListAnimator());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(C38614pck c38614pck, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C33546myW c33546myW = c38614pck.zuBGHE;
        if (c33546myW != null) {
            c33546myW.AEQbTJ();
        }
        if (arrayList.isEmpty()) {
            c38614pck.OLrzqt(true);
            c38614pck.EZpvd();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c38614pck, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            c38614pck.OLrzqt(false);
            java.lang.String str = c38614pck.hDKMBd;
            if (str != null && str.length() != 0) {
                TokenBusinessData tokenBusinessData = (TokenBusinessData) arrayList.get(0);
                if (Intrinsics.EZpvd((java.lang.Object) (tokenBusinessData != null ? tokenBusinessData.getBaseSymbol() : null), (java.lang.Object) c38614pck.hDKMBd)) {
                    TokenBusinessData tokenBusinessData2 = (TokenBusinessData) arrayList.get(0);
                    if (Intrinsics.EZpvd((java.lang.Object) (tokenBusinessData2 != null ? tokenBusinessData2.getQuoteSymbol() : null), (java.lang.Object) c38614pck.getFieldNames) && ((!Intrinsics.EZpvd((java.lang.Object) c38614pck.uzCIH, (java.lang.Object) "OPTION") || Intrinsics.EZpvd((java.lang.Object) c38614pck.getNewProxyInstance, (java.lang.Object) "OPTION")) && (!Intrinsics.EZpvd((java.lang.Object) c38614pck.getNewProxyInstance, (java.lang.Object) "OPTION") || Intrinsics.EZpvd((java.lang.Object) c38614pck.uzCIH, (java.lang.Object) "OPTION")))) {
                        if (c38614pck.DbNXlk) {
                            c38614pck.gEmmrt.clear();
                            c38614pck.values.clear();
                            java.util.ArrayList<TokenBusinessData> arrayList2 = new java.util.ArrayList<>();
                            java.util.Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                TokenBusinessData tokenBusinessData3 = (TokenBusinessData) it.next();
                                if (tokenBusinessData3 != null && !Intrinsics.EZpvd((java.lang.Object) "MARGIN", (java.lang.Object) tokenBusinessData3.getInstType()) && tokenBusinessData3.getAvailable()) {
                                    arrayList2.add(tokenBusinessData3);
                                }
                            }
                            c38614pck.OLrzqt(arrayList2);
                            c38614pck.OLrzqt();
                            c38614pck.AEQbTJ();
                        }
                    }
                }
            } else {
                c38614pck.AhwBna().getItems().clear();
                c38614pck.AhwBna().notifyDataSetChanged();
                c38614pck.isConnected = true;
                c38614pck.hDKMBd = ((TokenBusinessData) arrayList.get(0)).getBaseSymbol();
                c38614pck.getFieldNames = ((TokenBusinessData) arrayList.get(0)).getQuoteSymbol();
                java.lang.String str2 = c38614pck.uzCIH;
                c38614pck.getNewProxyInstance = str2 != null ? str2 : "";
                c38614pck.copydefault.clear();
                c38614pck.gEmmrt.clear();
                c38614pck.values.clear();
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    TokenBusinessData tokenBusinessData4 = (TokenBusinessData) it2.next();
                    if (tokenBusinessData4 != null && !Intrinsics.EZpvd((java.lang.Object) "MARGIN", (java.lang.Object) tokenBusinessData4.getInstType()) && tokenBusinessData4.getAvailable()) {
                        c38614pck.copydefault.add(tokenBusinessData4);
                    }
                }
                c38614pck.OLrzqt();
                c38614pck.AEQbTJ();
            }
        }
        c38614pck.DbNXlk = false;
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C38614pck c38614pck, MarketCoinInfo marketCoinInfo) {
        c38614pck.ejfBZ = marketCoinInfo.getInstrumentId();
        c38614pck.uzCIH = marketCoinInfo.getInstrumentType();
        return Unit.INSTANCE;
    }

    public static final void copydefault(C38614pck c38614pck, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        android.content.Context context = c38614pck.getContext();
        if (context == null) {
            return;
        }
        if (c43453rpa.KWHzl(context)) {
            c38614pck.DbNXlk = true;
            c38614pck.values();
            c38614pck.KWHzl(false);
        } else {
            C33546myW c33546myW = c38614pck.zuBGHE;
            if (c33546myW != null) {
                c33546myW.AEQbTJ();
            }
            c38614pck.KWHzl(true);
        }
    }

    /* JADX INFO: renamed from: o.pck$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.OnScrollListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
        }

        public StateListAnimator() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                C38614pck.this.copydefault();
                return;
            }
            if (i != 1) {
                return;
            }
            InterfaceC58217yxC interfaceC58217yxC = C38614pck.this.fJNWhG;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            InterfaceC58217yxC interfaceC58217yxC2 = C38614pck.this.AuCTel;
            if (interfaceC58217yxC2 != null) {
                interfaceC58217yxC2.dispose();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        KLineMoreTradeFragment$initDsWatch$1 kLineMoreTradeFragment$initDsWatch$1;
        final C38614pck c38614pck;
        if (continuation instanceof KLineMoreTradeFragment$initDsWatch$1) {
            kLineMoreTradeFragment$initDsWatch$1 = (KLineMoreTradeFragment$initDsWatch$1) continuation;
            int i = kLineMoreTradeFragment$initDsWatch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kLineMoreTradeFragment$initDsWatch$1.label = i - Integer.MIN_VALUE;
            } else {
                kLineMoreTradeFragment$initDsWatch$1 = new KLineMoreTradeFragment$initDsWatch$1(this, continuation);
            }
        }
        java.lang.Object obj = kLineMoreTradeFragment$initDsWatch$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kLineMoreTradeFragment$initDsWatch$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54647xQc interfaceC54647xQc = this.AhwBna;
            if (interfaceC54647xQc == null) {
                qVD qvd = qVD.AEQbTJ;
                kLineMoreTradeFragment$initDsWatch$1.L$0 = this;
                kLineMoreTradeFragment$initDsWatch$1.label = 1;
                if (qvd.OLrzqt(kLineMoreTradeFragment$initDsWatch$1) == objCopydefault) {
                    return objCopydefault;
                }
                c38614pck = this;
            } else {
                if (interfaceC54647xQc != null) {
                    KWHzl(interfaceC54647xQc);
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c38614pck = (C38614pck) kLineMoreTradeFragment$initDsWatch$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC54647xQc interfaceC54647xQcOLrzqt = qVD.AEQbTJ.OLrzqt();
        c38614pck.AhwBna = interfaceC54647xQcOLrzqt;
        if (interfaceC54647xQcOLrzqt != null) {
            interfaceC54647xQcOLrzqt.AEQbTJ(new Function1() { // from class: o.pcB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C38614pck.AEQbTJ(this.OLrzqt, ((java.lang.Boolean) obj2).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C38614pck c38614pck, boolean z) {
        InterfaceC54647xQc interfaceC54647xQc = c38614pck.AhwBna;
        if (interfaceC54647xQc != null) {
            c38614pck.KWHzl(interfaceC54647xQc);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(boolean z) {
        if (z) {
            RecyclerView recyclerView = this.zsXlph;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout = this.AkhnZx;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            EZpvd();
            return;
        }
        RecyclerView recyclerView2 = this.zsXlph;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout2 = this.AkhnZx;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    private final void fetchVPNInfo() {
        android.content.Context context = getContext();
        if (context != null) {
            AhwBna().register(TokenBusinessData.class, new C39493ptQ(context, new Function1() { // from class: o.pcv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38614pck.KWHzl(this.KWHzl, (TokenBusinessData) obj);
                }
            }, new Function1() { // from class: o.pcu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38614pck.AEQbTJ(this.copydefault, (TokenBusinessData) obj);
                }
            }));
        }
    }

    public static final Unit KWHzl(C38614pck c38614pck, TokenBusinessData tokenBusinessData) {
        Intrinsics.checkNotNullParameter(tokenBusinessData, "");
        c38614pck.copydefault(tokenBusinessData);
        c38614pck.AEQbTJ(tokenBusinessData);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C38614pck c38614pck, TokenBusinessData tokenBusinessData) {
        Intrinsics.checkNotNullParameter(tokenBusinessData, "");
        c38614pck.EZpvd(tokenBusinessData);
        return Unit.INSTANCE;
    }

    private final void isConnected() {
        RecyclerView recyclerView = this.zsXlph;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        AhwBna().setItems(this.copydefault);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault() {
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ;
        java.lang.Object next;
        AbstractC58185ywX abstractC58185ywXEZpvd;
        InterfaceC58217yxC interfaceC58217yxC = this.AuCTel;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        java.util.Iterator<T> it = this.copydefault.iterator();
        while (true) {
            interfaceC58217yxCAEQbTJ = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((TokenBusinessData) next).getInstType(), (java.lang.Object) "OPTION")) {
                    break;
                }
            }
        }
        final TokenBusinessData tokenBusinessData = (TokenBusinessData) next;
        if (tokenBusinessData != null) {
            AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(this.AuCTelauCTel.AEQbTJ(tokenBusinessData.getInstrumentName()), this);
            final Function1 function1 = new Function1() { // from class: o.pco
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38614pck.AEQbTJ(tokenBusinessData, (C38358pVv.ActionBar) obj);
                }
            };
            this.AuCTel = abstractC58185ywXEZpvd2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pcn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C38614pck.AEQbTJ(function1, obj);
                }
            });
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.fJNWhG;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        AbstractC58185ywX<C38358pVv.StateListAnimator> abstractC58185ywXGEmmrt = this.AuCTelauCTel.gEmmrt(this.gEmmrt);
        if (abstractC58185ywXGEmmrt != null && (abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXGEmmrt, this)) != null) {
            final Function1 function12 = new Function1() { // from class: o.pcr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38614pck.copydefault(this.EZpvd, (C38358pVv.StateListAnimator) obj);
                }
            };
            interfaceC58217yxCAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pcy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C38614pck.copydefault(function12, obj);
                }
            });
        }
        this.fJNWhG = interfaceC58217yxCAEQbTJ;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(TokenBusinessData tokenBusinessData, C38358pVv.ActionBar actionBar) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        java.lang.String strOLrzqt;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt("OPTION")) != null) {
            BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(tokenBusinessData.getInstrumentName());
            java.lang.String str = "";
            if (bizInstrumentValueOf == null || (instFamily = bizInstrumentValueOf.getInstFamily()) == null) {
                instFamily = "";
            }
            xMS xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily);
            xMJ.StateListAnimator stateListAnimatorOLrzqt = actionBar.OLrzqt();
            if (stateListAnimatorOLrzqt != null && (strOLrzqt = stateListAnimatorOLrzqt.OLrzqt()) != null) {
                str = strOLrzqt;
            }
            tokenBusinessData.setPrice(xmsGEmmrt.values(str));
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C38614pck c38614pck, C38358pVv.StateListAnimator stateListAnimator) {
        int i;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String safeString$default;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        xMW xmwKWHzl;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLValues;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLAEQbTJ;
        C54536xML c54536xMLDjBIcL;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3;
        java.util.Iterator<T> it = stateListAnimator.OLrzqt().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TickersData tickersData = (TickersData) it.next();
            for (TokenBusinessData tokenBusinessData : c38614pck.copydefault) {
                InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                tokenBusinessData.setCoinUrl((interfaceC49425uoM == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt3 = interfaceC54577xNn2.OLrzqt()) == null) ? null : interfaceC54581xNrOLrzqt3.valueOf(tokenBusinessData.getBaseSymbol()));
                if (Intrinsics.EZpvd((java.lang.Object) tickersData.getInstId(), (java.lang.Object) tokenBusinessData.getInstrumentName())) {
                    InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                    if (interfaceC49425uoM2 != null) {
                        TradeKey tradeKey = TradeKey.MANAGER;
                        InterfaceC54577xNn interfaceC54577xNn3 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(tradeKey);
                        if (interfaceC54577xNn3 != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn3.OLrzqt()) != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(tickersData.getInstType())) != null) {
                            BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(tickersData.getInstId());
                            java.lang.String instFamily = bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstFamily() : null;
                            Intrinsics.copydefault((java.lang.Object) instFamily);
                            tokenBusinessData.setIndex(instFamily);
                            SpotInstrument spotInstrument = bizInstrumentValueOf instanceof SpotInstrument ? (SpotInstrument) bizInstrumentValueOf : null;
                            tokenBusinessData.setLeverage(java.lang.String.valueOf(spotInstrument != null ? spotInstrument.getLevel() : null));
                            if ((Intrinsics.EZpvd((java.lang.Object) tickersData.getInstType(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) tickersData.getInstType(), (java.lang.Object) "FUTURES")) && Intrinsics.EZpvd((java.lang.Object) abstractC54531xLwOLrzqt.copydefault(bizInstrumentValueOf), (java.lang.Object) "inverse")) {
                                InterfaceC49425uoM interfaceC49425uoM3 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                                if (interfaceC49425uoM3 == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM3.KWHzl(tradeKey)) == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn.OLrzqt()) == null || (xmwKWHzl = interfaceC54581xNrOLrzqt2.KWHzl()) == null || (c54536xMLAYXKKw = xmwKWHzl.AYXKKw(tickersData.getLast())) == null || (c54536xMLValues = c54536xMLAYXKKw.values()) == null || (c54536xMLIsConnected = c54536xMLValues.isConnected()) == null || (c54536xMLAEQbTJ = c54536xMLIsConnected.AEQbTJ(true)) == null || (c54536xMLDjBIcL = c54536xMLAEQbTJ.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) {
                                    safeString$default = "";
                                }
                                tokenBusinessData.setPrice(safeString$default);
                            } else {
                                tokenBusinessData.setPrice(C54536xML.toSafeString$default(abstractC54531xLwOLrzqt.gEmmrt(tokenBusinessData.getIndex()).AYXKKw(tickersData.getLast()).djBIcL(), false, 1, null));
                            }
                        }
                    }
                    InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
                    java.lang.String strOLrzqt = interfaceC46557tYt != null ? interfaceC46557tYt.OLrzqt(tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8()) : null;
                    double dDivD$default = C33129mqd.divD$default(C33129mqd.subS$default(tickersData.getLast(), strOLrzqt, null, null, null, 14, null), strOLrzqt, 4, null, RoundingMode.HALF_UP, 4, null);
                    java.lang.String str = dDivD$default > AudioStats.AUDIO_AMPLITUDE_NONE ? Marker.ANY_NON_NULL_MARKER : "";
                    tokenBusinessData.setChangePercent(str + pTB.formatPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(dDivD$default)), 0, null, 3, null));
                }
            }
        }
        if (c38614pck.isConnected) {
            c38614pck.isConnected = false;
            c38614pck.AhwBna().notifyDataSetChanged();
        } else {
            int size = c38614pck.copydefault.size();
            for (i = 0; i < size; i++) {
                c38614pck.AhwBna().notifyItemChanged(i, "LocalRefresh");
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r0.equals("SPOT") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r0.equals("MARGIN") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        OLrzqt(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r0.equals("FUTURES") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.equals("SWAP") == false) goto L21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(TokenBusinessData tokenBusinessData) {
        java.lang.String leftInstType;
        java.lang.String leftInstId;
        java.lang.String leftType;
        java.lang.String rightInstType;
        java.lang.String rightType;
        java.lang.String instType = tokenBusinessData.getInstType();
        switch (instType.hashCode()) {
            case -2027980370:
                break;
            case -1956807563:
                if (instType.equals("OPTION")) {
                }
                if (this.fIwbmz == null) {
                    InterfaceC49497upf interfaceC49497upf = (InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI);
                    if (interfaceC49497upf != null) {
                        MarketArbCoinInfo marketArbCoinInfo = this.fIwbmz;
                        if (marketArbCoinInfo == null || (leftInstType = marketArbCoinInfo.getLeftInstType()) == null) {
                            leftInstType = "";
                        }
                        MarketArbCoinInfo marketArbCoinInfo2 = this.fIwbmz;
                        if (marketArbCoinInfo2 == null || (leftInstId = marketArbCoinInfo2.getLeftInstId()) == null) {
                            leftInstId = "";
                        }
                        MarketArbCoinInfo marketArbCoinInfo3 = this.fIwbmz;
                        if (marketArbCoinInfo3 == null || (leftType = marketArbCoinInfo3.getLeftType()) == null) {
                            leftType = "sell";
                        }
                        MarketArbCoinInfo marketArbCoinInfo4 = this.fIwbmz;
                        if (marketArbCoinInfo4 == null || (rightInstType = marketArbCoinInfo4.getRightInstType()) == null) {
                            rightInstType = "";
                        }
                        MarketArbCoinInfo marketArbCoinInfo5 = this.fIwbmz;
                        java.lang.String rightInstId = marketArbCoinInfo5 != null ? marketArbCoinInfo5.getRightInstId() : null;
                        MarketArbCoinInfo marketArbCoinInfo6 = this.fIwbmz;
                        if (marketArbCoinInfo6 == null || (rightType = marketArbCoinInfo6.getRightType()) == null) {
                            rightType = "buy";
                        }
                        interfaceC49497upf.copydefault(leftInstType, leftInstId, leftType, rightInstType, rightInstId, rightType);
                    }
                    java.lang.String str = ((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class)).AEQbTJ() + "?&strategyType=";
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, str, null, new Function1() { // from class: o.pcx
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C38614pck.OLrzqt((AbstractC43238rlX) obj);
                            }
                        }, 4, null);
                    }
                } else {
                    C48914uef c48914uef = C48914uef.EZpvd;
                    int iOLrzqt = c48914uef.OLrzqt(this.uzCIH);
                    java.lang.String strAEQbTJ = c48914uef.AEQbTJ(this.uzCIH);
                    java.lang.String str2 = ((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class)).AEQbTJ() + "?bizType=" + iOLrzqt + "&strategyType=" + strAEQbTJ + "&instId=" + this.ejfBZ;
                    FragmentActivity activity2 = getActivity();
                    if (activity2 != null) {
                        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity2, str2, null, new Function1() { // from class: o.pcA
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C38614pck.EZpvd((AbstractC43238rlX) obj);
                            }
                        }, 4, null);
                    }
                }
                break;
            case 2552066:
                break;
            case 2558355:
                break;
            case 214415088:
                break;
            default:
                if (this.fIwbmz == null) {
                }
                break;
        }
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void OLrzqt(TokenBusinessData tokenBusinessData) {
        java.lang.String str;
        int iOLrzqt = C48914uef.EZpvd.OLrzqt(tokenBusinessData.getInstType());
        java.lang.String strUzCIH = djBIcL().OLrzqt().uzCIH();
        java.lang.String strOLrzqt = ((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class)).OLrzqt();
        java.lang.String instrumentName = tokenBusinessData.getInstrumentName();
        java.lang.String str2 = this.valueOf;
        if (str2 == null || str2.length() == 0) {
            str = this.fARcdN;
        } else {
            str = this.valueOf + "&tag=" + this.AYXKKw;
        }
        java.lang.String str3 = strOLrzqt + "?bizType=" + iOLrzqt + "&instId=" + instrumentName + "&fromPageSession=" + strUzCIH + "&fromPageSubSource=TAB_" + iOLrzqt + "&from=kline_page&fromPageSource=" + str;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, str3, null, new Function1() { // from class: o.pcp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38614pck.AYXKKw((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }
    }

    public static final Unit AYXKKw(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd(TokenBusinessData tokenBusinessData) {
        BizInstrument bizInstrumentValueOf;
        showLoading();
        this.AEQbTJ = tokenBusinessData.getPos();
        java.lang.String instrumentName = tokenBusinessData.getInstrumentName();
        java.lang.String instType = tokenBusinessData.getInstType();
        InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
        if (interfaceC54581xNrCopydefault == null || (bizInstrumentValueOf = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, instType, instrumentName, null, null, 12, null)) == null) {
            AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl(instType);
            bizInstrumentValueOf = abstractC54531xLwKWHzl != null ? abstractC54531xLwKWHzl.valueOf(instrumentName) : null;
            if (bizInstrumentValueOf == null) {
                return;
            }
        }
        xUV xuv = xUV.EZpvd;
        java.lang.String strAEQbTJ = AEQbTJ(xuv.OLrzqt(bizInstrumentValueOf));
        java.lang.String strKWHzl = xuv.KWHzl(bizInstrumentValueOf);
        java.lang.String strCopydefault = xuv.copydefault(bizInstrumentValueOf);
        java.lang.String str = strCopydefault == null ? "" : strCopydefault;
        java.lang.String strAEQbTJ2 = xuv.AEQbTJ(bizInstrumentValueOf);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KLineMoreTradeFragment$addToOrRemoveFromWatchlist$1(tokenBusinessData, this, new WatchListData(str, strAEQbTJ2 == null ? "" : strAEQbTJ2, strKWHzl, strAEQbTJ, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null), instrumentName, null), 3, null);
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN") ? "SPOT" : str;
    }

    private final void values() {
        if (!this.DbNXlk) {
            this.hDKMBd = "";
        }
        MarketArbCoinInfo marketArbCoinInfo = this.fIwbmz;
        if (marketArbCoinInfo != null) {
            this.ejfBZ = marketArbCoinInfo.getLeftInstId();
            this.uzCIH = marketArbCoinInfo.getLeftInstType();
        }
        java.lang.String str = this.ejfBZ;
        if (str != null) {
            C54472xJr c54472xJrAYXKKw = AYXKKw();
            java.lang.String str2 = this.uzCIH;
            c54472xJrAYXKKw.copydefault(str, str2 != null ? str2 : "");
        }
    }

    private final void OLrzqt(boolean z) {
        if (z) {
            RecyclerView recyclerView = this.zsXlph;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout = this.AwvSrB;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.zsXlph;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout2 = this.AwvSrB;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
        InterfaceC39502ptZ interfaceC39502ptZ = this.OLrzqt;
        if (interfaceC39502ptZ != null) {
            interfaceC39502ptZ.dUDNAs();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.fJNWhG;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.AuCTel;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        InterfaceC54647xQc interfaceC54647xQc = this.AhwBna;
        if (interfaceC54647xQc != null) {
            interfaceC54647xQc.bH_();
        }
    }

    public static /* synthetic */ void refreshStar$default(C38614pck c38614pck, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        c38614pck.EZpvd(str, z);
    }

    public final void EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String instrumentType = gEmmrt().copydefault().getInstrumentType();
        if (Intrinsics.EZpvd((java.lang.Object) instrumentType, (java.lang.Object) "MARGIN")) {
            instrumentType = "SPOT";
        }
        int size = this.copydefault.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.EZpvd((java.lang.Object) this.copydefault.get(i).getInstType(), (java.lang.Object) instrumentType)) {
                this.copydefault.get(i).setWatching(z);
                AhwBna().notifyItemChanged(i, java.lang.Boolean.valueOf(z));
            }
        }
    }

    private final void AEQbTJ(TokenBusinessData tokenBusinessData) {
        java.lang.String str;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOU xouWlaJM;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.KWHzl()), (java.lang.Object) "trade_manual")) {
            str = this.uzCIH;
            if (str == null) {
                str = "SPOT";
            }
        } else {
            str = "BOTS";
        }
        EventParamsList eventParamsList = new EventParamsList();
        eventParamsList.put("deal_type", tokenBusinessData.getInstType(), true);
        eventParamsList.put("from_deal_type", str, true);
        Unit unit = Unit.INSTANCE;
        C32866mlf.onEvent$default("KLine_PageInteraction_Market_Click", "Click", "Button", eventParamsList, null, null, 24, null);
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        C55113xdn c55113xdn = this.AubY;
        if (c55113xdn != null) {
            c55113xdn.setVisibility(0);
        }
        C55113xdn c55113xdn2 = this.AubY;
        if (c55113xdn2 != null) {
            c55113xdn2.setAnimation(C52761wXj.PendingIntent.isConnected);
        }
        C55113xdn c55113xdn3 = this.AubY;
        if (c55113xdn3 != null) {
            c55113xdn3.KWHzl(0L);
        }
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void dismissLoading() {
        C55113xdn c55113xdn = this.AubY;
        if (c55113xdn != null) {
            c55113xdn.setVisibility(8);
        }
        C55113xdn c55113xdn2 = this.AubY;
        if (c55113xdn2 != null) {
            c55113xdn2.copydefault();
        }
    }

    public final void KWHzl(InterfaceC54647xQc interfaceC54647xQc) {
        for (TokenBusinessData tokenBusinessData : this.copydefault) {
            BizInstrument biz = tokenBusinessData.getBiz();
            if (biz != null) {
                tokenBusinessData.setWatching(interfaceC54647xQc.OLrzqt(tokenBusinessData.getInstType(), biz));
            }
        }
        EZpvd();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        RecyclerView recyclerView = this.zsXlph;
        if (recyclerView != null) {
            recyclerView.setAdapter(AhwBna());
        }
    }

    public final void OLrzqt() {
        for (TokenBusinessData tokenBusinessData : this.copydefault) {
            this.values.add(tokenBusinessData.getInstType());
            if (!Intrinsics.EZpvd((java.lang.Object) tokenBusinessData.getInstType(), (java.lang.Object) "OPTION")) {
                this.gEmmrt.add(tokenBusinessData.getInstrumentName());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(java.util.ArrayList<TokenBusinessData> arrayList) {
        java.lang.Object next;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (TokenBusinessData tokenBusinessData : arrayList) {
            java.util.Iterator<T> it = this.copydefault.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                TokenBusinessData tokenBusinessData2 = (TokenBusinessData) next;
                if (Intrinsics.EZpvd((java.lang.Object) tokenBusinessData2.getInstrumentName(), (java.lang.Object) tokenBusinessData.getInstrumentName()) && Intrinsics.EZpvd((java.lang.Object) tokenBusinessData2.getInstType(), (java.lang.Object) tokenBusinessData.getInstType())) {
                    break;
                }
            }
            TokenBusinessData tokenBusinessData3 = (TokenBusinessData) next;
            if (tokenBusinessData3 != null) {
                tokenBusinessData.setPrice(tokenBusinessData3.getPrice());
                tokenBusinessData.setChangePercent(tokenBusinessData3.getChangePercent());
                java.lang.String leverage = tokenBusinessData3.getLeverage();
                if (leverage == null) {
                    BizInstrument biz = tokenBusinessData3.getBiz();
                    SpotInstrument spotInstrument = biz instanceof SpotInstrument ? (SpotInstrument) biz : null;
                    leverage = spotInstrument != null ? spotInstrument.getCoinLever() : "";
                    tokenBusinessData.setLeverage(leverage);
                    tokenBusinessData.setCoinUrl(tokenBusinessData3.getCoinUrl());
                    tokenBusinessData.setIndex(tokenBusinessData3.getIndex());
                    tokenBusinessData.setWatching(tokenBusinessData3.isWatching());
                } else {
                    if (!java.lang.Boolean.valueOf(C33129mqd.OLrzqt((java.lang.CharSequence) leverage)).booleanValue()) {
                        leverage = null;
                    }
                    if (leverage == null) {
                    }
                    tokenBusinessData.setLeverage(leverage);
                    tokenBusinessData.setCoinUrl(tokenBusinessData3.getCoinUrl());
                    tokenBusinessData.setIndex(tokenBusinessData3.getIndex());
                    tokenBusinessData.setWatching(tokenBusinessData3.isWatching());
                }
            }
            arrayList2.add(tokenBusinessData);
        }
        this.copydefault.clear();
        this.copydefault.addAll(new java.util.ArrayList(arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object EZpvd(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        for (TokenBusinessData tokenBusinessData : this.copydefault) {
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(tokenBusinessData.getInstType())) != null) {
                tokenBusinessData.setBiz(abstractC54531xLwOLrzqt.valueOf(tokenBusinessData.getInstrumentName()));
            }
        }
        copydefault();
        java.lang.Object objAEQbTJ = AEQbTJ(continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }
}
