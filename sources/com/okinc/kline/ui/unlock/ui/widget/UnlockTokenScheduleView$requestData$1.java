package com.okinc.kline.ui.unlock.ui.widget;

import com.okinc.kline.ui.unlock.data.po.UnlockTokenSchedule;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C39769pyb;
import o.C55298xhM;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class UnlockTokenScheduleView$requestData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UnlockTokenScheduleView this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockTokenScheduleView$requestData$1(UnlockTokenScheduleView unlockTokenScheduleView, Continuation<? super UnlockTokenScheduleView$requestData$1> continuation) {
        super(2, continuation);
        this.this$0 = unlockTokenScheduleView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnlockTokenScheduleView$requestData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnlockTokenScheduleView$requestData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C39769pyb c39769pyb = this.this$0.djBIcL;
            this.label = 1;
            obj = c39769pyb.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) obj;
        boolean zKWHzl = C33129mqd.KWHzl((Collection) list);
        this.this$0.setVisibility(zKWHzl ? 0 : 8);
        if (zKWHzl) {
            Function1 function1 = this.this$0.copydefault;
            if (function1 != null) {
                function1.invoke(C56443yFo.AEQbTJ(C33129mqd.AhwBna(C56443yFo.AEQbTJ(C55298xhM.dp2px$default(24.0f, null, 1, null)))));
            }
            this.this$0.copydefault((List<UnlockTokenSchedule>) list);
        }
        return Unit.INSTANCE;
    }
}
