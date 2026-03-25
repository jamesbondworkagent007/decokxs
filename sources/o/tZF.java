package o;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.preference.utils.FlowObserveExtensionKt$observeState$1;
import com.okinc.preference.utils.FlowObserveExtensionKt$observeState$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class tZF {
    public static /* synthetic */ Job observeState$default(StateFlow stateFlow, androidx.fragment.app.Fragment fragment, Lifecycle.State state, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return OLrzqt(stateFlow, fragment, state, function2);
    }

    public static final <T> Job OLrzqt(@NotNull StateFlow<? extends T> stateFlow, @NotNull androidx.fragment.app.Fragment fragment, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(stateFlow, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Flow flowOnEach = FlowKt.onEach(FlowKt.distinctUntilChanged(FlowExtKt.flowWithLifecycle(stateFlow, fragment.getViewLifecycleOwner().getLifecycle(), state)), new FlowObserveExtensionKt$observeState$1(function2, null));
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return FlowKt.launchIn(flowOnEach, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
    }

    public static /* synthetic */ Job observeState$default(StateFlow stateFlow, ComponentActivity componentActivity, Lifecycle.State state, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return copydefault(stateFlow, componentActivity, state, function2);
    }

    public static final <T> Job copydefault(@NotNull StateFlow<? extends T> stateFlow, @NotNull ComponentActivity componentActivity, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(stateFlow, "");
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Lifecycle lifecycle = componentActivity.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        return FlowKt.launchIn(FlowKt.onEach(FlowKt.distinctUntilChanged(FlowExtKt.flowWithLifecycle(stateFlow, lifecycle, state)), new FlowObserveExtensionKt$observeState$2(function2, null)), LifecycleOwnerKt.getLifecycleScope(componentActivity));
    }
}
