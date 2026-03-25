package com.okinc.business.dexlogic.bean;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class MemeCurrencyBean$$serializer implements GeneratedSerializer<MemeCurrencyBean> {
    public static final int $stable;
    public static final MemeCurrencyBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MemeCurrencyBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MemeCurrencyBean$$serializer memeCurrencyBean$$serializer = new MemeCurrencyBean$$serializer();
        INSTANCE = memeCurrencyBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.MemeCurrencyBean", memeCurrencyBean$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("currencyTokenInfo", false);
        pluginGeneratedSerialDescriptor.addElement("currencyDefaultBuyAmountList", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{DexMultiTokenInfoBean$$serializer.INSTANCE, MemeCurrencyBean.$childSerializers[1]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MemeCurrencyBean deserialize(@NotNull Decoder decoder) {
        List list;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = MemeCurrencyBean.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            dexMultiTokenInfoBean = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, DexMultiTokenInfoBean$$serializer.INSTANCE, null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            i = 3;
        } else {
            List list2 = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    dexMultiTokenInfoBean2 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], list2);
                    i2 |= 2;
                }
            }
            list = list2;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MemeCurrencyBean(i, dexMultiTokenInfoBean, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MemeCurrencyBean memeCurrencyBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(memeCurrencyBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MemeCurrencyBean.write$Self$OKDex_dex_impl(memeCurrencyBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
