package com.okinc.business.market.features.position.ui;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28434kah;
import o.C28443kaq;
import o.C29092knC;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class PositionsViewModel$loadActivePositions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLoading;
    int label;
    final /* synthetic */ PositionsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsViewModel$loadActivePositions$1(PositionsViewModel positionsViewModel, boolean z, Continuation<? super PositionsViewModel$loadActivePositions$1> continuation) {
        super(2, continuation);
        this.this$0 = positionsViewModel;
        this.$isLoading = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionsViewModel$loadActivePositions$1(this.this$0, this.$isLoading, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionsViewModel$loadActivePositions$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8660invokeBWLJW6A$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.fARcdN();
            if (this.$isLoading) {
                this.this$0.AEQbTJ.setValue(new C29092knC(true, null, null, false, 0L, 30, null));
            }
            C28434kah c28434kah = this.this$0.valueOf;
            C28443kaq c28443kaq = (C28443kaq) this.this$0.EZpvd.getValue();
            this.label = 1;
            objM8660invokeBWLJW6A$default = C28434kah.m8660invokeBWLJW6A$default(c28434kah, null, false, c28443kaq, this, 1, null);
            if (objM8660invokeBWLJW6A$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8660invokeBWLJW6A$default = ((Result) obj).m7386unboximpl();
        }
        PositionsViewModel positionsViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objM8660invokeBWLJW6A$default)) {
            positionsViewModel.copydefault(new C29092knC(false, (List) objM8660invokeBWLJW6A$default, null, false, 0L, 29, null));
            positionsViewModel.fJNWhG();
        }
        PositionsViewModel positionsViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8660invokeBWLJW6A$default);
        if (thM7380exceptionOrNullimpl != null) {
            positionsViewModel2.AEQbTJ.setValue(new C29092knC(false, null, thM7380exceptionOrNullimpl, false, 0L, 27, null));
        }
        return Unit.INSTANCE;
    }
}
