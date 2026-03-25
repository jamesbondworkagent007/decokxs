package com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog;

import com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotContractGridEditParamConfirmDialog$subscribeOnUIChange$4$1;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C50029uzh;
import o.C50213vGb;
import o.C55804xqp;
import o.C56066xvm;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class BotContractGridEditParamConfirmDialog$subscribeOnUIChange$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C55804xqp<StrategyDetailsResponse> $it;
    int label;
    final /* synthetic */ C50213vGb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotContractGridEditParamConfirmDialog$subscribeOnUIChange$4$1(C50213vGb c50213vGb, C55804xqp<StrategyDetailsResponse> c55804xqp, Continuation<? super BotContractGridEditParamConfirmDialog$subscribeOnUIChange$4$1> continuation) {
        super(2, continuation);
        this.this$0 = c50213vGb;
        this.$it = c55804xqp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotContractGridEditParamConfirmDialog$subscribeOnUIChange$4$1(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotContractGridEditParamConfirmDialog$subscribeOnUIChange$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef, this.this$0, this.$it, null);
            this.label = 1;
            if (BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotContractGridEditParamConfirmDialog$subscribeOnUIChange$4$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<BenefitDetails> $benefitDetails;
        final /* synthetic */ C55804xqp<StrategyDetailsResponse> $it;
        int label;
        final /* synthetic */ C50213vGb this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<BenefitDetails> objectRef, C50213vGb c50213vGb, C55804xqp<StrategyDetailsResponse> c55804xqp, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$benefitDetails = objectRef;
            this.this$0 = c50213vGb;
            this.$it = c55804xqp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$benefitDetails, this.this$0, this.$it, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [T, com.okinc.unify_trade.bot.data.BenefitDetails] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$benefitDetails.element = this.this$0.OLrzqt().EZpvd(this.$it);
                C50029uzh c50029uzh = C50029uzh.EZpvd;
                final C50213vGb c50213vGb = this.this$0;
                final Ref.ObjectRef<BenefitDetails> objectRef = this.$benefitDetails;
                final C55804xqp<StrategyDetailsResponse> c55804xqp = this.$it;
                c50029uzh.AEQbTJ(new Runnable() { // from class: o.vGk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        BotContractGridEditParamConfirmDialog$subscribeOnUIChange$4$1.AnonymousClass1.invokeSuspend$lambda$0(c50213vGb, objectRef, c55804xqp);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: T */
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void invokeSuspend$lambda$0(C50213vGb c50213vGb, Ref.ObjectRef objectRef, C55804xqp c55804xqp) {
            c50213vGb.copydefault(((BenefitDetails) objectRef.element).getInvestment(), ((BenefitDetails) objectRef.element).getGridProfit(), ((BenefitDetails) objectRef.element).getFloatProfit(), C56066xvm.getPnlUnit$default(C56066xvm.EZpvd, ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstId(), ((StrategyDetailsResponse) c55804xqp.copydefault()).getInstType(), null, 4, null));
        }
    }
}
