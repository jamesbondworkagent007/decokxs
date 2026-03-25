package com.okinc.okimcore.model.im.inhouseim.ws;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationSimpleInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationSimpleInfoEntity$$serializer;
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
public final class WSConversationIdsResponse {
    public final List<InHouseIMConversationSimpleInfoEntity> conversationIdDtoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(InHouseIMConversationSimpleInfoEntity$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.im.inhouseim.ws.WSConversationIdsResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WSConversationIdsResponse copy$default(WSConversationIdsResponse wSConversationIdsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wSConversationIdsResponse.conversationIdDtoList;
        }
        return wSConversationIdsResponse.copydefault(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSConversationIdsResponse copydefault(@NotNull List<InHouseIMConversationSimpleInfoEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new WSConversationIdsResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InHouseIMConversationSimpleInfoEntity> copydefault() {
        return this.conversationIdDtoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WSConversationIdsResponse) && Intrinsics.EZpvd(this.conversationIdDtoList, ((WSConversationIdsResponse) obj).conversationIdDtoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.conversationIdDtoList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSConversationIdsResponse(conversationIdDtoList=" + this.conversationIdDtoList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSConversationIdsResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSConversationIdsResponse> serializer() {
            return WSConversationIdsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WSConversationIdsResponse(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WSConversationIdsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.conversationIdDtoList = list;
    }

    public WSConversationIdsResponse(@NotNull List<InHouseIMConversationSimpleInfoEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.conversationIdDtoList = list;
    }
}
