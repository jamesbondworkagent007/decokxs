package com.okinc.business.market.features.coincheck;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.ACT;
import uniffi.dex.CoinCheckResult;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class CoinCheckViewModel$loadCoinCheckData$1$1$4 extends FunctionReferenceImpl implements Function0<CoinCheckResult> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinCheckViewModel$loadCoinCheckData$1$1$4(Object obj) {
        super(0, obj, ACT.class, "getSuccessResult", "getSuccessResult()Luniffi/dex/CoinCheckResult;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function0
    public final CoinCheckResult invoke() {
        return ((ACT) this.receiver).OLrzqt();
    }
}
