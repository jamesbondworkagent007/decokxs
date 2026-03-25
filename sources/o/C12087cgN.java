package o;

import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UTXONftInfo;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.wallet.core.sign.utxo.ARC20Data;
import com.okinc.wallet.core.sign.utxo.ARC20OutPut;
import com.okinc.wallet.core.sign.utxo.ARC20Transaction;
import com.okinc.wallet.core.sign.utxo.ARC20TxIn;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cgN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12087cgN extends AbstractC12442cmy {
    public final C12162chj AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12087cgN(@NotNull C12162chj c12162chj) {
        super(c12162chj);
        Intrinsics.checkNotNullParameter(c12162chj, "");
        this.AEQbTJ = c12162chj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final XRC20TransactionResult OLrzqt(java.lang.String str, java.lang.String str2, UTXOInfoResp uTXOInfoResp, UTXOInfoResp uTXOInfoResp2) {
        java.lang.String feeRate$default = C11990ceW.getFeeRate$default((C11990ceW) this.AEQbTJ.QKudOq(), 0, 1, null);
        XRC20TransactionResult xRC20TransactionResultCopydefault = C54904xZq.copydefault.copydefault(AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null), EZpvd(uTXOInfoResp, uTXOInfoResp2, feeRate$default));
        if (xRC20TransactionResultCopydefault == null) {
            return null;
        }
        xRC20TransactionResultCopydefault.setFeeRate(feeRate$default);
        return xRC20TransactionResultCopydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final XRC20TransactionResult copydefault(UTXOInfoResp uTXOInfoResp, UTXOInfoResp uTXOInfoResp2) {
        java.lang.String feeRate$default = C11990ceW.getFeeRate$default((C11990ceW) this.AEQbTJ.QKudOq(), 0, 1, null);
        XRC20TransactionResult xRC20TransactionResultCopydefault = C54904xZq.copydefault.copydefault(AbstractC12442cmy.generateSignParams$default(this, null, AhwBna(), false, 4, null), EZpvd(uTXOInfoResp, uTXOInfoResp2, feeRate$default));
        if (xRC20TransactionResultCopydefault == null) {
            return null;
        }
        xRC20TransactionResultCopydefault.setFeeRate(feeRate$default);
        return xRC20TransactionResultCopydefault;
    }

    public final ARC20Transaction EZpvd(UTXOInfoResp uTXOInfoResp, UTXOInfoResp uTXOInfoResp2, java.lang.String str) {
        java.util.List<UtxoInfo> utxoList;
        UTXONftInfo uTXONftInfo;
        UTXONftInfo uTXONftInfo2;
        java.util.List<UtxoInfo> utxoList2;
        if (uTXOInfoResp == null || (utxoList = uTXOInfoResp.getUtxoList()) == null) {
            return new ARC20Transaction((java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        }
        if (utxoList.isEmpty()) {
            return new ARC20Transaction((java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = utxoList.iterator();
        while (true) {
            java.util.ArrayList arrayList2 = null;
            if (!it.hasNext()) {
                break;
            }
            UtxoInfo utxoInfo = (UtxoInfo) it.next();
            java.lang.String txHash = utxoInfo.getTxHash();
            java.lang.String vout = utxoInfo.getVout();
            java.lang.String coinAmount = utxoInfo.getCoinAmount();
            java.lang.String address = uTXOInfoResp.getAddress();
            C12162chj c12162chj = this.AEQbTJ;
            java.lang.String address2 = uTXOInfoResp.getAddress();
            if (address2 == null) {
                address2 = "";
            }
            int iEZpvd = c12162chj.EZpvd(address2);
            int iFjfviF = this.AEQbTJ.fjfviF();
            java.lang.String strKWHzl = this.AEQbTJ.aKErDB().KWHzl();
            java.util.List<UTXONftInfo> nftLocaltionVOs = utxoInfo.getNftLocaltionVOs();
            if (nftLocaltionVOs != null) {
                arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(nftLocaltionVOs, 10));
                for (UTXONftInfo uTXONftInfo3 : nftLocaltionVOs) {
                    arrayList2.add(new ARC20Data(uTXONftInfo3.getNftId(), uTXONftInfo3.getTokenType()));
                }
            }
            arrayList.add(new ARC20TxIn(txHash, vout, coinAmount, address, java.lang.Integer.valueOf(iEZpvd), java.lang.Integer.valueOf(iFjfviF), strKWHzl, arrayList2, (java.lang.String) null, 256, (DefaultConstructorMarker) null));
        }
        if (uTXOInfoResp2 != null && (utxoList2 = uTXOInfoResp2.getUtxoList()) != null) {
            for (UtxoInfo utxoInfo2 : utxoList2) {
                java.lang.String txHash2 = utxoInfo2.getTxHash();
                java.lang.String vout2 = utxoInfo2.getVout();
                java.lang.String coinAmount2 = utxoInfo2.getCoinAmount();
                ChainAddress chainAddressRcXXUw = this.AEQbTJ.RcXXUw();
                java.lang.String address3 = chainAddressRcXXUw != null ? chainAddressRcXXUw.getAddress() : null;
                ChainAddress chainAddressRcXXUw2 = this.AEQbTJ.RcXXUw();
                arrayList.add(new ARC20TxIn(txHash2, vout2, coinAmount2, address3, chainAddressRcXXUw2 != null ? java.lang.Integer.valueOf(chainAddressRcXXUw2.getAddressType()) : null, java.lang.Integer.valueOf(this.AEQbTJ.fjfviF()), this.AEQbTJ.aKErDB().KWHzl(), (java.util.List) null, (java.lang.String) null, MLKEMEngine.KyberPolyBytes, (DefaultConstructorMarker) null));
            }
        }
        int iAhwBna = C33129mqd.AhwBna(((UtxoInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(utxoList)).getCoinAmount());
        java.lang.String strZLjUOn = this.AEQbTJ.zLjUOn();
        java.util.List<UTXONftInfo> nftLocaltionVOs2 = ((UtxoInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(utxoList)).getNftLocaltionVOs();
        java.lang.String nftId = (nftLocaltionVOs2 == null || (uTXONftInfo2 = (UTXONftInfo) CollectionsKt___CollectionsKt.firstOrNull(nftLocaltionVOs2)) == null) ? null : uTXONftInfo2.getNftId();
        java.util.List<UTXONftInfo> nftLocaltionVOs3 = ((UtxoInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(utxoList)).getNftLocaltionVOs();
        java.util.List listEZpvd = C56402yEa.EZpvd(new ARC20OutPut(java.lang.Integer.valueOf(iAhwBna), strZLjUOn, C56402yEa.EZpvd(new ARC20Data(nftId, (nftLocaltionVOs3 == null || (uTXONftInfo = (UTXONftInfo) CollectionsKt___CollectionsKt.firstOrNull(nftLocaltionVOs3)) == null) ? null : uTXONftInfo.getTokenType()))));
        UTXOSignInfo uTXOSignInfoUeEOUB = this.AEQbTJ.UeEOUB();
        java.lang.String minOutput = uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null;
        ChainAddress chainAddressRcXXUw3 = this.AEQbTJ.RcXXUw();
        return new ARC20Transaction(arrayList, listEZpvd, minOutput, str, chainAddressRcXXUw3 != null ? chainAddressRcXXUw3.getAddress() : null);
    }
}
