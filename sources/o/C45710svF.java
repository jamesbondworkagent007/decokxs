package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.okex.lite.hero.util.FragmentUtilsKt$collectOnLifecycle$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.svF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45710svF {
    public static /* synthetic */ void collectOnLifecycle$default(Flow flow, LifecycleOwner lifecycleOwner, Lifecycle.State state, yHO yho, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        OLrzqt(flow, lifecycleOwner, state, yho);
    }

    /* JADX INFO: renamed from: o.svF$StateListAnimator */
    public static final class StateListAnimator extends AbstractC56429yFa implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
        }

        public StateListAnimator(CoroutineExceptionHandler.Key key) {
            super(key);
        }
    }

    public static final <T> void OLrzqt(@NotNull Flow<? extends T> flow, @NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.State state, @NotNull yHO<? super CoroutineScope, ? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(yho, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), new StateListAnimator(CoroutineExceptionHandler.Key), null, new FragmentUtilsKt$collectOnLifecycle$1(lifecycleOwner, state, flow, yho, null), 2, null);
    }
}
