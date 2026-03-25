package com.okinc.dexkline.market.features.position.ui;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34457ncT;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC32389mcE;
import o.xHC;

/* JADX INFO: loaded from: classes8.dex */
public final class PositionsViewModel$getTokenBalanceAndLatestPnL$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ PositionsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsViewModel$getTokenBalanceAndLatestPnL$1(PositionsViewModel positionsViewModel, Continuation<? super PositionsViewModel$getTokenBalanceAndLatestPnL$1> continuation) {
        super(2, continuation);
        this.this$0 = positionsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionsViewModel$getTokenBalanceAndLatestPnL$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionsViewModel$getTokenBalanceAndLatestPnL$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AhwBna.setValue(new C34457ncT(true, false, null, null, null, 30, null));
            InterfaceC32389mcE interfaceC32389mcEDbNXlk = this.this$0.DbNXlk();
            String chainId = this.this$0.AuCTel.getChainId();
            String tokenAddress = this.this$0.AuCTel.getTokenAddress();
            this.label = 1;
            objKWHzl = interfaceC32389mcEDbNXlk.KWHzl(chainId, tokenAddress, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj2;
                PositionsViewModel positionsViewModel = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
                if (thM7380exceptionOrNullimpl != null) {
                    positionsViewModel.AhwBna.setValue(new C34457ncT(false, false, null, null, thM7380exceptionOrNullimpl, 13, null));
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        PositionsViewModel positionsViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            xHC.ActionBar actionBar = (xHC.ActionBar) objKWHzl;
            positionsViewModel2.values = actionBar;
            positionsViewModel2.copydefault(actionBar);
            this.L$0 = objKWHzl;
            this.label = 2;
            if (positionsViewModel2.AEQbTJ(this) == objCopydefault) {
                return objCopydefault;
            }
            obj2 = objKWHzl;
            objKWHzl = obj2;
        }
        PositionsViewModel positionsViewModel3 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
