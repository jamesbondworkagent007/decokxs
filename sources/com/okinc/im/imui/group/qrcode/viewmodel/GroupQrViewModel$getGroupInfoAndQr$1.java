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
public final class GroupQrViewModel$getGroupInfoAndQr$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $groupId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GroupQrViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupQrViewModel$getGroupInfoAndQr$1(GroupQrViewModel groupQrViewModel, long j, Continuation<? super GroupQrViewModel$getGroupInfoAndQr$1> continuation) {
        super(2, continuation);
        this.this$0 = groupQrViewModel;
        this.$groupId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupQrViewModel$getGroupInfoAndQr$1 groupQrViewModel$getGroupInfoAndQr$1 = new GroupQrViewModel$getGroupInfoAndQr$1(this.this$0, this.$groupId, continuation);
        groupQrViewModel$getGroupInfoAndQr$1.L$0 = obj;
        return groupQrViewModel$getGroupInfoAndQr$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupQrViewModel$getGroupInfoAndQr$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.group.qrcode.viewmodel.GroupQrViewModel$getGroupInfoAndQr$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $groupId;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
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

        /* JADX INFO: renamed from: com.okinc.im.imui.group.qrcode.viewmodel.GroupQrViewModel$getGroupInfoAndQr$1$1$Activity */
        public static final class Activity implements Flow<GroupQrViewModel.TaskDescription.C0451TaskDescription> {
            public final /* synthetic */ Flow AEQbTJ;

            /* JADX INFO: renamed from: com.okinc.im.imui.group.qrcode.viewmodel.GroupQrViewModel$getGroupInfoAndQr$1$1$Activity$1, reason: invalid class name and collision with other inner class name */
            public static final class C04521<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public C04521(FlowCollector flowCollector) {
                    this.copydefault = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    GroupQrViewModel$getGroupInfoAndQr$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1 groupQrViewModel$getGroupInfoAndQr$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1;
                    if (continuation instanceof GroupQrViewModel$getGroupInfoAndQr$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1) {
                        groupQrViewModel$getGroupInfoAndQr$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1 = (GroupQrViewModel$getGroupInfoAndQr$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1) continuation;
                        int i = groupQrViewModel$getGroupInfoAndQr$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            groupQrViewModel$getGroupInfoAndQr$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            groupQrViewModel$getGroupInfoAndQr$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1 = new GroupQrViewModel$getGroupInfoAndQr$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1(this, continuation);
                        }
                    }
                    Object obj2 = groupQrViewModel$getGroupInfoAndQr$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = groupQrViewModel$getGroupInfoAndQr$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.copydefault;
                        GroupInfo groupInfo = (GroupInfo) obj;
                        GroupQrViewModel.TaskDescription.C0451TaskDescription c0451TaskDescription = new GroupQrViewModel.TaskDescription.C0451TaskDescription(groupInfo.getAvatar(), groupInfo.getName(), groupInfo.getOfficialTags(), groupInfo.isAllowGeneratingInvitationQrCode(), groupInfo);
                        groupQrViewModel$getGroupInfoAndQr$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label = 1;
                        if (flowCollector.emit(c0451TaskDescription, groupQrViewModel$getGroupInfoAndQr$1$1$invokeSuspend$lambda$1$$inlined$map$1$2$1) == objCopydefault) {
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

            public Activity(Flow flow) {
                this.AEQbTJ = flow;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super GroupQrViewModel.TaskDescription.C0451TaskDescription> flowCollector, Continuation continuation) {
                Object objCollect = this.AEQbTJ.collect(new C04521(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00cf A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            Object obj2;
            GroupQrViewModel groupQrViewModel;
            long j;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                GroupQrViewModel groupQrViewModel2 = this.this$0;
                long j2 = this.$groupId;
                Result.Application application2 = Result.Companion;
                Activity activity = new Activity(FlowKt.filterNotNull(groupQrViewModel2.OLrzqt.AEQbTJ(String.valueOf(j2))));
                this.label = 1;
                obj = FlowKt.first(activity, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C56391yDq.AEQbTJ(obj);
                            return Unit.INSTANCE;
                        }
                        j = this.J$0;
                        groupQrViewModel = (GroupQrViewModel) this.L$1;
                        obj2 = this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.label = 4;
                        if (groupQrViewModel.KWHzl(j, false, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    Object obj3 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    obj2 = obj3;
                    groupQrViewModel = this.this$0;
                    long j3 = this.$groupId;
                    if (Result.m7384isSuccessimpl(obj2)) {
                        MutableStateFlow mutableStateFlow = groupQrViewModel.KWHzl;
                        this.L$0 = obj2;
                        this.L$1 = groupQrViewModel;
                        this.J$0 = j3;
                        this.label = 3;
                        if (mutableStateFlow.emit((GroupQrViewModel.TaskDescription.C0451TaskDescription) obj2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        j = j3;
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.label = 4;
                        if (groupQrViewModel.KWHzl(j, false, this) == objCopydefault) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((GroupQrViewModel.TaskDescription.C0451TaskDescription) obj);
            GroupQrViewModel groupQrViewModel3 = this.this$0;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                C44124sEe.AYXKKw("Error getting group info", thM7380exceptionOrNullimpl);
                String message = thM7380exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "Error";
                }
                GroupQrViewModel.TaskDescription.StateListAnimator stateListAnimator = new GroupQrViewModel.TaskDescription.StateListAnimator(thM7380exceptionOrNullimpl, message);
                MutableStateFlow mutableStateFlow2 = groupQrViewModel3.KWHzl;
                this.L$0 = objM7377constructorimpl;
                this.label = 2;
                if (mutableStateFlow2.emit(stateListAnimator, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            obj2 = objM7377constructorimpl;
            groupQrViewModel = this.this$0;
            long j32 = this.$groupId;
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
