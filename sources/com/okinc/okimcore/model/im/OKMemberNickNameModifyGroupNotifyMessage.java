package com.okinc.okimcore.model.im;

import com.okinc.okimcore.model.im.OKMemberNickNameModifyGroupNotifyMessage;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import o.C33489mxS;
import o.C56392yDr;
import o.InterfaceC56387yDm;

/* JADX INFO: loaded from: classes10.dex */
public final class OKMemberNickNameModifyGroupNotifyMessage extends OKGroupNotificationMessage {
    public static final String GROUP_OPERATION_NICK_NAME = "Petname";
    private final InterfaceC56387yDm notifyInfo$delegate = C56392yDr.copydefault(new Function0() { // from class: o.sNU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return OKMemberNickNameModifyGroupNotifyMessage.notifyInfo_delegate$lambda$0(this.OLrzqt);
        }
    });
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int $stable = 8;

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKMemberNickNameModifyGroupNotifyMessage.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final NickNameNotifyInfo getNotifyInfo() {
        return (NickNameNotifyInfo) this.notifyInfo$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NickNameNotifyInfo notifyInfo_delegate$lambda$0(OKMemberNickNameModifyGroupNotifyMessage oKMemberNickNameModifyGroupNotifyMessage) {
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        KSerializer<NickNameNotifyInfo> kSerializerSerializer = NickNameNotifyInfo.Companion.serializer();
        String data = oKMemberNickNameModifyGroupNotifyMessage.getData();
        Intrinsics.copydefault((Object) data);
        return (NickNameNotifyInfo) c33489mxS.OLrzqt((DeserializationStrategy) kSerializerSerializer, data);
    }
}
