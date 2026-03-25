package com.okinc.localization2.bean.server;

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

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class AppLink$$serializer implements GeneratedSerializer<AppLink> {
    public static final int $stable;
    public static final AppLink$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AppLink$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AppLink$$serializer appLink$$serializer = new AppLink$$serializer();
        INSTANCE = appLink$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.localization2.bean.server.AppLink", appLink$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("market", false);
        pluginGeneratedSerialDescriptor.addElement("marketCurrent", false);
        pluginGeneratedSerialDescriptor.addElement("marketDefault", false);
        pluginGeneratedSerialDescriptor.addElement("globalCurrent", false);
        pluginGeneratedSerialDescriptor.addElement("globalDefault", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        AppLinkLang$$serializer appLinkLang$$serializer = AppLinkLang$$serializer.INSTANCE;
        return new KSerializer[]{StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(appLinkLang$$serializer), BuiltinSerializersKt.getNullable(appLinkLang$$serializer), BuiltinSerializersKt.getNullable(appLinkLang$$serializer), BuiltinSerializersKt.getNullable(appLinkLang$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AppLink deserialize(@NotNull Decoder decoder) {
        int i;
        AppLinkLang appLinkLang;
        AppLinkLang appLinkLang2;
        AppLinkLang appLinkLang3;
        String str;
        AppLinkLang appLinkLang4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        AppLinkLang appLinkLang5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            AppLinkLang$$serializer appLinkLang$$serializer = AppLinkLang$$serializer.INSTANCE;
            AppLinkLang appLinkLang6 = (AppLinkLang) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, appLinkLang$$serializer, null);
            AppLinkLang appLinkLang7 = (AppLinkLang) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, appLinkLang$$serializer, null);
            str = strDecodeStringElement;
            appLinkLang = (AppLinkLang) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, appLinkLang$$serializer, null);
            appLinkLang2 = (AppLinkLang) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, appLinkLang$$serializer, null);
            appLinkLang3 = appLinkLang7;
            i = 31;
            appLinkLang4 = appLinkLang6;
        } else {
            int i2 = 0;
            boolean z = true;
            AppLinkLang appLinkLang8 = null;
            AppLinkLang appLinkLang9 = null;
            String strDecodeStringElement2 = null;
            AppLinkLang appLinkLang10 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    appLinkLang10 = (AppLinkLang) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, AppLinkLang$$serializer.INSTANCE, appLinkLang10);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    appLinkLang9 = (AppLinkLang) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, AppLinkLang$$serializer.INSTANCE, appLinkLang9);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    appLinkLang5 = (AppLinkLang) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, AppLinkLang$$serializer.INSTANCE, appLinkLang5);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    appLinkLang8 = (AppLinkLang) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, AppLinkLang$$serializer.INSTANCE, appLinkLang8);
                    i2 |= 16;
                }
            }
            i = i2;
            appLinkLang = appLinkLang5;
            appLinkLang2 = appLinkLang8;
            appLinkLang3 = appLinkLang9;
            str = strDecodeStringElement2;
            appLinkLang4 = appLinkLang10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AppLink(i, str, appLinkLang4, appLinkLang3, appLinkLang, appLinkLang2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AppLink appLink) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(appLink, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AppLink.write$Self$OKLocalization_localization(appLink, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
