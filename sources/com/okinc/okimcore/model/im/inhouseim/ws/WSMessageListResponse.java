package com.okinc.okimcore.model.im.inhouseim.ws;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class WSMessageListResponse {
    public final List<WSSendMessageDetailData> messageList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(WSSendMessageDetailData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.im.inhouseim.ws.WSMessageListResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WSMessageListResponse copy$default(WSMessageListResponse wSMessageListResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wSMessageListResponse.messageList;
        }
        return wSMessageListResponse.AEQbTJ(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSMessageListResponse AEQbTJ(@NotNull List<WSSendMessageDetailData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new WSMessageListResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WSSendMessageDetailData> EZpvd() {
        return this.messageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WSMessageListResponse) && Intrinsics.EZpvd(this.messageList, ((WSMessageListResponse) obj).messageList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.messageList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSMessageListResponse(messageList=" + this.messageList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSMessageListResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSMessageListResponse> serializer() {
            return WSMessageListResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WSMessageListResponse(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WSMessageListResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.messageList = list;
    }

    public WSMessageListResponse(@NotNull List<WSSendMessageDetailData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.messageList = list;
    }
}
