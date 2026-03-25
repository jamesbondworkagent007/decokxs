package com.okinc.business.dexlogic.bean;

import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo$$serializer;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class QuotePriceRes$$serializer implements GeneratedSerializer<QuotePriceRes> {
    public static final int $stable;
    public static final QuotePriceRes$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private QuotePriceRes$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        QuotePriceRes$$serializer quotePriceRes$$serializer = new QuotePriceRes$$serializer();
        INSTANCE = quotePriceRes$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.QuotePriceRes", quotePriceRes$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("defiPlatformInfoList", true);
        pluginGeneratedSerialDescriptor.addElement("pathSelectionRouterList", true);
        pluginGeneratedSerialDescriptor.addElement("swapType", true);
        pluginGeneratedSerialDescriptor.addElement("commonDexInfo", true);
        pluginGeneratedSerialDescriptor.addElement("success", true);
        pluginGeneratedSerialDescriptor.addElement("isReset", true);
        pluginGeneratedSerialDescriptor.addElement("localAAReservedQuote", true);
        pluginGeneratedSerialDescriptor.addElement("isSupportDappTrade", true);
        pluginGeneratedSerialDescriptor.addElement("traceData", true);
        pluginGeneratedSerialDescriptor.addElement("priorityFeeInfo", true);
        pluginGeneratedSerialDescriptor.addElement("localVerifyDexUniqueKey", true);
        pluginGeneratedSerialDescriptor.addElement("localSelectedDeFiPlatformId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = QuotePriceRes.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], BuiltinSerializersKt.getNullable(kSerializerArr[1]), stringSerializer, CommonDexInfo$$serializer.INSTANCE, booleanSerializer, booleanSerializer, booleanSerializer, stringSerializer, BuiltinSerializersKt.getNullable(TraceData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(SwapPriorityFeeInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final QuotePriceRes deserialize(@NotNull Decoder decoder) {
        String str;
        CommonDexInfo commonDexInfo;
        String strDecodeStringElement;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        List list;
        TraceData traceData;
        String str3;
        SwapPriorityFeeInfo swapPriorityFeeInfo;
        List list2;
        int i;
        CommonDexInfo commonDexInfo2;
        List list3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = QuotePriceRes.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            CommonDexInfo commonDexInfo3 = (CommonDexInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, CommonDexInfo$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            TraceData traceData2 = (TraceData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, TraceData$$serializer.INSTANCE, null);
            SwapPriorityFeeInfo swapPriorityFeeInfo2 = (SwapPriorityFeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, SwapPriorityFeeInfo$$serializer.INSTANCE, null);
            i = 4095;
            list = list5;
            list2 = list4;
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            swapPriorityFeeInfo = swapPriorityFeeInfo2;
            str2 = strDecodeStringElement4;
            z = zDecodeBooleanElement3;
            z2 = zDecodeBooleanElement2;
            commonDexInfo = commonDexInfo3;
            traceData = traceData2;
            z3 = zDecodeBooleanElement;
            str = strDecodeStringElement3;
        } else {
            int i6 = 11;
            TraceData traceData3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            CommonDexInfo commonDexInfo4 = null;
            List list6 = null;
            List list7 = null;
            int i7 = 0;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            boolean z4 = true;
            String str4 = null;
            SwapPriorityFeeInfo swapPriorityFeeInfo3 = null;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        commonDexInfo2 = commonDexInfo4;
                        list3 = list6;
                        z4 = false;
                        commonDexInfo4 = commonDexInfo2;
                        list6 = list3;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 0:
                        commonDexInfo2 = commonDexInfo4;
                        list3 = list6;
                        list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list7);
                        i7 |= 1;
                        commonDexInfo4 = commonDexInfo2;
                        list6 = list3;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 1:
                        commonDexInfo2 = commonDexInfo4;
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], list6);
                        i7 |= 2;
                        list3 = list6;
                        commonDexInfo4 = commonDexInfo2;
                        list6 = list3;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 2:
                        commonDexInfo2 = commonDexInfo4;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        list3 = list6;
                        commonDexInfo4 = commonDexInfo2;
                        list6 = list3;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 3:
                        i7 |= 8;
                        list3 = list6;
                        commonDexInfo2 = (CommonDexInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, CommonDexInfo$$serializer.INSTANCE, commonDexInfo4);
                        commonDexInfo4 = commonDexInfo2;
                        list6 = list3;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        break;
                    case 4:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i7 |= 16;
                        break;
                    case 5:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i7 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i5);
                        i7 |= 64;
                        break;
                    case 7:
                        i7 |= 128;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        break;
                    case 8:
                        i7 |= 256;
                        traceData3 = (TraceData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, TraceData$$serializer.INSTANCE, traceData3);
                        break;
                    case 9:
                        i7 |= 512;
                        swapPriorityFeeInfo3 = (SwapPriorityFeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, SwapPriorityFeeInfo$$serializer.INSTANCE, swapPriorityFeeInfo3);
                        break;
                    case 10:
                        i7 |= 1024;
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str4);
                        break;
                    case 11:
                        i7 |= 2048;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list8 = list6;
            List list9 = list7;
            str = strDecodeStringElement2;
            commonDexInfo = commonDexInfo4;
            strDecodeStringElement = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            z = zDecodeBooleanElement4;
            z2 = zDecodeBooleanElement5;
            z3 = zDecodeBooleanElement6;
            list = list8;
            traceData = traceData3;
            str3 = str4;
            swapPriorityFeeInfo = swapPriorityFeeInfo3;
            list2 = list9;
            i = i7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new QuotePriceRes(i, list2, list, str, commonDexInfo, z3, z2, z, str2, traceData, swapPriorityFeeInfo, str3, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull QuotePriceRes quotePriceRes) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        QuotePriceRes.write$Self$OKDex_dex_impl(quotePriceRes, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
