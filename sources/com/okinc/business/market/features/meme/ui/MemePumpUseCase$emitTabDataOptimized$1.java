package com.okinc.business.market.features.meme.ui;

import com.okinc.business.market.features.meme.ui.MemePumpUseCase;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C28635keW;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes7.dex */
public final class MemePumpUseCase$emitTabDataOptimized$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $tabIndex;
    final /* synthetic */ List<C28635keW> $tokens;
    final /* synthetic */ MemePumpUseCase.UpdateType $updateType;
    int label;
    final /* synthetic */ MemePumpUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemePumpUseCase$emitTabDataOptimized$1(MemePumpUseCase memePumpUseCase, int i, List<C28635keW> list, MemePumpUseCase.UpdateType updateType, Continuation<? super MemePumpUseCase$emitTabDataOptimized$1> continuation) {
        super(2, continuation);
        this.this$0 = memePumpUseCase;
        this.$tabIndex = i;
        this.$tokens = list;
        this.$updateType = updateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemePumpUseCase$emitTabDataOptimized$1(this.this$0, this.$tabIndex, this.$tokens, this.$updateType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemePumpUseCase$emitTabDataOptimized$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<C28635keW> listOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(100L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (!Intrinsics.EZpvd(this.this$0.ejfBZ.get(C56443yFo.AEQbTJ(this.$tabIndex)), C56443yFo.KWHzl(true))) {
            listOLrzqt = (List) this.this$0.getNewProxyInstance.get(C56443yFo.AEQbTJ(this.$tabIndex));
            if (listOLrzqt == null) {
                listOLrzqt = this.$tokens;
            }
        } else {
            listOLrzqt = this.this$0.OLrzqt(this.$tabIndex, this.$tokens);
            this.this$0.getNewProxyInstance.put(C56443yFo.AEQbTJ(this.$tabIndex), listOLrzqt);
            this.this$0.ejfBZ.put(C56443yFo.AEQbTJ(this.$tabIndex), C56443yFo.KWHzl(false));
        }
        this.this$0.AEQbTJ(this.$tabIndex, (List<C28635keW>) listOLrzqt, this.$updateType);
        return Unit.INSTANCE;
    }
}
