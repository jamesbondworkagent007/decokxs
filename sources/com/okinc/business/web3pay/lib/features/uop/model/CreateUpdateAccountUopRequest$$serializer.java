package com.okinc.business.web3pay.lib.features.uop.model;

import com.okinc.business.web3pay.lib.core.model.GasLimit;
import com.okinc.business.web3pay.lib.core.model.GasLimit$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasPrice;
import com.okinc.business.web3pay.lib.core.model.GasPrice$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasToken;
import com.okinc.business.web3pay.lib.core.model.GasToken$$serializer;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class CreateUpdateAccountUopRequest$$serializer implements GeneratedSerializer<CreateUpdateAccountUopRequest> {
    public static final int $stable;
    public static final CreateUpdateAccountUopRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CreateUpdateAccountUopRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CreateUpdateAccountUopRequest$$serializer createUpdateAccountUopRequest$$serializer = new CreateUpdateAccountUopRequest$$serializer();
        INSTANCE = createUpdateAccountUopRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.uop.model.CreateUpdateAccountUopRequest", createUpdateAccountUopRequest$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("projectId", false);
        pluginGeneratedSerialDescriptor.addElement("gasToken", true);
        pluginGeneratedSerialDescriptor.addElement("gasLimit", true);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(GasToken$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(GasLimit$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(GasPrice$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CreateUpdateAccountUopRequest deserialize(@NotNull Decoder decoder) {
        GasLimit gasLimit;
        int i;
        GasPrice gasPrice;
        GasToken gasToken;
        String str;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            GasToken gasToken2 = (GasToken) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, GasToken$$serializer.INSTANCE, null);
            str = strDecodeStringElement;
            gasLimit = (GasLimit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, GasLimit$$serializer.INSTANCE, null);
            gasPrice = (GasPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, GasPrice$$serializer.INSTANCE, null);
            gasToken = gasToken2;
            i = 31;
            i2 = iDecodeIntElement;
        } else {
            GasLimit gasLimit2 = null;
            GasPrice gasPrice2 = null;
            GasToken gasToken3 = null;
            String strDecodeStringElement2 = null;
            int i3 = 0;
            int iDecodeIntElement2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i3 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    gasToken3 = (GasToken) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, GasToken$$serializer.INSTANCE, gasToken3);
                    i3 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    gasLimit2 = (GasLimit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, GasLimit$$serializer.INSTANCE, gasLimit2);
                    i3 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    gasPrice2 = (GasPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, GasPrice$$serializer.INSTANCE, gasPrice2);
                    i3 |= 16;
                }
            }
            gasLimit = gasLimit2;
            i = i3;
            gasPrice = gasPrice2;
            gasToken = gasToken3;
            str = strDecodeStringElement2;
            i2 = iDecodeIntElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CreateUpdateAccountUopRequest(i, str, i2, gasToken, gasLimit, gasPrice, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CreateUpdateAccountUopRequest createUpdateAccountUopRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(createUpdateAccountUopRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CreateUpdateAccountUopRequest.write$Self$OKPayCore_web3pay_lib(createUpdateAccountUopRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
