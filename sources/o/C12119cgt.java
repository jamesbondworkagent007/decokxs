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
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cgt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12119cgt extends AbstractC12074cgA {
    public final InterfaceC56387yDm QfsBiF = C56392yDr.copydefault(new Function0() { // from class: o.cgq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12119cgt.copydefault(this.KWHzl);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12102cgc
    public java.lang.String AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "";
    }

    private final C12086cgM QIZEnU() {
        return (C12086cgM) this.QfsBiF.getValue();
    }

    public static final C12086cgM copydefault(C12119cgt c12119cgt) {
        return new C12086cgM(c12119cgt);
    }

    @Override // o.AbstractC8704bHj
    public C10854bwM fHqPtx() {
        return dHguZz();
    }

    @Override // o.AbstractC12102cgc
    public XRC20TransactionResult RVsVBY() {
        C12086cgM c12086cgMQIZEnU = QIZEnU();
        java.util.List<UTXOInfoResp> listQKVWgx = QKVWgx();
        UTXOInfoResp uTXOInfoResp = listQKVWgx != null ? (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(listQKVWgx) : null;
        java.util.List<UTXOInfoResp> listDjSkpj = djSkpj();
        return c12086cgMQIZEnU.OLrzqt(uTXOInfoResp, listDjSkpj != null ? (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(listDjSkpj) : null);
    }

    @Override // o.AbstractC12102cgc
    public XRC20TransactionResult gEmmrt(java.lang.String str, java.lang.String str2) {
        C12086cgM c12086cgMQIZEnU = QIZEnU();
        java.util.List<UTXOInfoResp> listQKVWgx = QKVWgx();
        UTXOInfoResp uTXOInfoResp = listQKVWgx != null ? (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(listQKVWgx) : null;
        java.util.List<UTXOInfoResp> listDjSkpj = djSkpj();
        return c12086cgMQIZEnU.EZpvd(str, str2, uTXOInfoResp, listDjSkpj != null ? (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(listDjSkpj) : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> EZpvd(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        java.util.List<FixedUTXOInfo> batchBean = ((FixedUTXOSignData) QVsKAR()).getBatchBean();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(batchBean, 10));
        for (FixedUTXOInfo fixedUTXOInfo : batchBean) {
            arrayList.add(new UTXOAddressInfoReq(fixedUTXOInfo.getFrom(), "0", "0", (java.lang.Integer) 2, fixedUTXOInfo.getNftId(), (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) null, fixedUTXOInfo.getProtocolId(), (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 61408, (DefaultConstructorMarker) null));
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

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC12102cgc
    public java.lang.String DNMMPQ() {
        return valueOf(((FixedUTXOSignData) QVsKAR()).getBatchBean());
    }

    public static final ResponseData QSLkRj(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<ResponseData<DappTxResultBean>> OLrzqt(@NotNull BatchBroadcastModel batchBroadcastModel) {
        Intrinsics.checkNotNullParameter(batchBroadcastModel, "");
        AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXOLrzqt = super.OLrzqt(batchBroadcastModel);
        final Function1 function1 = new Function1() { // from class: o.cgu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12119cgt.AkhnZx((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cgs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12119cgt.QSLkRj(function1, obj);
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
