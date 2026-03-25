package o;

import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gZp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20065gZp {
    public static final boolean AEQbTJ(@NotNull OrderSubStatus orderSubStatus) {
        Intrinsics.checkNotNullParameter(orderSubStatus, "");
        return orderSubStatus == OrderSubStatus.Creating || orderSubStatus == OrderSubStatus.Open || orderSubStatus == OrderSubStatus.Pending || orderSubStatus == OrderSubStatus.Suspended;
    }
}
