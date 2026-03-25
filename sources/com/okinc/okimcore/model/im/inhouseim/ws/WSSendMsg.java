package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C33129mqd;
import o.C56390yDp;
import o.C56423yEv;
import o.pUU;
import o.sHW;
import o.sSR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class WSSendMsg extends WSRequest {
    public final InHouseIMMessageRequest data;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {InHouseIMCommand.Companion.serializer(), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSSendMsg copy$default(WSSendMsg wSSendMsg, InHouseIMMessageRequest inHouseIMMessageRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            inHouseIMMessageRequest = wSSendMsg.data;
        }
        return wSSendMsg.EZpvd(inHouseIMMessageRequest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendMsg EZpvd(@NotNull InHouseIMMessageRequest inHouseIMMessageRequest) {
        Intrinsics.checkNotNullParameter(inHouseIMMessageRequest, "");
        return new WSSendMsg(inHouseIMMessageRequest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMMessageRequest OLrzqt() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WSSendMsg) && Intrinsics.EZpvd(this.data, ((WSSendMsg) obj).data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSSendMsg(data=" + this.data + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSSendMsg.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSSendMsg> serializer() {
            return WSSendMsg$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WSSendMsg(int i, InHouseIMCommand inHouseIMCommand, String str, InHouseIMMessageRequest inHouseIMMessageRequest, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, inHouseIMCommand, str, serializationConstructorMarker);
        if (5 != (i & 5)) {
            PluginExceptionsKt.throwMissingFieldException(i, 5, WSSendMsg$$serializer.INSTANCE.getDescriptor());
        }
        this.data = inHouseIMMessageRequest;
    }

    public static final /* synthetic */ void KWHzl(WSSendMsg wSSendMsg, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        WSRequest.OLrzqt(wSSendMsg, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, InHouseIMMessageRequest$$serializer.INSTANCE, wSSendMsg.data);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WSSendMsg(@NotNull InHouseIMMessageRequest inHouseIMMessageRequest) {
        super(InHouseIMCommand.WSSendMsg);
        Intrinsics.checkNotNullParameter(inHouseIMMessageRequest, "");
        this.data = inHouseIMMessageRequest;
    }

    @Override // o.InterfaceC44448sQe
    public String KWHzl() {
        try {
            return sHW.copydefault().KWHzl().encodeToString(Companion.serializer(), this);
        } catch (Exception e) {
            pUU.copydefault("SafeJson", "encodeToString with multiple parameters error: " + e.getMessage());
            sSR.copydefault("encodeToString with multiple parameters Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
            return "";
        }
    }
}
