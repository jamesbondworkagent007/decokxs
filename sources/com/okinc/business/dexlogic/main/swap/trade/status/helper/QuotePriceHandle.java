package com.okinc.business.dexlogic.main.swap.trade.status.helper;

import android.util.LruCache;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.DexTransferData;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.CommonDexInfo;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.PathSelectionRouterItem;
import com.okinc.business.dexlogic.bean.QuoteErrorBean;
import com.okinc.business.dexlogic.bean.QuotePriceReq;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.quote.InputCondition;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.QuotePriceHandle;
import com.okinc.business.dexlogic.net.DexSourceResp;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.wallet.api.WalletDexService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import o.AbstractC23101hrq;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C22332hdP;
import o.C22341hdY;
import o.C22374heE;
import o.C22380heK;
import o.C22825hmf;
import o.C22901hoB;
import o.C22982hpd;
import o.C23212htv;
import o.C23314hvr;
import o.C25416iwM;
import o.C31212lpk;
import o.C33050mpD;
import o.C33129mqd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.InterfaceC22598hiQ;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC9738bbJ;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class QuotePriceHandle {
    public static final int $stable = 8;
    private MutableLiveData<WalletDexService.AAFreeGasInfo> aaWalletFreeGasLiveData;
    private MutableLiveData<WalletDexService.FeeInfo> btcFreeGasLiveData;
    private String coinUniqueKey;
    private QuotePriceRes confirmQuotePriceRes;
    private C22341hdY currentBridgeInfo;
    private boolean isInitFee;
    private MutableLiveData<List<PathSelectionRouterItem>> pathSelectionRouterListLiveData;
    private Object quotePriceKey;
    private QuotePriceRes quotePriceRes;
    private final String sourceType;
    private Job startPollingJob;
    private LruCache<String, Boolean> stateInfoMap;
    private final AbstractC23101hrq viewModel;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<WalletDexService.AAFreeGasInfo> getAaWalletFreeGasLiveData() {
        return this.aaWalletFreeGasLiveData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<WalletDexService.FeeInfo> getBtcFreeGasLiveData() {
        return this.btcFreeGasLiveData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuotePriceRes getConfirmQuotePriceRes() {
        return this.confirmQuotePriceRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22341hdY getCurrentBridgeInfo() {
        return this.currentBridgeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<List<PathSelectionRouterItem>> getPathSelectionRouterListLiveData() {
        return this.pathSelectionRouterListLiveData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuotePriceRes getQuotePrice() {
        return this.quotePriceRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isInitFee() {
        return this.isInitFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void resetQuotePrice() {
        this.quotePriceRes = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAaWalletFreeGasLiveData(@NotNull MutableLiveData<WalletDexService.AAFreeGasInfo> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.aaWalletFreeGasLiveData = mutableLiveData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBtcFreeGasLiveData(@NotNull MutableLiveData<WalletDexService.FeeInfo> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.btcFreeGasLiveData = mutableLiveData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentBridgeInfo(@NotNull C22341hdY c22341hdY) {
        Intrinsics.checkNotNullParameter(c22341hdY, "");
        this.currentBridgeInfo = c22341hdY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitFee(boolean z) {
        this.isInitFee = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPathSelectionRouterListLiveData(@NotNull MutableLiveData<List<PathSelectionRouterItem>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.pathSelectionRouterListLiveData = mutableLiveData;
    }

    public QuotePriceHandle(@NotNull String str, @NotNull AbstractC23101hrq abstractC23101hrq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        this.sourceType = str;
        this.viewModel = abstractC23101hrq;
        this.quotePriceKey = new Object();
        this.stateInfoMap = new LruCache<>(10);
        this.coinUniqueKey = "";
        this.isInitFee = true;
        this.btcFreeGasLiveData = new MutableLiveData<>();
        this.aaWalletFreeGasLiveData = new MutableLiveData<>();
        this.pathSelectionRouterListLiveData = new MutableLiveData<>();
    }

    public final void setConfirmQuotePriceRes(@NotNull QuotePriceRes quotePriceRes) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        quotePriceRes.resetVerifyDexUniqueKey();
        this.confirmQuotePriceRes = quotePriceRes;
    }

    private final void calculateTransactionFee(final DexMultiTokenInfoBean dexMultiTokenInfoBean, final String str, final String str2) {
        final C22374heE c22374heECopydefault = C22380heK.OLrzqt.copydefault(this.sourceType);
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = c22374heECopydefault.fARcdN().OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.hpg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return QuotePriceHandle.calculateTransactionFee$lambda$12$lambda$8(c22374heECopydefault, str2, this, dexMultiTokenInfoBean, str, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hoL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hoQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return QuotePriceHandle.calculateTransactionFee$lambda$12$lambda$10(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hoO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function12.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.quotePriceKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit calculateTransactionFee$lambda$12$lambda$8(C22374heE c22374heE, String str, final QuotePriceHandle quotePriceHandle, DexMultiTokenInfoBean dexMultiTokenInfoBean, String str2, InterfaceC9738bbJ interfaceC9738bbJ) {
        if (interfaceC9738bbJ.getFieldNames()) {
            AbstractC58185ywX<WalletDexService.AAFreeGasInfo> abstractC58185ywXAEQbTJ = c22374heE.fARcdN().AEQbTJ(str, interfaceC9738bbJ.EZpvd(C33129mqd.valueOf(str)));
            final Function1 function1 = new Function1() { // from class: o.hoR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return QuotePriceHandle.calculateTransactionFee$lambda$12$lambda$8$lambda$0(this.OLrzqt, (WalletDexService.AAFreeGasInfo) obj);
                }
            };
            InterfaceC58227yxM<? super WalletDexService.AAFreeGasInfo> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hoN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.hoP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return QuotePriceHandle.calculateTransactionFee$lambda$12$lambda$8$lambda$2(this.copydefault, (java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hoW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    function12.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
            C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, quotePriceHandle.quotePriceKey);
        } else {
            AbstractC58185ywX<WalletDexService.FeeInfo> abstractC58185ywXEZpvd = c22374heE.fARcdN().EZpvd(interfaceC9738bbJ.DbNXlk(), null, str, new DexTransferData(dexMultiTokenInfoBean.isMainChainCoin(), dexMultiTokenInfoBean.getOriginContractAddress(), str2, (String) null, (String) null, (String) null, (String) null, 120, (DefaultConstructorMarker) null));
            final Function1 function13 = new Function1() { // from class: o.hoV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return QuotePriceHandle.calculateTransactionFee$lambda$12$lambda$8$lambda$4(this.EZpvd, (WalletDexService.FeeInfo) obj);
                }
            };
            InterfaceC58227yxM<? super WalletDexService.FeeInfo> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.hoT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    function13.invoke(obj);
                }
            };
            final Function1 function14 = new Function1() { // from class: o.hoS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return QuotePriceHandle.calculateTransactionFee$lambda$12$lambda$8$lambda$6(this.EZpvd, (java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ2 = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.hpb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    function14.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ2, "");
            C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ2, quotePriceHandle.quotePriceKey);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit calculateTransactionFee$lambda$12$lambda$8$lambda$0(QuotePriceHandle quotePriceHandle, WalletDexService.AAFreeGasInfo aAFreeGasInfo) {
        quotePriceHandle.aaWalletFreeGasLiveData.postValue(aAFreeGasInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit calculateTransactionFee$lambda$12$lambda$8$lambda$2(QuotePriceHandle quotePriceHandle, Throwable th) {
        quotePriceHandle.aaWalletFreeGasLiveData.postValue(new WalletDexService.AAFreeGasInfo(null, 0, 0, 0, 15, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit calculateTransactionFee$lambda$12$lambda$8$lambda$4(QuotePriceHandle quotePriceHandle, WalletDexService.FeeInfo feeInfo) {
        quotePriceHandle.btcFreeGasLiveData.postValue(feeInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit calculateTransactionFee$lambda$12$lambda$8$lambda$6(QuotePriceHandle quotePriceHandle, Throwable th) {
        quotePriceHandle.btcFreeGasLiveData.postValue(new WalletDexService.FeeInfo(null, null, null, 7, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit calculateTransactionFee$lambda$12$lambda$10(QuotePriceHandle quotePriceHandle, Throwable th) {
        quotePriceHandle.btcFreeGasLiveData.postValue(new WalletDexService.FeeInfo(null, null, null, 7, null));
        return Unit.INSTANCE;
    }

    public final void getQuotePriceOnce(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        final DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = this.viewModel.QUSxYX().copydefault();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = this.viewModel.QUSxYX().valueOf();
        if (dexMultiTokenInfoBeanCopydefault == null || dexMultiTokenInfoBeanValueOf == null) {
            return;
        }
        final MutableLiveData<Pair<String, String>> mutableLiveDataGkJEwt = this.viewModel.gkJEwt();
        final String strEZpvd = this.viewModel.QUSxYX().EZpvd();
        this.viewModel.DTwDnp().postValue(Boolean.TRUE);
        QuotePriceReq quotePriceReqCreateQuotePriceReq = createQuotePriceReq(str, str2);
        if (quotePriceReqCreateQuotePriceReq == null) {
            return;
        }
        AbstractC58185ywX<QuotePriceRes> abstractC58185ywXKWHzl = this.viewModel.getFieldNames().KWHzl(quotePriceReqCreateQuotePriceReq);
        final Function1 function1 = new Function1() { // from class: o.hpa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return QuotePriceHandle.getQuotePriceOnce$lambda$13(this.copydefault, strEZpvd, mutableLiveDataGkJEwt, dexMultiTokenInfoBeanCopydefault, (QuotePriceRes) obj);
            }
        };
        InterfaceC58227yxM<? super QuotePriceRes> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hoZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hpf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return QuotePriceHandle.getQuotePriceOnce$lambda$15(mutableLiveDataGkJEwt, dexMultiTokenInfoBeanCopydefault, strEZpvd, this, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hpc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function12.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.quotePriceKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getQuotePriceOnce$lambda$13(QuotePriceHandle quotePriceHandle, String str, MutableLiveData mutableLiveData, DexMultiTokenInfoBean dexMultiTokenInfoBean, QuotePriceRes quotePriceRes) {
        quotePriceHandle.viewModel.DTwDnp().postValue(Boolean.FALSE);
        if (C33129mqd.OLrzqt((CharSequence) quotePriceRes.getCommonDexInfo().getEstimateReserveGasTokenFee())) {
            str = quotePriceRes.getCommonDexInfo().getEstimateReserveGasTokenFee();
        }
        mutableLiveData.postValue(C56390yDp.OLrzqt(dexMultiTokenInfoBean.getChainId(), str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getQuotePriceOnce$lambda$15(MutableLiveData mutableLiveData, DexMultiTokenInfoBean dexMultiTokenInfoBean, String str, QuotePriceHandle quotePriceHandle, Throwable th) {
        mutableLiveData.postValue(C56390yDp.OLrzqt(dexMultiTokenInfoBean.getChainId(), str));
        quotePriceHandle.viewModel.DTwDnp().postValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexlogic.main.swap.trade.status.helper.QuotePriceHandle */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getQuotePrice$default(QuotePriceHandle quotePriceHandle, InputCondition inputCondition, String str, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 8) != 0) {
            function12 = null;
        }
        quotePriceHandle.getQuotePrice(inputCondition, str, function1, function12);
    }

    public final void getQuotePrice(@NotNull InputCondition inputCondition, @NotNull String str, @NotNull final Function1<? super Boolean, Unit> function1, final Function1<? super Boolean, Unit> function12) {
        TradeStatePool tradeStatePool;
        String str2;
        Intrinsics.checkNotNullParameter(inputCondition, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = this.viewModel.QUSxYX().copydefault();
        final DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = this.viewModel.QUSxYX().valueOf();
        if (dexMultiTokenInfoBeanCopydefault == null || dexMultiTokenInfoBeanValueOf == null) {
            return;
        }
        String strAkhnZx = this.viewModel.AkhnZx();
        TradeStatePool tradeStatePoolDHguZz = this.viewModel.dHguZz();
        final MutableLiveData<QuotePriceRes> mutableLiveDataAubY = this.viewModel.AubY();
        final MutableLiveData<ConsumeData<QuoteErrorBean>> mutableLiveDataHUfVAv = this.viewModel.hUfVAv();
        final String uniqueKey = getUniqueKey(strAkhnZx, dexMultiTokenInfoBeanCopydefault, dexMultiTokenInfoBeanValueOf, this.viewModel.UlJrfe() ? "" : this.viewModel.finit().KWHzl(), str);
        SwapState swapStateOLrzqt = C22825hmf.OLrzqt.OLrzqt(this.sourceType, dexMultiTokenInfoBeanCopydefault.getChainId(), dexMultiTokenInfoBeanValueOf.getChainId(), this.viewModel.UlJrfe());
        if (swapStateOLrzqt.isDAppRedirectState()) {
            if (dexMultiTokenInfoBeanCopydefault.isRiskToken() || dexMultiTokenInfoBeanValueOf.isRiskToken()) {
                QuotePriceRes quotePriceRes = this.quotePriceRes;
                if (quotePriceRes != null) {
                    tradeStatePool = tradeStatePoolDHguZz;
                    str2 = strAkhnZx;
                    C22982hpd.KWHzl(quotePriceRes, this.sourceType, tradeStatePool, mutableLiveDataAubY, mutableLiveDataHUfVAv, str2);
                }
            } else if (!this.viewModel.QVsKAR().isWalletError(this.sourceType)) {
                tradeStatePoolDHguZz.refreshStatePool(new TradeStep(CheckStep.QUOTES, true, swapStateOLrzqt, true, false));
            }
            tradeStatePool = tradeStatePoolDHguZz;
            str2 = strAkhnZx;
        } else {
            tradeStatePool = tradeStatePoolDHguZz;
            str2 = strAkhnZx;
        }
        Boolean value = inputCondition.getInputFinish().getValue();
        Boolean bool = Boolean.FALSE;
        if (Intrinsics.EZpvd(value, bool) || swapStateOLrzqt.isDAppRedirectState()) {
            disposeQuote();
            if (function12 != null) {
                function12.invoke(bool);
                return;
            }
            return;
        }
        Boolean bool2 = this.stateInfoMap.get(uniqueKey);
        Boolean bool3 = Boolean.TRUE;
        if (Intrinsics.EZpvd(bool2, bool3)) {
            if (function12 != null) {
                function12.invoke(bool);
                return;
            }
            return;
        }
        disposeQuote();
        tradeStatePool.setQuotePriceSuccess(false);
        tradeStatePool.refreshStatePool(new TradeStep(CheckStep.QUOTES, false, SwapState.FETCHING_QUOTES, false, false));
        this.stateInfoMap.put(uniqueKey, bool3);
        final QuotePriceReq quotePriceReqCreateQuotePriceReq = createQuotePriceReq(str2, str);
        if (quotePriceReqCreateQuotePriceReq == null) {
            return;
        }
        this.viewModel.copydefault(quotePriceReqCreateQuotePriceReq);
        if (C33129mqd.OLrzqt((CharSequence) str2)) {
            InterfaceC22598hiQ fieldNames = this.viewModel.getFieldNames();
            String strAxsJAY = this.viewModel.AxsJAY();
            if (strAxsJAY.length() == 0) {
                strAxsJAY = "11";
            }
            final String str3 = str2;
            final TradeStatePool tradeStatePool2 = tradeStatePool;
            AbstractC58185ywX<DexSourceResp<QuotePriceRes>> abstractC58185ywXAEQbTJ = fieldNames.AEQbTJ(quotePriceReqCreateQuotePriceReq.copy((1966079 & 1) != 0 ? quotePriceReqCreateQuotePriceReq.fromTokenAddress : null, (1966079 & 2) != 0 ? quotePriceReqCreateQuotePriceReq.amount : null, (1966079 & 4) != 0 ? quotePriceReqCreateQuotePriceReq.toTokenAddress : null, (1966079 & 8) != 0 ? quotePriceReqCreateQuotePriceReq.fromTokenDecimal : null, (1966079 & 16) != 0 ? quotePriceReqCreateQuotePriceReq.toTokenDecimal : null, (1966079 & 32) != 0 ? quotePriceReqCreateQuotePriceReq.chainId : null, (1966079 & 64) != 0 ? quotePriceReqCreateQuotePriceReq.gasLevel : null, (1966079 & 128) != 0 ? quotePriceReqCreateQuotePriceReq.toChainId : null, (1966079 & 256) != 0 ? quotePriceReqCreateQuotePriceReq.slippage : null, (1966079 & 512) != 0 ? quotePriceReqCreateQuotePriceReq.pmm : null, (1966079 & 1024) != 0 ? quotePriceReqCreateQuotePriceReq.slippageType : null, (1966079 & 2048) != 0 ? quotePriceReqCreateQuotePriceReq.maxSlippage : null, (1966079 & 4096) != 0 ? quotePriceReqCreateQuotePriceReq.quoteBizType : null, (1966079 & 8192) != 0 ? quotePriceReqCreateQuotePriceReq.dexIds : null, (1966079 & 16384) != 0 ? quotePriceReqCreateQuotePriceReq.forbiddenBridgeTypes : null, (1966079 & 32768) != 0 ? quotePriceReqCreateQuotePriceReq.userWalletAddress : null, (1966079 & 65536) != 0 ? quotePriceReqCreateQuotePriceReq.receiveWalletAddress : null, (1966079 & 131072) != 0 ? quotePriceReqCreateQuotePriceReq.defiPlatformIds : C56402yEa.EZpvd(strAxsJAY), (1966079 & 262144) != 0 ? quotePriceReqCreateQuotePriceReq.refCode : null, (1966079 & 524288) != 0 ? quotePriceReqCreateQuotePriceReq.referralCommissionJsVersion : null, (1966079 & 1048576) != 0 ? quotePriceReqCreateQuotePriceReq.accountInfo : null), new Function1() { // from class: o.hoJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return QuotePriceHandle.getQuotePrice$lambda$18(quotePriceReqCreateQuotePriceReq, this, dexMultiTokenInfoBeanCopydefault, str3, function1, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            final Function1 function13 = new Function1() { // from class: o.hoM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return QuotePriceHandle.getQuotePrice$lambda$21(this.copydefault, uniqueKey, dexMultiTokenInfoBeanCopydefault, dexMultiTokenInfoBeanValueOf, tradeStatePool2, mutableLiveDataAubY, mutableLiveDataHUfVAv, str3, function12, (DexSourceResp) obj);
                }
            };
            InterfaceC58227yxM<? super DexSourceResp<QuotePriceRes>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hoU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    function13.invoke(obj);
                }
            };
            final Function1 function14 = new Function1() { // from class: o.hoX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return QuotePriceHandle.getQuotePrice$lambda$23(function12, this, uniqueKey, tradeStatePool2, mutableLiveDataAubY, mutableLiveDataHUfVAv, (java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hoY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    function14.invoke(obj);
                }
            });
            if (interfaceC58217yxCAEQbTJ != null) {
                C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.quotePriceKey);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getQuotePrice$lambda$18(QuotePriceReq quotePriceReq, QuotePriceHandle quotePriceHandle, DexMultiTokenInfoBean dexMultiTokenInfoBean, String str, Function1 function1, boolean z) {
        if (!z) {
            quotePriceReq.setForbiddenBridgeTypes(quotePriceHandle.viewModel.values().OLrzqt());
        }
        quotePriceHandle.calculateTransactionFee(dexMultiTokenInfoBean, str, dexMultiTokenInfoBean.getChainId());
        function1.invoke(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit getQuotePrice$lambda$21(QuotePriceHandle quotePriceHandle, String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, TradeStatePool tradeStatePool, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, String str2, Function1 function1, DexSourceResp dexSourceResp) {
        DeFiPlatformForSwap deFiPlatformForSwap;
        List<DeFiPlatformForSwap> defiPlatformInfoList;
        QuotePriceRes quotePriceRes;
        QuotePriceRes quotePriceRes2;
        DexAutoSlippageInfoParam autoSlippageInfo;
        List<DeFiPlatformForSwap> defiPlatformInfoList2;
        Object next;
        if (dexSourceResp.isSuccess()) {
            String strOLrzqt = quotePriceHandle.viewModel.Dmq() ? quotePriceHandle.viewModel.OLrzqt((QuotePriceRes) dexSourceResp.getData()) : "";
            QuotePriceRes quotePriceRes3 = (QuotePriceRes) dexSourceResp.getData();
            QuotePriceRes quotePriceResCopy = null;
            referenceSlippage = null;
            String referenceSlippage = null;
            if (quotePriceRes3 == null || (defiPlatformInfoList2 = quotePriceRes3.getDefiPlatformInfoList()) == null) {
                QuotePriceRes quotePriceRes4 = (QuotePriceRes) dexSourceResp.getData();
                deFiPlatformForSwap = (quotePriceRes4 == null || (defiPlatformInfoList = quotePriceRes4.getDefiPlatformInfoList()) == null) ? null : (DeFiPlatformForSwap) CollectionsKt___CollectionsKt.firstOrNull(defiPlatformInfoList);
                quotePriceRes = (QuotePriceRes) dexSourceResp.getData();
                if (quotePriceRes != null) {
                    String quoteId = deFiPlatformForSwap != null ? deFiPlatformForSwap.getQuoteId() : null;
                    if (deFiPlatformForSwap != null && (autoSlippageInfo = deFiPlatformForSwap.getAutoSlippageInfo()) != null) {
                        referenceSlippage = autoSlippageInfo.getReferenceSlippage();
                    }
                    quotePriceResCopy = quotePriceRes.copy((1791 & 1) != 0 ? quotePriceRes.defiPlatformInfoList : null, (1791 & 2) != 0 ? quotePriceRes.pathSelectionRouterList : null, (1791 & 4) != 0 ? quotePriceRes.swapType : null, (1791 & 8) != 0 ? quotePriceRes.commonDexInfo : null, (1791 & 16) != 0 ? quotePriceRes.success : false, (1791 & 32) != 0 ? quotePriceRes.isReset : false, (1791 & 64) != 0 ? quotePriceRes.localAAReservedQuote : false, (1791 & 128) != 0 ? quotePriceRes.isSupportDappTrade : null, (1791 & 256) != 0 ? quotePriceRes.traceData : new TraceData(quoteId, (String) null, referenceSlippage, 2, (DefaultConstructorMarker) null), (1791 & 512) != 0 ? quotePriceRes.priorityFeeInfo : null, (1791 & 1024) != 0 ? quotePriceRes.localVerifyDexUniqueKey : null, (1791 & 2048) != 0 ? quotePriceRes.localSelectedDeFiPlatformId : strOLrzqt);
                }
                quotePriceHandle.quotePriceRes = quotePriceResCopy;
                if (quotePriceResCopy == null && quotePriceResCopy.isQuoteAmountNotEmpty()) {
                    quotePriceHandle.stateInfoMap.put(str, Boolean.FALSE);
                    String str3 = dexMultiTokenInfoBean.getUniqueId() + dexMultiTokenInfoBean2.getUniqueId();
                    QuotePriceRes quotePriceRes5 = quotePriceHandle.quotePriceRes;
                    if (quotePriceRes5 != null) {
                        quotePriceHandle.viewModel.wlaJM().AEQbTJ(quotePriceRes5);
                        quotePriceRes5.setSuccess(true);
                        quotePriceHandle.constructRouterData(str3);
                        C22982hpd.KWHzl(quotePriceRes5, tradeStatePool, quotePriceHandle.viewModel.finit().valueOf(), quotePriceHandle.sourceType, quotePriceHandle.viewModel.UlJrfe());
                        mutableLiveData.setValue(quotePriceHandle.getQuotePrice());
                        quotePriceHandle.pathSelectionRouterListLiveData.setValue(quotePriceRes5.getPathSelectionRouterList());
                    }
                    quotePriceHandle.coinUniqueKey = dexMultiTokenInfoBean.getUniqueId() + dexMultiTokenInfoBean2.getUniqueId();
                } else {
                    quotePriceHandle.stateInfoMap.put(str, Boolean.FALSE);
                    quotePriceRes2 = quotePriceHandle.quotePriceRes;
                    if (quotePriceRes2 != null) {
                        C22982hpd.KWHzl(quotePriceRes2, quotePriceHandle.sourceType, tradeStatePool, mutableLiveData, mutableLiveData2, str2);
                    }
                    quotePriceHandle.pathSelectionRouterListLiveData.setValue(new ArrayList());
                }
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                }
            } else {
                Iterator<T> it = defiPlatformInfoList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) ((DeFiPlatformForSwap) next).getDefiPlatformId(), (Object) strOLrzqt)) {
                        break;
                    }
                }
                deFiPlatformForSwap = (DeFiPlatformForSwap) next;
                if (deFiPlatformForSwap == null) {
                }
                quotePriceRes = (QuotePriceRes) dexSourceResp.getData();
                if (quotePriceRes != null) {
                }
                quotePriceHandle.quotePriceRes = quotePriceResCopy;
                if (quotePriceResCopy == null) {
                    quotePriceHandle.stateInfoMap.put(str, Boolean.FALSE);
                    quotePriceRes2 = quotePriceHandle.quotePriceRes;
                    if (quotePriceRes2 != null) {
                    }
                    quotePriceHandle.pathSelectionRouterListLiveData.setValue(new ArrayList());
                    if (function1 != null) {
                    }
                }
            }
        } else {
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            quotePriceHandle.stateInfoMap.put(str, Boolean.FALSE);
            tradeStatePool.setQuotePriceSuccess(false);
            quotePriceHandle.viewModel.accept().setValue(dexSourceResp.getExp());
            Throwable exp = dexSourceResp.getExp();
            if (exp != null && C31212lpk.copydefault.KWHzl(exp)) {
                tradeStatePool.refreshStatePool(new TradeStep(CheckStep.QUOTES, true, SwapState.BLACK_ADDRESS, true, false));
                mutableLiveData2.setValue(C22332hdP.EZpvd(new QuoteErrorBean((String) null, (String) null, (String) null, true, (String) null, (String) null, (String) null, (String) null, 247, (DefaultConstructorMarker) null)));
                mutableLiveData.setValue(new QuotePriceRes((List) null, (List) null, (String) null, (CommonDexInfo) null, false, false, false, (String) null, (TraceData) null, (SwapPriorityFeeInfo) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null));
                quotePriceHandle.pathSelectionRouterListLiveData.setValue(new ArrayList());
            } else {
                Throwable exp2 = dexSourceResp.getExp();
                if (exp2 != null && C31212lpk.copydefault.AEQbTJ(exp2)) {
                    tradeStatePool.refreshStatePool(new TradeStep(CheckStep.QUOTES, true, SwapState.STAND_BY_DISH, true, false));
                    mutableLiveData2.setValue(C22332hdP.EZpvd(new QuoteErrorBean((String) null, (String) null, (String) null, true, (String) null, (String) null, (String) null, (String) null, 247, (DefaultConstructorMarker) null)));
                    mutableLiveData.setValue(new QuotePriceRes((List) null, (List) null, (String) null, (CommonDexInfo) null, false, false, false, (String) null, (TraceData) null, (SwapPriorityFeeInfo) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null));
                    quotePriceHandle.pathSelectionRouterListLiveData.setValue(new ArrayList());
                } else {
                    Throwable exp3 = dexSourceResp.getExp();
                    if (exp3 != null && C31212lpk.copydefault.EZpvd(exp3)) {
                        tradeStatePool.refreshStatePool(new TradeStep(CheckStep.QUOTES, true, SwapState.SWAP_UNSUPPORTED_FOR_DAPP, true, false));
                        mutableLiveData2.setValue(C22332hdP.EZpvd(new QuoteErrorBean((String) null, (String) null, (String) null, true, (String) null, (String) null, (String) null, (String) null, 247, (DefaultConstructorMarker) null)));
                        mutableLiveData.setValue(new QuotePriceRes((List) null, (List) null, (String) null, (CommonDexInfo) null, false, false, false, (String) null, (TraceData) null, (SwapPriorityFeeInfo) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null));
                        quotePriceHandle.pathSelectionRouterListLiveData.setValue(new ArrayList());
                    } else {
                        mutableLiveData2.setValue(C22332hdP.EZpvd(new QuoteErrorBean((String) null, (String) null, (String) null, true, (String) null, (String) null, (String) null, (String) null, 247, (DefaultConstructorMarker) null)));
                        mutableLiveData.setValue(new QuotePriceRes((List) null, (List) null, (String) null, (CommonDexInfo) null, false, false, false, (String) null, (TraceData) null, (SwapPriorityFeeInfo) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null));
                        tradeStatePool.refreshStatePool(new TradeStep(CheckStep.QUOTES, true, SwapState.FETCHING_ERROR, true, false));
                        quotePriceHandle.pathSelectionRouterListLiveData.setValue(new ArrayList());
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getQuotePrice$lambda$23(Function1 function1, QuotePriceHandle quotePriceHandle, String str, TradeStatePool tradeStatePool, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, Throwable th) {
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        quotePriceHandle.stateInfoMap.put(str, Boolean.FALSE);
        tradeStatePool.setQuotePriceSuccess(false);
        mutableLiveData.setValue(new QuotePriceRes((List) null, (List) null, (String) null, (CommonDexInfo) null, false, false, false, (String) null, (TraceData) null, (SwapPriorityFeeInfo) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null));
        mutableLiveData2.setValue(C22332hdP.EZpvd(new QuoteErrorBean((String) null, (String) null, (String) null, true, (String) null, (String) null, (String) null, (String) null, 247, (DefaultConstructorMarker) null)));
        quotePriceHandle.viewModel.accept().setValue(th);
        tradeStatePool.refreshStatePool(new TradeStep(CheckStep.QUOTES, true, SwapState.FETCHING_ERROR, true, false));
        quotePriceHandle.pathSelectionRouterListLiveData.setValue(new ArrayList());
        return Unit.INSTANCE;
    }

    public final String getSlippage() {
        C25416iwM c25416iwMDCUTEI = this.viewModel.DCUTEI();
        QuotePriceRes quotePrice = getQuotePrice();
        return c25416iwMDCUTEI.OLrzqt(quotePrice != null ? quotePrice.autoSlippage() : null);
    }

    public final void processQuotePriceResOnProviderSelection(QuotePriceRes quotePriceRes) {
        QuotePriceRes quotePriceResCopy;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = this.viewModel.QUSxYX().copydefault();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = this.viewModel.QUSxYX().valueOf();
        String strAkhnZx = this.viewModel.AkhnZx();
        TradeStatePool tradeStatePoolDHguZz = this.viewModel.dHguZz();
        MutableLiveData<QuotePriceRes> mutableLiveDataAubY = this.viewModel.AubY();
        boolean zValueOf = this.viewModel.finit().valueOf();
        String strKWHzl = this.viewModel.finit().KWHzl();
        QuotePriceReq quotePriceReqDAIeex = this.viewModel.DAIeex();
        String gasLevel = quotePriceReqDAIeex != null ? quotePriceReqDAIeex.getGasLevel() : null;
        if (gasLevel == null) {
            gasLevel = "";
        }
        String uniqueKey = getUniqueKey(strAkhnZx, dexMultiTokenInfoBeanCopydefault, dexMultiTokenInfoBeanValueOf, strKWHzl, gasLevel);
        if (quotePriceRes != null) {
            quotePriceResCopy = quotePriceRes.copy((1791 & 1) != 0 ? quotePriceRes.defiPlatformInfoList : null, (1791 & 2) != 0 ? quotePriceRes.pathSelectionRouterList : null, (1791 & 4) != 0 ? quotePriceRes.swapType : null, (1791 & 8) != 0 ? quotePriceRes.commonDexInfo : null, (1791 & 16) != 0 ? quotePriceRes.success : false, (1791 & 32) != 0 ? quotePriceRes.isReset : false, (1791 & 64) != 0 ? quotePriceRes.localAAReservedQuote : false, (1791 & 128) != 0 ? quotePriceRes.isSupportDappTrade : null, (1791 & 256) != 0 ? quotePriceRes.traceData : null, (1791 & 512) != 0 ? quotePriceRes.priorityFeeInfo : null, (1791 & 1024) != 0 ? quotePriceRes.localVerifyDexUniqueKey : null, (1791 & 2048) != 0 ? quotePriceRes.localSelectedDeFiPlatformId : this.viewModel.AxsJAY());
        } else {
            quotePriceResCopy = null;
        }
        this.quotePriceRes = quotePriceResCopy;
        tradeStatePoolDHguZz.refreshStatePool(new TradeStep(CheckStep.APPROVE, false, SwapState.SWAP_INPUT, true, true));
        QuotePriceRes quotePriceRes2 = this.quotePriceRes;
        if (quotePriceRes2 != null && quotePriceRes2.isQuoteAmountNotEmpty()) {
            this.stateInfoMap.put(uniqueKey, Boolean.FALSE);
            String str = (dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getUniqueId() : null) + (dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getUniqueId() : null);
            this.viewModel.wlaJM().AEQbTJ(quotePriceRes2);
            quotePriceRes2.setSuccess(true);
            constructRouterData(str);
            C22982hpd.KWHzl(quotePriceRes2, tradeStatePoolDHguZz, zValueOf, this.sourceType, this.viewModel.UlJrfe());
            mutableLiveDataAubY.setValue(quotePriceRes2);
            this.coinUniqueKey = (dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getUniqueId() : null) + (dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getUniqueId() : null);
        }
        Job job = this.startPollingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.startPollingJob = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this.viewModel), null, null, new AnonymousClass2(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.business.dexlogic.main.swap.trade.status.helper.QuotePriceHandle$processQuotePriceResOnProviderSelection$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QuotePriceHandle.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.label = 1;
                if (DelayKt.delay(500L, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            AbstractC23101hrq.getQuotePrice$default(QuotePriceHandle.this.viewModel, false, false, new Function1() { // from class: o.hpe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return QuotePriceHandle.AnonymousClass2.invokeSuspend$lambda$0(((java.lang.Boolean) obj2).booleanValue());
                }
            }, 2, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(boolean z) {
            return Unit.INSTANCE;
        }
    }

    public final void constructRouterData(@NotNull String str) {
        PathSelectionRouterItem pathSelectionRouterItem;
        PathSelectionRouterItem pathSelectionRouterItem2;
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        QuotePriceRes quotePrice = getQuotePrice();
        if (quotePrice != null) {
            if (!Intrinsics.EZpvd((Object) this.coinUniqueKey, (Object) str)) {
                this.currentBridgeInfo = null;
            }
            C22341hdY currentBridgeInfo = getCurrentBridgeInfo();
            String strEZpvd = currentBridgeInfo != null ? currentBridgeInfo.EZpvd() : null;
            if (quotePrice.isSingle()) {
                return;
            }
            if (strEZpvd == null || strEZpvd.length() == 0) {
                List<PathSelectionRouterItem> pathSelectionRouterList = quotePrice.getPathSelectionRouterList();
                if (pathSelectionRouterList == null || (pathSelectionRouterItem = (PathSelectionRouterItem) CollectionsKt___CollectionsKt.firstOrNull(pathSelectionRouterList)) == null) {
                    return;
                }
                pathSelectionRouterItem.setLocalSelected(true);
                return;
            }
            List<PathSelectionRouterItem> pathSelectionRouterList2 = quotePrice.getPathSelectionRouterList();
            if (pathSelectionRouterList2 != null) {
                Iterator<T> it = pathSelectionRouterList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (Intrinsics.EZpvd((Object) ((PathSelectionRouterItem) next).getBridgeId(), (Object) strEZpvd)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                pathSelectionRouterItem2 = (PathSelectionRouterItem) next;
            } else {
                pathSelectionRouterItem2 = null;
            }
            if (pathSelectionRouterItem2 == null) {
                C23314hvr<String> c23314hvrDLWbHP = this.viewModel.DLWbHP();
                C22341hdY c22341hdY = this.currentBridgeInfo;
                c23314hvrDLWbHP.setValue(c22341hdY != null ? c22341hdY.OLrzqt() : null);
                this.currentBridgeInfo = null;
                List<PathSelectionRouterItem> pathSelectionRouterList3 = quotePrice.getPathSelectionRouterList();
                if (pathSelectionRouterList3 != null) {
                    int i = 0;
                    for (Object obj : pathSelectionRouterList3) {
                        if (i < 0) {
                            yDY.AYXKKw();
                        }
                        ((PathSelectionRouterItem) obj).setLocalSelected(i == 0);
                        i++;
                    }
                    return;
                }
                return;
            }
            List<PathSelectionRouterItem> pathSelectionRouterList4 = quotePrice.getPathSelectionRouterList();
            if (pathSelectionRouterList4 != null) {
                for (PathSelectionRouterItem pathSelectionRouterItem3 : pathSelectionRouterList4) {
                    pathSelectionRouterItem3.setLocalSelected(Intrinsics.EZpvd((Object) pathSelectionRouterItem3.getBridgeId(), (Object) strEZpvd));
                }
            }
        }
    }

    private final String getUniqueKey(String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, String str2, String str3) {
        String uniqueId;
        String uniqueId2;
        String str4 = "";
        if (dexMultiTokenInfoBean == null || (uniqueId = dexMultiTokenInfoBean.getUniqueId()) == null) {
            uniqueId = "";
        }
        if (dexMultiTokenInfoBean2 != null && (uniqueId2 = dexMultiTokenInfoBean2.getUniqueId()) != null) {
            str4 = uniqueId2;
        }
        return str + "_" + uniqueId + "_" + str4 + "_" + str2 + "_" + str3;
    }

    public final void updateBridgeId(@NotNull String str, @NotNull String str2) {
        List<PathSelectionRouterItem> pathSelectionRouterList;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C22341hdY currentBridgeInfo = getCurrentBridgeInfo();
        if (currentBridgeInfo == null) {
            this.currentBridgeInfo = new C22341hdY(str, str2);
        } else {
            currentBridgeInfo.AEQbTJ(str);
            currentBridgeInfo.copydefault(str2);
        }
        QuotePriceRes quotePrice = getQuotePrice();
        if (quotePrice != null && (pathSelectionRouterList = quotePrice.getPathSelectionRouterList()) != null) {
            for (PathSelectionRouterItem pathSelectionRouterItem : pathSelectionRouterList) {
                pathSelectionRouterItem.setLocalSelected(Intrinsics.EZpvd((Object) pathSelectionRouterItem.getBridgeId(), (Object) str));
            }
        }
        this.viewModel.ODXsMY().setValue(this.quotePriceRes);
    }

    public final void disposeQuote() {
        this.stateInfoMap.evictAll();
        C33050mpD.OLrzqt(this.quotePriceKey);
        this.viewModel.DTwDnp().postValue(Boolean.FALSE);
    }

    public final String resolverBody(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        try {
            return jsonObject.get("gasPrice").getAsString();
        } catch (Exception unused) {
            return "";
        }
    }

    public final void noQuoteFetched(@NotNull AbstractC23101hrq abstractC23101hrq) {
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        C22901hoB c22901hoBZuBGHE = abstractC23101hrq.zuBGHE();
        if (c22901hoBZuBGHE != null) {
            c22901hoBZuBGHE.djBIcL();
        }
    }

    private final QuotePriceReq createQuotePriceReq(String str, String str2) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = this.viewModel.QUSxYX().copydefault();
        if (dexMultiTokenInfoBeanCopydefault == null || (dexMultiTokenInfoBeanValueOf = this.viewModel.QUSxYX().valueOf()) == null) {
            return null;
        }
        List<String> value = this.viewModel.getFieldNames().gEmmrt().OLrzqt().getValue();
        List<String> listOLrzqt = this.viewModel.values().OLrzqt();
        InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault(this.sourceType).fARcdN().valueOf();
        boolean fieldNames = interfaceC9738bbJValueOf != null ? interfaceC9738bbJValueOf.getFieldNames() : false;
        String strKWHzl = this.viewModel.UlJrfe() ? "" : this.viewModel.finit().KWHzl();
        String strGEmmrt = this.viewModel.gEmmrt(dexMultiTokenInfoBeanCopydefault.getChainId());
        String slippage = getSlippage();
        SlippageMode slippageModeCopydefault = this.viewModel.DCUTEI().copydefault();
        C23212htv c23212htvOxVOHk = this.viewModel.OxVOHk();
        String originContractAddress = dexMultiTokenInfoBeanCopydefault.getOriginContractAddress();
        String originContractAddress2 = dexMultiTokenInfoBeanValueOf.getOriginContractAddress();
        String decimals = dexMultiTokenInfoBeanCopydefault.getDecimals();
        String decimals2 = dexMultiTokenInfoBeanValueOf.getDecimals();
        String chainId = dexMultiTokenInfoBeanCopydefault.getChainId();
        String chainId2 = dexMultiTokenInfoBeanValueOf.getChainId();
        String strGEmmrt2 = C33129mqd.gEmmrt(Integer.valueOf(slippageModeCopydefault.getType()));
        String strOLrzqt = QuotePriceReq.Companion.OLrzqt(fieldNames);
        String strOLrzqt2 = this.viewModel.DCUTEI().OLrzqt();
        String strOLrzqt3 = c23212htvOxVOHk.OLrzqt(dexMultiTokenInfoBeanCopydefault.getChainId());
        String strCopydefault = c23212htvOxVOHk.copydefault(dexMultiTokenInfoBeanCopydefault.getChainId());
        return new QuotePriceReq(originContractAddress, str, originContractAddress2, decimals, decimals2, chainId, str2, chainId2, slippage, "1", strGEmmrt2, strOLrzqt2, strOLrzqt, value, listOLrzqt, strGEmmrt, strKWHzl, null, strOLrzqt3, strCopydefault.length() > 0 ? strCopydefault : null, this.viewModel.dUDNAs().copydefault(this.viewModel.spnCvw(), Boolean.valueOf(this.viewModel.UlJrfe() ? this.viewModel.fetchVPNInfo().copydefault() : false)));
    }
}
