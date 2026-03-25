package o;

import com.okinc.business.defi.api.model.tx.signdata.UTXOTransferSignData;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.clx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12388clx<SignData extends UTXOTransferSignData> extends AbstractC12340clB<SignData> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12387clw
    public java.lang.String DGgnkA() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC11993ceZ
    public void KWHzl(boolean z, int i, @NotNull RefreshUTXOVenue refreshUTXOVenue, java.util.List<UTXOInfoResp> list) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
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
}
