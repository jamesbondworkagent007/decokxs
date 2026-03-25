package com.okinc.tradingbot.impl.dto;

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
public final /* synthetic */ class NumericString$$serializer implements GeneratedSerializer<NumericString> {
    public static final int $stable;
    public static final NumericString$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NumericString$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NumericString$$serializer numericString$$serializer = new NumericString$$serializer();
        INSTANCE = numericString$$serializer;
        $stable = 8;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.okinc.tradingbot.impl.dto.NumericString", numericString$$serializer);
        inlineClassDescriptor.addElement("value", false);
        descriptor = inlineClassDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return NumericString.copydefault(m7087deserializeWnx5xUg(decoder));
    }

    /* JADX INFO: renamed from: deserialize-Wnx5xUg, reason: not valid java name */
    public final String m7087deserializeWnx5xUg(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return NumericString.AEQbTJ(decoder.decodeInline(descriptor).decodeString());
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m7088serializemWpITh8(encoder, ((NumericString) obj).EZpvd());
    }

    /* JADX INFO: renamed from: serialize-mWpITh8, reason: not valid java name */
    public final void m7088serializemWpITh8(@NotNull Encoder encoder, @NotNull String str) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(str, "");
        Encoder encoderEncodeInline = encoder.encodeInline(descriptor);
        if (encoderEncodeInline == null) {
            return;
        }
        encoderEncodeInline.encodeString(str);
    }
}
