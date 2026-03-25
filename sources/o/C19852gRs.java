package o;

import com.okinc.business.dex.trade.component.orderandposition.position.viewmodel.ThrottleLatestKt$throttleLatest$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gRs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19852gRs {
    public static final <T> Flow<T> EZpvd(@NotNull Flow<? extends T> flow, long j) {
        Intrinsics.checkNotNullParameter(flow, "");
        return FlowKt.channelFlow(new ThrottleLatestKt$throttleLatest$1(flow, j, null));
    }
}
