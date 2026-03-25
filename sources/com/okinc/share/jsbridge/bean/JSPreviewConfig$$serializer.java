package com.okinc.share.jsbridge.bean;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class JSPreviewConfig$$serializer implements GeneratedSerializer<JSPreviewConfig> {
    public static final int $stable;
    public static final JSPreviewConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private JSPreviewConfig$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        JSPreviewConfig$$serializer jSPreviewConfig$$serializer = new JSPreviewConfig$$serializer();
        INSTANCE = jSPreviewConfig$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.share.jsbridge.bean.JSPreviewConfig", jSPreviewConfig$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("contentType", false);
        pluginGeneratedSerialDescriptor.addElement("previewTitle", true);
        pluginGeneratedSerialDescriptor.addElement("previewSubtitle", true);
        pluginGeneratedSerialDescriptor.addElement("imagePreviewType", true);
        pluginGeneratedSerialDescriptor.addElement("imageBottomTips", true);
        pluginGeneratedSerialDescriptor.addElement("linkPreviewImage", true);
        pluginGeneratedSerialDescriptor.addElement("linkPreviewBody", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = JSPreviewConfig.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[6])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final JSPreviewConfig deserialize(@NotNull Decoder decoder) {
        Integer num;
        CharSequence charSequence;
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        int i2;
        String str5;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = JSPreviewConfig.$childSerializers;
        int i3 = 5;
        int i4 = 3;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            charSequence = (CharSequence) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            i = iDecodeIntElement;
            str = str9;
            num = num2;
            str2 = str8;
            str4 = str7;
            i2 = 127;
            str3 = str6;
        } else {
            int iDecodeIntElement2 = 0;
            boolean z2 = true;
            Integer num3 = null;
            CharSequence charSequence2 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            int i5 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str5 = str12;
                        z = true;
                        z2 = false;
                        str12 = str5;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 0:
                        str5 = str12;
                        z = true;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i5 |= 1;
                        str12 = str5;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 1:
                        z = true;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str12);
                        i5 |= 2;
                        str12 = str5;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 2:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str13);
                        i5 |= 4;
                        break;
                    case 3:
                        i5 |= 8;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, IntSerializer.INSTANCE, num3);
                        str5 = str12;
                        z = true;
                        str12 = str5;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 4:
                        i5 |= 16;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str11);
                        str5 = str12;
                        z = true;
                        str12 = str5;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 5:
                        i5 |= 32;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str10);
                        str5 = str12;
                        z = true;
                        str12 = str5;
                        i3 = 5;
                        i4 = 3;
                        break;
                    case 6:
                        i5 |= 64;
                        charSequence2 = (CharSequence) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], charSequence2);
                        str5 = str12;
                        z = true;
                        str12 = str5;
                        i3 = 5;
                        i4 = 3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str14 = str12;
            num = num3;
            charSequence = charSequence2;
            str = str10;
            str2 = str11;
            i = iDecodeIntElement2;
            str3 = str14;
            str4 = str13;
            i2 = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new JSPreviewConfig(i2, i, str3, str4, num, str2, str, charSequence, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull JSPreviewConfig jSPreviewConfig) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(jSPreviewConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        JSPreviewConfig.write$Self$OKShare_sdk_share_impl(jSPreviewConfig, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
