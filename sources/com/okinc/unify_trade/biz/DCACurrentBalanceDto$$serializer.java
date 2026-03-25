package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class DCACurrentBalanceDto$$serializer implements GeneratedSerializer<DCACurrentBalanceDto> {
    public static final int $stable;
    public static final DCACurrentBalanceDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DCACurrentBalanceDto$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DCACurrentBalanceDto$$serializer dCACurrentBalanceDto$$serializer = new DCACurrentBalanceDto$$serializer();
        INSTANCE = dCACurrentBalanceDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.DCACurrentBalanceDto", dCACurrentBalanceDto$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("baseCoin", true);
        pluginGeneratedSerialDescriptor.addElement("quoteCoin", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        DCACoinBalanceDto$$serializer dCACoinBalanceDto$$serializer = DCACoinBalanceDto$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(dCACoinBalanceDto$$serializer), BuiltinSerializersKt.getNullable(dCACoinBalanceDto$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DCACurrentBalanceDto deserialize(@NotNull Decoder decoder) {
        DCACoinBalanceDto dCACoinBalanceDto;
        DCACoinBalanceDto dCACoinBalanceDto2;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            DCACoinBalanceDto$$serializer dCACoinBalanceDto$$serializer = DCACoinBalanceDto$$serializer.INSTANCE;
            dCACoinBalanceDto2 = (DCACoinBalanceDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, dCACoinBalanceDto$$serializer, null);
            dCACoinBalanceDto = (DCACoinBalanceDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, dCACoinBalanceDto$$serializer, null);
            i = 3;
        } else {
            dCACoinBalanceDto = null;
            DCACoinBalanceDto dCACoinBalanceDto3 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    dCACoinBalanceDto3 = (DCACoinBalanceDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, DCACoinBalanceDto$$serializer.INSTANCE, dCACoinBalanceDto3);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    dCACoinBalanceDto = (DCACoinBalanceDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, DCACoinBalanceDto$$serializer.INSTANCE, dCACoinBalanceDto);
                    i2 |= 2;
                }
            }
            dCACoinBalanceDto2 = dCACoinBalanceDto3;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DCACurrentBalanceDto(i, dCACoinBalanceDto2, dCACoinBalanceDto, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DCACurrentBalanceDto dCACurrentBalanceDto) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dCACurrentBalanceDto, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DCACurrentBalanceDto.write$Self$OKTradeCore_trade_core(dCACurrentBalanceDto, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
