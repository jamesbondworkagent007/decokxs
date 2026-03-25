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
public final /* synthetic */ class PairInputNumberAppModel$$serializer implements GeneratedSerializer<PairInputNumberAppModel> {
    public static final int $stable;
    public static final PairInputNumberAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PairInputNumberAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PairInputNumberAppModel$$serializer pairInputNumberAppModel$$serializer = new PairInputNumberAppModel$$serializer();
        INSTANCE = pairInputNumberAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputNumberAppModel", pairInputNumberAppModel$$serializer, 12);
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
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(subInput$$serializer), BuiltinSerializersKt.getNullable(subInput$$serializer), BuiltinSerializersKt.getNullable(PairInputValue$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PairInputNumberAppModel deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        Float f;
        SubInput subInput;
        Float f2;
        String str3;
        String str4;
        int i;
        Boolean bool;
        Boolean bool2;
        PairInputValue pairInputValue;
        SubInput subInput2;
        String str5;
        Boolean bool3;
        SubInput subInput3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 8;
        Float f3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            SubInput$$serializer subInput$$serializer = SubInput$$serializer.INSTANCE;
            subInput = (SubInput) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, subInput$$serializer, null);
            SubInput subInput4 = (SubInput) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, subInput$$serializer, null);
            PairInputValue pairInputValue2 = (PairInputValue) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, PairInputValue$$serializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            str2 = str8;
            bool2 = bool5;
            str3 = strDecodeStringElement2;
            bool = bool4;
            str = str7;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            str5 = str6;
            str4 = strDecodeStringElement;
            pairInputValue = pairInputValue2;
            i = 4095;
            subInput2 = subInput4;
        } else {
            int i6 = 11;
            int i7 = 0;
            boolean z = true;
            String str9 = null;
            String str10 = null;
            Boolean bool6 = null;
            Float f4 = null;
            PairInputValue pairInputValue3 = null;
            SubInput subInput5 = null;
            String strDecodeStringElement3 = null;
            Boolean bool7 = null;
            String strDecodeStringElement4 = null;
            SubInput subInput6 = null;
            String str11 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool3 = bool7;
                        subInput3 = subInput6;
                        z = false;
                        bool7 = bool3;
                        subInput6 = subInput3;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 0:
                        bool3 = bool7;
                        subInput3 = subInput6;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        bool7 = bool3;
                        subInput6 = subInput3;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 1:
                        bool3 = bool7;
                        subInput3 = subInput6;
                        i7 |= 2;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str11);
                        bool7 = bool3;
                        subInput6 = subInput3;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 2:
                        bool3 = bool7;
                        subInput3 = subInput6;
                        i7 |= 4;
                        subInput5 = (SubInput) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SubInput$$serializer.INSTANCE, subInput5);
                        bool7 = bool3;
                        subInput6 = subInput3;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 3:
                        bool3 = bool7;
                        i7 |= 8;
                        subInput3 = (SubInput) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, SubInput$$serializer.INSTANCE, subInput6);
                        bool7 = bool3;
                        subInput6 = subInput3;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 4:
                        bool3 = bool7;
                        i7 |= 16;
                        pairInputValue3 = (PairInputValue) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, PairInputValue$$serializer.INSTANCE, pairInputValue3);
                        subInput3 = subInput6;
                        bool7 = bool3;
                        subInput6 = subInput3;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 5:
                        i7 |= 32;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool7);
                        subInput3 = subInput6;
                        bool7 = bool3;
                        subInput6 = subInput3;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 6:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i7 |= 64;
                        bool3 = bool7;
                        subInput3 = subInput6;
                        bool7 = bool3;
                        subInput6 = subInput3;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 7:
                        i7 |= 128;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, BooleanSerializer.INSTANCE, bool6);
                        bool3 = bool7;
                        subInput3 = subInput6;
                        bool7 = bool3;
                        subInput6 = subInput3;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 8:
                        i7 |= 256;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str9);
                        bool3 = bool7;
                        subInput3 = subInput6;
                        bool7 = bool3;
                        subInput6 = subInput3;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 9:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str10);
                        i7 |= 512;
                        break;
                    case 10:
                        i7 |= 1024;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f4);
                        bool3 = bool7;
                        subInput3 = subInput6;
                        bool7 = bool3;
                        subInput6 = subInput3;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 11:
                        i7 |= 2048;
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, FloatSerializer.INSTANCE, f3);
                        bool3 = bool7;
                        subInput3 = subInput6;
                        bool7 = bool3;
                        subInput6 = subInput3;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Boolean bool8 = bool7;
            str = str9;
            str2 = str10;
            f = f4;
            subInput = subInput5;
            f2 = f3;
            str3 = strDecodeStringElement3;
            str4 = strDecodeStringElement4;
            i = i7;
            bool = bool8;
            bool2 = bool6;
            pairInputValue = pairInputValue3;
            subInput2 = subInput6;
            str5 = str11;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PairInputNumberAppModel(i, str4, str5, subInput, subInput2, pairInputValue, bool, str3, bool2, str, str2, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputNumberAppModel.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputNumberAppModel, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PairInputNumberAppModel pairInputNumberAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(pairInputNumberAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PairInputNumberAppModel.write$Self$OKCompliance_ok_compliance_impl(pairInputNumberAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
