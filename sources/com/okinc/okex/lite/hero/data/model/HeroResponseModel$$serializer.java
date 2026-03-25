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

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class HeroResponseModel$$serializer implements GeneratedSerializer<HeroResponseModel> {
    public static final int $stable;
    public static final HeroResponseModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private HeroResponseModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        HeroResponseModel$$serializer heroResponseModel$$serializer = new HeroResponseModel$$serializer();
        INSTANCE = heroResponseModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.lite.hero.data.model.HeroResponseModel", heroResponseModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("isActive", false);
        pluginGeneratedSerialDescriptor.addElement("content", false);
        pluginGeneratedSerialDescriptor.addElement("tabBarItem", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BooleanSerializer.INSTANCE, ContentModel$$serializer.INSTANCE, TabBarItemModel$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final HeroResponseModel deserialize(@NotNull Decoder decoder) {
        boolean z;
        TabBarItemModel tabBarItemModel;
        ContentModel contentModel;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        TabBarItemModel tabBarItemModel2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            ContentModel contentModel2 = (ContentModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, ContentModel$$serializer.INSTANCE, null);
            z = zDecodeBooleanElement;
            tabBarItemModel = (TabBarItemModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, TabBarItemModel$$serializer.INSTANCE, null);
            i = 7;
            contentModel = contentModel2;
        } else {
            ContentModel contentModel3 = null;
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
                    contentModel3 = (ContentModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, ContentModel$$serializer.INSTANCE, contentModel3);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    tabBarItemModel2 = (TabBarItemModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, TabBarItemModel$$serializer.INSTANCE, tabBarItemModel2);
                    i2 |= 4;
                }
            }
            z = zDecodeBooleanElement2;
            tabBarItemModel = tabBarItemModel2;
            contentModel = contentModel3;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HeroResponseModel(i, z, contentModel, tabBarItemModel, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull HeroResponseModel heroResponseModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(heroResponseModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        HeroResponseModel.AEQbTJ(heroResponseModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
