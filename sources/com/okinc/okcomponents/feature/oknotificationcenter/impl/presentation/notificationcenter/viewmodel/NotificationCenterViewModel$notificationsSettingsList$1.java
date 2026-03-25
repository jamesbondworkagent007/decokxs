package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.viewmodel;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.SystemNotification;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterSettingsBottomsheetFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C42584rYg;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationCenterViewModel$notificationsSettingsList$1 extends SuspendLambda implements yHO<Boolean, C42584rYg<SystemNotification>, Continuation<? super List<NotificationCenterSettingsBottomsheetFragment.SettingsOption>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationCenterViewModel$notificationsSettingsList$1(Continuation<? super NotificationCenterViewModel$notificationsSettingsList$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(Boolean bool, C42584rYg<SystemNotification> c42584rYg, Continuation<? super List<NotificationCenterSettingsBottomsheetFragment.SettingsOption>> continuation) {
        return invoke(bool.booleanValue(), c42584rYg, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, C42584rYg<SystemNotification> c42584rYg, Continuation<? super List<NotificationCenterSettingsBottomsheetFragment.SettingsOption>> continuation) {
        NotificationCenterViewModel$notificationsSettingsList$1 notificationCenterViewModel$notificationsSettingsList$1 = new NotificationCenterViewModel$notificationsSettingsList$1(continuation);
        notificationCenterViewModel$notificationsSettingsList$1.Z$0 = z;
        notificationCenterViewModel$notificationsSettingsList$1.L$0 = c42584rYg;
        return notificationCenterViewModel$notificationsSettingsList$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            C42584rYg c42584rYg = (C42584rYg) this.L$0;
            ArrayList arrayList = new ArrayList();
            boolean z2 = (c42584rYg.OLrzqt().isEmpty() ^ true) && !c42584rYg.copydefault();
            if (z) {
                arrayList.add(NotificationCenterSettingsBottomsheetFragment.SettingsOption.CustomiseNotifications.EZpvd);
            }
            if (z2) {
                arrayList.add(NotificationCenterSettingsBottomsheetFragment.SettingsOption.MarkAllAsRead.KWHzl);
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
