package com.okinc.business.market.features.meme.preview.domain.model;

import androidx.autofill.HintConstants;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class AccountVOData$$serializer implements GeneratedSerializer<AccountVOData> {
    public static final int $stable;
    public static final AccountVOData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AccountVOData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AccountVOData$$serializer accountVOData$$serializer = new AccountVOData$$serializer();
        INSTANCE = accountVOData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.meme.preview.domain.model.AccountVOData", accountVOData$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("authorId", true);
        pluginGeneratedSerialDescriptor.addElement(HintConstants.AUTOFILL_HINT_USERNAME, true);
        pluginGeneratedSerialDescriptor.addElement("nickName", true);
        pluginGeneratedSerialDescriptor.addElement("portrait", true);
        pluginGeneratedSerialDescriptor.addElement("profileBannerUrl", true);
        pluginGeneratedSerialDescriptor.addElement("joinTime", true);
        pluginGeneratedSerialDescriptor.addElement("followerCount", true);
        pluginGeneratedSerialDescriptor.addElement("followingCount", true);
        pluginGeneratedSerialDescriptor.addElement("bio", true);
        pluginGeneratedSerialDescriptor.addElement("verified", true);
        pluginGeneratedSerialDescriptor.addElement("source", true);
        pluginGeneratedSerialDescriptor.addElement("verifiedType", true);
        pluginGeneratedSerialDescriptor.addElement("contentId", true);
        pluginGeneratedSerialDescriptor.addElement("translatedBio", true);
        pluginGeneratedSerialDescriptor.addElement("translatedLanguage", true);
        pluginGeneratedSerialDescriptor.addElement("sourceLanguage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), longSerializer, longSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(SourceData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AccountVOData deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        SourceData sourceData;
        boolean z;
        long j;
        long jDecodeLongElement;
        int i;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        SourceData sourceData2;
        String str18;
        String str19;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            SourceData sourceData3 = (SourceData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, SourceData$$serializer.INSTANCE, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            str3 = str30;
            sourceData = sourceData3;
            str6 = str27;
            z = zDecodeBooleanElement;
            str11 = str26;
            str9 = str29;
            str7 = str28;
            str = str21;
            str2 = str25;
            str4 = str24;
            str10 = str22;
            i = 65535;
            j = jDecodeLongElement2;
            str5 = str23;
            str12 = str20;
        } else {
            int i5 = 15;
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            String str31 = null;
            String str32 = null;
            String str33 = null;
            String str34 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            String str42 = null;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            SourceData sourceData4 = null;
            int i6 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str13 = str31;
                        str14 = str38;
                        str15 = str39;
                        str16 = str41;
                        str17 = str42;
                        sourceData2 = sourceData4;
                        z2 = false;
                        str39 = str15;
                        str42 = str17;
                        str41 = str16;
                        str31 = str13;
                        sourceData4 = sourceData2;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                        str38 = str14;
                        i4 = 8;
                        break;
                    case 0:
                        str14 = str38;
                        str15 = str39;
                        str16 = str41;
                        str17 = str42;
                        sourceData2 = sourceData4;
                        str13 = str31;
                        i6 |= 1;
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str40);
                        str39 = str15;
                        str42 = str17;
                        str41 = str16;
                        str31 = str13;
                        sourceData4 = sourceData2;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                        str38 = str14;
                        i4 = 8;
                        break;
                    case 1:
                        i6 |= 2;
                        sourceData4 = sourceData4;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str38);
                        i5 = 15;
                        break;
                    case 2:
                        str18 = str39;
                        i6 |= 4;
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str41);
                        str19 = str42;
                        str42 = str19;
                        str39 = str18;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 3:
                        str18 = str39;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str42);
                        i6 |= 8;
                        str42 = str19;
                        str39 = str18;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 4:
                        i6 |= 16;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str39);
                        str19 = str42;
                        str42 = str19;
                        str39 = str18;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 5:
                        i6 |= 32;
                        str18 = str39;
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str32);
                        str19 = str42;
                        str42 = str19;
                        str39 = str18;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 6:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
                        i6 |= 64;
                        str18 = str39;
                        str19 = str42;
                        str42 = str19;
                        str39 = str18;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 7:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
                        i6 |= 128;
                        str18 = str39;
                        str19 = str42;
                        str42 = str19;
                        str39 = str18;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 8:
                        i6 |= 256;
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str36);
                        str18 = str39;
                        str19 = str42;
                        str42 = str19;
                        str39 = str18;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 9:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i6 |= 512;
                        str18 = str39;
                        str19 = str42;
                        str42 = str19;
                        str39 = str18;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 10:
                        sourceData4 = (SourceData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, SourceData$$serializer.INSTANCE, sourceData4);
                        i6 |= 1024;
                        str18 = str39;
                        str19 = str42;
                        str42 = str19;
                        str39 = str18;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 11:
                        i6 |= 2048;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str34);
                        str18 = str39;
                        str19 = str42;
                        str42 = str19;
                        str39 = str18;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 12:
                        i6 |= 4096;
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str35);
                        str18 = str39;
                        str19 = str42;
                        str42 = str19;
                        str39 = str18;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 13:
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str31);
                        i6 |= 8192;
                        str18 = str39;
                        str19 = str42;
                        str42 = str19;
                        str39 = str18;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 14:
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str33);
                        i6 |= 16384;
                        str18 = str39;
                        str19 = str42;
                        str42 = str19;
                        str39 = str18;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 15:
                        i6 |= 32768;
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str37);
                        str18 = str39;
                        str19 = str42;
                        str42 = str19;
                        str39 = str18;
                        i5 = 15;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str38;
            String str43 = str41;
            SourceData sourceData5 = sourceData4;
            String str44 = str40;
            str2 = str32;
            str3 = str33;
            str4 = str39;
            str5 = str42;
            str6 = str34;
            str7 = str35;
            str8 = str37;
            str9 = str31;
            sourceData = sourceData5;
            z = zDecodeBooleanElement2;
            j = jDecodeLongElement3;
            jDecodeLongElement = jDecodeLongElement4;
            i = i6;
            str10 = str43;
            str11 = str36;
            str12 = str44;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AccountVOData(i, str12, str, str10, str5, str4, str2, jDecodeLongElement, j, str11, z, sourceData, str6, str7, str9, str3, str8, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AccountVOData accountVOData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(accountVOData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AccountVOData.write$Self$OKDex_dex_impl(accountVOData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
