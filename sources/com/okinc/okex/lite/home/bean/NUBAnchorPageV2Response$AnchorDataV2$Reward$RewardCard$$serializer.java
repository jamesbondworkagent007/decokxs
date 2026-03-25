package com.okinc.okex.lite.home.bean;

import com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class NUBAnchorPageV2Response$AnchorDataV2$Reward$RewardCard$$serializer implements GeneratedSerializer<NUBAnchorPageV2Response.AnchorDataV2.Reward.RewardCard> {
    public static final int $stable;
    public static final NUBAnchorPageV2Response$AnchorDataV2$Reward$RewardCard$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NUBAnchorPageV2Response$AnchorDataV2$Reward$RewardCard$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NUBAnchorPageV2Response$AnchorDataV2$Reward$RewardCard$$serializer nUBAnchorPageV2Response$AnchorDataV2$Reward$RewardCard$$serializer = new NUBAnchorPageV2Response$AnchorDataV2$Reward$RewardCard$$serializer();
        INSTANCE = nUBAnchorPageV2Response$AnchorDataV2$Reward$RewardCard$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.Reward.RewardCard", nUBAnchorPageV2Response$AnchorDataV2$Reward$RewardCard$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("bottomText", false);
        pluginGeneratedSerialDescriptor.addElement("href", false);
        pluginGeneratedSerialDescriptor.addElement("mainDescription", false);
        pluginGeneratedSerialDescriptor.addElement("rewardAmount", false);
        pluginGeneratedSerialDescriptor.addElement("topText", false);
        pluginGeneratedSerialDescriptor.addElement("trackingProperties", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), NUBAnchorPageV2Response$AnchorDataV2$Reward$RewardCard$TrackingProperties$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NUBAnchorPageV2Response.AnchorDataV2.Reward.RewardCard deserialize(@NotNull Decoder decoder) {
        NUBAnchorPageV2Response.AnchorDataV2.Reward.RewardCard.TrackingProperties trackingProperties;
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, null);
            str3 = strDecodeStringElement2;
            trackingProperties = (NUBAnchorPageV2Response.AnchorDataV2.Reward.RewardCard.TrackingProperties) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, NUBAnchorPageV2Response$AnchorDataV2$Reward$RewardCard$TrackingProperties$$serializer.INSTANCE, null);
            str = strDecodeStringElement5;
            str2 = str6;
            str4 = strDecodeStringElement4;
            str5 = strDecodeStringElement3;
            i = 63;
        } else {
            int i2 = 0;
            boolean z = true;
            String str7 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            NUBAnchorPageV2Response.AnchorDataV2.Reward.RewardCard.TrackingProperties trackingProperties2 = null;
            String strDecodeStringElement8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        i2 |= 2;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        break;
                    case 2:
                        i2 |= 4;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        i2 |= 8;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i2 |= 16;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str7);
                        break;
                    case 5:
                        i2 |= 32;
                        trackingProperties2 = (NUBAnchorPageV2Response.AnchorDataV2.Reward.RewardCard.TrackingProperties) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, NUBAnchorPageV2Response$AnchorDataV2$Reward$RewardCard$TrackingProperties$$serializer.INSTANCE, trackingProperties2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            trackingProperties = trackingProperties2;
            str = strDecodeStringElement;
            i = i2;
            String str8 = strDecodeStringElement8;
            str2 = str7;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement6;
            str5 = str8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NUBAnchorPageV2Response.AnchorDataV2.Reward.RewardCard(i, str3, str5, str4, str, str2, trackingProperties, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NUBAnchorPageV2Response.AnchorDataV2.Reward.RewardCard rewardCard) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(rewardCard, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NUBAnchorPageV2Response.AnchorDataV2.Reward.RewardCard.write$Self$OKHomeLite_home_lite_api(rewardCard, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
