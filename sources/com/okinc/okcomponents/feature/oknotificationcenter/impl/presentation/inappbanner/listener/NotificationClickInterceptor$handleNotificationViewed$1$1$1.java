package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.inappbanner.listener;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C42595rYr;
import o.C42601rYx;
import o.C43251rlk;
import o.C43401rob;
import o.C43422row;
import o.C44638sah;
import o.C44641sak;
import o.C46941tgf;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.rXQ;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationClickInterceptor$handleNotificationViewed$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C46941tgf $message;
    final /* synthetic */ C44641sak $this_apply;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44638sah this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationClickInterceptor$handleNotificationViewed$1$1$1(C44638sah c44638sah, C46941tgf c46941tgf, C44641sak c44641sak, Continuation<? super NotificationClickInterceptor$handleNotificationViewed$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c44638sah;
        this.$message = c46941tgf;
        this.$this_apply = c44641sak;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotificationClickInterceptor$handleNotificationViewed$1$1$1 notificationClickInterceptor$handleNotificationViewed$1$1$1 = new NotificationClickInterceptor$handleNotificationViewed$1$1$1(this.this$0, this.$message, this.$this_apply, continuation);
        notificationClickInterceptor$handleNotificationViewed$1$1$1.L$0 = obj;
        return notificationClickInterceptor$handleNotificationViewed$1$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationClickInterceptor$handleNotificationViewed$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C44638sah c44638sah = this.this$0;
                C44641sak c44641sak = this.$this_apply;
                C42601rYx c42601rYx = c44638sah.OLrzqt;
                C42595rYr c42595rYr = new C42595rYr(c44641sak.EZpvd(), String.valueOf(c44641sak.copydefault()));
                this.label = 1;
                obj = c42601rYx.OLrzqt(c42595rYr, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar.OLrzqt()) {
            pUU.EZpvd(this.this$0.copydefault, "Api Failed to update notification viewed - " + this.$message.OLrzqt());
        } else {
            rXQ rxq = (rXQ) C43251rlk.OLrzqt(rXQ.class);
            if (rxq != null) {
                rxq.KWHzl();
            }
        }
        return Unit.INSTANCE;
    }
}
