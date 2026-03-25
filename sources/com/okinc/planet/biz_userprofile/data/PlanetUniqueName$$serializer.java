package com.okinc.planet.biz_userprofile.data;

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
public final /* synthetic */ class PlanetUniqueName$$serializer implements GeneratedSerializer<PlanetUniqueName> {
    public static final int $stable;
    public static final PlanetUniqueName$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PlanetUniqueName$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PlanetUniqueName$$serializer planetUniqueName$$serializer = new PlanetUniqueName$$serializer();
        INSTANCE = planetUniqueName$$serializer;
        $stable = 8;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.okinc.planet.biz_userprofile.data.PlanetUniqueName", planetUniqueName$$serializer);
        inlineClassDescriptor.addElement("value", false);
        descriptor = inlineClassDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return PlanetUniqueName.EZpvd(m7053deserializeGPg1ANc(decoder));
    }

    /* JADX INFO: renamed from: deserialize-GPg1ANc, reason: not valid java name */
    public final String m7053deserializeGPg1ANc(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return PlanetUniqueName.AEQbTJ(decoder.decodeInline(descriptor).decodeString());
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m7054serializepE_JsA(encoder, ((PlanetUniqueName) obj).EZpvd());
    }

    /* JADX INFO: renamed from: serialize-p-E_JsA, reason: not valid java name */
    public final void m7054serializepE_JsA(@NotNull Encoder encoder, @NotNull String str) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(str, "");
        Encoder encoderEncodeInline = encoder.encodeInline(descriptor);
        if (encoderEncodeInline == null) {
            return;
        }
        encoderEncodeInline.encodeString(str);
    }
}
