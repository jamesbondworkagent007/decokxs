package com.okinc.business.market.features.meme.preview.domain.model;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class CommunityVOData$$serializer implements GeneratedSerializer<CommunityVOData> {
    public static final int $stable;
    public static final CommunityVOData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CommunityVOData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CommunityVOData$$serializer communityVOData$$serializer = new CommunityVOData$$serializer();
        INSTANCE = communityVOData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.meme.preview.domain.model.CommunityVOData", communityVOData$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("sourceId", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("access", true);
        pluginGeneratedSerialDescriptor.addElement("memberCount", true);
        pluginGeneratedSerialDescriptor.addElement("joinPolicy", true);
        pluginGeneratedSerialDescriptor.addElement("createdAt", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        pluginGeneratedSerialDescriptor.addElement("contentId", true);
        pluginGeneratedSerialDescriptor.addElement("translatedDescription", true);
        pluginGeneratedSerialDescriptor.addElement("translatedLanguage", true);
        pluginGeneratedSerialDescriptor.addElement("sourceLanguage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), longSerializer, BuiltinSerializersKt.getNullable(stringSerializer), longSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CommunityVOData deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        long j;
        long jDecodeLongElement;
        String str5;
        String str6;
        int i;
        String str7;
        long j2;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 11;
        int i4 = 10;
        int i5 = 9;
        int i6 = 7;
        String str13 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            str9 = str21;
            str = str20;
            str3 = str19;
            str4 = strDecodeStringElement;
            str5 = str16;
            i = 8191;
            str7 = str18;
            str2 = str17;
            j2 = jDecodeLongElement2;
            j = jDecodeLongElement3;
            str10 = str15;
            str6 = str14;
        } else {
            int i7 = 12;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String strDecodeStringElement2 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            int i8 = 0;
            boolean z = true;
            long jDecodeLongElement4 = 0;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            String str28 = null;
            String str29 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str11 = str25;
                        str12 = str26;
                        z = false;
                        str25 = str11;
                        str26 = str12;
                        i7 = 12;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 0:
                        str11 = str25;
                        str12 = str26;
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i8 |= 1;
                        str25 = str11;
                        str26 = str12;
                        i7 = 12;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 1:
                        str11 = str25;
                        str12 = str26;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str27);
                        i8 |= 2;
                        str25 = str11;
                        str26 = str12;
                        i7 = 12;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 2:
                        str11 = str25;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str26);
                        i8 |= 4;
                        str12 = str26;
                        str25 = str11;
                        str26 = str12;
                        i7 = 12;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 3:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str25);
                        i2 = i8 | 8;
                        i8 = i2;
                        str11 = str25;
                        str12 = str26;
                        str25 = str11;
                        str26 = str12;
                        i7 = 12;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 4:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str24);
                        i2 = i8 | 16;
                        i8 = i2;
                        str11 = str25;
                        str12 = str26;
                        str25 = str11;
                        str26 = str12;
                        i7 = 12;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 5:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i8 |= 32;
                        str11 = str25;
                        str12 = str26;
                        str25 = str11;
                        str26 = str12;
                        i7 = 12;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 6:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str23);
                        i8 |= 64;
                        str11 = str25;
                        str12 = str26;
                        str25 = str11;
                        str26 = str12;
                        i7 = 12;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 7:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i6);
                        i8 |= 128;
                        str11 = str25;
                        str12 = str26;
                        str25 = str11;
                        str26 = str12;
                        i7 = 12;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        break;
                    case 8:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i8 |= 256;
                        break;
                    case 9:
                        i8 |= 512;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str29);
                        break;
                    case 10:
                        i8 |= 1024;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str22);
                        break;
                    case 11:
                        i8 |= 2048;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str28);
                        break;
                    case 12:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i7, StringSerializer.INSTANCE, str13);
                        i8 |= 4096;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str30 = str25;
            String str31 = str26;
            String str32 = str27;
            str = str22;
            str2 = str24;
            str3 = str29;
            str4 = strDecodeStringElement2;
            j = jDecodeLongElement5;
            jDecodeLongElement = jDecodeLongElement6;
            str5 = str30;
            str6 = str32;
            i = i8;
            str7 = str23;
            j2 = jDecodeLongElement4;
            str8 = str13;
            str9 = str28;
            str10 = str31;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CommunityVOData(i, j2, str6, str10, str5, str2, j, str7, jDecodeLongElement, str4, str3, str, str9, str8, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CommunityVOData communityVOData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(communityVOData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CommunityVOData.write$Self$OKDex_dex_impl(communityVOData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
