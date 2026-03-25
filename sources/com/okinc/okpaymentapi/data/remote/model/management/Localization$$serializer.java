package com.okinc.okpaymentapi.data.remote.model.management;

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

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class Localization$$serializer implements GeneratedSerializer<Localization> {
    public static final int $stable;
    public static final Localization$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Localization$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Localization$$serializer localization$$serializer = new Localization$$serializer();
        INSTANCE = localization$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okpaymentapi.data.remote.model.management.Localization", localization$$serializer, 24);
        pluginGeneratedSerialDescriptor.addElement("processingTimeForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("paybackProcessingTimeForDisplay", true);
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
        pluginGeneratedSerialDescriptor.addElement("paybackDisclaimerForDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("googleWalletBottomSheetTitle", true);
        pluginGeneratedSerialDescriptor.addElement("googleWalletBottomSheetDescFirstPar", true);
        pluginGeneratedSerialDescriptor.addElement("googleWalletBottomSheetDescSecondPar", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Localization deserialize(@NotNull Decoder decoder) {
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
        String str14;
        String str15;
        String str16;
        String str17;
        int i;
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
            String str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            String str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            String str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, null);
            String str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, stringSerializer, null);
            String str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, stringSerializer, null);
            String str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, stringSerializer, null);
            str17 = str46;
            str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, stringSerializer, null);
            str19 = strDecodeStringElement3;
            str18 = strDecodeStringElement2;
            str15 = str45;
            str16 = str44;
            str = str33;
            str24 = strDecodeStringElement7;
            str11 = strDecodeStringElement6;
            str12 = strDecodeStringElement5;
            str13 = strDecodeStringElement4;
            str10 = str38;
            str23 = str43;
            str3 = str47;
            str2 = str48;
            str8 = str36;
            str9 = str37;
            str22 = str41;
            str7 = str35;
            str6 = str34;
            str21 = strDecodeStringElement;
            str20 = str42;
            str5 = str40;
            str4 = str39;
            i = 16777215;
        } else {
            String str49 = null;
            String str50 = null;
            String str51 = null;
            String str52 = null;
            String str53 = null;
            String str54 = null;
            String str55 = null;
            String str56 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String str57 = null;
            String str58 = null;
            String str59 = null;
            String str60 = null;
            String str61 = null;
            String str62 = null;
            String str63 = null;
            boolean z = true;
            int i6 = 0;
            String str64 = null;
            String str65 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str25 = str64;
                        str26 = str49;
                        str27 = str57;
                        str28 = str58;
                        str29 = str59;
                        str30 = str60;
                        str31 = str61;
                        str32 = str63;
                        z = false;
                        str63 = str32;
                        str61 = str31;
                        str60 = str30;
                        str59 = str29;
                        str58 = str28;
                        str57 = str27;
                        str49 = str26;
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 0:
                        str25 = str64;
                        str26 = str49;
                        str27 = str57;
                        str28 = str58;
                        str29 = str59;
                        str30 = str60;
                        str32 = str63;
                        str31 = str61;
                        str62 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str62);
                        i6 |= 1;
                        str63 = str32;
                        str61 = str31;
                        str60 = str30;
                        str59 = str29;
                        str58 = str28;
                        str57 = str27;
                        str49 = str26;
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 1:
                        str25 = str64;
                        str26 = str49;
                        str27 = str57;
                        str28 = str58;
                        str29 = str59;
                        str32 = str63;
                        str30 = str60;
                        str61 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str61);
                        i6 |= 2;
                        str31 = str61;
                        str63 = str32;
                        str61 = str31;
                        str60 = str30;
                        str59 = str29;
                        str58 = str28;
                        str57 = str27;
                        str49 = str26;
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 2:
                        str25 = str64;
                        str26 = str49;
                        str27 = str57;
                        str28 = str58;
                        str32 = str63;
                        str29 = str59;
                        str60 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str60);
                        i6 |= 4;
                        str30 = str60;
                        str31 = str61;
                        str63 = str32;
                        str61 = str31;
                        str60 = str30;
                        str59 = str29;
                        str58 = str28;
                        str57 = str27;
                        str49 = str26;
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 3:
                        str25 = str64;
                        str26 = str49;
                        str27 = str57;
                        str32 = str63;
                        str28 = str58;
                        str59 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str59);
                        i6 |= 8;
                        str29 = str59;
                        str30 = str60;
                        str31 = str61;
                        str63 = str32;
                        str61 = str31;
                        str60 = str30;
                        str59 = str29;
                        str58 = str28;
                        str57 = str27;
                        str49 = str26;
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 4:
                        str25 = str64;
                        str26 = str49;
                        str32 = str63;
                        str27 = str57;
                        i6 |= 16;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str58);
                        str29 = str59;
                        str30 = str60;
                        str31 = str61;
                        str63 = str32;
                        str61 = str31;
                        str60 = str30;
                        str59 = str29;
                        str58 = str28;
                        str57 = str27;
                        str49 = str26;
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 5:
                        str25 = str64;
                        str26 = str49;
                        str57 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str57);
                        i6 |= 32;
                        str49 = str26;
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 6:
                        str25 = str64;
                        i6 |= 64;
                        str63 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str63);
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 7:
                        i6 |= 128;
                        str25 = str64;
                        str56 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str56);
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 8:
                        i6 |= 256;
                        str25 = str64;
                        str55 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str55);
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 9:
                        str52 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str52);
                        i6 |= 512;
                        str25 = str64;
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 10:
                        i6 |= 1024;
                        str25 = str64;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 11:
                        i6 |= 2048;
                        str25 = str64;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 12:
                        i6 |= 4096;
                        str25 = str64;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 13:
                        i6 |= 8192;
                        str25 = str64;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 14:
                        i6 |= 16384;
                        str25 = str64;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 15:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i2 = 32768;
                        i6 |= i2;
                        str25 = str64;
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 16:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i2 = 65536;
                        i6 |= i2;
                        str25 = str64;
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 17:
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, str49);
                        i3 = 131072;
                        i6 |= i3;
                        str25 = str64;
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 18:
                        str51 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, str51);
                        i3 = 262144;
                        i6 |= i3;
                        str25 = str64;
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 19:
                        str50 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, str50);
                        i3 = 524288;
                        i6 |= i3;
                        str25 = str64;
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 20:
                        str53 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, str53);
                        i3 = 1048576;
                        i6 |= i3;
                        str25 = str64;
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 21:
                        str54 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, str54);
                        i3 = 2097152;
                        i6 |= i3;
                        str25 = str64;
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 22:
                        str65 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, str65);
                        i3 = 4194304;
                        i6 |= i3;
                        str25 = str64;
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 23:
                        str64 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, str64);
                        i3 = 8388608;
                        i6 |= i3;
                        str25 = str64;
                        str64 = str25;
                        i4 = 11;
                        i5 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str66 = str57;
            String str67 = str58;
            str = str62;
            str2 = str65;
            str3 = str54;
            str4 = str63;
            str5 = str56;
            str6 = str61;
            str7 = str60;
            str8 = str59;
            str9 = str67;
            str10 = str66;
            str11 = strDecodeStringElement12;
            str12 = strDecodeStringElement13;
            str13 = strDecodeStringElement14;
            str14 = str64;
            str15 = str50;
            str16 = str51;
            str17 = str53;
            i = i6;
            str18 = strDecodeStringElement9;
            str19 = strDecodeStringElement10;
            str20 = str52;
            str21 = strDecodeStringElement8;
            str22 = str55;
            String str68 = strDecodeStringElement11;
            str23 = str49;
            str24 = str68;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Localization(i, str, str6, str7, str8, str9, str10, str4, str5, str22, str20, str21, str18, str19, str13, str12, str11, str24, str23, str16, str15, str17, str3, str2, str14, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Localization localization) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(localization, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Localization.write$Self$OKPayments_ok_payment_api(localization, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
