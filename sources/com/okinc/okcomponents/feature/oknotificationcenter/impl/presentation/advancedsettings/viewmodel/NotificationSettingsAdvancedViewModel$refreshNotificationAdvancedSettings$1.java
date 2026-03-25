package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.viewmodel;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C42584rYg;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.rYN;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationSettingsAdvancedViewModel$refreshNotificationAdvancedSettings$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationSettingsAdvancedViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsAdvancedViewModel$refreshNotificationAdvancedSettings$1(NotificationSettingsAdvancedViewModel notificationSettingsAdvancedViewModel, Continuation<? super NotificationSettingsAdvancedViewModel$refreshNotificationAdvancedSettings$1> continuation) {
        super(2, continuation);
        this.this$0 = notificationSettingsAdvancedViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotificationSettingsAdvancedViewModel$refreshNotificationAdvancedSettings$1 notificationSettingsAdvancedViewModel$refreshNotificationAdvancedSettings$1 = new NotificationSettingsAdvancedViewModel$refreshNotificationAdvancedSettings$1(this.this$0, continuation);
        notificationSettingsAdvancedViewModel$refreshNotificationAdvancedSettings$1.L$0 = obj;
        return notificationSettingsAdvancedViewModel$refreshNotificationAdvancedSettings$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationSettingsAdvancedViewModel$refreshNotificationAdvancedSettings$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                NotificationSettingsAdvancedViewModel notificationSettingsAdvancedViewModel = this.this$0;
                rYN ryn = notificationSettingsAdvancedViewModel.copydefault;
                int i2 = notificationSettingsAdvancedViewModel.EZpvd;
                this.label = 1;
                obj = ryn.OLrzqt(i2, this);
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
        NotificationSettingsAdvancedViewModel notificationSettingsAdvancedViewModel2 = this.this$0;
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            notificationSettingsAdvancedViewModel2.OLrzqt.setValue(new C42584rYg(false, (List) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl(), false, false, false, false, 44, null));
        }
        NotificationSettingsAdvancedViewModel notificationSettingsAdvancedViewModel3 = this.this$0;
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            notificationSettingsAdvancedViewModel3.OLrzqt.setValue(new C42584rYg(false, null, false, true, false, false, 38, null));
        }
        return Unit.INSTANCE;
    }
}
