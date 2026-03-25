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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class LiteHomeWelcomeData$$serializer implements GeneratedSerializer<LiteHomeWelcomeData> {
    public static final int $stable;
    public static final LiteHomeWelcomeData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LiteHomeWelcomeData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LiteHomeWelcomeData$$serializer liteHomeWelcomeData$$serializer = new LiteHomeWelcomeData$$serializer();
        INSTANCE = liteHomeWelcomeData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.lite.home.bean.LiteHomeWelcomeData", liteHomeWelcomeData$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("iconDark", false);
        pluginGeneratedSerialDescriptor.addElement("iconLight", false);
        pluginGeneratedSerialDescriptor.addElement("steps", true);
        pluginGeneratedSerialDescriptor.addElement("activeStep", false);
        pluginGeneratedSerialDescriptor.addElement("button", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = LiteHomeWelcomeData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[4]), IntSerializer.INSTANCE, OnboardingButtonInfo$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LiteHomeWelcomeData deserialize(@NotNull Decoder decoder) {
        int i;
        OnboardingButtonInfo onboardingButtonInfo;
        List list;
        String str;
        String str2;
        int i2;
        String str3;
        String str4;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = LiteHomeWelcomeData.$childSerializers;
        int i3 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            list = list2;
            str4 = strDecodeStringElement;
            onboardingButtonInfo = (OnboardingButtonInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, OnboardingButtonInfo$$serializer.INSTANCE, null);
            i = iDecodeIntElement;
            str3 = strDecodeStringElement3;
            str2 = strDecodeStringElement2;
            i2 = 127;
            str = str5;
        } else {
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            OnboardingButtonInfo onboardingButtonInfo2 = null;
            List list3 = null;
            String strDecodeStringElement6 = null;
            int iDecodeIntElement2 = 0;
            boolean z2 = true;
            int i4 = 0;
            String str6 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        break;
                    case 0:
                        z = true;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 6;
                        break;
                    case 1:
                        z = true;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str6);
                        i4 |= 2;
                        i3 = 6;
                        break;
                    case 2:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        i4 |= 8;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i4 |= 16;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], list3);
                        break;
                    case 5:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i4 |= 32;
                        break;
                    case 6:
                        i4 |= 64;
                        onboardingButtonInfo2 = (OnboardingButtonInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, OnboardingButtonInfo$$serializer.INSTANCE, onboardingButtonInfo2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement2;
            onboardingButtonInfo = onboardingButtonInfo2;
            list = list3;
            str = str6;
            str2 = strDecodeStringElement4;
            i2 = i4;
            String str7 = strDecodeStringElement6;
            str3 = strDecodeStringElement5;
            str4 = str7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LiteHomeWelcomeData(i2, str4, str, str2, str3, list, i, onboardingButtonInfo, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LiteHomeWelcomeData liteHomeWelcomeData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(liteHomeWelcomeData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LiteHomeWelcomeData.EZpvd(liteHomeWelcomeData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
