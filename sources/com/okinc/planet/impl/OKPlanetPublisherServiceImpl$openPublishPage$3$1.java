package com.okinc.planet.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.okinc.planet_api.publisher.PlanetPublisherChannelId;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C46377tSb;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC47278tmy;

/* JADX INFO: loaded from: classes10.dex */
public final class OKPlanetPublisherServiceImpl$openPublishPage$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $anchorView;
    final /* synthetic */ PlanetPublisherChannelId $channelId;
    final /* synthetic */ Context $context;
    final /* synthetic */ Map<String, Object> $data;
    final /* synthetic */ Bundle $params;
    final /* synthetic */ boolean $testMode;
    final /* synthetic */ InterfaceC47278tmy $userManager;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKPlanetPublisherServiceImpl$openPublishPage$3$1(PlanetPublisherChannelId planetPublisherChannelId, View view, Context context, Map<String, ? extends Object> map, Bundle bundle, boolean z, InterfaceC47278tmy interfaceC47278tmy, Continuation<? super OKPlanetPublisherServiceImpl$openPublishPage$3$1> continuation) {
        super(2, continuation);
        this.$channelId = planetPublisherChannelId;
        this.$anchorView = view;
        this.$context = context;
        this.$data = map;
        this.$params = bundle;
        this.$testMode = z;
        this.$userManager = interfaceC47278tmy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKPlanetPublisherServiceImpl$openPublishPage$3$1(this.$channelId, this.$anchorView, this.$context, this.$data, this.$params, this.$testMode, this.$userManager, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKPlanetPublisherServiceImpl$openPublishPage$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            PlanetPublisherChannelId planetPublisherChannelId = this.$channelId;
            View view = this.$anchorView;
            Context context = this.$context;
            Map<String, Object> map = this.$data;
            Bundle bundle = this.$params;
            boolean z = this.$testMode;
            InterfaceC47278tmy interfaceC47278tmy = this.$userManager;
            this.label = 1;
            if (C46377tSb.copydefault(planetPublisherChannelId, view, context, (Map<String, ? extends Object>) map, bundle, z, interfaceC47278tmy, (String) null, (Continuation<? super Unit>) this) == objCopydefault) {
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
