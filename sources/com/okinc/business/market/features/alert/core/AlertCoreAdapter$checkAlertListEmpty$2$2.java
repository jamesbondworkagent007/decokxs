package com.okinc.business.market.features.alert.core;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C2185ACa;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class AlertCoreAdapter$checkAlertListEmpty$2$2 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AlertCoreAdapter$checkAlertListEmpty$2$2(Object obj) {
        super(0, obj, C2185ACa.class, OtpEventTracker.OTP_EVENT_VALUE_CANCEL, "cancel()V", 0);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((C2185ACa) this.receiver).KWHzl();
    }
}
