package com.okinc.business.defi.api.bean;

import androidx.core.app.FrameMetricsAggregator;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class BtcNftMintSignData$$serializer implements GeneratedSerializer<BtcNftMintSignData> {
    public static final int $stable;
    public static final BtcNftMintSignData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BtcNftMintSignData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BtcNftMintSignData$$serializer btcNftMintSignData$$serializer = new BtcNftMintSignData$$serializer();
        INSTANCE = btcNftMintSignData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.api.bean.BtcNftMintSignData", btcNftMintSignData$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("from", false);
        pluginGeneratedSerialDescriptor.addElement("to", false);
        pluginGeneratedSerialDescriptor.addElement("inscribeType", false);
        pluginGeneratedSerialDescriptor.addElement("inscribeList", false);
        pluginGeneratedSerialDescriptor.addElement("inscribeOutputSat", true);
        pluginGeneratedSerialDescriptor.addElement("coinId", true);
        pluginGeneratedSerialDescriptor.addElement("coinAmount", true);
        pluginGeneratedSerialDescriptor.addElement("gasRate", true);
        pluginGeneratedSerialDescriptor.addElement("protocolId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = BtcNftMintSignData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, intSerializer, kSerializerArr[3], BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BtcNftMintSignData deserialize(@NotNull Decoder decoder) {
        String str;
        Integer num;
        String str2;
        List list;
        String str3;
        Integer num2;
        String str4;
        Long l;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = BtcNftMintSignData.$childSerializers;
        int i3 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, intSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, intSerializer, null);
            i = FrameMetricsAggregator.EVERY_DURATION;
            list = list2;
            num = num3;
            str2 = str6;
            l = l2;
            num2 = num4;
            str = str5;
            i2 = iDecodeIntElement;
            str4 = strDecodeStringElement2;
            str3 = strDecodeStringElement;
        } else {
            int iDecodeIntElement2 = 0;
            boolean z = true;
            Integer num5 = null;
            Long l3 = null;
            Integer num6 = null;
            String str7 = null;
            str = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            List list3 = null;
            int i4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 7;
                        break;
                    case 0:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 7;
                        break;
                    case 1:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 7;
                        break;
                    case 2:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i4 |= 4;
                        i3 = 7;
                        break;
                    case 3:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list3);
                        i4 |= 8;
                        i3 = 7;
                        break;
                    case 4:
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str);
                        i4 |= 16;
                        i3 = 7;
                        break;
                    case 5:
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, l3);
                        i4 |= 32;
                        i3 = 7;
                        break;
                    case 6:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str7);
                        i4 |= 64;
                        break;
                    case 7:
                        i4 |= 128;
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, IntSerializer.INSTANCE, num5);
                        i3 = 7;
                        break;
                    case 8:
                        i4 |= 256;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, num6);
                        i3 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            num = num5;
            str2 = str7;
            list = list3;
            str3 = strDecodeStringElement4;
            num2 = num6;
            str4 = strDecodeStringElement3;
            l = l3;
            i = i4;
            i2 = iDecodeIntElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BtcNftMintSignData(i, str3, str4, i2, list, str, l, str2, num, num2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BtcNftMintSignData btcNftMintSignData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(btcNftMintSignData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BtcNftMintSignData.write$Self$OKWallet_wallet_api(btcNftMintSignData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
