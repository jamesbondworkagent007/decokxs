package o;

import com.okinc.business.invest_biz.data.bean.AggregateHeaderData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iFu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23692iFu {
    public final C23718iGt KWHzl;
    public final C23696iFy OLrzqt;

    @yCM
    public C23692iFu(@NotNull C23696iFy c23696iFy, @NotNull C23718iGt c23718iGt) {
        Intrinsics.checkNotNullParameter(c23696iFy, "");
        Intrinsics.checkNotNullParameter(c23718iGt, "");
        this.OLrzqt = c23696iFy;
        this.KWHzl = c23718iGt;
    }

    public final iWT KWHzl(@NotNull AggregateHeaderData aggregateHeaderData) {
        Intrinsics.checkNotNullParameter(aggregateHeaderData, "");
        return new iWT(aggregateHeaderData.KWHzl(), aggregateHeaderData.AuCTel(), aggregateHeaderData.fARcdN(), aggregateHeaderData.djBIcL(), this.OLrzqt.AEQbTJ(aggregateHeaderData), this.KWHzl.EZpvd(aggregateHeaderData));
    }
}
