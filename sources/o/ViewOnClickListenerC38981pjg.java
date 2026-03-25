package o;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.ui.arb.ArbMarketKlinePortraitFragment$onClick$3;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.market.common.biz_spot.bean.UnifiedPriceRemind;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.ArbitrageFavoriteBean;
import com.okinc.unify_trade.biz.ArbitrageSetFavoriteBean;
import com.okinc.unify_trade.biz.BotWebHook;
import com.okinc.unify_trade.biz.TokenBusinessData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35964oKf;
import o.C39014pkM;
import o.C47244tmQ;
import o.C52761wXj;
import o.InterfaceC43033rhe;
import o.InterfaceC43294rma;
import o.InterfaceC54577xNn;
import o.InterfaceC8104awT;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pjg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ViewOnClickListenerC38981pjg extends AbstractC32998moE implements InterfaceC39502ptZ, View.OnClickListener {
    public boolean AkhnZx;
    public TokenBusinessData AuCTelauCTel;
    public C33624mzv AubY;
    public android.widget.ImageView AwvSrB;
    public android.widget.ImageView AxsJAY;
    public C33624mzv DTwDnp;
    public android.view.View DbNXlk;
    public android.app.Activity EZpvd;
    public android.view.View KWHzl;
    public android.widget.LinearLayout ORxRYg;
    public C33624mzv OcIXYQ;
    public android.widget.LinearLayout QKVWgx;
    public android.widget.LinearLayout QOLQEE;
    public android.widget.LinearLayout QUSxYX;
    public MarketTopInfo QVAiDq;
    public android.widget.ImageView QbewEr;
    public TokenBusinessData QfsBiF;
    public final InterfaceC56387yDm RJOkX;
    public android.widget.TextView UeEOUB;
    public C57585ylG aKErDB;
    public InterfaceC39499ptW copydefault;
    public final InterfaceC56387yDm dNCPSb;
    public TabLayout djSkpj;
    public android.widget.TextView dvKsVJ;
    public android.widget.TextView dxcTrN;
    public android.widget.LinearLayout ejfBZ;
    public android.widget.LinearLayout fARcdN;
    public android.widget.TextView fFgQHt;
    public C38984pjj fIwbmz;
    public android.widget.LinearLayout fJNWhG;
    public pAK fZBcTu;
    public boolean fetchVPNInfo;
    public android.widget.ImageView gHZMYf;
    public android.widget.TextView getNewProxyInstance;
    public Observer<java.lang.Boolean> hDKMBd;
    public android.widget.TextView iwGUEr;
    public C33624mzv sSMYrx;
    public MarketArbCoinInfo uzCIH;
    public boolean values;
    public C33624mzv wlaJM;
    public java.lang.String zLjUOn;
    public C33624mzv zuBGHE;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public boolean isConnected = true;
    public java.lang.String AuCTel = "kline_dark";
    public final java.lang.String OLrzqt = "conin_info";
    public int AhwBna = Color.parseColor("#121212");
    public int finit = Color.parseColor("#FFFFFF");
    public int gEmmrt = Color.parseColor("#1A1A1A");
    public int valueOf = Color.parseColor("#EBEBEB");
    public int AYXKKw = Color.parseColor("#2E2E2E");
    public java.util.ArrayList<androidx.fragment.app.Fragment> zsXlph = new java.util.ArrayList<>();
    public MutableLiveData<java.lang.Boolean> getFieldNames = new MutableLiveData<>();
    public xDJ djBIcL = new xDJ();
    public xDO RcXXUw = new xDO();

    /* JADX INFO: renamed from: o.pjg$LoaderManager */
    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
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
    @Override // o.InterfaceC39502ptZ
    public void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.InterfaceC39502ptZ
    public void KWHzl(int i, boolean z) {
    }

    @Override // o.InterfaceC39556pua
    public void KWHzl(MarketArbCoinInfo marketArbCoinInfo) {
    }

    @Override // o.InterfaceC39502ptZ
    public void OFhtUX() {
    }

    @Override // o.InterfaceC39502ptZ
    public void QSLkRj() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketArbCoinInfo copydefault() {
        return this.uzCIH;
    }

    @Override // o.InterfaceC39502ptZ
    public void gEmmrt(java.lang.String str) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.AYXKKw;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public ViewOnClickListenerC38981pjg() {
        final Function0 function0 = null;
        this.RJOkX = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C54472xJr.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.arb.ArbMarketKlinePortraitFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.arb.ArbMarketKlinePortraitFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.arb.ArbMarketKlinePortraitFragment$special$$inlined$activityViewModels$default$3
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
        this.dNCPSb = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C37854pDd.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.arb.ArbMarketKlinePortraitFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.arb.ArbMarketKlinePortraitFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.arb.ArbMarketKlinePortraitFragment$special$$inlined$activityViewModels$default$6
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

    private final C54472xJr AhwBna() {
        return (C54472xJr) this.RJOkX.getValue();
    }

    private final C37854pDd values() {
        return (C37854pDd) this.dNCPSb.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        this.EZpvd = (android.app.Activity) context;
        this.copydefault = (InterfaceC39499ptW) context;
    }

    /* JADX INFO: renamed from: o.pjg$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pjg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ ViewOnClickListenerC38981pjg newInstance$default(ActionBar actionBar, MarketArbCoinInfo marketArbCoinInfo, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return actionBar.EZpvd(marketArbCoinInfo, str);
        }

        public final ViewOnClickListenerC38981pjg EZpvd(@NotNull MarketArbCoinInfo marketArbCoinInfo, java.lang.String str) {
            Intrinsics.checkNotNullParameter(marketArbCoinInfo, "");
            ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg = new ViewOnClickListenerC38981pjg();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(oLT.copydefault(), marketArbCoinInfo);
            bundle.putString("from", str);
            viewOnClickListenerC38981pjg.setArguments(bundle);
            return viewOnClickListenerC38981pjg;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        InterfaceC54577xNn interfaceC54577xNn;
        Intrinsics.checkNotNullParameter(view, "");
        pFN pfn = pFN.OLrzqt;
        C37830pCg c37830pCg = C37830pCg.EZpvd;
        java.lang.String strCopydefault = c37830pCg.copydefault();
        Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        pfn.EZpvd(strCopydefault, c37830pCg);
        this.AuCTel = SPUtils.getString("kline_theme_type", "kline_dark");
        this.fJNWhG = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.geAOna);
        android.os.Bundle arguments = getArguments();
        this.uzCIH = arguments != null ? (MarketArbCoinInfo) arguments.getParcelable(oLT.copydefault()) : null;
        android.os.Bundle arguments2 = getArguments();
        this.zLjUOn = arguments2 != null ? arguments2.getString("from") : null;
        this.aKErDB = (C57585ylG) view.findViewById(C35964oKf.StateListAnimator.getExtras);
        this.QOLQEE = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.RIsQag);
        this.AwvSrB = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.keyboardTargetTextChanged);
        this.QUSxYX = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.RjCdvpRjCdvp);
        this.UeEOUB = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.fObYrO);
        this.QbewEr = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.onAvailable);
        this.ejfBZ = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.Ohcwxs);
        this.fFgQHt = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.setPlaybackState);
        this.dxcTrN = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.setPlaybackToLocal);
        this.dvKsVJ = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.setMetadata);
        this.AxsJAY = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.QSusPL);
        this.gHZMYf = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.OVMstZ);
        this.iwGUEr = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.OEsIKP);
        this.getNewProxyInstance = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.QhYuFg);
        this.ORxRYg = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.zFZsbn);
        this.QKVWgx = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.glXhWM);
        this.wlaJM = (C33624mzv) view.findViewById(C35964oKf.StateListAnimator.QSbQqJ);
        this.AubY = (C33624mzv) view.findViewById(C35964oKf.StateListAnimator.setCurrentKeyboardTarget);
        this.OcIXYQ = (C33624mzv) view.findViewById(C35964oKf.StateListAnimator.fdazkH);
        this.DTwDnp = (C33624mzv) view.findViewById(C35964oKf.StateListAnimator.DkGEDn);
        this.sSMYrx = (C33624mzv) view.findViewById(C35964oKf.StateListAnimator.aPFruk);
        this.zuBGHE = (C33624mzv) view.findViewById(C35964oKf.StateListAnimator.apNKau);
        this.fARcdN = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.DPVBvL);
        this.KWHzl = view.findViewById(C35964oKf.StateListAnimator.ORxRYg);
        this.DbNXlk = view.findViewById(C35964oKf.StateListAnimator.DlmWDR);
        C57585ylG c57585ylG = this.aKErDB;
        if (c57585ylG != null) {
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            c57585ylG.setVisibility((interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || !interfaceC54577xNn.EZpvd()) ? 8 : 0);
        }
        AEQbTJ(view);
        AkhnZx();
        OLrzqt();
        android.widget.LinearLayout linearLayout = this.ejfBZ;
        if (linearLayout != null) {
            linearLayout.setTranslationY(70.0f);
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("trade_button_position");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function1 = new Function1() { // from class: o.pjm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38981pjg.AEQbTJ(this.EZpvd, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pjo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC38981pjg.OLrzqt(function1, obj);
            }
        });
        AEQbTJ();
        view.post(new java.lang.Runnable() { // from class: o.pjq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC38981pjg.DbNXlk(this.AEQbTJ);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg, java.lang.String str) {
        viewOnClickListenerC38981pjg.AEQbTJ(SPUtils.getBoolean("trade_button_left", true));
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) viewOnClickListenerC38981pjg, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AkhnZx() {
        boolean z;
        android.widget.ImageView imageView = this.AxsJAY;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        android.widget.ImageView imageView2 = this.AwvSrB;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        android.widget.LinearLayout linearLayout = this.QUSxYX;
        Intrinsics.copydefault(linearLayout);
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(linearLayout);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.pjr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC38981pjg.AEQbTJ(this.copydefault, obj);
            }
        });
        android.widget.TextView textView = this.UeEOUB;
        Intrinsics.copydefault(textView);
        C8003auW.copydefault(textView).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.pju
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC38981pjg.copydefault(this.EZpvd, obj);
            }
        });
        MarketArbCoinInfo marketArbCoinInfo = this.uzCIH;
        if (Intrinsics.EZpvd((java.lang.Object) (marketArbCoinInfo != null ? marketArbCoinInfo.getSelectInstType() : null), (java.lang.Object) "OPTION")) {
            z = false;
        } else {
            z = true;
            if (pFP.isUserInDemoTrading$default(pFP.OLrzqt, null, 1, null)) {
            }
        }
        C33624mzv c33624mzv = this.sSMYrx;
        if (c33624mzv != null) {
            c33624mzv.setVisibility(z ? 0 : 8);
        }
        C33624mzv c33624mzv2 = this.zuBGHE;
        if (c33624mzv2 != null) {
            c33624mzv2.setVisibility(z ? 0 : 8);
        }
        C33624mzv c33624mzv3 = this.sSMYrx;
        if (c33624mzv3 != null) {
            c33624mzv3.setOnClickListener(this);
        }
        C33624mzv c33624mzv4 = this.zuBGHE;
        if (c33624mzv4 != null) {
            c33624mzv4.setOnClickListener(this);
        }
        android.widget.ImageView imageView3 = this.gHZMYf;
        if (imageView3 != null) {
            C8003auW.copydefault(imageView3).throttleFirst(1L, timeUnit).subscribe(new Activity());
        }
        android.widget.ImageView imageView4 = this.AxsJAY;
        if (imageView4 != null) {
            C8003auW.copydefault(imageView4).throttleFirst(1L, timeUnit).subscribe(new Application());
        }
        android.widget.LinearLayout linearLayout2 = this.ejfBZ;
        if (linearLayout2 != null) {
            linearLayout2.setTranslationY(70.0f);
        }
        android.widget.TextView textView2 = this.iwGUEr;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        android.widget.TextView textView3 = this.getNewProxyInstance;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
        C33624mzv c33624mzv5 = this.wlaJM;
        if (c33624mzv5 != null) {
            c33624mzv5.setOnClickListener(this);
        }
        C33624mzv c33624mzv6 = this.AubY;
        if (c33624mzv6 != null) {
            c33624mzv6.setOnClickListener(this);
        }
        C33624mzv c33624mzv7 = this.OcIXYQ;
        if (c33624mzv7 != null) {
            c33624mzv7.setOnClickListener(this);
        }
        C33624mzv c33624mzv8 = this.DTwDnp;
        if (c33624mzv8 != null) {
            c33624mzv8.setOnClickListener(this);
        }
        AhwBna().ejfBZ().observe(this, new LoaderManager(new Function1() { // from class: o.pjy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38981pjg.copydefault(this.EZpvd, (java.util.ArrayList) obj);
            }
        }));
        values().valueOf().observe(this, new LoaderManager(new Function1() { // from class: o.pjx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38981pjg.AEQbTJ(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        values().AhwBna().observe(this, new LoaderManager(new Function1() { // from class: o.pjw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38981pjg.AhwBna(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        values().AYXKKw().observe(this, new LoaderManager(new Function1() { // from class: o.pjv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38981pjg.OLrzqt(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final void AEQbTJ(ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg, java.lang.Object obj) {
        viewOnClickListenerC38981pjg.fJNWhG();
    }

    public static final void copydefault(ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg, java.lang.Object obj) {
        viewOnClickListenerC38981pjg.fJNWhG();
    }

    /* JADX INFO: renamed from: o.pjg$Activity */
    public static final class Activity implements InterfaceC58227yxM<java.lang.Object> {
        public Activity() {
        }

        @Override // o.InterfaceC58227yxM
        public void accept(java.lang.Object obj) throws java.lang.Exception {
            pAK pak;
            if (ViewOnClickListenerC38981pjg.this.copydefault == null || (pak = ViewOnClickListenerC38981pjg.this.fZBcTu) == null) {
                return;
            }
            int currentItem = pak.getCurrentItem();
            InterfaceC39499ptW interfaceC39499ptW = ViewOnClickListenerC38981pjg.this.copydefault;
            if (interfaceC39499ptW != null) {
                interfaceC39499ptW.OLrzqt(currentItem);
            }
        }
    }

    /* JADX INFO: renamed from: o.pjg$Application */
    public static final class Application implements InterfaceC58227yxM<java.lang.Object> {
        public Application() {
        }

        @Override // o.InterfaceC58227yxM
        public void accept(java.lang.Object obj) throws java.lang.Exception {
            ViewOnClickListenerC38981pjg.this.gEmmrt();
        }
    }

    public static final Unit copydefault(ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            viewOnClickListenerC38981pjg.copydefault(arrayList);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg, java.lang.Boolean bool) {
        viewOnClickListenerC38981pjg.fetchVPNInfo = true;
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg, java.lang.Boolean bool) {
        viewOnClickListenerC38981pjg.AkhnZx = true;
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg, java.lang.Boolean bool) {
        viewOnClickListenerC38981pjg.values = true;
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(android.view.View view) {
        this.djSkpj = (TabLayout) view.findViewById(C35964oKf.StateListAnimator.fAklCm);
        this.fZBcTu = (pAK) view.findViewById(C35964oKf.StateListAnimator.gFTCsA);
        fetchVPNInfo();
    }

    private final void fetchVPNInfo() {
        TabLayout.TabView tabView;
        TabLayout.TabView tabView2;
        if (isAdded()) {
            DbNXlk();
            TabLayout tabLayout = this.djSkpj;
            if (tabLayout != null) {
                tabLayout.removeAllTabs();
            }
            pAK pak = this.fZBcTu;
            if (pak != null) {
                pak.removeAllViews();
            }
            TabLayout tabLayout2 = this.djSkpj;
            if (tabLayout2 != null) {
                android.content.res.Resources resources = getResources();
                tabLayout2.setTabRippleColor(resources != null ? android.content.res.ColorStateList.valueOf(resources.getColor(C47244tmQ.Application.copydefault)) : null);
            }
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            this.fIwbmz = new C38984pjj(childFragmentManager, this.zsXlph, AYXKKw());
            TabLayout tabLayout3 = this.djSkpj;
            if (tabLayout3 != null) {
                tabLayout3.setupWithViewPager(this.fZBcTu);
            }
            pAK pak2 = this.fZBcTu;
            if (pak2 != null) {
                pak2.setAdapter(this.fIwbmz);
            }
            pAK pak3 = this.fZBcTu;
            if (pak3 != null) {
                C38984pjj c38984pjj = this.fIwbmz;
                pak3.setOffscreenPageLimit(c38984pjj != null ? c38984pjj.getCount() : 1);
            }
            int i = 0;
            for (java.lang.Object obj : this.zsXlph) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                TabLayout tabLayout4 = this.djSkpj;
                TabLayout.Tab tabAt = tabLayout4 != null ? tabLayout4.getTabAt(i) : null;
                if (tabAt != null && (tabView2 = tabAt.view) != null) {
                    tabView2.setLongClickable(false);
                }
                if (Build.VERSION.SDK_INT >= 26 && tabAt != null && (tabView = tabAt.view) != null) {
                    tabView.setTooltipText(null);
                }
                i++;
            }
            pAK pak4 = this.fZBcTu;
            if (pak4 != null) {
                pak4.addOnPageChangeListener(new TaskDescription());
            }
            setViewPagerScroll(true);
        }
    }

    /* JADX INFO: renamed from: o.pjg$TaskDescription */
    public static final class TaskDescription implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        public TaskDescription() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (i == 0) {
                MarketArbCoinInfo marketArbCoinInfoCopydefault = ViewOnClickListenerC38981pjg.this.copydefault();
                if (marketArbCoinInfoCopydefault != null) {
                    marketArbCoinInfoCopydefault.setSelect(true);
                }
                android.widget.LinearLayout linearLayout = ViewOnClickListenerC38981pjg.this.fJNWhG;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                java.util.List<androidx.fragment.app.Fragment> fragments = ViewOnClickListenerC38981pjg.this.getChildFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "");
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) CollectionsKt___CollectionsKt.AkhnZx(fragments, 0);
                if (fragment != null) {
                    ViewOnClickListenerC38981pjg.this.KWHzl(fragment);
                    return;
                }
                return;
            }
            if (i != 1) {
                android.widget.LinearLayout linearLayout2 = ViewOnClickListenerC38981pjg.this.fJNWhG;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                    return;
                }
                return;
            }
            MarketArbCoinInfo marketArbCoinInfoCopydefault2 = ViewOnClickListenerC38981pjg.this.copydefault();
            if (marketArbCoinInfoCopydefault2 != null) {
                marketArbCoinInfoCopydefault2.setSelect(false);
            }
            android.widget.LinearLayout linearLayout3 = ViewOnClickListenerC38981pjg.this.fJNWhG;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
            java.util.List<androidx.fragment.app.Fragment> fragments2 = ViewOnClickListenerC38981pjg.this.getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments2, "");
            androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) CollectionsKt___CollectionsKt.AkhnZx(fragments2, 1);
            if (fragment2 != null) {
                ViewOnClickListenerC38981pjg.this.KWHzl(fragment2);
            }
        }
    }

    public final void KWHzl(androidx.fragment.app.Fragment fragment) {
        C39014pkM c39014pkM = fragment instanceof C39014pkM ? (C39014pkM) fragment : null;
        if (c39014pkM != null) {
            if (this.values) {
                c39014pkM.ejfBZ();
                this.values = false;
            }
            if (this.fetchVPNInfo) {
                c39014pkM.uzCIH();
                this.fetchVPNInfo = false;
            }
            if (this.AkhnZx) {
                c39014pkM.getFieldNames();
                this.AkhnZx = false;
            }
        }
    }

    private final void DbNXlk() {
        this.zsXlph.clear();
        MarketArbCoinInfo marketArbCoinInfo = this.uzCIH;
        C39014pkM c39014pkMNewInstance$default = marketArbCoinInfo != null ? C39014pkM.ActionBar.newInstance$default(C39014pkM.Companion, marketArbCoinInfo.getLeftInstId(), marketArbCoinInfo.getLeftInstType(), true, true, null, this, 16, null) : null;
        if (c39014pkMNewInstance$default != null) {
            this.zsXlph.add(c39014pkMNewInstance$default);
        }
        MarketArbCoinInfo marketArbCoinInfo2 = this.uzCIH;
        C39014pkM c39014pkMNewInstance$default2 = marketArbCoinInfo2 != null ? C39014pkM.ActionBar.newInstance$default(C39014pkM.Companion, marketArbCoinInfo2.getRightInstId(), marketArbCoinInfo2.getRightInstType(), true, true, null, this, 16, null) : null;
        if (c39014pkMNewInstance$default2 != null) {
            this.zsXlph.add(c39014pkMNewInstance$default2);
        }
        MarketArbCoinInfo marketArbCoinInfo3 = this.uzCIH;
        C38614pck c38614pckAEQbTJ = marketArbCoinInfo3 != null ? C38614pck.Companion.AEQbTJ(marketArbCoinInfo3, this) : null;
        if (c38614pckAEQbTJ != null) {
            this.zsXlph.add(c38614pckAEQbTJ);
        }
    }

    public final C39014pkM KWHzl() {
        if (this.zsXlph.size() <= 0 || !(this.zsXlph.get(0) instanceof C39014pkM)) {
            return null;
        }
        androidx.fragment.app.Fragment fragment = this.zsXlph.get(0);
        Intrinsics.copydefault(fragment, "");
        return (C39014pkM) fragment;
    }

    public final C39014pkM EZpvd() {
        if (this.zsXlph.size() < 2 || !(this.zsXlph.get(1) instanceof C39014pkM)) {
            return null;
        }
        androidx.fragment.app.Fragment fragment = this.zsXlph.get(1);
        Intrinsics.copydefault(fragment, "");
        return (C39014pkM) fragment;
    }

    private final C38614pck isConnected() {
        if (this.zsXlph.size() < 3 || !(this.zsXlph.get(2) instanceof C38614pck)) {
            return null;
        }
        androidx.fragment.app.Fragment fragment = this.zsXlph.get(2);
        Intrinsics.copydefault(fragment, "");
        return (C38614pck) fragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00f4  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onClick(android.view.View view) {
        int iAuCTel;
        java.lang.String selectInstId;
        java.lang.String selectInstType;
        InterfaceC43033rhe interfaceC43033rhe;
        java.lang.String tLocalPrice;
        java.lang.String tPriceNoTh;
        java.lang.String selectInstId2;
        java.lang.String selectInstType2;
        InterfaceC54577xNn interfaceC54577xNn;
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C35964oKf.StateListAnimator.OEsIKP;
        if (numValueOf == null || numValueOf.intValue() != i) {
            int i2 = C35964oKf.StateListAnimator.QhYuFg;
            if (numValueOf == null || numValueOf.intValue() != i2) {
                int i3 = C35964oKf.StateListAnimator.keyboardTargetTextChanged;
                if (numValueOf != null && numValueOf.intValue() == i3) {
                    InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                    if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && interfaceC54577xNn.EZpvd()) {
                        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                        C32866mlf.AEQbTJ("app_demo_trading_chart_button_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pjl
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return ViewOnClickListenerC38981pjg.OLrzqt(this.AEQbTJ, (EventParamsList) obj);
                            }
                        });
                    }
                    InterfaceC39499ptW interfaceC39499ptW = this.copydefault;
                    if (interfaceC39499ptW == null || interfaceC39499ptW == null) {
                        return;
                    }
                    interfaceC39499ptW.AYXKKw();
                    return;
                }
                int i4 = C35964oKf.StateListAnimator.QSbQqJ;
                if (numValueOf == null || numValueOf.intValue() != i4) {
                    int i5 = C35964oKf.StateListAnimator.setCurrentKeyboardTarget;
                    if (numValueOf == null || numValueOf.intValue() != i5) {
                        int i6 = C35964oKf.StateListAnimator.fdazkH;
                        if (numValueOf == null || numValueOf.intValue() != i6) {
                            int i7 = C35964oKf.StateListAnimator.DkGEDn;
                            if (numValueOf == null || numValueOf.intValue() != i7) {
                                int i8 = C35964oKf.StateListAnimator.aPFruk;
                                if (numValueOf == null || numValueOf.intValue() != i8) {
                                    int i9 = C35964oKf.StateListAnimator.apNKau;
                                    if (numValueOf == null || numValueOf.intValue() != i9) {
                                        return;
                                    }
                                }
                                if (!pFP.isLogin$default(pFP.OLrzqt, null, 1, null)) {
                                    InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class);
                                    android.content.Context contextRequireContext = requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                                    InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, contextRequireContext, null, 2, null);
                                    return;
                                }
                                MarketArbCoinInfo marketArbCoinInfo = this.uzCIH;
                                if (marketArbCoinInfo == null || marketArbCoinInfo.isSelectLeft()) {
                                    C39014pkM c39014pkMKWHzl = KWHzl();
                                    if (c39014pkMKWHzl != null) {
                                        iAuCTel = c39014pkMKWHzl.AuCTel();
                                        if (iAuCTel > 0) {
                                            MarketArbCoinInfo marketArbCoinInfo2 = this.uzCIH;
                                            if (marketArbCoinInfo2 != null) {
                                                if (marketArbCoinInfo2 == null || (selectInstId = marketArbCoinInfo2.getSelectInstId()) == null) {
                                                    selectInstId = "";
                                                }
                                                MarketArbCoinInfo marketArbCoinInfo3 = this.uzCIH;
                                                if (marketArbCoinInfo3 == null || (selectInstType = marketArbCoinInfo3.getSelectInstType()) == null) {
                                                    selectInstType = "";
                                                }
                                                java.lang.String strOLrzqt = OLrzqt(selectInstId, selectInstType);
                                                MarketArbCoinInfo marketArbCoinInfo4 = this.uzCIH;
                                                java.lang.String str = (marketArbCoinInfo4 == null || (selectInstType2 = marketArbCoinInfo4.getSelectInstType()) == null) ? "" : selectInstType2;
                                                MarketArbCoinInfo marketArbCoinInfo5 = this.uzCIH;
                                                java.lang.String str2 = (marketArbCoinInfo5 == null || (selectInstId2 = marketArbCoinInfo5.getSelectInstId()) == null) ? "" : selectInstId2;
                                                MarketTopInfo marketTopInfo = this.QVAiDq;
                                                java.lang.String str3 = (marketTopInfo == null || (tPriceNoTh = marketTopInfo.getTPriceNoTh()) == null) ? "" : tPriceNoTh;
                                                MarketTopInfo marketTopInfo2 = this.QVAiDq;
                                                java.lang.String str4 = (marketTopInfo2 == null || (tLocalPrice = marketTopInfo2.getTLocalPrice()) == null) ? "" : tLocalPrice;
                                                java.lang.String simpleName = ActivityC38952pjD.class.getSimpleName();
                                                Intrinsics.checkNotNullExpressionValue(simpleName, "");
                                                UnifiedPriceRemind unifiedPriceRemind = new UnifiedPriceRemind(strOLrzqt, str, str2, str3, str4, simpleName, (java.lang.String) null, 1, 64, (DefaultConstructorMarker) null);
                                                android.app.Activity activity = this.EZpvd;
                                                if (activity == null || (interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class)) == null) {
                                                    return;
                                                }
                                                InterfaceC43033rhe.StateListAnimator.gotoAllPriceRemindActivity$default(interfaceC43033rhe, activity, unifiedPriceRemind, null, 4, null);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } else {
                                    C39014pkM c39014pkMEZpvd = EZpvd();
                                    if (c39014pkMEZpvd != null) {
                                        iAuCTel = c39014pkMEZpvd.AuCTel();
                                        if (iAuCTel > 0) {
                                        }
                                    }
                                }
                                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ArbMarketKlinePortraitFragment$onClick$3(this, null), 3, null);
                                return;
                            }
                        }
                    }
                }
                KWHzl(view.getId());
                return;
            }
        }
        AuCTel();
    }

    public static final Unit OLrzqt(ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg, EventParamsList eventParamsList) {
        java.lang.String strDjBIcL;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(BotWebHook.KEY_ACTION, "back", false);
        InterfaceC39499ptW interfaceC39499ptW = viewOnClickListenerC38981pjg.copydefault;
        if (interfaceC39499ptW != null && (strDjBIcL = interfaceC39499ptW.djBIcL()) != null) {
            eventParamsList.put("type", strDjBIcL, false);
        }
        return Unit.INSTANCE;
    }

    private final void AuCTel() {
        int iOLrzqt;
        java.lang.String leftInstType;
        java.lang.String leftInstId;
        java.lang.String leftType;
        java.lang.String rightInstType;
        java.lang.String rightType;
        InterfaceC49497upf interfaceC49497upf = (InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI);
        java.lang.String rightInstId = "";
        if (interfaceC49497upf != null) {
            MarketArbCoinInfo marketArbCoinInfo = this.uzCIH;
            if (marketArbCoinInfo == null || (leftInstType = marketArbCoinInfo.getLeftInstType()) == null) {
                leftInstType = "";
            }
            MarketArbCoinInfo marketArbCoinInfo2 = this.uzCIH;
            if (marketArbCoinInfo2 == null || (leftInstId = marketArbCoinInfo2.getLeftInstId()) == null) {
                leftInstId = "";
            }
            MarketArbCoinInfo marketArbCoinInfo3 = this.uzCIH;
            if (marketArbCoinInfo3 == null || (leftType = marketArbCoinInfo3.getLeftType()) == null) {
                leftType = "sell";
            }
            MarketArbCoinInfo marketArbCoinInfo4 = this.uzCIH;
            if (marketArbCoinInfo4 == null || (rightInstType = marketArbCoinInfo4.getRightInstType()) == null) {
                rightInstType = "";
            }
            MarketArbCoinInfo marketArbCoinInfo5 = this.uzCIH;
            java.lang.String rightInstId2 = marketArbCoinInfo5 != null ? marketArbCoinInfo5.getRightInstId() : null;
            MarketArbCoinInfo marketArbCoinInfo6 = this.uzCIH;
            if (marketArbCoinInfo6 == null || (rightType = marketArbCoinInfo6.getRightType()) == null) {
                rightType = "buy";
            }
            interfaceC49497upf.copydefault(leftInstType, leftInstId, leftType, rightInstType, rightInstId2, rightType);
        }
        MarketArbCoinInfo marketArbCoinInfo7 = this.uzCIH;
        if (marketArbCoinInfo7 == null) {
            iOLrzqt = 0;
        } else if (marketArbCoinInfo7.isSelectLeft()) {
            rightInstId = marketArbCoinInfo7.getLeftInstId();
            iOLrzqt = C48914uef.EZpvd.OLrzqt(marketArbCoinInfo7.getLeftInstType());
        } else {
            rightInstId = marketArbCoinInfo7.getRightInstId();
            iOLrzqt = C48914uef.EZpvd.OLrzqt(marketArbCoinInfo7.getRightInstType());
        }
        java.lang.String str = ((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class)).OLrzqt() + "?bizType=" + iOLrzqt + "&instId=" + ((java.lang.Object) rightInstId) + "&from=kline_page&fromPageSource=" + this.zLjUOn;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, str, null, new Function1() { // from class: o.pjn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC38981pjg.OLrzqt((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }
        C32866mlf.onEvent$default("app_kpage_trade_click", "Click", "Button", null, null, null, 28, null);
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    private final void KWHzl(int i) {
        java.lang.String str;
        ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg;
        int i2;
        if (i == C35964oKf.StateListAnimator.fdazkH || i == C35964oKf.StateListAnimator.DkGEDn) {
            str = "margins";
            viewOnClickListenerC38981pjg = this;
            i2 = 1;
        } else {
            str = "spot";
            i2 = 0;
            viewOnClickListenerC38981pjg = this;
        }
        MarketArbCoinInfo marketArbCoinInfo = viewOnClickListenerC38981pjg.uzCIH;
        if (marketArbCoinInfo != null) {
            java.lang.String leftInstId = marketArbCoinInfo.isSelectLeft() ? marketArbCoinInfo.getLeftInstId() : marketArbCoinInfo.getRightInstId();
            java.lang.String str2 = ((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class)).OLrzqt() + "?bizType=" + i2 + "&instId=" + leftInstId;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, str2, null, new Function1() { // from class: o.pjs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC38981pjg.AEQbTJ((AbstractC43238rlX) obj);
                    }
                }, 4, null);
            }
        }
        EventParamsList eventParamsList = new EventParamsList();
        eventParamsList.put("button_type", str, true);
        Unit unit = Unit.INSTANCE;
        C32866mlf.onEvent$default("KLine_Btm_Button_Click", "Click", "Button", eventParamsList, null, null, 24, null);
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39556pua
    public void EZpvd(MarketCoinInfo marketCoinInfo) {
        C33624mzv c33624mzv = this.sSMYrx;
        if (c33624mzv != null) {
            c33624mzv.setClickable(false);
        }
        C33624mzv c33624mzv2 = this.zuBGHE;
        if (c33624mzv2 != null) {
            c33624mzv2.setClickable(false);
        }
    }

    @Override // o.InterfaceC39502ptZ
    public void dUDNAs() {
        android.widget.ImageView imageView = this.gHZMYf;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    @Override // o.InterfaceC39502ptZ
    public void isConnected(boolean z) {
        this.isConnected = z;
        C33624mzv c33624mzv = this.sSMYrx;
        if (c33624mzv != null) {
            c33624mzv.setClickable(true);
        }
        C33624mzv c33624mzv2 = this.zuBGHE;
        if (c33624mzv2 != null) {
            c33624mzv2.setClickable(true);
        }
        if (z) {
            C33624mzv c33624mzv3 = this.sSMYrx;
            if (c33624mzv3 != null) {
                pFQ.AEQbTJ(c33624mzv3, C52761wXj.TaskDescription.addPreRequisiteCollector);
            }
            C33624mzv c33624mzv4 = this.zuBGHE;
            if (c33624mzv4 != null) {
                pFQ.AEQbTJ(c33624mzv4, C52761wXj.TaskDescription.addPreRequisiteCollector);
                return;
            }
            return;
        }
        C33624mzv c33624mzv5 = this.sSMYrx;
        if (c33624mzv5 != null) {
            pFQ.AEQbTJ(c33624mzv5, C52761wXj.TaskDescription.invokespecialhrnhsO);
        }
        C33624mzv c33624mzv6 = this.zuBGHE;
        if (c33624mzv6 != null) {
            pFQ.AEQbTJ(c33624mzv6, C52761wXj.TaskDescription.invokespecialhrnhsO);
        }
    }

    @Override // o.InterfaceC39502ptZ
    public void AEQbTJ(@NotNull MarketTopInfo marketTopInfo) {
        Intrinsics.checkNotNullParameter(marketTopInfo, "");
        this.QVAiDq = marketTopInfo;
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) marketTopInfo.getTIncrease(), (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null)) {
            android.app.Activity activity = this.EZpvd;
            if (activity != null) {
                int iAEQbTJ = C33508mxl.AEQbTJ(activity);
                android.widget.TextView textView = this.dxcTrN;
                if (textView != null) {
                    textView.setTextColor(iAEQbTJ);
                }
            }
            android.app.Activity activity2 = this.EZpvd;
            if (activity2 != null) {
                int iAEQbTJ2 = C33508mxl.AEQbTJ(activity2);
                android.widget.TextView textView2 = this.fFgQHt;
                if (textView2 != null) {
                    textView2.setTextColor(iAEQbTJ2);
                }
            }
            android.app.Activity activity3 = this.EZpvd;
            if (activity3 != null) {
                int iAEQbTJ3 = C33508mxl.AEQbTJ(activity3);
                android.widget.TextView textView3 = this.dvKsVJ;
                if (textView3 != null) {
                    textView3.setTextColor(iAEQbTJ3);
                }
            }
        } else {
            android.app.Activity activity4 = this.EZpvd;
            if (activity4 != null) {
                int iCopydefault = C33508mxl.copydefault(activity4);
                android.widget.TextView textView4 = this.dxcTrN;
                if (textView4 != null) {
                    textView4.setTextColor(iCopydefault);
                }
            }
            android.app.Activity activity5 = this.EZpvd;
            if (activity5 != null) {
                int iCopydefault2 = C33508mxl.copydefault(activity5);
                android.widget.TextView textView5 = this.fFgQHt;
                if (textView5 != null) {
                    textView5.setTextColor(iCopydefault2);
                }
            }
            android.app.Activity activity6 = this.EZpvd;
            if (activity6 != null) {
                int iCopydefault3 = C33508mxl.copydefault(activity6);
                android.widget.TextView textView6 = this.dvKsVJ;
                if (textView6 != null) {
                    textView6.setTextColor(iCopydefault3);
                }
            }
        }
        android.widget.TextView textView7 = this.fFgQHt;
        if (textView7 != null) {
            textView7.setText(marketTopInfo.getTPrice());
        }
        android.widget.TextView textView8 = this.dxcTrN;
        if (textView8 != null) {
            textView8.setText(marketTopInfo.getTIncrease());
        }
        android.widget.TextView textView9 = this.dvKsVJ;
        if (textView9 != null) {
            textView9.setText(marketTopInfo.getTLocalPrice());
        }
    }

    private final void fJNWhG() {
        uBU ubu;
        if (!isAdded() || (ubu = (uBU) C43251rlk.OLrzqt(uBU.class)) == null) {
            return;
        }
        ubu.AEQbTJ(new Function1() { // from class: o.pjz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38981pjg.EZpvd(this.copydefault, (MarketArbCoinInfo) obj);
            }
        }, new Function1() { // from class: o.pjB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38981pjg.copydefault(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        }, getChildFragmentManager(), false);
    }

    public static final Unit EZpvd(ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg, MarketArbCoinInfo marketArbCoinInfo) {
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn;
        Intrinsics.checkNotNullParameter(marketArbCoinInfo, "");
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && ((interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || !interfaceC54577xNn.EZpvd())) {
            viewOnClickListenerC38981pjg.EZpvd(true);
        }
        InterfaceC39499ptW interfaceC39499ptW = viewOnClickListenerC38981pjg.copydefault;
        if (interfaceC39499ptW != null) {
            interfaceC39499ptW.KWHzl(marketArbCoinInfo);
        }
        android.widget.ImageView imageView = viewOnClickListenerC38981pjg.AxsJAY;
        if (imageView != null) {
            imageView.setSelected(marketArbCoinInfo.isWatch());
        }
        viewOnClickListenerC38981pjg.uzCIH = marketArbCoinInfo;
        C38984pjj c38984pjj = viewOnClickListenerC38981pjg.fIwbmz;
        if (c38984pjj != null) {
            c38984pjj.KWHzl(viewOnClickListenerC38981pjg.AYXKKw());
        }
        C39014pkM c39014pkMKWHzl = viewOnClickListenerC38981pjg.KWHzl();
        if (c39014pkMKWHzl != null) {
            c39014pkMKWHzl.EZpvd(marketArbCoinInfo.getLeftInstId(), marketArbCoinInfo.getLeftInstType());
        }
        C39014pkM c39014pkMEZpvd = viewOnClickListenerC38981pjg.EZpvd();
        if (c39014pkMEZpvd != null) {
            c39014pkMEZpvd.EZpvd(marketArbCoinInfo.getRightInstId(), marketArbCoinInfo.getRightInstType());
        }
        C38614pck c38614pckIsConnected = viewOnClickListenerC38981pjg.isConnected();
        if (c38614pckIsConnected != null) {
            c38614pckIsConnected.KWHzl(marketArbCoinInfo);
        }
        viewOnClickListenerC38981pjg.OLrzqt();
        viewOnClickListenerC38981pjg.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg, boolean z) {
        android.widget.ImageView imageView = viewOnClickListenerC38981pjg.QbewEr;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        return Unit.INSTANCE;
    }

    public final java.util.ArrayList<java.lang.String> AYXKKw() {
        java.lang.String leftInstId;
        java.lang.String leftInstType;
        java.lang.String rightInstId;
        java.lang.String rightInstType;
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        MarketArbCoinInfo marketArbCoinInfo = this.uzCIH;
        java.lang.String str = "";
        if (marketArbCoinInfo == null || (leftInstId = marketArbCoinInfo.getLeftInstId()) == null) {
            leftInstId = "";
        }
        MarketArbCoinInfo marketArbCoinInfo2 = this.uzCIH;
        if (marketArbCoinInfo2 == null || (leftInstType = marketArbCoinInfo2.getLeftInstType()) == null) {
            leftInstType = "";
        }
        arrayList.add(OLrzqt(leftInstId, leftInstType));
        MarketArbCoinInfo marketArbCoinInfo3 = this.uzCIH;
        if (marketArbCoinInfo3 == null || (rightInstId = marketArbCoinInfo3.getRightInstId()) == null) {
            rightInstId = "";
        }
        MarketArbCoinInfo marketArbCoinInfo4 = this.uzCIH;
        if (marketArbCoinInfo4 != null && (rightInstType = marketArbCoinInfo4.getRightInstType()) != null) {
            str = rightInstType;
        }
        arrayList.add(OLrzqt(rightInstId, str));
        arrayList.add(getString(C35964oKf.Fragment.DGOPHZ));
        return arrayList;
    }

    @Override // o.InterfaceC39502ptZ
    public void AkhnZx(boolean z) {
        this.finit = getResources().getColor(C52761wXj.Activity.EZpvd);
        int color = getResources().getColor(C52761wXj.Activity.EZpvd);
        this.AhwBna = color;
        if (z) {
            android.widget.LinearLayout linearLayout = this.fARcdN;
            if (linearLayout != null) {
                linearLayout.setBackgroundColor(color);
            }
            android.widget.LinearLayout linearLayout2 = this.ORxRYg;
            if (linearLayout2 != null) {
                linearLayout2.setBackgroundColor(this.gEmmrt);
            }
            android.widget.LinearLayout linearLayout3 = this.QKVWgx;
            if (linearLayout3 != null) {
                linearLayout3.setBackgroundColor(this.gEmmrt);
            }
            android.view.View view = this.KWHzl;
            if (view != null) {
                view.setBackgroundColor(this.AYXKKw);
            }
            android.view.View view2 = this.DbNXlk;
            if (view2 != null) {
                view2.setBackgroundColor(this.AYXKKw);
                return;
            }
            return;
        }
        android.widget.LinearLayout linearLayout4 = this.fARcdN;
        if (linearLayout4 != null) {
            linearLayout4.setBackgroundColor(this.finit);
        }
        android.widget.LinearLayout linearLayout5 = this.ORxRYg;
        if (linearLayout5 != null) {
            linearLayout5.setBackgroundColor(this.finit);
        }
        android.widget.LinearLayout linearLayout6 = this.QKVWgx;
        if (linearLayout6 != null) {
            linearLayout6.setBackgroundColor(this.finit);
        }
        android.view.View view3 = this.KWHzl;
        if (view3 != null) {
            view3.setBackgroundColor(this.valueOf);
        }
        android.view.View view4 = this.DbNXlk;
        if (view4 != null) {
            view4.setBackgroundColor(this.valueOf);
        }
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
        return C48914uef.getTitleByIdAndType$default(C48914uef.EZpvd, str, str2, false, false, getContext(), false, false, 108, null);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        InterfaceC39499ptW interfaceC39499ptW;
        super.onResume();
        valueOf();
        if (Intrinsics.EZpvd((java.lang.Object) "kline_follow_app", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            if (C33492mxV.OLrzqt()) {
                InterfaceC39499ptW interfaceC39499ptW2 = this.copydefault;
                if (interfaceC39499ptW2 == null || interfaceC39499ptW2 == null) {
                    return;
                }
                interfaceC39499ptW2.EZpvd(2);
                return;
            }
            if (C33492mxV.EZpvd() != 1 || (interfaceC39499ptW = this.copydefault) == null || interfaceC39499ptW == null) {
                return;
            }
            interfaceC39499ptW.EZpvd(1);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            return;
        }
        this.AuCTel = SPUtils.getString("kline_theme_type", "kline_dark");
        if (Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            InterfaceC39499ptW interfaceC39499ptW3 = this.copydefault;
            if (interfaceC39499ptW3 == null || interfaceC39499ptW3 == null) {
                return;
            }
            interfaceC39499ptW3.EZpvd(2);
            return;
        }
        InterfaceC39499ptW interfaceC39499ptW4 = this.copydefault;
        if (interfaceC39499ptW4 == null || interfaceC39499ptW4 == null) {
            return;
        }
        interfaceC39499ptW4.EZpvd(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt() {
        java.lang.String leftInstId;
        java.lang.String leftInstType;
        java.lang.String rightInstId;
        int iAEQbTJ;
        int iAEQbTJ2;
        java.lang.String rightInstType;
        MarketArbCoinInfo marketArbCoinInfo = this.uzCIH;
        java.lang.String string = getString((marketArbCoinInfo == null || !marketArbCoinInfo.getLeftIsBuy()) ? C35964oKf.Fragment.gkZNMa : C35964oKf.Fragment.hNurIN);
        Intrinsics.copydefault((java.lang.Object) string);
        MarketArbCoinInfo marketArbCoinInfo2 = this.uzCIH;
        java.lang.String str = "";
        if (marketArbCoinInfo2 == null || (leftInstId = marketArbCoinInfo2.getLeftInstId()) == null) {
            leftInstId = "";
        }
        MarketArbCoinInfo marketArbCoinInfo3 = this.uzCIH;
        if (marketArbCoinInfo3 == null || (leftInstType = marketArbCoinInfo3.getLeftInstType()) == null) {
            leftInstType = "";
        }
        java.lang.String strOLrzqt = OLrzqt(leftInstId, leftInstType);
        MarketArbCoinInfo marketArbCoinInfo4 = this.uzCIH;
        java.lang.String string2 = getString((marketArbCoinInfo4 == null || !marketArbCoinInfo4.getRightIsBuy()) ? C35964oKf.Fragment.gkZNMa : C35964oKf.Fragment.hNurIN);
        Intrinsics.copydefault((java.lang.Object) string2);
        MarketArbCoinInfo marketArbCoinInfo5 = this.uzCIH;
        if (marketArbCoinInfo5 == null || (rightInstId = marketArbCoinInfo5.getRightInstId()) == null) {
            rightInstId = "";
        }
        MarketArbCoinInfo marketArbCoinInfo6 = this.uzCIH;
        if (marketArbCoinInfo6 != null && (rightInstType = marketArbCoinInfo6.getRightInstType()) != null) {
            str = rightInstType;
        }
        java.lang.String strOLrzqt2 = OLrzqt(rightInstId, str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = string.length();
        sb.append(string + " ");
        sb.append(strOLrzqt);
        sb.append('\n');
        int length2 = sb.length();
        sb.append(string2 + " ");
        int length3 = string2.length() + length2;
        sb.append(strOLrzqt2);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) sb.toString());
        StateListAnimator stateListAnimator = new StateListAnimator();
        spannableStringBuilder.setSpan(stateListAnimator, 0, length, 33);
        spannableStringBuilder.setSpan(stateListAnimator, length2, length3, 33);
        MarketArbCoinInfo marketArbCoinInfo7 = this.uzCIH;
        if (marketArbCoinInfo7 == null || !marketArbCoinInfo7.getLeftIsBuy()) {
            android.content.Context context = getContext();
            iAEQbTJ = context != null ? C33508mxl.AEQbTJ(context) : 0;
        } else {
            android.content.Context context2 = getContext();
            if (context2 != null) {
                iAEQbTJ = C33508mxl.copydefault(context2);
            }
        }
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(iAEQbTJ);
        MarketArbCoinInfo marketArbCoinInfo8 = this.uzCIH;
        if (marketArbCoinInfo8 == null || !marketArbCoinInfo8.getRightIsBuy()) {
            android.content.Context context3 = getContext();
            iAEQbTJ2 = context3 != null ? C33508mxl.AEQbTJ(context3) : 0;
        } else {
            android.content.Context context4 = getContext();
            if (context4 != null) {
                iAEQbTJ2 = C33508mxl.copydefault(context4);
            }
        }
        android.text.style.ForegroundColorSpan foregroundColorSpan2 = new android.text.style.ForegroundColorSpan(iAEQbTJ2);
        spannableStringBuilder.setSpan(foregroundColorSpan, 0, length, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan2, length2, length3, 33);
        android.widget.TextView textView = this.UeEOUB;
        if (textView != null) {
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        android.widget.TextView textView2 = this.UeEOUB;
        if (textView2 != null) {
            textView2.setText(spannableStringBuilder);
        }
    }

    /* JADX INFO: renamed from: o.pjg$StateListAnimator */
    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AhwBna().AuCTel();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        oLF.EZpvd.AEQbTJ();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Observer<java.lang.Boolean> observer = this.hDKMBd;
        if (observer != null) {
            this.getFieldNames.removeObserver(observer);
        }
        this.RcXXUw.AYXKKw();
        this.djBIcL.AYXKKw();
    }

    @Override // o.InterfaceC39500ptX
    public void setViewPagerScroll(boolean z) {
        pAK pak = this.fZBcTu;
        if (pak != null) {
            pak.setScroll(z);
        }
    }

    public final void valueOf() {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn2;
        if (!pFP.isLogin$default(pFP.OLrzqt, null, 1, null) || ((interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) != null && (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && interfaceC54577xNn2.EZpvd())) {
            EZpvd(false);
        }
        Observer<java.lang.Boolean> observer = new Observer() { // from class: o.pjp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ViewOnClickListenerC38981pjg.EZpvd(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        };
        this.hDKMBd = observer;
        MutableLiveData<java.lang.Boolean> mutableLiveData = this.getFieldNames;
        Intrinsics.copydefault(observer);
        mutableLiveData.observeForever(observer);
        InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM2 == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null) {
            return;
        }
        InterfaceC54577xNn.ActionBar.ensureInitArbitrageTrade$default(interfaceC54577xNn, this.getFieldNames, false, 2, null);
    }

    public static final void EZpvd(ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg, boolean z) {
        if (z) {
            viewOnClickListenerC38981pjg.djBIcL();
        }
    }

    public final void djBIcL() {
        InterfaceC55813xqy interfaceC55813xqyKWHzl;
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54577xNn interfaceC54577xNn2;
        java.lang.String leftInstId;
        java.lang.String leftInstType;
        java.lang.String leftType;
        java.lang.String rightInstId;
        java.lang.String rightInstType;
        java.lang.String rightType;
        InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM2 == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null) {
            interfaceC55813xqyKWHzl = null;
        } else {
            MarketArbCoinInfo marketArbCoinInfo = this.uzCIH;
            if (marketArbCoinInfo == null || (leftInstId = marketArbCoinInfo.getLeftInstId()) == null) {
                leftInstId = "";
            }
            MarketArbCoinInfo marketArbCoinInfo2 = this.uzCIH;
            if (marketArbCoinInfo2 == null || (leftInstType = marketArbCoinInfo2.getLeftInstType()) == null) {
                leftInstType = "";
            }
            MarketArbCoinInfo marketArbCoinInfo3 = this.uzCIH;
            if (marketArbCoinInfo3 == null || (leftType = marketArbCoinInfo3.getLeftType()) == null) {
                leftType = "";
            }
            MarketArbCoinInfo marketArbCoinInfo4 = this.uzCIH;
            if (marketArbCoinInfo4 == null || (rightInstId = marketArbCoinInfo4.getRightInstId()) == null) {
                rightInstId = "";
            }
            MarketArbCoinInfo marketArbCoinInfo5 = this.uzCIH;
            if (marketArbCoinInfo5 == null || (rightInstType = marketArbCoinInfo5.getRightInstType()) == null) {
                rightInstType = "";
            }
            MarketArbCoinInfo marketArbCoinInfo6 = this.uzCIH;
            if (marketArbCoinInfo6 == null || (rightType = marketArbCoinInfo6.getRightType()) == null) {
                rightType = "";
            }
            interfaceC55813xqyKWHzl = interfaceC54577xNn2.KWHzl(leftInstId, leftInstType, leftType, rightInstId, rightInstType, rightType);
        }
        if (interfaceC55813xqyKWHzl != null) {
            if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && ((interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || !interfaceC54577xNn.EZpvd())) {
                EZpvd(true);
            }
            EZpvd(interfaceC55813xqyKWHzl);
            return;
        }
        EZpvd(false);
    }

    public final void EZpvd(final InterfaceC55813xqy interfaceC55813xqy) {
        xDJ xdj = this.djBIcL;
        xdj.KWHzl(new Function1() { // from class: o.pji
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38981pjg.OLrzqt(interfaceC55813xqy, this, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xdj, 0L, 1, null);
    }

    public final void gEmmrt() {
        InterfaceC54577xNn interfaceC54577xNn;
        java.lang.String leftInstId;
        java.lang.String leftInstType;
        java.lang.String leftType;
        java.lang.String rightInstId;
        java.lang.String rightInstType;
        java.lang.String rightType;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) {
            return;
        }
        MarketArbCoinInfo marketArbCoinInfo = this.uzCIH;
        if (marketArbCoinInfo == null || (leftInstId = marketArbCoinInfo.getLeftInstId()) == null) {
            leftInstId = "";
        }
        MarketArbCoinInfo marketArbCoinInfo2 = this.uzCIH;
        if (marketArbCoinInfo2 == null || (leftInstType = marketArbCoinInfo2.getLeftInstType()) == null) {
            leftInstType = "";
        }
        MarketArbCoinInfo marketArbCoinInfo3 = this.uzCIH;
        if (marketArbCoinInfo3 == null || (leftType = marketArbCoinInfo3.getLeftType()) == null) {
            leftType = "";
        }
        MarketArbCoinInfo marketArbCoinInfo4 = this.uzCIH;
        if (marketArbCoinInfo4 == null || (rightInstId = marketArbCoinInfo4.getRightInstId()) == null) {
            rightInstId = "";
        }
        MarketArbCoinInfo marketArbCoinInfo5 = this.uzCIH;
        if (marketArbCoinInfo5 == null || (rightInstType = marketArbCoinInfo5.getRightInstType()) == null) {
            rightInstType = "";
        }
        MarketArbCoinInfo marketArbCoinInfo6 = this.uzCIH;
        if (marketArbCoinInfo6 == null || (rightType = marketArbCoinInfo6.getRightType()) == null) {
            rightType = "";
        }
        InterfaceC55813xqy interfaceC55813xqyKWHzl = interfaceC54577xNn.KWHzl(leftInstId, leftInstType, leftType, rightInstId, rightInstType, rightType);
        if (interfaceC55813xqyKWHzl == null) {
            return;
        }
        showLoading();
        ArbitrageSetFavoriteBean arbitrageSetFavoriteBean = new ArbitrageSetFavoriteBean();
        android.widget.ImageView imageView = this.AxsJAY;
        arbitrageSetFavoriteBean.setOperator((imageView == null || !imageView.isSelected()) ? 0 : 1);
        arbitrageSetFavoriteBean.setArbitrageId(interfaceC55813xqyKWHzl.getArbId());
        arbitrageSetFavoriteBean.setArbitrageType(interfaceC55813xqyKWHzl.getArbType());
        arbitrageSetFavoriteBean.setGroupType(interfaceC55813xqyKWHzl.getArbGroupType());
        arbitrageSetFavoriteBean.setCtType(interfaceC55813xqyKWHzl.getArbCtType());
        arbitrageSetFavoriteBean.setCcy(interfaceC55813xqyKWHzl.getArbCcy());
        xDO xdo = this.RcXXUw;
        xdo.copydefault(arbitrageSetFavoriteBean);
        xdo.KWHzl(new Function1() { // from class: o.pjt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38981pjg.AEQbTJ(this.KWHzl, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xdo, 0L, 1, null);
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg, ResponseData responseData) {
        android.widget.ImageView imageView;
        Intrinsics.checkNotNullParameter(responseData, "");
        viewOnClickListenerC38981pjg.dismissLoading();
        if (responseData.getCode() == 0 && (imageView = viewOnClickListenerC38981pjg.AxsJAY) != null) {
            imageView.setSelected(!(imageView != null ? imageView.isSelected() : false));
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(boolean z) {
        android.widget.ImageView imageView = this.AxsJAY;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 4);
        }
    }

    public final void AEQbTJ() {
        if (this.uzCIH == null) {
            android.widget.LinearLayout linearLayout = this.ORxRYg;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout2 = this.QKVWgx;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
                return;
            }
            return;
        }
        AEQbTJ(SPUtils.getBoolean("trade_button_left", true));
        C33624mzv c33624mzv = this.wlaJM;
        if (c33624mzv != null) {
            c33624mzv.setVisibility(4);
        }
        C33624mzv c33624mzv2 = this.AubY;
        if (c33624mzv2 != null) {
            c33624mzv2.setVisibility(4);
        }
        C33624mzv c33624mzv3 = this.OcIXYQ;
        if (c33624mzv3 != null) {
            c33624mzv3.setVisibility(4);
        }
        C33624mzv c33624mzv4 = this.DTwDnp;
        if (c33624mzv4 != null) {
            c33624mzv4.setVisibility(4);
        }
        MarketArbCoinInfo marketArbCoinInfo = this.uzCIH;
        if (marketArbCoinInfo != null) {
            AhwBna().copydefault(marketArbCoinInfo.getLeftInstId(), marketArbCoinInfo.getLeftInstType());
        }
    }

    private final void copydefault(java.util.List<TokenBusinessData> list) {
        fIwbmz();
        AEQbTJ(list);
    }

    private final void fIwbmz() {
        C33624mzv c33624mzv = this.wlaJM;
        if (c33624mzv != null) {
            c33624mzv.setVisibility(0);
        }
        C33624mzv c33624mzv2 = this.AubY;
        if (c33624mzv2 != null) {
            c33624mzv2.setVisibility(0);
        }
        C33624mzv c33624mzv3 = this.OcIXYQ;
        if (c33624mzv3 != null) {
            c33624mzv3.setVisibility(0);
        }
        C33624mzv c33624mzv4 = this.DTwDnp;
        if (c33624mzv4 != null) {
            c33624mzv4.setVisibility(0);
        }
        C33624mzv c33624mzv5 = this.wlaJM;
        if (c33624mzv5 != null) {
            c33624mzv5.setClickable(false);
        }
        C33624mzv c33624mzv6 = this.AubY;
        if (c33624mzv6 != null) {
            c33624mzv6.setClickable(false);
        }
        C33624mzv c33624mzv7 = this.OcIXYQ;
        if (c33624mzv7 != null) {
            c33624mzv7.setClickable(false);
        }
        C33624mzv c33624mzv8 = this.DTwDnp;
        if (c33624mzv8 != null) {
            c33624mzv8.setClickable(false);
        }
        C33624mzv c33624mzv9 = this.wlaJM;
        if (c33624mzv9 != null) {
            c33624mzv9.setAlpha(0.3f);
        }
        C33624mzv c33624mzv10 = this.AubY;
        if (c33624mzv10 != null) {
            c33624mzv10.setAlpha(0.3f);
        }
        C33624mzv c33624mzv11 = this.OcIXYQ;
        if (c33624mzv11 != null) {
            c33624mzv11.setAlpha(0.3f);
        }
        C33624mzv c33624mzv12 = this.DTwDnp;
        if (c33624mzv12 != null) {
            c33624mzv12.setAlpha(0.3f);
        }
    }

    public final void AEQbTJ(java.util.List<TokenBusinessData> list) {
        for (TokenBusinessData tokenBusinessData : list) {
            if (tokenBusinessData != null && C33129mqd.OLrzqt((java.lang.CharSequence) tokenBusinessData.getInstType())) {
                if (Intrinsics.EZpvd((java.lang.Object) tokenBusinessData.getInstType(), (java.lang.Object) oLT.fetchVPNInfo())) {
                    this.AuCTelauCTel = tokenBusinessData;
                    C33624mzv c33624mzv = this.wlaJM;
                    if (c33624mzv != null) {
                        c33624mzv.setClickable(tokenBusinessData.getAvailable());
                    }
                    C33624mzv c33624mzv2 = this.AubY;
                    if (c33624mzv2 != null) {
                        c33624mzv2.setClickable(tokenBusinessData.getAvailable());
                    }
                    if (tokenBusinessData.getAvailable()) {
                        C33624mzv c33624mzv3 = this.wlaJM;
                        if (c33624mzv3 != null) {
                            c33624mzv3.setAlpha(1.0f);
                        }
                        C33624mzv c33624mzv4 = this.AubY;
                        if (c33624mzv4 != null) {
                            c33624mzv4.setAlpha(1.0f);
                        }
                    } else {
                        C33624mzv c33624mzv5 = this.wlaJM;
                        if (c33624mzv5 != null) {
                            c33624mzv5.setAlpha(0.3f);
                        }
                        C33624mzv c33624mzv6 = this.AubY;
                        if (c33624mzv6 != null) {
                            c33624mzv6.setAlpha(0.3f);
                        }
                    }
                } else if (Intrinsics.EZpvd((java.lang.Object) tokenBusinessData.getInstType(), (java.lang.Object) oLT.isConnected())) {
                    this.QfsBiF = tokenBusinessData;
                    C33624mzv c33624mzv7 = this.OcIXYQ;
                    if (c33624mzv7 != null) {
                        c33624mzv7.setClickable(tokenBusinessData.getAvailable());
                    }
                    C33624mzv c33624mzv8 = this.DTwDnp;
                    if (c33624mzv8 != null) {
                        c33624mzv8.setClickable(tokenBusinessData.getAvailable());
                    }
                    if (tokenBusinessData.getAvailable()) {
                        C33624mzv c33624mzv9 = this.OcIXYQ;
                        if (c33624mzv9 != null) {
                            c33624mzv9.setAlpha(1.0f);
                        }
                        C33624mzv c33624mzv10 = this.DTwDnp;
                        if (c33624mzv10 != null) {
                            c33624mzv10.setAlpha(1.0f);
                        }
                    } else {
                        C33624mzv c33624mzv11 = this.OcIXYQ;
                        if (c33624mzv11 != null) {
                            c33624mzv11.setAlpha(0.3f);
                        }
                        C33624mzv c33624mzv12 = this.DTwDnp;
                        if (c33624mzv12 != null) {
                            c33624mzv12.setAlpha(0.3f);
                        }
                    }
                }
            }
        }
    }

    private final void AEQbTJ(boolean z) {
        if (z) {
            android.widget.LinearLayout linearLayout = this.ORxRYg;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            android.widget.LinearLayout linearLayout2 = this.QKVWgx;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
                return;
            }
            return;
        }
        android.widget.LinearLayout linearLayout3 = this.ORxRYg;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout4 = this.QKVWgx;
        if (linearLayout4 != null) {
            linearLayout4.setVisibility(0);
        }
    }

    public static final Unit OLrzqt(InterfaceC55813xqy interfaceC55813xqy, ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjg, ResponseData responseData) {
        java.util.List list;
        android.widget.ImageView imageView;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && (list = (java.util.List) responseData.getData()) != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((ArbitrageFavoriteBean) it.next()).getArbitrageId(), (java.lang.Object) interfaceC55813xqy.getArbId()) && (imageView = viewOnClickListenerC38981pjg.AxsJAY) != null) {
                    imageView.setSelected(true);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
