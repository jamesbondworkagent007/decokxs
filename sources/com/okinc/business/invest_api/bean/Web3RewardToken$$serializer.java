package com.okinc.business.invest_api.bean;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class Web3RewardToken$$serializer implements GeneratedSerializer<Web3RewardToken> {
    public static final int $stable;
    public static final Web3RewardToken$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Web3RewardToken$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Web3RewardToken$$serializer web3RewardToken$$serializer = new Web3RewardToken$$serializer();
        INSTANCE = web3RewardToken$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_api.bean.Web3RewardToken", web3RewardToken$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("network", true);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", true);
        pluginGeneratedSerialDescriptor.addElement("apy", true);
        pluginGeneratedSerialDescriptor.addElement("totalTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("pendingTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("decimal", true);
        pluginGeneratedSerialDescriptor.addElement("pendingCurrencyAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Web3RewardToken deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l;
        String str6;
        String str7;
        String str8;
        String str9;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        String str10 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            str2 = str17;
            str3 = str16;
            str4 = str15;
            l = l2;
            str7 = str14;
            i = 511;
            str5 = str13;
            str8 = str11;
            str6 = str12;
        } else {
            int i5 = 0;
            boolean z = true;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            Long l3 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str9 = str23;
                        z = false;
                        str23 = str9;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 0:
                        str9 = str23;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str24);
                        i5 |= 1;
                        str23 = str9;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 1:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str23);
                        i5 |= 2;
                        str9 = str23;
                        str23 = str9;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 2:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str10);
                        i5 |= 4;
                        str9 = str23;
                        str23 = str9;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 3:
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, l3);
                        i5 |= 8;
                        str9 = str23;
                        str23 = str9;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 4:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str18);
                        i5 |= 16;
                        str9 = str23;
                        str23 = str9;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 5:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str20);
                        i5 |= 32;
                        break;
                    case 6:
                        i5 |= 64;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str19);
                        str9 = str23;
                        str23 = str9;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 7:
                        i5 |= 128;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str22);
                        str9 = str23;
                        str23 = str9;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 8:
                        i5 |= 256;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str21);
                        str9 = str23;
                        str23 = str9;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            str = str21;
            str2 = str22;
            str3 = str19;
            str4 = str20;
            str5 = str10;
            l = l3;
            str6 = str23;
            str7 = str18;
            str8 = str24;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Web3RewardToken(i, str8, str6, str5, l, str7, str4, str3, str2, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Web3RewardToken web3RewardToken) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(web3RewardToken, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Web3RewardToken.OLrzqt(web3RewardToken, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
