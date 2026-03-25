package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.common.utils.LifecycleExtKt$collectOnLifecycle$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dpQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14646dpQ {
    public static /* synthetic */ void collectOnLifecycle$default(LifecycleOwner lifecycleOwner, Flow flow, Lifecycle.State state, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        EZpvd(lifecycleOwner, flow, state, function1);
    }

    public static final <T> void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull Flow<? extends T> flow, @NotNull Lifecycle.State state, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new LifecycleExtKt$collectOnLifecycle$1(lifecycleOwner, state, flow, function1, null), 3, null);
    }
}
