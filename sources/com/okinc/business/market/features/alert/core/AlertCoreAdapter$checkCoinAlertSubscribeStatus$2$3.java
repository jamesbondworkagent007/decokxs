package com.okinc.business.market.features.alert.core;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.BeZ;
import uniffi.ok_future_utils.OkffiException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class AlertCoreAdapter$checkCoinAlertSubscribeStatus$2$3 extends FunctionReferenceImpl implements Function0<OkffiException> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AlertCoreAdapter$checkCoinAlertSubscribeStatus$2$3(Object obj) {
        super(0, obj, BeZ.class, "getError", "getError()Luniffi/ok_future_utils/OkffiException;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function0
    public final OkffiException invoke() {
        return ((BeZ) this.receiver).copydefault();
    }
}
