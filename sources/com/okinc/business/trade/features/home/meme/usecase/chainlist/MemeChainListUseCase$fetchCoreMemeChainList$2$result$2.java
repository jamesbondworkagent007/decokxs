package com.okinc.business.trade.features.home.meme.usecase.chainlist;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.AFB;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class MemeChainListUseCase$fetchCoreMemeChainList$2$result$2 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeChainListUseCase$fetchCoreMemeChainList$2$result$2(Object obj) {
        super(0, obj, AFB.class, OtpEventTracker.OTP_EVENT_VALUE_CANCEL, "cancel()V", 0);
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
        ((AFB) this.receiver).EZpvd();
    }
}
