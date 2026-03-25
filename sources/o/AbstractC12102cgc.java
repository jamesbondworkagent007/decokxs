package o;

import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UTXONftInfo;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import java.math.BigDecimal;
import java.util.concurrent.Callable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.cgc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12102cgc extends AbstractC11993ceZ<FixedUTXOSignData> {
    public XRC20TransactionResult QVAiDq;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final XRC20TransactionResult DGgnkA() {
        return this.QVAiDq;
    }

    public abstract java.lang.String DNMMPQ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC11993ceZ
    public void EZpvd(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue, java.util.List<UTXOInfoResp> list) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
    }

    @Override // o.AbstractC11993ceZ, o.AbstractC8664bGw
    public boolean E_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC11993ceZ
    public void KWHzl(boolean z, int i, @NotNull RefreshUTXOVenue refreshUTXOVenue, java.util.List<UTXOInfoResp> list) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
    }

    public abstract XRC20TransactionResult RVsVBY();

    public abstract ResponseData<BatchBroadcastModel> djBIcL(@NotNull ResponseData<XRC20TransactionResult> responseData);

    public abstract XRC20TransactionResult gEmmrt(java.lang.String str, java.lang.String str2);

    @Override // o.AbstractC8704bHj
    public boolean heceqZ() {
        return false;
    }

    public static final kotlin.Pair OJuSTm(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC11993ceZ, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        final Function1 function1 = new Function1() { // from class: o.cgk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12102cgc.KWHzl(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXR_.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cgg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12102cgc.OJuSTm(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair KWHzl(AbstractC12102cgc abstractC12102cgc, kotlin.Pair pair) {
        boolean z;
        Intrinsics.checkNotNullParameter(pair, "");
        C9785bcD[] c9785bcDArr = new C9785bcD[3];
        c9785bcDArr[0] = new C9816bci((abstractC12102cgc.giSNqX() || abstractC12102cgc.gasjUx()) ? false : true);
        if (abstractC12102cgc.flVtFt() || !C33129mqd.KWHzl((java.util.Collection) abstractC12102cgc.QKVWgx())) {
            z = false;
            break;
        }
        java.util.List<UTXOInfoResp> listQKVWgx = abstractC12102cgc.QKVWgx();
        if (listQKVWgx != null && !listQKVWgx.isEmpty()) {
            java.util.Iterator<T> it = listQKVWgx.iterator();
            while (it.hasNext()) {
                java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                if (utxoList == null || utxoList.isEmpty()) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        c9785bcDArr[1] = new C9815bch(z);
        c9785bcDArr[2] = new C9819bcl(C33129mqd.AEQbTJ(abstractC12102cgc.fZBcTu(), 0));
        abstractC12102cgc.DLWbHP().OLrzqt(yDY.gEmmrt(c9785bcDArr));
        return pair;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC11993ceZ
    public java.lang.Integer dvKsVJ() {
        return ((FixedUTXOSignData) QVsKAR()).getFirstNftProtocolId();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public java.lang.String l_() {
        return ((FixedUTXOSignData) QVsKAR()).getTxType();
    }

    @Override // o.AbstractC8664bGw
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> wlaJM() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.valueOf(z), ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OLrzqt(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.valueOf(z), ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<java.lang.Boolean> iZzfmt() {
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.cgh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return AbstractC12102cgc.EZpvd(this.EZpvd);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.Boolean EZpvd(AbstractC12102cgc abstractC12102cgc) {
        java.lang.String commitTx;
        XRC20TransactionResult xRC20TransactionResultRVsVBY = abstractC12102cgc.RVsVBY();
        if (xRC20TransactionResultRVsVBY == null || (commitTx = xRC20TransactionResultRVsVBY.getCommitTx()) == null || commitTx.length() == 0) {
            return java.lang.Boolean.TRUE;
        }
        java.lang.String commitTxFee = xRC20TransactionResultRVsVBY.getCommitTxFee();
        java.lang.String feeRate = xRC20TransactionResultRVsVBY.getFeeRate();
        if (feeRate == null) {
            feeRate = "";
        }
        java.lang.String strKWHzl = abstractC12102cgc.KWHzl(commitTxFee, feeRate);
        XRC20TransactionResult xRC20TransactionResult = abstractC12102cgc.QVAiDq;
        java.lang.String commitTxFee2 = xRC20TransactionResult != null ? xRC20TransactionResult.getCommitTxFee() : null;
        XRC20TransactionResult xRC20TransactionResult2 = abstractC12102cgc.QVAiDq;
        java.lang.String feeRate2 = xRC20TransactionResult2 != null ? xRC20TransactionResult2.getFeeRate() : null;
        if (!Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) abstractC12102cgc.KWHzl(commitTxFee2, feeRate2 != null ? feeRate2 : ""))) {
            abstractC12102cgc.QVAiDq = xRC20TransactionResultRVsVBY;
            return java.lang.Boolean.TRUE;
        }
        abstractC12102cgc.QVAiDq = xRC20TransactionResultRVsVBY;
        return java.lang.Boolean.FALSE;
    }

    @Override // o.AbstractC11993ceZ
    public java.lang.String fZBcTu() {
        XRC20TransactionResult xRC20TransactionResult = this.QVAiDq;
        if (xRC20TransactionResult == null) {
            return "0";
        }
        java.lang.String commitTxFee = xRC20TransactionResult.getCommitTxFee();
        java.lang.String feeRate = xRC20TransactionResult.getFeeRate();
        if (feeRate == null) {
            feeRate = "";
        }
        return KWHzl(commitTxFee, feeRate);
    }

    @Override // o.AbstractC8664bGw
    public kotlin.Pair<java.lang.Boolean, java.lang.String> ao_() {
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public static final ResponseData OxVOHk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> KWHzl(final java.lang.String str, final java.lang.String str2, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = KWHzl(submitTxExpandBean);
        final Function1 function1 = new Function1() { // from class: o.cge
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12102cgc.OLrzqt(this.copydefault, str, str2, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cgi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12102cgc.OxVOHk(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData OLrzqt(AbstractC12102cgc abstractC12102cgc, java.lang.String str, java.lang.String str2, ResponseData responseData) {
        ResponseData<XRC20TransactionResult> responseData2;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            XRC20TransactionResult xRC20TransactionResultGEmmrt = abstractC12102cgc.gEmmrt(str, str2);
            if (xRC20TransactionResultGEmmrt == null) {
                responseData2 = new ResponseData<>(-5005, null, null, null, null, null, 62, null);
            } else {
                java.lang.String commitTx = xRC20TransactionResultGEmmrt.getCommitTx();
                if (commitTx == null || commitTx.length() == 0) {
                    responseData2 = new ResponseData<>(-5010, null, null, null, null, null, 62, null);
                } else {
                    responseData2 = new ResponseData<>(-5001, null, null, null, xRC20TransactionResultGEmmrt, null, 46, null);
                }
            }
            return abstractC12102cgc.djBIcL(responseData2);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, null, 60, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<UTXONftInfo> DaRZkR() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (FixedUTXOInfo fixedUTXOInfo : ((FixedUTXOSignData) QVsKAR()).getBatchBean()) {
            java.util.List<UTXOInfoResp> listQKVWgx = QKVWgx();
            if (listQKVWgx != null) {
                java.util.Iterator<T> it = listQKVWgx.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                    if (utxoList != null) {
                        java.util.Iterator<T> it2 = utxoList.iterator();
                        while (it2.hasNext()) {
                            java.util.List<UTXONftInfo> nftLocaltionVOs = ((UtxoInfo) it2.next()).getNftLocaltionVOs();
                            if (nftLocaltionVOs != null) {
                                for (UTXONftInfo uTXONftInfo : nftLocaltionVOs) {
                                    if (C33129mqd.OLrzqt((java.lang.CharSequence) fixedUTXOInfo.getNftId()) && Intrinsics.EZpvd((java.lang.Object) fixedUTXOInfo.getNftId(), (java.lang.Object) uTXONftInfo.getNftId())) {
                                        arrayList.add(uTXONftInfo);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public java.lang.String AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xYW.AEQbTJ.OLrzqt(str, dHguZz().QKVWgx());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean QXDzTk() {
        return C33129mqd.AEQbTJ(java.lang.Integer.valueOf(((FixedUTXOSignData) QVsKAR()).getBatchBean().size()), 1);
    }

    public final java.lang.String OTwTPd() {
        BigDecimal bigDecimal = new BigDecimal("0");
        java.util.List<UTXOInfoResp> listQKVWgx = QKVWgx();
        if (listQKVWgx != null) {
            java.util.Iterator<T> it = listQKVWgx.iterator();
            while (it.hasNext()) {
                java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                if (utxoList != null) {
                    for (UtxoInfo utxoInfo : utxoList) {
                        UTXOSignInfo uTXOSignInfoUeEOUB = UeEOUB();
                        BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getInscriptionOutput() : null, utxoInfo.getCoinAmount());
                        if (C33129mqd.AEQbTJ(bigDecimalAEQbTJ, 0)) {
                            bigDecimal = C54862xYb.KWHzl(bigDecimal, bigDecimalAEQbTJ);
                        }
                    }
                }
            }
        }
        return C54862xYb.convertToString$default(bigDecimal, false, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<UTXOInfoResp> djBIcL(@NotNull java.util.List<UTXOInfoResp> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<FixedUTXOInfo> batchBean = ((FixedUTXOSignData) QVsKAR()).getBatchBean();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(batchBean, 10));
        java.util.Iterator<T> it = batchBean.iterator();
        while (it.hasNext()) {
            arrayList.add(((FixedUTXOInfo) it.next()).getFrom());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (UTXOInfoResp uTXOInfoResp : list) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) arrayList), uTXOInfoResp.getAddress()) && aKErDB().AEQbTJ(uTXOInfoResp.getUtxoList())) {
                java.util.List<UtxoInfo> utxoList = uTXOInfoResp.getUtxoList();
                UtxoInfo utxoInfo = utxoList != null ? (UtxoInfo) CollectionsKt___CollectionsKt.firstOrNull(utxoList) : null;
                if (utxoInfo != null) {
                    java.lang.String str = utxoInfo.getTxHash() + "-" + utxoInfo.getVout();
                    if (!arrayList3.contains(str)) {
                        arrayList3.add(str);
                        arrayList2.add(uTXOInfoResp);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final BatchBroadcastModel AhwBna(@NotNull java.util.List<BroadcastBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new BatchBroadcastModel(list, (java.util.List) null, java.lang.Boolean.TRUE, (java.lang.String) null, (java.lang.Boolean) null, dvKsVJ(), l_(), (SignAuthType) null, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA, (DefaultConstructorMarker) null);
    }

    public final int EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return aKErDB().EZpvd(dUDNAs(), dHguZz(), str);
    }
}
