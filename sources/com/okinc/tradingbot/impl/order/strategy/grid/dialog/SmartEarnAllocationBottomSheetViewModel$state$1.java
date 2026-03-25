package com.okinc.tradingbot.impl.order.strategy.grid.dialog;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C50503vQv;
import o.C50544vSi;
import o.C56391yDq;
import o.C56442yFn;
import o.C56547yJk;
import o.xMJ;
import o.yHO;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartEarnAllocationBottomSheetViewModel$state$1 extends SuspendLambda implements yHO<C50503vQv.ActionBar, xMJ.Application, Continuation<? super C50503vQv.FragmentManager>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ C50503vQv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartEarnAllocationBottomSheetViewModel$state$1(C50503vQv c50503vQv, Continuation<? super SmartEarnAllocationBottomSheetViewModel$state$1> continuation) {
        super(3, continuation);
        this.this$0 = c50503vQv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(C50503vQv.ActionBar actionBar, xMJ.Application application, Continuation<? super C50503vQv.FragmentManager> continuation) {
        SmartEarnAllocationBottomSheetViewModel$state$1 smartEarnAllocationBottomSheetViewModel$state$1 = new SmartEarnAllocationBottomSheetViewModel$state$1(this.this$0, continuation);
        smartEarnAllocationBottomSheetViewModel$state$1.L$0 = actionBar;
        smartEarnAllocationBottomSheetViewModel$state$1.L$1 = application;
        return smartEarnAllocationBottomSheetViewModel$state$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C50503vQv.ActionBar actionBar;
        xMJ.Application application;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            actionBar = (C50503vQv.ActionBar) this.L$0;
            xMJ.Application application2 = (xMJ.Application) this.L$1;
            C50544vSi c50544vSi = this.this$0.gEmmrt;
            C50544vSi.StateListAnimator stateListAnimator = new C50544vSi.StateListAnimator(C56547yJk.EZpvd((Comparable) this.this$0.gEmmrt().getFirst(), (Comparable) this.this$0.gEmmrt().getSecond()), actionBar.KWHzl(), application2.AYXKKw(), actionBar.OLrzqt(), actionBar.AEQbTJ(), this.this$0.valueOf());
            this.L$0 = actionBar;
            this.L$1 = application2;
            this.label = 1;
            Object objKWHzl = c50544vSi.KWHzl(stateListAnimator, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            application = application2;
            obj = objKWHzl;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (xMJ.Application) this.L$1;
            actionBar = (C50503vQv.ActionBar) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C50544vSi.TaskDescription taskDescription = (C50544vSi.TaskDescription) obj;
        return new C50503vQv.FragmentManager(actionBar.EZpvd(), actionBar.KWHzl(), application.AYXKKw(), taskDescription.copydefault(), taskDescription.EZpvd(), taskDescription.OLrzqt(), new C50503vQv.TaskDescription(taskDescription.KWHzl(), taskDescription.AEQbTJ()));
    }
}
