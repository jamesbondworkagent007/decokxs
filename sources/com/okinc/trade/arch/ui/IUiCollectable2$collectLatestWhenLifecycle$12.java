package com.okinc.trade.arch.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC49411unz;
import o.C49360unA;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC56560yJx;
import o.yHQ;

/* JADX INFO: loaded from: classes16.dex */
public final class IUiCollectable2$collectLatestWhenLifecycle$12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ yHQ<A, B, C, D, E, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ InterfaceC56560yJx<T, A> $prop1;
    final /* synthetic */ InterfaceC56560yJx<T, B> $prop2;
    final /* synthetic */ InterfaceC56560yJx<T, C> $prop3;
    final /* synthetic */ InterfaceC56560yJx<T, D> $prop4;
    final /* synthetic */ InterfaceC56560yJx<T, E> $prop5;
    final /* synthetic */ AbstractC49411unz<T> $this_collectLatestWhenLifecycle;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yJx<T, ? extends A> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yJx<T, ? extends B> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.yJx<T, ? extends C> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.yJx<T, ? extends D> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.yJx<T, ? extends E> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IUiCollectable2$collectLatestWhenLifecycle$12(AbstractC49411unz<T> abstractC49411unz, InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends Object> yhq, Continuation<? super IUiCollectable2$collectLatestWhenLifecycle$12> continuation) {
        super(2, continuation);
        this.$this_collectLatestWhenLifecycle = abstractC49411unz;
        this.$prop1 = interfaceC56560yJx;
        this.$prop2 = interfaceC56560yJx2;
        this.$prop3 = interfaceC56560yJx3;
        this.$prop4 = interfaceC56560yJx4;
        this.$prop5 = interfaceC56560yJx5;
        this.$block = yhq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IUiCollectable2$collectLatestWhenLifecycle$12(this.$this_collectLatestWhenLifecycle, this.$prop1, this.$prop2, this.$prop3, this.$prop4, this.$prop5, this.$block, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IUiCollectable2$collectLatestWhenLifecycle$12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC49411unz<T> abstractC49411unz = this.$this_collectLatestWhenLifecycle;
            InterfaceC56560yJx<T, A> interfaceC56560yJx = this.$prop1;
            InterfaceC56560yJx<T, B> interfaceC56560yJx2 = this.$prop2;
            InterfaceC56560yJx<T, C> interfaceC56560yJx3 = this.$prop3;
            InterfaceC56560yJx<T, D> interfaceC56560yJx4 = this.$prop4;
            InterfaceC56560yJx<T, E> interfaceC56560yJx5 = this.$prop5;
            yHQ<A, B, C, D, E, Continuation<? super Unit>, Object> yhq = this.$block;
            this.label = 1;
            if (C49360unA.KWHzl(abstractC49411unz, interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, yhq, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
