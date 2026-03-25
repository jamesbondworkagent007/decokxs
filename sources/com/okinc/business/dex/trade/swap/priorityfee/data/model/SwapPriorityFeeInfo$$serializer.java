package com.okinc.business.dex.trade.swap.priorityfee.data.model;

import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo$$serializer;
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
public final /* synthetic */ class SwapPriorityFeeInfo$$serializer implements GeneratedSerializer<SwapPriorityFeeInfo> {
    public static final int $stable;
    public static final SwapPriorityFeeInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SwapPriorityFeeInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SwapPriorityFeeInfo$$serializer swapPriorityFeeInfo$$serializer = new SwapPriorityFeeInfo$$serializer();
        INSTANCE = swapPriorityFeeInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo", swapPriorityFeeInfo$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("mev", true);
        pluginGeneratedSerialDescriptor.addElement("normal", true);
        pluginGeneratedSerialDescriptor.addElement("min", true);
        pluginGeneratedSerialDescriptor.addElement("max", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(SwapPriorityFeeInfo.$childSerializers[0]), BuiltinSerializersKt.getNullable(NonMevPriorityFeeInfo$$serializer.INSTANCE), stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SwapPriorityFeeInfo deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        List list;
        String strDecodeStringElement;
        NonMevPriorityFeeInfo nonMevPriorityFeeInfo;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SwapPriorityFeeInfo.$childSerializers;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            NonMevPriorityFeeInfo nonMevPriorityFeeInfo2 = (NonMevPriorityFeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, NonMevPriorityFeeInfo$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            list = list2;
            nonMevPriorityFeeInfo = nonMevPriorityFeeInfo2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            str = strDecodeStringElement3;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            List list3 = null;
            String strDecodeStringElement4 = null;
            NonMevPriorityFeeInfo nonMevPriorityFeeInfo3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], list3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    nonMevPriorityFeeInfo3 = (NonMevPriorityFeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, NonMevPriorityFeeInfo$$serializer.INSTANCE, nonMevPriorityFeeInfo3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement2;
            list = list3;
            strDecodeStringElement = strDecodeStringElement4;
            nonMevPriorityFeeInfo = nonMevPriorityFeeInfo3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SwapPriorityFeeInfo(i, list, nonMevPriorityFeeInfo, str, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SwapPriorityFeeInfo swapPriorityFeeInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(swapPriorityFeeInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SwapPriorityFeeInfo.write$Self$OKDex_dex_impl(swapPriorityFeeInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
