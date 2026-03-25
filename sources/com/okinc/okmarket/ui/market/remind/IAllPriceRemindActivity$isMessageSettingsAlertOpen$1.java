package com.okinc.okmarket.ui.market.remind;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.AppNotificationBizType;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.NotificationType;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC46767tdQ;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.rXN;
import o.rXQ;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class IAllPriceRemindActivity$isMessageSettingsAlertOpen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AbstractActivityC46767tdQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAllPriceRemindActivity$isMessageSettingsAlertOpen$1(AbstractActivityC46767tdQ abstractActivityC46767tdQ, Continuation<? super IAllPriceRemindActivity$isMessageSettingsAlertOpen$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractActivityC46767tdQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IAllPriceRemindActivity$isMessageSettingsAlertOpen$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IAllPriceRemindActivity$isMessageSettingsAlertOpen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            rXQ rxq = (rXQ) C43251rlk.copydefault(rXQ.class);
            AppNotificationBizType appNotificationBizType = AppNotificationBizType.CEFI;
            List<? extends NotificationType> listGEmmrt = yDY.gEmmrt(NotificationType.PRICE_ALERT, NotificationType.CUSTOM_PRICE_PRICE);
            this.label = 1;
            obj = rxq.copydefault(appNotificationBizType, listGEmmrt, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        }
        AbstractActivityC46767tdQ abstractActivityC46767tdQ = this.this$0;
        for (rXN rxn : (Iterable) obj) {
            if (NotificationType.CUSTOM_PRICE_PRICE == rxn.copydefault()) {
                abstractActivityC46767tdQ.OLrzqt(rxn.OLrzqt() == 0);
            }
        }
        return Unit.INSTANCE;
    }
}
