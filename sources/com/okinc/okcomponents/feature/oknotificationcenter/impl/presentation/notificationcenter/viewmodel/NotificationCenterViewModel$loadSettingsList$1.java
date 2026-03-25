package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.viewmodel;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.AppNotificationBizType;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationAdvancedSettings;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationSettingChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C33070mpX;
import o.C56391yDq;
import o.C56406yEe;
import o.C56442yFn;
import o.rXV;
import o.rYN;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationCenterViewModel$loadSettingsList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationCenterViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationCenterViewModel$loadSettingsList$1(NotificationCenterViewModel notificationCenterViewModel, Continuation<? super NotificationCenterViewModel$loadSettingsList$1> continuation) {
        super(2, continuation);
        this.this$0 = notificationCenterViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotificationCenterViewModel$loadSettingsList$1 notificationCenterViewModel$loadSettingsList$1 = new NotificationCenterViewModel$loadSettingsList$1(this.this$0, continuation);
        notificationCenterViewModel$loadSettingsList$1.L$0 = obj;
        return notificationCenterViewModel$loadSettingsList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationCenterViewModel$loadSettingsList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.zsXlph();
            NotificationCenterViewModel notificationCenterViewModel = this.this$0;
            Result.Application application2 = Result.Companion;
            rYN ryn = notificationCenterViewModel.values;
            int type = AppNotificationBizType.CEFI.getType();
            this.label = 1;
            obj = ryn.OLrzqt(type, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                this.this$0.zLjUOn();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) ((ResponseData) obj).getData();
        Object obj2 = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List<NotificationSettingChannel> items = ((NotificationAdvancedSettings) it.next()).getItems();
                if (items == null) {
                    items = yDY.AhwBna();
                }
                C56406yEe.KWHzl(arrayList, items);
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Integer msgType = ((NotificationSettingChannel) next).getMsgType();
                if (msgType != null && msgType.intValue() == 5) {
                    obj2 = next;
                    break;
                }
            }
            obj2 = (NotificationSettingChannel) obj2;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(obj2);
        NotificationCenterViewModel notificationCenterViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            notificationCenterViewModel2.OLrzqt.setValue(thM7380exceptionOrNullimpl.getMessage());
        }
        NotificationCenterViewModel notificationCenterViewModel3 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            NotificationSettingChannel notificationSettingChannel = (NotificationSettingChannel) objM7377constructorimpl;
            if (notificationSettingChannel != null) {
                MutableSharedFlow mutableSharedFlow = notificationCenterViewModel3.AYXKKw;
                this.L$0 = objM7377constructorimpl;
                this.label = 2;
                if (mutableSharedFlow.emit(notificationSettingChannel, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                notificationCenterViewModel3.OLrzqt.setValue(C33070mpX.AYXKKw(rXV.TaskDescription.gEmmrt));
            }
        }
        this.this$0.zLjUOn();
        return Unit.INSTANCE;
    }
}
