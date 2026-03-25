package com.okinc.business.dex.trade.core.domain.model;

import androidx.core.app.FrameMetricsAggregator;
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
public final /* synthetic */ class V6BatchBroadcastRequest$$serializer implements GeneratedSerializer<V6BatchBroadcastRequest> {
    public static final int $stable;
    public static final V6BatchBroadcastRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private V6BatchBroadcastRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        V6BatchBroadcastRequest$$serializer v6BatchBroadcastRequest$$serializer = new V6BatchBroadcastRequest$$serializer();
        INSTANCE = v6BatchBroadcastRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.core.domain.model.V6BatchBroadcastRequest", v6BatchBroadcastRequest$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("walletId", false);
        pluginGeneratedSerialDescriptor.addElement("userWalletAddress", false);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("transactions", false);
        pluginGeneratedSerialDescriptor.addElement("mevSuppliers", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("fromAmount", true);
        pluginGeneratedSerialDescriptor.addElement("simulate", true);
        pluginGeneratedSerialDescriptor.addElement("accountInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = V6BatchBroadcastRequest.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, kSerializerArr[3], BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), V6BroadcastAccountInfo$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final V6BatchBroadcastRequest deserialize(@NotNull Decoder decoder) {
        List list;
        String str;
        Boolean bool;
        String str2;
        String str3;
        int i;
        V6BroadcastAccountInfo v6BroadcastAccountInfo;
        List list2;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = V6BatchBroadcastRequest.$childSerializers;
        int i2 = 7;
        Boolean bool2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, null);
            V6BroadcastAccountInfo v6BroadcastAccountInfo2 = (V6BroadcastAccountInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, V6BroadcastAccountInfo$$serializer.INSTANCE, null);
            i = FrameMetricsAggregator.EVERY_DURATION;
            list2 = list4;
            str3 = strDecodeStringElement;
            bool = bool3;
            str = str7;
            str5 = str6;
            v6BroadcastAccountInfo = v6BroadcastAccountInfo2;
            str4 = strDecodeStringElement3;
            list = list3;
            str2 = strDecodeStringElement2;
        } else {
            int i3 = 0;
            boolean z = true;
            String str8 = null;
            V6BroadcastAccountInfo v6BroadcastAccountInfo3 = null;
            String str9 = null;
            List list5 = null;
            list = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        break;
                    case 0:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 7;
                        break;
                    case 1:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 7;
                        break;
                    case 2:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        i2 = 7;
                        break;
                    case 3:
                        list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list);
                        i3 |= 8;
                        i2 = 7;
                        break;
                    case 4:
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], list5);
                        i3 |= 16;
                        i2 = 7;
                        break;
                    case 5:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str8);
                        i3 |= 32;
                        i2 = 7;
                        break;
                    case 6:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str9);
                        i3 |= 64;
                        break;
                    case 7:
                        i3 |= 128;
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.INSTANCE, bool2);
                        i2 = 7;
                        break;
                    case 8:
                        i3 |= 256;
                        v6BroadcastAccountInfo3 = (V6BroadcastAccountInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, V6BroadcastAccountInfo$$serializer.INSTANCE, v6BroadcastAccountInfo3);
                        i2 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str9;
            bool = bool2;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement6;
            i = i3;
            v6BroadcastAccountInfo = v6BroadcastAccountInfo3;
            list2 = list5;
            str4 = strDecodeStringElement5;
            str5 = str8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new V6BatchBroadcastRequest(i, str3, str2, str4, list, list2, str5, str, bool, v6BroadcastAccountInfo, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull V6BatchBroadcastRequest v6BatchBroadcastRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(v6BatchBroadcastRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        V6BatchBroadcastRequest.write$Self$OKDex_dex_impl(v6BatchBroadcastRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
