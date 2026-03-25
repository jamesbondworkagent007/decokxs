package com.okinc.unify_trade.biz.subscribe;

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

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class SpreadArbitrageData$$serializer implements GeneratedSerializer<SpreadArbitrageData> {
    public static final int $stable;
    public static final SpreadArbitrageData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SpreadArbitrageData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SpreadArbitrageData$$serializer spreadArbitrageData$$serializer = new SpreadArbitrageData$$serializer();
        INSTANCE = spreadArbitrageData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.subscribe.SpreadArbitrageData", spreadArbitrageData$$serializer, 24);
        pluginGeneratedSerialDescriptor.addElement("arbitrageId", true);
        pluginGeneratedSerialDescriptor.addElement("buyInstId", true);
        pluginGeneratedSerialDescriptor.addElement("sellInstId", true);
        pluginGeneratedSerialDescriptor.addElement("buyInstType", true);
        pluginGeneratedSerialDescriptor.addElement("sellInstType", true);
        pluginGeneratedSerialDescriptor.addElement("buyInstAlias", true);
        pluginGeneratedSerialDescriptor.addElement("sellInstAlias", true);
        pluginGeneratedSerialDescriptor.addElement("apy", true);
        pluginGeneratedSerialDescriptor.addElement("spread", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("uly", true);
        pluginGeneratedSerialDescriptor.addElement("state", true);
        pluginGeneratedSerialDescriptor.addElement("ts", true);
        pluginGeneratedSerialDescriptor.addElement("isShow", true);
        pluginGeneratedSerialDescriptor.addElement("isSearchVisible", true);
        pluginGeneratedSerialDescriptor.addElement("ccy", true);
        pluginGeneratedSerialDescriptor.addElement("yieldPer10K", true);
        pluginGeneratedSerialDescriptor.addElement("duration", true);
        pluginGeneratedSerialDescriptor.addElement("notionalUsd", true);
        pluginGeneratedSerialDescriptor.addElement("groupType", true);
        pluginGeneratedSerialDescriptor.addElement("ctType", true);
        pluginGeneratedSerialDescriptor.addElement("arbitrageType", true);
        pluginGeneratedSerialDescriptor.addElement("ccyType", true);
        pluginGeneratedSerialDescriptor.addElement("instFamily", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SpreadArbitrageData deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        boolean z;
        String str11;
        boolean zDecodeBooleanElement;
        String str12;
        String str13;
        int i;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        int i2;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
            String str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            String str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            String str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, stringSerializer, null);
            String str50 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, stringSerializer, null);
            String str51 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, stringSerializer, null);
            str15 = str49;
            str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, stringSerializer, null);
            str8 = str35;
            str12 = str34;
            str16 = str50;
            str11 = str51;
            z = zDecodeBooleanElement2;
            str18 = strDecodeStringElement;
            str13 = str48;
            str17 = str36;
            str2 = str42;
            str = str41;
            str19 = str39;
            str10 = str38;
            str21 = str40;
            str14 = str47;
            i = 16777215;
            str3 = str43;
            str9 = str37;
            str6 = str46;
            str4 = str44;
            str5 = str45;
        } else {
            String str52 = null;
            int i3 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            boolean z2 = true;
            String str53 = null;
            String str54 = null;
            String str55 = null;
            String str56 = null;
            String str57 = null;
            String str58 = null;
            String str59 = null;
            String str60 = null;
            String str61 = null;
            String str62 = null;
            String str63 = null;
            String str64 = null;
            String strDecodeStringElement2 = null;
            String str65 = null;
            String str66 = null;
            String str67 = null;
            String str68 = null;
            String str69 = null;
            String str70 = null;
            String str71 = null;
            String str72 = null;
            while (z2) {
                String str73 = str55;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str24 = str53;
                        str25 = str54;
                        str26 = str65;
                        str27 = str66;
                        str28 = str67;
                        str29 = str68;
                        str30 = str69;
                        str31 = str70;
                        str32 = str71;
                        str33 = str73;
                        z2 = false;
                        str55 = str33;
                        str71 = str32;
                        str70 = str31;
                        str69 = str30;
                        str68 = str29;
                        str67 = str28;
                        str65 = str26;
                        str66 = str27;
                        str54 = str25;
                        str53 = str24;
                        break;
                    case 0:
                        str24 = str53;
                        str25 = str54;
                        str26 = str65;
                        str27 = str66;
                        str28 = str67;
                        str29 = str68;
                        str30 = str69;
                        str31 = str70;
                        str33 = str73;
                        str32 = str71;
                        str72 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str72);
                        i3 |= 1;
                        str55 = str33;
                        str71 = str32;
                        str70 = str31;
                        str69 = str30;
                        str68 = str29;
                        str67 = str28;
                        str65 = str26;
                        str66 = str27;
                        str54 = str25;
                        str53 = str24;
                        break;
                    case 1:
                        str24 = str53;
                        str25 = str54;
                        str26 = str65;
                        str27 = str66;
                        str28 = str67;
                        str29 = str68;
                        str30 = str69;
                        str33 = str73;
                        str31 = str70;
                        str71 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str71);
                        i3 |= 2;
                        str32 = str71;
                        str55 = str33;
                        str71 = str32;
                        str70 = str31;
                        str69 = str30;
                        str68 = str29;
                        str67 = str28;
                        str65 = str26;
                        str66 = str27;
                        str54 = str25;
                        str53 = str24;
                        break;
                    case 2:
                        str24 = str53;
                        str25 = str54;
                        str26 = str65;
                        str27 = str66;
                        str28 = str67;
                        str29 = str68;
                        str33 = str73;
                        str30 = str69;
                        str70 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str70);
                        i3 |= 4;
                        str31 = str70;
                        str32 = str71;
                        str55 = str33;
                        str71 = str32;
                        str70 = str31;
                        str69 = str30;
                        str68 = str29;
                        str67 = str28;
                        str65 = str26;
                        str66 = str27;
                        str54 = str25;
                        str53 = str24;
                        break;
                    case 3:
                        str24 = str53;
                        str25 = str54;
                        str26 = str65;
                        str27 = str66;
                        str28 = str67;
                        str33 = str73;
                        str29 = str68;
                        str69 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str69);
                        i3 |= 8;
                        str30 = str69;
                        str31 = str70;
                        str32 = str71;
                        str55 = str33;
                        str71 = str32;
                        str70 = str31;
                        str69 = str30;
                        str68 = str29;
                        str67 = str28;
                        str65 = str26;
                        str66 = str27;
                        str54 = str25;
                        str53 = str24;
                        break;
                    case 4:
                        str24 = str53;
                        str25 = str54;
                        str26 = str65;
                        str27 = str66;
                        str33 = str73;
                        str28 = str67;
                        str68 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str68);
                        i3 |= 16;
                        str29 = str68;
                        str30 = str69;
                        str31 = str70;
                        str32 = str71;
                        str55 = str33;
                        str71 = str32;
                        str70 = str31;
                        str69 = str30;
                        str68 = str29;
                        str67 = str28;
                        str65 = str26;
                        str66 = str27;
                        str54 = str25;
                        str53 = str24;
                        break;
                    case 5:
                        str24 = str53;
                        str25 = str54;
                        str27 = str66;
                        str33 = str73;
                        str26 = str65;
                        str67 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str67);
                        i3 |= 32;
                        str28 = str67;
                        str29 = str68;
                        str30 = str69;
                        str31 = str70;
                        str32 = str71;
                        str55 = str33;
                        str71 = str32;
                        str70 = str31;
                        str69 = str30;
                        str68 = str29;
                        str67 = str28;
                        str65 = str26;
                        str66 = str27;
                        str54 = str25;
                        str53 = str24;
                        break;
                    case 6:
                        str24 = str53;
                        str25 = str54;
                        str33 = str73;
                        str27 = str66;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str65);
                        i3 |= 64;
                        str28 = str67;
                        str29 = str68;
                        str30 = str69;
                        str31 = str70;
                        str32 = str71;
                        str55 = str33;
                        str71 = str32;
                        str70 = str31;
                        str69 = str30;
                        str68 = str29;
                        str67 = str28;
                        str65 = str26;
                        str66 = str27;
                        str54 = str25;
                        str53 = str24;
                        break;
                    case 7:
                        str24 = str53;
                        str25 = str54;
                        str33 = str73;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str66);
                        i3 |= 128;
                        str26 = str65;
                        str28 = str67;
                        str29 = str68;
                        str30 = str69;
                        str31 = str70;
                        str32 = str71;
                        str55 = str33;
                        str71 = str32;
                        str70 = str31;
                        str69 = str30;
                        str68 = str29;
                        str67 = str28;
                        str65 = str26;
                        str66 = str27;
                        str54 = str25;
                        str53 = str24;
                        break;
                    case 8:
                        str24 = str53;
                        str25 = str54;
                        i3 |= 256;
                        str55 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str73);
                        str26 = str65;
                        str27 = str66;
                        str28 = str67;
                        str29 = str68;
                        str30 = str69;
                        str31 = str70;
                        str32 = str71;
                        str71 = str32;
                        str70 = str31;
                        str69 = str30;
                        str68 = str29;
                        str67 = str28;
                        str65 = str26;
                        str66 = str27;
                        str54 = str25;
                        str53 = str24;
                        break;
                    case 9:
                        str56 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str56);
                        i3 |= 512;
                        str53 = str53;
                        str55 = str73;
                        break;
                    case 10:
                        str23 = str56;
                        i3 |= 1024;
                        str58 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str58);
                        str55 = str73;
                        str56 = str23;
                        break;
                    case 11:
                        str23 = str56;
                        i3 |= 2048;
                        str59 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str59);
                        str55 = str73;
                        str56 = str23;
                        break;
                    case 12:
                        str23 = str56;
                        i3 |= 4096;
                        str52 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str52);
                        str55 = str73;
                        str56 = str23;
                        break;
                    case 13:
                        str23 = str56;
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
                        i3 |= 8192;
                        str55 = str73;
                        str56 = str23;
                        break;
                    case 14:
                        str23 = str56;
                        i3 |= 16384;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
                        str55 = str73;
                        str56 = str23;
                        break;
                    case 15:
                        str23 = str56;
                        str60 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str60);
                        i2 = 32768;
                        i3 = i2 | i3;
                        str55 = str73;
                        str56 = str23;
                        break;
                    case 16:
                        str23 = str56;
                        str61 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str61);
                        i2 = 65536;
                        i3 = i2 | i3;
                        str55 = str73;
                        str56 = str23;
                        break;
                    case 17:
                        str23 = str56;
                        str62 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, str62);
                        i2 = 131072;
                        i3 = i2 | i3;
                        str55 = str73;
                        str56 = str23;
                        break;
                    case 18:
                        str23 = str56;
                        str57 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, str57);
                        i2 = 262144;
                        i3 = i2 | i3;
                        str55 = str73;
                        str56 = str23;
                        break;
                    case 19:
                        str23 = str56;
                        i3 |= 524288;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        str55 = str73;
                        str56 = str23;
                        break;
                    case 20:
                        str23 = str56;
                        str63 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, str63);
                        i2 = 1048576;
                        i3 = i2 | i3;
                        str55 = str73;
                        str56 = str23;
                        break;
                    case 21:
                        str23 = str56;
                        str64 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, str64);
                        i2 = 2097152;
                        i3 = i2 | i3;
                        str55 = str73;
                        str56 = str23;
                        break;
                    case 22:
                        str23 = str56;
                        str54 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, str54);
                        i2 = 4194304;
                        i3 = i2 | i3;
                        str55 = str73;
                        str56 = str23;
                        break;
                    case 23:
                        str23 = str56;
                        str53 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, str53);
                        i2 = 8388608;
                        i3 = i2 | i3;
                        str55 = str73;
                        str56 = str23;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str56;
            str2 = str58;
            str3 = str59;
            str4 = str52;
            str5 = str60;
            str6 = str61;
            str7 = str71;
            str8 = str70;
            str9 = str68;
            str10 = str67;
            z = zDecodeBooleanElement3;
            str11 = str54;
            zDecodeBooleanElement = zDecodeBooleanElement4;
            str12 = str72;
            str13 = str57;
            i = i3;
            str14 = str62;
            str15 = str63;
            str16 = str64;
            str17 = str69;
            str18 = strDecodeStringElement2;
            str19 = str65;
            str20 = str66;
            str21 = str55;
            str22 = str53;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SpreadArbitrageData(i, str12, str7, str8, str17, str9, str10, str19, str20, str21, str, str2, str3, str4, z, zDecodeBooleanElement, str5, str6, str14, str13, str18, str15, str16, str11, str22, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SpreadArbitrageData spreadArbitrageData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(spreadArbitrageData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SpreadArbitrageData.write$Self$OKTradeCore_trade_core(spreadArbitrageData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
