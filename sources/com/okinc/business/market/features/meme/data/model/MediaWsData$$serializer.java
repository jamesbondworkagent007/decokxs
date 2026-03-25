package com.okinc.business.market.features.meme.data.model;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class MediaWsData$$serializer implements GeneratedSerializer<MediaWsData> {
    public static final int $stable;
    public static final MediaWsData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MediaWsData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MediaWsData$$serializer mediaWsData$$serializer = new MediaWsData$$serializer();
        INSTANCE = mediaWsData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.meme.data.model.MediaWsData", mediaWsData$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("tg", true);
        pluginGeneratedSerialDescriptor.addElement("web", true);
        pluginGeneratedSerialDescriptor.addElement("x", true);
        pluginGeneratedSerialDescriptor.addElement("youtb", true);
        pluginGeneratedSerialDescriptor.addElement("facebook", true);
        pluginGeneratedSerialDescriptor.addElement("twitch", true);
        pluginGeneratedSerialDescriptor.addElement("insta", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_TT, true);
        pluginGeneratedSerialDescriptor.addElement("discord", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(XMediaWsData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(YoutubeMediaWsData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FacebookMediaWsData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(TwitchMediaWsData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(InstagramMediaWsData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(TikTokMediaWsData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(DiscordMediaWsData$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MediaWsData deserialize(@NotNull Decoder decoder) {
        int i;
        DiscordMediaWsData discordMediaWsData;
        TikTokMediaWsData tikTokMediaWsData;
        InstagramMediaWsData instagramMediaWsData;
        TwitchMediaWsData twitchMediaWsData;
        XMediaWsData xMediaWsData;
        YoutubeMediaWsData youtubeMediaWsData;
        String strDecodeStringElement;
        FacebookMediaWsData facebookMediaWsData;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        XMediaWsData xMediaWsData2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            XMediaWsData xMediaWsData3 = (XMediaWsData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, XMediaWsData$$serializer.INSTANCE, null);
            YoutubeMediaWsData youtubeMediaWsData2 = (YoutubeMediaWsData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, YoutubeMediaWsData$$serializer.INSTANCE, null);
            FacebookMediaWsData facebookMediaWsData2 = (FacebookMediaWsData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FacebookMediaWsData$$serializer.INSTANCE, null);
            TwitchMediaWsData twitchMediaWsData2 = (TwitchMediaWsData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, TwitchMediaWsData$$serializer.INSTANCE, null);
            InstagramMediaWsData instagramMediaWsData2 = (InstagramMediaWsData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, InstagramMediaWsData$$serializer.INSTANCE, null);
            tikTokMediaWsData = (TikTokMediaWsData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, TikTokMediaWsData$$serializer.INSTANCE, null);
            instagramMediaWsData = instagramMediaWsData2;
            twitchMediaWsData = twitchMediaWsData2;
            youtubeMediaWsData = youtubeMediaWsData2;
            discordMediaWsData = (DiscordMediaWsData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, DiscordMediaWsData$$serializer.INSTANCE, null);
            facebookMediaWsData = facebookMediaWsData2;
            i = 511;
            xMediaWsData = xMediaWsData3;
            str = strDecodeStringElement2;
        } else {
            int i3 = 0;
            boolean z = true;
            FacebookMediaWsData facebookMediaWsData3 = null;
            InstagramMediaWsData instagramMediaWsData3 = null;
            TwitchMediaWsData twitchMediaWsData3 = null;
            YoutubeMediaWsData youtubeMediaWsData3 = null;
            DiscordMediaWsData discordMediaWsData2 = null;
            TikTokMediaWsData tikTokMediaWsData2 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        break;
                    case 0:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 7;
                        break;
                    case 1:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 7;
                        break;
                    case 2:
                        xMediaWsData2 = (XMediaWsData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, XMediaWsData$$serializer.INSTANCE, xMediaWsData2);
                        i3 |= 4;
                        i2 = 7;
                        break;
                    case 3:
                        youtubeMediaWsData3 = (YoutubeMediaWsData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, YoutubeMediaWsData$$serializer.INSTANCE, youtubeMediaWsData3);
                        i3 |= 8;
                        i2 = 7;
                        break;
                    case 4:
                        facebookMediaWsData3 = (FacebookMediaWsData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FacebookMediaWsData$$serializer.INSTANCE, facebookMediaWsData3);
                        i3 |= 16;
                        i2 = 7;
                        break;
                    case 5:
                        twitchMediaWsData3 = (TwitchMediaWsData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, TwitchMediaWsData$$serializer.INSTANCE, twitchMediaWsData3);
                        i3 |= 32;
                        break;
                    case 6:
                        i3 |= 64;
                        instagramMediaWsData3 = (InstagramMediaWsData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, InstagramMediaWsData$$serializer.INSTANCE, instagramMediaWsData3);
                        i2 = 7;
                        break;
                    case 7:
                        i3 |= 128;
                        tikTokMediaWsData2 = (TikTokMediaWsData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, TikTokMediaWsData$$serializer.INSTANCE, tikTokMediaWsData2);
                        i2 = 7;
                        break;
                    case 8:
                        i3 |= 256;
                        discordMediaWsData2 = (DiscordMediaWsData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, DiscordMediaWsData$$serializer.INSTANCE, discordMediaWsData2);
                        i2 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            discordMediaWsData = discordMediaWsData2;
            tikTokMediaWsData = tikTokMediaWsData2;
            instagramMediaWsData = instagramMediaWsData3;
            twitchMediaWsData = twitchMediaWsData3;
            xMediaWsData = xMediaWsData2;
            youtubeMediaWsData = youtubeMediaWsData3;
            strDecodeStringElement = strDecodeStringElement3;
            facebookMediaWsData = facebookMediaWsData3;
            str = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MediaWsData(i, str, strDecodeStringElement, xMediaWsData, youtubeMediaWsData, facebookMediaWsData, twitchMediaWsData, instagramMediaWsData, tikTokMediaWsData, discordMediaWsData, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MediaWsData mediaWsData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(mediaWsData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MediaWsData.write$Self$OKDex_dex_impl(mediaWsData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
