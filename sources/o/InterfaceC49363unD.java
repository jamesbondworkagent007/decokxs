package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import o.InterfaceC49361unB;
import o.InterfaceC49362unC;
import o.InterfaceC49364unE;
import o.InterfaceC49367unH;
import o.InterfaceC49370unK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49363unD extends InterfaceC49362unC, InterfaceC49361unB, InterfaceC49364unE, InterfaceC49370unK, LifecycleOwner, InterfaceC49367unH {

    /* JADX INFO: renamed from: o.unD$ActionBar */
    public static final class ActionBar {
        public static <T extends InterfaceC49369unJ<T>> java.lang.Object AEQbTJ(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Flow<? extends T>> continuation) {
            return InterfaceC49370unK.ActionBar.AEQbTJ(interfaceC49363unD, abstractC49411unz, state, function2, continuation);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B> java.lang.Object AEQbTJ(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho, @NotNull Continuation<? super Unit> continuation) {
            java.lang.Object objOLrzqt = InterfaceC49367unH.TaskDescription.OLrzqt(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, yho, continuation);
            return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C> java.lang.Object AEQbTJ(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Continuation<? super Triple<? extends A, ? extends B, ? extends C>> continuation) {
            return InterfaceC49367unH.TaskDescription.AEQbTJ(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, continuation);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E> java.lang.Object AEQbTJ(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq, @NotNull Continuation<? super Unit> continuation) {
            java.lang.Object objKWHzl = InterfaceC49367unH.TaskDescription.KWHzl(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, yhq, continuation);
            return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
        }

        public static <T extends InterfaceC49369unJ<T>> Job AEQbTJ(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(function2, "");
            return InterfaceC49361unB.Activity.OLrzqt(interfaceC49363unD, abstractC49411unz, state, function2);
        }

        public static <T extends InterfaceC49369unJ<T>, A> Job AEQbTJ(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(function2, "");
            return InterfaceC49364unE.Activity.AEQbTJ(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, state, function2);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C> Job AEQbTJ(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yht, "");
            return InterfaceC49361unB.Activity.AEQbTJ(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Job AEQbTJ(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx5, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yhq, "");
            return InterfaceC49364unE.Activity.AEQbTJ(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
        }

        public static <T extends InterfaceC49369unJ<T>, A> Flow<A> AEQbTJ(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            return InterfaceC49362unC.Application.KWHzl(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B> Flow<kotlin.Pair<A, B>> AEQbTJ(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yho, "");
            return InterfaceC49370unK.ActionBar.copydefault(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B> java.lang.Object EZpvd(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Continuation<? super kotlin.Pair<? extends A, ? extends B>> continuation) {
            return InterfaceC49367unH.TaskDescription.AEQbTJ(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, continuation);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D> java.lang.Object EZpvd(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Continuation<? super Quartet<? extends A, ? extends B, ? extends C, ? extends D>> continuation) {
            return InterfaceC49367unH.TaskDescription.copydefault(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, continuation);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D> java.lang.Object EZpvd(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs, @NotNull Continuation<? super Unit> continuation) {
            java.lang.Object objAEQbTJ = InterfaceC49367unH.TaskDescription.AEQbTJ(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, yhs, continuation);
            return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
        }

        public static <T extends InterfaceC49369unJ<T>, A, B> Job EZpvd(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yho, "");
            return InterfaceC49364unE.Activity.copydefault(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D> Job EZpvd(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yhs, "");
            return InterfaceC49361unB.Activity.OLrzqt(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Job EZpvd(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx5, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx6, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yhr, "");
            return InterfaceC49364unE.Activity.AEQbTJ(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D> Flow<Quartet<A, B, C, D>> EZpvd(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
            return InterfaceC49362unC.Application.EZpvd(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Flow<Quintet<A, B, C, D, E>> EZpvd(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx5, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yhq, "");
            return InterfaceC49370unK.ActionBar.EZpvd(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Flow<Sextet<A, B, C, D, E, F>> EZpvd(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx5, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx6, "");
            return InterfaceC49362unC.Application.KWHzl(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6);
        }

        public static <T extends InterfaceC49369unJ<T>, A> java.lang.Object KWHzl(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Unit> continuation) {
            java.lang.Object objEZpvd = InterfaceC49367unH.TaskDescription.EZpvd(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, function2, continuation);
            return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E> java.lang.Object KWHzl(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Continuation<? super Quintet<? extends A, ? extends B, ? extends C, ? extends D, ? extends E>> continuation) {
            return InterfaceC49367unH.TaskDescription.KWHzl(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, continuation);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Job KWHzl(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull Lifecycle.State state, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx5, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yhq, "");
            return InterfaceC49361unB.Activity.EZpvd(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, state, yhq);
        }

        public static <T extends InterfaceC49369unJ<T>, A> Flow<A> KWHzl(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(function2, "");
            return InterfaceC49370unK.ActionBar.copydefault(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, state, function2);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C> Flow<Triple<A, B, C>> KWHzl(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            return InterfaceC49362unC.Application.KWHzl(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D> Flow<Quartet<A, B, C, D>> KWHzl(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yhs, "");
            return InterfaceC49370unK.ActionBar.KWHzl(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Flow<Sextet<A, B, C, D, E, F>> KWHzl(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx5, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx6, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yhr, "");
            return InterfaceC49370unK.ActionBar.KWHzl(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
        }

        public static <T extends InterfaceC49369unJ<T>, A> java.lang.Object OLrzqt(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Continuation<? super A> continuation) {
            return InterfaceC49367unH.TaskDescription.copydefault(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, continuation);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C> java.lang.Object OLrzqt(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht, @NotNull Continuation<? super Unit> continuation) {
            java.lang.Object objEZpvd = InterfaceC49367unH.TaskDescription.EZpvd(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, yht, continuation);
            return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
        }

        public static <T extends InterfaceC49369unJ<T>, A, B> Job OLrzqt(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull Lifecycle.State state, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yho, "");
            return InterfaceC49361unB.Activity.KWHzl(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, state, yho);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D> Job OLrzqt(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull Lifecycle.State state, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yhs, "");
            return InterfaceC49364unE.Activity.EZpvd(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, state, yhs);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B> Flow<kotlin.Pair<A, B>> OLrzqt(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            return InterfaceC49362unC.Application.KWHzl(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C> Flow<Triple<A, B, C>> OLrzqt(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yht, "");
            return InterfaceC49370unK.ActionBar.KWHzl(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
        }

        public static <T extends InterfaceC49369unJ<T>> java.lang.Object copydefault(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Continuation<? super T> continuation) {
            return InterfaceC49367unH.TaskDescription.AEQbTJ(interfaceC49363unD, abstractC49411unz, continuation);
        }

        public static <T extends InterfaceC49369unJ<T>> java.lang.Object copydefault(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Unit> continuation) {
            java.lang.Object objCopydefault = InterfaceC49367unH.TaskDescription.copydefault(interfaceC49363unD, abstractC49411unz, function2, continuation);
            return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
        }

        public static <T extends InterfaceC49369unJ<T>, V> java.lang.Object copydefault(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends InterfaceC49371unL<? extends V>> interfaceC56560yJx, @NotNull Continuation<? super V> continuation) {
            return InterfaceC49367unH.TaskDescription.AEQbTJ(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, continuation);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> java.lang.Object copydefault(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Continuation<? super Sextet<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends F>> continuation) {
            return InterfaceC49367unH.TaskDescription.OLrzqt(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, continuation);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> java.lang.Object copydefault(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr, @NotNull Continuation<? super Unit> continuation) {
            java.lang.Object objAEQbTJ = InterfaceC49367unH.TaskDescription.AEQbTJ(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, yhr, continuation);
            return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
        }

        public static <T extends InterfaceC49369unJ<T>> Job copydefault(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Lifecycle.State state, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(function2, "");
            return InterfaceC49364unE.Activity.KWHzl(interfaceC49363unD, abstractC49411unz, state, function2);
        }

        public static <T extends InterfaceC49369unJ<T>, A> Job copydefault(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Lifecycle.State state, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(function2, "");
            return InterfaceC49361unB.Activity.KWHzl(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, state, function2);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C> Job copydefault(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull Lifecycle.State state, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yht, "");
            return InterfaceC49364unE.Activity.KWHzl(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, state, yht);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Job copydefault(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull Lifecycle.State state, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx5, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx6, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(yhr, "");
            return InterfaceC49361unB.Activity.copydefault(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6, state, yhr);
        }

        public static <T extends InterfaceC49369unJ<T>> Flow<T> copydefault(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            return InterfaceC49362unC.Application.OLrzqt(interfaceC49363unD, abstractC49411unz);
        }

        public static <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Flow<Quintet<A, B, C, D, E>> copydefault(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5) {
            Intrinsics.checkNotNullParameter(abstractC49411unz, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
            Intrinsics.checkNotNullParameter(interfaceC56560yJx5, "");
            return InterfaceC49362unC.Application.copydefault(interfaceC49363unD, abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5);
        }
    }
}
