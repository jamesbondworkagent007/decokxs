package com.okinc.business.defi.wallet.tee.activate.model;

import com.okinc.business.defi.wallet.tee.common.model.TeeCommand;
import com.okinc.business.defi.wallet.tee.common.model.TeeType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ActivateTeeModel$$serializer implements GeneratedSerializer<ActivateTeeModel> {
    public static final int $stable;
    public static final ActivateTeeModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ActivateTeeModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ActivateTeeModel$$serializer activateTeeModel$$serializer = new ActivateTeeModel$$serializer();
        INSTANCE = activateTeeModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeModel", activateTeeModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("chainIndexList", false);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("expireTimestamp", false);
        pluginGeneratedSerialDescriptor.addElement("autoRenew", false);
        pluginGeneratedSerialDescriptor.addElement("teeType", false);
        pluginGeneratedSerialDescriptor.addElement("command", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = ActivateTeeModel.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], longSerializer, longSerializer, BooleanSerializer.INSTANCE, kSerializerArr[4], kSerializerArr[5]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ActivateTeeModel deserialize(@NotNull Decoder decoder) {
        List list;
        long jDecodeLongElement;
        long jDecodeLongElement2;
        boolean z;
        TeeType teeType;
        TeeCommand teeCommand;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ActivateTeeModel.$childSerializers;
        int i2 = 3;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            TeeType teeType2 = (TeeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            teeCommand = (TeeCommand) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            z = zDecodeBooleanElement;
            teeType = teeType2;
            jDecodeLongElement = jDecodeLongElement3;
            jDecodeLongElement2 = jDecodeLongElement4;
            list = list2;
            i = 63;
        } else {
            list = null;
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            jDecodeLongElement = 0;
            jDecodeLongElement2 = 0;
            TeeType teeType3 = null;
            TeeCommand teeCommand2 = null;
            int i3 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list);
                        i3 |= 1;
                        i2 = 3;
                        continue;
                    case 1:
                        jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i3 |= 8;
                        break;
                    case 4:
                        i3 |= 16;
                        teeType3 = (TeeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], teeType3);
                        break;
                    case 5:
                        i3 |= 32;
                        teeCommand2 = (TeeCommand) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], teeCommand2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            teeType = teeType3;
            teeCommand = teeCommand2;
            i = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ActivateTeeModel(i, list, jDecodeLongElement, jDecodeLongElement2, z, teeType, teeCommand, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ActivateTeeModel activateTeeModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(activateTeeModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ActivateTeeModel.write$Self$OKWallet_wallet_impl(activateTeeModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
