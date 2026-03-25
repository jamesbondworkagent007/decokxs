package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class AddressAllAssetToken$$serializer implements GeneratedSerializer<AddressAllAssetToken> {
    public static final int $stable;
    public static final AddressAllAssetToken$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AddressAllAssetToken$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AddressAllAssetToken$$serializer addressAllAssetToken$$serializer = new AddressAllAssetToken$$serializer();
        INSTANCE = addressAllAssetToken$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.AddressAllAssetToken", addressAllAssetToken$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("total", true);
        pluginGeneratedSerialDescriptor.addElement("pageSize", true);
        pluginGeneratedSerialDescriptor.addElement("currentPage", true);
        pluginGeneratedSerialDescriptor.addElement("tokenlist", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = AddressAllAssetToken.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, intSerializer, intSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[3])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AddressAllAssetToken deserialize(@NotNull Decoder decoder) {
        int i;
        int i2;
        List list;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AddressAllAssetToken.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            i = iDecodeIntElement;
            i2 = 15;
            i3 = iDecodeIntElement3;
            i4 = iDecodeIntElement2;
        } else {
            List list2 = null;
            int iDecodeIntElement4 = 0;
            int i5 = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i5 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i5 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i5 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], list2);
                    i5 |= 8;
                }
            }
            i = iDecodeIntElement4;
            i2 = i5;
            list = list2;
            i3 = iDecodeIntElement5;
            i4 = iDecodeIntElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AddressAllAssetToken(i2, i, i4, i3, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AddressAllAssetToken addressAllAssetToken) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(addressAllAssetToken, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AddressAllAssetToken.write$Self$OKWallet_wallet_impl(addressAllAssetToken, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
