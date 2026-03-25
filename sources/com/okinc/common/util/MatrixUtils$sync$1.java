package com.okinc.common.util;

import com.okinc.components.track.ABTestManager;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32590mgU;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC32607mgl;
import o.pUU;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class MatrixUtils$sync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C32590mgU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatrixUtils$sync$1(C32590mgU c32590mgU, Continuation<? super MatrixUtils$sync$1> continuation) {
        super(2, continuation);
        this.this$0 = c32590mgU;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MatrixUtils$sync$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MatrixUtils$sync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        if (((Boolean) obj).booleanValue() && ABTestManager.isEnabled$default(ABTestManager.AEQbTJ, this.this$0.EZpvd(), null, 2, null)) {
            JSONObject jSONObjectEZpvd = this.this$0.EZpvd(false);
            if (jSONObjectEZpvd != null) {
                C32590mgU c32590mgU = this.this$0;
                pUU.KWHzl(c32590mgU.OLrzqt(), "Saved: " + jSONObjectEZpvd);
                SPUtils.put(c32590mgU.KWHzl(), jSONObjectEZpvd.toString());
            }
        } else {
            InterfaceC32607mgl.StateListAnimator.clearConfig$default(this.this$0, null, 1, null);
        }
        return Unit.INSTANCE;
    }
}
