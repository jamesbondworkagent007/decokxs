package com.okinc.share.jsbridge.bean;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class JSShareConfig$$serializer implements GeneratedSerializer<JSShareConfig> {
    public static final int $stable;
    public static final JSShareConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private JSShareConfig$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        JSShareConfig$$serializer jSShareConfig$$serializer = new JSShareConfig$$serializer();
        INSTANCE = jSShareConfig$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.share.jsbridge.bean.JSShareConfig", jSShareConfig$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("shareParams", false);
        pluginGeneratedSerialDescriptor.addElement("previewConfig", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{JSShareParams$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(JSPreviewConfig$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final JSShareConfig deserialize(@NotNull Decoder decoder) {
        JSShareParams jSShareParams;
        JSPreviewConfig jSPreviewConfig;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            jSShareParams = (JSShareParams) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, JSShareParams$$serializer.INSTANCE, null);
            jSPreviewConfig = (JSPreviewConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, JSPreviewConfig$$serializer.INSTANCE, null);
            i = 3;
        } else {
            jSShareParams = null;
            JSPreviewConfig jSPreviewConfig2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    jSShareParams = (JSShareParams) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, JSShareParams$$serializer.INSTANCE, jSShareParams);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jSPreviewConfig2 = (JSPreviewConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, JSPreviewConfig$$serializer.INSTANCE, jSPreviewConfig2);
                    i2 |= 2;
                }
            }
            jSPreviewConfig = jSPreviewConfig2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new JSShareConfig(i, jSShareParams, jSPreviewConfig, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull JSShareConfig jSShareConfig) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(jSShareConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        JSShareConfig.write$Self$OKShare_sdk_share_impl(jSShareConfig, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
