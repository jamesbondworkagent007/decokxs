package com.okinc.okimcore.model.im;

import com.okinc.okimcore.model.im.GroupSystemMessage;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import o.C33489mxS;
import o.C56392yDr;
import o.InterfaceC56387yDm;

/* JADX INFO: loaded from: classes10.dex */
public abstract class GroupSystemMessage extends OKGroupNotificationMessage {
    public static final int $stable = 8;
    private final InterfaceC56387yDm notifyInfo$delegate = C56392yDr.copydefault(new Function0() { // from class: o.sNL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return GroupSystemMessage.notifyInfo_delegate$lambda$0(this.AEQbTJ);
        }
    });

    public final GroupSystemMessageInfo getNotifyInfo() {
        return (GroupSystemMessageInfo) this.notifyInfo$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GroupSystemMessageInfo notifyInfo_delegate$lambda$0(GroupSystemMessage groupSystemMessage) {
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        KSerializer<GroupSystemMessageInfo> kSerializerSerializer = GroupSystemMessageInfo.Companion.serializer();
        String data = groupSystemMessage.getData();
        Intrinsics.copydefault((Object) data);
        return (GroupSystemMessageInfo) c33489mxS.OLrzqt((DeserializationStrategy) kSerializerSerializer, data);
    }
}
