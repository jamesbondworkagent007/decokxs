package com.okinc.business.dexlogic.bean;

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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class DexDefaultFromToTokenShowVO$$serializer implements GeneratedSerializer<DexDefaultFromToTokenShowVO> {
    public static final int $stable;
    public static final DexDefaultFromToTokenShowVO$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DexDefaultFromToTokenShowVO$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DexDefaultFromToTokenShowVO$$serializer dexDefaultFromToTokenShowVO$$serializer = new DexDefaultFromToTokenShowVO$$serializer();
        INSTANCE = dexDefaultFromToTokenShowVO$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.DexDefaultFromToTokenShowVO", dexDefaultFromToTokenShowVO$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("fromDexMultiTokenInfoVO", true);
        pluginGeneratedSerialDescriptor.addElement("toDexMultiTokenInfoVO", true);
        pluginGeneratedSerialDescriptor.addElement("toCrossDexMultiTokenInfoVO", true);
        pluginGeneratedSerialDescriptor.addElement("nativeToken", true);
        pluginGeneratedSerialDescriptor.addElement("warpTokenVO", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DexDefaultFromToTokenShowVO deserialize(@NotNull Decoder decoder) {
        int i;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2;
        DexMultiTokenInfoBean dexMultiTokenInfoBean3;
        DexMultiTokenInfoBean dexMultiTokenInfoBean4;
        DexMultiTokenInfoBean dexMultiTokenInfoBean5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        DexMultiTokenInfoBean dexMultiTokenInfoBean6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
            DexMultiTokenInfoBean dexMultiTokenInfoBean7 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, dexMultiTokenInfoBean$$serializer, null);
            DexMultiTokenInfoBean dexMultiTokenInfoBean8 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, dexMultiTokenInfoBean$$serializer, null);
            DexMultiTokenInfoBean dexMultiTokenInfoBean9 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, dexMultiTokenInfoBean$$serializer, null);
            DexMultiTokenInfoBean dexMultiTokenInfoBean10 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, dexMultiTokenInfoBean$$serializer, null);
            dexMultiTokenInfoBean2 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, dexMultiTokenInfoBean$$serializer, null);
            dexMultiTokenInfoBean3 = dexMultiTokenInfoBean10;
            i = 31;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean9;
            dexMultiTokenInfoBean5 = dexMultiTokenInfoBean7;
            dexMultiTokenInfoBean4 = dexMultiTokenInfoBean8;
        } else {
            int i2 = 0;
            boolean z = true;
            DexMultiTokenInfoBean dexMultiTokenInfoBean11 = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean12 = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean13 = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean14 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    dexMultiTokenInfoBean14 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean14);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    dexMultiTokenInfoBean13 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean13);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    dexMultiTokenInfoBean6 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean6);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    dexMultiTokenInfoBean12 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean12);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    dexMultiTokenInfoBean11 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean11);
                    i2 |= 16;
                }
            }
            i = i2;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean6;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean11;
            dexMultiTokenInfoBean3 = dexMultiTokenInfoBean12;
            dexMultiTokenInfoBean4 = dexMultiTokenInfoBean13;
            dexMultiTokenInfoBean5 = dexMultiTokenInfoBean14;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DexDefaultFromToTokenShowVO(i, dexMultiTokenInfoBean5, dexMultiTokenInfoBean4, dexMultiTokenInfoBean, dexMultiTokenInfoBean3, dexMultiTokenInfoBean2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dexDefaultFromToTokenShowVO, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DexDefaultFromToTokenShowVO.write$Self$OKDex_dex_impl(dexDefaultFromToTokenShowVO, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
