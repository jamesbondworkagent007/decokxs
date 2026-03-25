package com.okinc.im.usecase.banner;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C35750oCh;
import o.C36551odB;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveGroupAnnouncementBannerUseCase$execute$1 extends SuspendLambda implements Function2<FlowCollector<? super C36551odB>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<GroupInfo> $groupInfoFlow;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35750oCh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveGroupAnnouncementBannerUseCase$execute$1(Flow<GroupInfo> flow, C35750oCh c35750oCh, Continuation<? super ObserveGroupAnnouncementBannerUseCase$execute$1> continuation) {
        super(2, continuation);
        this.$groupInfoFlow = flow;
        this.this$0 = c35750oCh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObserveGroupAnnouncementBannerUseCase$execute$1 observeGroupAnnouncementBannerUseCase$execute$1 = new ObserveGroupAnnouncementBannerUseCase$execute$1(this.$groupInfoFlow, this.this$0, continuation);
        observeGroupAnnouncementBannerUseCase$execute$1.L$0 = obj;
        return observeGroupAnnouncementBannerUseCase$execute$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super C36551odB> flowCollector, Continuation<? super Unit> continuation) {
        return ((ObserveGroupAnnouncementBannerUseCase$execute$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class ActionBar implements Flow<C36551odB> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C35750oCh OLrzqt;

        /* JADX INFO: renamed from: com.okinc.im.usecase.banner.ObserveGroupAnnouncementBannerUseCase$execute$1$ActionBar$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ C35750oCh OLrzqt;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C35750oCh c35750oCh) {
                this.copydefault = flowCollector;
                this.OLrzqt = c35750oCh;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                ObserveGroupAnnouncementBannerUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1 observeGroupAnnouncementBannerUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1;
                if (continuation instanceof ObserveGroupAnnouncementBannerUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1) {
                    observeGroupAnnouncementBannerUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1 = (ObserveGroupAnnouncementBannerUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = observeGroupAnnouncementBannerUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observeGroupAnnouncementBannerUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observeGroupAnnouncementBannerUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1 = new ObserveGroupAnnouncementBannerUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = observeGroupAnnouncementBannerUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = observeGroupAnnouncementBannerUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    GroupInfo groupInfo = (GroupInfo) obj;
                    C36551odB c36551odBEZpvd = groupInfo != null ? this.OLrzqt.EZpvd(groupInfo) : null;
                    observeGroupAnnouncementBannerUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(c36551odBEZpvd, observeGroupAnnouncementBannerUseCase$execute$1$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, C35750oCh c35750oCh) {
            this.AEQbTJ = flow;
            this.OLrzqt = c35750oCh;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super C36551odB> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass5(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            this.L$0 = flowCollector;
            this.label = 1;
            if (flowCollector.emit(null, this) == objCopydefault) {
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
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        ActionBar actionBar = new ActionBar(this.$groupInfoFlow, this.this$0);
        this.L$0 = null;
        this.label = 2;
        if (FlowKt.emitAll(flowCollector, actionBar, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
