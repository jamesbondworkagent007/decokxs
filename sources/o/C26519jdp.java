package o;

import com.okinc.business.invest_biz.data.bean.AggregateItem;
import com.okinc.business.invest_biz.data.bean.PointsInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jdp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26519jdp {
    public final C26520jdq AEQbTJ;
    public final C26521jdr copydefault;

    @yCM
    public C26519jdp(@NotNull C26521jdr c26521jdr, @NotNull C26520jdq c26520jdq) {
        Intrinsics.checkNotNullParameter(c26521jdr, "");
        Intrinsics.checkNotNullParameter(c26520jdq, "");
        this.copydefault = c26521jdr;
        this.AEQbTJ = c26520jdq;
    }

    public final InterfaceC27436jvE KWHzl(@NotNull AggregateItem aggregateItem) {
        Intrinsics.checkNotNullParameter(aggregateItem, "");
        PointsInfo pointsInfoFJNWhG = aggregateItem.fJNWhG();
        if (C33129mqd.KWHzl((java.util.Collection) (pointsInfoFJNWhG != null ? pointsInfoFJNWhG.copydefault() : null))) {
            return this.copydefault.AEQbTJ(aggregateItem);
        }
        if (aggregateItem.ejfBZ() != null) {
            return this.AEQbTJ.OLrzqt(aggregateItem);
        }
        return new C26526jdw(aggregateItem.EZpvd(), aggregateItem.AhwBna(), aggregateItem.fetchVPNInfo(), aggregateItem.AkhnZx(), aggregateItem.DbNXlk(), aggregateItem.values(), aggregateItem.iwGUEr(), aggregateItem.AuCTel(), aggregateItem.fARcdN(), aggregateItem.hDKMBd(), aggregateItem.getFieldNames(), aggregateItem.fIwbmz(), aggregateItem.djBIcL(), aggregateItem.isConnected(), false, aggregateItem.gEmmrt(), aggregateItem.valueOf(), 0, 147456, null);
    }
}
