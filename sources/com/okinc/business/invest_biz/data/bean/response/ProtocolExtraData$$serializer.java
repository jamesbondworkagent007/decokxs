package com.okinc.business.invest_biz.data.bean.response;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ProtocolExtraData$$serializer implements GeneratedSerializer<ProtocolExtraData> {
    public static final int $stable;
    public static final ProtocolExtraData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ProtocolExtraData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ProtocolExtraData$$serializer protocolExtraData$$serializer = new ProtocolExtraData$$serializer();
        INSTANCE = protocolExtraData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.response.ProtocolExtraData", protocolExtraData$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("additionalDataList", true);
        pluginGeneratedSerialDescriptor.addElement("healthRate", true);
        pluginGeneratedSerialDescriptor.addElement("points", true);
        pluginGeneratedSerialDescriptor.addElement("protocolRewards", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ProtocolExtraData.$childSerializers[0], BuiltinSerializersKt.getNullable(HealthRate$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Points$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ProtocolRewards$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ProtocolExtraData deserialize(@NotNull Decoder decoder) {
        int i;
        Points points;
        List list;
        ProtocolRewards protocolRewards;
        HealthRate healthRate;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ProtocolExtraData.$childSerializers;
        Points points2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            HealthRate healthRate2 = (HealthRate) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, HealthRate$$serializer.INSTANCE, null);
            Points points3 = (Points) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Points$$serializer.INSTANCE, null);
            list = list2;
            healthRate = healthRate2;
            protocolRewards = (ProtocolRewards) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ProtocolRewards$$serializer.INSTANCE, null);
            points = points3;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            List list3 = null;
            ProtocolRewards protocolRewards2 = null;
            HealthRate healthRate3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    healthRate3 = (HealthRate) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, HealthRate$$serializer.INSTANCE, healthRate3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    points2 = (Points) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Points$$serializer.INSTANCE, points2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    protocolRewards2 = (ProtocolRewards) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ProtocolRewards$$serializer.INSTANCE, protocolRewards2);
                    i2 |= 8;
                }
            }
            i = i2;
            points = points2;
            list = list3;
            protocolRewards = protocolRewards2;
            healthRate = healthRate3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProtocolExtraData(i, list, healthRate, points, protocolRewards, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ProtocolExtraData protocolExtraData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(protocolExtraData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ProtocolExtraData.OLrzqt(protocolExtraData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
