package com.okinc.wallet.hardware.impl.onekey.js;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C57149ycv;
import okio.ByteString;

/* JADX INFO: loaded from: classes12.dex */
public final class OneKeySDKJavaScriptEngine$monitorCharacteristicActor$1$escapedParamsString$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ C57149ycv.StateListAnimator $call;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneKeySDKJavaScriptEngine$monitorCharacteristicActor$1$escapedParamsString$1(C57149ycv.StateListAnimator stateListAnimator, Continuation<? super OneKeySDKJavaScriptEngine$monitorCharacteristicActor$1$escapedParamsString$1> continuation) {
        super(2, continuation);
        this.$call = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneKeySDKJavaScriptEngine$monitorCharacteristicActor$1$escapedParamsString$1(this.$call, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((OneKeySDKJavaScriptEngine$monitorCharacteristicActor$1$escapedParamsString$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return "\"\\\"" + ByteString.Companion.of$default(ByteString.Companion, this.$call.copydefault(), 0, 0, 3, null).hex() + "\\\"\"";
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
