package com.okinc.business.market.features.smart_money.signal.domain;

import com.okinc.business.market.data.model.CoinRankingWsData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C29509kuw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29466kuF;

/* JADX INFO: loaded from: classes7.dex */
public final class GetSingleSignalOverviewUseCase$subscribeTokenUpdatesWs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $tokenChainId;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ C29509kuw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSingleSignalOverviewUseCase$subscribeTokenUpdatesWs$1(C29509kuw c29509kuw, String str, String str2, Continuation<? super GetSingleSignalOverviewUseCase$subscribeTokenUpdatesWs$1> continuation) {
        super(2, continuation);
        this.this$0 = c29509kuw;
        this.$tokenChainId = str;
        this.$tokenContractAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSingleSignalOverviewUseCase$subscribeTokenUpdatesWs$1(this.this$0, this.$tokenChainId, this.$tokenContractAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetSingleSignalOverviewUseCase$subscribeTokenUpdatesWs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC29466kuF interfaceC29466kuF = this.this$0.EZpvd;
            String str = this.$tokenChainId;
            String str2 = this.$tokenContractAddress;
            this.label = 1;
            obj = interfaceC29466kuF.copydefault(str, str2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 2;
        if (FlowKt.collectLatest((Flow) obj, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.domain.GetSingleSignalOverviewUseCase$subscribeTokenUpdatesWs$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoinRankingWsData, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C29509kuw this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C29509kuw c29509kuw, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c29509kuw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoinRankingWsData coinRankingWsData, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coinRankingWsData, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.copydefault.setValue((CoinRankingWsData) this.L$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
