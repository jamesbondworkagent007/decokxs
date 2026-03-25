package com.okinc.business.market.data.model;

import androidx.core.app.FrameMetricsAggregator;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.market.common.constants.StringBooleanType;
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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class TagExtraData$$serializer implements GeneratedSerializer<TagExtraData> {
    public static final int $stable;
    public static final TagExtraData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TagExtraData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TagExtraData$$serializer tagExtraData$$serializer = new TagExtraData$$serializer();
        INSTANCE = tagExtraData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.TagExtraData", tagExtraData$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("kolTwitterImageFullPath", true);
        pluginGeneratedSerialDescriptor.addElement("kolTwitterLink", true);
        pluginGeneratedSerialDescriptor.addElement("deepLink", true);
        pluginGeneratedSerialDescriptor.addElement("link", true);
        pluginGeneratedSerialDescriptor.addElement("isLinkInternal", true);
        pluginGeneratedSerialDescriptor.addElement("iconText", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_P, true);
        pluginGeneratedSerialDescriptor.addElement("b", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TagExtraData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[5], BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TagExtraData deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        int i;
        StringBooleanType stringBooleanType;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TagExtraData.$childSerializers;
        int i2 = 7;
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            StringBooleanType stringBooleanType2 = (StringBooleanType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            i = FrameMetricsAggregator.EVERY_DURATION;
            stringBooleanType = stringBooleanType2;
            str2 = str7;
            str = str6;
            strDecodeStringElement = strDecodeStringElement7;
            str4 = str8;
            strDecodeStringElement2 = strDecodeStringElement8;
            strDecodeStringElement3 = strDecodeStringElement6;
            str3 = strDecodeStringElement5;
            str5 = strDecodeStringElement4;
        } else {
            int i3 = 0;
            boolean z = true;
            StringBooleanType stringBooleanType3 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            strDecodeStringElement = null;
            strDecodeStringElement2 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        break;
                    case 0:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 7;
                        break;
                    case 1:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 7;
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 = 7;
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 = 7;
                        break;
                    case 4:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        break;
                    case 5:
                        stringBooleanType3 = (StringBooleanType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], stringBooleanType3);
                        i3 |= 32;
                        break;
                    case 6:
                        i3 |= 64;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str9);
                        break;
                    case 7:
                        i3 |= 128;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str11);
                        break;
                    case 8:
                        i3 |= 256;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str10);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            stringBooleanType = stringBooleanType3;
            str = str9;
            str2 = str11;
            str3 = strDecodeStringElement9;
            str4 = str10;
            str5 = strDecodeStringElement10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TagExtraData(i, str5, str3, strDecodeStringElement3, strDecodeStringElement, strDecodeStringElement2, stringBooleanType, str, str2, str4, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TagExtraData tagExtraData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tagExtraData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TagExtraData.KWHzl(tagExtraData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
