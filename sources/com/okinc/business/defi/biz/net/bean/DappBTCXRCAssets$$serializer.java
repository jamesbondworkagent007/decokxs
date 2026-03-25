package com.okinc.business.defi.biz.net.bean;

import com.okinc.p2p.api.OtcExtraKeys;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DappBTCXRCAssets$$serializer implements GeneratedSerializer<DappBTCXRCAssets> {
    public static final int $stable;
    public static final DappBTCXRCAssets$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DappBTCXRCAssets$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DappBTCXRCAssets$$serializer dappBTCXRCAssets$$serializer = new DappBTCXRCAssets$$serializer();
        INSTANCE = dappBTCXRCAssets$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.DappBTCXRCAssets", dappBTCXRCAssets$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("symbol", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, true);
        pluginGeneratedSerialDescriptor.addElement("vdecimal", true);
        pluginGeneratedSerialDescriptor.addElement("protocolName", true);
        pluginGeneratedSerialDescriptor.addElement("protocolId", true);
        pluginGeneratedSerialDescriptor.addElement("protocolType", true);
        pluginGeneratedSerialDescriptor.addElement("logo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DappBTCXRCAssets deserialize(@NotNull Decoder decoder) {
        String str;
        Integer num;
        Integer num2;
        Integer num3;
        int i;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 6;
        String str5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, intSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, intSerializer, null);
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, intSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            i = 127;
            num = num6;
            str2 = str8;
            num2 = num5;
            num3 = num4;
            str3 = str6;
            str4 = str7;
        } else {
            int i3 = 0;
            boolean z = true;
            String str9 = null;
            Integer num7 = null;
            String str10 = null;
            String str11 = null;
            Integer num8 = null;
            Integer num9 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        break;
                    case 0:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str11);
                        i3 |= 1;
                        i2 = 6;
                        break;
                    case 1:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str9);
                        i3 |= 2;
                        i2 = 6;
                        break;
                    case 2:
                        i3 |= 4;
                        num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num9);
                        i2 = 6;
                        break;
                    case 3:
                        i3 |= 8;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str10);
                        i2 = 6;
                        break;
                    case 4:
                        i3 |= 16;
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, num8);
                        i2 = 6;
                        break;
                    case 5:
                        i3 |= 32;
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, num7);
                        i2 = 6;
                        break;
                    case 6:
                        i3 |= 64;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str5);
                        i2 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str5;
            num = num7;
            num2 = num8;
            num3 = num9;
            i = i3;
            str2 = str10;
            str3 = str11;
            str4 = str9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DappBTCXRCAssets(i, str3, str4, num3, str2, num2, num, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DappBTCXRCAssets dappBTCXRCAssets) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dappBTCXRCAssets, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DappBTCXRCAssets.write$Self$OKWallet_wallet_impl(dappBTCXRCAssets, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
