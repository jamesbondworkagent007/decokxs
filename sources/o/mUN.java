package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.dexkline.dexui.utils.LifecyleUtilsKt$collectOnLifecycle$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mUN {
    public static /* synthetic */ Job collectOnLifecycle$default(LifecycleOwner lifecycleOwner, Flow flow, Lifecycle.State state, FlowCollector flowCollector, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return copydefault(lifecycleOwner, flow, state, flowCollector);
    }

    public static final <T> Job copydefault(@NotNull LifecycleOwner lifecycleOwner, @NotNull Flow<? extends T> flow, @NotNull Lifecycle.State state, @NotNull FlowCollector<? super T> flowCollector) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(flowCollector, "");
        return mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new LifecyleUtilsKt$collectOnLifecycle$1(lifecycleOwner, state, flow, flowCollector, null), 3, null);
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
        return copydefault(viewLifecycleOwner, flow, state, flowCollector);
    }
}
