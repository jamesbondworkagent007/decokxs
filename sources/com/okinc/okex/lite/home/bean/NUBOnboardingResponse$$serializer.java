package com.okinc.okex.lite.home.bean;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class NUBOnboardingResponse$$serializer implements GeneratedSerializer<NUBOnboardingResponse> {
    public static final int $stable;
    public static final NUBOnboardingResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NUBOnboardingResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NUBOnboardingResponse$$serializer nUBOnboardingResponse$$serializer = new NUBOnboardingResponse$$serializer();
        INSTANCE = nUBOnboardingResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.lite.home.bean.NUBOnboardingResponse", nUBOnboardingResponse$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_LAYOUT, true);
        pluginGeneratedSerialDescriptor.addElement("completedSteps", false);
        pluginGeneratedSerialDescriptor.addElement("totalSteps", false);
        pluginGeneratedSerialDescriptor.addElement("onboardingCard", true);
        pluginGeneratedSerialDescriptor.addElement("bottomSheet", true);
        pluginGeneratedSerialDescriptor.addElement("trackingProperties", false);
        pluginGeneratedSerialDescriptor.addElement("needPoll", true);
        pluginGeneratedSerialDescriptor.addElement("pollInterval", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = NUBOnboardingResponse.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{StringSerializer.INSTANCE, OnboardingDescription$$serializer.INSTANCE, kSerializerArr[2], intSerializer, intSerializer, BuiltinSerializersKt.getNullable(OnboardingCard$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(RewardBottomSheet$$serializer.INSTANCE), OnboardingTrackingProperties$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NUBOnboardingResponse deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        Boolean bool;
        RewardBottomSheet rewardBottomSheet;
        OnboardingTrackingProperties onboardingTrackingProperties;
        int i;
        String str;
        OnboardingDescription onboardingDescription;
        OnboardingCard onboardingCard;
        Integer num;
        int i2;
        OnboardingCardLayoutType onboardingCardLayoutType;
        OnboardingCardLayoutType onboardingCardLayoutType2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = NUBOnboardingResponse.$childSerializers;
        int i4 = 9;
        int i5 = 7;
        int i6 = 6;
        int i7 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            onboardingDescription = (OnboardingDescription) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, OnboardingDescription$$serializer.INSTANCE, null);
            OnboardingCardLayoutType onboardingCardLayoutType3 = (OnboardingCardLayoutType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            OnboardingCard onboardingCard2 = (OnboardingCard) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, OnboardingCard$$serializer.INSTANCE, null);
            RewardBottomSheet rewardBottomSheet2 = (RewardBottomSheet) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, RewardBottomSheet$$serializer.INSTANCE, null);
            OnboardingTrackingProperties onboardingTrackingProperties2 = (OnboardingTrackingProperties) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, OnboardingTrackingProperties$$serializer.INSTANCE, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, null);
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, null);
            onboardingTrackingProperties = onboardingTrackingProperties2;
            rewardBottomSheet = rewardBottomSheet2;
            onboardingCard = onboardingCard2;
            i2 = iDecodeIntElement2;
            bool = bool2;
            iDecodeIntElement = iDecodeIntElement3;
            i = 1023;
            onboardingCardLayoutType = onboardingCardLayoutType3;
            str = strDecodeStringElement;
        } else {
            int iDecodeIntElement4 = 0;
            int i8 = 0;
            boolean z = true;
            Boolean bool3 = null;
            RewardBottomSheet rewardBottomSheet3 = null;
            OnboardingCard onboardingCard3 = null;
            Integer num2 = null;
            OnboardingCardLayoutType onboardingCardLayoutType4 = null;
            OnboardingDescription onboardingDescription2 = null;
            String strDecodeStringElement2 = null;
            OnboardingTrackingProperties onboardingTrackingProperties3 = null;
            iDecodeIntElement = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        onboardingCardLayoutType2 = onboardingCardLayoutType4;
                        z = false;
                        onboardingCardLayoutType4 = onboardingCardLayoutType2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        break;
                    case 0:
                        onboardingCardLayoutType2 = onboardingCardLayoutType4;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i8 |= 1;
                        onboardingCardLayoutType4 = onboardingCardLayoutType2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        break;
                    case 1:
                        onboardingCardLayoutType2 = onboardingCardLayoutType4;
                        onboardingDescription2 = (OnboardingDescription) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, OnboardingDescription$$serializer.INSTANCE, onboardingDescription2);
                        i8 |= 2;
                        onboardingCardLayoutType4 = onboardingCardLayoutType2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        break;
                    case 2:
                        i8 |= 4;
                        onboardingCardLayoutType2 = (OnboardingCardLayoutType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], onboardingCardLayoutType4);
                        onboardingCardLayoutType4 = onboardingCardLayoutType2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        break;
                    case 3:
                        i8 |= 8;
                        onboardingCardLayoutType2 = onboardingCardLayoutType4;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        onboardingCardLayoutType4 = onboardingCardLayoutType2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        break;
                    case 4:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i8 |= 16;
                        onboardingCardLayoutType2 = onboardingCardLayoutType4;
                        onboardingCardLayoutType4 = onboardingCardLayoutType2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        break;
                    case 5:
                        onboardingCard3 = (OnboardingCard) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, OnboardingCard$$serializer.INSTANCE, onboardingCard3);
                        i3 = i8 | 32;
                        i8 = i3;
                        onboardingCardLayoutType2 = onboardingCardLayoutType4;
                        onboardingCardLayoutType4 = onboardingCardLayoutType2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        break;
                    case 6:
                        rewardBottomSheet3 = (RewardBottomSheet) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, RewardBottomSheet$$serializer.INSTANCE, rewardBottomSheet3);
                        i3 = i8 | 64;
                        i8 = i3;
                        onboardingCardLayoutType2 = onboardingCardLayoutType4;
                        onboardingCardLayoutType4 = onboardingCardLayoutType2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        break;
                    case 7:
                        onboardingTrackingProperties3 = (OnboardingTrackingProperties) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i5, OnboardingTrackingProperties$$serializer.INSTANCE, onboardingTrackingProperties3);
                        i8 |= 128;
                        break;
                    case 8:
                        i8 |= 256;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i7, BooleanSerializer.INSTANCE, bool3);
                        onboardingCardLayoutType2 = onboardingCardLayoutType4;
                        onboardingCardLayoutType4 = onboardingCardLayoutType2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        break;
                    case 9:
                        i8 |= 512;
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, IntSerializer.INSTANCE, num2);
                        onboardingCardLayoutType2 = onboardingCardLayoutType4;
                        onboardingCardLayoutType4 = onboardingCardLayoutType2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            OnboardingCardLayoutType onboardingCardLayoutType5 = onboardingCardLayoutType4;
            OnboardingDescription onboardingDescription3 = onboardingDescription2;
            bool = bool3;
            rewardBottomSheet = rewardBottomSheet3;
            onboardingTrackingProperties = onboardingTrackingProperties3;
            i = i8;
            str = strDecodeStringElement2;
            onboardingDescription = onboardingDescription3;
            onboardingCard = onboardingCard3;
            num = num2;
            i2 = iDecodeIntElement4;
            onboardingCardLayoutType = onboardingCardLayoutType5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NUBOnboardingResponse(i, str, onboardingDescription, onboardingCardLayoutType, i2, iDecodeIntElement, onboardingCard, rewardBottomSheet, onboardingTrackingProperties, bool, num, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NUBOnboardingResponse nUBOnboardingResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(nUBOnboardingResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NUBOnboardingResponse.AEQbTJ(nUBOnboardingResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
