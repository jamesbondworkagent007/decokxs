package com.okinc.tradingbot.impl.strategy.view.helper;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.camera.video.AudioStats;
import androidx.core.util.Pair;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.core.util.SPUtils;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.tradeapi.bean.CurrencyModel;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitSheet;
import com.okinc.tradingbot.impl.order.strategy.data.BotModel;
import com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet;
import com.okinc.tradingbot.impl.order.strategy.grid.domain.SmartEarnParamsCheckUseCase;
import com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringBuyModifyInvestmentViewModel;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.FirstTimeBuyOption;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.RecurringBuyFrequency;
import com.okinc.tradingbot.impl.share.BotPreShareBottomSheet;
import com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotModifyReq;
import com.okinc.unify_trade.biz.BotModifyResp;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.FetchMultiInstsResult;
import com.okinc.unify_trade.biz.PlaceOrderCondition;
import com.okinc.unify_trade.biz.RecurringBuyDetails;
import com.okinc.unify_trade.biz.RecurringBuyDto;
import com.okinc.unify_trade.biz.RecurringEditCycleTimeReq;
import com.okinc.unify_trade.biz.RecurringEditPriceRangeReq;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.RecurringModifyInvestmentReq;
import com.okinc.unify_trade.biz.RecurringPriceRangeItem;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SpotGridAddInvestmentInfo;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.StrategyStopReq;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.ThirdSignalDetail;
import com.okinc.unify_trade.biz.ToggleReinvestmentReq;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.VoucherStatus;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.bot.constant.TacticsForbiddenFunctions;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.EditCoinPairBean;
import com.okinc.unify_trade.bot.data.ProfitDetailData;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import com.okinc.unify_trade.bot.data.SignalCoinPairBean;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import com.okinc.unify_trade.bot.data.SignalMultiCoinPairSelectItemData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.grid.bean.ResumeSpotGridData;
import com.okinc.unify_trade.bot.presenter.BotOperatorButtonViewModel;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC53377wkO;
import o.ActivityC50108vCe;
import o.ActivityC50114vCk;
import o.ActivityC50125vCv;
import o.ActivityC52122vzt;
import o.ActivityC52272wFg;
import o.ActivityC53830wsr;
import o.ActivityC53931wum;
import o.ActivityC53940wuv;
import o.C32113mPz;
import o.C33061mpO;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C38303pTu;
import o.C43251rlk;
import o.C48033uCm;
import o.C49662usl;
import o.C50139vDi;
import o.C50225vGn;
import o.C50404vNd;
import o.C50626vVj;
import o.C50719vYv;
import o.C52324wHe;
import o.C52560wPy;
import o.C52602wRm;
import o.C52659wTp;
import o.C52761wXj;
import o.C52917wbf;
import o.C52925wbn;
import o.C53173wgW;
import o.C53223whT;
import o.C53604wod;
import o.C53613wom;
import o.C53769wrj;
import o.C53841wtB;
import o.C53845wtF;
import o.C53858wtS;
import o.C53875wtj;
import o.C53883wtr;
import o.C53913wuU;
import o.C53989wvr;
import o.C54589xNz;
import o.C54782xVc;
import o.C54799xVt;
import o.C55298xhM;
import o.C55326xho;
import o.C55328xhq;
import o.C55688xof;
import o.C55697xoo;
import o.C55770xqH;
import o.C55801xqm;
import o.C55887xsS;
import o.C55998xuX;
import o.C56033xvF;
import o.C56068xvo;
import o.C56111xwe;
import o.C56260xzU;
import o.C56390yDp;
import o.C56392yDr;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56548yJl;
import o.InterfaceC33075mpc;
import o.InterfaceC49425uoM;
import o.InterfaceC49497upf;
import o.InterfaceC52662wTs;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.ViewOnClickListenerC54939xaY;
import o.pUU;
import o.uCT;
import o.uCZ;
import o.vCQ;
import o.vDZ;
import o.vGL;
import o.vGZ;
import o.vMR;
import o.vPC;
import o.vSR;
import o.vVF;
import o.vWP;
import o.vYG;
import o.vZA;
import o.vZJ;
import o.wQD;
import o.wYK;
import o.xAE;
import o.xLX;
import o.xMR;
import o.yHS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotOperatorButtonDisposer implements DefaultLifecycleObserver {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public InterfaceC52662wTs AEQbTJ;
    public Function0<Unit> AYXKKw;
    public ViewOnClickListenerC54939xaY AhwBna;
    public Function0<Unit> EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public boolean copydefault;
    public Toast djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public ViewOnClickListenerC54939xaY valueOf;

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    public BotOperatorButtonDisposer(InterfaceC52662wTs interfaceC52662wTs, boolean z) {
        this.AEQbTJ = interfaceC52662wTs;
        this.copydefault = z;
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.wRF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotOperatorButtonDisposer.fIwbmz(this.EZpvd);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.wRG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotOperatorButtonDisposer.AkhnZx(this.copydefault);
            }
        });
        InterfaceC52662wTs interfaceC52662wTs2 = this.AEQbTJ;
        if (interfaceC52662wTs2 instanceof LifecycleOwner) {
            Intrinsics.copydefault(interfaceC52662wTs2, "");
            interfaceC52662wTs2.getLifecycle().addObserver(this);
            BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = OLrzqt();
            if (botOperatorButtonViewModelOLrzqt != null) {
                interfaceC52662wTs2.getLifecycle().addObserver(botOperatorButtonViewModelOLrzqt);
            }
            copydefault(interfaceC52662wTs2);
            OLrzqt(interfaceC52662wTs2);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.wTs)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(o.wTs, boolean):void (m)] (LINE:196) call: com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer.<init>(o.wTs, boolean):void type: THIS */
    public /* synthetic */ BotOperatorButtonDisposer(InterfaceC52662wTs interfaceC52662wTs, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC52662wTs, (i & 2) != 0 ? false : z);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final BotOperatorButtonViewModel OLrzqt() {
        return (BotOperatorButtonViewModel) this.gEmmrt.getValue();
    }

    public static final BotOperatorButtonViewModel fIwbmz(BotOperatorButtonDisposer botOperatorButtonDisposer) {
        ViewModelStoreOwner viewModelStoreOwner;
        LifecycleOwner lifecycleOwner = botOperatorButtonDisposer.AEQbTJ;
        if (lifecycleOwner instanceof Fragment) {
            Intrinsics.copydefault(lifecycleOwner, "");
            viewModelStoreOwner = (Fragment) lifecycleOwner;
        } else if (lifecycleOwner instanceof FragmentActivity) {
            Intrinsics.copydefault(lifecycleOwner, "");
            viewModelStoreOwner = (FragmentActivity) lifecycleOwner;
        } else {
            viewModelStoreOwner = null;
        }
        if (viewModelStoreOwner != null) {
            return (BotOperatorButtonViewModel) new ViewModelProvider(viewModelStoreOwner).get(BotOperatorButtonViewModel.class);
        }
        return null;
    }

    public final BotOperatorViewModel copydefault() {
        return (BotOperatorViewModel) this.OLrzqt.getValue();
    }

    public static final BotOperatorViewModel AkhnZx(BotOperatorButtonDisposer botOperatorButtonDisposer) {
        ViewModelStoreOwner viewModelStoreOwner;
        LifecycleOwner lifecycleOwner = botOperatorButtonDisposer.AEQbTJ;
        if (lifecycleOwner instanceof Fragment) {
            Intrinsics.copydefault(lifecycleOwner, "");
            viewModelStoreOwner = (Fragment) lifecycleOwner;
        } else if (lifecycleOwner instanceof FragmentActivity) {
            Intrinsics.copydefault(lifecycleOwner, "");
            viewModelStoreOwner = (FragmentActivity) lifecycleOwner;
        } else {
            viewModelStoreOwner = null;
        }
        if (viewModelStoreOwner != null) {
            return (BotOperatorViewModel) new ViewModelProvider(viewModelStoreOwner).get(BotOperatorViewModel.class);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context AEQbTJ() {
        LifecycleOwner lifecycleOwner = this.AEQbTJ;
        if (lifecycleOwner instanceof Fragment) {
            Intrinsics.copydefault(lifecycleOwner, "");
            return ((Fragment) lifecycleOwner).getContext();
        }
        if (!(lifecycleOwner instanceof FragmentActivity)) {
            return null;
        }
        Intrinsics.copydefault(lifecycleOwner, "");
        return (FragmentActivity) lifecycleOwner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentManager valueOf() {
        LifecycleOwner lifecycleOwner = this.AEQbTJ;
        if (lifecycleOwner instanceof Fragment) {
            Intrinsics.copydefault(lifecycleOwner, "");
            return ((Fragment) lifecycleOwner).getChildFragmentManager();
        }
        if (!(lifecycleOwner instanceof FragmentActivity)) {
            return null;
        }
        Intrinsics.copydefault(lifecycleOwner, "");
        return ((FragmentActivity) lifecycleOwner).getSupportFragmentManager();
    }

    public final void OLrzqt(LifecycleOwner lifecycleOwner) {
        FragmentManager fragmentManagerValueOf = valueOf();
        if (fragmentManagerValueOf != null) {
            fragmentManagerValueOf.setFragmentResultListener("tp_sl_settings", lifecycleOwner, new FragmentResultListener() { // from class: o.wSI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    BotOperatorButtonDisposer.copydefault(this.EZpvd, str, bundle);
                }
            });
        }
    }

    public static final void copydefault(BotOperatorButtonDisposer botOperatorButtonDisposer, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs != null) {
            InterfaceC52662wTs.TaskDescription.showSnackbar$default(interfaceC52662wTs, C33070mpX.AYXKKw(C55688xof.Application.onMultiWindowModeChanged), 3, false, 4, null);
        }
    }

    private final void copydefault(LifecycleOwner lifecycleOwner) {
        C56111xwe<List<Object>> c56111xweWlaJM;
        C56111xwe<List<Object>> c56111xweUzCIH;
        C56111xwe<List<Object>> c56111xweAubY;
        C56111xwe<List<Object>> newProxyInstance;
        C56111xwe<ResumeSpotGridData> c56111xweIsConnected;
        C56111xwe<ResumeSpotGridData> c56111xweFIwbmz;
        C56111xwe<StrategyResponse> c56111xweAkhnZx;
        LiveData<Pair<String, Exception>> aggregateErrorLiveData;
        LiveData<Pair<String, Boolean>> aggregateLoadingLiveData;
        MediatorLiveData<SignalCoinPairBean> mediatorLiveDataEZpvd;
        C56111xwe<ProfitDetailData> c56111xweAYXKKw;
        C56111xwe<BotModifyResp> c56111xweEjfBZ;
        C56111xwe<BotModifyResp> c56111xweIwGUEr;
        C56111xwe<SpotGridAddInvestmentInfo> c56111xweZuBGHE;
        TradeLiveData<List<Object>> tradeLiveDataCopydefault;
        C56111xwe<TacticsData> c56111xweGHZMYf;
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt != null && (c56111xweGHZMYf = botOperatorButtonViewModelOLrzqt.gHZMYf()) != null) {
            c56111xweGHZMYf.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wSi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotOperatorButtonDisposer.ejfBZ(this.OLrzqt, (TacticsData) obj);
                }
            }));
        }
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt2 = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt2 != null && (tradeLiveDataCopydefault = botOperatorButtonViewModelOLrzqt2.copydefault()) != null) {
            tradeLiveDataCopydefault.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wSr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotOperatorButtonDisposer.AhwBna(this.OLrzqt, (java.util.List) obj);
                }
            }));
        }
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt3 = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt3 != null && (c56111xweZuBGHE = botOperatorButtonViewModelOLrzqt3.zuBGHE()) != null) {
            c56111xweZuBGHE.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wSu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotOperatorButtonDisposer.OLrzqt(this.AEQbTJ, (SpotGridAddInvestmentInfo) obj);
                }
            }));
        }
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt4 = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt4 != null && (c56111xweIwGUEr = botOperatorButtonViewModelOLrzqt4.iwGUEr()) != null) {
            c56111xweIwGUEr.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wSt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotOperatorButtonDisposer.copydefault(this.EZpvd, (BotModifyResp) obj);
                }
            }));
        }
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt5 = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt5 != null && (c56111xweEjfBZ = botOperatorButtonViewModelOLrzqt5.ejfBZ()) != null) {
            c56111xweEjfBZ.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wSv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotOperatorButtonDisposer.OLrzqt(this.OLrzqt, (BotModifyResp) obj);
                }
            }));
        }
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt6 = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt6 != null && (c56111xweAYXKKw = botOperatorButtonViewModelOLrzqt6.AYXKKw()) != null) {
            c56111xweAYXKKw.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wSs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotOperatorButtonDisposer.KWHzl(this.AEQbTJ, (ProfitDetailData) obj);
                }
            }));
        }
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt7 = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt7 != null && (mediatorLiveDataEZpvd = botOperatorButtonViewModelOLrzqt7.EZpvd()) != null) {
            mediatorLiveDataEZpvd.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wSy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotOperatorButtonDisposer.AEQbTJ(this.copydefault, (SignalCoinPairBean) obj);
                }
            }));
        }
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt8 = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt8 != null && (aggregateLoadingLiveData = botOperatorButtonViewModelOLrzqt8.getAggregateLoadingLiveData()) != null) {
            aggregateLoadingLiveData.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wSw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotOperatorButtonDisposer.OLrzqt(this.copydefault, (androidx.core.util.Pair) obj);
                }
            }));
        }
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt9 = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt9 != null && (aggregateErrorLiveData = botOperatorButtonViewModelOLrzqt9.getAggregateErrorLiveData()) != null) {
            aggregateErrorLiveData.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wSA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotOperatorButtonDisposer.EZpvd(this.OLrzqt, (androidx.core.util.Pair) obj);
                }
            }));
        }
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt10 = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt10 != null && (c56111xweAkhnZx = botOperatorButtonViewModelOLrzqt10.AkhnZx()) != null) {
            c56111xweAkhnZx.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wSz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotOperatorButtonDisposer.AEQbTJ(this.KWHzl, (StrategyResponse) obj);
                }
            }));
        }
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt11 = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt11 != null && (c56111xweFIwbmz = botOperatorButtonViewModelOLrzqt11.fIwbmz()) != null) {
            c56111xweFIwbmz.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wSk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotOperatorButtonDisposer.OLrzqt(this.EZpvd, (ResumeSpotGridData) obj);
                }
            }));
        }
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt12 = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt12 != null && (c56111xweIsConnected = botOperatorButtonViewModelOLrzqt12.isConnected()) != null) {
            c56111xweIsConnected.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wSo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotOperatorButtonDisposer.KWHzl(this.KWHzl, (ResumeSpotGridData) obj);
                }
            }));
        }
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt13 = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt13 != null && (newProxyInstance = botOperatorButtonViewModelOLrzqt13.getNewProxyInstance()) != null) {
            newProxyInstance.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wSq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotOperatorButtonDisposer.djBIcL(this.copydefault, (java.util.List) obj);
                }
            }));
        }
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt14 = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt14 != null && (c56111xweAubY = botOperatorButtonViewModelOLrzqt14.AubY()) != null) {
            c56111xweAubY.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wSp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotOperatorButtonDisposer.AYXKKw(this.KWHzl, (java.util.List) obj);
                }
            }));
        }
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt15 = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt15 != null && (c56111xweUzCIH = botOperatorButtonViewModelOLrzqt15.uzCIH()) != null) {
            c56111xweUzCIH.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wSn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotOperatorButtonDisposer.valueOf(this.OLrzqt, (java.util.List) obj);
                }
            }));
        }
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt16 = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt16 != null && (c56111xweWlaJM = botOperatorButtonViewModelOLrzqt16.wlaJM()) != null) {
            c56111xweWlaJM.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wSm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotOperatorButtonDisposer.gEmmrt(this.AEQbTJ, (java.util.List) obj);
                }
            }));
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new BotOperatorButtonDisposer$initObserve$17(lifecycleOwner, this, null), 3, null);
    }

    public static final Unit ejfBZ(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData) {
        botOperatorButtonDisposer.AEQbTJ(tacticsData);
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs != null) {
            interfaceC52662wTs.DbNXlk();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(BotOperatorButtonDisposer botOperatorButtonDisposer, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs != null) {
            InterfaceC52662wTs.TaskDescription.showSnackbar$default(interfaceC52662wTs, C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatMediaSessionImplApi18), 3, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(BotOperatorButtonDisposer botOperatorButtonDisposer, SpotGridAddInvestmentInfo spotGridAddInvestmentInfo) {
        FragmentManager fragmentManagerValueOf;
        if (spotGridAddInvestmentInfo != null && (fragmentManagerValueOf = botOperatorButtonDisposer.valueOf()) != null) {
            C53913wuU.TaskDescription taskDescription = C53913wuU.Companion;
            BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
            taskDescription.AEQbTJ(botOperatorButtonViewModelOLrzqt != null ? botOperatorButtonViewModelOLrzqt.fJNWhG() : null, spotGridAddInvestmentInfo).show(fragmentManagerValueOf, "SpotGridAddInvestmentDialog");
            botOperatorButtonDisposer.EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(BotOperatorButtonDisposer botOperatorButtonDisposer, BotModifyResp botModifyResp) {
        String strAYXKKw;
        Intrinsics.checkNotNullParameter(botModifyResp, "");
        if (Intrinsics.EZpvd((Object) botModifyResp.getState(), (Object) "running") || Intrinsics.EZpvd((Object) botModifyResp.getState(), (Object) "live")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.zvzmfz);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.GiPPlLRPuVlr);
        }
        C55326xho.toastWithSuccessfulIcon$default(strAYXKKw, 0, 1, (Object) null);
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs != null) {
            interfaceC52662wTs.DbNXlk();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(BotOperatorButtonDisposer botOperatorButtonDisposer, BotModifyResp botModifyResp) {
        String strAYXKKw;
        TacticsData tacticsDataFJNWhG;
        Intrinsics.checkNotNullParameter(botModifyResp, "");
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
        if (botOperatorButtonViewModelOLrzqt != null && (tacticsDataFJNWhG = botOperatorButtonViewModelOLrzqt.fJNWhG()) != null && tacticsDataFJNWhG.getReinvestment()) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.frkDMe);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.dzCpvv);
        }
        C55326xho.toastWithSuccessfulIcon$default(strAYXKKw, 0, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(final BotOperatorButtonDisposer botOperatorButtonDisposer, ProfitDetailData profitDetailData) {
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt;
        final TacticsData tacticsDataFJNWhG;
        Intrinsics.checkNotNullParameter(profitDetailData, "");
        if (StringsKt__StringsKt.fARcdN((CharSequence) profitDetailData.getExceptionMsg())) {
            FragmentManager fragmentManagerValueOf = botOperatorButtonDisposer.valueOf();
            if (fragmentManagerValueOf != null && (botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt()) != null && (tacticsDataFJNWhG = botOperatorButtonViewModelOLrzqt.fJNWhG()) != null) {
                C53604wod.Companion.OLrzqt(profitDetailData, tacticsDataFJNWhG, new Function1() { // from class: o.wSM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return BotOperatorButtonDisposer.OLrzqt(this.EZpvd, tacticsDataFJNWhG, (TacticsData) obj);
                    }
                }).show(fragmentManagerValueOf, C53604wod.class.getSimpleName());
            }
        } else {
            C55326xho.toastWithFailedIcon$default(profitDetailData.getExceptionMsg(), 0, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData, TacticsData tacticsData2) {
        Intrinsics.checkNotNullParameter(tacticsData2, "");
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs != null) {
            interfaceC52662wTs.EZpvd(tacticsData);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(BotOperatorButtonDisposer botOperatorButtonDisposer, final SignalCoinPairBean signalCoinPairBean) {
        String originalLevel;
        if (signalCoinPairBean == null) {
            return Unit.INSTANCE;
        }
        final FragmentManager fragmentManagerValueOf = botOperatorButtonDisposer.valueOf();
        if (fragmentManagerValueOf != null) {
            vZA.Activity activity = vZA.Companion;
            ArrayList<SignalMultiCoinPairSelectItemData> dataList = signalCoinPairBean.getDataList();
            TacticsData data = signalCoinPairBean.getData();
            if (data == null || (originalLevel = data.getOriginalLevel()) == null) {
                originalLevel = "";
            }
            activity.KWHzl(dataList, originalLevel, C33070mpX.AYXKKw(C55688xof.Application.wtf), new Function2() { // from class: o.wSC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return BotOperatorButtonDisposer.AEQbTJ(signalCoinPairBean, fragmentManagerValueOf, (java.util.List) obj, ((java.lang.Boolean) obj2).booleanValue());
                }
            }).show(fragmentManagerValueOf);
            botOperatorButtonDisposer.EZpvd();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r10v13, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(BotOperatorButtonDisposer botOperatorButtonDisposer, Pair pair) {
        String strAYXKKw;
        TacticsData tacticsDataFJNWhG;
        xAE xaeAuCTel;
        C56260xzU fieldNames;
        String str = (String) pair.first;
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
        String strBB_ = null;
        if (Intrinsics.EZpvd((Object) str, (Object) ((botOperatorButtonViewModelOLrzqt == null || (fieldNames = botOperatorButtonViewModelOLrzqt.getFieldNames()) == null) ? null : fieldNames.bB_()))) {
            if (((Boolean) pair.second).booleanValue()) {
                botOperatorButtonDisposer.AYXKKw();
            } else {
                botOperatorButtonDisposer.AhwBna();
            }
        } else {
            BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt2 = botOperatorButtonDisposer.OLrzqt();
            if (botOperatorButtonViewModelOLrzqt2 != null && (xaeAuCTel = botOperatorButtonViewModelOLrzqt2.AuCTel()) != null) {
                strBB_ = xaeAuCTel.bB_();
            }
            if (Intrinsics.EZpvd((Object) str, (Object) strBB_)) {
                if (((Boolean) pair.second).booleanValue()) {
                    BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt3 = botOperatorButtonDisposer.OLrzqt();
                    if (botOperatorButtonViewModelOLrzqt3 != null && (tacticsDataFJNWhG = botOperatorButtonViewModelOLrzqt3.fJNWhG()) != null && tacticsDataFJNWhG.getReinvestment()) {
                        strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.QfJbVf);
                    } else {
                        strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.DUUtXg);
                    }
                    botOperatorButtonDisposer.djBIcL = C55328xhq.showWithLoading$default(C55328xhq.OLrzqt, strAYXKKw, null, 0, null, 0, 0, 62, null);
                } else {
                    Toast toast = botOperatorButtonDisposer.djBIcL;
                    if (toast != null) {
                        toast.cancel();
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(BotOperatorButtonDisposer botOperatorButtonDisposer, Pair pair) {
        Intrinsics.copydefault(pair);
        String str = (String) pair.first;
        Exception exc = (Exception) pair.second;
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
        if (botOperatorButtonViewModelOLrzqt == null) {
            return Unit.INSTANCE;
        }
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        if (Intrinsics.EZpvd((Object) str, (Object) botOperatorButtonViewModelOLrzqt.OLrzqt().bB_()) || Intrinsics.EZpvd((Object) str, (Object) botOperatorButtonViewModelOLrzqt.sSMYrx().bB_()) || Intrinsics.EZpvd((Object) str, (Object) botOperatorButtonViewModelOLrzqt.getFieldNames().bB_()) || Intrinsics.EZpvd((Object) str, (Object) botOperatorButtonViewModelOLrzqt.valueOf().bB_()) || Intrinsics.EZpvd((Object) str, (Object) botOperatorButtonViewModelOLrzqt.AwvSrB().bB_()) || Intrinsics.EZpvd((Object) str, (Object) botOperatorButtonViewModelOLrzqt.AEQbTJ().bB_()) || Intrinsics.EZpvd((Object) str, (Object) botOperatorButtonViewModelOLrzqt.zLjUOn().bB_()) || Intrinsics.EZpvd((Object) str, (Object) botOperatorButtonViewModelOLrzqt.AuCTelauCTel().bB_()) || Intrinsics.EZpvd((Object) str, (Object) botOperatorButtonViewModelOLrzqt.hDKMBd().bB_()) || Intrinsics.EZpvd((Object) str, (Object) botOperatorButtonViewModelOLrzqt.zsXlph().bB_())) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
        } else if (Intrinsics.EZpvd((Object) str, (Object) botOperatorButtonViewModelOLrzqt.AhwBna().bB_())) {
            BizApiException bizApiException = exc instanceof BizApiException ? (BizApiException) exc : null;
            if (!Intrinsics.EZpvd((Object) (bizApiException != null ? bizApiException.getCode() : null), (Object) "55153")) {
                C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
            }
        } else if (Intrinsics.EZpvd((Object) str, (Object) botOperatorButtonViewModelOLrzqt.AuCTel().bB_())) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
            pUU.copydefault("BotOperatorButtonDisposer", "Toggle Reinvestment Failed: " + message);
        } else if (Intrinsics.EZpvd((Object) str, (Object) botOperatorButtonViewModelOLrzqt.gEmmrt().bB_())) {
            pUU.copydefault("BotOperatorButtonDisposer", "get profit info failed: " + message);
        } else if (Intrinsics.EZpvd((Object) str, (Object) botOperatorButtonViewModelOLrzqt.fetchVPNInfo().bB_())) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = botOperatorButtonDisposer.valueOf;
            if (viewOnClickListenerC54939xaY != null) {
                viewOnClickListenerC54939xaY.dismiss();
            }
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
            pUU.copydefault("BotOperatorButtonDisposer", "Pause Spot Grid Failed: " + message);
        } else if (Intrinsics.EZpvd((Object) str, (Object) botOperatorButtonViewModelOLrzqt.fARcdN().bB_())) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = botOperatorButtonDisposer.AhwBna;
            if (viewOnClickListenerC54939xaY2 != null) {
                viewOnClickListenerC54939xaY2.dismiss();
            }
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
            pUU.copydefault("BotOperatorButtonDisposer", "Resume Spot Grid Failed: " + message);
        } else if (Intrinsics.EZpvd((Object) str, (Object) botOperatorButtonViewModelOLrzqt.values().bB_())) {
            pUU.copydefault("BotOperatorButtonDisposer", "Query Resume Status Failed: " + message);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wTs.TaskDescription.showSnackbar$default(o.wTs, java.lang.String, int, boolean, int, java.lang.Object):void */
    public static final Unit AEQbTJ(BotOperatorButtonDisposer botOperatorButtonDisposer, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = botOperatorButtonDisposer.valueOf;
        if (viewOnClickListenerC54939xaY != null) {
            viewOnClickListenerC54939xaY.dismiss();
        }
        botOperatorButtonDisposer.EZpvd();
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs != null) {
            InterfaceC52662wTs.TaskDescription.showSnackbar$default(interfaceC52662wTs, C33070mpX.AYXKKw(C55688xof.Application.GiPPlLRPuVlr), 3, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(BotOperatorButtonDisposer botOperatorButtonDisposer, ResumeSpotGridData resumeSpotGridData) {
        Intrinsics.checkNotNullParameter(resumeSpotGridData, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = botOperatorButtonDisposer.AhwBna;
        if (viewOnClickListenerC54939xaY != null) {
            viewOnClickListenerC54939xaY.dismiss();
        }
        botOperatorButtonDisposer.EZpvd();
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs != null) {
            InterfaceC52662wTs.TaskDescription.showSnackbar$default(interfaceC52662wTs, C33070mpX.AYXKKw(C55688xof.Application.zvzmfz), 3, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(BotOperatorButtonDisposer botOperatorButtonDisposer, ResumeSpotGridData resumeSpotGridData) {
        C56111xwe<String> c56111xweDbNXlk;
        Intrinsics.checkNotNullParameter(resumeSpotGridData, "");
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
        String value = (botOperatorButtonViewModelOLrzqt == null || (c56111xweDbNXlk = botOperatorButtonViewModelOLrzqt.DbNXlk()) == null) ? null : c56111xweDbNXlk.getValue();
        pUU.copydefault("mQueryResumeStatusLiveData mQuoteMax " + value + "," + resumeSpotGridData.getTopUpAmt());
        botOperatorButtonDisposer.KWHzl(resumeSpotGridData.getAlgoId(), resumeSpotGridData.getTopUpAmt(), C33129mqd.AEQbTJ(resumeSpotGridData.getTopUpAmt(), "0"), resumeSpotGridData.getCcy());
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(BotOperatorButtonDisposer botOperatorButtonDisposer, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        botOperatorButtonDisposer.EZpvd();
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs != null) {
            InterfaceC52662wTs.TaskDescription.showSnackbar$default(interfaceC52662wTs, C33070mpX.AYXKKw(C48033uCm.Fragment.geAOna), 3, false, 4, null);
        }
        InterfaceC52662wTs interfaceC52662wTs2 = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs2 != null) {
            interfaceC52662wTs2.DbNXlk();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(BotOperatorButtonDisposer botOperatorButtonDisposer, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        botOperatorButtonDisposer.EZpvd();
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs != null) {
            InterfaceC52662wTs.TaskDescription.showSnackbar$default(interfaceC52662wTs, C33070mpX.AYXKKw(C48033uCm.Fragment.geAOna), 3, false, 4, null);
        }
        InterfaceC52662wTs interfaceC52662wTs2 = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs2 != null) {
            interfaceC52662wTs2.DbNXlk();
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(BotOperatorButtonDisposer botOperatorButtonDisposer, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        botOperatorButtonDisposer.EZpvd();
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs != null) {
            InterfaceC52662wTs.TaskDescription.showSnackbar$default(interfaceC52662wTs, C33070mpX.AYXKKw(C48033uCm.Fragment.geAOna), 3, false, 4, null);
        }
        InterfaceC52662wTs interfaceC52662wTs2 = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs2 != null) {
            interfaceC52662wTs2.DbNXlk();
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(BotOperatorButtonDisposer botOperatorButtonDisposer, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        botOperatorButtonDisposer.EZpvd();
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs != null) {
            InterfaceC52662wTs.TaskDescription.showSnackbar$default(interfaceC52662wTs, C33070mpX.AYXKKw(C48033uCm.Fragment.fmB), 3, false, 4, null);
        }
        InterfaceC52662wTs interfaceC52662wTs2 = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs2 != null) {
            interfaceC52662wTs2.DbNXlk();
        }
        return Unit.INSTANCE;
    }

    public final boolean djBIcL(TacticsData tacticsData) {
        return !Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "opening") || C33129mqd.AhwBna(tacticsData.getFilledPercentage(), 0);
    }

    public static /* synthetic */ void startConfirm$default(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        botOperatorButtonDisposer.EZpvd(tacticsData, str);
    }

    public final void EZpvd(final TacticsData tacticsData, String str) {
        FragmentManager fragmentManagerValueOf = valueOf();
        if (fragmentManagerValueOf != null) {
            C52925wbn.TaskDescription taskDescription = C52925wbn.Companion;
            BotVo bot = tacticsData.getBot();
            taskDescription.EZpvd(fragmentManagerValueOf, tacticsData, str, bot != null ? C52917wbf.Companion.OLrzqt(bot, tacticsData) : false, new Function0() { // from class: o.wRK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return BotOperatorButtonDisposer.fARcdN(this.EZpvd, tacticsData);
                }
            });
        }
    }

    public static final Unit fARcdN(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData) {
        botOperatorButtonDisposer.AEQbTJ(tacticsData);
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onDestroy(lifecycleOwner);
        lifecycleOwner.getLifecycle().removeObserver(this);
        this.AEQbTJ = null;
        this.EZpvd = null;
        this.AYXKKw = null;
    }

    public final void AEQbTJ(String str, @NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        dispose$default(this, str, tacticsData, null, null, null, null, 56, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void dispose$default(BotOperatorButtonDisposer botOperatorButtonDisposer, String str, TacticsData tacticsData, Function0 function0, Function0 function02, C56111xwe c56111xwe, C56111xwe c56111xwe2, int i, Object obj) {
        botOperatorButtonDisposer.AEQbTJ(str, tacticsData, (Function0<Unit>) function0, (Function0<Unit>) ((i & 8) != 0 ? null : function02), (C56111xwe<String>) ((i & 16) != 0 ? null : c56111xwe), (C56111xwe<String>) ((i & 32) != 0 ? null : c56111xwe2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [653=46] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0878 A[ADDED_TO_REGION, REMOVE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(String str, @NotNull final TacticsData tacticsData, Function0<Unit> function0, Function0<Unit> function02, C56111xwe<String> c56111xwe, C56111xwe<String> c56111xwe2) {
        String tvTitle;
        BotVo bot;
        BotCommon common;
        BotCommon common2;
        String tvTitle2;
        BotVo bot2;
        BotCommon common3;
        BotCommon common4;
        RecurringBuyDto recurring;
        C56111xwe<String> c56111xweDbNXlk;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt != null) {
            botOperatorButtonViewModelOLrzqt.KWHzl(tacticsData);
            Unit unit = Unit.INSTANCE;
        }
        if (c56111xwe2 != null) {
            BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt2 = OLrzqt();
            if (botOperatorButtonViewModelOLrzqt2 != null) {
                botOperatorButtonViewModelOLrzqt2.OLrzqt(c56111xwe2);
                Unit unit2 = Unit.INSTANCE;
            }
            Unit unit3 = Unit.INSTANCE;
        }
        if (c56111xwe != null) {
            BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt3 = OLrzqt();
            if (botOperatorButtonViewModelOLrzqt3 != null) {
                botOperatorButtonViewModelOLrzqt3.AEQbTJ(c56111xwe);
                Unit unit4 = Unit.INSTANCE;
            }
            Unit unit5 = Unit.INSTANCE;
        }
        String value = c56111xwe2 != null ? c56111xwe2.getValue() : null;
        String value2 = c56111xwe != null ? c56111xwe.getValue() : null;
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt4 = OLrzqt();
        pUU.copydefault("mQueryResumeStatusLiveData mBaseMax " + value + " mQuoteMax " + value2 + " viewModel" + ((botOperatorButtonViewModelOLrzqt4 == null || (c56111xweDbNXlk = botOperatorButtonViewModelOLrzqt4.DbNXlk()) == null) ? null : c56111xweDbNXlk.getValue()));
        FragmentManager fragmentManagerValueOf = valueOf();
        if (fragmentManagerValueOf != null) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1866204256:
                        if (str.equals("edit_name")) {
                            BotVo bot3 = tacticsData.getBot();
                            if (!C33129mqd.OLrzqt((CharSequence) ((bot3 == null || (common2 = bot3.getCommon()) == null) ? null : common2.getStgyName())) || (bot = tacticsData.getBot()) == null || (common = bot.getCommon()) == null || (tvTitle = common.getStgyName()) == null) {
                                tvTitle = tacticsData.getTvTitle();
                            }
                            C50404vNd.Companion.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatCustomActionBuilder), tvTitle, (52 & 4) != 0 ? 40 : 0, true, (52 & 16) != 0 ? null : null, (52 & 32) != 0 ? null : null, new Function2() { // from class: o.wRT
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return BotOperatorButtonDisposer.KWHzl(this.AEQbTJ, tacticsData, (java.lang.String) obj, ((java.lang.Boolean) obj2).booleanValue());
                                }
                            }).show(fragmentManagerValueOf, "BotOperatorButtonDisposer");
                            Unit unit6 = Unit.INSTANCE;
                        } else {
                            Unit unit7 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -1773919395:
                        if (str.equals("strategy_button_adjust_margin")) {
                            AEQbTJ(tacticsData, fragmentManagerValueOf);
                            EZpvd();
                            Unit unit8 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -1655491746:
                        if (str.equals("strategy_button_related_position")) {
                            Context contextAEQbTJ = AEQbTJ();
                            if (contextAEQbTJ != null) {
                                ActivityC52272wFg.Application application = ActivityC52272wFg.Companion;
                                String algoId = tacticsData.getAlgoId();
                                String orderType = tacticsData.getOrderType();
                                BotVo bot4 = tacticsData.getBot();
                                application.KWHzl(contextAEQbTJ, algoId, orderType, (984 & 8) != 0 ? null : "1", (984 & 16) != 0 ? "" : null, (984 & 32) != 0 ? null : null, (984 & 64) != 0 ? null : null, (984 & 128) != 0 ? null : tacticsData, (984 & 256) != 0 ? false : (bot4 != null ? bot4.getBacktest() : null) != null, (984 & 512) != 0 ? false : false);
                                Unit unit9 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -1411487333:
                        if (str.equals("recurring_modify_amount")) {
                            FragmentManager fragmentManagerValueOf2 = valueOf();
                            if (fragmentManagerValueOf2 != null) {
                                vVF.Companion.OLrzqt(tacticsData, RecurringBuyModifyInvestmentViewModel.Mode.MODIFY_AMOUNT, new Function2() { // from class: o.wRQ
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return BotOperatorButtonDisposer.KWHzl(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2);
                                    }
                                }).show(fragmentManagerValueOf2, "RecurringBuyModifyInvestmentBottomSheet");
                                Unit unit10 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -1366787209:
                        if (str.equals("strategy_modify_stop_condition")) {
                            Context contextAEQbTJ2 = AEQbTJ();
                            if (contextAEQbTJ2 != null) {
                                if (Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "contract_dca")) {
                                    ActivityC50125vCv.Companion.AEQbTJ(contextAEQbTJ2, tacticsData);
                                } else {
                                    ActivityC53940wuv.Companion.EZpvd(contextAEQbTJ2, tacticsData);
                                }
                                EZpvd();
                                Unit unit11 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -1360252850:
                        if (str.equals("strategy_button_restart")) {
                            String str2 = Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "pause") ? "running" : "pause";
                            BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt5 = OLrzqt();
                            if (botOperatorButtonViewModelOLrzqt5 != null) {
                                botOperatorButtonViewModelOLrzqt5.OLrzqt(new BotModifyReq(str2, tacticsData.getOrderType(), tacticsData.getAlgoId()));
                                Unit unit12 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -934426579:
                        if (str.equals("resume")) {
                            BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt6 = OLrzqt();
                            if (botOperatorButtonViewModelOLrzqt6 != null) {
                                botOperatorButtonViewModelOLrzqt6.AEQbTJ(tacticsData.getAlgoId());
                                Unit unit13 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -933078812:
                        if (str.equals("DeleteBacktest")) {
                            Context contextAEQbTJ3 = AEQbTJ();
                            if (contextAEQbTJ3 != null) {
                                uCT uct = uCT.copydefault;
                                InterfaceC52662wTs interfaceC52662wTs = this.AEQbTJ;
                                Intrinsics.copydefault(interfaceC52662wTs, "");
                                uct.EZpvd(contextAEQbTJ3, interfaceC52662wTs, tacticsData.getAlgoId(), new Function0() { // from class: o.wRX
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return BotOperatorButtonDisposer.values(this.EZpvd);
                                    }
                                }, new Function1() { // from class: o.wSd
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return BotOperatorButtonDisposer.EZpvd((java.lang.String) obj);
                                    }
                                });
                                Unit unit14 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -918420701:
                        if (str.equals("strategy_button_trading_view_signal")) {
                            vSR.StateListAnimator.newInstance$default(vSR.Companion, tacticsData.getAlgoId(), (Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "running") || Intrinsics.EZpvd((Object) tacticsData.getState(), (Object) "stopping")) ? false : true, false, 4, null).show(fragmentManagerValueOf, "CopyTradingviewInfoDialog");
                            EZpvd();
                            Unit unit15 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -900037503:
                        if (str.equals("strategy_button_details")) {
                            Context contextAEQbTJ4 = AEQbTJ();
                            if (contextAEQbTJ4 != null) {
                                ActivityC52272wFg.Application application2 = ActivityC52272wFg.Companion;
                                String algoId2 = tacticsData.getAlgoId();
                                String orderType2 = tacticsData.getOrderType();
                                BotVo bot5 = tacticsData.getBot();
                                application2.KWHzl(contextAEQbTJ4, algoId2, orderType2, (984 & 8) != 0 ? null : null, (984 & 16) != 0 ? "" : null, (984 & 32) != 0 ? null : null, (984 & 64) != 0 ? null : null, (984 & 128) != 0 ? null : tacticsData, (984 & 256) != 0 ? false : (bot5 != null ? bot5.getBacktest() : null) != null, (984 & 512) != 0 ? false : false);
                                Unit unit16 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -840828177:
                        if (str.equals("un_pin")) {
                            Context contextAEQbTJ5 = AEQbTJ();
                            if (contextAEQbTJ5 != null) {
                                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextAEQbTJ5);
                                viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.createHandler));
                                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.ActivityViewModelLazyKt));
                                viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C55688xof.Application.fetchVPNInfo), new View.OnClickListener() { // from class: o.wRU
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(android.view.View view) {
                                        BotOperatorButtonDisposer.gEmmrt(this.EZpvd, tacticsData, viewOnClickListenerC54939xaY, view);
                                    }
                                });
                                viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.OnBackPressedDispatcherKt), new View.OnClickListener() { // from class: o.wRV
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(android.view.View view) {
                                        BotOperatorButtonDisposer.DbNXlk(viewOnClickListenerC54939xaY, view);
                                    }
                                });
                                viewOnClickListenerC54939xaY.show();
                                Unit unit17 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -702985433:
                        if (str.equals("strategy_button_edit_trading_pairs")) {
                            OLrzqt(tacticsData);
                            Unit unit18 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -688946819:
                        if (str.equals("StopAiBot")) {
                            valueOf(tacticsData);
                            EZpvd();
                            Unit unit19 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -674762535:
                        if (str.equals("view_on_kline")) {
                            EZpvd(tacticsData);
                            EZpvd();
                            Unit unit20 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -532178074:
                        if (!str.equals("complianceResumeFail")) {
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -266229020:
                        if (str.equals("strategy_button_adjust_withdrawal")) {
                            valueOf(tacticsData, fragmentManagerValueOf);
                            Unit unit21 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -222301146:
                        if (str.equals("CreateAiBotFromBacktest")) {
                            AYXKKw();
                            BotOperatorViewModel botOperatorViewModelCopydefault = copydefault();
                            if (botOperatorViewModelCopydefault != null) {
                                botOperatorViewModelCopydefault.KWHzl(tacticsData.getAlgoId());
                                Unit unit22 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -213435403:
                        if (!str.equals("strategy_button_pause")) {
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -210118047:
                        if (str.equals("strategy_button_start")) {
                            BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt7 = OLrzqt();
                            if (botOperatorButtonViewModelOLrzqt7 != null) {
                                botOperatorButtonViewModelOLrzqt7.AEQbTJ(c56111xwe);
                                Unit unit23 = Unit.INSTANCE;
                            }
                            KWHzl(tacticsData, function0);
                            Unit unit24 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case -53097185:
                        if (str.equals("STRATEGY_SPOT_DCA_ADD_INVESTMENT")) {
                            KWHzl(tacticsData, fragmentManagerValueOf);
                            Unit unit25 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 110997:
                        if (str.equals("pin")) {
                            InterfaceC52662wTs interfaceC52662wTs2 = this.AEQbTJ;
                            C52324wHe c52324wHe = interfaceC52662wTs2 instanceof C52324wHe ? (C52324wHe) interfaceC52662wTs2 : null;
                            if (c52324wHe != null) {
                                c52324wHe.EZpvd(tacticsData.getAlgoId(), true);
                                Unit unit26 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 13978130:
                        if (str.equals("strategy_button_add_investment")) {
                            C53841wtB.Companion.KWHzl(tacticsData).show(fragmentManagerValueOf, C53841wtB.class.getSimpleName());
                            EZpvd();
                            Unit unit27 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 36088676:
                        if (str.equals("recurring_modify_price_range")) {
                            FragmentManager fragmentManagerValueOf3 = valueOf();
                            if (fragmentManagerValueOf3 != null) {
                                ArrayList<RecurringListItem> recItemList = tacticsData.getRecItemList();
                                if (recItemList != null) {
                                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(recItemList, 10));
                                    for (RecurringListItem recurringListItem : recItemList) {
                                        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                                        String strValueOf = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.valueOf(recurringListItem.getCcy()) : null;
                                        arrayList.add(new SelectCoinData(strValueOf, recurringListItem.getCcy(), recurringListItem.getRatio(), false, false, false, recurringListItem.getCcy() + "-" + tacticsData.getInvestCcy(), recurringListItem.getMinPrice(), recurringListItem.getMaxPrice(), null, AudioStats.AUDIO_AMPLITUDE_NONE, null, AudioStats.AUDIO_AMPLITUDE_NONE, 7736, null));
                                    }
                                    vMR.Companion.EZpvd(new ArrayList<>(arrayList), tacticsData.getAlgoId(), new Function2() { // from class: o.wRW
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return BotOperatorButtonDisposer.OLrzqt(this.KWHzl, (java.lang.String) obj, (java.util.ArrayList) obj2);
                                        }
                                    }).show(fragmentManagerValueOf3, "BotRecurringPriceRangeBottomSheet");
                                }
                                Unit unit28 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 78862271:
                        if (str.equals("SHARE")) {
                            if (function02 != null) {
                                function02.invoke();
                                Unit unit29 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 106440182:
                        if (str.equals("pause")) {
                            String algoId3 = tacticsData.getAlgoId();
                            SmartEarnParam simpleEarn = tacticsData.getSimpleEarn();
                            if (simpleEarn != null && simpleEarn.getEnabled()) {
                                z = true;
                            }
                            copydefault(algoId3, z);
                            Unit unit30 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 149470789:
                        if (str.equals("strategy_modify_start_condition")) {
                            Context contextAEQbTJ6 = AEQbTJ();
                            if (contextAEQbTJ6 != null) {
                                if (Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "contract_dca")) {
                                    ActivityC50114vCk.Companion.KWHzl(contextAEQbTJ6, tacticsData);
                                } else {
                                    ActivityC53931wum.Companion.copydefault(contextAEQbTJ6, tacticsData);
                                }
                                EZpvd();
                                Unit unit31 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 270133622:
                        if (str.equals("strategy_button_more")) {
                            AYXKKw();
                            this.AYXKKw = function02;
                            this.EZpvd = function0;
                            BotOperatorViewModel botOperatorViewModelCopydefault2 = copydefault();
                            if (botOperatorViewModelCopydefault2 != null) {
                                botOperatorViewModelCopydefault2.OLrzqt(tacticsData);
                                Unit unit32 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 270317091:
                        if (!str.equals("strategy_button_stop")) {
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 270343158:
                        if (str.equals("strategy_button_tpsl")) {
                            AYXKKw(tacticsData, fragmentManagerValueOf);
                            EZpvd();
                            Unit unit33 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 322024080:
                        if (str.equals("strategy_button_recreate")) {
                            if (Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "ai_bot")) {
                                AYXKKw();
                                BotVo bot6 = tacticsData.getBot();
                                z = (bot6 != null ? bot6.getBacktest() : null) != null;
                                BotOperatorViewModel botOperatorViewModelCopydefault3 = copydefault();
                                if (botOperatorViewModelCopydefault3 != null) {
                                    botOperatorViewModelCopydefault3.AEQbTJ(tacticsData.getAlgoId(), z);
                                    Unit unit34 = Unit.INSTANCE;
                                }
                            } else {
                                Context contextAEQbTJ7 = AEQbTJ();
                                if (contextAEQbTJ7 != null) {
                                    ActivityC52122vzt.Companion.OLrzqt(contextAEQbTJ7, C55998xuX.copydefault.copydefault(tacticsData), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "BotOperatorButton", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
                                    Unit unit35 = Unit.INSTANCE;
                                }
                                EZpvd();
                                Unit unit36 = Unit.INSTANCE;
                            }
                            break;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 334196078:
                        if (!str.equals("MORE_FUNC")) {
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 517247550:
                        if (str.equals("SMART_ARB_REDUCE_POSITION")) {
                            FragmentManager fragmentManagerValueOf4 = valueOf();
                            if (fragmentManagerValueOf4 != null) {
                                wQD.Companion.EZpvd(fragmentManagerValueOf4, tacticsData);
                                Unit unit37 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 569314151:
                        if (str.equals("strategy_button_tp_price")) {
                            OLrzqt(tacticsData, fragmentManagerValueOf);
                            EZpvd();
                            Unit unit38 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 665232559:
                        if (str.equals("strategy_button_add_order")) {
                            KWHzl(tacticsData, fragmentManagerValueOf);
                            Unit unit39 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 700833347:
                        if (str.equals("strategy_cancel_reserve")) {
                            KWHzl(tacticsData.getAlgoId(), true);
                            Unit unit40 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 741106358:
                        if (str.equals("strategy_button_manual_order")) {
                            KWHzl(tacticsData);
                            Unit unit41 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 780405820:
                        if (str.equals("RunBacktestAgain")) {
                            BotOperatorViewModel botOperatorViewModelCopydefault4 = copydefault();
                            if (botOperatorViewModelCopydefault4 != null) {
                                botOperatorViewModelCopydefault4.OLrzqt(tacticsData.getAlgoId());
                                Unit unit42 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 812978030:
                        if (str.equals("EditBacktestName")) {
                            BotVo bot7 = tacticsData.getBot();
                            if (!C33129mqd.OLrzqt((CharSequence) ((bot7 == null || (common4 = bot7.getCommon()) == null) ? null : common4.getStgyName())) || (bot2 = tacticsData.getBot()) == null || (common3 = bot2.getCommon()) == null || (tvTitle2 = common3.getStgyName()) == null) {
                                tvTitle2 = tacticsData.getTvTitle();
                            }
                            C50404vNd.Companion.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatCustomActionBuilder), tvTitle2, (52 & 4) != 0 ? 40 : 0, true, (52 & 16) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.zLjUOn), (52 & 32) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.AuCTelauCTel), new Function2() { // from class: o.wRY
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return BotOperatorButtonDisposer.EZpvd(this.AEQbTJ, tacticsData, (java.lang.String) obj, ((java.lang.Boolean) obj2).booleanValue());
                                }
                            }).show(fragmentManagerValueOf, "BotOperatorButtonDisposer");
                            Unit unit43 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 937102971:
                        if (str.equals("REINVEST_PROFIT")) {
                            C53845wtF.Companion.KWHzl(tacticsData).show(fragmentManagerValueOf, "SpotGridAddInvestmentDialog");
                            EZpvd();
                            Unit unit44 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 1085266328:
                        if (str.equals("modify_active_grid_range")) {
                            EZpvd(tacticsData, fragmentManagerValueOf);
                            Unit unit45 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 1112939579:
                        if (str.equals("StopBacktest")) {
                            Context contextAEQbTJ8 = AEQbTJ();
                            if (contextAEQbTJ8 != null) {
                                uCZ ucz = uCZ.copydefault;
                                InterfaceC52662wTs interfaceC52662wTs3 = this.AEQbTJ;
                                Intrinsics.copydefault(interfaceC52662wTs3, "");
                                ucz.copydefault(contextAEQbTJ8, interfaceC52662wTs3, tacticsData.getAlgoId(), new Function0() { // from class: o.wSb
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return BotOperatorButtonDisposer.DbNXlk(this.OLrzqt);
                                    }
                                }, new Function1() { // from class: o.wSa
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return BotOperatorButtonDisposer.copydefault((java.lang.String) obj);
                                    }
                                });
                                Unit unit46 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 1228725827:
                        if (str.equals("strategy_edit_dca_parameter")) {
                            if (AEQbTJ() != null) {
                                if (Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "spot_dca")) {
                                    C53173wgW.Companion.OLrzqt(tacticsData, new Function0() { // from class: o.wRP
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return BotOperatorButtonDisposer.fetchVPNInfo(this.copydefault);
                                        }
                                    }).show(fragmentManagerValueOf);
                                }
                                Unit unit47 = Unit.INSTANCE;
                                EZpvd();
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 1435023816:
                        if (str.equals("STRATEGY_SPOT_GRID__ADD_INVESTMENT")) {
                            BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt8 = OLrzqt();
                            if (botOperatorButtonViewModelOLrzqt8 != null) {
                                botOperatorButtonViewModelOLrzqt8.copydefault(tacticsData.getAlgoId());
                                Unit unit48 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 1521663722:
                        if (str.equals("reverse_bot")) {
                            copydefault(tacticsData);
                            Unit unit49 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 1605383006:
                        if (str.equals("strategy_edit_price_range")) {
                            if (AEQbTJ() != null) {
                                String orderType3 = tacticsData.getOrderType();
                                if (Intrinsics.EZpvd((Object) orderType3, (Object) "grid")) {
                                    vGL.Companion.OLrzqt(tacticsData).show(fragmentManagerValueOf);
                                } else if (Intrinsics.EZpvd((Object) orderType3, (Object) "contract_grid")) {
                                    C50225vGn.Companion.copydefault(tacticsData).show(fragmentManagerValueOf);
                                }
                                Unit unit50 = Unit.INSTANCE;
                                EZpvd();
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 1654288125:
                        if (str.equals("recurring_invest_more")) {
                            FragmentManager fragmentManagerValueOf5 = valueOf();
                            if (fragmentManagerValueOf5 != null) {
                                vVF.Companion.OLrzqt(tacticsData, RecurringBuyModifyInvestmentViewModel.Mode.INVEST_MORE, new Function2() { // from class: o.wSc
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return BotOperatorButtonDisposer.EZpvd(this.AEQbTJ, (java.lang.String) obj, (java.lang.String) obj2);
                                    }
                                }).show(fragmentManagerValueOf5, "RecurringBuyModifyInvestmentBottomSheet");
                                Unit unit51 = Unit.INSTANCE;
                            }
                            EZpvd();
                            Unit unit52 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 1677034225:
                        if (str.equals("strategy_reserve_stop")) {
                            KWHzl(tacticsData.getAlgoId(), false);
                            Unit unit53 = Unit.INSTANCE;
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 1682788997:
                        if (str.equals("strategy_modify_auto_margin")) {
                            Context contextAEQbTJ9 = AEQbTJ();
                            if (contextAEQbTJ9 != null) {
                                ActivityC50108vCe.Companion.KWHzl(contextAEQbTJ9, tacticsData);
                                EZpvd();
                                Unit unit54 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 1688944953:
                        if (str.equals("recurring_modify_frequency")) {
                            FragmentManager fragmentManagerValueOf6 = valueOf();
                            if (fragmentManagerValueOf6 != null) {
                                C50626vVj.ActionBar actionBar = C50626vVj.Companion;
                                RecurringBuyFrequency.Activity activity = RecurringBuyFrequency.Companion;
                                RecurringBuyDetails recurringBuyDetails = tacticsData.getRecurringBuyDetails();
                                String strOLrzqt = recurringBuyDetails != null ? recurringBuyDetails.OLrzqt() : null;
                                if (strOLrzqt == null) {
                                    strOLrzqt = "";
                                }
                                RecurringBuyDetails recurringBuyDetails2 = tacticsData.getRecurringBuyDetails();
                                String strEZpvd = recurringBuyDetails2 != null ? recurringBuyDetails2.EZpvd() : null;
                                RecurringBuyFrequency recurringBuyFrequencyCopydefault = activity.copydefault(strOLrzqt, strEZpvd != null ? strEZpvd : "");
                                RecurringBuyDetails recurringBuyDetails3 = tacticsData.getRecurringBuyDetails();
                                int iCopydefault = C56548yJl.copydefault(C33129mqd.AhwBna(recurringBuyDetails3 != null ? recurringBuyDetails3.copydefault() : null) - 1, 0);
                                RecurringBuyDetails recurringBuyDetails4 = tacticsData.getRecurringBuyDetails();
                                int iAhwBna = C33129mqd.AhwBna(recurringBuyDetails4 != null ? recurringBuyDetails4.gEmmrt() : null);
                                FirstTimeBuyOption.Application application3 = FirstTimeBuyOption.Companion;
                                BotVo bot8 = tacticsData.getBot();
                                actionBar.KWHzl(tacticsData.getAlgoId(), recurringBuyFrequencyCopydefault, iCopydefault, iAhwBna, application3.AEQbTJ(C33129mqd.gEmmrt((bot8 == null || (recurring = bot8.getRecurring()) == null) ? null : recurring.getRecurringTimeType())), new yHS() { // from class: o.wRS
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // o.yHS
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                                        return BotOperatorButtonDisposer.KWHzl(this.EZpvd, (java.lang.String) obj, (RecurringBuyFrequency) obj2, ((java.lang.Integer) obj3).intValue(), ((java.lang.Integer) obj4).intValue(), (FirstTimeBuyOption) obj5);
                                    }
                                }).show(fragmentManagerValueOf6, "RecurringBuyFrequencySelectionBottomSheet");
                                Unit unit55 = Unit.INSTANCE;
                            }
                        }
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                    case 1899963035:
                        if (str.equals("strategy_button_modify") && Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "twap")) {
                            AbstractC53377wkO.Companion.EZpvd(tacticsData, fragmentManagerValueOf, this.copydefault);
                        }
                        Unit unit56 = Unit.INSTANCE;
                        C52560wPy.copydefault.EZpvd(str, tacticsData);
                        break;
                }
            }
            Unit unit57 = Unit.INSTANCE;
        }
    }

    public static final Unit fetchVPNInfo(BotOperatorButtonDisposer botOperatorButtonDisposer) {
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs != null) {
            InterfaceC52662wTs.TaskDescription.showSnackbar$default(interfaceC52662wTs, C33070mpX.AYXKKw(C48033uCm.Fragment.geAOna), 3, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData, String str, boolean z) {
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        if (z && (botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt()) != null) {
            botOperatorButtonViewModelOLrzqt.EZpvd(tacticsData.getAlgoId(), str);
        }
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        C52324wHe c52324wHe = interfaceC52662wTs instanceof C52324wHe ? (C52324wHe) interfaceC52662wTs : null;
        if (c52324wHe != null) {
            c52324wHe.EZpvd(tacticsData.getAlgoId(), false);
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void DbNXlk(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit EZpvd(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData, String str, boolean z) {
        BotOperatorViewModel botOperatorViewModelCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        if (z && (botOperatorViewModelCopydefault = botOperatorButtonDisposer.copydefault()) != null) {
            botOperatorViewModelCopydefault.EZpvd(tacticsData.getAlgoId(), str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(BotOperatorButtonDisposer botOperatorButtonDisposer) {
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs != null) {
            InterfaceC52662wTs.TaskDescription.showSnackbar$default(interfaceC52662wTs, C33070mpX.AYXKKw(C48033uCm.Fragment.djSkpj), 3, false, 4, null);
        }
        InterfaceC52662wTs interfaceC52662wTs2 = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs2 != null) {
            interfaceC52662wTs2.gEmmrt();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.toastWithFailedIcon$default(str, 0, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit values(BotOperatorButtonDisposer botOperatorButtonDisposer) {
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs != null) {
            InterfaceC52662wTs.TaskDescription.showSnackbar$default(interfaceC52662wTs, C33070mpX.AYXKKw(C48033uCm.Fragment.aKErDB), 3, false, 4, null);
        }
        InterfaceC52662wTs interfaceC52662wTs2 = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs2 != null) {
            interfaceC52662wTs2.bz_();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.toastWithFailedIcon$default(str, 0, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(BotOperatorButtonDisposer botOperatorButtonDisposer, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
        if (botOperatorButtonViewModelOLrzqt != null) {
            botOperatorButtonViewModelOLrzqt.AEQbTJ(new RecurringModifyInvestmentReq(str, str2));
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(BotOperatorButtonDisposer botOperatorButtonDisposer, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
        if (botOperatorButtonViewModelOLrzqt != null) {
            botOperatorButtonViewModelOLrzqt.KWHzl(new RecurringModifyInvestmentReq(str, str2));
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(BotOperatorButtonDisposer botOperatorButtonDisposer, String str, RecurringBuyFrequency recurringBuyFrequency, int i, int i2, FirstTimeBuyOption firstTimeBuyOption) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(recurringBuyFrequency, "");
        Intrinsics.checkNotNullParameter(firstTimeBuyOption, "");
        String strGEmmrt = C33129mqd.gEmmrt(Integer.valueOf(firstTimeBuyOption.getOrderParamCode()));
        String strGEmmrt2 = C33129mqd.gEmmrt(Integer.valueOf(RecurringBuyFrequency.Companion.copydefault()));
        String period = recurringBuyFrequency.getPeriod();
        String recurringHour = Intrinsics.EZpvd((Object) recurringBuyFrequency.getPeriod(), (Object) "hourly") ? recurringBuyFrequency.getRecurringHour() : null;
        FirstTimeBuyOption firstTimeBuyOption2 = FirstTimeBuyOption.BUY_CUSTOM;
        RecurringEditCycleTimeReq recurringEditCycleTimeReq = new RecurringEditCycleTimeReq(str, strGEmmrt, strGEmmrt2, period, recurringHour, firstTimeBuyOption == firstTimeBuyOption2 ? String.valueOf(i + 1) : null, firstTimeBuyOption == firstTimeBuyOption2 ? String.valueOf(i2) : null);
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
        if (botOperatorButtonViewModelOLrzqt != null) {
            botOperatorButtonViewModelOLrzqt.copydefault(recurringEditCycleTimeReq);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.vGZ.StateListAnimator.newInstance$default(o.vGZ$StateListAnimator, android.os.Parcelable, boolean, java.lang.String, java.lang.String, android.os.Parcelable, int, java.lang.Object):o.vGZ */
    /* JADX DEBUG: Class process forced to load method for inline: o.vPC.StateListAnimator.newInstance$default(o.vPC$StateListAnimator, android.os.Parcelable, boolean, java.lang.String, java.lang.String, java.lang.String, android.os.Parcelable, int, java.lang.Object):o.vPC */
    public final void AYXKKw(TacticsData tacticsData, FragmentManager fragmentManager) {
        TradeLiveData<StrategyConfigInfo> tradeLiveDataKWHzl;
        boolean z = this.AEQbTJ instanceof ActivityC52272wFg;
        String orderType = tacticsData.getOrderType();
        if (Intrinsics.EZpvd((Object) orderType, (Object) "signal_bot")) {
            Intent intent = new Intent(AEQbTJ(), (Class<?>) vWP.class);
            intent.putExtra("request", new SignalBotReq((String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (EntrySignalOrderAmtParam) null, tacticsData.getSignalBotOrderStopParam(), false, (ThirdSignalDetail) null, false, (ArrayList) null, tacticsData.getInstId(), (AutoVipProfitInfo) null, 24319, (DefaultConstructorMarker) null));
            intent.putExtra("algoId", tacticsData.getAlgoId());
            Context contextAEQbTJ = AEQbTJ();
            if (contextAEQbTJ != null) {
                contextAEQbTJ.startActivity(intent);
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd((Object) orderType, (Object) "grid")) {
            vPC.StateListAnimator stateListAnimator = vPC.Companion;
            String orderType2 = tacticsData.getOrderType();
            BotOperatorViewModel botOperatorViewModelCopydefault = copydefault();
            vPC.StateListAnimator.newInstance$default(stateListAnimator, tacticsData, z, "from_edit", orderType2, null, (botOperatorViewModelCopydefault == null || (tradeLiveDataKWHzl = botOperatorViewModelCopydefault.KWHzl()) == null) ? null : tradeLiveDataKWHzl.getValue(), 16, null).show(fragmentManager, vPC.class.getSimpleName());
            return;
        }
        vGZ.StateListAnimator.newInstance$default(vGZ.Companion, tacticsData, z, "from_edit", tacticsData.getOrderType(), null, 16, null).show(fragmentManager, vGZ.class.getSimpleName());
    }

    public static /* synthetic */ void disposeDisableClick$default(BotOperatorButtonDisposer botOperatorButtonDisposer, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        botOperatorButtonDisposer.copydefault(str, str2);
    }

    public final void copydefault(String str, String str2) {
        InterfaceC52662wTs interfaceC52662wTs;
        if (Intrinsics.EZpvd((Object) str, (Object) "strategy_button_adjust_withdrawal")) {
            if (str2 == null || str2.length() == 0) {
                C55326xho.toast$default(C55688xof.Application.unregisterMediaButtonEventReceiver, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                return;
            }
            InterfaceC52662wTs interfaceC52662wTs2 = this.AEQbTJ;
            if (interfaceC52662wTs2 != null) {
                InterfaceC52662wTs.TaskDescription.showSnackbar$default(interfaceC52662wTs2, str2, 3, false, 4, null);
                return;
            }
            return;
        }
        if (!C33129mqd.OLrzqt((CharSequence) str2) || (interfaceC52662wTs = this.AEQbTJ) == null) {
            return;
        }
        InterfaceC52662wTs.TaskDescription.showSnackbar$default(interfaceC52662wTs, str2 == null ? "" : str2, 3, false, 4, null);
    }

    public final void AEQbTJ(@NotNull TacticsData tacticsData, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        if (Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "contract_dca")) {
            C50139vDi.Companion.AEQbTJ(tacticsData.getInstId(), tacticsData.getInstType(), tacticsData.getAlgoId(), tacticsData.getDirection(), tacticsData.getLevel(), fragmentManager);
        } else {
            C53858wtS.Companion.copydefault(tacticsData.getInstId(), tacticsData.getInstType(), tacticsData.getAlgoId(), tacticsData.getDirection(), tacticsData.getLevel(), Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "signal_bot"), tacticsData.getSignalOrderAmtParam()).show(fragmentManager, C53858wtS.class.getSimpleName());
        }
    }

    public final void KWHzl(@NotNull TacticsData tacticsData, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        String orderType = tacticsData.getOrderType();
        if (Intrinsics.EZpvd((Object) orderType, (Object) "contract_dca")) {
            vCQ.Companion.EZpvd(tacticsData, fragmentManager);
        } else if (Intrinsics.EZpvd((Object) orderType, (Object) "spot_dca")) {
            C53223whT.Companion.KWHzl(fragmentManager, tacticsData, new Function2() { // from class: o.wSj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return BotOperatorButtonDisposer.AEQbTJ(this.copydefault, (java.lang.String) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit AEQbTJ(BotOperatorButtonDisposer botOperatorButtonDisposer, String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs != null) {
            InterfaceC52662wTs.TaskDescription.showSnackbar$default(interfaceC52662wTs, str, i, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull TacticsData tacticsData, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        vDZ.Companion.KWHzl(tacticsData, fragmentManager);
    }

    public final void copydefault(@NotNull TacticsData tacticsData, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        String orderType = tacticsData.getOrderType();
        if (Intrinsics.EZpvd((Object) orderType, (Object) "grid")) {
            vGL.Companion.OLrzqt(tacticsData).show(fragmentManager);
        } else if (Intrinsics.EZpvd((Object) orderType, (Object) "contract_grid")) {
            C50225vGn.Companion.copydefault(tacticsData).show(fragmentManager);
        }
    }

    public final void valueOf(@NotNull final TacticsData tacticsData, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        String orderType = tacticsData.getOrderType();
        if (Intrinsics.EZpvd((Object) orderType, (Object) "smart_arbitrage")) {
            C53613wom.Companion.copydefault(tacticsData, new Function0() { // from class: o.wSE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return BotOperatorButtonDisposer.fIwbmz(this.EZpvd, tacticsData);
                }
            }).show(fragmentManager);
            return;
        }
        if (Intrinsics.EZpvd((Object) orderType, (Object) "contract_grid")) {
            EZpvd();
            C49662usl.EZpvd(FuturesGridWithdrawProfitSheet.Companion.copydefault(tacticsData.getAlgoId(), tacticsData.getInstId(), tacticsData.getInstType(), tacticsData, new Function1() { // from class: o.wSB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BotOperatorButtonDisposer.KWHzl(this.AEQbTJ, tacticsData, (TacticsData) obj);
                }
            }), fragmentManager, "FuturesGridWithdrawProfitSheet");
            return;
        }
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt != null) {
            botOperatorButtonViewModelOLrzqt.KWHzl(tacticsData);
        }
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt2 = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt2 != null) {
            String algoId = tacticsData.getAlgoId();
            String instId = tacticsData.getInstId();
            String instType = tacticsData.getInstType();
            String instId2 = tacticsData.getInstId();
            String instType2 = tacticsData.getInstType();
            String tradeQuoteCcy = tacticsData.getTradeQuoteCcy();
            C55887xsS c55887xsS = new C55887xsS(instType2, instId2);
            c55887xsS.gEmmrt(tradeQuoteCcy);
            botOperatorButtonViewModelOLrzqt2.OLrzqt(algoId, instId, instType, c55887xsS.AEQbTJ(tacticsData.getOrderType()));
        }
    }

    public static final Unit fIwbmz(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData) {
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs != null) {
            interfaceC52662wTs.EZpvd(tacticsData);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData, TacticsData tacticsData2) {
        Intrinsics.checkNotNullParameter(tacticsData2, "");
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs != null) {
            interfaceC52662wTs.EZpvd(tacticsData);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(final String str, boolean z) {
        String strAYXKKw;
        String strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.HJWChPUUMfbK);
        if (z) {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.BVXAa);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.HJWChPRGtXKCDKRTZD);
        }
        String str2 = strAYXKKw;
        Context contextAEQbTJ = AEQbTJ();
        if (contextAEQbTJ != null) {
            C52602wRm.OLrzqt.KWHzl(contextAEQbTJ, (1184 & 2) != 0 ? null : strAYXKKw2, (1184 & 4) != 0 ? null : str2, (1184 & 8) != 0 ? null : null, (1184 & 16) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI), (1184 & 32) != 0 ? null : null, (1184 & 64) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.onConfigurationChanged), (1184 & 128) != 0 ? null : null, (1184 & 256) != 0 ? null : new Function2() { // from class: o.wRM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return BotOperatorButtonDisposer.copydefault(this.AEQbTJ, str, (ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                }
            }, (1184 & 512) != 0 ? null : new Function2() { // from class: o.wRI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return BotOperatorButtonDisposer.fARcdN((ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                }
            }, (1184 & 1024) == 0 ? null : null);
        }
    }

    public static final Unit copydefault(BotOperatorButtonDisposer botOperatorButtonDisposer, String str, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        botOperatorButtonDisposer.valueOf = viewOnClickListenerC54939xaY;
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
        if (botOperatorButtonViewModelOLrzqt != null) {
            botOperatorButtonViewModelOLrzqt.KWHzl(str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(final String str, final String str2, final boolean z, final String str3) {
        BizInstrument suggestedInstrument$default;
        C56111xwe<String> c56111xweDbNXlk;
        final String value;
        String strAYXKKw;
        String strAYXKKw2;
        C56111xwe<String> c56111xweDjBIcL;
        TacticsData tacticsDataFJNWhG;
        TacticsData tacticsDataFJNWhG2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        FragmentActivity activity = null;
        if (interfaceC54581xNrOLrzqt != null) {
            BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = OLrzqt();
            String instType = (botOperatorButtonViewModelOLrzqt == null || (tacticsDataFJNWhG2 = botOperatorButtonViewModelOLrzqt.fJNWhG()) == null) ? null : tacticsDataFJNWhG2.getInstType();
            String str4 = instType == null ? "" : instType;
            BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt2 = OLrzqt();
            String instId = (botOperatorButtonViewModelOLrzqt2 == null || (tacticsDataFJNWhG = botOperatorButtonViewModelOLrzqt2.fJNWhG()) == null) ? null : tacticsDataFJNWhG.getInstId();
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str4, instId == null ? "" : instId, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        if (Intrinsics.EZpvd((Object) str3, (Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null))) {
            BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt3 = OLrzqt();
            value = (botOperatorButtonViewModelOLrzqt3 == null || (c56111xweDjBIcL = botOperatorButtonViewModelOLrzqt3.djBIcL()) == null) ? null : c56111xweDjBIcL.getValue();
        } else {
            BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt4 = OLrzqt();
            if (botOperatorButtonViewModelOLrzqt4 != null && (c56111xweDbNXlk = botOperatorButtonViewModelOLrzqt4.DbNXlk()) != null) {
                value = c56111xweDbNXlk.getValue();
            }
        }
        String strAYXKKw3 = C33070mpX.AYXKKw(C48033uCm.Fragment.iqeXgQ);
        if (z) {
            strAYXKKw = C33069mpW.copydefault(C48033uCm.Fragment.ikIEnW, C56424yEw.gEmmrt(C56390yDp.OLrzqt("amt", str2), C56390yDp.OLrzqt("ccy", str3)));
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.HJWChPRGtXKC);
        }
        String str5 = strAYXKKw;
        if (z && C33129mqd.AEQbTJ(str2, value)) {
            strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.RkASWs);
        } else {
            strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI);
        }
        String str6 = strAYXKKw2;
        LifecycleOwner lifecycleOwner = this.AEQbTJ;
        if (lifecycleOwner instanceof Fragment) {
            Intrinsics.copydefault(lifecycleOwner, "");
            activity = ((Fragment) lifecycleOwner).getActivity();
        } else if (lifecycleOwner instanceof FragmentActivity) {
            Intrinsics.copydefault(lifecycleOwner, "");
            activity = (FragmentActivity) lifecycleOwner;
        }
        final FragmentActivity fragmentActivity = activity;
        if (fragmentActivity != null) {
            C52602wRm.OLrzqt.KWHzl(fragmentActivity, (1184 & 2) != 0 ? null : strAYXKKw3, (1184 & 4) != 0 ? null : str5, (1184 & 8) != 0 ? null : null, (1184 & 16) != 0 ? null : str6, (1184 & 32) != 0 ? null : null, (1184 & 64) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.onConfigurationChanged), (1184 & 128) != 0 ? null : null, (1184 & 256) != 0 ? null : new Function2() { // from class: o.wRO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return BotOperatorButtonDisposer.EZpvd(z, str2, value, this, fragmentActivity, str3, str, (ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                }
            }, (1184 & 512) != 0 ? null : new Function2() { // from class: o.wRN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return BotOperatorButtonDisposer.iwGUEr((ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                }
            }, (1184 & 1024) == 0 ? null : null);
        }
    }

    public static final Unit EZpvd(boolean z, String str, String str2, BotOperatorButtonDisposer botOperatorButtonDisposer, FragmentActivity fragmentActivity, String str3, String str4, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        TradeCoinInfo tradeCoinInfoAhwBna;
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        if (z && C33129mqd.AEQbTJ(str, str2)) {
            viewOnClickListenerC54939xaY.dismiss();
            botOperatorButtonDisposer.EZpvd();
            InterfaceC49497upf interfaceC49497upf = (InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            interfaceC49497upf.OLrzqt(fragmentActivity, new CurrencyModel(C33129mqd.AhwBna((interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(str3)) == null) ? null : tradeCoinInfoAhwBna.getId()), str3), true);
        } else {
            botOperatorButtonDisposer.AhwBna = viewOnClickListenerC54939xaY;
            BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
            if (botOperatorButtonViewModelOLrzqt != null) {
                botOperatorButtonViewModelOLrzqt.copydefault(str4, str);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit iwGUEr(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    private final void KWHzl(final String str, final boolean z) {
        String strAYXKKw;
        String strAYXKKw2;
        if (z) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.DSiOMJ);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.DrqXHJ);
        }
        String str2 = strAYXKKw;
        if (z) {
            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.DGUQLIhJrIAr);
        } else {
            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.DIIpTV);
        }
        String str3 = strAYXKKw2;
        Context contextAEQbTJ = AEQbTJ();
        if (contextAEQbTJ != null) {
            C52602wRm.OLrzqt.KWHzl(contextAEQbTJ, (1184 & 2) != 0 ? null : str2, (1184 & 4) != 0 ? null : str3, (1184 & 8) != 0 ? null : null, (1184 & 16) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI), (1184 & 32) != 0 ? null : null, (1184 & 64) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.onConfigurationChanged), (1184 & 128) != 0 ? null : null, (1184 & 256) != 0 ? null : new Function2() { // from class: o.wSe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return BotOperatorButtonDisposer.AEQbTJ(this.EZpvd, str, z, (ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                }
            }, (1184 & 512) != 0 ? null : new Function2() { // from class: o.wSg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return BotOperatorButtonDisposer.fIwbmz((ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                }
            }, (1184 & 1024) == 0 ? null : null);
        }
    }

    public static final Unit AEQbTJ(BotOperatorButtonDisposer botOperatorButtonDisposer, String str, boolean z, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC54939xaY.dismiss();
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
        if (botOperatorButtonViewModelOLrzqt != null) {
            botOperatorButtonViewModelOLrzqt.copydefault(new ToggleReinvestmentReq(str, z));
        }
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public final void EZpvd(TacticsData tacticsData) {
        Context contextAEQbTJ = AEQbTJ();
        if (contextAEQbTJ != null) {
            ActivityC53830wsr.Companion.KWHzl(contextAEQbTJ, tacticsData.getInstId(), tacticsData.getInstType(), tacticsData, tacticsData.getSource());
        }
    }

    public final void copydefault(final TacticsData tacticsData) {
        C52659wTp c52659wTp = C52659wTp.copydefault;
        Context contextAEQbTJ = AEQbTJ();
        if (contextAEQbTJ == null) {
            return;
        }
        c52659wTp.AEQbTJ(contextAEQbTJ, tacticsData, new Function0() { // from class: o.wSf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotOperatorButtonDisposer.AkhnZx(this.KWHzl, tacticsData);
            }
        });
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wRm.showDialog$default(o.wRm, android.content.Context, java.lang.String, java.lang.CharSequence, kotlin.Pair, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, java.lang.String, int, java.lang.Object):void */
    public static final Unit AkhnZx(final BotOperatorButtonDisposer botOperatorButtonDisposer, final TacticsData tacticsData) {
        final String str = "tag_reverse_bot_confirm-" + C54589xNz.EZpvd.EZpvd() + "-" + C55697xoo.OLrzqt.gEmmrt();
        Context contextAEQbTJ = botOperatorButtonDisposer.AEQbTJ();
        if (contextAEQbTJ != null) {
            C52602wRm c52602wRm = C52602wRm.OLrzqt;
            final wYK wykAEQbTJ = c52602wRm.AEQbTJ(contextAEQbTJ, C55688xof.Application.onPanelClosed, TextView.BufferType.NORMAL);
            if (SPUtils.getBoolean(str, true)) {
                c52602wRm.KWHzl(contextAEQbTJ, (1184 & 2) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.getPriority), (1184 & 4) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.vLaW), (1184 & 8) != 0 ? null : C56390yDp.OLrzqt(wykAEQbTJ, Integer.valueOf(C55298xhM.dp2px$default(16.0f, null, 1, null))), (1184 & 16) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI), (1184 & 32) != 0 ? null : null, (1184 & 64) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.onConfigurationChanged), (1184 & 128) != 0 ? null : null, (1184 & 256) != 0 ? null : new Function2() { // from class: o.wRL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return BotOperatorButtonDisposer.AEQbTJ(this.EZpvd, wykAEQbTJ, str, tacticsData, (ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                    }
                }, (1184 & 512) != 0 ? null : new Function2() { // from class: o.wRJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return BotOperatorButtonDisposer.AuCTel((ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                    }
                }, (1184 & 1024) == 0 ? null : null);
            } else {
                Context contextAEQbTJ2 = botOperatorButtonDisposer.AEQbTJ();
                if (contextAEQbTJ2 != null) {
                    C55998xuX c55998xuX = C55998xuX.copydefault;
                    TacticsData tacticsDataCopy = tacticsData.copy(((-262145) & 1) != 0 ? tacticsData.orderType : null, ((-262145) & 2) != 0 ? tacticsData.algoId : null, ((-262145) & 4) != 0 ? tacticsData.instType : null, ((-262145) & 8) != 0 ? tacticsData.instId : null, ((-262145) & 16) != 0 ? tacticsData.state : null, ((-262145) & 32) != 0 ? tacticsData.filledPercentage : null, ((-262145) & 64) != 0 ? tacticsData.history : false, ((-262145) & 128) != 0 ? tacticsData.tvTitle : null, ((-262145) & 256) != 0 ? tacticsData.tacticsType : null, ((-262145) & 512) != 0 ? tacticsData.ivShareRes : 0, ((-262145) & 1024) != 0 ? tacticsData.level : null, ((-262145) & 2048) != 0 ? tacticsData.cTime : null, ((-262145) & 4096) != 0 ? tacticsData.cTimeStamp : 0L, ((-262145) & 8192) != 0 ? tacticsData.pnlRatio : null, ((-262145) & 16384) != 0 ? tacticsData.subData : null, ((-262145) & 32768) != 0 ? tacticsData.tradeSymbol : null, ((-262145) & 65536) != 0 ? tacticsData.stopStateText : null, ((-262145) & 131072) != 0 ? tacticsData.stopOrangeHint : null, ((-262145) & 262144) != 0 ? tacticsData.shareData : null, ((-262145) & 524288) != 0 ? tacticsData.instList : null, ((-262145) & 1048576) != 0 ? tacticsData.associate : null, ((-262145) & 2097152) != 0 ? tacticsData.stgyName : null, ((-262145) & 4194304) != 0 ? tacticsData.direction : null, ((-262145) & 8388608) != 0 ? tacticsData.tpTriggerPx : null, ((-262145) & 16777216) != 0 ? tacticsData.slTriggerPx : null, ((-262145) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.tpRatio : null, ((-262145) & 67108864) != 0 ? tacticsData.slRatio : null, ((-262145) & 134217728) != 0 ? tacticsData.priceLocker : null, ((-262145) & 268435456) != 0 ? tacticsData.recItemList : null, ((-262145) & 536870912) != 0 ? tacticsData.hoardItemList : null, ((-262145) & 1073741824) != 0 ? tacticsData.investCcy : null, ((-262145) & Integer.MIN_VALUE) != 0 ? tacticsData.lastPrice : null, ((-1) & 1) != 0 ? tacticsData.operateList : null, ((-1) & 2) != 0 ? tacticsData.extraOperatorList : null, ((-1) & 4) != 0 ? tacticsData.labelList : null, ((-1) & 8) != 0 ? tacticsData.signParams : null, ((-1) & 16) != 0 ? tacticsData.uTime : null, ((-1) & 32) != 0 ? tacticsData.triggerParams : null, ((-1) & 64) != 0 ? tacticsData.cycleId : null, ((-1) & 128) != 0 ? tacticsData.stopType : null, ((-1) & 256) != 0 ? tacticsData.tpPx : null, ((-1) & 512) != 0 ? tacticsData.slPx : null, ((-1) & 1024) != 0 ? tacticsData.tpslTriggerParam : null, ((-1) & 2048) != 0 ? tacticsData.tpPriceRange : null, ((-1) & 4096) != 0 ? tacticsData.gridState : null, ((-1) & 8192) != 0 ? tacticsData.originalLevel : null, ((-1) & 16384) != 0 ? tacticsData.actualMarginSz : null, ((-1) & 32768) != 0 ? tacticsData.extraMarginSz : null, ((-1) & 65536) != 0 ? tacticsData.liqPx : null, ((-1) & 131072) != 0 ? tacticsData.longLiqPx : null, ((-1) & 262144) != 0 ? tacticsData.shortLiqPx : null, ((-1) & 524288) != 0 ? tacticsData.tradeNum : null, ((-1) & 1048576) != 0 ? tacticsData.pxSpread : null, ((-1) & 2097152) != 0 ? tacticsData.pxVar : null, ((-1) & 4194304) != 0 ? tacticsData.pxLimit : null, ((-1) & 8388608) != 0 ? tacticsData.timeInterval : null, ((-1) & 16777216) != 0 ? tacticsData.szLimit : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.sz : null, ((-1) & 67108864) != 0 ? tacticsData.side : null, ((-1) & 134217728) != 0 ? tacticsData.posSide : null, ((-1) & 268435456) != 0 ? tacticsData.tdMode : null, ((-1) & 536870912) != 0 ? tacticsData.reduce_only : null, ((-1) & 1073741824) != 0 ? tacticsData.ccy : null, ((-1) & Integer.MIN_VALUE) != 0 ? tacticsData.copyType : null, ((-1) & 1) != 0 ? tacticsData.profitSharingRatio : null, ((-1) & 2) != 0 ? tacticsData.sourceAlgoId : null, ((-1) & 4) != 0 ? tacticsData.mktCap : null, ((-1) & 8) != 0 ? tacticsData.instIds : null, ((-1) & 16) != 0 ? tacticsData.totalAmt : null, ((-1) & 32) != 0 ? tacticsData.signalChanId : null, ((-1) & 64) != 0 ? tacticsData.signalChanName : null, ((-1) & 128) != 0 ? tacticsData.floatingPnl : null, ((-1) & 256) != 0 ? tacticsData.availableMargin : null, ((-1) & 512) != 0 ? tacticsData.totalPnlRatio : null, ((-1) & 1024) != 0 ? tacticsData.signalCount : null, ((-1) & 2048) != 0 ? tacticsData.supportEarlyFill : false, ((-1) & 4096) != 0 ? tacticsData.signalSubsSizeDesc : null, ((-1) & 8192) != 0 ? tacticsData.signalSubsSize : null, ((-1) & 16384) != 0 ? tacticsData.signalSource : null, ((-1) & 32768) != 0 ? tacticsData.profitRateDesc : null, ((-1) & 65536) != 0 ? tacticsData.profit : null, ((-1) & 131072) != 0 ? tacticsData.symbolsNumber : null, ((-1) & 262144) != 0 ? tacticsData.locatePage : 0, ((-1) & 524288) != 0 ? tacticsData.maxPx : null, ((-1) & 1048576) != 0 ? tacticsData.minPx : null, ((-1) & 2097152) != 0 ? tacticsData.runType : null, ((-1) & 4194304) != 0 ? tacticsData.gridNum : null, ((-1) & 8388608) != 0 ? tacticsData.trailingUpConfig : null, ((-1) & 16777216) != 0 ? tacticsData.trailingDownConfig : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.trailingDownFund : null, ((-1) & 67108864) != 0 ? tacticsData.reserveFunds : null, ((-1) & 134217728) != 0 ? tacticsData.basePos : false, ((-1) & 268435456) != 0 ? tacticsData.perGridProfitRatio : null, ((-1) & 536870912) != 0 ? tacticsData.perMinProfitRate : null, ((-1) & 1073741824) != 0 ? tacticsData.perMaxProfitRate : null, ((-1) & Integer.MIN_VALUE) != 0 ? tacticsData.balType : null, ((-1) & 1) != 0 ? tacticsData.interval : null, ((-1) & 2) != 0 ? tacticsData.deltaRatio : null, ((-1) & 4) != 0 ? tacticsData.maxSafetyOrds : null, ((-1) & 8) != 0 ? tacticsData.pxSteps : null, ((-1) & 16) != 0 ? tacticsData.pxStepsMult : null, ((-1) & 32) != 0 ? tacticsData.volMult : null, ((-1) & 64) != 0 ? tacticsData.tpPct : null, ((-1) & 128) != 0 ? tacticsData.slPct : null, ((-1) & 256) != 0 ? tacticsData.slMode : null, ((-1) & 512) != 0 ? tacticsData.triggerType : null, ((-1) & 1024) != 0 ? tacticsData.trackingMode : null, ((-1) & 2048) != 0 ? tacticsData.autoMarginReloadSwitch : false, ((-1) & 4096) != 0 ? tacticsData.autoMarginReloadMaxAmount : null, ((-1) & 8192) != 0 ? tacticsData.extendedBusinessInfo : null, ((-1) & 16384) != 0 ? tacticsData.instFamily : null, ((-1) & 32768) != 0 ? tacticsData.arbList : null, ((-1) & 65536) != 0 ? tacticsData.outOfRange : false, ((-1) & 131072) != 0 ? tacticsData.sourceCcy : null, ((-1) & 262144) != 0 ? tacticsData.sourceCcySz : null, ((-1) & 524288) != 0 ? tacticsData.curQuoteSz : null, ((-1) & 1048576) != 0 ? tacticsData.curBaseSz : null, ((-1) & 2097152) != 0 ? tacticsData.isPostWarning : null, ((-1) & 4194304) != 0 ? tacticsData.ruleType : null, ((-1) & 8388608) != 0 ? tacticsData.isTradeBorrowMode : null, ((-1) & 16777216) != 0 ? tacticsData.totalPnl : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.isShowTWapTips : false, ((-1) & 67108864) != 0 ? tacticsData.strategyTags : null, ((-1) & 134217728) != 0 ? tacticsData.signalOrderAmtParam : null, ((-1) & 268435456) != 0 ? tacticsData.signalBotOrderStopParam : null, ((-1) & 536870912) != 0 ? tacticsData.voucherInfo : null, ((-1) & 1073741824) != 0 ? tacticsData.forbidden : null, ((-1) & Integer.MIN_VALUE) != 0 ? tacticsData.hiddenFeatures : null, ((-1) & 1) != 0 ? tacticsData.dcdState : null, ((-1) & 2) != 0 ? tacticsData.reinvestment : false, ((-1) & 4) != 0 ? tacticsData.lastTradeExpireTime : null, ((-1) & 8) != 0 ? tacticsData.lastSettlementSettledTime : null, ((-1) & 16) != 0 ? tacticsData.profitData : null, ((-1) & 32) != 0 ? tacticsData.runningDuration : null, ((-1) & 64) != 0 ? tacticsData.arbitrageStakingError : null, ((-1) & 128) != 0 ? tacticsData.isSmartArbitrageWithStaking : false, ((-1) & 256) != 0 ? tacticsData.deeplink : null, ((-1) & 512) != 0 ? tacticsData.source : null, ((-1) & 1024) != 0 ? tacticsData.topupActualMarginSz : null, ((-1) & 2048) != 0 ? tacticsData.simpleEarn : null, ((-1) & 4096) != 0 ? tacticsData.baseSz : null, ((-1) & 8192) != 0 ? tacticsData.investmentType : null, ((-1) & 16384) != 0 ? tacticsData.investment : null, ((-1) & 32768) != 0 ? tacticsData.cbAutoReserve : null, ((-1) & 65536) != 0 ? tacticsData.arbitrageTotalPnlInfo : null, ((-1) & 131072) != 0 ? tacticsData.leverPrincipal : null, ((-1) & 262144) != 0 ? tacticsData.contractDcaSpecialData : null, ((-1) & 524288) != 0 ? tacticsData.highestApyPeriod : null, ((-1) & 1048576) != 0 ? tacticsData.displayMinPaybackDays : false, ((-1) & 2097152) != 0 ? tacticsData.fundingFeeApyList : null, ((-1) & 4194304) != 0 ? tacticsData.profitSnapshots : null, ((-1) & 8388608) != 0 ? tacticsData.latestProfitData : null, ((-1) & 16777216) != 0 ? tacticsData.tradeQuoteCcy : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.smartArbProfitsInfo : null, ((-1) & 67108864) != 0 ? tacticsData.balanceDetails : null, ((-1) & 134217728) != 0 ? tacticsData.bot : null, ((-1) & 268435456) != 0 ? tacticsData.autoVipProfitInfo : null, ((-1) & 536870912) != 0 ? tacticsData.initOrdAmt : null, ((-1) & 1073741824) != 0 ? tacticsData.safetyOrdAmt : null, ((-1) & Integer.MIN_VALUE) != 0 ? tacticsData.effectiveEditParametersDetails : null, (3 & 1) != 0 ? tacticsData.swapCoinMProfitSwitchUiModel : null, (3 & 2) != 0 ? tacticsData.recurringBuyDetails : null);
                    tacticsDataCopy.setDirection(Intrinsics.EZpvd((Object) tacticsData.getDirection(), (Object) "long") ? "short" : "long");
                    ActivityC52122vzt.Companion.OLrzqt(contextAEQbTJ2, c55998xuX.KWHzl(tacticsDataCopy), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "BotOperatorButton", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
                }
                botOperatorButtonDisposer.EZpvd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.vzt.Application.startActivity$default(o.vzt$Application, android.content.Context, com.okinc.unify_trade.biz.BotTradeData, java.util.HashMap, java.lang.String, java.lang.Integer, java.lang.String, android.os.Parcelable, java.lang.String, int, java.lang.Object):void */
    public static final Unit AEQbTJ(BotOperatorButtonDisposer botOperatorButtonDisposer, wYK wyk, String str, TacticsData tacticsData, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC54939xaY.dismiss();
        Context contextAEQbTJ = botOperatorButtonDisposer.AEQbTJ();
        if (contextAEQbTJ != null) {
            C55998xuX c55998xuX = C55998xuX.copydefault;
            TacticsData tacticsDataCopy = tacticsData.copy(((-262145) & 1) != 0 ? tacticsData.orderType : null, ((-262145) & 2) != 0 ? tacticsData.algoId : null, ((-262145) & 4) != 0 ? tacticsData.instType : null, ((-262145) & 8) != 0 ? tacticsData.instId : null, ((-262145) & 16) != 0 ? tacticsData.state : null, ((-262145) & 32) != 0 ? tacticsData.filledPercentage : null, ((-262145) & 64) != 0 ? tacticsData.history : false, ((-262145) & 128) != 0 ? tacticsData.tvTitle : null, ((-262145) & 256) != 0 ? tacticsData.tacticsType : null, ((-262145) & 512) != 0 ? tacticsData.ivShareRes : 0, ((-262145) & 1024) != 0 ? tacticsData.level : null, ((-262145) & 2048) != 0 ? tacticsData.cTime : null, ((-262145) & 4096) != 0 ? tacticsData.cTimeStamp : 0L, ((-262145) & 8192) != 0 ? tacticsData.pnlRatio : null, ((-262145) & 16384) != 0 ? tacticsData.subData : null, ((-262145) & 32768) != 0 ? tacticsData.tradeSymbol : null, ((-262145) & 65536) != 0 ? tacticsData.stopStateText : null, ((-262145) & 131072) != 0 ? tacticsData.stopOrangeHint : null, ((-262145) & 262144) != 0 ? tacticsData.shareData : null, ((-262145) & 524288) != 0 ? tacticsData.instList : null, ((-262145) & 1048576) != 0 ? tacticsData.associate : null, ((-262145) & 2097152) != 0 ? tacticsData.stgyName : null, ((-262145) & 4194304) != 0 ? tacticsData.direction : null, ((-262145) & 8388608) != 0 ? tacticsData.tpTriggerPx : null, ((-262145) & 16777216) != 0 ? tacticsData.slTriggerPx : null, ((-262145) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.tpRatio : null, ((-262145) & 67108864) != 0 ? tacticsData.slRatio : null, ((-262145) & 134217728) != 0 ? tacticsData.priceLocker : null, ((-262145) & 268435456) != 0 ? tacticsData.recItemList : null, ((-262145) & 536870912) != 0 ? tacticsData.hoardItemList : null, ((-262145) & 1073741824) != 0 ? tacticsData.investCcy : null, ((-262145) & Integer.MIN_VALUE) != 0 ? tacticsData.lastPrice : null, ((-1) & 1) != 0 ? tacticsData.operateList : null, ((-1) & 2) != 0 ? tacticsData.extraOperatorList : null, ((-1) & 4) != 0 ? tacticsData.labelList : null, ((-1) & 8) != 0 ? tacticsData.signParams : null, ((-1) & 16) != 0 ? tacticsData.uTime : null, ((-1) & 32) != 0 ? tacticsData.triggerParams : null, ((-1) & 64) != 0 ? tacticsData.cycleId : null, ((-1) & 128) != 0 ? tacticsData.stopType : null, ((-1) & 256) != 0 ? tacticsData.tpPx : null, ((-1) & 512) != 0 ? tacticsData.slPx : null, ((-1) & 1024) != 0 ? tacticsData.tpslTriggerParam : null, ((-1) & 2048) != 0 ? tacticsData.tpPriceRange : null, ((-1) & 4096) != 0 ? tacticsData.gridState : null, ((-1) & 8192) != 0 ? tacticsData.originalLevel : null, ((-1) & 16384) != 0 ? tacticsData.actualMarginSz : null, ((-1) & 32768) != 0 ? tacticsData.extraMarginSz : null, ((-1) & 65536) != 0 ? tacticsData.liqPx : null, ((-1) & 131072) != 0 ? tacticsData.longLiqPx : null, ((-1) & 262144) != 0 ? tacticsData.shortLiqPx : null, ((-1) & 524288) != 0 ? tacticsData.tradeNum : null, ((-1) & 1048576) != 0 ? tacticsData.pxSpread : null, ((-1) & 2097152) != 0 ? tacticsData.pxVar : null, ((-1) & 4194304) != 0 ? tacticsData.pxLimit : null, ((-1) & 8388608) != 0 ? tacticsData.timeInterval : null, ((-1) & 16777216) != 0 ? tacticsData.szLimit : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.sz : null, ((-1) & 67108864) != 0 ? tacticsData.side : null, ((-1) & 134217728) != 0 ? tacticsData.posSide : null, ((-1) & 268435456) != 0 ? tacticsData.tdMode : null, ((-1) & 536870912) != 0 ? tacticsData.reduce_only : null, ((-1) & 1073741824) != 0 ? tacticsData.ccy : null, ((-1) & Integer.MIN_VALUE) != 0 ? tacticsData.copyType : null, ((-1) & 1) != 0 ? tacticsData.profitSharingRatio : null, ((-1) & 2) != 0 ? tacticsData.sourceAlgoId : null, ((-1) & 4) != 0 ? tacticsData.mktCap : null, ((-1) & 8) != 0 ? tacticsData.instIds : null, ((-1) & 16) != 0 ? tacticsData.totalAmt : null, ((-1) & 32) != 0 ? tacticsData.signalChanId : null, ((-1) & 64) != 0 ? tacticsData.signalChanName : null, ((-1) & 128) != 0 ? tacticsData.floatingPnl : null, ((-1) & 256) != 0 ? tacticsData.availableMargin : null, ((-1) & 512) != 0 ? tacticsData.totalPnlRatio : null, ((-1) & 1024) != 0 ? tacticsData.signalCount : null, ((-1) & 2048) != 0 ? tacticsData.supportEarlyFill : false, ((-1) & 4096) != 0 ? tacticsData.signalSubsSizeDesc : null, ((-1) & 8192) != 0 ? tacticsData.signalSubsSize : null, ((-1) & 16384) != 0 ? tacticsData.signalSource : null, ((-1) & 32768) != 0 ? tacticsData.profitRateDesc : null, ((-1) & 65536) != 0 ? tacticsData.profit : null, ((-1) & 131072) != 0 ? tacticsData.symbolsNumber : null, ((-1) & 262144) != 0 ? tacticsData.locatePage : 0, ((-1) & 524288) != 0 ? tacticsData.maxPx : null, ((-1) & 1048576) != 0 ? tacticsData.minPx : null, ((-1) & 2097152) != 0 ? tacticsData.runType : null, ((-1) & 4194304) != 0 ? tacticsData.gridNum : null, ((-1) & 8388608) != 0 ? tacticsData.trailingUpConfig : null, ((-1) & 16777216) != 0 ? tacticsData.trailingDownConfig : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.trailingDownFund : null, ((-1) & 67108864) != 0 ? tacticsData.reserveFunds : null, ((-1) & 134217728) != 0 ? tacticsData.basePos : false, ((-1) & 268435456) != 0 ? tacticsData.perGridProfitRatio : null, ((-1) & 536870912) != 0 ? tacticsData.perMinProfitRate : null, ((-1) & 1073741824) != 0 ? tacticsData.perMaxProfitRate : null, ((-1) & Integer.MIN_VALUE) != 0 ? tacticsData.balType : null, ((-1) & 1) != 0 ? tacticsData.interval : null, ((-1) & 2) != 0 ? tacticsData.deltaRatio : null, ((-1) & 4) != 0 ? tacticsData.maxSafetyOrds : null, ((-1) & 8) != 0 ? tacticsData.pxSteps : null, ((-1) & 16) != 0 ? tacticsData.pxStepsMult : null, ((-1) & 32) != 0 ? tacticsData.volMult : null, ((-1) & 64) != 0 ? tacticsData.tpPct : null, ((-1) & 128) != 0 ? tacticsData.slPct : null, ((-1) & 256) != 0 ? tacticsData.slMode : null, ((-1) & 512) != 0 ? tacticsData.triggerType : null, ((-1) & 1024) != 0 ? tacticsData.trackingMode : null, ((-1) & 2048) != 0 ? tacticsData.autoMarginReloadSwitch : false, ((-1) & 4096) != 0 ? tacticsData.autoMarginReloadMaxAmount : null, ((-1) & 8192) != 0 ? tacticsData.extendedBusinessInfo : null, ((-1) & 16384) != 0 ? tacticsData.instFamily : null, ((-1) & 32768) != 0 ? tacticsData.arbList : null, ((-1) & 65536) != 0 ? tacticsData.outOfRange : false, ((-1) & 131072) != 0 ? tacticsData.sourceCcy : null, ((-1) & 262144) != 0 ? tacticsData.sourceCcySz : null, ((-1) & 524288) != 0 ? tacticsData.curQuoteSz : null, ((-1) & 1048576) != 0 ? tacticsData.curBaseSz : null, ((-1) & 2097152) != 0 ? tacticsData.isPostWarning : null, ((-1) & 4194304) != 0 ? tacticsData.ruleType : null, ((-1) & 8388608) != 0 ? tacticsData.isTradeBorrowMode : null, ((-1) & 16777216) != 0 ? tacticsData.totalPnl : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.isShowTWapTips : false, ((-1) & 67108864) != 0 ? tacticsData.strategyTags : null, ((-1) & 134217728) != 0 ? tacticsData.signalOrderAmtParam : null, ((-1) & 268435456) != 0 ? tacticsData.signalBotOrderStopParam : null, ((-1) & 536870912) != 0 ? tacticsData.voucherInfo : null, ((-1) & 1073741824) != 0 ? tacticsData.forbidden : null, ((-1) & Integer.MIN_VALUE) != 0 ? tacticsData.hiddenFeatures : null, ((-1) & 1) != 0 ? tacticsData.dcdState : null, ((-1) & 2) != 0 ? tacticsData.reinvestment : false, ((-1) & 4) != 0 ? tacticsData.lastTradeExpireTime : null, ((-1) & 8) != 0 ? tacticsData.lastSettlementSettledTime : null, ((-1) & 16) != 0 ? tacticsData.profitData : null, ((-1) & 32) != 0 ? tacticsData.runningDuration : null, ((-1) & 64) != 0 ? tacticsData.arbitrageStakingError : null, ((-1) & 128) != 0 ? tacticsData.isSmartArbitrageWithStaking : false, ((-1) & 256) != 0 ? tacticsData.deeplink : null, ((-1) & 512) != 0 ? tacticsData.source : null, ((-1) & 1024) != 0 ? tacticsData.topupActualMarginSz : null, ((-1) & 2048) != 0 ? tacticsData.simpleEarn : null, ((-1) & 4096) != 0 ? tacticsData.baseSz : null, ((-1) & 8192) != 0 ? tacticsData.investmentType : null, ((-1) & 16384) != 0 ? tacticsData.investment : null, ((-1) & 32768) != 0 ? tacticsData.cbAutoReserve : null, ((-1) & 65536) != 0 ? tacticsData.arbitrageTotalPnlInfo : null, ((-1) & 131072) != 0 ? tacticsData.leverPrincipal : null, ((-1) & 262144) != 0 ? tacticsData.contractDcaSpecialData : null, ((-1) & 524288) != 0 ? tacticsData.highestApyPeriod : null, ((-1) & 1048576) != 0 ? tacticsData.displayMinPaybackDays : false, ((-1) & 2097152) != 0 ? tacticsData.fundingFeeApyList : null, ((-1) & 4194304) != 0 ? tacticsData.profitSnapshots : null, ((-1) & 8388608) != 0 ? tacticsData.latestProfitData : null, ((-1) & 16777216) != 0 ? tacticsData.tradeQuoteCcy : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.smartArbProfitsInfo : null, ((-1) & 67108864) != 0 ? tacticsData.balanceDetails : null, ((-1) & 134217728) != 0 ? tacticsData.bot : null, ((-1) & 268435456) != 0 ? tacticsData.autoVipProfitInfo : null, ((-1) & 536870912) != 0 ? tacticsData.initOrdAmt : null, ((-1) & 1073741824) != 0 ? tacticsData.safetyOrdAmt : null, ((-1) & Integer.MIN_VALUE) != 0 ? tacticsData.effectiveEditParametersDetails : null, (3 & 1) != 0 ? tacticsData.swapCoinMProfitSwitchUiModel : null, (3 & 2) != 0 ? tacticsData.recurringBuyDetails : null);
            tacticsDataCopy.setDirection(Intrinsics.EZpvd((Object) tacticsData.getDirection(), (Object) "long") ? "short" : "long");
            ActivityC52122vzt.Companion.OLrzqt(contextAEQbTJ, c55998xuX.KWHzl(tacticsDataCopy), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "BotOperatorButton", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
        }
        if (wyk.isChecked()) {
            SPUtils.put(str, Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public final void valueOf(final TacticsData tacticsData) {
        C53769wrj.AEQbTJ.AEQbTJ();
        C52659wTp c52659wTp = C52659wTp.copydefault;
        Context contextAEQbTJ = AEQbTJ();
        if (contextAEQbTJ == null) {
            return;
        }
        c52659wTp.AEQbTJ(contextAEQbTJ, tacticsData, new Function0() { // from class: o.wSL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotOperatorButtonDisposer.copydefault(tacticsData, this);
            }
        });
    }

    public static final Unit copydefault(TacticsData tacticsData, BotOperatorButtonDisposer botOperatorButtonDisposer) {
        if (tacticsData.isFunctionForbidden(TacticsForbiddenFunctions.SellAllWhenBotStops)) {
            botOperatorButtonDisposer.OLrzqt(tacticsData, C33070mpX.AYXKKw(C55688xof.Application.IMediaSessionStubProxy));
        } else {
            botOperatorButtonDisposer.gEmmrt(tacticsData);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1508=10] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void gEmmrt(final TacticsData tacticsData) {
        String str;
        Context contextAEQbTJ;
        String strJoinToString$default;
        Context contextAEQbTJ2;
        String strAYXKKw;
        String copyType;
        Object next;
        String strCopydefault;
        Object next2;
        final Context contextAEQbTJ3;
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt;
        FragmentManager fragmentManagerValueOf = valueOf();
        if (fragmentManagerValueOf != null) {
            String orderType = tacticsData.getOrderType();
            str = "";
            String stopType = null;
            switch (orderType.hashCode()) {
                case -1831183611:
                    if (orderType.equals("spot_dca")) {
                        C53883wtr.Companion.AEQbTJ(tacticsData.getOrderType(), tacticsData.getInstId(), tacticsData.getInstType(), tacticsData.getAlgoId(), "1", tacticsData.getDirection(), false, new Function0() { // from class: o.wRu
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return BotOperatorButtonDisposer.getFieldNames(this.KWHzl, tacticsData);
                            }
                        }).show(fragmentManagerValueOf, "GridBotStopDialogFragment");
                        break;
                    }
                    break;
                case -1418042064:
                    if (orderType.equals("ai_bot") && (contextAEQbTJ = AEQbTJ()) != null) {
                        C52602wRm.OLrzqt.KWHzl(contextAEQbTJ, (1184 & 2) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompat1), (1184 & 4) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.QYvkLl), (1184 & 8) != 0 ? null : null, (1184 & 16) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatCustomAction), (1184 & 32) != 0 ? null : null, (1184 & 64) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.DjWNei), (1184 & 128) != 0 ? null : null, (1184 & 256) != 0 ? null : new Function2() { // from class: o.wRx
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return BotOperatorButtonDisposer.DbNXlk(this.copydefault, tacticsData, (ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                            }
                        }, (1184 & 512) != 0 ? null : new Function2() { // from class: o.wRt
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return BotOperatorButtonDisposer.zLjUOn((ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                            }
                        }, (1184 & 1024) == 0 ? null : null);
                    }
                    break;
                case -1402017003:
                    if (orderType.equals("contract_dca")) {
                        C53883wtr.Companion.AEQbTJ(tacticsData.getOrderType(), tacticsData.getInstId(), tacticsData.getInstType(), tacticsData.getAlgoId(), "1", tacticsData.getDirection(), Intrinsics.EZpvd((Object) tacticsData.getCopyType(), (Object) "3") || Intrinsics.EZpvd((Object) tacticsData.getCopyType(), (Object) "2"), new Function0() { // from class: o.wRD
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return BotOperatorButtonDisposer.iwGUEr(this.KWHzl, tacticsData);
                            }
                        }).show(fragmentManagerValueOf, "GridBotStopDialogFragment");
                        break;
                    }
                    break;
                case -1216369070:
                    if (orderType.equals("smart_portfolio")) {
                        new C53989wvr.ActionBar(tacticsData.getAlgoId(), tacticsData.getOrderType(), tacticsData.getInstId(), tacticsData.getInstType(), tacticsData.getTradeSymbol(), tacticsData.getTvTitle(), tacticsData.getStopType(), tacticsData.getSourceCcy(), tacticsData.getVoucherInfo(), tacticsData.getTotalPnl(), tacticsData.getCopyType(), new Function0() { // from class: o.wRB
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return BotOperatorButtonDisposer.hDKMBd(this.copydefault, tacticsData);
                            }
                        }).KWHzl().show(fragmentManagerValueOf, "StopBotDialogFragment");
                        break;
                    }
                    break;
                case -1148661171:
                    if (orderType.equals("smart_iceberg")) {
                        String strCopydefault2 = C33069mpW.copydefault(C55688xof.Application.setupButtons, C56423yEv.EZpvd(C56390yDp.OLrzqt("cryptoPair", C56033xvF.getCoinTitle$default(tacticsData.getInstType(), tacticsData.getInstId(), false, null, null, 28, null))));
                        Context contextAEQbTJ4 = AEQbTJ();
                        if (contextAEQbTJ4 != null) {
                            C52602wRm.OLrzqt.KWHzl(contextAEQbTJ4, (1184 & 2) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.Rlayout), (1184 & 4) != 0 ? null : strCopydefault2, (1184 & 8) != 0 ? null : null, (1184 & 16) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatCustomAction), (1184 & 32) != 0 ? null : null, (1184 & 64) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.DjWNei), (1184 & 128) != 0 ? null : null, (1184 & 256) != 0 ? null : new Function2() { // from class: o.wRC
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return BotOperatorButtonDisposer.djBIcL(this.KWHzl, tacticsData, (ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                                }
                            }, (1184 & 512) != 0 ? null : new Function2() { // from class: o.wRA
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return BotOperatorButtonDisposer.hDKMBd((ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                                }
                            }, (1184 & 1024) == 0 ? null : null);
                        }
                        break;
                    }
                    break;
                case -1086683216:
                    if (orderType.equals("signal_bot")) {
                        Locale locale = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale, "");
                        String str2 = C38303pTu.KWHzl(locale) ? "、" : ", ";
                        List<String> instIds = tacticsData.getInstIds();
                        if (instIds != null && (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(instIds, str2, null, null, 3, null, new Function1() { // from class: o.wRR
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return BotOperatorButtonDisposer.AYXKKw((java.lang.String) obj);
                            }
                        }, 22, null)) != null) {
                            str = strJoinToString$default;
                        }
                        String strCopydefault3 = C33069mpW.copydefault(C55688xof.Application.Rstyle, C56424yEw.gEmmrt(C56390yDp.OLrzqt("instId", str), C56390yDp.OLrzqt("botName", C33070mpX.AYXKKw(C55688xof.Application.onStop))));
                        Context contextAEQbTJ5 = AEQbTJ();
                        if (contextAEQbTJ5 != null) {
                            C52602wRm.OLrzqt.KWHzl(contextAEQbTJ5, (1184 & 2) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.Rlayout), (1184 & 4) != 0 ? null : strCopydefault3, (1184 & 8) != 0 ? null : null, (1184 & 16) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatCustomAction), (1184 & 32) != 0 ? null : null, (1184 & 64) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.DjWNei), (1184 & 128) != 0 ? null : null, (1184 & 256) != 0 ? null : new Function2() { // from class: o.wRZ
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return BotOperatorButtonDisposer.AkhnZx(this.EZpvd, tacticsData, (ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                                }
                            }, (1184 & 512) != 0 ? null : new Function2() { // from class: o.wSh
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return BotOperatorButtonDisposer.getFieldNames((ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                                }
                            }, (1184 & 1024) == 0 ? null : null);
                        }
                        break;
                    }
                    break;
                case -557961837:
                    if (orderType.equals("smart_arbitrage") && (contextAEQbTJ2 = AEQbTJ()) != null) {
                        final boolean zDjBIcL = djBIcL(tacticsData);
                        if (zDjBIcL && tacticsData.isSmartArbitrageWithStaking()) {
                            C52602wRm c52602wRm = C52602wRm.OLrzqt;
                            String instFamily = tacticsData.getInstFamily();
                            c52602wRm.EZpvd(contextAEQbTJ2, instFamily == null ? "" : instFamily, C55770xqH.Activity.copydefault.OLrzqt(tacticsData.getLeverPrincipal()), new Function0() { // from class: o.wSx
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return BotOperatorButtonDisposer.uzCIH(this.copydefault, tacticsData);
                                }
                            }, new Function0() { // from class: o.wSG
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return BotOperatorButtonDisposer.AuCTelauCTel(this.copydefault, tacticsData);
                                }
                            });
                        } else {
                            TacticsVoucherInfo voucherInfo = tacticsData.getVoucherInfo();
                            final boolean z = voucherInfo != null && voucherInfo.getHasVoucher() && voucherInfo.getVoucherStatus() == VoucherStatus.LossInsuranceVoucherStatus.IN_USE;
                            if (z) {
                                int i = C55688xof.Application.getExtras;
                                String voucherPnlRatio = voucherInfo != null ? voucherInfo.getVoucherPnlRatio() : null;
                                strAYXKKw = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", C56033xvF.fmtBotPnlPercent$default(voucherPnlRatio != null ? voucherPnlRatio : "", false, 0, 6, null))));
                            } else {
                                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompat);
                            }
                            C52602wRm.OLrzqt.KWHzl(contextAEQbTJ2, (1184 & 2) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.Rlayout), (1184 & 4) != 0 ? null : strAYXKKw, (1184 & 8) != 0 ? null : null, (1184 & 16) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.disconnect), (1184 & 32) != 0 ? null : null, (1184 & 64) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.prepareFromUri), (1184 & 128) != 0 ? null : null, (1184 & 256) != 0 ? null : new Function2() { // from class: o.wSN
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return BotOperatorButtonDisposer.uzCIH((ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                                }
                            }, (1184 & 512) != 0 ? null : new Function2() { // from class: o.wSO
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return BotOperatorButtonDisposer.AEQbTJ(z, zDjBIcL, this, tacticsData, (ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                                }
                            }, (1184 & 1024) == 0 ? "stopButton" : null);
                        }
                    }
                    break;
                case -512749997:
                    if (!orderType.equals("contract_grid")) {
                    }
                    copyType = tacticsData.getCopyType();
                    if (!Intrinsics.EZpvd((Object) copyType, (Object) "3")) {
                        if (!Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "grid")) {
                            OLrzqt(tacticsData, C33070mpX.AYXKKw(C55688xof.Application.IMediaSessionStubProxy));
                        } else {
                            List<SignParamItem> signParams = tacticsData.getSignParams();
                            if (signParams != null) {
                                Iterator<T> it = signParams.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        if (Intrinsics.EZpvd((Object) ((SignParamItem) next2).getTriggerAction(), (Object) "stop")) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                SignParamItem signParamItem = (SignParamItem) next2;
                                if (signParamItem != null) {
                                    stopType = signParamItem.getStopType();
                                }
                            }
                            new C53989wvr.ActionBar(tacticsData.getAlgoId(), tacticsData.getOrderType(), tacticsData.getInstId(), tacticsData.getInstType(), tacticsData.getTradeSymbol(), tacticsData.getTvTitle(), stopType, tacticsData.getSourceCcy(), tacticsData.getVoucherInfo(), tacticsData.getTotalPnl(), tacticsData.getCopyType(), new Function0() { // from class: o.wRp
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return BotOperatorButtonDisposer.fJNWhG(this.copydefault, tacticsData);
                                }
                            }).KWHzl().show(fragmentManagerValueOf, "StopBotDialogFragment");
                        }
                    } else if (!Intrinsics.EZpvd((Object) copyType, (Object) "2")) {
                        List<SignParamItem> signParams2 = tacticsData.getSignParams();
                        if (signParams2 != null) {
                            Iterator<T> it2 = signParams2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (Intrinsics.EZpvd((Object) ((SignParamItem) next).getTriggerAction(), (Object) "stop")) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            SignParamItem signParamItem2 = (SignParamItem) next;
                            if (signParamItem2 != null) {
                                stopType = signParamItem2.getStopType();
                            }
                        }
                        String str3 = stopType;
                        if (!Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "contract_grid")) {
                            new C53989wvr.ActionBar(tacticsData.getAlgoId(), tacticsData.getOrderType(), tacticsData.getInstId(), tacticsData.getInstType(), tacticsData.getTradeSymbol(), tacticsData.getTvTitle(), str3, tacticsData.getSourceCcy(), tacticsData.getVoucherInfo(), tacticsData.getTotalPnl(), tacticsData.getCopyType(), new Function0() { // from class: o.wRw
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return BotOperatorButtonDisposer.getNewProxyInstance(this.OLrzqt, tacticsData);
                                }
                            }).KWHzl().show(fragmentManagerValueOf, "StopBotDialogFragment");
                        } else {
                            C53883wtr.TaskDescription taskDescription = C53883wtr.Companion;
                            String orderType2 = tacticsData.getOrderType();
                            String instId = tacticsData.getInstId();
                            String instType = tacticsData.getInstType();
                            String algoId = tacticsData.getAlgoId();
                            if (str3 == null) {
                                str3 = "1";
                            }
                            taskDescription.AEQbTJ(orderType2, instId, instType, algoId, str3, tacticsData.getDirection(), false, new Function0() { // from class: o.wRv
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return BotOperatorButtonDisposer.AuCTel(this.OLrzqt, tacticsData);
                                }
                            }).show(fragmentManagerValueOf, "GridBotStopDialogFragment");
                        }
                    } else {
                        if (Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "grid")) {
                            int i2 = C55688xof.Application.getMediaController;
                            kotlin.Pair[] pairArr = new kotlin.Pair[2];
                            pairArr[0] = C56390yDp.OLrzqt("instId", tacticsData.getInstId());
                            xMR xmr = xMR.copydefault;
                            String profitSharingRatio = tacticsData.getProfitSharingRatio();
                            pairArr[1] = C56390yDp.OLrzqt("percentage", xMR.formatPercent$default(xmr, profitSharingRatio == null ? "" : profitSharingRatio, 0, null, 4, null));
                            strCopydefault = C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr));
                        } else {
                            int i3 = C55688xof.Application.getSessionToken2Bundle;
                            xMR xmr2 = xMR.copydefault;
                            String profitSharingRatio2 = tacticsData.getProfitSharingRatio();
                            if (profitSharingRatio2 == null) {
                                profitSharingRatio2 = "";
                            }
                            strCopydefault = C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt("percentage", xMR.formatPercent$default(xmr2, profitSharingRatio2, 0, null, 4, null))));
                        }
                        OLrzqt(tacticsData, strCopydefault);
                    }
                    break;
                case 3181382:
                    if (!orderType.equals("grid")) {
                    }
                    copyType = tacticsData.getCopyType();
                    if (!Intrinsics.EZpvd((Object) copyType, (Object) "3")) {
                    }
                    break;
                case 3573234:
                    if (!orderType.equals("twap")) {
                    }
                    botOperatorButtonViewModelOLrzqt = OLrzqt();
                    if (botOperatorButtonViewModelOLrzqt != null) {
                        botOperatorButtonViewModelOLrzqt.copydefault(new StrategyStopReq(tacticsData.getAlgoId(), tacticsData.getInstId(), tacticsData.getOrderType(), (String) null, (PlaceOrderCondition) null, (String) null, 56, (DefaultConstructorMarker) null), tacticsData);
                    }
                    break;
                case 1165749981:
                    if (orderType.equals("recurring") && (contextAEQbTJ3 = AEQbTJ()) != null) {
                        String str4 = C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompat1) + " " + tacticsData.getTvTitle() + "?";
                        C52602wRm.OLrzqt.KWHzl(contextAEQbTJ3, (1184 & 2) != 0 ? null : null, (1184 & 4) != 0 ? null : C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(str4, new String[]{str4}, 0, null, false, new Function1() { // from class: o.wRz
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return BotOperatorButtonDisposer.copydefault(contextAEQbTJ3, (java.util.List) obj);
                            }
                        }, 14, null), new String[]{str4}, 0, null, false, new Function1() { // from class: o.wRy
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return BotOperatorButtonDisposer.AEQbTJ((java.util.List) obj);
                            }
                        }, 14, null), (1184 & 8) != 0 ? null : null, (1184 & 16) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatCustomAction), (1184 & 32) != 0 ? null : null, (1184 & 64) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.DjWNei), (1184 & 128) != 0 ? null : null, (1184 & 256) != 0 ? null : new Function2() { // from class: o.wRH
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return BotOperatorButtonDisposer.AhwBna(this.AEQbTJ, tacticsData, (ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                            }
                        }, (1184 & 512) != 0 ? null : new Function2() { // from class: o.wRE
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return BotOperatorButtonDisposer.getNewProxyInstance((ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                            }
                        }, (1184 & 1024) == 0 ? null : null);
                    }
                    break;
                case 1629187779:
                    if (!orderType.equals("iceberg")) {
                    }
                    botOperatorButtonViewModelOLrzqt = OLrzqt();
                    if (botOperatorButtonViewModelOLrzqt != null) {
                    }
                    break;
                case 1780188297:
                    if (!orderType.equals("arbitrage")) {
                    }
                    botOperatorButtonViewModelOLrzqt = OLrzqt();
                    if (botOperatorButtonViewModelOLrzqt != null) {
                    }
                    break;
            }
        }
    }

    public static final Unit fJNWhG(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData) {
        botOperatorButtonDisposer.AEQbTJ(tacticsData);
        botOperatorButtonDisposer.KWHzl();
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData) {
        botOperatorButtonDisposer.AEQbTJ(tacticsData);
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData) {
        botOperatorButtonDisposer.AEQbTJ(tacticsData);
        botOperatorButtonDisposer.KWHzl();
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData) {
        botOperatorButtonDisposer.AEQbTJ(tacticsData);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
        if (botOperatorButtonViewModelOLrzqt != null) {
            botOperatorButtonViewModelOLrzqt.copydefault(new StrategyStopReq(tacticsData.getAlgoId(), tacticsData.getInstId(), tacticsData.getOrderType(), (String) null, (PlaceOrderCondition) null, (String) null, 56, (DefaultConstructorMarker) null), tacticsData);
        }
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Context context, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new TextAppearanceSpan(context, C32113mPz.Dialog.valueOf));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.iLWfRf)));
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
        if (botOperatorButtonViewModelOLrzqt != null) {
            botOperatorButtonViewModelOLrzqt.copydefault(new StrategyStopReq(tacticsData.getAlgoId(), tacticsData.getInstId(), tacticsData.getOrderType(), "1", (PlaceOrderCondition) null, (String) null, 48, (DefaultConstructorMarker) null), tacticsData);
        }
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public static final Unit getFieldNames(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData) {
        botOperatorButtonDisposer.AEQbTJ(tacticsData);
        return Unit.INSTANCE;
    }

    public static final Unit iwGUEr(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData) {
        botOperatorButtonDisposer.AEQbTJ(tacticsData);
        return Unit.INSTANCE;
    }

    public static final CharSequence AYXKKw(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56033xvF.getCoinTitle$default("SWAP", str, false, null, null, 24, null);
    }

    public static final Unit AkhnZx(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
        if (botOperatorButtonViewModelOLrzqt != null) {
            botOperatorButtonViewModelOLrzqt.copydefault(new StrategyStopReq(tacticsData.getAlgoId(), tacticsData.getInstId(), tacticsData.getOrderType(), "1", (PlaceOrderCondition) null, (String) null, 48, (DefaultConstructorMarker) null), tacticsData);
        }
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public static final Unit getFieldNames(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData) {
        botOperatorButtonDisposer.EZpvd(tacticsData, OrderDetailListItem.SLIP_OUT);
        return Unit.INSTANCE;
    }

    public static final Unit AuCTelauCTel(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData) {
        startConfirm$default(botOperatorButtonDisposer, tacticsData, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.unify_trade.bot.presenter.BotOperatorButtonViewModel.stopTactics$default(com.okinc.unify_trade.bot.presenter.BotOperatorButtonViewModel, com.okinc.unify_trade.biz.StrategyStopReq, com.okinc.unify_trade.bot.data.TacticsData, int, java.lang.Object):void */
    public static final Unit AEQbTJ(boolean z, boolean z2, BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        if (!z && z2) {
            startConfirm$default(botOperatorButtonDisposer, tacticsData, null, 2, null);
        } else {
            BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
            if (botOperatorButtonViewModelOLrzqt != null) {
                BotOperatorButtonViewModel.stopTactics$default(botOperatorButtonViewModelOLrzqt, new StrategyStopReq(tacticsData.getAlgoId(), (String) null, (String) null, (String) null, (PlaceOrderCondition) null, (String) null, 62, (DefaultConstructorMarker) null), null, 2, null);
            }
        }
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
        if (botOperatorButtonViewModelOLrzqt != null) {
            botOperatorButtonViewModelOLrzqt.copydefault(new StrategyStopReq(tacticsData.getAlgoId(), "", tacticsData.getOrderType(), "", (PlaceOrderCondition) null, (String) null, 48, (DefaultConstructorMarker) null), tacticsData);
        }
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public static final Unit zLjUOn(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        InterfaceC52662wTs interfaceC52662wTs = this.AEQbTJ;
        if (interfaceC52662wTs != null) {
            interfaceC52662wTs.fARcdN();
        }
    }

    public final void OLrzqt(final TacticsData tacticsData, String str) {
        Context contextAEQbTJ = AEQbTJ();
        if (contextAEQbTJ != null) {
            C52602wRm.OLrzqt.KWHzl(contextAEQbTJ, (1184 & 2) != 0 ? null : C33069mpW.copydefault(C55688xof.Application.unregisterOnBackInvokedCallback, C56423yEv.EZpvd(C56390yDp.OLrzqt("botName", C56033xvF.iwGUEr(tacticsData.getOrderType())))), (1184 & 4) != 0 ? null : str, (1184 & 8) != 0 ? null : null, (1184 & 16) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatCustomAction), (1184 & 32) != 0 ? null : null, (1184 & 64) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.DjWNei), (1184 & 128) != 0 ? null : null, (1184 & 256) != 0 ? null : new Function2() { // from class: o.wSF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return BotOperatorButtonDisposer.AYXKKw(this.KWHzl, tacticsData, (ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                }
            }, (1184 & 512) != 0 ? null : null, (1184 & 1024) == 0 ? null : null);
        }
    }

    public static final Unit AYXKKw(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
        if (botOperatorButtonViewModelOLrzqt != null) {
            botOperatorButtonViewModelOLrzqt.copydefault(new StrategyStopReq(tacticsData.getAlgoId(), tacticsData.getInstId(), tacticsData.getOrderType(), "1", (PlaceOrderCondition) null, (String) null, 48, (DefaultConstructorMarker) null), tacticsData);
        }
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(TacticsData tacticsData) {
        FragmentManager fragmentManagerValueOf = valueOf();
        if (fragmentManagerValueOf != null) {
            if (tacticsData != null && C33129mqd.AEQbTJ(tacticsData.getPnlRatio(), 0)) {
                BotPreShareBottomSheet.ActionBar.newInstance$default(BotPreShareBottomSheet.Companion, new BotPreShareBottomSheet.UiParam(C33070mpX.AYXKKw(C48033uCm.Fragment.hpmliR), C33070mpX.AYXKKw(C48033uCm.Fragment.DcMfJKfbSiEC), C56068xvo.copydefault.copydefault(tacticsData.getShareData().getMainDataValue(), true), tacticsData, Integer.valueOf(C52761wXj.PendingIntent.uzCIH), null, 32, null), new Function1() { // from class: o.wSD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return BotOperatorButtonDisposer.DbNXlk(this.KWHzl, (TacticsData) obj);
                    }
                }, null, 4, null).show(fragmentManagerValueOf);
            } else {
                C55328xhq.showWithLoading$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C55688xof.Application.ActivityResultCaller), null, 0, null, 0, 0, 62, null);
            }
        }
    }

    public static final Unit DbNXlk(BotOperatorButtonDisposer botOperatorButtonDisposer, TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        InterfaceC52662wTs interfaceC52662wTs = botOperatorButtonDisposer.AEQbTJ;
        if (interfaceC52662wTs != null) {
            interfaceC52662wTs.EZpvd(tacticsData);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(final TacticsData tacticsData, final Function0<Unit> function0) {
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt;
        final String str = "tag_start_bot_confirm-" + C54589xNz.EZpvd.EZpvd() + "-" + C55697xoo.OLrzqt.gEmmrt();
        if (tacticsData.isStartActionContainsWebHook()) {
            final Context contextAEQbTJ = AEQbTJ();
            if (contextAEQbTJ != null) {
                C52602wRm.OLrzqt.KWHzl(contextAEQbTJ, (1184 & 2) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.onItemClick), (1184 & 4) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.AlertControllerAlertParams4), (1184 & 8) != 0 ? null : null, (1184 & 16) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI), (1184 & 32) != 0 ? null : Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), (1184 & 64) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.onConfigurationChanged), (1184 & 128) != 0 ? null : Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), (1184 & 256) != 0 ? null : new Function2() { // from class: o.wSK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return BotOperatorButtonDisposer.KWHzl(this.EZpvd, contextAEQbTJ, tacticsData, function0, (ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                    }
                }, (1184 & 512) != 0 ? null : new Function2() { // from class: o.wSJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return BotOperatorButtonDisposer.ejfBZ((ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                    }
                }, (1184 & 1024) == 0 ? null : null);
                return;
            }
            return;
        }
        if ((Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "grid") || Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "contract_grid")) && SPUtils.getBoolean(str, true) && !tacticsData.isStartActionContainsPrice()) {
            final Context contextAEQbTJ2 = AEQbTJ();
            if (contextAEQbTJ2 != null) {
                C52602wRm c52602wRm = C52602wRm.OLrzqt;
                final wYK wykAEQbTJ = c52602wRm.AEQbTJ(contextAEQbTJ2, C55688xof.Application.onPanelClosed, TextView.BufferType.NORMAL);
                c52602wRm.KWHzl(contextAEQbTJ2, (1184 & 2) != 0 ? null : null, (1184 & 4) != 0 ? null : C33069mpW.copydefault(C55688xof.Application.MediaControllerCompatApi21, C56423yEv.EZpvd(C56390yDp.OLrzqt("cryptoPair", C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, tacticsData.getInstId(), tacticsData.getInstType(), false, false, 12, null)))), (1184 & 8) != 0 ? null : C56390yDp.OLrzqt(wykAEQbTJ, Integer.valueOf(C55298xhM.dp2px$default(16.0f, null, 1, null))), (1184 & 16) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI), (1184 & 32) != 0 ? null : null, (1184 & 64) != 0 ? null : C33070mpX.AYXKKw(C55688xof.Application.onConfigurationChanged), (1184 & 128) != 0 ? null : null, (1184 & 256) != 0 ? null : new Function2() { // from class: o.wSH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return BotOperatorButtonDisposer.KWHzl(this.AEQbTJ, contextAEQbTJ2, tacticsData, function0, wykAEQbTJ, str, (ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                    }
                }, (1184 & 512) != 0 ? null : new Function2() { // from class: o.wSP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return BotOperatorButtonDisposer.fJNWhG((ViewOnClickListenerC54939xaY) obj, (android.view.View) obj2);
                    }
                }, (1184 & 1024) == 0 ? null : null);
                return;
            }
            return;
        }
        Context contextAEQbTJ3 = AEQbTJ();
        if (contextAEQbTJ3 == null || (botOperatorButtonViewModelOLrzqt = OLrzqt()) == null) {
            return;
        }
        BotOperatorButtonViewModel.instantTrigger$default(botOperatorButtonViewModelOLrzqt, contextAEQbTJ3, tacticsData, function0, null, 8, null);
    }

    public static final Unit KWHzl(BotOperatorButtonDisposer botOperatorButtonDisposer, Context context, TacticsData tacticsData, Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
        if (botOperatorButtonViewModelOLrzqt != null) {
            BotOperatorButtonViewModel.instantTrigger$default(botOperatorButtonViewModelOLrzqt, context, tacticsData, function0, null, 8, null);
        }
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(BotOperatorButtonDisposer botOperatorButtonDisposer, Context context, TacticsData tacticsData, Function0 function0, wYK wyk, String str, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
        if (botOperatorButtonViewModelOLrzqt != null) {
            BotOperatorButtonViewModel.instantTrigger$default(botOperatorButtonViewModelOLrzqt, context, tacticsData, function0, null, 8, null);
        }
        if (wyk.isChecked()) {
            SPUtils.put(str, Boolean.FALSE);
        }
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC54939xaY.dismiss();
        return Unit.INSTANCE;
    }

    public final void KWHzl(TacticsData tacticsData) {
        FragmentManager fragmentManagerValueOf = valueOf();
        if (fragmentManagerValueOf != null) {
            if (C33129mqd.AEQbTJ(tacticsData.getSymbolsNumber(), 1)) {
                vZJ.Companion.KWHzl(tacticsData.getAlgoId(), tacticsData.getOriginalLevel(), fragmentManagerValueOf);
                return;
            }
            vYG.Application application = vYG.Companion;
            String instId = tacticsData.getInstId();
            String instType = tacticsData.getInstType();
            String algoId = tacticsData.getAlgoId();
            String originalLevel = tacticsData.getOriginalLevel();
            if (originalLevel == null) {
                originalLevel = "";
            }
            application.copydefault(new DetailsData(null, instId, instType, algoId, null, null, false, C56033xvF.uzCIH(tacticsData.getOrderType()), null, null, originalLevel, null, null, null, false, 0, 0, null, null, null, null, false, null, 8371057, null), fragmentManagerValueOf);
        }
    }

    public final void OLrzqt(TacticsData tacticsData) {
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = OLrzqt();
        if (botOperatorButtonViewModelOLrzqt != null) {
            botOperatorButtonViewModelOLrzqt.copydefault(tacticsData);
        }
    }

    public final void EZpvd(TacticsData tacticsData, FragmentManager fragmentManager) {
        SmartEarnParamsCheckUseCase.Result resultCopydefault;
        BotOperatorViewModel botOperatorViewModelCopydefault;
        SmartEarnConfig smartEarnConfigOLrzqt;
        Context contextAEQbTJ;
        BotOperatorViewModel botOperatorViewModelCopydefault2 = copydefault();
        if (botOperatorViewModelCopydefault2 == null || (resultCopydefault = botOperatorViewModelCopydefault2.copydefault()) == null || (botOperatorViewModelCopydefault = copydefault()) == null || (smartEarnConfigOLrzqt = botOperatorViewModelCopydefault.OLrzqt()) == null || (contextAEQbTJ = AEQbTJ()) == null) {
            return;
        }
        if (!(resultCopydefault instanceof SmartEarnParamsCheckUseCase.Result.Success)) {
            String strKWHzl = resultCopydefault.KWHzl();
            if (strKWHzl == null) {
                return;
            }
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextAEQbTJ);
            viewOnClickListenerC54939xaY.setTitle(C48033uCm.Fragment.OAUGar);
            viewOnClickListenerC54939xaY.EZpvd(strKWHzl);
            viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new View.OnClickListener() { // from class: o.wSl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    BotOperatorButtonDisposer.fetchVPNInfo(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
            return;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        C54782xVc.AEQbTJ.AhwBna(interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, tacticsData.getInstType(), tacticsData.getInstId(), null, null, 12, null) : null);
        xLX.OLrzqt(BizInfoConfig.DefaultBizConfig.copydefault).KWHzl(new BizInfoConfig.CustomArgsBizConfig(tacticsData.getInstType(), tacticsData.getInstId()));
        SmartEarnAllocationBottomSheet.Companion.KWHzl(tacticsData.getLastPrice(), tacticsData.getMinPx(), tacticsData.getMaxPx(), smartEarnConfigOLrzqt, tacticsData.getSimpleEarn(), new BotModel(tacticsData.getAlgoId(), tacticsData.getInstId(), tacticsData.getInstType())).show(fragmentManager, "SmartEarnAllocationBottomSheet");
        EZpvd();
    }

    public static final void fetchVPNInfo(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void EZpvd() {
        Fragment fragmentFindFragmentByTag;
        FragmentManager fragmentManagerValueOf = valueOf();
        if (fragmentManagerValueOf == null || (fragmentFindFragmentByTag = fragmentManagerValueOf.findFragmentByTag(C53875wtj.class.getSimpleName())) == null || !(fragmentFindFragmentByTag instanceof DialogFragment)) {
            return;
        }
        ((DialogFragment) fragmentFindFragmentByTag).dismissAllowingStateLoss();
    }

    private final void AYXKKw() {
        Object objAEQbTJ = AEQbTJ();
        InterfaceC33075mpc interfaceC33075mpc = objAEQbTJ instanceof InterfaceC33075mpc ? (InterfaceC33075mpc) objAEQbTJ : null;
        if (interfaceC33075mpc != null) {
            interfaceC33075mpc.showLoading();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AhwBna() {
        Object objAEQbTJ = AEQbTJ();
        InterfaceC33075mpc interfaceC33075mpc = objAEQbTJ instanceof InterfaceC33075mpc ? (InterfaceC33075mpc) objAEQbTJ : null;
        if (interfaceC33075mpc != null) {
            interfaceC33075mpc.releaseLoading();
        }
    }

    public static final Unit AEQbTJ(SignalCoinPairBean signalCoinPairBean, FragmentManager fragmentManager, List list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SignalCoinPairItemData) it.next()).getInstId());
        }
        ArrayList<FetchMultiInstsResult> lastSelectedList = signalCoinPairBean.getLastSelectedList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = lastSelectedList.iterator();
        while (it2.hasNext()) {
            String instId = ((FetchMultiInstsResult) it2.next()).getInstId();
            if (instId != null) {
                arrayList2.add(instId);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!arrayList2.contains((String) obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!arrayList.contains((String) obj2)) {
                arrayList4.add(obj2);
            }
        }
        if (arrayList3.isEmpty() && arrayList4.isEmpty()) {
            return Unit.INSTANCE;
        }
        C50719vYv.Companion.EZpvd(new EditCoinPairBean(arrayList, arrayList3, arrayList4, signalCoinPairBean.getData())).show(fragmentManager);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(BotOperatorButtonDisposer botOperatorButtonDisposer, String str, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C55801xqm c55801xqm = (C55801xqm) it.next();
            arrayList2.add(new RecurringPriceRangeItem(c55801xqm.OLrzqt(), c55801xqm.AYXKKw(), c55801xqm.valueOf()));
        }
        RecurringEditPriceRangeReq recurringEditPriceRangeReq = new RecurringEditPriceRangeReq(str, arrayList2);
        BotOperatorButtonViewModel botOperatorButtonViewModelOLrzqt = botOperatorButtonDisposer.OLrzqt();
        if (botOperatorButtonViewModelOLrzqt != null) {
            botOperatorButtonViewModelOLrzqt.AEQbTJ(recurringEditPriceRangeReq);
        }
        return Unit.INSTANCE;
    }
}
