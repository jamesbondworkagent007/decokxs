package com.okinc.lifecycle.impl.deeplink.service;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.AVG;
import uniffi.lifecycle.LifecycleFutureException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class CoreDeeplinkService$processDeeplink$1$wrapper$3 extends FunctionReferenceImpl implements Function0<LifecycleFutureException> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoreDeeplinkService$processDeeplink$1$wrapper$3(Object obj) {
        super(0, obj, AVG.class, "getError", "getError()Luniffi/lifecycle/LifecycleFutureException;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function0
    public final LifecycleFutureException invoke() {
        return ((AVG) this.receiver).EZpvd();
    }
}
