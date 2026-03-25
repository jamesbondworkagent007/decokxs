package com.okinc.ok_kyc_core.data.remote.networkmodel;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class AddressCascaderFildValue$$serializer implements GeneratedSerializer<AddressCascaderFildValue> {
    public static final int $stable;
    public static final AddressCascaderFildValue$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AddressCascaderFildValue$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AddressCascaderFildValue$$serializer addressCascaderFildValue$$serializer = new AddressCascaderFildValue$$serializer();
        INSTANCE = addressCascaderFildValue$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderFildValue", addressCascaderFildValue$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("province", true);
        pluginGeneratedSerialDescriptor.addElement("city", true);
        pluginGeneratedSerialDescriptor.addElement("district", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        AddressCascaderValue$$serializer addressCascaderValue$$serializer = AddressCascaderValue$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(addressCascaderValue$$serializer), BuiltinSerializersKt.getNullable(addressCascaderValue$$serializer), BuiltinSerializersKt.getNullable(addressCascaderValue$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AddressCascaderFildValue deserialize(@NotNull Decoder decoder) {
        int i;
        AddressCascaderValue addressCascaderValue;
        AddressCascaderValue addressCascaderValue2;
        AddressCascaderValue addressCascaderValue3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        AddressCascaderValue addressCascaderValue4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            AddressCascaderValue$$serializer addressCascaderValue$$serializer = AddressCascaderValue$$serializer.INSTANCE;
            AddressCascaderValue addressCascaderValue5 = (AddressCascaderValue) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, addressCascaderValue$$serializer, null);
            AddressCascaderValue addressCascaderValue6 = (AddressCascaderValue) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, addressCascaderValue$$serializer, null);
            addressCascaderValue2 = (AddressCascaderValue) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, addressCascaderValue$$serializer, null);
            i = 7;
            addressCascaderValue3 = addressCascaderValue5;
            addressCascaderValue = addressCascaderValue6;
        } else {
            int i2 = 0;
            boolean z = true;
            AddressCascaderValue addressCascaderValue7 = null;
            AddressCascaderValue addressCascaderValue8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    addressCascaderValue8 = (AddressCascaderValue) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, AddressCascaderValue$$serializer.INSTANCE, addressCascaderValue8);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    addressCascaderValue4 = (AddressCascaderValue) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, AddressCascaderValue$$serializer.INSTANCE, addressCascaderValue4);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    addressCascaderValue7 = (AddressCascaderValue) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, AddressCascaderValue$$serializer.INSTANCE, addressCascaderValue7);
                    i2 |= 4;
                }
            }
            i = i2;
            addressCascaderValue = addressCascaderValue4;
            addressCascaderValue2 = addressCascaderValue7;
            addressCascaderValue3 = addressCascaderValue8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AddressCascaderFildValue(i, addressCascaderValue3, addressCascaderValue, addressCascaderValue2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AddressCascaderFildValue addressCascaderFildValue) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(addressCascaderFildValue, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AddressCascaderFildValue.write$Self$OKCompliance_ok_compliance_impl(addressCascaderFildValue, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
