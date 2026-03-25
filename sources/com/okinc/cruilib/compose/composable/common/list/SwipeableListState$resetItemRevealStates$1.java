package com.okinc.cruilib.compose.composable.common.list;

import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.mDT;

/* JADX INFO: loaded from: classes23.dex */
public final class SwipeableListState$resetItemRevealStates$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Set<Id> $itemIds;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ mDT<Id, Item> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Set<? extends Id> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableListState$resetItemRevealStates$1(Set<? extends Id> set, mDT<Id, Item> mdt, Continuation<? super SwipeableListState$resetItemRevealStates$1> continuation) {
        super(2, continuation);
        this.$itemIds = set;
        this.this$0 = mdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwipeableListState$resetItemRevealStates$1(this.$itemIds, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwipeableListState$resetItemRevealStates$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        mDT mdt;
        Iterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Iterable iterable = this.$itemIds;
            mdt = this.this$0;
            it = iterable.iterator();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            mdt = (mDT) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            this.L$0 = mdt;
            this.L$1 = it;
            this.label = 1;
            if (mdt.KWHzl(next, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
