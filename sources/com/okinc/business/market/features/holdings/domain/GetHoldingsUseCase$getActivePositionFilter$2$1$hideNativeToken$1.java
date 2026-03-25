package com.okinc.business.market.features.holdings.domain;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.C27670jza;
import o.C28434kah;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHW;

/* JADX INFO: loaded from: classes7.dex */
public final class GetHoldingsUseCase$getActivePositionFilter$2$1$hideNativeToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ C28434kah this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHoldingsUseCase$getActivePositionFilter$2$1$hideNativeToken$1(C28434kah c28434kah, Continuation<? super GetHoldingsUseCase$getActivePositionFilter$2$1$hideNativeToken$1> continuation) {
        super(2, continuation);
        this.this$0 = c28434kah;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetHoldingsUseCase$getActivePositionFilter$2$1$hideNativeToken$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((GetHoldingsUseCase$getActivePositionFilter$2$1$hideNativeToken$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C27670jza c27670jza = this.this$0.AEQbTJ;
            KSerializer<Boolean> kSerializerSerializer = BuiltinSerializersKt.serializer(yHW.OLrzqt);
            this.label = 1;
            objAEQbTJ = c27670jza.AEQbTJ("dex_my_position_hide_native_token", kSerializerSerializer, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        return Result.m7383isFailureimpl(objAEQbTJ) ? C56443yFo.KWHzl(true) : objAEQbTJ;
    }
}
