package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
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

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class LinkTextContentData$$serializer implements GeneratedSerializer<LinkTextContentData> {
    public static final int $stable;
    public static final LinkTextContentData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LinkTextContentData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LinkTextContentData$$serializer linkTextContentData$$serializer = new LinkTextContentData$$serializer();
        INSTANCE = linkTextContentData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextContentData", linkTextContentData$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("text", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        pluginGeneratedSerialDescriptor.addElement("relativeUriType", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.UNDERLINE, true);
        pluginGeneratedSerialDescriptor.addElement("deeplink", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_STYLE, true);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(LinkTextStyle$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CTAButton$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LinkTextContentData deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        String str;
        CTAButton cTAButton;
        LinkTextStyle linkTextStyle;
        String str2;
        int i;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 6;
        String str5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            LinkTextStyle linkTextStyle2 = (LinkTextStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LinkTextStyle$$serializer.INSTANCE, null);
            str = str9;
            cTAButton = (CTAButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, CTAButton$$serializer.INSTANCE, null);
            linkTextStyle = linkTextStyle2;
            bool = bool2;
            i = 127;
            str3 = str8;
            str2 = str6;
            str4 = str7;
        } else {
            int i3 = 0;
            boolean z = true;
            String str10 = null;
            CTAButton cTAButton2 = null;
            LinkTextStyle linkTextStyle3 = null;
            String str11 = null;
            String str12 = null;
            bool = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        break;
                    case 0:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str12);
                        i3 |= 1;
                        i2 = 6;
                        break;
                    case 1:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str10);
                        i3 |= 2;
                        i2 = 6;
                        break;
                    case 2:
                        i3 |= 4;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str11);
                        i2 = 6;
                        break;
                    case 3:
                        i3 |= 8;
                        bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool);
                        i2 = 6;
                        break;
                    case 4:
                        i3 |= 16;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str5);
                        i2 = 6;
                        break;
                    case 5:
                        i3 |= 32;
                        linkTextStyle3 = (LinkTextStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LinkTextStyle$$serializer.INSTANCE, linkTextStyle3);
                        i2 = 6;
                        break;
                    case 6:
                        i3 |= 64;
                        cTAButton2 = (CTAButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, CTAButton$$serializer.INSTANCE, cTAButton2);
                        i2 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str5;
            cTAButton = cTAButton2;
            linkTextStyle = linkTextStyle3;
            str2 = str12;
            i = i3;
            str3 = str11;
            str4 = str10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LinkTextContentData(i, str2, str4, str3, bool, str, linkTextStyle, cTAButton, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LinkTextContentData linkTextContentData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(linkTextContentData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LinkTextContentData.write$Self$OKCompliance_ok_compliance_impl(linkTextContentData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
