package com.okinc.common.util;

import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32650mhb;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC32607mgl;
import o.pUU;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class MonitorUtils$sync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C32650mhb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonitorUtils$sync$1(C32650mhb c32650mhb, Continuation<? super MonitorUtils$sync$1> continuation) {
        super(2, continuation);
        this.this$0 = c32650mhb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MonitorUtils$sync$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MonitorUtils$sync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC32607mgl.Application application = InterfaceC32607mgl.Companion;
            this.label = 1;
            obj = application.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue() && this.this$0.AuCTel()) {
            JSONObject jSONObjectEZpvd = this.this$0.EZpvd(false);
            if (jSONObjectEZpvd != null) {
                C32650mhb c32650mhb = this.this$0;
                pUU.KWHzl("Monitor.Device", "Saved: " + jSONObjectEZpvd);
                SPUtils.put(c32650mhb.KWHzl(), jSONObjectEZpvd.toString());
                c32650mhb.EZpvd(jSONObjectEZpvd);
            }
        } else {
            this.this$0.copydefault("Monitor.Device is removed");
        }
        return Unit.INSTANCE;
    }
}
