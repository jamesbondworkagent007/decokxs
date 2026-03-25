package com.okinc.wallet.hardware.impl.onekey.data;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.okinc.wallet.hardware.api.onekey.BTCGetAddressParams;
import com.okinc.wallet.hardware.api.onekey.BTCGetAddressParams$$serializer;
import com.okinc.wallet.hardware.api.onekey.CommonParams;
import com.okinc.wallet.hardware.api.onekey.CommonParams$$serializer;
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
public final /* synthetic */ class GetBTCAddress$$serializer implements GeneratedSerializer<GetBTCAddress> {
    public static final int $stable;
    public static final GetBTCAddress$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GetBTCAddress$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GetBTCAddress$$serializer getBTCAddress$$serializer = new GetBTCAddress$$serializer();
        INSTANCE = getBTCAddress$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.wallet.hardware.impl.onekey.data.GetBTCAddress", getBTCAddress$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("connectId", false);
        pluginGeneratedSerialDescriptor.addElement("deviceId", false);
        pluginGeneratedSerialDescriptor.addElement(MetricsSQLiteCacheKt.METRICS_PARAMS, false);
        pluginGeneratedSerialDescriptor.addElement("commonParams", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BTCGetAddressParams$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(CommonParams$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final GetBTCAddress deserialize(@NotNull Decoder decoder) {
        int i;
        BTCGetAddressParams bTCGetAddressParams;
        String str;
        String str2;
        CommonParams commonParams;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        BTCGetAddressParams bTCGetAddressParams2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            BTCGetAddressParams bTCGetAddressParams3 = (BTCGetAddressParams) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, BTCGetAddressParams$$serializer.INSTANCE, null);
            str2 = strDecodeStringElement;
            commonParams = (CommonParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, CommonParams$$serializer.INSTANCE, null);
            bTCGetAddressParams = bTCGetAddressParams3;
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
                    bTCGetAddressParams2 = (BTCGetAddressParams) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, BTCGetAddressParams$$serializer.INSTANCE, bTCGetAddressParams2);
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
            bTCGetAddressParams = bTCGetAddressParams2;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            commonParams = commonParams2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GetBTCAddress(i, str2, str, bTCGetAddressParams, commonParams, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull GetBTCAddress getBTCAddress) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(getBTCAddress, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GetBTCAddress.write$Self$OKHardwareWallet_hardware_wallet_impl(getBTCAddress, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
