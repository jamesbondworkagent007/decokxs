package com.okinc.im.imui.group.announcement.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC34088nQz;
import o.C33129mqd;
import o.C35791oDv;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class NoticeboardViewModel$editNotice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $announcementId;
    final /* synthetic */ String $content;
    final /* synthetic */ String $groupId;
    final /* synthetic */ boolean $isPin;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ NoticeboardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeboardViewModel$editNotice$1(NoticeboardViewModel noticeboardViewModel, String str, long j, String str2, boolean z, Continuation<? super NoticeboardViewModel$editNotice$1> continuation) {
        super(2, continuation);
        this.this$0 = noticeboardViewModel;
        this.$groupId = str;
        this.$announcementId = j;
        this.$content = str2;
        this.$isPin = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NoticeboardViewModel$editNotice$1(this.this$0, this.$groupId, this.$announcementId, this.$content, this.$isPin, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NoticeboardViewModel$editNotice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        NoticeboardViewModel noticeboardViewModel;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35791oDv c35791oDv = this.this$0.copydefault;
            String str = this.$groupId;
            long j = this.$announcementId;
            String str2 = this.$content;
            Boolean boolKWHzl = C56443yFo.KWHzl(this.$isPin);
            this.label = 1;
            objEZpvd = c35791oDv.EZpvd(str, j, str2, boolKWHzl, this);
            if (objEZpvd == objCopydefault) {
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
                noticeboardViewModel = (NoticeboardViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                noticeboardViewModel.AkhnZx();
                objEZpvd = obj2;
                NoticeboardViewModel noticeboardViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow = noticeboardViewModel2.AEQbTJ;
                    AbstractC34088nQz.AssistContent assistContent = new AbstractC34088nQz.AssistContent(C33129mqd.gEmmrt(thM7380exceptionOrNullimpl.getMessage()));
                    this.L$0 = objEZpvd;
                    this.L$1 = null;
                    this.label = 3;
                    if (mutableSharedFlow.emit(assistContent, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        noticeboardViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            MutableSharedFlow mutableSharedFlow2 = noticeboardViewModel.AEQbTJ;
            AbstractC34088nQz.ActionBar actionBar = AbstractC34088nQz.ActionBar.EZpvd;
            this.L$0 = objEZpvd;
            this.L$1 = noticeboardViewModel;
            this.label = 2;
            if (mutableSharedFlow2.emit(actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
            obj2 = objEZpvd;
            noticeboardViewModel.AkhnZx();
            objEZpvd = obj2;
        }
        NoticeboardViewModel noticeboardViewModel22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
