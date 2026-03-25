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
public final /* synthetic */ class NUBAnchorPageV2Response$AnchorDataV2$Checklist$Step$$serializer implements GeneratedSerializer<NUBAnchorPageV2Response.AnchorDataV2.Checklist.Step> {
    public static final int $stable;
    public static final NUBAnchorPageV2Response$AnchorDataV2$Checklist$Step$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NUBAnchorPageV2Response$AnchorDataV2$Checklist$Step$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NUBAnchorPageV2Response$AnchorDataV2$Checklist$Step$$serializer nUBAnchorPageV2Response$AnchorDataV2$Checklist$Step$$serializer = new NUBAnchorPageV2Response$AnchorDataV2$Checklist$Step$$serializer();
        INSTANCE = nUBAnchorPageV2Response$AnchorDataV2$Checklist$Step$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.Checklist.Step", nUBAnchorPageV2Response$AnchorDataV2$Checklist$Step$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("badgeLabel", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = NUBAnchorPageV2Response.AnchorDataV2.Checklist.Step.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, kSerializerArr[2], stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NUBAnchorPageV2Response.AnchorDataV2.Checklist.Step deserialize(@NotNull Decoder decoder) {
        int i;
        NUBAnchorPageV2Response.AnchorDataV2.Checklist.Step.StepStatus stepStatus;
        String strDecodeStringElement;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = NUBAnchorPageV2Response.AnchorDataV2.Checklist.Step.$childSerializers;
        NUBAnchorPageV2Response.AnchorDataV2.Checklist.Step.StepStatus stepStatus2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            stepStatus = (NUBAnchorPageV2Response.AnchorDataV2.Checklist.Step.StepStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            str2 = str3;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            str = strDecodeStringElement2;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str4);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    stepStatus2 = (NUBAnchorPageV2Response.AnchorDataV2.Checklist.Step.StepStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], stepStatus2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            stepStatus = stepStatus2;
            strDecodeStringElement = strDecodeStringElement3;
            str = strDecodeStringElement4;
            str2 = str4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NUBAnchorPageV2Response.AnchorDataV2.Checklist.Step(i, str2, str, stepStatus, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NUBAnchorPageV2Response.AnchorDataV2.Checklist.Step step) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(step, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NUBAnchorPageV2Response.AnchorDataV2.Checklist.Step.write$Self$OKHomeLite_home_lite_api(step, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
