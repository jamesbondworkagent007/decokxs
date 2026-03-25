package o;

import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOSignData;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cgD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12077cgD extends AbstractC12074cgA {
    public C10854bwM QUSxYX;
    public final InterfaceC56387yDm QfsBiF = C56392yDr.copydefault(new Function0() { // from class: o.cgF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12077cgD.EZpvd(this.EZpvd);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12102cgc
    public java.lang.String AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "";
    }

    public final C12164chl QDqgQU() {
        return (C12164chl) this.QfsBiF.getValue();
    }

    public static final C12164chl EZpvd(C12077cgD c12077cgD) {
        return new C12164chl(c12077cgD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd QwvEab(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC12102cgc, o.AbstractC11993ceZ, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<C10854bwM, java.lang.String>> abstractC58185ywXRXzakW = RXzakW();
        final Function1 function1 = new Function1() { // from class: o.cgI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12077cgD.OLrzqt(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXRXzakW.KWHzl(new InterfaceC58229yxO() { // from class: o.cgG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12077cgD.QwvEab(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd OLrzqt(C12077cgD c12077cgD, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (pair.getFirst() != null) {
            c12077cgD.QUSxYX = (C10854bwM) pair.getFirst();
            return super.r_();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond()));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC8704bHj
    public C10854bwM fHqPtx() {
        C10854bwM c10854bwM = this.QUSxYX;
        return c10854bwM == null ? dHguZz() : c10854bwM;
    }

    @Override // o.AbstractC12102cgc
    public XRC20TransactionResult RVsVBY() {
        C12164chl c12164chlQDqgQU = QDqgQU();
        java.util.List<UTXOInfoResp> listQKVWgx = QKVWgx();
        java.util.List<UTXOInfoResp> listDjSkpj = djSkpj();
        return c12164chlQDqgQU.EZpvd(listQKVWgx, listDjSkpj != null ? (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(listDjSkpj) : null);
    }

    @Override // o.AbstractC12102cgc
    public XRC20TransactionResult gEmmrt(java.lang.String str, java.lang.String str2) {
        C12164chl c12164chlQDqgQU = QDqgQU();
        java.util.List<UTXOInfoResp> listQKVWgx = QKVWgx();
        java.util.List<UTXOInfoResp> listDjSkpj = djSkpj();
        return c12164chlQDqgQU.AEQbTJ(str, str2, listQKVWgx, listDjSkpj != null ? (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(listDjSkpj) : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> EZpvd(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        java.util.List<FixedUTXOInfo> batchBean = ((FixedUTXOSignData) QVsKAR()).getBatchBean();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(batchBean, 10));
        for (FixedUTXOInfo fixedUTXOInfo : batchBean) {
            arrayList.add(new UTXOAddressInfoReq(fixedUTXOInfo.getFrom(), refreshUTXOVenue.getUpdateCanTransferAmount() ? "0" : C54870xYj.KWHzl(fixedUTXOInfo.getCoinAmount(), fHqPtx().valueOf()), "0", (java.lang.Integer) 2, fixedUTXOInfo.getNftId(), (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) null, fixedUTXOInfo.getProtocolId(), fixedUTXOInfo.getTxHash(), fixedUTXOInfo.getVOut(), (java.util.List) null, 36832, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> AEQbTJ(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        return C56402yEa.EZpvd(new UTXOAddressInfoReq(QUSxYX(), refreshUTXOVenue.getUpdateCanTransferAmount() ? "0" : valueOf(((FixedUTXOSignData) QVsKAR()).getBatchBean()), refreshUTXOVenue.getUpdateCanTransferAmount() ? "0" : C54862xYb.convertToBigIntegerString$default(DXXBbs().AEQbTJ(), true, (RoundingMode) null, 2, (java.lang.Object) null), (java.lang.Integer) 6, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) null, dvKsVJ(), (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 61424, (DefaultConstructorMarker) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC12102cgc
    public java.lang.String DNMMPQ() {
        BigDecimal bigDecimal = new BigDecimal("0");
        java.util.Iterator<T> it = ((FixedUTXOSignData) QVsKAR()).getBatchBean().iterator();
        BigDecimal bigDecimalKWHzl = bigDecimal;
        while (it.hasNext()) {
            bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimalKWHzl, C33129mqd.mulS$default(((FixedUTXOInfo) it.next()).getCoinAmount(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(java.lang.Integer.valueOf(fHqPtx().valueOf())))), null, null, null, 14, null));
        }
        return C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null);
    }

    public static final ResponseData UlJrfe(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<ResponseData<DappTxResultBean>> OLrzqt(@NotNull BatchBroadcastModel batchBroadcastModel) {
        Intrinsics.checkNotNullParameter(batchBroadcastModel, "");
        AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXOLrzqt = super.OLrzqt(batchBroadcastModel);
        final Function1 function1 = new Function1() { // from class: o.cgJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12077cgD.AkhnZx((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cgH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12077cgD.UlJrfe(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData AkhnZx(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            DappTxResultBean dappTxResultBean = (DappTxResultBean) responseData.getData();
            if (dappTxResultBean != null) {
                DappTxResultBean dappTxResultBean2 = (DappTxResultBean) responseData.getData();
                dappTxResultBean.setTxHash(dappTxResultBean2 != null ? dappTxResultBean2.getTxId() : null);
            }
            DappTxResultBean dappTxResultBean3 = (DappTxResultBean) responseData.getData();
            if (dappTxResultBean3 != null) {
                dappTxResultBean3.setTxId("");
            }
        }
        return responseData;
    }
}
