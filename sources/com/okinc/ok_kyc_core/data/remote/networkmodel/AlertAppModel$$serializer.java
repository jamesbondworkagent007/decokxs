package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
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
import o.C43707ruP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class AlertAppModel$$serializer implements GeneratedSerializer<AlertAppModel> {
    public static final int $stable;
    public static final AlertAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AlertAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AlertAppModel$$serializer alertAppModel$$serializer = new AlertAppModel$$serializer();
        INSTANCE = alertAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.AlertAppModel", alertAppModel$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("message", true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_STYLE, true);
        pluginGeneratedSerialDescriptor.addElement("showIcon", true);
        pluginGeneratedSerialDescriptor.addElement("showBg", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(C43707ruP.OLrzqt), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AlertAppModel deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        Boolean bool2;
        String str;
        String str2;
        Float f;
        String str3;
        Boolean bool3;
        String str4;
        int i;
        Float f2;
        Boolean bool4;
        AlertStyle alertStyle;
        String str5;
        AlertStyle alertStyle2;
        Boolean bool5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 8;
        Boolean bool6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            AlertStyle alertStyle3 = (AlertStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, C43707ruP.OLrzqt, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            Boolean bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            str2 = str11;
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            f2 = f3;
            str3 = str10;
            bool2 = bool9;
            str4 = strDecodeStringElement;
            bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            str = str8;
            bool4 = bool7;
            i = 4095;
            alertStyle = alertStyle3;
            bool = bool8;
            str5 = str9;
        } else {
            int i6 = 11;
            int i7 = 0;
            boolean z = true;
            String str12 = null;
            Float f4 = null;
            Float f5 = null;
            Boolean bool10 = null;
            String str13 = null;
            bool = null;
            AlertStyle alertStyle4 = null;
            String strDecodeStringElement2 = null;
            String str14 = null;
            Boolean bool11 = null;
            String str15 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        alertStyle2 = alertStyle4;
                        bool5 = bool11;
                        str6 = str15;
                        str7 = str14;
                        z = false;
                        bool11 = bool5;
                        str14 = str7;
                        alertStyle4 = alertStyle2;
                        str15 = str6;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 0:
                        alertStyle2 = alertStyle4;
                        bool5 = bool11;
                        str6 = str15;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str14);
                        i7 |= 1;
                        bool11 = bool5;
                        str14 = str7;
                        alertStyle4 = alertStyle2;
                        str15 = str6;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 1:
                        alertStyle2 = alertStyle4;
                        bool5 = bool11;
                        i7 |= 2;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str15);
                        str7 = str14;
                        bool11 = bool5;
                        str14 = str7;
                        alertStyle4 = alertStyle2;
                        str15 = str6;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 2:
                        bool5 = bool11;
                        i7 |= 4;
                        alertStyle2 = (AlertStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, C43707ruP.OLrzqt, alertStyle4);
                        str7 = str14;
                        str6 = str15;
                        bool11 = bool5;
                        str14 = str7;
                        alertStyle4 = alertStyle2;
                        str15 = str6;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 3:
                        bool5 = bool11;
                        i7 |= 8;
                        bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool10);
                        alertStyle2 = alertStyle4;
                        str7 = str14;
                        str6 = str15;
                        bool11 = bool5;
                        str14 = str7;
                        alertStyle4 = alertStyle2;
                        str15 = str6;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 4:
                        bool5 = bool11;
                        i7 |= 16;
                        bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool);
                        alertStyle2 = alertStyle4;
                        str7 = str14;
                        str6 = str15;
                        bool11 = bool5;
                        str14 = str7;
                        alertStyle4 = alertStyle2;
                        str15 = str6;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 5:
                        bool5 = bool11;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i7 |= 32;
                        alertStyle2 = alertStyle4;
                        str7 = str14;
                        str6 = str15;
                        bool11 = bool5;
                        str14 = str7;
                        alertStyle4 = alertStyle2;
                        str15 = str6;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 6:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool11);
                        i7 |= 64;
                        alertStyle2 = alertStyle4;
                        str7 = str14;
                        str6 = str15;
                        bool11 = bool5;
                        str14 = str7;
                        alertStyle4 = alertStyle2;
                        str15 = str6;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 7:
                        i7 |= 128;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str13);
                        alertStyle2 = alertStyle4;
                        str7 = str14;
                        bool5 = bool11;
                        str6 = str15;
                        bool11 = bool5;
                        str14 = str7;
                        alertStyle4 = alertStyle2;
                        str15 = str6;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 8:
                        i7 |= 256;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str12);
                        alertStyle2 = alertStyle4;
                        str7 = str14;
                        bool5 = bool11;
                        str6 = str15;
                        bool11 = bool5;
                        str14 = str7;
                        alertStyle4 = alertStyle2;
                        str15 = str6;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 9:
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f5);
                        i7 |= 512;
                        break;
                    case 10:
                        i7 |= 1024;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f4);
                        alertStyle2 = alertStyle4;
                        str7 = str14;
                        bool5 = bool11;
                        str6 = str15;
                        bool11 = bool5;
                        str14 = str7;
                        alertStyle4 = alertStyle2;
                        str15 = str6;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 11:
                        i7 |= 2048;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, BooleanSerializer.INSTANCE, bool6);
                        alertStyle2 = alertStyle4;
                        str7 = str14;
                        bool5 = bool11;
                        str6 = str15;
                        bool11 = bool5;
                        str14 = str7;
                        alertStyle4 = alertStyle2;
                        str15 = str6;
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
            AlertStyle alertStyle5 = alertStyle4;
            bool2 = bool11;
            str = str14;
            str2 = str12;
            f = f4;
            str3 = str13;
            bool3 = bool6;
            str4 = strDecodeStringElement2;
            i = i7;
            f2 = f5;
            bool4 = bool10;
            alertStyle = alertStyle5;
            str5 = str15;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AlertAppModel(i, str, str5, alertStyle, bool4, bool, str4, bool2, str3, str2, f2, f, bool3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.AlertAppModel.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.AlertAppModel, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AlertAppModel alertAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(alertAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AlertAppModel.write$Self$OKCompliance_ok_compliance_impl(alertAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
