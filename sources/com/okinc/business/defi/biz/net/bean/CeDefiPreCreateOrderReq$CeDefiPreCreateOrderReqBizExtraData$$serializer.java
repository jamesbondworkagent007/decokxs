package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.biz.net.bean.CeDefiPreCreateOrderReq;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class CeDefiPreCreateOrderReq$CeDefiPreCreateOrderReqBizExtraData$$serializer implements GeneratedSerializer<CeDefiPreCreateOrderReq.CeDefiPreCreateOrderReqBizExtraData> {
    public static final int $stable;
    public static final CeDefiPreCreateOrderReq$CeDefiPreCreateOrderReqBizExtraData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CeDefiPreCreateOrderReq$CeDefiPreCreateOrderReqBizExtraData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CeDefiPreCreateOrderReq$CeDefiPreCreateOrderReqBizExtraData$$serializer ceDefiPreCreateOrderReq$CeDefiPreCreateOrderReqBizExtraData$$serializer = new CeDefiPreCreateOrderReq$CeDefiPreCreateOrderReqBizExtraData$$serializer();
        INSTANCE = ceDefiPreCreateOrderReq$CeDefiPreCreateOrderReqBizExtraData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.CeDefiPreCreateOrderReq.CeDefiPreCreateOrderReqBizExtraData", ceDefiPreCreateOrderReq$CeDefiPreCreateOrderReqBizExtraData$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("toAddress", false);
        pluginGeneratedSerialDescriptor.addElement("transferType", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAmount", false);
        pluginGeneratedSerialDescriptor.addElement("gasPayType", false);
        pluginGeneratedSerialDescriptor.addElement("gasToken", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, intSerializer, stringSerializer, BuiltinSerializersKt.getNullable(intSerializer), CeDefiPreCreateOrderReq$CeDefiPreCreateOrderReqBizExtraData$CeDefiPreCreateOrderReqBizExtraDataGasToken$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CeDefiPreCreateOrderReq.CeDefiPreCreateOrderReqBizExtraData deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        Integer num;
        CeDefiPreCreateOrderReq.CeDefiPreCreateOrderReqBizExtraData.CeDefiPreCreateOrderReqBizExtraDataGasToken ceDefiPreCreateOrderReqBizExtraDataGasToken;
        int i;
        int i2;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, null);
            str2 = strDecodeStringElement2;
            ceDefiPreCreateOrderReqBizExtraDataGasToken = (CeDefiPreCreateOrderReq.CeDefiPreCreateOrderReqBizExtraData.CeDefiPreCreateOrderReqBizExtraDataGasToken) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, CeDefiPreCreateOrderReq$CeDefiPreCreateOrderReqBizExtraData$CeDefiPreCreateOrderReqBizExtraDataGasToken$$serializer.INSTANCE, null);
            strDecodeStringElement = strDecodeStringElement4;
            num = num2;
            i = iDecodeIntElement;
            i2 = 63;
            str = strDecodeStringElement3;
        } else {
            Integer num3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            CeDefiPreCreateOrderReq.CeDefiPreCreateOrderReqBizExtraData.CeDefiPreCreateOrderReqBizExtraDataGasToken ceDefiPreCreateOrderReqBizExtraDataGasToken2 = null;
            strDecodeStringElement = null;
            int iDecodeIntElement2 = 0;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        continue;
                    case 1:
                        i3 |= 2;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        break;
                    case 2:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i3 |= 16;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, num3);
                        break;
                    case 5:
                        i3 |= 32;
                        ceDefiPreCreateOrderReqBizExtraDataGasToken2 = (CeDefiPreCreateOrderReq.CeDefiPreCreateOrderReqBizExtraData.CeDefiPreCreateOrderReqBizExtraDataGasToken) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, CeDefiPreCreateOrderReq$CeDefiPreCreateOrderReqBizExtraData$CeDefiPreCreateOrderReqBizExtraDataGasToken$$serializer.INSTANCE, ceDefiPreCreateOrderReqBizExtraDataGasToken2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            num = num3;
            ceDefiPreCreateOrderReqBizExtraDataGasToken = ceDefiPreCreateOrderReqBizExtraDataGasToken2;
            i = iDecodeIntElement2;
            i2 = i3;
            String str3 = strDecodeStringElement6;
            str = strDecodeStringElement5;
            str2 = str3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CeDefiPreCreateOrderReq.CeDefiPreCreateOrderReqBizExtraData(i2, str2, str, i, strDecodeStringElement, num, ceDefiPreCreateOrderReqBizExtraDataGasToken, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CeDefiPreCreateOrderReq.CeDefiPreCreateOrderReqBizExtraData ceDefiPreCreateOrderReqBizExtraData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(ceDefiPreCreateOrderReqBizExtraData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CeDefiPreCreateOrderReq.CeDefiPreCreateOrderReqBizExtraData.write$Self$OKWallet_wallet_impl(ceDefiPreCreateOrderReqBizExtraData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
