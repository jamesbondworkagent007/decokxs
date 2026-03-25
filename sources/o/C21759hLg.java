package o;

import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dex.api.bean.EditLimitOrderData;
import com.okinc.business.dex.api.bean.LimitParam;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexDefaultFromToTokenShowVO;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.main.limmitorder.CheckStep;
import com.okinc.business.dexlogic.main.limmitorder.SwapState;
import com.okinc.business.dexlogic.main.limmitorder.TradeStep;
import com.okinc.business.dexlogic.main.limmitorder.bean.ChangeType;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitSuggestCoinBean;
import com.okinc.business.dexlogic.main.swap.trade.bean.CurrentChain;
import com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.ExchangeRateData;
import com.okinc.business.dexlogic.main.swap.trade.bean.FromToBalance;
import com.okinc.business.dexlogic.main.swap.trade.bean.ImageTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.HorizontalLabelData;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.ImageTextSelectData;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.SimpleBalanceData;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.VerticalEditTextGroupData;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.CoinAssets;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.InitTradeGroup;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC22425hfC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hLg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21759hLg {
    public final C22495hgT OLrzqt;
    public java.lang.Object copydefault;

    public C21759hLg(@NotNull C22495hgT c22495hgT) {
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        this.OLrzqt = c22495hgT;
        this.copydefault = new java.lang.Object();
    }

    public final void EZpvd(@NotNull DefiChainInfo defiChainInfo) {
        EditLimitOrderData editOrderData;
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        C22495hgT c22495hgT = this.OLrzqt;
        LimitParam limitParamDNCPSb = c22495hgT.dNCPSb();
        if (limitParamDNCPSb != null && (editOrderData = limitParamDNCPSb.getEditOrderData()) != null) {
            OLrzqt(c22495hgT, defiChainInfo, editOrderData);
            return;
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd = c22380heK.copydefault(c22495hgT.AxsJAYaxsJAY()).AYXKKw().EZpvd();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = c22380heK.copydefault(c22495hgT.AxsJAYaxsJAY()).AYXKKw().copydefault();
        java.lang.String originContractAddress = dexMultiTokenInfoBeanEZpvd != null ? dexMultiTokenInfoBeanEZpvd.getOriginContractAddress() : null;
        if (originContractAddress == null) {
            originContractAddress = "";
        }
        java.lang.String originContractAddress2 = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getOriginContractAddress() : null;
        java.lang.String str = originContractAddress2 == null ? "" : originContractAddress2;
        java.lang.String chainId = dexMultiTokenInfoBeanEZpvd != null ? dexMultiTokenInfoBeanEZpvd.getChainId() : null;
        copydefault(c22495hgT, originContractAddress, str, chainId != null ? chainId : "", defiChainInfo, true);
    }

    public final void OLrzqt(final C22495hgT c22495hgT, final DefiChainInfo defiChainInfo, final EditLimitOrderData editLimitOrderData) {
        InterfaceC22502hga interfaceC22502hgaAhwBna = C22380heK.OLrzqt.copydefault(c22495hgT.AxsJAYaxsJAY()).AhwBna();
        java.lang.String chainId = editLimitOrderData.getFromTokenInfo().getCoinInfo().getChainId();
        java.lang.String tokenAddress = editLimitOrderData.getFromTokenInfo().getCoinInfo().getTokenAddress();
        if (tokenAddress == null) {
            tokenAddress = "";
        }
        AbstractC58185ywX<LimitSuggestCoinBean> abstractC58185ywXKWHzl = interfaceC22502hgaAhwBna.KWHzl(chainId, tokenAddress, editLimitOrderData.getToTokenInfo().getCoinInfo().getTokenAddress());
        final Function1 function1 = new Function1() { // from class: o.hLn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21759hLg.EZpvd(c22495hgT, editLimitOrderData, this, (LimitSuggestCoinBean) obj);
            }
        };
        InterfaceC58227yxM<? super LimitSuggestCoinBean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hLo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21759hLg.gEmmrt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hLu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21759hLg.AEQbTJ(c22495hgT, defiChainInfo, this, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hLv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21759hLg.valueOf(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.copydefault);
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C22495hgT c22495hgT, EditLimitOrderData editLimitOrderData, C21759hLg c21759hLg, LimitSuggestCoinBean limitSuggestCoinBean) {
        TradeInputData tradeInputDataInitFromData$default;
        TradeInputData tradeInputDataInitToData;
        c22495hgT.RKDWNf().setValue(editLimitOrderData.getFromTokenInfo().getCoinInfo().getChainId());
        c21759hLg.EZpvd(limitSuggestCoinBean.getFromToken());
        java.lang.String amount = editLimitOrderData.getFromTokenInfo().getAmount();
        java.lang.String rate = editLimitOrderData.getCommonInfo().getRate();
        DexMultiTokenInfoBean fromToken = limitSuggestCoinBean.getFromToken();
        if (fromToken == null || (tradeInputDataInitFromData$default = c22495hgT.QfsBiF().initFromData(fromToken, amount)) == null) {
            tradeInputDataInitFromData$default = InitTradeGroup.initFromData$default(c22495hgT.QfsBiF(), null, 1, null);
        }
        ConsumeData consumeDataEZpvd = C22332hdP.EZpvd(tradeInputDataInitFromData$default);
        DexMultiTokenInfoBean toToken = limitSuggestCoinBean.getToToken();
        if (toToken == null || (tradeInputDataInitToData = c22495hgT.QfsBiF().initToData(toToken)) == null) {
            tradeInputDataInitToData = c22495hgT.QfsBiF().initToData();
        }
        ConsumeData<TradeInputGroup> consumeDataEZpvd2 = C22332hdP.EZpvd(new TradeInputGroup(consumeDataEZpvd, C22332hdP.EZpvd(tradeInputDataInitToData), C22332hdP.EZpvd(new ExchangeRateData(rate, rate))));
        C22380heK c22380heK = C22380heK.OLrzqt;
        c22380heK.copydefault(c22495hgT.AxsJAYaxsJAY()).AYXKKw().OLrzqt(limitSuggestCoinBean.getFromToken(), false);
        c22380heK.copydefault(c22495hgT.AxsJAYaxsJAY()).AYXKKw().EZpvd(limitSuggestCoinBean.getToToken(), true);
        c22495hgT.KWHzl(false);
        c22495hgT.getPostValueLengthLimit().setValue(consumeDataEZpvd2);
        c22495hgT.copydefault(CoinAssets.BOTH);
        c22495hgT.EZpvd((LimitParam) null);
        c22495hgT.valueOf(true);
        c22495hgT.hrNTAI().postValue(java.lang.Boolean.TRUE);
        MutableLiveData<Unit> mutableLiveDataOBJEWx = c22495hgT.OBJEWx();
        Unit unit = Unit.INSTANCE;
        mutableLiveDataOBJEWx.postValue(unit);
        return unit;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C22495hgT c22495hgT, DefiChainInfo defiChainInfo, C21759hLg c21759hLg, java.lang.Throwable th) {
        c22495hgT.RKDWNf().setValue(defiChainInfo.getChainId());
        c21759hLg.OLrzqt(defiChainInfo);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull DefiChainInfo defiChainInfo, @NotNull LimitParam limitParam) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        Intrinsics.checkNotNullParameter(limitParam, "");
        C22495hgT c22495hgT = this.OLrzqt;
        c22495hgT.RcXXUw().OLrzqt();
        c22495hgT.KWHzl(true);
        requestTokenCheck$default(this, c22495hgT, limitParam.getFromTokenContractAddress(), limitParam.getToTokenContractAddress(), limitParam.getFromChainId(), defiChainInfo, false, 16, null);
    }

    public static /* synthetic */ void requestTokenCheck$default(C21759hLg c21759hLg, C22495hgT c22495hgT, java.lang.String str, java.lang.String str2, java.lang.String str3, DefiChainInfo defiChainInfo, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        c21759hLg.copydefault(c22495hgT, str, str2, str3, defiChainInfo, z);
    }

    public final void copydefault(final C22495hgT c22495hgT, java.lang.String str, java.lang.String str2, final java.lang.String str3, final DefiChainInfo defiChainInfo, final boolean z) {
        c22495hgT.RcXXUw().OLrzqt();
        InterfaceC22502hga interfaceC22502hgaAhwBna = C22380heK.OLrzqt.copydefault(c22495hgT.AxsJAYaxsJAY()).AhwBna();
        java.lang.String str4 = str3 == null ? "" : str3;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        AbstractC58185ywX<LimitSuggestCoinBean> abstractC58185ywXKWHzl = interfaceC22502hgaAhwBna.KWHzl(str4, str, str2);
        final Function1 function1 = new Function1() { // from class: o.hLk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21759hLg.OLrzqt(z, str3, this, c22495hgT, (LimitSuggestCoinBean) obj);
            }
        };
        InterfaceC58227yxM<? super LimitSuggestCoinBean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hLi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21759hLg.AhwBna(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hLj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21759hLg.OLrzqt(c22495hgT, defiChainInfo, this, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hLr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21759hLg.AYXKKw(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.copydefault);
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(boolean z, java.lang.String str, C21759hLg c21759hLg, C22495hgT c22495hgT, LimitSuggestCoinBean limitSuggestCoinBean) {
        java.lang.String init_amount;
        TradeInputData tradeInputDataInitFromData$default;
        TradeInputData tradeInputDataInitToData;
        if (!z && str != null) {
            c22495hgT.RKDWNf().setValue(str);
        }
        c21759hLg.EZpvd(limitSuggestCoinBean.getFromToken());
        LimitParam limitParamDNCPSb = c22495hgT.dNCPSb();
        if (limitParamDNCPSb == null || (init_amount = limitParamDNCPSb.getFromAmount()) == null) {
            init_amount = c22495hgT.QfsBiF().getINIT_AMOUNT();
        } else {
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) init_amount)) {
                init_amount = null;
            }
            if (init_amount == null) {
            }
        }
        DexMultiTokenInfoBean fromToken = limitSuggestCoinBean.getFromToken();
        if (fromToken == null || (tradeInputDataInitFromData$default = c22495hgT.QfsBiF().initFromData(fromToken, init_amount)) == null) {
            tradeInputDataInitFromData$default = InitTradeGroup.initFromData$default(c22495hgT.QfsBiF(), null, 1, null);
        }
        ConsumeData consumeDataEZpvd = C22332hdP.EZpvd(tradeInputDataInitFromData$default);
        DexMultiTokenInfoBean toToken = limitSuggestCoinBean.getToToken();
        if (toToken == null || (tradeInputDataInitToData = c22495hgT.QfsBiF().initToData(toToken)) == null) {
            tradeInputDataInitToData = c22495hgT.QfsBiF().initToData();
        }
        ConsumeData<TradeInputGroup> consumeDataEZpvd2 = C22332hdP.EZpvd(new TradeInputGroup(consumeDataEZpvd, C22332hdP.EZpvd(tradeInputDataInitToData), null, 4, null));
        C22380heK c22380heK = C22380heK.OLrzqt;
        c22380heK.copydefault(c22495hgT.AxsJAYaxsJAY()).AYXKKw().OLrzqt(limitSuggestCoinBean.getFromToken(), false);
        c22380heK.copydefault(c22495hgT.AxsJAYaxsJAY()).AYXKKw().EZpvd(limitSuggestCoinBean.getToToken(), true);
        c22495hgT.getPostValueLengthLimit().setValue(consumeDataEZpvd2);
        c22495hgT.copydefault(CoinAssets.BOTH);
        c22495hgT.EZpvd((LimitParam) null);
        c22495hgT.valueOf(true);
        c22495hgT.KWHzl(true);
        c22495hgT.hrNTAI().postValue(java.lang.Boolean.TRUE);
        MutableLiveData<Unit> mutableLiveDataOBJEWx = c22495hgT.OBJEWx();
        Unit unit = Unit.INSTANCE;
        mutableLiveDataOBJEWx.postValue(unit);
        return unit;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C22495hgT c22495hgT, DefiChainInfo defiChainInfo, C21759hLg c21759hLg, java.lang.Throwable th) {
        c22495hgT.RKDWNf().setValue(defiChainInfo.getChainId());
        c21759hLg.OLrzqt(defiChainInfo);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        C22495hgT c22495hgT = this.OLrzqt;
        if (!c22495hgT.QOLQEE()) {
            c22495hgT.QfsBiF().releaseData();
            C22380heK c22380heK = C22380heK.OLrzqt;
            InterfaceC22425hfC interfaceC22425hfCAYXKKw = c22380heK.copydefault(c22495hgT.AxsJAYaxsJAY()).AYXKKw();
            interfaceC22425hfCAYXKKw.EZpvd(null, false);
            interfaceC22425hfCAYXKKw.OLrzqt(null, false);
            c22495hgT.QfsBiF().initTradeGroup(c22495hgT.getPostValueLengthLimit(), defiChainInfo, c22380heK.copydefault(c22495hgT.AxsJAYaxsJAY()).AYXKKw(), new Function0() { // from class: o.hLt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C21759hLg.KWHzl(this.KWHzl);
                }
            });
            c22495hgT.valueOf(true);
        }
        c22495hgT.hrNTAI().postValue(java.lang.Boolean.TRUE);
        c22495hgT.OBJEWx().postValue(Unit.INSTANCE);
    }

    public static final Unit KWHzl(C21759hLg c21759hLg) {
        c21759hLg.OLrzqt.DarRvM().setValue(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        final C22495hgT c22495hgT = this.OLrzqt;
        c22495hgT.RcXXUw().OLrzqt();
        c22495hgT.RKDWNf().setValue(dexMultiTokenInfoBean.getChainId());
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq = c22495hgT.QKudOq();
        if (Intrinsics.EZpvd((java.lang.Object) (dexMultiTokenInfoBeanQKudOq != null ? dexMultiTokenInfoBeanQKudOq.getUniqueId() : null), (java.lang.Object) dexMultiTokenInfoBean.getUniqueId())) {
            EZpvd();
            return;
        }
        ConsumeData<TradeInputGroup> value = c22495hgT.getPostValueLengthLimit().getValue();
        if (value != null) {
            c22495hgT.getPostValueLengthLimit().setValue(C22332hdP.EZpvd(value.getData().setFromCoinData(dexMultiTokenInfoBean)));
        }
        c22495hgT.OBJEWx().setValue(Unit.INSTANCE);
        C22380heK c22380heK = C22380heK.OLrzqt;
        DexMultiTokenInfoBean value2 = c22380heK.copydefault(c22495hgT.AxsJAYaxsJAY()).AYXKKw().KWHzl().getValue();
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) (value2 != null ? value2.getChainId() : null), (java.lang.Object) dexMultiTokenInfoBean.getChainId());
        EZpvd(dexMultiTokenInfoBean);
        InterfaceC22425hfC.TaskDescription.setCurrentFromCoin$default(c22380heK.copydefault(c22495hgT.AxsJAYaxsJAY()).AYXKKw(), dexMultiTokenInfoBean, false, 2, null);
        this.OLrzqt.KWHzl(true);
        this.OLrzqt.AEQbTJ(new Function0() { // from class: o.hLl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21759hLg.copydefault(this.OLrzqt, c22495hgT);
            }
        });
        c22495hgT.copydefault(zEZpvd ^ true ? CoinAssets.BOTH : CoinAssets.FROM);
    }

    public static final Unit copydefault(C21759hLg c21759hLg, C22495hgT c22495hgT) {
        if (c21759hLg.OLrzqt.OHqIaq()) {
            c22495hgT.zuWLRA().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        final C22495hgT c22495hgT = this.OLrzqt;
        c22495hgT.RcXXUw().OLrzqt();
        c22495hgT.RKDWNf().setValue(dexMultiTokenInfoBean.getChainId());
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = c22495hgT.OcIXYQ();
        if (Intrinsics.EZpvd((java.lang.Object) (dexMultiTokenInfoBeanOcIXYQ != null ? dexMultiTokenInfoBeanOcIXYQ.getUniqueId() : null), (java.lang.Object) dexMultiTokenInfoBean.getUniqueId())) {
            EZpvd();
            return;
        }
        ConsumeData<TradeInputGroup> value = c22495hgT.getPostValueLengthLimit().getValue();
        if (value != null) {
            c22495hgT.getPostValueLengthLimit().setValue(C22332hdP.EZpvd(value.getData().setToCoinData(dexMultiTokenInfoBean)));
        }
        c22495hgT.OBJEWx().setValue(Unit.INSTANCE);
        InterfaceC22425hfC.TaskDescription.setCurrentToCoin$default(C22380heK.OLrzqt.copydefault(c22495hgT.AxsJAYaxsJAY()).AYXKKw(), dexMultiTokenInfoBean, false, 2, null);
        this.OLrzqt.KWHzl(true);
        this.OLrzqt.AEQbTJ(new Function0() { // from class: o.hLs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21759hLg.copydefault(c22495hgT, this);
            }
        });
        c22495hgT.copydefault(CoinAssets.TO);
    }

    public static final Unit copydefault(C22495hgT c22495hgT, C21759hLg c21759hLg) {
        if (c22495hgT.OHqIaq()) {
            c21759hLg.OLrzqt.AEQbTJ(ChangeType.RateChange);
            c22495hgT.zuWLRA().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        TradeInputGroup data;
        TradeInputGroup limitFromToChange;
        final C22495hgT c22495hgT = this.OLrzqt;
        c22495hgT.RcXXUw().OLrzqt();
        c22495hgT.AEQbTJ(ChangeType.FromToChange);
        MutableLiveData<ConsumeData<TradeInputGroup>> postValueLengthLimit = c22495hgT.getPostValueLengthLimit();
        ConsumeData<TradeInputGroup> value = c22495hgT.getPostValueLengthLimit().getValue();
        postValueLengthLimit.setValue((value == null || (data = value.getData()) == null || (limitFromToChange = data.setLimitFromToChange()) == null) ? null : C22332hdP.EZpvd(limitFromToChange));
        c22495hgT.OBJEWx().setValue(Unit.INSTANCE);
        ConsumeData<TradeInputGroup> value2 = c22495hgT.getPostValueLengthLimit().getValue();
        if (value2 != null) {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            C22380heK c22380heK = C22380heK.OLrzqt;
            c22380heK.copydefault(c22495hgT.AxsJAYaxsJAY()).AYXKKw().OLrzqt(value2.getData().getFromData().getData().getCoinData().getData(), false);
            InterfaceC22425hfC.TaskDescription.setCurrentToCoin$default(c22380heK.copydefault(c22495hgT.AxsJAYaxsJAY()).AYXKKw(), value2.getData().getToData().getData().getCoinData().getData(), false, 2, null);
            this.OLrzqt.AEQbTJ(new Function0() { // from class: o.hLm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C21759hLg.EZpvd(booleanRef, c22495hgT);
                }
            });
        }
        C22495hgT.getCoinAssets$default(c22495hgT, null, 1, null);
    }

    public static final Unit EZpvd(Ref.BooleanRef booleanRef, C22495hgT c22495hgT) {
        if (booleanRef.element) {
            c22495hgT.zuWLRA().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        }
        booleanRef.element = false;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        java.lang.Object next;
        DexMultiTokenInfoBean fromDexMultiTokenInfoVO;
        TradeInputGroup data;
        C22495hgT c22495hgT = this.OLrzqt;
        if (dexMultiTokenInfoBean != null) {
            C22374heE c22374heECopydefault = C22380heK.OLrzqt.copydefault(c22495hgT.AxsJAYaxsJAY());
            java.util.List<DefiChainInfo> listZLjUOn = c22495hgT.zLjUOn();
            if (listZLjUOn != null) {
                java.util.Iterator<T> it = listZLjUOn.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (Intrinsics.EZpvd((java.lang.Object) dexMultiTokenInfoBean.getChainId(), (java.lang.Object) ((DefiChainInfo) next).getChainId())) {
                            break;
                        }
                    }
                }
                DefiChainInfo defiChainInfo = (DefiChainInfo) next;
                if (defiChainInfo == null) {
                    return;
                }
                DexMultiTokenInfoBean value = c22374heECopydefault.AYXKKw().KWHzl().getValue();
                java.lang.String chainId = value != null ? value.getChainId() : null;
                if (chainId == null) {
                    chainId = "";
                }
                if (!EZpvd(defiChainInfo, chainId)) {
                    DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO = defiChainInfo.getDexDefaultFromToTokenShowVO();
                    if (dexDefaultFromToTokenShowVO == null || (fromDexMultiTokenInfoVO = dexDefaultFromToTokenShowVO.getToDexMultiTokenInfoVO()) == null) {
                        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO2 = defiChainInfo.getDexDefaultFromToTokenShowVO();
                        fromDexMultiTokenInfoVO = dexDefaultFromToTokenShowVO2 != null ? dexDefaultFromToTokenShowVO2.getFromDexMultiTokenInfoVO() : null;
                        if (fromDexMultiTokenInfoVO != null) {
                            ConsumeData<TradeInputGroup> value2 = c22495hgT.getPostValueLengthLimit().getValue();
                            if (value2 != null && (data = value2.getData()) != null) {
                                data.setToData(C22332hdP.EZpvd(c22495hgT.QfsBiF().initToData(fromDexMultiTokenInfoVO)));
                            }
                            InterfaceC22425hfC.TaskDescription.setCurrentToCoin$default(c22374heECopydefault.AYXKKw(), fromDexMultiTokenInfoVO, false, 2, null);
                        }
                    } else {
                        if (Intrinsics.EZpvd((java.lang.Object) dexMultiTokenInfoBean.getUniqueId(), (java.lang.Object) fromDexMultiTokenInfoVO.getUniqueId())) {
                            fromDexMultiTokenInfoVO = null;
                        }
                        if (fromDexMultiTokenInfoVO == null) {
                        }
                        if (fromDexMultiTokenInfoVO != null) {
                        }
                    }
                }
                c22495hgT.AxsJAYsNCnLh().setValue(new CurrentChain(defiChainInfo.getChainName(), defiChainInfo));
            }
        }
    }

    public final void OLrzqt(boolean z) {
        java.util.List<DefiChainInfo> listZLjUOn = this.OLrzqt.zLjUOn();
        if (listZLjUOn != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listZLjUOn, 10));
            for (DefiChainInfo defiChainInfo : listZLjUOn) {
                arrayList.add(new CurrentChain(defiChainInfo.getChainName(), defiChainInfo));
            }
            this.OLrzqt.dHguZz().postValue(C56390yDp.OLrzqt(CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList), arrayList));
            KWHzl(z);
        }
    }

    public final void KWHzl(boolean z) {
        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO;
        TradeInputData tradeInputDataInitFromData;
        TradeInputData tradeInputDataInitToData;
        if (z) {
            return;
        }
        C22495hgT c22495hgT = this.OLrzqt;
        c22495hgT.gEmmrt();
        DefiChainInfo newProxyInstance = c22495hgT.getNewProxyInstance();
        if (newProxyInstance == null || (dexDefaultFromToTokenShowVO = newProxyInstance.getDexDefaultFromToTokenShowVO()) == null) {
            return;
        }
        if (dexDefaultFromToTokenShowVO.getFromDexMultiTokenInfoVO() != null) {
            tradeInputDataInitFromData = InitTradeGroup.initFromData$default(c22495hgT.QfsBiF(), dexDefaultFromToTokenShowVO.getFromDexMultiTokenInfoVO(), null, 2, null);
        } else {
            tradeInputDataInitFromData = c22495hgT.QfsBiF().initFromData(c22495hgT.QfsBiF().getINIT_AMOUNT());
        }
        if (dexDefaultFromToTokenShowVO.getToDexMultiTokenInfoVO() != null) {
            tradeInputDataInitToData = c22495hgT.QfsBiF().initToData(dexDefaultFromToTokenShowVO.getToDexMultiTokenInfoVO());
        } else {
            tradeInputDataInitToData = c22495hgT.QfsBiF().initToData();
        }
        c22495hgT.getPostValueLengthLimit().setValue(C22332hdP.EZpvd(new TradeInputGroup(C22332hdP.EZpvd(tradeInputDataInitFromData), C22332hdP.EZpvd(tradeInputDataInitToData), C22332hdP.EZpvd(c22495hgT.QfsBiF().initChangeRate()))));
        C22380heK c22380heK = C22380heK.OLrzqt;
        InterfaceC22425hfC.TaskDescription.setCurrentFromCoin$default(c22380heK.copydefault(c22495hgT.AxsJAYaxsJAY()).AYXKKw(), dexDefaultFromToTokenShowVO.getFromDexMultiTokenInfoVO(), false, 2, null);
        InterfaceC22425hfC.TaskDescription.setCurrentToCoin$default(c22380heK.copydefault(c22495hgT.AxsJAYaxsJAY()).AYXKKw(), dexDefaultFromToTokenShowVO.getToDexMultiTokenInfoVO(), false, 2, null);
        this.OLrzqt.KWHzl(true);
        this.OLrzqt.hrNTAI().postValue(java.lang.Boolean.TRUE);
        this.OLrzqt.OBJEWx().postValue(Unit.INSTANCE);
    }

    public static /* synthetic */ DexTradeInputData transFormData$default(C21759hLg c21759hLg, TradeInputData tradeInputData, C19738gNm c19738gNm, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c19738gNm = null;
        }
        return c21759hLg.AEQbTJ(tradeInputData, c19738gNm);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DexTradeInputData AEQbTJ(@NotNull TradeInputData tradeInputData, C19738gNm c19738gNm) {
        boolean z;
        DexMultiTokenInfoBean data;
        java.lang.String chainName;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(tradeInputData, "");
        FromToBalance balance = tradeInputData.getBalance();
        ImageTextData coinData = tradeInputData.getCoinData();
        EditTextData editData = tradeInputData.getEditData();
        if (tradeInputData.isFrom()) {
            DexMultiTokenInfoBean data2 = tradeInputData.getCoinData().getData();
            if (data2 != null && data2.isMainChainCoin()) {
                if (C23313hvq.KWHzl(this.OLrzqt.hDKMBd(), tradeInputData.getBalance().getData())) {
                }
                ConsumeData<java.lang.String> title = balance.getTitle();
                ConsumeData<java.lang.String> content = balance.getContent();
                ConsumeData consumeDataEZpvd = C22332hdP.EZpvd(balance.getAvailableAmountNum());
                ConsumeData<java.lang.String> action = balance.getAction();
                ConsumeData<java.lang.Boolean> error = balance.getError();
                ConsumeData<java.lang.String> errorContent = balance.getErrorContent();
                boolean needShowAction = balance.getNeedShowAction();
                ConsumeData<java.lang.String> chainLogoUrl = coinData.getChainLogoUrl();
                data = coinData.getData();
                if (data != null && (chainName = data.getChainName()) != null) {
                    str = chainName;
                }
                HorizontalLabelData horizontalLabelData = new HorizontalLabelData(title, content, consumeDataEZpvd, action, error, errorContent, needShowAction, chainLogoUrl, C22332hdP.EZpvd(str), C22332hdP.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.dvImUD)), balance.getData(), z, false, c19738gNm != null ? c19738gNm.EZpvd() : true);
                ImageTextSelectData imageTextSelectData = new ImageTextSelectData(coinData.getText(), coinData.getType(), coinData.getImageUrl(), C22332hdP.EZpvd(java.lang.Integer.valueOf(C52761wXj.TaskDescription.dzCpvv)), coinData.getChainLogoUrl(), coinData.getData(), c19738gNm != null ? c19738gNm.KWHzl() : true);
                VerticalEditTextGroupData verticalEditTextGroupData = new VerticalEditTextGroupData(editData.getContent(), editData.getLabel(), editData.getData(), editData.getCheckData(), editData.getStatus(), editData.getSetInput(), editData.getNeedForbidden(), editData.getResetFoucs(), editData.getSecondLabel(), editData.getSecondDataLabel(), editData.isWarning(), 0, editData.getOriginPrice(), editData.isLimit(), java.lang.Boolean.valueOf(c19738gNm != null ? c19738gNm.AEQbTJ() : true), 2048, null);
                editData.setSetInput(false);
                editData.setResetFoucs(false);
                return new DexTradeInputData(new SimpleBalanceData(null, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null), horizontalLabelData, verticalEditTextGroupData, imageTextSelectData);
            }
            z = true;
            ConsumeData<java.lang.String> title2 = balance.getTitle();
            ConsumeData<java.lang.String> content2 = balance.getContent();
            ConsumeData consumeDataEZpvd2 = C22332hdP.EZpvd(balance.getAvailableAmountNum());
            ConsumeData<java.lang.String> action2 = balance.getAction();
            ConsumeData<java.lang.Boolean> error2 = balance.getError();
            ConsumeData<java.lang.String> errorContent2 = balance.getErrorContent();
            boolean needShowAction2 = balance.getNeedShowAction();
            ConsumeData<java.lang.String> chainLogoUrl2 = coinData.getChainLogoUrl();
            data = coinData.getData();
            if (data != null) {
                str = chainName;
            }
            HorizontalLabelData horizontalLabelData2 = new HorizontalLabelData(title2, content2, consumeDataEZpvd2, action2, error2, errorContent2, needShowAction2, chainLogoUrl2, C22332hdP.EZpvd(str), C22332hdP.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.dvImUD)), balance.getData(), z, false, c19738gNm != null ? c19738gNm.EZpvd() : true);
            ImageTextSelectData imageTextSelectData2 = new ImageTextSelectData(coinData.getText(), coinData.getType(), coinData.getImageUrl(), C22332hdP.EZpvd(java.lang.Integer.valueOf(C52761wXj.TaskDescription.dzCpvv)), coinData.getChainLogoUrl(), coinData.getData(), c19738gNm != null ? c19738gNm.KWHzl() : true);
            VerticalEditTextGroupData verticalEditTextGroupData2 = new VerticalEditTextGroupData(editData.getContent(), editData.getLabel(), editData.getData(), editData.getCheckData(), editData.getStatus(), editData.getSetInput(), editData.getNeedForbidden(), editData.getResetFoucs(), editData.getSecondLabel(), editData.getSecondDataLabel(), editData.isWarning(), 0, editData.getOriginPrice(), editData.isLimit(), java.lang.Boolean.valueOf(c19738gNm != null ? c19738gNm.AEQbTJ() : true), 2048, null);
            editData.setSetInput(false);
            editData.setResetFoucs(false);
            return new DexTradeInputData(new SimpleBalanceData(null, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null), horizontalLabelData2, verticalEditTextGroupData2, imageTextSelectData2);
        }
        z = false;
        ConsumeData<java.lang.String> title22 = balance.getTitle();
        ConsumeData<java.lang.String> content22 = balance.getContent();
        ConsumeData consumeDataEZpvd22 = C22332hdP.EZpvd(balance.getAvailableAmountNum());
        ConsumeData<java.lang.String> action22 = balance.getAction();
        ConsumeData<java.lang.Boolean> error22 = balance.getError();
        ConsumeData<java.lang.String> errorContent22 = balance.getErrorContent();
        boolean needShowAction22 = balance.getNeedShowAction();
        ConsumeData<java.lang.String> chainLogoUrl22 = coinData.getChainLogoUrl();
        data = coinData.getData();
        if (data != null) {
        }
        HorizontalLabelData horizontalLabelData22 = new HorizontalLabelData(title22, content22, consumeDataEZpvd22, action22, error22, errorContent22, needShowAction22, chainLogoUrl22, C22332hdP.EZpvd(str), C22332hdP.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.dvImUD)), balance.getData(), z, false, c19738gNm != null ? c19738gNm.EZpvd() : true);
        ImageTextSelectData imageTextSelectData22 = new ImageTextSelectData(coinData.getText(), coinData.getType(), coinData.getImageUrl(), C22332hdP.EZpvd(java.lang.Integer.valueOf(C52761wXj.TaskDescription.dzCpvv)), coinData.getChainLogoUrl(), coinData.getData(), c19738gNm != null ? c19738gNm.KWHzl() : true);
        VerticalEditTextGroupData verticalEditTextGroupData22 = new VerticalEditTextGroupData(editData.getContent(), editData.getLabel(), editData.getData(), editData.getCheckData(), editData.getStatus(), editData.getSetInput(), editData.getNeedForbidden(), editData.getResetFoucs(), editData.getSecondLabel(), editData.getSecondDataLabel(), editData.isWarning(), 0, editData.getOriginPrice(), editData.isLimit(), java.lang.Boolean.valueOf(c19738gNm != null ? c19738gNm.AEQbTJ() : true), 2048, null);
        editData.setSetInput(false);
        editData.setResetFoucs(false);
        return new DexTradeInputData(new SimpleBalanceData(null, null, null, null, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null), horizontalLabelData22, verticalEditTextGroupData22, imageTextSelectData22);
    }

    public final boolean EZpvd(DefiChainInfo defiChainInfo, java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) defiChainInfo.getChainId(), (java.lang.Object) str);
    }

    public final void OLrzqt() {
        C33050mpD.OLrzqt(this.copydefault);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        final C22495hgT c22495hgT = this.OLrzqt;
        c22495hgT.RcXXUw().OLrzqt();
        InterfaceC22502hga interfaceC22502hgaAhwBna = C22380heK.OLrzqt.copydefault(c22495hgT.AxsJAYaxsJAY()).AhwBna();
        if (str3 == null) {
            str3 = "";
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        AbstractC58185ywX<LimitSuggestCoinBean> abstractC58185ywXKWHzl = interfaceC22502hgaAhwBna.KWHzl(str3, str, str2);
        final Function1 function1 = new Function1() { // from class: o.hLd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21759hLg.KWHzl(this.copydefault, c22495hgT, (LimitSuggestCoinBean) obj);
            }
        };
        InterfaceC58227yxM<? super LimitSuggestCoinBean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hLf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21759hLg.values(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hLq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21759hLg.AEQbTJ(c22495hgT, this, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hLp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21759hLg.AkhnZx(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.copydefault);
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C21759hLg c21759hLg, C22495hgT c22495hgT, LimitSuggestCoinBean limitSuggestCoinBean) {
        TradeInputData tradeInputDataInitFromData$default;
        TradeInputData tradeInputDataInitToData;
        TradeInputGroup tradeInputGroup;
        TradeInputData tradeInputDataInitFromData$default2;
        TradeInputData tradeInputDataInitToData2;
        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO;
        DexMultiTokenInfoBean fromToken = limitSuggestCoinBean.getFromToken();
        java.lang.String uniqueId = fromToken != null ? fromToken.getUniqueId() : null;
        DexMultiTokenInfoBean toToken = limitSuggestCoinBean.getToToken();
        if (Intrinsics.EZpvd((java.lang.Object) uniqueId, (java.lang.Object) (toToken != null ? toToken.getUniqueId() : null))) {
            DefiChainInfo newProxyInstance = c21759hLg.OLrzqt.getNewProxyInstance();
            DexMultiTokenInfoBean toDexMultiTokenInfoVO = (newProxyInstance == null || (dexDefaultFromToTokenShowVO = newProxyInstance.getDexDefaultFromToTokenShowVO()) == null) ? null : dexDefaultFromToTokenShowVO.getToDexMultiTokenInfoVO();
            DexMultiTokenInfoBean fromToken2 = limitSuggestCoinBean.getFromToken();
            if (fromToken2 == null || (tradeInputDataInitFromData$default2 = c22495hgT.QfsBiF().initFromData(fromToken2, "")) == null) {
                tradeInputDataInitFromData$default2 = InitTradeGroup.initFromData$default(c22495hgT.QfsBiF(), null, 1, null);
            }
            ConsumeData consumeDataEZpvd = C22332hdP.EZpvd(tradeInputDataInitFromData$default2);
            if (toDexMultiTokenInfoVO == null || (tradeInputDataInitToData2 = c22495hgT.QfsBiF().initToData(toDexMultiTokenInfoVO)) == null) {
                tradeInputDataInitToData2 = c22495hgT.QfsBiF().initToData();
            }
            tradeInputGroup = new TradeInputGroup(consumeDataEZpvd, C22332hdP.EZpvd(tradeInputDataInitToData2), null, 4, null);
        } else {
            DexMultiTokenInfoBean fromToken3 = limitSuggestCoinBean.getFromToken();
            if (fromToken3 == null || (tradeInputDataInitFromData$default = c22495hgT.QfsBiF().initFromData(fromToken3, "")) == null) {
                tradeInputDataInitFromData$default = InitTradeGroup.initFromData$default(c22495hgT.QfsBiF(), null, 1, null);
            }
            ConsumeData consumeDataEZpvd2 = C22332hdP.EZpvd(tradeInputDataInitFromData$default);
            DexMultiTokenInfoBean toToken2 = limitSuggestCoinBean.getToToken();
            if (toToken2 == null || (tradeInputDataInitToData = c22495hgT.QfsBiF().initToData(toToken2)) == null) {
                tradeInputDataInitToData = c22495hgT.QfsBiF().initToData();
            }
            tradeInputGroup = new TradeInputGroup(consumeDataEZpvd2, C22332hdP.EZpvd(tradeInputDataInitToData), null, 4, null);
        }
        ConsumeData<TradeInputGroup> consumeDataEZpvd3 = C22332hdP.EZpvd(tradeInputGroup);
        c21759hLg.OLrzqt.KWHzl(true);
        C22380heK c22380heK = C22380heK.OLrzqt;
        c22380heK.copydefault(c22495hgT.AxsJAYaxsJAY()).AYXKKw().OLrzqt(limitSuggestCoinBean.getFromToken(), false);
        c22380heK.copydefault(c22495hgT.AxsJAYaxsJAY()).AYXKKw().EZpvd(limitSuggestCoinBean.getToToken(), true);
        c22495hgT.getPostValueLengthLimit().setValue(consumeDataEZpvd3);
        c21759hLg.EZpvd(limitSuggestCoinBean.getFromToken());
        c22495hgT.copydefault(CoinAssets.BOTH);
        c22495hgT.hrNTAI().postValue(java.lang.Boolean.TRUE);
        MutableLiveData<Unit> mutableLiveDataOBJEWx = c22495hgT.OBJEWx();
        Unit unit = Unit.INSTANCE;
        mutableLiveDataOBJEWx.postValue(unit);
        return unit;
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C22495hgT c22495hgT, C21759hLg c21759hLg, java.lang.Throwable th) {
        DefiChainInfo newProxyInstance = c22495hgT.getNewProxyInstance();
        if (newProxyInstance != null) {
            c21759hLg.OLrzqt(newProxyInstance);
            c22495hgT.hrNTAI().postValue(java.lang.Boolean.TRUE);
            c22495hgT.OBJEWx().postValue(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
