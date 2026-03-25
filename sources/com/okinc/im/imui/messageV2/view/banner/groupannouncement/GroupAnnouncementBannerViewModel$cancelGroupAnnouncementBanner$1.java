package com.okinc.im.imui.messageV2.view.banner.groupannouncement;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C35759oCq;
import o.C36551odB;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupAnnouncementBannerViewModel$cancelGroupAnnouncementBanner$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C36551odB $groupAnnouncementBanner;
    final /* synthetic */ GroupInfo $groupInfo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GroupAnnouncementBannerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupAnnouncementBannerViewModel$cancelGroupAnnouncementBanner$1(GroupAnnouncementBannerViewModel groupAnnouncementBannerViewModel, GroupInfo groupInfo, C36551odB c36551odB, Continuation<? super GroupAnnouncementBannerViewModel$cancelGroupAnnouncementBanner$1> continuation) {
        super(2, continuation);
        this.this$0 = groupAnnouncementBannerViewModel;
        this.$groupInfo = groupInfo;
        this.$groupAnnouncementBanner = c36551odB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupAnnouncementBannerViewModel$cancelGroupAnnouncementBanner$1 groupAnnouncementBannerViewModel$cancelGroupAnnouncementBanner$1 = new GroupAnnouncementBannerViewModel$cancelGroupAnnouncementBanner$1(this.this$0, this.$groupInfo, this.$groupAnnouncementBanner, continuation);
        groupAnnouncementBannerViewModel$cancelGroupAnnouncementBanner$1.L$0 = obj;
        return groupAnnouncementBannerViewModel$cancelGroupAnnouncementBanner$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupAnnouncementBannerViewModel$cancelGroupAnnouncementBanner$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String message;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.EZpvd.setValue(C56443yFo.KWHzl(true));
                GroupAnnouncementBannerViewModel groupAnnouncementBannerViewModel = this.this$0;
                GroupInfo groupInfo = this.$groupInfo;
                C36551odB c36551odB = this.$groupAnnouncementBanner;
                Result.Application application = Result.Companion;
                C35759oCq c35759oCq = groupAnnouncementBannerViewModel.DbNXlk;
                this.label = 1;
                if (c35759oCq.EZpvd(groupInfo, c36551odB, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        GroupAnnouncementBannerViewModel groupAnnouncementBannerViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            groupAnnouncementBannerViewModel2.OLrzqt.setValue(groupAnnouncementBannerViewModel2.OLrzqt.getValue());
        }
        GroupAnnouncementBannerViewModel groupAnnouncementBannerViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null && (message = thM7380exceptionOrNullimpl.getMessage()) != null && !StringsKt__StringsKt.fARcdN((CharSequence) message)) {
            groupAnnouncementBannerViewModel3.AEQbTJ.setValue(new C32989mnw(message));
        }
        this.this$0.EZpvd.setValue(C56443yFo.KWHzl(false));
        return Unit.INSTANCE;
    }
}
