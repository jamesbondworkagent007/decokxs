package com.okinc.im.imui.group.qrcode.viewmodel;

import com.okinc.im.imui.group.qrcode.viewmodel.GroupQrViewModel;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class GroupQrViewModel$getGroupInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $groupId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GroupQrViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupQrViewModel$getGroupInfo$1(GroupQrViewModel groupQrViewModel, long j, Continuation<? super GroupQrViewModel$getGroupInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = groupQrViewModel;
        this.$groupId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupQrViewModel$getGroupInfo$1 groupQrViewModel$getGroupInfo$1 = new GroupQrViewModel$getGroupInfo$1(this.this$0, this.$groupId, continuation);
        groupQrViewModel$getGroupInfo$1.L$0 = obj;
        return groupQrViewModel$getGroupInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupQrViewModel$getGroupInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.group.qrcode.viewmodel.GroupQrViewModel$getGroupInfo$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $groupId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ GroupQrViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GroupQrViewModel groupQrViewModel, long j, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = groupQrViewModel;
            this.$groupId = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$groupId, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.qrcode.viewmodel.GroupQrViewModel$getGroupInfo$1$1$StateListAnimator */
        public static final class StateListAnimator implements Flow<GroupQrViewModel.TaskDescription.C0451TaskDescription> {
            public final /* synthetic */ Flow KWHzl;

            /* JADX INFO: renamed from: com.okinc.im.imui.group.qrcode.viewmodel.GroupQrViewModel$getGroupInfo$1$1$StateListAnimator$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector OLrzqt;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass2(FlowCollector flowCollector) {
                    this.OLrzqt = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    GroupQrViewModel$getGroupInfo$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1 groupQrViewModel$getGroupInfo$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1;
                    if (continuation instanceof GroupQrViewModel$getGroupInfo$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1) {
                        groupQrViewModel$getGroupInfo$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1 = (GroupQrViewModel$getGroupInfo$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1) continuation;
                        int i = groupQrViewModel$getGroupInfo$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            groupQrViewModel$getGroupInfo$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            groupQrViewModel$getGroupInfo$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1 = new GroupQrViewModel$getGroupInfo$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1(this, continuation);
                        }
                    }
                    Object obj2 = groupQrViewModel$getGroupInfo$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = groupQrViewModel$getGroupInfo$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.OLrzqt;
                        GroupInfo groupInfo = (GroupInfo) obj;
                        GroupQrViewModel.TaskDescription.C0451TaskDescription c0451TaskDescription = new GroupQrViewModel.TaskDescription.C0451TaskDescription(groupInfo.getAvatar(), groupInfo.getName(), groupInfo.getOfficialTags(), groupInfo.isAllowGeneratingInvitationQrCode(), groupInfo);
                        groupQrViewModel$getGroupInfo$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label = 1;
                        if (flowCollector.emit(c0451TaskDescription, groupQrViewModel$getGroupInfo$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public StateListAnimator(Flow flow) {
                this.KWHzl = flow;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super GroupQrViewModel.TaskDescription.C0451TaskDescription> flowCollector, Continuation continuation) {
                Object objCollect = this.KWHzl.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            Object obj2;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                GroupQrViewModel groupQrViewModel = this.this$0;
                long j = this.$groupId;
                Result.Application application2 = Result.Companion;
                StateListAnimator stateListAnimator = new StateListAnimator(FlowKt.filterNotNull(groupQrViewModel.OLrzqt.AEQbTJ(String.valueOf(j))));
                this.label = 1;
                obj = FlowKt.first(stateListAnimator, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    GroupQrViewModel groupQrViewModel2 = this.this$0;
                    if (Result.m7384isSuccessimpl(obj2)) {
                        MutableStateFlow mutableStateFlow = groupQrViewModel2.KWHzl;
                        this.L$0 = obj2;
                        this.label = 3;
                        if (mutableStateFlow.emit((GroupQrViewModel.TaskDescription.C0451TaskDescription) obj2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((GroupQrViewModel.TaskDescription.C0451TaskDescription) obj);
            obj2 = objM7377constructorimpl;
            GroupQrViewModel groupQrViewModel3 = this.this$0;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
            if (thM7380exceptionOrNullimpl != null) {
                C44124sEe.AYXKKw("Error getting group info", thM7380exceptionOrNullimpl);
                String message = thM7380exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "Error";
                }
                GroupQrViewModel.TaskDescription.StateListAnimator stateListAnimator2 = new GroupQrViewModel.TaskDescription.StateListAnimator(thM7380exceptionOrNullimpl, message);
                MutableStateFlow mutableStateFlow2 = groupQrViewModel3.KWHzl;
                this.L$0 = obj2;
                this.label = 2;
                if (mutableStateFlow2.emit(stateListAnimator2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            GroupQrViewModel groupQrViewModel22 = this.this$0;
            if (Result.m7384isSuccessimpl(obj2)) {
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
            GroupQrViewModel.TaskDescription.Activity activity = GroupQrViewModel.TaskDescription.Activity.KWHzl;
            this.L$0 = coroutineScope2;
            this.label = 1;
            if (mutableStateFlow.emit(activity, this) == objCopydefault) {
                return objCopydefault;
            }
            coroutineScope = coroutineScope2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            coroutineScope = coroutineScope3;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.this$0, this.$groupId, null), 3, null);
        return Unit.INSTANCE;
    }
}
