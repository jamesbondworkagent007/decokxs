package com.okinc.business.dexlogic.bean;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class MemeModeQuoteBean$$serializer implements GeneratedSerializer<MemeModeQuoteBean> {
    public static final int $stable;
    public static final MemeModeQuoteBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MemeModeQuoteBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MemeModeQuoteBean$$serializer memeModeQuoteBean$$serializer = new MemeModeQuoteBean$$serializer();
        INSTANCE = memeModeQuoteBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.MemeModeQuoteBean", memeModeQuoteBean$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("defiPlatformInfoList", true);
        pluginGeneratedSerialDescriptor.addElement("memeModeCommonDexInfo", false);
        pluginGeneratedSerialDescriptor.addElement("traceData", false);
        pluginGeneratedSerialDescriptor.addElement("localSelectedDeFiPlatformId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{MemeModeQuoteBean.$childSerializers[0], MemeModeCommonDexInfo$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(TraceData$$serializer.INSTANCE), StringSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MemeModeQuoteBean deserialize(@NotNull Decoder decoder) {
        int i;
        TraceData traceData;
        List list;
        String strDecodeStringElement;
        MemeModeCommonDexInfo memeModeCommonDexInfo;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = MemeModeQuoteBean.$childSerializers;
        TraceData traceData2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            MemeModeCommonDexInfo memeModeCommonDexInfo2 = (MemeModeCommonDexInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, MemeModeCommonDexInfo$$serializer.INSTANCE, null);
            TraceData traceData3 = (TraceData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, TraceData$$serializer.INSTANCE, null);
            list = list2;
            memeModeCommonDexInfo = memeModeCommonDexInfo2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            traceData = traceData3;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            List list3 = null;
            String strDecodeStringElement2 = null;
            MemeModeCommonDexInfo memeModeCommonDexInfo3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    memeModeCommonDexInfo3 = (MemeModeCommonDexInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, MemeModeCommonDexInfo$$serializer.INSTANCE, memeModeCommonDexInfo3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    traceData2 = (TraceData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, TraceData$$serializer.INSTANCE, traceData2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            traceData = traceData2;
            list = list3;
            strDecodeStringElement = strDecodeStringElement2;
            memeModeCommonDexInfo = memeModeCommonDexInfo3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MemeModeQuoteBean(i, list, memeModeCommonDexInfo, traceData, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MemeModeQuoteBean memeModeQuoteBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(memeModeQuoteBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MemeModeQuoteBean.write$Self$OKDex_dex_impl(memeModeQuoteBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
