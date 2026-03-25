package com.okinc.okex.lite.hero.data.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class HeroSection$$serializer implements GeneratedSerializer<HeroSection> {
    public static final int $stable;
    public static final HeroSection$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private HeroSection$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        HeroSection$$serializer heroSection$$serializer = new HeroSection$$serializer();
        INSTANCE = heroSection$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.lite.hero.data.model.HeroSection", heroSection$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("isActive", false);
        pluginGeneratedSerialDescriptor.addElement("contentModel", false);
        pluginGeneratedSerialDescriptor.addElement("tabBarItemModel", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BooleanSerializer.INSTANCE, HeroContent$$serializer.INSTANCE, HeroTabBarItem$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final HeroSection deserialize(@NotNull Decoder decoder) {
        boolean z;
        HeroTabBarItem heroTabBarItem;
        HeroContent heroContent;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        HeroTabBarItem heroTabBarItem2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            HeroContent heroContent2 = (HeroContent) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, HeroContent$$serializer.INSTANCE, null);
            z = zDecodeBooleanElement;
            heroTabBarItem = (HeroTabBarItem) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, HeroTabBarItem$$serializer.INSTANCE, null);
            i = 7;
            heroContent = heroContent2;
        } else {
            HeroContent heroContent3 = null;
            boolean zDecodeBooleanElement2 = false;
            int i2 = 0;
            boolean z2 = true;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z2 = false;
                } else if (iDecodeElementIndex == 0) {
                    zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    heroContent3 = (HeroContent) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, HeroContent$$serializer.INSTANCE, heroContent3);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    heroTabBarItem2 = (HeroTabBarItem) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, HeroTabBarItem$$serializer.INSTANCE, heroTabBarItem2);
                    i2 |= 4;
                }
            }
            z = zDecodeBooleanElement2;
            heroTabBarItem = heroTabBarItem2;
            heroContent = heroContent3;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HeroSection(i, z, heroContent, heroTabBarItem, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull HeroSection heroSection) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(heroSection, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        HeroSection.OLrzqt(heroSection, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
