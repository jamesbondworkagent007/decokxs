package com.okinc.im.imui.relationlist.viewmodel.newmessage;

import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C37246oqH;
import o.C37248oqJ;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class NewMessageViewModel$observeAndConstructFriendRelationList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ NewMessageViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewMessageViewModel$observeAndConstructFriendRelationList$1(NewMessageViewModel newMessageViewModel, Continuation<? super NewMessageViewModel$observeAndConstructFriendRelationList$1> continuation) {
        super(2, continuation);
        this.this$0 = newMessageViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewMessageViewModel$observeAndConstructFriendRelationList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NewMessageViewModel$observeAndConstructFriendRelationList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowCombine = FlowKt.combine(this.this$0.OLrzqt, this.this$0.AYXKKw, new AnonymousClass1(null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.im.imui.relationlist.viewmodel.newmessage.NewMessageViewModel$observeAndConstructFriendRelationList$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHO<List<? extends RelationInfo>, List<? extends C37246oqH>, Continuation<? super List<? extends C37248oqJ>>, Object> {
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
        public /* bridge */ /* synthetic */ Object invoke(List<? extends RelationInfo> list, List<? extends C37246oqH> list2, Continuation<? super List<? extends C37248oqJ>> continuation) {
            return invoke2((List<RelationInfo>) list, (List<C37246oqH>) list2, (Continuation<? super List<C37248oqJ>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<RelationInfo> list, List<C37246oqH> list2, Continuation<? super List<C37248oqJ>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = list;
            anonymousClass1.L$1 = list2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object next;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List<RelationInfo> list = (List) this.L$0;
                List list2 = (List) this.L$1;
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (RelationInfo relationInfo : list) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        List<PhoneRelation> listOLrzqt = ((C37246oqH) next).OLrzqt();
                        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                        Iterator<T> it2 = listOLrzqt.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((PhoneRelation) it2.next()).getHash());
                        }
                        if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends String>) ((Iterable<? extends Object>) arrayList2), relationInfo.getHash())) {
                            break;
                        }
                    }
                    C37246oqH c37246oqH = (C37246oqH) next;
                    String strEZpvd = c37246oqH != null ? c37246oqH.EZpvd() : null;
                    if (strEZpvd == null) {
                        strEZpvd = "";
                    }
                    arrayList.add(new C37248oqJ(strEZpvd, relationInfo));
                }
                Pair pairOLrzqt = C56390yDp.OLrzqt(arrayList, C56443yFo.KWHzl(System.currentTimeMillis() - jCurrentTimeMillis));
                pUU.KWHzl("NewMessageViewModel", "friend list processing time: " + pairOLrzqt.getSecond());
                return pairOLrzqt.getFirst();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.relationlist.viewmodel.newmessage.NewMessageViewModel$observeAndConstructFriendRelationList$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends C37248oqJ>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ NewMessageViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NewMessageViewModel newMessageViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = newMessageViewModel;
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
        public /* bridge */ /* synthetic */ Object invoke(List<? extends C37248oqJ> list, Continuation<? super Unit> continuation) {
            return invoke2((List<C37248oqJ>) list, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<C37248oqJ> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.gEmmrt.setValue((List) this.L$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
