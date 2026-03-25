package com.okinc.crcore.coreapi.net.responsebean.dex;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.search.bean.SearchResultContentPo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class SocialMedia$$serializer implements GeneratedSerializer<SocialMedia> {
    public static final int $stable;
    public static final SocialMedia$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SocialMedia$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SocialMedia$$serializer socialMedia$$serializer = new SocialMedia$$serializer();
        INSTANCE = socialMedia$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.dex.SocialMedia", socialMedia$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("discord", true);
        pluginGeneratedSerialDescriptor.addElement("facebook", true);
        pluginGeneratedSerialDescriptor.addElement("github", true);
        pluginGeneratedSerialDescriptor.addElement("medium", true);
        pluginGeneratedSerialDescriptor.addElement("officialWebsite", true);
        pluginGeneratedSerialDescriptor.addElement("reddit", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.SCORE, true);
        pluginGeneratedSerialDescriptor.addElement("telegram", true);
        pluginGeneratedSerialDescriptor.addElement(SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER, true);
        pluginGeneratedSerialDescriptor.addElement("twitterDetailInfo", true);
        pluginGeneratedSerialDescriptor.addElement("twitterLinkType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, TwitterDetailInfo$$serializer.INSTANCE, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SocialMedia deserialize(@NotNull Decoder decoder) {
        TwitterDetailInfo twitterDetailInfo;
        String str;
        String strDecodeStringElement;
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
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            TwitterDetailInfo twitterDetailInfo2 = (TwitterDetailInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, TwitterDetailInfo$$serializer.INSTANCE, null);
            str5 = strDecodeStringElement3;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            twitterDetailInfo = twitterDetailInfo2;
            str = strDecodeStringElement12;
            str7 = strDecodeStringElement10;
            str3 = strDecodeStringElement9;
            str4 = strDecodeStringElement8;
            str2 = strDecodeStringElement6;
            str10 = strDecodeStringElement11;
            str8 = strDecodeStringElement7;
            str6 = strDecodeStringElement5;
            str9 = strDecodeStringElement4;
            i = 4095;
        } else {
            int i3 = 0;
            boolean z = true;
            TwitterDetailInfo twitterDetailInfo3 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 11;
                        break;
                    case 0:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 11;
                        break;
                    case 1:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 = 11;
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 = 11;
                        break;
                    case 4:
                        i3 |= 16;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = 11;
                        break;
                    case 5:
                        i3 |= 32;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 = 11;
                        break;
                    case 6:
                        i3 |= 64;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 = 11;
                        break;
                    case 7:
                        i3 |= 128;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i2 = 11;
                        break;
                    case 8:
                        i3 |= 256;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 = 11;
                        break;
                    case 9:
                        i3 |= 512;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i2 = 11;
                        break;
                    case 10:
                        twitterDetailInfo3 = (TwitterDetailInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, TwitterDetailInfo$$serializer.INSTANCE, twitterDetailInfo3);
                        i3 |= 1024;
                        i2 = 11;
                        break;
                    case 11:
                        i3 |= 2048;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i2 = 11;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            twitterDetailInfo = twitterDetailInfo3;
            str = strDecodeStringElement13;
            strDecodeStringElement = strDecodeStringElement17;
            str2 = strDecodeStringElement20;
            i = i3;
            str3 = strDecodeStringElement19;
            str4 = strDecodeStringElement14;
            str5 = strDecodeStringElement16;
            str6 = strDecodeStringElement21;
            str7 = strDecodeStringElement18;
            str8 = strDecodeStringElement15;
            str9 = strDecodeStringElement22;
            str10 = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SocialMedia(i, str5, str9, str6, str2, str8, str4, str3, str7, str10, str, twitterDetailInfo, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SocialMedia socialMedia) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(socialMedia, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SocialMedia.write$Self$OKCRCore_cr_core(socialMedia, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
