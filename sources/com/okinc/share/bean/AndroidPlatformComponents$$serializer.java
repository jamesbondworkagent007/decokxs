package com.okinc.share.bean;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class AndroidPlatformComponents$$serializer implements GeneratedSerializer<AndroidPlatformComponents> {
    public static final int $stable;
    public static final AndroidPlatformComponents$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AndroidPlatformComponents$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AndroidPlatformComponents$$serializer androidPlatformComponents$$serializer = new AndroidPlatformComponents$$serializer();
        INSTANCE = androidPlatformComponents$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.share.bean.AndroidPlatformComponents", androidPlatformComponents$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("1", true);
        pluginGeneratedSerialDescriptor.addElement("2", true);
        pluginGeneratedSerialDescriptor.addElement("3", true);
        pluginGeneratedSerialDescriptor.addElement("4", true);
        pluginGeneratedSerialDescriptor.addElement(OrderDetailListItem.SLIP_OUT, true);
        pluginGeneratedSerialDescriptor.addElement("7", true);
        pluginGeneratedSerialDescriptor.addElement("8", true);
        pluginGeneratedSerialDescriptor.addElement("9", true);
        pluginGeneratedSerialDescriptor.addElement("10", true);
        pluginGeneratedSerialDescriptor.addElement("11", true);
        pluginGeneratedSerialDescriptor.addElement("12", true);
        pluginGeneratedSerialDescriptor.addElement("13", true);
        pluginGeneratedSerialDescriptor.addElement("14", true);
        pluginGeneratedSerialDescriptor.addElement("15", true);
        pluginGeneratedSerialDescriptor.addElement("16", true);
        pluginGeneratedSerialDescriptor.addElement("17", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        PlatformComponentInfo$$serializer platformComponentInfo$$serializer = PlatformComponentInfo$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(platformComponentInfo$$serializer), BuiltinSerializersKt.getNullable(platformComponentInfo$$serializer), BuiltinSerializersKt.getNullable(platformComponentInfo$$serializer), BuiltinSerializersKt.getNullable(platformComponentInfo$$serializer), BuiltinSerializersKt.getNullable(platformComponentInfo$$serializer), BuiltinSerializersKt.getNullable(platformComponentInfo$$serializer), BuiltinSerializersKt.getNullable(platformComponentInfo$$serializer), BuiltinSerializersKt.getNullable(platformComponentInfo$$serializer), BuiltinSerializersKt.getNullable(platformComponentInfo$$serializer), BuiltinSerializersKt.getNullable(platformComponentInfo$$serializer), BuiltinSerializersKt.getNullable(platformComponentInfo$$serializer), BuiltinSerializersKt.getNullable(platformComponentInfo$$serializer), BuiltinSerializersKt.getNullable(platformComponentInfo$$serializer), BuiltinSerializersKt.getNullable(platformComponentInfo$$serializer), BuiltinSerializersKt.getNullable(platformComponentInfo$$serializer), BuiltinSerializersKt.getNullable(platformComponentInfo$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AndroidPlatformComponents deserialize(@NotNull Decoder decoder) {
        PlatformComponentInfo platformComponentInfo;
        PlatformComponentInfo platformComponentInfo2;
        PlatformComponentInfo platformComponentInfo3;
        PlatformComponentInfo platformComponentInfo4;
        PlatformComponentInfo platformComponentInfo5;
        PlatformComponentInfo platformComponentInfo6;
        PlatformComponentInfo platformComponentInfo7;
        PlatformComponentInfo platformComponentInfo8;
        PlatformComponentInfo platformComponentInfo9;
        int i;
        PlatformComponentInfo platformComponentInfo10;
        PlatformComponentInfo platformComponentInfo11;
        PlatformComponentInfo platformComponentInfo12;
        PlatformComponentInfo platformComponentInfo13;
        PlatformComponentInfo platformComponentInfo14;
        PlatformComponentInfo platformComponentInfo15;
        PlatformComponentInfo platformComponentInfo16;
        PlatformComponentInfo platformComponentInfo17;
        PlatformComponentInfo platformComponentInfo18;
        PlatformComponentInfo platformComponentInfo19;
        PlatformComponentInfo platformComponentInfo20;
        PlatformComponentInfo platformComponentInfo21;
        PlatformComponentInfo platformComponentInfo22;
        PlatformComponentInfo platformComponentInfo23;
        PlatformComponentInfo platformComponentInfo24;
        PlatformComponentInfo platformComponentInfo25;
        PlatformComponentInfo platformComponentInfo26;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            PlatformComponentInfo$$serializer platformComponentInfo$$serializer = PlatformComponentInfo$$serializer.INSTANCE;
            PlatformComponentInfo platformComponentInfo27 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, platformComponentInfo$$serializer, null);
            PlatformComponentInfo platformComponentInfo28 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, platformComponentInfo$$serializer, null);
            PlatformComponentInfo platformComponentInfo29 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, platformComponentInfo$$serializer, null);
            PlatformComponentInfo platformComponentInfo30 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, platformComponentInfo$$serializer, null);
            platformComponentInfo11 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, platformComponentInfo$$serializer, null);
            PlatformComponentInfo platformComponentInfo31 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, platformComponentInfo$$serializer, null);
            PlatformComponentInfo platformComponentInfo32 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, platformComponentInfo$$serializer, null);
            PlatformComponentInfo platformComponentInfo33 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, platformComponentInfo$$serializer, null);
            PlatformComponentInfo platformComponentInfo34 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, platformComponentInfo$$serializer, null);
            PlatformComponentInfo platformComponentInfo35 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, platformComponentInfo$$serializer, null);
            PlatformComponentInfo platformComponentInfo36 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, platformComponentInfo$$serializer, null);
            PlatformComponentInfo platformComponentInfo37 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, platformComponentInfo$$serializer, null);
            PlatformComponentInfo platformComponentInfo38 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, platformComponentInfo$$serializer, null);
            PlatformComponentInfo platformComponentInfo39 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, platformComponentInfo$$serializer, null);
            PlatformComponentInfo platformComponentInfo40 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, platformComponentInfo$$serializer, null);
            platformComponentInfo6 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, platformComponentInfo$$serializer, null);
            platformComponentInfo10 = platformComponentInfo40;
            platformComponentInfo5 = platformComponentInfo37;
            platformComponentInfo3 = platformComponentInfo36;
            platformComponentInfo8 = platformComponentInfo35;
            platformComponentInfo15 = platformComponentInfo39;
            platformComponentInfo4 = platformComponentInfo38;
            platformComponentInfo2 = platformComponentInfo33;
            platformComponentInfo7 = platformComponentInfo32;
            platformComponentInfo16 = platformComponentInfo27;
            i = 65535;
            platformComponentInfo = platformComponentInfo31;
            platformComponentInfo12 = platformComponentInfo28;
            platformComponentInfo9 = platformComponentInfo30;
            platformComponentInfo14 = platformComponentInfo29;
            platformComponentInfo13 = platformComponentInfo34;
        } else {
            int i3 = 15;
            boolean z = true;
            PlatformComponentInfo platformComponentInfo41 = null;
            PlatformComponentInfo platformComponentInfo42 = null;
            PlatformComponentInfo platformComponentInfo43 = null;
            PlatformComponentInfo platformComponentInfo44 = null;
            PlatformComponentInfo platformComponentInfo45 = null;
            PlatformComponentInfo platformComponentInfo46 = null;
            PlatformComponentInfo platformComponentInfo47 = null;
            PlatformComponentInfo platformComponentInfo48 = null;
            PlatformComponentInfo platformComponentInfo49 = null;
            PlatformComponentInfo platformComponentInfo50 = null;
            PlatformComponentInfo platformComponentInfo51 = null;
            PlatformComponentInfo platformComponentInfo52 = null;
            PlatformComponentInfo platformComponentInfo53 = null;
            PlatformComponentInfo platformComponentInfo54 = null;
            PlatformComponentInfo platformComponentInfo55 = null;
            int i4 = 0;
            PlatformComponentInfo platformComponentInfo56 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        platformComponentInfo17 = platformComponentInfo56;
                        platformComponentInfo18 = platformComponentInfo50;
                        platformComponentInfo19 = platformComponentInfo51;
                        platformComponentInfo20 = platformComponentInfo52;
                        platformComponentInfo21 = platformComponentInfo53;
                        platformComponentInfo22 = platformComponentInfo54;
                        platformComponentInfo23 = platformComponentInfo41;
                        z = false;
                        platformComponentInfo41 = platformComponentInfo23;
                        platformComponentInfo54 = platformComponentInfo22;
                        platformComponentInfo53 = platformComponentInfo21;
                        platformComponentInfo51 = platformComponentInfo19;
                        platformComponentInfo52 = platformComponentInfo20;
                        platformComponentInfo50 = platformComponentInfo18;
                        platformComponentInfo56 = platformComponentInfo17;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 0:
                        platformComponentInfo17 = platformComponentInfo56;
                        platformComponentInfo18 = platformComponentInfo50;
                        platformComponentInfo19 = platformComponentInfo51;
                        platformComponentInfo20 = platformComponentInfo52;
                        platformComponentInfo21 = platformComponentInfo53;
                        PlatformComponentInfo platformComponentInfo57 = platformComponentInfo54;
                        platformComponentInfo23 = platformComponentInfo41;
                        platformComponentInfo22 = platformComponentInfo57;
                        platformComponentInfo55 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, PlatformComponentInfo$$serializer.INSTANCE, platformComponentInfo55);
                        i4 |= 1;
                        platformComponentInfo41 = platformComponentInfo23;
                        platformComponentInfo54 = platformComponentInfo22;
                        platformComponentInfo53 = platformComponentInfo21;
                        platformComponentInfo51 = platformComponentInfo19;
                        platformComponentInfo52 = platformComponentInfo20;
                        platformComponentInfo50 = platformComponentInfo18;
                        platformComponentInfo56 = platformComponentInfo17;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 1:
                        platformComponentInfo17 = platformComponentInfo56;
                        platformComponentInfo18 = platformComponentInfo50;
                        platformComponentInfo19 = platformComponentInfo51;
                        platformComponentInfo20 = platformComponentInfo52;
                        platformComponentInfo21 = platformComponentInfo53;
                        PlatformComponentInfo platformComponentInfo58 = platformComponentInfo54;
                        platformComponentInfo23 = platformComponentInfo41;
                        i4 |= 2;
                        platformComponentInfo22 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, PlatformComponentInfo$$serializer.INSTANCE, platformComponentInfo58);
                        platformComponentInfo41 = platformComponentInfo23;
                        platformComponentInfo54 = platformComponentInfo22;
                        platformComponentInfo53 = platformComponentInfo21;
                        platformComponentInfo51 = platformComponentInfo19;
                        platformComponentInfo52 = platformComponentInfo20;
                        platformComponentInfo50 = platformComponentInfo18;
                        platformComponentInfo56 = platformComponentInfo17;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 2:
                        platformComponentInfo17 = platformComponentInfo56;
                        platformComponentInfo18 = platformComponentInfo50;
                        platformComponentInfo19 = platformComponentInfo51;
                        platformComponentInfo20 = platformComponentInfo52;
                        i4 |= 4;
                        platformComponentInfo21 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, PlatformComponentInfo$$serializer.INSTANCE, platformComponentInfo53);
                        platformComponentInfo22 = platformComponentInfo54;
                        platformComponentInfo23 = platformComponentInfo41;
                        platformComponentInfo41 = platformComponentInfo23;
                        platformComponentInfo54 = platformComponentInfo22;
                        platformComponentInfo53 = platformComponentInfo21;
                        platformComponentInfo51 = platformComponentInfo19;
                        platformComponentInfo52 = platformComponentInfo20;
                        platformComponentInfo50 = platformComponentInfo18;
                        platformComponentInfo56 = platformComponentInfo17;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 3:
                        platformComponentInfo17 = platformComponentInfo56;
                        platformComponentInfo18 = platformComponentInfo50;
                        platformComponentInfo19 = platformComponentInfo51;
                        platformComponentInfo41 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, PlatformComponentInfo$$serializer.INSTANCE, platformComponentInfo41);
                        i4 |= 8;
                        platformComponentInfo20 = platformComponentInfo52;
                        platformComponentInfo21 = platformComponentInfo53;
                        platformComponentInfo53 = platformComponentInfo21;
                        platformComponentInfo51 = platformComponentInfo19;
                        platformComponentInfo52 = platformComponentInfo20;
                        platformComponentInfo50 = platformComponentInfo18;
                        platformComponentInfo56 = platformComponentInfo17;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 4:
                        platformComponentInfo17 = platformComponentInfo56;
                        platformComponentInfo47 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, PlatformComponentInfo$$serializer.INSTANCE, platformComponentInfo47);
                        i4 |= 16;
                        platformComponentInfo56 = platformComponentInfo17;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 5:
                        platformComponentInfo24 = platformComponentInfo50;
                        platformComponentInfo25 = platformComponentInfo51;
                        platformComponentInfo42 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, PlatformComponentInfo$$serializer.INSTANCE, platformComponentInfo42);
                        i4 |= 32;
                        platformComponentInfo26 = platformComponentInfo52;
                        platformComponentInfo56 = platformComponentInfo56;
                        platformComponentInfo51 = platformComponentInfo25;
                        platformComponentInfo52 = platformComponentInfo26;
                        platformComponentInfo50 = platformComponentInfo24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 6:
                        platformComponentInfo25 = platformComponentInfo51;
                        platformComponentInfo24 = platformComponentInfo50;
                        i4 |= 64;
                        platformComponentInfo26 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, PlatformComponentInfo$$serializer.INSTANCE, platformComponentInfo52);
                        platformComponentInfo56 = platformComponentInfo56;
                        platformComponentInfo51 = platformComponentInfo25;
                        platformComponentInfo52 = platformComponentInfo26;
                        platformComponentInfo50 = platformComponentInfo24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 7:
                        platformComponentInfo25 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, PlatformComponentInfo$$serializer.INSTANCE, platformComponentInfo51);
                        i4 |= 128;
                        platformComponentInfo24 = platformComponentInfo50;
                        platformComponentInfo56 = platformComponentInfo56;
                        platformComponentInfo26 = platformComponentInfo52;
                        platformComponentInfo51 = platformComponentInfo25;
                        platformComponentInfo52 = platformComponentInfo26;
                        platformComponentInfo50 = platformComponentInfo24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 8:
                        i4 |= 256;
                        platformComponentInfo24 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, PlatformComponentInfo$$serializer.INSTANCE, platformComponentInfo50);
                        platformComponentInfo25 = platformComponentInfo51;
                        platformComponentInfo26 = platformComponentInfo52;
                        platformComponentInfo51 = platformComponentInfo25;
                        platformComponentInfo52 = platformComponentInfo26;
                        platformComponentInfo50 = platformComponentInfo24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 9:
                        platformComponentInfo56 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, PlatformComponentInfo$$serializer.INSTANCE, platformComponentInfo56);
                        i4 |= 512;
                        platformComponentInfo24 = platformComponentInfo50;
                        platformComponentInfo25 = platformComponentInfo51;
                        platformComponentInfo26 = platformComponentInfo52;
                        platformComponentInfo51 = platformComponentInfo25;
                        platformComponentInfo52 = platformComponentInfo26;
                        platformComponentInfo50 = platformComponentInfo24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 10:
                        i4 |= 1024;
                        platformComponentInfo43 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, PlatformComponentInfo$$serializer.INSTANCE, platformComponentInfo43);
                        platformComponentInfo24 = platformComponentInfo50;
                        platformComponentInfo25 = platformComponentInfo51;
                        platformComponentInfo26 = platformComponentInfo52;
                        platformComponentInfo51 = platformComponentInfo25;
                        platformComponentInfo52 = platformComponentInfo26;
                        platformComponentInfo50 = platformComponentInfo24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 11:
                        i4 |= 2048;
                        platformComponentInfo48 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, PlatformComponentInfo$$serializer.INSTANCE, platformComponentInfo48);
                        platformComponentInfo24 = platformComponentInfo50;
                        platformComponentInfo25 = platformComponentInfo51;
                        platformComponentInfo26 = platformComponentInfo52;
                        platformComponentInfo51 = platformComponentInfo25;
                        platformComponentInfo52 = platformComponentInfo26;
                        platformComponentInfo50 = platformComponentInfo24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 12:
                        i4 |= 4096;
                        platformComponentInfo44 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, PlatformComponentInfo$$serializer.INSTANCE, platformComponentInfo44);
                        platformComponentInfo24 = platformComponentInfo50;
                        platformComponentInfo25 = platformComponentInfo51;
                        platformComponentInfo26 = platformComponentInfo52;
                        platformComponentInfo51 = platformComponentInfo25;
                        platformComponentInfo52 = platformComponentInfo26;
                        platformComponentInfo50 = platformComponentInfo24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 13:
                        i4 |= 8192;
                        platformComponentInfo45 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, PlatformComponentInfo$$serializer.INSTANCE, platformComponentInfo45);
                        platformComponentInfo24 = platformComponentInfo50;
                        platformComponentInfo25 = platformComponentInfo51;
                        platformComponentInfo26 = platformComponentInfo52;
                        platformComponentInfo51 = platformComponentInfo25;
                        platformComponentInfo52 = platformComponentInfo26;
                        platformComponentInfo50 = platformComponentInfo24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 14:
                        i4 |= 16384;
                        platformComponentInfo46 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, PlatformComponentInfo$$serializer.INSTANCE, platformComponentInfo46);
                        platformComponentInfo24 = platformComponentInfo50;
                        platformComponentInfo25 = platformComponentInfo51;
                        platformComponentInfo26 = platformComponentInfo52;
                        platformComponentInfo51 = platformComponentInfo25;
                        platformComponentInfo52 = platformComponentInfo26;
                        platformComponentInfo50 = platformComponentInfo24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    case 15:
                        i4 |= 32768;
                        platformComponentInfo49 = (PlatformComponentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, PlatformComponentInfo$$serializer.INSTANCE, platformComponentInfo49);
                        platformComponentInfo24 = platformComponentInfo50;
                        platformComponentInfo25 = platformComponentInfo51;
                        platformComponentInfo26 = platformComponentInfo52;
                        platformComponentInfo51 = platformComponentInfo25;
                        platformComponentInfo52 = platformComponentInfo26;
                        platformComponentInfo50 = platformComponentInfo24;
                        i3 = 15;
                        i2 = 11;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            platformComponentInfo = platformComponentInfo42;
            platformComponentInfo2 = platformComponentInfo51;
            platformComponentInfo3 = platformComponentInfo43;
            platformComponentInfo4 = platformComponentInfo44;
            platformComponentInfo5 = platformComponentInfo48;
            platformComponentInfo6 = platformComponentInfo49;
            platformComponentInfo7 = platformComponentInfo52;
            platformComponentInfo8 = platformComponentInfo56;
            platformComponentInfo9 = platformComponentInfo41;
            i = i4;
            platformComponentInfo10 = platformComponentInfo46;
            platformComponentInfo11 = platformComponentInfo47;
            platformComponentInfo12 = platformComponentInfo54;
            platformComponentInfo13 = platformComponentInfo50;
            platformComponentInfo14 = platformComponentInfo53;
            platformComponentInfo15 = platformComponentInfo45;
            platformComponentInfo16 = platformComponentInfo55;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AndroidPlatformComponents(i, platformComponentInfo16, platformComponentInfo12, platformComponentInfo14, platformComponentInfo9, platformComponentInfo11, platformComponentInfo, platformComponentInfo7, platformComponentInfo2, platformComponentInfo13, platformComponentInfo8, platformComponentInfo3, platformComponentInfo5, platformComponentInfo4, platformComponentInfo15, platformComponentInfo10, platformComponentInfo6, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AndroidPlatformComponents androidPlatformComponents) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(androidPlatformComponents, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AndroidPlatformComponents.write$Self$OKShare_sdk_share_impl(androidPlatformComponents, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
