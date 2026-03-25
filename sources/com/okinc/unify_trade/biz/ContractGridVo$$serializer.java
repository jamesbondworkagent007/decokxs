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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class ContractGridVo$$serializer implements GeneratedSerializer<ContractGridVo> {
    public static final int $stable;
    public static final ContractGridVo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ContractGridVo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ContractGridVo$$serializer contractGridVo$$serializer = new ContractGridVo$$serializer();
        INSTANCE = contractGridVo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.ContractGridVo", contractGridVo$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("closePosition", true);
        pluginGeneratedSerialDescriptor.addElement("initOrdering", true);
        pluginGeneratedSerialDescriptor.addElement("slippage", true);
        pluginGeneratedSerialDescriptor.addElement("unitDisplayVO", true);
        pluginGeneratedSerialDescriptor.addElement("ordVariant", true);
        pluginGeneratedSerialDescriptor.addElement("recommendedMarginTopup", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer nullable = BuiltinSerializersKt.getNullable(ClosePositionVo$$serializer.INSTANCE);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(InitOrderingVo$$serializer.INSTANCE);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(SlippageVo$$serializer.INSTANCE);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(UnitDisplayVo$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ContractGridVo deserialize(@NotNull Decoder decoder) {
        String str;
        UnitDisplayVo unitDisplayVo;
        int i;
        String str2;
        ClosePositionVo closePositionVo;
        SlippageVo slippageVo;
        InitOrderingVo initOrderingVo;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 5;
        UnitDisplayVo unitDisplayVo2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            ClosePositionVo closePositionVo2 = (ClosePositionVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ClosePositionVo$$serializer.INSTANCE, null);
            InitOrderingVo initOrderingVo2 = (InitOrderingVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, InitOrderingVo$$serializer.INSTANCE, null);
            SlippageVo slippageVo2 = (SlippageVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SlippageVo$$serializer.INSTANCE, null);
            UnitDisplayVo unitDisplayVo3 = (UnitDisplayVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, UnitDisplayVo$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            closePositionVo = closePositionVo2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            unitDisplayVo = unitDisplayVo3;
            str2 = str3;
            slippageVo = slippageVo2;
            initOrderingVo = initOrderingVo2;
            i = 63;
        } else {
            int i3 = 0;
            boolean z2 = true;
            String str4 = null;
            SlippageVo slippageVo3 = null;
            ClosePositionVo closePositionVo3 = null;
            String str5 = null;
            InitOrderingVo initOrderingVo3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = false;
                        i2 = 5;
                        break;
                    case 0:
                        z = false;
                        i3 |= 1;
                        closePositionVo3 = (ClosePositionVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ClosePositionVo$$serializer.INSTANCE, closePositionVo3);
                        i2 = 5;
                        break;
                    case 1:
                        i3 |= 2;
                        initOrderingVo3 = (InitOrderingVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, InitOrderingVo$$serializer.INSTANCE, initOrderingVo3);
                        break;
                    case 2:
                        i3 |= 4;
                        slippageVo3 = (SlippageVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SlippageVo$$serializer.INSTANCE, slippageVo3);
                        break;
                    case 3:
                        i3 |= 8;
                        unitDisplayVo2 = (UnitDisplayVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, UnitDisplayVo$$serializer.INSTANCE, unitDisplayVo2);
                        break;
                    case 4:
                        i3 |= 16;
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str4);
                        break;
                    case 5:
                        i3 |= 32;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str5);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str5;
            unitDisplayVo = unitDisplayVo2;
            i = i3;
            InitOrderingVo initOrderingVo4 = initOrderingVo3;
            str2 = str4;
            closePositionVo = closePositionVo3;
            slippageVo = slippageVo3;
            initOrderingVo = initOrderingVo4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ContractGridVo(i, closePositionVo, initOrderingVo, slippageVo, unitDisplayVo, str2, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ContractGridVo contractGridVo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(contractGridVo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ContractGridVo.write$Self$OKTradeCore_trade_core(contractGridVo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
