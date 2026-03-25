package com.okinc.im.imui.selectgroupvoicecallmember.viewmodel;

import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C34282nYe;
import o.C35551nxW;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHS;

/* JADX INFO: loaded from: classes18.dex */
public final class MultiSelectGroupCallMemberViewModel$observeDataList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $completedList;
    int label;
    final /* synthetic */ MultiSelectGroupCallMemberViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectGroupCallMemberViewModel$observeDataList$1(MultiSelectGroupCallMemberViewModel multiSelectGroupCallMemberViewModel, List<String> list, Continuation<? super MultiSelectGroupCallMemberViewModel$observeDataList$1> continuation) {
        super(2, continuation);
        this.this$0 = multiSelectGroupCallMemberViewModel;
        this.$completedList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiSelectGroupCallMemberViewModel$observeDataList$1(this.this$0, this.$completedList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MultiSelectGroupCallMemberViewModel$observeDataList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowCombine = FlowKt.combine(this.this$0.djBIcL, this.this$0.fJNWhG, this.this$0.AYXKKw, this.this$0.copydefault, new AnonymousClass1(this.$completedList, this.this$0, null));
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

    /* JADX INFO: renamed from: com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.MultiSelectGroupCallMemberViewModel$observeDataList$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHS<List<? extends C34282nYe>, String, Set<? extends String>, GroupInfo, Continuation<? super List<? extends Object>>, Object> {
        final /* synthetic */ List<String> $completedList;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        int label;
        final /* synthetic */ MultiSelectGroupCallMemberViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<String> list, MultiSelectGroupCallMemberViewModel multiSelectGroupCallMemberViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(5, continuation);
            this.$completedList = list;
            this.this$0 = multiSelectGroupCallMemberViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHS
        public /* bridge */ /* synthetic */ Object invoke(List<? extends C34282nYe> list, String str, Set<? extends String> set, GroupInfo groupInfo, Continuation<? super List<? extends Object>> continuation) {
            return invoke2((List<C34282nYe>) list, str, (Set<String>) set, groupInfo, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<C34282nYe> list, String str, Set<String> set, GroupInfo groupInfo, Continuation<? super List<? extends Object>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$completedList, this.this$0, continuation);
            anonymousClass1.L$0 = list;
            anonymousClass1.L$1 = str;
            anonymousClass1.L$2 = set;
            anonymousClass1.L$3 = groupInfo;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r8v11, resolved type: o.nxW */
        /* JADX DEBUG: Multi-variable search result rejected for r8v14, resolved type: com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.MultiSelectGroupCallMemberViewModel */
        /* JADX DEBUG: Multi-variable search result rejected for r8v5, resolved type: o.nxW */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            List<C34282nYe> listEZpvd;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List list = (List) this.L$0;
                String str = (String) this.L$1;
                Set set = (Set) this.L$2;
                GroupInfo groupInfo = (GroupInfo) this.L$3;
                pUU.KWHzl("MultiSelectRelationViewModel", "size of completedList in MultiSelectGroupCallMemberViewModel is " + this.$completedList.size());
                List arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!Intrinsics.EZpvd((Object) ((C34282nYe) obj2).AhwBna(), (Object) C44157sFk.EZpvd())) {
                        arrayList.add(obj2);
                    }
                }
                if (str != null && str.length() != 0) {
                    arrayList = this.this$0.EZpvd(arrayList, str, false);
                }
                if (groupInfo != null) {
                    Integer type = groupInfo.getType();
                    int value = GroupTagType.RM_VIP_GROUP.getValue();
                    if (type != null && type.intValue() == value) {
                        listEZpvd = C35551nxW.copydefault.AEQbTJ((List<C34282nYe>) arrayList);
                    } else {
                        listEZpvd = C35551nxW.copydefault.EZpvd((List<C34282nYe>) arrayList);
                    }
                }
                return this.this$0.KWHzl(listEZpvd, set, this.$completedList, str);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.MultiSelectGroupCallMemberViewModel$observeDataList$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends Object>, Continuation<? super Unit>, Object> {
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
                this.this$0.EZpvd.setValue(list);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
