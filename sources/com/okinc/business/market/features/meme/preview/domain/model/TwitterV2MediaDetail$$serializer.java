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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class TwitterV2MediaDetail$$serializer implements GeneratedSerializer<TwitterV2MediaDetail> {
    public static final int $stable;
    public static final TwitterV2MediaDetail$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TwitterV2MediaDetail$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TwitterV2MediaDetail$$serializer twitterV2MediaDetail$$serializer = new TwitterV2MediaDetail$$serializer();
        INSTANCE = twitterV2MediaDetail$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.meme.preview.domain.model.TwitterV2MediaDetail", twitterV2MediaDetail$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("mediaUrlHttps", true);
        pluginGeneratedSerialDescriptor.addElement("originalInfo", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("videoInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(TwitterV2MediaOriginalInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(TwitterV2VideoInfo$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TwitterV2MediaDetail deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        TwitterV2VideoInfo twitterV2VideoInfo;
        TwitterV2MediaOriginalInfo twitterV2MediaOriginalInfo;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            TwitterV2MediaOriginalInfo twitterV2MediaOriginalInfo2 = (TwitterV2MediaOriginalInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, TwitterV2MediaOriginalInfo$$serializer.INSTANCE, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            twitterV2VideoInfo = (TwitterV2VideoInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, TwitterV2VideoInfo$$serializer.INSTANCE, null);
            i = 15;
            str2 = str4;
            twitterV2MediaOriginalInfo = twitterV2MediaOriginalInfo2;
        } else {
            int i2 = 0;
            boolean z = true;
            TwitterV2VideoInfo twitterV2VideoInfo2 = null;
            TwitterV2MediaOriginalInfo twitterV2MediaOriginalInfo3 = null;
            String str5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str5);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    twitterV2MediaOriginalInfo3 = (TwitterV2MediaOriginalInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, TwitterV2MediaOriginalInfo$$serializer.INSTANCE, twitterV2MediaOriginalInfo3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    twitterV2VideoInfo2 = (TwitterV2VideoInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, TwitterV2VideoInfo$$serializer.INSTANCE, twitterV2VideoInfo2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str3;
            twitterV2VideoInfo = twitterV2VideoInfo2;
            twitterV2MediaOriginalInfo = twitterV2MediaOriginalInfo3;
            str2 = str5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TwitterV2MediaDetail(i, str2, twitterV2MediaOriginalInfo, str, twitterV2VideoInfo, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TwitterV2MediaDetail twitterV2MediaDetail) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(twitterV2MediaDetail, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TwitterV2MediaDetail.write$Self$OKDex_dex_impl(twitterV2MediaDetail, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
