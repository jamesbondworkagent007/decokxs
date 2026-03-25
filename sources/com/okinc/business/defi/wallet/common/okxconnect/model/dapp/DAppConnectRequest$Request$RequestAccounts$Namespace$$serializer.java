package com.okinc.business.defi.wallet.common.okxconnect.model.dapp;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
import java.util.List;
import java.util.Map;
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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DAppConnectRequest$Request$RequestAccounts$Namespace$$serializer implements GeneratedSerializer<DAppConnectRequest.Request.RequestAccounts.Namespace> {
    public static final int $stable;
    public static final DAppConnectRequest$Request$RequestAccounts$Namespace$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DAppConnectRequest$Request$RequestAccounts$Namespace$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DAppConnectRequest$Request$RequestAccounts$Namespace$$serializer dAppConnectRequest$Request$RequestAccounts$Namespace$$serializer = new DAppConnectRequest$Request$RequestAccounts$Namespace$$serializer();
        INSTANCE = dAppConnectRequest$Request$RequestAccounts$Namespace$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.Namespace", dAppConnectRequest$Request$RequestAccounts$Namespace$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("namespace", false);
        pluginGeneratedSerialDescriptor.addElement("chains", false);
        pluginGeneratedSerialDescriptor.addElement("methods", true);
        pluginGeneratedSerialDescriptor.addElement(MetricsSQLiteCacheKt.METRICS_PARAMS, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = DAppConnectRequest.Request.RequestAccounts.Namespace.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, kSerializerArr[1], BuiltinSerializersKt.getNullable(kSerializerArr[2]), BuiltinSerializersKt.getNullable(kSerializerArr[3])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DAppConnectRequest.Request.RequestAccounts.Namespace deserialize(@NotNull Decoder decoder) {
        int i;
        List list;
        Map map;
        List list2;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DAppConnectRequest.Request.RequestAccounts.Namespace.$childSerializers;
        List list3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            str = strDecodeStringElement;
            list2 = list4;
            i = 15;
            list = list5;
        } else {
            int i2 = 0;
            boolean z = true;
            Map map2 = null;
            List list6 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], list6);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], list3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], map2);
                    i2 |= 8;
                }
            }
            i = i2;
            list = list3;
            map = map2;
            list2 = list6;
            str = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DAppConnectRequest.Request.RequestAccounts.Namespace(i, str, list2, list, map, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DAppConnectRequest.Request.RequestAccounts.Namespace namespace) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(namespace, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DAppConnectRequest.Request.RequestAccounts.Namespace.write$Self$OKWallet_wallet_impl(namespace, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
