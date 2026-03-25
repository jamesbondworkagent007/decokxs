package com.okinc.business.market.features.scanner.surge.trending.domain;

import com.okinc.business.market.features.scanner.surge.trending.data.TrendingConfigData;
import com.okinc.business.market.features.scanner.surge.trending.data.TrendingTokenData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C22416heu;
import o.C29250kqB;
import o.C29300kqz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29249kqA;

/* JADX INFO: loaded from: classes7.dex */
public final class GetTrendingTokensUseCase$subscribeWs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ TrendingConfigData $config;
    final /* synthetic */ String $rankChannelName;
    int label;
    final /* synthetic */ C29300kqz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTrendingTokensUseCase$subscribeWs$1(C29300kqz c29300kqz, String str, String str2, TrendingConfigData trendingConfigData, Continuation<? super GetTrendingTokensUseCase$subscribeWs$1> continuation) {
        super(2, continuation);
        this.this$0 = c29300kqz;
        this.$rankChannelName = str;
        this.$chainId = str2;
        this.$config = trendingConfigData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetTrendingTokensUseCase$subscribeWs$1(this.this$0, this.$rankChannelName, this.$chainId, this.$config, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetTrendingTokensUseCase$subscribeWs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (C22416heu.ejfBZ()) {
                return Unit.INSTANCE;
            }
            InterfaceC29249kqA interfaceC29249kqA = this.this$0.AYXKKw;
            String str = this.$rankChannelName;
            String str2 = this.$chainId;
            this.label = 1;
            obj = interfaceC29249kqA.AEQbTJ(str, str2, this);
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
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$config);
        this.label = 2;
        if (((Flow) obj).collect(anonymousClass2, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$subscribeWs$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ TrendingConfigData AEQbTJ;
        public final /* synthetic */ C29300kqz OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(C29300kqz c29300kqz, TrendingConfigData trendingConfigData) {
            this.OLrzqt = c29300kqz;
            this.AEQbTJ = trendingConfigData;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(List<TrendingTokenData> list, Continuation<? super Unit> continuation) throws Throwable {
            GetTrendingTokensUseCase$subscribeWs$1$1$emit$1 getTrendingTokensUseCase$subscribeWs$1$1$emit$1;
            AnonymousClass2<T> anonymousClass2;
            List list2;
            Object value;
            if (continuation instanceof GetTrendingTokensUseCase$subscribeWs$1$1$emit$1) {
                getTrendingTokensUseCase$subscribeWs$1$1$emit$1 = (GetTrendingTokensUseCase$subscribeWs$1$1$emit$1) continuation;
                int i = getTrendingTokensUseCase$subscribeWs$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    getTrendingTokensUseCase$subscribeWs$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    getTrendingTokensUseCase$subscribeWs$1$1$emit$1 = new GetTrendingTokensUseCase$subscribeWs$1$1$emit$1(this, continuation);
                }
            }
            Object objEZpvd = getTrendingTokensUseCase$subscribeWs$1$1$emit$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = getTrendingTokensUseCase$subscribeWs$1$1$emit$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                C29300kqz c29300kqz = this.OLrzqt;
                TrendingConfigData trendingConfigData = this.AEQbTJ;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    C29250kqB c29250kqBOLrzqt = c29300kqz.OLrzqt((TrendingTokenData) it.next(), trendingConfigData);
                    if (c29250kqBOLrzqt != null) {
                        arrayList.add(c29250kqBOLrzqt);
                    }
                }
                C29300kqz c29300kqz2 = this.OLrzqt;
                getTrendingTokensUseCase$subscribeWs$1$1$emit$1.L$0 = this;
                getTrendingTokensUseCase$subscribeWs$1$1$emit$1.L$1 = arrayList;
                getTrendingTokensUseCase$subscribeWs$1$1$emit$1.label = 1;
                objEZpvd = c29300kqz2.EZpvd(arrayList, getTrendingTokensUseCase$subscribeWs$1$1$emit$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                anonymousClass2 = this;
                list2 = arrayList;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) getTrendingTokensUseCase$subscribeWs$1$1$emit$1.L$1;
                anonymousClass2 = (AnonymousClass2) getTrendingTokensUseCase$subscribeWs$1$1$emit$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
            }
            List list3 = (List) objEZpvd;
            MutableStateFlow mutableStateFlow = anonymousClass2.OLrzqt.OLrzqt;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, list3));
            anonymousClass2.OLrzqt.copydefault((List<C29250kqB>) list2);
            return Unit.INSTANCE;
        }
    }
}
