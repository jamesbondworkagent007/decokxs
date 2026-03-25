package com.okinc.business.market.features.meme.data.model;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class XMediaV2Data$$serializer implements GeneratedSerializer<XMediaV2Data> {
    public static final int $stable;
    public static final XMediaV2Data$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private XMediaV2Data$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        XMediaV2Data$$serializer xMediaV2Data$$serializer = new XMediaV2Data$$serializer();
        INSTANCE = xMediaV2Data$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.meme.data.model.XMediaV2Data", xMediaV2Data$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("xrenameCnt", true);
        pluginGeneratedSerialDescriptor.addElement("xTime", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = XMediaV2Data.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[1]), stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final XMediaV2Data deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String strDecodeStringElement;
        XPostType xPostType;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = XMediaV2Data.$childSerializers;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            XPostType xPostType2 = (XPostType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            xPostType = xPostType2;
            str2 = strDecodeStringElement3;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            str = strDecodeStringElement4;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            String strDecodeStringElement5 = null;
            XPostType xPostType3 = null;
            String strDecodeStringElement6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    xPostType3 = (XPostType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], xPostType3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement2;
            strDecodeStringElement = strDecodeStringElement5;
            xPostType = xPostType3;
            str2 = strDecodeStringElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new XMediaV2Data(i, str2, xPostType, str, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull XMediaV2Data xMediaV2Data) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(xMediaV2Data, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        XMediaV2Data.write$Self$OKDex_dex_impl(xMediaV2Data, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
