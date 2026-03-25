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

/* JADX INFO: renamed from: o.cjY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12257cjY extends AbstractC12442cmy {
    public final C12244cjL AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12257cjY(@NotNull C12244cjL c12244cjL) {
        super(c12244cjL);
        Intrinsics.checkNotNullParameter(c12244cjL, "");
        this.AEQbTJ = c12244cjL;
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2, TxInsBean txInsBean, java.lang.String str3, java.lang.String str4) {
        return C54904xZq.copydefault.copydefault(AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null), copydefault(txInsBean, str3, str4));
    }

    public final int KWHzl(TxInsBean txInsBean, java.lang.String str, java.lang.String str2) {
        return C54904xZq.copydefault.KWHzl(AbstractC12442cmy.generateSignParams$default(this, null, null, false, 6, null), copydefault(txInsBean, str, str2)).getLength();
    }

    public final TxInsBean KWHzl(java.util.List<UTXOInfoResp> list) {
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
                    java.lang.String strKWHzl = this.AEQbTJ.aKErDB().KWHzl();
                    java.lang.String rawTransaction = utxoInfo.getRawTransaction();
                    java.lang.String strHtlTjW = this.AEQbTJ.htlTjW();
                    int iFdOvFl = this.AEQbTJ.fdOvFl();
                    int iFjfviF = this.AEQbTJ.fjfviF();
                    AbstractC12784ctX abstractC12784ctXGwTjWJ = this.AEQbTJ.dUDNAs().gwTjWJ();
                    arrayList.add(new UTXOTxIn(str, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, strKWHzl, rawTransaction, strHtlTjW, java.lang.Integer.valueOf(iFdOvFl), java.lang.Integer.valueOf(iFjfviF), (java.util.List) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (abstractC12784ctXGwTjWJ == null || (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ.fetchVPNInfo()) == null) ? null : c13854daTFetchVPNInfo.copydefault(), this.AEQbTJ.fERRXa().getPublicKey(), this.AEQbTJ.fERRXa().getPublicKey(), 1792, (DefaultConstructorMarker) null));
                }
            }
        }
        return new TxInsBean(C54862xYb.convertToBigIntegerString$default(bigDecimal, false, (RoundingMode) null, 3, (java.lang.Object) null), arrayList);
    }

    public final UTXOTransaction copydefault(TxInsBean txInsBean, java.lang.String str, java.lang.String str2) {
        java.util.List listAhwBna;
        C13854daT c13854daTFetchVPNInfo;
        java.lang.String strCopydefault = null;
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(txInsBean != null ? txInsBean.getBalance() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        if (txInsBean == null || (listAhwBna = txInsBean.getTxIns()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.List list = listAhwBna;
        java.lang.String strV_ = v_();
        java.lang.String strHtlTjW = this.AEQbTJ.htlTjW();
        java.lang.String strHtlTjW2 = this.AEQbTJ.htlTjW();
        java.lang.String strHtlTjW3 = this.AEQbTJ.htlTjW();
        int iFdOvFl = this.AEQbTJ.fdOvFl();
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(str, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strDaRZkR = this.AEQbTJ.DaRZkR();
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(str2, false, (RoundingMode) null, 3, (java.lang.Object) null);
        UTXOSignInfo uTXOSignInfoUeEOUB = this.AEQbTJ.UeEOUB();
        java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getInscriptionOutput() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String publicKey = this.AEQbTJ.fERRXa().getPublicKey();
        java.lang.String derivePath = this.AEQbTJ.fERRXa().getDerivePath();
        AbstractC12784ctX abstractC12784ctXGwTjWJ = this.AEQbTJ.dUDNAs().gwTjWJ();
        if (abstractC12784ctXGwTjWJ != null && (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ.fetchVPNInfo()) != null) {
            strCopydefault = c13854daTFetchVPNInfo.copydefault();
        }
        return new UTXOTransaction(strConvertToBigIntegerString$default, strConvertToBigIntegerString$default3, strHtlTjW, strHtlTjW2, strConvertToBigIntegerString$default2, strDaRZkR, list, publicKey, strHtlTjW3, derivePath, strCopydefault, (DummyInfo) null, strConvertToBigIntegerString$default4, java.lang.Integer.valueOf(iFdOvFl), strV_, java.lang.Boolean.FALSE, (java.util.List) null, (java.lang.String) null, (java.lang.Integer) null, 460800, (DefaultConstructorMarker) null);
    }
}
