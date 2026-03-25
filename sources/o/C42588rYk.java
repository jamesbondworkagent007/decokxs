package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.common.utils.LifecycleExtKt$collectLatestOnLifecycle$1;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.common.utils.LifecycleExtKt$collectOnLifecycle$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rYk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C42588rYk {
    public static /* synthetic */ void collectOnLifecycle$default(Flow flow, LifecycleOwner lifecycleOwner, Lifecycle.State state, yHO yho, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        AEQbTJ(flow, lifecycleOwner, state, yho);
    }

    public static final <T> void AEQbTJ(@NotNull Flow<? extends T> flow, @NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.State state, @NotNull yHO<? super CoroutineScope, ? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(yho, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new LifecycleExtKt$collectOnLifecycle$1(lifecycleOwner, state, flow, yho, null), 3, null);
    }

    public static /* synthetic */ void collectLatestOnLifecycle$default(Flow flow, LifecycleOwner lifecycleOwner, Lifecycle.State state, yHO yho, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        copydefault(flow, lifecycleOwner, state, yho);
    }

    public static final <T> void copydefault(@NotNull Flow<? extends T> flow, @NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.State state, @NotNull yHO<? super CoroutineScope, ? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(yho, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new LifecycleExtKt$collectLatestOnLifecycle$1(lifecycleOwner, state, flow, yho, null), 3, null);
    }
}
