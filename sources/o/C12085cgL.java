package o;

import com.google.gson.Gson;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOSignData;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.TxInsBean;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.WalletAddressItem;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UTXONftInfo;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.utxo.BRC20Buyer;
import com.okinc.wallet.core.sign.utxo.BRC20SellerData;
import com.okinc.wallet.core.sign.utxo.BuyerSignedTx;
import com.okinc.wallet.core.sign.utxo.DummyInfo;
import com.okinc.wallet.core.sign.utxo.DummySignedTx;
import com.okinc.wallet.core.sign.utxo.MPCBRC20PsbtResult;
import com.okinc.wallet.core.sign.utxo.NftInfo;
import com.okinc.wallet.core.sign.utxo.RSV;
import com.okinc.wallet.core.sign.utxo.UTXOTransaction;
import com.okinc.wallet.core.sign.utxo.UTXOTxIn;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResultErrData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cgL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12085cgL extends AbstractC12442cmy {
    public final C12117cgr KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final DummySignedTx djBIcL(DummySignedTx dummySignedTx) {
        Intrinsics.checkNotNullParameter(dummySignedTx, "");
        return dummySignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String gEmmrt(DummySignedTx dummySignedTx) {
        Intrinsics.checkNotNullParameter(dummySignedTx, "");
        return "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12085cgL(@NotNull C12117cgr c12117cgr) {
        super(c12117cgr);
        Intrinsics.checkNotNullParameter(c12117cgr, "");
        this.KWHzl = c12117cgr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Fee */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final XRC20TransactionResult KWHzl(java.lang.String str, java.lang.String str2, TxInsBean txInsBean) {
        DummySignedTx dummySignedTx;
        java.util.List<UTXOTxIn> list;
        java.util.ArrayList<UTXOTxIn> out;
        java.lang.String feeRate$default = C11990ceW.getFeeRate$default((C11990ceW) this.KWHzl.QKudOq(), 0, 1, null);
        java.util.List<UTXOTxIn> txIns = txInsBean != null ? txInsBean.getTxIns() : null;
        if (txIns == null) {
            txIns = yDY.AhwBna();
        }
        java.util.List<UTXOTxIn> list2 = txIns;
        if (this.KWHzl.TarCU()) {
            dummySignedTx = null;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list2) {
                if (Intrinsics.EZpvd(((UTXOTxIn) obj).getIsDummy(), java.lang.Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            Fee feeQKudOq = this.KWHzl.QKudOq();
            Intrinsics.copydefault(feeQKudOq, "");
            java.lang.String strEjfBZ = ((C12088cgO) feeQKudOq).ejfBZ();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                UTXOTxIn uTXOTxIn = (UTXOTxIn) obj2;
                java.lang.Boolean isDummy = uTXOTxIn.getIsDummy();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (!Intrinsics.EZpvd(isDummy, bool) && !Intrinsics.EZpvd(uTXOTxIn.getIsNFT(), bool)) {
                    arrayList2.add(obj2);
                }
            }
            DummySignedTx dummySignedTxEZpvd = EZpvd(str, str2, strEjfBZ, arrayList2, KWHzl(size));
            java.util.Iterator<T> it = dummySignedTxEZpvd.getOut().iterator();
            while (it.hasNext()) {
                ((UTXOTxIn) it.next()).setRawTransaction(dummySignedTxEZpvd.getRawTransaction());
            }
            dummySignedTx = dummySignedTxEZpvd;
        }
        if (dummySignedTx == null || (out = dummySignedTx.getOut()) == null) {
            list = list2;
        } else {
            java.util.Collection<? extends UTXOTxIn> arrayList3 = new java.util.ArrayList<>();
            for (java.lang.Object obj3 : list2) {
                if (Intrinsics.EZpvd(((UTXOTxIn) obj3).getIsDummy(), java.lang.Boolean.TRUE)) {
                    arrayList3.add(obj3);
                }
            }
            out.addAll(arrayList3);
            java.util.Collection<? extends UTXOTxIn> arrayList4 = new java.util.ArrayList<>();
            for (java.lang.Object obj4 : list2) {
                if (Intrinsics.EZpvd(((UTXOTxIn) obj4).getIsNFT(), java.lang.Boolean.TRUE)) {
                    arrayList4.add(obj4);
                }
            }
            out.addAll(arrayList4);
            Unit unit = Unit.INSTANCE;
            list = out;
        }
        return new XRC20TransactionResult((java.lang.String) null, (XRC20TransactionResultErrData) null, (java.lang.String) null, OLrzqt(str, str2, list, false, feeRate$default).getTx(), dummySignedTx != null ? dummySignedTx.getRawTransaction() : null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, feeRate$default, (java.lang.String) null, 3047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final XRC20TransactionResult KWHzl(java.util.List<UTXOInfoResp> list, java.util.List<UTXOInfoResp> list2) {
        java.lang.String strConvertToString$default;
        java.util.List<UTXOTxIn> list3;
        java.util.ArrayList<UTXOTxIn> out;
        java.lang.Integer numValueOf;
        java.util.ArrayList arrayList;
        UTXOInfoResp uTXOInfoResp;
        java.util.List<UtxoInfo> utxoList;
        UTXOInfoResp uTXOInfoResp2;
        UTXOInfoResp uTXOInfoResp3;
        UTXOInfoResp uTXOInfoResp4;
        java.util.List<UtxoInfo> utxoList2;
        DummySignedTx dummySignedTxEZpvd = null;
        java.lang.String feeRate$default = C11990ceW.getFeeRate$default((C11990ceW) this.KWHzl.QKudOq(), 0, 1, null);
        TxInsBean txInsBeanAEQbTJ = AEQbTJ(this.KWHzl.copydefault(list, list2));
        java.util.List<UTXOTxIn> txIns = txInsBeanAEQbTJ != null ? txInsBeanAEQbTJ.getTxIns() : null;
        if (txIns == null) {
            txIns = yDY.AhwBna();
        }
        java.util.List<UTXOTxIn> list4 = txIns;
        if (this.KWHzl.TarCU()) {
            strConvertToString$default = "";
        } else {
            if (list2 == null || (uTXOInfoResp4 = (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(list2)) == null || (utxoList2 = uTXOInfoResp4.getUtxoList()) == null) {
                numValueOf = null;
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : utxoList2) {
                    if (Intrinsics.EZpvd(((UtxoInfo) obj).getDummy(), java.lang.Boolean.TRUE)) {
                        arrayList2.add(obj);
                    }
                }
                numValueOf = java.lang.Integer.valueOf(arrayList2.size());
            }
            int iCopydefault = C11600cUg.copydefault(numValueOf);
            C54904xZq c54904xZq = C54904xZq.copydefault;
            SignParams signParamsGenerateSignParams$default = AbstractC12442cmy.generateSignParams$default(this, null, null, false, 6, null);
            C12117cgr c12117cgr = this.KWHzl;
            java.lang.String address = (list2 == null || (uTXOInfoResp3 = (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(list2)) == null) ? null : uTXOInfoResp3.getAddress();
            java.lang.String canTransferAmount = (list2 == null || (uTXOInfoResp2 = (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(list2)) == null) ? null : uTXOInfoResp2.getCanTransferAmount();
            if (list2 == null || (uTXOInfoResp = (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(list2)) == null || (utxoList = uTXOInfoResp.getUtxoList()) == null) {
                arrayList = null;
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj2 : utxoList) {
                    if (!Intrinsics.EZpvd(((UtxoInfo) obj2).getDummy(), java.lang.Boolean.TRUE)) {
                        arrayList3.add(obj2);
                    }
                }
                arrayList = arrayList3;
            }
            TxInsBean txInsBeanAEQbTJ2 = AEQbTJ(c12117cgr.copydefault((java.util.List<UTXOInfoResp>) null, C56402yEa.EZpvd(new UTXOInfoResp(address, canTransferAmount, arrayList, (java.lang.String) null, (java.lang.Integer) null, 24, (DefaultConstructorMarker) null))));
            java.util.List<UTXOTxIn> txIns2 = txInsBeanAEQbTJ2 != null ? txInsBeanAEQbTJ2.getTxIns() : null;
            if (txIns2 == null) {
                txIns2 = yDY.AhwBna();
            }
            strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.OLrzqt(java.lang.Integer.valueOf(c54904xZq.KWHzl(signParamsGenerateSignParams$default, copydefault(txIns2, KWHzl(iCopydefault))).getLength()), feeRate$default), false, null, null, 7, null);
            java.lang.String strAhwBna = AhwBna();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj3 : list4) {
                UTXOTxIn uTXOTxIn = (UTXOTxIn) obj3;
                java.lang.Boolean isDummy = uTXOTxIn.getIsDummy();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (!Intrinsics.EZpvd(isDummy, bool) && !Intrinsics.EZpvd(uTXOTxIn.getIsNFT(), bool)) {
                    arrayList4.add(obj3);
                }
            }
            dummySignedTxEZpvd = EZpvd((java.lang.String) null, strAhwBna, strConvertToString$default, arrayList4, KWHzl(iCopydefault));
            java.util.Iterator<T> it = dummySignedTxEZpvd.getOut().iterator();
            while (it.hasNext()) {
                ((UTXOTxIn) it.next()).setRawTransaction(dummySignedTxEZpvd.getRawTransaction());
            }
        }
        java.lang.String strAhwBna2 = AhwBna();
        if (dummySignedTxEZpvd == null || (out = dummySignedTxEZpvd.getOut()) == null) {
            list3 = list4;
        } else {
            java.util.Collection<? extends UTXOTxIn> arrayList5 = new java.util.ArrayList<>();
            for (java.lang.Object obj4 : list4) {
                if (Intrinsics.EZpvd(((UTXOTxIn) obj4).getIsDummy(), java.lang.Boolean.TRUE)) {
                    arrayList5.add(obj4);
                }
            }
            out.addAll(arrayList5);
            java.util.Collection<? extends UTXOTxIn> arrayList6 = new java.util.ArrayList<>();
            for (java.lang.Object obj5 : list4) {
                if (Intrinsics.EZpvd(((UTXOTxIn) obj5).getIsNFT(), java.lang.Boolean.TRUE)) {
                    arrayList6.add(obj5);
                }
            }
            out.addAll(arrayList6);
            Unit unit = Unit.INSTANCE;
            list3 = out;
        }
        BuyerSignedTx buyerSignedTxOLrzqt = OLrzqt((java.lang.String) null, strAhwBna2, list3, true, feeRate$default);
        return new XRC20TransactionResult((java.lang.String) null, (XRC20TransactionResultErrData) null, (java.lang.String) null, buyerSignedTxOLrzqt.getTx(), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, C54862xYb.convertToString$default(C54862xYb.KWHzl(strConvertToString$default, buyerSignedTxOLrzqt.getFee()), false, null, null, 7, null), strConvertToString$default, (java.util.List) null, feeRate$default, (java.lang.String) null, 2679, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final BuyerSignedTx OLrzqt(java.lang.String str, java.lang.String str2, java.util.List<UTXOTxIn> list, boolean z, java.lang.String str3) {
        java.lang.String strZLjUOn;
        java.lang.String strFJNWhG;
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.String address;
        java.lang.Integer addressIndex;
        java.lang.Integer addressType;
        if (z) {
            strZLjUOn = this.KWHzl.zLjUOn();
            long jFetchVPNInfo = this.KWHzl.dHguZz().fetchVPNInfo();
            C13847daM c13847daM = new C13847daM(jFetchVPNInfo);
            if (str2 == null) {
                return new BuyerSignedTx((java.lang.String) null, (java.lang.String) null, 3, (DefaultConstructorMarker) null);
            }
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                UTXOTxIn uTXOTxIn = (UTXOTxIn) next;
                java.lang.Boolean isDummy = uTXOTxIn.getIsDummy();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (Intrinsics.EZpvd(isDummy, bool) && !Intrinsics.EZpvd(uTXOTxIn.getIsNFT(), bool)) {
                    break;
                }
            }
            UTXOTxIn uTXOTxIn2 = (UTXOTxIn) next;
            int iKWHzl = (uTXOTxIn2 == null || (addressType = uTXOTxIn2.getAddressType()) == null) ? C8322bAY.KWHzl.KWHzl(jFetchVPNInfo, strZLjUOn) : addressType.intValue();
            java.util.Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                UTXOTxIn uTXOTxIn3 = (UTXOTxIn) next2;
                java.lang.Boolean isDummy2 = uTXOTxIn3.getIsDummy();
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                if (Intrinsics.EZpvd(isDummy2, bool2) && !Intrinsics.EZpvd(uTXOTxIn3.getIsNFT(), bool2)) {
                    break;
                }
            }
            UTXOTxIn uTXOTxIn4 = (UTXOTxIn) next2;
            WalletAddressItem walletAddressItemEZpvd = c13847daM.EZpvd(str2, (uTXOTxIn4 == null || (addressIndex = uTXOTxIn4.getAddressIndex()) == null) ? 0 : addressIndex.intValue(), iKWHzl);
            if (walletAddressItemEZpvd != null && (address = walletAddressItemEZpvd.getAddress()) != null) {
                strZLjUOn = address;
            }
        } else {
            strZLjUOn = this.KWHzl.zLjUOn();
        }
        java.util.Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            ((UTXOTxIn) it3.next()).setSequence(null);
        }
        if (z) {
            strFJNWhG = "";
        } else {
            Fee feeQKudOq = this.KWHzl.QKudOq();
            Intrinsics.copydefault(feeQKudOq, "");
            strFJNWhG = ((C12088cgO) feeQKudOq).fJNWhG();
        }
        java.lang.String str4 = z ? str3 : "";
        java.lang.String amount = copydefault().getAmount();
        UTXOSignInfo uTXOSignInfoUeEOUB = this.KWHzl.UeEOUB();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        UTXOSignInfo uTXOSignInfoUeEOUB2 = this.KWHzl.UeEOUB();
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(uTXOSignInfoUeEOUB2 != null ? uTXOSignInfoUeEOUB2.getInscriptionOutput() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.util.List<FixedUTXOInfo> listUhxbNG = this.KWHzl.UhxbNG();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listUhxbNG, 10));
        for (FixedUTXOInfo fixedUTXOInfo : listUhxbNG) {
            arrayList.add(new BRC20SellerData(fixedUTXOInfo.getNftPrice(), fixedUTXOInfo.getSignData()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            UTXOTxIn uTXOTxIn5 = (UTXOTxIn) obj;
            java.lang.Boolean isDummy3 = uTXOTxIn5.getIsDummy();
            java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(isDummy3, bool3) && !Intrinsics.EZpvd(uTXOTxIn5.getIsNFT(), bool3)) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj2 : arrayList2) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i), copydefault().getCount())) {
                arrayList3.add(obj2);
            }
            i++;
        }
        java.util.Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ((UTXOTxIn) it4.next()).setAddress(strZLjUOn);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            UTXOTxIn uTXOTxIn6 = (UTXOTxIn) obj3;
            java.lang.Boolean isDummy4 = uTXOTxIn6.getIsDummy();
            java.lang.Boolean bool4 = java.lang.Boolean.TRUE;
            if (!Intrinsics.EZpvd(isDummy4, bool4) && !Intrinsics.EZpvd(uTXOTxIn6.getIsNFT(), bool4)) {
                arrayList4.add(obj3);
            }
        }
        java.util.Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            ((UTXOTxIn) it5.next()).setAddress(strZLjUOn);
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj4 : list) {
            if (Intrinsics.EZpvd(((UTXOTxIn) obj4).getIsNFT(), java.lang.Boolean.TRUE)) {
                arrayList5.add(obj4);
            }
        }
        try {
            java.lang.Object objFromJson = new Gson().fromJson(C54904xZq.copydefault.copydefault(AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null), new BRC20Buyer(strFJNWhG, str4, amount, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, arrayList, strZLjUOn, strZLjUOn, strZLjUOn, arrayList3, arrayList4, arrayList5, (java.util.List) null, (java.lang.String) null, (java.lang.Integer) null, 28672, (DefaultConstructorMarker) null)), (java.lang.Class<java.lang.Object>) BuyerSignedTx.class);
            Intrinsics.copydefault(objFromJson);
            return (BuyerSignedTx) objFromJson;
        } catch (java.lang.Exception unused) {
            return new BuyerSignedTx((java.lang.String) null, (java.lang.String) null, 3, (DefaultConstructorMarker) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Fee */
    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.wallet.core.sign.utxo.XRC20TransactionResult>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58185ywX<ResponseData<XRC20TransactionResult>> EZpvd(@NotNull final java.lang.String str, TxInsBean txInsBean) {
        AbstractC58185ywX<ResponseData<DummySignedTx>> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        final java.lang.String feeRate$default = C11990ceW.getFeeRate$default((C11990ceW) this.KWHzl.QKudOq(), 0, 1, null);
        final java.util.List txIns = txInsBean != null ? txInsBean.getTxIns() : null;
        if (txIns == null) {
            txIns = yDY.AhwBna();
        }
        if (this.KWHzl.TarCU()) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, null, null, 62, null));
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : txIns) {
                if (Intrinsics.EZpvd(((UTXOTxIn) obj).getIsDummy(), java.lang.Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : txIns) {
                UTXOTxIn uTXOTxIn = (UTXOTxIn) obj2;
                java.lang.Boolean isDummy = uTXOTxIn.getIsDummy();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (!Intrinsics.EZpvd(isDummy, bool) && !Intrinsics.EZpvd(uTXOTxIn.getIsNFT(), bool)) {
                    arrayList2.add(obj2);
                }
            }
            abstractC58185ywXKWHzl = EZpvd(str, arrayList2, KWHzl(size));
        }
        final Function1 function1 = new Function1() { // from class: o.cgK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return C12085cgL.EZpvd(this.copydefault, str, txIns, feeRate$default, (ResponseData) obj3);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cgS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj3) {
                return C12085cgL.copydefault(function1, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.cgL */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC60096zvd EZpvd(C12085cgL c12085cgL, java.lang.String str, java.util.List list, java.lang.String str2, ResponseData responseData) {
        java.util.ArrayList<UTXOTxIn> out;
        java.util.ArrayList<UTXOTxIn> out2;
        Intrinsics.checkNotNullParameter(responseData, "");
        DummySignedTx dummySignedTx = (DummySignedTx) responseData.getData();
        if (dummySignedTx != null && (out2 = dummySignedTx.getOut()) != null) {
            java.util.Iterator<T> it = out2.iterator();
            while (it.hasNext()) {
                ((UTXOTxIn) it.next()).setRawTransaction(dummySignedTx.getRawTransaction());
            }
        }
        if (dummySignedTx != null && (out = dummySignedTx.getOut()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (Intrinsics.EZpvd(((UTXOTxIn) obj).getIsDummy(), java.lang.Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
            out.addAll(arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (Intrinsics.EZpvd(((UTXOTxIn) obj2).getIsNFT(), java.lang.Boolean.TRUE)) {
                    arrayList2.add(obj2);
                }
            }
            out.addAll(arrayList2);
            Unit unit = Unit.INSTANCE;
            list = out;
        }
        return c12085cgL.OLrzqt(str, list, dummySignedTx, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58185ywX<ResponseData<XRC20TransactionResult>> OLrzqt(java.lang.String str, java.util.List<UTXOTxIn> list, final DummySignedTx dummySignedTx, final java.lang.String str2) {
        final SignParams signParamsGenerateSignParams$default = AbstractC12442cmy.generateSignParams$default(this, null, null, false, 6, null);
        java.lang.String strZLjUOn = this.KWHzl.zLjUOn();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((UTXOTxIn) it.next()).setSequence(null);
        }
        Fee feeQKudOq = this.KWHzl.QKudOq();
        Intrinsics.copydefault(feeQKudOq, "");
        java.lang.String strFJNWhG = ((C12088cgO) feeQKudOq).fJNWhG();
        java.lang.String amount = copydefault().getAmount();
        UTXOSignInfo uTXOSignInfoUeEOUB = this.KWHzl.UeEOUB();
        int i = 0;
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        UTXOSignInfo uTXOSignInfoUeEOUB2 = this.KWHzl.UeEOUB();
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(uTXOSignInfoUeEOUB2 != null ? uTXOSignInfoUeEOUB2.getInscriptionOutput() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.util.List<FixedUTXOInfo> listUhxbNG = this.KWHzl.UhxbNG();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listUhxbNG, 10));
        for (FixedUTXOInfo fixedUTXOInfo : listUhxbNG) {
            arrayList.add(new BRC20SellerData(fixedUTXOInfo.getNftPrice(), fixedUTXOInfo.getSignData()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            UTXOTxIn uTXOTxIn = (UTXOTxIn) obj;
            java.lang.Boolean isDummy = uTXOTxIn.getIsDummy();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(isDummy, bool) && !Intrinsics.EZpvd(uTXOTxIn.getIsNFT(), bool)) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList<UTXOTxIn> arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList2) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i), copydefault().getCount())) {
                arrayList3.add(obj2);
            }
            i++;
        }
        for (UTXOTxIn uTXOTxIn2 : arrayList3) {
            uTXOTxIn2.setAddress(strZLjUOn);
            ChainAddress chainAddressAddressFromAddress$default = AbstractC12782ctV.addressFromAddress$default(this.KWHzl.dUDNAs(), strZLjUOn, null, 2, null);
            uTXOTxIn2.setPublicKey(chainAddressAddressFromAddress$default != null ? chainAddressAddressFromAddress$default.getPublicKey() : null);
        }
        java.util.ArrayList<UTXOTxIn> arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            UTXOTxIn uTXOTxIn3 = (UTXOTxIn) obj3;
            java.lang.Boolean isDummy2 = uTXOTxIn3.getIsDummy();
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            if (!Intrinsics.EZpvd(isDummy2, bool2) && !Intrinsics.EZpvd(uTXOTxIn3.getIsNFT(), bool2)) {
                arrayList4.add(obj3);
            }
        }
        for (UTXOTxIn uTXOTxIn4 : arrayList4) {
            uTXOTxIn4.setAddress(strZLjUOn);
            ChainAddress chainAddressAddressFromAddress$default2 = AbstractC12782ctV.addressFromAddress$default(this.KWHzl.dUDNAs(), strZLjUOn, null, 2, null);
            uTXOTxIn4.setPublicKey(chainAddressAddressFromAddress$default2 != null ? chainAddressAddressFromAddress$default2.getPublicKey() : null);
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj4 : list) {
            if (Intrinsics.EZpvd(((UTXOTxIn) obj4).getIsNFT(), java.lang.Boolean.TRUE)) {
                arrayList5.add(obj4);
            }
        }
        final BRC20Buyer bRC20Buyer = new BRC20Buyer(strFJNWhG, "", amount, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, arrayList, strZLjUOn, strZLjUOn, strZLjUOn, arrayList3, arrayList4, arrayList5, (java.util.List) null, (java.lang.String) null, (java.lang.Integer) null, 28672, (DefaultConstructorMarker) null);
        return C10965byR.OLrzqt.AEQbTJ(str, this.KWHzl.dUDNAs(), this.KWHzl.dHguZz(), new Function0() { // from class: o.chc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C12085cgL.AEQbTJ(signParamsGenerateSignParams$default, bRC20Buyer);
            }
        }, new Function1() { // from class: o.cgR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj5) {
                return java.lang.Boolean.valueOf(C12085cgL.EZpvd((MPCBRC20PsbtResult) obj5));
            }
        }, new Function1() { // from class: o.cgQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj5) {
                return C12085cgL.djBIcL((MPCBRC20PsbtResult) obj5);
            }
        }, new Function1() { // from class: o.cgP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj5) {
                return C12085cgL.AhwBna((MPCBRC20PsbtResult) obj5);
            }
        }, new Function2() { // from class: o.cgT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                return C12085cgL.EZpvd(signParamsGenerateSignParams$default, bRC20Buyer, this, (java.lang.String) obj5, (java.util.List) obj6);
            }
        }, new Function1() { // from class: o.cgY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj5) {
                return java.lang.Boolean.valueOf(C12085cgL.AYXKKw((MPCBRC20PsbtResult) obj5));
            }
        }, new Function1() { // from class: o.cgV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj5) {
                return C12085cgL.copydefault(dummySignedTx, str2, (MPCBRC20PsbtResult) obj5);
            }
        });
    }

    public static final MPCBRC20PsbtResult AEQbTJ(SignParams signParams, BRC20Buyer bRC20Buyer) {
        return C54904xZq.copydefault.KWHzl(signParams, bRC20Buyer);
    }

    public static final boolean EZpvd(MPCBRC20PsbtResult mPCBRC20PsbtResult) {
        Intrinsics.checkNotNullParameter(mPCBRC20PsbtResult, "");
        return C33129mqd.KWHzl((java.util.Collection) mPCBRC20PsbtResult.getSignHashList()) && C33129mqd.OLrzqt((java.lang.CharSequence) mPCBRC20PsbtResult.getPsbtTx());
    }

    public static final java.lang.String djBIcL(MPCBRC20PsbtResult mPCBRC20PsbtResult) {
        Intrinsics.checkNotNullParameter(mPCBRC20PsbtResult, "");
        KSerializer kSerializerListSerializer = BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(C56529yIt.KWHzl));
        java.util.List<java.lang.String> signHashList = mPCBRC20PsbtResult.getSignHashList();
        if (signHashList == null) {
            signHashList = yDY.AhwBna();
        }
        return C54907xZt.encodeToString$default(kSerializerListSerializer, signHashList, false, 2, null);
    }

    public static final java.lang.String AhwBna(MPCBRC20PsbtResult mPCBRC20PsbtResult) {
        Intrinsics.checkNotNullParameter(mPCBRC20PsbtResult, "");
        java.lang.String psbtTx = mPCBRC20PsbtResult.getPsbtTx();
        return psbtTx == null ? "" : psbtTx;
    }

    public static final boolean AYXKKw(MPCBRC20PsbtResult mPCBRC20PsbtResult) {
        Intrinsics.checkNotNullParameter(mPCBRC20PsbtResult, "");
        return C33129mqd.OLrzqt((java.lang.CharSequence) mPCBRC20PsbtResult.getPsbtTx());
    }

    public static final XRC20TransactionResult copydefault(DummySignedTx dummySignedTx, java.lang.String str, MPCBRC20PsbtResult mPCBRC20PsbtResult) {
        Intrinsics.checkNotNullParameter(mPCBRC20PsbtResult, "");
        return new XRC20TransactionResult((java.lang.String) null, (XRC20TransactionResultErrData) null, (java.lang.String) null, mPCBRC20PsbtResult.getPsbtTx(), dummySignedTx != null ? dummySignedTx.getRawTransaction() : null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, str, (java.lang.String) null, 3047, (DefaultConstructorMarker) null);
    }

    public final AbstractC58185ywX<ResponseData<DummySignedTx>> EZpvd(java.lang.String str, java.util.List<UTXOTxIn> list, DummyInfo dummyInfo) {
        final SignParams signParamsGenerateSignParams$default = AbstractC12442cmy.generateSignParams$default(this, null, null, false, 6, null);
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((UTXOTxIn) it.next()).setSequence(null);
        }
        final UTXOTransaction uTXOTransactionCopydefault = copydefault(list, dummyInfo);
        return C10965byR.OLrzqt.AEQbTJ(str, this.KWHzl.dUDNAs(), this.KWHzl.dHguZz(), new Function0() { // from class: o.cgX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C12085cgL.AEQbTJ(signParamsGenerateSignParams$default, uTXOTransactionCopydefault);
            }
        }, new Function1() { // from class: o.cgU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C12085cgL.valueOf((DummySignedTx) obj));
            }
        }, new Function1() { // from class: o.cgW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12085cgL.AYXKKw((DummySignedTx) obj);
            }
        }, new Function1() { // from class: o.chb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12085cgL.gEmmrt((DummySignedTx) obj);
            }
        }, new Function2() { // from class: o.chd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12085cgL.copydefault(signParamsGenerateSignParams$default, uTXOTransactionCopydefault, this, (java.lang.String) obj, (java.util.List) obj2);
            }
        }, new Function1() { // from class: o.cgZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C12085cgL.AhwBna((DummySignedTx) obj));
            }
        }, new Function1() { // from class: o.cha
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12085cgL.djBIcL((DummySignedTx) obj);
            }
        });
    }

    public static final DummySignedTx AEQbTJ(SignParams signParams, UTXOTransaction uTXOTransaction) {
        return C54904xZq.copydefault.AEQbTJ(signParams, uTXOTransaction);
    }

    public static final boolean valueOf(DummySignedTx dummySignedTx) {
        Intrinsics.checkNotNullParameter(dummySignedTx, "");
        return C33129mqd.KWHzl((java.util.Collection) dummySignedTx.getSignHashList());
    }

    public static final java.lang.String AYXKKw(DummySignedTx dummySignedTx) {
        Intrinsics.checkNotNullParameter(dummySignedTx, "");
        KSerializer kSerializerListSerializer = BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(C56529yIt.KWHzl));
        java.util.List<java.lang.String> signHashList = dummySignedTx.getSignHashList();
        if (signHashList == null) {
            signHashList = yDY.AhwBna();
        }
        return C54907xZt.encodeToString$default(kSerializerListSerializer, signHashList, false, 2, null);
    }

    public static final boolean AhwBna(DummySignedTx dummySignedTx) {
        Intrinsics.checkNotNullParameter(dummySignedTx, "");
        return C33129mqd.OLrzqt((java.lang.CharSequence) dummySignedTx.getRawTransaction());
    }

    public final TxInsBean AEQbTJ(java.util.List<UTXOInfoResp> list) {
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
                C12797ctk c12797ctkAKErDB = this.KWHzl.aKErDB();
                AbstractC12782ctV abstractC12782ctVDUDNAs = this.KWHzl.dUDNAs();
                C10854bwM c10854bwMFHqPtx = this.KWHzl.fHqPtx();
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
                        java.lang.String strKWHzl = this.KWHzl.aKErDB().KWHzl();
                        java.lang.String rawTransaction = utxoInfo.getRawTransaction();
                        java.lang.String address2 = uTXOInfoResp2.getAddress();
                        C12797ctk c12797ctkAKErDB2 = this.KWHzl.aKErDB();
                        AbstractC12782ctV abstractC12782ctVDUDNAs2 = this.KWHzl.dUDNAs();
                        C10854bwM c10854bwMFHqPtx2 = this.KWHzl.fHqPtx();
                        java.lang.String address3 = uTXOInfoResp2.getAddress();
                        int iEZpvd = c12797ctkAKErDB2.EZpvd(abstractC12782ctVDUDNAs2, c10854bwMFHqPtx2, address3 == null ? "" : address3);
                        int iFinit = this.KWHzl.dUDNAs().finit();
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
                        AbstractC12784ctX abstractC12784ctXGwTjWJ = this.KWHzl.dUDNAs().gwTjWJ();
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

    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final UTXOTransaction copydefault(java.util.List<UTXOTxIn> list, DummyInfo dummyInfo) {
        C13854daT c13854daTFetchVPNInfo;
        java.lang.String derivePath;
        java.lang.String publicKey;
        ChainAddress chainAddressRcXXUw = this.KWHzl.RcXXUw();
        java.lang.String strKWHzl = this.KWHzl.aKErDB().KWHzl(list);
        UTXOSignInfo uTXOSignInfoUeEOUB = this.KWHzl.UeEOUB();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        UTXOSignInfo uTXOSignInfoUeEOUB2 = this.KWHzl.UeEOUB();
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(uTXOSignInfoUeEOUB2 != null ? uTXOSignInfoUeEOUB2.getInscriptionOutput() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strHtlTjW = this.KWHzl.htlTjW();
        java.lang.String strZLjUOn = this.KWHzl.zLjUOn();
        Fee feeQKudOq = this.KWHzl.QKudOq();
        Intrinsics.copydefault(feeQKudOq, "");
        java.lang.String strEjfBZ = ((C12088cgO) feeQKudOq).ejfBZ();
        java.lang.String address = chainAddressRcXXUw != null ? chainAddressRcXXUw.getAddress() : null;
        java.lang.String str = (chainAddressRcXXUw == null || (publicKey = chainAddressRcXXUw.getPublicKey()) == null) ? "" : publicKey;
        java.lang.String str2 = (chainAddressRcXXUw == null || (derivePath = chainAddressRcXXUw.getDerivePath()) == null) ? "" : derivePath;
        AbstractC12784ctX abstractC12784ctXGwTjWJ = this.KWHzl.dUDNAs().gwTjWJ();
        return new UTXOTransaction(strKWHzl, strConvertToBigIntegerString$default, strHtlTjW, strZLjUOn, "0", strEjfBZ, list, str, address, str2, (abstractC12784ctXGwTjWJ == null || (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ.fetchVPNInfo()) == null) ? null : c13854daTFetchVPNInfo.copydefault(), dummyInfo, strConvertToBigIntegerString$default2, chainAddressRcXXUw != null ? java.lang.Integer.valueOf(chainAddressRcXXUw.getAddressType()) : null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.lang.String) null, (java.lang.Integer) null, 491520, (DefaultConstructorMarker) null);
    }

    public final DummyInfo KWHzl(int i) {
        java.lang.String dummyOutput;
        java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.AEQbTJ(copydefault().getCount(), java.lang.Integer.valueOf(i)), false, null, null, 7, null);
        UTXOSignInfo uTXOSignInfoUeEOUB = this.KWHzl.UeEOUB();
        if (uTXOSignInfoUeEOUB == null || (dummyOutput = uTXOSignInfoUeEOUB.getDummyOutput()) == null) {
            dummyOutput = MultiTransferSignData.MAX_INTERVAL;
        }
        if (!C33129mqd.copydefault((java.lang.Object) strConvertToString$default, (java.lang.Object) 0)) {
            strConvertToString$default = "0";
        }
        return new DummyInfo(dummyOutput, strConvertToString$default);
    }

    public final DummyInfo copydefault() {
        java.lang.String dummyOutput;
        UTXOSignInfo uTXOSignInfoUeEOUB = this.KWHzl.UeEOUB();
        if (uTXOSignInfoUeEOUB == null || (dummyOutput = uTXOSignInfoUeEOUB.getDummyOutput()) == null) {
            dummyOutput = MultiTransferSignData.MAX_INTERVAL;
        }
        return new DummyInfo(dummyOutput, C54862xYb.convertToString$default(C54862xYb.KWHzl((java.lang.Object) java.lang.Integer.valueOf(this.KWHzl.UhxbNG().size()), (java.lang.Object) 1), false, null, null, 7, null));
    }

    public final DummySignedTx EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<UTXOTxIn> list, DummyInfo dummyInfo) {
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((UTXOTxIn) it.next()).setSequence(null);
        }
        java.lang.String strKWHzl = this.KWHzl.aKErDB().KWHzl(list);
        UTXOSignInfo uTXOSignInfoUeEOUB = this.KWHzl.UeEOUB();
        try {
            java.lang.Object objFromJson = new Gson().fromJson(C54904xZq.copydefault.copydefault(AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null), new UTXOTransaction(strKWHzl, C54862xYb.convertToBigIntegerString$default(uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null, false, (RoundingMode) null, 3, (java.lang.Object) null), this.KWHzl.zLjUOn(), this.KWHzl.zLjUOn(), "0", C54862xYb.convertToBigIntegerString$default(str3, false, (RoundingMode) null, 3, (java.lang.Object) null), list, (java.lang.String) null, this.KWHzl.zLjUOn(), (java.lang.String) null, (java.lang.String) null, dummyInfo, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.lang.String) null, (java.lang.Integer) null, 521856, (DefaultConstructorMarker) null)), (java.lang.Class<java.lang.Object>) DummySignedTx.class);
            Intrinsics.copydefault(objFromJson);
            return (DummySignedTx) objFromJson;
        } catch (java.lang.Exception unused) {
            return new DummySignedTx((java.lang.String) null, (java.util.ArrayList) null, (java.util.List) null, 7, (DefaultConstructorMarker) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final MPCBRC20PsbtResult EZpvd(SignParams signParams, BRC20Buyer bRC20Buyer, C12085cgL c12085cgL, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c12085cgL.KWHzl.aKErDB().KWHzl((RSV) it.next()));
        }
        if (arrayList.isEmpty()) {
            return new MPCBRC20PsbtResult((java.lang.String) null, (java.util.List) null, (java.lang.String) null, 7, (DefaultConstructorMarker) null);
        }
        MPCBRC20PsbtResult mPCBRC20PsbtResultOLrzqt = C54904xZq.copydefault.OLrzqt(signParams, bRC20Buyer.copy((4095 & 1) != 0 ? bRC20Buyer.fee : null, (4095 & 2) != 0 ? bRC20Buyer.feeRate : null, (4095 & 4) != 0 ? bRC20Buyer.dummyOutAmount : null, (4095 & 8) != 0 ? bRC20Buyer.minOutput : null, (4095 & 16) != 0 ? bRC20Buyer.dustLimit : null, (4095 & 32) != 0 ? bRC20Buyer.sellerData : null, (4095 & 64) != 0 ? bRC20Buyer.changeAddress : null, (4095 & 128) != 0 ? bRC20Buyer.dummyOutAddress : null, (4095 & 256) != 0 ? bRC20Buyer.nftReceiverAddress : null, (4095 & 512) != 0 ? bRC20Buyer.dummyTxIn : null, (4095 & 1024) != 0 ? bRC20Buyer.paymentTxIn : null, (4095 & 2048) != 0 ? bRC20Buyer.nftTxIn : null, (4095 & 4096) != 0 ? bRC20Buyer.signatureList : arrayList, (4095 & 8192) != 0 ? bRC20Buyer.psbtTx : str, (4095 & 16384) != 0 ? bRC20Buyer.batchSize : java.lang.Integer.valueOf(((FixedUTXOSignData) c12085cgL.KWHzl.QVsKAR()).getBatchBean().size())));
        return mPCBRC20PsbtResultOLrzqt == null ? new MPCBRC20PsbtResult((java.lang.String) null, (java.util.List) null, (java.lang.String) null, 7, (DefaultConstructorMarker) null) : mPCBRC20PsbtResultOLrzqt;
    }

    public static final DummySignedTx copydefault(SignParams signParams, UTXOTransaction uTXOTransaction, C12085cgL c12085cgL, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c12085cgL.KWHzl.aKErDB().KWHzl((RSV) it.next()));
        }
        if (arrayList.isEmpty()) {
            return new DummySignedTx((java.lang.String) null, (java.util.ArrayList) null, (java.util.List) null, 7, (DefaultConstructorMarker) null);
        }
        DummySignedTx dummySignedTxEZpvd = C54904xZq.copydefault.EZpvd(signParams, uTXOTransaction.copy((458751 & 1) != 0 ? uTXOTransaction.balance : null, (458751 & 2) != 0 ? uTXOTransaction.minOutput : null, (458751 & 4) != 0 ? uTXOTransaction.from : null, (458751 & 8) != 0 ? uTXOTransaction.to : null, (458751 & 16) != 0 ? uTXOTransaction.amount : null, (458751 & 32) != 0 ? uTXOTransaction.fee : null, (458751 & 64) != 0 ? uTXOTransaction.txin : null, (458751 & 128) != 0 ? uTXOTransaction.publicKey : null, (458751 & 256) != 0 ? uTXOTransaction.changeAddress : null, (458751 & 512) != 0 ? uTXOTransaction.derivationPath : null, (458751 & 1024) != 0 ? uTXOTransaction.masterFingerprint : null, (458751 & 2048) != 0 ? uTXOTransaction.dummyInfo : null, (458751 & 4096) != 0 ? uTXOTransaction.dustLimit : null, (458751 & 8192) != 0 ? uTXOTransaction.changeAddressType : null, (458751 & 16384) != 0 ? uTXOTransaction.token : null, (458751 & 32768) != 0 ? uTXOTransaction.isRaise : null, (458751 & 65536) != 0 ? uTXOTransaction.signatureList : arrayList, (458751 & 131072) != 0 ? uTXOTransaction.memo : null, (458751 & 262144) != 0 ? uTXOTransaction.memoPos : null));
        return dummySignedTxEZpvd == null ? new DummySignedTx((java.lang.String) null, (java.util.ArrayList) null, (java.util.List) null, 7, (DefaultConstructorMarker) null) : dummySignedTxEZpvd;
    }
}
