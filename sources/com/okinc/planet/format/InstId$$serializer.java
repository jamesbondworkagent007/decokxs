package com.okinc.planet.format;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class InstId$$serializer implements GeneratedSerializer<InstId> {
    public static final int $stable;
    public static final InstId$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InstId$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InstId$$serializer instId$$serializer = new InstId$$serializer();
        INSTANCE = instId$$serializer;
        $stable = 8;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.okinc.planet.format.InstId", instId$$serializer);
        inlineClassDescriptor.addElement("id", false);
        descriptor = inlineClassDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return InstId.copydefault(m7060deserializenI8vunI(decoder));
    }

    /* JADX INFO: renamed from: deserialize-nI8vunI, reason: not valid java name */
    public final String m7060deserializenI8vunI(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return InstId.EZpvd(decoder.decodeInline(descriptor).decodeString());
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m7061serializetdsPfag(encoder, ((InstId) obj).OLrzqt());
    }

    /* JADX INFO: renamed from: serialize-tdsPfag, reason: not valid java name */
    public final void m7061serializetdsPfag(@NotNull Encoder encoder, @NotNull String str) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(str, "");
        Encoder encoderEncodeInline = encoder.encodeInline(descriptor);
        if (encoderEncodeInline == null) {
            return;
        }
        encoderEncodeInline.encodeString(str);
    }
}
