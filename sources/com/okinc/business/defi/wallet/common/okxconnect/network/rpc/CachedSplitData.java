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
public final class CachedSplitData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final SplitMessage message;
    private final String messageId;
    private final long publishedAt;
    private final String topic;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SplitMessage getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getPublishedAt() {
        return this.publishedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopic() {
        return this.topic;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.CachedSplitData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CachedSplitData> serializer() {
            return CachedSplitData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CachedSplitData(int i, String str, String str2, SplitMessage splitMessage, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, CachedSplitData$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.topic = str2;
        this.message = splitMessage;
        this.publishedAt = j;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CachedSplitData cachedSplitData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, cachedSplitData.messageId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, cachedSplitData.topic);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, SplitMessage$$serializer.INSTANCE, cachedSplitData.message);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, cachedSplitData.publishedAt);
    }

    public CachedSplitData(@NotNull String str, @NotNull String str2, @NotNull SplitMessage splitMessage, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(splitMessage, "");
        this.messageId = str;
        this.topic = str2;
        this.message = splitMessage;
        this.publishedAt = j;
    }
}
