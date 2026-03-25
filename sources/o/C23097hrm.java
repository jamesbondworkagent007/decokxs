package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.MergeQuoteCallData;
import com.okinc.business.dexlogic.bean.QuoteCallData;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.TransactionBean;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hrm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23097hrm extends C23096hrl {
    @Override // o.C23096hrl, o.C23017hqL, o.AbstractC22974hpV
    public void isConnected() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23097hrm(@NotNull java.lang.String str, @NotNull AbstractC22977hpY abstractC22977hpY) {
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
        long jValueOf = C33129mqd.valueOf(quotePriceRes.fromToken().getChainId());
        BaseSignData baseSignDataEZpvd = EZpvd(mergeCallData, quotePriceRes.isSingle());
        UnsignedSwapData unsingedCallData = mergeCallData.getUnsingedCallData();
        return C22380heK.OLrzqt.copydefault(gEmmrt()).fARcdN().KWHzl(new SignDataArgs<>(str2, null, jValueOf, baseSignDataEZpvd, null, null, null, null, null, null, 3, null, null, 1, unsingedCallData != null ? unsingedCallData.getBizLoad() : null, function1, null, false, false, null, false, quotePriceRes.isSingle(), false, false, 14621682, null));
    }

    @Override // o.C23096hrl, o.C23017hqL, o.AbstractC22974hpV
    public AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(boolean z, @NotNull MergeQuoteCallData mergeQuoteCallData, InterfaceC9734bbF interfaceC9734bbF, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(mergeQuoteCallData, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (interfaceC9734bbF != null) {
            return interfaceC9734bbF.AEQbTJ(KWHzl(mergeQuoteCallData));
        }
        return null;
    }

    public final BaseSignData KWHzl(MergeQuoteCallData mergeQuoteCallData) {
        QuoteCallData quoteCallData = mergeQuoteCallData.getQuoteCallData();
        QuotePriceRes quoteResult = quoteCallData != null ? quoteCallData.getQuoteResult() : null;
        UnsignedSwapData callDataResult = quoteCallData != null ? quoteCallData.getCallDataResult() : null;
        if (quoteResult == null || callDataResult == null) {
            return new EVMContractSignData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }
        return EZpvd(new MergeCallData(callDataResult), quoteResult.isSingle());
    }

    @Override // o.C23096hrl, o.C23017hqL, o.AbstractC22974hpV
    public void AEQbTJ(@NotNull QuotePriceRes quotePriceRes) {
        MutableLiveData<java.lang.Boolean> mutableLiveDataOLrzqt;
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        if (valueOf().sSMYrx()) {
            AbstractC22977hpY abstractC22977hpYValueOf = valueOf();
            C23000hpv c23000hpv = abstractC22977hpYValueOf instanceof C23000hpv ? (C23000hpv) abstractC22977hpYValueOf : null;
            if (c23000hpv == null || (mutableLiveDataOLrzqt = c23000hpv.OLrzqt()) == null) {
                return;
            }
            mutableLiveDataOLrzqt.setValue(java.lang.Boolean.TRUE);
        }
    }

    public final BaseSignData EZpvd(MergeCallData mergeCallData, boolean z) {
        UnsignedSwapData unsingedCallData = mergeCallData.getUnsingedCallData();
        if (unsingedCallData == null) {
            return new EVMContractSignData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }
        java.lang.String strCopydefault = C33491mxU.copydefault(unsingedCallData.getCallData().getValue());
        java.lang.String to = unsingedCallData.getCallData().getTo();
        java.lang.String from = unsingedCallData.getCallData().getFrom();
        java.lang.String data = unsingedCallData.getCallData().getData();
        java.lang.String strCopydefault2 = C33491mxU.copydefault(unsingedCallData.getCallData().getGas());
        java.lang.String gasPrice = unsingedCallData.getCallData().getGasPrice();
        if (gasPrice == null) {
            gasPrice = "";
        }
        java.lang.String strCopydefault3 = C33491mxU.copydefault(gasPrice);
        java.lang.Integer num = z ? null : 2;
        java.lang.String maxFeePerGas = unsingedCallData.getCallData().getMaxFeePerGas();
        java.lang.String strCopydefault4 = maxFeePerGas != null ? C33491mxU.copydefault(maxFeePerGas) : null;
        java.lang.String maxPriorityFeePerGas = unsingedCallData.getCallData().getMaxPriorityFeePerGas();
        EVMContractSignData eVMContractSignData = new EVMContractSignData(null, strCopydefault3, strCopydefault2, strCopydefault, to, data, from, null, num, strCopydefault4, maxPriorityFeePerGas != null ? C33491mxU.copydefault(maxPriorityFeePerGas) : null, null, null, null, 14465, null);
        TransactionBean transactionBeanFJNWhG = valueOf().fJNWhG();
        eVMContractSignData.setGasPriceRate(transactionBeanFJNWhG != null ? transactionBeanFJNWhG.getGasPriceRate() : null);
        return eVMContractSignData;
    }
}
