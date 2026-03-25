package com.okinc.im.imui.group.announcement.viewmodel;

import com.okinc.okimcore.model.utility.GroupAnnouncementInfo;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC34088nQz;
import o.C33129mqd;
import o.C35794oDy;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class NoticeboardViewModel$removeAnnouncement$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GroupAnnouncementInfo $announcement;
    final /* synthetic */ List<Long> $announcementIds;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ NoticeboardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeboardViewModel$removeAnnouncement$1(NoticeboardViewModel noticeboardViewModel, GroupAnnouncementInfo groupAnnouncementInfo, List<Long> list, Continuation<? super NoticeboardViewModel$removeAnnouncement$1> continuation) {
        super(2, continuation);
        this.this$0 = noticeboardViewModel;
        this.$announcement = groupAnnouncementInfo;
        this.$announcementIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NoticeboardViewModel$removeAnnouncement$1(this.this$0, this.$announcement, this.$announcementIds, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NoticeboardViewModel$removeAnnouncement$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        NoticeboardViewModel noticeboardViewModel;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35794oDy c35794oDy = this.this$0.OLrzqt;
            String groupId = this.$announcement.getGroupId();
            List<Long> list = this.$announcementIds;
            this.label = 1;
            objKWHzl = c35794oDy.KWHzl(groupId, list, this);
            if (objKWHzl == objCopydefault) {
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
                objKWHzl = obj2;
                NoticeboardViewModel noticeboardViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow = noticeboardViewModel2.AEQbTJ;
                    AbstractC34088nQz.AssistContent assistContent = new AbstractC34088nQz.AssistContent(C33129mqd.gEmmrt(thM7380exceptionOrNullimpl.getMessage()));
                    this.L$0 = objKWHzl;
                    this.L$1 = null;
                    this.label = 3;
                    if (mutableSharedFlow.emit(assistContent, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        noticeboardViewModel = this.this$0;
        List<Long> list2 = this.$announcementIds;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            MutableSharedFlow mutableSharedFlow2 = noticeboardViewModel.AEQbTJ;
            AbstractC34088nQz.TaskDescription taskDescription = new AbstractC34088nQz.TaskDescription(list2.size());
            this.L$0 = objKWHzl;
            this.L$1 = noticeboardViewModel;
            this.label = 2;
            if (mutableSharedFlow2.emit(taskDescription, this) == objCopydefault) {
                return objCopydefault;
            }
            obj2 = objKWHzl;
            noticeboardViewModel.AkhnZx();
            objKWHzl = obj2;
        }
        NoticeboardViewModel noticeboardViewModel22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
