package com.okinc.business.dex.trade.copytrading.edit.domain.usecase;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class CopyTradingSignIntentUseCase$1 extends FunctionReferenceImpl implements Function0<Long> {
    public static final CopyTradingSignIntentUseCase$1 INSTANCE = new CopyTradingSignIntentUseCase$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CopyTradingSignIntentUseCase$1() {
        super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
