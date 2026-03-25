package o;

import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.TxInsBean;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UTXONftInfo;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.other.CalUTXOInfo;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.utxo.BTCSignatureRawValue;
import com.okinc.wallet.core.sign.utxo.DummyInfo;
import com.okinc.wallet.core.sign.utxo.NftInfo;
import com.okinc.wallet.core.sign.utxo.UTXOTransaction;
import com.okinc.wallet.core.sign.utxo.UTXOTxIn;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResultErrData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.chg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12159chg extends AbstractC12442cmy {
    public final C12167cho EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12159chg(@NotNull C12167cho c12167cho) {
        super(c12167cho);
        Intrinsics.checkNotNullParameter(c12167cho, "");
        this.EZpvd = c12167cho;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final XRC20TransactionResult AEQbTJ(java.lang.String str, java.lang.String str2, TxInsBean txInsBean) {
        return new XRC20TransactionResult((java.lang.String) null, (XRC20TransactionResultErrData) null, (java.lang.String) null, C54904xZq.copydefault.copydefault(AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null), EZpvd(txInsBean)), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, C11990ceW.getFeeRate$default((C11990ceW) this.EZpvd.QKudOq(), 0, 1, null), (java.lang.String) null, 3063, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final XRC20TransactionResult OLrzqt(java.util.List<UTXOInfoResp> list, java.util.List<UTXOInfoResp> list2) {
        java.lang.String feeRate$default = C11990ceW.getFeeRate$default((C11990ceW) this.EZpvd.QKudOq(), 0, 1, null);
        CalUTXOInfo calUTXOInfoKWHzl = C54904xZq.copydefault.KWHzl(AbstractC12442cmy.generateSignParams$default(this, null, null, false, 6, null), EZpvd(copydefault(this.EZpvd.copydefault(list, list2))));
        return new XRC20TransactionResult((java.lang.String) null, (XRC20TransactionResultErrData) null, (java.lang.String) null, calUTXOInfoKWHzl.getHex(), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, C54862xYb.convertToString$default(C54862xYb.OLrzqt(feeRate$default, java.lang.Integer.valueOf(calUTXOInfoKWHzl.getLength())), false, null, null, 7, null), (java.lang.String) null, (java.util.List) null, feeRate$default, (java.lang.String) null, 2935, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v15, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final UTXOTransaction EZpvd(TxInsBean txInsBean) {
        java.util.List listAhwBna;
        C13854daT c13854daTFetchVPNInfo;
        java.lang.String derivePath;
        java.lang.String publicKey;
        ChainAddress chainAddressRcXXUw = this.EZpvd.RcXXUw();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(txInsBean != null ? txInsBean.getBalance() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        UTXOSignInfo uTXOSignInfoUeEOUB = this.EZpvd.UeEOUB();
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        UTXOSignInfo uTXOSignInfoUeEOUB2 = this.EZpvd.UeEOUB();
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(uTXOSignInfoUeEOUB2 != null ? uTXOSignInfoUeEOUB2.getInscriptionOutput() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strHtlTjW = this.EZpvd.htlTjW();
        java.lang.String strZLjUOn = this.EZpvd.zLjUOn();
        java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(this.EZpvd.UhxbNG(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strAEQbTJ = ((C11990ceW) this.EZpvd.QKudOq()).AEQbTJ();
        if (txInsBean == null || (listAhwBna = txInsBean.getTxIns()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.List list = listAhwBna;
        java.lang.String address = chainAddressRcXXUw != null ? chainAddressRcXXUw.getAddress() : null;
        java.lang.String str = (chainAddressRcXXUw == null || (publicKey = chainAddressRcXXUw.getPublicKey()) == null) ? "" : publicKey;
        java.lang.String str2 = (chainAddressRcXXUw == null || (derivePath = chainAddressRcXXUw.getDerivePath()) == null) ? "" : derivePath;
        AbstractC12784ctX abstractC12784ctXGwTjWJ = this.EZpvd.dUDNAs().gwTjWJ();
        return new UTXOTransaction(strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, strHtlTjW, strZLjUOn, strConvertToBigIntegerString$default4, strAEQbTJ, list, str, address, str2, (abstractC12784ctXGwTjWJ == null || (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ.fetchVPNInfo()) == null) ? null : c13854daTFetchVPNInfo.copydefault(), (DummyInfo) null, strConvertToBigIntegerString$default3, chainAddressRcXXUw != null ? java.lang.Integer.valueOf(chainAddressRcXXUw.getAddressType()) : null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.lang.String) null, (java.lang.Integer) null, 493568, (DefaultConstructorMarker) null);
    }

    public final TxInsBean copydefault(java.util.List<UTXOInfoResp> list) {
        BigDecimal bigDecimal;
        java.util.Iterator it;
        UTXOInfoResp uTXOInfoResp;
        java.util.ArrayList arrayList;
        C13854daT c13854daTFetchVPNInfo;
        RoundingMode roundingMode = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        BigDecimal bigDecimal2 = new BigDecimal("0");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = list.iterator();
        while (true) {
            int i = 3;
            boolean z = false;
            if (it2.hasNext()) {
                UTXOInfoResp uTXOInfoResp2 = (UTXOInfoResp) it2.next();
                C12797ctk c12797ctkAKErDB = this.EZpvd.aKErDB();
                AbstractC12782ctV abstractC12782ctVDUDNAs = this.EZpvd.dUDNAs();
                C10854bwM c10854bwMFHqPtx = this.EZpvd.fHqPtx();
                java.lang.String address = uTXOInfoResp2.getAddress();
                if (address == null) {
                    address = "";
                }
                ChainAddress chainAddressOLrzqt = c12797ctkAKErDB.OLrzqt(abstractC12782ctVDUDNAs, c10854bwMFHqPtx, address);
                java.util.List<UtxoInfo> utxoList = uTXOInfoResp2.getUtxoList();
                if (utxoList != null) {
                    for (UtxoInfo utxoInfo : utxoList) {
                        BigDecimal bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimal2, utxoInfo.getCoinAmount());
                        java.lang.String txHash = utxoInfo.getTxHash();
                        java.lang.String str = txHash == null ? "" : txHash;
                        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(utxoInfo.getVout(), z, roundingMode, i, roundingMode);
                        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(utxoInfo.getCoinAmount(), z, roundingMode, i, roundingMode);
                        java.lang.String strKWHzl = this.EZpvd.aKErDB().KWHzl();
                        java.lang.String rawTransaction = utxoInfo.getRawTransaction();
                        java.lang.String address2 = uTXOInfoResp2.getAddress();
                        C12797ctk c12797ctkAKErDB2 = this.EZpvd.aKErDB();
                        AbstractC12782ctV abstractC12782ctVDUDNAs2 = this.EZpvd.dUDNAs();
                        C10854bwM c10854bwMFHqPtx2 = this.EZpvd.fHqPtx();
                        java.lang.String address3 = uTXOInfoResp2.getAddress();
                        int iEZpvd = c12797ctkAKErDB2.EZpvd(abstractC12782ctVDUDNAs2, c10854bwMFHqPtx2, address3 == null ? "" : address3);
                        int iFinit = this.EZpvd.dUDNAs().finit();
                        java.util.List<UTXONftInfo> nftLocaltionVOs = utxoInfo.getNftLocaltionVOs();
                        if (nftLocaltionVOs != null) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(nftLocaltionVOs, 10));
                            for (UTXONftInfo uTXONftInfo : nftLocaltionVOs) {
                                arrayList3.add(new NftInfo(uTXONftInfo.getNftId(), uTXONftInfo.getValue(), uTXONftInfo.getTokenType()));
                                bigDecimalKWHzl = bigDecimalKWHzl;
                                it2 = it2;
                                uTXOInfoResp2 = uTXOInfoResp2;
                            }
                            bigDecimal = bigDecimalKWHzl;
                            it = it2;
                            uTXOInfoResp = uTXOInfoResp2;
                            arrayList = arrayList3;
                        } else {
                            bigDecimal = bigDecimalKWHzl;
                            it = it2;
                            uTXOInfoResp = uTXOInfoResp2;
                            arrayList = null;
                        }
                        java.lang.Integer utxoType = utxoInfo.getUtxoType();
                        boolean z2 = (utxoType != null && utxoType.intValue() == 4) || Intrinsics.EZpvd(utxoInfo.getHasNft(), java.lang.Boolean.TRUE);
                        java.lang.Boolean dummy = utxoInfo.getDummy();
                        AbstractC12784ctX abstractC12784ctXGwTjWJ = this.EZpvd.dUDNAs().gwTjWJ();
                        arrayList2.add(new UTXOTxIn(str, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, strKWHzl, rawTransaction, address2, java.lang.Integer.valueOf(iEZpvd), java.lang.Integer.valueOf(iFinit), arrayList, java.lang.Boolean.valueOf(z2), dummy, (abstractC12784ctXGwTjWJ == null || (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ.fetchVPNInfo()) == null) ? null : c13854daTFetchVPNInfo.copydefault(), chainAddressOLrzqt != null ? chainAddressOLrzqt.getPublicKey() : null, chainAddressOLrzqt != null ? chainAddressOLrzqt.getDerivePath() : null));
                        bigDecimal2 = bigDecimal;
                        it2 = it;
                        uTXOInfoResp2 = uTXOInfoResp;
                        roundingMode = null;
                        i = 3;
                        z = false;
                    }
                }
                it2 = it2;
                roundingMode = null;
            } else {
                return new TxInsBean(C54862xYb.convertToBigIntegerString$default(bigDecimal2, false, (RoundingMode) null, 3, (java.lang.Object) null), arrayList2);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Fee */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58185ywX<ResponseData<XRC20TransactionResult>> OLrzqt(@NotNull java.lang.String str, final TxInsBean txInsBean) {
        Intrinsics.checkNotNullParameter(str, "");
        final java.lang.String strAEQbTJ = ((C11990ceW) this.EZpvd.QKudOq()).AEQbTJ();
        final java.lang.String feeRate$default = C11990ceW.getFeeRate$default((C11990ceW) this.EZpvd.QKudOq(), 0, 1, null);
        java.util.ArrayList<UTXOTxIn> txIns = txInsBean != null ? txInsBean.getTxIns() : null;
        final java.util.List listAhwBna = txIns == null ? yDY.AhwBna() : txIns;
        final long jQKVWgx = this.EZpvd.fHqPtx().QKVWgx();
        final java.lang.String publicKey = this.EZpvd.fERRXa().getPublicKey();
        return C10965byR.OLrzqt.AEQbTJ(str, this.EZpvd.dUDNAs(), this.EZpvd.dHguZz(), new Function0() { // from class: o.che
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C12159chg.EZpvd(jQKVWgx, this, txInsBean);
            }
        }, new Function1() { // from class: o.chi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C12159chg.EZpvd((TxMessage) obj));
            }
        }, new Function1() { // from class: o.chf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12159chg.copydefault((TxMessage) obj);
            }
        }, new Function1() { // from class: o.chh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12159chg.AYXKKw((TxMessage) obj);
            }
        }, new Function2() { // from class: o.chk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12159chg.copydefault(jQKVWgx, this, publicKey, listAhwBna, (java.lang.String) obj, (java.util.List) obj2);
            }
        }, new Function1() { // from class: o.chn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C12159chg.AEQbTJ((java.lang.String) obj));
            }
        }, new Function1() { // from class: o.chm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12159chg.EZpvd(strAEQbTJ, feeRate$default, (java.lang.String) obj);
            }
        });
    }

    public static final TxMessage EZpvd(long j, C12159chg c12159chg, TxInsBean txInsBean) {
        C54904xZq c54904xZq = C54904xZq.copydefault;
        ChainAddress chainAddressRcXXUw = c12159chg.EZpvd.RcXXUw();
        return c54904xZq.AEQbTJ(j, null, chainAddressRcXXUw != null ? chainAddressRcXXUw.getAddressType() : AddressType.Legacy.getValue(), c12159chg.EZpvd(txInsBean));
    }

    public static final boolean EZpvd(TxMessage txMessage) {
        Intrinsics.checkNotNullParameter(txMessage, "");
        return txMessage.isValid();
    }

    public static final java.lang.String copydefault(TxMessage txMessage) {
        Intrinsics.checkNotNullParameter(txMessage, "");
        return txMessage.getMessage();
    }

    public static final java.lang.String AYXKKw(TxMessage txMessage) {
        Intrinsics.checkNotNullParameter(txMessage, "");
        return txMessage.getTx();
    }

    public static final java.lang.String copydefault(long j, C12159chg c12159chg, java.lang.String str, java.util.List list, java.lang.String str2, java.util.List list2) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        C54904xZq c54904xZq = C54904xZq.copydefault;
        ChainAddress chainAddressRcXXUw = c12159chg.EZpvd.RcXXUw();
        return c54904xZq.OLrzqt(j, chainAddressRcXXUw != null ? chainAddressRcXXUw.getAddressType() : AddressType.Legacy.getValue(), new BTCSignatureRawValue(str2, str, C12800ctn.copydefault(list2, list)));
    }

    public static final boolean AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !(str.length() == 0);
    }

    public static final XRC20TransactionResult EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        return new XRC20TransactionResult((java.lang.String) null, (XRC20TransactionResultErrData) null, (java.lang.String) null, str3, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, str, (java.lang.String) null, (java.util.List) null, str2, (java.lang.String) null, 2935, (DefaultConstructorMarker) null);
    }
}
