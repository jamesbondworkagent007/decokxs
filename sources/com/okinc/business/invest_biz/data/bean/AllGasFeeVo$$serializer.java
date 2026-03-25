package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class AllGasFeeVo$$serializer implements GeneratedSerializer<AllGasFeeVo> {
    public static final int $stable;
    public static final AllGasFeeVo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AllGasFeeVo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AllGasFeeVo$$serializer allGasFeeVo$$serializer = new AllGasFeeVo$$serializer();
        INSTANCE = allGasFeeVo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.AllGasFeeVo", allGasFeeVo$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("allGasFee", true);
        pluginGeneratedSerialDescriptor.addElement("allGasFeeAmount", true);
        pluginGeneratedSerialDescriptor.addElement("errorMessage", true);
        pluginGeneratedSerialDescriptor.addElement("gasLimit", true);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", true);
        pluginGeneratedSerialDescriptor.addElement("l1GasFee", true);
        pluginGeneratedSerialDescriptor.addElement("originGasLimit", true);
        pluginGeneratedSerialDescriptor.addElement("queryGasLimitErrorUseDefault", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AllGasFeeVo deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        int i;
        String str5;
        String str6;
        String str7;
        String str8;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        String str9 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, null);
            i = 255;
            str4 = str15;
            str2 = str13;
            str = str14;
            str7 = str12;
            str6 = str10;
            str5 = str11;
        } else {
            int i5 = 0;
            boolean z = true;
            String str16 = null;
            String str17 = null;
            Boolean bool2 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str8 = str20;
                        z = false;
                        str20 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 0:
                        str8 = str20;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str21);
                        i5 |= 1;
                        str20 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 1:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str20);
                        i5 |= 2;
                        str20 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 2:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str9);
                        i5 |= 4;
                        str8 = str20;
                        str20 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 3:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str17);
                        i5 |= 8;
                        break;
                    case 4:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str16);
                        i5 |= 16;
                        str8 = str20;
                        str20 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 5:
                        i5 |= 32;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str19);
                        str8 = str20;
                        str20 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 6:
                        i5 |= 64;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str18);
                        str8 = str20;
                        str20 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 7:
                        i5 |= 128;
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.INSTANCE, bool2);
                        str8 = str20;
                        str20 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str22 = str20;
            String str23 = str21;
            str = str16;
            str2 = str17;
            bool = bool2;
            str3 = str18;
            str4 = str19;
            i = i5;
            str5 = str22;
            str6 = str23;
            str7 = str9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AllGasFeeVo(i, str6, str5, str7, str2, str, str4, str3, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AllGasFeeVo allGasFeeVo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(allGasFeeVo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AllGasFeeVo.OLrzqt(allGasFeeVo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
