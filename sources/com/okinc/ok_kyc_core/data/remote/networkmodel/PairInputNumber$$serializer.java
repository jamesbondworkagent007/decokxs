package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.okinc.web3.security.track.Web3SecurityTrackEvent;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class PairInputNumber$$serializer implements GeneratedSerializer<PairInputNumber> {
    public static final int $stable;
    public static final PairInputNumber$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PairInputNumber$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PairInputNumber$$serializer pairInputNumber$$serializer = new PairInputNumber$$serializer();
        INSTANCE = pairInputNumber$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("pair-input-number", pairInputNumber$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("ratio", true);
        pluginGeneratedSerialDescriptor.addElement(Web3SecurityTrackEvent.VALUE_INPUT, true);
        pluginGeneratedSerialDescriptor.addElement("subInput", true);
        pluginGeneratedSerialDescriptor.addElement("fieldValue", true);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        SubInput$$serializer subInput$$serializer = SubInput$$serializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(subInput$$serializer), BuiltinSerializersKt.getNullable(subInput$$serializer), BuiltinSerializersKt.getNullable(PairInputValue$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PairInputNumber deserialize(@NotNull Decoder decoder) {
        String str;
        Boolean bool;
        Float f;
        String str2;
        Float f2;
        SubInput subInput;
        SubInput subInput2;
        String str3;
        Boolean bool2;
        int i;
        PairInputValue pairInputValue;
        String str4;
        Boolean bool3;
        PairInputValue pairInputValue2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        String str5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            SubInput$$serializer subInput$$serializer = SubInput$$serializer.INSTANCE;
            SubInput subInput3 = (SubInput) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, subInput$$serializer, null);
            SubInput subInput4 = (SubInput) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, subInput$$serializer, null);
            PairInputValue pairInputValue3 = (PairInputValue) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, PairInputValue$$serializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            str2 = str9;
            bool = bool5;
            str5 = str7;
            str4 = str8;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            subInput2 = subInput3;
            str = str6;
            subInput = subInput4;
            bool2 = bool4;
            i = 4095;
            pairInputValue = pairInputValue3;
            str3 = strDecodeStringElement;
        } else {
            int i5 = 11;
            int i6 = 0;
            boolean z = true;
            String str10 = null;
            Boolean bool6 = null;
            Float f3 = null;
            String str11 = null;
            Float f4 = null;
            SubInput subInput5 = null;
            SubInput subInput6 = null;
            String strDecodeStringElement2 = null;
            Boolean bool7 = null;
            PairInputValue pairInputValue4 = null;
            String str12 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool3 = bool7;
                        pairInputValue2 = pairInputValue4;
                        z = false;
                        bool7 = bool3;
                        pairInputValue4 = pairInputValue2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 0:
                        bool3 = bool7;
                        pairInputValue2 = pairInputValue4;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        bool7 = bool3;
                        pairInputValue4 = pairInputValue2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 1:
                        bool3 = bool7;
                        pairInputValue2 = pairInputValue4;
                        i6 |= 2;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str12);
                        bool7 = bool3;
                        pairInputValue4 = pairInputValue2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 2:
                        bool3 = bool7;
                        pairInputValue2 = pairInputValue4;
                        i6 |= 4;
                        subInput6 = (SubInput) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SubInput$$serializer.INSTANCE, subInput6);
                        bool7 = bool3;
                        pairInputValue4 = pairInputValue2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 3:
                        bool3 = bool7;
                        pairInputValue2 = pairInputValue4;
                        i6 |= 8;
                        subInput5 = (SubInput) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, SubInput$$serializer.INSTANCE, subInput5);
                        bool7 = bool3;
                        pairInputValue4 = pairInputValue2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 4:
                        bool3 = bool7;
                        pairInputValue2 = (PairInputValue) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, PairInputValue$$serializer.INSTANCE, pairInputValue4);
                        i6 |= 16;
                        bool7 = bool3;
                        pairInputValue4 = pairInputValue2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 5:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool7);
                        i6 |= 32;
                        pairInputValue2 = pairInputValue4;
                        bool7 = bool3;
                        pairInputValue4 = pairInputValue2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 6:
                        i6 |= 64;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str5);
                        bool3 = bool7;
                        pairInputValue2 = pairInputValue4;
                        bool7 = bool3;
                        pairInputValue4 = pairInputValue2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 7:
                        i6 |= 128;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, bool6);
                        bool3 = bool7;
                        pairInputValue2 = pairInputValue4;
                        bool7 = bool3;
                        pairInputValue4 = pairInputValue2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 8:
                        i6 |= 256;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str10);
                        bool3 = bool7;
                        pairInputValue2 = pairInputValue4;
                        bool7 = bool3;
                        pairInputValue4 = pairInputValue2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 9:
                        i6 |= 512;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str11);
                        bool3 = bool7;
                        pairInputValue2 = pairInputValue4;
                        bool7 = bool3;
                        pairInputValue4 = pairInputValue2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 10:
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f3);
                        i6 |= 1024;
                        break;
                    case 11:
                        i6 |= 2048;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, FloatSerializer.INSTANCE, f4);
                        bool3 = bool7;
                        pairInputValue2 = pairInputValue4;
                        bool7 = bool3;
                        pairInputValue4 = pairInputValue2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str12;
            bool = bool6;
            f = f3;
            str2 = str11;
            f2 = f4;
            subInput = subInput5;
            subInput2 = subInput6;
            str3 = strDecodeStringElement2;
            bool2 = bool7;
            i = i6;
            pairInputValue = pairInputValue4;
            str4 = str10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PairInputNumber(i, str3, str, subInput2, subInput, pairInputValue, bool2, str5, bool, str4, str2, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputNumber.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputNumber, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PairInputNumber pairInputNumber) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(pairInputNumber, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PairInputNumber.write$Self$OKCompliance_ok_compliance_impl(pairInputNumber, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
