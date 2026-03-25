package o;

import com.okinc.business.utils.FlowUtilsKt$throttleFirst$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31199lpX {
    public static final <T> Flow<T> AEQbTJ(@NotNull Flow<? extends T> flow, long j) {
        Intrinsics.checkNotNullParameter(flow, "");
        return FlowKt.flow(new FlowUtilsKt$throttleFirst$1(flow, j, null));
    }
}
