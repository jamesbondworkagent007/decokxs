package o;

import com.okinc.market.search.features.main.root.data.po.P2pAndDeposit;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qGz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C40036qGz {
    public static final java.lang.String OLrzqt(@NotNull P2pAndDeposit p2pAndDeposit, boolean z) {
        Intrinsics.checkNotNullParameter(p2pAndDeposit, "");
        if (z) {
            int i = qZH.PendingIntent.ODXsMY;
            java.lang.String ccy = p2pAndDeposit.getCcy();
            return C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", ccy != null ? ccy : "--")));
        }
        int i2 = qZH.PendingIntent.DLWbHP;
        java.lang.String ccy2 = p2pAndDeposit.getCcy();
        return C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", ccy2 != null ? ccy2 : "--")));
    }
}
