package com.okinc.planet.serializer;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class PlanetNumericString$$serializer implements GeneratedSerializer<PlanetNumericString> {
    public static final int $stable;
    public static final PlanetNumericString$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PlanetNumericString$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PlanetNumericString$$serializer planetNumericString$$serializer = new PlanetNumericString$$serializer();
        INSTANCE = planetNumericString$$serializer;
        $stable = 8;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.okinc.planet.serializer.PlanetNumericString", planetNumericString$$serializer);
        inlineClassDescriptor.addElement("value", false);
        descriptor = inlineClassDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return PlanetNumericString.OLrzqt(m7066deserializevIx6V_E(decoder));
    }

    /* JADX INFO: renamed from: deserialize-vIx6V_E, reason: not valid java name */
    public final String m7066deserializevIx6V_E(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return PlanetNumericString.AEQbTJ(decoder.decodeInline(descriptor).decodeString());
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m7067serializeyUZbaXU(encoder, ((PlanetNumericString) obj).AEQbTJ());
    }

    /* JADX INFO: renamed from: serialize-yUZbaXU, reason: not valid java name */
    public final void m7067serializeyUZbaXU(@NotNull Encoder encoder, @NotNull String str) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(str, "");
        Encoder encoderEncodeInline = encoder.encodeInline(descriptor);
        if (encoderEncodeInline == null) {
            return;
        }
        encoderEncodeInline.encodeString(str);
    }
}
