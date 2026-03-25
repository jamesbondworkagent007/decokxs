package com.okinc.im.imui.messageV2.view.banner.systemannouncement;

import com.okinc.okimcore.model.other.AnnouncementBanner;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35745oCc;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class SystemAnnouncementBannerViewModel$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SystemAnnouncementBannerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemAnnouncementBannerViewModel$init$1(SystemAnnouncementBannerViewModel systemAnnouncementBannerViewModel, Continuation<? super SystemAnnouncementBannerViewModel$init$1> continuation) {
        super(2, continuation);
        this.this$0 = systemAnnouncementBannerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SystemAnnouncementBannerViewModel$init$1 systemAnnouncementBannerViewModel$init$1 = new SystemAnnouncementBannerViewModel$init$1(this.this$0, continuation);
        systemAnnouncementBannerViewModel$init$1.L$0 = obj;
        return systemAnnouncementBannerViewModel$init$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SystemAnnouncementBannerViewModel$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SystemAnnouncementBannerViewModel systemAnnouncementBannerViewModel = this.this$0;
                Result.Application application = Result.Companion;
                C35745oCc c35745oCc = systemAnnouncementBannerViewModel.EZpvd;
                this.label = 1;
                obj = c35745oCc.EZpvd(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((AnnouncementBanner) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        this.this$0.OLrzqt.setValue((AnnouncementBanner) objM7377constructorimpl);
        return Unit.INSTANCE;
    }
}
