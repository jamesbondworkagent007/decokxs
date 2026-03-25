package o;

import com.okinc.business.invest_biz.data.bean.AggregateHeaderData;
import com.okinc.business.invest_biz.data.bean.InvestmentLogoData;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iFy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23696iFy {
    @yCM
    public C23696iFy() {
    }

    public final iWS AEQbTJ(@NotNull AggregateHeaderData aggregateHeaderData) {
        Intrinsics.checkNotNullParameter(aggregateHeaderData, "");
        if (aggregateHeaderData.fetchVPNInfo() == null) {
            return null;
        }
        java.lang.String strAuCTel = aggregateHeaderData.AuCTel();
        java.lang.String strAYXKKw = aggregateHeaderData.AYXKKw();
        java.lang.String strOLrzqt = aggregateHeaderData.fetchVPNInfo().OLrzqt();
        java.util.List<InvestTokenWithAmount> listAEQbTJ = aggregateHeaderData.fetchVPNInfo().AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            arrayList.add(((InvestTokenWithAmount) it.next()).getTokenLogo());
        }
        InvestmentLogoData investmentLogoData = new InvestmentLogoData(arrayList, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 30, (DefaultConstructorMarker) null);
        java.lang.String strAEQbTJ = aggregateHeaderData.AEQbTJ();
        long jValueOf = C33129mqd.valueOf(aggregateHeaderData.OLrzqt());
        long jValueOf2 = C33129mqd.valueOf(aggregateHeaderData.EZpvd());
        return new iWS(strAuCTel, strAYXKKw, strOLrzqt, investmentLogoData, strAEQbTJ, aggregateHeaderData.AhwBna(), jValueOf, jValueOf2, aggregateHeaderData.gEmmrt(), null, null, false, null, aggregateHeaderData.DbNXlk(), aggregateHeaderData.AkhnZx(), 7680, null);
    }
}
