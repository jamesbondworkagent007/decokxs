package com.okinc.cruilib.compose.effect;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C31802mEl;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class UpdatedEffectKt$UpdatedEffect$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ MutableState<Boolean> $updatedOnce$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpdatedEffectKt$UpdatedEffect$1$1(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, MutableState<Boolean> mutableState, Continuation<? super UpdatedEffectKt$UpdatedEffect$1$1> continuation) {
        super(2, continuation);
        this.$block = function2;
        this.$updatedOnce$delegate = mutableState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UpdatedEffectKt$UpdatedEffect$1$1 updatedEffectKt$UpdatedEffect$1$1 = new UpdatedEffectKt$UpdatedEffect$1$1(this.$block, this.$updatedOnce$delegate, continuation);
        updatedEffectKt$UpdatedEffect$1$1.L$0 = obj;
        return updatedEffectKt$UpdatedEffect$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UpdatedEffectKt$UpdatedEffect$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            if (!C31802mEl.AEQbTJ(this.$updatedOnce$delegate)) {
                C31802mEl.KWHzl(this.$updatedOnce$delegate, true);
            } else {
                Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$block;
                this.label = 1;
                if (function2.invoke(coroutineScope, this) == objCopydefault) {
                    return objCopydefault;
                }
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
