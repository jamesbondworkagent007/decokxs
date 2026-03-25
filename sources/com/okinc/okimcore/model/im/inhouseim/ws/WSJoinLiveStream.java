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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class WSJoinLiveStream extends WSRequest {
    public static final int $stable = 0;
    public final WSJoinLiveStreamData data;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {InHouseIMCommand.Companion.serializer(), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSJoinLiveStream copy$default(WSJoinLiveStream wSJoinLiveStream, WSJoinLiveStreamData wSJoinLiveStreamData, int i, Object obj) {
        if ((i & 1) != 0) {
            wSJoinLiveStreamData = wSJoinLiveStream.data;
        }
        return wSJoinLiveStream.EZpvd(wSJoinLiveStreamData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSJoinLiveStream EZpvd(@NotNull WSJoinLiveStreamData wSJoinLiveStreamData) {
        Intrinsics.checkNotNullParameter(wSJoinLiveStreamData, "");
        return new WSJoinLiveStream(wSJoinLiveStreamData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WSJoinLiveStream) && Intrinsics.EZpvd(this.data, ((WSJoinLiveStream) obj).data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSJoinLiveStream(data=" + this.data + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSJoinLiveStream.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSJoinLiveStream> serializer() {
            return WSJoinLiveStream$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WSJoinLiveStream(int i, InHouseIMCommand inHouseIMCommand, String str, WSJoinLiveStreamData wSJoinLiveStreamData, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, inHouseIMCommand, str, serializationConstructorMarker);
        if (5 != (i & 5)) {
            PluginExceptionsKt.throwMissingFieldException(i, 5, WSJoinLiveStream$$serializer.INSTANCE.getDescriptor());
        }
        this.data = wSJoinLiveStreamData;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.okimcore.model.im.inhouseim.ws.WSRequest.OLrzqt(com.okinc.okimcore.model.im.inhouseim.ws.WSRequest, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    public static final /* synthetic */ void OLrzqt(WSJoinLiveStream wSJoinLiveStream, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        WSRequest.OLrzqt(wSJoinLiveStream, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, WSJoinLiveStreamData$$serializer.INSTANCE, wSJoinLiveStream.data);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WSJoinLiveStream(@NotNull WSJoinLiveStreamData wSJoinLiveStreamData) {
        super(InHouseIMCommand.WSSubscribeToLivestream);
        Intrinsics.checkNotNullParameter(wSJoinLiveStreamData, "");
        this.data = wSJoinLiveStreamData;
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
