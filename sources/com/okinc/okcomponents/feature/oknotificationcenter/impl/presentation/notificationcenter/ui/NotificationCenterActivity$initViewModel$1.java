package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui;

import android.app.Activity;
import android.widget.ImageView;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterSettingsBottomsheetFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42599rYv;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationCenterActivity$initViewModel$1 extends SuspendLambda implements yHO<CoroutineScope, List<? extends NotificationCenterSettingsBottomsheetFragment.SettingsOption>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationCenterActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationCenterActivity$initViewModel$1(NotificationCenterActivity notificationCenterActivity, Continuation<? super NotificationCenterActivity$initViewModel$1> continuation) {
        super(3, continuation);
        this.this$0 = notificationCenterActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, List<? extends NotificationCenterSettingsBottomsheetFragment.SettingsOption> list, Continuation<? super Unit> continuation) {
        NotificationCenterActivity$initViewModel$1 notificationCenterActivity$initViewModel$1 = new NotificationCenterActivity$initViewModel$1(this.this$0, continuation);
        notificationCenterActivity$initViewModel$1.L$0 = list;
        return notificationCenterActivity$initViewModel$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            ImageView imageView = ((AbstractC42599rYv) this.this$0.KWHzl()).EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(list.isEmpty() ^ true ? 0 : 8);
            rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
