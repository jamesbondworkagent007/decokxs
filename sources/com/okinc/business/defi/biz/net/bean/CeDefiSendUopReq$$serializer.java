package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.biz.net.bean.CeDefiSendUopReq;
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
public final /* synthetic */ class CeDefiSendUopReq$$serializer implements GeneratedSerializer<CeDefiSendUopReq> {
    public static final int $stable;
    public static final CeDefiSendUopReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CeDefiSendUopReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CeDefiSendUopReq$$serializer ceDefiSendUopReq$$serializer = new CeDefiSendUopReq$$serializer();
        INSTANCE = ceDefiSendUopReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.CeDefiSendUopReq", ceDefiSendUopReq$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("signType", false);
        pluginGeneratedSerialDescriptor.addElement("signedMsg", false);
        pluginGeneratedSerialDescriptor.addElement("uopHash", false);
        pluginGeneratedSerialDescriptor.addElement("accountType", false);
        pluginGeneratedSerialDescriptor.addElement("accountId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(intSerializer), CeDefiSendUopReq$CeDefiSendUopReqSignedMsg$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CeDefiSendUopReq deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        int i;
        String str;
        CeDefiSendUopReq.CeDefiSendUopReqSignedMsg ceDefiSendUopReqSignedMsg;
        Integer num;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, null);
            CeDefiSendUopReq.CeDefiSendUopReqSignedMsg ceDefiSendUopReqSignedMsg2 = (CeDefiSendUopReq.CeDefiSendUopReqSignedMsg) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, CeDefiSendUopReq$CeDefiSendUopReqSignedMsg$$serializer.INSTANCE, null);
            String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, null);
            num = num2;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            str = str2;
            i = 31;
            ceDefiSendUopReqSignedMsg = ceDefiSendUopReqSignedMsg2;
        } else {
            String str3 = null;
            CeDefiSendUopReq.CeDefiSendUopReqSignedMsg ceDefiSendUopReqSignedMsg3 = null;
            Integer num3 = null;
            String strDecodeStringElement2 = null;
            int iDecodeIntElement2 = 0;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    ceDefiSendUopReqSignedMsg3 = (CeDefiSendUopReq.CeDefiSendUopReqSignedMsg) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, CeDefiSendUopReq$CeDefiSendUopReqSignedMsg$$serializer.INSTANCE, ceDefiSendUopReqSignedMsg3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str3);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i2 |= 16;
                }
            }
            iDecodeIntElement = iDecodeIntElement2;
            i = i2;
            str = str3;
            ceDefiSendUopReqSignedMsg = ceDefiSendUopReqSignedMsg3;
            num = num3;
            strDecodeStringElement = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CeDefiSendUopReq(i, num, ceDefiSendUopReqSignedMsg, str, iDecodeIntElement, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CeDefiSendUopReq ceDefiSendUopReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(ceDefiSendUopReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CeDefiSendUopReq.write$Self$OKWallet_wallet_impl(ceDefiSendUopReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
