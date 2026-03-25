package com.okinc.okex.lite.home.bean;

import java.util.List;
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
public final /* synthetic */ class NUBAnchorPageResponse$$serializer implements GeneratedSerializer<NUBAnchorPageResponse> {
    public static final int $stable;
    public static final NUBAnchorPageResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NUBAnchorPageResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NUBAnchorPageResponse$$serializer nUBAnchorPageResponse$$serializer = new NUBAnchorPageResponse$$serializer();
        INSTANCE = nUBAnchorPageResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.lite.home.bean.NUBAnchorPageResponse", nUBAnchorPageResponse$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("sections", false);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        pluginGeneratedSerialDescriptor.addElement("buttonHelpLink", true);
        pluginGeneratedSerialDescriptor.addElement("trackingProperties", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, Description$$serializer.INSTANCE, NUBAnchorPageResponse.$childSerializers[2], BuiltinSerializersKt.getNullable(CTA$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ButtonHelpLink$$serializer.INSTANCE), TrackingProperties$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NUBAnchorPageResponse deserialize(@NotNull Decoder decoder) {
        CTA cta;
        int i;
        ButtonHelpLink buttonHelpLink;
        String str;
        TrackingProperties trackingProperties;
        List list;
        Description description;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = NUBAnchorPageResponse.$childSerializers;
        ButtonHelpLink buttonHelpLink2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            Description description2 = (Description) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, Description$$serializer.INSTANCE, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            CTA cta2 = (CTA) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, CTA$$serializer.INSTANCE, null);
            ButtonHelpLink buttonHelpLink3 = (ButtonHelpLink) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, ButtonHelpLink$$serializer.INSTANCE, null);
            list = list2;
            str = strDecodeStringElement;
            trackingProperties = (TrackingProperties) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, TrackingProperties$$serializer.INSTANCE, null);
            cta = cta2;
            buttonHelpLink = buttonHelpLink3;
            description = description2;
            i = 63;
        } else {
            int i2 = 0;
            boolean z = true;
            List list3 = null;
            TrackingProperties trackingProperties2 = null;
            cta = null;
            Description description3 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        i2 |= 2;
                        description3 = (Description) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, Description$$serializer.INSTANCE, description3);
                        break;
                    case 2:
                        i2 |= 4;
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], list3);
                        break;
                    case 3:
                        i2 |= 8;
                        cta = (CTA) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, CTA$$serializer.INSTANCE, cta);
                        break;
                    case 4:
                        i2 |= 16;
                        buttonHelpLink2 = (ButtonHelpLink) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, ButtonHelpLink$$serializer.INSTANCE, buttonHelpLink2);
                        break;
                    case 5:
                        i2 |= 32;
                        trackingProperties2 = (TrackingProperties) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, TrackingProperties$$serializer.INSTANCE, trackingProperties2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i2;
            Description description4 = description3;
            buttonHelpLink = buttonHelpLink2;
            str = strDecodeStringElement2;
            trackingProperties = trackingProperties2;
            list = list3;
            description = description4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NUBAnchorPageResponse(i, str, description, list, cta, buttonHelpLink, trackingProperties, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NUBAnchorPageResponse nUBAnchorPageResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(nUBAnchorPageResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NUBAnchorPageResponse.OLrzqt(nUBAnchorPageResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
