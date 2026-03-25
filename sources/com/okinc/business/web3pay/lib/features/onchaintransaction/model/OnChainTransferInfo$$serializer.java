package com.okinc.business.web3pay.lib.features.onchaintransaction.model;

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
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class OnChainTransferInfo$$serializer implements GeneratedSerializer<OnChainTransferInfo> {
    public static final int $stable;
    public static final OnChainTransferInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OnChainTransferInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OnChainTransferInfo$$serializer onChainTransferInfo$$serializer = new OnChainTransferInfo$$serializer();
        INSTANCE = onChainTransferInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.onchaintransaction.model.OnChainTransferInfo", onChainTransferInfo$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("need2FA", false);
        pluginGeneratedSerialDescriptor.addElement("uopHash", false);
        pluginGeneratedSerialDescriptor.addElement("serverOption", false);
        pluginGeneratedSerialDescriptor.addElement("needToDeployContract", false);
        pluginGeneratedSerialDescriptor.addElement("needToSyncPasskey", false);
        pluginGeneratedSerialDescriptor.addElement("mfaSessionId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, stringSerializer, JsonElementSerializer.INSTANCE, booleanSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OnChainTransferInfo deserialize(@NotNull Decoder decoder) {
        JsonElement jsonElement;
        boolean z;
        int i;
        String str;
        String str2;
        boolean z2;
        boolean z3;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            JsonElement jsonElement2 = (JsonElement) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, JsonElementSerializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            z2 = zDecodeBooleanElement;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, null);
            z3 = zDecodeBooleanElement2;
            z = zDecodeBooleanElement3;
            jsonElement = jsonElement2;
            i = 63;
            str2 = strDecodeStringElement;
        } else {
            String str3 = null;
            jsonElement = null;
            String strDecodeStringElement2 = null;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            int i3 = 0;
            boolean z4 = true;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        break;
                    case 0:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i3 |= 1;
                        break;
                    case 1:
                        i3 |= 2;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        break;
                    case 2:
                        i3 |= 4;
                        jsonElement = (JsonElement) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, JsonElementSerializer.INSTANCE, jsonElement);
                        break;
                    case 3:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i2 = i3 | 8;
                        i3 = i2;
                        break;
                    case 4:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i2 = i3 | 16;
                        i3 = i2;
                        break;
                    case 5:
                        i3 |= 32;
                        str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str3);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement6;
            i = i3;
            str = str3;
            str2 = strDecodeStringElement2;
            z2 = zDecodeBooleanElement4;
            z3 = zDecodeBooleanElement5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OnChainTransferInfo(i, z2, str2, jsonElement, z3, z, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OnChainTransferInfo onChainTransferInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(onChainTransferInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OnChainTransferInfo.write$Self$OKPayCore_web3pay_lib(onChainTransferInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
