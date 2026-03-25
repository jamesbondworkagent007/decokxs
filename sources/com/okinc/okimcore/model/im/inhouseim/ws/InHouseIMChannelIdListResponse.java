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
public final class InHouseIMChannelIdListResponse {
    public final List<InHouseImChannelInfoResponse> seqDtoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(InHouseImChannelInfoResponse$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelIdListResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InHouseIMChannelIdListResponse copy$default(InHouseIMChannelIdListResponse inHouseIMChannelIdListResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = inHouseIMChannelIdListResponse.seqDtoList;
        }
        return inHouseIMChannelIdListResponse.OLrzqt(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InHouseImChannelInfoResponse> AEQbTJ() {
        return this.seqDtoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMChannelIdListResponse OLrzqt(@NotNull List<InHouseImChannelInfoResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new InHouseIMChannelIdListResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InHouseIMChannelIdListResponse) && Intrinsics.EZpvd(this.seqDtoList, ((InHouseIMChannelIdListResponse) obj).seqDtoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.seqDtoList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMChannelIdListResponse(seqDtoList=" + this.seqDtoList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelIdListResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMChannelIdListResponse> serializer() {
            return InHouseIMChannelIdListResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMChannelIdListResponse(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, InHouseIMChannelIdListResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.seqDtoList = list;
    }

    public InHouseIMChannelIdListResponse(@NotNull List<InHouseImChannelInfoResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.seqDtoList = list;
    }
}
