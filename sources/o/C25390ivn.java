package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.dexui.utils.LifecyleUtilsKt$collectOnLifecycle$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ivn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25390ivn {
    public static /* synthetic */ Job collectOnLifecycle$default(LifecycleOwner lifecycleOwner, Flow flow, Lifecycle.State state, FlowCollector flowCollector, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return EZpvd(lifecycleOwner, flow, state, flowCollector);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ivm.safeLaunch$default(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart, kotlin.jvm.functions.Function2, int, java.lang.Object):kotlinx.coroutines.Job */
    public static final <T> Job EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull Flow<? extends T> flow, @NotNull Lifecycle.State state, @NotNull FlowCollector<? super T> flowCollector) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(flowCollector, "");
        return C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new LifecyleUtilsKt$collectOnLifecycle$1(lifecycleOwner, state, flow, flowCollector, null), 3, null);
    }

    public static /* synthetic */ Job collectOnViewLifecycle$default(androidx.fragment.app.Fragment fragment, Flow flow, Lifecycle.State state, FlowCollector flowCollector, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return AEQbTJ(fragment, flow, state, flowCollector);
    }

    public static final <T> Job AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment, @NotNull Flow<? extends T> flow, @NotNull Lifecycle.State state, @NotNull FlowCollector<? super T> flowCollector) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(flowCollector, "");
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return EZpvd(viewLifecycleOwner, flow, state, flowCollector);
    }
}
