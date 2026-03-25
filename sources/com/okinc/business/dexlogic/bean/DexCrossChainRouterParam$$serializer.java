package com.okinc.business.dexlogic.bean;

import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class DexCrossChainRouterParam$$serializer implements GeneratedSerializer<DexCrossChainRouterParam> {
    public static final int $stable;
    public static final DexCrossChainRouterParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DexCrossChainRouterParam$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DexCrossChainRouterParam$$serializer dexCrossChainRouterParam$$serializer = new DexCrossChainRouterParam$$serializer();
        INSTANCE = dexCrossChainRouterParam$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.DexCrossChainRouterParam", dexCrossChainRouterParam$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("fromDexRouterList", true);
        pluginGeneratedSerialDescriptor.addElement(TabTitleInfo.KEY_BRIDGE, true);
        pluginGeneratedSerialDescriptor.addElement("toDexRouterToList", true);
        pluginGeneratedSerialDescriptor.addElement("originFromDexRouterList", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = DexCrossChainRouterParam.$childSerializers;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(kSerializerArr[0]), BuiltinSerializersKt.getNullable(DexQuoteBridgeVO$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[2]), BuiltinSerializersKt.getNullable(kSerializerArr[3])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DexCrossChainRouterParam deserialize(@NotNull Decoder decoder) {
        int i;
        List list;
        List list2;
        DexQuoteBridgeVO dexQuoteBridgeVO;
        List list3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DexCrossChainRouterParam.$childSerializers;
        List list4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            DexQuoteBridgeVO dexQuoteBridgeVO2 = (DexQuoteBridgeVO) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, DexQuoteBridgeVO$$serializer.INSTANCE, null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            list3 = list5;
            i = 15;
            dexQuoteBridgeVO = dexQuoteBridgeVO2;
            list = list6;
        } else {
            boolean z = true;
            int i2 = 0;
            List list7 = null;
            DexQuoteBridgeVO dexQuoteBridgeVO3 = null;
            List list8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], list8);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    dexQuoteBridgeVO3 = (DexQuoteBridgeVO) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, DexQuoteBridgeVO$$serializer.INSTANCE, dexQuoteBridgeVO3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], list4);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], list7);
                    i2 |= 8;
                }
            }
            i = i2;
            list = list4;
            list2 = list7;
            dexQuoteBridgeVO = dexQuoteBridgeVO3;
            list3 = list8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DexCrossChainRouterParam(i, list3, dexQuoteBridgeVO, list, list2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DexCrossChainRouterParam dexCrossChainRouterParam) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dexCrossChainRouterParam, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DexCrossChainRouterParam.write$Self$OKDex_dex_impl(dexCrossChainRouterParam, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
