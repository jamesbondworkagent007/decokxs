package com.okinc.business.defi.wallet.common.okxconnect.model.dapp;

import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DAppConnectRequest$Request$RequestAccounts$$serializer implements GeneratedSerializer<DAppConnectRequest.Request.RequestAccounts> {
    public static final int $stable;
    public static final DAppConnectRequest$Request$RequestAccounts$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DAppConnectRequest$Request$RequestAccounts$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DAppConnectRequest$Request$RequestAccounts$$serializer dAppConnectRequest$Request$RequestAccounts$$serializer = new DAppConnectRequest$Request$RequestAccounts$$serializer();
        INSTANCE = dAppConnectRequest$Request$RequestAccounts$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts", dAppConnectRequest$Request$RequestAccounts$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("requiredNamespaces", true);
        pluginGeneratedSerialDescriptor.addElement("optionalNamespaces", true);
        pluginGeneratedSerialDescriptor.addElement("connectRequestMethods", true);
        pluginGeneratedSerialDescriptor.addElement("requestedNamespaces", true);
        pluginGeneratedSerialDescriptor.addElement("paramRequests", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = DAppConnectRequest.Request.RequestAccounts.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(kSerializerArr[1]), BuiltinSerializersKt.getNullable(kSerializerArr[2]), BuiltinSerializersKt.getNullable(kSerializerArr[3]), kSerializerArr[4], kSerializerArr[5]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DAppConnectRequest.Request.RequestAccounts deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DAppConnectRequest.Request.RequestAccounts.$childSerializers;
        List list6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            List list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            List list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            List list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            List list10 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            str = strDecodeStringElement;
            list = list9;
            list2 = list7;
            list5 = list10;
            list4 = list8;
            i = 63;
        } else {
            int i2 = 0;
            boolean z = true;
            List list11 = null;
            List list12 = null;
            List list13 = null;
            List list14 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        i2 |= 2;
                        list14 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], list14);
                        break;
                    case 2:
                        i2 |= 4;
                        list13 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], list13);
                        break;
                    case 3:
                        i2 |= 8;
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], list6);
                        break;
                    case 4:
                        i2 |= 16;
                        list12 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], list12);
                        break;
                    case 5:
                        i2 |= 32;
                        list11 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], list11);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i2;
            str = strDecodeStringElement2;
            List list15 = list12;
            list = list6;
            list2 = list14;
            list3 = list11;
            list4 = list13;
            list5 = list15;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DAppConnectRequest.Request.RequestAccounts(i, str, list2, list4, list, list5, list3, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DAppConnectRequest.Request.RequestAccounts requestAccounts) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(requestAccounts, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DAppConnectRequest.Request.RequestAccounts.write$Self$OKWallet_wallet_impl(requestAccounts, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
