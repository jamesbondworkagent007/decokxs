package com.okinc.crcore.coreapi.net.responsebean.dex;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class TokenTagVO$$serializer implements GeneratedSerializer<TokenTagVO> {
    public static final int $stable;
    public static final TokenTagVO$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TokenTagVO$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TokenTagVO$$serializer tokenTagVO$$serializer = new TokenTagVO$$serializer();
        INSTANCE = tokenTagVO$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.dex.TokenTagVO", tokenTagVO$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("smartMoneySell", true);
        pluginGeneratedSerialDescriptor.addElement("communityRecognized", true);
        pluginGeneratedSerialDescriptor.addElement("devHoldingRatio", true);
        pluginGeneratedSerialDescriptor.addElement("devBurnToken", true);
        pluginGeneratedSerialDescriptor.addElement("smartMoneyBuy", true);
        pluginGeneratedSerialDescriptor.addElement("devHoldingStatus", true);
        pluginGeneratedSerialDescriptor.addElement("kolHoldingRatio", true);
        pluginGeneratedSerialDescriptor.addElement("bundleHoldingRatio", true);
        pluginGeneratedSerialDescriptor.addElement("smartMoneyHoldingStatus", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        TagDetail$$serializer tagDetail$$serializer = TagDetail$$serializer.INSTANCE;
        return new KSerializer[]{tagDetail$$serializer, tagDetail$$serializer, tagDetail$$serializer, tagDetail$$serializer, tagDetail$$serializer, tagDetail$$serializer, tagDetail$$serializer, tagDetail$$serializer, tagDetail$$serializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TokenTagVO deserialize(@NotNull Decoder decoder) {
        int i;
        TagDetail tagDetail;
        TagDetail tagDetail2;
        TagDetail tagDetail3;
        TagDetail tagDetail4;
        TagDetail tagDetail5;
        TagDetail tagDetail6;
        TagDetail tagDetail7;
        TagDetail tagDetail8;
        TagDetail tagDetail9;
        TagDetail tagDetail10;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        TagDetail tagDetail11 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            TagDetail$$serializer tagDetail$$serializer = TagDetail$$serializer.INSTANCE;
            TagDetail tagDetail12 = (TagDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, tagDetail$$serializer, null);
            TagDetail tagDetail13 = (TagDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, tagDetail$$serializer, null);
            TagDetail tagDetail14 = (TagDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, tagDetail$$serializer, null);
            TagDetail tagDetail15 = (TagDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, tagDetail$$serializer, null);
            TagDetail tagDetail16 = (TagDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, tagDetail$$serializer, null);
            TagDetail tagDetail17 = (TagDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, tagDetail$$serializer, null);
            TagDetail tagDetail18 = (TagDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, tagDetail$$serializer, null);
            TagDetail tagDetail19 = (TagDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, tagDetail$$serializer, null);
            tagDetail = (TagDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, tagDetail$$serializer, null);
            tagDetail2 = tagDetail19;
            tagDetail3 = tagDetail18;
            tagDetail4 = tagDetail17;
            tagDetail6 = tagDetail15;
            tagDetail8 = tagDetail16;
            i = 511;
            tagDetail5 = tagDetail14;
            tagDetail9 = tagDetail12;
            tagDetail7 = tagDetail13;
        } else {
            int i5 = 0;
            boolean z = true;
            TagDetail tagDetail20 = null;
            TagDetail tagDetail21 = null;
            TagDetail tagDetail22 = null;
            TagDetail tagDetail23 = null;
            TagDetail tagDetail24 = null;
            TagDetail tagDetail25 = null;
            TagDetail tagDetail26 = null;
            TagDetail tagDetail27 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        tagDetail10 = tagDetail26;
                        z = false;
                        tagDetail26 = tagDetail10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 0:
                        tagDetail10 = tagDetail26;
                        tagDetail27 = (TagDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, TagDetail$$serializer.INSTANCE, tagDetail27);
                        i5 |= 1;
                        tagDetail26 = tagDetail10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 1:
                        tagDetail26 = (TagDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, TagDetail$$serializer.INSTANCE, tagDetail26);
                        i5 |= 2;
                        tagDetail10 = tagDetail26;
                        tagDetail26 = tagDetail10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 2:
                        tagDetail11 = (TagDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, TagDetail$$serializer.INSTANCE, tagDetail11);
                        i5 |= 4;
                        tagDetail10 = tagDetail26;
                        tagDetail26 = tagDetail10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 3:
                        tagDetail23 = (TagDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, TagDetail$$serializer.INSTANCE, tagDetail23);
                        i5 |= 8;
                        tagDetail10 = tagDetail26;
                        tagDetail26 = tagDetail10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 4:
                        tagDetail20 = (TagDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, TagDetail$$serializer.INSTANCE, tagDetail20);
                        i5 |= 16;
                        tagDetail10 = tagDetail26;
                        tagDetail26 = tagDetail10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 5:
                        tagDetail22 = (TagDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, TagDetail$$serializer.INSTANCE, tagDetail22);
                        i5 |= 32;
                        break;
                    case 6:
                        i5 |= 64;
                        tagDetail21 = (TagDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, TagDetail$$serializer.INSTANCE, tagDetail21);
                        tagDetail10 = tagDetail26;
                        tagDetail26 = tagDetail10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 7:
                        i5 |= 128;
                        tagDetail25 = (TagDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i2, TagDetail$$serializer.INSTANCE, tagDetail25);
                        tagDetail10 = tagDetail26;
                        tagDetail26 = tagDetail10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 8:
                        i5 |= 256;
                        tagDetail24 = (TagDetail) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, TagDetail$$serializer.INSTANCE, tagDetail24);
                        tagDetail10 = tagDetail26;
                        tagDetail26 = tagDetail10;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            tagDetail = tagDetail24;
            tagDetail2 = tagDetail25;
            tagDetail3 = tagDetail21;
            tagDetail4 = tagDetail22;
            tagDetail5 = tagDetail11;
            tagDetail6 = tagDetail23;
            tagDetail7 = tagDetail26;
            tagDetail8 = tagDetail20;
            tagDetail9 = tagDetail27;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TokenTagVO(i, tagDetail9, tagDetail7, tagDetail5, tagDetail6, tagDetail8, tagDetail4, tagDetail3, tagDetail2, tagDetail, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TokenTagVO tokenTagVO) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tokenTagVO, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TokenTagVO.write$Self$OKCRCore_cr_core(tokenTagVO, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
