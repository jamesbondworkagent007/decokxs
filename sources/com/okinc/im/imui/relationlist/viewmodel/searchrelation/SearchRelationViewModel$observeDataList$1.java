package com.okinc.im.imui.relationlist.viewmodel.searchrelation;

import com.okinc.im.bean.ContactType;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import com.okinc.okimcore.model.other.VipManagerRelationInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C37244oqF;
import o.C37246oqH;
import o.C37288oqx;
import o.C44157sFk;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yHS;

/* JADX INFO: loaded from: classes18.dex */
public final class SearchRelationViewModel$observeDataList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SearchRelationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRelationViewModel$observeDataList$1(SearchRelationViewModel searchRelationViewModel, Continuation<? super SearchRelationViewModel$observeDataList$1> continuation) {
        super(2, continuation);
        this.this$0 = searchRelationViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchRelationViewModel$observeDataList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchRelationViewModel$observeDataList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowCombine = FlowKt.combine(FlowKt.distinctUntilChanged(this.this$0.isConnected.AEQbTJ(ContactType.ALL_FRIEND)), this.this$0.copydefault, this.this$0.fetchVPNInfo, this.this$0.DbNXlk, new AnonymousClass1(this.this$0, null));
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

    /* JADX INFO: renamed from: com.okinc.im.imui.relationlist.viewmodel.searchrelation.SearchRelationViewModel$observeDataList$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHS<List<? extends RelationInfo>, List<? extends C37246oqH>, VipManagerRelationInfo, String, Continuation<? super List<? extends Object>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        int label;
        final /* synthetic */ SearchRelationViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchRelationViewModel searchRelationViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(5, continuation);
            this.this$0 = searchRelationViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHS
        public /* bridge */ /* synthetic */ Object invoke(List<? extends RelationInfo> list, List<? extends C37246oqH> list2, VipManagerRelationInfo vipManagerRelationInfo, String str, Continuation<? super List<? extends Object>> continuation) {
            return invoke2((List<RelationInfo>) list, (List<C37246oqH>) list2, vipManagerRelationInfo, str, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<RelationInfo> list, List<C37246oqH> list2, VipManagerRelationInfo vipManagerRelationInfo, String str, Continuation<? super List<? extends Object>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = list;
            anonymousClass1.L$1 = list2;
            anonymousClass1.L$2 = vipManagerRelationInfo;
            anonymousClass1.L$3 = str;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            VipManagerRelationInfo vipManagerRelationInfo;
            AnonymousClass1 anonymousClass1;
            Object next;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List list = (List) this.L$0;
                List list2 = (List) this.L$1;
                VipManagerRelationInfo vipManagerRelationInfo2 = (VipManagerRelationInfo) this.L$2;
                String str = (String) this.L$3;
                pUU.KWHzl("SearchRelationViewModel", "observe friend list with searchKeyword:" + str);
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList<RelationInfo> arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    vipManagerRelationInfo = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next2 = it.next();
                    RelationInfo relationInfo = (RelationInfo) next2;
                    if (str != null && str.length() != 0 && (StringsKt__StringsKt.AhwBna((CharSequence) C44157sFk.getDisplayName$default(relationInfo, null, 1, null), (CharSequence) str, true) || C37288oqx.AEQbTJ(relationInfo.getPhoneRawNumber(), str))) {
                        arrayList.add(next2);
                    }
                }
                int i = 10;
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                for (RelationInfo relationInfo2 : arrayList) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        List<PhoneRelation> listOLrzqt = ((C37246oqH) next).OLrzqt();
                        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, i));
                        Iterator<T> it3 = listOLrzqt.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(((PhoneRelation) it3.next()).getHash());
                        }
                        if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends String>) ((Iterable<? extends Object>) arrayList3), relationInfo2.getHash())) {
                            break;
                        }
                    }
                    C37246oqH c37246oqH = (C37246oqH) next;
                    String strEZpvd = c37246oqH != null ? c37246oqH.EZpvd() : null;
                    if (strEZpvd == null) {
                        strEZpvd = "";
                    }
                    ArrayList arrayList4 = arrayList2;
                    arrayList4.add(new C37244oqF(relationInfo2, strEZpvd, str, null, 8, null));
                    i = 10;
                    arrayList2 = arrayList4;
                    vipManagerRelationInfo = null;
                }
                VipManagerRelationInfo vipManagerRelationInfo3 = vipManagerRelationInfo;
                Pair pairOLrzqt = C56390yDp.OLrzqt(arrayList2, C56443yFo.KWHzl(System.currentTimeMillis() - jCurrentTimeMillis));
                List list3 = (List) pairOLrzqt.getFirst();
                pUU.KWHzl("SearchRelationViewModel", "search friend list processing time: " + pairOLrzqt.getSecond());
                ArrayList arrayList5 = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(((RelationInfo) it4.next()).getHash());
                }
                Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList5);
                ArrayList arrayList6 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                Iterator it5 = list2.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(C37288oqx.copydefault((C37246oqH) it5.next(), str));
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj2 : arrayList6) {
                    List<PhoneRelation> listOLrzqt2 = ((C37246oqH) obj2).OLrzqt();
                    ArrayList arrayList8 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt2, 10));
                    Iterator<T> it6 = listOLrzqt2.iterator();
                    while (it6.hasNext()) {
                        arrayList8.add(((PhoneRelation) it6.next()).getHash());
                    }
                    if (!arrayList8.isEmpty()) {
                        Iterator it7 = arrayList8.iterator();
                        while (it7.hasNext()) {
                            if (setOqFWZa.contains((String) it7.next())) {
                                break;
                            }
                        }
                    }
                    arrayList7.add(obj2);
                }
                ArrayList arrayList9 = new ArrayList();
                for (Object obj3 : arrayList7) {
                    if (C37288oqx.KWHzl((C37246oqH) obj3, str)) {
                        arrayList9.add(obj3);
                    }
                }
                if (str == null || str.length() == 0 || vipManagerRelationInfo2 == null || !StringsKt__StringsKt.AhwBna((CharSequence) vipManagerRelationInfo2.getRelationInfo().getNickName(), (CharSequence) str, true)) {
                    anonymousClass1 = this;
                    vipManagerRelationInfo2 = vipManagerRelationInfo3;
                } else {
                    anonymousClass1 = this;
                }
                return anonymousClass1.this$0.KWHzl(list3, arrayList9, vipManagerRelationInfo2, str);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.relationlist.viewmodel.searchrelation.SearchRelationViewModel$observeDataList$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends Object>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SearchRelationViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SearchRelationViewModel searchRelationViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = searchRelationViewModel;
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
                pUU.KWHzl("SearchRelationViewModel", "observe data list: " + list.size());
                this.this$0.AEQbTJ.setValue(list);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
