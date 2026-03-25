package com.okinc.tradingbot.impl.aiBot.domain.usecase;

import com.okinc.tradingbot.impl.aiBot.dto.AiHomeDto;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.uCK;
import o.uCN;

/* JADX INFO: loaded from: classes11.dex */
public final class GetBacktestRerunConfigUseCase$execute$2$intervalsDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends String>>, Object> {
    int label;
    final /* synthetic */ uCN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBacktestRerunConfigUseCase$execute$2$intervalsDeferred$1(uCN ucn, Continuation<? super GetBacktestRerunConfigUseCase$execute$2$intervalsDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = ucn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetBacktestRerunConfigUseCase$execute$2$intervalsDeferred$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Map<String, String>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<String, String>> continuation) {
        return ((GetBacktestRerunConfigUseCase$execute$2$intervalsDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            uCK uck = this.this$0.EZpvd;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            obj = uck.KWHzl(unit, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return ((AiHomeDto) obj).copydefault();
    }
}
