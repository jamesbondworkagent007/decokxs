package o;

import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.dexlogic.bean.CallData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.MergeQuoteCallData;
import com.okinc.business.dexlogic.bean.QuoteCallData;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hrj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23094hrj extends C23095hrk {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23094hrj(@NotNull java.lang.String str, @NotNull AbstractC22977hpY abstractC22977hpY) {
        super(str, abstractC22977hpY);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC22977hpY, "");
    }

    @Override // o.C23095hrk, o.C23017hqL, o.AbstractC22974hpV
    public AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> AEQbTJ(@NotNull QuotePriceRes quotePriceRes, @NotNull MergeCallData mergeCallData, @NotNull java.lang.String str, @NotNull java.lang.String str2, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(mergeCallData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        long jValueOf = C33129mqd.valueOf(quotePriceRes.fromToken().getChainId());
        BaseSignData baseSignDataOLrzqt = OLrzqt(quotePriceRes, mergeCallData, str);
        UnsignedSwapData unsingedCallData = mergeCallData.getUnsingedCallData();
        return C22380heK.OLrzqt.copydefault(gEmmrt()).fARcdN().KWHzl(new SignDataArgs<>(str2, str, jValueOf, baseSignDataOLrzqt, null, null, null, null, null, null, 3, null, null, 1, unsingedCallData != null ? unsingedCallData.getBizLoad() : null, function1, null, false, false, null, false, false, false, false, 16718832, null));
    }

    @Override // o.C23095hrk, o.C23017hqL, o.AbstractC22974hpV
    public AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(boolean z, @NotNull MergeQuoteCallData mergeQuoteCallData, InterfaceC9734bbF interfaceC9734bbF, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(mergeQuoteCallData, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (interfaceC9734bbF != null) {
            return interfaceC9734bbF.AEQbTJ(KWHzl(mergeQuoteCallData, str));
        }
        return null;
    }

    public final BaseSignData KWHzl(MergeQuoteCallData mergeQuoteCallData, java.lang.String str) {
        java.lang.String value;
        java.lang.String originContractAddress;
        UnsignedSwapData callDataResult;
        CallData callData;
        UnsignedSwapData callDataResult2;
        java.lang.String strEvmTransferReceiveWalletAddressAesDecrypt;
        UnsignedSwapData callDataResult3;
        QuoteCallData quoteCallData = mergeQuoteCallData.getQuoteCallData();
        java.lang.String memo = null;
        QuotePriceRes quoteResult = quoteCallData != null ? quoteCallData.getQuoteResult() : null;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken = quoteResult != null ? quoteResult.fromToken() : null;
        QuoteCallData quoteCallData2 = mergeQuoteCallData.getQuoteCallData();
        CallData callData2 = (quoteCallData2 == null || (callDataResult3 = quoteCallData2.getCallDataResult()) == null) ? null : callDataResult3.getCallData();
        QuoteCallData quoteCallData3 = mergeQuoteCallData.getQuoteCallData();
        java.lang.String str2 = (quoteCallData3 == null || (callDataResult2 = quoteCallData3.getCallDataResult()) == null || (strEvmTransferReceiveWalletAddressAesDecrypt = callDataResult2.evmTransferReceiveWalletAddressAesDecrypt(str)) == null) ? "" : strEvmTransferReceiveWalletAddressAesDecrypt;
        QuoteCallData quoteCallData4 = mergeQuoteCallData.getQuoteCallData();
        if (quoteCallData4 != null && (callDataResult = quoteCallData4.getCallDataResult()) != null && (callData = callDataResult.getCallData()) != null) {
            memo = callData.getMemo();
        }
        return new C9840bdF(dexMultiTokenInfoBeanFromToken != null ? dexMultiTokenInfoBeanFromToken.isMainChainCoin() : false, (dexMultiTokenInfoBeanFromToken == null || (originContractAddress = dexMultiTokenInfoBeanFromToken.getOriginContractAddress()) == null) ? "" : originContractAddress, (callData2 == null || (value = callData2.getValue()) == null) ? "" : value, str2, memo);
    }

    public final BaseSignData OLrzqt(QuotePriceRes quotePriceRes, MergeCallData mergeCallData, java.lang.String str) {
        CallData callData;
        java.lang.String value;
        CallData callData2;
        java.lang.String strEvmTransferReceiveWalletAddressAesDecrypt;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken = quotePriceRes.fromToken();
        UnsignedSwapData unsingedCallData = mergeCallData.getUnsingedCallData();
        java.lang.String str2 = (unsingedCallData == null || (strEvmTransferReceiveWalletAddressAesDecrypt = unsingedCallData.evmTransferReceiveWalletAddressAesDecrypt(str)) == null) ? "" : strEvmTransferReceiveWalletAddressAesDecrypt;
        UnsignedSwapData unsingedCallData2 = mergeCallData.getUnsingedCallData();
        java.lang.String memo = (unsingedCallData2 == null || (callData2 = unsingedCallData2.getCallData()) == null) ? null : callData2.getMemo();
        boolean zIsMainChainCoin = dexMultiTokenInfoBeanFromToken.isMainChainCoin();
        java.lang.String originContractAddress = dexMultiTokenInfoBeanFromToken.getOriginContractAddress();
        UnsignedSwapData unsingedCallData3 = mergeCallData.getUnsingedCallData();
        return new C9840bdF(zIsMainChainCoin, originContractAddress, (unsingedCallData3 == null || (callData = unsingedCallData3.getCallData()) == null || (value = callData.getValue()) == null) ? "" : value, str2, memo);
    }
}
