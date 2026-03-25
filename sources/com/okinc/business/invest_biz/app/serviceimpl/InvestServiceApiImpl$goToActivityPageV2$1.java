package com.okinc.business.invest_biz.app.serviceimpl;

import android.content.Context;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C25596izh;
import o.C27508jwX;
import o.C56391yDq;
import o.C56442yFn;
import o.iBC;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestServiceApiImpl$goToActivityPageV2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $tabId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestServiceApiImpl$goToActivityPageV2$1(Context context, String str, Continuation<? super InvestServiceApiImpl$goToActivityPageV2$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$tabId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestServiceApiImpl$goToActivityPageV2$1(this.$context, this.$tabId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestServiceApiImpl$goToActivityPageV2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Context context = this.$context;
            String str = this.$tabId;
            try {
                Result.Application application = Result.Companion;
                if (!C25596izh.OLrzqt(context).KWHzl(context, new iBC(0, 0, 0, null, null, 31, null))) {
                    Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str);
                    if (intOrNull == null) {
                        return Unit.INSTANCE;
                    }
                    C27508jwX.AEQbTJ.AEQbTJ(context, intOrNull.intValue());
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
