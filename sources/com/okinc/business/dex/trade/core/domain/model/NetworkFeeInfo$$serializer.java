package com.okinc.business.dex.trade.core.domain.model;

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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class NetworkFeeInfo$$serializer implements GeneratedSerializer<NetworkFeeInfo> {
    public static final int $stable;
    public static final NetworkFeeInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NetworkFeeInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NetworkFeeInfo$$serializer networkFeeInfo$$serializer = new NetworkFeeInfo$$serializer();
        INSTANCE = networkFeeInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.core.domain.model.NetworkFeeInfo", networkFeeInfo$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("normal", true);
        pluginGeneratedSerialDescriptor.addElement("mev", true);
        pluginGeneratedSerialDescriptor.addElement("min", true);
        pluginGeneratedSerialDescriptor.addElement("max", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = NetworkFeeInfo.$childSerializers;
        KSerializer nullable = BuiltinSerializersKt.getNullable(PriorityFee$$serializer.INSTANCE);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(kSerializerArr[1]);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NetworkFeeInfo deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        List list;
        PriorityFee priorityFee;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = NetworkFeeInfo.$childSerializers;
        String str3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            PriorityFee priorityFee2 = (PriorityFee) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, PriorityFee$$serializer.INSTANCE, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            list = list2;
            priorityFee = priorityFee2;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            str = str4;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            String str5 = null;
            List list3 = null;
            PriorityFee priorityFee3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    priorityFee3 = (PriorityFee) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, PriorityFee$$serializer.INSTANCE, priorityFee3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], list3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str5);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str3;
            str2 = str5;
            list = list3;
            priorityFee = priorityFee3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NetworkFeeInfo(i, priorityFee, list, str, str2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NetworkFeeInfo networkFeeInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(networkFeeInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NetworkFeeInfo.write$Self$OKDex_dex_impl(networkFeeInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
