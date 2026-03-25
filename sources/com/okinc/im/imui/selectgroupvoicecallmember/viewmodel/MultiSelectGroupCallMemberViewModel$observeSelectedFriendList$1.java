package com.okinc.im.imui.selectgroupvoicecallmember.viewmodel;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C34282nYe;
import o.C36588odm;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C56548yJl;
import o.pUU;
import o.yET;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class MultiSelectGroupCallMemberViewModel$observeSelectedFriendList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MultiSelectGroupCallMemberViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectGroupCallMemberViewModel$observeSelectedFriendList$1(MultiSelectGroupCallMemberViewModel multiSelectGroupCallMemberViewModel, Continuation<? super MultiSelectGroupCallMemberViewModel$observeSelectedFriendList$1> continuation) {
        super(2, continuation);
        this.this$0 = multiSelectGroupCallMemberViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiSelectGroupCallMemberViewModel$observeSelectedFriendList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MultiSelectGroupCallMemberViewModel$observeSelectedFriendList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.MultiSelectGroupCallMemberViewModel$observeSelectedFriendList$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHO<List<? extends C34282nYe>, Set<? extends String>, Continuation<? super List<? extends C34282nYe>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHO
        public /* bridge */ /* synthetic */ Object invoke(List<? extends C34282nYe> list, Set<? extends String> set, Continuation<? super List<? extends C34282nYe>> continuation) {
            return invoke2((List<C34282nYe>) list, (Set<String>) set, (Continuation<? super List<C34282nYe>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<C34282nYe> list, Set<String> set, Continuation<? super List<C34282nYe>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = list;
            anonymousClass1.L$1 = set;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.MultiSelectGroupCallMemberViewModel$observeSelectedFriendList$1$1$Application */
        public static final class Application<T> implements Comparator {
            public final /* synthetic */ Map EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(Map map) {
                this.EZpvd = map;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return yET.KWHzl((Integer) this.EZpvd.get(((C34282nYe) t).AhwBna()), (Integer) this.EZpvd.get(((C34282nYe) t2).AhwBna()));
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List list = (List) this.L$0;
                Iterable<IndexedValue> iterableDCJXGO = CollectionsKt___CollectionsKt.DCJXGO((Set) this.L$1);
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(iterableDCJXGO, 10)), 16));
                for (IndexedValue indexedValue : iterableDCJXGO) {
                    Pair pairOLrzqt = C56390yDp.OLrzqt(indexedValue.AEQbTJ(), C56443yFo.AEQbTJ(indexedValue.OLrzqt()));
                    linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (linkedHashMap.containsKey(((C34282nYe) obj2).AhwBna())) {
                        arrayList.add(obj2);
                    }
                }
                return CollectionsKt___CollectionsKt.EZpvd(arrayList, new Application(linkedHashMap));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.flowOn(FlowKt.combine(this.this$0.djBIcL, this.this$0.AYXKKw, new AnonymousClass1(null)), Dispatchers.getDefault()));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.MultiSelectGroupCallMemberViewModel$observeSelectedFriendList$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends C34282nYe>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MultiSelectGroupCallMemberViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MultiSelectGroupCallMemberViewModel multiSelectGroupCallMemberViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = multiSelectGroupCallMemberViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends C34282nYe> list, Continuation<? super Unit> continuation) {
            return invoke2((List<C34282nYe>) list, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<C34282nYe> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                List list = (List) this.L$0;
                pUU.KWHzl("MultiSelectRelationViewModel", "updateSelectedDisplayList => size:" + list.size());
                MutableLiveData mutableLiveData = this.this$0.gEmmrt;
                this.label = 1;
                if (C36588odm.KWHzl(mutableLiveData, list, this) == objCopydefault) {
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
}
