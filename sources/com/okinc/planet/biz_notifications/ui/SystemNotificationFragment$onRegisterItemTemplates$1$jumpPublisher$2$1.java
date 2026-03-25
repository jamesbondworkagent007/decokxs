package com.okinc.planet.biz_notifications.ui;

import android.content.Context;
import android.os.Bundle;
import com.okinc.planet.biz_content.draft.DraftDataInfo;
import com.okinc.planet_api.publisher.PlanetPublisherChannelId;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.tWM;

/* JADX INFO: loaded from: classes19.dex */
public final class SystemNotificationFragment$onRegisterItemTemplates$1$jumpPublisher$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ DraftDataInfo $draftDataInfo;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemNotificationFragment$onRegisterItemTemplates$1$jumpPublisher$2$1(Context context, DraftDataInfo draftDataInfo, Continuation<? super SystemNotificationFragment$onRegisterItemTemplates$1$jumpPublisher$2$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$draftDataInfo = draftDataInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SystemNotificationFragment$onRegisterItemTemplates$1$jumpPublisher$2$1(this.$context, this.$draftDataInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SystemNotificationFragment$onRegisterItemTemplates$1$jumpPublisher$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            tWM twm = (tWM) C43251rlk.copydefault(tWM.class);
            Context context = this.$context;
            PlanetPublisherChannelId planetPublisherChannelId = PlanetPublisherChannelId.SHARE_TRADING_COMPETITION;
            Map mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt("shareFrom", ""));
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_draft_mode", this.$draftDataInfo);
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            if (tWM.StateListAnimator.openPublishPage$default(twm, context, planetPublisherChannelId, mapEZpvd, null, bundle, false, this, 32, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
