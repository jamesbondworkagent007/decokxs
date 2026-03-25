package com.okinc.websocket.v5config;

import com.okinc.websocket.bean.OKWSEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C57577ykz;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class OKWSChannelV5$processIncomingData$2 extends FunctionReferenceImpl implements Function2<OKWSEvent, String, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKWSChannelV5$processIncomingData$2(Object obj) {
        super(2, obj, C57577ykz.class, "channelBufferProcessOnError", "channelBufferProcessOnError(Lcom/okinc/websocket/bean/OKWSEvent;Ljava/lang/String;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(OKWSEvent oKWSEvent, String str) {
        invoke2(oKWSEvent, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OKWSEvent oKWSEvent, String str) {
        Intrinsics.checkNotNullParameter(oKWSEvent, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((C57577ykz) this.receiver).EZpvd(oKWSEvent, str);
    }
}
