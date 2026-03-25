package com.okinc.business.defi.assets.utxo.utxomanagement;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C10231bkZ;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class InvestUtxoManagementViewModel$checkExplanation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $chainId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InvestUtxoManagementViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUtxoManagementViewModel$checkExplanation$1(InvestUtxoManagementViewModel investUtxoManagementViewModel, long j, Continuation<? super InvestUtxoManagementViewModel$checkExplanation$1> continuation) {
        super(2, continuation);
        this.this$0 = investUtxoManagementViewModel;
        this.$chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUtxoManagementViewModel$checkExplanation$1(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUtxoManagementViewModel$checkExplanation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        InvestUtxoManagementViewModel investUtxoManagementViewModel;
        MutableSharedFlow mutableSharedFlow;
        Unit unit;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C10231bkZ c10231bkZ = this.this$0.values;
            long j = this.$chainId;
            this.label = 1;
            objKWHzl = c10231bkZ.KWHzl(j, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objKWHzl = obj2;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.KWHzl(thM7380exceptionOrNullimpl);
                    }
                    return Unit.INSTANCE;
                }
                investUtxoManagementViewModel = (InvestUtxoManagementViewModel) this.L$1;
                Object obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj3;
                mutableSharedFlow = investUtxoManagementViewModel.copydefault;
                unit = Unit.INSTANCE;
                this.L$0 = objKWHzl;
                this.L$1 = null;
                this.label = 3;
                if (mutableSharedFlow.emit(unit, this) != objCopydefault) {
                    return objCopydefault;
                }
                obj2 = objKWHzl;
                objKWHzl = obj2;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        investUtxoManagementViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl) && ((Boolean) objKWHzl).booleanValue()) {
            this.L$0 = objKWHzl;
            this.L$1 = investUtxoManagementViewModel;
            this.label = 2;
            if (DelayKt.delay(500L, this) == objCopydefault) {
                return objCopydefault;
            }
            mutableSharedFlow = investUtxoManagementViewModel.copydefault;
            unit = Unit.INSTANCE;
            this.L$0 = objKWHzl;
            this.L$1 = null;
            this.label = 3;
            if (mutableSharedFlow.emit(unit, this) != objCopydefault) {
            }
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
