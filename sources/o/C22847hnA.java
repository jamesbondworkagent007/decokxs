package o;

import androidx.lifecycle.MutableLiveData;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
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

/* JADX INFO: renamed from: o.hnA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22847hnA extends AbstractC22885hnm {
    public final java.lang.String AYXKKw;
    public int djBIcL;
    public final AbstractC23101hrq gEmmrt;

    public final boolean values() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22847hnA(@NotNull java.lang.String str, @NotNull AbstractC23101hrq abstractC23101hrq) {
        super(str, abstractC23101hrq);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        this.AYXKKw = str;
        this.gEmmrt = abstractC23101hrq;
    }

    @Override // o.AbstractC22885hnm
    public void AEQbTJ(final boolean z) {
        final InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault(this.AYXKKw).fARcdN().valueOf();
        AbstractC58185ywX supportChainList$default = InterfaceC22387heR.Application.getSupportChainList$default(isConnected(), "3", false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.hnC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22847hnA.copydefault((java.util.List) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = supportChainList$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hnO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22847hnA.djBIcL(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.hnM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22847hnA.OLrzqt(interfaceC9738bbJValueOf, z, this, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hnL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22847hnA.valueOf(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.hnN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22847hnA.KWHzl((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hnQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22847hnA.gEmmrt(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, copydefault());
    }

    public static final java.util.List djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(InterfaceC9738bbJ interfaceC9738bbJ, boolean z, C22847hnA c22847hnA, java.util.List list) {
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
                c22847hnA.gEmmrt.OJuSTm().setValue(C56390yDp.OLrzqt(currentChain2, list));
            }
            c22847hnA.EZpvd(z);
        }
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC22885hnm
    public void KWHzl(TradeParam tradeParam, @NotNull DefiChainInfo defiChainInfo, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        if (tradeParam == null && !z && !z2) {
            AbstractC22885hnm.initTradeInput$default(this, defiChainInfo, false, 2, null);
            return;
        }
        if (tradeParam != null) {
            OLrzqt(tradeParam, defiChainInfo);
            C22370heA.AEQbTJ(BusinessType.BRIDGE.getValue());
            this.gEmmrt.EZpvd(tradeParam.getBtcAddressType());
            C22877hne c22877hne = C22877hne.OLrzqt;
            java.lang.String str = this.AYXKKw;
            C22877hne.trackSwapDexFullPageView$default(c22877hne, str, DexTrackEventParameter.AEQbTJ.OLrzqt(str), this.gEmmrt.QCjLjM(), null, 8, null);
            this.gEmmrt.EZpvd(tradeParam.getBtcAddressType());
            return;
        }
        if (z) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd = C23317hvu.EZpvd();
            java.lang.String originContractAddress = dexMultiTokenInfoBeanEZpvd != null ? dexMultiTokenInfoBeanEZpvd.getOriginContractAddress() : null;
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAuCTel = C23317hvu.AuCTel();
            java.lang.String originContractAddress2 = dexMultiTokenInfoBeanAuCTel != null ? dexMultiTokenInfoBeanAuCTel.getOriginContractAddress() : null;
            DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd2 = C23317hvu.EZpvd();
            java.lang.String chainId = dexMultiTokenInfoBeanEZpvd2 != null ? dexMultiTokenInfoBeanEZpvd2.getChainId() : null;
            java.lang.String str2 = chainId == null ? "" : chainId;
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAuCTel2 = C23317hvu.AuCTel();
            java.lang.String chainId2 = dexMultiTokenInfoBeanAuCTel2 != null ? dexMultiTokenInfoBeanAuCTel2.getChainId() : null;
            OLrzqt(originContractAddress, originContractAddress2, null, str2, chainId2 == null ? "" : chainId2, defiChainInfo, true);
            return;
        }
        if (this.djBIcL < 1) {
            KWHzl((TradeParam) null, defiChainInfo);
        }
        this.gEmmrt.EZpvd((java.lang.Integer) null);
    }

    @Override // o.AbstractC22885hnm
    public void KWHzl(TradeParam tradeParam, @NotNull DefiChainInfo defiChainInfo) {
        kotlin.Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        java.lang.String strKWHzl = KWHzl(tradeParam != null ? tradeParam.getFromCoinInfo() : null, false);
        if (strKWHzl == null) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = this.gEmmrt.QUSxYX().copydefault();
            strKWHzl = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenContractAddress() : null;
        }
        java.lang.String strKWHzl2 = KWHzl(tradeParam != null ? tradeParam.getToCoinInfo() : null, false);
        if (tradeParam == null) {
            java.lang.String chainId = defiChainInfo.getChainId();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = this.gEmmrt.QUSxYX().valueOf();
            java.lang.String chainId2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null;
            pairOLrzqt = C56390yDp.OLrzqt(chainId, chainId2 != null ? chainId2 : "");
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(tradeParam.getFromCoinInfo().getChainId(), tradeParam.getToCoinInfo().getChainId());
        }
        java.lang.String str = (java.lang.String) pairOLrzqt.component1();
        java.lang.String str2 = (java.lang.String) pairOLrzqt.component2();
        this.gEmmrt.hrNTAI().setValue(str);
        requestTokenCheck$default(this, strKWHzl, strKWHzl2, tradeParam, str, str2, defiChainInfo, false, 64, null);
    }

    @Override // o.AbstractC22885hnm
    public void KWHzl(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        this.gEmmrt.hrNTAI().setValue(dexMultiTokenInfoBean.getChainId());
        this.djBIcL = 0;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = this.gEmmrt.QUSxYX().valueOf();
        if (Intrinsics.EZpvd((java.lang.Object) (dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getUniqueId() : null), (java.lang.Object) dexMultiTokenInfoBean.getUniqueId())) {
            AkhnZx();
            return;
        }
        this.gEmmrt.DCUTEI().AhwBna();
        this.gEmmrt.RlQdEF().disposeQuote();
        ConsumeData<TradeInputGroup> value = this.gEmmrt.dmfpNf().getValue();
        if (value != null) {
            this.gEmmrt.dmfpNf().setValue(C22332hdP.EZpvd(value.getData().setFromCoinData(dexMultiTokenInfoBean)));
        }
        DexMultiTokenInfoBean value2 = EZpvd().EZpvd().getValue();
        java.lang.String chainId = value2 != null ? value2.getChainId() : null;
        java.lang.String str = chainId != null ? chainId : "";
        copydefault(dexMultiTokenInfoBean);
        InterfaceC22824hme.ActionBar.setCurrentFromCoin$default(EZpvd(), dexMultiTokenInfoBean, false, 2, null);
        this.gEmmrt.DCJXGO().setValue(java.lang.Boolean.FALSE);
        if (!Intrinsics.EZpvd(java.lang.Boolean.TRUE, this.gEmmrt.ODWQjV().getValue())) {
            AbstractC23101hrq.clearInput$default(this.gEmmrt, false, 1, null);
        }
        this.gEmmrt.dHguZz().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        DexMultiTokenInfoBean value3 = EZpvd().EZpvd().getValue();
        this.gEmmrt.OLrzqt(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (value3 != null ? value3.getChainId() : null)) ^ true ? CoinAssets.BOTH : CoinAssets.FROM);
    }

    @Override // o.AbstractC22885hnm
    public void AkhnZx() {
        this.gEmmrt.DCUTEI().AhwBna();
        this.gEmmrt.RlQdEF().resetQuotePrice();
        this.gEmmrt.RlQdEF().disposeQuote();
        if (this.gEmmrt.dmfpNf().getValue() != null) {
            this.gEmmrt.QKVWgx().setValue(this.gEmmrt.QUSxYX().valueOf());
            this.gEmmrt.RKDWNf().setValue(this.gEmmrt.QUSxYX().copydefault());
            C22901hoB c22901hoBZuBGHE = this.gEmmrt.zuBGHE();
            if (c22901hoBZuBGHE != null) {
                c22901hoBZuBGHE.copydefault(this.AYXKKw, this.gEmmrt.QUSxYX().AYXKKw());
            }
            this.gEmmrt.wlaJM().OLrzqt(true);
            this.gEmmrt.fetchVPNInfo(fetchVPNInfo());
        }
        ConsumeData<TradeInputGroup> value = this.gEmmrt.dmfpNf().getValue();
        if (value != null) {
            EZpvd().OLrzqt(value.getData().getFromData().getData().getCoinData().getData(), false);
            InterfaceC22824hme interfaceC22824hmeEZpvd = EZpvd();
            InterfaceC22824hme.ActionBar.setCurrentToCoin$default(interfaceC22824hmeEZpvd, value.getData().getToData().getData().getCoinData().getData(), false, 2, null);
            DexMultiTokenInfoBean value2 = interfaceC22824hmeEZpvd.KWHzl().getValue();
            java.lang.String chainId = value2 != null ? value2.getChainId() : null;
            if (chainId == null) {
                chainId = "";
            }
            DexMultiTokenInfoBean value3 = interfaceC22824hmeEZpvd.EZpvd().getValue();
            java.lang.String chainId2 = value3 != null ? value3.getChainId() : null;
            java.lang.String str = chainId2 != null ? chainId2 : "";
            if (C22372heC.AEQbTJ(this.AYXKKw)) {
                C23317hvu.AYXKKw(chainId);
                C23317hvu.djBIcL(str);
            } else {
                this.gEmmrt.AYXKKw(chainId);
                this.gEmmrt.AhwBna(str);
            }
            copydefault(interfaceC22824hmeEZpvd.KWHzl().getValue());
        }
        AbstractC23101hrq.getCoinAssets$default(this.gEmmrt, null, 1, null);
    }

    @Override // o.AbstractC22885hnm
    public void AEQbTJ(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        this.gEmmrt.hrNTAI().setValue(dexMultiTokenInfoBean.getChainId());
        this.djBIcL = 0;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = this.gEmmrt.QUSxYX().copydefault();
        if (Intrinsics.EZpvd((java.lang.Object) (dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getUniqueId() : null), (java.lang.Object) dexMultiTokenInfoBean.getUniqueId())) {
            AkhnZx();
            return;
        }
        this.gEmmrt.DCUTEI().AhwBna();
        this.gEmmrt.RlQdEF().disposeQuote();
        ConsumeData<TradeInputGroup> value = this.gEmmrt.dmfpNf().getValue();
        if (value != null) {
            this.gEmmrt.dmfpNf().setValue(C22332hdP.EZpvd(value.getData().setToCoinData(dexMultiTokenInfoBean)));
            this.gEmmrt.fetchVPNInfo(fetchVPNInfo());
            this.gEmmrt.wlaJM().OLrzqt(true);
        }
        InterfaceC22824hme.ActionBar.setCurrentToCoin$default(EZpvd(), dexMultiTokenInfoBean, false, 2, null);
        this.gEmmrt.DCJXGO().setValue(java.lang.Boolean.FALSE);
        this.gEmmrt.QkdxfA().setValue(java.lang.Boolean.valueOf(values()));
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = this.gEmmrt.QUSxYX().copydefault();
        java.lang.String chainId = dexMultiTokenInfoBeanCopydefault2 != null ? dexMultiTokenInfoBeanCopydefault2.getChainId() : null;
        boolean zAEQbTJ = AEQbTJ(chainId != null ? chainId : "", dexMultiTokenInfoBean.getChainId());
        this.gEmmrt.OcIXYQ().setValue(java.lang.Boolean.valueOf(zAEQbTJ));
        if (!zAEQbTJ) {
            this.gEmmrt.EZpvd(true);
        }
        this.gEmmrt.copydefault(new Function1() { // from class: o.hnK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22847hnA.AEQbTJ(this.KWHzl, (InterfaceC9738bbJ) obj);
            }
        });
        this.gEmmrt.OLrzqt(CoinAssets.TO);
    }

    public static final Unit AEQbTJ(C22847hnA c22847hnA, InterfaceC9738bbJ interfaceC9738bbJ) {
        if (interfaceC9738bbJ != null && interfaceC9738bbJ.getFieldNames()) {
            c22847hnA.gEmmrt.dHguZz().initCheckStep();
        } else {
            c22847hnA.gEmmrt.dHguZz().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC22885hnm
    public void AEQbTJ(@NotNull final DefiChainInfo defiChainInfo, boolean z) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        if (!this.gEmmrt.RcXXUw()) {
            this.gEmmrt.aKErDB().releaseData();
            InterfaceC22824hme interfaceC22824hmeEZpvd = EZpvd();
            interfaceC22824hmeEZpvd.AEQbTJ(z ? this.gEmmrt.QUSxYX().valueOf() : null, false);
            interfaceC22824hmeEZpvd.OLrzqt(z ? this.gEmmrt.QUSxYX().copydefault() : null, false);
            this.gEmmrt.aKErDB().initTradeGroup(this.gEmmrt.dmfpNf(), defiChainInfo, EZpvd(), false, "", new Function0() { // from class: o.hnI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C22847hnA.KWHzl(this.EZpvd, defiChainInfo);
                }
            });
            this.gEmmrt.AhwBna(true);
        }
        this.gEmmrt.fetchVPNInfo(fetchVPNInfo());
    }

    public static final Unit KWHzl(C22847hnA c22847hnA, DefiChainInfo defiChainInfo) {
        c22847hnA.gEmmrt.QkdxfA().setValue(java.lang.Boolean.valueOf(c22847hnA.values()));
        MutableLiveData<java.lang.Boolean> mutableLiveDataOcIXYQ = c22847hnA.gEmmrt.OcIXYQ();
        java.lang.String chainId = defiChainInfo.getChainId();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = c22847hnA.gEmmrt.QUSxYX().valueOf();
        java.lang.String chainId2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null;
        if (chainId2 == null) {
            chainId2 = "";
        }
        mutableLiveDataOcIXYQ.setValue(java.lang.Boolean.valueOf(c22847hnA.AEQbTJ(chainId, chainId2)));
        return Unit.INSTANCE;
    }

    public InterfaceC22598hiQ isConnected() {
        return C22380heK.OLrzqt.copydefault(this.AYXKKw).EZpvd(false);
    }

    @Override // o.AbstractC22885hnm
    public InterfaceC22824hme EZpvd() {
        return C22380heK.OLrzqt.copydefault(this.AYXKKw).OLrzqt(false);
    }

    @Override // o.AbstractC22885hnm
    public void gEmmrt() {
        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO;
        TradeInputData tradeInputDataInitFromData;
        TradeInputData tradeInputDataInitToData;
        AbstractC23101hrq abstractC23101hrq = this.gEmmrt;
        DefiChainInfo newProxyInstance = abstractC23101hrq.getNewProxyInstance();
        if (newProxyInstance != null && (dexDefaultFromToTokenShowVO = newProxyInstance.getDexDefaultFromToTokenShowVO()) != null) {
            if (dexDefaultFromToTokenShowVO.getFromDexMultiTokenInfoVO() != null) {
                tradeInputDataInitFromData = abstractC23101hrq.aKErDB().initFromData(dexDefaultFromToTokenShowVO.getFromDexMultiTokenInfoVO(), "");
            } else {
                tradeInputDataInitFromData = abstractC23101hrq.aKErDB().initFromData("");
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
        C23317hvu.fARcdN();
    }

    public final void EZpvd(boolean z) {
        DefiChainInfo newProxyInstance = this.gEmmrt.getNewProxyInstance();
        if (newProxyInstance != null) {
            AEQbTJ(newProxyInstance, z);
            C23317hvu.fARcdN();
        }
    }

    public static /* synthetic */ void requestTokenCheck$default(C22847hnA c22847hnA, java.lang.String str, java.lang.String str2, TradeParam tradeParam, java.lang.String str3, java.lang.String str4, DefiChainInfo defiChainInfo, boolean z, int i, java.lang.Object obj) {
        c22847hnA.OLrzqt(str, str2, tradeParam, str3, str4, defiChainInfo, (i & 64) != 0 ? false : z);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, final TradeParam tradeParam, java.lang.String str3, final java.lang.String str4, final DefiChainInfo defiChainInfo, final boolean z) {
        this.gEmmrt.DCUTEI().AhwBna();
        InterfaceC22598hiQ interfaceC22598hiQIsConnected = isConnected();
        C22380heK c22380heK = C22380heK.OLrzqt;
        AbstractC58185ywX<TokenCheckInfo> abstractC58185ywXCopydefault = interfaceC22598hiQIsConnected.copydefault(str3, str4, str, str2, c22380heK.copydefault(this.AYXKKw).fARcdN().AhwBna(), c22380heK.copydefault(this.AYXKKw).fARcdN().copydefault());
        final Function1 function1 = new Function1() { // from class: o.hnJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22847hnA.copydefault(this.KWHzl, tradeParam, z, defiChainInfo, (TokenCheckInfo) obj);
            }
        };
        InterfaceC58227yxM<? super TokenCheckInfo> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hnG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22847hnA.fetchVPNInfo(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hnF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22847hnA.AEQbTJ(this.OLrzqt, str4, defiChainInfo, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hnH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22847hnA.DbNXlk(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, copydefault());
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final C22847hnA c22847hnA, TradeParam tradeParam, boolean z, final DefiChainInfo defiChainInfo, TokenCheckInfo tokenCheckInfo) {
        Intrinsics.copydefault(tokenCheckInfo);
        AbstractC22885hnm.setupDataAndCoin$default(c22847hnA, tradeParam, tokenCheckInfo, false, false, 8, null);
        c22847hnA.copydefault(tokenCheckInfo.getFromTokenInfo());
        c22847hnA.gEmmrt.DCJXGO().setValue(java.lang.Boolean.TRUE);
        c22847hnA.djBIcL = 1;
        DexMultiTokenInfoBean fromTokenInfo = tokenCheckInfo.getFromTokenInfo();
        java.lang.String chainId = fromTokenInfo != null ? fromTokenInfo.getChainId() : null;
        DexMultiTokenInfoBean toTokenInfo = tokenCheckInfo.getToTokenInfo();
        c22847hnA.OLrzqt(chainId, toTokenInfo != null ? toTokenInfo.getChainId() : null, z);
        c22847hnA.gEmmrt.fetchVPNInfo(c22847hnA.fetchVPNInfo());
        c22847hnA.AEQbTJ(tokenCheckInfo, z, new Function0() { // from class: o.hnD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22847hnA.OLrzqt(this.EZpvd, defiChainInfo);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C22847hnA c22847hnA, DefiChainInfo defiChainInfo) {
        C23317hvu.fARcdN();
        AbstractC22885hnm.initTradeInput$default(c22847hnA, defiChainInfo, false, 2, null);
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C22847hnA c22847hnA, java.lang.String str, DefiChainInfo defiChainInfo, java.lang.Throwable th) {
        c22847hnA.gEmmrt.valueOf().postValue(java.lang.Boolean.FALSE);
        if (str.length() > 0 && Intrinsics.EZpvd((java.lang.Object) defiChainInfo.getChainId(), (java.lang.Object) str)) {
            DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO = defiChainInfo.getDexDefaultFromToTokenShowVO();
            c22847hnA.copydefault(dexDefaultFromToTokenShowVO != null ? dexDefaultFromToTokenShowVO.getToCrossDexMultiTokenInfoVO() : null);
        } else {
            C23317hvu.fARcdN();
            AbstractC22885hnm.initTradeInput$default(c22847hnA, defiChainInfo, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final TradeParam tradeParam, final DefiChainInfo defiChainInfo) {
        this.gEmmrt.DCUTEI().AhwBna();
        java.lang.String strKWHzl = KWHzl(tradeParam.getFromCoinInfo(), false);
        java.lang.String strKWHzl2 = KWHzl(tradeParam.getToCoinInfo(), false);
        java.lang.String chainId = tradeParam.getFromCoinInfo().getChainId();
        java.lang.String str = C33129mqd.OLrzqt((java.lang.CharSequence) chainId) ? chainId : null;
        final java.lang.String chainId2 = tradeParam.getToCoinInfo().getChainId();
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) chainId2)) {
            chainId2 = null;
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        AbstractC58185ywX<TokenCheckInfo> abstractC58185ywXOLrzqt = c22380heK.copydefault(this.AYXKKw).OLrzqt().OLrzqt(str, strKWHzl, chainId2, strKWHzl2, c22380heK.copydefault(this.AYXKKw).fARcdN().AhwBna(), c22380heK.copydefault(this.AYXKKw).fARcdN().copydefault());
        final Function1 function1 = new Function1() { // from class: o.hnP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22847hnA.EZpvd(this.copydefault, tradeParam, (TokenCheckInfo) obj);
            }
        };
        InterfaceC58227yxM<? super TokenCheckInfo> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hnR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22847hnA.values(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hnS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22847hnA.copydefault(this.KWHzl, chainId2, defiChainInfo, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hnB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22847hnA.AkhnZx(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, copydefault());
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C22847hnA c22847hnA, TradeParam tradeParam, TokenCheckInfo tokenCheckInfo) {
        Intrinsics.copydefault(tokenCheckInfo);
        AbstractC22885hnm.setupDataAndCoin$default(c22847hnA, tradeParam, tokenCheckInfo, false, false, 8, null);
        c22847hnA.copydefault(tokenCheckInfo.getFromTokenInfo());
        DexMultiTokenInfoBean toTokenInfo = tokenCheckInfo.getToTokenInfo();
        java.lang.String chainId = toTokenInfo != null ? toTokenInfo.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        AbstractC23101hrq abstractC23101hrq = c22847hnA.gEmmrt;
        DexMultiTokenInfoBean fromTokenInfo = tokenCheckInfo.getFromTokenInfo();
        java.lang.String chainId2 = fromTokenInfo != null ? fromTokenInfo.getChainId() : null;
        abstractC23101hrq.AYXKKw(chainId2 != null ? chainId2 : "");
        c22847hnA.gEmmrt.AhwBna(chainId);
        c22847hnA.gEmmrt.fetchVPNInfo(c22847hnA.fetchVPNInfo());
        AbstractC22885hnm.handleTokenCheckInfoError$default(c22847hnA, tokenCheckInfo, false, null, 6, null);
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C22847hnA c22847hnA, java.lang.String str, DefiChainInfo defiChainInfo, java.lang.Throwable th) {
        c22847hnA.gEmmrt.valueOf().postValue(java.lang.Boolean.FALSE);
        if (str != null && Intrinsics.EZpvd((java.lang.Object) defiChainInfo.getChainId(), (java.lang.Object) str)) {
            DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO = defiChainInfo.getDexDefaultFromToTokenShowVO();
            c22847hnA.copydefault(dexDefaultFromToTokenShowVO != null ? dexDefaultFromToTokenShowVO.getToCrossDexMultiTokenInfoVO() : null);
        } else {
            AbstractC22885hnm.initTradeInput$default(c22847hnA, defiChainInfo, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    public final boolean fetchVPNInfo() {
        return C33129mqd.OLrzqt((java.lang.CharSequence) this.gEmmrt.ORxRYg()) && !this.gEmmrt.QUSxYX().AkhnZx();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        DexMultiTokenInfoBean fromDexMultiTokenInfoVO;
        TradeInputGroup data;
        if (dexMultiTokenInfoBean != null) {
            DefiChainInfo defiChainInfoKWHzl = isConnected().KWHzl(dexMultiTokenInfoBean.getChainId());
            if (defiChainInfoKWHzl == null) {
                return;
            }
            DexMultiTokenInfoBean value = EZpvd().EZpvd().getValue();
            java.lang.String chainId = value != null ? value.getChainId() : null;
            if (chainId == null) {
                chainId = "";
            }
            if (!KWHzl(defiChainInfoKWHzl, chainId)) {
                DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO = defiChainInfoKWHzl.getDexDefaultFromToTokenShowVO();
                if (dexDefaultFromToTokenShowVO == null || (fromDexMultiTokenInfoVO = dexDefaultFromToTokenShowVO.getToCrossDexMultiTokenInfoVO()) == null) {
                    DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO2 = defiChainInfoKWHzl.getDexDefaultFromToTokenShowVO();
                    if (dexDefaultFromToTokenShowVO2 == null || (fromDexMultiTokenInfoVO = dexDefaultFromToTokenShowVO2.getToDexMultiTokenInfoVO()) == null || Intrinsics.EZpvd((java.lang.Object) dexMultiTokenInfoBean.getUniqueId(), (java.lang.Object) fromDexMultiTokenInfoVO.getUniqueId())) {
                        fromDexMultiTokenInfoVO = null;
                    }
                    if (fromDexMultiTokenInfoVO == null) {
                        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO3 = defiChainInfoKWHzl.getDexDefaultFromToTokenShowVO();
                        fromDexMultiTokenInfoVO = dexDefaultFromToTokenShowVO3 != null ? dexDefaultFromToTokenShowVO3.getFromDexMultiTokenInfoVO() : null;
                    }
                    if (fromDexMultiTokenInfoVO != null) {
                        ConsumeData<TradeInputGroup> value2 = this.gEmmrt.dmfpNf().getValue();
                        if (value2 != null && (data = value2.getData()) != null) {
                            data.setToData(C22332hdP.EZpvd(this.gEmmrt.aKErDB().initToData(fromDexMultiTokenInfoVO)));
                        }
                        InterfaceC22824hme.ActionBar.setCurrentToCoin$default(EZpvd(), fromDexMultiTokenInfoVO, false, 2, null);
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
            MutableLiveData<CurrentChain> mutableLiveDataQSBOWP = this.gEmmrt.QSBOWP();
            java.lang.String chainName = defiChainInfoKWHzl.getChainName();
            java.lang.Integer numGEmmrt = this.gEmmrt.gEmmrt();
            if (numGEmmrt != null) {
                numGEmmrt.intValue();
                java.lang.String localUserWalletAddress = this.gEmmrt.gEmmrt(dexMultiTokenInfoBean.getChainId());
                if (localUserWalletAddress == null) {
                    localUserWalletAddress = defiChainInfoKWHzl.getLocalUserWalletAddress();
                }
                mutableLiveDataQSBOWP.setValue(new CurrentChain(chainName, defiChainInfoKWHzl.copy(((-268435457) & 1) != 0 ? defiChainInfoKWHzl.id : null, ((-268435457) & 2) != 0 ? defiChainInfoKWHzl.chainName : null, ((-268435457) & 4) != 0 ? defiChainInfoKWHzl.chainId : null, ((-268435457) & 8) != 0 ? defiChainInfoKWHzl.chainSymbol : null, ((-268435457) & 16) != 0 ? defiChainInfoKWHzl.chainUsed : null, ((-268435457) & 32) != 0 ? defiChainInfoKWHzl.logoUrl : null, ((-268435457) & 64) != 0 ? defiChainInfoKWHzl.resourceId : 0, ((-268435457) & 128) != 0 ? defiChainInfoKWHzl.sortMultipleSwap : null, ((-268435457) & 256) != 0 ? defiChainInfoKWHzl.tradeHashUrl : null, ((-268435457) & 512) != 0 ? defiChainInfoKWHzl.network : null, ((-268435457) & 1024) != 0 ? defiChainInfoKWHzl.baseToken : null, ((-268435457) & 2048) != 0 ? defiChainInfoKWHzl.hotTokens : null, ((-268435457) & 4096) != 0 ? defiChainInfoKWHzl.tokenAddress : null, ((-268435457) & 8192) != 0 ? defiChainInfoKWHzl.reserveGas : null, ((-268435457) & 16384) != 0 ? defiChainInfoKWHzl.sortCrossbridge : 0, ((-268435457) & 32768) != 0 ? defiChainInfoKWHzl.sortSingleswap : 0, ((-268435457) & 65536) != 0 ? defiChainInfoKWHzl.dexDefaultFromToTokenShowVO : null, ((-268435457) & 131072) != 0 ? defiChainInfoKWHzl.chainType : null, ((-268435457) & 262144) != 0 ? defiChainInfoKWHzl.bridgeSupportChainList : null, ((-268435457) & 524288) != 0 ? defiChainInfoKWHzl.bridgeSupportChainInfoList : null, ((-268435457) & 1048576) != 0 ? defiChainInfoKWHzl.crossChainType : null, ((-268435457) & 2097152) != 0 ? defiChainInfoKWHzl.walletExplorePrefix : null, ((-268435457) & 4194304) != 0 ? defiChainInfoKWHzl.isChainDisplay : null, ((-268435457) & 8388608) != 0 ? defiChainInfoKWHzl.isSensitive : 0, ((-268435457) & 16777216) != 0 ? defiChainInfoKWHzl.isNeedDealFeeCallData : null, ((-268435457) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? defiChainInfoKWHzl.supportSwapType : null, ((-268435457) & 67108864) != 0 ? defiChainInfoKWHzl.supportAAWallet : null, ((-268435457) & 134217728) != 0 ? defiChainInfoKWHzl.gasPriceScalar : null, ((-268435457) & 268435456) != 0 ? defiChainInfoKWHzl.localUserWalletAddress : localUserWalletAddress, ((-268435457) & 536870912) != 0 ? defiChainInfoKWHzl.isSupportDappTrade : 0, ((-268435457) & 1073741824) != 0 ? defiChainInfoKWHzl.isSupportMarket : 0, ((-268435457) & Integer.MIN_VALUE) != 0 ? defiChainInfoKWHzl.isSupportBlinksShareUrl : 0, (4194303 & 1) != 0 ? defiChainInfoKWHzl.supportMev : null, (4194303 & 2) != 0 ? defiChainInfoKWHzl.popularChain : false, (4194303 & 4) != 0 ? defiChainInfoKWHzl.popularWeight : null, (4194303 & 8) != 0 ? defiChainInfoKWHzl.crossAbility : null, (4194303 & 16) != 0 ? defiChainInfoKWHzl.searchKey : null, (4194303 & 32) != 0 ? defiChainInfoKWHzl.supportMemeMode : false, (4194303 & 64) != 0 ? defiChainInfoKWHzl.supportCefiMode : false, (4194303 & 128) != 0 ? defiChainInfoKWHzl.supportBatchBroadcast : false, (4194303 & 256) != 0 ? defiChainInfoKWHzl.networkFeeUnit : null, (4194303 & 512) != 0 ? defiChainInfoKWHzl.networkFeeDisplayDecimals : null, (4194303 & 1024) != 0 ? defiChainInfoKWHzl.supportEip1559 : false, (4194303 & 2048) != 0 ? defiChainInfoKWHzl.networkFeeType : null, (4194303 & 4096) != 0 ? defiChainInfoKWHzl.nativeTokenSymbol : null, (4194303 & 8192) != 0 ? defiChainInfoKWHzl.supportSmartAccount : false, (4194303 & 16384) != 0 ? defiChainInfoKWHzl.supportLimitSwap : false, (4194303 & 32768) != 0 ? defiChainInfoKWHzl.supportLimitU : false, (4194303 & 65536) != 0 ? defiChainInfoKWHzl.supportTpSl : false, (4194303 & 131072) != 0 ? defiChainInfoKWHzl.supportCopyTrade : false, (4194303 & 262144) != 0 ? defiChainInfoKWHzl.supportCopyTradeCreate : false, (4194303 & 524288) != 0 ? defiChainInfoKWHzl.isUpgradeRequired : false, (4194303 & 1048576) != 0 ? defiChainInfoKWHzl.limitOrderTradeMinUSD : null, (4194303 & 2097152) != 0 ? defiChainInfoKWHzl.needTop : false)));
            }
        }
        this.gEmmrt.QkdxfA().setValue(java.lang.Boolean.valueOf(values()));
        MutableLiveData<java.lang.Boolean> mutableLiveDataOcIXYQ = this.gEmmrt.OcIXYQ();
        java.lang.String chainId2 = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
        if (chainId2 == null) {
            chainId2 = "";
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = this.gEmmrt.QUSxYX().valueOf();
        java.lang.String chainId3 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null;
        mutableLiveDataOcIXYQ.setValue(java.lang.Boolean.valueOf(AEQbTJ(chainId2, chainId3 != null ? chainId3 : "")));
    }

    public final boolean KWHzl(DefiChainInfo defiChainInfo, java.lang.String str) {
        return defiChainInfo.judgeCurrentChainSupportTrade(isConnected().KWHzl(str)).getSecond().booleanValue();
    }

    public static final java.util.List copydefault(java.util.List list) {
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
