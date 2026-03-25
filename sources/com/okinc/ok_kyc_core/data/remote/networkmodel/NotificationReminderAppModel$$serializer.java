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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class NotificationReminderAppModel$$serializer implements GeneratedSerializer<NotificationReminderAppModel> {
    public static final int $stable;
    public static final NotificationReminderAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NotificationReminderAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NotificationReminderAppModel$$serializer notificationReminderAppModel$$serializer = new NotificationReminderAppModel$$serializer();
        INSTANCE = notificationReminderAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationReminderAppModel", notificationReminderAppModel$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        pluginGeneratedSerialDescriptor.addElement("ctaButtonStyle", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("desc", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_STYLE, true);
        pluginGeneratedSerialDescriptor.addElement("closable", true);
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
        return new KSerializer[]{BuiltinSerializersKt.getNullable(CtaPopUp$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CtaButtonStyle$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NotificationReminderAppModel deserialize(@NotNull Decoder decoder) {
        String str;
        Boolean bool;
        Boolean bool2;
        CtaButtonStyle ctaButtonStyle;
        Boolean bool3;
        Float f;
        String str2;
        String str3;
        String str4;
        Float f2;
        CtaPopUp ctaPopUp;
        int i;
        String str5;
        String str6;
        CtaButtonStyle ctaButtonStyle2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        Boolean bool4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            CtaPopUp ctaPopUp2 = (CtaPopUp) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, CtaPopUp$$serializer.INSTANCE, null);
            CtaButtonStyle ctaButtonStyle3 = (CtaButtonStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CtaButtonStyle$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, booleanSerializer, null);
            f2 = f3;
            str5 = str9;
            str3 = strDecodeStringElement3;
            bool = bool5;
            str2 = str8;
            ctaButtonStyle = ctaButtonStyle3;
            i = 8191;
            str6 = strDecodeStringElement2;
            str4 = strDecodeStringElement;
            str = str7;
            ctaPopUp = ctaPopUp2;
            bool3 = bool6;
        } else {
            int i5 = 12;
            Float f4 = null;
            Boolean bool7 = null;
            Float f5 = null;
            String str10 = null;
            str = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            CtaPopUp ctaPopUp3 = null;
            CtaButtonStyle ctaButtonStyle4 = null;
            int i6 = 0;
            boolean z = true;
            String str11 = null;
            bool = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        ctaButtonStyle2 = ctaButtonStyle4;
                        z = false;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 0:
                        ctaButtonStyle2 = ctaButtonStyle4;
                        i6 |= 1;
                        ctaPopUp3 = (CtaPopUp) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, CtaPopUp$$serializer.INSTANCE, ctaPopUp3);
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 1:
                        i6 |= 2;
                        ctaButtonStyle2 = (CtaButtonStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CtaButtonStyle$$serializer.INSTANCE, ctaButtonStyle4);
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 2:
                        i6 |= 4;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 3:
                        i6 |= 8;
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str);
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 4:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 5:
                        i6 |= 32;
                        bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool);
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 6:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i6 |= 64;
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 7:
                        i6 |= 128;
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, bool7);
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 8:
                        i6 |= 256;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str10);
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 9:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str11);
                        i6 |= 512;
                        i5 = 12;
                        break;
                    case 10:
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f4);
                        i6 |= 1024;
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 11:
                        i6 |= 2048;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, f5);
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 12:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool4);
                        i6 |= 4096;
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            bool2 = bool4;
            ctaButtonStyle = ctaButtonStyle4;
            bool3 = bool7;
            f = f5;
            str2 = str10;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
            f2 = f4;
            ctaPopUp = ctaPopUp3;
            i = i6;
            String str12 = strDecodeStringElement4;
            str5 = str11;
            str6 = str12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NotificationReminderAppModel(i, ctaPopUp, ctaButtonStyle, str4, str, str6, bool, str3, bool3, str2, str5, f2, f, bool2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationReminderAppModel.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationReminderAppModel, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NotificationReminderAppModel notificationReminderAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(notificationReminderAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NotificationReminderAppModel.write$Self$OKCompliance_ok_compliance_impl(notificationReminderAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
