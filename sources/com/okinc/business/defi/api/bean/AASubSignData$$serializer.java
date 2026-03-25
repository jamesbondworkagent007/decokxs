package com.okinc.business.defi.api.bean;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AASubSignData$$serializer implements GeneratedSerializer<AASubSignData> {
    public static final int $stable;
    public static final AASubSignData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AASubSignData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AASubSignData$$serializer aASubSignData$$serializer = new AASubSignData$$serializer();
        INSTANCE = aASubSignData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.api.bean.AASubSignData", aASubSignData$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("to", true);
        pluginGeneratedSerialDescriptor.addElement("value", true);
        pluginGeneratedSerialDescriptor.addElement("data", true);
        pluginGeneratedSerialDescriptor.addElement("isErc20Approval", true);
        pluginGeneratedSerialDescriptor.addElement("minErc20ApprovalAmount", true);
        pluginGeneratedSerialDescriptor.addElement("fromToken", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = AASubSignData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[5]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AASubSignData deserialize(@NotNull Decoder decoder) {
        List list;
        String str;
        String str2;
        String str3;
        boolean z;
        String str4;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AASubSignData.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            str3 = strDecodeStringElement;
            z = zDecodeBooleanElement;
            str = str5;
            str4 = strDecodeStringElement3;
            i = 63;
            str2 = strDecodeStringElement2;
        } else {
            String strDecodeStringElement4 = null;
            List list2 = null;
            String str6 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            boolean zDecodeBooleanElement2 = false;
            int i2 = 0;
            boolean z2 = true;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        i2 |= 2;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        break;
                    case 2:
                        i2 |= 4;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        i2 |= 16;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str6);
                        break;
                    case 5:
                        i2 |= 32;
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], list2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list2;
            str = str6;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            z = zDecodeBooleanElement2;
            str4 = strDecodeStringElement4;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AASubSignData(i, str3, str2, str4, z, str, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AASubSignData aASubSignData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(aASubSignData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AASubSignData.write$Self$OKWallet_wallet_api(aASubSignData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
