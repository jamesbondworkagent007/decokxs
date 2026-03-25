package com.okinc.kline.ui.dialog;

import com.okinc.kline.data.KLineEventBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C39285ppS;
import o.C56391yDq;
import o.C56442yFn;
import o.pGZ;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineEventFragment$deleteCalendarEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ KLineEventBean $item;
    final /* synthetic */ int $pos;
    int label;
    final /* synthetic */ C39285ppS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineEventFragment$deleteCalendarEvent$1(C39285ppS c39285ppS, KLineEventBean kLineEventBean, int i, Continuation<? super KlineEventFragment$deleteCalendarEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = c39285ppS;
        this.$item = kLineEventBean;
        this.$pos = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineEventFragment$deleteCalendarEvent$1(this.this$0, this.$item, this.$pos, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineEventFragment$deleteCalendarEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pGZ pgzValueOf = this.this$0.valueOf();
            String calendarId = this.$item.getCalendarId();
            long eventId = this.$item.getEventId();
            this.label = 1;
            obj = pgzValueOf.copydefault(calendarId, eventId, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C39285ppS c39285ppS = this.this$0;
        KLineEventBean kLineEventBean = this.$item;
        int i2 = this.$pos;
        if (((Boolean) obj).booleanValue()) {
            c39285ppS.EZpvd(kLineEventBean, false, i2);
        }
        return Unit.INSTANCE;
    }
}
