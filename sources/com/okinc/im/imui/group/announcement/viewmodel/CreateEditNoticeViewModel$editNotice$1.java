package com.okinc.im.imui.group.announcement.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35791oDv;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class CreateEditNoticeViewModel$editNotice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $content;
    final /* synthetic */ String $groupId;
    final /* synthetic */ long $id;
    int label;
    final /* synthetic */ CreateEditNoticeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateEditNoticeViewModel$editNotice$1(CreateEditNoticeViewModel createEditNoticeViewModel, String str, long j, String str2, Continuation<? super CreateEditNoticeViewModel$editNotice$1> continuation) {
        super(2, continuation);
        this.this$0 = createEditNoticeViewModel;
        this.$groupId = str;
        this.$id = j;
        this.$content = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateEditNoticeViewModel$editNotice$1(this.this$0, this.$groupId, this.$id, this.$content, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateEditNoticeViewModel$editNotice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8703invokeyxL6bBk$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35791oDv c35791oDv = this.this$0.AYXKKw;
            String str = this.$groupId;
            long j = this.$id;
            String str2 = this.$content;
            if (str2 == null) {
                str2 = "";
            }
            this.label = 1;
            objM8703invokeyxL6bBk$default = C35791oDv.m8703invokeyxL6bBk$default(c35791oDv, str, j, str2, null, this, 8, null);
            if (objM8703invokeyxL6bBk$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8703invokeyxL6bBk$default = ((Result) obj).m7386unboximpl();
        }
        CreateEditNoticeViewModel createEditNoticeViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objM8703invokeyxL6bBk$default)) {
            createEditNoticeViewModel.OLrzqt.tryEmit(C56443yFo.KWHzl(false));
            createEditNoticeViewModel.valueOf.tryEmit(Unit.INSTANCE);
        }
        CreateEditNoticeViewModel createEditNoticeViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8703invokeyxL6bBk$default);
        if (thM7380exceptionOrNullimpl != null) {
            createEditNoticeViewModel2.OLrzqt.tryEmit(C56443yFo.KWHzl(false));
            createEditNoticeViewModel2.KWHzl(thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
