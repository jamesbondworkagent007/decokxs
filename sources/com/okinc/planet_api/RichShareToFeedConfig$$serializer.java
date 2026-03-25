package com.okinc.planet_api;

import java.util.ArrayList;
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

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class RichShareToFeedConfig$$serializer implements GeneratedSerializer<RichShareToFeedConfig> {
    public static final int $stable;
    public static final RichShareToFeedConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RichShareToFeedConfig$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RichShareToFeedConfig$$serializer richShareToFeedConfig$$serializer = new RichShareToFeedConfig$$serializer();
        INSTANCE = richShareToFeedConfig$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet_api.RichShareToFeedConfig", richShareToFeedConfig$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement("topics", true);
        pluginGeneratedSerialDescriptor.addElement("imageList", true);
        pluginGeneratedSerialDescriptor.addElement("activityCard", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = RichShareToFeedConfig.$childSerializers;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), kSerializerArr[1], kSerializerArr[2], BuiltinSerializersKt.getNullable(ActivityCard$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RichShareToFeedConfig deserialize(@NotNull Decoder decoder) {
        int i;
        ArrayList arrayList;
        ActivityCard activityCard;
        ArrayList arrayList2;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = RichShareToFeedConfig.$childSerializers;
        ArrayList arrayList3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, null);
            ArrayList arrayList4 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            arrayList = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            str = str2;
            activityCard = (ActivityCard) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ActivityCard$$serializer.INSTANCE, null);
            arrayList2 = arrayList4;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            ActivityCard activityCard2 = null;
            ArrayList arrayList5 = null;
            String str3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    arrayList5 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], arrayList5);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    arrayList3 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], arrayList3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    activityCard2 = (ActivityCard) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ActivityCard$$serializer.INSTANCE, activityCard2);
                    i2 |= 8;
                }
            }
            i = i2;
            arrayList = arrayList3;
            activityCard = activityCard2;
            arrayList2 = arrayList5;
            str = str3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RichShareToFeedConfig(i, str, arrayList2, arrayList, activityCard, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RichShareToFeedConfig richShareToFeedConfig) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(richShareToFeedConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RichShareToFeedConfig.write$Self$OKPlanet_ok_feature_planet_api(richShareToFeedConfig, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
