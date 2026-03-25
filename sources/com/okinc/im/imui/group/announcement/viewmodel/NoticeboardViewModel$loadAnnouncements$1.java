package com.okinc.im.imui.group.announcement.viewmodel;

import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.utility.GroupAnnouncementInfo;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC34085nQw;
import o.C35793oDx;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class NoticeboardViewModel$loadAnnouncements$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GroupInfo $currentGroupInfo;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ NoticeboardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeboardViewModel$loadAnnouncements$1(NoticeboardViewModel noticeboardViewModel, GroupInfo groupInfo, Continuation<? super NoticeboardViewModel$loadAnnouncements$1> continuation) {
        super(2, continuation);
        this.this$0 = noticeboardViewModel;
        this.$currentGroupInfo = groupInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NoticeboardViewModel$loadAnnouncements$1(this.this$0, this.$currentGroupInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NoticeboardViewModel$loadAnnouncements$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        NoticeboardViewModel noticeboardViewModel;
        C35793oDx.StateListAnimator stateListAnimator;
        List<GroupAnnouncementInfo> listCopydefault;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35793oDx c35793oDx = this.this$0.gEmmrt;
            String groupId = this.$currentGroupInfo.getGroupId();
            this.label = 1;
            objCopydefault = c35793oDx.copydefault(groupId, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objCopydefault = obj2;
                    NoticeboardViewModel noticeboardViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                    if (thM7380exceptionOrNullimpl != null) {
                        noticeboardViewModel2.KWHzl.setValue(new AbstractC34085nQw.TaskDescription(thM7380exceptionOrNullimpl, thM7380exceptionOrNullimpl.getMessage()));
                    }
                    return Unit.INSTANCE;
                }
                stateListAnimator = (C35793oDx.StateListAnimator) this.L$2;
                noticeboardViewModel = (NoticeboardViewModel) this.L$1;
                Object obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objCopydefault = obj3;
                noticeboardViewModel.KWHzl.setValue(new AbstractC34085nQw.Application(stateListAnimator.copydefault(), stateListAnimator.EZpvd(), noticeboardViewModel.AEQbTJ(), noticeboardViewModel.values(), noticeboardViewModel.valueOf()));
                listCopydefault = stateListAnimator.copydefault();
                this.L$0 = objCopydefault;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                if (noticeboardViewModel.EZpvd(listCopydefault, this) != objCopydefault2) {
                    return objCopydefault2;
                }
                obj2 = objCopydefault;
                objCopydefault = obj2;
                NoticeboardViewModel noticeboardViewModel22 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        NoticeboardViewModel noticeboardViewModel3 = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            C35793oDx.StateListAnimator stateListAnimator2 = (C35793oDx.StateListAnimator) objCopydefault;
            if (!(true ^ stateListAnimator2.copydefault().isEmpty())) {
                noticeboardViewModel3.KWHzl.setValue(new AbstractC34085nQw.Activity(noticeboardViewModel3.AEQbTJ()));
            } else {
                List<GroupAnnouncementInfo> listCopydefault2 = stateListAnimator2.copydefault();
                this.L$0 = objCopydefault;
                this.L$1 = noticeboardViewModel3;
                this.L$2 = stateListAnimator2;
                this.label = 2;
                if (noticeboardViewModel3.copydefault(listCopydefault2, this) == objCopydefault2) {
                    return objCopydefault2;
                }
                noticeboardViewModel = noticeboardViewModel3;
                stateListAnimator = stateListAnimator2;
                noticeboardViewModel.KWHzl.setValue(new AbstractC34085nQw.Application(stateListAnimator.copydefault(), stateListAnimator.EZpvd(), noticeboardViewModel.AEQbTJ(), noticeboardViewModel.values(), noticeboardViewModel.valueOf()));
                listCopydefault = stateListAnimator.copydefault();
                this.L$0 = objCopydefault;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                if (noticeboardViewModel.EZpvd(listCopydefault, this) != objCopydefault2) {
                }
            }
        }
        NoticeboardViewModel noticeboardViewModel222 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
