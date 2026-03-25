package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter;

import android.graphics.drawable.Drawable;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.NotificationCategory;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C42605rZa;
import o.C44639sai;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationCenterManager$markAllNotificationsAsRead$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $category;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44639sai this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationCenterManager$markAllNotificationsAsRead$1(C44639sai c44639sai, String str, Continuation<? super NotificationCenterManager$markAllNotificationsAsRead$1> continuation) {
        super(2, continuation);
        this.this$0 = c44639sai;
        this.$category = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotificationCenterManager$markAllNotificationsAsRead$1 notificationCenterManager$markAllNotificationsAsRead$1 = new NotificationCenterManager$markAllNotificationsAsRead$1(this.this$0, this.$category, continuation);
        notificationCenterManager$markAllNotificationsAsRead$1.L$0 = obj;
        return notificationCenterManager$markAllNotificationsAsRead$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationCenterManager$markAllNotificationsAsRead$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44639sai c44639sai = this.this$0;
            String value = this.$category;
            Result.Application application2 = Result.Companion;
            C42605rZa c42605rZa = c44639sai.AYXKKw;
            if (value == null) {
                value = NotificationCategory.All.getValue();
            }
            this.label = 1;
            objEZpvd = c42605rZa.EZpvd(value, this);
            if (objEZpvd == objCopydefault) {
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
                objM7377constructorimpl = this.L$0;
                C56391yDq.AEQbTJ(obj);
                C44639sai c44639sai2 = this.this$0;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    ((Boolean) objM7377constructorimpl).booleanValue();
                    MutableSharedFlow mutableSharedFlow = c44639sai2.OLrzqt;
                    Boolean boolKWHzl = C56443yFo.KWHzl(true);
                    this.L$0 = objM7377constructorimpl;
                    this.label = 3;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((Boolean) objEZpvd).booleanValue()));
        C44639sai c44639sai3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("NotificationCenterViewModel", "markAllNotificationsAsRead error: " + thM7380exceptionOrNullimpl.getMessage());
            C55326xho.toast$default(thM7380exceptionOrNullimpl.getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            MutableSharedFlow mutableSharedFlow2 = c44639sai3.OLrzqt;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            this.L$0 = objM7377constructorimpl;
            this.label = 2;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        C44639sai c44639sai22 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        return Unit.INSTANCE;
    }
}
