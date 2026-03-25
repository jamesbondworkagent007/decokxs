package o;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.planet.ext.FlowExtensionKt$flowAndCollectLatest$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46373tRy {
    public static /* synthetic */ Job flowAndCollect$default(Flow flow, LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.RESUMED;
        }
        return AEQbTJ(flow, lifecycleOwner, state, function2);
    }

    public static final <T> Job AEQbTJ(@NotNull Flow<? extends T> flow, @NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(function2, "");
        LifecycleOwner lifecycleOwnerAEQbTJ = AEQbTJ(lifecycleOwner);
        return FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle(flow, lifecycleOwnerAEQbTJ.getLifecycle(), state), function2), LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerAEQbTJ));
    }

    public static /* synthetic */ Job flowAndCollectLatest$default(Flow flow, LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.RESUMED;
        }
        return KWHzl(flow, lifecycleOwner, state, function2);
    }

    public static final <T> Job KWHzl(@NotNull Flow<? extends T> flow, @NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(function2, "");
        LifecycleOwner lifecycleOwnerAEQbTJ = AEQbTJ(lifecycleOwner);
        return BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerAEQbTJ), null, null, new FlowExtensionKt$flowAndCollectLatest$1(flow, lifecycleOwnerAEQbTJ, state, function2, null), 3, null);
    }

    public static final LifecycleOwner AEQbTJ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof androidx.fragment.app.Fragment) {
            lifecycleOwner = ((androidx.fragment.app.Fragment) lifecycleOwner).getViewLifecycleOwner();
        }
        Intrinsics.copydefault(lifecycleOwner);
        return lifecycleOwner;
    }
}
