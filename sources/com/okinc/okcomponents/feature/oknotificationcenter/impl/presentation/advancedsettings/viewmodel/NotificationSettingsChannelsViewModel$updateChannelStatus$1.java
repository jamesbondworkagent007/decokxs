package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.viewmodel;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.ChannelStatus;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationSettingsChannelReq;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SwitchNotificationSettingsChannelReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.AbstractC43419rot;
import o.C33129mqd;
import o.C42585rYh;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.pUU;
import o.rYM;
import o.rZY;
import o.rZZ;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationSettingsChannelsViewModel$updateChannelStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Job $loadingJob;
    final /* synthetic */ rZY $settingsChannelRecyclerData;
    final /* synthetic */ boolean $status;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationSettingsChannelsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsChannelsViewModel$updateChannelStatus$1(NotificationSettingsChannelsViewModel notificationSettingsChannelsViewModel, rZY rzy, boolean z, Job job, Continuation<? super NotificationSettingsChannelsViewModel$updateChannelStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = notificationSettingsChannelsViewModel;
        this.$settingsChannelRecyclerData = rzy;
        this.$status = z;
        this.$loadingJob = job;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotificationSettingsChannelsViewModel$updateChannelStatus$1 notificationSettingsChannelsViewModel$updateChannelStatus$1 = new NotificationSettingsChannelsViewModel$updateChannelStatus$1(this.this$0, this.$settingsChannelRecyclerData, this.$status, this.$loadingJob, continuation);
        notificationSettingsChannelsViewModel$updateChannelStatus$1.L$0 = obj;
        return notificationSettingsChannelsViewModel$updateChannelStatus$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationSettingsChannelsViewModel$updateChannelStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x011c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            NotificationSettingsChannelsViewModel notificationSettingsChannelsViewModel = this.this$0;
            rZY rzy = this.$settingsChannelRecyclerData;
            boolean z = this.$status;
            rZZ rzz = notificationSettingsChannelsViewModel.EZpvd;
            if (rzz == null) {
                Intrinsics.gEmmrt("");
                rzz = null;
            }
            SwitchNotificationSettingsChannelReq switchNotificationSettingsChannelReq = new SwitchNotificationSettingsChannelReq(rzz.AEQbTJ(), C56402yEa.EZpvd(new NotificationSettingsChannelReq(rzy.OLrzqt(), C56402yEa.EZpvd(new ChannelStatus(C33129mqd.AhwBna(rzy.AEQbTJ().getChannelType()), z ? 1 : 0)))));
            rYM rym = notificationSettingsChannelsViewModel.AYXKKw;
            this.label = 1;
            obj = rym.AEQbTJ(switchNotificationSettingsChannelReq, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC43419rot = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                actionBar = abstractC43419rot;
                NotificationSettingsChannelsViewModel notificationSettingsChannelsViewModel2 = this.this$0;
                Job job = this.$loadingJob;
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    notificationSettingsChannelsViewModel2.OLrzqt(job);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        ResponseData responseData = (ResponseData) obj;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            actionBar = new AbstractC43419rot.StateListAnimator(data);
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        }
        NotificationSettingsChannelsViewModel notificationSettingsChannelsViewModel3 = this.this$0;
        Job job2 = this.$loadingJob;
        rZY rzy2 = this.$settingsChannelRecyclerData;
        boolean z2 = this.$status;
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl();
            notificationSettingsChannelsViewModel3.OLrzqt(job2);
            notificationSettingsChannelsViewModel3.KWHzl(rzy2, z2);
            C42585rYh.ActionBar actionBar2 = C42585rYh.Companion;
            String message = oKServerException.getMessage();
            C42585rYh c42585rYhEZpvd = actionBar2.EZpvd(message != null ? message : "");
            this.L$0 = actionBar;
            this.label = 2;
            if (notificationSettingsChannelsViewModel3.copydefault(c42585rYhEZpvd, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
            abstractC43419rot = actionBar;
            actionBar = abstractC43419rot;
        }
        NotificationSettingsChannelsViewModel notificationSettingsChannelsViewModel22 = this.this$0;
        Job job3 = this.$loadingJob;
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
        }
        return Unit.INSTANCE;
    }
}
