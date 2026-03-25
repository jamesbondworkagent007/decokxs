package com.okinc.wallet.hardware.impl.onekey.js;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.JsonElementKt;
import o.C33489mxS;
import o.C56391yDq;
import o.C56442yFn;
import o.C56519yIj;
import o.InterfaceC56559yJw;

/* JADX INFO: loaded from: classes24.dex */
public final class OneKeySDKJavaScriptEngine$nativeResponse$1$escapedParamsString$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ T $params;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneKeySDKJavaScriptEngine$nativeResponse$1$escapedParamsString$1(T t, Continuation<? super OneKeySDKJavaScriptEngine$nativeResponse$1$escapedParamsString$1> continuation) {
        super(2, continuation);
        this.$params = t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneKeySDKJavaScriptEngine$nativeResponse$1$escapedParamsString$1(this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((OneKeySDKJavaScriptEngine$nativeResponse$1$escapedParamsString$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C33489mxS c33489mxS = C33489mxS.KWHzl;
            T t = this.$params;
            Intrinsics.KWHzl(6, ExifInterface.GPS_DIRECTION_TRUE);
            C56519yIj.copydefault("kotlinx.serialization.serializer.simple");
            return JsonElementKt.JsonPrimitive(c33489mxS.KWHzl(SerializersKt.serializer((InterfaceC56559yJw) null), t)).toString();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
