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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class TwitterV2User$$serializer implements GeneratedSerializer<TwitterV2User> {
    public static final int $stable;
    public static final TwitterV2User$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TwitterV2User$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TwitterV2User$$serializer twitterV2User$$serializer = new TwitterV2User$$serializer();
        INSTANCE = twitterV2User$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.meme.preview.domain.model.TwitterV2User", twitterV2User$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("followersCount", true);
        pluginGeneratedSerialDescriptor.addElement("idStr", true);
        pluginGeneratedSerialDescriptor.addElement("joinTime", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("profileImageUrlHttps", true);
        pluginGeneratedSerialDescriptor.addElement("screenName", true);
        pluginGeneratedSerialDescriptor.addElement("verified", true);
        pluginGeneratedSerialDescriptor.addElement("verifiedType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TwitterV2User deserialize(@NotNull Decoder decoder) {
        String str;
        boolean z;
        String str2;
        String str3;
        long j;
        String str4;
        String str5;
        int i;
        String str6;
        String str7;
        boolean z2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        int i3 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            z = zDecodeBooleanElement;
            str3 = str12;
            str4 = str10;
            str5 = str11;
            str = str9;
            str6 = str8;
            j = jDecodeLongElement;
            i = 255;
        } else {
            int i4 = 0;
            boolean z3 = true;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            long jDecodeLongElement2 = 0;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            boolean zDecodeBooleanElement2 = false;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str7 = str15;
                        z2 = true;
                        z3 = false;
                        str15 = str7;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 0:
                        str7 = str15;
                        z2 = true;
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i4 |= 1;
                        str15 = str7;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 1:
                        z2 = true;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str15);
                        i4 |= 2;
                        str15 = str7;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 2:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str16);
                        i4 |= 4;
                        break;
                    case 3:
                        i4 |= 8;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str17);
                        str7 = str15;
                        z2 = true;
                        str15 = str7;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 4:
                        i4 |= 16;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str14);
                        str7 = str15;
                        z2 = true;
                        str15 = str7;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 5:
                        i4 |= 32;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str13);
                        str7 = str15;
                        z2 = true;
                        str15 = str7;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 6:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i4 |= 64;
                        str7 = str15;
                        z2 = true;
                        str15 = str7;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 7:
                        i4 |= 128;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str18);
                        str7 = str15;
                        z2 = true;
                        str15 = str7;
                        i2 = 7;
                        i3 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str19 = str15;
            str = str16;
            z = zDecodeBooleanElement2;
            str2 = str18;
            str3 = str13;
            j = jDecodeLongElement2;
            str4 = str17;
            str5 = str14;
            i = i4;
            str6 = str19;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TwitterV2User(i, j, str6, str, str4, str5, str3, z, str2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TwitterV2User twitterV2User) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(twitterV2User, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TwitterV2User.write$Self$OKDex_dex_impl(twitterV2User, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
