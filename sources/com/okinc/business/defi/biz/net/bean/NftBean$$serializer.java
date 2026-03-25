package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.api.bean.NftPrice;
import com.okinc.business.defi.api.bean.NftPrice$$serializer;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class NftBean$$serializer implements GeneratedSerializer<NftBean> {
    public static final int $stable;
    public static final NftBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NftBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NftBean$$serializer nftBean$$serializer = new NftBean$$serializer();
        INSTANCE = nftBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.NftBean", nftBean$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("prj", true);
        pluginGeneratedSerialDescriptor.addElement("nm", true);
        pluginGeneratedSerialDescriptor.addElement("net", true);
        pluginGeneratedSerialDescriptor.addElement("lg", true);
        pluginGeneratedSerialDescriptor.addElement("chId", true);
        pluginGeneratedSerialDescriptor.addElement("fsp", true);
        pluginGeneratedSerialDescriptor.addElement("od", true);
        pluginGeneratedSerialDescriptor.addElement("tot", true);
        pluginGeneratedSerialDescriptor.addElement("owner", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(intSerializer), stringSerializer, stringSerializer, stringSerializer, LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(NftPrice$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NftBean deserialize(@NotNull Decoder decoder) {
        NftPrice nftPrice;
        Boolean bool;
        int i;
        String str;
        Integer num;
        Integer num2;
        Integer num3;
        String str2;
        String str3;
        long j;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, intSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            NftPrice nftPrice2 = (NftPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, NftPrice$$serializer.INSTANCE, null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, intSerializer, null);
            num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, intSerializer, null);
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, null);
            num2 = num5;
            nftPrice = nftPrice2;
            str2 = strDecodeStringElement4;
            num = num4;
            j = jDecodeLongElement;
            str = strDecodeStringElement3;
            str3 = strDecodeStringElement2;
            i = 511;
        } else {
            int i5 = 0;
            boolean z = true;
            Integer num6 = null;
            NftPrice nftPrice3 = null;
            Integer num7 = null;
            String strDecodeStringElement5 = null;
            Integer num8 = null;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement6 = null;
            Boolean bool2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 0:
                        i5 |= 1;
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num8);
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 1:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i2 = 7;
                        break;
                    case 2:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        break;
                    case 4:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i5 |= 16;
                        break;
                    case 5:
                        i5 |= 32;
                        nftPrice3 = (NftPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, NftPrice$$serializer.INSTANCE, nftPrice3);
                        break;
                    case 6:
                        i5 |= 64;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, IntSerializer.INSTANCE, num6);
                        break;
                    case 7:
                        i5 |= 128;
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, IntSerializer.INSTANCE, num7);
                        break;
                    case 8:
                        i5 |= 256;
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Integer num9 = num8;
            nftPrice = nftPrice3;
            bool = bool2;
            i = i5;
            str = strDecodeStringElement;
            num = num9;
            long j2 = jDecodeLongElement2;
            num2 = num6;
            num3 = num7;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement5;
            j = j2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NftBean(i, num, str3, str, str2, j, nftPrice, num2, num3, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NftBean nftBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(nftBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NftBean.write$Self$OKWallet_wallet_impl(nftBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
