package com.okinc.business.defi.wallet.common.okxconnect.network.rpc;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RpcMessage$$serializer implements GeneratedSerializer<RpcMessage> {
    public static final int $stable;
    public static final RpcMessage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RpcMessage$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RpcMessage$$serializer rpcMessage$$serializer = new RpcMessage$$serializer();
        INSTANCE = rpcMessage$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcMessage", rpcMessage$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("jsonrpc", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.METHOD, false);
        pluginGeneratedSerialDescriptor.addElement(MetricsSQLiteCacheKt.METRICS_PARAMS, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, JsonObjectSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RpcMessage deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        JsonObject jsonObject;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            str3 = strDecodeStringElement2;
            jsonObject = (JsonObject) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, JsonObjectSerializer.INSTANCE, null);
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            JsonObject jsonObject2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jsonObject2 = (JsonObject) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, JsonObjectSerializer.INSTANCE, jsonObject2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            jsonObject = jsonObject2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RpcMessage(i, str3, str2, str, jsonObject, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RpcMessage rpcMessage) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(rpcMessage, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RpcMessage.write$Self$OKWallet_wallet_impl(rpcMessage, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
