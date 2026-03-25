package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.tradingbot.impl.widget.compose.LifecycleKt$collectAsStateWithLifecycle$1$1;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wWm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52737wWm {
    public static final <T> androidx.compose.runtime.State<T> OLrzqt(@NotNull StateFlow<? extends T> stateFlow, LifecycleOwner lifecycleOwner, Lifecycle.State state, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(stateFlow, "");
        composer.startReplaceableGroup(-1527817441);
        if ((i2 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        }
        if ((i2 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i2 & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1527817441, i, -1, "com.okinc.tradingbot.impl.widget.compose.collectAsStateWithLifecycle (Lifecycle.kt:22)");
        }
        T value = stateFlow.getValue();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        int i3 = i << 3;
        androidx.compose.runtime.State<T> stateCopydefault = copydefault(stateFlow, value, lifecycle, state2, coroutineContext2, composer, (i & 14) | (i3 & 7168) | (i3 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateCopydefault;
    }

    public static final <T> androidx.compose.runtime.State<T> copydefault(@NotNull Flow<? extends T> flow, T t, @NotNull Lifecycle lifecycle, Lifecycle.State state, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(lifecycle, "");
        composer.startReplaceableGroup(1064498567);
        if ((i2 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i2 & 8) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1064498567, i, -1, "com.okinc.tradingbot.impl.widget.compose.collectAsStateWithLifecycle (Lifecycle.kt:35)");
        }
        java.lang.Object[] objArr = {flow, lifecycle, state2, coroutineContext2};
        composer.startReplaceableGroup(-287884329);
        boolean zChangedInstance = composer.changedInstance(lifecycle);
        boolean z = (((i & 7168) ^ 3072) > 2048 && composer.changed(state2)) || (i & 3072) == 2048;
        boolean zChangedInstance2 = composer.changedInstance(coroutineContext2);
        boolean zChangedInstance3 = composer.changedInstance(flow);
        java.lang.Object objRememberedValue = composer.rememberedValue();
        if ((zChangedInstance | z | zChangedInstance2 | zChangedInstance3) || objRememberedValue == Composer.Companion.getEmpty()) {
            LifecycleKt$collectAsStateWithLifecycle$1$1 lifecycleKt$collectAsStateWithLifecycle$1$1 = new LifecycleKt$collectAsStateWithLifecycle$1$1(lifecycle, state2, coroutineContext2, flow, null);
            composer.updateRememberedValue(lifecycleKt$collectAsStateWithLifecycle$1$1);
            objRememberedValue = lifecycleKt$collectAsStateWithLifecycle$1$1;
        }
        composer.endReplaceableGroup();
        int i3 = i >> 3;
        androidx.compose.runtime.State<T> stateProduceState = SnapshotStateKt.produceState((java.lang.Object) t, objArr, (Function2) objRememberedValue, composer, (i3 & 8) | (i3 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateProduceState;
    }
}
