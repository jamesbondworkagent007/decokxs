package o;

import com.okinc.business.defi.api.model.tx.signdata.BRC20MintItemInfo;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.wallet.core.sign.utxo.BRC20InscriptionData;
import com.okinc.wallet.core.sign.utxo.BRC20Transaction;
import com.okinc.wallet.core.sign.utxo.BRC20TransactionResult;
import com.okinc.wallet.core.sign.utxo.UTXOTxIn;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cjM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12245cjM extends AbstractC12442cmy {
    public final C12195ciP KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12245cjM(@NotNull C12195ciP c12195ciP) {
        super(c12195ciP);
        Intrinsics.checkNotNullParameter(c12195ciP, "");
        this.KWHzl = c12195ciP;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final BRC20TransactionResult EZpvd(java.lang.String str, java.lang.String str2, java.util.List<UTXOInfoResp> list) {
        java.lang.String feeRate$default = C11990ceW.getFeeRate$default((C11990ceW) this.KWHzl.QKudOq(), 0, 1, null);
        BRC20TransactionResult bRC20TransactionResultAEQbTJ = C54904xZq.copydefault.AEQbTJ(AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null), generateBRC20Transaction$OKWallet_wallet_impl$default(this, feeRate$default, OLrzqt(list), null, null, null, null, 60, null));
        if (bRC20TransactionResultAEQbTJ == null) {
            return null;
        }
        bRC20TransactionResultAEQbTJ.setFeeRate(feeRate$default);
        return bRC20TransactionResultAEQbTJ;
    }

    public final BRC20TransactionResult EZpvd(java.util.List<UTXOInfoResp> list) {
        return EZpvd(null, AhwBna(), list);
    }

    public final java.util.List<UTXOTxIn> OLrzqt(java.util.List<UTXOInfoResp> list) {
        if (list == null || list.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
            if (utxoList != null) {
                for (UtxoInfo utxoInfo : utxoList) {
                    java.lang.String txHash = utxoInfo.getTxHash();
                    if (txHash == null) {
                        txHash = "";
                    }
                    java.lang.String str = txHash;
                    java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(utxoInfo.getVout(), false, (RoundingMode) null, 3, (java.lang.Object) null);
                    java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(utxoInfo.getCoinAmount(), false, (RoundingMode) null, 3, (java.lang.Object) null);
                    java.lang.String strKWHzl = this.KWHzl.aKErDB().KWHzl();
                    java.lang.String rawTransaction = utxoInfo.getRawTransaction();
                    java.lang.String strHtlTjW = this.KWHzl.htlTjW();
                    int iFdOvFl = this.KWHzl.fdOvFl();
                    int iFjfviF = this.KWHzl.fjfviF();
                    arrayList.add(new UTXOTxIn(str, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, strKWHzl, rawTransaction, strHtlTjW, java.lang.Integer.valueOf(iFdOvFl), java.lang.Integer.valueOf(iFjfviF), (java.util.List) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, this.KWHzl.fERRXa().getPublicKey(), this.KWHzl.fERRXa().getDerivePath(), 3840, (DefaultConstructorMarker) null));
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: o.cjM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BRC20Transaction generateBRC20Transaction$OKWallet_wallet_impl$default(C12245cjM c12245cjM, java.lang.String str, java.util.List list, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list2, int i, java.lang.Object obj) {
        return c12245cjM.AEQbTJ(str, list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list2);
    }

    public final BRC20Transaction AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<UTXOTxIn> list, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List<java.lang.String> list2) {
        java.lang.String minOutput;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.String strHtlTjW = this.KWHzl.htlTjW();
        java.lang.String strTarCU = this.KWHzl.TarCU();
        java.util.List<BRC20MintItemInfo> listQIZEnU = this.KWHzl.QIZEnU();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listQIZEnU, 10));
        for (BRC20MintItemInfo bRC20MintItemInfo : listQIZEnU) {
            arrayList.add(new BRC20InscriptionData(bRC20MintItemInfo.getContentType(), bRC20MintItemInfo.getContent(), bRC20MintItemInfo.getDestinationAddress(), java.lang.Boolean.valueOf(bRC20MintItemInfo.isHex())));
        }
        UTXOSignInfo uTXOSignInfoUeEOUB = this.KWHzl.UeEOUB();
        if (uTXOSignInfoUeEOUB == null || (minOutput = uTXOSignInfoUeEOUB.getMinOutput()) == null) {
            minOutput = "0";
        }
        return new BRC20Transaction(str, str, strTarCU, strHtlTjW, list, arrayList, minOutput, str2, str3, str4, list2);
    }
}
