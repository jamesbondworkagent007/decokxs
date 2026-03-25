package com.okinc.im.usecase.banner;

import com.okinc.okimcore.model.other.AnnouncementBanner;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35745oCc;
import o.C56391yDq;
import o.C56442yFn;
import o.sGF;

/* JADX INFO: loaded from: classes8.dex */
public final class GetSystemAnnouncementBannerUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AnnouncementBanner>, Object> {
    int label;
    final /* synthetic */ C35745oCc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSystemAnnouncementBannerUseCase$execute$2(C35745oCc c35745oCc, Continuation<? super GetSystemAnnouncementBannerUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = c35745oCc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSystemAnnouncementBannerUseCase$execute$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AnnouncementBanner> continuation) {
        return ((GetSystemAnnouncementBannerUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sGF sgf = this.this$0.AEQbTJ;
            this.label = 1;
            obj = sgf.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
