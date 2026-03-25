package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.SystemNotification;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C42584rYg;
import o.C42603rYz;
import o.C44656saz;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class NotificationCenterFragment$setupViewModelListeners$1 extends SuspendLambda implements yHO<CoroutineScope, C42584rYg<SystemNotification>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44656saz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationCenterFragment$setupViewModelListeners$1(C44656saz c44656saz, Continuation<? super NotificationCenterFragment$setupViewModelListeners$1> continuation) {
        super(3, continuation);
        this.this$0 = c44656saz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, C42584rYg<SystemNotification> c42584rYg, Continuation<? super Unit> continuation) {
        NotificationCenterFragment$setupViewModelListeners$1 notificationCenterFragment$setupViewModelListeners$1 = new NotificationCenterFragment$setupViewModelListeners$1(this.this$0, continuation);
        notificationCenterFragment$setupViewModelListeners$1.L$0 = c42584rYg;
        return notificationCenterFragment$setupViewModelListeners$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C42584rYg c42584rYg = (C42584rYg) this.L$0;
            pUU.KWHzl(this.this$0.getTAG(), "notificationsListStateFlow update, viewStateData: " + c42584rYg);
            C42603rYz c42603rYz = this.this$0.djBIcL;
            if (c42603rYz == null) {
                return Unit.INSTANCE;
            }
            C44656saz c44656saz = this.this$0;
            c42603rYz.AhwBna.valueOf();
            c42603rYz.AhwBna.AhwBna(c42584rYg.EZpvd());
            if (!c42584rYg.AEQbTJ()) {
                if (c42584rYg.copydefault()) {
                    c44656saz.AkhnZx();
                } else if (c42584rYg.OLrzqt().isEmpty()) {
                    c44656saz.DbNXlk();
                } else {
                    c44656saz.OLrzqt((List<SystemNotification>) c42584rYg.OLrzqt(), c42584rYg.EZpvd());
                }
            } else {
                C55173xeu c55173xeu = c42603rYz.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                c55173xeu.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
