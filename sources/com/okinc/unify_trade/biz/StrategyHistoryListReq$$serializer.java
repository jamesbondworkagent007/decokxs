package com.okinc.unify_trade.biz;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class StrategyHistoryListReq$$serializer implements GeneratedSerializer<StrategyHistoryListReq> {
    public static final int $stable;
    public static final StrategyHistoryListReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private StrategyHistoryListReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        StrategyHistoryListReq$$serializer strategyHistoryListReq$$serializer = new StrategyHistoryListReq$$serializer();
        INSTANCE = strategyHistoryListReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.StrategyHistoryListReq", strategyHistoryListReq$$serializer, 25);
        pluginGeneratedSerialDescriptor.addElement("algoId", true);
        pluginGeneratedSerialDescriptor.addElement("instType", true);
        pluginGeneratedSerialDescriptor.addElement("instId", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.RUBY_AFTER, true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.RUBY_BEFORE, true);
        pluginGeneratedSerialDescriptor.addElement("limit", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.START, true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.END, true);
        pluginGeneratedSerialDescriptor.addElement("tdMode", true);
        pluginGeneratedSerialDescriptor.addElement("instDirection", true);
        pluginGeneratedSerialDescriptor.addElement("posOrSide", true);
        pluginGeneratedSerialDescriptor.addElement("referName", true);
        pluginGeneratedSerialDescriptor.addElement("sortType", true);
        pluginGeneratedSerialDescriptor.addElement("source", true);
        pluginGeneratedSerialDescriptor.addElement("ordType", true);
        pluginGeneratedSerialDescriptor.addElement("tradeId", true);
        pluginGeneratedSerialDescriptor.addElement("tradeSide", true);
        pluginGeneratedSerialDescriptor.addElement("isCurrentPair", true);
        pluginGeneratedSerialDescriptor.addElement("isSms", true);
        pluginGeneratedSerialDescriptor.addElement("systemSource", true);
        pluginGeneratedSerialDescriptor.addElement("requireProfits", true);
        pluginGeneratedSerialDescriptor.addElement("baseCoins", true);
        pluginGeneratedSerialDescriptor.addElement("sortOrder", true);
        pluginGeneratedSerialDescriptor.addElement("nmpUnderlyingIds", true);
        pluginGeneratedSerialDescriptor.addElement("state", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final StrategyHistoryListReq deserialize(@NotNull Decoder decoder) {
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
        String str11;
        String str12;
        String str13;
        int i;
        String str14;
        String str15;
        boolean z;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        boolean z2;
        String str22;
        boolean z3;
        String str23;
        String str24;
        String str25;
        int i2;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        String str35;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str50 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 17);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
            String str51 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 20);
            String str52 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, stringSerializer, null);
            String str53 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, stringSerializer, null);
            String str54 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, stringSerializer, null);
            str20 = str51;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, stringSerializer, null);
            z2 = zDecodeBooleanElement;
            z = zDecodeBooleanElement3;
            z3 = zDecodeBooleanElement2;
            str15 = str52;
            str11 = str53;
            str13 = str54;
            str8 = str42;
            str19 = str50;
            str18 = strDecodeStringElement2;
            str14 = str49;
            str17 = str40;
            str2 = str46;
            str9 = str43;
            str6 = str37;
            str4 = str48;
            str7 = str41;
            str21 = str39;
            str22 = strDecodeStringElement;
            str5 = str47;
            str12 = str36;
            i = 33554431;
            str3 = str45;
            str16 = str38;
            str10 = str44;
        } else {
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
            String str65 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str66 = null;
            String str67 = null;
            String str68 = null;
            String str69 = null;
            String str70 = null;
            String str71 = null;
            String str72 = null;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            boolean z4 = true;
            String str73 = null;
            int i3 = 0;
            String str74 = null;
            while (z4) {
                String str75 = str74;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str26 = str55;
                        str27 = str73;
                        str28 = str66;
                        str29 = str67;
                        str30 = str68;
                        str31 = str69;
                        str32 = str70;
                        str33 = str72;
                        str34 = str75;
                        str35 = str56;
                        z4 = false;
                        str74 = str34;
                        str70 = str32;
                        str69 = str31;
                        str68 = str30;
                        str67 = str29;
                        str66 = str28;
                        str55 = str26;
                        str56 = str35;
                        str72 = str33;
                        str73 = str27;
                        break;
                    case 0:
                        str26 = str55;
                        str27 = str73;
                        str28 = str66;
                        str29 = str67;
                        str30 = str68;
                        str31 = str69;
                        str33 = str72;
                        str34 = str75;
                        str35 = str56;
                        str32 = str70;
                        str71 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str71);
                        i3 |= 1;
                        str74 = str34;
                        str70 = str32;
                        str69 = str31;
                        str68 = str30;
                        str67 = str29;
                        str66 = str28;
                        str55 = str26;
                        str56 = str35;
                        str72 = str33;
                        str73 = str27;
                        break;
                    case 1:
                        str26 = str55;
                        str27 = str73;
                        str28 = str66;
                        str29 = str67;
                        str30 = str68;
                        str33 = str72;
                        str35 = str56;
                        str31 = str69;
                        str70 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str70);
                        i3 |= 2;
                        str74 = str75;
                        str32 = str70;
                        str70 = str32;
                        str69 = str31;
                        str68 = str30;
                        str67 = str29;
                        str66 = str28;
                        str55 = str26;
                        str56 = str35;
                        str72 = str33;
                        str73 = str27;
                        break;
                    case 2:
                        str26 = str55;
                        str27 = str73;
                        str28 = str66;
                        str29 = str67;
                        str33 = str72;
                        str35 = str56;
                        str30 = str68;
                        str69 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str69);
                        i3 |= 4;
                        str74 = str75;
                        str31 = str69;
                        str32 = str70;
                        str70 = str32;
                        str69 = str31;
                        str68 = str30;
                        str67 = str29;
                        str66 = str28;
                        str55 = str26;
                        str56 = str35;
                        str72 = str33;
                        str73 = str27;
                        break;
                    case 3:
                        str26 = str55;
                        str27 = str73;
                        str28 = str66;
                        str33 = str72;
                        str35 = str56;
                        str29 = str67;
                        str68 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str68);
                        i3 |= 8;
                        str74 = str75;
                        str30 = str68;
                        str31 = str69;
                        str32 = str70;
                        str70 = str32;
                        str69 = str31;
                        str68 = str30;
                        str67 = str29;
                        str66 = str28;
                        str55 = str26;
                        str56 = str35;
                        str72 = str33;
                        str73 = str27;
                        break;
                    case 4:
                        str26 = str55;
                        str27 = str73;
                        str33 = str72;
                        str35 = str56;
                        str28 = str66;
                        str67 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str67);
                        i3 |= 16;
                        str74 = str75;
                        str29 = str67;
                        str30 = str68;
                        str31 = str69;
                        str32 = str70;
                        str70 = str32;
                        str69 = str31;
                        str68 = str30;
                        str67 = str29;
                        str66 = str28;
                        str55 = str26;
                        str56 = str35;
                        str72 = str33;
                        str73 = str27;
                        break;
                    case 5:
                        str26 = str55;
                        str27 = str73;
                        str33 = str72;
                        str35 = str56;
                        str66 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str66);
                        i3 |= 32;
                        str74 = str75;
                        str28 = str66;
                        str29 = str67;
                        str30 = str68;
                        str31 = str69;
                        str32 = str70;
                        str70 = str32;
                        str69 = str31;
                        str68 = str30;
                        str67 = str29;
                        str66 = str28;
                        str55 = str26;
                        str56 = str35;
                        str72 = str33;
                        str73 = str27;
                        break;
                    case 6:
                        str26 = str55;
                        String str76 = str72;
                        str35 = str56;
                        String str77 = str73;
                        str33 = str76;
                        str27 = str77;
                        str74 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str75);
                        i3 |= 64;
                        str28 = str66;
                        str29 = str67;
                        str30 = str68;
                        str31 = str69;
                        str32 = str70;
                        str70 = str32;
                        str69 = str31;
                        str68 = str30;
                        str67 = str29;
                        str66 = str28;
                        str55 = str26;
                        str56 = str35;
                        str72 = str33;
                        str73 = str27;
                        break;
                    case 7:
                        String str78 = str73;
                        str33 = str72;
                        str35 = str56;
                        str26 = str55;
                        i3 |= 128;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str78);
                        str28 = str66;
                        str29 = str67;
                        str30 = str68;
                        str31 = str69;
                        str32 = str70;
                        str74 = str75;
                        str70 = str32;
                        str69 = str31;
                        str68 = str30;
                        str67 = str29;
                        str66 = str28;
                        str55 = str26;
                        str56 = str35;
                        str72 = str33;
                        str73 = str27;
                        break;
                    case 8:
                        str55 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str55);
                        i3 |= 256;
                        str56 = str56;
                        str74 = str75;
                        str72 = str72;
                        str73 = str73;
                        break;
                    case 9:
                        str23 = str73;
                        String str79 = str72;
                        str24 = str56;
                        i3 |= 512;
                        str60 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str60);
                        str25 = str79;
                        str56 = str24;
                        str73 = str23;
                        str72 = str25;
                        str74 = str75;
                        break;
                    case 10:
                        str23 = str73;
                        String str80 = str72;
                        str24 = str56;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str80);
                        i3 |= 1024;
                        str56 = str24;
                        str73 = str23;
                        str72 = str25;
                        str74 = str75;
                        break;
                    case 11:
                        str23 = str73;
                        i3 |= 2048;
                        str62 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str62);
                        str25 = str72;
                        str24 = str56;
                        str56 = str24;
                        str73 = str23;
                        str72 = str25;
                        str74 = str75;
                        break;
                    case 12:
                        str23 = str73;
                        i3 |= 4096;
                        str61 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str61);
                        str25 = str72;
                        str24 = str56;
                        str56 = str24;
                        str73 = str23;
                        str72 = str25;
                        str74 = str75;
                        break;
                    case 13:
                        str23 = str73;
                        i3 |= 8192;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        str25 = str72;
                        str24 = str56;
                        str56 = str24;
                        str73 = str23;
                        str72 = str25;
                        str74 = str75;
                        break;
                    case 14:
                        str23 = str73;
                        i3 |= 16384;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        str25 = str72;
                        str24 = str56;
                        str56 = str24;
                        str73 = str23;
                        str72 = str25;
                        str74 = str75;
                        break;
                    case 15:
                        str23 = str73;
                        str63 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str63);
                        i2 = 32768;
                        i3 |= i2;
                        str25 = str72;
                        str24 = str56;
                        str56 = str24;
                        str73 = str23;
                        str72 = str25;
                        str74 = str75;
                        break;
                    case 16:
                        str23 = str73;
                        str59 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str59);
                        i2 = 65536;
                        i3 |= i2;
                        str25 = str72;
                        str24 = str56;
                        str56 = str24;
                        str73 = str23;
                        str72 = str25;
                        str74 = str75;
                        break;
                    case 17:
                        str23 = str73;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 17);
                        i3 |= 131072;
                        str25 = str72;
                        str24 = str56;
                        str56 = str24;
                        str73 = str23;
                        str72 = str25;
                        str74 = str75;
                        break;
                    case 18:
                        str23 = str73;
                        i3 |= 262144;
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
                        str25 = str72;
                        str24 = str56;
                        str56 = str24;
                        str73 = str23;
                        str72 = str25;
                        str74 = str75;
                        break;
                    case 19:
                        str23 = str73;
                        str64 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, str64);
                        i2 = 524288;
                        i3 |= i2;
                        str25 = str72;
                        str24 = str56;
                        str56 = str24;
                        str73 = str23;
                        str72 = str25;
                        str74 = str75;
                        break;
                    case 20:
                        str23 = str73;
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 20);
                        i2 = 1048576;
                        i3 |= i2;
                        str25 = str72;
                        str24 = str56;
                        str56 = str24;
                        str73 = str23;
                        str72 = str25;
                        str74 = str75;
                        break;
                    case 21:
                        str23 = str73;
                        str65 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, str65);
                        i2 = 2097152;
                        i3 |= i2;
                        str25 = str72;
                        str24 = str56;
                        str56 = str24;
                        str73 = str23;
                        str72 = str25;
                        str74 = str75;
                        break;
                    case 22:
                        str23 = str73;
                        str56 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, str56);
                        i2 = 4194304;
                        i3 |= i2;
                        str25 = str72;
                        str24 = str56;
                        str56 = str24;
                        str73 = str23;
                        str72 = str25;
                        str74 = str75;
                        break;
                    case 23:
                        str23 = str73;
                        str58 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, str58);
                        i2 = 8388608;
                        i3 |= i2;
                        str25 = str72;
                        str24 = str56;
                        str56 = str24;
                        str73 = str23;
                        str72 = str25;
                        str74 = str75;
                        break;
                    case 24:
                        str23 = str73;
                        str57 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, str57);
                        i2 = 16777216;
                        i3 |= i2;
                        str25 = str72;
                        str24 = str56;
                        str56 = str24;
                        str73 = str23;
                        str72 = str25;
                        str74 = str75;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str57;
            str2 = str72;
            str3 = str60;
            str4 = str61;
            str5 = str62;
            str6 = str70;
            str7 = str66;
            str8 = str74;
            str9 = str73;
            str10 = str55;
            str11 = str56;
            str12 = str71;
            str13 = str58;
            i = i3;
            str14 = str63;
            str15 = str65;
            z = zDecodeBooleanElement5;
            str16 = str69;
            str17 = str67;
            str18 = strDecodeStringElement4;
            str19 = str59;
            str20 = str64;
            str21 = str68;
            z2 = zDecodeBooleanElement4;
            str22 = strDecodeStringElement3;
            z3 = zDecodeBooleanElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new StrategyHistoryListReq(i, str12, str6, str16, str21, str17, str7, str8, str9, str10, str3, str2, str5, str4, str22, str18, str14, str19, z2, z3, str20, z, str15, str11, str13, str, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull StrategyHistoryListReq strategyHistoryListReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(strategyHistoryListReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StrategyHistoryListReq.write$Self$OKTradeCore_trade_core(strategyHistoryListReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
