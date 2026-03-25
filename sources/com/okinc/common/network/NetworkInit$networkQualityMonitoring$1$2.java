package com.okinc.common.network;

import com.okinc.network.okg.log.NetEventData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C43405rof;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class NetworkInit$networkQualityMonitoring$1$2 extends FunctionReferenceImpl implements Function1<NetEventData, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NetworkInit$networkQualityMonitoring$1$2(Object obj) {
        super(1, obj, C43405rof.class, "addRecordNetEvent", "addRecordNetEvent(Lcom/okinc/network/okg/log/NetEventData;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NetEventData netEventData) {
        invoke2(netEventData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NetEventData netEventData) {
        Intrinsics.checkNotNullParameter(netEventData, "");
        ((C43405rof) this.receiver).KWHzl(netEventData);
    }
}
