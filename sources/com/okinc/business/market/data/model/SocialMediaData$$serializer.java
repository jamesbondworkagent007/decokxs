package com.okinc.business.market.data.model;

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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class SocialMediaData$$serializer implements GeneratedSerializer<SocialMediaData> {
    public static final int $stable;
    public static final SocialMediaData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SocialMediaData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SocialMediaData$$serializer socialMediaData$$serializer = new SocialMediaData$$serializer();
        INSTANCE = socialMediaData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.SocialMediaData", socialMediaData$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("facebook", true);
        pluginGeneratedSerialDescriptor.addElement(SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER, true);
        pluginGeneratedSerialDescriptor.addElement("github", true);
        pluginGeneratedSerialDescriptor.addElement("reddit", true);
        pluginGeneratedSerialDescriptor.addElement("medium", true);
        pluginGeneratedSerialDescriptor.addElement("telegram", true);
        pluginGeneratedSerialDescriptor.addElement("discord", true);
        pluginGeneratedSerialDescriptor.addElement("officialWebsite", true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.SCORE, true);
        pluginGeneratedSerialDescriptor.addElement("twitterDetailInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, TwitterDetailInfo$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SocialMediaData deserialize(@NotNull Decoder decoder) {
        TwitterDetailInfo twitterDetailInfo;
        String str;
        String str2;
        String str3;
        int i;
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
        int i2 = 10;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            str3 = strDecodeStringElement2;
            twitterDetailInfo = (TwitterDetailInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, TwitterDetailInfo$$serializer.INSTANCE, null);
            str2 = strDecodeStringElement11;
            str10 = strDecodeStringElement9;
            str6 = strDecodeStringElement8;
            str7 = strDecodeStringElement7;
            str4 = strDecodeStringElement5;
            str = strDecodeStringElement10;
            str8 = strDecodeStringElement6;
            str5 = strDecodeStringElement4;
            str9 = strDecodeStringElement3;
            i = 2047;
        } else {
            int i3 = 0;
            boolean z = true;
            TwitterDetailInfo twitterDetailInfo2 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 10;
                        break;
                    case 0:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 10;
                        break;
                    case 1:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 = 10;
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 = 10;
                        break;
                    case 4:
                        i3 |= 16;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = 10;
                        break;
                    case 5:
                        i3 |= 32;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 = 10;
                        break;
                    case 6:
                        i3 |= 64;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 = 10;
                        break;
                    case 7:
                        i3 |= 128;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i2 = 10;
                        break;
                    case 8:
                        i3 |= 256;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 = 10;
                        break;
                    case 9:
                        i3 |= 512;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i2 = 10;
                        break;
                    case 10:
                        twitterDetailInfo2 = (TwitterDetailInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i2, TwitterDetailInfo$$serializer.INSTANCE, twitterDetailInfo2);
                        i3 |= 1024;
                        i2 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            twitterDetailInfo = twitterDetailInfo2;
            str = strDecodeStringElement12;
            str2 = strDecodeStringElement13;
            str3 = strDecodeStringElement16;
            i = i3;
            str4 = strDecodeStringElement15;
            str5 = strDecodeStringElement19;
            str6 = strDecodeStringElement18;
            str7 = strDecodeStringElement;
            String str11 = strDecodeStringElement17;
            str8 = strDecodeStringElement14;
            str9 = strDecodeStringElement20;
            str10 = str11;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SocialMediaData(i, str3, str9, str5, str4, str8, str7, str6, str10, str, str2, twitterDetailInfo, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SocialMediaData socialMediaData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(socialMediaData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SocialMediaData.KWHzl(socialMediaData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
