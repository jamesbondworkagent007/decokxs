package com.okinc.business.dex.trade.copytrading.edit.ui.activity;

import android.content.Intent;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C23274hvD;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC19870gSj;

/* JADX INFO: loaded from: classes18.dex */
public final class CopyTradingEditStrategyActivity$bindConfirmButton$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CopyTradingEditStrategyActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyActivity$bindConfirmButton$2(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, Continuation<? super CopyTradingEditStrategyActivity$bindConfirmButton$2> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingEditStrategyActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyActivity$bindConfirmButton$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingEditStrategyActivity$bindConfirmButton$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<InterfaceC19870gSj> stateFlowIsConnected = this.this$0.gEmmrt().isConnected();
            final CopyTradingEditStrategyActivity copyTradingEditStrategyActivity = this.this$0;
            FlowCollector<? super InterfaceC19870gSj> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$bindConfirmButton$2.1
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(InterfaceC19870gSj interfaceC19870gSj, Continuation<? super Unit> continuation) {
                    if (interfaceC19870gSj instanceof InterfaceC19870gSj.Application) {
                        InterfaceC19870gSj.Application application = (InterfaceC19870gSj.Application) interfaceC19870gSj;
                        String strCopydefault = application.copydefault();
                        if (strCopydefault == null || strCopydefault.length() == 0) {
                            C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.UscePu, 0, 1, (Object) null);
                        } else {
                            C55326xho.toastWithFailedIcon$default(application.copydefault(), 0, 1, (Object) null);
                        }
                    } else if (!Intrinsics.EZpvd(interfaceC19870gSj, InterfaceC19870gSj.StateListAnimator.copydefault)) {
                        if (!(interfaceC19870gSj instanceof InterfaceC19870gSj.Activity)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        CopyTradingEditStrategyActivity copyTradingEditStrategyActivity2 = copyTradingEditStrategyActivity;
                        Intent intent = new Intent();
                        intent.putExtra("id", ((InterfaceC19870gSj.Activity) interfaceC19870gSj).KWHzl());
                        Unit unit = Unit.INSTANCE;
                        copyTradingEditStrategyActivity2.setResult(-1, intent);
                        copyTradingEditStrategyActivity.finish();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowIsConnected.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
