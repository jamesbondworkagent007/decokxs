package o;

import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.TxInsBean;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.wallet.core.sign.utxo.DummyInfo;
import com.okinc.wallet.core.sign.utxo.UTXOTransaction;
import com.okinc.wallet.core.sign.utxo.UTXOTxIn;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.clT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C12358clT extends AbstractC12442cmy {
    public final C12289ckD EZpvd;
    public final java.lang.String copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12358clT(@NotNull C12289ckD c12289ckD) {
        super(c12289ckD);
        Intrinsics.checkNotNullParameter(c12289ckD, "");
        this.EZpvd = c12289ckD;
        this.copydefault = "UTXOTransferSignHandler";
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2, java.util.List<UTXOInfoResp> list) {
        this.EZpvd.OLrzqt(this.copydefault, "sign " + list);
        return C54904xZq.copydefault.copydefault(AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null), AEQbTJ(AEQbTJ(list)));
    }

    public final int copydefault(java.util.List<UTXOInfoResp> list) {
        this.EZpvd.OLrzqt(this.copydefault, "calSignLength " + list);
        return C54904xZq.copydefault.KWHzl(AbstractC12442cmy.generateSignParams$default(this, null, null, false, 6, null), AEQbTJ(AEQbTJ(list))).getLength();
    }

    public final TxInsBean AEQbTJ(java.util.List<UTXOInfoResp> list) {
        C13854daT c13854daTFetchVPNInfo;
        if (list == null || list.isEmpty()) {
            return null;
        }
        BigDecimal bigDecimal = new BigDecimal("0");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
            if (utxoList != null) {
                for (UtxoInfo utxoInfo : utxoList) {
                    bigDecimal = C54862xYb.KWHzl(bigDecimal, utxoInfo.getCoinAmount());
                    java.lang.String txHash = utxoInfo.getTxHash();
                    if (txHash == null) {
                        txHash = "";
                    }
                    java.lang.String str = txHash;
                    java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(utxoInfo.getVout(), false, (RoundingMode) null, 3, (java.lang.Object) null);
                    java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(utxoInfo.getCoinAmount(), false, (RoundingMode) null, 3, (java.lang.Object) null);
                    java.lang.String strKWHzl = this.EZpvd.aKErDB().KWHzl();
                    java.lang.String rawTransaction = utxoInfo.getRawTransaction();
                    java.lang.String strHtlTjW = this.EZpvd.htlTjW();
                    int iFdOvFl = this.EZpvd.fdOvFl();
                    int iFjfviF = this.EZpvd.fjfviF();
                    AbstractC12784ctX abstractC12784ctXGwTjWJ = this.EZpvd.dUDNAs().gwTjWJ();
                    arrayList.add(new UTXOTxIn(str, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, strKWHzl, rawTransaction, strHtlTjW, java.lang.Integer.valueOf(iFdOvFl), java.lang.Integer.valueOf(iFjfviF), (java.util.List) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (abstractC12784ctXGwTjWJ == null || (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ.fetchVPNInfo()) == null) ? null : c13854daTFetchVPNInfo.copydefault(), this.EZpvd.fERRXa().getPublicKey(), this.EZpvd.fERRXa().getDerivePath(), 1792, (DefaultConstructorMarker) null));
                }
            }
        }
        TxInsBean txInsBean = new TxInsBean(C54862xYb.convertToBigIntegerString$default(bigDecimal, false, (RoundingMode) null, 3, (java.lang.Object) null), arrayList);
        this.EZpvd.OLrzqt(this.copydefault, "buildTxIns " + txInsBean);
        return txInsBean;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final UTXOTransaction AEQbTJ(TxInsBean txInsBean) {
        java.util.List listAhwBna;
        C13854daT c13854daTFetchVPNInfo;
        java.lang.String strCopydefault = null;
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(txInsBean != null ? txInsBean.getBalance() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        if (txInsBean == null || (listAhwBna = txInsBean.getTxIns()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.List list = listAhwBna;
        java.lang.String strV_ = v_();
        java.lang.String strHtlTjW = this.EZpvd.htlTjW();
        java.lang.String strZLjUOn = this.EZpvd.zLjUOn();
        java.lang.String strHtlTjW2 = this.EZpvd.htlTjW();
        int iFdOvFl = this.EZpvd.fdOvFl();
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.EZpvd, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strAEQbTJ = ((C11990ceW) this.EZpvd.QKudOq()).AEQbTJ();
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(AbstractC12387clw.getMinOutput$OKWallet_wallet_impl$default(this.EZpvd, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        UTXOSignInfo uTXOSignInfoUeEOUB = this.EZpvd.UeEOUB();
        java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getInscriptionOutput() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String publicKey = this.EZpvd.fERRXa().getPublicKey();
        java.lang.String derivePath = this.EZpvd.fERRXa().getDerivePath();
        AbstractC12784ctX abstractC12784ctXGwTjWJ = this.EZpvd.dUDNAs().gwTjWJ();
        if (abstractC12784ctXGwTjWJ != null && (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ.fetchVPNInfo()) != null) {
            strCopydefault = c13854daTFetchVPNInfo.copydefault();
        }
        UTXOTransaction uTXOTransaction = new UTXOTransaction(strConvertToBigIntegerString$default, strConvertToBigIntegerString$default3, strHtlTjW, strZLjUOn, strConvertToBigIntegerString$default2, strAEQbTJ, list, publicKey, strHtlTjW2, derivePath, strCopydefault, (DummyInfo) null, strConvertToBigIntegerString$default4, java.lang.Integer.valueOf(iFdOvFl), strV_, java.lang.Boolean.FALSE, (java.util.List) null, this.EZpvd.QIZEnU(), this.EZpvd.QDqgQU(), 67584, (DefaultConstructorMarker) null);
        this.EZpvd.OLrzqt(this.copydefault, "UTXOTransferSignHandler: " + uTXOTransaction);
        return uTXOTransaction;
    }
}
