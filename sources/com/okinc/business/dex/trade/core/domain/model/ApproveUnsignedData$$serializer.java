package com.okinc.business.dex.trade.core.domain.model;

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

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ApproveUnsignedData$$serializer implements GeneratedSerializer<ApproveUnsignedData> {
    public static final int $stable;
    public static final ApproveUnsignedData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ApproveUnsignedData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ApproveUnsignedData$$serializer approveUnsignedData$$serializer = new ApproveUnsignedData$$serializer();
        INSTANCE = approveUnsignedData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.core.domain.model.ApproveUnsignedData", approveUnsignedData$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("data", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("nonce", true);
        pluginGeneratedSerialDescriptor.addElement("dexContractAddress", true);
        pluginGeneratedSerialDescriptor.addElement("unsignedTx", true);
        pluginGeneratedSerialDescriptor.addElement("gas", true);
        pluginGeneratedSerialDescriptor.addElement("maxPriorityFeePerGas", true);
        pluginGeneratedSerialDescriptor.addElement("from", true);
        pluginGeneratedSerialDescriptor.addElement("to", true);
        pluginGeneratedSerialDescriptor.addElement("maxFeePerGas", true);
        pluginGeneratedSerialDescriptor.addElement("value", true);
        pluginGeneratedSerialDescriptor.addElement("approveGasLimitCoefficient", true);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ApproveUnsignedData deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Long l;
        String str10;
        Integer num;
        String str11;
        String str12;
        int i;
        String str13;
        String str14;
        Long l2;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            num = num2;
            str = str28;
            str5 = str27;
            str9 = str25;
            l = l3;
            str2 = str24;
            str11 = str23;
            str4 = str26;
            str6 = str29;
            str8 = str30;
            str10 = str21;
            str12 = str20;
            str3 = str22;
            i = 16383;
        } else {
            int i4 = 13;
            String str31 = null;
            String str32 = null;
            String str33 = null;
            String str34 = null;
            String str35 = null;
            String str36 = null;
            Integer num3 = null;
            String str37 = null;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            boolean z = true;
            int i5 = 0;
            Long l4 = null;
            String str42 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        l2 = l4;
                        str15 = str37;
                        str16 = str38;
                        str17 = str39;
                        str18 = str41;
                        str19 = str40;
                        z = false;
                        str39 = str17;
                        str37 = str15;
                        str38 = str16;
                        l4 = l2;
                        str40 = str19;
                        i2 = 10;
                        i3 = 9;
                        str41 = str18;
                        i4 = 13;
                        break;
                    case 0:
                        l2 = l4;
                        str15 = str37;
                        str16 = str38;
                        str17 = str39;
                        String str43 = str41;
                        str19 = str40;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str43);
                        i5 |= 1;
                        str39 = str17;
                        str37 = str15;
                        str38 = str16;
                        l4 = l2;
                        str40 = str19;
                        i2 = 10;
                        i3 = 9;
                        str41 = str18;
                        i4 = 13;
                        break;
                    case 1:
                        l2 = l4;
                        str15 = str37;
                        str17 = str39;
                        str16 = str38;
                        i5 |= 2;
                        str18 = str41;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str40);
                        str39 = str17;
                        str37 = str15;
                        str38 = str16;
                        l4 = l2;
                        str40 = str19;
                        i2 = 10;
                        i3 = 9;
                        str41 = str18;
                        i4 = 13;
                        break;
                    case 2:
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str37);
                        i5 |= 4;
                        l4 = l4;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 3:
                        str13 = str38;
                        str14 = str39;
                        i5 |= 8;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num3);
                        str38 = str13;
                        str39 = str14;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 4:
                        str13 = str38;
                        str14 = str39;
                        i5 |= 16;
                        str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str42);
                        str38 = str13;
                        str39 = str14;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 5:
                        str13 = str38;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str39);
                        i5 |= 32;
                        str38 = str13;
                        str39 = str14;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 6:
                        str13 = str38;
                        l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, l4);
                        i5 |= 64;
                        str14 = str39;
                        str38 = str13;
                        str39 = str14;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 7:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str38);
                        i5 |= 128;
                        str14 = str39;
                        str38 = str13;
                        str39 = str14;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 8:
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str32);
                        i5 |= 256;
                        str13 = str38;
                        str14 = str39;
                        str38 = str13;
                        str39 = str14;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 9:
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str33);
                        i5 |= 512;
                        str13 = str38;
                        str14 = str39;
                        str38 = str13;
                        str39 = str14;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 10:
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str31);
                        i5 |= 1024;
                        str13 = str38;
                        str14 = str39;
                        str38 = str13;
                        str39 = str14;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 11:
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str34);
                        i5 |= 2048;
                        str13 = str38;
                        str14 = str39;
                        str38 = str13;
                        str39 = str14;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 12:
                        i5 |= 4096;
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str36);
                        str13 = str38;
                        str14 = str39;
                        str38 = str13;
                        str39 = str14;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 13:
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str35);
                        i5 |= 8192;
                        str13 = str38;
                        str14 = str39;
                        str38 = str13;
                        str39 = str14;
                        i4 = 13;
                        i2 = 10;
                        i3 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str44 = str37;
            String str45 = str38;
            String str46 = str41;
            String str47 = str40;
            str = str31;
            str2 = str39;
            str3 = str44;
            str4 = str32;
            str5 = str33;
            str6 = str34;
            str7 = str35;
            str8 = str36;
            str9 = str45;
            l = l4;
            str10 = str47;
            num = num3;
            str11 = str42;
            str12 = str46;
            i = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ApproveUnsignedData(i, str12, str10, str3, num, str11, str2, l, str9, str4, str5, str, str6, str8, str7, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ApproveUnsignedData approveUnsignedData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(approveUnsignedData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ApproveUnsignedData.write$Self$OKDex_dex_impl(approveUnsignedData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
