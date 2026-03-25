package com.okinc.lifecycle.impl.serviceImpl.core;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.AVV;
import uniffi.lifecycle.LifecycleFutureException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class CoreLifecycleLinkServiceImpl$getShortLinkInfo$wrapper$3 extends FunctionReferenceImpl implements Function0<LifecycleFutureException> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoreLifecycleLinkServiceImpl$getShortLinkInfo$wrapper$3(Object obj) {
        super(0, obj, AVV.class, "getError", "getError()Luniffi/lifecycle/LifecycleFutureException;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function0
    public final LifecycleFutureException invoke() {
        return ((AVV) this.receiver).EZpvd();
    }
}
