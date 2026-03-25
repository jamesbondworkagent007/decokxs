package com.okinc.unify_trade.biz.subscribe;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
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
public final /* synthetic */ class FundingRateArbitrageData$$serializer implements GeneratedSerializer<FundingRateArbitrageData> {
    public static final int $stable;
    public static final FundingRateArbitrageData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private FundingRateArbitrageData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FundingRateArbitrageData$$serializer fundingRateArbitrageData$$serializer = new FundingRateArbitrageData$$serializer();
        INSTANCE = fundingRateArbitrageData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.subscribe.FundingRateArbitrageData", fundingRateArbitrageData$$serializer, 26);
        pluginGeneratedSerialDescriptor.addElement("arbitrageId", true);
        pluginGeneratedSerialDescriptor.addElement("buyInstId", true);
        pluginGeneratedSerialDescriptor.addElement("sellInstId", true);
        pluginGeneratedSerialDescriptor.addElement("buyInstType", true);
        pluginGeneratedSerialDescriptor.addElement("sellInstType", true);
        pluginGeneratedSerialDescriptor.addElement("apy", true);
        pluginGeneratedSerialDescriptor.addElement("fundingRate", true);
        pluginGeneratedSerialDescriptor.addElement("nextFundingRate", true);
        pluginGeneratedSerialDescriptor.addElement("state", true);
        pluginGeneratedSerialDescriptor.addElement("ts", true);
        pluginGeneratedSerialDescriptor.addElement("isShow", true);
        pluginGeneratedSerialDescriptor.addElement("isSearchVisible", true);
        pluginGeneratedSerialDescriptor.addElement("ccy", true);
        pluginGeneratedSerialDescriptor.addElement("uly", true);
        pluginGeneratedSerialDescriptor.addElement("fundingTime", true);
        pluginGeneratedSerialDescriptor.addElement("spread", true);
        pluginGeneratedSerialDescriptor.addElement("yield3dPer10K", true);
        pluginGeneratedSerialDescriptor.addElement("notionalUsd", true);
        pluginGeneratedSerialDescriptor.addElement("acc3dFundingRate", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("groupType", true);
        pluginGeneratedSerialDescriptor.addElement("ctType", true);
        pluginGeneratedSerialDescriptor.addElement("ccyType", true);
        pluginGeneratedSerialDescriptor.addElement("instFamily", true);
        pluginGeneratedSerialDescriptor.addElement("searchCcy", true);
        pluginGeneratedSerialDescriptor.addElement("apyNoneAbsolute", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = FundingRateArbitrageData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[24]), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final FundingRateArbitrageData deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z;
        String str9;
        String str10;
        int i;
        String str11;
        String str12;
        String str13;
        String str14;
        boolean z2;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        CharSequence charSequence;
        KSerializer[] kSerializerArr;
        String str24;
        int i2;
        KSerializer[] kSerializerArr2;
        String str25;
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
        String str36;
        String str37;
        String str38;
        String str39;
        String str40;
        String str41;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = FundingRateArbitrageData.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str50 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str51 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            String str52 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str53 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str54 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str55 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str56 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            String str57 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            String str58 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            String str59 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String str60 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, stringSerializer, null);
            String str61 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, stringSerializer, null);
            String str62 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, stringSerializer, null);
            charSequence = (CharSequence) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, kSerializerArr3[24], null);
            str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, stringSerializer, null);
            str7 = strDecodeStringElement;
            str8 = str52;
            str11 = str60;
            str23 = str42;
            str9 = str61;
            str10 = str62;
            str15 = str59;
            str13 = str43;
            str20 = str58;
            str19 = str57;
            str22 = str56;
            str = str53;
            z = zDecodeBooleanElement2;
            i = 67108863;
            str6 = str50;
            str5 = str49;
            str4 = str48;
            str3 = str54;
            str14 = str47;
            str18 = str46;
            z2 = zDecodeBooleanElement;
            str16 = str55;
            str21 = str44;
            str2 = str51;
            str17 = str45;
        } else {
            String str63 = null;
            int i3 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            boolean z3 = true;
            String str64 = null;
            String str65 = null;
            String str66 = null;
            CharSequence charSequence2 = null;
            String str67 = null;
            String str68 = null;
            String str69 = null;
            String str70 = null;
            String str71 = null;
            String str72 = null;
            String str73 = null;
            String strDecodeStringElement2 = null;
            String str74 = null;
            String str75 = null;
            String str76 = null;
            String str77 = null;
            String str78 = null;
            String str79 = null;
            String str80 = null;
            String str81 = null;
            String str82 = null;
            String str83 = null;
            String str84 = null;
            while (z3) {
                String str85 = str67;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr2 = kSerializerArr3;
                        str25 = str64;
                        str26 = str65;
                        str27 = str66;
                        str28 = str74;
                        str29 = str75;
                        str30 = str76;
                        str31 = str77;
                        str32 = str78;
                        str33 = str79;
                        str34 = str80;
                        str35 = str81;
                        str36 = str82;
                        str37 = str83;
                        str38 = str84;
                        str39 = str85;
                        z3 = false;
                        str84 = str38;
                        str82 = str36;
                        str64 = str25;
                        str66 = str27;
                        str67 = str39;
                        str81 = str35;
                        str80 = str34;
                        str78 = str32;
                        str79 = str33;
                        str77 = str31;
                        str74 = str28;
                        str76 = str30;
                        str75 = str29;
                        str65 = str26;
                        str83 = str37;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 0:
                        str40 = str65;
                        str84 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str84);
                        i3 |= 1;
                        kSerializerArr3 = kSerializerArr3;
                        str64 = str64;
                        str66 = str66;
                        str67 = str85;
                        str81 = str81;
                        str65 = str40;
                        break;
                    case 1:
                        str40 = str65;
                        str81 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str81);
                        i3 |= 2;
                        kSerializerArr3 = kSerializerArr3;
                        str64 = str64;
                        str66 = str66;
                        str67 = str85;
                        str80 = str80;
                        str65 = str40;
                        break;
                    case 2:
                        str40 = str65;
                        str80 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str80);
                        i3 |= 4;
                        kSerializerArr3 = kSerializerArr3;
                        str64 = str64;
                        str66 = str66;
                        str67 = str85;
                        str78 = str78;
                        str65 = str40;
                        break;
                    case 3:
                        str40 = str65;
                        str78 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str78);
                        i3 |= 8;
                        kSerializerArr3 = kSerializerArr3;
                        str64 = str64;
                        str66 = str66;
                        str67 = str85;
                        str79 = str79;
                        str65 = str40;
                        break;
                    case 4:
                        str40 = str65;
                        str79 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str79);
                        i3 |= 16;
                        kSerializerArr3 = kSerializerArr3;
                        str64 = str64;
                        str66 = str66;
                        str67 = str85;
                        str77 = str77;
                        str65 = str40;
                        break;
                    case 5:
                        str40 = str65;
                        str77 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str77);
                        i3 |= 32;
                        kSerializerArr3 = kSerializerArr3;
                        str64 = str64;
                        str66 = str66;
                        str67 = str85;
                        str74 = str74;
                        str65 = str40;
                        break;
                    case 6:
                        str40 = str65;
                        str74 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str74);
                        i3 |= 64;
                        kSerializerArr3 = kSerializerArr3;
                        str64 = str64;
                        str66 = str66;
                        str67 = str85;
                        str76 = str76;
                        str65 = str40;
                        break;
                    case 7:
                        str40 = str65;
                        str76 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str76);
                        i3 |= 128;
                        kSerializerArr3 = kSerializerArr3;
                        str64 = str64;
                        str66 = str66;
                        str67 = str85;
                        str75 = str75;
                        str65 = str40;
                        break;
                    case 8:
                        str40 = str65;
                        str75 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str75);
                        i3 |= 256;
                        kSerializerArr3 = kSerializerArr3;
                        str64 = str64;
                        str66 = str66;
                        str67 = str85;
                        str65 = str40;
                        break;
                    case 9:
                        str82 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str82);
                        i3 |= 512;
                        kSerializerArr3 = kSerializerArr3;
                        str64 = str64;
                        str66 = str66;
                        str67 = str85;
                        str83 = str83;
                        break;
                    case 10:
                        kSerializerArr2 = kSerializerArr3;
                        str25 = str64;
                        str27 = str66;
                        str41 = str83;
                        str39 = str85;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
                        i3 |= 1024;
                        str37 = str41;
                        str26 = str65;
                        str28 = str74;
                        str29 = str75;
                        str30 = str76;
                        str31 = str77;
                        str32 = str78;
                        str33 = str79;
                        str34 = str80;
                        str35 = str81;
                        str36 = str82;
                        str38 = str84;
                        str84 = str38;
                        str82 = str36;
                        str64 = str25;
                        str66 = str27;
                        str67 = str39;
                        str81 = str35;
                        str80 = str34;
                        str78 = str32;
                        str79 = str33;
                        str77 = str31;
                        str74 = str28;
                        str76 = str30;
                        str75 = str29;
                        str65 = str26;
                        str83 = str37;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 11:
                        kSerializerArr2 = kSerializerArr3;
                        str25 = str64;
                        str27 = str66;
                        str39 = str85;
                        i3 |= 2048;
                        str37 = str83;
                        str26 = str65;
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        str28 = str74;
                        str29 = str75;
                        str30 = str76;
                        str31 = str77;
                        str32 = str78;
                        str33 = str79;
                        str34 = str80;
                        str35 = str81;
                        str36 = str82;
                        str38 = str84;
                        str84 = str38;
                        str82 = str36;
                        str64 = str25;
                        str66 = str27;
                        str67 = str39;
                        str81 = str35;
                        str80 = str34;
                        str78 = str32;
                        str79 = str33;
                        str77 = str31;
                        str74 = str28;
                        str76 = str30;
                        str75 = str29;
                        str65 = str26;
                        str83 = str37;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 12:
                        kSerializerArr2 = kSerializerArr3;
                        str25 = str64;
                        str27 = str66;
                        str39 = str85;
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str83);
                        i3 |= 4096;
                        str37 = str41;
                        str26 = str65;
                        str28 = str74;
                        str29 = str75;
                        str30 = str76;
                        str31 = str77;
                        str32 = str78;
                        str33 = str79;
                        str34 = str80;
                        str35 = str81;
                        str36 = str82;
                        str38 = str84;
                        str84 = str38;
                        str82 = str36;
                        str64 = str25;
                        str66 = str27;
                        str67 = str39;
                        str81 = str35;
                        str80 = str34;
                        str78 = str32;
                        str79 = str33;
                        str77 = str31;
                        str74 = str28;
                        str76 = str30;
                        str75 = str29;
                        str65 = str26;
                        str83 = str37;
                        kSerializerArr3 = kSerializerArr2;
                        break;
                    case 13:
                        i3 |= 8192;
                        kSerializerArr3 = kSerializerArr3;
                        str67 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str85);
                        str64 = str64;
                        str66 = str66;
                        break;
                    case 14:
                        str66 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str66);
                        i3 |= 16384;
                        kSerializerArr3 = kSerializerArr3;
                        str64 = str64;
                        str67 = str85;
                        break;
                    case 15:
                        kSerializerArr = kSerializerArr3;
                        str24 = str66;
                        str72 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str72);
                        i2 = 32768;
                        i3 = i2 | i3;
                        kSerializerArr3 = kSerializerArr;
                        str67 = str85;
                        str66 = str24;
                        break;
                    case 16:
                        kSerializerArr = kSerializerArr3;
                        str24 = str66;
                        str65 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str65);
                        i2 = 65536;
                        i3 = i2 | i3;
                        kSerializerArr3 = kSerializerArr;
                        str67 = str85;
                        str66 = str24;
                        break;
                    case 17:
                        kSerializerArr = kSerializerArr3;
                        str24 = str66;
                        str63 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, str63);
                        i2 = 131072;
                        i3 = i2 | i3;
                        kSerializerArr3 = kSerializerArr;
                        str67 = str85;
                        str66 = str24;
                        break;
                    case 18:
                        str24 = str66;
                        kSerializerArr = kSerializerArr3;
                        str70 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, str70);
                        i2 = 262144;
                        i3 = i2 | i3;
                        kSerializerArr3 = kSerializerArr;
                        str67 = str85;
                        str66 = str24;
                        break;
                    case 19:
                        str24 = str66;
                        str71 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, str71);
                        i2 = 524288;
                        kSerializerArr = kSerializerArr3;
                        i3 = i2 | i3;
                        kSerializerArr3 = kSerializerArr;
                        str67 = str85;
                        str66 = str24;
                        break;
                    case 20:
                        str24 = str66;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i2 = 1048576;
                        kSerializerArr = kSerializerArr3;
                        i3 = i2 | i3;
                        kSerializerArr3 = kSerializerArr;
                        str67 = str85;
                        str66 = str24;
                        break;
                    case 21:
                        str24 = str66;
                        str73 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, str73);
                        i2 = 2097152;
                        kSerializerArr = kSerializerArr3;
                        i3 = i2 | i3;
                        kSerializerArr3 = kSerializerArr;
                        str67 = str85;
                        str66 = str24;
                        break;
                    case 22:
                        str24 = str66;
                        str68 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, str68);
                        i2 = 4194304;
                        kSerializerArr = kSerializerArr3;
                        i3 = i2 | i3;
                        kSerializerArr3 = kSerializerArr;
                        str67 = str85;
                        str66 = str24;
                        break;
                    case 23:
                        str24 = str66;
                        str69 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, str69);
                        i2 = 8388608;
                        kSerializerArr = kSerializerArr3;
                        i3 = i2 | i3;
                        kSerializerArr3 = kSerializerArr;
                        str67 = str85;
                        str66 = str24;
                        break;
                    case 24:
                        str24 = str66;
                        charSequence2 = (CharSequence) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, kSerializerArr3[24], charSequence2);
                        kSerializerArr = kSerializerArr3;
                        i3 = 16777216 | i3;
                        kSerializerArr3 = kSerializerArr;
                        str67 = str85;
                        str66 = str24;
                        break;
                    case 25:
                        str24 = str66;
                        str64 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, str64);
                        i2 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        kSerializerArr = kSerializerArr3;
                        i3 = i2 | i3;
                        kSerializerArr3 = kSerializerArr;
                        str67 = str85;
                        str66 = str24;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str67;
            str2 = str82;
            str3 = str66;
            str4 = str74;
            str5 = str76;
            str6 = str75;
            str7 = strDecodeStringElement2;
            str8 = str83;
            z = zDecodeBooleanElement3;
            str9 = str68;
            str10 = str69;
            i = i3;
            str11 = str73;
            str12 = str64;
            str13 = str81;
            str14 = str77;
            z2 = zDecodeBooleanElement4;
            str15 = str71;
            str16 = str72;
            str17 = str78;
            str18 = str79;
            str19 = str63;
            str20 = str70;
            str21 = str80;
            str22 = str65;
            str23 = str84;
            charSequence = charSequence2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FundingRateArbitrageData(i, str23, str13, str21, str17, str18, str14, str4, str5, str6, str2, z2, z, str8, str, str3, str16, str22, str19, str20, str15, str7, str11, str9, str10, charSequence, str12, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull FundingRateArbitrageData fundingRateArbitrageData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(fundingRateArbitrageData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FundingRateArbitrageData.write$Self$OKTradeCore_trade_core(fundingRateArbitrageData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
