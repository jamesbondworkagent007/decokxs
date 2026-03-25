package o;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.tradingbot.impl.utils.FlowExtensionsKt$flowAndCollectLatest$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wUv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52692wUv {
    public static /* synthetic */ Job flowAndCollect$default(Flow flow, LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.RESUMED;
        }
        return copydefault(flow, lifecycleOwner, state, function2);
    }

    public static final <T> Job copydefault(@NotNull Flow<? extends T> flow, @NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(function2, "");
        LifecycleOwner lifecycleOwnerOLrzqt = OLrzqt(lifecycleOwner);
        return FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle(flow, lifecycleOwnerOLrzqt.getLifecycle(), state), function2), LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerOLrzqt));
    }

    public static /* synthetic */ Job flowAndCollectLatest$default(Flow flow, LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.RESUMED;
        }
        return EZpvd(flow, lifecycleOwner, state, function2);
    }

    public static final <T> Job EZpvd(@NotNull Flow<? extends T> flow, @NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(function2, "");
        LifecycleOwner lifecycleOwnerOLrzqt = OLrzqt(lifecycleOwner);
        return BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerOLrzqt), null, null, new FlowExtensionsKt$flowAndCollectLatest$1(flow, lifecycleOwnerOLrzqt, state, function2, null), 3, null);
    }

    public static final LifecycleOwner OLrzqt(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof androidx.fragment.app.Fragment) {
            lifecycleOwner = ((androidx.fragment.app.Fragment) lifecycleOwner).getViewLifecycleOwner();
        }
        Intrinsics.copydefault(lifecycleOwner);
        return lifecycleOwner;
    }
}
