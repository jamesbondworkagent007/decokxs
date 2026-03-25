package o;

import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.wallet.core.sign.utxo.ARC20TxIn;
import com.okinc.wallet.core.sign.utxo.BRC20InscriptionData;
import com.okinc.wallet.core.sign.utxo.SRC20Transaction;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.clS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12357clS extends AbstractC12442cmy {
    public final C12286ckA EZpvd;
    public final java.lang.String KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12357clS(@NotNull C12286ckA c12286ckA) {
        super(c12286ckA);
        Intrinsics.checkNotNullParameter(c12286ckA, "");
        this.EZpvd = c12286ckA;
        this.KWHzl = "SRC20TransferSignHandler";
    }

    public final XRC20TransactionResult EZpvd(java.lang.String str, java.lang.String str2, java.util.List<UtxoInfo> list) {
        this.EZpvd.OLrzqt(this.KWHzl, "signSRC20: " + list);
        return C54904xZq.copydefault.copydefault(AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null), AEQbTJ(list));
    }

    public final XRC20TransactionResult OLrzqt(java.util.List<UtxoInfo> list) {
        this.EZpvd.OLrzqt(this.KWHzl, "simulateSignSRC20");
        return EZpvd(null, AhwBna(), list);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final SRC20Transaction AEQbTJ(java.util.List<UtxoInfo> list) {
        if (list == null || list.isEmpty()) {
            return new SRC20Transaction((java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BRC20InscriptionData) null, 63, (DefaultConstructorMarker) null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (UtxoInfo utxoInfo : list) {
            arrayList.add(new ARC20TxIn(utxoInfo.getTxHash(), utxoInfo.getVout(), utxoInfo.getCoinAmount(), this.EZpvd.htlTjW(), java.lang.Integer.valueOf(this.EZpvd.fdOvFl()), java.lang.Integer.valueOf(this.EZpvd.fjfviF()), this.EZpvd.aKErDB().KWHzl(), (java.util.List) null, (java.lang.String) null, MLKEMEngine.KyberPolyBytes, (DefaultConstructorMarker) null));
        }
        java.lang.String feeRate$default = C11990ceW.getFeeRate$default((C11990ceW) this.EZpvd.QKudOq(), 0, 1, null);
        UTXOSignInfo uTXOSignInfoUeEOUB = this.EZpvd.UeEOUB();
        java.lang.String inscriptionOutput = uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getInscriptionOutput() : null;
        UTXOSignInfo uTXOSignInfoUeEOUB2 = this.EZpvd.UeEOUB();
        java.lang.String minOutput = uTXOSignInfoUeEOUB2 != null ? uTXOSignInfoUeEOUB2.getMinOutput() : null;
        SRC20Transaction sRC20Transaction = new SRC20Transaction(arrayList, feeRate$default, inscriptionOutput, minOutput, this.EZpvd.htlTjW(), new BRC20InscriptionData("stamp:", "{\"p\":\"src-20\",\"op\":\"transfer\",\"tick\":\"" + this.EZpvd.fHqPtx().fJNWhG() + "\",\"amt\":\"" + AbstractC8664bGw.getTransferCoinAmount$default(this.EZpvd, false, false, 3, null) + "\"}", this.EZpvd.zLjUOn(), (java.lang.Boolean) null, 8, (DefaultConstructorMarker) null));
        C12286ckA c12286ckA = this.EZpvd;
        java.lang.String str = this.KWHzl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("generateSRC20Transaction: ");
        sb.append(sRC20Transaction);
        c12286ckA.OLrzqt(str, sb.toString());
        return sRC20Transaction;
    }
}
