package o;

import com.okinc.business.defi.api.model.tx.signdata.UTXOTransferSignData;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ckh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12319ckh extends AbstractC12340clB<UTXOTransferSignData> {
    public final java.lang.String QfsBiF = "OKWARC20Transfer";
    public final InterfaceC56387yDm QUSxYX = C56392yDr.copydefault(new Function0() { // from class: o.ckg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12319ckh.AEQbTJ(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC11993ceZ
    public void KWHzl(boolean z, int i, @NotNull RefreshUTXOVenue refreshUTXOVenue, java.util.List<UTXOInfoResp> list) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
    }

    /* JADX DEBUG: Possible override for method o.clw.DNMMPQ()Z */
    public final C12349clK DNMMPQ() {
        return (C12349clK) this.QUSxYX.getValue();
    }

    public static final C12349clK AEQbTJ(C12319ckh c12319ckh) {
        return new C12349clK(c12319ckh);
    }

    @Override // o.AbstractC12387clw
    public java.lang.String DGgnkA() {
        return AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null);
    }

    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> EZpvd(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        return C56402yEa.EZpvd(new UTXOAddressInfoReq(htlTjW(), refreshUTXOVenue.getUpdateCanTransferAmount() ? "0" : AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), "0", (java.lang.Integer) 4, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, fHqPtx().fFgQHt(), (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) 0, fHqPtx().QbewEr(), (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 59248, (DefaultConstructorMarker) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> AEQbTJ(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        java.lang.String strQUSxYX = QUSxYX();
        java.lang.String strAEQbTJ = refreshUTXOVenue.getUpdateCanTransferAmount() ? "0" : ((C11990ceW) QKudOq()).AEQbTJ();
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
        return C56402yEa.EZpvd(new UTXOAddressInfoReq(strQUSxYX, "0", strAEQbTJ, (java.lang.Integer) 1, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) arrayList, (java.lang.Integer) null, (java.lang.Integer) 0, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 58864, (DefaultConstructorMarker) null));
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
        AbstractC58185ywX<ResponseData<XRC20TransactionResult>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, DNMMPQ().AEQbTJ(list), null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC12340clB
    public boolean OTwTPd() {
        XRC20TransactionResult xRC20TransactionResultRKcVTr = RKcVTr();
        if (!Intrinsics.EZpvd((java.lang.Object) (xRC20TransactionResultRKcVTr != null ? xRC20TransactionResultRKcVTr.getErrCode() : null), (java.lang.Object) "1000001")) {
            XRC20TransactionResult xRC20TransactionResultRKcVTr2 = RKcVTr();
            if (!Intrinsics.EZpvd((java.lang.Object) (xRC20TransactionResultRKcVTr2 != null ? xRC20TransactionResultRKcVTr2.getErrCode() : null), (java.lang.Object) "2011402")) {
                XRC20TransactionResult xRC20TransactionResultRKcVTr3 = RKcVTr();
                if (!Intrinsics.EZpvd((java.lang.Object) (xRC20TransactionResultRKcVTr3 != null ? xRC20TransactionResultRKcVTr3.getErrCode() : null), (java.lang.Object) "2011403")) {
                    XRC20TransactionResult xRC20TransactionResultRKcVTr4 = RKcVTr();
                    if (!Intrinsics.EZpvd((java.lang.Object) (xRC20TransactionResultRKcVTr4 != null ? xRC20TransactionResultRKcVTr4.getErrCode() : null), (java.lang.Object) "2011404")) {
                        XRC20TransactionResult xRC20TransactionResultRKcVTr5 = RKcVTr();
                        if (!Intrinsics.EZpvd((java.lang.Object) (xRC20TransactionResultRKcVTr5 != null ? xRC20TransactionResultRKcVTr5.getErrCode() : null), (java.lang.Object) "2011420")) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public void AhwBna() {
        super.AhwBna();
        C8497bDo c8497bDoDLWbHP = DLWbHP();
        boolean zDaRZkR = DaRZkR();
        C12797ctk c12797ctkAKErDB = aKErDB();
        java.lang.String strORxRYg = ORxRYg();
        if (strORxRYg == null) {
            strORxRYg = "";
        }
        c8497bDoDLWbHP.AEQbTJ(new C9817bcj(!zDaRZkR, c12797ctkAKErDB.AEQbTJ(strORxRYg, AbstractC12387clw.getMinOutput$OKWallet_wallet_impl$default(this, false, false, 3, null), fHqPtx())));
    }

    public final boolean DaRZkR() {
        XRC20TransactionResult xRC20TransactionResultRKcVTr = RKcVTr();
        return Intrinsics.EZpvd((java.lang.Object) (xRC20TransactionResultRKcVTr != null ? xRC20TransactionResultRKcVTr.getErrCode() : null), (java.lang.Object) "2011401");
    }

    @Override // o.AbstractC12340clB
    public AbstractC58185ywX<ResponseData<XRC20TransactionResult>> OLrzqt(java.lang.String str, java.lang.String str2, @NotNull java.util.List<UtxoInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58185ywX<ResponseData<XRC20TransactionResult>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, DNMMPQ().OLrzqt(str, str2, list), null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }
}
