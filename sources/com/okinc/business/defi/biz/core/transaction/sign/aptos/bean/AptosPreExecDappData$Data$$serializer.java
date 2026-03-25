package com.okinc.business.defi.biz.core.transaction.sign.aptos.bean;

import com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData;
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

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class AptosPreExecDappData$Data$$serializer implements GeneratedSerializer<AptosPreExecDappData.Data> {
    public static final int $stable;
    public static final AptosPreExecDappData$Data$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AptosPreExecDappData$Data$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AptosPreExecDappData$Data$$serializer aptosPreExecDappData$Data$$serializer = new AptosPreExecDappData$Data$$serializer();
        INSTANCE = aptosPreExecDappData$Data$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData.Data", aptosPreExecDappData$Data$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("payload", true);
        pluginGeneratedSerialDescriptor.addElement("abi", true);
        pluginGeneratedSerialDescriptor.addElement("options", true);
        pluginGeneratedSerialDescriptor.addElement("isRawType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(AptosPreExecDappData$Data$Options$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AptosPreExecDappData.Data deserialize(@NotNull Decoder decoder) {
        int i;
        AptosPreExecDappData.Data.Options options;
        String str;
        Boolean bool;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        AptosPreExecDappData.Data.Options options2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            AptosPreExecDappData.Data.Options options3 = (AptosPreExecDappData.Data.Options) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, AptosPreExecDappData$Data$Options$$serializer.INSTANCE, null);
            str = str4;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, null);
            options = options3;
            str2 = str3;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            String str5 = null;
            Boolean bool2 = null;
            String str6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str6);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str5);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    options2 = (AptosPreExecDappData.Data.Options) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, AptosPreExecDappData$Data$Options$$serializer.INSTANCE, options2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool2);
                    i2 |= 8;
                }
            }
            i = i2;
            options = options2;
            str = str5;
            bool = bool2;
            str2 = str6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AptosPreExecDappData.Data(i, str2, str, options, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AptosPreExecDappData.Data data) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(data, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AptosPreExecDappData.Data.write$Self$OKWallet_wallet_impl(data, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
