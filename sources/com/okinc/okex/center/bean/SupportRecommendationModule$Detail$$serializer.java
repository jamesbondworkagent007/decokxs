package com.okinc.okex.center.bean;

import com.okinc.okex.center.bean.SupportRecommendationModule;
import java.util.List;
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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class SupportRecommendationModule$Detail$$serializer implements GeneratedSerializer<SupportRecommendationModule.Detail> {
    public static final int $stable;
    public static final SupportRecommendationModule$Detail$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SupportRecommendationModule$Detail$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SupportRecommendationModule$Detail$$serializer supportRecommendationModule$Detail$$serializer = new SupportRecommendationModule$Detail$$serializer();
        INSTANCE = supportRecommendationModule$Detail$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.center.bean.SupportRecommendationModule.Detail", supportRecommendationModule$Detail$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("buttonList", true);
        pluginGeneratedSerialDescriptor.addElement("descriptionList", true);
        pluginGeneratedSerialDescriptor.addElement("tag", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = SupportRecommendationModule.Detail.$childSerializers;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(kSerializerArr[0]), BuiltinSerializersKt.getNullable(kSerializerArr[1]), BuiltinSerializersKt.getNullable(SupportRecommendationModule$Detail$Tag$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SupportRecommendationModule.Detail deserialize(@NotNull Decoder decoder) {
        int i;
        SupportRecommendationModule.Detail.Tag tag;
        String str;
        List list;
        List list2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SupportRecommendationModule.Detail.$childSerializers;
        SupportRecommendationModule.Detail.Tag tag2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            SupportRecommendationModule.Detail.Tag tag3 = (SupportRecommendationModule.Detail.Tag) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SupportRecommendationModule$Detail$Tag$$serializer.INSTANCE, null);
            list = list4;
            list2 = list3;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, null);
            tag = tag3;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            String str2 = null;
            List list5 = null;
            List list6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], list6);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], list5);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    tag2 = (SupportRecommendationModule.Detail.Tag) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SupportRecommendationModule$Detail$Tag$$serializer.INSTANCE, tag2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str2);
                    i2 |= 8;
                }
            }
            i = i2;
            tag = tag2;
            str = str2;
            list = list5;
            list2 = list6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SupportRecommendationModule.Detail(i, list2, list, tag, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SupportRecommendationModule.Detail detail) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(detail, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SupportRecommendationModule.Detail.write$Self$OKSupport_support_impl(detail, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
