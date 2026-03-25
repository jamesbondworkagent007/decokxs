package com.okinc.websocket.v5config;

import com.okinc.core.livelistener.OKIncomingData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C57577ykz;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class OKWSChannelV5$processIncomingData$1 extends FunctionReferenceImpl implements Function1<OKIncomingData, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKWSChannelV5$processIncomingData$1(Object obj) {
        super(1, obj, C57577ykz.class, "dispatchIncomingData", "dispatchIncomingData(Lcom/okinc/core/livelistener/OKIncomingData;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OKIncomingData oKIncomingData) {
        invoke2(oKIncomingData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        ((C57577ykz) this.receiver).OLrzqt(oKIncomingData);
    }
}
