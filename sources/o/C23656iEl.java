package o;

import com.okinc.business.invest_biz.data.bean.response.InvestedToken;
import com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsByAccount;
import com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsResponse;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23656iEl {
    @yCM
    public C23656iEl() {
    }

    public final iEK copydefault(@NotNull ProtocolDetailsResponse protocolDetailsResponse) {
        java.util.List listAhwBna;
        java.util.List<InvestedToken> listAEQbTJ;
        Intrinsics.checkNotNullParameter(protocolDetailsResponse, "");
        ProtocolDetailsByAccount protocolDetailsByAccount = (ProtocolDetailsByAccount) CollectionsKt___CollectionsKt.firstOrNull(protocolDetailsResponse.EZpvd());
        long jAEQbTJ = protocolDetailsResponse.AEQbTJ();
        long jOLrzqt = protocolDetailsResponse.OLrzqt();
        java.lang.String strEZpvd = protocolDetailsByAccount != null ? protocolDetailsByAccount.EZpvd() : null;
        java.lang.String str = strEZpvd == null ? "" : strEZpvd;
        if (protocolDetailsByAccount == null || (listAEQbTJ = protocolDetailsByAccount.AEQbTJ()) == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((InvestedToken) it.next()).isConnected()));
            }
            listAhwBna = arrayList;
        }
        return new iEK(jAEQbTJ, jOLrzqt, str, protocolDetailsResponse.AhwBna(), protocolDetailsResponse.gEmmrt(), protocolDetailsResponse.valueOf(), protocolDetailsResponse.djBIcL(), listAhwBna, protocolDetailsResponse.KWHzl());
    }
}
