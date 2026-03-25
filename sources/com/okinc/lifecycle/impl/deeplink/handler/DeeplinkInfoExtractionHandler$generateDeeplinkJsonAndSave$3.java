package com.okinc.lifecycle.impl.deeplink.handler;

import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC38164pOp;
import o.pLM;
import o.pLX;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class DeeplinkInfoExtractionHandler$generateDeeplinkJsonAndSave$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ pLX $info;
    int label;
    final /* synthetic */ pLM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeeplinkInfoExtractionHandler$generateDeeplinkJsonAndSave$3(pLM plm, pLX plx, Continuation<? super DeeplinkInfoExtractionHandler$generateDeeplinkJsonAndSave$3> continuation) {
        super(2, continuation);
        this.this$0 = plm;
        this.$info = plx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeeplinkInfoExtractionHandler$generateDeeplinkJsonAndSave$3(this.this$0, this.$info, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeeplinkInfoExtractionHandler$generateDeeplinkJsonAndSave$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC38164pOp interfaceC38164pOp = this.this$0.EZpvd;
            pLX plx = this.$info;
            this.label = 1;
            obj = interfaceC38164pOp.AEQbTJ(plx, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((ResponseData) obj).getCode() == 0) {
            pUU.OLrzqt("Deeplink Info uploaded");
        } else {
            pUU.OLrzqt("Deeplink Info upload failed");
        }
        return Unit.INSTANCE;
    }
}
