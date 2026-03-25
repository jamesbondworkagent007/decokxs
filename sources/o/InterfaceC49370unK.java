package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import java.util.Objects;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49370unK extends LifecycleOwner {
    <T extends InterfaceC49369unJ<T>> java.lang.Object onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Flow<? extends T>> continuation);

    <T extends InterfaceC49369unJ<T>, A> Flow<A> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2);

    <T extends InterfaceC49369unJ<T>, A, B> Flow<kotlin.Pair<A, B>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho);

    <T extends InterfaceC49369unJ<T>, A, B, C> Flow<Triple<A, B, C>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht);

    <T extends InterfaceC49369unJ<T>, A, B, C, D> Flow<Quartet<A, B, C, D>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs);

    <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Flow<Quintet<A, B, C, D, E>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq);

    <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Flow<Sextet<A, B, C, D, E, F>> onEach(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr);

    /* JADX INFO: renamed from: o.unK$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class ActionBar {
        public static /* synthetic */ java.lang.Object onEach$default(InterfaceC49370unK interfaceC49370unK, AbstractC49411unz abstractC49411unz, Lifecycle.State state, Function2 function2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEach");
            }
            if ((i & 1) != 0) {
                state = Lifecycle.State.RESUMED;
            }
            return interfaceC49370unK.onEach(abstractC49411unz, state, function2, continuation);
        }

        public static <T extends InterfaceC49369unJ<T>> java.lang.Object AEQbTJ(@NotNull InterfaceC49370unK interfaceC49370unK, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Flow<? extends T>> continuation) {
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(state);
            }
            return C49365unF.copydefault(C49360unA.EZpvd(abstractC49411unz, function2), state, interfaceC49370unK);
        }

        public static /* synthetic */ Flow onEach$default(InterfaceC49370unK interfaceC49370unK, AbstractC49411unz abstractC49411unz, InterfaceC56560yJx interfaceC56560yJx, Lifecycle.State state, Function2 function2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEach");
            }
            if ((i & 2) != 0) {
                state = Lifecycle.State.RESUMED;
            }
            return interfaceC49370unK.onEach(abstractC49411unz, interfaceC56560yJx, state, function2);
        }

        public static <T extends InterfaceC49369unJ<T>, A> Flow<A> copydefault(@NotNull InterfaceC49370unK interfaceC49370unK, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(function2, "");
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(state);
                Objects.toString(interfaceC56560yJx);
            }
            return C49365unF.copydefault(C49360unA.KWHzl(abstractC49411unz, interfaceC56560yJx, function2), state, interfaceC49370unK);
        }

        public static /* synthetic */ Flow onEach$default(InterfaceC49370unK interfaceC49370unK, AbstractC49411unz abstractC49411unz, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, Lifecycle.State state, yHO yho, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEach");
            }
            if ((i & 4) != 0) {
                state = Lifecycle.State.RESUMED;
            }
            return interfaceC49370unK.onEach(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B> Flow<kotlin.Pair<A, B>> copydefault(@NotNull InterfaceC49370unK interfaceC49370unK, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yho, "");
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(state);
                Objects.toString(interfaceC56560yJx);
                Objects.toString(interfaceC56560yJx2);
            }
            return C49365unF.copydefault(C49360unA.copydefault(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, yho), state, interfaceC49370unK);
        }

        public static /* synthetic */ Flow onEach$default(InterfaceC49370unK interfaceC49370unK, AbstractC49411unz abstractC49411unz, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, Lifecycle.State state, yHT yht, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEach");
            }
            if ((i & 8) != 0) {
                state = Lifecycle.State.RESUMED;
            }
            return interfaceC49370unK.onEach(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C> Flow<Triple<A, B, C>> KWHzl(@NotNull InterfaceC49370unK interfaceC49370unK, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yht, "");
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(state);
                Objects.toString(interfaceC56560yJx);
                Objects.toString(interfaceC56560yJx2);
                Objects.toString(interfaceC56560yJx3);
            }
            return C49365unF.copydefault(C49360unA.copydefault(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, yht), state, interfaceC49370unK);
        }

        public static /* synthetic */ Flow onEach$default(InterfaceC49370unK interfaceC49370unK, AbstractC49411unz abstractC49411unz, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, Lifecycle.State state, yHS yhs, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC49370unK.onEach(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, (i & 16) != 0 ? Lifecycle.State.RESUMED : state, yhs);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEach");
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D> Flow<Quartet<A, B, C, D>> KWHzl(@NotNull InterfaceC49370unK interfaceC49370unK, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yhs, "");
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(state);
                Objects.toString(interfaceC56560yJx);
                Objects.toString(interfaceC56560yJx2);
                Objects.toString(interfaceC56560yJx3);
                Objects.toString(interfaceC56560yJx4);
            }
            return C49365unF.copydefault(C49360unA.KWHzl(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, yhs), state, interfaceC49370unK);
        }

        public static /* synthetic */ Flow onEach$default(InterfaceC49370unK interfaceC49370unK, AbstractC49411unz abstractC49411unz, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, InterfaceC56560yJx interfaceC56560yJx5, Lifecycle.State state, yHQ yhq, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC49370unK.onEach(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, (i & 32) != 0 ? Lifecycle.State.RESUMED : state, yhq);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEach");
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Flow<Quintet<A, B, C, D, E>> EZpvd(@NotNull InterfaceC49370unK interfaceC49370unK, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx5, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yhq, "");
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(state);
                Objects.toString(interfaceC56560yJx);
                Objects.toString(interfaceC56560yJx2);
                Objects.toString(interfaceC56560yJx3);
                Objects.toString(interfaceC56560yJx4);
                Objects.toString(interfaceC56560yJx5);
            }
            return C49365unF.copydefault(C49360unA.OLrzqt(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, yhq), state, interfaceC49370unK);
        }

        public static /* synthetic */ Flow onEach$default(InterfaceC49370unK interfaceC49370unK, AbstractC49411unz abstractC49411unz, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, InterfaceC56560yJx interfaceC56560yJx5, InterfaceC56560yJx interfaceC56560yJx6, Lifecycle.State state, yHR yhr, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC49370unK.onEach(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, (i & 64) != 0 ? Lifecycle.State.RESUMED : state, yhr);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEach");
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Flow<Sextet<A, B, C, D, E, F>> KWHzl(@NotNull InterfaceC49370unK interfaceC49370unK, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx5, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx6, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yhr, "");
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(state);
                Objects.toString(interfaceC56560yJx);
                Objects.toString(interfaceC56560yJx2);
                Objects.toString(interfaceC56560yJx3);
                Objects.toString(interfaceC56560yJx4);
                Objects.toString(interfaceC56560yJx5);
                Objects.toString(interfaceC56560yJx6);
            }
            return C49365unF.copydefault(C49360unA.EZpvd(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, yhr), state, interfaceC49370unK);
        }
    }
}
