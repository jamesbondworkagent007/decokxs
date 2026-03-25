package o;

import com.okinc.business.invest_biz.data.bean.AggregateHeaderData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iGt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23718iGt {
    @yCM
    public C23718iGt() {
    }

    public final iWZ EZpvd(@NotNull AggregateHeaderData aggregateHeaderData) {
        Intrinsics.checkNotNullParameter(aggregateHeaderData, "");
        if (aggregateHeaderData.fIwbmz().length() == 0) {
            return null;
        }
        java.lang.String strAuCTel = aggregateHeaderData.AuCTel();
        java.lang.String strAYXKKw = aggregateHeaderData.AYXKKw();
        java.lang.String strAEQbTJ = aggregateHeaderData.AEQbTJ();
        long jValueOf = C33129mqd.valueOf(aggregateHeaderData.OLrzqt());
        long jValueOf2 = C33129mqd.valueOf(aggregateHeaderData.EZpvd());
        java.lang.String strAhwBna = aggregateHeaderData.AhwBna();
        java.lang.String strGEmmrt = aggregateHeaderData.gEmmrt();
        boolean zValueOf = aggregateHeaderData.valueOf();
        return new iWZ(strAuCTel, strAYXKKw, null, null, strAEQbTJ, strAhwBna, jValueOf, jValueOf2, strGEmmrt, aggregateHeaderData.fIwbmz(), aggregateHeaderData.copydefault(), zValueOf, aggregateHeaderData.fJNWhG(), aggregateHeaderData.DbNXlk(), aggregateHeaderData.AkhnZx(), aggregateHeaderData.values(), aggregateHeaderData.isConnected(), 12, null);
    }
}
