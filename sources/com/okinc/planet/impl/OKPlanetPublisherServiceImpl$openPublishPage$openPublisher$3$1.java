package com.okinc.planet.impl;

import android.content.Context;
import android.os.Bundle;
import com.okinc.planet_api.publisher.PlanetPublisherChannelId;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC47702tvB;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class OKPlanetPublisherServiceImpl$openPublishPage$openPublisher$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PlanetPublisherChannelId $channelId;
    final /* synthetic */ Context $context;
    final /* synthetic */ Map<String, Object> $data;
    final /* synthetic */ Bundle $params;
    final /* synthetic */ String $successMsg;
    final /* synthetic */ boolean $testMode;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKPlanetPublisherServiceImpl$openPublishPage$openPublisher$3$1(Context context, PlanetPublisherChannelId planetPublisherChannelId, Map<String, ? extends Object> map, Bundle bundle, boolean z, String str, Continuation<? super OKPlanetPublisherServiceImpl$openPublishPage$openPublisher$3$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$channelId = planetPublisherChannelId;
        this.$data = map;
        this.$params = bundle;
        this.$testMode = z;
        this.$successMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKPlanetPublisherServiceImpl$openPublishPage$openPublisher$3$1(this.$context, this.$channelId, this.$data, this.$params, this.$testMode, this.$successMsg, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKPlanetPublisherServiceImpl$openPublishPage$openPublisher$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityC47702tvB.Companion.EZpvd(this.$context, this.$channelId, this.$data, this.$params, this.$testMode, this.$successMsg);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
