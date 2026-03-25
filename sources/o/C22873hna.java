package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.SimpleConfigBeanItem;
import com.okinc.business.dexlogic.main.swap.trade.bean.CurrentChain;
import com.okinc.business.dexlogic.main.swap.trade.bean.ImageTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hna, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22873hna extends AbstractC22801hmH {
    public final AbstractC23101hrq EZpvd;
    public final java.lang.String copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22873hna(@NotNull java.lang.String str, @NotNull AbstractC23101hrq abstractC23101hrq) {
        super(abstractC23101hrq);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        this.copydefault = str;
        this.EZpvd = abstractC23101hrq;
    }

    public final DexMultiTokenInfoBean copydefault() {
        TradeInputGroup data;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data2;
        ImageTextData coinData;
        ConsumeData<TradeInputGroup> value = this.EZpvd.dmfpNf().getValue();
        if (value == null || (data = value.getData()) == null || (fromData = data.getFromData()) == null || (data2 = fromData.getData()) == null || (coinData = data2.getCoinData()) == null) {
            return null;
        }
        return coinData.getData();
    }

    public final DexMultiTokenInfoBean valueOf() {
        TradeInputGroup data;
        ConsumeData<TradeInputData> toData;
        TradeInputData data2;
        ImageTextData coinData;
        ConsumeData<TradeInputGroup> value = this.EZpvd.dmfpNf().getValue();
        if (value == null || (data = value.getData()) == null || (toData = data.getToData()) == null || (data2 = toData.getData()) == null || (coinData = data2.getCoinData()) == null) {
            return null;
        }
        return coinData.getData();
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        if (dexMultiTokenInfoBean != null && dexMultiTokenInfoBean.isLeverage() && dexMultiTokenInfoBean2 != null && dexMultiTokenInfoBean2.isLeverage()) {
            return C56390yDp.OLrzqt(dexMultiTokenInfoBean.getTokenSymbol(), dexMultiTokenInfoBean2.getTokenSymbol());
        }
        if (dexMultiTokenInfoBean != null && dexMultiTokenInfoBean.isLeverage()) {
            return C56390yDp.OLrzqt(dexMultiTokenInfoBean.getTokenSymbol(), "");
        }
        if (dexMultiTokenInfoBean2 != null && dexMultiTokenInfoBean2.isLeverage()) {
            return C56390yDp.OLrzqt(dexMultiTokenInfoBean2.getTokenSymbol(), "");
        }
        return C56390yDp.OLrzqt("", "");
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> gEmmrt() {
        kotlin.Pair<java.lang.String, java.lang.String> pairEZpvd = EZpvd(copydefault(), valueOf());
        if (pairEZpvd.getFirst().length() != 0 || pairEZpvd.getSecond().length() != 0) {
            return pairEZpvd;
        }
        QuotePriceRes quotePriceResAxsJAYsNCnLh = this.EZpvd.AxsJAYsNCnLh();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken = quotePriceResAxsJAYsNCnLh != null ? quotePriceResAxsJAYsNCnLh.fromToken() : null;
        QuotePriceRes quotePriceResAxsJAYsNCnLh2 = this.EZpvd.AxsJAYsNCnLh();
        return EZpvd(dexMultiTokenInfoBeanFromToken, quotePriceResAxsJAYsNCnLh2 != null ? quotePriceResAxsJAYsNCnLh2.toToken() : null);
    }

    public final java.lang.String djBIcL() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf;
        java.lang.String tokenSymbol;
        java.lang.String tokenSymbol2;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf2;
        java.lang.String tokenSymbol3;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = copydefault();
        if (dexMultiTokenInfoBeanCopydefault != null && dexMultiTokenInfoBeanCopydefault.isSafeMoonToken() == 1 && (dexMultiTokenInfoBeanValueOf2 = valueOf()) != null && dexMultiTokenInfoBeanValueOf2.isSafeMoonToken() == 1) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = copydefault();
            if (dexMultiTokenInfoBeanCopydefault2 != null && (tokenSymbol3 = dexMultiTokenInfoBeanCopydefault2.getTokenSymbol()) != null) {
                return tokenSymbol3;
            }
        } else {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault3 = copydefault();
            if (dexMultiTokenInfoBeanCopydefault3 != null && dexMultiTokenInfoBeanCopydefault3.isSafeMoonToken() == 1) {
                DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault4 = copydefault();
                if (dexMultiTokenInfoBeanCopydefault4 != null && (tokenSymbol2 = dexMultiTokenInfoBeanCopydefault4.getTokenSymbol()) != null) {
                    return tokenSymbol2;
                }
            } else {
                DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf3 = valueOf();
                if (dexMultiTokenInfoBeanValueOf3 != null && dexMultiTokenInfoBeanValueOf3.isSafeMoonToken() == 1 && (dexMultiTokenInfoBeanValueOf = valueOf()) != null && (tokenSymbol = dexMultiTokenInfoBeanValueOf.getTokenSymbol()) != null) {
                    return tokenSymbol;
                }
            }
        }
        return "";
    }

    public final java.lang.String AhwBna() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf;
        java.lang.String tokenSymbol;
        java.lang.String tokenSymbol2;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf2;
        java.lang.String tokenSymbol3;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = copydefault();
        if (dexMultiTokenInfoBeanCopydefault != null && dexMultiTokenInfoBeanCopydefault.isHoneypot() == 1 && (dexMultiTokenInfoBeanValueOf2 = valueOf()) != null && dexMultiTokenInfoBeanValueOf2.isHoneypot() == 1) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = copydefault();
            if (dexMultiTokenInfoBeanCopydefault2 != null && (tokenSymbol3 = dexMultiTokenInfoBeanCopydefault2.getTokenSymbol()) != null) {
                return tokenSymbol3;
            }
        } else {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault3 = copydefault();
            if (dexMultiTokenInfoBeanCopydefault3 != null && dexMultiTokenInfoBeanCopydefault3.isHoneypot() == 1) {
                DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault4 = copydefault();
                if (dexMultiTokenInfoBeanCopydefault4 != null && (tokenSymbol2 = dexMultiTokenInfoBeanCopydefault4.getTokenSymbol()) != null) {
                    return tokenSymbol2;
                }
            } else {
                DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf3 = valueOf();
                if (dexMultiTokenInfoBeanValueOf3 != null && dexMultiTokenInfoBeanValueOf3.isHoneypot() == 1 && (dexMultiTokenInfoBeanValueOf = valueOf()) != null && (tokenSymbol = dexMultiTokenInfoBeanValueOf.getTokenSymbol()) != null) {
                    return tokenSymbol;
                }
            }
        }
        return "";
    }

    public final boolean isConnected() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = copydefault();
        return dexMultiTokenInfoBeanCopydefault != null && dexMultiTokenInfoBeanCopydefault.isMainChainCoin();
    }

    public final boolean values() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = copydefault();
        if (dexMultiTokenInfoBeanCopydefault != null && dexMultiTokenInfoBeanCopydefault.isSafeMoonToken() == 1) {
            return true;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = valueOf();
        return dexMultiTokenInfoBeanValueOf != null && dexMultiTokenInfoBeanValueOf.isSafeMoonToken() == 1;
    }

    public final boolean AYXKKw() {
        return DbNXlk();
    }

    public final boolean DbNXlk() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = copydefault();
        if (dexMultiTokenInfoBeanCopydefault != null && dexMultiTokenInfoBeanCopydefault.isLeverage()) {
            return true;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = valueOf();
        return dexMultiTokenInfoBeanValueOf != null && dexMultiTokenInfoBeanValueOf.isLeverage();
    }

    public final boolean AkhnZx() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = copydefault();
        java.lang.String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = valueOf();
        return C23313hvq.copydefault(chainId, dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null);
    }

    public final boolean fetchVPNInfo() {
        return Intrinsics.EZpvd(this.EZpvd.ODWQjV().getValue(), java.lang.Boolean.TRUE);
    }

    public final DefiChainInfo EZpvd(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        if (interfaceC9738bbJ.getFieldNames()) {
            return KWHzl();
        }
        return this.EZpvd.getNewProxyInstance();
    }

    public final java.lang.String OLrzqt() {
        DefiChainInfo newProxyInstance = this.EZpvd.getNewProxyInstance();
        java.lang.String chainName = newProxyInstance != null ? newProxyInstance.getChainName() : null;
        return chainName == null ? "" : chainName;
    }

    public final java.lang.String AEQbTJ() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = copydefault();
        java.lang.String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        return chainId == null ? "" : chainId;
    }

    public final void KWHzl(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z) {
        DefiChainInfo data;
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        if (this.EZpvd.RcXXUw()) {
            java.lang.String chainId = dexMultiTokenInfoBean.getChainId();
            CurrentChain value = this.EZpvd.QSBOWP().getValue();
            if (!Intrinsics.EZpvd((java.lang.Object) chainId, (java.lang.Object) ((value == null || (data = value.getData()) == null) ? null : data.getChainId()))) {
                DefiChainInfo defiChainInfoKWHzl = C22380heK.OLrzqt.copydefault(this.copydefault).EZpvd(z).KWHzl(chainId);
                this.EZpvd.AEQbTJ(true);
                if (defiChainInfoKWHzl != null) {
                    MutableLiveData<CurrentChain> mutableLiveDataQSBOWP = this.EZpvd.QSBOWP();
                    DexMultiTokenInfoBean value2 = this.EZpvd.zLjUOn().KWHzl().getValue();
                    java.lang.String chainName = value2 != null ? value2.getChainName() : null;
                    mutableLiveDataQSBOWP.setValue(new CurrentChain(chainName != null ? chainName : "", defiChainInfoKWHzl));
                    return;
                }
                this.EZpvd.AEQbTJ(false);
                return;
            }
            this.EZpvd.AEQbTJ(false);
        }
    }

    public final java.lang.String EZpvd() {
        DefiChainInfo newProxyInstance = this.EZpvd.getNewProxyInstance();
        java.lang.String reserveGas = newProxyInstance != null ? newProxyInstance.getReserveGas() : null;
        return (reserveGas == null || reserveGas.length() == 0) ? "0.01" : reserveGas;
    }

    public final DefiChainInfo KWHzl() {
        boolean zEZpvd = EZpvd(AEQbTJ(), this.EZpvd.UlJrfe());
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = valueOf();
        java.lang.String chainId = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        boolean zEZpvd2 = EZpvd(chainId, this.EZpvd.UlJrfe());
        if (!zEZpvd || zEZpvd2) {
            chainId = AEQbTJ();
        }
        return C22380heK.OLrzqt.copydefault(this.copydefault).EZpvd(this.EZpvd.Dmq()).KWHzl(chainId);
    }

    public static /* synthetic */ boolean checkTokenAndQuoteToken$default(C22873hna c22873hna, QuotePriceRes quotePriceRes, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            quotePriceRes = null;
        }
        return c22873hna.KWHzl(quotePriceRes);
    }

    public final boolean KWHzl(QuotePriceRes quotePriceRes) {
        DexMultiTokenInfoBean token;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = copydefault();
        java.lang.String uniqueId = null;
        java.lang.String uniqueId2 = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getUniqueId() : null;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = valueOf();
        java.lang.String uniqueId3 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getUniqueId() : null;
        if (Intrinsics.EZpvd((java.lang.Object) ((quotePriceRes == null || (dexMultiTokenInfoBeanFromToken = quotePriceRes.fromToken()) == null) ? null : dexMultiTokenInfoBeanFromToken.getUniqueId()), (java.lang.Object) uniqueId2)) {
            if (quotePriceRes != null && (token = quotePriceRes.toToken()) != null) {
                uniqueId = token.getUniqueId();
            }
            if (Intrinsics.EZpvd((java.lang.Object) uniqueId, (java.lang.Object) uniqueId3)) {
                return true;
            }
        }
        return false;
    }

    public final boolean EZpvd(java.lang.String str, boolean z) {
        return C22380heK.OLrzqt.copydefault(this.copydefault).EZpvd(z).AEQbTJ(str, z);
    }

    public final DexMultiTokenInfoBean KWHzl(@NotNull java.lang.String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, java.util.List<DexMultiTokenInfoBean> list) {
        java.lang.Object next;
        java.util.List<DexMultiTokenInfoBean> tokenList;
        java.lang.String lowerCase;
        java.lang.String tokenContractAddress;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object obj = null;
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            if (list == null) {
                return null;
            }
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it.next();
                java.lang.String tokenContractAddress2 = ((DexMultiTokenInfoBean) next2).getTokenContractAddress();
                java.util.Locale locale = java.util.Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(tokenContractAddress2.toLowerCase(locale), "");
                if (dexMultiTokenInfoBean == null || (tokenContractAddress = dexMultiTokenInfoBean.getTokenContractAddress()) == null) {
                    lowerCase = null;
                } else {
                    lowerCase = tokenContractAddress.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                }
                if (!Intrinsics.EZpvd((java.lang.Object) r1, (java.lang.Object) lowerCase)) {
                    obj = next2;
                    break;
                }
            }
            return (DexMultiTokenInfoBean) obj;
        }
        java.util.Iterator<T> it2 = C22380heK.OLrzqt.copydefault(this.copydefault).fetchVPNInfo().AhwBna().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(((SimpleConfigBeanItem) next).getChainId()), (java.lang.Object) str)) {
                break;
            }
        }
        SimpleConfigBeanItem simpleConfigBeanItem = (SimpleConfigBeanItem) next;
        if (simpleConfigBeanItem == null || (tokenList = simpleConfigBeanItem.getTokenList()) == null) {
            return null;
        }
        java.util.Iterator<T> it3 = tokenList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            java.lang.Object next3 = it3.next();
            if (!Intrinsics.EZpvd((java.lang.Object) ((DexMultiTokenInfoBean) next3).getTokenContractAddress(), (java.lang.Object) (dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenContractAddress() : null))) {
                obj = next3;
                break;
            }
        }
        return (DexMultiTokenInfoBean) obj;
    }

    public final boolean EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        java.lang.Object obj;
        java.lang.Object next;
        java.util.List<DexMultiTokenInfoBean> tokenList;
        java.lang.String lowerCase;
        java.lang.String tokenContractAddress;
        java.lang.String chainId;
        java.util.Iterator<T> it = C22380heK.OLrzqt.copydefault(this.copydefault).fetchVPNInfo().AhwBna().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int chainId2 = ((SimpleConfigBeanItem) next).getChainId();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = copydefault();
            if (dexMultiTokenInfoBeanCopydefault == null || (chainId = dexMultiTokenInfoBeanCopydefault.getChainId()) == null) {
                chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
            }
            if (Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(chainId2), (java.lang.Object) chainId)) {
                break;
            }
        }
        SimpleConfigBeanItem simpleConfigBeanItem = (SimpleConfigBeanItem) next;
        if (simpleConfigBeanItem != null && (tokenList = simpleConfigBeanItem.getTokenList()) != null) {
            java.util.Iterator<T> it2 = tokenList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it2.next();
                java.lang.String tokenContractAddress2 = ((DexMultiTokenInfoBean) next2).getTokenContractAddress();
                java.util.Locale locale = java.util.Locale.ROOT;
                java.lang.String lowerCase2 = tokenContractAddress2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                if (dexMultiTokenInfoBean == null || (tokenContractAddress = dexMultiTokenInfoBean.getTokenContractAddress()) == null) {
                    lowerCase = null;
                } else {
                    lowerCase = tokenContractAddress.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                }
                if (Intrinsics.EZpvd((java.lang.Object) lowerCase2, (java.lang.Object) lowerCase)) {
                    obj = next2;
                    break;
                }
            }
            obj = (DexMultiTokenInfoBean) obj;
        }
        return obj != null;
    }
}
