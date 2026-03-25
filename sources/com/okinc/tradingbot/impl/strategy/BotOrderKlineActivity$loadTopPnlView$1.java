package com.okinc.tradingbot.impl.strategy;

import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.ActivityC53830wsr;
import o.C55804xqp;
import o.C55887xsS;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class BotOrderKlineActivity$loadTopPnlView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C55804xqp<StrategyDetailsResponse> $data;
    Object L$0;
    int label;
    final /* synthetic */ ActivityC53830wsr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotOrderKlineActivity$loadTopPnlView$1(ActivityC53830wsr activityC53830wsr, C55804xqp<StrategyDetailsResponse> c55804xqp, Continuation<? super BotOrderKlineActivity$loadTopPnlView$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC53830wsr;
        this.$data = c55804xqp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotOrderKlineActivity$loadTopPnlView$1(this.this$0, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotOrderKlineActivity$loadTopPnlView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef2, this.this$0, this.$data, null);
            this.L$0 = objectRef2;
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
            objectRef = objectRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        String sourceCcy = ((BenefitDetails) objectRef.element).getSourceCcy();
        String pnlCcy = Intrinsics.EZpvd((Object) ((BenefitDetails) objectRef.element).getOrderType(), (Object) "contract_grid") ? ((BenefitDetails) objectRef.element).getPnlCcy() : ((BenefitDetails) objectRef.element).getPriceUnit();
        if (sourceCcy == null || sourceCcy.length() == 0 || StringsKt__StringsKt.fARcdN((CharSequence) sourceCcy)) {
            sourceCcy = pnlCcy;
        }
        String strEZpvd = ActivityC53830wsr.EZpvd(this.this$0).EZpvd();
        String strAEQbTJ = ActivityC53830wsr.EZpvd(this.this$0).AEQbTJ();
        String tradeQuoteCcy = this.$data.copydefault().getTradeQuoteCcy();
        C55804xqp<StrategyDetailsResponse> c55804xqp = this.$data;
        C55887xsS c55887xsS = new C55887xsS(strAEQbTJ, strEZpvd);
        c55887xsS.gEmmrt(tradeQuoteCcy);
        String strAEQbTJ2 = c55887xsS.AEQbTJ(c55804xqp.copydefault().getOrderType());
        ActivityC53830wsr activityC53830wsr = this.this$0;
        BenefitDetails benefitDetails = (BenefitDetails) objectRef.element;
        if (strAEQbTJ2 != null && strAEQbTJ2.length() != 0 && !StringsKt__StringsKt.fARcdN((CharSequence) strAEQbTJ2)) {
            sourceCcy = strAEQbTJ2;
        }
        activityC53830wsr.EZpvd(benefitDetails, sourceCcy);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.BotOrderKlineActivity$loadTopPnlView$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<BenefitDetails> $benefitDetails;
        final /* synthetic */ C55804xqp<StrategyDetailsResponse> $data;
        int label;
        final /* synthetic */ ActivityC53830wsr this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<BenefitDetails> objectRef, ActivityC53830wsr activityC53830wsr, C55804xqp<StrategyDetailsResponse> c55804xqp, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$benefitDetails = objectRef;
            this.this$0 = activityC53830wsr;
            this.$data = c55804xqp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$benefitDetails, this.this$0, this.$data, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, com.okinc.unify_trade.bot.data.BenefitDetails] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$benefitDetails.element = ActivityC53830wsr.EZpvd(this.this$0).OLrzqt(this.$data);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
