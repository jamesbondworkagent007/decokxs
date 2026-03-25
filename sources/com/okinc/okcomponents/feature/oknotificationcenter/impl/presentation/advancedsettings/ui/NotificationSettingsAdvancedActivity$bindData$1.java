package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.ui;

import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationAdvancedSettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C42584rYg;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.rYC;
import o.rZC;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationSettingsAdvancedActivity$bindData$1 extends SuspendLambda implements yHO<CoroutineScope, C42584rYg<NotificationAdvancedSettings>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ rZC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsAdvancedActivity$bindData$1(rZC rzc, Continuation<? super NotificationSettingsAdvancedActivity$bindData$1> continuation) {
        super(3, continuation);
        this.this$0 = rzc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, C42584rYg<NotificationAdvancedSettings> c42584rYg, Continuation<? super Unit> continuation) {
        NotificationSettingsAdvancedActivity$bindData$1 notificationSettingsAdvancedActivity$bindData$1 = new NotificationSettingsAdvancedActivity$bindData$1(this.this$0, continuation);
        notificationSettingsAdvancedActivity$bindData$1.L$0 = c42584rYg;
        return notificationSettingsAdvancedActivity$bindData$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C42584rYg c42584rYg = (C42584rYg) this.L$0;
            rYC ryc = this.this$0.valueOf;
            if (ryc == null) {
                Intrinsics.gEmmrt("");
                ryc = null;
            }
            C55173xeu c55173xeu = ryc.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility((c42584rYg.AEQbTJ() || !c42584rYg.copydefault()) ? 8 : 0);
            if (c42584rYg.AEQbTJ()) {
                this.this$0.valueOf();
            } else if (c42584rYg.copydefault()) {
                this.this$0.djBIcL();
            } else if (!c42584rYg.OLrzqt().isEmpty()) {
                this.this$0.KWHzl(c42584rYg.OLrzqt());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
