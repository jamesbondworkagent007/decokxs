package com.okinc.im.imui.group.giftcontact;

import com.okinc.okimcore.model.other.GroupMemberInfo;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oDO;

/* JADX INFO: loaded from: classes23.dex */
public final class GiftContactSelectionViewModel$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GiftContactSelectionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftContactSelectionViewModel$init$1(GiftContactSelectionViewModel giftContactSelectionViewModel, Continuation<? super GiftContactSelectionViewModel$init$1> continuation) {
        super(2, continuation);
        this.this$0 = giftContactSelectionViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GiftContactSelectionViewModel$init$1 giftContactSelectionViewModel$init$1 = new GiftContactSelectionViewModel$init$1(this.this$0, continuation);
        giftContactSelectionViewModel$init$1.L$0 = obj;
        return giftContactSelectionViewModel$init$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GiftContactSelectionViewModel$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.this$0, BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new GiftContactSelectionViewModel$init$1$loadingJob$1(this.this$0, null), 3, null), null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.group.giftcontact.GiftContactSelectionViewModel$init$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Job $loadingJob;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ GiftContactSelectionViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GiftContactSelectionViewModel giftContactSelectionViewModel, Job job, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = giftContactSelectionViewModel;
            this.$loadingJob = job;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$loadingJob, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            GiftContactSelectionViewModel giftContactSelectionViewModel;
            MutableStateFlow mutableStateFlow;
            GiftContactSelectionViewModel giftContactSelectionViewModel2;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                giftContactSelectionViewModel = this.this$0;
                Flow<List<GroupMemberInfo>> flowCopydefault = giftContactSelectionViewModel.gEmmrt.copydefault(this.this$0.EZpvd());
                this.L$0 = giftContactSelectionViewModel;
                this.label = 1;
                obj = FlowKt.first(flowCopydefault, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    giftContactSelectionViewModel2 = (GiftContactSelectionViewModel) this.L$1;
                    mutableStateFlow = (MutableStateFlow) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    mutableStateFlow.setValue(giftContactSelectionViewModel2.copydefault((List<GroupMemberInfo>) obj));
                    this.this$0.EZpvd.tryEmit(C56443yFo.KWHzl(false));
                    Job.DefaultImpls.cancel$default(this.$loadingJob, (CancellationException) null, 1, (Object) null);
                    return Unit.INSTANCE;
                }
                giftContactSelectionViewModel = (GiftContactSelectionViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            List listCopydefault = giftContactSelectionViewModel.copydefault((List<GroupMemberInfo>) obj);
            if (C33129mqd.KWHzl((Collection) listCopydefault)) {
                this.this$0.AEQbTJ.setValue(listCopydefault);
                this.this$0.AEQbTJ.tryEmit(listCopydefault);
                this.this$0.EZpvd.tryEmit(C56443yFo.KWHzl(false));
                Job.DefaultImpls.cancel$default(this.$loadingJob, (CancellationException) null, 1, (Object) null);
            }
            mutableStateFlow = this.this$0.AEQbTJ;
            GiftContactSelectionViewModel giftContactSelectionViewModel3 = this.this$0;
            oDO odo = giftContactSelectionViewModel3.KWHzl;
            String strEZpvd = this.this$0.EZpvd();
            this.L$0 = mutableStateFlow;
            this.L$1 = giftContactSelectionViewModel3;
            this.label = 2;
            Object objEZpvd = odo.EZpvd(strEZpvd, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            giftContactSelectionViewModel2 = giftContactSelectionViewModel3;
            obj = objEZpvd;
            mutableStateFlow.setValue(giftContactSelectionViewModel2.copydefault((List<GroupMemberInfo>) obj));
            this.this$0.EZpvd.tryEmit(C56443yFo.KWHzl(false));
            Job.DefaultImpls.cancel$default(this.$loadingJob, (CancellationException) null, 1, (Object) null);
            return Unit.INSTANCE;
        }
    }
}
