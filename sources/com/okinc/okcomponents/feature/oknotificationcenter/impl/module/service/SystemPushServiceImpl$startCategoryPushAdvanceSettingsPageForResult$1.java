package com.okinc.okcomponents.feature.oknotificationcenter.impl.module.service;

import android.content.Context;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.AppNotificationBizType;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationAdvancedSettings;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationSettingChannel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.rYN;
import o.rZA;

/* JADX INFO: loaded from: classes10.dex */
public final class SystemPushServiceImpl$startCategoryPushAdvanceSettingsPageForResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppNotificationBizType $bizType;
    final /* synthetic */ int $categoryType;
    final /* synthetic */ Context $context;
    final /* synthetic */ Function1<Throwable, Unit> $onError;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ rZA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SystemPushServiceImpl$startCategoryPushAdvanceSettingsPageForResult$1(rZA rza, AppNotificationBizType appNotificationBizType, Function1<? super Throwable, Unit> function1, int i, Context context, Continuation<? super SystemPushServiceImpl$startCategoryPushAdvanceSettingsPageForResult$1> continuation) {
        super(2, continuation);
        this.this$0 = rza;
        this.$bizType = appNotificationBizType;
        this.$onError = function1;
        this.$categoryType = i;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SystemPushServiceImpl$startCategoryPushAdvanceSettingsPageForResult$1 systemPushServiceImpl$startCategoryPushAdvanceSettingsPageForResult$1 = new SystemPushServiceImpl$startCategoryPushAdvanceSettingsPageForResult$1(this.this$0, this.$bizType, this.$onError, this.$categoryType, this.$context, continuation);
        systemPushServiceImpl$startCategoryPushAdvanceSettingsPageForResult$1.L$0 = obj;
        return systemPushServiceImpl$startCategoryPushAdvanceSettingsPageForResult$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SystemPushServiceImpl$startCategoryPushAdvanceSettingsPageForResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                rZA rza = this.this$0;
                AppNotificationBizType appNotificationBizType = this.$bizType;
                rYN ryn = rza.KWHzl;
                int type = appNotificationBizType.getType();
                this.label = 1;
                obj = ryn.OLrzqt(type, this);
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
        Function1<Throwable, Unit> function1 = this.$onError;
        int i2 = this.$categoryType;
        rZA rza2 = this.this$0;
        Context context = this.$context;
        AppNotificationBizType appNotificationBizType2 = this.$bizType;
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Iterator it = ((List) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()).iterator();
            while (it.hasNext()) {
                List<NotificationSettingChannel> items = ((NotificationAdvancedSettings) it.next()).getItems();
                if (items != null && (!items.isEmpty())) {
                    Iterator<T> it2 = items.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        Integer msgType = ((NotificationSettingChannel) next).getMsgType();
                        if (msgType != null && msgType.intValue() == i2) {
                            break;
                        }
                    }
                    NotificationSettingChannel notificationSettingChannel = (NotificationSettingChannel) next;
                    if (notificationSettingChannel != null) {
                        rza2.gEmmrt.copydefault(context, notificationSettingChannel, appNotificationBizType2);
                        return Unit.INSTANCE;
                    }
                }
            }
            function1.invoke(new Throwable("Failed to find category info"));
        }
        Function1<Throwable, Unit> function12 = this.$onError;
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            function12.invoke((OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl());
        }
        return Unit.INSTANCE;
    }
}
