package com.okinc.business.dexlogic.bean;

import java.util.ArrayList;
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

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class SubRouter$$serializer implements GeneratedSerializer<SubRouter> {
    public static final int $stable;
    public static final SubRouter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SubRouter$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SubRouter$$serializer subRouter$$serializer = new SubRouter$$serializer();
        INSTANCE = subRouter$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.SubRouter", subRouter$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("dexQuoteInfoList", true);
        pluginGeneratedSerialDescriptor.addElement("fromToken", true);
        pluginGeneratedSerialDescriptor.addElement("toToken", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer nullable = BuiltinSerializersKt.getNullable(SubRouter.$childSerializers[0]);
        DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SubRouter deserialize(@NotNull Decoder decoder) {
        int i;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        ArrayList arrayList;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SubRouter.$childSerializers;
        DexMultiTokenInfoBean dexMultiTokenInfoBean3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            ArrayList arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
            DexMultiTokenInfoBean dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, dexMultiTokenInfoBean$$serializer, null);
            arrayList = arrayList2;
            dexMultiTokenInfoBean2 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, dexMultiTokenInfoBean$$serializer, null);
            i = 7;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean4;
        } else {
            boolean z = true;
            int i2 = 0;
            ArrayList arrayList3 = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    arrayList3 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], arrayList3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    dexMultiTokenInfoBean3 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean3);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    dexMultiTokenInfoBean5 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean5);
                    i2 |= 4;
                }
            }
            i = i2;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean3;
            arrayList = arrayList3;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SubRouter(i, arrayList, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SubRouter subRouter) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(subRouter, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SubRouter.write$Self$OKDex_dex_impl(subRouter, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
