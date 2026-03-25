package o;

import com.okinc.business.data.RxToFlowUtilKt$asFlow$1;
import com.okinc.business.data.RxToFlowUtilKt$asFlowNullable$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aZB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6953aZB {
    public static final <T> Flow<T> copydefault(@NotNull AbstractC58260yxt<T> abstractC58260yxt) {
        Intrinsics.checkNotNullParameter(abstractC58260yxt, "");
        return FlowKt.callbackFlow(new RxToFlowUtilKt$asFlow$1(abstractC58260yxt, null));
    }

    public static final <T> Flow<T> EZpvd(@NotNull AbstractC58260yxt<T> abstractC58260yxt) {
        Intrinsics.checkNotNullParameter(abstractC58260yxt, "");
        return FlowKt.callbackFlow(new RxToFlowUtilKt$asFlowNullable$1(abstractC58260yxt, null));
    }
}
