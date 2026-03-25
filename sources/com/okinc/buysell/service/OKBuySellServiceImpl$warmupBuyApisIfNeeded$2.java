package com.okinc.buysell.service;

import com.okinc.buysell.util.ABTestFeatureFlag;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import o.AbstractC43419rot;
import o.C30327lUg;
import o.C31659lzg;
import o.C56391yDq;
import o.C56442yFn;
import o.lAA;

/* JADX INFO: loaded from: classes23.dex */
public final class OKBuySellServiceImpl$warmupBuyApisIfNeeded$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C31659lzg $tradeSuggestionUseCase;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKBuySellServiceImpl$warmupBuyApisIfNeeded$2(C31659lzg c31659lzg, Continuation<? super OKBuySellServiceImpl$warmupBuyApisIfNeeded$2> continuation) {
        super(2, continuation);
        this.$tradeSuggestionUseCase = c31659lzg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKBuySellServiceImpl$warmupBuyApisIfNeeded$2(this.$tradeSuggestionUseCase, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKBuySellServiceImpl$warmupBuyApisIfNeeded$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.buysell.service.OKBuySellServiceImpl$warmupBuyApisIfNeeded$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C31659lzg $tradeSuggestionUseCase;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C31659lzg c31659lzg, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$tradeSuggestionUseCase = c31659lzg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$tradeSuggestionUseCase, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                lAA laa = lAA.KWHzl;
                if (laa.copydefault() == null) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C03821(this.$tradeSuggestionUseCase, null), 3, null);
                }
                if (laa.OLrzqt() == null) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$tradeSuggestionUseCase, null), 3, null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.buysell.service.OKBuySellServiceImpl$warmupBuyApisIfNeeded$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ C31659lzg $tradeSuggestionUseCase;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03821(C31659lzg c31659lzg, Continuation<? super C03821> continuation) {
                super(2, continuation);
                this.$tradeSuggestionUseCase = c31659lzg;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03821 c03821 = new C03821(this.$tradeSuggestionUseCase, continuation);
                c03821.L$0 = obj;
                return c03821;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM7377constructorimpl;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                try {
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        C31659lzg c31659lzg = this.$tradeSuggestionUseCase;
                        Result.Application application = Result.Companion;
                        TradeType tradeType = TradeType.BUY;
                        boolean zAEQbTJ = C30327lUg.AEQbTJ(ABTestFeatureFlag.PAYMENT_BOTTOMSHEET);
                        this.label = 1;
                        obj = c31659lzg.copydefault(tradeType, "", "", "", "", 1, zAEQbTJ, "", "", this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl((AbstractC43419rot) obj);
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.okinc.buysell.service.OKBuySellServiceImpl$warmupBuyApisIfNeeded$2$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ C31659lzg $tradeSuggestionUseCase;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C31659lzg c31659lzg, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$tradeSuggestionUseCase = c31659lzg;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$tradeSuggestionUseCase, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM7377constructorimpl;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                try {
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        C31659lzg c31659lzg = this.$tradeSuggestionUseCase;
                        Result.Application application = Result.Companion;
                        TradeType tradeType = TradeType.BUY;
                        boolean zAEQbTJ = C30327lUg.AEQbTJ(ABTestFeatureFlag.PAYMENT_BOTTOMSHEET);
                        this.label = 1;
                        obj = c31659lzg.copydefault(tradeType, "", "", "", "", 1, zAEQbTJ, "501", "pumpCmXqMfrsAkQ5r49WcJnRayYRqmXz6ae8H7H9Dfn", this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl((AbstractC43419rot) obj);
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                return Unit.INSTANCE;
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$tradeSuggestionUseCase, null);
            this.label = 1;
            if (SupervisorKt.supervisorScope(anonymousClass1, this) == objCopydefault) {
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
