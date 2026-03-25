package com.okinc.planet.deeplink.handler;

import android.content.Context;
import com.okinc.planet_api.RichShareToFeedConfig;
import com.okinc.planet_api.publisher.PlanetPublisherChannelId;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.tWM;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetPostPublisherDeeplinkHandler$executeDeeplink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $acContext;
    final /* synthetic */ RichShareToFeedConfig $shareToFeedConfig;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetPostPublisherDeeplinkHandler$executeDeeplink$1(Context context, RichShareToFeedConfig richShareToFeedConfig, Continuation<? super PlanetPostPublisherDeeplinkHandler$executeDeeplink$1> continuation) {
        super(2, continuation);
        this.$acContext = context;
        this.$shareToFeedConfig = richShareToFeedConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetPostPublisherDeeplinkHandler$executeDeeplink$1(this.$acContext, this.$shareToFeedConfig, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetPostPublisherDeeplinkHandler$executeDeeplink$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String content;
        List listAhwBna;
        List listAhwBna2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                tWM twm = (tWM) C43251rlk.copydefault(tWM.class);
                Context context = this.$acContext;
                RichShareToFeedConfig richShareToFeedConfig = this.$shareToFeedConfig;
                if (richShareToFeedConfig == null || (content = richShareToFeedConfig.getContent()) == null) {
                    content = "";
                }
                RichShareToFeedConfig richShareToFeedConfig2 = this.$shareToFeedConfig;
                if (richShareToFeedConfig2 == null || (listAhwBna = richShareToFeedConfig2.getTopics()) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                RichShareToFeedConfig richShareToFeedConfig3 = this.$shareToFeedConfig;
                if (richShareToFeedConfig3 == null || (listAhwBna2 = richShareToFeedConfig3.getImageList()) == null) {
                    listAhwBna2 = yDY.AhwBna();
                }
                PlanetPublisherChannelId planetPublisherChannelId = PlanetPublisherChannelId.DEEPLINK_POST;
                this.label = 1;
                if (tWM.StateListAnimator.openPublishPage$default(twm, context, content, listAhwBna, listAhwBna2, planetPublisherChannelId, null, null, false, this, 224, null) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception e) {
            pUU.AEQbTJ("PlanetPublisherDeeplinkHandler", "Failed to open publish page", e);
        }
        return Unit.INSTANCE;
    }
}
