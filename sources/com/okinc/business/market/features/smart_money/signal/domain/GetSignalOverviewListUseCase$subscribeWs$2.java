package com.okinc.business.market.features.smart_money.signal.domain;

import com.okinc.business.market.data.model.common.TokenInfo;
import com.okinc.business.market.data.model.smart_money.SignalOverview;
import com.okinc.business.market.data.model.smart_money.SignalUpdate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C29508kuv;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC29466kuF;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class GetSignalOverviewListUseCase$subscribeWs$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $allChainIds;
    int label;
    final /* synthetic */ C29508kuv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignalOverviewListUseCase$subscribeWs$2(C29508kuv c29508kuv, List<String> list, Continuation<? super GetSignalOverviewListUseCase$subscribeWs$2> continuation) {
        super(2, continuation);
        this.this$0 = c29508kuv;
        this.$allChainIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSignalOverviewListUseCase$subscribeWs$2(this.this$0, this.$allChainIds, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetSignalOverviewListUseCase$subscribeWs$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$subscribeWs$2$4, reason: invalid class name */
    public static final class AnonymousClass4<T> implements FlowCollector {
        public final /* synthetic */ C29508kuv KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(C29508kuv c29508kuv) {
            this.KWHzl = c29508kuv;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX DEBUG: Multi-variable search result rejected for r11v9, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e5 -> B:31:0x00e6). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(List<SignalUpdate> list, Continuation<? super Unit> continuation) throws Throwable {
            GetSignalOverviewListUseCase$subscribeWs$2$1$emit$1 getSignalOverviewListUseCase$subscribeWs$2$1$emit$1;
            Iterator<T> it;
            AnonymousClass4<T> anonymousClass4;
            C29508kuv c29508kuv;
            Collection collection;
            Object value;
            List listAhwBna;
            if (continuation instanceof GetSignalOverviewListUseCase$subscribeWs$2$1$emit$1) {
                getSignalOverviewListUseCase$subscribeWs$2$1$emit$1 = (GetSignalOverviewListUseCase$subscribeWs$2$1$emit$1) continuation;
                int i = getSignalOverviewListUseCase$subscribeWs$2$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    getSignalOverviewListUseCase$subscribeWs$2$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    getSignalOverviewListUseCase$subscribeWs$2$1$emit$1 = new GetSignalOverviewListUseCase$subscribeWs$2$1$emit$1(this, continuation);
                }
            }
            Object objOLrzqt = getSignalOverviewListUseCase$subscribeWs$2$1$emit$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = getSignalOverviewListUseCase$subscribeWs$2$1$emit$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                ArrayList<SignalUpdate> arrayList = new ArrayList();
                for (T t : list) {
                    if (((SignalUpdate) t).copydefault() == SignalUpdate.Type.OVERVIEW) {
                        arrayList.add(t);
                    }
                }
                C29508kuv c29508kuv2 = this.KWHzl;
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                for (SignalUpdate signalUpdate : arrayList) {
                    arrayList2.add(c29508kuv2.valueOf.EZpvd(signalUpdate.OLrzqt().OLrzqt(), signalUpdate.OLrzqt().EZpvd(), c29508kuv2.gEmmrt));
                }
                C29508kuv c29508kuv3 = this.KWHzl;
                ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                it = arrayList2.iterator();
                anonymousClass4 = this;
                c29508kuv = c29508kuv3;
                collection = arrayList3;
                if (it.hasNext()) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                collection = (Collection) getSignalOverviewListUseCase$subscribeWs$2$1$emit$1.L$4;
                it = (Iterator) getSignalOverviewListUseCase$subscribeWs$2$1$emit$1.L$3;
                Collection collection2 = (Collection) getSignalOverviewListUseCase$subscribeWs$2$1$emit$1.L$2;
                c29508kuv = (C29508kuv) getSignalOverviewListUseCase$subscribeWs$2$1$emit$1.L$1;
                anonymousClass4 = (AnonymousClass4) getSignalOverviewListUseCase$subscribeWs$2$1$emit$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                collection.add((List) objOLrzqt);
                collection = collection2;
                if (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    List<SignalOverview> list2 = (List) pair.getFirst();
                    Map<String, TokenInfo> map = (Map) pair.getSecond();
                    getSignalOverviewListUseCase$subscribeWs$2$1$emit$1.L$0 = anonymousClass4;
                    getSignalOverviewListUseCase$subscribeWs$2$1$emit$1.L$1 = c29508kuv;
                    getSignalOverviewListUseCase$subscribeWs$2$1$emit$1.L$2 = collection;
                    getSignalOverviewListUseCase$subscribeWs$2$1$emit$1.L$3 = it;
                    getSignalOverviewListUseCase$subscribeWs$2$1$emit$1.L$4 = collection;
                    getSignalOverviewListUseCase$subscribeWs$2$1$emit$1.label = 1;
                    objOLrzqt = c29508kuv.OLrzqt(list2, map, true, getSignalOverviewListUseCase$subscribeWs$2$1$emit$1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    collection2 = collection;
                    collection.add((List) objOLrzqt);
                    collection = collection2;
                    if (it.hasNext()) {
                        List listQOLQEE = C56403yEb.QOLQEE((List) collection);
                        if (!listQOLQEE.isEmpty()) {
                            MutableStateFlow mutableStateFlow = anonymousClass4.KWHzl.KWHzl;
                            C29508kuv c29508kuv4 = anonymousClass4.KWHzl;
                            do {
                                value = mutableStateFlow.getValue();
                                listAhwBna = (List) c29508kuv4.KWHzl.getValue();
                                if (listAhwBna == null) {
                                    listAhwBna = yDY.AhwBna();
                                }
                            } while (!mutableStateFlow.compareAndSet(value, c29508kuv4.KWHzl(CollectionsKt___CollectionsKt.djBIcL((Collection) listQOLQEE, (Iterable) listAhwBna))));
                            anonymousClass4.KWHzl.OLrzqt.setValue(C56443yFo.KWHzl(true));
                        }
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC29466kuF interfaceC29466kuF = this.this$0.AYXKKw;
            List<String> list = this.$allChainIds;
            this.label = 1;
            obj = interfaceC29466kuF.EZpvd(list, this);
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
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0);
        this.label = 2;
        if (((Flow) obj).collect(anonymousClass4, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
