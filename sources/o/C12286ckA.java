package o;

import com.okinc.business.defi.api.model.tx.signdata.UTXOTransferSignData;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ckA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12286ckA extends AbstractC12340clB<UTXOTransferSignData> {
    public final InterfaceC56387yDm QfsBiF = C56392yDr.copydefault(new Function0() { // from class: o.ckz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12286ckA.copydefault(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12387clw
    public java.lang.String DGgnkA() {
        return "";
    }

    @Override // o.AbstractC12340clB
    public boolean OTwTPd() {
        return false;
    }

    /* JADX DEBUG: Possible override for method o.clw.DNMMPQ()Z */
    public final C12357clS DNMMPQ() {
        return (C12357clS) this.QfsBiF.getValue();
    }

    public static final C12357clS copydefault(C12286ckA c12286ckA) {
        return new C12357clS(c12286ckA);
    }

    public static final kotlin.Pair QSLkRj(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> dxcTrN() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDxcTrN = super.dxcTrN();
        final Function1 function1 = new Function1() { // from class: o.ckF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12286ckA.AEQbTJ(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDxcTrN.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ckC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12286ckA.QSLkRj(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AEQbTJ(C12286ckA c12286ckA, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c12286ckA.OLrzqt(c12286ckA.DarRvM().KWHzl(java.lang.Long.valueOf(c12286ckA.DGOPHZ()), c12286ckA.htlTjW()));
        return pair;
    }

    public static final kotlin.Pair QCjLjM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC11993ceZ, o.AbstractC8664bGw, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> RJOkX() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXRJOkX = super.RJOkX();
        final Function1 function1 = new Function1() { // from class: o.ckG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12286ckA.copydefault(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXRJOkX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ckE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12286ckA.QCjLjM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair copydefault(C12286ckA c12286ckA, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c12286ckA.OLrzqt(c12286ckA.DarRvM().KWHzl(java.lang.Long.valueOf(c12286ckA.DGOPHZ()), c12286ckA.htlTjW()));
        return pair;
    }

    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> EZpvd(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        if (refreshUTXOVenue.isInitAsset() || refreshUTXOVenue.getUpdateCanTransferAmount()) {
            return C56402yEa.EZpvd(new UTXOAddressInfoReq(htlTjW(), "0", "0", (java.lang.Integer) 1, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) 0, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 63472, (DefaultConstructorMarker) null));
        }
        return yDY.AhwBna();
    }

    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> AEQbTJ(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        java.lang.String strConvertToString$default;
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        java.lang.String strHtlTjW = htlTjW();
        if (refreshUTXOVenue.getUpdateCanTransferAmount()) {
            strConvertToString$default = "0";
        } else {
            UTXOSignInfo uTXOSignInfoUeEOUB = UeEOUB();
            java.lang.String minOutput = uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null;
            UTXOSignInfo uTXOSignInfoUeEOUB2 = UeEOUB();
            strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.KWHzl(minOutput, C54862xYb.OLrzqt("2", uTXOSignInfoUeEOUB2 != null ? uTXOSignInfoUeEOUB2.getInscriptionOutput() : null)), false, null, null, 7, null);
        }
        java.lang.String strAEQbTJ = refreshUTXOVenue.getUpdateCanTransferAmount() ? "0" : DXXBbs().AEQbTJ();
        java.lang.Integer numQbewEr = fHqPtx().QbewEr();
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
        return C56402yEa.EZpvd(new UTXOAddressInfoReq(strHtlTjW, strConvertToString$default, strAEQbTJ, (java.lang.Integer) 4, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) arrayList, (java.lang.Integer) null, (java.lang.Integer) 0, numQbewEr, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 58864, (DefaultConstructorMarker) null));
    }

    @Override // o.AbstractC12340clB, o.AbstractC11993ceZ
    public void EZpvd(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue, java.util.List<UTXOInfoResp> list) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        java.lang.Object obj = null;
        EZpvd((java.util.List<UTXOInfoResp>) null);
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((UTXOInfoResp) next).getAddress(), (java.lang.Object) htlTjW())) {
                    obj = next;
                    break;
                }
            }
            UTXOInfoResp uTXOInfoResp = (UTXOInfoResp) obj;
            if (uTXOInfoResp != null) {
                KWHzl(uTXOInfoResp.getCanTransferAmount());
            }
        }
    }

    @Override // o.AbstractC11993ceZ
    public void KWHzl(boolean z, int i, @NotNull RefreshUTXOVenue refreshUTXOVenue, java.util.List<UTXOInfoResp> list) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        OLrzqt(DarRvM().KWHzl(java.lang.Long.valueOf(DGOPHZ()), htlTjW()));
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OLrzqt(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC12340clB
    public AbstractC58185ywX<ResponseData<XRC20TransactionResult>> AhwBna(@NotNull java.util.List<UtxoInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58185ywX<ResponseData<XRC20TransactionResult>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, DNMMPQ().OLrzqt(list), null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC12340clB
    public AbstractC58185ywX<ResponseData<XRC20TransactionResult>> OLrzqt(java.lang.String str, java.lang.String str2, @NotNull java.util.List<UtxoInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58185ywX<ResponseData<XRC20TransactionResult>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, DNMMPQ().EZpvd(str, str2, list), null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }
}
