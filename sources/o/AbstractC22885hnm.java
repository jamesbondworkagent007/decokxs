package o;

import com.okinc.business.dex.api.bean.CoinInfo;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.business.dexlogic.bean.TokenCheckInfo;
import com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData;
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
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hnm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC22885hnm {
    public boolean AEQbTJ;
    public C22947hov EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Object OLrzqt;
    public final AbstractC23101hrq copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22947hov AEQbTJ() {
        return this.EZpvd;
    }

    public abstract void AEQbTJ(@NotNull DefiChainInfo defiChainInfo, boolean z);

    public abstract void AEQbTJ(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(C22947hov c22947hov) {
        this.EZpvd = c22947hov;
    }

    public abstract void AEQbTJ(boolean z);

    public abstract void AkhnZx();

    public abstract InterfaceC22824hme EZpvd();

    public abstract void KWHzl(TradeParam tradeParam, @NotNull DefiChainInfo defiChainInfo);

    public abstract void KWHzl(TradeParam tradeParam, @NotNull DefiChainInfo defiChainInfo, boolean z, boolean z2);

    public abstract void KWHzl(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object copydefault() {
        return this.OLrzqt;
    }

    public abstract void gEmmrt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return (this.AEQbTJ && this.EZpvd == null) ? false : true;
    }

    public AbstractC22885hnm(@NotNull java.lang.String str, @NotNull AbstractC23101hrq abstractC23101hrq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        this.KWHzl = str;
        this.copydefault = abstractC23101hrq;
        this.OLrzqt = new java.lang.Object();
    }

    public final java.lang.String KWHzl() {
        C22947hov c22947hov;
        if (!this.AEQbTJ || (c22947hov = this.EZpvd) == null) {
            return null;
        }
        return c22947hov.copydefault();
    }

    public static /* synthetic */ void tokenCheck$default(AbstractC22885hnm abstractC22885hnm, TradeParam tradeParam, DefiChainInfo defiChainInfo, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tokenCheck");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        abstractC22885hnm.KWHzl(tradeParam, defiChainInfo, z, z2);
    }

    public final void OLrzqt() {
        C22380heK c22380heK = C22380heK.OLrzqt;
        InterfaceC9738bbJ interfaceC9738bbJValueOf = c22380heK.copydefault(this.KWHzl).fARcdN().valueOf();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = this.copydefault.QUSxYX().copydefault();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = this.copydefault.QUSxYX().valueOf();
        if (interfaceC9738bbJValueOf != null && !interfaceC9738bbJValueOf.zsXlph() && !interfaceC9738bbJValueOf.QfsBiF()) {
            if (interfaceC9738bbJValueOf.KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null))) && dexMultiTokenInfoBeanCopydefault != null && dexMultiTokenInfoBeanValueOf != null && !dexMultiTokenInfoBeanCopydefault.isRiskToken() && !dexMultiTokenInfoBeanValueOf.isRiskToken()) {
                DefiChainInfo defiChainInfoKWHzl = c22380heK.copydefault(this.KWHzl).EZpvd(this.copydefault.UlJrfe()).KWHzl(dexMultiTokenInfoBeanCopydefault.getChainId());
                if (defiChainInfoKWHzl == null) {
                    this.copydefault.getPostValueLengthLimit().postValue(java.lang.Boolean.FALSE);
                    return;
                }
                DefiChainInfo defiChainInfoKWHzl2 = c22380heK.copydefault(this.KWHzl).EZpvd(this.copydefault.UlJrfe()).KWHzl(dexMultiTokenInfoBeanValueOf.getChainId());
                if (defiChainInfoKWHzl2 == null) {
                    this.copydefault.getPostValueLengthLimit().postValue(java.lang.Boolean.FALSE);
                    return;
                }
                if (Intrinsics.EZpvd((java.lang.Object) defiChainInfoKWHzl.getCrossChainType(), (java.lang.Object) defiChainInfoKWHzl2.getCrossChainType())) {
                    copydefault(null, false);
                    this.copydefault.djSkpj().postValue(null);
                    return;
                }
                C22947hov c22947hov = this.EZpvd;
                if (Intrinsics.EZpvd((java.lang.Object) (c22947hov != null ? c22947hov.AEQbTJ() : null), (java.lang.Object) defiChainInfoKWHzl2.getChainId())) {
                    copydefault(this.EZpvd, true);
                    return;
                }
                InterfaceC9738bbJ interfaceC9738bbJValueOf2 = c22380heK.copydefault(this.KWHzl).fARcdN().valueOf();
                if (interfaceC9738bbJValueOf2 == null) {
                    return;
                }
                java.lang.String strGEmmrt = this.copydefault.gEmmrt(defiChainInfoKWHzl2.getChainId());
                if (strGEmmrt.length() == 0) {
                    copydefault(null, true);
                    this.copydefault.djSkpj().postValue(new Triple<>(defiChainInfoKWHzl2, null, dexMultiTokenInfoBeanValueOf));
                    return;
                } else {
                    C22947hov c22947hov2 = new C22947hov(strGEmmrt, defiChainInfoKWHzl2.getChainId(), null, null, interfaceC9738bbJValueOf2.AYXKKw(), false, 44, null);
                    copydefault(c22947hov2, true);
                    this.copydefault.djSkpj().postValue(new Triple<>(defiChainInfoKWHzl2, c22947hov2, dexMultiTokenInfoBeanValueOf));
                    return;
                }
            }
        }
        copydefault(null, false);
        this.copydefault.djSkpj().postValue(null);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, boolean z) {
        if (str != null && !z && C22372heC.AEQbTJ(this.KWHzl)) {
            C23317hvu.AYXKKw(str);
        }
        if (str2 == null || z || !C22372heC.AEQbTJ(this.KWHzl)) {
            return;
        }
        C23317hvu.djBIcL(str2);
    }

    public static /* synthetic */ void setHeterogeneousChainInfo$default(AbstractC22885hnm abstractC22885hnm, C22947hov c22947hov, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setHeterogeneousChainInfo");
        }
        if ((i & 2) != 0) {
            z = abstractC22885hnm.AEQbTJ;
        }
        abstractC22885hnm.copydefault(c22947hov, z);
    }

    public final void copydefault(C22947hov c22947hov, boolean z) {
        this.AEQbTJ = z;
        this.EZpvd = c22947hov;
        this.copydefault.getPostValueLengthLimit().postValue(java.lang.Boolean.FALSE);
    }

    public final void AYXKKw() {
        java.lang.String chainId;
        java.lang.String strKWHzl = KWHzl();
        if (strKWHzl != null) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = this.copydefault.QUSxYX().valueOf();
            if (dexMultiTokenInfoBeanValueOf == null || (chainId = dexMultiTokenInfoBeanValueOf.getChainId()) == null) {
                chainId = "";
            }
            C23317hvu.AYXKKw(chainId, strKWHzl);
        }
    }

    public final DexTradeInputData OLrzqt(@NotNull TradeInputData tradeInputData) {
        java.lang.String chainId;
        java.lang.String chainId2;
        java.lang.String chainLogoUrl;
        java.lang.String chainName;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(tradeInputData, "");
        FromToBalance balance = tradeInputData.getBalance();
        ImageTextData coinData = tradeInputData.getCoinData();
        EditTextData editData = tradeInputData.getEditData();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = this.copydefault.QUSxYX().copydefault();
        if (dexMultiTokenInfoBeanCopydefault == null || (chainId = dexMultiTokenInfoBeanCopydefault.getChainId()) == null) {
            chainId = "";
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = this.copydefault.QUSxYX().valueOf();
        if (dexMultiTokenInfoBeanValueOf == null || (chainId2 = dexMultiTokenInfoBeanValueOf.getChainId()) == null) {
            chainId2 = "";
        }
        boolean z = !C22825hmf.OLrzqt.OLrzqt(this.KWHzl, chainId, chainId2, this.copydefault.UlJrfe()).isDAppRedirectState();
        ConsumeData<java.lang.String> title = balance.getTitle();
        ConsumeData<java.lang.String> content = balance.getContent();
        ConsumeData consumeDataEZpvd = C22332hdP.EZpvd(this.copydefault.DbNXlk());
        ConsumeData<java.lang.String> action = balance.getAction();
        ConsumeData<java.lang.Boolean> error = balance.getError();
        ConsumeData<java.lang.String> errorContent = balance.getErrorContent();
        boolean needShowAction = balance.getNeedShowAction();
        DexMultiTokenInfoBean data = coinData.getData();
        if (data == null || (chainLogoUrl = data.getChainLogoUrl()) == null) {
            chainLogoUrl = "";
        }
        ConsumeData consumeDataEZpvd2 = C22332hdP.EZpvd(chainLogoUrl);
        DexMultiTokenInfoBean data2 = coinData.getData();
        if (data2 != null && (chainName = data2.getChainName()) != null) {
            str = chainName;
        }
        HorizontalLabelData horizontalLabelData = new HorizontalLabelData(title, content, consumeDataEZpvd, action, error, errorContent, needShowAction, consumeDataEZpvd2, C22332hdP.EZpvd(str), C22332hdP.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.dvImUD)), balance.getData(), z, false, false, 8192, null);
        SimpleBalanceData simpleBalanceData = new SimpleBalanceData(tradeInputData.getEditData().getData(), balance.getContent().getData(), balance.getContent().getData(), balance.getData(), false, z, balance.getErrorContent().getData(), balance.getError().getData().booleanValue(), C23313hvq.OLrzqt(tradeInputData.getEditData().getData(), balance.getData()));
        ImageTextSelectData imageTextSelectData = new ImageTextSelectData(coinData.getText(), coinData.getType(), coinData.getImageUrl(), C22332hdP.EZpvd(java.lang.Integer.valueOf(C52761wXj.TaskDescription.dzCpvv)), coinData.getChainLogoUrl(), coinData.getData(), false, 64, null);
        VerticalEditTextGroupData verticalEditTextGroupData = new VerticalEditTextGroupData(editData.getContent(), editData.getLabel(), editData.getData(), editData.getCheckData(), editData.getStatus(), editData.getSetInput(), editData.getNeedForbidden(), editData.getResetFoucs(), editData.getSecondLabel(), editData.getSecondDataLabel(), editData.isWarning(), 0, editData.getOriginPrice(), false, null, 26624, null);
        editData.setSetInput(false);
        editData.setResetFoucs(false);
        return new DexTradeInputData(simpleBalanceData, horizontalLabelData, verticalEditTextGroupData, imageTextSelectData);
    }

    public final void djBIcL() {
        C33050mpD.OLrzqt(this.OLrzqt);
    }

    public final void DbNXlk() {
        this.copydefault.AhwBna(false);
        AEQbTJ(this.copydefault.zsXlph());
        this.copydefault.OLrzqt(false);
        this.copydefault.OBJEWx().setValue(java.lang.Boolean.TRUE);
        C23317hvu.AYXKKw("");
        C23317hvu.djBIcL("");
        this.copydefault.isConnected().setApproveStatusGroup(null);
        C22380heK.OLrzqt.copydefault(this.KWHzl).DbNXlk().OLrzqt();
    }

    public final java.lang.String AhwBna() {
        java.lang.String balanceBracket;
        EditTextData editData;
        TradeInputData tradeInputDataKWHzl = KWHzl(this.copydefault.dmfpNf().getValue());
        FromToBalance balance = tradeInputDataKWHzl != null ? tradeInputDataKWHzl.getBalance() : null;
        if (balance == null || (balanceBracket = balance.getBalanceBracket()) == null) {
            balanceBracket = "custom";
        }
        java.lang.String data = balance != null ? balance.getData() : null;
        java.lang.String data2 = (tradeInputDataKWHzl == null || (editData = tradeInputDataKWHzl.getEditData()) == null) ? null : editData.getData();
        if (Intrinsics.EZpvd((java.lang.Object) balanceBracket, (java.lang.Object) "max")) {
            if (!this.copydefault.QUSxYX().isConnected()) {
                strSubCheckS$default = data;
            } else if (data != null) {
                strSubCheckS$default = C23313hvq.subCheckS$default(data, this.copydefault.QUSxYX().EZpvd(), null, null, null, 14, null);
            }
            if (!Intrinsics.EZpvd((java.lang.Object) strSubCheckS$default, (java.lang.Object) data2)) {
                return "custom";
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) balanceBracket, (java.lang.Object) C23311hvo.formatPercent$default("0.25", false, 0, 0, null, null, 31, null))) {
            if (!Intrinsics.EZpvd((java.lang.Object) (data != null ? C23313hvq.mulCheckS$default(data, java.lang.Double.valueOf(0.25d), null, null, null, 14, null) : null), (java.lang.Object) data2)) {
                return "custom";
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) balanceBracket, (java.lang.Object) C23311hvo.formatPercent$default(SlippageConfigVo.MAX_SLIP, false, 0, 0, null, null, 31, null))) {
            if (!Intrinsics.EZpvd((java.lang.Object) (data != null ? C23313hvq.mulCheckS$default(data, java.lang.Double.valueOf(0.5d), null, null, null, 14, null) : null), (java.lang.Object) data2)) {
                return "custom";
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) balanceBracket, (java.lang.Object) C23311hvo.formatPercent$default("0.75", false, 0, 0, null, null, 31, null))) {
            if (!Intrinsics.EZpvd((java.lang.Object) (data != null ? C23313hvq.mulCheckS$default(data, java.lang.Double.valueOf(0.75d), null, null, null, 14, null) : null), (java.lang.Object) data2)) {
                return "custom";
            }
        } else if (!Intrinsics.EZpvd((java.lang.Object) balanceBracket, (java.lang.Object) C23311hvo.formatPercent$default("1", false, 0, 0, null, null, 31, null)) || !Intrinsics.EZpvd((java.lang.Object) data, (java.lang.Object) data2)) {
            return "custom";
        }
        return balanceBracket;
    }

    public final TradeInputData KWHzl(ConsumeData<TradeInputGroup> consumeData) {
        if (consumeData == null) {
            return null;
        }
        return consumeData.getData().getFromData().getData();
    }

    public static /* synthetic */ void initTradeInput$default(AbstractC22885hnm abstractC22885hnm, DefiChainInfo defiChainInfo, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initTradeInput");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC22885hnm.AEQbTJ(defiChainInfo, z);
    }

    public final java.lang.String KWHzl(CoinInfo coinInfo, boolean z) {
        if (coinInfo != null && coinInfo.isNativeToken()) {
            DefiChainInfo defiChainInfoKWHzl = C22380heK.OLrzqt.copydefault(this.KWHzl).EZpvd(z).KWHzl(coinInfo.getChainId());
            if (defiChainInfoKWHzl != null) {
                return defiChainInfoKWHzl.getMainContractAddress();
            }
        } else if (coinInfo != null) {
            return coinInfo.getTokenAddress();
        }
        return null;
    }

    public static /* synthetic */ void setupDataAndCoin$default(AbstractC22885hnm abstractC22885hnm, TradeParam tradeParam, TokenCheckInfo tokenCheckInfo, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupDataAndCoin");
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        abstractC22885hnm.copydefault(tradeParam, tokenCheckInfo, z, z2);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dexlogic.main.swap.trade.input.helper.InitTradeGroup.initFromData$default(com.okinc.business.dexlogic.main.swap.trade.input.helper.InitTradeGroup, java.lang.String, int, java.lang.Object):com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData */
    public final void copydefault(TradeParam tradeParam, @NotNull TokenCheckInfo tokenCheckInfo, boolean z, boolean z2) {
        TradeInputData tradeInputDataInitFromData$default;
        TradeInputData tradeInputDataInitToData;
        java.lang.String chainId;
        java.lang.String fromAmount;
        Intrinsics.checkNotNullParameter(tokenCheckInfo, "");
        java.lang.String str = (tradeParam == null || (fromAmount = tradeParam.getFromAmount()) == null) ? "" : fromAmount;
        DexMultiTokenInfoBean fromTokenInfo = tokenCheckInfo.getFromTokenInfo();
        java.lang.String str2 = (fromTokenInfo == null || (chainId = fromTokenInfo.getChainId()) == null) ? "" : chainId;
        DexMultiTokenInfoBean toTokenInfo = tokenCheckInfo.getToTokenInfo();
        java.lang.String chainId2 = toTokenInfo != null ? toTokenInfo.getChainId() : null;
        java.lang.String strEZpvd = EZpvd(str, str2, chainId2 == null ? "" : chainId2, z, z2);
        if (tokenCheckInfo.getFromTokenInfo() == null && tokenCheckInfo.getToTokenInfo() == null) {
            gEmmrt();
            return;
        }
        DexMultiTokenInfoBean fromTokenInfo2 = tokenCheckInfo.getFromTokenInfo();
        if (fromTokenInfo2 == null || (tradeInputDataInitFromData$default = this.copydefault.aKErDB().initFromData(fromTokenInfo2, strEZpvd)) == null) {
            tradeInputDataInitFromData$default = InitTradeGroup.initFromData$default(this.copydefault.aKErDB(), null, 1, null);
        }
        ConsumeData consumeDataEZpvd = C22332hdP.EZpvd(tradeInputDataInitFromData$default);
        DexMultiTokenInfoBean toTokenInfo2 = tokenCheckInfo.getToTokenInfo();
        if (toTokenInfo2 == null || (tradeInputDataInitToData = this.copydefault.aKErDB().initToData(toTokenInfo2)) == null) {
            tradeInputDataInitToData = this.copydefault.aKErDB().initToData();
        }
        ConsumeData<TradeInputGroup> consumeDataEZpvd2 = C22332hdP.EZpvd(new TradeInputGroup(consumeDataEZpvd, C22332hdP.EZpvd(tradeInputDataInitToData), null, 4, null));
        EZpvd().OLrzqt(tokenCheckInfo.getFromTokenInfo(), false);
        EZpvd().AEQbTJ(tokenCheckInfo.getToTokenInfo(), true);
        this.copydefault.dmfpNf().setValue(consumeDataEZpvd2);
    }

    public static /* synthetic */ java.lang.String getFromAmount$default(AbstractC22885hnm abstractC22885hnm, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFromAmount");
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        return abstractC22885hnm.EZpvd(str, str2, str3, z, z2);
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2) {
        return (str.length() == 0 && z) ? getInitValueForSwap$default(this, this.copydefault.aKErDB(), str2, false, 4, null) : (str.length() == 0 || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) ? "" : str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hnm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleTokenCheckInfoError$default(AbstractC22885hnm abstractC22885hnm, TokenCheckInfo tokenCheckInfo, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleTokenCheckInfoError");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        abstractC22885hnm.AEQbTJ(tokenCheckInfo, z, (Function0<Unit>) function0);
    }

    public final void AEQbTJ(TokenCheckInfo tokenCheckInfo, boolean z, Function0<Unit> function0) {
        if (tokenCheckInfo == null || !tokenCheckInfo.isError()) {
            this.copydefault.valueOf().postValue(java.lang.Boolean.FALSE);
        } else if (!z) {
            if (tokenCheckInfo.isChainTokenInvalid()) {
                this.copydefault.RdAHlO().postValue(C33070mpX.AYXKKw(C23274hvD.Fragment.DCUTEIddSDPG));
            } else if (tokenCheckInfo.isSameToken()) {
                this.copydefault.RdAHlO().postValue(C33070mpX.AYXKKw(C23274hvD.Fragment.UrRBLY));
            } else if (tokenCheckInfo.isAAWalletNotChain()) {
                this.copydefault.valueOf().postValue(java.lang.Boolean.TRUE);
            } else {
                this.copydefault.valueOf().postValue(java.lang.Boolean.FALSE);
            }
            this.copydefault.fetchVPNInfo(false);
        } else {
            if (function0 != null) {
                function0.invoke();
            }
            this.copydefault.valueOf().postValue(java.lang.Boolean.FALSE);
        }
        this.copydefault.OLrzqt(CoinAssets.BOTH);
        this.copydefault.EZpvd((TradeParam) null);
        this.copydefault.AhwBna(true);
    }

    public static /* synthetic */ java.lang.String getInitValueForSwap$default(AbstractC22885hnm abstractC22885hnm, InitTradeGroup initTradeGroup, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInitValueForSwap");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return abstractC22885hnm.AEQbTJ(initTradeGroup, str, z);
    }

    public final java.lang.String AEQbTJ(@NotNull InitTradeGroup initTradeGroup, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(initTradeGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        C22825hmf c22825hmf = C22825hmf.OLrzqt;
        return (c22825hmf.EZpvd(this.KWHzl, str, true) || c22825hmf.EZpvd(this.KWHzl, str) || !z) ? "" : initTradeGroup.getINIT_AMOUNT();
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C22825hmf c22825hmf = C22825hmf.OLrzqt;
        return (c22825hmf.EZpvd(this.KWHzl, str, false) || c22825hmf.KWHzl(this.KWHzl, str, str2)) ? false : true;
    }
}
