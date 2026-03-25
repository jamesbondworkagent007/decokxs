package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.BTCNFTInfo;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOExtJson;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UTXONftInfo;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.utxo.DummyInfo;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12797ctk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cgr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12117cgr extends AbstractC12074cgA {
    public final InterfaceC56387yDm QfsBiF = C56392yDr.copydefault(new Function0() { // from class: o.cgy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12117cgr.copydefault(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm QUSxYX = C56392yDr.copydefault(new Function0() { // from class: o.cgw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12117cgr.KWHzl(this.OLrzqt);
        }
    });

    public final C12085cgL RKcVTr() {
        return (C12085cgL) this.QfsBiF.getValue();
    }

    public static final C12085cgL copydefault(C12117cgr c12117cgr) {
        return new C12085cgL(c12117cgr);
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    /* JADX DEBUG: Method merged with bridge method: dNCPSb()Lo/ceW; */
    @Override // o.AbstractC11993ceZ
    /* JADX INFO: renamed from: QIZEnU, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C12088cgO DXXBbs() {
        return (C12088cgO) this.QUSxYX.getValue();
    }

    public static final C12088cgO KWHzl(C12117cgr c12117cgr) {
        return new C12088cgO(c12117cgr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8704bHj
    public C10854bwM fHqPtx() {
        if (QXDzTk()) {
            return dHguZz();
        }
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(((FixedUTXOInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(((FixedUTXOSignData) QVsKAR()).getBatchBean())).getCoinId());
        return c10854bwMKWHzl == null ? dHguZz() : c10854bwMKWHzl;
    }

    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> EZpvd(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        java.util.List<FixedUTXOInfo> listUhxbNG = UhxbNG();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listUhxbNG, 10));
        for (FixedUTXOInfo fixedUTXOInfo : listUhxbNG) {
            arrayList.add(new UTXOAddressInfoReq(fixedUTXOInfo.getFrom(), "0", "0", (java.lang.Integer) 2, fixedUTXOInfo.getNftId(), (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) null, fixedUTXOInfo.getProtocolId(), (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 61408, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> AEQbTJ(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        java.lang.String strQUSxYX = QUSxYX();
        java.lang.String strConvertToString$default = refreshUTXOVenue.getUpdateCanTransferAmount() ? "0" : C54862xYb.convertToString$default(C54862xYb.KWHzl(valueOf(UhxbNG()), OTwTPd()), false, null, null, 7, null);
        java.lang.String strQDqgQU = refreshUTXOVenue.getUpdateCanTransferAmount() ? "0" : QDqgQU();
        java.lang.Integer numDvKsVJ = dvKsVJ();
        int iAhwBna = C33129mqd.AhwBna(RKcVTr().copydefault().getCount());
        java.util.List<UTXOInfoResp> listQKVWgx = QKVWgx();
        if (listQKVWgx == null || listQKVWgx.isEmpty()) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = listQKVWgx.iterator();
            while (it.hasNext()) {
                java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                if (utxoList != null) {
                    for (UtxoInfo utxoInfo : utxoList) {
                        arrayList2.add(utxoInfo.getTxHash() + "-" + utxoInfo.getVout());
                    }
                }
            }
            arrayList = arrayList2;
        }
        return C56402yEa.EZpvd(new UTXOAddressInfoReq(strQUSxYX, strConvertToString$default, strQDqgQU, (java.lang.Integer) 13, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) arrayList, java.lang.Integer.valueOf(iAhwBna), (java.lang.Integer) null, numDvKsVJ, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 59888, (DefaultConstructorMarker) null));
    }

    @Override // o.AbstractC12102cgc, o.AbstractC11993ceZ
    public void EZpvd(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue, java.util.List<UTXOInfoResp> list) {
        java.util.List<UTXOInfoResp> listDjBIcL;
        java.util.List<UTXOInfoResp> listAYXKKw;
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        java.util.List<UTXOInfoResp> listQKVWgx = QKVWgx();
        EZpvd((listQKVWgx == null || (listDjBIcL = djBIcL(listQKVWgx)) == null || (listAYXKKw = AYXKKw(listDjBIcL)) == null) ? null : gEmmrt(listAYXKKw));
    }

    @Override // o.AbstractC12074cgA, o.AbstractC11993ceZ, o.AbstractC8664bGw
    public boolean F_() {
        return (!C33129mqd.copydefault(OcIXYQ(), C54862xYb.KWHzl(C54862xYb.KWHzl(QDqgQU(), valueOf(UhxbNG())), OTwTPd())) || flVtFt() || giSNqX() || gasjUx()) ? false : true;
    }

    @Override // o.AbstractC12102cgc
    public XRC20TransactionResult RVsVBY() {
        return RKcVTr().KWHzl(QKVWgx(), djSkpj());
    }

    @Override // o.AbstractC12102cgc
    public XRC20TransactionResult gEmmrt(java.lang.String str, java.lang.String str2) {
        return RKcVTr().KWHzl(str, str2, RKcVTr().AEQbTJ(copydefault(QKVWgx(), djSkpj())));
    }

    public static final InterfaceC60096zvd aUsmxb(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = KWHzl(submitTxExpandBean);
        final Function1 function1 = new Function1() { // from class: o.cgz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12117cgr.AEQbTJ(this.AEQbTJ, str, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cgB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12117cgr.aUsmxb(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd AEQbTJ(final C12117cgr c12117cgr, java.lang.String str, ResponseData responseData) {
        AbstractC58185ywX<ResponseData<XRC20TransactionResult>> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            abstractC58185ywXKWHzl = c12117cgr.RKcVTr().EZpvd(str, c12117cgr.RKcVTr().AEQbTJ(c12117cgr.copydefault(c12117cgr.QKVWgx(), c12117cgr.djSkpj())));
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), null, null, responseData.getErrorMsg(), null, null, 54, null));
        }
        final Function1 function1 = new Function1() { // from class: o.cgv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12117cgr.KWHzl(this.AEQbTJ, (ResponseData) obj);
            }
        };
        return abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cgx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12117cgr.QwvEab(function1, obj);
            }
        });
    }

    public static final ResponseData QwvEab(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData KWHzl(C12117cgr c12117cgr, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return c12117cgr.djBIcL((ResponseData<XRC20TransactionResult>) responseData);
    }

    @Override // o.AbstractC12074cgA, o.AbstractC12102cgc
    public ResponseData<BatchBroadcastModel> djBIcL(@NotNull ResponseData<XRC20TransactionResult> responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<UTXONftInfo> listDaRZkR = DaRZkR();
            XRC20TransactionResult data = responseData.getData();
            java.util.List<java.lang.String> listEZpvd = null;
            listEZpvd = null;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (data != null ? data.getDummyTx() : null))) {
                DummyInfo dummyInfoCopydefault = RKcVTr().copydefault();
                XRC20TransactionResult data2 = responseData.getData();
                java.lang.String dummyTx = data2 != null ? data2.getDummyTx() : null;
                java.lang.String str = dummyTx == null ? "" : dummyTx;
                XRC20TransactionResult data3 = responseData.getData();
                java.lang.String dummyTx2 = data3 != null ? data3.getDummyTx() : null;
                if (dummyTx2 == null) {
                    dummyTx2 = "";
                }
                BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8664bGw.generateBroadcastModel$default(this, str, AhwBna(dummyTx2), null, new UTXOExtJson(1, null, null, null, null, null, null, ExtJson.BRC20TYPE_TRANSFER, null, null, 0, dvKsVJ(), null, 4990, null), 4, null);
                broadcastBeanGenerateBroadcastModel$default.setServiceCharge(C54862xYb.convertToBigIntegerString$default(fJNWhG().ejfBZ(), true, (RoundingMode) null, 2, (java.lang.Object) null));
                broadcastBeanGenerateBroadcastModel$default.setCoinAmount(C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(dummyInfoCopydefault.getAmount(), dummyInfoCopydefault.getCount()), true, (RoundingMode) null, 2, (java.lang.Object) null));
                broadcastBeanGenerateBroadcastModel$default.setFromAdr(QUSxYX());
                XRC20TransactionResult data4 = responseData.getData();
                broadcastBeanGenerateBroadcastModel$default.setFeeRate(data4 != null ? data4.getFeeRate() : null);
                broadcastBeanGenerateBroadcastModel$default.setTxType("64");
                arrayList.add(broadcastBeanGenerateBroadcastModel$default);
            }
            XRC20TransactionResult data5 = responseData.getData();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (data5 != null ? data5.getCommitTx() : null))) {
                XRC20TransactionResult data6 = responseData.getData();
                java.lang.String commitTx = data6 != null ? data6.getCommitTx() : null;
                java.lang.String str2 = commitTx == null ? "" : commitTx;
                XRC20TransactionResult data7 = responseData.getData();
                java.lang.String commitTx2 = data7 != null ? data7.getCommitTx() : null;
                if (commitTx2 == null) {
                    commitTx2 = "";
                }
                java.lang.String strAhwBna = AhwBna(commitTx2);
                java.lang.String strQUSxYX = QUSxYX();
                UTXONftInfo uTXONftInfo = (UTXONftInfo) CollectionsKt___CollectionsKt.firstOrNull(listDaRZkR);
                java.lang.String nftId = uTXONftInfo != null ? uTXONftInfo.getNftId() : null;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listDaRZkR, 10));
                java.util.Iterator<T> it = listDaRZkR.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((UTXONftInfo) it.next()).getNftId());
                }
                UTXONftInfo uTXONftInfo2 = (UTXONftInfo) CollectionsKt___CollectionsKt.firstOrNull(listDaRZkR);
                java.lang.String nftLocation = uTXONftInfo2 != null ? uTXONftInfo2.getNftLocation() : null;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listDaRZkR, 10));
                java.util.Iterator<T> it2 = listDaRZkR.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((UTXONftInfo) it2.next()).getNftLocation());
                }
                java.util.List<FixedUTXOInfo> batchBean = ((FixedUTXOSignData) QVsKAR()).getBatchBean();
                java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(batchBean, 10));
                java.util.Iterator<T> it3 = batchBean.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((FixedUTXOInfo) it3.next()).getInscriptionId());
                }
                BroadcastBean broadcastBeanGenerateBroadcastModel$default2 = AbstractC8664bGw.generateBroadcastModel$default(this, str2, strAhwBna, null, new UTXOExtJson(2, strQUSxYX, nftId, arrayList2, nftLocation, arrayList3, arrayList4, ExtJson.BRC20TYPE_TRANSFER, ExtJson.BRC20TYPE_TRADE, null, 0, dvKsVJ(), null, 4608, null), 4, null);
                broadcastBeanGenerateBroadcastModel$default2.setServiceCharge(C54862xYb.convertToBigIntegerString$default(fJNWhG().fJNWhG(), true, (RoundingMode) null, 2, (java.lang.Object) null));
                broadcastBeanGenerateBroadcastModel$default2.setCoinAmount(C54862xYb.convertToBigIntegerString$default(DNMMPQ(), true, (RoundingMode) null, 2, (java.lang.Object) null));
                broadcastBeanGenerateBroadcastModel$default2.setFromAdr(Ufzxmz());
                XRC20TransactionResult data8 = responseData.getData();
                broadcastBeanGenerateBroadcastModel$default2.setFeeRate(data8 != null ? data8.getFeeRate() : null);
                XRC20TransactionResult data9 = responseData.getData();
                java.lang.String dummyTx3 = data9 != null ? data9.getDummyTx() : null;
                if (dummyTx3 != null && dummyTx3.length() != 0) {
                    XRC20TransactionResult data10 = responseData.getData();
                    java.lang.String dummyTx4 = data10 != null ? data10.getDummyTx() : null;
                    listEZpvd = C56402yEa.EZpvd(AhwBna(dummyTx4 != null ? dummyTx4 : ""));
                }
                broadcastBeanGenerateBroadcastModel$default2.setDependTx(listEZpvd);
                arrayList.add(broadcastBeanGenerateBroadcastModel$default2);
            }
            return new ResponseData<>(-5001, null, null, null, AhwBna(arrayList), null, 46, null);
        }
        return new ResponseData<>(responseData.getCode(), null, null, null, null, responseData.getError_code(), 30, null);
    }

    public final java.util.List<UTXOInfoResp> gEmmrt(java.util.List<UTXOInfoResp> list) {
        UtxoInfo utxoInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (FixedUTXOInfo fixedUTXOInfo : UhxbNG()) {
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                UTXOInfoResp uTXOInfoResp = (UTXOInfoResp) it.next();
                java.util.List<UtxoInfo> utxoList = uTXOInfoResp.getUtxoList();
                if (utxoList != null && (utxoInfo = (UtxoInfo) CollectionsKt___CollectionsKt.firstOrNull(utxoList)) != null && Intrinsics.EZpvd((java.lang.Object) utxoInfo.getTxHash(), (java.lang.Object) fixedUTXOInfo.getUtxoHash()) && Intrinsics.EZpvd((java.lang.Object) utxoInfo.getVout(), (java.lang.Object) fixedUTXOInfo.getUtxoIndex())) {
                    arrayList.add(uTXOInfoResp);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<FixedUTXOInfo> UhxbNG() {
        java.util.List<FixedUTXOInfo> batchBean = ((FixedUTXOSignData) QVsKAR()).getBatchBean();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : batchBean) {
            if (!((FixedUTXOInfo) obj).isUTXODup()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean TarCU() {
        java.lang.Integer numValueOf;
        UTXOInfoResp uTXOInfoResp;
        java.util.List<UtxoInfo> utxoList;
        java.util.List<UTXOInfoResp> listDjSkpj = djSkpj();
        if (listDjSkpj == null || (uTXOInfoResp = (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(listDjSkpj)) == null || (utxoList = uTXOInfoResp.getUtxoList()) == null) {
            numValueOf = null;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : utxoList) {
                if (Intrinsics.EZpvd(((UtxoInfo) obj).getDummy(), java.lang.Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
            numValueOf = java.lang.Integer.valueOf(arrayList.size());
        }
        return C33129mqd.copydefault(numValueOf, RKcVTr().copydefault().getCount());
    }

    public final java.lang.String QDqgQU() {
        DummyInfo dummyInfoCopydefault = RKcVTr().copydefault();
        return C54862xYb.convertToString$default(C54862xYb.KWHzl(fJNWhG().AEQbTJ(), C54862xYb.OLrzqt(dummyInfoCopydefault.getAmount(), dummyInfoCopydefault.getCount())), false, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC12102cgc
    public java.lang.String DNMMPQ() {
        if (QXDzTk()) {
            return C33129mqd.gEmmrt(java.lang.Integer.valueOf(((FixedUTXOSignData) QVsKAR()).getBatchBean().size()));
        }
        FixedUTXOInfo fixedUTXOInfo = (FixedUTXOInfo) CollectionsKt___CollectionsKt.firstOrNull(((FixedUTXOSignData) QVsKAR()).getBatchBean());
        java.lang.String coinAmount = fixedUTXOInfo != null ? fixedUTXOInfo.getCoinAmount() : null;
        return coinAmount == null ? "" : coinAmount;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC12074cgA, o.AbstractC11993ceZ
    public C12797ctk.Application KWHzl(@NotNull ResponseData<java.util.List<UTXOInfoResp>> responseData, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.lang.String strHtlTjW = htlTjW();
        java.util.List<UTXOInfoResp> listCopydefault = copydefault((java.util.List<UTXOInfoResp>) null, djSkpj());
        long jDGOPHZ = DGOPHZ();
        java.lang.String strDbNXlk = fHqPtx().DbNXlk();
        java.util.List<FixedUTXOInfo> batchBean = ((FixedUTXOSignData) QVsKAR()).getBatchBean();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(batchBean, 10));
        for (FixedUTXOInfo fixedUTXOInfo : batchBean) {
            java.lang.Long coinId = fixedUTXOInfo.getCoinId();
            java.lang.String nftId = fixedUTXOInfo.getNftId();
            java.lang.String nftPrice = fixedUTXOInfo.getNftPrice();
            java.lang.Integer protocolId = fixedUTXOInfo.getProtocolId();
            java.lang.String inscriptionId = fixedUTXOInfo.getInscriptionId();
            arrayList.add(new BTCNFTInfo(coinId, nftId, fixedUTXOInfo.getTxHash(), fixedUTXOInfo.getVOut(), inscriptionId, fixedUTXOInfo.getCoinAmount(), nftPrice, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, protocolId, fixedUTXOInfo.getNftLogoUrl(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 118656, (DefaultConstructorMarker) null));
        }
        return new C12797ctk.Application(responseData, strHtlTjW, listCopydefault, jDGOPHZ, 67, strDbNXlk, arrayList, false, fragmentActivity, 128, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<UTXOInfoResp> AYXKKw(java.util.List<UTXOInfoResp> list) {
        UtxoInfo utxoInfo;
        java.util.List<UTXONftInfo> nftLocaltionVOs;
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
            if (utxoList != null && (utxoInfo = (UtxoInfo) CollectionsKt___CollectionsKt.firstOrNull(utxoList)) != null && (nftLocaltionVOs = utxoInfo.getNftLocaltionVOs()) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(nftLocaltionVOs, 10));
                java.util.Iterator<T> it2 = nftLocaltionVOs.iterator();
                while (it2.hasNext()) {
                    java.lang.String nftId = ((UTXONftInfo) it2.next()).getNftId();
                    if (nftId == null) {
                        nftId = "";
                    }
                    arrayList.add(nftId);
                }
                java.util.List<FixedUTXOInfo> batchBean = ((FixedUTXOSignData) QVsKAR()).getBatchBean();
                java.util.ArrayList<FixedUTXOInfo> arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : batchBean) {
                    FixedUTXOInfo fixedUTXOInfo = (FixedUTXOInfo) obj;
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) fixedUTXOInfo.getNftId()) && arrayList.contains(fixedUTXOInfo.getNftId())) {
                        arrayList2.add(obj);
                    }
                }
                java.lang.String nftPrice = "0";
                int i = 0;
                for (java.lang.Object obj2 : arrayList2) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    FixedUTXOInfo fixedUTXOInfo2 = (FixedUTXOInfo) obj2;
                    if (i == 0 || C33129mqd.gEmmrt(fixedUTXOInfo2.getNftPrice(), nftPrice)) {
                        nftPrice = fixedUTXOInfo2.getNftPrice();
                    }
                    i++;
                }
                for (FixedUTXOInfo fixedUTXOInfo3 : arrayList2) {
                    fixedUTXOInfo3.setUtxoHash(utxoInfo.getTxHash());
                    fixedUTXOInfo3.setUtxoIndex(utxoInfo.getVout());
                    fixedUTXOInfo3.setUTXODup(C33129mqd.AEQbTJ(fixedUTXOInfo3.getNftPrice(), nftPrice));
                }
            }
        }
        return list;
    }
}
