package o;

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
import com.okinc.wallet.core.sign.utxo.ARCBuyTransaction;
import com.okinc.wallet.core.sign.utxo.ARCBuyTransactionResult;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResultErrData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cgM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12086cgM extends AbstractC12442cmy {
    public final AbstractC12074cgA AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12086cgM(@NotNull AbstractC12074cgA abstractC12074cgA) {
        super(abstractC12074cgA);
        Intrinsics.checkNotNullParameter(abstractC12074cgA, "");
        this.AEQbTJ = abstractC12074cgA;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final XRC20TransactionResult EZpvd(java.lang.String str, java.lang.String str2, UTXOInfoResp uTXOInfoResp, UTXOInfoResp uTXOInfoResp2) {
        java.lang.String feeRate$default = C11990ceW.getFeeRate$default((C11990ceW) this.AEQbTJ.QKudOq(), 0, 1, null);
        ARCBuyTransactionResult aRCBuyTransactionResultOLrzqt = C54904xZq.copydefault.OLrzqt(AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null), copydefault(uTXOInfoResp, uTXOInfoResp2, str2, false, feeRate$default));
        if (aRCBuyTransactionResultOLrzqt != null) {
            return new XRC20TransactionResult((java.lang.String) null, (XRC20TransactionResultErrData) null, (java.lang.String) null, aRCBuyTransactionResultOLrzqt.getTx(), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, aRCBuyTransactionResultOLrzqt.getFee(), (java.lang.String) null, (java.util.List) null, feeRate$default, (java.lang.String) null, 2935, (DefaultConstructorMarker) null);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final XRC20TransactionResult OLrzqt(UTXOInfoResp uTXOInfoResp, UTXOInfoResp uTXOInfoResp2) {
        java.lang.String feeRate$default = C11990ceW.getFeeRate$default((C11990ceW) this.AEQbTJ.QKudOq(), 0, 1, null);
        ARCBuyTransactionResult aRCBuyTransactionResultOLrzqt = C54904xZq.copydefault.OLrzqt(AbstractC12442cmy.generateSignParams$default(this, null, AhwBna(), false, 4, null), copydefault(uTXOInfoResp, uTXOInfoResp2, AhwBna(), true, feeRate$default));
        if (aRCBuyTransactionResultOLrzqt != null) {
            return new XRC20TransactionResult((java.lang.String) null, (XRC20TransactionResultErrData) null, (java.lang.String) null, aRCBuyTransactionResultOLrzqt.getTx(), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, aRCBuyTransactionResultOLrzqt.getFee(), (java.lang.String) null, (java.util.List) null, feeRate$default, (java.lang.String) null, 2935, (DefaultConstructorMarker) null);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final ARCBuyTransaction copydefault(UTXOInfoResp uTXOInfoResp, UTXOInfoResp uTXOInfoResp2, java.lang.String str, boolean z, java.lang.String str2) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.List<UtxoInfo> utxoList;
        java.util.List<UtxoInfo> utxoList2;
        java.util.List<UtxoInfo> utxoList3 = uTXOInfoResp != null ? uTXOInfoResp.getUtxoList() : null;
        if (utxoList3 == null || utxoList3.isEmpty()) {
            return new ARCBuyTransaction((java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 255, (DefaultConstructorMarker) null);
        }
        ChainAddress chainAddressRcXXUw = this.AEQbTJ.RcXXUw();
        java.lang.String address = chainAddressRcXXUw != null ? chainAddressRcXXUw.getAddress() : null;
        ChainAddress chainAddressRcXXUw2 = this.AEQbTJ.RcXXUw();
        java.lang.String strCopydefault = copydefault(address, chainAddressRcXXUw2 != null ? java.lang.Integer.valueOf(chainAddressRcXXUw2.getAddressType()) : null, this.AEQbTJ.fjfviF(), str, z);
        if (uTXOInfoResp2 == null || (utxoList2 = uTXOInfoResp2.getUtxoList()) == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(utxoList2, 10));
            for (UtxoInfo utxoInfo : utxoList2) {
                java.lang.String txHash = utxoInfo.getTxHash();
                java.lang.String vout = utxoInfo.getVout();
                java.lang.String coinAmount = utxoInfo.getCoinAmount();
                ChainAddress chainAddressRcXXUw3 = this.AEQbTJ.RcXXUw();
                arrayList3.add(new ARC20TxIn(txHash, vout, coinAmount, strCopydefault, chainAddressRcXXUw3 != null ? java.lang.Integer.valueOf(chainAddressRcXXUw3.getAddressType()) : null, java.lang.Integer.valueOf(this.AEQbTJ.fjfviF()), this.AEQbTJ.aKErDB().KWHzl(), (java.util.List) null, utxoInfo.getRawTransaction(), 128, (DefaultConstructorMarker) null));
            }
            arrayList = arrayList3;
        }
        if (uTXOInfoResp == null || (utxoList = uTXOInfoResp.getUtxoList()) == null) {
            arrayList2 = null;
        } else {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(utxoList, 10));
            for (UtxoInfo utxoInfo2 : utxoList) {
                arrayList4.add(new ARC20TxIn(utxoInfo2.getTxHash(), utxoInfo2.getVout(), utxoInfo2.getCoinAmount(), uTXOInfoResp.getAddress(), (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.util.List) null, utxoInfo2.getRawTransaction(), PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null));
            }
            arrayList2 = arrayList4;
        }
        AbstractC12074cgA abstractC12074cgA = this.AEQbTJ;
        java.lang.String strValueOf = abstractC12074cgA.valueOf(((FixedUTXOSignData) abstractC12074cgA.QVsKAR()).getBatchBean());
        java.lang.String strZLjUOn = this.AEQbTJ.zLjUOn();
        UTXOSignInfo uTXOSignInfoUeEOUB = this.AEQbTJ.UeEOUB();
        java.lang.String minOutput = uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null;
        FixedUTXOInfo fixedUTXOInfo = (FixedUTXOInfo) CollectionsKt___CollectionsKt.firstOrNull(((FixedUTXOSignData) this.AEQbTJ.QVsKAR()).getBatchBean());
        return new ARCBuyTransaction(arrayList, arrayList2, strValueOf, strCopydefault, strZLjUOn, str2, minOutput, fixedUTXOInfo != null ? fixedUTXOInfo.getSignData() : null);
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.Integer num, int i, java.lang.String str2, boolean z) {
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
}
