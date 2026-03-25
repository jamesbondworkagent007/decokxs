package o;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.auth.impl.util.FlowObserveExtensionKt$observeEvent$1;
import com.okinc.auth.impl.util.FlowObserveExtensionKt$observeEvent$2;
import com.okinc.auth.impl.util.FlowObserveExtensionKt$observeState$1;
import com.okinc.auth.impl.util.FlowObserveExtensionKt$observeState$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aUB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6690aUB {
    public static /* synthetic */ Job observeState$default(StateFlow stateFlow, androidx.fragment.app.Fragment fragment, Lifecycle.State state, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return AEQbTJ(stateFlow, fragment, state, function2);
    }

    public static final <T> Job AEQbTJ(@NotNull StateFlow<? extends T> stateFlow, @NotNull androidx.fragment.app.Fragment fragment, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(stateFlow, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Flow flowOnEach = FlowKt.onEach(FlowKt.distinctUntilChanged(FlowExtKt.flowWithLifecycle(stateFlow, fragment.getViewLifecycleOwner().getLifecycle(), state)), new FlowObserveExtensionKt$observeState$1(function2, null));
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return FlowKt.launchIn(flowOnEach, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
    }

    public static final <T> Job KWHzl(@NotNull SharedFlow<? extends T> sharedFlow, @NotNull androidx.fragment.app.Fragment fragment, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(sharedFlow, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Flow flowOnEach = FlowKt.onEach(sharedFlow, new FlowObserveExtensionKt$observeEvent$1(function2, null));
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

    public static final <T> Job AEQbTJ(@NotNull SharedFlow<? extends T> sharedFlow, @NotNull ComponentActivity componentActivity, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(sharedFlow, "");
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(function2, "");
        return FlowKt.launchIn(FlowKt.onEach(sharedFlow, new FlowObserveExtensionKt$observeEvent$2(function2, null)), LifecycleOwnerKt.getLifecycleScope(componentActivity));
    }
}
