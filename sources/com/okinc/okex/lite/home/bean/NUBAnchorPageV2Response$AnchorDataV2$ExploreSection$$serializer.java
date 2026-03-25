package com.okinc.okex.lite.home.bean;

import com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class NUBAnchorPageV2Response$AnchorDataV2$ExploreSection$$serializer implements GeneratedSerializer<NUBAnchorPageV2Response.AnchorDataV2.ExploreSection> {
    public static final int $stable;
    public static final NUBAnchorPageV2Response$AnchorDataV2$ExploreSection$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NUBAnchorPageV2Response$AnchorDataV2$ExploreSection$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NUBAnchorPageV2Response$AnchorDataV2$ExploreSection$$serializer nUBAnchorPageV2Response$AnchorDataV2$ExploreSection$$serializer = new NUBAnchorPageV2Response$AnchorDataV2$ExploreSection$$serializer();
        INSTANCE = nUBAnchorPageV2Response$AnchorDataV2$ExploreSection$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.ExploreSection", nUBAnchorPageV2Response$AnchorDataV2$ExploreSection$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("darkImage", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("trackingProperties", false);
        pluginGeneratedSerialDescriptor.addElement("href", false);
        pluginGeneratedSerialDescriptor.addElement("lightImage", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, NUBAnchorPageV2Response$AnchorDataV2$ExploreSection$TrackingProperties$$serializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NUBAnchorPageV2Response.AnchorDataV2.ExploreSection deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String str;
        int i;
        String str2;
        String str3;
        NUBAnchorPageV2Response.AnchorDataV2.ExploreSection.TrackingProperties trackingProperties;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            NUBAnchorPageV2Response.AnchorDataV2.ExploreSection.TrackingProperties trackingProperties2 = (NUBAnchorPageV2Response.AnchorDataV2.ExploreSection.TrackingProperties) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, NUBAnchorPageV2Response$AnchorDataV2$ExploreSection$TrackingProperties$$serializer.INSTANCE, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            str3 = strDecodeStringElement3;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            trackingProperties = trackingProperties2;
            str4 = strDecodeStringElement4;
            i = 63;
        } else {
            int i2 = 0;
            boolean z = true;
            String strDecodeStringElement7 = null;
            NUBAnchorPageV2Response.AnchorDataV2.ExploreSection.TrackingProperties trackingProperties3 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        i2 |= 2;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        break;
                    case 2:
                        i2 |= 4;
                        trackingProperties3 = (NUBAnchorPageV2Response.AnchorDataV2.ExploreSection.TrackingProperties) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, NUBAnchorPageV2Response$AnchorDataV2$ExploreSection$TrackingProperties$$serializer.INSTANCE, trackingProperties3);
                        break;
                    case 3:
                        i2 |= 8;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i2 |= 16;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i2 |= 32;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement = strDecodeStringElement9;
            str = strDecodeStringElement2;
            i = i2;
            String str5 = strDecodeStringElement10;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement8;
            trackingProperties = trackingProperties3;
            str4 = str5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NUBAnchorPageV2Response.AnchorDataV2.ExploreSection(i, str3, str4, trackingProperties, str, str2, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NUBAnchorPageV2Response.AnchorDataV2.ExploreSection exploreSection) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(exploreSection, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NUBAnchorPageV2Response.AnchorDataV2.ExploreSection.write$Self$OKHomeLite_home_lite_api(exploreSection, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
