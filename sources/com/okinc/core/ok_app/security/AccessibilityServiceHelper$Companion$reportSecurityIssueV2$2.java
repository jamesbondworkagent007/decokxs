package com.okinc.core.ok_app.security;

import java.util.Iterator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonObject;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC33254msw;

/* JADX INFO: loaded from: classes8.dex */
public final class AccessibilityServiceHelper$Companion$reportSecurityIssueV2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ JsonObject $jsonObject;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityServiceHelper$Companion$reportSecurityIssueV2$2(JsonObject jsonObject, Continuation<? super AccessibilityServiceHelper$Companion$reportSecurityIssueV2$2> continuation) {
        super(2, continuation);
        this.$jsonObject = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccessibilityServiceHelper$Companion$reportSecurityIssueV2$2(this.$jsonObject, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccessibilityServiceHelper$Companion$reportSecurityIssueV2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterable iterableKWHzl;
        JsonObject jsonObject;
        Iterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iterableKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33254msw.class));
            if (iterableKWHzl != null) {
                jsonObject = this.$jsonObject;
                it = iterableKWHzl.iterator();
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = (Iterator) this.L$2;
        iterableKWHzl = (Iterable) this.L$1;
        jsonObject = (JsonObject) this.L$0;
        C56391yDq.AEQbTJ(obj);
        ((Result) obj).m7386unboximpl();
        while (it.hasNext()) {
            InterfaceC33254msw interfaceC33254msw = (InterfaceC33254msw) it.next();
            this.L$0 = jsonObject;
            this.L$1 = iterableKWHzl;
            this.L$2 = it;
            this.label = 1;
            if (interfaceC33254msw.KWHzl(jsonObject, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
