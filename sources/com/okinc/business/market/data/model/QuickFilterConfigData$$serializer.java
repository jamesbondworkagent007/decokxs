package com.okinc.business.market.data.model;

import java.util.List;
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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class QuickFilterConfigData$$serializer implements GeneratedSerializer<QuickFilterConfigData> {
    public static final int $stable;
    public static final QuickFilterConfigData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private QuickFilterConfigData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        QuickFilterConfigData$$serializer quickFilterConfigData$$serializer = new QuickFilterConfigData$$serializer();
        INSTANCE = quickFilterConfigData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.QuickFilterConfigData", quickFilterConfigData$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("liquidityConfig", true);
        pluginGeneratedSerialDescriptor.addElement("volumeConfig", true);
        pluginGeneratedSerialDescriptor.addElement("marketCapConfig", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAgeConfig", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = QuickFilterConfigData.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], kSerializerArr[2], kSerializerArr[3]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final QuickFilterConfigData deserialize(@NotNull Decoder decoder) {
        int i;
        List list;
        List list2;
        List list3;
        List list4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = QuickFilterConfigData.$childSerializers;
        List list5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            List list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            List list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            list4 = list6;
            i = 15;
            list = list8;
            list3 = list7;
        } else {
            int i2 = 0;
            boolean z = true;
            List list9 = null;
            List list10 = null;
            List list11 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list11 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list11);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    list10 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], list10);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], list5);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list9);
                    i2 |= 8;
                }
            }
            i = i2;
            list = list5;
            list2 = list9;
            list3 = list10;
            list4 = list11;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new QuickFilterConfigData(i, list4, list3, list, list2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull QuickFilterConfigData quickFilterConfigData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(quickFilterConfigData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        QuickFilterConfigData.copydefault(quickFilterConfigData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
