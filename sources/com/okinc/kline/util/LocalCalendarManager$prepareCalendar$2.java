package com.okinc.kline.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pFV;

/* JADX INFO: loaded from: classes9.dex */
public final class LocalCalendarManager$prepareCalendar$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    int label;
    final /* synthetic */ pFV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCalendarManager$prepareCalendar$2(pFV pfv, Continuation<? super LocalCalendarManager$prepareCalendar$2> continuation) {
        super(2, continuation);
        this.this$0 = pfv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalCalendarManager$prepareCalendar$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return ((LocalCalendarManager$prepareCalendar$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jLongValue;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pFV pfv = this.this$0;
            this.label = 1;
            obj = pfv.AEQbTJ((Continuation<? super Long>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                jLongValue = ((Number) obj).longValue();
                return C56443yFo.KWHzl(jLongValue);
            }
            C56391yDq.AEQbTJ(obj);
        }
        Long l = (Long) obj;
        if (l != null) {
            jLongValue = l.longValue();
            return C56443yFo.KWHzl(jLongValue);
        }
        pFV pfv2 = this.this$0;
        this.label = 2;
        obj = pfv2.EZpvd((Continuation<? super Long>) this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        jLongValue = ((Number) obj).longValue();
        return C56443yFo.KWHzl(jLongValue);
    }
}
