package o;

import com.google.gson.Gson;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.net.bean.UTXONftInfo;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.wallet.core.sign.utxo.RunesData;
import com.okinc.wallet.core.sign.utxo.RunesMainData;
import com.okinc.wallet.core.sign.utxo.RunesMainOutPut;
import com.okinc.wallet.core.sign.utxo.RunesMainTransaction;
import com.okinc.wallet.core.sign.utxo.RunesMainTxIn;
import com.okinc.wallet.core.sign.utxo.RunesTransactionResult;
import com.okinc.wallet.core.sign.utxo.RunesTransactionResultErrData;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResultErrData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.clP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12354clP extends AbstractC12442cmy {
    public final java.lang.String AEQbTJ;
    public final AbstractC12388clx<?> KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12354clP(@NotNull AbstractC12388clx<?> abstractC12388clx) {
        super(abstractC12388clx);
        Intrinsics.checkNotNullParameter(abstractC12388clx, "");
        this.KWHzl = abstractC12388clx;
        this.AEQbTJ = "RunesMainTransferSignHandler";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final XRC20TransactionResult AEQbTJ(java.lang.String str, java.lang.String str2, java.util.List<UtxoInfo> list) {
        java.lang.String txFee;
        java.lang.String str3;
        this.KWHzl.OLrzqt(this.AEQbTJ, "signRunesMain: " + list);
        RunesTransactionResult runesTransactionResultCopydefault = C54904xZq.copydefault.copydefault(AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null), EZpvd(list));
        if (runesTransactionResultCopydefault == null) {
            return null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) runesTransactionResultCopydefault.getErrCode(), (java.lang.Object) "1000001")) {
            RunesTransactionResultErrData data = runesTransactionResultCopydefault.getData();
            if (C33129mqd.AEQbTJ(data != null ? data.getTxFee() : null, 0)) {
                RunesTransactionResultErrData data2 = runesTransactionResultCopydefault.getData();
                if (data2 != null) {
                    txFee = data2.getTxFee();
                } else {
                    str3 = null;
                }
            }
            str3 = txFee;
        } else {
            txFee = runesTransactionResultCopydefault.getTxFee();
            str3 = txFee;
        }
        return new XRC20TransactionResult(runesTransactionResultCopydefault.getErrCode(), (XRC20TransactionResultErrData) null, (java.lang.String) null, runesTransactionResultCopydefault.getTxHex(), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, str3, (java.lang.String) null, (java.util.List) null, C11990ceW.getFeeRate$default((C11990ceW) this.KWHzl.QKudOq(), 0, 1, null), (java.lang.String) null, 2934, (DefaultConstructorMarker) null);
    }

    public final XRC20TransactionResult copydefault(java.util.List<UtxoInfo> list) {
        this.KWHzl.OLrzqt(this.AEQbTJ, "simulateSignRunesMain");
        return AEQbTJ((java.lang.String) null, AhwBna(), list);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RunesMainTransaction EZpvd(java.util.List<UtxoInfo> list) {
        UTXONftInfo uTXONftInfo;
        java.lang.String json;
        java.util.ArrayList arrayList;
        if (list == null || list.isEmpty()) {
            return new RunesMainTransaction((java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 255, (DefaultConstructorMarker) null);
        }
        int i = 10;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (UtxoInfo utxoInfo : list) {
            java.lang.String txHash = utxoInfo.getTxHash();
            java.lang.String vout = utxoInfo.getVout();
            java.lang.String coinAmount = utxoInfo.getCoinAmount();
            java.lang.String strHtlTjW = this.KWHzl.htlTjW();
            int iFdOvFl = this.KWHzl.fdOvFl();
            int iFjfviF = this.KWHzl.fjfviF();
            java.lang.String strKWHzl = this.KWHzl.aKErDB().KWHzl();
            java.util.List<UTXONftInfo> nftLocaltionVOs = utxoInfo.getNftLocaltionVOs();
            if (nftLocaltionVOs != null) {
                java.util.ArrayList<UTXONftInfo> arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : nftLocaltionVOs) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) ((UTXONftInfo) obj).getNftId())) {
                        arrayList3.add(obj);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, i));
                    for (UTXONftInfo uTXONftInfo2 : arrayList3) {
                        arrayList.add(new RunesData(uTXONftInfo2.getNftId(), uTXONftInfo2.getValue()));
                    }
                }
                json = arrayList != null ? new Gson().toJson(arrayList) : null;
            }
            arrayList2.add(new RunesMainTxIn(txHash, vout, coinAmount, strHtlTjW, java.lang.Integer.valueOf(iFdOvFl), java.lang.Integer.valueOf(iFjfviF), strKWHzl, json, (java.lang.String) null, 256, (DefaultConstructorMarker) null));
            i = 10;
        }
        java.lang.String strZLjUOn = this.KWHzl.zLjUOn();
        UTXOSignInfo uTXOSignInfoUeEOUB = this.KWHzl.UeEOUB();
        java.lang.String minOutput = uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null;
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        KSerializer<RunesMainData> kSerializerSerializer = RunesMainData.Companion.serializer();
        java.util.List<UTXONftInfo> nftLocaltionVOs2 = ((UtxoInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getNftLocaltionVOs();
        RunesMainTransaction runesMainTransaction = new RunesMainTransaction((java.util.List) arrayList2, C56402yEa.EZpvd(new RunesMainOutPut(minOutput, strZLjUOn, c33489mxS.KWHzl(kSerializerSerializer, new RunesMainData((nftLocaltionVOs2 == null || (uTXONftInfo = (UTXONftInfo) CollectionsKt___CollectionsKt.firstOrNull(nftLocaltionVOs2)) == null) ? null : uTXONftInfo.getNftId(), AbstractC8704bHj.getTransferAmount$default(this.KWHzl, false, false, 3, null))))), (java.lang.String) null, C11990ceW.getFeeRate$default((C11990ceW) this.KWHzl.QKudOq(), 0, 1, null), this.KWHzl.htlTjW(), false, "0", AbstractC12387clw.getMinOutput$OKWallet_wallet_impl$default(this.KWHzl, false, false, 3, null), 4, (DefaultConstructorMarker) null);
        this.KWHzl.OLrzqt(this.AEQbTJ, "generateRunesMainTransaction: " + runesMainTransaction);
        return runesMainTransaction;
    }
}
