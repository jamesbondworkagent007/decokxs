package com.okinc.business.web3pay.lib.features.convert.model;

import com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo;
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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class CurrencyPairInfo$$serializer implements GeneratedSerializer<CurrencyPairInfo> {
    public static final int $stable;
    public static final CurrencyPairInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CurrencyPairInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CurrencyPairInfo$$serializer currencyPairInfo$$serializer = new CurrencyPairInfo$$serializer();
        INSTANCE = currencyPairInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo", currencyPairInfo$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("from", false);
        pluginGeneratedSerialDescriptor.addElement("to", false);
        pluginGeneratedSerialDescriptor.addElement("convertConstraints", false);
        pluginGeneratedSerialDescriptor.addElement("isSameCoin", false);
        pluginGeneratedSerialDescriptor.addElement("otcMaintaining", false);
        pluginGeneratedSerialDescriptor.addElement("toAmountWarningRatio", true);
        pluginGeneratedSerialDescriptor.addElement("estimatedSlippage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{CurrencyPairInfo$From$$serializer.INSTANCE, CurrencyPairInfo$To$$serializer.INSTANCE, CurrencyPairInfo$ConvertConstraints$$serializer.INSTANCE, booleanSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CurrencyPairInfo deserialize(@NotNull Decoder decoder) {
        int i;
        boolean z;
        String str;
        CurrencyPairInfo.From from;
        String str2;
        boolean z2;
        CurrencyPairInfo.ConvertConstraints convertConstraints;
        CurrencyPairInfo.To to;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            CurrencyPairInfo.From from2 = (CurrencyPairInfo.From) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, CurrencyPairInfo$From$$serializer.INSTANCE, null);
            CurrencyPairInfo.To to2 = (CurrencyPairInfo.To) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, CurrencyPairInfo$To$$serializer.INSTANCE, null);
            CurrencyPairInfo.ConvertConstraints convertConstraints2 = (CurrencyPairInfo.ConvertConstraints) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, CurrencyPairInfo$ConvertConstraints$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            from = from2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            str2 = str3;
            z2 = zDecodeBooleanElement;
            z = zDecodeBooleanElement2;
            convertConstraints = convertConstraints2;
            to = to2;
            i = 127;
        } else {
            boolean zDecodeBooleanElement3 = false;
            i = 0;
            boolean z3 = true;
            String str4 = null;
            CurrencyPairInfo.ConvertConstraints convertConstraints3 = null;
            CurrencyPairInfo.From from3 = null;
            String str5 = null;
            CurrencyPairInfo.To to3 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i3 = 6;
                        break;
                    case 0:
                        from3 = (CurrencyPairInfo.From) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, CurrencyPairInfo$From$$serializer.INSTANCE, from3);
                        i |= 1;
                        i3 = 6;
                        break;
                    case 1:
                        to3 = (CurrencyPairInfo.To) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, CurrencyPairInfo$To$$serializer.INSTANCE, to3);
                        i |= 2;
                        i3 = 6;
                        break;
                    case 2:
                        i |= 4;
                        convertConstraints3 = (CurrencyPairInfo.ConvertConstraints) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, CurrencyPairInfo$ConvertConstraints$$serializer.INSTANCE, convertConstraints3);
                        i3 = 6;
                        break;
                    case 3:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i2 = i | 8;
                        i = i2;
                        i3 = 6;
                        break;
                    case 4:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i2 = i | 16;
                        i = i2;
                        i3 = 6;
                        break;
                    case 5:
                        i |= 32;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str5);
                        i3 = 6;
                        break;
                    case 6:
                        i |= 64;
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str4);
                        i3 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement4;
            str = str4;
            from = from3;
            str2 = str5;
            z2 = zDecodeBooleanElement3;
            convertConstraints = convertConstraints3;
            to = to3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CurrencyPairInfo(i, from, to, convertConstraints, z2, z, str2, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CurrencyPairInfo currencyPairInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(currencyPairInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CurrencyPairInfo.write$Self$OKPayCore_web3pay_lib(currencyPairInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
