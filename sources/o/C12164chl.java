package o;

import androidx.core.app.FrameMetricsAggregator;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOSignData;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.WalletAddressItem;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.sign.utxo.ARC20TxIn;
import com.okinc.wallet.core.sign.utxo.RunesMainBuyTransaction;
import com.okinc.wallet.core.sign.utxo.RunesMainBuyTransactionResult;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResultErrData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.chl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12164chl extends AbstractC12442cmy {
    public final C12077cgD AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12164chl(@NotNull C12077cgD c12077cgD) {
        super(c12077cgD);
        Intrinsics.checkNotNullParameter(c12077cgD, "");
        this.AEQbTJ = c12077cgD;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final XRC20TransactionResult AEQbTJ(java.lang.String str, java.lang.String str2, java.util.List<UTXOInfoResp> list, UTXOInfoResp uTXOInfoResp) {
        java.lang.String feeRate$default = C11990ceW.getFeeRate$default((C11990ceW) this.AEQbTJ.QKudOq(), 0, 1, null);
        RunesMainBuyTransactionResult runesMainBuyTransactionResultKWHzl = C54904xZq.copydefault.KWHzl(AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null), copydefault(list, uTXOInfoResp, str2, false, feeRate$default));
        if (runesMainBuyTransactionResultKWHzl != null) {
            return new XRC20TransactionResult((java.lang.String) null, (XRC20TransactionResultErrData) null, (java.lang.String) null, runesMainBuyTransactionResultKWHzl.getTx(), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, runesMainBuyTransactionResultKWHzl.getFee(), (java.lang.String) null, (java.util.List) null, feeRate$default, (java.lang.String) null, 2935, (DefaultConstructorMarker) null);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final XRC20TransactionResult EZpvd(java.util.List<UTXOInfoResp> list, UTXOInfoResp uTXOInfoResp) {
        java.lang.String feeRate$default = C11990ceW.getFeeRate$default((C11990ceW) this.AEQbTJ.QKudOq(), 0, 1, null);
        RunesMainBuyTransactionResult runesMainBuyTransactionResultKWHzl = C54904xZq.copydefault.KWHzl(AbstractC12442cmy.generateSignParams$default(this, null, AhwBna(), false, 4, null), copydefault(list, uTXOInfoResp, AhwBna(), true, feeRate$default));
        if (runesMainBuyTransactionResultKWHzl != null) {
            return new XRC20TransactionResult((java.lang.String) null, (XRC20TransactionResultErrData) null, (java.lang.String) null, runesMainBuyTransactionResultKWHzl.getTx(), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, runesMainBuyTransactionResultKWHzl.getFee(), (java.lang.String) null, (java.util.List) null, feeRate$default, (java.lang.String) null, 2935, (DefaultConstructorMarker) null);
        }
        return null;
    }

    private final java.lang.String copydefault(java.lang.String str, java.lang.Integer num, int i, java.lang.String str2, boolean z) {
        java.lang.String address;
        if (!z) {
            return str;
        }
        C13847daM c13847daM = new C13847daM(this.AEQbTJ.dHguZz().fetchVPNInfo());
        if (str2 == null) {
            return str;
        }
        WalletAddressItem walletAddressItemEZpvd = c13847daM.EZpvd(str2, i, num != null ? num.intValue() : AddressType.Legacy.getValue());
        return (walletAddressItemEZpvd == null || (address = walletAddressItemEZpvd.getAddress()) == null) ? str : address;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final RunesMainBuyTransaction copydefault(java.util.List<UTXOInfoResp> list, UTXOInfoResp uTXOInfoResp, java.lang.String str, boolean z, java.lang.String str2) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.List<UtxoInfo> utxoList;
        if (list != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                java.util.List<UtxoInfo> utxoList2 = ((UTXOInfoResp) it.next()).getUtxoList();
                if (utxoList2 == null) {
                    utxoList2 = yDY.AhwBna();
                }
                arrayList.add(utxoList2);
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return new RunesMainBuyTransaction((java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, false, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
        }
        ChainAddress chainAddressRcXXUw = this.AEQbTJ.RcXXUw();
        java.lang.String address = chainAddressRcXXUw != null ? chainAddressRcXXUw.getAddress() : null;
        ChainAddress chainAddressRcXXUw2 = this.AEQbTJ.RcXXUw();
        java.lang.String strCopydefault = copydefault(address, chainAddressRcXXUw2 != null ? java.lang.Integer.valueOf(chainAddressRcXXUw2.getAddressType()) : null, this.AEQbTJ.fjfviF(), str, z);
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        for (UTXOInfoResp uTXOInfoResp2 : list) {
            java.util.List<UtxoInfo> utxoList3 = uTXOInfoResp2.getUtxoList();
            if (utxoList3 == null) {
                utxoList3 = yDY.AhwBna();
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(utxoList3, 10));
            for (UtxoInfo utxoInfo : utxoList3) {
                arrayList3.add(new ARC20TxIn(utxoInfo.getTxHash(), utxoInfo.getVout(), utxoInfo.getCoinAmount(), uTXOInfoResp2.getAddress(), (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.util.List) null, utxoInfo.getRawTransaction(), PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null));
            }
            listOLrzqt.addAll(arrayList3);
        }
        java.util.List<ARC20TxIn> listFARcdN = C56402yEa.fARcdN(listOLrzqt);
        java.util.List listOLrzqt2 = C56402yEa.OLrzqt();
        for (ARC20TxIn aRC20TxIn : listFARcdN) {
            for (FixedUTXOInfo fixedUTXOInfo : ((FixedUTXOSignData) this.AEQbTJ.QVsKAR()).getBatchBean()) {
                if (Intrinsics.EZpvd((java.lang.Object) aRC20TxIn.getTxId(), (java.lang.Object) fixedUTXOInfo.getTxHash()) && Intrinsics.EZpvd((java.lang.Object) aRC20TxIn.getVOut(), (java.lang.Object) C33129mqd.gEmmrt(fixedUTXOInfo.getVOut()))) {
                    listOLrzqt2.add(fixedUTXOInfo.getSignData());
                }
            }
        }
        java.util.List listFARcdN2 = C56402yEa.fARcdN(listOLrzqt2);
        if (uTXOInfoResp == null || (utxoList = uTXOInfoResp.getUtxoList()) == null) {
            arrayList2 = null;
        } else {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(utxoList, 10));
            for (UtxoInfo utxoInfo2 : utxoList) {
                java.lang.String txHash = utxoInfo2.getTxHash();
                java.lang.String vout = utxoInfo2.getVout();
                java.lang.String coinAmount = utxoInfo2.getCoinAmount();
                ChainAddress chainAddressRcXXUw3 = this.AEQbTJ.RcXXUw();
                arrayList4.add(new ARC20TxIn(txHash, vout, coinAmount, strCopydefault, chainAddressRcXXUw3 != null ? java.lang.Integer.valueOf(chainAddressRcXXUw3.getAddressType()) : null, java.lang.Integer.valueOf(this.AEQbTJ.fjfviF()), this.AEQbTJ.aKErDB().KWHzl(), (java.util.List) null, utxoInfo2.getRawTransaction(), 128, (DefaultConstructorMarker) null));
            }
            arrayList2 = arrayList4;
        }
        C12077cgD c12077cgD = this.AEQbTJ;
        java.lang.String strValueOf = c12077cgD.valueOf(((FixedUTXOSignData) c12077cgD.QVsKAR()).getBatchBean());
        java.lang.String strZLjUOn = this.AEQbTJ.zLjUOn();
        UTXOSignInfo uTXOSignInfoUeEOUB = this.AEQbTJ.UeEOUB();
        return new RunesMainBuyTransaction((java.util.List) arrayList2, listFARcdN, strValueOf, strCopydefault, strZLjUOn, str2, uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null, listFARcdN2, false, 256, (DefaultConstructorMarker) null);
    }
}
