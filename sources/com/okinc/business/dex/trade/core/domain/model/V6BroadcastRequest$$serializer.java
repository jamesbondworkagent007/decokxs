package com.okinc.business.dex.trade.core.domain.model;

import com.okinc.business.dex.trade.core.domain.model.common.V6CallData;
import com.okinc.business.dex.trade.core.domain.model.common.V6CallData$$serializer;
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
public final /* synthetic */ class V6BroadcastRequest$$serializer implements GeneratedSerializer<V6BroadcastRequest> {
    public static final int $stable;
    public static final V6BroadcastRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private V6BroadcastRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        V6BroadcastRequest$$serializer v6BroadcastRequest$$serializer = new V6BroadcastRequest$$serializer();
        INSTANCE = v6BroadcastRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.core.domain.model.V6BroadcastRequest", v6BroadcastRequest$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("simulate", false);
        pluginGeneratedSerialDescriptor.addElement("nonce", true);
        pluginGeneratedSerialDescriptor.addElement("orderId", false);
        pluginGeneratedSerialDescriptor.addElement("walletId", false);
        pluginGeneratedSerialDescriptor.addElement("mevSuppliers", true);
        pluginGeneratedSerialDescriptor.addElement("callDataOut", true);
        pluginGeneratedSerialDescriptor.addElement("userWalletAddress", false);
        pluginGeneratedSerialDescriptor.addElement("signedInfoList", false);
        pluginGeneratedSerialDescriptor.addElement("unsignedData", true);
        pluginGeneratedSerialDescriptor.addElement("accountInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = V6BroadcastRequest.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(V6CallData$$serializer.INSTANCE), stringSerializer, kSerializerArr[7], BuiltinSerializersKt.getNullable(UnsignedData$$serializer.INSTANCE), V6BroadcastAccountInfo$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final V6BroadcastRequest deserialize(@NotNull Decoder decoder) {
        String str;
        List list;
        UnsignedData unsignedData;
        List list2;
        V6BroadcastAccountInfo v6BroadcastAccountInfo;
        String str2;
        String str3;
        String str4;
        boolean z;
        V6CallData v6CallData;
        int i;
        String str5;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = V6BroadcastRequest.$childSerializers;
        int i3 = 9;
        int i4 = 6;
        int i5 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            V6CallData v6CallData2 = (V6CallData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, V6CallData$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            UnsignedData unsignedData2 = (UnsignedData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, UnsignedData$$serializer.INSTANCE, null);
            list2 = list4;
            z = zDecodeBooleanElement;
            v6BroadcastAccountInfo = (V6BroadcastAccountInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, V6BroadcastAccountInfo$$serializer.INSTANCE, null);
            str3 = strDecodeStringElement3;
            v6CallData = v6CallData2;
            str2 = strDecodeStringElement2;
            unsignedData = unsignedData2;
            str4 = strDecodeStringElement;
            i = 1023;
            str = str6;
            list = list3;
        } else {
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            List list5 = null;
            V6CallData v6CallData3 = null;
            List list6 = null;
            V6BroadcastAccountInfo v6BroadcastAccountInfo2 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String str7 = null;
            UnsignedData unsignedData3 = null;
            int i6 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str5 = str7;
                        z2 = false;
                        str7 = str5;
                        i3 = 9;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 0:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i6 |= 1;
                        i3 = 9;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 1:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str7);
                        i6 |= 2;
                        i3 = 9;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 2:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        str5 = str7;
                        str7 = str5;
                        i3 = 9;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 3:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        str5 = str7;
                        str7 = str5;
                        i3 = 9;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 4:
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], list5);
                        i6 |= 16;
                        str5 = str7;
                        str7 = str5;
                        i3 = 9;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 5:
                        v6CallData3 = (V6CallData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, V6CallData$$serializer.INSTANCE, v6CallData3);
                        i6 |= 32;
                        break;
                    case 6:
                        i6 |= 64;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i3 = 9;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 7:
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], list6);
                        i2 = i6 | 128;
                        i6 = i2;
                        i3 = 9;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 8:
                        unsignedData3 = (UnsignedData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, UnsignedData$$serializer.INSTANCE, unsignedData3);
                        i2 = i6 | 256;
                        i6 = i2;
                        i3 = 9;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 9:
                        i6 |= 512;
                        v6BroadcastAccountInfo2 = (V6BroadcastAccountInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, V6BroadcastAccountInfo$$serializer.INSTANCE, v6BroadcastAccountInfo2);
                        i3 = 9;
                        i4 = 6;
                        i5 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str7;
            list = list5;
            unsignedData = unsignedData3;
            list2 = list6;
            v6BroadcastAccountInfo = v6BroadcastAccountInfo2;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
            z = zDecodeBooleanElement2;
            v6CallData = v6CallData3;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new V6BroadcastRequest(i, z, str, str4, str2, list, v6CallData, str3, list2, unsignedData, v6BroadcastAccountInfo, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull V6BroadcastRequest v6BroadcastRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(v6BroadcastRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        V6BroadcastRequest.write$Self$OKDex_dex_impl(v6BroadcastRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
