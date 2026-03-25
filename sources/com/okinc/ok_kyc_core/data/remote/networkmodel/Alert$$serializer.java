package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.productmatrix.biz.bean.ProductMatrixRemoteConfig;
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
public final /* synthetic */ class Alert$$serializer implements GeneratedSerializer<Alert> {
    public static final int $stable;
    public static final Alert$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Alert$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Alert$$serializer alert$$serializer = new Alert$$serializer();
        INSTANCE = alert$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(ProductMatrixRemoteConfig.ALERT, alert$$serializer, 12);
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
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(C43707ruP.OLrzqt);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable9 = BuiltinSerializersKt.getNullable(stringSerializer);
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, nullable9, BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Alert deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        String str;
        String str2;
        Float f;
        String str3;
        Float f2;
        Boolean bool2;
        Boolean bool3;
        String str4;
        int i;
        AlertStyle alertStyle;
        String str5;
        AlertStyle alertStyle2;
        String str6;
        String str7;
        String str8;
        String str9;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        Boolean bool4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            AlertStyle alertStyle3 = (AlertStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, C43707ruP.OLrzqt, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            str2 = str14;
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            f2 = f3;
            str = str13;
            bool4 = bool7;
            bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            str5 = str11;
            str4 = str12;
            i = 4095;
            bool3 = bool5;
            str3 = str10;
            bool = bool6;
            alertStyle = alertStyle3;
        } else {
            int i5 = 11;
            int i6 = 0;
            boolean z = true;
            String str15 = null;
            String str16 = null;
            Float f4 = null;
            Float f5 = null;
            Boolean bool8 = null;
            bool = null;
            Boolean bool9 = null;
            AlertStyle alertStyle4 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        str19 = str19;
                        i4 = 8;
                        break;
                    case 0:
                        alertStyle2 = alertStyle4;
                        str6 = str17;
                        String str20 = str19;
                        str7 = str18;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str20);
                        i6 |= 1;
                        alertStyle4 = alertStyle2;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 1:
                        alertStyle2 = alertStyle4;
                        str9 = str18;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str17);
                        i6 |= 2;
                        str8 = str19;
                        str7 = str9;
                        alertStyle4 = alertStyle2;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 2:
                        str9 = str18;
                        alertStyle2 = (AlertStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, C43707ruP.OLrzqt, alertStyle4);
                        i6 |= 4;
                        str6 = str17;
                        str8 = str19;
                        str7 = str9;
                        alertStyle4 = alertStyle2;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 3:
                        str9 = str18;
                        i6 |= 8;
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool9);
                        alertStyle2 = alertStyle4;
                        str6 = str17;
                        str8 = str19;
                        str7 = str9;
                        alertStyle4 = alertStyle2;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 4:
                        str9 = str18;
                        i6 |= 16;
                        bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool);
                        alertStyle2 = alertStyle4;
                        str6 = str17;
                        str8 = str19;
                        str7 = str9;
                        alertStyle4 = alertStyle2;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 5:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str18);
                        i6 |= 32;
                        alertStyle2 = alertStyle4;
                        str6 = str17;
                        str8 = str19;
                        str7 = str9;
                        alertStyle4 = alertStyle2;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 6:
                        i6 |= 64;
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool4);
                        alertStyle2 = alertStyle4;
                        str6 = str17;
                        str8 = str19;
                        str7 = str18;
                        alertStyle4 = alertStyle2;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 7:
                        i6 |= 128;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str15);
                        alertStyle2 = alertStyle4;
                        str6 = str17;
                        str8 = str19;
                        str7 = str18;
                        alertStyle4 = alertStyle2;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 8:
                        i6 |= 256;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str16);
                        alertStyle2 = alertStyle4;
                        str6 = str17;
                        str8 = str19;
                        str7 = str18;
                        alertStyle4 = alertStyle2;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 9:
                        i6 |= 512;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f5);
                        alertStyle2 = alertStyle4;
                        str6 = str17;
                        str8 = str19;
                        str7 = str18;
                        alertStyle4 = alertStyle2;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str19 = str8;
                        break;
                    case 10:
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f4);
                        i6 |= 1024;
                        break;
                    case 11:
                        i6 |= 2048;
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool8);
                        alertStyle2 = alertStyle4;
                        str6 = str17;
                        str8 = str19;
                        str7 = str18;
                        alertStyle4 = alertStyle2;
                        str17 = str6;
                        str18 = str7;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        str19 = str8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            AlertStyle alertStyle5 = alertStyle4;
            String str21 = str17;
            str = str15;
            str2 = str16;
            f = f4;
            str3 = str19;
            f2 = f5;
            bool2 = bool8;
            bool3 = bool9;
            str4 = str18;
            i = i6;
            alertStyle = alertStyle5;
            str5 = str21;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Alert(i, str3, str5, alertStyle, bool3, bool, str4, bool4, str, str2, f2, f, bool2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.Alert.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.Alert, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Alert alert) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(alert, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Alert.write$Self$OKCompliance_ok_compliance_impl(alert, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
