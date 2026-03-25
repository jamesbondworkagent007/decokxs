package com.okinc.okex.center.viewmodel;

import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C45348soB;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportCenterHomeViewModel$checkSupportBanner$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SupportCenterHomeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportCenterHomeViewModel$checkSupportBanner$1(SupportCenterHomeViewModel supportCenterHomeViewModel, Continuation<? super SupportCenterHomeViewModel$checkSupportBanner$1> continuation) {
        super(2, continuation);
        this.this$0 = supportCenterHomeViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportCenterHomeViewModel$checkSupportBanner$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportCenterHomeViewModel$checkSupportBanner$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C45348soB c45348soB = this.this$0.valueOf;
            this.label = 1;
            obj = c45348soB.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C45348soB.Activity activity = (C45348soB.Activity) obj;
        if (activity instanceof C45348soB.Activity.Application) {
            C45348soB.Activity.Application application = (C45348soB.Activity.Application) activity;
            if (!application.OLrzqt().isEmpty()) {
                this.this$0.OLrzqt.setValue(new C32989mnw(CollectionsKt___CollectionsKt.AuCTelauCTel(application.OLrzqt())));
            }
        }
        return Unit.INSTANCE;
    }
}
