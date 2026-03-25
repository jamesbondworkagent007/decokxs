package com.okinc.planet.biz_content.leaderboard.bean;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class SpotlightToken$$serializer implements GeneratedSerializer<SpotlightToken> {
    public static final int $stable;
    public static final SpotlightToken$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SpotlightToken$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SpotlightToken$$serializer spotlightToken$$serializer = new SpotlightToken$$serializer();
        INSTANCE = spotlightToken$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet.biz_content.leaderboard.bean.SpotlightToken", spotlightToken$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("coinName", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("instId", true);
        pluginGeneratedSerialDescriptor.addElement("instType", true);
        pluginGeneratedSerialDescriptor.addElement("tokenContractAddress", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("last", true);
        pluginGeneratedSerialDescriptor.addElement("open24h", true);
        pluginGeneratedSerialDescriptor.addElement("sodUtc0", true);
        pluginGeneratedSerialDescriptor.addElement("sodUtc8", true);
        pluginGeneratedSerialDescriptor.addElement("changeUtc0", true);
        pluginGeneratedSerialDescriptor.addElement("changeUtc8", true);
        pluginGeneratedSerialDescriptor.addElement("change24h", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(stringSerializer);
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, BuiltinSerializersKt.getNullable(doubleSerializer), BuiltinSerializersKt.getNullable(doubleSerializer), BuiltinSerializersKt.getNullable(doubleSerializer), BuiltinSerializersKt.getNullable(doubleSerializer), BuiltinSerializersKt.getNullable(doubleSerializer), BuiltinSerializersKt.getNullable(doubleSerializer), BuiltinSerializersKt.getNullable(doubleSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SpotlightToken deserialize(@NotNull Decoder decoder) {
        Double d;
        Double d2;
        String str;
        String str2;
        Double d3;
        Double d4;
        Double d5;
        Double d6;
        String str3;
        String str4;
        String str5;
        int i;
        Double d7;
        String str6;
        String str7;
        String str8;
        Double d8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Double d9;
        String str14;
        String str15;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        Double d10 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
            Double d11 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, doubleSerializer, null);
            Double d12 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, doubleSerializer, null);
            Double d13 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, doubleSerializer, null);
            Double d14 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, doubleSerializer, null);
            Double d15 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, doubleSerializer, null);
            d7 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, doubleSerializer, null);
            d6 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, doubleSerializer, null);
            d5 = d15;
            d4 = d14;
            d = d13;
            d2 = d11;
            str4 = str21;
            str5 = str19;
            d3 = d12;
            str2 = str20;
            str7 = str16;
            str = str22;
            str3 = str17;
            str6 = str18;
            i = 16383;
        } else {
            int i5 = 13;
            int i6 = 0;
            boolean z = true;
            String str23 = null;
            String str24 = null;
            Double d16 = null;
            Double d17 = null;
            Double d18 = null;
            Double d19 = null;
            Double d20 = null;
            String str25 = null;
            Double d21 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str8 = str25;
                        d8 = d21;
                        str9 = str26;
                        str10 = str27;
                        str11 = str28;
                        str12 = str23;
                        str13 = str24;
                        z = false;
                        d21 = d8;
                        str26 = str9;
                        str27 = str10;
                        str23 = str12;
                        str24 = str13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str25 = str8;
                        str28 = str11;
                        i5 = 13;
                        break;
                    case 0:
                        str8 = str25;
                        d8 = d21;
                        str9 = str26;
                        str10 = str27;
                        str12 = str23;
                        String str30 = str28;
                        str13 = str24;
                        str11 = str30;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str29);
                        i6 |= 1;
                        d21 = d8;
                        str26 = str9;
                        str27 = str10;
                        str23 = str12;
                        str24 = str13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str25 = str8;
                        str28 = str11;
                        i5 = 13;
                        break;
                    case 1:
                        str8 = str25;
                        d8 = d21;
                        str9 = str26;
                        str10 = str27;
                        str12 = str23;
                        String str31 = str28;
                        str13 = str24;
                        i6 |= 2;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str31);
                        d21 = d8;
                        str26 = str9;
                        str27 = str10;
                        str23 = str12;
                        str24 = str13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str25 = str8;
                        str28 = str11;
                        i5 = 13;
                        break;
                    case 2:
                        i6 |= 4;
                        str23 = str23;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str25);
                        break;
                    case 3:
                        d9 = d21;
                        str14 = str26;
                        str15 = str27;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str24);
                        i6 |= 8;
                        d21 = d9;
                        str26 = str14;
                        str27 = str15;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 4:
                        d9 = d21;
                        str14 = str26;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str27);
                        i6 |= 16;
                        d21 = d9;
                        str26 = str14;
                        str27 = str15;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 5:
                        d9 = d21;
                        str14 = str26;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str23);
                        i6 |= 32;
                        str15 = str27;
                        d21 = d9;
                        str26 = str14;
                        str27 = str15;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 6:
                        d9 = d21;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str26);
                        i6 |= 64;
                        str15 = str27;
                        d21 = d9;
                        str26 = str14;
                        str27 = str15;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 7:
                        d9 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, DoubleSerializer.INSTANCE, d21);
                        i6 |= 128;
                        str14 = str26;
                        str15 = str27;
                        d21 = d9;
                        str26 = str14;
                        str27 = str15;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 8:
                        d16 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, DoubleSerializer.INSTANCE, d16);
                        i6 |= 256;
                        d9 = d21;
                        str14 = str26;
                        str15 = str27;
                        d21 = d9;
                        str26 = str14;
                        str27 = str15;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 9:
                        d10 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, DoubleSerializer.INSTANCE, d10);
                        i6 |= 512;
                        d9 = d21;
                        str14 = str26;
                        str15 = str27;
                        d21 = d9;
                        str26 = str14;
                        str27 = str15;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 10:
                        d17 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, DoubleSerializer.INSTANCE, d17);
                        i6 |= 1024;
                        d9 = d21;
                        str14 = str26;
                        str15 = str27;
                        d21 = d9;
                        str26 = str14;
                        str27 = str15;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 11:
                        i6 |= 2048;
                        d19 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, DoubleSerializer.INSTANCE, d19);
                        d9 = d21;
                        str14 = str26;
                        str15 = str27;
                        d21 = d9;
                        str26 = str14;
                        str27 = str15;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 12:
                        d18 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, DoubleSerializer.INSTANCE, d18);
                        i6 |= 4096;
                        d9 = d21;
                        str14 = str26;
                        str15 = str27;
                        d21 = d9;
                        str26 = str14;
                        str27 = str15;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 13:
                        i6 |= 8192;
                        d20 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, DoubleSerializer.INSTANCE, d20);
                        d9 = d21;
                        str14 = str26;
                        str15 = str27;
                        d21 = d9;
                        str26 = str14;
                        str27 = str15;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str32 = str25;
            Double d22 = d21;
            String str33 = str28;
            String str34 = str24;
            String str35 = str29;
            d = d10;
            d2 = d22;
            str = str26;
            str2 = str27;
            d3 = d16;
            d4 = d17;
            d5 = d19;
            d6 = d20;
            str3 = str33;
            str4 = str23;
            str5 = str34;
            i = i6;
            d7 = d18;
            str6 = str32;
            str7 = str35;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SpotlightToken(i, str7, str3, str6, str5, str2, str4, str, d2, d3, d, d4, d5, d7, d6, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SpotlightToken spotlightToken) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(spotlightToken, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SpotlightToken.write$Self$OKPlanet_ok_feature_planet_impl(spotlightToken, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
