package com.okinc.business.market.home.favorites.domain;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C49380unU;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56548yJl;
import o.kER;
import o.qWG;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeFavItemsAggregatedUseCase$onExecute$2$invokeSuspend$$inlined$executeAsyncTasks$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Triple<? extends Map<String, ? extends BizInstrument>, ? extends Map<String, ? extends CoinQuote>, ? extends Map<String, ? extends qWG>>>, Object> {
    final /* synthetic */ List $coinQuotes$inlined;
    final /* synthetic */ List $dexQuotes$inlined;
    final /* synthetic */ List $instruments$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ kER this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFavItemsAggregatedUseCase$onExecute$2$invokeSuspend$$inlined$executeAsyncTasks$1(Continuation continuation, List list, List list2, List list3, kER ker) {
        super(2, continuation);
        this.$instruments$inlined = list;
        this.$coinQuotes$inlined = list2;
        this.$dexQuotes$inlined = list3;
        this.this$0 = ker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HomeFavItemsAggregatedUseCase$onExecute$2$invokeSuspend$$inlined$executeAsyncTasks$1 homeFavItemsAggregatedUseCase$onExecute$2$invokeSuspend$$inlined$executeAsyncTasks$1 = new HomeFavItemsAggregatedUseCase$onExecute$2$invokeSuspend$$inlined$executeAsyncTasks$1(continuation, this.$instruments$inlined, this.$coinQuotes$inlined, this.$dexQuotes$inlined, this.this$0);
        homeFavItemsAggregatedUseCase$onExecute$2$invokeSuspend$$inlined$executeAsyncTasks$1.L$0 = obj;
        return homeFavItemsAggregatedUseCase$onExecute$2$invokeSuspend$$inlined$executeAsyncTasks$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Triple<? extends Map<String, ? extends BizInstrument>, ? extends Map<String, ? extends CoinQuote>, ? extends Map<String, ? extends qWG>>> continuation) {
        return ((HomeFavItemsAggregatedUseCase$onExecute$2$invokeSuspend$$inlined$executeAsyncTasks$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferred;
        Deferred deferred2;
        Object obj2;
        Deferred deferred3;
        Object objAwait;
        Pair pair;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass1(null, this.$instruments$inlined), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass2(null, this.$coinQuotes$inlined), 3, null);
            Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass3(null, this.$dexQuotes$inlined, this.this$0), 3, null);
            this.L$0 = deferredAsync$default2;
            this.L$1 = deferredAsync$default3;
            this.label = 1;
            Object objAwait2 = deferredAsync$default.await(this);
            if (objAwait2 == objCopydefault) {
                return objCopydefault;
            }
            deferred = deferredAsync$default2;
            deferred2 = deferredAsync$default3;
            obj = objAwait2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pair = (Pair) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    return C49380unU.copydefault(pair, obj);
                }
                obj2 = this.L$1;
                deferred3 = (Deferred) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Pair pairOLrzqt = C49380unU.OLrzqt(obj2, obj);
                this.L$0 = pairOLrzqt;
                this.L$1 = null;
                this.label = 3;
                objAwait = deferred3.await(this);
                if (objAwait != objCopydefault) {
                    return objCopydefault;
                }
                pair = pairOLrzqt;
                obj = objAwait;
                return C49380unU.copydefault(pair, obj);
            }
            deferred2 = (Deferred) this.L$1;
            deferred = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = deferred2;
        this.L$1 = obj;
        this.label = 2;
        Object objAwait3 = deferred.await(this);
        if (objAwait3 == objCopydefault) {
            return objCopydefault;
        }
        Deferred deferred4 = deferred2;
        obj2 = obj;
        obj = objAwait3;
        deferred3 = deferred4;
        Pair pairOLrzqt2 = C49380unU.OLrzqt(obj2, obj);
        this.L$0 = pairOLrzqt2;
        this.L$1 = null;
        this.label = 3;
        objAwait = deferred3.await(this);
        if (objAwait != objCopydefault) {
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.market.home.favorites.domain.HomeFavItemsAggregatedUseCase$onExecute$2$invokeSuspend$$inlined$executeAsyncTasks$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends BizInstrument>>, Object> {
        final /* synthetic */ List $instruments$inlined;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, List list) {
            super(2, continuation);
            this.$instruments$inlined = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation, this.$instruments$inlined);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends BizInstrument>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            List list = this.$instruments$inlined;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
            for (Object obj2 : list) {
                BizInstrument bizInstrument = (BizInstrument) obj2;
                linkedHashMap.put(bizInstrument.getInstId() + bizInstrument.getInstType(), obj2);
            }
            return linkedHashMap;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.market.home.favorites.domain.HomeFavItemsAggregatedUseCase$onExecute$2$invokeSuspend$$inlined$executeAsyncTasks$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends CoinQuote>>, Object> {
        final /* synthetic */ List $coinQuotes$inlined;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Continuation continuation, List list) {
            super(2, continuation);
            this.$coinQuotes$inlined = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation, this.$coinQuotes$inlined);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends CoinQuote>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            List list = this.$coinQuotes$inlined;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
            for (Object obj2 : list) {
                CoinQuote coinQuote = (CoinQuote) obj2;
                linkedHashMap.put(coinQuote.getInstId() + coinQuote.getInstType(), obj2);
            }
            return linkedHashMap;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.market.home.favorites.domain.HomeFavItemsAggregatedUseCase$onExecute$2$invokeSuspend$$inlined$executeAsyncTasks$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends qWG>>, Object> {
        final /* synthetic */ List $dexQuotes$inlined;
        int label;
        final /* synthetic */ kER this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Continuation continuation, List list, kER ker) {
            super(2, continuation);
            this.$dexQuotes$inlined = list;
            this.this$0 = ker;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(continuation, this.$dexQuotes$inlined, this.this$0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends qWG>> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            List list = this.$dexQuotes$inlined;
            ArrayList<qWG> arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof qWG) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (qWG qwg : arrayList) {
                String strAEQbTJ = this.this$0.AEQbTJ(qwg);
                Pair pairOLrzqt = strAEQbTJ != null ? C56390yDp.OLrzqt(strAEQbTJ, qwg) : null;
                if (pairOLrzqt != null) {
                    arrayList2.add(pairOLrzqt);
                }
            }
            return C56424yEw.copydefault(arrayList2);
        }
    }
}
