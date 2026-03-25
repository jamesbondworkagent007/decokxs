package com.okinc.planet.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.okinc.planet_api.publisher.PlanetPublisherChannelId;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C46377tSb;
import o.InterfaceC47278tmy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class OKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1(Continuation<? super OKPlanetPublisherServiceImpl$openPublishPage$openPublisher$1> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C46377tSb.copydefault((PlanetPublisherChannelId) null, (View) null, (Context) null, (Map<String, ? extends Object>) null, (Bundle) null, false, (InterfaceC47278tmy) null, (String) null, (Continuation<? super Unit>) this);
    }
}
