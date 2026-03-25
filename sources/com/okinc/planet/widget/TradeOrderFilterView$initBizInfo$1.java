package com.okinc.planet.widget;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C46392tSq;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;

/* JADX INFO: loaded from: classes19.dex */
public final class TradeOrderFilterView$initBizInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callBack;
    final /* synthetic */ String $instType;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeOrderFilterView$initBizInfo$1(String str, Function0<Unit> function0, Continuation<? super TradeOrderFilterView$initBizInfo$1> continuation) {
        super(2, continuation);
        this.$instType = str;
        this.$callBack = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeOrderFilterView$initBizInfo$1(this.$instType, this.$callBack, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradeOrderFilterView$initBizInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54581xNr interfaceC54581xNrEZpvd = C46392tSq.EZpvd.EZpvd();
            if (interfaceC54581xNrEZpvd != null) {
                String str = this.$instType;
                this.label = 1;
                obj = interfaceC54581xNrEZpvd.EZpvd(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            this.$callBack.invoke();
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        this.$callBack.invoke();
        return Unit.INSTANCE;
    }
}
