package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.trade.arch.ui.IUiCollectable2$collectLatestWhenLifecycle$10;
import com.okinc.trade.arch.ui.IUiCollectable2$collectLatestWhenLifecycle$12;
import com.okinc.trade.arch.ui.IUiCollectable2$collectLatestWhenLifecycle$14;
import com.okinc.trade.arch.ui.IUiCollectable2$collectLatestWhenLifecycle$2;
import com.okinc.trade.arch.ui.IUiCollectable2$collectLatestWhenLifecycle$4;
import com.okinc.trade.arch.ui.IUiCollectable2$collectLatestWhenLifecycle$6;
import com.okinc.trade.arch.ui.IUiCollectable2$collectLatestWhenLifecycle$8;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49364unE extends LifecycleOwner {
    <T extends InterfaceC49369unJ<T>> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2);

    <T extends InterfaceC49369unJ<T>, A> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2);

    <T extends InterfaceC49369unJ<T>, A, B> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho);

    <T extends InterfaceC49369unJ<T>, A, B, C> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht);

    <T extends InterfaceC49369unJ<T>, A, B, C, D> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs);

    <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq);

    <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Job collectLatestWhenLifecycle(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr);

    /* JADX INFO: renamed from: o.unE$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        public static /* synthetic */ Job collectLatestWhenLifecycle$default(InterfaceC49364unE interfaceC49364unE, AbstractC49411unz abstractC49411unz, Lifecycle.State state, Function2 function2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectLatestWhenLifecycle");
            }
            if ((i & 1) != 0) {
                state = Lifecycle.State.RESUMED;
            }
            return interfaceC49364unE.collectLatestWhenLifecycle(abstractC49411unz, state, function2);
        }

        public static <T extends InterfaceC49369unJ<T>> Job KWHzl(@NotNull InterfaceC49364unE interfaceC49364unE, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(function2, "");
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(state);
            }
            return C49365unF.KWHzl(interfaceC49364unE, state, new IUiCollectable2$collectLatestWhenLifecycle$2(abstractC49411unz, function2, null));
        }

        public static /* synthetic */ Job collectLatestWhenLifecycle$default(InterfaceC49364unE interfaceC49364unE, AbstractC49411unz abstractC49411unz, InterfaceC56560yJx interfaceC56560yJx, Lifecycle.State state, Function2 function2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectLatestWhenLifecycle");
            }
            if ((i & 2) != 0) {
                state = Lifecycle.State.RESUMED;
            }
            return interfaceC49364unE.collectLatestWhenLifecycle(abstractC49411unz, interfaceC56560yJx, state, function2);
        }

        public static <T extends InterfaceC49369unJ<T>, A> Job AEQbTJ(@NotNull InterfaceC49364unE interfaceC49364unE, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(function2, "");
            if (C49372unM.AEQbTJ.copydefault()) {
                Objects.toString(state);
                Objects.toString(interfaceC56560yJx);
            }
            return C49365unF.KWHzl(interfaceC49364unE, state, new IUiCollectable2$collectLatestWhenLifecycle$4(abstractC49411unz, interfaceC56560yJx, function2, null));
        }

        public static /* synthetic */ Job collectLatestWhenLifecycle$default(InterfaceC49364unE interfaceC49364unE, AbstractC49411unz abstractC49411unz, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, Lifecycle.State state, yHO yho, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectLatestWhenLifecycle");
            }
            if ((i & 4) != 0) {
                state = Lifecycle.State.RESUMED;
            }
            return interfaceC49364unE.collectLatestWhenLifecycle(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B> Job copydefault(@NotNull InterfaceC49364unE interfaceC49364unE, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
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
            return C49365unF.KWHzl(interfaceC49364unE, state, new IUiCollectable2$collectLatestWhenLifecycle$6(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, yho, null));
        }

        public static /* synthetic */ Job collectLatestWhenLifecycle$default(InterfaceC49364unE interfaceC49364unE, AbstractC49411unz abstractC49411unz, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, Lifecycle.State state, yHT yht, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectLatestWhenLifecycle");
            }
            if ((i & 8) != 0) {
                state = Lifecycle.State.RESUMED;
            }
            return interfaceC49364unE.collectLatestWhenLifecycle(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C> Job KWHzl(@NotNull InterfaceC49364unE interfaceC49364unE, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
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
            return C49365unF.KWHzl(interfaceC49364unE, state, new IUiCollectable2$collectLatestWhenLifecycle$8(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, yht, null));
        }

        public static /* synthetic */ Job collectLatestWhenLifecycle$default(InterfaceC49364unE interfaceC49364unE, AbstractC49411unz abstractC49411unz, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, Lifecycle.State state, yHS yhs, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC49364unE.collectLatestWhenLifecycle(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, (i & 16) != 0 ? Lifecycle.State.RESUMED : state, yhs);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectLatestWhenLifecycle");
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D> Job EZpvd(@NotNull InterfaceC49364unE interfaceC49364unE, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs) {
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
            return C49365unF.KWHzl(interfaceC49364unE, state, new IUiCollectable2$collectLatestWhenLifecycle$10(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, yhs, null));
        }

        public static /* synthetic */ Job collectLatestWhenLifecycle$default(InterfaceC49364unE interfaceC49364unE, AbstractC49411unz abstractC49411unz, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, InterfaceC56560yJx interfaceC56560yJx5, Lifecycle.State state, yHQ yhq, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC49364unE.collectLatestWhenLifecycle(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, (i & 32) != 0 ? Lifecycle.State.RESUMED : state, yhq);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectLatestWhenLifecycle");
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Job AEQbTJ(@NotNull InterfaceC49364unE interfaceC49364unE, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq) {
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
            return C49365unF.KWHzl(interfaceC49364unE, state, new IUiCollectable2$collectLatestWhenLifecycle$12(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, yhq, null));
        }

        public static /* synthetic */ Job collectLatestWhenLifecycle$default(InterfaceC49364unE interfaceC49364unE, AbstractC49411unz abstractC49411unz, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, InterfaceC56560yJx interfaceC56560yJx5, InterfaceC56560yJx interfaceC56560yJx6, Lifecycle.State state, yHR yhr, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC49364unE.collectLatestWhenLifecycle(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, (i & 64) != 0 ? Lifecycle.State.RESUMED : state, yhr);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectLatestWhenLifecycle");
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Job AEQbTJ(@NotNull InterfaceC49364unE interfaceC49364unE, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr) {
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
            return C49365unF.KWHzl(interfaceC49364unE, state, new IUiCollectable2$collectLatestWhenLifecycle$14(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, yhr, null));
        }
    }
}
