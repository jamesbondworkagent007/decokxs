package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC44292sKk;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ChannelMessenger$onChannelConnectionStatusChanged$4 extends FunctionReferenceImpl implements Function1<OKMessage, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChannelMessenger$onChannelConnectionStatusChanged$4(Object obj) {
        super(1, obj, AbstractC44292sKk.class, "onReceiveReadReceipt", "onReceiveReadReceipt(Lcom/okinc/okimcore/model/im/OKMessage;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OKMessage oKMessage) {
        invoke2(oKMessage);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        ((AbstractC44292sKk) this.receiver).EZpvd(oKMessage);
    }
}
