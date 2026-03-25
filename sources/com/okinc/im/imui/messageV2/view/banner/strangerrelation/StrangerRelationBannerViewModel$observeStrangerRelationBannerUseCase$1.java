package com.okinc.im.imui.messageV2.view.banner.strangerrelation;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C36557odH;
import o.C36588odm;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oDZ;

/* JADX INFO: loaded from: classes18.dex */
public final class StrangerRelationBannerViewModel$observeStrangerRelationBannerUseCase$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ StrangerRelationBannerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrangerRelationBannerViewModel$observeStrangerRelationBannerUseCase$1(StrangerRelationBannerViewModel strangerRelationBannerViewModel, Continuation<? super StrangerRelationBannerViewModel$observeStrangerRelationBannerUseCase$1> continuation) {
        super(2, continuation);
        this.this$0 = strangerRelationBannerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StrangerRelationBannerViewModel$observeStrangerRelationBannerUseCase$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StrangerRelationBannerViewModel$observeStrangerRelationBannerUseCase$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Flow<C36557odH> flowOLrzqt;
        FlowCollector<? super C36557odH> flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.this$0.AYXKKw) {
                StrangerRelationBannerViewModel strangerRelationBannerViewModel = this.this$0;
                Result.Application application2 = Result.Companion;
                oDZ odz = strangerRelationBannerViewModel.djBIcL;
                this.label = 1;
                obj = odz.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            flowOLrzqt = this.this$0.AkhnZx.OLrzqt((String) this.this$0.copydefault.getValue(), this.this$0.ejfBZ, z);
            final StrangerRelationBannerViewModel strangerRelationBannerViewModel2 = this.this$0;
            flowCollector = new FlowCollector() { // from class: com.okinc.im.imui.messageV2.view.banner.strangerrelation.StrangerRelationBannerViewModel$observeStrangerRelationBannerUseCase$1.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public final Object emit(C36557odH c36557odH, Continuation<? super Unit> continuation) {
                    Object objKWHzl = C36588odm.KWHzl(strangerRelationBannerViewModel2.fJNWhG, c36557odH, continuation);
                    return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
                }
            };
            this.label = 2;
            if (flowOLrzqt.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
        C56391yDq.AEQbTJ(obj);
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((Boolean) obj).booleanValue()));
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = C56443yFo.KWHzl(false);
        }
        if (!((Boolean) objM7377constructorimpl).booleanValue()) {
            z = false;
        }
        flowOLrzqt = this.this$0.AkhnZx.OLrzqt((String) this.this$0.copydefault.getValue(), this.this$0.ejfBZ, z);
        final StrangerRelationBannerViewModel strangerRelationBannerViewModel22 = this.this$0;
        flowCollector = new FlowCollector() { // from class: com.okinc.im.imui.messageV2.view.banner.strangerrelation.StrangerRelationBannerViewModel$observeStrangerRelationBannerUseCase$1.5
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public final Object emit(C36557odH c36557odH, Continuation<? super Unit> continuation) {
                Object objKWHzl = C36588odm.KWHzl(strangerRelationBannerViewModel22.fJNWhG, c36557odH, continuation);
                return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
            }
        };
        this.label = 2;
        if (flowOLrzqt.collect(flowCollector, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
