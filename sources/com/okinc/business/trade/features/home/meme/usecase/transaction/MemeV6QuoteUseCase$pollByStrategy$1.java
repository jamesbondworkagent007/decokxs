package com.okinc.business.trade.features.home.meme.usecase.transaction;

import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.gYP;
import o.gYS;
import o.gYX;
import o.kWN;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeV6QuoteUseCase$pollByStrategy$1 extends SuspendLambda implements Function2<FlowCollector<? super Result<? extends V6BaseQuoteResponse>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ gYS $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ kWN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeV6QuoteUseCase$pollByStrategy$1(kWN kwn, gYS gys, Continuation<? super MemeV6QuoteUseCase$pollByStrategy$1> continuation) {
        super(2, continuation);
        this.this$0 = kwn;
        this.$request = gys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MemeV6QuoteUseCase$pollByStrategy$1 memeV6QuoteUseCase$pollByStrategy$1 = new MemeV6QuoteUseCase$pollByStrategy$1(this.this$0, this.$request, continuation);
        memeV6QuoteUseCase$pollByStrategy$1.L$0 = obj;
        return memeV6QuoteUseCase$pollByStrategy$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Result<? extends V6BaseQuoteResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return ((MemeV6QuoteUseCase$pollByStrategy$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flowPollByStrategy$default = gYX.pollByStrategy$default(this.this$0.OLrzqt, this.$request, 0L, 2, null);
            FlowCollector flowCollector2 = new FlowCollector() { // from class: com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6QuoteUseCase$pollByStrategy$1.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(gYP gyp, Continuation<? super Unit> continuation) {
                    Object objM7377constructorimpl;
                    if (gyp instanceof gYP.ActionBar) {
                        AbstractC43419rot<V6QuoteResponseData, OKServerException> abstractC43419rotKWHzl = ((gYP.ActionBar) gyp).KWHzl();
                        if (abstractC43419rotKWHzl instanceof AbstractC43419rot.StateListAnimator) {
                            Result.Application application = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) abstractC43419rotKWHzl).KWHzl());
                        } else {
                            if (!(abstractC43419rotKWHzl instanceof AbstractC43419rot.ActionBar)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Result.Application application2 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd((Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rotKWHzl).KWHzl()));
                        }
                    } else if (gyp instanceof gYP.Application) {
                        AbstractC43419rot<V6QuoteAndCalldataResponseData, OKServerException> abstractC43419rotOLrzqt = ((gYP.Application) gyp).OLrzqt();
                        if (abstractC43419rotOLrzqt instanceof AbstractC43419rot.StateListAnimator) {
                            Result.Application application3 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) abstractC43419rotOLrzqt).KWHzl());
                        } else {
                            if (!(abstractC43419rotOLrzqt instanceof AbstractC43419rot.ActionBar)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Result.Application application4 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd((Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rotOLrzqt).KWHzl()));
                        }
                    } else {
                        Result.Application application5 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new NullPointerException(AbstractJsonLexerKt.NULL)));
                    }
                    Object objEmit = flowCollector.emit(Result.m7376boximpl(objM7377constructorimpl), continuation);
                    return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowPollByStrategy$default.collect(flowCollector2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
