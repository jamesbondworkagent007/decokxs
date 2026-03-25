package com.okinc.wallet.hardware.impl.onekey.data;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.okinc.wallet.hardware.api.onekey.CommonParams;
import com.okinc.wallet.hardware.api.onekey.CommonParams$$serializer;
import com.okinc.wallet.hardware.api.onekey.EVMSignMessageEIP712Params;
import com.okinc.wallet.hardware.api.onekey.EVMSignMessageEIP712Params$$serializer;
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

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class SignEVMEIP712Message$$serializer implements GeneratedSerializer<SignEVMEIP712Message> {
    public static final int $stable;
    public static final SignEVMEIP712Message$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SignEVMEIP712Message$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SignEVMEIP712Message$$serializer signEVMEIP712Message$$serializer = new SignEVMEIP712Message$$serializer();
        INSTANCE = signEVMEIP712Message$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.wallet.hardware.impl.onekey.data.SignEVMEIP712Message", signEVMEIP712Message$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("connectId", false);
        pluginGeneratedSerialDescriptor.addElement("deviceId", false);
        pluginGeneratedSerialDescriptor.addElement(MetricsSQLiteCacheKt.METRICS_PARAMS, false);
        pluginGeneratedSerialDescriptor.addElement("commonParams", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, EVMSignMessageEIP712Params$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(CommonParams$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SignEVMEIP712Message deserialize(@NotNull Decoder decoder) {
        int i;
        EVMSignMessageEIP712Params eVMSignMessageEIP712Params;
        String str;
        String str2;
        CommonParams commonParams;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        EVMSignMessageEIP712Params eVMSignMessageEIP712Params2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            EVMSignMessageEIP712Params eVMSignMessageEIP712Params3 = (EVMSignMessageEIP712Params) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, EVMSignMessageEIP712Params$$serializer.INSTANCE, null);
            str2 = strDecodeStringElement;
            commonParams = (CommonParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, CommonParams$$serializer.INSTANCE, null);
            eVMSignMessageEIP712Params = eVMSignMessageEIP712Params3;
            str = strDecodeStringElement2;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            CommonParams commonParams2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    eVMSignMessageEIP712Params2 = (EVMSignMessageEIP712Params) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, EVMSignMessageEIP712Params$$serializer.INSTANCE, eVMSignMessageEIP712Params2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    commonParams2 = (CommonParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, CommonParams$$serializer.INSTANCE, commonParams2);
                    i2 |= 8;
                }
            }
            i = i2;
            eVMSignMessageEIP712Params = eVMSignMessageEIP712Params2;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            commonParams = commonParams2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SignEVMEIP712Message(i, str2, str, eVMSignMessageEIP712Params, commonParams, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SignEVMEIP712Message signEVMEIP712Message) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(signEVMEIP712Message, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SignEVMEIP712Message.write$Self$OKHardwareWallet_hardware_wallet_impl(signEVMEIP712Message, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
