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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ProtocolDetailsByAccount$$serializer implements GeneratedSerializer<ProtocolDetailsByAccount> {
    public static final int $stable;
    public static final ProtocolDetailsByAccount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ProtocolDetailsByAccount$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ProtocolDetailsByAccount$$serializer protocolDetailsByAccount$$serializer = new ProtocolDetailsByAccount$$serializer();
        INSTANCE = protocolDetailsByAccount$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsByAccount", protocolDetailsByAccount$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("accountId", true);
        pluginGeneratedSerialDescriptor.addElement("investTokenBalanceVoList", true);
        pluginGeneratedSerialDescriptor.addElement("investMarketTokenBalanceVoList", true);
        pluginGeneratedSerialDescriptor.addElement("protocolExtraData", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = ProtocolDetailsByAccount.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, kSerializerArr[1], kSerializerArr[2], BuiltinSerializersKt.getNullable(ProtocolExtraData$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ProtocolDetailsByAccount deserialize(@NotNull Decoder decoder) {
        int i;
        List list;
        ProtocolExtraData protocolExtraData;
        List list2;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ProtocolDetailsByAccount.$childSerializers;
        List list3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            str = strDecodeStringElement;
            protocolExtraData = (ProtocolExtraData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ProtocolExtraData$$serializer.INSTANCE, null);
            list2 = list4;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            ProtocolExtraData protocolExtraData2 = null;
            List list5 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], list5);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], list3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    protocolExtraData2 = (ProtocolExtraData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ProtocolExtraData$$serializer.INSTANCE, protocolExtraData2);
                    i2 |= 8;
                }
            }
            i = i2;
            list = list3;
            protocolExtraData = protocolExtraData2;
            list2 = list5;
            str = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProtocolDetailsByAccount(i, str, list2, list, protocolExtraData, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ProtocolDetailsByAccount protocolDetailsByAccount) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(protocolDetailsByAccount, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ProtocolDetailsByAccount.copydefault(protocolDetailsByAccount, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
