package o;

import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.net.bean.UTXONftInfo;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.wallet.core.sign.utxo.ARC20Data;
import com.okinc.wallet.core.sign.utxo.ARC20OutPut;
import com.okinc.wallet.core.sign.utxo.ARC20Transaction;
import com.okinc.wallet.core.sign.utxo.ARC20TxIn;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResultErrData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.clK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12349clK extends AbstractC12442cmy {
    public final java.lang.String OLrzqt;
    public final C12319ckh copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12349clK(@NotNull C12319ckh c12319ckh) {
        super(c12319ckh);
        Intrinsics.checkNotNullParameter(c12319ckh, "");
        this.copydefault = c12319ckh;
        this.OLrzqt = "OKWARC20Transfer";
    }

    public final XRC20TransactionResult OLrzqt(java.lang.String str, java.lang.String str2, java.util.List<UtxoInfo> list) {
        this.copydefault.OLrzqt(this.OLrzqt, "signARC20  " + list);
        XRC20TransactionResult xRC20TransactionResultCopydefault = C54904xZq.copydefault.copydefault(AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null), KWHzl(list));
        if (xRC20TransactionResultCopydefault == null) {
            return null;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) xRC20TransactionResultCopydefault.getErrCode(), (java.lang.Object) "1000001")) {
            return xRC20TransactionResultCopydefault;
        }
        XRC20TransactionResultErrData data = xRC20TransactionResultCopydefault.getData();
        if (!C33129mqd.AEQbTJ(data != null ? data.getCommitTxFee() : null, 0)) {
            return xRC20TransactionResultCopydefault;
        }
        XRC20TransactionResultErrData data2 = xRC20TransactionResultCopydefault.getData();
        xRC20TransactionResultCopydefault.setCommitTxFee(data2 != null ? data2.getCommitTxFee() : null);
        return xRC20TransactionResultCopydefault;
    }

    public final XRC20TransactionResult AEQbTJ(java.util.List<UtxoInfo> list) {
        this.copydefault.OLrzqt(this.OLrzqt, "simulateSignARC20");
        return OLrzqt(null, AhwBna(), list);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final ARC20Transaction KWHzl(java.util.List<UtxoInfo> list) {
        UTXONftInfo uTXONftInfo;
        UTXONftInfo uTXONftInfo2;
        if (list == null || list.isEmpty()) {
            return new ARC20Transaction((java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        }
        int i = 10;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            java.util.ArrayList arrayList2 = null;
            if (!it.hasNext()) {
                break;
            }
            UtxoInfo utxoInfo = (UtxoInfo) it.next();
            java.lang.String txHash = utxoInfo.getTxHash();
            java.lang.String vout = utxoInfo.getVout();
            java.lang.String coinAmount = utxoInfo.getCoinAmount();
            java.lang.String strHtlTjW = this.copydefault.htlTjW();
            int iFdOvFl = this.copydefault.fdOvFl();
            int iFjfviF = this.copydefault.fjfviF();
            java.lang.String strKWHzl = this.copydefault.aKErDB().KWHzl();
            java.util.List<UTXONftInfo> nftLocaltionVOs = utxoInfo.getNftLocaltionVOs();
            if (nftLocaltionVOs != null) {
                java.util.ArrayList<UTXONftInfo> arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : nftLocaltionVOs) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) ((UTXONftInfo) obj).getNftId())) {
                        arrayList3.add(obj);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, i));
                    for (UTXONftInfo uTXONftInfo3 : arrayList3) {
                        arrayList2.add(new ARC20Data(uTXONftInfo3.getNftId(), uTXONftInfo3.getTokenType()));
                    }
                }
            }
            arrayList.add(new ARC20TxIn(txHash, vout, coinAmount, strHtlTjW, java.lang.Integer.valueOf(iFdOvFl), java.lang.Integer.valueOf(iFjfviF), strKWHzl, arrayList2, (java.lang.String) null, 256, (DefaultConstructorMarker) null));
            i = 10;
        }
        int iAhwBna = C33129mqd.AhwBna(AbstractC8704bHj.getTransferAmount$default(this.copydefault, false, false, 3, null));
        java.lang.String strZLjUOn = this.copydefault.zLjUOn();
        java.util.List<UTXONftInfo> nftLocaltionVOs2 = ((UtxoInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getNftLocaltionVOs();
        java.lang.String nftId = (nftLocaltionVOs2 == null || (uTXONftInfo2 = (UTXONftInfo) CollectionsKt___CollectionsKt.firstOrNull(nftLocaltionVOs2)) == null) ? null : uTXONftInfo2.getNftId();
        java.util.List<UTXONftInfo> nftLocaltionVOs3 = ((UtxoInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getNftLocaltionVOs();
        java.util.List listEZpvd = C56402yEa.EZpvd(new ARC20OutPut(java.lang.Integer.valueOf(iAhwBna), strZLjUOn, C56402yEa.EZpvd(new ARC20Data(nftId, (nftLocaltionVOs3 == null || (uTXONftInfo = (UTXONftInfo) CollectionsKt___CollectionsKt.firstOrNull(nftLocaltionVOs3)) == null) ? null : uTXONftInfo.getTokenType()))));
        UTXOSignInfo uTXOSignInfoUeEOUB = this.copydefault.UeEOUB();
        ARC20Transaction aRC20Transaction = new ARC20Transaction(arrayList, listEZpvd, uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null, C11990ceW.getFeeRate$default((C11990ceW) this.copydefault.QKudOq(), 0, 1, null), this.copydefault.htlTjW());
        this.copydefault.OLrzqt(this.OLrzqt, "generateARC20Transaction  " + aRC20Transaction);
        return aRC20Transaction;
    }
}
