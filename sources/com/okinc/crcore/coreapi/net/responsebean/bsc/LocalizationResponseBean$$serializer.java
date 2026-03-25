package com.okinc.crcore.coreapi.net.responsebean.bsc;

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

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class LocalizationResponseBean$$serializer implements GeneratedSerializer<LocalizationResponseBean> {
    public static final int $stable;
    public static final LocalizationResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LocalizationResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LocalizationResponseBean$$serializer localizationResponseBean$$serializer = new LocalizationResponseBean$$serializer();
        INSTANCE = localizationResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizationResponseBean", localizationResponseBean$$serializer, 22);
        pluginGeneratedSerialDescriptor.addElement("processingTimeForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("feeRateForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("limitForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("rangeForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("generalDescriptionForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("dailyLimitForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("dailyLimitRemainingForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("frequencyLimitForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("singleTransactionLimitForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("accountProtectionForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("infoBoxForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("priceInfoBoxForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("availableToTradeForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("availableToWithdrawForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("cryptoWithdrawHoldDaysInfoBoxForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("fiatWithdrawHoldDaysInfoBoxForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("disclaimerForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("disclaimerHeaderForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("disclaimerBodyForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("googleWalletBottomSheetTitle", true);
        pluginGeneratedSerialDescriptor.addElement("googleWalletBottomSheetDescFirstPar", true);
        pluginGeneratedSerialDescriptor.addElement("googleWalletBottomSheetDescSecondPar", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LocalizationResponseBean deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        int i;
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
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 11;
        int i5 = 10;
        int i6 = 9;
        char c = '\b';
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            String str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            String str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            String str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, null);
            str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, stringSerializer, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, stringSerializer, null);
            str20 = str41;
            str12 = strDecodeStringElement4;
            str13 = strDecodeStringElement3;
            str15 = strDecodeStringElement2;
            str19 = strDecodeStringElement;
            str2 = str45;
            str14 = str44;
            str16 = str43;
            str = str33;
            str21 = strDecodeStringElement7;
            str22 = strDecodeStringElement6;
            str17 = strDecodeStringElement5;
            str6 = str38;
            str18 = str42;
            i = 4194303;
            str10 = str36;
            str7 = str37;
            str9 = str35;
            str8 = str34;
            str11 = str40;
            str5 = str39;
        } else {
            String str46 = null;
            String str47 = null;
            String str48 = null;
            String str49 = null;
            String str50 = null;
            String str51 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String str52 = null;
            String str53 = null;
            String str54 = null;
            String str55 = null;
            String str56 = null;
            String str57 = null;
            String str58 = null;
            boolean z = true;
            int i7 = 0;
            String str59 = null;
            String str60 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str23 = str59;
                        str24 = str46;
                        str25 = str52;
                        str26 = str53;
                        str27 = str54;
                        str28 = str55;
                        str29 = str57;
                        str30 = str58;
                        z = false;
                        str58 = str30;
                        str57 = str29;
                        str52 = str25;
                        str55 = str28;
                        str54 = str27;
                        str53 = str26;
                        str46 = str24;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 0:
                        str23 = str59;
                        str24 = str46;
                        str25 = str52;
                        str26 = str53;
                        str27 = str54;
                        str29 = str57;
                        str30 = str58;
                        str28 = str55;
                        str56 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str56);
                        i7 |= 1;
                        str58 = str30;
                        str57 = str29;
                        str52 = str25;
                        str55 = str28;
                        str54 = str27;
                        str53 = str26;
                        str46 = str24;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 1:
                        str23 = str59;
                        str24 = str46;
                        str25 = str52;
                        str26 = str53;
                        str29 = str57;
                        str30 = str58;
                        str27 = str54;
                        str55 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str55);
                        i7 |= 2;
                        str28 = str55;
                        str58 = str30;
                        str57 = str29;
                        str52 = str25;
                        str55 = str28;
                        str54 = str27;
                        str53 = str26;
                        str46 = str24;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 2:
                        str23 = str59;
                        str24 = str46;
                        str25 = str52;
                        str29 = str57;
                        str30 = str58;
                        str26 = str53;
                        i7 |= 4;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str54);
                        str28 = str55;
                        str58 = str30;
                        str57 = str29;
                        str52 = str25;
                        str55 = str28;
                        str54 = str27;
                        str53 = str26;
                        str46 = str24;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 3:
                        str23 = str59;
                        str24 = str46;
                        str53 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str53);
                        i7 |= 8;
                        str46 = str24;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 4:
                        str31 = str58;
                        str23 = str59;
                        i7 |= 16;
                        str52 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str52);
                        str32 = str57;
                        str57 = str32;
                        str58 = str31;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 5:
                        str31 = str58;
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str57);
                        i7 |= 32;
                        str23 = str59;
                        str57 = str32;
                        str58 = str31;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 6:
                        i7 |= 64;
                        str23 = str59;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str58);
                        str32 = str57;
                        str57 = str32;
                        str58 = str31;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 7:
                        str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str46);
                        i2 = i7 | 128;
                        str23 = str59;
                        i7 = i2;
                        str32 = str57;
                        str31 = str58;
                        str57 = str32;
                        str58 = str31;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 8:
                        i7 |= 256;
                        str23 = str59;
                        str51 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str51);
                        str32 = str57;
                        str31 = str58;
                        str57 = str32;
                        str58 = str31;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 9:
                        i7 |= 512;
                        str23 = str59;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        str32 = str57;
                        str31 = str58;
                        str57 = str32;
                        str58 = str31;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 10:
                        i7 |= 1024;
                        str23 = str59;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        str32 = str57;
                        str31 = str58;
                        str57 = str32;
                        str58 = str31;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 11:
                        i7 |= 2048;
                        str23 = str59;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        str32 = str57;
                        str31 = str58;
                        str57 = str32;
                        str58 = str31;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 12:
                        i7 |= 4096;
                        str23 = str59;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        str32 = str57;
                        str31 = str58;
                        str57 = str32;
                        str58 = str31;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 13:
                        i7 |= 8192;
                        str23 = str59;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        str32 = str57;
                        str31 = str58;
                        str57 = str32;
                        str58 = str31;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 14:
                        i7 |= 16384;
                        str23 = str59;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        str32 = str57;
                        str31 = str58;
                        str57 = str32;
                        str58 = str31;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 15:
                        i7 |= 32768;
                        str23 = str59;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        str32 = str57;
                        str31 = str58;
                        str57 = str32;
                        str58 = str31;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 16:
                        str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str48);
                        i3 = 65536;
                        i2 = i3 | i7;
                        str23 = str59;
                        i7 = i2;
                        str32 = str57;
                        str31 = str58;
                        str57 = str32;
                        str58 = str31;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 17:
                        str59 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, str59);
                        i3 = 131072;
                        i2 = i3 | i7;
                        str23 = str59;
                        i7 = i2;
                        str32 = str57;
                        str31 = str58;
                        str57 = str32;
                        str58 = str31;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 18:
                        str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, str47);
                        i3 = 262144;
                        i2 = i3 | i7;
                        str23 = str59;
                        i7 = i2;
                        str32 = str57;
                        str31 = str58;
                        str57 = str32;
                        str58 = str31;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 19:
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, str49);
                        i3 = 524288;
                        i2 = i3 | i7;
                        str23 = str59;
                        i7 = i2;
                        str32 = str57;
                        str31 = str58;
                        str57 = str32;
                        str58 = str31;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 20:
                        str50 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, str50);
                        i3 = 1048576;
                        i2 = i3 | i7;
                        str23 = str59;
                        i7 = i2;
                        str32 = str57;
                        str31 = str58;
                        str57 = str32;
                        str58 = str31;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 21:
                        str60 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, str60);
                        i3 = 2097152;
                        i2 = i3 | i7;
                        str23 = str59;
                        i7 = i2;
                        str32 = str57;
                        str31 = str58;
                        str57 = str32;
                        str58 = str31;
                        str59 = str23;
                        c = '\b';
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str61 = str52;
            String str62 = str53;
            String str63 = str54;
            str = str56;
            str2 = str49;
            i = i7;
            str3 = str60;
            str4 = str50;
            str5 = str58;
            str6 = str57;
            str7 = str61;
            str8 = str55;
            str9 = str63;
            str10 = str62;
            str11 = str46;
            str12 = strDecodeStringElement13;
            str13 = strDecodeStringElement14;
            str14 = str47;
            str15 = strDecodeStringElement9;
            str16 = str59;
            str17 = strDecodeStringElement12;
            str18 = str48;
            str19 = strDecodeStringElement8;
            str20 = str51;
            String str64 = strDecodeStringElement11;
            str21 = strDecodeStringElement10;
            str22 = str64;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LocalizationResponseBean(i, str, str8, str9, str10, str7, str6, str5, str11, str20, str19, str15, str13, str12, str17, str22, str21, str18, str16, str14, str2, str4, str3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LocalizationResponseBean localizationResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(localizationResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LocalizationResponseBean.write$Self$OKCRCore_cr_core(localizationResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
