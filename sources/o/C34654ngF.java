package o;

import com.okinc.dexkline.utils.FlowUtilsKt$throttleFirst$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ngF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34654ngF {
    public static final <T> Flow<T> KWHzl(@NotNull Flow<? extends T> flow, long j) {
        Intrinsics.checkNotNullParameter(flow, "");
        return FlowKt.flow(new FlowUtilsKt$throttleFirst$1(flow, j, null));
    }
}
