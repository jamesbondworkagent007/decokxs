package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class SmartPortfolioReq$$serializer implements GeneratedSerializer<SmartPortfolioReq> {
    public static final int $stable;
    public static final SmartPortfolioReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SmartPortfolioReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SmartPortfolioReq$$serializer smartPortfolioReq$$serializer = new SmartPortfolioReq$$serializer();
        INSTANCE = smartPortfolioReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.SmartPortfolioReq", smartPortfolioReq$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("stgyName", true);
        pluginGeneratedSerialDescriptor.addElement("capitalList", true);
        pluginGeneratedSerialDescriptor.addElement("portfolioList", true);
        pluginGeneratedSerialDescriptor.addElement("balType", true);
        pluginGeneratedSerialDescriptor.addElement("interval", true);
        pluginGeneratedSerialDescriptor.addElement("deltaRatio", true);
        pluginGeneratedSerialDescriptor.addElement("sourceAlgoId", true);
        pluginGeneratedSerialDescriptor.addElement("recommendId", true);
        pluginGeneratedSerialDescriptor.addElement("initCapital", true);
        pluginGeneratedSerialDescriptor.addElement("investType", true);
        pluginGeneratedSerialDescriptor.addElement("quoteCcy", true);
        pluginGeneratedSerialDescriptor.addElement("tdMode", true);
        pluginGeneratedSerialDescriptor.addElement("quoteSz", true);
        pluginGeneratedSerialDescriptor.addElement("tradeQuoteCcy", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = SmartPortfolioReq.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[1]), BuiltinSerializersKt.getNullable(kSerializerArr[2]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SmartPortfolioReq deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        List list;
        String str10;
        String str11;
        String str12;
        List list2;
        String str13;
        String str14;
        String str15;
        String str16;
        List list3;
        String str17;
        String str18;
        KSerializer[] kSerializerArr;
        List list4;
        String str19;
        List list5;
        String str20;
        String str21;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = SmartPortfolioReq.$childSerializers;
        int i3 = 9;
        int i4 = 8;
        String str22 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr2[1], null);
            List list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr2[2], null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            str8 = str24;
            str5 = str30;
            str3 = str28;
            str4 = str27;
            str12 = str29;
            str11 = str31;
            str2 = str32;
            str10 = str23;
            list2 = list7;
            list = list6;
            str7 = str25;
            str6 = str26;
            i = 16383;
        } else {
            int i5 = 13;
            i = 0;
            boolean z = true;
            String str33 = null;
            String str34 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            List list8 = null;
            List list9 = null;
            String str42 = null;
            String str43 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str13 = str33;
                        str14 = str34;
                        str15 = str40;
                        str16 = str41;
                        list3 = list8;
                        str17 = str42;
                        str18 = str43;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        z = false;
                        str19 = str17;
                        str34 = str14;
                        String str44 = str18;
                        list5 = list3;
                        str33 = str13;
                        str20 = str44;
                        str40 = str15;
                        str41 = str16;
                        str43 = str20;
                        kSerializerArr2 = kSerializerArr;
                        list9 = list4;
                        i4 = 8;
                        i5 = 13;
                        list8 = list5;
                        str42 = str19;
                        i3 = 9;
                        break;
                    case 0:
                        str13 = str33;
                        str14 = str34;
                        str15 = str40;
                        str16 = str41;
                        list3 = list8;
                        str18 = str43;
                        kSerializerArr = kSerializerArr2;
                        String str45 = str42;
                        list4 = list9;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str45);
                        i |= 1;
                        str19 = str17;
                        str34 = str14;
                        String str442 = str18;
                        list5 = list3;
                        str33 = str13;
                        str20 = str442;
                        str40 = str15;
                        str41 = str16;
                        str43 = str20;
                        kSerializerArr2 = kSerializerArr;
                        list9 = list4;
                        i4 = 8;
                        i5 = 13;
                        list8 = list5;
                        str42 = str19;
                        i3 = 9;
                        break;
                    case 1:
                        str13 = str33;
                        str14 = str34;
                        str15 = str40;
                        str16 = str41;
                        list3 = list8;
                        str18 = str43;
                        kSerializerArr = kSerializerArr2;
                        i |= 2;
                        str17 = str42;
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr2[1], list9);
                        str19 = str17;
                        str34 = str14;
                        String str4422 = str18;
                        list5 = list3;
                        str33 = str13;
                        str20 = str4422;
                        str40 = str15;
                        str41 = str16;
                        str43 = str20;
                        kSerializerArr2 = kSerializerArr;
                        list9 = list4;
                        i4 = 8;
                        i5 = 13;
                        list8 = list5;
                        str42 = str19;
                        i3 = 9;
                        break;
                    case 2:
                        str15 = str40;
                        str16 = str41;
                        str18 = str43;
                        str13 = str33;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr2[2], list8);
                        kSerializerArr = kSerializerArr2;
                        i |= 4;
                        str34 = str34;
                        str19 = str42;
                        list4 = list9;
                        String str44222 = str18;
                        list5 = list3;
                        str33 = str13;
                        str20 = str44222;
                        str40 = str15;
                        str41 = str16;
                        str43 = str20;
                        kSerializerArr2 = kSerializerArr;
                        list9 = list4;
                        i4 = 8;
                        i5 = 13;
                        list8 = list5;
                        str42 = str19;
                        i3 = 9;
                        break;
                    case 3:
                        str21 = str34;
                        str15 = str40;
                        str16 = str41;
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str33);
                        str20 = str43;
                        i |= 8;
                        str34 = str21;
                        list5 = list8;
                        str19 = str42;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str40 = str15;
                        str41 = str16;
                        str43 = str20;
                        kSerializerArr2 = kSerializerArr;
                        list9 = list4;
                        i4 = 8;
                        i5 = 13;
                        list8 = list5;
                        str42 = str19;
                        i3 = 9;
                        break;
                    case 4:
                        str15 = str40;
                        str21 = str34;
                        i |= 16;
                        str20 = str43;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str41);
                        str34 = str21;
                        list5 = list8;
                        str19 = str42;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str40 = str15;
                        str41 = str16;
                        str43 = str20;
                        kSerializerArr2 = kSerializerArr;
                        list9 = list4;
                        i4 = 8;
                        i5 = 13;
                        list8 = list5;
                        str42 = str19;
                        i3 = 9;
                        break;
                    case 5:
                        i |= 32;
                        str20 = str43;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str40);
                        str16 = str41;
                        list5 = list8;
                        str19 = str42;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str40 = str15;
                        str41 = str16;
                        str43 = str20;
                        kSerializerArr2 = kSerializerArr;
                        list9 = list4;
                        i4 = 8;
                        i5 = 13;
                        list8 = list5;
                        str42 = str19;
                        i3 = 9;
                        break;
                    case 6:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str43);
                        i |= 64;
                        str15 = str40;
                        str16 = str41;
                        list5 = list8;
                        str19 = str42;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str40 = str15;
                        str41 = str16;
                        str43 = str20;
                        kSerializerArr2 = kSerializerArr;
                        list9 = list4;
                        i4 = 8;
                        i5 = 13;
                        list8 = list5;
                        str42 = str19;
                        i3 = 9;
                        break;
                    case 7:
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str36);
                        i2 = i | 128;
                        i = i2;
                        str15 = str40;
                        str16 = str41;
                        list5 = list8;
                        str19 = str42;
                        str20 = str43;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str40 = str15;
                        str41 = str16;
                        str43 = str20;
                        kSerializerArr2 = kSerializerArr;
                        list9 = list4;
                        i4 = 8;
                        i5 = 13;
                        list8 = list5;
                        str42 = str19;
                        i3 = 9;
                        break;
                    case 8:
                        i |= 256;
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str39);
                        str15 = str40;
                        str16 = str41;
                        list5 = list8;
                        str19 = str42;
                        str20 = str43;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str40 = str15;
                        str41 = str16;
                        str43 = str20;
                        kSerializerArr2 = kSerializerArr;
                        list9 = list4;
                        i4 = 8;
                        i5 = 13;
                        list8 = list5;
                        str42 = str19;
                        i3 = 9;
                        break;
                    case 9:
                        i |= 512;
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str38);
                        str15 = str40;
                        str16 = str41;
                        list5 = list8;
                        str19 = str42;
                        str20 = str43;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str40 = str15;
                        str41 = str16;
                        str43 = str20;
                        kSerializerArr2 = kSerializerArr;
                        list9 = list4;
                        i4 = 8;
                        i5 = 13;
                        list8 = list5;
                        str42 = str19;
                        i3 = 9;
                        break;
                    case 10:
                        i |= 1024;
                        str15 = str40;
                        str16 = str41;
                        list5 = list8;
                        str20 = str43;
                        kSerializerArr = kSerializerArr2;
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str37);
                        str19 = str42;
                        list4 = list9;
                        str40 = str15;
                        str41 = str16;
                        str43 = str20;
                        kSerializerArr2 = kSerializerArr;
                        list9 = list4;
                        i4 = 8;
                        i5 = 13;
                        list8 = list5;
                        str42 = str19;
                        i3 = 9;
                        break;
                    case 11:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str22);
                        i2 = i | 2048;
                        i = i2;
                        str15 = str40;
                        str16 = str41;
                        list5 = list8;
                        str19 = str42;
                        str20 = str43;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str40 = str15;
                        str41 = str16;
                        str43 = str20;
                        kSerializerArr2 = kSerializerArr;
                        list9 = list4;
                        i4 = 8;
                        i5 = 13;
                        list8 = list5;
                        str42 = str19;
                        i3 = 9;
                        break;
                    case 12:
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str34);
                        i2 = i | 4096;
                        i = i2;
                        str15 = str40;
                        str16 = str41;
                        list5 = list8;
                        str19 = str42;
                        str20 = str43;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str40 = str15;
                        str41 = str16;
                        str43 = str20;
                        kSerializerArr2 = kSerializerArr;
                        list9 = list4;
                        i4 = 8;
                        i5 = 13;
                        list8 = list5;
                        str42 = str19;
                        i3 = 9;
                        break;
                    case 13:
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str35);
                        i2 = i | 8192;
                        i = i2;
                        str15 = str40;
                        str16 = str41;
                        list5 = list8;
                        str19 = str42;
                        str20 = str43;
                        kSerializerArr = kSerializerArr2;
                        list4 = list9;
                        str40 = str15;
                        str41 = str16;
                        str43 = str20;
                        kSerializerArr2 = kSerializerArr;
                        list9 = list4;
                        i4 = 8;
                        i5 = 13;
                        list8 = list5;
                        str42 = str19;
                        i3 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str46 = str33;
            String str47 = str40;
            List list10 = list8;
            str = str35;
            str2 = str22;
            str3 = str36;
            str4 = str43;
            str5 = str38;
            str6 = str47;
            str7 = str41;
            str8 = str46;
            str9 = str34;
            list = list9;
            str10 = str42;
            str11 = str37;
            str12 = str39;
            list2 = list10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SmartPortfolioReq(i, str10, list, list2, str8, str7, str6, str4, str3, str12, str5, str11, str2, str9, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SmartPortfolioReq smartPortfolioReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(smartPortfolioReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SmartPortfolioReq.write$Self$OKTradeCore_trade_core(smartPortfolioReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
