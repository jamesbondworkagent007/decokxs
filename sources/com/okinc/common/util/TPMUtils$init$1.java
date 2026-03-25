package com.okinc.common.util;

import com.okinc.base.thread.TPM;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32666mhr;
import o.C56391yDq;
import o.C56442yFn;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class TPMUtils$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C32666mhr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TPMUtils$init$1(C32666mhr c32666mhr, Continuation<? super TPMUtils$init$1> continuation) {
        super(2, continuation);
        this.this$0 = c32666mhr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TPMUtils$init$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TPMUtils$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        TPM.TaskDescription taskDescriptionOLrzqt;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            JSONObject jSONObjectEZpvd = this.this$0.EZpvd(true);
            if (jSONObjectEZpvd == null || (taskDescriptionOLrzqt = this.this$0.OLrzqt(jSONObjectEZpvd)) == null) {
                this.this$0.valueOf().OLrzqt();
            } else {
                this.this$0.OLrzqt(taskDescriptionOLrzqt.fIwbmz());
                if (taskDescriptionOLrzqt.djBIcL()) {
                    this.this$0.AkhnZx.copydefault(this.this$0.AhwBna());
                    this.this$0.valueOf().KWHzl(this.this$0.djBIcL);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
