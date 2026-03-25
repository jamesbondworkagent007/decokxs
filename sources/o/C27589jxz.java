package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.okinc.business.invest_biz.utils.LifecycleExtKt$collectOnLifecycle$1;
import com.okinc.business.invest_biz.utils.LifecycleExtKt$viewLifecycle$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jxz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27589jxz {

    /* JADX INFO: renamed from: o.jxz$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public static /* synthetic */ Job collectOnLifecycle$default(LifecycleOwner lifecycleOwner, Flow flow, Lifecycle.State state, FlowCollector flowCollector, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return AEQbTJ(lifecycleOwner, flow, state, flowCollector);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jwI.safeLaunch$default(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart, kotlin.jvm.functions.Function2, int, java.lang.Object):kotlinx.coroutines.Job */
    public static final <T> Job AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull Flow<? extends T> flow, @NotNull Lifecycle.State state, @NotNull FlowCollector<? super T> flowCollector) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(flowCollector, "");
        return C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new LifecycleExtKt$collectOnLifecycle$1(lifecycleOwner, state, flow, flowCollector, null), 3, null);
    }

    public static /* synthetic */ Job collectOnViewLifecycle$default(androidx.fragment.app.Fragment fragment, Flow flow, Lifecycle.State state, FlowCollector flowCollector, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return EZpvd(fragment, flow, state, flowCollector);
    }

    public static final <T> Job EZpvd(@NotNull androidx.fragment.app.Fragment fragment, @NotNull Flow<? extends T> flow, @NotNull Lifecycle.State state, @NotNull FlowCollector<? super T> flowCollector) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(flowCollector, "");
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return AEQbTJ(viewLifecycleOwner, flow, state, flowCollector);
    }

    public static final <T> yIP<androidx.fragment.app.Fragment, T> EZpvd(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return new LifecycleExtKt$viewLifecycle$1(fragment);
    }
}
