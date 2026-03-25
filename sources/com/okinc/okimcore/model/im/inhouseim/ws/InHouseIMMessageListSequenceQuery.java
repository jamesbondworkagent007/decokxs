package com.okinc.okimcore.model.im.inhouseim.ws;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMMessageListSequenceQuery {
    public final String channelId;
    public final List<Long> seqList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(LongSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMMessageListSequenceQuery */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InHouseIMMessageListSequenceQuery copy$default(InHouseIMMessageListSequenceQuery inHouseIMMessageListSequenceQuery, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inHouseIMMessageListSequenceQuery.channelId;
        }
        if ((i & 2) != 0) {
            list = inHouseIMMessageListSequenceQuery.seqList;
        }
        return inHouseIMMessageListSequenceQuery.copydefault(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMMessageListSequenceQuery copydefault(@NotNull String str, @NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new InHouseIMMessageListSequenceQuery(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMMessageListSequenceQuery)) {
            return false;
        }
        InHouseIMMessageListSequenceQuery inHouseIMMessageListSequenceQuery = (InHouseIMMessageListSequenceQuery) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) inHouseIMMessageListSequenceQuery.channelId) && Intrinsics.EZpvd(this.seqList, inHouseIMMessageListSequenceQuery.seqList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.channelId.hashCode() * 31) + this.seqList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMMessageListSequenceQuery(channelId=" + this.channelId + ", seqList=" + this.seqList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMMessageListSequenceQuery.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMMessageListSequenceQuery> serializer() {
            return InHouseIMMessageListSequenceQuery$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMMessageListSequenceQuery(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, InHouseIMMessageListSequenceQuery$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = str;
        this.seqList = list;
    }

    public static final /* synthetic */ void OLrzqt(InHouseIMMessageListSequenceQuery inHouseIMMessageListSequenceQuery, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, inHouseIMMessageListSequenceQuery.channelId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], inHouseIMMessageListSequenceQuery.seqList);
    }

    public InHouseIMMessageListSequenceQuery(@NotNull String str, @NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.channelId = str;
        this.seqList = list;
    }
}
