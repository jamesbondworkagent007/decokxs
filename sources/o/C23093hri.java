package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.JitoData;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.MergeQuoteCallData;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.QuoteCallData;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.TransactionBean;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23093hri extends C23096hrl {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C23096hrl, o.C23017hqL, o.AbstractC22974hpV
    public void AEQbTJ(@NotNull QuotePriceRes quotePriceRes) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
    }

    @Override // o.C23096hrl, o.C23017hqL, o.AbstractC22974hpV
    public void isConnected() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23093hri(@NotNull java.lang.String str, @NotNull AbstractC22977hpY abstractC22977hpY) {
        super(str, abstractC22977hpY);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC22977hpY, "");
    }

    @Override // o.C23096hrl, o.C23017hqL, o.AbstractC22974hpV
    public AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> AEQbTJ(@NotNull QuotePriceRes quotePriceRes, @NotNull MergeCallData mergeCallData, @NotNull java.lang.String str, @NotNull java.lang.String str2, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(mergeCallData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd(mergeCallData.getUnsingedCallData());
        InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(gEmmrt()).fARcdN();
        java.lang.String chainId = quotePriceRes.fromToken().getChainId();
        java.lang.String strCopydefault = copydefault(mergeCallData);
        UnsignedSwapData unsingedCallData = mergeCallData.getUnsingedCallData();
        return interfaceC23194htdFARcdN.KWHzl(new DappInteractionArgs(str2, null, chainId, null, strCopydefault, null, "dex", 3, null, null, null, null, false, false, null, true, null, null, null, null, null, null, null, null, null, null, 1, unsingedCallData != null ? unsingedCallData.getBizLoad() : null, null, OLrzqt(mergeCallData), null, null, -738230486, null), function1);
    }

    @Override // o.C23096hrl, o.C23017hqL, o.AbstractC22974hpV
    public AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(boolean z, @NotNull MergeQuoteCallData mergeQuoteCallData, InterfaceC9734bbF interfaceC9734bbF, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(mergeQuoteCallData, "");
        Intrinsics.checkNotNullParameter(str, "");
        QuoteCallData quoteCallData = mergeQuoteCallData.getQuoteCallData();
        EZpvd(quoteCallData != null ? quoteCallData.getCallDataResult() : null);
        if (interfaceC9734bbF != null) {
            return interfaceC9734bbF.copydefault(AEQbTJ(mergeQuoteCallData));
        }
        return null;
    }

    public final java.lang.String copydefault(MergeCallData mergeCallData) {
        UnsignedSwapData unsingedCallData = mergeCallData.getUnsingedCallData();
        java.lang.String unsignedTx = unsingedCallData != null ? unsingedCallData.getUnsignedTx() : null;
        return unsignedTx == null ? "" : unsignedTx;
    }

    public final java.lang.String AEQbTJ(MergeQuoteCallData mergeQuoteCallData) {
        QuoteCallData quoteCallData = mergeQuoteCallData.getQuoteCallData();
        UnsignedSwapData callDataResult = quoteCallData != null ? quoteCallData.getCallDataResult() : null;
        java.lang.String unsignedTx = callDataResult != null ? callDataResult.getUnsignedTx() : null;
        return unsignedTx == null ? "" : unsignedTx;
    }

    public final void EZpvd(UnsignedSwapData unsignedSwapData) {
        MutableLiveData<UnsignedSwapData> mutableLiveDataKWHzl;
        if (unsignedSwapData != null) {
            AbstractC22977hpY abstractC22977hpYValueOf = valueOf();
            C22963hpK c22963hpK = abstractC22977hpYValueOf instanceof C22963hpK ? (C22963hpK) abstractC22977hpYValueOf : null;
            if (c22963hpK == null || (mutableLiveDataKWHzl = c22963hpK.KWHzl()) == null) {
                return;
            }
            mutableLiveDataKWHzl.setValue(unsignedSwapData);
        }
    }

    @Override // o.AbstractC22974hpV
    public boolean AhwBna() {
        MutableLiveData<UnsignedSwapData> mutableLiveDataKWHzl;
        UnsignedSwapData value;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken;
        chainId = null;
        java.lang.String chainId = null;
        if (valueOf().wlaJM()) {
            TransactionBean transactionBeanFJNWhG = valueOf().fJNWhG();
            if (transactionBeanFJNWhG == null || !transactionBeanFJNWhG.getOpenMev()) {
                return false;
            }
            QuotePriceRes quotePriceResAkhnZx = valueOf().AkhnZx();
            if (quotePriceResAkhnZx != null && (dexMultiTokenInfoBeanFromToken = quotePriceResAkhnZx.fromToken()) != null) {
                chainId = dexMultiTokenInfoBeanFromToken.getChainId();
            }
            return Intrinsics.EZpvd((java.lang.Object) chainId, (java.lang.Object) "501");
        }
        AbstractC22977hpY abstractC22977hpYValueOf = valueOf();
        C22963hpK c22963hpK = abstractC22977hpYValueOf instanceof C22963hpK ? (C22963hpK) abstractC22977hpYValueOf : null;
        if (c22963hpK == null || (mutableLiveDataKWHzl = c22963hpK.KWHzl()) == null || (value = mutableLiveDataKWHzl.getValue()) == null) {
            return false;
        }
        return value.getJitoEnable();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    @Override // o.AbstractC22974hpV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String AEQbTJ() {
        MutableLiveData<UnsignedSwapData> mutableLiveDataKWHzl;
        UnsignedSwapData value;
        JitoData jitoData;
        SwapPriorityFeeInfo swapPriorityFeeInfo;
        java.lang.String jitoMarketFee = null;
        if (valueOf().wlaJM()) {
            AbstractC22977hpY abstractC22977hpYValueOf = valueOf();
            C22963hpK c22963hpK = abstractC22977hpYValueOf instanceof C22963hpK ? (C22963hpK) abstractC22977hpYValueOf : null;
            if (c22963hpK != null) {
                TransactionBean transactionBeanFJNWhG = valueOf().fJNWhG();
                if (transactionBeanFJNWhG != null) {
                    boolean z = transactionBeanFJNWhG.getOpenMev();
                    QuotePriceRes quotePriceResAkhnZx = valueOf().AkhnZx();
                    if (quotePriceResAkhnZx == null || (swapPriorityFeeInfo = quotePriceResAkhnZx.getPriorityFeeInfo()) == null) {
                        swapPriorityFeeInfo = new SwapPriorityFeeInfo((java.util.List) null, (NonMevPriorityFeeInfo) null, (java.lang.String) null, (java.lang.String) null, 15, (DefaultConstructorMarker) null);
                    }
                    jitoMarketFee = c22963hpK.EZpvd(z, swapPriorityFeeInfo);
                }
            }
            return jitoMarketFee == null ? "" : jitoMarketFee;
        }
        AbstractC22977hpY abstractC22977hpYValueOf2 = valueOf();
        C22963hpK c22963hpK2 = abstractC22977hpYValueOf2 instanceof C22963hpK ? (C22963hpK) abstractC22977hpYValueOf2 : null;
        if (c22963hpK2 != null && (mutableLiveDataKWHzl = c22963hpK2.KWHzl()) != null && (value = mutableLiveDataKWHzl.getValue()) != null && (jitoData = value.getJitoData()) != null) {
            jitoMarketFee = jitoData.getJitoMarketFee();
        }
        return jitoMarketFee == null ? "" : jitoMarketFee;
    }
}
