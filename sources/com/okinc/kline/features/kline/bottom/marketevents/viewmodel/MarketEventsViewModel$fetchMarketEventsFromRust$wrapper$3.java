package com.okinc.kline.features.kline.bottom.marketevents.viewmodel;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.BiL;
import uniffi.ok_future_utils.OkffiException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class MarketEventsViewModel$fetchMarketEventsFromRust$wrapper$3 extends FunctionReferenceImpl implements Function0<OkffiException> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketEventsViewModel$fetchMarketEventsFromRust$wrapper$3(Object obj) {
        super(0, obj, BiL.class, "getError", "getError()Luniffi/ok_future_utils/OkffiException;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function0
    public final OkffiException invoke() {
        return ((BiL) this.receiver).OLrzqt();
    }
}
