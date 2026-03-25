package com.okinc.kline.ui.component.business.klinequote.chart;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.AudioStats;
import androidx.collection.ArrayMapKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.biz.TradeType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.HistoryOrderData;
import com.okinc.kline.data.KLineEventBean;
import com.okinc.kline.data.KlineChangeScreenVo;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineQuickOrderPriceBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.data.KlineStartTimeVo;
import com.okinc.kline.data.KlineTimeAnchorType;
import com.okinc.kline.data.KlineTimeToolType;
import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.features.kline.indicator.viewmodel.KlineIndicatorViewModel;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.data.DataSource;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.library.tradingview.TradingViewManager;
import com.okinc.kline.ui.component.business.klinequote.KlineQuoteDataComponent;
import com.okinc.kline.ui.component.business.klinequote.chart.ChartUIComponent;
import com.okinc.kline.ui.component.business.klinequote.viemodel.KlineQuoteViewModel;
import com.okinc.kline.ui.view.model.IndicatorBean;
import com.okinc.kline.ui.view.model.IndicatorDataReq;
import com.okinc.kline.ui.view.model.KlineIndicatorBean;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import com.okinc.kline.ui.viewmodel.KlineTimeAnchorViewModel;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotWebHook;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.TradeHistoryOrderData;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import com.okinc.widget.data.TradeMenuItemBean;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import o.AbstractC36262oVg;
import o.AbstractC36302oWt;
import o.AbstractC39028pka;
import o.AbstractC48864udi;
import o.AbstractC54531xLw;
import o.AbstractC58185ywX;
import o.ActivityC38834pgs;
import o.C32866mlf;
import o.C32868mlh;
import o.C32979mnm;
import o.C33061mpO;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33492mxV;
import o.C33512mxp;
import o.C35964oKf;
import o.C36236oUh;
import o.C36246oUr;
import o.C36250oUv;
import o.C36291oWi;
import o.C36295oWm;
import o.C36311oXb;
import o.C36312oXc;
import o.C36315oXf;
import o.C36327oXr;
import o.C36344oYh;
import o.C36348oYl;
import o.C37895pEr;
import o.C37908pFd;
import o.C37928pFx;
import o.C37957pGz;
import o.C37979pHu;
import o.C38685peB;
import o.C39014pkM;
import o.C39043pkp;
import o.C39104plx;
import o.C39105ply;
import o.C39215poB;
import o.C39285ppS;
import o.C39358pqm;
import o.C39402pre;
import o.C39756pyO;
import o.C39757pyP;
import o.C39782pyo;
import o.C39816pzV;
import o.C43251rlk;
import o.C48872udq;
import o.C52761wXj;
import o.C52794wYp;
import o.C55113xdn;
import o.C55254xgV;
import o.C55296xhK;
import o.C55298xhM;
import o.C55328xhq;
import o.C55489xks;
import o.C55608xnE;
import o.C55688xof;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.C58156yvv;
import o.C8003auW;
import o.InterfaceC36253oUy;
import o.InterfaceC36254oUz;
import o.InterfaceC36340oYd;
import o.InterfaceC36351oYo;
import o.InterfaceC37953pGv;
import o.InterfaceC39046pks;
import o.InterfaceC39499ptW;
import o.InterfaceC39502ptZ;
import o.InterfaceC39510pth;
import o.InterfaceC39563puh;
import o.InterfaceC43033rhe;
import o.InterfaceC49425uoM;
import o.InterfaceC49499uph;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.InterfaceC55726xpQ;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC8104awT;
import o.ViewOnClickListenerC38981pjg;
import o.ViewOnClickListenerC54939xaY;
import o.oLP;
import o.oLS;
import o.oLT;
import o.oML;
import o.oUJ;
import o.oUO;
import o.oWN;
import o.oWO;
import o.pAL;
import o.pCT;
import o.pDX;
import o.pEF;
import o.pEH;
import o.pEI;
import o.pEU;
import o.pEV;
import o.pEW;
import o.pEX;
import o.pFP;
import o.pFQ;
import o.pFS;
import o.pFX;
import o.pGP;
import o.pTA;
import o.pUU;
import o.pXB;
import o.pXL;
import o.xOW;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class ChartUIComponent implements InterfaceC39046pks {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public boolean AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public boolean AhwBna;
    public int AkhnZx;
    public InterfaceC36254oUz AuCTel;
    public C39285ppS DbNXlk;
    public boolean EZpvd;
    public C36250oUv.StateListAnimator KWHzl;
    public final KlineQuoteDataComponent copydefault;
    public final InterfaceC56387yDm djBIcL;
    public TemplateSetting ejfBZ;
    public C36312oXc fARcdN;
    public C36344oYh fIwbmz;
    public WebChromeClient fJNWhG;
    public int fetchVPNInfo;
    public Job gEmmrt;
    public long isConnected;
    public final C39043pkp<oML> iwGUEr;
    public final InterfaceC56387yDm valueOf;
    public String values;

    public static final /* synthetic */ class BroadcastReceiver implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BroadcastReceiver(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineQuoteDataComponent AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC36254oUz AhwBna() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(InterfaceC36254oUz interfaceC36254oUz) {
        this.AuCTel = interfaceC36254oUz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TemplateSetting gEmmrt() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39043pkp<oML> isConnected() {
        return this.iwGUEr;
    }

    public static final class PendingIntent implements View.OnLayoutChangeListener {
        public PendingIntent() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            ChartUIComponent.this.AYXKKw().AubY().copydefault().postValue(Boolean.TRUE);
        }
    }

    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ ChartUIComponent EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(View view, long j, ChartUIComponent chartUIComponent) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = chartUIComponent;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.AEQbTJ;
                this.EZpvd.AYXKKw().AubY().valueOf().setValue(Boolean.TRUE);
                if (appCompatTextView.isSelected()) {
                    return;
                }
                this.EZpvd.copydefault(true);
                ChartUIComponent.changeTime$default(this.EZpvd, new TimeIntervalItem(-2, "index-candle1m", "candle1m", "mark-price-candle1m", "-2"), false, 2, null);
                C32866mlf.onEvent$default("Chart_MarketCap_Chart_Click", (TrackChannel[]) null, SharedElementCallback.AEQbTJ, 1, (Object) null);
            }
        }
    }

    public ChartUIComponent(@NotNull C39043pkp<oML> c39043pkp, @NotNull KlineQuoteDataComponent klineQuoteDataComponent) {
        Intrinsics.checkNotNullParameter(c39043pkp, "");
        Intrinsics.checkNotNullParameter(klineQuoteDataComponent, "");
        this.iwGUEr = c39043pkp;
        this.copydefault = klineQuoteDataComponent;
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.pmY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ChartUIComponent.KWHzl();
            }
        });
        this.values = "";
        this.AEQbTJ = true;
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.pmZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ChartUIComponent.getFieldNames(this.copydefault);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.pna
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ChartUIComponent.iwGUEr(this.EZpvd);
            }
        });
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.ui.component.business.klinequote.chart.ChartUIComponent.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final C36348oYl KWHzl() {
        return new C36348oYl();
    }

    private final C36348oYl zuBGHE() {
        return (C36348oYl) this.valueOf.getValue();
    }

    public final InterfaceC56387yDm<KlineIndicatorViewModel> djBIcL() {
        return (InterfaceC56387yDm) this.djBIcL.getValue();
    }

    public static final InterfaceC56387yDm getFieldNames(ChartUIComponent chartUIComponent) {
        final AbstractC39028pka abstractC39028pkaOLrzqt = chartUIComponent.copydefault.OLrzqt();
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.kline.ui.component.business.klinequote.chart.ChartUIComponent$klineIndicatorViewModel_delegate$lambda$1$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return abstractC39028pkaOLrzqt;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.ui.component.business.klinequote.chart.ChartUIComponent$klineIndicatorViewModel_delegate$lambda$1$$inlined$viewModels$default$2
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
        return FragmentViewModelLazyKt.createViewModelLazy(abstractC39028pkaOLrzqt, C56524yIo.AEQbTJ(KlineIndicatorViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.component.business.klinequote.chart.ChartUIComponent$klineIndicatorViewModel_delegate$lambda$1$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.component.business.klinequote.chart.ChartUIComponent$klineIndicatorViewModel_delegate$lambda$1$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.component.business.klinequote.chart.ChartUIComponent$klineIndicatorViewModel_delegate$lambda$1$$inlined$viewModels$default$5
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
                    defaultViewModelProviderFactory = abstractC39028pkaOLrzqt.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC56387yDm<KlineTimeAnchorViewModel> sSMYrx() {
        return (InterfaceC56387yDm) this.AYXKKw.getValue();
    }

    public static final InterfaceC56387yDm iwGUEr(ChartUIComponent chartUIComponent) {
        final AbstractC39028pka abstractC39028pkaOLrzqt = chartUIComponent.copydefault.OLrzqt();
        final Function0 function0 = null;
        return FragmentViewModelLazyKt.createViewModelLazy(abstractC39028pkaOLrzqt, C56524yIo.AEQbTJ(KlineTimeAnchorViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.component.business.klinequote.chart.ChartUIComponent$klineTimeAnchorViewModel_delegate$lambda$2$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = abstractC39028pkaOLrzqt.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.component.business.klinequote.chart.ChartUIComponent$klineTimeAnchorViewModel_delegate$lambda$2$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = abstractC39028pkaOLrzqt.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.component.business.klinequote.chart.ChartUIComponent$klineTimeAnchorViewModel_delegate$lambda$2$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = abstractC39028pkaOLrzqt.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        final C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        AppCompatTextView appCompatTextView;
        C36250oUv c36250oUv3;
        C36250oUv c36250oUv4;
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onCreate(lifecycleOwner);
        EZpvd(lifecycleOwner);
        QfsBiF();
        zLjUOn();
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv4 = oml.AuCTel) != null) {
            copydefault(c36250oUv4);
            c36250oUv4.setActionListener(this.copydefault.copydefault());
            oML oml2 = (oML) this.iwGUEr.KWHzl();
            if (oml2 != null && (frameLayout = oml2.uzCIH) != null) {
                AEQbTJ(frameLayout);
            }
        }
        this.KWHzl = new PictureInPictureParams();
        oML oml3 = (oML) this.iwGUEr.KWHzl();
        if (oml3 != null && (c36250oUv3 = oml3.AuCTel) != null) {
            c36250oUv3.setChartStateListener(this.KWHzl);
        }
        oML oml4 = (oML) this.iwGUEr.KWHzl();
        if (oml4 != null && (appCompatTextView = oml4.zsXlph) != null) {
            appCompatTextView.setOnClickListener(new VoiceInteractor(appCompatTextView, 500L, this));
        }
        oML oml5 = (oML) this.iwGUEr.KWHzl();
        if (oml5 != null && (c36250oUv2 = oml5.AuCTel) != null) {
            c36250oUv2.setDrawUpdateListener(new C36250oUv.Application() { // from class: o.plD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C36250oUv.Application
                public final void copydefault(AbstractC36302oWt abstractC36302oWt) {
                    ChartUIComponent.KWHzl(this.OLrzqt, abstractC36302oWt);
                }
            });
        }
        oML oml6 = (oML) this.iwGUEr.KWHzl();
        if (oml6 == null || (c36250oUv = oml6.AuCTel) == null) {
            return;
        }
        c36250oUv.setLoadHistoryKlineListener(new C36250oUv.PendingIntent() { // from class: o.plC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C36250oUv.PendingIntent
            public final void AEQbTJ() {
                ChartUIComponent.copydefault(c36250oUv, this);
            }
        });
        c36250oUv.setLoadRightHistoryKlineListener(new C36250oUv.LoaderManager() { // from class: o.plF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C36250oUv.LoaderManager
            public final void AEQbTJ() {
                ChartUIComponent.EZpvd(c36250oUv, this);
            }
        });
        c36250oUv.setReloadKlineListener(new C36250oUv.Fragment() { // from class: o.plE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C36250oUv.Fragment
            public final void KWHzl() {
                ChartUIComponent.uzCIH(this.EZpvd);
            }
        });
        c36250oUv.setKlineQuickOrderListener(new AssistContent());
        c36250oUv.setKlineEventClickListener(new C36250oUv.FragmentManager() { // from class: o.plB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C36250oUv.FragmentManager
            public final void onEventClick(oLS ols) {
                ChartUIComponent.copydefault(this.copydefault, ols);
            }
        });
        c36250oUv.setChartSelectionListener(new TaskStackBuilder());
        c36250oUv.setChartHistoryOrder(true);
        c36250oUv.setKlineTradeDragListener(new ClipData());
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx();
        if (chartViewOutSideConfigAkhnZx == null || !chartViewOutSideConfigAkhnZx.isShowCountdown()) {
            return;
        }
        C37908pFd.copydefault();
    }

    public static final class PictureInPictureParams implements C36250oUv.StateListAnimator {
        public PictureInPictureParams() {
        }

        @Override // o.C36250oUv.StateListAnimator
        public void EZpvd() {
            String strAuCTel = ChartUIComponent.this.AYXKKw().AuCTel();
            String str = "";
            if (strAuCTel != null) {
                String lowerCase = strAuCTel.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (lowerCase != null) {
                    str = lowerCase;
                }
            }
            C37908pFd.djBIcL(str);
        }

        @Override // o.C36250oUv.StateListAnimator
        public void KWHzl() {
            String strAuCTel = ChartUIComponent.this.AYXKKw().AuCTel();
            String str = "";
            if (strAuCTel != null) {
                String lowerCase = strAuCTel.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (lowerCase != null) {
                    str = lowerCase;
                }
            }
            C37908pFd.copydefault(str);
        }

        @Override // o.C36250oUv.StateListAnimator
        public void OLrzqt(PriceWarningItemBean priceWarningItemBean, String str) {
            Intrinsics.checkNotNullParameter(priceWarningItemBean, "");
            Intrinsics.checkNotNullParameter(str, "");
            int iHashCode = str.hashCode();
            if (iHashCode == -1361636432) {
                if (str.equals("change")) {
                    C32866mlf.onEvent$default("KLine_Chart_PriceAlertLine_Drag", (TrackChannel[]) null, new Function1() { // from class: o.pnn
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ChartUIComponent.PictureInPictureParams.AEQbTJ((EventParamsList) obj);
                        }
                    }, 1, (Object) null);
                    ChartUIComponent.this.AYXKKw().OLrzqt(priceWarningItemBean, "change");
                    return;
                }
                return;
            }
            if (iHashCode != -1335458389) {
                if (iHashCode == 97618667 && str.equals("force")) {
                    C32866mlf.onEvent$default("KLine_Chart_PriceAlertLine_Click", (TrackChannel[]) null, new Function1() { // from class: o.pnq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ChartUIComponent.PictureInPictureParams.valueOf((EventParamsList) obj);
                        }
                    }, 1, (Object) null);
                    return;
                }
                return;
            }
            if (str.equals(RequestParameters.SUBRESOURCE_DELETE)) {
                C32866mlf.onEvent$default("KLine_Chart_DeletePriceAlert_Click", (TrackChannel[]) null, new Function1() { // from class: o.pnr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ChartUIComponent.PictureInPictureParams.KWHzl((EventParamsList) obj);
                    }
                }, 1, (Object) null);
                ChartUIComponent.this.OLrzqt(priceWarningItemBean);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit valueOf(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            return Unit.INSTANCE;
        }
    }

    public static final class SharedElementCallback implements Function1<EventParamsList, Unit> {
        public static final SharedElementCallback AEQbTJ = new SharedElementCallback();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }
    }

    public static final void KWHzl(ChartUIComponent chartUIComponent, AbstractC36302oWt abstractC36302oWt) {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        if (abstractC36302oWt instanceof C36291oWi) {
            oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
            if (oml == null || (c36250oUv = oml.AuCTel) == null || (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) == null) {
                return;
            }
            chartUIComponent.copydefault.values().OLrzqt(chartViewOutSideConfigAkhnZx.getKlineEventList());
            return;
        }
        if (abstractC36302oWt instanceof C36295oWm) {
            chartUIComponent.djBIcL().getValue().KWHzl();
        }
    }

    public static final void copydefault(C36250oUv c36250oUv, ChartUIComponent chartUIComponent) {
        C36250oUv c36250oUv2;
        TemplateSetting templateSettingWlaJM = c36250oUv.wlaJM();
        if (templateSettingWlaJM != null) {
            int sPTimeInterval = templateSettingWlaJM.getSPTimeInterval();
            oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
            C33129mqd.gEmmrt((oml == null || (c36250oUv2 = oml.AuCTel) == null) ? null : Long.valueOf(c36250oUv2.fARcdN()));
            InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = chartUIComponent.copydefault.uzCIH();
            if (stateListAnimatorUzCIH != null) {
                InterfaceC39563puh.StateListAnimator.TaskDescription.getHistoryMarketCandles$default(stateListAnimatorUzCIH, chartUIComponent.copydefault.OLrzqt(), pEF.OLrzqt.OLrzqt(sPTimeInterval), C33129mqd.gEmmrt(Long.valueOf(c36250oUv.fARcdN())), oLT.djBIcL(), false, null, 48, null);
            }
        }
    }

    public static final void EZpvd(C36250oUv c36250oUv, ChartUIComponent chartUIComponent) {
        if (c36250oUv.getFieldNames() > 0) {
            int iODWQjV = C36246oUr.copydefault().ODWQjV();
            InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = chartUIComponent.copydefault.uzCIH();
            if (stateListAnimatorUzCIH != null) {
                InterfaceC39563puh.StateListAnimator.TaskDescription.getRightHistoryMarketCandles$default(stateListAnimatorUzCIH, chartUIComponent.copydefault.OLrzqt(), pEF.OLrzqt.OLrzqt(iODWQjV), C33129mqd.gEmmrt(Long.valueOf(c36250oUv.getFieldNames())), oLT.djBIcL(), null, 16, null);
            }
        }
    }

    public static final void uzCIH(ChartUIComponent chartUIComponent) {
        chartUIComponent.OcIXYQ();
    }

    public static final class AssistContent implements C36250oUv.Dialog {
        public AssistContent() {
        }

        @Override // o.C36250oUv.Dialog
        public void EZpvd() {
            C36250oUv c36250oUv;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            if (!pFP.isLogin$default(pFP.OLrzqt, null, 1, null)) {
                Context context = ChartUIComponent.this.AYXKKw().OLrzqt().getContext();
                if (context != null) {
                    InterfaceC8104awT.StateListAnimator.routeLogin$default((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class), context, null, 2, null);
                    return;
                }
                return;
            }
            if (Intrinsics.EZpvd((Object) ChartUIComponent.this.AYXKKw().getNewProxyInstance(), (Object) "TYPE_MARK_PRICE_KLINE") || Intrinsics.EZpvd((Object) ChartUIComponent.this.AYXKKw().getNewProxyInstance(), (Object) "TYPE_INDEX_KLINE")) {
                C55328xhq.show$default(C55328xhq.OLrzqt, Integer.valueOf(C35964oKf.Fragment.ardYFU), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
                return;
            }
            oML oml = (oML) ChartUIComponent.this.isConnected().KWHzl();
            if (oml != null && (c36250oUv = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null && chartViewOutSideConfigAkhnZx.isOpenCoolTime() && (Intrinsics.EZpvd((Object) "SWAP", (Object) ChartUIComponent.this.AYXKKw().AuCTel()) || Intrinsics.EZpvd((Object) "FUTURES", (Object) ChartUIComponent.this.AYXKKw().AuCTel()))) {
                Context context2 = ChartUIComponent.this.AYXKKw().OLrzqt().getContext();
                if (context2 != null) {
                    C55328xhq.show$default(C55328xhq.OLrzqt, C33069mpW.KWHzl(context2, C55688xof.Application.getThemeUpIndicator, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, pTA.format$default(new Date(ChartUIComponent.this.isConnected), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null)))), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
                    return;
                }
                return;
            }
            InterfaceC39502ptZ interfaceC39502ptZCopydefault = ChartUIComponent.this.AYXKKw().copydefault();
            if (interfaceC39502ptZCopydefault != null) {
                interfaceC39502ptZCopydefault.bm_();
            }
        }

        @Override // o.C36250oUv.Dialog
        public void EZpvd(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC39502ptZ interfaceC39502ptZCopydefault = ChartUIComponent.this.AYXKKw().copydefault();
            if (interfaceC39502ptZCopydefault != null) {
                interfaceC39502ptZCopydefault.l_(str);
            }
        }

        @Override // o.C36250oUv.Dialog
        public void AEQbTJ() {
            String strAuCTel = ChartUIComponent.this.AYXKKw().AuCTel();
            if (strAuCTel == null) {
                strAuCTel = "";
            }
            C37908pFd.valueOf(strAuCTel);
        }
    }

    public static final void copydefault(ChartUIComponent chartUIComponent, oLS ols) {
        chartUIComponent.AEQbTJ(ols.OLrzqt());
    }

    public static final class TaskStackBuilder implements C36250oUv.ActionBar {
        public TaskStackBuilder() {
        }

        @Override // o.C36250oUv.ActionBar
        public void EZpvd(String str) {
            InterfaceC39502ptZ interfaceC39502ptZCopydefault = ChartUIComponent.this.AYXKKw().copydefault();
            if (interfaceC39502ptZCopydefault != null) {
                interfaceC39502ptZCopydefault.k_(str);
            }
        }

        @Override // o.C36250oUv.ActionBar
        public void aI_() {
            C55489xks.startVibratorIfCan$default(0L, 1, null);
        }
    }

    public static final class ClipData implements InterfaceC36253oUy {
        public ClipData() {
        }

        @Override // o.InterfaceC36253oUy
        public void EZpvd(final KlineOpenOrderBean klineOpenOrderBean) {
            C36250oUv c36250oUv;
            List<KlineOpenOrderBean> listHDKMBd;
            KlineOpenOrderBean klineOpenOrderBean2;
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            Context context = ChartUIComponent.this.AYXKKw().OLrzqt().getContext();
            if (context != null) {
                final ChartUIComponent chartUIComponent = ChartUIComponent.this;
                try {
                    AbstractC54531xLw abstractC54531xLwAhwBna = chartUIComponent.AYXKKw().AhwBna();
                    if (abstractC54531xLwAhwBna != null) {
                        C37928pFx c37928pFxRJOkX = chartUIComponent.AYXKKw().RJOkX();
                        String strFIwbmz = chartUIComponent.AYXKKw().fIwbmz();
                        if (strFIwbmz == null) {
                            strFIwbmz = "";
                        }
                        klineOpenOrderBean.setUPrice(c37928pFxRJOkX.KWHzl(abstractC54531xLwAhwBna, strFIwbmz, klineOpenOrderBean.getPrice()));
                        oML oml = (oML) chartUIComponent.isConnected().KWHzl();
                        if (oml != null && (c36250oUv = oml.AuCTel) != null && (listHDKMBd = c36250oUv.hDKMBd()) != null && (klineOpenOrderBean2 = (KlineOpenOrderBean) CollectionsKt___CollectionsKt.AkhnZx(listHDKMBd, klineOpenOrderBean.getOriginPos())) != null) {
                            klineOpenOrderBean2.setChangePrice(false);
                        }
                        TradeAllOrderApi tradeAllOrderApi = (TradeAllOrderApi) CollectionsKt___CollectionsKt.AkhnZx(chartUIComponent.AYXKKw().AwvSrB(), klineOpenOrderBean.getOriginPos());
                        if (tradeAllOrderApi != null) {
                            C37928pFx c37928pFxRJOkX2 = chartUIComponent.AYXKKw().RJOkX();
                            androidx.fragment.app.FragmentManager childFragmentManager = chartUIComponent.AYXKKw().OLrzqt().getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                            c37928pFxRJOkX2.EZpvd(context, childFragmentManager, klineOpenOrderBean, tradeAllOrderApi, false, false, new Function1() { // from class: o.pnA
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return ChartUIComponent.ClipData.AYXKKw(chartUIComponent, klineOpenOrderBean, ((java.lang.Integer) obj).intValue());
                                }
                            });
                            chartUIComponent.AYXKKw().AkhnZx().fetchVPNInfo(1);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                } catch (Exception e) {
                    chartUIComponent.AYXKKw().AhwBna(false);
                    chartUIComponent.AYXKKw().djSkpj();
                    pUU.copydefault("onOrderLineDragFinish 订单线拖拽,修改订单的弹窗", String.valueOf(e.getMessage()));
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            ChartUIComponent.this.copydefault("order_line", "order_price_change");
        }

        public static final Unit AYXKKw(ChartUIComponent chartUIComponent, KlineOpenOrderBean klineOpenOrderBean, int i) {
            C36250oUv c36250oUv;
            oML oml;
            C36250oUv c36250oUv2;
            List<? extends InterfaceC39510pth> listAubY;
            oML oml2;
            C36250oUv c36250oUv3;
            if (i != 2) {
                C39043pkp<oML> c39043pkpIsConnected = chartUIComponent.isConnected();
                if (c39043pkpIsConnected != null && (oml = (oML) c39043pkpIsConnected.KWHzl()) != null && (c36250oUv2 = oml.AuCTel) != null && (listAubY = c36250oUv2.AubY()) != null) {
                    C37928pFx c37928pFxRJOkX = chartUIComponent.AYXKKw().RJOkX();
                    List<TradePositionManager.PositionItem> listQfsBiF = chartUIComponent.AYXKKw().QfsBiF();
                    C39043pkp<oML> c39043pkpIsConnected2 = chartUIComponent.isConnected();
                    c37928pFxRJOkX.OLrzqt(listAubY, listQfsBiF, (c39043pkpIsConnected2 == null || (oml2 = (oML) c39043pkpIsConnected2.KWHzl()) == null || (c36250oUv3 = oml2.AuCTel) == null) ? null : c36250oUv3.hDKMBd());
                }
                if (!klineOpenOrderBean.isMainOrder()) {
                    chartUIComponent.AYXKKw().RJOkX().OLrzqt(klineOpenOrderBean, (InterfaceC55726xpQ) chartUIComponent.AYXKKw().AwvSrB().get(klineOpenOrderBean.getOriginPos()), klineOpenOrderBean.getMainPrice(), false);
                }
                oML oml3 = (oML) chartUIComponent.isConnected().KWHzl();
                if (oml3 != null && (c36250oUv = oml3.AuCTel) != null) {
                    c36250oUv.invalidate();
                }
            }
            chartUIComponent.AYXKKw().AhwBna(false);
            chartUIComponent.AYXKKw().djSkpj();
            if (i == 2) {
                chartUIComponent.AEQbTJ("yes", "modify_order");
                chartUIComponent.AYXKKw().AkhnZx().isConnected(1);
            } else if (i == 3) {
                chartUIComponent.AEQbTJ("no", "modify_order");
            }
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC36253oUy
        public void AhwBna(final KlineOpenOrderBean klineOpenOrderBean) {
            C36250oUv c36250oUv;
            List<KlineOpenOrderBean> listHDKMBd;
            KlineOpenOrderBean klineOpenOrderBean2;
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            Context context = ChartUIComponent.this.AYXKKw().OLrzqt().getContext();
            if (context != null) {
                final ChartUIComponent chartUIComponent = ChartUIComponent.this;
                try {
                    chartUIComponent.AYXKKw().sSMYrx().setNeedRelevanceCost(false);
                    AbstractC54531xLw abstractC54531xLwAhwBna = chartUIComponent.AYXKKw().AhwBna();
                    if (abstractC54531xLwAhwBna != null) {
                        C37928pFx c37928pFxRJOkX = chartUIComponent.AYXKKw().RJOkX();
                        String strFIwbmz = chartUIComponent.AYXKKw().fIwbmz();
                        if (strFIwbmz == null) {
                            strFIwbmz = "";
                        }
                        klineOpenOrderBean.setUPrice(c37928pFxRJOkX.KWHzl(abstractC54531xLwAhwBna, strFIwbmz, klineOpenOrderBean.getPrice()));
                        oML oml = (oML) chartUIComponent.isConnected().KWHzl();
                        if (oml != null && (c36250oUv = oml.AuCTel) != null && (listHDKMBd = c36250oUv.hDKMBd()) != null && (klineOpenOrderBean2 = (KlineOpenOrderBean) CollectionsKt___CollectionsKt.AkhnZx(listHDKMBd, klineOpenOrderBean.getOriginPos())) != null) {
                            klineOpenOrderBean2.setDragging(false);
                        }
                        TradeAllOrderApi tradeAllOrderApi = (TradeAllOrderApi) CollectionsKt___CollectionsKt.AkhnZx(chartUIComponent.AYXKKw().AwvSrB(), klineOpenOrderBean.getOriginPos());
                        if (tradeAllOrderApi != null) {
                            C37928pFx c37928pFxRJOkX2 = chartUIComponent.AYXKKw().RJOkX();
                            androidx.fragment.app.FragmentManager childFragmentManager = chartUIComponent.AYXKKw().OLrzqt().getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                            c37928pFxRJOkX2.EZpvd(context, childFragmentManager, klineOpenOrderBean, tradeAllOrderApi, true, false, new Function1() { // from class: o.pnC
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return ChartUIComponent.ClipData.AhwBna(chartUIComponent, klineOpenOrderBean, ((java.lang.Integer) obj).intValue());
                                }
                            });
                            chartUIComponent.AYXKKw().AkhnZx().AkhnZx(1);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                } catch (Exception e) {
                    chartUIComponent.AYXKKw().AhwBna(false);
                    chartUIComponent.AYXKKw().djSkpj();
                    pUU.copydefault("onOrderLineDragFinish 订单线拖拽,修改订单的弹窗", String.valueOf(e.getMessage()));
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            ChartUIComponent.this.copydefault("order_line", "order_tp");
        }

        public static final Unit AhwBna(ChartUIComponent chartUIComponent, KlineOpenOrderBean klineOpenOrderBean, int i) {
            C36250oUv c36250oUv;
            C36250oUv c36250oUv2;
            List<KlineOpenOrderBean> listHDKMBd;
            KlineOpenOrderBean klineOpenOrderBean2;
            try {
                if (i == 2) {
                    chartUIComponent.AYXKKw().sSMYrx().setNeedRelevanceCost(true);
                    chartUIComponent.AYXKKw().sSMYrx().setCost(false);
                    chartUIComponent.AYXKKw().sSMYrx().setOrdId(klineOpenOrderBean.getOrdId());
                    chartUIComponent.AYXKKw().sSMYrx().setTP(true);
                } else {
                    oML oml = (oML) chartUIComponent.isConnected().KWHzl();
                    if (oml != null && (c36250oUv2 = oml.AuCTel) != null && (listHDKMBd = c36250oUv2.hDKMBd()) != null && (klineOpenOrderBean2 = (KlineOpenOrderBean) CollectionsKt___CollectionsKt.AkhnZx(listHDKMBd, klineOpenOrderBean.getOriginPos())) != null) {
                        klineOpenOrderBean2.setShowSolid(true);
                    }
                    oML oml2 = (oML) chartUIComponent.isConnected().KWHzl();
                    if (oml2 != null && (c36250oUv = oml2.AuCTel) != null) {
                        c36250oUv.invalidate();
                    }
                }
            } catch (Exception e) {
                pUU.copydefault("onOrderLineDragFinish", String.valueOf(e.getMessage()));
            }
            chartUIComponent.AYXKKw().AhwBna(false);
            chartUIComponent.AYXKKw().djSkpj();
            if (i == 2) {
                chartUIComponent.AEQbTJ("yes", "order_tpsl");
                chartUIComponent.AYXKKw().AkhnZx().AuCTel(1);
            } else if (i == 3) {
                chartUIComponent.AEQbTJ("no", "order_tpsl");
            }
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC36253oUy
        public void OLrzqt(final KlineOpenOrderBean klineOpenOrderBean) {
            C36250oUv c36250oUv;
            List<KlineOpenOrderBean> listHDKMBd;
            KlineOpenOrderBean klineOpenOrderBean2;
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            Context context = ChartUIComponent.this.AYXKKw().OLrzqt().getContext();
            if (context != null) {
                final ChartUIComponent chartUIComponent = ChartUIComponent.this;
                try {
                    chartUIComponent.AYXKKw().sSMYrx().setNeedRelevanceCost(false);
                    AbstractC54531xLw abstractC54531xLwAhwBna = chartUIComponent.AYXKKw().AhwBna();
                    if (abstractC54531xLwAhwBna != null) {
                        C37928pFx c37928pFxRJOkX = chartUIComponent.AYXKKw().RJOkX();
                        String strFIwbmz = chartUIComponent.AYXKKw().fIwbmz();
                        if (strFIwbmz == null) {
                            strFIwbmz = "";
                        }
                        klineOpenOrderBean.setUPrice(c37928pFxRJOkX.KWHzl(abstractC54531xLwAhwBna, strFIwbmz, klineOpenOrderBean.getPrice()));
                        oML oml = (oML) chartUIComponent.isConnected().KWHzl();
                        if (oml != null && (c36250oUv = oml.AuCTel) != null && (listHDKMBd = c36250oUv.hDKMBd()) != null && (klineOpenOrderBean2 = (KlineOpenOrderBean) CollectionsKt___CollectionsKt.AkhnZx(listHDKMBd, klineOpenOrderBean.getOriginPos())) != null) {
                            klineOpenOrderBean2.setDragging(false);
                        }
                        TradeAllOrderApi tradeAllOrderApi = (TradeAllOrderApi) CollectionsKt___CollectionsKt.AkhnZx(chartUIComponent.AYXKKw().AwvSrB(), klineOpenOrderBean.getOriginPos());
                        if (tradeAllOrderApi != null) {
                            C37928pFx c37928pFxRJOkX2 = chartUIComponent.AYXKKw().RJOkX();
                            androidx.fragment.app.FragmentManager childFragmentManager = chartUIComponent.AYXKKw().OLrzqt().getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                            c37928pFxRJOkX2.EZpvd(context, childFragmentManager, klineOpenOrderBean, tradeAllOrderApi, false, true, new Function1() { // from class: o.pnz
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return ChartUIComponent.ClipData.valueOf(chartUIComponent, klineOpenOrderBean, ((java.lang.Integer) obj).intValue());
                                }
                            });
                            chartUIComponent.AYXKKw().AkhnZx().DbNXlk(1);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                } catch (Exception e) {
                    chartUIComponent.AYXKKw().AhwBna(false);
                    chartUIComponent.AYXKKw().djSkpj();
                    pUU.copydefault("onOrderLineDragFinish 订单线拖拽,修改订单的弹窗", String.valueOf(e.getMessage()));
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            ChartUIComponent.this.copydefault("order_line", "order_sl");
        }

        public static final Unit valueOf(ChartUIComponent chartUIComponent, KlineOpenOrderBean klineOpenOrderBean, int i) {
            C36250oUv c36250oUv;
            C36250oUv c36250oUv2;
            List<KlineOpenOrderBean> listHDKMBd;
            KlineOpenOrderBean klineOpenOrderBean2;
            try {
                if (i == 2) {
                    chartUIComponent.AYXKKw().sSMYrx().setNeedRelevanceCost(true);
                    chartUIComponent.AYXKKw().sSMYrx().setCost(false);
                    chartUIComponent.AYXKKw().sSMYrx().setOrdId(klineOpenOrderBean.getOrdId());
                    chartUIComponent.AYXKKw().sSMYrx().setTP(false);
                } else {
                    oML oml = (oML) chartUIComponent.isConnected().KWHzl();
                    if (oml != null && (c36250oUv2 = oml.AuCTel) != null && (listHDKMBd = c36250oUv2.hDKMBd()) != null && (klineOpenOrderBean2 = (KlineOpenOrderBean) CollectionsKt___CollectionsKt.AkhnZx(listHDKMBd, klineOpenOrderBean.getOriginPos())) != null) {
                        klineOpenOrderBean2.setShowSolid(true);
                    }
                    oML oml2 = (oML) chartUIComponent.isConnected().KWHzl();
                    if (oml2 != null && (c36250oUv = oml2.AuCTel) != null) {
                        c36250oUv.invalidate();
                    }
                }
            } catch (Exception e) {
                pUU.copydefault("onOrderLineSLDragFinish", String.valueOf(e.getMessage()));
            }
            chartUIComponent.AYXKKw().AhwBna(false);
            chartUIComponent.AYXKKw().djSkpj();
            if (i == 2) {
                chartUIComponent.AEQbTJ("yes", "order_tpsl");
                chartUIComponent.AYXKKw().AkhnZx().values(1);
            } else if (i == 3) {
                chartUIComponent.AEQbTJ("no", "order_tpsl");
            }
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC36253oUy
        public void AEQbTJ(KlineOpenOrderBean klineOpenOrderBean) {
            C36250oUv c36250oUv;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            if (ChartUIComponent.this.AYXKKw().OLrzqt().getContext() != null) {
                final ChartUIComponent chartUIComponent = ChartUIComponent.this;
                try {
                    TradeAllOrderApi tradeAllOrderApi = (TradeAllOrderApi) CollectionsKt___CollectionsKt.AkhnZx(chartUIComponent.AYXKKw().AwvSrB(), klineOpenOrderBean.getOriginPos());
                    if (tradeAllOrderApi != null) {
                        oML oml = (oML) chartUIComponent.isConnected().KWHzl();
                        if (oml != null && (c36250oUv = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null && chartViewOutSideConfigAkhnZx.getMOrderCancelConfirm()) {
                            FragmentActivity activity = chartUIComponent.AYXKKw().OLrzqt().getActivity();
                            if (activity != null) {
                                chartUIComponent.AYXKKw().RJOkX().OLrzqt(activity, klineOpenOrderBean, tradeAllOrderApi, chartUIComponent.AYXKKw().OLrzqt(), activity, new Function1() { // from class: o.pnw
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return ChartUIComponent.ClipData.EZpvd(chartUIComponent, ((java.lang.Boolean) obj).booleanValue());
                                    }
                                });
                            }
                        } else {
                            FragmentActivity activity2 = chartUIComponent.AYXKKw().OLrzqt().getActivity();
                            if (activity2 != null) {
                                chartUIComponent.AYXKKw().RJOkX().EZpvd(klineOpenOrderBean, tradeAllOrderApi, chartUIComponent.AYXKKw().OLrzqt(), activity2, new Function1() { // from class: o.pnv
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return ChartUIComponent.ClipData.KWHzl(chartUIComponent, ((java.lang.Boolean) obj).booleanValue());
                                    }
                                });
                            }
                        }
                        chartUIComponent.AYXKKw().AkhnZx().KWHzl(1);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e) {
                    pUU.copydefault("onOrderLineCancelClick 取消订单", String.valueOf(e.getMessage()));
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            ChartUIComponent.this.copydefault("order_line", "order_cancel");
        }

        public static final Unit EZpvd(ChartUIComponent chartUIComponent, boolean z) {
            chartUIComponent.AEQbTJ(z ? "yes" : "no", "cancel_order");
            if (z) {
                chartUIComponent.AYXKKw().AkhnZx().OLrzqt(1);
            }
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(ChartUIComponent chartUIComponent, boolean z) {
            chartUIComponent.AEQbTJ(z ? "yes" : "no", "cancel_order");
            if (z) {
                chartUIComponent.AYXKKw().AkhnZx().OLrzqt(1);
            }
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC36253oUy
        public void copydefault(final KlineOpenOrderBean klineOpenOrderBean) {
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            try {
                ChartUIComponent.this.AYXKKw().sSMYrx().setNeedRelevanceCost(false);
                TradePositionManager.PositionItem positionItem = (TradePositionManager.PositionItem) CollectionsKt___CollectionsKt.AkhnZx(ChartUIComponent.this.AYXKKw().QfsBiF(), klineOpenOrderBean.getOriginPos());
                if (positionItem != null) {
                    final ChartUIComponent chartUIComponent = ChartUIComponent.this;
                    C37928pFx c37928pFxRJOkX = chartUIComponent.AYXKKw().RJOkX();
                    androidx.fragment.app.FragmentManager childFragmentManager = chartUIComponent.AYXKKw().OLrzqt().getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    c37928pFxRJOkX.OLrzqt(childFragmentManager, Intrinsics.EZpvd((Object) klineOpenOrderBean.getOrdType(), (Object) "TP_Limit"), klineOpenOrderBean, positionItem, new Function1() { // from class: o.pnB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ChartUIComponent.ClipData.gEmmrt(chartUIComponent, klineOpenOrderBean, ((java.lang.Integer) obj).intValue());
                        }
                    });
                    chartUIComponent.AYXKKw().AkhnZx().djBIcL(1);
                }
            } catch (Exception e) {
                ChartUIComponent.this.AYXKKw().AhwBna(false);
                ChartUIComponent.this.AYXKKw().djSkpj();
                pUU.copydefault("onCostLineTPDragFinish 仓位线 TP拖拽", String.valueOf(e.getMessage()));
            }
            ChartUIComponent.this.copydefault("position_line", "position_tl");
        }

        public static final Unit gEmmrt(ChartUIComponent chartUIComponent, KlineOpenOrderBean klineOpenOrderBean, int i) {
            C36250oUv c36250oUv;
            C36250oUv c36250oUv2;
            List<? extends InterfaceC39510pth> listAubY;
            InterfaceC39510pth interfaceC39510pth;
            C36250oUv c36250oUv3;
            List<? extends InterfaceC39510pth> listAubY2;
            InterfaceC39510pth interfaceC39510pth2;
            try {
                oML oml = (oML) chartUIComponent.isConnected().KWHzl();
                if (oml != null && (c36250oUv3 = oml.AuCTel) != null && (listAubY2 = c36250oUv3.AubY()) != null && (interfaceC39510pth2 = (InterfaceC39510pth) CollectionsKt___CollectionsKt.AkhnZx(listAubY2, klineOpenOrderBean.getOriginPos())) != null) {
                    interfaceC39510pth2.setDragTP(false);
                }
                if (i == 2) {
                    chartUIComponent.AYXKKw().sSMYrx().setNeedRelevanceCost(true);
                    chartUIComponent.AYXKKw().sSMYrx().setCost(true);
                    chartUIComponent.AYXKKw().sSMYrx().setOrdId(klineOpenOrderBean.getOrdId());
                } else {
                    oML oml2 = (oML) chartUIComponent.isConnected().KWHzl();
                    if (oml2 != null && (c36250oUv2 = oml2.AuCTel) != null && (listAubY = c36250oUv2.AubY()) != null && (interfaceC39510pth = (InterfaceC39510pth) CollectionsKt___CollectionsKt.AkhnZx(listAubY, klineOpenOrderBean.getOriginPos())) != null) {
                        interfaceC39510pth.setShowSolid(true);
                    }
                    oML oml3 = (oML) chartUIComponent.isConnected().KWHzl();
                    if (oml3 != null && (c36250oUv = oml3.AuCTel) != null) {
                        c36250oUv.invalidate();
                    }
                }
            } catch (Exception e) {
                pUU.copydefault("onCostLineTPDragFinish", String.valueOf(e.getMessage()));
            }
            chartUIComponent.AYXKKw().AhwBna(false);
            chartUIComponent.AYXKKw().djSkpj();
            if (i == 2) {
                chartUIComponent.AEQbTJ("yes", "position_tpsl");
                chartUIComponent.AYXKKw().AkhnZx().AYXKKw(1);
            } else if (i == 3) {
                chartUIComponent.AEQbTJ("no", "position_tpsl");
            }
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC36253oUy
        public void KWHzl(final KlineOpenOrderBean klineOpenOrderBean) {
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            try {
                ChartUIComponent.this.AYXKKw().sSMYrx().setNeedRelevanceCost(false);
                TradePositionManager.PositionItem positionItem = (TradePositionManager.PositionItem) CollectionsKt___CollectionsKt.AkhnZx(ChartUIComponent.this.AYXKKw().QfsBiF(), klineOpenOrderBean.getOriginPos());
                if (positionItem != null) {
                    final ChartUIComponent chartUIComponent = ChartUIComponent.this;
                    C37928pFx c37928pFxRJOkX = chartUIComponent.AYXKKw().RJOkX();
                    androidx.fragment.app.FragmentManager childFragmentManager = chartUIComponent.AYXKKw().OLrzqt().getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    c37928pFxRJOkX.OLrzqt(childFragmentManager, Intrinsics.EZpvd((Object) klineOpenOrderBean.getOrdType(), (Object) "TP_Limit"), klineOpenOrderBean, positionItem, new Function1() { // from class: o.pns
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ChartUIComponent.ClipData.djBIcL(chartUIComponent, klineOpenOrderBean, ((java.lang.Integer) obj).intValue());
                        }
                    });
                    chartUIComponent.AYXKKw().AkhnZx().valueOf(1);
                }
            } catch (Exception e) {
                ChartUIComponent.this.AYXKKw().AhwBna(false);
                ChartUIComponent.this.AYXKKw().djSkpj();
                pUU.copydefault("onCostLineSLDragFinish 仓位线 SL拖拽", String.valueOf(e.getMessage()));
            }
            ChartUIComponent.this.copydefault("position_line", "position_sl");
        }

        public static final Unit djBIcL(ChartUIComponent chartUIComponent, KlineOpenOrderBean klineOpenOrderBean, int i) {
            C36250oUv c36250oUv;
            C36250oUv c36250oUv2;
            List<? extends InterfaceC39510pth> listAubY;
            InterfaceC39510pth interfaceC39510pth;
            C36250oUv c36250oUv3;
            List<? extends InterfaceC39510pth> listAubY2;
            InterfaceC39510pth interfaceC39510pth2;
            try {
                oML oml = (oML) chartUIComponent.isConnected().KWHzl();
                if (oml != null && (c36250oUv3 = oml.AuCTel) != null && (listAubY2 = c36250oUv3.AubY()) != null && (interfaceC39510pth2 = (InterfaceC39510pth) CollectionsKt___CollectionsKt.AkhnZx(listAubY2, klineOpenOrderBean.getOriginPos())) != null) {
                    interfaceC39510pth2.setDragSL(false);
                }
                if (i == 2) {
                    chartUIComponent.AYXKKw().sSMYrx().setNeedRelevanceCost(true);
                    chartUIComponent.AYXKKw().sSMYrx().setCost(true);
                    chartUIComponent.AYXKKw().sSMYrx().setOrdId(klineOpenOrderBean.getOrdId());
                } else {
                    oML oml2 = (oML) chartUIComponent.isConnected().KWHzl();
                    if (oml2 != null && (c36250oUv2 = oml2.AuCTel) != null && (listAubY = c36250oUv2.AubY()) != null && (interfaceC39510pth = (InterfaceC39510pth) CollectionsKt___CollectionsKt.AkhnZx(listAubY, klineOpenOrderBean.getOriginPos())) != null) {
                        interfaceC39510pth.setShowSolid(true);
                    }
                    oML oml3 = (oML) chartUIComponent.isConnected().KWHzl();
                    if (oml3 != null && (c36250oUv = oml3.AuCTel) != null) {
                        c36250oUv.invalidate();
                    }
                }
            } catch (Exception e) {
                pUU.copydefault("onCostLineSLDragFinish", String.valueOf(e.getMessage()));
            }
            chartUIComponent.AYXKKw().AhwBna(false);
            chartUIComponent.AYXKKw().djSkpj();
            if (i == 2) {
                chartUIComponent.AEQbTJ("yes", "position_tpsl");
                chartUIComponent.AYXKKw().AkhnZx().AhwBna(1);
            } else if (i == 3) {
                chartUIComponent.AEQbTJ("no", "position_tpsl");
            }
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC36253oUy
        public void EZpvd(InterfaceC39510pth interfaceC39510pth) {
            Intrinsics.checkNotNullParameter(interfaceC39510pth, "");
            try {
                TradePositionManager.PositionItem positionItem = (TradePositionManager.PositionItem) CollectionsKt___CollectionsKt.AkhnZx(ChartUIComponent.this.AYXKKw().QfsBiF(), interfaceC39510pth.getIndex());
                if (positionItem != null) {
                    final ChartUIComponent chartUIComponent = ChartUIComponent.this;
                    C37928pFx c37928pFxRJOkX = chartUIComponent.AYXKKw().RJOkX();
                    androidx.fragment.app.FragmentManager childFragmentManager = chartUIComponent.AYXKKw().OLrzqt().getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    c37928pFxRJOkX.AEQbTJ(positionItem, childFragmentManager, chartUIComponent.AYXKKw().isConnected(), new Function1() { // from class: o.pny
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ChartUIComponent.ClipData.AEQbTJ(chartUIComponent, ((java.lang.Integer) obj).intValue());
                        }
                    });
                    chartUIComponent.AYXKKw().AkhnZx().EZpvd(1);
                }
            } catch (Exception e) {
                pUU.copydefault("onCostLineCancelClick 显示平仓弹框", String.valueOf(e.getMessage()));
            }
            ChartUIComponent.this.copydefault("position_line", "position_close");
        }

        public static final Unit AEQbTJ(ChartUIComponent chartUIComponent, int i) {
            if (i == 2) {
                chartUIComponent.AEQbTJ("yes", "close_position");
                chartUIComponent.AYXKKw().AkhnZx().AEQbTJ(1);
            } else if (i == 3) {
                chartUIComponent.AEQbTJ("no", "close_position");
            }
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC36253oUy
        public void AEQbTJ(InterfaceC39510pth interfaceC39510pth) {
            Intrinsics.checkNotNullParameter(interfaceC39510pth, "");
            Context context = ChartUIComponent.this.AYXKKw().OLrzqt().getContext();
            if (context != null) {
                final ChartUIComponent chartUIComponent = ChartUIComponent.this;
                try {
                    TradePositionManager.PositionItem positionItem = (TradePositionManager.PositionItem) CollectionsKt___CollectionsKt.AkhnZx(chartUIComponent.AYXKKw().QfsBiF(), interfaceC39510pth.getIndex());
                    if (positionItem != null) {
                        C37928pFx c37928pFxRJOkX = chartUIComponent.AYXKKw().RJOkX();
                        androidx.fragment.app.FragmentManager childFragmentManager = chartUIComponent.AYXKKw().OLrzqt().getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                        c37928pFxRJOkX.AEQbTJ(context, childFragmentManager, positionItem, new Function1() { // from class: o.pnE
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return ChartUIComponent.ClipData.copydefault(chartUIComponent, ((java.lang.Integer) obj).intValue());
                            }
                        });
                        chartUIComponent.AYXKKw().AkhnZx().copydefault(1);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e) {
                    pUU.copydefault("onCostLineOppositeClick 显示一键反仓弹框", String.valueOf(e.getMessage()));
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            ChartUIComponent.this.copydefault("position_line", "position_reverse");
        }

        public static final Unit copydefault(ChartUIComponent chartUIComponent, int i) {
            if (i == 2) {
                chartUIComponent.AEQbTJ("yes", "reverse_position");
                chartUIComponent.AYXKKw().AkhnZx().gEmmrt(1);
            } else if (i == 3) {
                chartUIComponent.AEQbTJ("no", "reverse_position");
            }
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC36253oUy
        public void AEQbTJ(KlineOpenOrderBean klineOpenOrderBean, String str, boolean z, boolean z2, int i) {
            C36250oUv c36250oUv;
            List<KlineOpenOrderBean> listHDKMBd;
            C36250oUv c36250oUv2;
            List<? extends InterfaceC39510pth> listAubY;
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            Intrinsics.checkNotNullParameter(str, "");
            Integer numValueOf = null;
            if (z) {
                if (!ChartUIComponent.this.AYXKKw().QfsBiF().isEmpty()) {
                    TradePositionManager.PositionItem positionItem = (TradePositionManager.PositionItem) CollectionsKt___CollectionsKt.AkhnZx(ChartUIComponent.this.AYXKKw().QfsBiF(), i);
                    if (positionItem != null) {
                        ChartUIComponent.this.AYXKKw().RJOkX().OLrzqt(klineOpenOrderBean, positionItem, str, z2);
                        return;
                    }
                    ChartUIComponent chartUIComponent = ChartUIComponent.this;
                    int size = chartUIComponent.AYXKKw().QfsBiF().size();
                    oML oml = (oML) chartUIComponent.isConnected().KWHzl();
                    if (oml != null && (c36250oUv2 = oml.AuCTel) != null && (listAubY = c36250oUv2.AubY()) != null) {
                        numValueOf = Integer.valueOf(listAubY.size());
                    }
                    pUU.copydefault("OKKLine", "tradePositionOriginList.size = " + size + " tradePositionDataList.size = " + numValueOf + " costIndex = " + i + "}");
                    return;
                }
                return;
            }
            if (!ChartUIComponent.this.AYXKKw().AwvSrB().isEmpty()) {
                TradeAllOrderApi tradeAllOrderApi = (TradeAllOrderApi) CollectionsKt___CollectionsKt.AkhnZx(ChartUIComponent.this.AYXKKw().AwvSrB(), klineOpenOrderBean.getOriginPos());
                if (tradeAllOrderApi != null) {
                    ChartUIComponent.this.AYXKKw().RJOkX().OLrzqt(klineOpenOrderBean, tradeAllOrderApi, str, z2);
                    return;
                }
                ChartUIComponent chartUIComponent2 = ChartUIComponent.this;
                int size2 = chartUIComponent2.AYXKKw().AwvSrB().size();
                oML oml2 = (oML) chartUIComponent2.isConnected().KWHzl();
                if (oml2 != null && (c36250oUv = oml2.AuCTel) != null && (listHDKMBd = c36250oUv.hDKMBd()) != null) {
                    numValueOf = Integer.valueOf(listHDKMBd.size());
                }
                pUU.copydefault("OKKLine", "openOrderOriginList.size = " + size2 + " openOrderDataList.size = " + numValueOf + " tempOrderBean.originPos = " + klineOpenOrderBean.getOriginPos() + "}");
            }
        }

        @Override // o.InterfaceC36253oUy
        public void AEQbTJ() {
            ChartUIComponent.this.AYXKKw().AhwBna(true);
        }

        @Override // o.InterfaceC36253oUy
        public void EZpvd(final KlineSpotAverageBean klineSpotAverageBean, KlineOpenOrderBean klineOpenOrderBean) {
            Intrinsics.checkNotNullParameter(klineSpotAverageBean, "");
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            androidx.fragment.app.FragmentManager childFragmentManager = ChartUIComponent.this.AYXKKw().OLrzqt().getChildFragmentManager();
            if (childFragmentManager != null) {
                final ChartUIComponent chartUIComponent = ChartUIComponent.this;
                try {
                    AbstractC54531xLw value = chartUIComponent.AYXKKw().values().fIwbmz().getValue();
                    if (value != null) {
                        MarketCoinInfo marketCoinInfoHDKMBd = chartUIComponent.AYXKKw().hDKMBd();
                        String instrumentId = marketCoinInfoHDKMBd != null ? marketCoinInfoHDKMBd.getInstrumentId() : null;
                        Intrinsics.copydefault((Object) instrumentId);
                        BizInstrument bizInstrumentValueOf = value.valueOf(instrumentId);
                        if (bizInstrumentValueOf != null) {
                            chartUIComponent.AYXKKw().RJOkX().copydefault(childFragmentManager, bizInstrumentValueOf, klineOpenOrderBean, (128 & 8) != 0 ? "" : klineSpotAverageBean.getOriginOpenAvgPx(), (128 & 16) != 0 ? "" : klineSpotAverageBean.getOriginAccAvgPx(), (128 & 32) != 0 ? "" : klineSpotAverageBean.getTpOrdPx(), (128 & 64) != 0 ? "" : klineSpotAverageBean.getSlOrdPx(), (128 & 128) != 0 ? TradeType.SELL_CLOSE : null, (128 & 256) != 0 ? null : new Function1() { // from class: o.pnu
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return ChartUIComponent.ClipData.AEQbTJ(chartUIComponent, klineSpotAverageBean, ((java.lang.Integer) obj).intValue());
                                }
                            });
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e) {
                    chartUIComponent.OLrzqt(klineSpotAverageBean);
                    pUU.copydefault("onSpotLineTPDragFinish", String.valueOf(e.getMessage()));
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            ChartUIComponent.this.copydefault("spot_cost_line", "position_tl");
        }

        public static final Unit AEQbTJ(ChartUIComponent chartUIComponent, KlineSpotAverageBean klineSpotAverageBean, int i) {
            chartUIComponent.OLrzqt(klineSpotAverageBean);
            chartUIComponent.AuCTelauCTel();
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC36253oUy
        public void AEQbTJ(final KlineSpotAverageBean klineSpotAverageBean, KlineOpenOrderBean klineOpenOrderBean) {
            Intrinsics.checkNotNullParameter(klineSpotAverageBean, "");
            Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
            androidx.fragment.app.FragmentManager childFragmentManager = ChartUIComponent.this.AYXKKw().OLrzqt().getChildFragmentManager();
            if (childFragmentManager != null) {
                final ChartUIComponent chartUIComponent = ChartUIComponent.this;
                try {
                    AbstractC54531xLw value = chartUIComponent.AYXKKw().values().fIwbmz().getValue();
                    if (value != null) {
                        MarketCoinInfo marketCoinInfoHDKMBd = chartUIComponent.AYXKKw().hDKMBd();
                        String instrumentId = marketCoinInfoHDKMBd != null ? marketCoinInfoHDKMBd.getInstrumentId() : null;
                        Intrinsics.copydefault((Object) instrumentId);
                        BizInstrument bizInstrumentValueOf = value.valueOf(instrumentId);
                        if (bizInstrumentValueOf != null) {
                            chartUIComponent.AYXKKw().RJOkX().copydefault(childFragmentManager, bizInstrumentValueOf, klineOpenOrderBean, (128 & 8) != 0 ? "" : klineSpotAverageBean.getOriginOpenAvgPx(), (128 & 16) != 0 ? "" : klineSpotAverageBean.getOriginAccAvgPx(), (128 & 32) != 0 ? "" : klineSpotAverageBean.getTpOrdPx(), (128 & 64) != 0 ? "" : klineSpotAverageBean.getSlOrdPx(), (128 & 128) != 0 ? TradeType.SELL_CLOSE : null, (128 & 256) != 0 ? null : new Function1() { // from class: o.pnx
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return ChartUIComponent.ClipData.OLrzqt(chartUIComponent, klineSpotAverageBean, ((java.lang.Integer) obj).intValue());
                                }
                            });
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e) {
                    chartUIComponent.OLrzqt(klineSpotAverageBean);
                    pUU.copydefault("onSpotLineTPDragFinish", String.valueOf(e.getMessage()));
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            ChartUIComponent.this.copydefault("spot_cost_line", "position_sl");
        }

        public static final Unit OLrzqt(ChartUIComponent chartUIComponent, KlineSpotAverageBean klineSpotAverageBean, int i) {
            chartUIComponent.OLrzqt(klineSpotAverageBean);
            chartUIComponent.AuCTelauCTel();
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC36253oUy
        public void copydefault(KlineSpotAverageBean klineSpotAverageBean) {
            Intrinsics.checkNotNullParameter(klineSpotAverageBean, "");
            androidx.fragment.app.FragmentManager childFragmentManager = ChartUIComponent.this.AYXKKw().OLrzqt().getChildFragmentManager();
            if (childFragmentManager != null) {
                final ChartUIComponent chartUIComponent = ChartUIComponent.this;
                try {
                    AbstractC54531xLw value = chartUIComponent.AYXKKw().values().fIwbmz().getValue();
                    if (value != null) {
                        MarketCoinInfo marketCoinInfoHDKMBd = chartUIComponent.AYXKKw().hDKMBd();
                        String instrumentId = marketCoinInfoHDKMBd != null ? marketCoinInfoHDKMBd.getInstrumentId() : null;
                        Intrinsics.copydefault((Object) instrumentId);
                        BizInstrument bizInstrumentValueOf = value.valueOf(instrumentId);
                        if (bizInstrumentValueOf != null) {
                            chartUIComponent.AYXKKw().RJOkX().copydefault(childFragmentManager, bizInstrumentValueOf, (64 & 4) != 0 ? "" : klineSpotAverageBean.getOriginOpenAvgPx(), (64 & 8) != 0 ? "" : klineSpotAverageBean.getOriginAccAvgPx(), (64 & 16) != 0 ? TradeType.SELL_CLOSE : TradeType.SELL_CLOSE, (64 & 32) != 0 ? null : new Function1() { // from class: o.pnt
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return ChartUIComponent.ClipData.valueOf(chartUIComponent, ((java.lang.Integer) obj).intValue());
                                }
                            }, (64 & 64) != 0);
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e) {
                    pUU.copydefault("onSpotLineTPDragFinish", String.valueOf(e.getMessage()));
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            ChartUIComponent.this.copydefault("spot_cost_line", "position_close");
        }

        public static final Unit valueOf(ChartUIComponent chartUIComponent, int i) {
            chartUIComponent.AuCTelauCTel();
            return Unit.INSTANCE;
        }
    }

    private final void OcIXYQ() {
        KWHzl(new TimeIntervalItem(C36246oUr.copydefault().ODWQjV(), "", "", "", ""), true);
    }

    private final void wlaJM() {
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = this.copydefault.uzCIH();
        if (stateListAnimatorUzCIH != null) {
            stateListAnimatorUzCIH.AEQbTJ(this.copydefault.OLrzqt(), new Function1() { // from class: o.plW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ChartUIComponent.AYXKKw(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit AYXKKw(ChartUIComponent chartUIComponent, boolean z) {
        AppCompatTextView appCompatTextView;
        boolean z2 = (z || !pFS.KWHzl.AEQbTJ() || chartUIComponent.copydefault.QUSxYX()) ? false : true;
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (appCompatTextView = oml.zsXlph) != null) {
            appCompatTextView.setVisibility(z2 ? 0 : 8);
        }
        if (!z2 && C36246oUr.copydefault().zLjUOn().isCeFiMCapMode()) {
            chartUIComponent.copydefault(false);
            changeTime$default(chartUIComponent, (TimeIntervalItem) CollectionsKt___CollectionsKt.AubY(pEW.EZpvd.copydefault()), false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(boolean z) {
        int iCopydefault;
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        if (pFS.KWHzl.KWHzl(this.copydefault.OLrzqt().getParentFragment())) {
            return;
        }
        KlineQuoteDataComponent klineQuoteDataComponent = this.copydefault;
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            if (z) {
                klineQuoteDataComponent.ejfBZ().OLrzqt(ChartViewOutSideConfig.copy$default(chartViewOutSideConfigAkhnZx, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, false, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, Integer.MAX_VALUE, null));
                chartViewOutSideConfigAkhnZx.setMShowCostLine(false);
                chartViewOutSideConfigAkhnZx.setShowSpotAveragePrice(false);
                chartViewOutSideConfigAkhnZx.setMShowCountdown(false);
                chartViewOutSideConfigAkhnZx.setMChartHistoryOrder(false);
                chartViewOutSideConfigAkhnZx.setMShowCurrentOrder(false);
                chartViewOutSideConfigAkhnZx.setMShowOpenOrderExtendedLine(false);
                chartViewOutSideConfigAkhnZx.setMShowPriceWarning(false);
                chartViewOutSideConfigAkhnZx.setMOrdinateType(0);
                chartViewOutSideConfigAkhnZx.setMKlineAbstractType(1);
                chartViewOutSideConfigAkhnZx.setCeFiMCapMode(true);
            } else {
                ChartViewOutSideConfig chartViewOutSideConfigValueOf = klineQuoteDataComponent.ejfBZ().valueOf();
                if (chartViewOutSideConfigValueOf != null) {
                    chartViewOutSideConfigAkhnZx.setMShowCostLine(chartViewOutSideConfigValueOf.getMShowCostLine());
                    chartViewOutSideConfigAkhnZx.setShowSpotAveragePrice(chartViewOutSideConfigValueOf.isShowSpotAveragePrice());
                    chartViewOutSideConfigAkhnZx.setMShowCountdown(chartViewOutSideConfigValueOf.getMShowCountdown());
                    chartViewOutSideConfigAkhnZx.setMChartHistoryOrder(chartViewOutSideConfigValueOf.getMChartHistoryOrder());
                    chartViewOutSideConfigAkhnZx.setMShowCurrentOrder(chartViewOutSideConfigValueOf.getMShowCurrentOrder());
                    chartViewOutSideConfigAkhnZx.setMShowOpenOrderExtendedLine(chartViewOutSideConfigValueOf.getMShowOpenOrderExtendedLine());
                    chartViewOutSideConfigAkhnZx.setMShowPriceWarning(chartViewOutSideConfigValueOf.getMShowPriceWarning());
                    chartViewOutSideConfigAkhnZx.setMOrdinateType(chartViewOutSideConfigValueOf.getMOrdinateType());
                    chartViewOutSideConfigAkhnZx.setMKlineAbstractType(chartViewOutSideConfigValueOf.getMKlineAbstractType());
                    chartViewOutSideConfigAkhnZx.setCeFiMCapMode(false);
                    klineQuoteDataComponent.ejfBZ().OLrzqt((ChartViewOutSideConfig) null);
                }
            }
        }
        oML oml2 = (oML) this.iwGUEr.KWHzl();
        if (oml2 != null) {
            boolean z2 = !z;
            oml2.AkhnZx.setEnabled(z2);
            oml2.AYXKKw.setEnabled(z2);
            oml2.zuBGHE.setAlpha(z ? 0.5f : 1.0f);
            if (z) {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.UlJrfe);
            } else {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            }
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iCopydefault);
            Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "");
            oml2.AkhnZx.setImageTintList(colorStateListValueOf);
            oml2.AYXKKw.setImageTintList(colorStateListValueOf);
            OLrzqt(z);
            C39756pyO c39756pyO = oml2.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(c39756pyO, "");
            c39756pyO.setVisibility(z2 ? 0 : 8);
            oml2.getFieldNames.OLrzqt(z);
        }
        dNCPSb();
        KWHzl(z);
    }

    private final void OLrzqt(boolean z) {
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml != null) {
            if (oml.getFieldNames.KWHzl() && z) {
                oml.AuCTel.gHZMYf();
                oml.AuCTel.sSMYrx();
            } else if (oml.getFieldNames.KWHzl() || z) {
                int iCopydefault = oml.AuCTel.copydefault(z);
                if (z) {
                    KlineQuoteDataComponent klineQuoteDataComponent = this.copydefault;
                    klineQuoteDataComponent.AEQbTJ(klineQuoteDataComponent.iwGUEr() - iCopydefault);
                } else {
                    KlineQuoteDataComponent klineQuoteDataComponent2 = this.copydefault;
                    klineQuoteDataComponent2.AEQbTJ(klineQuoteDataComponent2.iwGUEr() + iCopydefault);
                }
            }
        }
    }

    private final void KWHzl(boolean z) {
        final AppCompatTextView appCompatTextView;
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml == null || (appCompatTextView = oml.zsXlph) == null) {
            return;
        }
        final int i = z ? C35964oKf.Dialog.KWHzl : C35964oKf.Dialog.EZpvd;
        String string = appCompatTextView.getText().toString();
        appCompatTextView.setText(C33061mpO.setupSpanStyles$default(string, new String[]{string}, 0, null, false, new Function1() { // from class: o.pnf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.KWHzl(appCompatTextView, i, (java.util.List) obj);
            }
        }, 14, null));
        appCompatTextView.setSelected(z);
    }

    public static final Unit KWHzl(AppCompatTextView appCompatTextView, int i, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new TextAppearanceSpan(appCompatTextView.getContext(), i));
        return Unit.INSTANCE;
    }

    private final void QfsBiF() {
        AbstractC39028pka abstractC39028pkaOLrzqt = this.copydefault.OLrzqt();
        abstractC39028pkaOLrzqt.getChildFragmentManager().setFragmentResultListener("re_open_eco_calendar", abstractC39028pkaOLrzqt.getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.pmV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ChartUIComponent.copydefault(this.OLrzqt, str, bundle);
            }
        });
    }

    public static final void copydefault(ChartUIComponent chartUIComponent, String str, Bundle bundle) {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ArrayList<KLineEventBean> value = chartUIComponent.copydefault.values().fARcdN().getValue();
        if (value == null || value.isEmpty()) {
            chartUIComponent.values();
            return;
        }
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
        }
        chartUIComponent.dNCPSb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(KlineSpotAverageBean klineSpotAverageBean) {
        klineSpotAverageBean.setTDragSL(false);
        klineSpotAverageBean.setTDragTP(false);
        klineSpotAverageBean.setTSelected(true);
        klineSpotAverageBean.setTShowSolid(true);
        this.copydefault.AhwBna(false);
        this.copydefault.djSkpj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AuCTelauCTel() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("PlaceOrder_Kline_TradeTools_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.plw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.djBIcL((EventParamsList) obj);
            }
        });
    }

    public static final Unit djBIcL(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tool_type", "spot_cost_line", true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(final String str, final String str2) {
        C32866mlf.onEvent$default("PlaceOrder_Pop_TradeOrderStatus_View", (TrackChannel[]) null, new Function1() { // from class: o.pmN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.OLrzqt(this.AEQbTJ, str, str2, (EventParamsList) obj);
            }
        }, 1, (Object) null);
        pXB.EZpvd.AEQbTJ(str2, C56423yEv.EZpvd(C56390yDp.OLrzqt("is_success", str)));
    }

    public static final Unit OLrzqt(ChartUIComponent chartUIComponent, String str, String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        String strAuCTel = chartUIComponent.copydefault.AuCTel();
        eventParamsList.put("biz_type", strAuCTel != null ? strAuCTel : "", true);
        eventParamsList.put("is_success", str, true);
        eventParamsList.put(BotWebHook.KEY_ACTION, str2, true);
        eventParamsList.put("chart_layout", "classic", true);
        eventParamsList.put("page", "chart", true);
        return Unit.INSTANCE;
    }

    public final void EZpvd(LifecycleOwner lifecycleOwner) {
        this.copydefault.values().djBIcL().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.plX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.AYXKKw(this.EZpvd, (java.util.ArrayList) obj);
            }
        }));
        this.copydefault.values().DbNXlk().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.valueOf(this.EZpvd, (java.util.ArrayList) obj);
            }
        }));
        this.copydefault.values().AuCTel().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.fetchVPNInfo(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        this.copydefault.values().zLjUOn().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.DbNXlk(this.OLrzqt, (java.util.List) obj);
            }
        }));
        this.copydefault.values().zsXlph().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.AkhnZx(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        this.copydefault.values().values().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.OLrzqt(this.AEQbTJ, (kotlin.Pair) obj);
            }
        }));
        this.copydefault.values().hDKMBd().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.fIwbmz(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        this.copydefault.values().uzCIH().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.AuCTel(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        this.copydefault.values().valueOf().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.KWHzl(this.AEQbTJ, (TimeIntervalItem) obj);
            }
        }));
        this.copydefault.values().QbewEr().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.gEmmrt(this.copydefault, (java.lang.String) obj);
            }
        }));
        this.copydefault.values().KWHzl().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.plV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.gEmmrt(this.EZpvd, (java.util.ArrayList) obj);
            }
        }));
        this.copydefault.values().fJNWhG().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.copydefault(this.EZpvd, (java.lang.Integer) obj);
            }
        }));
        this.copydefault.values().AubY().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.fARcdN(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        this.copydefault.values().getNewProxyInstance().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pma
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.fJNWhG(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        this.copydefault.values().fetchVPNInfo().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pme
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.ejfBZ(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        this.copydefault.values().RcXXUw().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.getFieldNames(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        this.copydefault.values().AhwBna().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.EZpvd(this.OLrzqt, (android.animation.ValueAnimator) obj);
            }
        }));
        this.copydefault.values().AkhnZx().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.DbNXlk(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        this.copydefault.values().OcIXYQ().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.values(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        this.copydefault.values().zuBGHE().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.AkhnZx(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        this.copydefault.values().DTwDnp().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.fetchVPNInfo(this.KWHzl, (java.util.List) obj);
            }
        }));
        this.copydefault.values().QOLQEE().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pml
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.djBIcL(this.OLrzqt, (java.util.ArrayList) obj);
            }
        }));
        this.copydefault.values().ORxRYg().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.copydefault(this.KWHzl, (KlineQuickOrderPriceBean) obj);
            }
        }));
        this.copydefault.values().aKErDB().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.KWHzl(this.copydefault, (C39104plx) obj);
            }
        }));
        this.copydefault.values().gEmmrt().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pms
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.EZpvd(this.EZpvd, (MarketTypeSelect) obj);
            }
        }));
        this.copydefault.AxsJAY().OLrzqt().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.AEQbTJ(this.KWHzl, (kotlin.Pair) obj);
            }
        }));
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("kline_portrait_full_screen");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this.copydefault.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.pmq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.values(this.KWHzl, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pmt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ChartUIComponent.EZpvd(function1, obj);
            }
        });
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ2 = RxBus.AEQbTJ("kline_portrait_full_screen_double_click");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ2, this.copydefault.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.pmy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.AkhnZx(this.OLrzqt, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pmx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ChartUIComponent.AEQbTJ(function12, obj);
            }
        });
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ3 = RxBus.AEQbTJ("kline_trade_point_click");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ3, "");
        AbstractC58185ywX abstractC58185ywXEZpvd3 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ3, this.copydefault.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.pmu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.fetchVPNInfo(this.EZpvd, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pmw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ChartUIComponent.AYXKKw(function13, obj);
            }
        });
        C37979pHu c37979pHu = C37979pHu.AEQbTJ;
        c37979pHu.OLrzqt().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.isConnected(this.KWHzl, (java.util.List) obj);
            }
        }));
        c37979pHu.AEQbTJ().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.AuCTel(this.KWHzl, (java.util.List) obj);
            }
        }));
        c37979pHu.KWHzl().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.fARcdN(this.EZpvd, (java.util.List) obj);
            }
        }));
        c37979pHu.copydefault().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.fJNWhG(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        c37979pHu.EZpvd().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.ejfBZ(this.KWHzl, (java.util.List) obj);
            }
        }));
        this.copydefault.values().AwvSrB().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.getNewProxyInstance(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        this.copydefault.values().sSMYrx().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.iwGUEr(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        this.copydefault.values().QUSxYX().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.EZpvd(this.copydefault, (KlineSpotAverageBean) obj);
            }
        }));
        this.copydefault.values().copydefault().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.KWHzl(this.EZpvd, (BizInstrument) obj);
            }
        }));
        this.copydefault.values().AxsJAY().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.ejfBZ(this.copydefault, (java.lang.String) obj);
            }
        }));
        this.copydefault.values().AuCTelauCTel().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.fIwbmz(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        this.copydefault.AubY().djBIcL().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.hDKMBd(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        this.copydefault.values().fARcdN().observe(lifecycleOwner, new BroadcastReceiver(new Function1() { // from class: o.pmS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.AhwBna(this.AEQbTJ, (java.util.ArrayList) obj);
            }
        }));
    }

    public static final Unit AYXKKw(ChartUIComponent chartUIComponent, ArrayList arrayList) {
        Intrinsics.copydefault(arrayList);
        chartUIComponent.AEQbTJ((ArrayList<DrawLineData.DrawLineItem>) arrayList);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(ChartUIComponent chartUIComponent, ArrayList arrayList) {
        chartUIComponent.KWHzl((ArrayList<Triple<AbstractC36262oVg, Boolean, KlineIndicatorBean>>) arrayList);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(ChartUIComponent chartUIComponent, Boolean bool) {
        C36250oUv c36250oUv;
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv = oml.AuCTel) != null) {
            c36250oUv.invalidate();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(ChartUIComponent chartUIComponent, List list) {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv2 = oml.AuCTel) != null) {
            c36250oUv2.setOpenOrderAllList(list);
        }
        oML oml2 = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml2 != null && (c36250oUv = oml2.AuCTel) != null) {
            c36250oUv.invalidate();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(ChartUIComponent chartUIComponent, Boolean bool) {
        C36250oUv c36250oUv;
        chartUIComponent.ORxRYg();
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv = oml.AuCTel) != null) {
            c36250oUv.invalidate();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ChartUIComponent chartUIComponent, Pair pair) {
        pUU.KWHzl("KlinePageInit", "initDataLiveData received, start init data");
        chartUIComponent.values();
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(ChartUIComponent chartUIComponent, Boolean bool) {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        TemplateSetting templateSettingWlaJM;
        ArrayList<String> sideIndicatorNames;
        if (bool.booleanValue()) {
            oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
            chartUIComponent.copydefault.AEQbTJ(C36246oUr.copydefault().RlQdEF() + (C36246oUr.copydefault().accept() * ((oml == null || (c36250oUv2 = oml.AuCTel) == null || (templateSettingWlaJM = c36250oUv2.wlaJM()) == null || (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) == null) ? 0 : sideIndicatorNames.size())));
            int iIwGUEr = (int) (chartUIComponent.copydefault.iwGUEr() * ((((SPUtils.getInt("chart_height", 25).intValue() - 50) * 1.0f) / 200.0f) + 1.0f));
            oML oml2 = (oML) chartUIComponent.iwGUEr.KWHzl();
            if (oml2 != null && (c36250oUv = oml2.AuCTel) != null) {
                c36250oUv.setMinimumHeight(iIwGUEr);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(ChartUIComponent chartUIComponent, Boolean bool) {
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        oML oml;
        C39756pyO c39756pyO;
        C39756pyO c39756pyO2;
        oML oml2 = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml2 != null && (c36250oUv = oml2.AuCTel) != null && (templateSettingWlaJM = c36250oUv.wlaJM()) != null) {
            oML oml3 = (oML) chartUIComponent.iwGUEr.KWHzl();
            if (oml3 != null && (c39756pyO2 = oml3.fIwbmz) != null) {
                c39756pyO2.setMainIndicatorSelect();
            }
            ArrayList<String> sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames();
            if (sideIndicatorNames != null && (oml = (oML) chartUIComponent.iwGUEr.KWHzl()) != null && (c39756pyO = oml.fIwbmz) != null) {
                c39756pyO.setSideIndicators(sideIndicatorNames);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ChartUIComponent chartUIComponent, TimeIntervalItem timeIntervalItem) {
        chartUIComponent.copydefault(false);
        Intrinsics.copydefault(timeIntervalItem);
        changeTime$default(chartUIComponent, timeIntervalItem, false, 2, null);
        chartUIComponent.copydefault.AkhnZx().KWHzl("isClockTampered");
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(final ChartUIComponent chartUIComponent, final String str) {
        chartUIComponent.copydefault.zLjUOn().post(new Runnable() { // from class: o.png
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ChartUIComponent.isConnected(this.OLrzqt, str);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void isConnected(ChartUIComponent chartUIComponent, String str) {
        if (chartUIComponent.AuCTel instanceof C36327oXr) {
            chartUIComponent.valueOf();
            InterfaceC36254oUz interfaceC36254oUz = chartUIComponent.AuCTel;
            C36327oXr c36327oXr = interfaceC36254oUz instanceof C36327oXr ? (C36327oXr) interfaceC36254oUz : null;
            if (c36327oXr != null) {
                c36327oXr.loadUrl(str);
            }
            chartUIComponent.EZpvd = true;
        }
    }

    public static final Unit gEmmrt(ChartUIComponent chartUIComponent, ArrayList arrayList) {
        Intrinsics.copydefault(arrayList);
        chartUIComponent.copydefault(arrayList);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ChartUIComponent chartUIComponent, Integer num) {
        Intrinsics.copydefault(num);
        chartUIComponent.AEQbTJ(num.intValue());
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(ChartUIComponent chartUIComponent, Boolean bool) {
        AppCompatTextView appCompatTextView;
        C36250oUv c36250oUv;
        chartUIComponent.getNewProxyInstance();
        if (!pFS.KWHzl.KWHzl(chartUIComponent.copydefault.OLrzqt().getParentFragment())) {
            C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
            oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
            chartUIComponent.fARcdN = C36312oXc.AEQbTJ(oml != null ? oml.AuCTel : null);
            oML oml2 = (oML) chartUIComponent.iwGUEr.KWHzl();
            if (oml2 != null && (c36250oUv = oml2.AuCTel) != null) {
                c36250oUv.setCurrentStateMachine(chartUIComponent.fARcdN);
            }
        } else {
            oML oml3 = (oML) chartUIComponent.iwGUEr.KWHzl();
            if (oml3 != null && (appCompatTextView = oml3.zsXlph) != null) {
                appCompatTextView.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(ChartUIComponent chartUIComponent, Boolean bool) {
        oML oml;
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        oML oml2;
        C36250oUv c36250oUv2;
        HashMap<String, DataSource> mapEjfBZ;
        C36250oUv c36250oUv3;
        if (((!Intrinsics.EZpvd((Object) chartUIComponent.copydefault.getNewProxyInstance(), (Object) "TYPE_KLINE") && !chartUIComponent.copydefault.aKErDB()) || chartUIComponent.copydefault.QbewEr() || ((oml = (oML) chartUIComponent.iwGUEr.KWHzl()) != null && (c36250oUv = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null && chartViewOutSideConfigAkhnZx.isFastKLineMode())) && (oml2 = (oML) chartUIComponent.iwGUEr.KWHzl()) != null && (c36250oUv2 = oml2.AuCTel) != null && (mapEjfBZ = c36250oUv2.ejfBZ()) != null) {
            oML oml3 = (oML) chartUIComponent.iwGUEr.KWHzl();
            DataSource dataSource = mapEjfBZ.get((oml3 == null || (c36250oUv3 = oml3.AuCTel) == null) ? null : c36250oUv3.fIwbmz());
            if (dataSource != null) {
                dataSource.KWHzl();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(ChartUIComponent chartUIComponent, Boolean bool) {
        if (chartUIComponent.copydefault.hDKMBd() != null) {
            chartUIComponent.DTwDnp();
        }
        return Unit.INSTANCE;
    }

    public static final Unit getFieldNames(ChartUIComponent chartUIComponent, Boolean bool) {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        HashMap<String, DataSource> mapEjfBZ;
        C36250oUv c36250oUv3;
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv2 = oml.AuCTel) != null && (mapEjfBZ = c36250oUv2.ejfBZ()) != null) {
            oML oml2 = (oML) chartUIComponent.iwGUEr.KWHzl();
            DataSource dataSource = mapEjfBZ.get((oml2 == null || (c36250oUv3 = oml2.AuCTel) == null) ? null : c36250oUv3.fIwbmz());
            if (dataSource != null) {
                dataSource.KWHzl();
            }
        }
        oML oml3 = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml3 != null && (c36250oUv = oml3.AuCTel) != null) {
            c36250oUv.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final ChartUIComponent chartUIComponent, ValueAnimator valueAnimator) {
        final C36250oUv c36250oUv;
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv = oml.AuCTel) != null && chartUIComponent.copydefault.ejfBZ().AEQbTJ() > 0 && chartUIComponent.copydefault.ejfBZ().EZpvd() > 0 && C36246oUr.copydefault().zuWLRA() > 0) {
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = C36246oUr.copydefault().zuWLRA() + C55298xhM.dp2px$default(36.0f, null, 1, null);
            c36250oUv.setMinimumHeight(chartUIComponent.copydefault.ejfBZ().EZpvd());
            c36250oUv.setTranslationY(-C33129mqd.djBIcL(Integer.valueOf(intRef.element)));
            valueAnimator.setDuration(chartUIComponent.copydefault.KWHzl());
            valueAnimator.setInterpolator(new LinearInterpolator());
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.plZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                    ChartUIComponent.OLrzqt(this.KWHzl, c36250oUv, intRef, valueAnimator2);
                }
            });
            valueAnimator.start();
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ChartUIComponent chartUIComponent, C36250oUv c36250oUv, Ref.IntRef intRef, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        float fEZpvd = chartUIComponent.copydefault.ejfBZ().EZpvd();
        float fAEQbTJ = chartUIComponent.copydefault.ejfBZ().AEQbTJ() - chartUIComponent.copydefault.ejfBZ().EZpvd();
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c36250oUv.setMinimumHeight(C33129mqd.AhwBna(Float.valueOf(fEZpvd + (fAEQbTJ * ((Float) animatedValue).floatValue()))));
        float f = intRef.element;
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue2, "");
        c36250oUv.setTranslationY((f * ((Float) animatedValue2).floatValue()) - intRef.element);
    }

    public static final Unit DbNXlk(ChartUIComponent chartUIComponent, String str) {
        oML oml;
        C36250oUv c36250oUv;
        if (Intrinsics.EZpvd((Object) str, (Object) chartUIComponent.copydefault.values().isConnected()) && (oml = (oML) chartUIComponent.iwGUEr.KWHzl()) != null && (c36250oUv = oml.AuCTel) != null) {
            c36250oUv.QfsBiF();
        }
        return Unit.INSTANCE;
    }

    public static final Unit values(ChartUIComponent chartUIComponent, List list) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        C36250oUv c36250oUv;
        View view;
        C36250oUv c36250oUv2;
        chartUIComponent.valueOf();
        if (!C55608xnE.OLrzqt() && chartUIComponent.AEQbTJ && C33512mxp.AEQbTJ.AYXKKw() == 1) {
            InterfaceC39502ptZ interfaceC39502ptZCopydefault = chartUIComponent.copydefault.copydefault();
            if (interfaceC39502ptZCopydefault != null) {
                interfaceC39502ptZCopydefault.DGOPHZ();
            }
            chartUIComponent.AEQbTJ = false;
        }
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv2 = oml.AuCTel) != null) {
            c36250oUv2.AEQbTJ((List<? extends oUO>) list);
        }
        oML oml2 = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml2 != null && (view = oml2.AubY) != null) {
            view.setVisibility(8);
        }
        oML oml3 = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml3 != null && (c36250oUv = oml3.AuCTel) != null) {
            c36250oUv.setShowEmptyUi(list.isEmpty());
        }
        oML oml4 = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml4 != null && (linearLayout = oml4.ejfBZ) != null && linearLayout.getVisibility() == 0) {
            linearLayout.setVisibility(8);
            oML oml5 = (oML) chartUIComponent.iwGUEr.KWHzl();
            if (oml5 != null && (linearLayout2 = oml5.DbNXlk) != null) {
                linearLayout2.setVisibility(0);
            }
        }
        if (chartUIComponent.copydefault.ejfBZ().valueOf() != null) {
            chartUIComponent.copydefault.ejfBZ().djBIcL().setValue(Unit.INSTANCE);
        }
        chartUIComponent.gHZMYf();
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(ChartUIComponent chartUIComponent, List list) {
        C36250oUv c36250oUv;
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv = oml.AuCTel) != null) {
            c36250oUv.KWHzl((List<? extends oUO>) list);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(ChartUIComponent chartUIComponent, List list) {
        C36250oUv c36250oUv;
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv = oml.AuCTel) != null) {
            c36250oUv.OLrzqt((List<? extends oUO>) list);
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(ChartUIComponent chartUIComponent, ArrayList arrayList) {
        C36250oUv c36250oUv;
        oML oml;
        C36250oUv c36250oUv2;
        C39043pkp<oML> c39043pkp = chartUIComponent.iwGUEr;
        if (c39043pkp != null && (oml = (oML) c39043pkp.KWHzl()) != null && (c36250oUv2 = oml.AuCTel) != null) {
            c36250oUv2.setTradePositionDataList(arrayList);
        }
        oML oml2 = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml2 != null && (c36250oUv = oml2.AuCTel) != null) {
            c36250oUv.invalidate();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ChartUIComponent chartUIComponent, KlineQuickOrderPriceBean klineQuickOrderPriceBean) {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv2 = oml.AuCTel) != null) {
            c36250oUv2.setQuickOrderPrice(klineQuickOrderPriceBean);
        }
        oML oml2 = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml2 != null && (c36250oUv = oml2.AuCTel) != null) {
            c36250oUv.invalidate();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ChartUIComponent chartUIComponent, C39104plx c39104plx) {
        chartUIComponent.KWHzl(c39104plx.KWHzl(), c39104plx.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ChartUIComponent chartUIComponent, MarketTypeSelect marketTypeSelect) {
        Intrinsics.copydefault(marketTypeSelect);
        chartUIComponent.copydefault(marketTypeSelect);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ChartUIComponent chartUIComponent, Pair pair) {
        Object next;
        if (((Boolean) pair.getFirst()).booleanValue()) {
            Iterator<T> it = pEW.EZpvd.copydefault().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd(((TimeIntervalItem) next).getTradingType(), pair.getSecond())) {
                    break;
                }
            }
            TimeIntervalItem timeIntervalItem = (TimeIntervalItem) next;
            if (timeIntervalItem != null) {
                changeTime$default(chartUIComponent, timeIntervalItem, false, 2, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit values(ChartUIComponent chartUIComponent, String str) {
        C36250oUv c36250oUv;
        pCT pctEjfBZ = chartUIComponent.copydefault.ejfBZ();
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        pctEjfBZ.KWHzl((oml == null || (c36250oUv = oml.AuCTel) == null) ? 0 : c36250oUv.getMinimumHeight());
        InterfaceC39499ptW interfaceC39499ptWAEQbTJ = chartUIComponent.copydefault.AEQbTJ();
        if (interfaceC39499ptWAEQbTJ != null) {
            oML oml2 = (oML) chartUIComponent.iwGUEr.KWHzl();
            interfaceC39499ptWAEQbTJ.setPortraitFullScreen(oml2 != null ? oml2.AuCTel : null);
        }
        chartUIComponent.copydefault.AYXKKw(true);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AkhnZx(ChartUIComponent chartUIComponent, String str) {
        C36250oUv c36250oUv;
        pCT pctEjfBZ = chartUIComponent.copydefault.ejfBZ();
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        pctEjfBZ.KWHzl((oml == null || (c36250oUv = oml.AuCTel) == null) ? 0 : c36250oUv.getMinimumHeight());
        InterfaceC39499ptW interfaceC39499ptWAEQbTJ = chartUIComponent.copydefault.AEQbTJ();
        if (interfaceC39499ptWAEQbTJ != null) {
            oML oml2 = (oML) chartUIComponent.iwGUEr.KWHzl();
            interfaceC39499ptWAEQbTJ.setPortraitFullScreen(oml2 != null ? oml2.AuCTel : null);
        }
        chartUIComponent.copydefault.AYXKKw(true);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLine_Full_Button_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pmr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.ejfBZ((EventParamsList) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("chart_size_swtich_click", "to_fullscreen_double_click", true);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fetchVPNInfo(ChartUIComponent chartUIComponent, String str) {
        C36250oUv c36250oUv;
        chartUIComponent.copydefault.values().KWHzl(1);
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv = oml.AuCTel) != null) {
            c36250oUv.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(ChartUIComponent chartUIComponent, List list) {
        C36250oUv c36250oUv;
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv = oml.AuCTel) != null) {
            c36250oUv.EZpvd(list, "OI");
        }
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(ChartUIComponent chartUIComponent, List list) {
        C36250oUv c36250oUv;
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv = oml.AuCTel) != null) {
            c36250oUv.EZpvd(list, "LSAcco");
        }
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(ChartUIComponent chartUIComponent, List list) {
        C36250oUv c36250oUv;
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv = oml.AuCTel) != null) {
            c36250oUv.EZpvd(list, "LSRatio");
        }
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(ChartUIComponent chartUIComponent, List list) {
        C36250oUv c36250oUv;
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv = oml.AuCTel) != null) {
            c36250oUv.EZpvd(list, "LSPos");
        }
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(ChartUIComponent chartUIComponent, List list) {
        C36250oUv c36250oUv;
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv = oml.AuCTel) != null) {
            c36250oUv.EZpvd(list, "BSVol");
        }
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance(ChartUIComponent chartUIComponent, Boolean bool) {
        chartUIComponent.QVAiDq();
        return Unit.INSTANCE;
    }

    public static final Unit iwGUEr(ChartUIComponent chartUIComponent, Boolean bool) {
        chartUIComponent.QUSxYX();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ChartUIComponent chartUIComponent, KlineSpotAverageBean klineSpotAverageBean) {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        oML oml;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        KlineSpotAverageBean klineSpotAverageBean2;
        if (klineSpotAverageBean != null && (oml = (oML) chartUIComponent.iwGUEr.KWHzl()) != null && (c36250oUv2 = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv2.AkhnZx()) != null && (klineSpotAverageBean2 = chartViewOutSideConfigAkhnZx2.getKlineSpotAverageBean()) != null) {
            klineSpotAverageBean.setTSelected(klineSpotAverageBean2.getTSelected());
            klineSpotAverageBean.setTLongClick(klineSpotAverageBean2.getTLongClick());
            klineSpotAverageBean.setTShowSolid(klineSpotAverageBean2.getTShowSolid());
            klineSpotAverageBean.setTDragTP(klineSpotAverageBean2.getTDragTP());
            klineSpotAverageBean.setTDragSL(klineSpotAverageBean2.getTDragSL());
        }
        oML oml2 = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml2 != null && (c36250oUv = oml2.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setKlineSpotAverageBean(klineSpotAverageBean);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ChartUIComponent chartUIComponent, BizInstrument bizInstrument) {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        C36250oUv c36250oUv3;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        C36250oUv c36250oUv4;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx4;
        AbstractC54531xLw value = chartUIComponent.copydefault.values().fIwbmz().getValue();
        if (value != null) {
            C36246oUr.copydefault(pDX.KWHzl());
            if (pDX.KWHzl()) {
                oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
                if (oml != null && (c36250oUv4 = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx4 = c36250oUv4.AkhnZx()) != null) {
                    chartViewOutSideConfigAkhnZx4.setAmountDisplaySymbol(C33129mqd.gEmmrt(bizInstrument.getTradeSymbol()));
                }
                oML oml2 = (oML) chartUIComponent.iwGUEr.KWHzl();
                if (oml2 != null && (c36250oUv3 = oml2.AuCTel) != null && (chartViewOutSideConfigAkhnZx3 = c36250oUv3.AkhnZx()) != null) {
                    chartViewOutSideConfigAkhnZx3.setTurnoverDisplaySymbol(C33129mqd.gEmmrt(bizInstrument.getQuoteSymbol()));
                }
            } else {
                oML oml3 = (oML) chartUIComponent.iwGUEr.KWHzl();
                if (oml3 != null && (c36250oUv = oml3.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
                    chartViewOutSideConfigAkhnZx.setAmountDisplaySymbol(C33129mqd.gEmmrt(value.OLrzqt(bizInstrument)));
                }
            }
            oML oml4 = (oML) chartUIComponent.iwGUEr.KWHzl();
            if (oml4 != null && (c36250oUv2 = oml4.AuCTel) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setTradeSymbol(bizInstrument.getTradeSymbol());
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(ChartUIComponent chartUIComponent, String str) {
        oML oml;
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        if (Intrinsics.EZpvd((Object) "empty", (Object) str) && (oml = (oML) chartUIComponent.iwGUEr.KWHzl()) != null && (c36250oUv = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setShowEmptyUi(true);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(ChartUIComponent chartUIComponent, List list) {
        C36250oUv c36250oUv;
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv = oml.AuCTel) != null) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx();
            if (chartViewOutSideConfigAkhnZx != null) {
                chartViewOutSideConfigAkhnZx.setPriceWarningDataList(list);
            }
            c36250oUv.invalidate();
        }
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(final ChartUIComponent chartUIComponent, Boolean bool) {
        ImageView imageView;
        if (bool.booleanValue()) {
            InterfaceC36254oUz interfaceC36254oUz = chartUIComponent.AuCTel;
            if (interfaceC36254oUz != null) {
                C37895pEr c37895pEr = C37895pEr.copydefault;
                FragmentActivity activity = chartUIComponent.copydefault.OLrzqt().getActivity();
                c37895pEr.copydefault(activity != null ? activity.getWindow() : null, (C36327oXr) interfaceC36254oUz, new Function1() { // from class: o.pnb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ChartUIComponent.KWHzl(this.KWHzl, (android.graphics.Bitmap) obj);
                    }
                });
            }
        } else {
            oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
            if (oml != null && (imageView = oml.isConnected) != null) {
                imageView.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ChartUIComponent chartUIComponent, Bitmap bitmap) {
        oML oml;
        ImageView imageView;
        if (bitmap != null && (oml = (oML) chartUIComponent.iwGUEr.KWHzl()) != null && (imageView = oml.isConnected) != null) {
            imageView.setVisibility(0);
            imageView.setImageBitmap(bitmap);
            if (ViewCompat.isLaidOut(imageView) && !imageView.isLayoutRequested()) {
                chartUIComponent.AYXKKw().AubY().copydefault().postValue(Boolean.TRUE);
            } else {
                imageView.addOnLayoutChangeListener(chartUIComponent.new PendingIntent());
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(ChartUIComponent chartUIComponent, ArrayList arrayList) {
        C36250oUv c36250oUv;
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv = oml.AuCTel) != null) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx();
            if (chartViewOutSideConfigAkhnZx != null) {
                chartViewOutSideConfigAkhnZx.setKlineEventList(arrayList);
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(chartUIComponent.copydefault), null, null, new ChartUIComponent$observeDataChange$42$1$1(chartUIComponent, arrayList, null), 3, null);
            c36250oUv.invalidate();
        }
        return Unit.INSTANCE;
    }

    private final void gHZMYf() {
        if (sSMYrx().getValue().copydefault()) {
            KlineChangeScreenVo klineChangeScreenVoKWHzl = sSMYrx().getValue().KWHzl();
            if (klineChangeScreenVoKWHzl != null) {
                C36348oYl c36348oYlZuBGHE = zuBGHE();
                oML oml = (oML) this.iwGUEr.KWHzl();
                c36348oYlZuBGHE.AEQbTJ(oml != null ? oml.AuCTel : null, klineChangeScreenVoKWHzl.getFirstCandleTime(), KlineTimeAnchorType.AnchorLeft, 150L, new Function0() { // from class: o.pni
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ChartUIComponent.fJNWhG(this.OLrzqt);
                    }
                }, new Function0() { // from class: o.plz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ChartUIComponent.ejfBZ(this.EZpvd);
                    }
                });
                return;
            }
            iwGUEr();
        }
    }

    public static final Unit fJNWhG(ChartUIComponent chartUIComponent) {
        if (!chartUIComponent.AhwBna) {
            chartUIComponent.AhwBna = true;
            chartUIComponent.iwGUEr();
        }
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(ChartUIComponent chartUIComponent) {
        chartUIComponent.iwGUEr();
        return Unit.INSTANCE;
    }

    public final void iwGUEr() {
        sSMYrx().getValue().EZpvd().setValue(Boolean.TRUE);
        sSMYrx().getValue().KWHzl(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        FrameLayout frameLayout;
        oML oml;
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onResume(lifecycleOwner);
        boolean z = false;
        if (this.copydefault.hDKMBd() != null) {
            MarketCoinInfo marketCoinInfoHDKMBd = this.copydefault.hDKMBd();
            if (Intrinsics.EZpvd((Object) (marketCoinInfoHDKMBd != null ? marketCoinInfoHDKMBd.getInstrumentType() : null), (Object) "INDEX")) {
                values();
            }
            if (!pFS.KWHzl.KWHzl(this.copydefault.OLrzqt().getParentFragment())) {
                if (Intrinsics.EZpvd(this.copydefault.AubY().KWHzl().getValue(), Boolean.FALSE)) {
                    ORxRYg();
                    DbNXlk();
                    this.EZpvd = false;
                }
            } else {
                InterfaceC39499ptW interfaceC39499ptWAEQbTJ = this.copydefault.AEQbTJ();
                if (interfaceC39499ptWAEQbTJ != null && Intrinsics.EZpvd(interfaceC39499ptWAEQbTJ.values(), Boolean.TRUE)) {
                    InterfaceC39499ptW interfaceC39499ptWAEQbTJ2 = this.copydefault.AEQbTJ();
                    if (interfaceC39499ptWAEQbTJ2 != null) {
                        interfaceC39499ptWAEQbTJ2.fARcdN();
                    }
                    uzCIH();
                } else if (!this.EZpvd || C36246oUr.copydefault().OBJEWx()) {
                    uzCIH();
                } else {
                    JsonObject jsonObjectZuBGHE = this.copydefault.zuBGHE();
                    if (jsonObjectZuBGHE != null && (stateListAnimatorUzCIH = this.copydefault.uzCIH()) != null) {
                        InterfaceC39563puh.StateListAnimator.TaskDescription.requestOriginData$default(stateListAnimatorUzCIH, this.copydefault.OLrzqt(), this.copydefault.gHZMYf(), jsonObjectZuBGHE, null, 8, null);
                    }
                }
            }
        }
        BizInstrument bizInstrumentAYXKKw = this.copydefault.AYXKKw();
        if (bizInstrumentAYXKKw != null && (oml = (oML) this.iwGUEr.KWHzl()) != null && (c36250oUv = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            if (pFP.OLrzqt.copydefault(bizInstrumentAYXKKw) && !fIwbmz()) {
                z = true;
            }
            chartViewOutSideConfigAkhnZx.setCanShowQuickOrder(z);
        }
        oML oml2 = (oML) this.iwGUEr.KWHzl();
        if (oml2 == null || (frameLayout = oml2.uzCIH) == null) {
            return;
        }
        AEQbTJ(frameLayout);
    }

    public final void uzCIH() {
        ejfBZ();
        copydefault();
        zsXlph();
        C36246oUr.copydefault().OLrzqt(false);
    }

    public final boolean fIwbmz() {
        androidx.fragment.app.Fragment parentFragment = this.copydefault.OLrzqt().getParentFragment();
        if (parentFragment != null) {
            return parentFragment instanceof ViewOnClickListenerC38981pjg;
        }
        return true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUv2;
        C36250oUv c36250oUv3;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onPause(lifecycleOwner);
        if (!this.copydefault.DbNXlk()) {
            pUU.copydefault("BaseKline------", "hasPause = " + this.copydefault.DbNXlk());
            oML oml = (oML) this.iwGUEr.KWHzl();
            if (oml != null && (c36250oUv3 = oml.AuCTel) != null) {
                c36250oUv3.QUSxYX();
            }
            oML oml2 = (oML) this.iwGUEr.KWHzl();
            if (oml2 != null && (c36250oUv2 = oml2.AuCTel) != null) {
                c36250oUv2.OLrzqt();
            }
        }
        oML oml3 = (oML) this.iwGUEr.KWHzl();
        if (oml3 != null && (c36250oUv = oml3.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setCanShowQuickOrder(false);
        }
        if (Intrinsics.EZpvd(this.copydefault.AubY().KWHzl().getValue(), Boolean.FALSE)) {
            C39285ppS c39285ppS = this.DbNXlk;
            if (c39285ppS != null) {
                c39285ppS.dismiss();
            }
            this.DbNXlk = null;
        }
        Job job = this.gEmmrt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onDestroy(lifecycleOwner);
        pUU.copydefault("BaseKline------", "onDestroy");
        if (!this.copydefault.DbNXlk()) {
            pUU.copydefault("BaseKline------", "hasPause = " + this.copydefault.DbNXlk());
            oML oml = (oML) this.iwGUEr.KWHzl();
            if (oml != null && (c36250oUv2 = oml.AuCTel) != null) {
                c36250oUv2.QUSxYX();
            }
            oML oml2 = (oML) this.iwGUEr.KWHzl();
            if (oml2 != null && (c36250oUv = oml2.AuCTel) != null) {
                c36250oUv.OLrzqt();
            }
        }
        AuCTel();
    }

    private final void zLjUOn() {
        oML oml;
        C36250oUv c36250oUv;
        HashMap<String, DataSource> mapEjfBZ;
        DataSource dataSource;
        if (!this.copydefault.QVAiDq() || (oml = (oML) this.iwGUEr.KWHzl()) == null || (c36250oUv = oml.AuCTel) == null || (mapEjfBZ = c36250oUv.ejfBZ()) == null || (dataSource = mapEjfBZ.get(c36250oUv.fIwbmz())) == null) {
            return;
        }
        dataSource.KWHzl();
    }

    public final void KWHzl(String str, String str2) {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        if (str == null || str2 == null) {
            return;
        }
        this.copydefault.KWHzl(str);
        this.copydefault.copydefault(str2);
        this.copydefault.copydefault(new MarketCoinInfo(str, str2, (String) null, (String) null, (String) null, 28, (DefaultConstructorMarker) null));
        if (pFS.KWHzl.KWHzl(this.copydefault.OLrzqt().getParentFragment())) {
            ejfBZ();
            copydefault();
            zsXlph();
        }
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = this.copydefault.uzCIH();
        if (stateListAnimatorUzCIH != null) {
            stateListAnimatorUzCIH.gEmmrt();
        }
        oML oml = (oML) this.iwGUEr.KWHzl();
        TemplateSetting templateSettingWlaJM = (oml == null || (c36250oUv2 = oml.AuCTel) == null) ? null : c36250oUv2.wlaJM();
        oML oml2 = (oML) this.iwGUEr.KWHzl();
        if (oml2 != null && (c36250oUv = oml2.AuCTel) != null) {
            MarketCoinInfo marketCoinInfoHDKMBd = this.copydefault.hDKMBd();
            String instrumentId = marketCoinInfoHDKMBd != null ? marketCoinInfoHDKMBd.getInstrumentId() : null;
            MarketCoinInfo marketCoinInfoHDKMBd2 = this.copydefault.hDKMBd();
            c36250oUv.setCurrentDataSource(instrumentId + (marketCoinInfoHDKMBd2 != null ? marketCoinInfoHDKMBd2.getInstrumentType() : null) + JwtUtilsKt.JWT_DELIMITER + (templateSettingWlaJM != null ? Integer.valueOf(templateSettingWlaJM.getSPTimeInterval()) : null));
        }
        MarketCoinInfo marketCoinInfoHDKMBd3 = this.copydefault.hDKMBd();
        Intrinsics.copydefault(marketCoinInfoHDKMBd3);
        EZpvd(marketCoinInfoHDKMBd3);
        LifecycleOwnerKt.getLifecycleScope(this.copydefault).launchWhenResumed(new ChartUIComponent$updateMarketCoin$1(this, null));
    }

    private final void EZpvd(MarketCoinInfo marketCoinInfo) {
        InterfaceC39502ptZ interfaceC39502ptZCopydefault;
        getNewProxyInstance();
        if (this.copydefault.copydefault() == null || (interfaceC39502ptZCopydefault = this.copydefault.copydefault()) == null) {
            return;
        }
        interfaceC39502ptZCopydefault.EZpvd(marketCoinInfo);
    }

    public final void values() {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        oML oml;
        C36250oUv c36250oUv3;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUv4;
        ArrayList<String> sideIndicatorNames;
        oML oml2;
        C39756pyO c39756pyO;
        C36250oUv c36250oUv5;
        C36250oUv c36250oUv6;
        C36250oUv c36250oUv7;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        C36250oUv c36250oUv8;
        if (this.copydefault.UeEOUB()) {
            oML oml3 = (oML) this.iwGUEr.KWHzl();
            TemplateSetting templateSettingWlaJM = (oml3 == null || (c36250oUv8 = oml3.AuCTel) == null) ? null : c36250oUv8.wlaJM();
            Intrinsics.copydefault(templateSettingWlaJM);
            this.ejfBZ = templateSettingWlaJM;
            if (!C36246oUr.copydefault().zLjUOn().isScreenChange()) {
                fetchVPNInfo();
            }
            oML oml4 = (oML) this.iwGUEr.KWHzl();
            if (oml4 != null && (c36250oUv7 = oml4.AuCTel) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv7.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setScreenChange(false);
            }
        }
        if (!this.copydefault.QVAiDq()) {
            if (Intrinsics.EZpvd((Object) this.copydefault.ejfBZ().gEmmrt(), (Object) "TYPE_KLINE")) {
                RJOkX();
                OLrzqt(this.copydefault.ORxRYg());
            } else {
                InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = this.copydefault.uzCIH();
                if (stateListAnimatorUzCIH != null) {
                    stateListAnimatorUzCIH.KWHzl(this.copydefault.ejfBZ().gEmmrt());
                }
                oML oml5 = (oML) this.iwGUEr.KWHzl();
                if (oml5 != null && (c36250oUv6 = oml5.AuCTel) != null) {
                    c36250oUv6.AwvSrB();
                }
                oML oml6 = (oML) this.iwGUEr.KWHzl();
                if (oml6 != null && (c36250oUv5 = oml6.AuCTel) != null) {
                    c36250oUv5.sSMYrx();
                }
                OLrzqt(Intrinsics.EZpvd((Object) this.copydefault.ejfBZ().gEmmrt(), (Object) "TYPE_INDEX_KLINE") ? this.copydefault.QKVWgx() : this.copydefault.OcIXYQ());
            }
            KlineQuoteDataComponent klineQuoteDataComponent = this.copydefault;
            klineQuoteDataComponent.fetchVPNInfo(klineQuoteDataComponent.ejfBZ().DbNXlk());
            KlineQuoteDataComponent klineQuoteDataComponent2 = this.copydefault;
            klineQuoteDataComponent2.djBIcL(klineQuoteDataComponent2.ejfBZ().AYXKKw());
        } else {
            MarketCoinInfo marketCoinInfoHDKMBd = this.copydefault.hDKMBd();
            Intrinsics.copydefault(marketCoinInfoHDKMBd);
            if (Intrinsics.EZpvd((Object) marketCoinInfoHDKMBd.getInstrumentType(), (Object) "OPTION")) {
                InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH2 = this.copydefault.uzCIH();
                if (stateListAnimatorUzCIH2 != null) {
                    stateListAnimatorUzCIH2.KWHzl("TYPE_MARK_PRICE_KLINE");
                }
                oML oml7 = (oML) this.iwGUEr.KWHzl();
                if (oml7 != null && (c36250oUv2 = oml7.AuCTel) != null) {
                    c36250oUv2.AwvSrB();
                }
                oML oml8 = (oML) this.iwGUEr.KWHzl();
                if (oml8 != null && (c36250oUv = oml8.AuCTel) != null) {
                    c36250oUv.sSMYrx();
                }
                this.copydefault.ejfBZ().OLrzqt("TYPE_MARK_PRICE_KLINE");
            } else {
                RJOkX();
                this.copydefault.ejfBZ().OLrzqt("TYPE_KLINE");
            }
        }
        TemplateSetting templateSetting = this.ejfBZ;
        if (templateSetting != null && (sideIndicatorNames = templateSetting.getSideIndicatorNames()) != null && (oml2 = (oML) this.iwGUEr.KWHzl()) != null && (c39756pyO = oml2.fIwbmz) != null) {
            c39756pyO.setSideIndicators(sideIndicatorNames);
        }
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH3 = this.copydefault.uzCIH();
        if (stateListAnimatorUzCIH3 != null) {
            stateListAnimatorUzCIH3.AEQbTJ(this.copydefault.OLrzqt());
        }
        oML oml9 = (oML) this.iwGUEr.KWHzl();
        if (oml9 != null && (c36250oUv4 = oml9.AuCTel) != null) {
            c36250oUv4.AEQbTJ();
        }
        BizInstrument bizInstrumentAYXKKw = this.copydefault.AYXKKw();
        if (bizInstrumentAYXKKw != null && (oml = (oML) this.iwGUEr.KWHzl()) != null && (c36250oUv3 = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv3.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setCanShowQuickOrder(pFP.OLrzqt.copydefault(bizInstrumentAYXKKw) && !fIwbmz());
        }
        if (!pFS.KWHzl.KWHzl(this.copydefault.OLrzqt().getParentFragment())) {
            fARcdN();
            TemplateSetting templateSetting2 = this.ejfBZ;
            if (templateSetting2 != null) {
                int sPTimeInterval = templateSetting2.getSPTimeInterval();
                this.copydefault.values().QVAiDq().setValue(Integer.valueOf(sPTimeInterval));
                MutableLiveData<List<String>> mutableLiveDataRJOkX = this.copydefault.values().RJOkX();
                TemplateSetting templateSetting3 = this.ejfBZ;
                mutableLiveDataRJOkX.setValue(templateSetting3 != null ? templateSetting3.getSideIndicatorNames() : null);
                if (sPTimeInterval == -2) {
                    copydefault(true);
                } else {
                    KWHzl(false);
                }
                wlaJM();
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.copydefault), null, null, new ChartUIComponent$initData$3$1(this, sPTimeInterval, null), 3, null);
            }
        }
        if (QKVWgx()) {
            this.gEmmrt = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.copydefault), null, null, new ChartUIComponent$initData$4(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AwvSrB() {
        MutableLiveData<Boolean> mutableLiveDataFinit = this.copydefault.values().finit();
        Boolean bool = Boolean.TRUE;
        mutableLiveDataFinit.setValue(bool);
        if (Intrinsics.EZpvd(this.copydefault.values().fZBcTu().getValue(), bool)) {
            pUU.KWHzl("KlinePageInit", "loadKline success, dismiss loading");
            this.copydefault.values().EZpvd(false);
        }
    }

    public final void EZpvd(final int i) {
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = this.copydefault.uzCIH();
        if (stateListAnimatorUzCIH != null) {
            InterfaceC39563puh.StateListAnimator.TaskDescription.loadKline$default(stateListAnimatorUzCIH, this.copydefault.OLrzqt(), i, i != -2, false, new Function1() { // from class: o.pnj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ChartUIComponent.EZpvd(i, this, ((java.lang.Boolean) obj).booleanValue());
                }
            }, 8, null);
        }
    }

    public static final Unit EZpvd(int i, ChartUIComponent chartUIComponent, boolean z) {
        if (z && i != -2) {
            KlineQuoteDataComponent klineQuoteDataComponent = chartUIComponent.copydefault;
            MarketCoinInfo marketCoinInfoHDKMBd = klineQuoteDataComponent.hDKMBd();
            Intrinsics.copydefault(marketCoinInfoHDKMBd);
            klineQuoteDataComponent.EZpvd(marketCoinInfoHDKMBd.getInstrumentId());
        }
        chartUIComponent.AwvSrB();
        return Unit.INSTANCE;
    }

    private final boolean QKVWgx() {
        return pFS.KWHzl.EZpvd() && SPUtils.getBoolean("kline_flash_news_on", true) && !fIwbmz() && ((InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class)).copydefault().AEQbTJ();
    }

    public final void fARcdN() {
        C36250oUv c36250oUv;
        C39816pzV c39816pzV;
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml == null || (c36250oUv = oml.AuCTel) == null || !this.copydefault.QUSxYX() || c36250oUv.wlaJM().getSPTimeInterval() != -2) {
            return;
        }
        TemplateSetting templateSetting = this.ejfBZ;
        if (templateSetting != null) {
            templateSetting.putTimeInterval(1440);
        }
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx();
        if (chartViewOutSideConfigAkhnZx != null) {
            chartViewOutSideConfigAkhnZx.setCeFiMCapMode(false);
        }
        c36250oUv.setChartStyle(0);
        oML oml2 = (oML) this.iwGUEr.KWHzl();
        if (oml2 == null || (c39816pzV = oml2.getFieldNames) == null) {
            return;
        }
        c39816pzV.setData();
    }

    private final void copydefault(C36250oUv c36250oUv) {
        oML oml;
        C36250oUv c36250oUv2;
        if (this.copydefault.ejfBZ().AEQbTJ() > 0 && (oml = (oML) this.iwGUEr.KWHzl()) != null && (c36250oUv2 = oml.AuCTel) != null) {
            c36250oUv2.setMinimumHeight(this.copydefault.ejfBZ().AEQbTJ());
        }
        pEX pex = pEX.OLrzqt;
        ChartViewOutSideConfig chartViewOutSideConfig = new ChartViewOutSideConfig(false, false, false, false, false, false, false, null, null, null, pex.OLrzqt(), pex.AEQbTJ(), false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, false, null, false, false, false, false, null, false, false, null, false, false, false, false, -3073, -1, -1, Integer.MAX_VALUE, null);
        chartViewOutSideConfig.setEconomicDefaultStatus(C36236oUh.EZpvd.iwGUEr());
        pFP pfp = pFP.OLrzqt;
        chartViewOutSideConfig.setSimulateLine(pFP.isUserInDemoTrading$default(pfp, null, 1, null));
        chartViewOutSideConfig.setChartTag("sp_timeinterval_okx_pro");
        chartViewOutSideConfig.setMode("pro_mode");
        chartViewOutSideConfig.setOrderSupportClick(true);
        chartViewOutSideConfig.setSpotCostSupportClick(true);
        chartViewOutSideConfig.setScreen(!this.copydefault.QUSxYX());
        chartViewOutSideConfig.setCurrentMode("NORMAL");
        chartViewOutSideConfig.setAutoYScaleClick(false);
        chartViewOutSideConfig.setHideTradeDrawingLine(false);
        chartViewOutSideConfig.setPortraitChart(true);
        chartViewOutSideConfig.setScreenChange(sSMYrx().getValue().copydefault());
        chartViewOutSideConfig.setFastKLineMode(C36246oUr.copydefault().zLjUOn().isFastKLineMode());
        chartViewOutSideConfig.setUtc8(pfp.AEQbTJ());
        chartViewOutSideConfig.setMPriceFractionDigits(C36246oUr.copydefault().gkJEwt());
        c36250oUv.QOLQEE();
        AxsJAY();
        c36250oUv.OLrzqt(chartViewOutSideConfig);
        KWHzl(c36250oUv);
        c36250oUv.setIsSupportDoubleClick(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void KWHzl(C36250oUv c36250oUv) {
        boolean z;
        InterfaceC39502ptZ interfaceC39502ptZCopydefault;
        InterfaceC39502ptZ interfaceC39502ptZCopydefault2;
        InterfaceC39502ptZ interfaceC39502ptZCopydefault3;
        InterfaceC39502ptZ interfaceC39502ptZCopydefault4;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        TradeCoinInfo tradeCoinInfoAhwBna;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        xOW newProxyInstance;
        ValuationCurrencyData valuationCurrencyDataAEQbTJ;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx();
        Context context = this.copydefault.OLrzqt().getContext();
        int iAhwBna = 2;
        Integer numValueOf = context != null ? Integer.valueOf(C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null)) : null;
        Intrinsics.copydefault(numValueOf);
        chartViewOutSideConfigAkhnZx.setMPositiveColor(numValueOf.intValue());
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2 = c36250oUv.AkhnZx();
        Context context2 = this.copydefault.OLrzqt().getContext();
        Integer numValueOf2 = context2 != null ? Integer.valueOf(C33512mxp.tradeFallGraph$default(C33512mxp.AEQbTJ, context2, 0.0f, 2, null)) : null;
        Intrinsics.copydefault(numValueOf2);
        chartViewOutSideConfigAkhnZx2.setMNegativeColor(numValueOf2.intValue());
        c36250oUv.AkhnZx().setMChartOffsetInit(false);
        Integer num = SPUtils.getInt("chart_coordinate_model", 0);
        if (num != null && num.intValue() == 0) {
            c36250oUv.AkhnZx().setMOrdinateType(0);
        } else {
            c36250oUv.AkhnZx().setMOrdinateType(1);
        }
        Integer num2 = SPUtils.getInt("kline_abstract_type", 1);
        if (num2 != null && num2.intValue() == 1) {
            c36250oUv.AkhnZx().setMKlineAbstractType(1);
        } else {
            c36250oUv.AkhnZx().setMKlineAbstractType(0);
        }
        c36250oUv.AkhnZx().setMShowAxis(SPUtils.getBoolean("chart_axis", true));
        c36250oUv.AkhnZx().setMCandlestickType(SPUtils.getInt("chart_model", 0).intValue());
        c36250oUv.AkhnZx().setMChartPosition(SPUtils.getInt("chart_position", 1).intValue());
        MarketCoinInfo marketCoinInfoHDKMBd = this.copydefault.hDKMBd();
        if (Intrinsics.EZpvd((Object) "INDEX", (Object) (marketCoinInfoHDKMBd != null ? marketCoinInfoHDKMBd.getInstrumentType() : null))) {
            MarketCoinInfo marketCoinInfoHDKMBd2 = this.copydefault.hDKMBd();
            String strAEQbTJ = o.TaskDescription.AEQbTJ(marketCoinInfoHDKMBd2 != null ? marketCoinInfoHDKMBd2.getInstrumentId() : null).AEQbTJ();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String upperCase = strAEQbTJ.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            int iHashCode = upperCase.hashCode();
            if (iHashCode == 66097) {
                if (upperCase.equals("BTC")) {
                }
                c36250oUv.setPriceFractionDigits(iAhwBna);
            } else {
                if (iHashCode != 84326) {
                    if (iHashCode == 2614190 && upperCase.equals("USDT")) {
                        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                        iAhwBna = C33129mqd.AhwBna((interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(upperCase)) == null) ? null : tradeCoinInfoAhwBna.getSizeDig());
                    }
                } else if (upperCase.equals("USD")) {
                    InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                    iAhwBna = C33129mqd.AhwBna((interfaceC49425uoM2 == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn2.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null || (valuationCurrencyDataAEQbTJ = newProxyInstance.AEQbTJ("USD")) == null) ? null : valuationCurrencyDataAEQbTJ.getPrecision());
                }
                c36250oUv.setPriceFractionDigits(iAhwBna);
            }
        } else {
            AbstractC54531xLw value = this.copydefault.values().fIwbmz().getValue();
            if (value != null) {
                MarketCoinInfo marketCoinInfoHDKMBd3 = this.copydefault.hDKMBd();
                String instrumentId = marketCoinInfoHDKMBd3 != null ? marketCoinInfoHDKMBd3.getInstrumentId() : null;
                Intrinsics.copydefault((Object) instrumentId);
                BizInstrument bizInstrumentValueOf = value.valueOf(instrumentId);
                if (bizInstrumentValueOf != null) {
                    c36250oUv.setPriceFractionDigits(C33129mqd.AhwBna(value.fIwbmz(bizInstrumentValueOf.getInstFamily())));
                    c36250oUv.setCoinVol(C33129mqd.AhwBna(value.gEmmrt(bizInstrumentValueOf)));
                }
            }
        }
        MarketCoinInfo marketCoinInfoHDKMBd4 = this.copydefault.hDKMBd();
        if (Intrinsics.EZpvd((Object) (marketCoinInfoHDKMBd4 != null ? marketCoinInfoHDKMBd4.getInstrumentType() : null), (Object) "FUTURES")) {
            z = true;
        } else {
            MarketCoinInfo marketCoinInfoHDKMBd5 = this.copydefault.hDKMBd();
            if (!Intrinsics.EZpvd((Object) (marketCoinInfoHDKMBd5 != null ? marketCoinInfoHDKMBd5.getInstrumentType() : null), (Object) "SWAP")) {
                MarketCoinInfo marketCoinInfoHDKMBd6 = this.copydefault.hDKMBd();
                if (!Intrinsics.EZpvd((Object) (marketCoinInfoHDKMBd6 != null ? marketCoinInfoHDKMBd6.getInstrumentType() : null), (Object) "OPTION")) {
                    z = false;
                }
            }
        }
        c36250oUv.setFutures(z);
        TemplateSetting templateSettingWlaJM = c36250oUv.wlaJM();
        Intrinsics.checkNotNullExpressionValue(templateSettingWlaJM, "");
        MarketCoinInfo marketCoinInfoHDKMBd7 = this.copydefault.hDKMBd();
        String instrumentId2 = marketCoinInfoHDKMBd7 != null ? marketCoinInfoHDKMBd7.getInstrumentId() : null;
        MarketCoinInfo marketCoinInfoHDKMBd8 = this.copydefault.hDKMBd();
        String instrumentType = marketCoinInfoHDKMBd8 != null ? marketCoinInfoHDKMBd8.getInstrumentType() : null;
        c36250oUv.setCurrentDataSource(instrumentId2 + instrumentType + JwtUtilsKt.JWT_DELIMITER + templateSettingWlaJM.getSPTimeInterval());
        if (Intrinsics.EZpvd((Object) "kline_follow_app", (Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            if (C33492mxV.OLrzqt()) {
                if (this.copydefault.copydefault() != null && (interfaceC39502ptZCopydefault4 = this.copydefault.copydefault()) != null) {
                    interfaceC39502ptZCopydefault4.AkhnZx(true);
                }
                c36250oUv.djBIcL("dark");
            } else {
                if (this.copydefault.copydefault() != null && (interfaceC39502ptZCopydefault3 = this.copydefault.copydefault()) != null) {
                    interfaceC39502ptZCopydefault3.AkhnZx(false);
                }
                c36250oUv.djBIcL("light");
            }
        } else if (Intrinsics.EZpvd((Object) "kline_dark", (Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            if (this.copydefault.copydefault() != null && (interfaceC39502ptZCopydefault2 = this.copydefault.copydefault()) != null) {
                interfaceC39502ptZCopydefault2.AkhnZx(true);
            }
            c36250oUv.djBIcL("dark");
        } else {
            if (this.copydefault.copydefault() != null && (interfaceC39502ptZCopydefault = this.copydefault.copydefault()) != null) {
                interfaceC39502ptZCopydefault.AkhnZx(false);
            }
            c36250oUv.djBIcL("light");
        }
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3 = c36250oUv.AkhnZx();
        pUU.KWHzl("ChartView", "chartView.theme = " + (chartViewOutSideConfigAkhnZx3 != null ? chartViewOutSideConfigAkhnZx3.getThemes() : null));
        c36250oUv.AkhnZx().setMShowVolume(templateSettingWlaJM.hasVolumeIndicator());
        MarketCoinInfo marketCoinInfoHDKMBd9 = this.copydefault.hDKMBd();
        if (Intrinsics.EZpvd((Object) (marketCoinInfoHDKMBd9 != null ? marketCoinInfoHDKMBd9.getInstrumentType() : null), (Object) "INDEX")) {
            c36250oUv.AwvSrB();
        } else if (c36250oUv.AkhnZx().getMShowVolume()) {
            c36250oUv.fZBcTu();
        }
        AEQbTJ(c36250oUv);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull C36250oUv c36250oUv) {
        boolean z;
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        if (Intrinsics.EZpvd(this.copydefault.AubY().KWHzl().getValue(), Boolean.FALSE)) {
            MarketCoinInfo marketCoinInfoHDKMBd = this.copydefault.hDKMBd();
            if (Intrinsics.EZpvd((Object) (marketCoinInfoHDKMBd != null ? marketCoinInfoHDKMBd.getInstrumentType() : null), (Object) "FUTURES")) {
                z = true;
            } else {
                MarketCoinInfo marketCoinInfoHDKMBd2 = this.copydefault.hDKMBd();
                if (!Intrinsics.EZpvd((Object) (marketCoinInfoHDKMBd2 != null ? marketCoinInfoHDKMBd2.getInstrumentType() : null), (Object) "SWAP")) {
                    z = false;
                }
            }
            c36250oUv.setFuturesWithOutOption(z);
            KWHzl(c36250oUv);
        }
    }

    public static final class Activity implements ViewTreeObserver.OnGlobalLayoutListener {
        public Activity() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C36250oUv c36250oUv;
            C36250oUv c36250oUv2;
            TemplateSetting templateSettingWlaJM;
            ArrayList<String> sideIndicatorNames;
            C36250oUv c36250oUv3;
            ViewTreeObserver viewTreeObserver;
            oML oml = (oML) ChartUIComponent.this.isConnected().KWHzl();
            if (oml != null && (c36250oUv3 = oml.AuCTel) != null && (viewTreeObserver = c36250oUv3.getViewTreeObserver()) != null) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            oML oml2 = (oML) ChartUIComponent.this.isConnected().KWHzl();
            ChartUIComponent.this.AYXKKw().AEQbTJ(C36246oUr.copydefault().RlQdEF() + (C36246oUr.copydefault().accept() * ((oml2 == null || (c36250oUv2 = oml2.AuCTel) == null || (templateSettingWlaJM = c36250oUv2.wlaJM()) == null || (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) == null) ? 0 : sideIndicatorNames.size())));
            int iIwGUEr = (int) (ChartUIComponent.this.AYXKKw().iwGUEr() * ((((SPUtils.getInt("chart_height", 25).intValue() - 50) * 1.0f) / 200.0f) + 1.0f));
            oML oml3 = (oML) ChartUIComponent.this.isConnected().KWHzl();
            if (oml3 == null || (c36250oUv = oml3.AuCTel) == null) {
                return;
            }
            c36250oUv.setMinimumHeight(iIwGUEr);
        }
    }

    private final void AxsJAY() {
        C36250oUv c36250oUv;
        ViewTreeObserver viewTreeObserver;
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml == null || (c36250oUv = oml.AuCTel) == null || (viewTreeObserver = c36250oUv.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new Activity());
    }

    private final void ORxRYg() {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        if (Intrinsics.EZpvd(this.copydefault.AubY().KWHzl().getValue(), Boolean.FALSE)) {
            C36312oXc c36312oXc = this.fARcdN;
            if (c36312oXc != null) {
                if ((c36312oXc != null ? c36312oXc.zLjUOn : null) != null) {
                    if ((c36312oXc != null ? c36312oXc.zLjUOn : null) != null && c36312oXc != null) {
                        c36312oXc.EZpvd(c36312oXc != null ? c36312oXc.zLjUOn : null);
                    }
                }
            }
            oML oml = (oML) this.iwGUEr.KWHzl();
            if (oml == null || (c36250oUv = oml.AuCTel) == null) {
                return;
            }
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3 = c36250oUv.AkhnZx();
            if (chartViewOutSideConfigAkhnZx3 != null) {
                chartViewOutSideConfigAkhnZx3.setCurrentMode("NORMAL");
            }
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx4 = c36250oUv.AkhnZx();
            if (chartViewOutSideConfigAkhnZx4 != null) {
                chartViewOutSideConfigAkhnZx4.setAutoYScaleClick(false);
            }
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx5 = c36250oUv.AkhnZx();
            if ((chartViewOutSideConfigAkhnZx5 == null || chartViewOutSideConfigAkhnZx5.getChartMode() != 2) && (((chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) == null || !chartViewOutSideConfigAkhnZx.isFromFormula()) && ((chartViewOutSideConfigAkhnZx2 = c36250oUv.AkhnZx()) == null || !chartViewOutSideConfigAkhnZx2.isFromCompare()))) {
                return;
            }
            getFieldNames();
            copydefault(c36250oUv);
        }
    }

    public final void getFieldNames() {
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        oML oml;
        C39756pyO c39756pyO;
        C39756pyO c39756pyO2;
        oML oml2 = (oML) this.iwGUEr.KWHzl();
        if (oml2 == null || (c36250oUv = oml2.AuCTel) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) {
            return;
        }
        oML oml3 = (oML) this.iwGUEr.KWHzl();
        if (oml3 != null && (c39756pyO2 = oml3.fIwbmz) != null) {
            c39756pyO2.setMainIndicatorSelect();
        }
        ArrayList<String> sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames();
        if (sideIndicatorNames == null || (oml = (oML) this.iwGUEr.KWHzl()) == null || (c39756pyO = oml.fIwbmz) == null) {
            return;
        }
        c39756pyO.setSideIndicators(sideIndicatorNames);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DbNXlk() {
        FrameLayout frameLayout;
        C36250oUv c36250oUv;
        C39756pyO c39756pyO;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        C36327oXr tradingView;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        TradingViewManager.StateListAnimator stateListAnimator;
        C32979mnm c32979mnm;
        C36250oUv c36250oUv2;
        C39756pyO c39756pyO2;
        ImageView imageView;
        ConstraintLayout constraintLayout3;
        ConstraintLayout constraintLayout4;
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml == null || (frameLayout = oml.uzCIH) == null) {
            return;
        }
        if (pFS.KWHzl.KWHzl(this.copydefault.OLrzqt().getParentFragment())) {
            oML oml2 = (oML) this.iwGUEr.KWHzl();
            if (oml2 != null && (constraintLayout4 = oml2.sSMYrx) != null) {
                constraintLayout4.setVisibility(8);
            }
            oML oml3 = (oML) this.iwGUEr.KWHzl();
            if (oml3 != null && (constraintLayout3 = oml3.fARcdN) != null) {
                constraintLayout3.setVisibility(0);
            }
            oML oml4 = (oML) this.iwGUEr.KWHzl();
            if (oml4 != null && (imageView = oml4.copydefault) != null) {
                imageView.setVisibility((this.copydefault.wlaJM() && this.copydefault.AuCTelauCTel()) ? 0 : 8);
            }
            oML oml5 = (oML) this.iwGUEr.KWHzl();
            if (oml5 != null && (c39756pyO2 = oml5.fIwbmz) != null) {
                c39756pyO2.setVisibility(8);
            }
            this.copydefault.values().dvKsVJ();
            this.fJNWhG = new Fragment();
            frameLayout.setVisibility(0);
            AEQbTJ(frameLayout);
            oML oml6 = (oML) this.iwGUEr.KWHzl();
            if (oml6 != null && (c36250oUv2 = oml6.AuCTel) != null) {
                c36250oUv2.setVisibility(8);
            }
            try {
                stateListAnimator = TradingViewManager.Companion;
                c32979mnm = C32979mnm.EZpvd;
            } catch (Exception e) {
                pUU.copydefault("ChartUIComponent", "Failed to create TradingView: " + e);
            }
            if (stateListAnimator.OLrzqt(c32979mnm.OLrzqt())) {
                TradingViewManager tradingViewManagerCopydefault = stateListAnimator.copydefault(c32979mnm.OLrzqt());
                WebChromeClient webChromeClient = this.fJNWhG;
                Intrinsics.copydefault(webChromeClient);
                tradingView = tradingViewManagerCopydefault.getTradingView(webChromeClient);
                this.AuCTel = tradingView;
                if (tradingView != null) {
                    copydefault("TradingView is null in initTradingView, finishing activity");
                    return;
                }
                String strAEQbTJ = C48872udq.AEQbTJ.AEQbTJ("file_market_tradingview_js");
                if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
                    oML oml7 = (oML) this.iwGUEr.KWHzl();
                    if (oml7 != null && (linearLayout2 = oml7.ejfBZ) != null) {
                        linearLayout2.setVisibility(0);
                    }
                    oML oml8 = (oML) this.iwGUEr.KWHzl();
                    if (oml8 != null && (linearLayout = oml8.DbNXlk) != null) {
                        linearLayout.setVisibility(8);
                    }
                }
                InterfaceC36254oUz interfaceC36254oUz = this.AuCTel;
                if (interfaceC36254oUz != null) {
                    interfaceC36254oUz.setInitUrlListener(new FragmentManager(strAEQbTJ));
                }
                InterfaceC36254oUz interfaceC36254oUz2 = this.AuCTel;
                if (interfaceC36254oUz2 != null) {
                    interfaceC36254oUz2.AxsJAY();
                    return;
                }
                return;
            }
            pUU.copydefault("ChartUIComponent", "Cannot create TradingView in non-main process");
            tradingView = null;
            this.AuCTel = tradingView;
            if (tradingView != null) {
            }
        } else {
            frameLayout.setVisibility(8);
            oML oml9 = (oML) this.iwGUEr.KWHzl();
            if (oml9 != null && (constraintLayout2 = oml9.sSMYrx) != null) {
                constraintLayout2.setVisibility(0);
            }
            oML oml10 = (oML) this.iwGUEr.KWHzl();
            if (oml10 != null && (constraintLayout = oml10.fARcdN) != null) {
                constraintLayout.setVisibility(8);
            }
            this.copydefault.values().iRxXKY();
            oML oml11 = (oML) this.iwGUEr.KWHzl();
            if (oml11 != null && (c39756pyO = oml11.fIwbmz) != null) {
                c39756pyO.setVisibility(0);
            }
            oML oml12 = (oML) this.iwGUEr.KWHzl();
            if (oml12 == null || (c36250oUv = oml12.AuCTel) == null) {
                return;
            }
            c36250oUv.setVisibility(0);
        }
    }

    public static final class Fragment extends WebChromeClient {
        public Fragment() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Intrinsics.checkNotNullParameter(consoleMessage, "");
            consoleMessage.message();
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                pUU.KWHzl("KlinePageInit", "initTradingView success, dismiss loading");
                ChartUIComponent.this.AYXKKw().values().EZpvd(false);
            }
            super.onProgressChanged(webView, i);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            C36250oUv c36250oUv;
            TemplateSetting templateSettingWlaJM;
            C36250oUv c36250oUv2;
            TemplateSetting templateSettingWlaJM2;
            InterfaceC39499ptW interfaceC39499ptWAEQbTJ;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(jsPromptResult, "");
            if (!ChartUIComponent.this.AYXKKw().OLrzqt().isAdded()) {
                pUU.KWHzl("TradingView", "onJsPrompt: dataComponent.fragment.isAdded = false");
                return true;
            }
            Object objFromJson = new Gson().fromJson(str2, (Class<Object>) JsonObject.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "");
            JsonObject jsonObject = (JsonObject) objFromJson;
            pUU.KWHzl("TradingView", "on server    url=" + str + " message= " + jsonObject + " defaultValue =" + str3 + "  result=" + jsPromptResult);
            int asInt = jsonObject.get("type").getAsInt();
            if (asInt == 0) {
                Context context = ChartUIComponent.this.AYXKKw().OLrzqt().getContext();
                if (context != null) {
                    ChartUIComponent chartUIComponent = ChartUIComponent.this;
                    InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = chartUIComponent.AYXKKw().uzCIH();
                    if (stateListAnimatorUzCIH != null) {
                        oML oml = (oML) chartUIComponent.isConnected().KWHzl();
                        stateListAnimatorUzCIH.EZpvd((oml == null || (c36250oUv = oml.AuCTel) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) ? 15 : templateSettingWlaJM.getSPTimeInterval(), context);
                    }
                }
            } else if (asInt == 1) {
                ChartUIComponent.this.AYXKKw().AEQbTJ(jsonObject.get("path").getAsString());
                ChartUIComponent.this.AYXKKw().EZpvd(jsonObject.get(MetricsSQLiteCacheKt.METRICS_PARAMS).getAsJsonObject());
                JsonObject jsonObjectZuBGHE = ChartUIComponent.this.AYXKKw().zuBGHE();
                if (jsonObjectZuBGHE != null) {
                    final ChartUIComponent chartUIComponent2 = ChartUIComponent.this;
                    JsonElement jsonElement = jsonObjectZuBGHE.get("firstDataRequest");
                    if (jsonElement == null || jsonElement.getAsBoolean()) {
                        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH2 = chartUIComponent2.AYXKKw().uzCIH();
                        if (stateListAnimatorUzCIH2 != null) {
                            stateListAnimatorUzCIH2.copydefault(chartUIComponent2.AYXKKw().OLrzqt(), chartUIComponent2.AYXKKw().gHZMYf(), jsonObjectZuBGHE, new Function2() { // from class: o.pnp
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return ChartUIComponent.Fragment.EZpvd(chartUIComponent2, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
                                }
                            });
                        }
                    } else {
                        oML oml2 = (oML) chartUIComponent2.isConnected().KWHzl();
                        if (oml2 != null && (c36250oUv2 = oml2.AuCTel) != null && (templateSettingWlaJM2 = c36250oUv2.wlaJM()) != null) {
                            int sPTimeInterval = templateSettingWlaJM2.getSPTimeInterval();
                            InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH3 = chartUIComponent2.AYXKKw().uzCIH();
                            if (stateListAnimatorUzCIH3 != null) {
                                stateListAnimatorUzCIH3.copydefault((LifecycleOwner) chartUIComponent2.AYXKKw().OLrzqt(), pEF.OLrzqt.OLrzqt(sPTimeInterval), chartUIComponent2.values, oLT.djBIcL(), true, new Function1() { // from class: o.pno
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return ChartUIComponent.Fragment.OLrzqt(chartUIComponent2, (java.lang.String) obj);
                                    }
                                });
                            }
                        }
                    }
                }
            } else if (asInt == 2) {
                if (ChartUIComponent.this.AYXKKw().AEQbTJ() != null && (interfaceC39499ptWAEQbTJ = ChartUIComponent.this.AYXKKw().AEQbTJ()) != null) {
                    interfaceC39499ptWAEQbTJ.OLrzqt(true);
                }
                ChartUIComponent.this.AYXKKw().KWHzl(true);
                ChartUIComponent.this.AYXKKw().gEmmrt(!ChartUIComponent.this.AYXKKw().RcXXUw());
            }
            jsPromptResult.confirm();
            return true;
        }

        public static final Unit EZpvd(ChartUIComponent chartUIComponent, boolean z, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            chartUIComponent.values = str;
            if (z) {
                chartUIComponent.AYXKKw().AkhnZx().EZpvd(C33129mqd.divS$default(Long.valueOf(System.currentTimeMillis()), 1000, null, null, null, 14, null));
                pEH.copydefault.EZpvd(chartUIComponent.AYXKKw().AkhnZx().OLrzqt(), true);
            }
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(ChartUIComponent chartUIComponent, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            chartUIComponent.values = str;
            return Unit.INSTANCE;
        }
    }

    public static final class FragmentManager implements C36327oXr.StateListAnimator {
        public final /* synthetic */ String AEQbTJ;

        public FragmentManager(String str) {
            this.AEQbTJ = str;
        }

        @Override // o.C36327oXr.StateListAnimator
        public String KWHzl() {
            return this.AEQbTJ + "/OKTradingView/index.html";
        }
    }

    public final void AEQbTJ(FrameLayout frameLayout) {
        if (Intrinsics.EZpvd((Object) "kline_follow_app", (Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            if (C33492mxV.OLrzqt()) {
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(this.copydefault.QOLQEE());
                    return;
                }
                return;
            } else {
                if (C33492mxV.EZpvd() != 1 || frameLayout == null) {
                    return;
                }
                frameLayout.setBackgroundColor(this.copydefault.DTwDnp());
                return;
            }
        }
        if (Intrinsics.EZpvd((Object) "kline_dark", (Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(this.copydefault.QOLQEE());
            }
        } else if (frameLayout != null) {
            frameLayout.setBackgroundColor(this.copydefault.DTwDnp());
        }
    }

    public final void ejfBZ() {
        FrameLayout frameLayout;
        try {
            C36344oYh c36344oYh = this.fIwbmz;
            if (c36344oYh != null) {
                if (c36344oYh != null) {
                    c36344oYh.OLrzqt();
                }
                this.fIwbmz = null;
            }
        } catch (Exception e) {
            Log.getStackTraceString(e);
        }
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml == null || (frameLayout = oml.uzCIH) == null) {
            return;
        }
        InterfaceC36254oUz interfaceC36254oUz = this.AuCTel;
        frameLayout.removeView(interfaceC36254oUz != null ? interfaceC36254oUz.zsXlph() : null);
    }

    public final void copydefault() {
        TradingViewManager tradingViewManagerOLrzqt = TradingViewManager.Companion.OLrzqt();
        if (tradingViewManagerOLrzqt != null) {
            tradingViewManagerOLrzqt.removeTradingView();
        }
    }

    public final void zsXlph() {
        this.copydefault.zLjUOn().postDelayed(new Runnable() { // from class: o.pmU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ChartUIComponent.getNewProxyInstance(this.AEQbTJ);
            }
        }, 50L);
        DbNXlk();
    }

    public static final void getNewProxyInstance(ChartUIComponent chartUIComponent) {
        if (chartUIComponent.fIwbmz == null) {
            Context context = chartUIComponent.copydefault.OLrzqt().getContext();
            C36344oYh c36344oYh = context != null ? new C36344oYh(context, chartUIComponent.new ComponentCallbacks()) : null;
            chartUIComponent.fIwbmz = c36344oYh;
            if (c36344oYh != null) {
                c36344oYh.EZpvd();
            }
        }
    }

    public static final class ComponentCallbacks implements InterfaceC36340oYd {
        public ComponentCallbacks() {
        }

        @Override // o.InterfaceC36340oYd
        public void KWHzl(String str) {
            if (ChartUIComponent.this.AYXKKw().OLrzqt().isAdded()) {
                oML oml = (oML) ChartUIComponent.this.isConnected().KWHzl();
                C36327oXr tradingView = null;
                FrameLayout frameLayout = oml != null ? oml.uzCIH : null;
                if (frameLayout == null || ChartUIComponent.this.fJNWhG == null) {
                    return;
                }
                Context contextRequireContext = ChartUIComponent.this.AYXKKw().OLrzqt().requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ChartUIComponent chartUIComponent = ChartUIComponent.this;
                try {
                    TradingViewManager.StateListAnimator stateListAnimator = TradingViewManager.Companion;
                    if (stateListAnimator.OLrzqt(contextRequireContext)) {
                        TradingViewManager tradingViewManagerCopydefault = stateListAnimator.copydefault(contextRequireContext);
                        WebChromeClient webChromeClient = ChartUIComponent.this.fJNWhG;
                        Intrinsics.copydefault(webChromeClient);
                        tradingView = tradingViewManagerCopydefault.getTradingView(webChromeClient);
                    } else {
                        pUU.copydefault("ChartUIComponent", "Cannot create TradingView in non-main process");
                    }
                } catch (Exception e) {
                    pUU.copydefault("ChartUIComponent", "Failed to create TradingView: " + e);
                }
                chartUIComponent.copydefault((InterfaceC36254oUz) tradingView);
                frameLayout.removeAllViews();
                if (ChartUIComponent.this.AhwBna() != null) {
                    InterfaceC36254oUz interfaceC36254oUzAhwBna = ChartUIComponent.this.AhwBna();
                    Intrinsics.copydefault(interfaceC36254oUzAhwBna, "");
                    if (((C36327oXr) interfaceC36254oUzAhwBna).getParent() != null) {
                        InterfaceC36254oUz interfaceC36254oUzAhwBna2 = ChartUIComponent.this.AhwBna();
                        Intrinsics.copydefault(interfaceC36254oUzAhwBna2, "");
                        ViewParent parent = ((C36327oXr) interfaceC36254oUzAhwBna2).getParent();
                        Intrinsics.copydefault(parent, "");
                        ((ViewGroup) parent).removeView((C36327oXr) ChartUIComponent.this.AhwBna());
                    }
                }
                if (ChartUIComponent.this.AhwBna() == null) {
                    ChartUIComponent.this.copydefault("Cannot add null TradingView to layout, finishing activity");
                } else {
                    frameLayout.addView((C36327oXr) ChartUIComponent.this.AhwBna());
                }
            }
        }
    }

    public final void AEQbTJ(@NotNull C36250oUv c36250oUv) {
        oWN own;
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        TemplateSetting templateSettingWlaJM = c36250oUv.wlaJM();
        Intrinsics.checkNotNullExpressionValue(templateSettingWlaJM, "");
        if (templateSettingWlaJM.getSPTimeInterval() < 0) {
            c36250oUv.setChartStyle(1);
            return;
        }
        int timelineScale = templateSettingWlaJM.getTimelineScale();
        int i = oWN.AEQbTJ;
        if (timelineScale < i) {
            if (c36250oUv.AkhnZx().isColumnChart()) {
                HashMap<String, oWN> mapZLjUOn = c36250oUv.zLjUOn();
                if (mapZLjUOn != null && (own = mapZLjUOn.get("ds0")) != null) {
                    own.OLrzqt(i);
                }
                c36250oUv.setChartStyle(0);
                return;
            }
            c36250oUv.setChartStyle(2);
            return;
        }
        c36250oUv.setChartStyle(0);
    }

    public final void fetchVPNInfo() {
        C55254xgV c55254xgV;
        C36250oUv c36250oUv;
        C55254xgV c55254xgV2;
        InterfaceC39502ptZ interfaceC39502ptZCopydefault;
        C38685peB c38685peBValueOf;
        FragmentActivity activity = this.copydefault.OLrzqt().getActivity();
        ActivityC38834pgs activityC38834pgs = activity instanceof ActivityC38834pgs ? (ActivityC38834pgs) activity : null;
        if (activityC38834pgs != null && (c38685peBValueOf = activityC38834pgs.valueOf()) != null) {
            c38685peBValueOf.zLjUOn();
        }
        this.copydefault.EZpvd();
        if (this.copydefault.copydefault() != null && (interfaceC39502ptZCopydefault = this.copydefault.copydefault()) != null) {
            interfaceC39502ptZCopydefault.OFhtUX();
        }
        MarketCoinInfo marketCoinInfoHDKMBd = this.copydefault.hDKMBd();
        if (marketCoinInfoHDKMBd != null) {
            oUJ.KWHzl.OLrzqt(marketCoinInfoHDKMBd.getInstrumentId(), marketCoinInfoHDKMBd.getInstrumentType());
        }
        fJNWhG();
        MarketCoinInfo marketCoinInfoHDKMBd2 = this.copydefault.hDKMBd();
        if (Intrinsics.EZpvd((Object) "INDEX", (Object) (marketCoinInfoHDKMBd2 != null ? marketCoinInfoHDKMBd2.getInstrumentType() : null))) {
            oML oml = (oML) this.iwGUEr.KWHzl();
            if (oml != null && (c55254xgV2 = oml.zLjUOn) != null) {
                c55254xgV2.setVisibility(8);
            }
        } else {
            oML oml2 = (oML) this.iwGUEr.KWHzl();
            if (oml2 != null && (c55254xgV = oml2.zLjUOn) != null) {
                c55254xgV.setVisibility(0);
            }
        }
        oML oml3 = (oML) this.iwGUEr.KWHzl();
        if (oml3 != null && (c36250oUv = oml3.AuCTel) != null) {
            EZpvd(c36250oUv);
        }
        MarketCoinInfo marketCoinInfoHDKMBd3 = this.copydefault.hDKMBd();
        if (marketCoinInfoHDKMBd3 != null) {
            this.copydefault.values().KWHzl(marketCoinInfoHDKMBd3);
        }
    }

    public final void fJNWhG() {
        LinearLayout linearLayout;
        C39782pyo c39782pyo;
        TextView textView;
        int i;
        MarketCoinInfo marketCoinInfoHDKMBd = this.copydefault.hDKMBd();
        if (marketCoinInfoHDKMBd != null) {
            oML oml = (oML) this.iwGUEr.KWHzl();
            if (oml != null && (textView = oml.ORxRYg) != null) {
                if (Intrinsics.EZpvd((Object) marketCoinInfoHDKMBd.getInstrumentType(), (Object) "MARGIN") || Intrinsics.EZpvd((Object) marketCoinInfoHDKMBd.getInstrumentType(), (Object) "SWAP") || Intrinsics.EZpvd((Object) marketCoinInfoHDKMBd.getInstrumentType(), (Object) "FUTURES") || Intrinsics.EZpvd((Object) marketCoinInfoHDKMBd.getInstrumentType(), (Object) "OPTION") || pFS.KWHzl.AEQbTJ(marketCoinInfoHDKMBd.getInstrumentId())) {
                    getNewProxyInstance();
                    i = 0;
                } else {
                    i = 8;
                }
                textView.setVisibility(i);
            }
            this.copydefault.values().copydefault(new C39105ply(this.copydefault.getNewProxyInstance(), marketCoinInfoHDKMBd.getInstrumentType(), marketCoinInfoHDKMBd.getInstrumentId()));
            oML oml2 = (oML) this.iwGUEr.KWHzl();
            if (oml2 != null && (c39782pyo = oml2.fJNWhG) != null) {
                c39782pyo.setVisibility(0);
            }
            oML oml3 = (oML) this.iwGUEr.KWHzl();
            if (oml3 != null && (linearLayout = oml3.fetchVPNInfo) != null) {
                linearLayout.setVisibility(0);
            }
            final oML oml4 = (oML) this.iwGUEr.KWHzl();
            if (oml4 != null) {
                oml4.fJNWhG.post(new Runnable() { // from class: o.pmz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChartUIComponent.EZpvd(oml4);
                    }
                });
            }
        }
    }

    public static final void EZpvd(oML oml) {
        oml.AuCTel.AkhnZx().setTopPanelHeight(oml.fJNWhG.getMeasuredHeight());
    }

    public static final class TaskDescription implements C39402pre.TaskDescription {
        public TaskDescription() {
        }

        @Override // o.C39402pre.TaskDescription
        public void KWHzl(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            if (Intrinsics.EZpvd(tradeMenuItemBean.getData(), Integer.valueOf(ChartUIComponent.this.AYXKKw().ORxRYg()))) {
                ChartUIComponent chartUIComponent = ChartUIComponent.this;
                chartUIComponent.KWHzl(chartUIComponent.AYXKKw().ORxRYg());
                objectRef.element = "last_price";
            } else if (Intrinsics.EZpvd(tradeMenuItemBean.getData(), Integer.valueOf(ChartUIComponent.this.AYXKKw().OcIXYQ()))) {
                ChartUIComponent chartUIComponent2 = ChartUIComponent.this;
                chartUIComponent2.KWHzl(chartUIComponent2.AYXKKw().OcIXYQ());
                objectRef.element = "mark_price";
            } else if (Intrinsics.EZpvd(tradeMenuItemBean.getData(), Integer.valueOf(ChartUIComponent.this.AYXKKw().QKVWgx()))) {
                ChartUIComponent chartUIComponent3 = ChartUIComponent.this;
                chartUIComponent3.KWHzl(chartUIComponent3.AYXKKw().QKVWgx());
                objectRef.element = "index_price";
            }
            ChartUIComponent.this.EZpvd(true);
            InterfaceC39502ptZ interfaceC39502ptZCopydefault = ChartUIComponent.this.AYXKKw().copydefault();
            if (interfaceC39502ptZCopydefault != null) {
                interfaceC39502ptZCopydefault.fERRXa();
            }
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("KLine_PriceTypePop_Button_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pnk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ChartUIComponent.TaskDescription.EZpvd(objectRef, (EventParamsList) obj);
                }
            });
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit EZpvd(Ref.ObjectRef objectRef, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("price_type", (String) objectRef.element, true);
            return Unit.INSTANCE;
        }
    }

    public final C39402pre AkhnZx() {
        C39402pre c39402preNewInstance$default = C39402pre.ActionBar.newInstance$default(C39402pre.Companion, this.copydefault.getFieldNames(), null, false, 6, null);
        c39402preNewInstance$default.EZpvd(new TaskDescription());
        c39402preNewInstance$default.EZpvd(new Function0() { // from class: o.plI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ChartUIComponent.AuCTel(this.OLrzqt);
            }
        });
        return c39402preNewInstance$default;
    }

    public static final Unit AuCTel(ChartUIComponent chartUIComponent) {
        chartUIComponent.EZpvd(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(int i) {
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        AbstractC54531xLw value;
        C36250oUv c36250oUv2;
        C36250oUv c36250oUv3;
        C36250oUv c36250oUv4;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        KlineSpotAverageBean klineSpotAverageBean;
        OLrzqt(i);
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv4 = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv4.AkhnZx()) != null && (klineSpotAverageBean = chartViewOutSideConfigAkhnZx.getKlineSpotAverageBean()) != null) {
            klineSpotAverageBean.setShowSpotAverageLine(i == this.copydefault.ORxRYg());
        }
        oML oml2 = (oML) this.iwGUEr.KWHzl();
        if (oml2 != null && (c36250oUv3 = oml2.AuCTel) != null) {
            c36250oUv3.djBIcL();
        }
        MutableLiveData<AbstractC54531xLw> mutableLiveDataFIwbmz = this.copydefault.values().fIwbmz();
        if (mutableLiveDataFIwbmz != null && (value = mutableLiveDataFIwbmz.getValue()) != null) {
            MarketCoinInfo marketCoinInfoHDKMBd = this.copydefault.hDKMBd();
            String instrumentId = marketCoinInfoHDKMBd != null ? marketCoinInfoHDKMBd.getInstrumentId() : null;
            Intrinsics.copydefault((Object) instrumentId);
            BizInstrument bizInstrumentValueOf = value.valueOf(instrumentId);
            if (bizInstrumentValueOf != null) {
                String instFamily = bizInstrumentValueOf.getInstFamily();
                oML oml3 = (oML) this.iwGUEr.KWHzl();
                if (oml3 != null && (c36250oUv2 = oml3.AuCTel) != null) {
                    c36250oUv2.setPriceFractionDigits(C33129mqd.AhwBna(value.fIwbmz(instFamily)));
                }
            }
        }
        oML oml4 = (oML) this.iwGUEr.KWHzl();
        if (oml4 == null || (c36250oUv = oml4.AuCTel) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) {
            return;
        }
        int sPTimeInterval = templateSettingWlaJM.getSPTimeInterval();
        hDKMBd();
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = this.copydefault.uzCIH();
        if (stateListAnimatorUzCIH != null) {
            stateListAnimatorUzCIH.copydefault(this.copydefault.OLrzqt(), this.copydefault.getNewProxyInstance(), sPTimeInterval, new Function1() { // from class: o.pnc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ChartUIComponent.OLrzqt(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit OLrzqt(ChartUIComponent chartUIComponent, boolean z) {
        String instrumentType;
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUv3;
        HashMap<String, DataSource> mapEjfBZ;
        C36250oUv c36250oUv4;
        String instrumentId;
        KlineQuoteViewModel klineQuoteViewModelValues = chartUIComponent.copydefault.values();
        String newProxyInstance = chartUIComponent.copydefault.getNewProxyInstance();
        MarketCoinInfo marketCoinInfoHDKMBd = chartUIComponent.copydefault.hDKMBd();
        String str = "";
        if (marketCoinInfoHDKMBd == null || (instrumentType = marketCoinInfoHDKMBd.getInstrumentType()) == null) {
            instrumentType = "";
        }
        MarketCoinInfo marketCoinInfoHDKMBd2 = chartUIComponent.copydefault.hDKMBd();
        if (marketCoinInfoHDKMBd2 != null && (instrumentId = marketCoinInfoHDKMBd2.getInstrumentId()) != null) {
            str = instrumentId;
        }
        klineQuoteViewModelValues.KWHzl(new C39105ply(newProxyInstance, instrumentType, str));
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv3 = oml.AuCTel) != null && (mapEjfBZ = c36250oUv3.ejfBZ()) != null) {
            oML oml2 = (oML) chartUIComponent.iwGUEr.KWHzl();
            DataSource dataSource = mapEjfBZ.get((oml2 == null || (c36250oUv4 = oml2.AuCTel) == null) ? null : c36250oUv4.fIwbmz());
            if (dataSource != null) {
                dataSource.KWHzl();
            }
        }
        oML oml3 = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml3 != null && (c36250oUv2 = oml3.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMChartOffsetInit(false);
        }
        oML oml4 = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml4 != null && (c36250oUv = oml4.AuCTel) != null) {
            c36250oUv.QfsBiF();
        }
        chartUIComponent.copydefault.AubY().EZpvd();
        return Unit.INSTANCE;
    }

    public void getNewProxyInstance() {
        int iOcIXYQ;
        TextView textView;
        TextView textView2;
        if (this.copydefault.QVAiDq()) {
            MarketCoinInfo marketCoinInfoHDKMBd = this.copydefault.hDKMBd();
            if (Intrinsics.EZpvd((Object) (marketCoinInfoHDKMBd != null ? marketCoinInfoHDKMBd.getInstrumentType() : null), (Object) "OPTION")) {
                this.copydefault.OLrzqt("TYPE_MARK_PRICE_KLINE");
                oML oml = (oML) this.iwGUEr.KWHzl();
                if (oml != null && (textView2 = oml.ORxRYg) != null) {
                    textView2.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.hlkKmr));
                }
                int size = this.copydefault.getFieldNames().size();
                int i = 0;
                while (i < size) {
                    TradeMenuItemBean tradeMenuItemBean = (TradeMenuItemBean) CollectionsKt___CollectionsKt.AkhnZx(this.copydefault.getFieldNames(), i);
                    if (tradeMenuItemBean != null) {
                        tradeMenuItemBean.setSelect(i == 1);
                    }
                    i++;
                }
                this.copydefault.ejfBZ().OLrzqt("TYPE_MARK_PRICE_KLINE");
                return;
            }
            this.copydefault.OLrzqt("TYPE_KLINE");
            oML oml2 = (oML) this.iwGUEr.KWHzl();
            if (oml2 != null && (textView = oml2.ORxRYg) != null) {
                textView.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.zOIQXb));
            }
            int size2 = this.copydefault.getFieldNames().size();
            int i2 = 0;
            while (i2 < size2) {
                TradeMenuItemBean tradeMenuItemBean2 = (TradeMenuItemBean) CollectionsKt___CollectionsKt.AkhnZx(this.copydefault.getFieldNames(), i2);
                if (tradeMenuItemBean2 != null) {
                    tradeMenuItemBean2.setSelect(i2 == 0);
                }
                i2++;
            }
            this.copydefault.ejfBZ().OLrzqt("TYPE_KLINE");
            return;
        }
        KlineQuoteDataComponent klineQuoteDataComponent = this.copydefault;
        klineQuoteDataComponent.OLrzqt(klineQuoteDataComponent.ejfBZ().gEmmrt());
        int size3 = this.copydefault.getFieldNames().size();
        int i3 = 0;
        while (i3 < size3) {
            TradeMenuItemBean tradeMenuItemBean3 = (TradeMenuItemBean) CollectionsKt___CollectionsKt.AkhnZx(this.copydefault.getFieldNames(), i3);
            if (tradeMenuItemBean3 != null) {
                String newProxyInstance = this.copydefault.getNewProxyInstance();
                if (Intrinsics.EZpvd((Object) newProxyInstance, (Object) "TYPE_KLINE")) {
                    iOcIXYQ = this.copydefault.ORxRYg();
                } else {
                    iOcIXYQ = Intrinsics.EZpvd((Object) newProxyInstance, (Object) "TYPE_MARK_PRICE_KLINE") ? this.copydefault.OcIXYQ() : this.copydefault.QKVWgx();
                }
                tradeMenuItemBean3.setSelect(i3 == iOcIXYQ);
            }
            i3++;
        }
    }

    public final void hDKMBd() {
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        C55113xdn c55113xdn3;
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml != null && (c55113xdn3 = oml.OLrzqt) != null) {
            c55113xdn3.setVisibility(0);
        }
        oML oml2 = (oML) this.iwGUEr.KWHzl();
        if (oml2 != null && (c55113xdn2 = oml2.OLrzqt) != null) {
            c55113xdn2.setAnimation(C52761wXj.PendingIntent.isConnected);
        }
        oML oml3 = (oML) this.iwGUEr.KWHzl();
        if (oml3 == null || (c55113xdn = oml3.OLrzqt) == null) {
            return;
        }
        c55113xdn.KWHzl(0L);
    }

    public final void valueOf() {
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml != null && (c55113xdn2 = oml.OLrzqt) != null) {
            c55113xdn2.setVisibility(8);
        }
        oML oml2 = (oML) this.iwGUEr.KWHzl();
        if (oml2 == null || (c55113xdn = oml2.OLrzqt) == null) {
            return;
        }
        c55113xdn.cancelAnimation();
    }

    private final void OLrzqt(int i) {
        String str;
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        ArrayList<String> sideIndicatorNames;
        oML oml;
        C39756pyO c39756pyO;
        C36250oUv c36250oUv3;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        oML oml2;
        C36250oUv c36250oUv4;
        C36250oUv c36250oUv5;
        KlineQuoteDataComponent klineQuoteDataComponent = this.copydefault;
        if (i == klineQuoteDataComponent.ORxRYg()) {
            this.copydefault.ejfBZ().OLrzqt("TYPE_KLINE");
            str = "TYPE_KLINE";
        } else if (i == this.copydefault.OcIXYQ()) {
            str = "TYPE_MARK_PRICE_KLINE";
            this.copydefault.ejfBZ().OLrzqt("TYPE_MARK_PRICE_KLINE");
        } else {
            str = "TYPE_INDEX_KLINE";
            this.copydefault.ejfBZ().OLrzqt("TYPE_INDEX_KLINE");
        }
        klineQuoteDataComponent.OLrzqt(str);
        copydefault(i);
        oML oml3 = (oML) this.iwGUEr.KWHzl();
        TemplateSetting templateSettingWlaJM = (oml3 == null || (c36250oUv5 = oml3.AuCTel) == null) ? null : c36250oUv5.wlaJM();
        if (templateSettingWlaJM == null || templateSettingWlaJM.getSPTimeInterval() != -2) {
            if (Intrinsics.EZpvd((Object) this.copydefault.getNewProxyInstance(), (Object) "TYPE_KLINE")) {
                oML oml4 = (oML) this.iwGUEr.KWHzl();
                if (oml4 != null && (c36250oUv3 = oml4.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv3.AkhnZx()) != null && chartViewOutSideConfigAkhnZx.getMShowVolume() && (oml2 = (oML) this.iwGUEr.KWHzl()) != null && (c36250oUv4 = oml2.AuCTel) != null) {
                    c36250oUv4.fZBcTu();
                }
                QOLQEE();
            } else {
                oML oml5 = (oML) this.iwGUEr.KWHzl();
                if (oml5 != null && (c36250oUv2 = oml5.AuCTel) != null) {
                    c36250oUv2.AwvSrB();
                }
                oML oml6 = (oML) this.iwGUEr.KWHzl();
                if (oml6 != null && (c36250oUv = oml6.AuCTel) != null) {
                    c36250oUv.sSMYrx();
                }
            }
            if (templateSettingWlaJM == null || (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) == null || (oml = (oML) this.iwGUEr.KWHzl()) == null || (c39756pyO = oml.fIwbmz) == null) {
                return;
            }
            c39756pyO.setSideIndicators(sideIndicatorNames);
        }
    }

    public final void copydefault(int i) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        if (i == this.copydefault.ORxRYg()) {
            oML oml = (oML) this.iwGUEr.KWHzl();
            if (oml == null || (textView3 = oml.ORxRYg) == null) {
                return;
            }
            textView3.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.zOIQXb));
            return;
        }
        if (i == this.copydefault.OcIXYQ()) {
            oML oml2 = (oML) this.iwGUEr.KWHzl();
            if (oml2 == null || (textView2 = oml2.ORxRYg) == null) {
                return;
            }
            textView2.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.hlkKmr));
            return;
        }
        oML oml3 = (oML) this.iwGUEr.KWHzl();
        if (oml3 == null || (textView = oml3.ORxRYg) == null) {
            return;
        }
        textView.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.DGUQLIhJrIAr));
    }

    private final void RJOkX() {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        oML oml;
        C36250oUv c36250oUv2;
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = this.copydefault.uzCIH();
        if (stateListAnimatorUzCIH != null) {
            stateListAnimatorUzCIH.KWHzl("TYPE_KLINE");
        }
        oML oml2 = (oML) this.iwGUEr.KWHzl();
        if (oml2 != null && (c36250oUv = oml2.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null && chartViewOutSideConfigAkhnZx.getMShowVolume() && (oml = (oML) this.iwGUEr.KWHzl()) != null && (c36250oUv2 = oml.AuCTel) != null) {
            c36250oUv2.fZBcTu();
        }
        QOLQEE();
    }

    private final void QOLQEE() {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        TemplateSetting templateSetting = this.ejfBZ;
        if (templateSetting != null) {
            if (templateSetting.getSPTimeInterval() != -1) {
                oML oml = (oML) this.iwGUEr.KWHzl();
                if (oml == null || (c36250oUv2 = oml.AuCTel) == null) {
                    return;
                }
                c36250oUv2.aKErDB();
                return;
            }
            oML oml2 = (oML) this.iwGUEr.KWHzl();
            if (oml2 == null || (c36250oUv = oml2.AuCTel) == null) {
                return;
            }
            c36250oUv.sSMYrx();
        }
    }

    private final void AEQbTJ(ArrayList<DrawLineData.DrawLineItem> arrayList) {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv2 = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setLinesList(arrayList);
        }
        oML oml2 = (oML) this.iwGUEr.KWHzl();
        if (oml2 == null || (c36250oUv = oml2.AuCTel) == null) {
            return;
        }
        c36250oUv.invalidate();
    }

    public final void EZpvd(boolean z) {
        TextView textView;
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml == null || (textView = oml.ORxRYg) == null) {
            return;
        }
        pFQ.KWHzl(textView, z ? C35964oKf.Activity.wlaJM : C35964oKf.Activity.zsXlph);
    }

    private final void QVAiDq() {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        this.fetchVPNInfo = this.AkhnZx;
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml == null || (c36250oUv = oml.AuCTel) == null || (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) == null) {
            return;
        }
        int topPanelHeight = chartViewOutSideConfigAkhnZx.getTopPanelHeight();
        oML oml2 = (oML) this.iwGUEr.KWHzl();
        if (oml2 != null) {
            oml2.iwGUEr.smoothScrollTo(0, topPanelHeight - oml2.getFieldNames.getHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void QUSxYX() {
        pXL pxl;
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml == null || (pxl = oml.iwGUEr) == null) {
            return;
        }
        pxl.smoothScrollTo(0, this.fetchVPNInfo);
    }

    public static /* synthetic */ void showChartSetting$default(ChartUIComponent chartUIComponent, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showChartSetting");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        chartUIComponent.AhwBna(z);
    }

    private final void AhwBna(boolean z) {
        if (!z) {
            QVAiDq();
        }
        LifecycleOwnerKt.getLifecycleScope(this.copydefault).launchWhenResumed(new ChartUIComponent$showChartSetting$1(this, null));
        InterfaceC39502ptZ interfaceC39502ptZCopydefault = this.copydefault.copydefault();
        if (interfaceC39502ptZCopydefault != null) {
            interfaceC39502ptZCopydefault.fERRXa();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AubY() {
        C36312oXc c36312oXc = this.fARcdN;
        if (c36312oXc == null || !(c36312oXc.isConnected() instanceof C36315oXf)) {
            return;
        }
        c36312oXc.EZpvd(c36312oXc.zLjUOn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:12:0x002c, B:32:0x0079, B:34:0x007f, B:35:0x008c, B:37:0x009c, B:38:0x00a0, B:40:0x00a6, B:44:0x00b9, B:46:0x00bd, B:48:0x00c3, B:50:0x00c9, B:17:0x003b, B:19:0x0045, B:22:0x004d, B:24:0x005f, B:26:0x0065, B:28:0x006d), top: B:59:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3 A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:12:0x002c, B:32:0x0079, B:34:0x007f, B:35:0x008c, B:37:0x009c, B:38:0x00a0, B:40:0x00a6, B:44:0x00b9, B:46:0x00bd, B:48:0x00c3, B:50:0x00c9, B:17:0x003b, B:19:0x0045, B:22:0x004d, B:24:0x005f, B:26:0x0065, B:28:0x006d), top: B:59:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(Continuation<? super Long> continuation) throws Throwable {
        ChartUIComponent$getKlineStartTime$1 chartUIComponent$getKlineStartTime$1;
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        List<KlineStartTimeVo> value;
        ChartUIComponent chartUIComponent;
        long jValueOf;
        Object next;
        if (continuation instanceof ChartUIComponent$getKlineStartTime$1) {
            chartUIComponent$getKlineStartTime$1 = (ChartUIComponent$getKlineStartTime$1) continuation;
            int i = chartUIComponent$getKlineStartTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chartUIComponent$getKlineStartTime$1.label = i - Integer.MIN_VALUE;
            } else {
                chartUIComponent$getKlineStartTime$1 = new ChartUIComponent$getKlineStartTime$1(this, continuation);
            }
        }
        Object objAEQbTJ = chartUIComponent$getKlineStartTime$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = chartUIComponent$getKlineStartTime$1.label;
        String ts = null;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            Result.Application application2 = Result.Companion;
            String strFIwbmz = this.copydefault.fIwbmz();
            if (strFIwbmz != null && strFIwbmz.length() != 0) {
                value = this.copydefault.AubY().AEQbTJ().getValue();
                if (value == null || value.isEmpty()) {
                    InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = this.copydefault.uzCIH();
                    if (stateListAnimatorUzCIH != null) {
                        chartUIComponent$getKlineStartTime$1.L$0 = this;
                        chartUIComponent$getKlineStartTime$1.label = 1;
                        objAEQbTJ = stateListAnimatorUzCIH.AEQbTJ(strFIwbmz, chartUIComponent$getKlineStartTime$1);
                        if (objAEQbTJ == objCopydefault) {
                            return objCopydefault;
                        }
                        chartUIComponent = this;
                    } else {
                        chartUIComponent = this;
                        value = null;
                        chartUIComponent.copydefault.AubY().AEQbTJ().setValue(value);
                    }
                }
                String strOLrzqt = pEF.OLrzqt.OLrzqt(C36246oUr.copydefault().ODWQjV());
                if (value != null) {
                    Iterator<T> it = value.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.EZpvd((Object) ((KlineStartTimeVo) next).getBar(), (Object) strOLrzqt)) {
                            break;
                        }
                    }
                    KlineStartTimeVo klineStartTimeVo = (KlineStartTimeVo) next;
                    if (klineStartTimeVo != null) {
                        ts = klineStartTimeVo.getTs();
                    }
                }
                if (ts == null) {
                    jValueOf = C33129mqd.valueOf(ts);
                }
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(jValueOf));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl == null) {
                    return objM7377constructorimpl;
                }
                pUU.AEQbTJ("ChartUIComponent", "getKlineStartTime failed: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                return C56443yFo.KWHzl(0L);
            }
            jValueOf = 0;
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(jValueOf));
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chartUIComponent = (ChartUIComponent) chartUIComponent$getKlineStartTime$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        value = (ArrayList) objAEQbTJ;
        chartUIComponent.copydefault.AubY().AEQbTJ().setValue(value);
        String strOLrzqt2 = pEF.OLrzqt.OLrzqt(C36246oUr.copydefault().ODWQjV());
        if (value != null) {
        }
        if (ts == null) {
            jValueOf = 0;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(jValueOf));
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dNCPSb() {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml != null && (c36250oUv2 = oml.AuCTel) != null) {
            c36250oUv2.QfsBiF();
        }
        oML oml2 = (oML) this.iwGUEr.KWHzl();
        if (oml2 == null || (c36250oUv = oml2.AuCTel) == null) {
            return;
        }
        c36250oUv.invalidate();
    }

    public static /* synthetic */ void changeTime$default(ChartUIComponent chartUIComponent, TimeIntervalItem timeIntervalItem, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeTime");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        chartUIComponent.KWHzl(timeIntervalItem, z);
    }

    public final void KWHzl(@NotNull TimeIntervalItem timeIntervalItem, boolean z) {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        HashMap<String, DataSource> mapEjfBZ;
        C36250oUv c36250oUv3;
        Intrinsics.checkNotNullParameter(timeIntervalItem, "");
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml == null || (c36250oUv = oml.AuCTel) == null) {
            return;
        }
        this.copydefault.AubY().valueOf().setValue(Boolean.TRUE);
        TemplateSetting templateSettingWlaJM = c36250oUv.wlaJM();
        Intrinsics.checkNotNullExpressionValue(templateSettingWlaJM, "");
        int sPTimeInterval = templateSettingWlaJM.getSPTimeInterval();
        if (sPTimeInterval != timeIntervalItem.timeInterval || z) {
            this.copydefault.values().QVAiDq().setValue(Integer.valueOf(timeIntervalItem.timeInterval));
            this.copydefault.AkhnZx().copydefault(C33129mqd.divS$default(Long.valueOf(System.currentTimeMillis()), 1000, null, null, null, 14, null));
            c36250oUv.RcXXUw();
            templateSettingWlaJM.putTimeInterval(timeIntervalItem.timeInterval);
            this.copydefault.values().hUfVAv();
            String strFIwbmz = null;
            strFIwbmz = null;
            if (pEI.EZpvd.AEQbTJ()) {
                if (this.AuCTel instanceof C36327oXr) {
                    int i = timeIntervalItem.timeInterval;
                    int i2 = i == -1 ? 3 : 1;
                    String strOLrzqt = pFS.KWHzl.OLrzqt(i);
                    InterfaceC36254oUz interfaceC36254oUz = this.AuCTel;
                    C36327oXr c36327oXr = interfaceC36254oUz instanceof C36327oXr ? (C36327oXr) interfaceC36254oUz : null;
                    if (c36327oXr != null) {
                        c36327oXr.loadUrl(pFX.AEQbTJ.KWHzl("onHistoryDataUpdate", false, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
                    }
                    InterfaceC36254oUz interfaceC36254oUz2 = this.AuCTel;
                    C36327oXr c36327oXr2 = interfaceC36254oUz2 instanceof C36327oXr ? (C36327oXr) interfaceC36254oUz2 : null;
                    if (c36327oXr2 != null) {
                        c36327oXr2.loadUrl(pFX.AEQbTJ.copydefault("onNeedResetBarCache", new String[0]));
                    }
                    InterfaceC36254oUz interfaceC36254oUz3 = this.AuCTel;
                    C36327oXr c36327oXr3 = interfaceC36254oUz3 instanceof C36327oXr ? (C36327oXr) interfaceC36254oUz3 : null;
                    if (c36327oXr3 != null) {
                        c36327oXr3.loadUrl("javascript:window.tvWidget.activeChart().setChartType(" + i2 + ");window.tvWidget.activeChart().setResolution('" + strOLrzqt + "', null)");
                        return;
                    }
                    return;
                }
                return;
            }
            long jAxsJAYsNCnLh = C36246oUr.copydefault().AxsJAYsNCnLh();
            hDKMBd();
            ORxRYg();
            MarketCoinInfo marketCoinInfoHDKMBd = this.copydefault.hDKMBd();
            String instrumentId = marketCoinInfoHDKMBd != null ? marketCoinInfoHDKMBd.getInstrumentId() : null;
            MarketCoinInfo marketCoinInfoHDKMBd2 = this.copydefault.hDKMBd();
            String instrumentType = marketCoinInfoHDKMBd2 != null ? marketCoinInfoHDKMBd2.getInstrumentType() : null;
            c36250oUv.setCurrentDataSource(instrumentId + instrumentType + JwtUtilsKt.JWT_DELIMITER + templateSettingWlaJM.getSPTimeInterval());
            if (templateSettingWlaJM.getSPTimeInterval() < 0) {
                c36250oUv.setChartStyle(1);
            } else if (templateSettingWlaJM.getTimelineScale() < oWN.AEQbTJ) {
                c36250oUv.setChartStyle(2);
            } else {
                c36250oUv.setChartStyle(0);
            }
            oML oml2 = (oML) this.iwGUEr.KWHzl();
            if (oml2 != null && (c36250oUv2 = oml2.AuCTel) != null && (mapEjfBZ = c36250oUv2.ejfBZ()) != null) {
                oML oml3 = (oML) this.iwGUEr.KWHzl();
                if (oml3 != null && (c36250oUv3 = oml3.AuCTel) != null) {
                    strFIwbmz = c36250oUv3.fIwbmz();
                }
                DataSource dataSource = mapEjfBZ.get(strFIwbmz);
                if (dataSource != null) {
                    dataSource.KWHzl();
                }
            }
            FragmentActivity activity = this.copydefault.OLrzqt().getActivity();
            if (activity != null && (activity instanceof ActivityC38834pgs) && !z) {
                KlineTimeAnchorViewModel value = sSMYrx().getValue();
                String mode = c36250oUv.AkhnZx().getMode();
                int sPTimeInterval2 = templateSettingWlaJM.getSPTimeInterval();
                String strAuCTel = this.copydefault.AuCTel();
                if (value.KWHzl(mode, jAxsJAYsNCnLh, sPTimeInterval2, sPTimeInterval, strAuCTel == null ? "" : strAuCTel)) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.copydefault), null, null, new ChartUIComponent$changeTime$1$1$1(this, jAxsJAYsNCnLh, templateSettingWlaJM, null), 3, null);
                    return;
                }
            }
            OLrzqt(templateSettingWlaJM);
        }
    }

    public final Unit OLrzqt(TemplateSetting templateSetting) {
        this.copydefault.values().QVAiDq().setValue(Integer.valueOf(templateSetting.getSPTimeInterval()));
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = this.copydefault.uzCIH();
        if (stateListAnimatorUzCIH == null) {
            return null;
        }
        InterfaceC39563puh.StateListAnimator.TaskDescription.loadKline$default(stateListAnimatorUzCIH, this.copydefault.OLrzqt(), templateSetting.getSPTimeInterval(), false, false, null, 24, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(List<HistoryOrderData> list) {
        C36250oUv c36250oUv;
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml == null || (c36250oUv = oml.AuCTel) == null) {
            return;
        }
        c36250oUv.copydefault(list);
    }

    public final void AuCTel() {
        C36250oUv c36250oUv;
        Handler handlerZLjUOn = this.copydefault.zLjUOn();
        if (handlerZLjUOn != null) {
            handlerZLjUOn.removeCallbacksAndMessages(null);
        }
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = this.copydefault.uzCIH();
        if (stateListAnimatorUzCIH != null) {
            stateListAnimatorUzCIH.copydefault();
        }
        InterfaceC58217yxC interfaceC58217yxCFetchVPNInfo = this.copydefault.fetchVPNInfo();
        if (interfaceC58217yxCFetchVPNInfo != null) {
            interfaceC58217yxCFetchVPNInfo.dispose();
        }
        SubHelper.AEQbTJ(this);
        OLrzqt();
        ejfBZ();
        copydefault();
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml == null || (c36250oUv = oml.AuCTel) == null) {
            return;
        }
        c36250oUv.AhwBna();
    }

    public final void OLrzqt() {
        FrameLayout frameLayout;
        try {
            C36344oYh c36344oYh = this.fIwbmz;
            if (c36344oYh != null) {
                if (c36344oYh != null) {
                    c36344oYh.OLrzqt();
                }
                this.fIwbmz = null;
            }
        } catch (Exception e) {
            Log.getStackTraceString(e);
            this.copydefault.OLrzqt().getTAG();
        }
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml == null || (frameLayout = oml.uzCIH) == null) {
            return;
        }
        InterfaceC36254oUz interfaceC36254oUz = this.AuCTel;
        frameLayout.removeView(interfaceC36254oUz != null ? interfaceC36254oUz.zsXlph() : null);
    }

    public final void AEQbTJ(int i) {
        String strIwGUEr;
        C36250oUv c36250oUv;
        String strFJNWhG;
        C36250oUv c36250oUv2;
        TradeHistoryOrderData tradeHistoryOrderData = new TradeHistoryOrderData();
        tradeHistoryOrderData.setInstType(String.valueOf(this.copydefault.AuCTel()));
        tradeHistoryOrderData.setInstId(String.valueOf(this.copydefault.fIwbmz()));
        oML oml = (oML) this.iwGUEr.KWHzl();
        String str = "0";
        if (oml == null || (c36250oUv2 = oml.AuCTel) == null || (strIwGUEr = c36250oUv2.iwGUEr()) == null) {
            strIwGUEr = "0";
        }
        tradeHistoryOrderData.setStartTime(strIwGUEr);
        oML oml2 = (oML) this.iwGUEr.KWHzl();
        if (oml2 != null && (c36250oUv = oml2.AuCTel) != null && (strFJNWhG = c36250oUv.fJNWhG()) != null) {
            str = strFJNWhG;
        }
        tradeHistoryOrderData.setEndTime(str);
        tradeHistoryOrderData.setSubTabPosition(0);
        tradeHistoryOrderData.setHideCanceled(true);
        tradeHistoryOrderData.setSortType("filledTime");
        Context context = this.copydefault.OLrzqt().getContext();
        if (context != null) {
            InterfaceC49499uph.StateListAnimator.routeMoreActivity$default((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class), context, "history_type", null, null, null, null, this.copydefault.AuCTel(), this.copydefault.fIwbmz(), tradeHistoryOrderData, 60, null);
        }
        oML oml3 = (oML) this.iwGUEr.KWHzl();
        oWO owo = C36312oXc.AEQbTJ(oml3 != null ? oml3.AuCTel : null).AubY;
        Intrinsics.copydefault(owo, "");
        C36311oXb c36311oXb = (C36311oXb) owo;
        if (c36311oXb != null) {
            c36311oXb.djBIcL();
        }
        if (i == 1) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("app_trade_kroder1_click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pne
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ChartUIComponent.values((EventParamsList) obj);
                }
            });
        } else {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("app_trade_kroder2_click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pnd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ChartUIComponent.fetchVPNInfo((EventParamsList) obj);
                }
            });
        }
        TrackChannel[] trackChannelArrCopydefault3 = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("PlaceOrder_Kline_TradeTools_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pnm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.DbNXlk((EventParamsList) obj);
            }
        });
    }

    public static final Unit values(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tool_type", "trade_history_pin", true);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "trade_history_view_more", true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements pAL {
        public StateListAnimator() {
        }

        @Override // o.pAL
        public void AEQbTJ(int i) {
            C36250oUv c36250oUv;
            if (i == 0) {
                oML oml = (oML) ChartUIComponent.this.isConnected().KWHzl();
                oWO owo = C36312oXc.AEQbTJ(oml != null ? oml.AuCTel : null).AubY;
                Intrinsics.copydefault(owo, "");
                C36311oXb c36311oXb = (C36311oXb) owo;
                if (c36311oXb != null) {
                    c36311oXb.djBIcL();
                }
            } else if (i == 1) {
                ChartUIComponent.this.AYXKKw().values().KWHzl(1);
            }
            oML oml2 = (oML) ChartUIComponent.this.isConnected().KWHzl();
            if (oml2 == null || (c36250oUv = oml2.AuCTel) == null) {
                return;
            }
            c36250oUv.copydefault();
        }
    }

    private final void DTwDnp() {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        C39757pyP c39757pyP;
        ViewTreeObserver viewTreeObserver;
        ImageView imageView;
        oML oml;
        ImageView imageView2;
        oML oml2;
        ImageView imageView3;
        oML oml3;
        ImageView imageView4;
        oML oml4;
        ImageView imageView5;
        oML oml5;
        ImageView imageView6;
        oML oml6;
        pXL pxl;
        oML oml7;
        pXL pxl2;
        C39756pyO c39756pyO;
        oML oml8;
        C39756pyO c39756pyO2;
        ArrayList<String> sideIndicatorNames;
        oML oml9;
        C39756pyO c39756pyO3;
        oML oml10;
        C39756pyO c39756pyO4;
        C36250oUv c36250oUv;
        C39782pyo c39782pyo;
        oML oml11 = (oML) this.iwGUEr.KWHzl();
        if (oml11 != null && (c39782pyo = oml11.fJNWhG) != null) {
            c39782pyo.setPanelClickListener(new StateListAnimator());
        }
        oML oml12 = (oML) this.iwGUEr.KWHzl();
        TemplateSetting templateSettingWlaJM = (oml12 == null || (c36250oUv = oml12.AuCTel) == null) ? null : c36250oUv.wlaJM();
        if (templateSettingWlaJM != null && templateSettingWlaJM.getMainIndicatorNames() != null && (oml10 = (oML) this.iwGUEr.KWHzl()) != null && (c39756pyO4 = oml10.fIwbmz) != null) {
            c39756pyO4.setMainIndicatorSelect();
        }
        if (templateSettingWlaJM != null && (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) != null && (oml9 = (oML) this.iwGUEr.KWHzl()) != null && (c39756pyO3 = oml9.fIwbmz) != null) {
            c39756pyO3.setSideIndicators(sideIndicatorNames);
        }
        if (templateSettingWlaJM != null) {
            ArrayList<String> mainIndicatorNames = templateSettingWlaJM.getMainIndicatorNames();
            Intrinsics.checkNotNullExpressionValue(mainIndicatorNames, "");
            ArrayList<String> sideIndicatorNames2 = templateSettingWlaJM.getSideIndicatorNames();
            Intrinsics.checkNotNullExpressionValue(sideIndicatorNames2, "");
            KWHzl(mainIndicatorNames, sideIndicatorNames2);
        }
        fJNWhG();
        oML oml13 = (oML) this.iwGUEr.KWHzl();
        TextView textView = oml13 != null ? oml13.ORxRYg : null;
        Intrinsics.copydefault(textView);
        C8003auW.copydefault(textView).throttleFirst(500L, TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.plG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ChartUIComponent.KWHzl(this.OLrzqt, obj);
            }
        });
        if (pFP.OLrzqt.OLrzqt() && (oml8 = (oML) this.iwGUEr.KWHzl()) != null && (c39756pyO2 = oml8.fIwbmz) != null) {
            String strAuCTel = this.copydefault.AuCTel();
            c39756pyO2.AEQbTJ(strAuCTel != null ? strAuCTel : "");
        }
        oML oml14 = (oML) this.iwGUEr.KWHzl();
        if (oml14 != null && (c39756pyO = oml14.fIwbmz) != null) {
            c39756pyO.setOnItemSelectListener(new Function1() { // from class: o.plN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ChartUIComponent.OLrzqt(this.copydefault, (MarketTypeSelect) obj);
                }
            });
        }
        C39043pkp<oML> c39043pkp = this.iwGUEr;
        if (c39043pkp != null && (oml7 = (oML) c39043pkp.KWHzl()) != null && (pxl2 = oml7.iwGUEr) != null) {
            pxl2.setOnScrollChanged(new pXL.StateListAnimator() { // from class: o.plL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.pXL.StateListAnimator
                public final void copydefault(java.lang.Boolean bool) {
                    ChartUIComponent.isConnected(this.AEQbTJ, bool);
                }
            });
        }
        C39043pkp<oML> c39043pkp2 = this.iwGUEr;
        if (c39043pkp2 != null && (oml6 = (oML) c39043pkp2.KWHzl()) != null && (pxl = oml6.iwGUEr) != null) {
            pxl.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.plP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                    ChartUIComponent.AEQbTJ(this.OLrzqt, view, i, i2, i3, i4);
                }
            });
        }
        C39043pkp<oML> c39043pkp3 = this.iwGUEr;
        if (c39043pkp3 != null && (oml5 = (oML) c39043pkp3.KWHzl()) != null && (imageView6 = oml5.AYXKKw) != null) {
            imageView6.setOnClickListener(new View.OnClickListener() { // from class: o.plM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ChartUIComponent.djBIcL(this.EZpvd, view);
                }
            });
        }
        C39043pkp<oML> c39043pkp4 = this.iwGUEr;
        if (c39043pkp4 != null && (oml4 = (oML) c39043pkp4.KWHzl()) != null && (imageView5 = oml4.AkhnZx) != null) {
            imageView5.setOnClickListener(new View.OnClickListener() { // from class: o.plO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ChartUIComponent.valueOf(this.OLrzqt, view);
                }
            });
        }
        C39043pkp<oML> c39043pkp5 = this.iwGUEr;
        if (c39043pkp5 != null && (oml3 = (oML) c39043pkp5.KWHzl()) != null && (imageView4 = oml3.djBIcL) != null) {
            imageView4.setOnClickListener(new View.OnClickListener() { // from class: o.plT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ChartUIComponent.AYXKKw(this.AEQbTJ, view);
                }
            });
        }
        C39043pkp<oML> c39043pkp6 = this.iwGUEr;
        if (c39043pkp6 != null && (oml2 = (oML) c39043pkp6.KWHzl()) != null && (imageView3 = oml2.gEmmrt) != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: o.plQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ChartUIComponent.AkhnZx(this.EZpvd, view);
                }
            });
        }
        C39043pkp<oML> c39043pkp7 = this.iwGUEr;
        if (c39043pkp7 != null && (oml = (oML) c39043pkp7.KWHzl()) != null && (imageView2 = oml.copydefault) != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: o.plU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ChartUIComponent.copydefault(view);
                }
            });
        }
        oML oml15 = (oML) this.iwGUEr.KWHzl();
        if (oml15 != null && (imageView = oml15.valueOf) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.plS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ChartUIComponent.DbNXlk(this.AEQbTJ, view);
                }
            });
        }
        oML oml16 = (oML) this.iwGUEr.KWHzl();
        if (oml16 != null && (c39757pyP = oml16.AxsJAY) != null && (viewTreeObserver = c39757pyP.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new Dialog());
        }
        oML oml17 = (oML) this.iwGUEr.KWHzl();
        if (oml17 != null && (c52794wYp2 = oml17.EZpvd) != null) {
            c52794wYp2.setOnClickListener(new View.OnClickListener() { // from class: o.plH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ChartUIComponent.isConnected(this.KWHzl, view);
                }
            });
        }
        oML oml18 = (oML) this.iwGUEr.KWHzl();
        if (oml18 == null || (c52794wYp = oml18.KWHzl) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.plJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ChartUIComponent.values(this.OLrzqt, view);
            }
        });
    }

    public static final void KWHzl(ChartUIComponent chartUIComponent, Object obj) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        C39402pre c39402preAkhnZx = chartUIComponent.AkhnZx();
        FragmentActivity activity = chartUIComponent.copydefault.OLrzqt().getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            if (c39402preAkhnZx != null) {
                c39402preAkhnZx.show(supportFragmentManager, C39014pkM.class.getSimpleName());
            }
            chartUIComponent.EZpvd(false);
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLine_Full_Button_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pnl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return ChartUIComponent.valueOf((EventParamsList) obj2);
            }
        });
    }

    public static final Unit valueOf(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("price_type_dropdown_entry", "price_type_dropdown_entry", true);
        eventParamsList.put("chart_layout", "classic", true);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ChartUIComponent chartUIComponent, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        if (Intrinsics.EZpvd((Object) marketTypeSelect.getSelectTypeName(), (Object) "VOLUME") && !Intrinsics.EZpvd((Object) chartUIComponent.copydefault.getNewProxyInstance(), (Object) "TYPE_KLINE")) {
            return Unit.INSTANCE;
        }
        chartUIComponent.copydefault(marketTypeSelect);
        C37908pFd.copydefault(marketTypeSelect.getSelectTypeName(), marketTypeSelect.isSelect(), marketTypeSelect.getGroup() == 0);
        chartUIComponent.copydefault.AkhnZx().KWHzl("isDebuggerAttached");
        return Unit.INSTANCE;
    }

    public static final void isConnected(ChartUIComponent chartUIComponent, Boolean bool) {
        if (chartUIComponent.copydefault.AEQbTJ() == null || bool == null) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        InterfaceC39499ptW interfaceC39499ptWAEQbTJ = chartUIComponent.copydefault.AEQbTJ();
        if (interfaceC39499ptWAEQbTJ != null) {
            interfaceC39499ptWAEQbTJ.AEQbTJ(zBooleanValue);
        }
    }

    public static final void AEQbTJ(ChartUIComponent chartUIComponent, View view, int i, int i2, int i3, int i4) {
        C38685peB c38685peBValueOf;
        chartUIComponent.AkhnZx = i2;
        FragmentActivity activity = chartUIComponent.copydefault.OLrzqt().getActivity();
        ActivityC38834pgs activityC38834pgs = activity instanceof ActivityC38834pgs ? (ActivityC38834pgs) activity : null;
        if (activityC38834pgs == null || (c38685peBValueOf = activityC38834pgs.valueOf()) == null) {
            return;
        }
        c38685peBValueOf.KWHzl(i2);
    }

    public static final void djBIcL(ChartUIComponent chartUIComponent, View view) {
        showChartSetting$default(chartUIComponent, false, 1, null);
        C37908pFd.EZpvd();
    }

    public static final void valueOf(ChartUIComponent chartUIComponent, View view) {
        chartUIComponent.QbewEr();
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLine_Full_Button_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pmX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.AkhnZx((EventParamsList) obj);
            }
        });
    }

    public static final Unit AkhnZx(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("indicator_dropdown_entry", "indicator_dropdown_entry", false);
        eventParamsList.put("chart_layout", "classic", true);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(ChartUIComponent chartUIComponent, View view) {
        InterfaceC36254oUz interfaceC36254oUz = chartUIComponent.AuCTel;
        if (interfaceC36254oUz instanceof C36327oXr) {
            Intrinsics.copydefault(interfaceC36254oUz, "");
            ((C36327oXr) interfaceC36254oUz).loadUrl("javascript:window.tvWidget.chart().executeActionById('insertIndicator')");
        }
    }

    public static final void AkhnZx(ChartUIComponent chartUIComponent, View view) {
        InterfaceC36254oUz interfaceC36254oUz = chartUIComponent.AuCTel;
        if (interfaceC36254oUz instanceof C36327oXr) {
            Intrinsics.copydefault(interfaceC36254oUz, "");
            ((C36327oXr) interfaceC36254oUz).loadUrl("javascript:window.tvWidget.chart().executeActionById('chartProperties')");
        }
    }

    public static final void copydefault(View view) {
        RxBus.KWHzl("kline_full_screen");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLine_Full_Button_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.plK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.isConnected((EventParamsList) obj);
            }
        });
    }

    public static final Unit isConnected(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("chart_horizontal_button", "chart_horizontal_button", true);
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(ChartUIComponent chartUIComponent, View view) {
        chartUIComponent.AhwBna(true);
    }

    public static final class Dialog implements ViewTreeObserver.OnGlobalLayoutListener {
        public Dialog() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ImageView imageView;
            ImageView imageView2;
            C39757pyP c39757pyP;
            ViewTreeObserver viewTreeObserver;
            oML oml = (oML) ChartUIComponent.this.isConnected().KWHzl();
            if (oml != null && (c39757pyP = oml.AxsJAY) != null && (viewTreeObserver = c39757pyP.getViewTreeObserver()) != null) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            if (ChartUIComponent.this.AEQbTJ()) {
                oML oml2 = (oML) ChartUIComponent.this.isConnected().KWHzl();
                if (oml2 == null || (imageView2 = oml2.AhwBna) == null) {
                    return;
                }
                imageView2.setVisibility(0);
                return;
            }
            oML oml3 = (oML) ChartUIComponent.this.isConnected().KWHzl();
            if (oml3 == null || (imageView = oml3.AhwBna) == null) {
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public static final void isConnected(ChartUIComponent chartUIComponent, View view) {
        chartUIComponent.AEQbTJ(false);
    }

    public static final void values(ChartUIComponent chartUIComponent, View view) {
        chartUIComponent.hDKMBd();
        C48872udq.AEQbTJ.OLrzqt("file_market_tradingview_js", chartUIComponent.new LoaderManager());
    }

    public static final class LoaderManager implements AbstractC48864udi.ActionBar {
        public LoaderManager() {
        }

        @Override // o.AbstractC48864udi.ActionBar
        public void AEQbTJ(long j, long j2) {
            AbstractC48864udi.ActionBar.C0977ActionBar.OLrzqt(this, j, j2);
        }

        @Override // o.AbstractC48864udi.ActionBar
        public void EZpvd(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (ChartUIComponent.this.AYXKKw().OLrzqt().isAdded()) {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new ChartUIComponent$initProfitView$17$1$onSuccess$1(ChartUIComponent.this, null), 2, null);
            }
        }

        @Override // o.AbstractC48864udi.ActionBar
        public void OLrzqt(Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            AbstractC48864udi.ActionBar.C0977ActionBar.copydefault(this, th);
            ChartUIComponent.this.valueOf();
        }
    }

    private final void AEQbTJ(List<? extends oLP> list) {
        if (this.copydefault.OLrzqt().isAdded()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.copydefault), null, null, new ChartUIComponent$showKlineEventDialog$1(this, list, null), 3, null);
        }
    }

    private final void QbewEr() {
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml == null || (c36250oUv = oml.AuCTel) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null || templateSettingWlaJM.getSideIndicatorNames() == null) {
            return;
        }
        C39358pqm.TaskDescription taskDescription = C39358pqm.Companion;
        String strAuCTel = this.copydefault.AuCTel();
        if (strAuCTel == null) {
            strAuCTel = "";
        }
        C39358pqm c39358pqmNewInstance$default = C39358pqm.TaskDescription.newInstance$default(taskDescription, false, strAuCTel, 1, null);
        c39358pqmNewInstance$default.AEQbTJ(new Function1() { // from class: o.plR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.djBIcL(this.OLrzqt, (MarketTypeSelect) obj);
            }
        });
        c39358pqmNewInstance$default.KWHzl(new DialogInterface.OnDismissListener() { // from class: o.plY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                ChartUIComponent.OLrzqt(this.EZpvd, dialogInterface);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = this.copydefault.OLrzqt().getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        String simpleName = this.copydefault.OLrzqt().getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        c39358pqmNewInstance$default.EZpvd(childFragmentManager, simpleName);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v26, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v28, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v29, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v30, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v31, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v32, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit djBIcL(ChartUIComponent chartUIComponent, final MarketTypeSelect marketTypeSelect) {
        String strOLrzqt;
        oML oml;
        C39756pyO c39756pyO;
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        if (Intrinsics.EZpvd((Object) marketTypeSelect.getSelectTypeName(), (Object) "VOLUME") && !Intrinsics.EZpvd((Object) chartUIComponent.copydefault.getNewProxyInstance(), (Object) "TYPE_KLINE")) {
            if (marketTypeSelect.getGroup() == 0 && (oml = (oML) chartUIComponent.iwGUEr.KWHzl()) != null && (c39756pyO = oml.fIwbmz) != null) {
                c39756pyO.setMainIndicatorSelect();
            }
            return Unit.INSTANCE;
        }
        chartUIComponent.copydefault.values().AEQbTJ(marketTypeSelect);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        String selectTypeName = marketTypeSelect.getSelectTypeName();
        int iHashCode = selectTypeName.hashCode();
        if (iHashCode != -1757553894) {
            if (iHashCode != 81860) {
                if (iHashCode == 2044557 && selectTypeName.equals("BOLL")) {
                    strOLrzqt = marketTypeSelect.getGroup() == 0 ? "BOLL_MAIN" : "BOLL_SUB";
                } else {
                    strOLrzqt = C39215poB.OLrzqt.OLrzqt(marketTypeSelect.getSelectTypeName());
                }
            } else if (selectTypeName.equals("SAR")) {
                strOLrzqt = marketTypeSelect.getGroup() == 0 ? "SAR_MAIN" : "SAR_SUB";
            }
        } else if (selectTypeName.equals("VOLUME")) {
            strOLrzqt = marketTypeSelect.getGroup() == 0 ? "VOLUME_MAIN" : "VOLUME_SUB";
        }
        objectRef.element = strOLrzqt;
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLine_IndicatorPop_Button_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.plA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.AEQbTJ(objectRef, marketTypeSelect, (EventParamsList) obj);
            }
        });
        pXB pxb = pXB.EZpvd;
        String lowerCase = ((String) objectRef.element).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        pxb.AEQbTJ("Kline_Indicator_Select", C56423yEv.EZpvd(C56390yDp.OLrzqt("indicator", lowerCase)));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(Ref.ObjectRef objectRef, MarketTypeSelect marketTypeSelect, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        String lowerCase = ((String) objectRef.element).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        eventParamsList.put("app_indicator_type", lowerCase, true);
        eventParamsList.put("status", marketTypeSelect.isSelect() ? "turn_on" : "turn_off", true);
        eventParamsList.put("terminal", "app", true);
        eventParamsList.put("chart_layout", "classic", true);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ChartUIComponent chartUIComponent, DialogInterface dialogInterface) {
        C39816pzV c39816pzV;
        oML oml = (oML) chartUIComponent.iwGUEr.KWHzl();
        if (oml == null || (c39816pzV = oml.getFieldNames) == null) {
            return;
        }
        c39816pzV.setData();
    }

    public final void AEQbTJ(boolean z) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        C36246oUr.copydefault().AubY(z);
        pEI.EZpvd.KWHzl(z);
        this.EZpvd = false;
        ejfBZ();
        copydefault();
        zsXlph();
        this.copydefault.OLrzqt().onResume();
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml != null && (linearLayout2 = oml.ejfBZ) != null) {
            linearLayout2.setVisibility(8);
        }
        oML oml2 = (oML) this.iwGUEr.KWHzl();
        if (oml2 == null || (linearLayout = oml2.DbNXlk) == null) {
            return;
        }
        linearLayout.setVisibility(0);
    }

    private final void copydefault(MarketTypeSelect marketTypeSelect) {
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        ArrayList<String> sideIndicatorNames;
        oML oml;
        C39756pyO c39756pyO;
        C39756pyO c39756pyO2;
        C36250oUv c36250oUv2;
        oML oml2 = (oML) this.iwGUEr.KWHzl();
        if (oml2 != null && (c36250oUv2 = oml2.AuCTel) != null) {
            this.copydefault.AubY().AhwBna().setValue(Boolean.TRUE);
            if (!marketTypeSelect.isSelect()) {
                OLrzqt(marketTypeSelect.getSelectTypeName(), false, marketTypeSelect.getGroup() == 0);
            }
            TemplateSetting templateSettingWlaJM2 = c36250oUv2.wlaJM();
            Intrinsics.checkNotNullExpressionValue(templateSettingWlaJM2, "");
            if (marketTypeSelect.getGroup() == 0) {
                if (marketTypeSelect.isSelect()) {
                    if (templateSettingWlaJM2.getSPTimeInterval() > -1) {
                        c36250oUv2.setMainIndicator(marketTypeSelect.getSelectTypeName());
                    }
                } else if (templateSettingWlaJM2.getSPTimeInterval() > -1 && Intrinsics.EZpvd((Object) marketTypeSelect.getSelectTypeName(), (Object) "VOLUME")) {
                    c36250oUv2.dNCPSb();
                } else {
                    c36250oUv2.OLrzqt(marketTypeSelect.getSelectTypeName());
                }
                if (marketTypeSelect.isSelect()) {
                    OLrzqt(marketTypeSelect.getSelectTypeName(), true, marketTypeSelect.getGroup() == 0);
                }
            } else {
                EZpvd(marketTypeSelect.isSelect(), marketTypeSelect.getSelectTypeName());
            }
        }
        if (marketTypeSelect.getGroup() == 0) {
            oML oml3 = (oML) this.iwGUEr.KWHzl();
            if (oml3 == null || (c39756pyO2 = oml3.fIwbmz) == null) {
                return;
            }
            c39756pyO2.setMainIndicatorSelect();
            return;
        }
        oML oml4 = (oML) this.iwGUEr.KWHzl();
        if (oml4 == null || (c36250oUv = oml4.AuCTel) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null || (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) == null || (oml = (oML) this.iwGUEr.KWHzl()) == null || (c39756pyO = oml.fIwbmz) == null) {
            return;
        }
        c39756pyO.setSideIndicators(sideIndicatorNames);
    }

    private final void OLrzqt(String str, boolean z, boolean z2) {
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH;
        IndicatorDataReq indicatorDataReqAEQbTJ = AEQbTJ(str, z, z2);
        if (indicatorDataReqAEQbTJ == null || (stateListAnimatorUzCIH = this.copydefault.uzCIH()) == null) {
            return;
        }
        stateListAnimatorUzCIH.KWHzl(this.copydefault.OLrzqt(), indicatorDataReqAEQbTJ);
    }

    public final void EZpvd(@NotNull ArrayList<IndicatorDataReq> arrayList) {
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH;
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && (!arrayList.isEmpty()) && (stateListAnimatorUzCIH = this.copydefault.uzCIH()) != null) {
            stateListAnimatorUzCIH.EZpvd(this.copydefault.OLrzqt(), arrayList);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final IndicatorDataReq AEQbTJ(String str, boolean z, boolean z2) {
        String str2;
        C36250oUv c36250oUv;
        AbstractC36262oVg abstractC36262oVgAEQbTJ;
        C36250oUv c36250oUv2;
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && C33129mqd.OLrzqt((CharSequence) str)) {
            switch (str.hashCode()) {
                case -2040464843:
                    str2 = !str.equals("LSAcco") ? str : "ELITE_LSR";
                    break;
                case 2044557:
                    str2 = !str.equals("BOLL") ? str : "BB";
                    break;
                case 63511234:
                    str2 = !str.equals("BSVol") ? str : "TAKER_BS";
                    break;
                case 72740685:
                    str2 = !str.equals("LSPos") ? str : "ELITE_OI_LSR";
                    break;
                case 1185755844:
                    str2 = !str.equals("LSRatio") ? str : "LSR";
                    break;
                case 1768025685:
                    str2 = !str.equals("StochRSI") ? str : "STOCH_RSI";
                    break;
                default:
                    str2 = str;
                    break;
            }
            IndicatorBean indicatorBean = new IndicatorBean(str2, z2, null, Boolean.valueOf(z));
            C37957pGz c37957pGz = C37957pGz.copydefault;
            InterfaceC37953pGv interfaceC37953pGvOLrzqt = c37957pGz.OLrzqt(str2);
            if (z2) {
                oML oml = (oML) this.iwGUEr.KWHzl();
                abstractC36262oVgAEQbTJ = (oml == null || (c36250oUv2 = oml.AuCTel) == null) ? null : c36250oUv2.OLrzqt("ds0", str);
                if (abstractC36262oVgAEQbTJ != null) {
                    String strOLrzqt = interfaceC37953pGvOLrzqt != null ? interfaceC37953pGvOLrzqt.OLrzqt(abstractC36262oVgAEQbTJ, indicatorBean, z) : null;
                    if (strOLrzqt != null) {
                        if (z2) {
                            str2 = ((Object) str2) + c37957pGz.OLrzqt();
                        }
                        return new IndicatorDataReq(str2, strOLrzqt, z ? "0" : "1", null, 8, null);
                    }
                }
            } else {
                oML oml2 = (oML) this.iwGUEr.KWHzl();
                if (oml2 != null && (c36250oUv = oml2.AuCTel) != null) {
                    abstractC36262oVgAEQbTJ = c36250oUv.AEQbTJ("ds0.indic" + str);
                }
                if (abstractC36262oVgAEQbTJ != null) {
                }
            }
        }
        return null;
    }

    private final void EZpvd(boolean z, String str) {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        C36250oUv c36250oUv3;
        C36250oUv c36250oUv4;
        C36250oUv c36250oUv5;
        C36250oUv c36250oUv6;
        ArrayList<String> sideIndicatorNames;
        ArrayList<String> sideIndicatorNames2;
        this.copydefault.AubY().AYXKKw().setValue(Boolean.TRUE);
        ArrayList<IndicatorDataReq> arrayList = new ArrayList<>();
        Integer numValueOf = null;
        if (z) {
            TemplateSetting templateSetting = this.ejfBZ;
            int size = (templateSetting == null || (sideIndicatorNames2 = templateSetting.getSideIndicatorNames()) == null) ? 0 : sideIndicatorNames2.size();
            if (size >= 4) {
                TemplateSetting templateSetting2 = this.ejfBZ;
                String str2 = (templateSetting2 == null || (sideIndicatorNames = templateSetting2.getSideIndicatorNames()) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(sideIndicatorNames);
                if (str2 == null) {
                    str2 = "";
                }
                IndicatorDataReq indicatorDataReqAEQbTJ = AEQbTJ(str2, false, false);
                if (indicatorDataReqAEQbTJ != null) {
                    arrayList.add(indicatorDataReqAEQbTJ);
                }
            }
            TemplateSetting templateSetting3 = this.ejfBZ;
            if (templateSetting3 != null) {
                templateSetting3.addSideIndicator(str);
            }
            oML oml = (oML) this.iwGUEr.KWHzl();
            if (oml != null && (c36250oUv6 = oml.AuCTel) != null) {
                c36250oUv6.copydefault(str);
            }
            KlineQuoteDataComponent klineQuoteDataComponent = this.copydefault;
            TemplateSetting templateSetting4 = this.ejfBZ;
            klineQuoteDataComponent.KWHzl(templateSetting4 != null ? templateSetting4.getSideIndicatorNames() : null);
            if (size < 4 && this.copydefault.RcXXUw()) {
                KlineQuoteDataComponent klineQuoteDataComponent2 = this.copydefault;
                klineQuoteDataComponent2.AEQbTJ(klineQuoteDataComponent2.iwGUEr() + C36246oUr.copydefault().accept());
                oML oml2 = (oML) this.iwGUEr.KWHzl();
                if (oml2 != null && (c36250oUv4 = oml2.AuCTel) != null) {
                    oML oml3 = (oML) this.iwGUEr.KWHzl();
                    if (oml3 != null && (c36250oUv5 = oml3.AuCTel) != null) {
                        numValueOf = Integer.valueOf(c36250oUv5.getMinimumHeight() + C36246oUr.copydefault().accept());
                    }
                    Intrinsics.copydefault(numValueOf);
                    c36250oUv4.setMinimumHeight(numValueOf.intValue());
                }
            }
        } else {
            TemplateSetting templateSetting5 = this.ejfBZ;
            if (templateSetting5 != null) {
                templateSetting5.removeSideIndicator(str);
            }
            oML oml4 = (oML) this.iwGUEr.KWHzl();
            if (oml4 != null && (c36250oUv3 = oml4.AuCTel) != null) {
                c36250oUv3.gEmmrt(str);
            }
            KlineQuoteDataComponent klineQuoteDataComponent3 = this.copydefault;
            TemplateSetting templateSetting6 = this.ejfBZ;
            klineQuoteDataComponent3.KWHzl(templateSetting6 != null ? templateSetting6.getSideIndicatorNames() : null);
            if (this.copydefault.RcXXUw()) {
                KlineQuoteDataComponent klineQuoteDataComponent4 = this.copydefault;
                klineQuoteDataComponent4.AEQbTJ(klineQuoteDataComponent4.iwGUEr() - C36246oUr.copydefault().accept());
                oML oml5 = (oML) this.iwGUEr.KWHzl();
                if (oml5 != null && (c36250oUv = oml5.AuCTel) != null) {
                    oML oml6 = (oML) this.iwGUEr.KWHzl();
                    if (oml6 != null && (c36250oUv2 = oml6.AuCTel) != null) {
                        numValueOf = Integer.valueOf(c36250oUv2.getMinimumHeight() - C36246oUr.copydefault().accept());
                    }
                    Intrinsics.copydefault(numValueOf);
                    c36250oUv.setMinimumHeight(numValueOf.intValue());
                }
            }
        }
        if (z) {
            IndicatorDataReq indicatorDataReqAEQbTJ2 = AEQbTJ(str, z, false);
            if (indicatorDataReqAEQbTJ2 != null) {
                arrayList.add(indicatorDataReqAEQbTJ2);
            }
            EZpvd(arrayList);
        }
    }

    public final boolean AEQbTJ() {
        C39757pyP c39757pyP;
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml == null || (c39757pyP = oml.AxsJAY) == null) {
            return false;
        }
        View childAt = c39757pyP.getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "");
        if (childAt != null) {
            return c39757pyP.getWidth() < childAt.getMeasuredWidth();
        }
        return false;
    }

    public final void KWHzl(@NotNull ArrayList<String> arrayList, @NotNull ArrayList<String> arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        C37908pFd.KWHzl(arrayList, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(final String str, final String str2) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("PlaceOrder_Kline_TradeTools_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pnh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartUIComponent.KWHzl(str, str2, this, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(String str, String str2, ChartUIComponent chartUIComponent, EventParamsList eventParamsList) {
        String str3 = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tool_type", str, true);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str2, true);
        String strAuCTel = chartUIComponent.copydefault.AuCTel();
        if (strAuCTel != null) {
            String lowerCase = strAuCTel.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase != null) {
                str3 = lowerCase;
            }
        }
        eventParamsList.put("biz_type", str3, true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    public final void copydefault(String str) {
        pUU.copydefault("ChartUIComponent", str);
        FragmentActivity activity = this.copydefault.OLrzqt().getActivity();
        if (activity == null || !this.copydefault.OLrzqt().isAdded() || activity.isFinishing()) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(final PriceWarningItemBean priceWarningItemBean) {
        Context context = this.copydefault.OLrzqt().getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.OAhWiU));
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C35964oKf.Fragment.GGlJim));
            viewOnClickListenerC54939xaY.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.aKErDB), new View.OnClickListener() { // from class: o.pmg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ChartUIComponent.AEQbTJ(this.copydefault, priceWarningItemBean, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C35964oKf.Fragment.RcXXUw), (View.OnClickListener) null);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void AEQbTJ(ChartUIComponent chartUIComponent, PriceWarningItemBean priceWarningItemBean, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        String strAuCTel = chartUIComponent.copydefault.AuCTel();
        if (strAuCTel != null) {
            priceWarningItemBean.setBizType(pEU.copydefault.copydefault(strAuCTel));
        }
        chartUIComponent.copydefault.OLrzqt(priceWarningItemBean, RequestParameters.SUBRESOURCE_DELETE);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static /* synthetic */ void dealWithFastKlineTime$default(ChartUIComponent chartUIComponent, long j, long j2, KlineTimeAnchorType klineTimeAnchorType, KlineTimeToolType klineTimeToolType, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dealWithFastKlineTime");
        }
        chartUIComponent.KWHzl(j, j2, (i & 4) != 0 ? KlineTimeAnchorType.AnchorCenter : klineTimeAnchorType, (i & 8) != 0 ? KlineTimeToolType.KLineJump : klineTimeToolType, (i & 16) != 0 ? true : z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(long j, long j2, KlineTimeAnchorType klineTimeAnchorType, KlineTimeToolType klineTimeToolType, boolean z) {
        C36250oUv c36250oUv;
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH;
        oML oml = (oML) this.iwGUEr.KWHzl();
        if (oml == null || (c36250oUv = oml.AuCTel) == null || (stateListAnimatorUzCIH = this.copydefault.uzCIH()) == null) {
            return;
        }
        C36348oYl c36348oYlZuBGHE = zuBGHE();
        AbstractC39028pka abstractC39028pkaOLrzqt = this.copydefault.OLrzqt();
        MarketCoinInfo marketCoinInfoHDKMBd = this.copydefault.hDKMBd();
        String instrumentId = marketCoinInfoHDKMBd != null ? marketCoinInfoHDKMBd.getInstrumentId() : null;
        MarketCoinInfo marketCoinInfoHDKMBd2 = this.copydefault.hDKMBd();
        c36348oYlZuBGHE.OLrzqt(c36250oUv, abstractC39028pkaOLrzqt, instrumentId, marketCoinInfoHDKMBd2 != null ? marketCoinInfoHDKMBd2.getInstrumentType() : null, j, j2, pEF.OLrzqt.OLrzqt(C36246oUr.copydefault().ODWQjV()), new ActionBar(stateListAnimatorUzCIH), klineTimeToolType, klineTimeAnchorType, z);
    }

    public static final class ActionBar implements InterfaceC36351oYo {
        public final /* synthetic */ InterfaceC39563puh.StateListAnimator EZpvd;

        public ActionBar(InterfaceC39563puh.StateListAnimator stateListAnimator) {
            this.EZpvd = stateListAnimator;
        }

        @Override // o.InterfaceC36351oYo
        public void AEQbTJ() {
            ChartUIComponent.this.hDKMBd();
        }

        @Override // o.InterfaceC36351oYo
        public void EZpvd() {
            ChartUIComponent.this.valueOf();
        }

        @Override // o.InterfaceC36351oYo
        public void KWHzl() {
            this.EZpvd.AEQbTJ();
        }

        @Override // o.InterfaceC36351oYo
        public void EZpvd(androidx.fragment.app.Fragment fragment, String str, String str2, String str3, Function1<? super String, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(function1, "");
            InterfaceC39563puh.StateListAnimator.TaskDescription.getHistoryMarketCandles$default(this.EZpvd, fragment, str, str2, str3, false, function1, 16, null);
        }

        @Override // o.InterfaceC36351oYo
        public void OLrzqt(androidx.fragment.app.Fragment fragment, int i, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(fragment, "");
            InterfaceC39563puh.StateListAnimator.TaskDescription.loadKline$default(this.EZpvd, fragment, i, z, z2, null, 16, null);
        }
    }

    public final void KWHzl(ArrayList<Triple<AbstractC36262oVg, Boolean, KlineIndicatorBean>> arrayList) {
        oML oml;
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        C39756pyO c39756pyO;
        C36250oUv c36250oUv3;
        TemplateSetting templateSetting;
        ArrayList<String> sideIndicatorNames;
        ArrayList<String> sideIndicatorNames2;
        oML oml2;
        C39756pyO c39756pyO2;
        TemplateSetting templateSetting2;
        ArrayList<String> sideIndicatorNames3;
        C36250oUv c36250oUv4;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                Triple triple = (Triple) it.next();
                AbstractC36262oVg first = (AbstractC36262oVg) triple.getFirst();
                KlineIndicatorBean klineIndicatorBean = (KlineIndicatorBean) triple.getThird();
                if (((Boolean) triple.getSecond()).booleanValue()) {
                    oML oml3 = (oML) this.iwGUEr.KWHzl();
                    if (oml3 != null && (c36250oUv3 = oml3.AuCTel) != null) {
                        c36250oUv3.AEQbTJ(first);
                    }
                    pEV pev = pEV.OLrzqt;
                    String strEjfBZ = first.ejfBZ();
                    Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
                    pev.OLrzqt(strEjfBZ, Intrinsics.EZpvd((Object) klineIndicatorBean.getShow(), (Object) "0"));
                    oML oml4 = (oML) this.iwGUEr.KWHzl();
                    if (oml4 != null && (c39756pyO = oml4.fIwbmz) != null) {
                        c39756pyO.setMainIndicatorSelect();
                    }
                    if (!Intrinsics.EZpvd((Object) klineIndicatorBean.getKeyName(), (Object) "VOLUME")) {
                        if (Intrinsics.EZpvd((Object) klineIndicatorBean.getKeyName(), (Object) ("VOLUME" + C37957pGz.copydefault.OLrzqt()))) {
                        }
                    }
                    AbstractC36262oVg first2 = new pGP().AEQbTJ(klineIndicatorBean).getFirst();
                    oML oml5 = (oML) this.iwGUEr.KWHzl();
                    if (oml5 != null && (c36250oUv2 = oml5.AuCTel) != null) {
                        c36250oUv2.copydefault(first2);
                    }
                    if (Intrinsics.EZpvd((Object) klineIndicatorBean.getShow(), (Object) "1") && (oml = (oML) this.iwGUEr.KWHzl()) != null && (c36250oUv = oml.AuCTel) != null) {
                        c36250oUv.dNCPSb();
                    }
                } else {
                    if (Intrinsics.EZpvd((Object) klineIndicatorBean.getKeyName(), (Object) "VOLUME")) {
                        first = new pGP().AEQbTJ(klineIndicatorBean).getFirst();
                    }
                    oML oml6 = (oML) this.iwGUEr.KWHzl();
                    if (oml6 != null && (c36250oUv4 = oml6.AuCTel) != null) {
                        c36250oUv4.OLrzqt(first);
                    }
                    if (Intrinsics.EZpvd((Object) klineIndicatorBean.getShow(), (Object) "0") && ((templateSetting2 = this.ejfBZ) == null || (sideIndicatorNames3 = templateSetting2.getSideIndicatorNames()) == null || !sideIndicatorNames3.contains(first.ejfBZ()))) {
                        String strEjfBZ2 = first.ejfBZ();
                        Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
                        EZpvd(true, strEjfBZ2);
                    } else if (Intrinsics.EZpvd((Object) klineIndicatorBean.getShow(), (Object) "1") && (templateSetting = this.ejfBZ) != null && (sideIndicatorNames = templateSetting.getSideIndicatorNames()) != null && sideIndicatorNames.contains(first.ejfBZ())) {
                        String strEjfBZ3 = first.ejfBZ();
                        Intrinsics.checkNotNullExpressionValue(strEjfBZ3, "");
                        EZpvd(false, strEjfBZ3);
                    }
                    pEV pev2 = pEV.OLrzqt;
                    String strEjfBZ4 = first.ejfBZ();
                    Intrinsics.checkNotNullExpressionValue(strEjfBZ4, "");
                    pev2.KWHzl(strEjfBZ4, Intrinsics.EZpvd((Object) klineIndicatorBean.getShow(), (Object) "0"));
                    TemplateSetting templateSetting3 = this.ejfBZ;
                    if (templateSetting3 != null && (sideIndicatorNames2 = templateSetting3.getSideIndicatorNames()) != null && (oml2 = (oML) this.iwGUEr.KWHzl()) != null && (c39756pyO2 = oml2.fIwbmz) != null) {
                        c39756pyO2.setSideIndicators(sideIndicatorNames2);
                    }
                }
            }
        }
    }
}
