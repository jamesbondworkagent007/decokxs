package com.okinc.planet.biz_positions.data;

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
public final /* synthetic */ class Ccy$$serializer implements GeneratedSerializer<Ccy> {
    public static final int $stable;
    public static final Ccy$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Ccy$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Ccy$$serializer ccy$$serializer = new Ccy$$serializer();
        INSTANCE = ccy$$serializer;
        $stable = 8;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.okinc.planet.biz_positions.data.Ccy", ccy$$serializer);
        inlineClassDescriptor.addElement("value", false);
        descriptor = inlineClassDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return Ccy.m6961boximpl(m6970deserialize7KLJ7nA(decoder));
    }

    /* JADX INFO: renamed from: deserialize-7KLJ7nA, reason: not valid java name */
    public final String m6970deserialize7KLJ7nA(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return Ccy.m6962constructorimpl(decoder.decodeInline(descriptor).decodeString());
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m6971serializedelnEA(encoder, ((Ccy) obj).m6969unboximpl());
    }

    /* JADX INFO: renamed from: serialize-delnE-A, reason: not valid java name */
    public final void m6971serializedelnEA(@NotNull Encoder encoder, @NotNull String str) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(str, "");
        Encoder encoderEncodeInline = encoder.encodeInline(descriptor);
        if (encoderEncodeInline == null) {
            return;
        }
        encoderEncodeInline.encodeString(str);
    }
}
