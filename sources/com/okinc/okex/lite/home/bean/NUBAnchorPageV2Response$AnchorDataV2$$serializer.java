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
public final /* synthetic */ class NUBAnchorPageV2Response$AnchorDataV2$$serializer implements GeneratedSerializer<NUBAnchorPageV2Response.AnchorDataV2> {
    public static final int $stable;
    public static final NUBAnchorPageV2Response$AnchorDataV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NUBAnchorPageV2Response$AnchorDataV2$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NUBAnchorPageV2Response$AnchorDataV2$$serializer nUBAnchorPageV2Response$AnchorDataV2$$serializer = new NUBAnchorPageV2Response$AnchorDataV2$$serializer();
        INSTANCE = nUBAnchorPageV2Response$AnchorDataV2$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2", nUBAnchorPageV2Response$AnchorDataV2$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("checklist", false);
        pluginGeneratedSerialDescriptor.addElement("ctaButton", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("explore", false);
        pluginGeneratedSerialDescriptor.addElement("needHelp", false);
        pluginGeneratedSerialDescriptor.addElement("reward", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("trackingProperties", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{NUBAnchorPageV2Response$AnchorDataV2$Checklist$$serializer.INSTANCE, NUBAnchorPageV2Response$AnchorDataV2$CtaButton$$serializer.INSTANCE, NUBAnchorPageV2Response$AnchorDataV2$Description$$serializer.INSTANCE, NUBAnchorPageV2Response$AnchorDataV2$Explore$$serializer.INSTANCE, NUBAnchorPageV2Response$AnchorDataV2$NeedHelp$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(NUBAnchorPageV2Response$AnchorDataV2$Reward$$serializer.INSTANCE), StringSerializer.INSTANCE, NUBAnchorPageV2Response$AnchorDataV2$AnchorTrackingProperties$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NUBAnchorPageV2Response.AnchorDataV2 deserialize(@NotNull Decoder decoder) {
        NUBAnchorPageV2Response.AnchorDataV2.AnchorTrackingProperties anchorTrackingProperties;
        String str;
        NUBAnchorPageV2Response.AnchorDataV2.Reward reward;
        NUBAnchorPageV2Response.AnchorDataV2.Checklist checklist;
        NUBAnchorPageV2Response.AnchorDataV2.CtaButton ctaButton;
        NUBAnchorPageV2Response.AnchorDataV2.Description description;
        int i;
        NUBAnchorPageV2Response.AnchorDataV2.NeedHelp needHelp;
        NUBAnchorPageV2Response.AnchorDataV2.Explore explore;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        int i3 = 6;
        NUBAnchorPageV2Response.AnchorDataV2.AnchorTrackingProperties anchorTrackingProperties2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            NUBAnchorPageV2Response.AnchorDataV2.Checklist checklist2 = (NUBAnchorPageV2Response.AnchorDataV2.Checklist) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, NUBAnchorPageV2Response$AnchorDataV2$Checklist$$serializer.INSTANCE, null);
            NUBAnchorPageV2Response.AnchorDataV2.CtaButton ctaButton2 = (NUBAnchorPageV2Response.AnchorDataV2.CtaButton) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, NUBAnchorPageV2Response$AnchorDataV2$CtaButton$$serializer.INSTANCE, null);
            NUBAnchorPageV2Response.AnchorDataV2.Description description2 = (NUBAnchorPageV2Response.AnchorDataV2.Description) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, NUBAnchorPageV2Response$AnchorDataV2$Description$$serializer.INSTANCE, null);
            NUBAnchorPageV2Response.AnchorDataV2.Explore explore2 = (NUBAnchorPageV2Response.AnchorDataV2.Explore) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, NUBAnchorPageV2Response$AnchorDataV2$Explore$$serializer.INSTANCE, null);
            NUBAnchorPageV2Response.AnchorDataV2.NeedHelp needHelp2 = (NUBAnchorPageV2Response.AnchorDataV2.NeedHelp) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, NUBAnchorPageV2Response$AnchorDataV2$NeedHelp$$serializer.INSTANCE, null);
            NUBAnchorPageV2Response.AnchorDataV2.Reward reward2 = (NUBAnchorPageV2Response.AnchorDataV2.Reward) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, NUBAnchorPageV2Response$AnchorDataV2$Reward$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            i = 255;
            checklist = checklist2;
            anchorTrackingProperties = (NUBAnchorPageV2Response.AnchorDataV2.AnchorTrackingProperties) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, NUBAnchorPageV2Response$AnchorDataV2$AnchorTrackingProperties$$serializer.INSTANCE, null);
            str = strDecodeStringElement;
            reward = reward2;
            explore = explore2;
            needHelp = needHelp2;
            description = description2;
            ctaButton = ctaButton2;
        } else {
            int i4 = 0;
            boolean z = true;
            NUBAnchorPageV2Response.AnchorDataV2.CtaButton ctaButton3 = null;
            NUBAnchorPageV2Response.AnchorDataV2.Description description3 = null;
            String strDecodeStringElement2 = null;
            NUBAnchorPageV2Response.AnchorDataV2.Reward reward3 = null;
            NUBAnchorPageV2Response.AnchorDataV2.NeedHelp needHelp3 = null;
            NUBAnchorPageV2Response.AnchorDataV2.Explore explore3 = null;
            NUBAnchorPageV2Response.AnchorDataV2.Checklist checklist3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 0:
                        checklist3 = (NUBAnchorPageV2Response.AnchorDataV2.Checklist) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, NUBAnchorPageV2Response$AnchorDataV2$Checklist$$serializer.INSTANCE, checklist3);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 1:
                        ctaButton3 = (NUBAnchorPageV2Response.AnchorDataV2.CtaButton) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, NUBAnchorPageV2Response$AnchorDataV2$CtaButton$$serializer.INSTANCE, ctaButton3);
                        i4 |= 2;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 2:
                        description3 = (NUBAnchorPageV2Response.AnchorDataV2.Description) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, NUBAnchorPageV2Response$AnchorDataV2$Description$$serializer.INSTANCE, description3);
                        i4 |= 4;
                        i2 = 7;
                        break;
                    case 3:
                        i4 |= 8;
                        explore3 = (NUBAnchorPageV2Response.AnchorDataV2.Explore) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, NUBAnchorPageV2Response$AnchorDataV2$Explore$$serializer.INSTANCE, explore3);
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 4:
                        i4 |= 16;
                        needHelp3 = (NUBAnchorPageV2Response.AnchorDataV2.NeedHelp) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, NUBAnchorPageV2Response$AnchorDataV2$NeedHelp$$serializer.INSTANCE, needHelp3);
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 5:
                        i4 |= 32;
                        reward3 = (NUBAnchorPageV2Response.AnchorDataV2.Reward) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, NUBAnchorPageV2Response$AnchorDataV2$Reward$$serializer.INSTANCE, reward3);
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 6:
                        i4 |= 64;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 7:
                        i4 |= 128;
                        anchorTrackingProperties2 = (NUBAnchorPageV2Response.AnchorDataV2.AnchorTrackingProperties) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i2, NUBAnchorPageV2Response$AnchorDataV2$AnchorTrackingProperties$$serializer.INSTANCE, anchorTrackingProperties2);
                        i2 = 7;
                        i3 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            NUBAnchorPageV2Response.AnchorDataV2.Checklist checklist4 = checklist3;
            anchorTrackingProperties = anchorTrackingProperties2;
            str = strDecodeStringElement2;
            reward = reward3;
            checklist = checklist4;
            ctaButton = ctaButton3;
            description = description3;
            i = i4;
            NUBAnchorPageV2Response.AnchorDataV2.Explore explore4 = explore3;
            needHelp = needHelp3;
            explore = explore4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NUBAnchorPageV2Response.AnchorDataV2(i, checklist, ctaButton, description, explore, needHelp, reward, str, anchorTrackingProperties, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NUBAnchorPageV2Response.AnchorDataV2 anchorDataV2) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(anchorDataV2, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NUBAnchorPageV2Response.AnchorDataV2.write$Self$OKHomeLite_home_lite_api(anchorDataV2, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
