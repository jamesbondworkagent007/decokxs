package com.okinc.im.bean;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.im.bean.IMMessageShareModel;
import java.util.Map;
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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class IMMessageShareModel$$serializer implements GeneratedSerializer<IMMessageShareModel> {
    public static final int $stable;
    public static final IMMessageShareModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private IMMessageShareModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        IMMessageShareModel$$serializer iMMessageShareModel$$serializer = new IMMessageShareModel$$serializer();
        INSTANCE = iMMessageShareModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.im.bean.IMMessageShareModel", iMMessageShareModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement("messagePreview", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_IMAGE, true);
        pluginGeneratedSerialDescriptor.addElement("imageBase64", true);
        pluginGeneratedSerialDescriptor.addElement("deeplink", true);
        pluginGeneratedSerialDescriptor.addElement("shortLink", true);
        pluginGeneratedSerialDescriptor.addElement("tagline", true);
        pluginGeneratedSerialDescriptor.addElement("ctaType", true);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, true);
        pluginGeneratedSerialDescriptor.addElement("bizName", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = IMMessageShareModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[8]), BuiltinSerializersKt.getNullable(kSerializerArr[9]), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final IMMessageShareModel deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        Map map;
        IMMessageShareModel.CTAType cTAType;
        String str4;
        String strDecodeStringElement;
        String str5;
        String str6;
        String str7;
        String str8;
        int i;
        KSerializer[] kSerializerArr;
        String str9;
        String str10;
        String str11;
        String str12;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = IMMessageShareModel.$childSerializers;
        int i2 = 10;
        int i3 = 7;
        int i4 = 6;
        int i5 = 9;
        int i6 = 8;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            IMMessageShareModel.CTAType cTAType2 = (IMMessageShareModel.CTAType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr2[8], null);
            map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr2[9], null);
            str3 = str20;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            cTAType = cTAType2;
            str2 = str19;
            str8 = str18;
            str5 = str17;
            i = 2047;
            str = str14;
            str6 = str16;
            str7 = str15;
            str4 = str13;
        } else {
            int i7 = 0;
            boolean z = true;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            Map map2 = null;
            IMMessageShareModel.CTAType cTAType3 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        str9 = str24;
                        str10 = str25;
                        str11 = str26;
                        str12 = str27;
                        z = false;
                        kSerializerArr2 = kSerializerArr;
                        str24 = str9;
                        str25 = str10;
                        str26 = str11;
                        str27 = str12;
                        i2 = 10;
                        i3 = 7;
                        i4 = 6;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 0:
                        str9 = str24;
                        str10 = str25;
                        str11 = str26;
                        str12 = str27;
                        kSerializerArr = kSerializerArr2;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str28);
                        i7 |= 1;
                        kSerializerArr2 = kSerializerArr;
                        str24 = str9;
                        str25 = str10;
                        str26 = str11;
                        str27 = str12;
                        i2 = 10;
                        i3 = 7;
                        i4 = 6;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 1:
                        str9 = str24;
                        str10 = str25;
                        str11 = str26;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str27);
                        i7 |= 2;
                        kSerializerArr = kSerializerArr2;
                        str12 = str27;
                        kSerializerArr2 = kSerializerArr;
                        str24 = str9;
                        str25 = str10;
                        str26 = str11;
                        str27 = str12;
                        i2 = 10;
                        i3 = 7;
                        i4 = 6;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 2:
                        str9 = str24;
                        str10 = str25;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str26);
                        i7 |= 4;
                        kSerializerArr = kSerializerArr2;
                        str11 = str26;
                        str12 = str27;
                        kSerializerArr2 = kSerializerArr;
                        str24 = str9;
                        str25 = str10;
                        str26 = str11;
                        str27 = str12;
                        i2 = 10;
                        i3 = 7;
                        i4 = 6;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 3:
                        str9 = str24;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str25);
                        i7 |= 8;
                        kSerializerArr = kSerializerArr2;
                        str10 = str25;
                        str11 = str26;
                        str12 = str27;
                        kSerializerArr2 = kSerializerArr;
                        str24 = str9;
                        str25 = str10;
                        str26 = str11;
                        str27 = str12;
                        i2 = 10;
                        i3 = 7;
                        i4 = 6;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 4:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str24);
                        i7 |= 16;
                        kSerializerArr = kSerializerArr2;
                        str9 = str24;
                        str10 = str25;
                        str11 = str26;
                        str12 = str27;
                        kSerializerArr2 = kSerializerArr;
                        str24 = str9;
                        str25 = str10;
                        str26 = str11;
                        str27 = str12;
                        i2 = 10;
                        i3 = 7;
                        i4 = 6;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 5:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str22);
                        i7 |= 32;
                        kSerializerArr = kSerializerArr2;
                        str9 = str24;
                        str10 = str25;
                        str11 = str26;
                        str12 = str27;
                        kSerializerArr2 = kSerializerArr;
                        str24 = str9;
                        str25 = str10;
                        str26 = str11;
                        str27 = str12;
                        i2 = 10;
                        i3 = 7;
                        i4 = 6;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 6:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str21);
                        i7 |= 64;
                        kSerializerArr = kSerializerArr2;
                        str9 = str24;
                        str10 = str25;
                        str11 = str26;
                        str12 = str27;
                        kSerializerArr2 = kSerializerArr;
                        str24 = str9;
                        str25 = str10;
                        str26 = str11;
                        str27 = str12;
                        i2 = 10;
                        i3 = 7;
                        i4 = 6;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 7:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str23);
                        i7 |= 128;
                        kSerializerArr = kSerializerArr2;
                        str9 = str24;
                        str10 = str25;
                        str11 = str26;
                        str12 = str27;
                        kSerializerArr2 = kSerializerArr;
                        str24 = str9;
                        str25 = str10;
                        str26 = str11;
                        str27 = str12;
                        i2 = 10;
                        i3 = 7;
                        i4 = 6;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 8:
                        cTAType3 = (IMMessageShareModel.CTAType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, kSerializerArr2[i6], cTAType3);
                        i7 |= 256;
                        kSerializerArr = kSerializerArr2;
                        str9 = str24;
                        str10 = str25;
                        str11 = str26;
                        str12 = str27;
                        kSerializerArr2 = kSerializerArr;
                        str24 = str9;
                        str25 = str10;
                        str26 = str11;
                        str27 = str12;
                        i2 = 10;
                        i3 = 7;
                        i4 = 6;
                        i5 = 9;
                        i6 = 8;
                        break;
                    case 9:
                        map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kSerializerArr2[i5], map2);
                        i7 |= 512;
                        break;
                    case 10:
                        i7 |= 1024;
                        kSerializerArr = kSerializerArr2;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        str9 = str24;
                        str10 = str25;
                        str11 = str26;
                        str12 = str27;
                        kSerializerArr2 = kSerializerArr;
                        str24 = str9;
                        str25 = str10;
                        str26 = str11;
                        str27 = str12;
                        i2 = 10;
                        i3 = 7;
                        i4 = 6;
                        i5 = 9;
                        i6 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str29 = str24;
            str = str27;
            str2 = str21;
            str3 = str23;
            map = map2;
            cTAType = cTAType3;
            str4 = str28;
            strDecodeStringElement = strDecodeStringElement2;
            str5 = str29;
            str6 = str25;
            str7 = str26;
            str8 = str22;
            i = i7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new IMMessageShareModel(i, str4, str, str7, str6, str5, str8, str2, str3, cTAType, map, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull IMMessageShareModel iMMessageShareModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(iMMessageShareModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        IMMessageShareModel.write$Self$OKIM_okim_api(iMMessageShareModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
