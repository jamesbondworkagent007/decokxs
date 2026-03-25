package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dex.api.bean.CoinInfo;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexDefaultFromToTokenShowVO;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TokenCheckInfo;
import com.okinc.business.dexlogic.main.swap.trade.bean.CurrentChain;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.CoinAssets;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.InitTradeGroup;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.CheckStep;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC22387heR;
import o.InterfaceC22824hme;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hnT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22866hnT extends AbstractC22885hnm {
    public final AbstractC23101hrq AYXKKw;
    public final java.lang.String gEmmrt;

    private final boolean isConnected() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22866hnT(@NotNull java.lang.String str, @NotNull AbstractC23101hrq abstractC23101hrq) {
        super(str, abstractC23101hrq);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        this.gEmmrt = str;
        this.AYXKKw = abstractC23101hrq;
    }

    @Override // o.AbstractC22885hnm
    public void AEQbTJ(final boolean z) {
        final InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault(this.gEmmrt).fARcdN().valueOf();
        AbstractC58185ywX supportSingleChainList$default = InterfaceC22387heR.Application.getSupportSingleChainList$default(fetchVPNInfo(), "3", false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.hnV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22866hnT.AEQbTJ((java.util.List) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = supportSingleChainList$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hnU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22866hnT.gEmmrt(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.hnW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22866hnT.copydefault(interfaceC9738bbJValueOf, z, this, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hod
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22866hnT.djBIcL(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.hob
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22866hnT.OLrzqt((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hoa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22866hnT.AYXKKw(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, copydefault());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(InterfaceC9738bbJ interfaceC9738bbJ, boolean z, C22866hnT c22866hnT, java.util.List list) {
        Intrinsics.copydefault(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            CurrentChain currentChain = (CurrentChain) obj;
            if (interfaceC9738bbJ != null && interfaceC9738bbJ.KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(currentChain.getData().getChainId())))) {
                arrayList.add(obj);
            }
        }
        CurrentChain currentChain2 = (CurrentChain) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (currentChain2 == null) {
            currentChain2 = (CurrentChain) CollectionsKt___CollectionsKt.firstOrNull(list);
        }
        if (currentChain2 != null) {
            if (!z) {
                c22866hnT.AYXKKw.OJuSTm().setValue(C56390yDp.OLrzqt(currentChain2, list));
            }
            c22866hnT.copydefault(z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC22885hnm
    public void KWHzl(TradeParam tradeParam, @NotNull DefiChainInfo defiChainInfo, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        if (tradeParam == null && !z) {
            AbstractC22885hnm.initTradeInput$default(this, defiChainInfo, false, 2, null);
            return;
        }
        if (tradeParam != null) {
            EZpvd(tradeParam, defiChainInfo);
            this.AYXKKw.EZpvd(tradeParam.getBtcAddressType());
            C22370heA.AEQbTJ(BusinessType.SWAP.getValue());
            C22877hne c22877hne = C22877hne.OLrzqt;
            java.lang.String str = this.gEmmrt;
            C22877hne.trackSwapDexFullPageView$default(c22877hne, str, DexTrackEventParameter.AEQbTJ.OLrzqt(str), this.AYXKKw.QCjLjM(), null, 8, null);
            return;
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = c22380heK.copydefault(this.gEmmrt).fJNWhG().AEQbTJ();
        java.lang.String originContractAddress = dexMultiTokenInfoBeanAEQbTJ != null ? dexMultiTokenInfoBeanAEQbTJ.getOriginContractAddress() : null;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = c22380heK.copydefault(this.gEmmrt).fJNWhG().valueOf();
        java.lang.String originContractAddress2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getOriginContractAddress() : null;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ2 = c22380heK.copydefault(this.gEmmrt).fJNWhG().AEQbTJ();
        java.lang.String chainId = dexMultiTokenInfoBeanAEQbTJ2 != null ? dexMultiTokenInfoBeanAEQbTJ2.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf2 = c22380heK.copydefault(this.gEmmrt).fJNWhG().valueOf();
        java.lang.String chainId2 = dexMultiTokenInfoBeanValueOf2 != null ? dexMultiTokenInfoBeanValueOf2.getChainId() : null;
        java.lang.String str2 = chainId2 == null ? "" : chainId2;
        if (!Intrinsics.EZpvd((java.lang.Object) defiChainInfo.getChainId(), (java.lang.Object) chainId)) {
            EZpvd("", "", tradeParam, defiChainInfo.getChainId(), "", defiChainInfo, true);
        } else {
            EZpvd(originContractAddress, originContractAddress2, tradeParam, chainId, str2, defiChainInfo, true);
        }
    }

    @Override // o.AbstractC22885hnm
    public void KWHzl(TradeParam tradeParam, @NotNull DefiChainInfo defiChainInfo) {
        java.lang.String chainId;
        CoinInfo toCoinInfo;
        CoinInfo fromCoinInfo;
        CoinInfo fromCoinInfo2;
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        this.AYXKKw.DCUTEI().AhwBna();
        java.lang.String chainId2 = null;
        java.lang.String strKWHzl = KWHzl(tradeParam != null ? tradeParam.getFromCoinInfo() : null, true);
        java.lang.String strKWHzl2 = KWHzl(tradeParam != null ? tradeParam.getToCoinInfo() : null, true);
        MutableLiveData<java.lang.String> mutableLiveDataHrNTAI = this.AYXKKw.hrNTAI();
        if (tradeParam == null || (fromCoinInfo2 = tradeParam.getFromCoinInfo()) == null || (chainId = fromCoinInfo2.getChainId()) == null) {
            chainId = defiChainInfo.getChainId();
        }
        mutableLiveDataHrNTAI.setValue(chainId);
        java.lang.String chainId3 = (tradeParam == null || (fromCoinInfo = tradeParam.getFromCoinInfo()) == null) ? null : fromCoinInfo.getChainId();
        if (chainId3 == null) {
            chainId3 = "";
        }
        if (tradeParam != null && (toCoinInfo = tradeParam.getToCoinInfo()) != null) {
            chainId2 = toCoinInfo.getChainId();
        }
        requestTokenCheck$default(this, strKWHzl, strKWHzl2, tradeParam, chainId3, chainId2 == null ? "" : chainId2, defiChainInfo, false, 64, null);
    }

    @Override // o.AbstractC22885hnm
    public void KWHzl(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        this.AYXKKw.DCJXGO().setValue(java.lang.Boolean.TRUE);
        AbstractC23101hrq abstractC23101hrq = this.AYXKKw;
        abstractC23101hrq.DCUTEI().AhwBna();
        abstractC23101hrq.hrNTAI().setValue(dexMultiTokenInfoBean.getChainId());
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = abstractC23101hrq.QUSxYX().valueOf();
        if (Intrinsics.EZpvd((java.lang.Object) (dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getUniqueId() : null), (java.lang.Object) dexMultiTokenInfoBean.getUniqueId())) {
            AkhnZx();
            return;
        }
        abstractC23101hrq.RlQdEF().disposeQuote();
        ConsumeData<TradeInputGroup> value = abstractC23101hrq.dmfpNf().getValue();
        if (value != null) {
            abstractC23101hrq.dmfpNf().setValue(C22332hdP.EZpvd(value.getData().setFromCoinData(dexMultiTokenInfoBean)));
        }
        OLrzqt(dexMultiTokenInfoBean);
        InterfaceC22824hme.ActionBar.setCurrentFromCoin$default(abstractC23101hrq.zLjUOn(), dexMultiTokenInfoBean, false, 2, null);
        this.AYXKKw.DCJXGO().setValue(java.lang.Boolean.FALSE);
        abstractC23101hrq.dHguZz().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        abstractC23101hrq.OLrzqt(CoinAssets.BOTH);
    }

    @Override // o.AbstractC22885hnm
    public void AkhnZx() {
        this.AYXKKw.DCJXGO().setValue(java.lang.Boolean.TRUE);
        AbstractC23101hrq abstractC23101hrq = this.AYXKKw;
        abstractC23101hrq.DCUTEI().AhwBna();
        abstractC23101hrq.RlQdEF().resetQuotePrice();
        abstractC23101hrq.RlQdEF().disposeQuote();
        if (abstractC23101hrq.dmfpNf().getValue() != null) {
            abstractC23101hrq.QKVWgx().setValue(abstractC23101hrq.QUSxYX().valueOf());
            abstractC23101hrq.RKDWNf().setValue(abstractC23101hrq.QUSxYX().copydefault());
            C22901hoB c22901hoBZuBGHE = abstractC23101hrq.zuBGHE();
            if (c22901hoBZuBGHE != null) {
                c22901hoBZuBGHE.copydefault(abstractC23101hrq.ffGIBT(), this.AYXKKw.QUSxYX().AYXKKw());
            }
            abstractC23101hrq.wlaJM().OLrzqt(true);
            abstractC23101hrq.fetchVPNInfo(false);
        }
        ConsumeData<TradeInputGroup> value = abstractC23101hrq.dmfpNf().getValue();
        if (value != null) {
            abstractC23101hrq.zLjUOn().OLrzqt(value.getData().getFromData().getData().getCoinData().getData(), false);
            InterfaceC22824hme.ActionBar.setCurrentToCoin$default(abstractC23101hrq.zLjUOn(), value.getData().getToData().getData().getCoinData().getData(), false, 2, null);
        }
        AbstractC23101hrq.getCoinAssets$default(abstractC23101hrq, null, 1, null);
    }

    @Override // o.AbstractC22885hnm
    public void AEQbTJ(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        this.AYXKKw.DCJXGO().setValue(java.lang.Boolean.TRUE);
        final AbstractC23101hrq abstractC23101hrq = this.AYXKKw;
        abstractC23101hrq.DCUTEI().AhwBna();
        abstractC23101hrq.hrNTAI().setValue(dexMultiTokenInfoBean.getChainId());
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = abstractC23101hrq.QUSxYX().copydefault();
        if (Intrinsics.EZpvd((java.lang.Object) (dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getUniqueId() : null), (java.lang.Object) dexMultiTokenInfoBean.getUniqueId())) {
            AkhnZx();
            return;
        }
        abstractC23101hrq.RlQdEF().disposeQuote();
        ConsumeData<TradeInputGroup> value = abstractC23101hrq.dmfpNf().getValue();
        if (value != null) {
            abstractC23101hrq.dmfpNf().setValue(C22332hdP.EZpvd(value.getData().setToCoinData(dexMultiTokenInfoBean)));
            abstractC23101hrq.fetchVPNInfo(false);
            abstractC23101hrq.wlaJM().OLrzqt(true);
        }
        InterfaceC22824hme.ActionBar.setCurrentToCoin$default(abstractC23101hrq.zLjUOn(), dexMultiTokenInfoBean, false, 2, null);
        this.AYXKKw.DCJXGO().setValue(java.lang.Boolean.FALSE);
        abstractC23101hrq.QkdxfA().setValue(java.lang.Boolean.valueOf(isConnected()));
        abstractC23101hrq.copydefault(new Function1() { // from class: o.hnX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22866hnT.EZpvd(abstractC23101hrq, (InterfaceC9738bbJ) obj);
            }
        });
        abstractC23101hrq.OLrzqt(CoinAssets.TO);
    }

    public static final Unit EZpvd(AbstractC23101hrq abstractC23101hrq, InterfaceC9738bbJ interfaceC9738bbJ) {
        if (interfaceC9738bbJ != null && interfaceC9738bbJ.getFieldNames()) {
            abstractC23101hrq.dHguZz().initCheckStep();
        } else {
            abstractC23101hrq.dHguZz().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC22885hnm
    public void AEQbTJ(@NotNull final DefiChainInfo defiChainInfo, boolean z) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        final AbstractC23101hrq abstractC23101hrq = this.AYXKKw;
        if (!abstractC23101hrq.RcXXUw()) {
            abstractC23101hrq.aKErDB().releaseData();
            InterfaceC22824hme interfaceC22824hmeZLjUOn = abstractC23101hrq.zLjUOn();
            interfaceC22824hmeZLjUOn.AEQbTJ(z ? abstractC23101hrq.QUSxYX().valueOf() : null, false);
            interfaceC22824hmeZLjUOn.OLrzqt(z ? abstractC23101hrq.QUSxYX().copydefault() : null, false);
            abstractC23101hrq.aKErDB().initTradeGroup(abstractC23101hrq.dmfpNf(), defiChainInfo, abstractC23101hrq.zLjUOn(), true, AbstractC22885hnm.getInitValueForSwap$default(this, abstractC23101hrq.aKErDB(), defiChainInfo.getChainId(), false, 4, null), new Function0() { // from class: o.hnY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C22866hnT.copydefault(abstractC23101hrq, this, defiChainInfo);
                }
            });
            abstractC23101hrq.AhwBna(true);
        }
        abstractC23101hrq.fetchVPNInfo(false);
    }

    public static final Unit copydefault(AbstractC23101hrq abstractC23101hrq, C22866hnT c22866hnT, DefiChainInfo defiChainInfo) {
        abstractC23101hrq.QkdxfA().setValue(java.lang.Boolean.valueOf(c22866hnT.isConnected()));
        abstractC23101hrq.OcIXYQ().setValue(java.lang.Boolean.valueOf(c22866hnT.OLrzqt(defiChainInfo.getChainId())));
        return Unit.INSTANCE;
    }

    public InterfaceC22598hiQ fetchVPNInfo() {
        return C22380heK.OLrzqt.copydefault(this.gEmmrt).EZpvd(true);
    }

    @Override // o.AbstractC22885hnm
    public InterfaceC22824hme EZpvd() {
        return C22380heK.OLrzqt.copydefault(this.gEmmrt).fJNWhG();
    }

    @Override // o.AbstractC22885hnm
    public void gEmmrt() {
        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO;
        TradeInputData tradeInputDataInitFromData;
        TradeInputData tradeInputDataInitToData;
        AbstractC23101hrq abstractC23101hrq = this.AYXKKw;
        DefiChainInfo newProxyInstance = abstractC23101hrq.getNewProxyInstance();
        if (newProxyInstance != null && (dexDefaultFromToTokenShowVO = newProxyInstance.getDexDefaultFromToTokenShowVO()) != null) {
            if (dexDefaultFromToTokenShowVO.getFromDexMultiTokenInfoVO() != null) {
                tradeInputDataInitFromData = abstractC23101hrq.aKErDB().initFromData(dexDefaultFromToTokenShowVO.getFromDexMultiTokenInfoVO(), AbstractC22885hnm.getInitValueForSwap$default(this, abstractC23101hrq.aKErDB(), dexDefaultFromToTokenShowVO.getFromDexMultiTokenInfoVO().getChainId(), false, 4, null));
            } else {
                InitTradeGroup initTradeGroupAKErDB = abstractC23101hrq.aKErDB();
                InitTradeGroup initTradeGroupAKErDB2 = abstractC23101hrq.aKErDB();
                DefiChainInfo newProxyInstance2 = this.AYXKKw.getNewProxyInstance();
                java.lang.String chainId = newProxyInstance2 != null ? newProxyInstance2.getChainId() : null;
                if (chainId == null) {
                    chainId = "";
                }
                tradeInputDataInitFromData = initTradeGroupAKErDB.initFromData(AbstractC22885hnm.getInitValueForSwap$default(this, initTradeGroupAKErDB2, chainId, false, 4, null));
            }
            if (dexDefaultFromToTokenShowVO.getToDexMultiTokenInfoVO() != null) {
                tradeInputDataInitToData = abstractC23101hrq.aKErDB().initToData(dexDefaultFromToTokenShowVO.getToDexMultiTokenInfoVO());
            } else {
                tradeInputDataInitToData = abstractC23101hrq.aKErDB().initToData();
            }
            abstractC23101hrq.dmfpNf().setValue(C22332hdP.EZpvd(new TradeInputGroup(C22332hdP.EZpvd(tradeInputDataInitFromData), C22332hdP.EZpvd(tradeInputDataInitToData), null, 4, null)));
            InterfaceC22824hme.ActionBar.setCurrentFromCoin$default(abstractC23101hrq.zLjUOn(), dexDefaultFromToTokenShowVO.getFromDexMultiTokenInfoVO(), false, 2, null);
            InterfaceC22824hme.ActionBar.setCurrentToCoin$default(abstractC23101hrq.zLjUOn(), dexDefaultFromToTokenShowVO.getToDexMultiTokenInfoVO(), false, 2, null);
        }
        C23317hvu.ejfBZ();
    }

    private final void copydefault(boolean z) {
        DefiChainInfo newProxyInstance = this.AYXKKw.getNewProxyInstance();
        if (newProxyInstance != null) {
            AEQbTJ(newProxyInstance, z);
            C23317hvu.ejfBZ();
        }
    }

    public final void EZpvd(TradeParam tradeParam, DefiChainInfo defiChainInfo) {
        this.AYXKKw.DCUTEI().AhwBna();
        if (tradeParam != null) {
            java.lang.String strKWHzl = KWHzl(tradeParam.getFromCoinInfo(), true);
            java.lang.String strKWHzl2 = KWHzl(tradeParam.getToCoinInfo(), true);
            java.lang.String chainId = tradeParam.getFromCoinInfo().getChainId();
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) chainId)) {
                chainId = null;
            }
            if (chainId == null) {
                chainId = tradeParam.getToCoinInfo().getChainId();
            }
            java.lang.String str = chainId;
            C22380heK c22380heK = C22380heK.OLrzqt;
            subscribeTradeDialogTokenCheck$default(this, c22380heK.copydefault(this.gEmmrt).fetchVPNInfo().EZpvd(str, strKWHzl, strKWHzl2, c22380heK.copydefault(this.gEmmrt).fARcdN().copydefault(), c22380heK.copydefault(this.gEmmrt).fARcdN().AhwBna()), tradeParam, defiChainInfo, false, 4, null);
        }
    }

    public static /* synthetic */ void requestTokenCheck$default(C22866hnT c22866hnT, java.lang.String str, java.lang.String str2, TradeParam tradeParam, java.lang.String str3, java.lang.String str4, DefiChainInfo defiChainInfo, boolean z, int i, java.lang.Object obj) {
        c22866hnT.EZpvd(str, str2, tradeParam, str3, str4, defiChainInfo, (i & 64) != 0 ? false : z);
    }

    private final void EZpvd(java.lang.String str, java.lang.String str2, TradeParam tradeParam, java.lang.String str3, java.lang.String str4, DefiChainInfo defiChainInfo, boolean z) {
        this.AYXKKw.DCUTEI().AhwBna();
        InterfaceC22598hiQ interfaceC22598hiQFetchVPNInfo = fetchVPNInfo();
        C22380heK c22380heK = C22380heK.OLrzqt;
        KWHzl(interfaceC22598hiQFetchVPNInfo.copydefault(str3, str4, str, str2, c22380heK.copydefault(this.gEmmrt).fARcdN().AhwBna(), c22380heK.copydefault(this.gEmmrt).fARcdN().copydefault()), tradeParam, defiChainInfo, z);
    }

    public static /* synthetic */ void subscribeTradeDialogTokenCheck$default(C22866hnT c22866hnT, AbstractC58185ywX abstractC58185ywX, TradeParam tradeParam, DefiChainInfo defiChainInfo, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c22866hnT.KWHzl((AbstractC58185ywX<TokenCheckInfo>) abstractC58185ywX, tradeParam, defiChainInfo, z);
    }

    public final void KWHzl(AbstractC58185ywX<TokenCheckInfo> abstractC58185ywX, final TradeParam tradeParam, final DefiChainInfo defiChainInfo, final boolean z) {
        final Function1 function1 = new Function1() { // from class: o.hoc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22866hnT.OLrzqt(this.AEQbTJ, tradeParam, z, (TokenCheckInfo) obj);
            }
        };
        InterfaceC58227yxM<? super TokenCheckInfo> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hnZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22866hnT.valueOf(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hof
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22866hnT.copydefault(this.KWHzl, defiChainInfo, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywX.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hoe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22866hnT.AhwBna(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, copydefault());
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C22866hnT c22866hnT, TradeParam tradeParam, boolean z, TokenCheckInfo tokenCheckInfo) {
        Intrinsics.copydefault(tokenCheckInfo);
        AbstractC22885hnm.setupDataAndCoin$default(c22866hnT, tradeParam, tokenCheckInfo, true, false, 8, null);
        c22866hnT.OLrzqt(tokenCheckInfo.getFromTokenInfo());
        c22866hnT.AYXKKw.DCJXGO().setValue(java.lang.Boolean.TRUE);
        c22866hnT.AYXKKw.fetchVPNInfo(false);
        AbstractC22885hnm.handleTokenCheckInfoError$default(c22866hnT, tokenCheckInfo, z, null, 4, null);
        if (!tokenCheckInfo.isError()) {
            DexMultiTokenInfoBean fromTokenInfo = tokenCheckInfo.getFromTokenInfo();
            java.lang.String chainId = fromTokenInfo != null ? fromTokenInfo.getChainId() : null;
            if (chainId == null) {
                chainId = "";
            }
            DexMultiTokenInfoBean toTokenInfo = tokenCheckInfo.getToTokenInfo();
            java.lang.String chainId2 = toTokenInfo != null ? toTokenInfo.getChainId() : null;
            if (!C22825hmf.OLrzqt.OLrzqt(c22866hnT.gEmmrt, chainId, chainId2 != null ? chainId2 : "", c22866hnT.AYXKKw.UlJrfe()).isDAppRedirectState()) {
                c22866hnT.AYXKKw.dHguZz().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C22866hnT c22866hnT, DefiChainInfo defiChainInfo, java.lang.Throwable th) {
        c22866hnT.AYXKKw.valueOf().postValue(java.lang.Boolean.FALSE);
        AbstractC22885hnm.initTradeInput$default(c22866hnT, defiChainInfo, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        DexMultiTokenInfoBean fromDexMultiTokenInfoVO;
        TradeInputGroup data;
        InterfaceC22598hiQ interfaceC22598hiQFetchVPNInfo = fetchVPNInfo();
        java.lang.String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        DefiChainInfo defiChainInfoKWHzl = interfaceC22598hiQFetchVPNInfo.KWHzl(chainId);
        if (defiChainInfoKWHzl == null) {
            return;
        }
        DexMultiTokenInfoBean value = C22380heK.OLrzqt.copydefault(this.gEmmrt).fJNWhG().EZpvd().getValue();
        java.lang.String chainId2 = value != null ? value.getChainId() : null;
        if (chainId2 == null) {
            chainId2 = "";
        }
        java.lang.String chainId3 = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
        if (chainId3 == null) {
            chainId3 = "";
        }
        if (!KWHzl(chainId3, chainId2)) {
            DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO = defiChainInfoKWHzl.getDexDefaultFromToTokenShowVO();
            if (dexDefaultFromToTokenShowVO == null || (fromDexMultiTokenInfoVO = dexDefaultFromToTokenShowVO.getToDexMultiTokenInfoVO()) == null) {
                DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO2 = defiChainInfoKWHzl.getDexDefaultFromToTokenShowVO();
                fromDexMultiTokenInfoVO = dexDefaultFromToTokenShowVO2 != null ? dexDefaultFromToTokenShowVO2.getFromDexMultiTokenInfoVO() : null;
                if (fromDexMultiTokenInfoVO != null) {
                    ConsumeData<TradeInputGroup> value2 = this.AYXKKw.dmfpNf().getValue();
                    if (value2 != null && (data = value2.getData()) != null) {
                        data.setToData(C22332hdP.EZpvd(this.AYXKKw.aKErDB().initToData(fromDexMultiTokenInfoVO)));
                    }
                    InterfaceC22824hme.ActionBar.setCurrentToCoin$default(EZpvd(), fromDexMultiTokenInfoVO, false, 2, null);
                }
            } else {
                if (Intrinsics.EZpvd((java.lang.Object) (dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getUniqueId() : null), (java.lang.Object) fromDexMultiTokenInfoVO.getUniqueId())) {
                    fromDexMultiTokenInfoVO = null;
                }
                if (fromDexMultiTokenInfoVO == null) {
                }
                if (fromDexMultiTokenInfoVO != null) {
                }
            }
        }
        this.AYXKKw.QSBOWP().setValue(new CurrentChain(defiChainInfoKWHzl.getChainName(), defiChainInfoKWHzl));
        this.AYXKKw.QkdxfA().setValue(java.lang.Boolean.valueOf(isConnected()));
        MutableLiveData<java.lang.Boolean> mutableLiveDataOcIXYQ = this.AYXKKw.OcIXYQ();
        java.lang.String chainId4 = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
        mutableLiveDataOcIXYQ.setValue(java.lang.Boolean.valueOf(OLrzqt(chainId4 != null ? chainId4 : "")));
    }

    public final boolean OLrzqt(java.lang.String str) {
        C22825hmf c22825hmf = C22825hmf.OLrzqt;
        return (c22825hmf.EZpvd(this.gEmmrt, str, true) || c22825hmf.EZpvd(this.gEmmrt, str)) ? false : true;
    }

    public final boolean KWHzl(java.lang.String str, java.lang.String str2) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List AEQbTJ(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            DefiChainInfo defiChainInfo = (DefiChainInfo) it.next();
            arrayList.add(new CurrentChain(defiChainInfo.getChainName(), defiChainInfo));
        }
        return arrayList;
    }
}
