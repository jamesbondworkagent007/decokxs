package com.okinc.im.imui.group.announcement.viewmodel;

import com.okinc.okimcore.model.utility.GroupAnnouncementInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35789oDt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class CreateEditNoticeViewModel$createNotice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $content;
    final /* synthetic */ String $groupId;
    int label;
    final /* synthetic */ CreateEditNoticeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateEditNoticeViewModel$createNotice$1(CreateEditNoticeViewModel createEditNoticeViewModel, String str, String str2, Continuation<? super CreateEditNoticeViewModel$createNotice$1> continuation) {
        super(2, continuation);
        this.this$0 = createEditNoticeViewModel;
        this.$groupId = str;
        this.$content = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateEditNoticeViewModel$createNotice$1(this.this$0, this.$groupId, this.$content, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateEditNoticeViewModel$createNotice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35789oDt c35789oDt = this.this$0.gEmmrt;
            String str = this.$groupId;
            String str2 = this.$content;
            this.label = 1;
            objKWHzl = c35789oDt.KWHzl(str, str2, 1, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        CreateEditNoticeViewModel createEditNoticeViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            GroupAnnouncementInfo groupAnnouncementInfo = (GroupAnnouncementInfo) objKWHzl;
            createEditNoticeViewModel.OLrzqt.tryEmit(C56443yFo.KWHzl(false));
            if (groupAnnouncementInfo != null) {
                createEditNoticeViewModel.AhwBna.tryEmit(groupAnnouncementInfo);
            }
        }
        CreateEditNoticeViewModel createEditNoticeViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
            createEditNoticeViewModel2.OLrzqt.tryEmit(C56443yFo.KWHzl(false));
            createEditNoticeViewModel2.KWHzl(thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
