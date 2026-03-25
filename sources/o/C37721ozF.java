package o;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.im.imui.utils.LifecycleExtKt$collectOnLifecycle$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ozF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37721ozF {
    public static final <T> MutableSharedFlow<T> AEQbTJ() {
        return SharedFlowKt.MutableSharedFlow(0, 1, BufferOverflow.DROP_OLDEST);
    }

    public static final <T> MutableSharedFlow<T> copydefault() {
        return SharedFlowKt.MutableSharedFlow(1, 0, BufferOverflow.DROP_OLDEST);
    }

    public static /* synthetic */ void collectOnLifecycle$default(Flow flow, LifecycleOwner lifecycleOwner, Lifecycle.State state, yHO yho, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        EZpvd(flow, lifecycleOwner, state, yho);
    }

    public static final <T> void EZpvd(@NotNull Flow<? extends T> flow, @NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.State state, @NotNull yHO<? super CoroutineScope, ? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(yho, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new LifecycleExtKt$collectOnLifecycle$1(lifecycleOwner, state, flow, yho, null), 3, null);
    }

    public static /* synthetic */ void collectOnLifecycle$default(Flow flow, android.view.View view, Lifecycle.State state, yHO yho, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        OLrzqt(flow, view, state, yho);
    }

    public static final <T> void OLrzqt(@NotNull Flow<? extends T> flow, @NotNull android.view.View view, @NotNull Lifecycle.State state, @NotNull yHO<? super CoroutineScope, ? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(yho, "");
        if (ViewCompat.isAttachedToWindow(view)) {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
            if (lifecycleOwner != null) {
                EZpvd(flow, lifecycleOwner, state, yho);
                return;
            }
            return;
        }
        view.addOnAttachStateChangeListener(new Application(view, view, flow, state, yho));
    }

    /* JADX INFO: renamed from: o.ozF$Application */
    public static final class Application implements View.OnAttachStateChangeListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ yHO KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ Lifecycle.State copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public Application(android.view.View view, android.view.View view2, Flow flow, Lifecycle.State state, yHO yho) {
            this.AEQbTJ = view;
            this.OLrzqt = view2;
            this.EZpvd = flow;
            this.copydefault = state;
            this.KWHzl = yho;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ.removeOnAttachStateChangeListener(this);
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this.OLrzqt);
            if (lifecycleOwner != null) {
                C37721ozF.EZpvd(this.EZpvd, lifecycleOwner, this.copydefault, this.KWHzl);
            }
        }
    }
}
