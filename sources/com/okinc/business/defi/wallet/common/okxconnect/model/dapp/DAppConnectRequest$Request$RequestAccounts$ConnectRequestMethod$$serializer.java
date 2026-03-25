package com.okinc.business.defi.wallet.common.okxconnect.model.dapp;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
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
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod$$serializer implements GeneratedSerializer<DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod> {
    public static final int $stable;
    public static final DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod$$serializer dAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod$$serializer = new DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod$$serializer();
        INSTANCE = dAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod", dAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.METHOD, false);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement(MetricsSQLiteCacheKt.METRICS_PARAMS, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(JsonObjectSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        JsonObject jsonObject;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            str2 = strDecodeStringElement2;
            jsonObject = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, JsonObjectSerializer.INSTANCE, null);
            str = strDecodeStringElement3;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            String strDecodeStringElement4 = null;
            JsonObject jsonObject2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jsonObject2 = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, JsonObjectSerializer.INSTANCE, jsonObject2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement4;
            jsonObject = jsonObject2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod(i, str2, str, jsonObject, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod connectRequestMethod) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(connectRequestMethod, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod.write$Self$OKWallet_wallet_impl(connectRequestMethod, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
