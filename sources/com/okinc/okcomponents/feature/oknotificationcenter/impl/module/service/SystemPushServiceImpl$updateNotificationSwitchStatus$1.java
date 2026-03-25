package com.okinc.okcomponents.feature.oknotificationcenter.impl.module.service;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.AppNotificationBizType;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.rXN;
import o.rZA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SystemPushServiceImpl$updateNotificationSwitchStatus$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ rZA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemPushServiceImpl$updateNotificationSwitchStatus$1(rZA rza, Continuation<? super SystemPushServiceImpl$updateNotificationSwitchStatus$1> continuation) {
        super(continuation);
        this.this$0 = rza;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((AppNotificationBizType) null, (List<rXN>) null, this);
    }
}
