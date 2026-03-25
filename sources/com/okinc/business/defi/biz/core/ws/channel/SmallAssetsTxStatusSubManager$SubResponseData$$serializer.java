package com.okinc.business.defi.biz.core.ws.channel;

import com.okinc.business.defi.biz.core.ws.channel.SmallAssetsTxStatusSubManager;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class SmallAssetsTxStatusSubManager$SubResponseData$$serializer implements GeneratedSerializer<SmallAssetsTxStatusSubManager.SubResponseData> {
    public static final int $stable;
    public static final SmallAssetsTxStatusSubManager$SubResponseData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SmallAssetsTxStatusSubManager$SubResponseData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SmallAssetsTxStatusSubManager$SubResponseData$$serializer smallAssetsTxStatusSubManager$SubResponseData$$serializer = new SmallAssetsTxStatusSubManager$SubResponseData$$serializer();
        INSTANCE = smallAssetsTxStatusSubManager$SubResponseData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.core.ws.channel.SmallAssetsTxStatusSubManager.SubResponseData", smallAssetsTxStatusSubManager$SubResponseData$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("totalNetworkFee", true);
        pluginGeneratedSerialDescriptor.addElement("failedOrderCount", true);
        pluginGeneratedSerialDescriptor.addElement("successNativeTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("successOrderCount", true);
        pluginGeneratedSerialDescriptor.addElement("totalOrderCount", true);
        pluginGeneratedSerialDescriptor.addElement("batchOrderId", true);
        pluginGeneratedSerialDescriptor.addElement("userWalletAddress", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SmallAssetsTxStatusSubManager.SubResponseData deserialize(@NotNull Decoder decoder) {
        String str;
        Long l;
        Integer num;
        String str2;
        int i;
        Integer num2;
        String str3;
        Integer num3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 6;
        String str4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, intSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, intSerializer, null);
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, intSerializer, null);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            i = 127;
            l = l2;
            num2 = num5;
            num = num6;
            str2 = str6;
            str3 = str5;
            num3 = num4;
        } else {
            int i3 = 0;
            boolean z = true;
            Integer num7 = null;
            Long l3 = null;
            Integer num8 = null;
            String str7 = null;
            Integer num9 = null;
            String str8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        break;
                    case 0:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str7);
                        i3 |= 1;
                        i2 = 6;
                        break;
                    case 1:
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, num7);
                        i3 |= 2;
                        i2 = 6;
                        break;
                    case 2:
                        i3 |= 4;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str8);
                        i2 = 6;
                        break;
                    case 3:
                        i3 |= 8;
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num8);
                        i2 = 6;
                        break;
                    case 4:
                        i3 |= 16;
                        num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, num9);
                        i2 = 6;
                        break;
                    case 5:
                        i3 |= 32;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, l3);
                        i2 = 6;
                        break;
                    case 6:
                        i3 |= 64;
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str4);
                        i2 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str4;
            l = l3;
            num = num9;
            str2 = str8;
            i = i3;
            num2 = num8;
            str3 = str7;
            num3 = num7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SmallAssetsTxStatusSubManager.SubResponseData(i, str3, num3, str2, num2, num, l, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SmallAssetsTxStatusSubManager.SubResponseData subResponseData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(subResponseData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SmallAssetsTxStatusSubManager.SubResponseData.write$Self$OKWallet_wallet_impl(subResponseData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
