package com.okinc.im.usecase.group.announcement;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35793oDx;
import o.C44458sQo;
import o.C56391yDq;
import o.C56442yFn;
import o.sIR;

/* JADX INFO: loaded from: classes8.dex */
public final class GetGroupAnnouncementListUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C35793oDx.StateListAnimator>>, Object> {
    final /* synthetic */ String $groupId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35793oDx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetGroupAnnouncementListUseCase$invoke$2(C35793oDx c35793oDx, String str, Continuation<? super GetGroupAnnouncementListUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c35793oDx;
        this.$groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetGroupAnnouncementListUseCase$invoke$2 getGroupAnnouncementListUseCase$invoke$2 = new GetGroupAnnouncementListUseCase$invoke$2(this.this$0, this.$groupId, continuation);
        getGroupAnnouncementListUseCase$invoke$2.L$0 = obj;
        return getGroupAnnouncementListUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C35793oDx.StateListAnimator>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<C35793oDx.StateListAnimator>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<C35793oDx.StateListAnimator>> continuation) {
        return ((GetGroupAnnouncementListUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C35793oDx c35793oDx = this.this$0;
                String str = this.$groupId;
                Result.Application application = Result.Companion;
                sIR sir = c35793oDx.KWHzl;
                this.label = 1;
                obj = sir.KWHzl(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            C44458sQo c44458sQo = (C44458sQo) obj;
            objM7377constructorimpl = Result.m7377constructorimpl(new C35793oDx.StateListAnimator(c44458sQo.copydefault(), c44458sQo.AEQbTJ()));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
