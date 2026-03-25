package com.okinc.business.defi.wallet.common.okxconnect.network.rpc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DisconnectedTopic {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long publishedAt;
    private final String topic;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DisconnectedTopic copy$default(DisconnectedTopic disconnectedTopic, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = disconnectedTopic.topic;
        }
        if ((i & 2) != 0) {
            j = disconnectedTopic.publishedAt;
        }
        return disconnectedTopic.copy(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.publishedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisconnectedTopic copy(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DisconnectedTopic(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisconnectedTopic)) {
            return false;
        }
        DisconnectedTopic disconnectedTopic = (DisconnectedTopic) obj;
        return Intrinsics.EZpvd((Object) this.topic, (Object) disconnectedTopic.topic) && this.publishedAt == disconnectedTopic.publishedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getPublishedAt() {
        return this.publishedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.topic.hashCode() * 31) + Long.hashCode(this.publishedAt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DisconnectedTopic(topic=" + this.topic + ", publishedAt=" + this.publishedAt + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.DisconnectedTopic.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DisconnectedTopic> serializer() {
            return DisconnectedTopic$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DisconnectedTopic(int i, String str, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DisconnectedTopic$$serializer.INSTANCE.getDescriptor());
        }
        this.topic = str;
        this.publishedAt = j;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DisconnectedTopic disconnectedTopic, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, disconnectedTopic.topic);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, disconnectedTopic.publishedAt);
    }

    public DisconnectedTopic(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.topic = str;
        this.publishedAt = j;
    }
}
