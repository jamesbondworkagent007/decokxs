package com.okinc.business.trade.features.home.domain.usecase.bridgeplatformcheck;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.ACF;
import o.C4135AzD;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class RustBridgePlatformCheckUseCase$invoke$2$1$4 extends FunctionReferenceImpl implements Function0<C4135AzD> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RustBridgePlatformCheckUseCase$invoke$2$1$4(Object obj) {
        super(0, obj, ACF.class, "getSuccessResult", "getSuccessResult()Luniffi/dex/BridgePlatformCheckResponse;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function0
    public final C4135AzD invoke() {
        return ((ACF) this.receiver).copydefault();
    }
}
