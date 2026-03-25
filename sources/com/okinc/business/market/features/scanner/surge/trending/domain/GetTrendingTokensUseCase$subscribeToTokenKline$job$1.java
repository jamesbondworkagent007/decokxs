package com.okinc.business.market.features.scanner.surge.trending.domain;

import com.okinc.business.dexlogic.main.market.bean.CandlesticksBean;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Mutex;
import o.C29250kqB;
import o.C29300kqz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C59443zhD;
import o.InterfaceC29249kqA;

/* JADX INFO: loaded from: classes7.dex */
public final class GetTrendingTokensUseCase$subscribeToTokenKline$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C29250kqB $token;
    final /* synthetic */ String $tokenKey;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C29300kqz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTrendingTokensUseCase$subscribeToTokenKline$job$1(C29300kqz c29300kqz, C29250kqB c29250kqB, String str, Continuation<? super GetTrendingTokensUseCase$subscribeToTokenKline$job$1> continuation) {
        super(2, continuation);
        this.this$0 = c29300kqz;
        this.$token = c29250kqB;
        this.$tokenKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetTrendingTokensUseCase$subscribeToTokenKline$job$1 getTrendingTokensUseCase$subscribeToTokenKline$job$1 = new GetTrendingTokensUseCase$subscribeToTokenKline$job$1(this.this$0, this.$token, this.$tokenKey, continuation);
        getTrendingTokensUseCase$subscribeToTokenKline$job$1.L$0 = obj;
        return getTrendingTokensUseCase$subscribeToTokenKline$job$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetTrendingTokensUseCase$subscribeToTokenKline$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            InterfaceC29249kqA interfaceC29249kqA = this.this$0.AYXKKw;
            String strValueOf = this.$token.valueOf();
            String strAYXKKw = this.$token.AYXKKw();
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = interfaceC29249kqA.KWHzl(strValueOf, strAYXKKw, this);
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
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(coroutineScope, this.this$0, this.$tokenKey);
        this.L$0 = null;
        this.label = 2;
        if (((Flow) obj).collect(anonymousClass5, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$subscribeToTokenKline$job$1$5, reason: invalid class name */
    public static final class AnonymousClass5<T> implements FlowCollector {
        public final /* synthetic */ C29300kqz AEQbTJ;
        public final /* synthetic */ String EZpvd;
        public final /* synthetic */ CoroutineScope KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass5(CoroutineScope coroutineScope, C29300kqz c29300kqz, String str) {
            this.KWHzl = coroutineScope;
            this.AEQbTJ = c29300kqz;
            this.EZpvd = str;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(CandlesticksBean candlesticksBean, Continuation<? super Unit> continuation) throws Throwable {
            GetTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1 getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1;
            String str;
            float fFloatValue;
            C29300kqz c29300kqz;
            Mutex mutex;
            long j;
            if (continuation instanceof GetTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1) {
                getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1 = (GetTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1) continuation;
                int i = getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1 = new GetTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1(this, continuation);
                }
            }
            Object obj = getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1.label;
            try {
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj);
                    if (!CoroutineScopeKt.isActive(this.KWHzl)) {
                        return Unit.INSTANCE;
                    }
                    C29300kqz c29300kqz2 = this.AEQbTJ;
                    str = this.EZpvd;
                    Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(candlesticksBean.getTs());
                    if (fieldNames != null) {
                        long jLongValue = fieldNames.longValue();
                        Float fFIwbmz = C59443zhD.fIwbmz(candlesticksBean.getO());
                        if (fFIwbmz != null) {
                            fFloatValue = fFIwbmz.floatValue();
                            Mutex mutex2 = c29300kqz2.KWHzl;
                            getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1.L$0 = c29300kqz2;
                            getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1.L$1 = str;
                            getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1.L$2 = mutex2;
                            getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1.J$0 = jLongValue;
                            getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1.F$0 = fFloatValue;
                            getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1.label = 1;
                            if (mutex2.lock(null, getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            c29300kqz = c29300kqz2;
                            mutex = mutex2;
                            j = jLongValue;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fFloatValue = getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1.F$0;
                j = getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1.J$0;
                mutex = (Mutex) getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1.L$2;
                str = (String) getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1.L$1;
                c29300kqz = (C29300kqz) getTrendingTokensUseCase$subscribeToTokenKline$job$1$1$emit$1.L$0;
                C56391yDq.AEQbTJ(obj);
                Map map = c29300kqz.copydefault;
                Object linkedHashMap = map.get(str);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    map.put(str, linkedHashMap);
                }
                ((Map) linkedHashMap).put(C56443yFo.KWHzl(j), C56443yFo.OLrzqt(fFloatValue));
                Unit unit = Unit.INSTANCE;
                return Unit.INSTANCE;
            } finally {
                mutex.unlock(null);
            }
        }
    }
}
