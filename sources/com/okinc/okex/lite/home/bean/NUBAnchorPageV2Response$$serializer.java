package com.okinc.okex.lite.home.bean;

import com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class NUBAnchorPageV2Response$$serializer implements GeneratedSerializer<NUBAnchorPageV2Response> {
    public static final int $stable;
    public static final NUBAnchorPageV2Response$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NUBAnchorPageV2Response$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NUBAnchorPageV2Response$$serializer nUBAnchorPageV2Response$$serializer = new NUBAnchorPageV2Response$$serializer();
        INSTANCE = nUBAnchorPageV2Response$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response", nUBAnchorPageV2Response$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("anchorDataV1", false);
        pluginGeneratedSerialDescriptor.addElement("anchorDataV2", false);
        pluginGeneratedSerialDescriptor.addElement("anchorVersion", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(NUBAnchorPageResponse$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(NUBAnchorPageV2Response$AnchorDataV2$$serializer.INSTANCE), NUBAnchorPageV2Response.$childSerializers[2]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NUBAnchorPageV2Response deserialize(@NotNull Decoder decoder) {
        int i;
        NUBAnchorPageV2Response.AnchorDataV2 anchorDataV2;
        AnchorVersion anchorVersion;
        NUBAnchorPageResponse nUBAnchorPageResponse;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = NUBAnchorPageV2Response.$childSerializers;
        NUBAnchorPageV2Response.AnchorDataV2 anchorDataV22 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            NUBAnchorPageResponse nUBAnchorPageResponse2 = (NUBAnchorPageResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, NUBAnchorPageResponse$$serializer.INSTANCE, null);
            NUBAnchorPageV2Response.AnchorDataV2 anchorDataV23 = (NUBAnchorPageV2Response.AnchorDataV2) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, NUBAnchorPageV2Response$AnchorDataV2$$serializer.INSTANCE, null);
            anchorVersion = (AnchorVersion) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            nUBAnchorPageResponse = nUBAnchorPageResponse2;
            anchorDataV2 = anchorDataV23;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            AnchorVersion anchorVersion2 = null;
            NUBAnchorPageResponse nUBAnchorPageResponse3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    nUBAnchorPageResponse3 = (NUBAnchorPageResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, NUBAnchorPageResponse$$serializer.INSTANCE, nUBAnchorPageResponse3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    anchorDataV22 = (NUBAnchorPageV2Response.AnchorDataV2) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, NUBAnchorPageV2Response$AnchorDataV2$$serializer.INSTANCE, anchorDataV22);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    anchorVersion2 = (AnchorVersion) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], anchorVersion2);
                    i2 |= 4;
                }
            }
            i = i2;
            anchorDataV2 = anchorDataV22;
            anchorVersion = anchorVersion2;
            nUBAnchorPageResponse = nUBAnchorPageResponse3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NUBAnchorPageV2Response(i, nUBAnchorPageResponse, anchorDataV2, anchorVersion, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NUBAnchorPageV2Response nUBAnchorPageV2Response) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(nUBAnchorPageV2Response, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NUBAnchorPageV2Response.write$Self$OKHomeLite_home_lite_api(nUBAnchorPageV2Response, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
