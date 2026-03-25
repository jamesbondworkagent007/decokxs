package com.okinc.im.imui.relationlist.viewmodel.selectrelation;

import androidx.lifecycle.LiveData;
import com.okinc.im.bean.ContactType;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C37246oqH;
import o.C37248oqJ;
import o.C44157sFk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pUU;
import o.yDY;
import o.yHS;

/* JADX INFO: loaded from: classes18.dex */
public final class MultiSelectRelationViewModel$observeDataList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MultiSelectRelationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectRelationViewModel$observeDataList$1(MultiSelectRelationViewModel multiSelectRelationViewModel, Continuation<? super MultiSelectRelationViewModel$observeDataList$1> continuation) {
        super(2, continuation);
        this.this$0 = multiSelectRelationViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiSelectRelationViewModel$observeDataList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MultiSelectRelationViewModel$observeDataList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowCombine = FlowKt.combine(FlowKt.distinctUntilChanged(this.this$0.fARcdN.AEQbTJ(ContactType.ALL_FRIEND)), this.this$0.EZpvd, this.this$0.ejfBZ, this.this$0.gEmmrt, new AnonymousClass1(this.this$0, null));
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

    /* JADX INFO: renamed from: com.okinc.im.imui.relationlist.viewmodel.selectrelation.MultiSelectRelationViewModel$observeDataList$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHS<List<? extends RelationInfo>, List<? extends C37246oqH>, String, Set<? extends String>, Continuation<? super List<? extends Object>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        int label;
        final /* synthetic */ MultiSelectRelationViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MultiSelectRelationViewModel multiSelectRelationViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(5, continuation);
            this.this$0 = multiSelectRelationViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHS
        public /* bridge */ /* synthetic */ Object invoke(List<? extends RelationInfo> list, List<? extends C37246oqH> list2, String str, Set<? extends String> set, Continuation<? super List<? extends Object>> continuation) {
            return invoke2((List<RelationInfo>) list, (List<C37246oqH>) list2, str, (Set<String>) set, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<RelationInfo> list, List<C37246oqH> list2, String str, Set<String> set, Continuation<? super List<? extends Object>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = list;
            anonymousClass1.L$1 = list2;
            anonymousClass1.L$2 = str;
            anonymousClass1.L$3 = set;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List<String> listAhwBna;
            LiveData<List<String>> liveDataOLrzqt;
            Object next;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List list = (List) this.L$0;
                List list2 = (List) this.L$1;
                String str = (String) this.L$2;
                Set set = (Set) this.L$3;
                pUU.KWHzl("MultiSelectRelationViewModel", "observe friend list with searchKeyword:" + str);
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    RelationInfo relationInfo = (RelationInfo) it.next();
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        List<PhoneRelation> listOLrzqt = ((C37246oqH) next).OLrzqt();
                        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                        Iterator<T> it3 = listOLrzqt.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((PhoneRelation) it3.next()).getHash());
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
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList) {
                    C37248oqJ c37248oqJ = (C37248oqJ) obj2;
                    boolean z = false;
                    boolean z2 = str == null || str.length() == 0;
                    if (str != null && str.length() != 0 && StringsKt__StringsKt.AhwBna((CharSequence) C44157sFk.getDisplayName$default(c37248oqJ.OLrzqt(), null, 1, null), (CharSequence) str, true)) {
                        z = true;
                    }
                    if (z2 || z) {
                        arrayList3.add(obj2);
                    }
                }
                SelectRelationActivityViewModel selectRelationActivityViewModel = this.this$0.valueOf;
                if (selectRelationActivityViewModel == null || (liveDataOLrzqt = selectRelationActivityViewModel.OLrzqt()) == null || (listAhwBna = liveDataOLrzqt.getValue()) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                return this.this$0.copydefault(arrayList3, set, CollectionsKt___CollectionsKt.OqFWZa(listAhwBna), str);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.relationlist.viewmodel.selectrelation.MultiSelectRelationViewModel$observeDataList$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends Object>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MultiSelectRelationViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MultiSelectRelationViewModel multiSelectRelationViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = multiSelectRelationViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends Object> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List list = (List) this.L$0;
                pUU.KWHzl("MultiSelectRelationViewModel", "observe data list: " + list.size());
                this.this$0.copydefault.setValue(list);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
