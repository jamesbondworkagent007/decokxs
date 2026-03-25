package com.okinc.ok_kyc_core.data.remote.networkmodel;

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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class AdBannerAppModel$$serializer implements GeneratedSerializer<AdBannerAppModel> {
    public static final int $stable;
    public static final AdBannerAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AdBannerAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AdBannerAppModel$$serializer adBannerAppModel$$serializer = new AdBannerAppModel$$serializer();
        INSTANCE = adBannerAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.AdBannerAppModel", adBannerAppModel$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("bannerType", true);
        pluginGeneratedSerialDescriptor.addElement("tokenId", true);
        pluginGeneratedSerialDescriptor.addElement("tipName", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AdBannerAppModel deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        String str;
        Float f;
        String str2;
        String str3;
        Float f2;
        int i;
        Boolean bool2;
        String str4;
        String str5;
        String str6;
        Boolean bool3;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        int i5 = 5;
        int i6 = 8;
        String str8 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, null);
            str2 = str13;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            str = str12;
            bool = bool5;
            bool2 = bool4;
            f = f3;
            str3 = strDecodeStringElement;
            str5 = str11;
            str6 = str10;
            str4 = str9;
            i = 1023;
        } else {
            int i7 = 0;
            boolean z = true;
            Boolean bool6 = null;
            String str14 = null;
            Float f4 = null;
            String str15 = null;
            String strDecodeStringElement2 = null;
            Float f5 = null;
            Boolean bool7 = null;
            String str16 = null;
            String str17 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool3 = bool7;
                        str7 = str16;
                        z = false;
                        bool7 = bool3;
                        str16 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 0:
                        bool3 = bool7;
                        str7 = str16;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str17);
                        i7 |= 1;
                        bool7 = bool3;
                        str16 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 1:
                        bool3 = bool7;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str16);
                        i7 |= 2;
                        str7 = str16;
                        bool7 = bool3;
                        str16 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 2:
                        bool3 = bool7;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str8);
                        i7 |= 4;
                        str7 = str16;
                        bool7 = bool3;
                        str16 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 3:
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool7);
                        i7 |= 8;
                        bool3 = bool7;
                        str7 = str16;
                        bool7 = bool3;
                        str16 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 4:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i7 |= 16;
                        bool3 = bool7;
                        str7 = str16;
                        bool7 = bool3;
                        str16 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 5:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool6);
                        i7 |= 32;
                        bool3 = bool7;
                        str7 = str16;
                        bool7 = bool3;
                        str16 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 6:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str14);
                        i7 |= 64;
                        break;
                    case 7:
                        i7 |= 128;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str15);
                        bool3 = bool7;
                        str7 = str16;
                        bool7 = bool3;
                        str16 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 8:
                        i7 |= 256;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, FloatSerializer.INSTANCE, f4);
                        bool3 = bool7;
                        str7 = str16;
                        bool7 = bool3;
                        str16 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 9:
                        i7 |= 512;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f5);
                        bool3 = bool7;
                        str7 = str16;
                        bool7 = bool3;
                        str16 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Boolean bool8 = bool7;
            String str18 = str16;
            String str19 = str17;
            bool = bool6;
            str = str14;
            f = f4;
            str2 = str15;
            str3 = strDecodeStringElement2;
            f2 = f5;
            i = i7;
            bool2 = bool8;
            str4 = str19;
            str5 = str8;
            str6 = str18;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AdBannerAppModel(i, str4, str6, str5, bool2, str3, bool, str, str2, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.AdBannerAppModel.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.AdBannerAppModel, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AdBannerAppModel adBannerAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(adBannerAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AdBannerAppModel.write$Self$OKCompliance_ok_compliance_impl(adBannerAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
