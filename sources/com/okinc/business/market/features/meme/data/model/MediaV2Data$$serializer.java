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
public final /* synthetic */ class MediaV2Data$$serializer implements GeneratedSerializer<MediaV2Data> {
    public static final int $stable;
    public static final MediaV2Data$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MediaV2Data$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MediaV2Data$$serializer mediaV2Data$$serializer = new MediaV2Data$$serializer();
        INSTANCE = mediaV2Data$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.meme.data.model.MediaV2Data", mediaV2Data$$serializer, 9);
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
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(XMediaV2Data$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(YoutubeMediaV2Data$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FacebookMediaV2Data$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(TwitchMediaV2Data$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(InstagramMediaV2Data$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(TikTokMediaV2Data$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(DiscordMediaV2Data$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MediaV2Data deserialize(@NotNull Decoder decoder) {
        int i;
        DiscordMediaV2Data discordMediaV2Data;
        TikTokMediaV2Data tikTokMediaV2Data;
        InstagramMediaV2Data instagramMediaV2Data;
        TwitchMediaV2Data twitchMediaV2Data;
        XMediaV2Data xMediaV2Data;
        YoutubeMediaV2Data youtubeMediaV2Data;
        String strDecodeStringElement;
        FacebookMediaV2Data facebookMediaV2Data;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        XMediaV2Data xMediaV2Data2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            XMediaV2Data xMediaV2Data3 = (XMediaV2Data) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, XMediaV2Data$$serializer.INSTANCE, null);
            YoutubeMediaV2Data youtubeMediaV2Data2 = (YoutubeMediaV2Data) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, YoutubeMediaV2Data$$serializer.INSTANCE, null);
            FacebookMediaV2Data facebookMediaV2Data2 = (FacebookMediaV2Data) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FacebookMediaV2Data$$serializer.INSTANCE, null);
            TwitchMediaV2Data twitchMediaV2Data2 = (TwitchMediaV2Data) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, TwitchMediaV2Data$$serializer.INSTANCE, null);
            InstagramMediaV2Data instagramMediaV2Data2 = (InstagramMediaV2Data) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, InstagramMediaV2Data$$serializer.INSTANCE, null);
            tikTokMediaV2Data = (TikTokMediaV2Data) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, TikTokMediaV2Data$$serializer.INSTANCE, null);
            instagramMediaV2Data = instagramMediaV2Data2;
            twitchMediaV2Data = twitchMediaV2Data2;
            youtubeMediaV2Data = youtubeMediaV2Data2;
            discordMediaV2Data = (DiscordMediaV2Data) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, DiscordMediaV2Data$$serializer.INSTANCE, null);
            facebookMediaV2Data = facebookMediaV2Data2;
            i = 511;
            xMediaV2Data = xMediaV2Data3;
            str = strDecodeStringElement2;
        } else {
            int i3 = 0;
            boolean z = true;
            FacebookMediaV2Data facebookMediaV2Data3 = null;
            InstagramMediaV2Data instagramMediaV2Data3 = null;
            TwitchMediaV2Data twitchMediaV2Data3 = null;
            YoutubeMediaV2Data youtubeMediaV2Data3 = null;
            DiscordMediaV2Data discordMediaV2Data2 = null;
            TikTokMediaV2Data tikTokMediaV2Data2 = null;
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
                        xMediaV2Data2 = (XMediaV2Data) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, XMediaV2Data$$serializer.INSTANCE, xMediaV2Data2);
                        i3 |= 4;
                        i2 = 7;
                        break;
                    case 3:
                        youtubeMediaV2Data3 = (YoutubeMediaV2Data) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, YoutubeMediaV2Data$$serializer.INSTANCE, youtubeMediaV2Data3);
                        i3 |= 8;
                        i2 = 7;
                        break;
                    case 4:
                        facebookMediaV2Data3 = (FacebookMediaV2Data) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FacebookMediaV2Data$$serializer.INSTANCE, facebookMediaV2Data3);
                        i3 |= 16;
                        i2 = 7;
                        break;
                    case 5:
                        twitchMediaV2Data3 = (TwitchMediaV2Data) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, TwitchMediaV2Data$$serializer.INSTANCE, twitchMediaV2Data3);
                        i3 |= 32;
                        break;
                    case 6:
                        i3 |= 64;
                        instagramMediaV2Data3 = (InstagramMediaV2Data) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, InstagramMediaV2Data$$serializer.INSTANCE, instagramMediaV2Data3);
                        i2 = 7;
                        break;
                    case 7:
                        i3 |= 128;
                        tikTokMediaV2Data2 = (TikTokMediaV2Data) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, TikTokMediaV2Data$$serializer.INSTANCE, tikTokMediaV2Data2);
                        i2 = 7;
                        break;
                    case 8:
                        i3 |= 256;
                        discordMediaV2Data2 = (DiscordMediaV2Data) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, DiscordMediaV2Data$$serializer.INSTANCE, discordMediaV2Data2);
                        i2 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            discordMediaV2Data = discordMediaV2Data2;
            tikTokMediaV2Data = tikTokMediaV2Data2;
            instagramMediaV2Data = instagramMediaV2Data3;
            twitchMediaV2Data = twitchMediaV2Data3;
            xMediaV2Data = xMediaV2Data2;
            youtubeMediaV2Data = youtubeMediaV2Data3;
            strDecodeStringElement = strDecodeStringElement3;
            facebookMediaV2Data = facebookMediaV2Data3;
            str = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MediaV2Data(i, str, strDecodeStringElement, xMediaV2Data, youtubeMediaV2Data, facebookMediaV2Data, twitchMediaV2Data, instagramMediaV2Data, tikTokMediaV2Data, discordMediaV2Data, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MediaV2Data mediaV2Data) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(mediaV2Data, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MediaV2Data.write$Self$OKDex_dex_impl(mediaV2Data, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
