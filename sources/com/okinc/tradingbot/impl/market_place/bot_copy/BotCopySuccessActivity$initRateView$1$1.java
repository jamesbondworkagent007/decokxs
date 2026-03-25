package com.okinc.tradingbot.impl.market_place.bot_copy;

import android.content.Intent;
import com.okinc.biz.model.ModuleType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.ActivityC51150vhb;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C6803aWK;
import o.InterfaceC6804aWL;

/* JADX INFO: loaded from: classes11.dex */
public final class BotCopySuccessActivity$initRateView$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC51150vhb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotCopySuccessActivity$initRateView$1$1(ActivityC51150vhb activityC51150vhb, Continuation<? super BotCopySuccessActivity$initRateView$1$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC51150vhb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotCopySuccessActivity$initRateView$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotCopySuccessActivity$initRateView$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ModuleType moduleType = ModuleType.TradingBot;
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            Unit unit = Unit.INSTANCE;
            C6803aWK c6803aWK = new C6803aWK(moduleType, null, null, jsonObjectBuilder.build(), 6, null);
            InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.OLrzqt(InterfaceC6804aWL.class);
            if (interfaceC6804aWL != null) {
                ActivityC51150vhb activityC51150vhb = this.this$0;
                this.label = 1;
                objCopydefault = interfaceC6804aWL.copydefault(activityC51150vhb, c6803aWK, this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        objCopydefault = ((Result) obj).m7386unboximpl();
        if (Result.m7383isFailureimpl(objCopydefault)) {
            objCopydefault = null;
        }
        Intent intent = (Intent) objCopydefault;
        if (intent != null) {
            this.this$0.startActivity(intent);
        }
        return Unit.INSTANCE;
    }
}
