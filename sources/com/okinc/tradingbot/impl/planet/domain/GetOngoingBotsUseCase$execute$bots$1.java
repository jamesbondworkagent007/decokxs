package com.okinc.tradingbot.impl.planet.domain;

import com.okinc.tradingbot.impl.planet.dto.BotDto;
import com.okinc.tradingbot.impl.planet.model.BotUiState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C53664wpk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class GetOngoingBotsUseCase$execute$bots$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends BotUiState>>, Object> {
    final /* synthetic */ List<BotDto> $response;
    int label;
    final /* synthetic */ C53664wpk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.okinc.tradingbot.impl.planet.dto.BotDto> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GetOngoingBotsUseCase$execute$bots$1(List<? extends BotDto> list, C53664wpk c53664wpk, Continuation<? super GetOngoingBotsUseCase$execute$bots$1> continuation) {
        super(2, continuation);
        this.$response = list;
        this.this$0 = c53664wpk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetOngoingBotsUseCase$execute$bots$1(this.$response, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends BotUiState>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<BotUiState>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<BotUiState>> continuation) {
        return ((GetOngoingBotsUseCase$execute$bots$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<BotDto> list = this.$response;
            C53664wpk c53664wpk = this.this$0;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c53664wpk.djBIcL.AEQbTJ((BotDto) it.next()));
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
