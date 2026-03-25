package com.okinc.okex.lite.home.bean;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.okex.lite.home.bean.NUBOnboardingV2;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class NUBOnboardingV2$$serializer implements GeneratedSerializer<NUBOnboardingV2> {
    public static final int $stable;
    public static final NUBOnboardingV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NUBOnboardingV2$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NUBOnboardingV2$$serializer nUBOnboardingV2$$serializer = new NUBOnboardingV2$$serializer();
        INSTANCE = nUBOnboardingV2$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.lite.home.bean.NUBOnboardingV2", nUBOnboardingV2$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("bottomSheet", true);
        pluginGeneratedSerialDescriptor.addElement("button", false);
        pluginGeneratedSerialDescriptor.addElement("completedSteps", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_LAYOUT, true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("totalSteps", false);
        pluginGeneratedSerialDescriptor.addElement("trackingProperties", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = NUBOnboardingV2.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(RewardBottomSheet$$serializer.INSTANCE), OnboardingButton$$serializer.INSTANCE, intSerializer, BuiltinSerializersKt.getNullable(OnboardingDescription$$serializer.INSTANCE), kSerializerArr[4], StringSerializer.INSTANCE, intSerializer, NUBOnboardingV2$TrackingProperties$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NUBOnboardingV2 deserialize(@NotNull Decoder decoder) {
        int i;
        RewardBottomSheet rewardBottomSheet;
        String str;
        NUBOnboardingV2.TrackingProperties trackingProperties;
        OnboardingCardLayoutType onboardingCardLayoutType;
        OnboardingDescription onboardingDescription;
        int i2;
        int i3;
        OnboardingButton onboardingButton;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = NUBOnboardingV2.$childSerializers;
        int i4 = 7;
        int i5 = 6;
        int i6 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            RewardBottomSheet rewardBottomSheet2 = (RewardBottomSheet) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, RewardBottomSheet$$serializer.INSTANCE, null);
            OnboardingButton onboardingButton2 = (OnboardingButton) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, OnboardingButton$$serializer.INSTANCE, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            OnboardingDescription onboardingDescription2 = (OnboardingDescription) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, OnboardingDescription$$serializer.INSTANCE, null);
            OnboardingCardLayoutType onboardingCardLayoutType2 = (OnboardingCardLayoutType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            i2 = 255;
            onboardingCardLayoutType = onboardingCardLayoutType2;
            rewardBottomSheet = rewardBottomSheet2;
            trackingProperties = (NUBOnboardingV2.TrackingProperties) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, NUBOnboardingV2$TrackingProperties$$serializer.INSTANCE, null);
            i = iDecodeIntElement2;
            str = strDecodeStringElement;
            onboardingDescription = onboardingDescription2;
            i3 = iDecodeIntElement;
            onboardingButton = onboardingButton2;
        } else {
            int iDecodeIntElement3 = 0;
            int i7 = 0;
            boolean z = true;
            OnboardingDescription onboardingDescription3 = null;
            OnboardingButton onboardingButton3 = null;
            NUBOnboardingV2.TrackingProperties trackingProperties2 = null;
            RewardBottomSheet rewardBottomSheet3 = null;
            String strDecodeStringElement2 = null;
            OnboardingCardLayoutType onboardingCardLayoutType3 = null;
            int iDecodeIntElement4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 0:
                        rewardBottomSheet3 = (RewardBottomSheet) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, RewardBottomSheet$$serializer.INSTANCE, rewardBottomSheet3);
                        i7 |= 1;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 1:
                        onboardingButton3 = (OnboardingButton) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, OnboardingButton$$serializer.INSTANCE, onboardingButton3);
                        i7 |= 2;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 2:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i7 |= 4;
                        break;
                    case 3:
                        i7 |= 8;
                        onboardingDescription3 = (OnboardingDescription) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, OnboardingDescription$$serializer.INSTANCE, onboardingDescription3);
                        break;
                    case 4:
                        i7 |= 16;
                        onboardingCardLayoutType3 = (OnboardingCardLayoutType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], onboardingCardLayoutType3);
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 5:
                        i7 |= 32;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 6:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i5);
                        i7 |= 64;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        break;
                    case 7:
                        i7 |= 128;
                        trackingProperties2 = (NUBOnboardingV2.TrackingProperties) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, NUBOnboardingV2$TrackingProperties$$serializer.INSTANCE, trackingProperties2);
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            RewardBottomSheet rewardBottomSheet4 = rewardBottomSheet3;
            i = iDecodeIntElement3;
            rewardBottomSheet = rewardBottomSheet4;
            str = strDecodeStringElement2;
            trackingProperties = trackingProperties2;
            onboardingCardLayoutType = onboardingCardLayoutType3;
            OnboardingButton onboardingButton4 = onboardingButton3;
            onboardingDescription = onboardingDescription3;
            i2 = i7;
            i3 = iDecodeIntElement4;
            onboardingButton = onboardingButton4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NUBOnboardingV2(i2, rewardBottomSheet, onboardingButton, i3, onboardingDescription, onboardingCardLayoutType, str, i, trackingProperties, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NUBOnboardingV2 nUBOnboardingV2) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(nUBOnboardingV2, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NUBOnboardingV2.copydefault(nUBOnboardingV2, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
