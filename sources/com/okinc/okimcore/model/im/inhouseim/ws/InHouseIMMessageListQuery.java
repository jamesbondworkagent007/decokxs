package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class InHouseIMMessageListQuery {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String channelId;
    public final String lastSeq;
    public final int limit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InHouseIMMessageListQuery copy$default(InHouseIMMessageListQuery inHouseIMMessageListQuery, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = inHouseIMMessageListQuery.channelId;
        }
        if ((i2 & 2) != 0) {
            str2 = inHouseIMMessageListQuery.lastSeq;
        }
        if ((i2 & 4) != 0) {
            i = inHouseIMMessageListQuery.limit;
        }
        return inHouseIMMessageListQuery.AEQbTJ(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMMessageListQuery AEQbTJ(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new InHouseIMMessageListQuery(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMMessageListQuery)) {
            return false;
        }
        InHouseIMMessageListQuery inHouseIMMessageListQuery = (InHouseIMMessageListQuery) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) inHouseIMMessageListQuery.channelId) && Intrinsics.EZpvd((Object) this.lastSeq, (Object) inHouseIMMessageListQuery.lastSeq) && this.limit == inHouseIMMessageListQuery.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.channelId.hashCode() * 31) + this.lastSeq.hashCode()) * 31) + Integer.hashCode(this.limit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMMessageListQuery(channelId=" + this.channelId + ", lastSeq=" + this.lastSeq + ", limit=" + this.limit + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMMessageListQuery.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMMessageListQuery> serializer() {
            return InHouseIMMessageListQuery$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMMessageListQuery(int i, String str, String str2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, InHouseIMMessageListQuery$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = str;
        this.lastSeq = str2;
        this.limit = i2;
    }

    public static final /* synthetic */ void EZpvd(InHouseIMMessageListQuery inHouseIMMessageListQuery, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, inHouseIMMessageListQuery.channelId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, inHouseIMMessageListQuery.lastSeq);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, inHouseIMMessageListQuery.limit);
    }

    public InHouseIMMessageListQuery(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.channelId = str;
        this.lastSeq = str2;
        this.limit = i;
    }
}
