package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC44292sKk;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ChannelMessenger$onChannelConnectionStatusChanged$3 extends FunctionReferenceImpl implements Function2<OKMessage, OKRecallNotificationMessage, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChannelMessenger$onChannelConnectionStatusChanged$3(Object obj) {
        super(2, obj, AbstractC44292sKk.class, "onReceiveRecallMessage", "onReceiveRecallMessage(Lcom/okinc/okimcore/model/im/OKMessage;Lcom/okinc/okimcore/model/other/OKRecallNotificationMessage;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(OKMessage oKMessage, OKRecallNotificationMessage oKRecallNotificationMessage) {
        invoke2(oKMessage, oKRecallNotificationMessage);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OKMessage oKMessage, OKRecallNotificationMessage oKRecallNotificationMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(oKRecallNotificationMessage, "");
        ((AbstractC44292sKk) this.receiver).copydefault(oKMessage, oKRecallNotificationMessage);
    }
}
