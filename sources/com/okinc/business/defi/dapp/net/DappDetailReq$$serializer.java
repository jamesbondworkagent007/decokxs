package com.okinc.business.defi.dapp.net;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class DappDetailReq$$serializer implements GeneratedSerializer<DappDetailReq> {
    public static final int $stable;
    public static final DappDetailReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DappDetailReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DappDetailReq$$serializer dappDetailReq$$serializer = new DappDetailReq$$serializer();
        INSTANCE = dappDetailReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.dapp.net.DappDetailReq", dappDetailReq$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("dappDynamicChainList", false);
        pluginGeneratedSerialDescriptor.addElement("dappId", false);
        pluginGeneratedSerialDescriptor.addElement("rewardConfig", true);
        pluginGeneratedSerialDescriptor.addElement("rewardWalletAddress", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{DappDetailReq.$childSerializers[0], BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DappDetailReq deserialize(@NotNull Decoder decoder) {
        int i;
        Integer num;
        List list;
        String str;
        Long l;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DappDetailReq.$childSerializers;
        Integer num2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, null);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, null);
            list = list2;
            l = l2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, null);
            num = num3;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            List list3 = null;
            String str2 = null;
            Long l3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, l3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num2);
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
            num = num2;
            list = list3;
            str = str2;
            l = l3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DappDetailReq(i, list, l, num, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DappDetailReq dappDetailReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dappDetailReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DappDetailReq.write$Self$OKDiscover_discover_impl(dappDetailReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
