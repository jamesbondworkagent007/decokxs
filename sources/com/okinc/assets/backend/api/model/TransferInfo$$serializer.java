package com.okinc.assets.backend.api.model;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class TransferInfo$$serializer implements GeneratedSerializer<TransferInfo> {
    public static final int $stable;
    public static final TransferInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TransferInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TransferInfo$$serializer transferInfo$$serializer = new TransferInfo$$serializer();
        INSTANCE = transferInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.assets.backend.api.model.TransferInfo", transferInfo$$serializer, 21);
        pluginGeneratedSerialDescriptor.addElement("hold", true);
        pluginGeneratedSerialDescriptor.addElement("isTimeCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("kycLevel", true);
        pluginGeneratedSerialDescriptor.addElement("limit", true);
        pluginGeneratedSerialDescriptor.addElement("max", true);
        pluginGeneratedSerialDescriptor.addElement("min", true);
        pluginGeneratedSerialDescriptor.addElement("used", true);
        pluginGeneratedSerialDescriptor.addElement("c2cHoldAmount", true);
        pluginGeneratedSerialDescriptor.addElement("maxWdEx", true);
        pluginGeneratedSerialDescriptor.addElement("isBorrow", false);
        pluginGeneratedSerialDescriptor.addElement("spotOffsetMaxWd", true);
        pluginGeneratedSerialDescriptor.addElement("spotOffsetMaxWdEx", true);
        pluginGeneratedSerialDescriptor.addElement("portfolioSpotRiskOffset", true);
        pluginGeneratedSerialDescriptor.addElement("inUse", true);
        pluginGeneratedSerialDescriptor.addElement("spotInUseAmt", true);
        pluginGeneratedSerialDescriptor.addElement("pm3Whitelisted", true);
        pluginGeneratedSerialDescriptor.addElement("acctLv", true);
        pluginGeneratedSerialDescriptor.addElement("autoEarnEnabled", true);
        pluginGeneratedSerialDescriptor.addElement("autoEarnSupported", true);
        pluginGeneratedSerialDescriptor.addElement("cedefiAccountExist", true);
        pluginGeneratedSerialDescriptor.addElement("borrowLimitReason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, BuiltinSerializersKt.getNullable(intSerializer), doubleSerializer, stringSerializer, doubleSerializer, doubleSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TransferInfo deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        Boolean bool2;
        String str;
        String str2;
        Boolean bool3;
        String str3;
        String str4;
        boolean z;
        Integer num;
        String str5;
        String str6;
        Boolean bool4;
        double d;
        double d2;
        double d3;
        String str7;
        String str8;
        boolean z2;
        Integer num2;
        String str9;
        String str10;
        int i;
        Integer num3;
        int i2;
        Integer num4;
        Boolean bool5;
        String str11;
        Boolean bool6;
        Integer num5;
        String str12;
        Integer num6;
        Boolean bool7;
        Boolean bool8;
        String str13;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, intSerializer, null);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 3);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            double dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 5);
            double dDecodeDoubleElement3 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 6);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
            Integer num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, intSerializer, null);
            Boolean bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, booleanSerializer, null);
            Boolean bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, booleanSerializer, null);
            Boolean bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, booleanSerializer, null);
            str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, stringSerializer, null);
            bool4 = bool12;
            z = zDecodeBooleanElement;
            bool3 = bool10;
            bool2 = bool11;
            num2 = num8;
            z2 = zDecodeBooleanElement2;
            str = str20;
            str10 = str19;
            d = dDecodeDoubleElement;
            d2 = dDecodeDoubleElement2;
            str9 = strDecodeStringElement;
            str2 = str15;
            num = num7;
            str6 = str16;
            bool = bool9;
            str5 = strDecodeStringElement2;
            d3 = dDecodeDoubleElement3;
            str3 = str17;
            str4 = str18;
            i = 2097151;
            str7 = str14;
        } else {
            int i3 = 20;
            int i4 = 0;
            boolean z3 = true;
            Integer num9 = null;
            Boolean bool13 = null;
            Boolean bool14 = null;
            String str21 = null;
            String str22 = null;
            Boolean bool15 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            String strDecodeStringElement3 = null;
            Integer num10 = null;
            String str26 = null;
            String strDecodeStringElement4 = null;
            Boolean bool16 = null;
            String str27 = null;
            double dDecodeDoubleElement4 = 0.0d;
            double dDecodeDoubleElement5 = 0.0d;
            double dDecodeDoubleElement6 = 0.0d;
            boolean zDecodeBooleanElement3 = false;
            String str28 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        num4 = num9;
                        bool5 = bool16;
                        str11 = str27;
                        bool6 = bool13;
                        String str29 = str26;
                        num5 = num10;
                        z3 = false;
                        str12 = str29;
                        num9 = num4;
                        num10 = num5;
                        bool13 = bool6;
                        str26 = str12;
                        str27 = str11;
                        i3 = 20;
                        bool16 = bool5;
                        break;
                    case 0:
                        num4 = num9;
                        bool5 = bool16;
                        str11 = str27;
                        bool6 = bool13;
                        String str30 = str26;
                        num5 = num10;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str30);
                        i4 |= 1;
                        num9 = num4;
                        num10 = num5;
                        bool13 = bool6;
                        str26 = str12;
                        str27 = str11;
                        i3 = 20;
                        bool16 = bool5;
                        break;
                    case 1:
                        num4 = num9;
                        bool5 = bool16;
                        str11 = str27;
                        bool6 = bool13;
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i4 |= 2;
                        str12 = str26;
                        num5 = num10;
                        num9 = num4;
                        num10 = num5;
                        bool13 = bool6;
                        str26 = str12;
                        str27 = str11;
                        i3 = 20;
                        bool16 = bool5;
                        break;
                    case 2:
                        num4 = num9;
                        String str31 = str27;
                        bool6 = bool13;
                        Boolean bool17 = bool16;
                        str11 = str31;
                        bool5 = bool17;
                        i4 |= 4;
                        String str32 = str26;
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num10);
                        str12 = str32;
                        num9 = num4;
                        num10 = num5;
                        bool13 = bool6;
                        str26 = str12;
                        str27 = str11;
                        i3 = 20;
                        bool16 = bool5;
                        break;
                    case 3:
                        num6 = num9;
                        String str33 = str27;
                        bool7 = bool13;
                        bool8 = bool16;
                        str13 = str33;
                        dDecodeDoubleElement4 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 3);
                        i4 |= 8;
                        num9 = num6;
                        i3 = 20;
                        String str34 = str13;
                        bool16 = bool8;
                        bool13 = bool7;
                        str27 = str34;
                        break;
                    case 4:
                        num6 = num9;
                        String str35 = str27;
                        bool7 = bool13;
                        bool8 = bool16;
                        str13 = str35;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 |= 16;
                        num9 = num6;
                        i3 = 20;
                        String str342 = str13;
                        bool16 = bool8;
                        bool13 = bool7;
                        str27 = str342;
                        break;
                    case 5:
                        num6 = num9;
                        String str36 = str27;
                        bool7 = bool13;
                        bool8 = bool16;
                        str13 = str36;
                        dDecodeDoubleElement5 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 5);
                        i4 |= 32;
                        num9 = num6;
                        i3 = 20;
                        String str3422 = str13;
                        bool16 = bool8;
                        bool13 = bool7;
                        str27 = str3422;
                        break;
                    case 6:
                        num6 = num9;
                        String str37 = str27;
                        bool7 = bool13;
                        bool8 = bool16;
                        str13 = str37;
                        dDecodeDoubleElement6 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 6);
                        i4 |= 64;
                        num9 = num6;
                        i3 = 20;
                        String str34222 = str13;
                        bool16 = bool8;
                        bool13 = bool7;
                        str27 = str34222;
                        break;
                    case 7:
                        num6 = num9;
                        String str38 = str27;
                        bool7 = bool13;
                        bool8 = bool16;
                        str13 = str38;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i4 |= 128;
                        num9 = num6;
                        i3 = 20;
                        String str342222 = str13;
                        bool16 = bool8;
                        bool13 = bool7;
                        str27 = str342222;
                        break;
                    case 8:
                        num6 = num9;
                        String str39 = str27;
                        bool7 = bool13;
                        bool8 = bool16;
                        str13 = str39;
                        i4 |= 256;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str22);
                        num9 = num6;
                        i3 = 20;
                        String str3422222 = str13;
                        bool16 = bool8;
                        bool13 = bool7;
                        str27 = str3422222;
                        break;
                    case 9:
                        num3 = num9;
                        i4 |= 512;
                        bool13 = bool13;
                        str27 = str27;
                        bool16 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, bool16);
                        num9 = num3;
                        i3 = 20;
                        break;
                    case 10:
                        num3 = num9;
                        i4 |= 1024;
                        bool13 = bool13;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str27);
                        num9 = num3;
                        i3 = 20;
                        break;
                    case 11:
                        num3 = num9;
                        i4 |= 2048;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str23);
                        num9 = num3;
                        i3 = 20;
                        break;
                    case 12:
                        num3 = num9;
                        i4 |= 4096;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str25);
                        num9 = num3;
                        i3 = 20;
                        break;
                    case 13:
                        num3 = num9;
                        i4 |= 8192;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str24);
                        num9 = num3;
                        i3 = 20;
                        break;
                    case 14:
                        num3 = num9;
                        i4 |= 16384;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str21);
                        num9 = num3;
                        i3 = 20;
                        break;
                    case 15:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
                        i4 |= 32768;
                        num3 = num9;
                        num9 = num3;
                        i3 = 20;
                        break;
                    case 16:
                        num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.INSTANCE, num9);
                        i2 = 65536;
                        i4 |= i2;
                        num3 = num9;
                        num9 = num3;
                        i3 = 20;
                        break;
                    case 17:
                        bool15 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, BooleanSerializer.INSTANCE, bool15);
                        i2 = 131072;
                        i4 |= i2;
                        num3 = num9;
                        num9 = num3;
                        i3 = 20;
                        break;
                    case 18:
                        bool14 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, bool14);
                        i2 = 262144;
                        i4 |= i2;
                        num3 = num9;
                        num9 = num3;
                        i3 = 20;
                        break;
                    case 19:
                        bool13 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.INSTANCE, bool13);
                        i2 = 524288;
                        i4 |= i2;
                        num3 = num9;
                        num9 = num3;
                        i3 = 20;
                        break;
                    case 20:
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str28);
                        i2 = 1048576;
                        i4 |= i2;
                        num3 = num9;
                        num9 = num3;
                        i3 = 20;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            bool = bool16;
            String str40 = str27;
            Boolean bool18 = bool13;
            String str41 = str26;
            Integer num11 = num10;
            bool2 = bool14;
            str = str21;
            str2 = str22;
            bool3 = bool15;
            str3 = str23;
            str4 = str25;
            z = zDecodeBooleanElement3;
            num = num11;
            str5 = strDecodeStringElement4;
            str6 = str40;
            bool4 = bool18;
            d = dDecodeDoubleElement4;
            d2 = dDecodeDoubleElement5;
            d3 = dDecodeDoubleElement6;
            str7 = str41;
            str8 = str28;
            z2 = zDecodeBooleanElement4;
            num2 = num9;
            str9 = strDecodeStringElement3;
            str10 = str24;
            i = i4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TransferInfo(i, str7, z, num, d, str9, d2, d3, str5, str2, bool, str6, str3, str4, str10, str, z2, num2, bool3, bool2, bool4, str8, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TransferInfo transferInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(transferInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TransferInfo.write$Self$OKAssets_assets_pro_api(transferInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
