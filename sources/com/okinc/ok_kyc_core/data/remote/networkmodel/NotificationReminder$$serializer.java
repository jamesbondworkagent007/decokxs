package com.okinc.ok_kyc_core.data.remote.networkmodel;

import androidx.core.app.NotificationCompat;
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
public final /* synthetic */ class NotificationReminder$$serializer implements GeneratedSerializer<NotificationReminder> {
    public static final int $stable;
    public static final NotificationReminder$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NotificationReminder$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NotificationReminder$$serializer notificationReminder$$serializer = new NotificationReminder$$serializer();
        INSTANCE = notificationReminder$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(NotificationCompat.CATEGORY_REMINDER, notificationReminder$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        pluginGeneratedSerialDescriptor.addElement("ctaButtonStyle", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("desc", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_STYLE, true);
        pluginGeneratedSerialDescriptor.addElement("closable", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
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
        return new KSerializer[]{BuiltinSerializersKt.getNullable(CtaPopUpData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CtaButtonStyle$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NotificationReminder deserialize(@NotNull Decoder decoder) {
        String str;
        Boolean bool;
        CtaButtonStyle ctaButtonStyle;
        Float f;
        String str2;
        String str3;
        String str4;
        int i;
        Boolean bool2;
        CtaPopUpData ctaPopUpData;
        Float f2;
        String str5;
        Boolean bool3;
        String str6;
        String str7;
        CtaButtonStyle ctaButtonStyle2;
        CtaPopUpData ctaPopUpData2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        String str8 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            CtaPopUpData ctaPopUpData3 = (CtaPopUpData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, CtaPopUpData$$serializer.INSTANCE, null);
            CtaButtonStyle ctaButtonStyle3 = (CtaButtonStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CtaButtonStyle$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, null);
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, null);
            bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, booleanSerializer, null);
            f = f3;
            str = str12;
            str2 = str10;
            bool2 = bool4;
            str3 = str11;
            ctaButtonStyle = ctaButtonStyle3;
            i = 8191;
            str6 = strDecodeStringElement2;
            str5 = strDecodeStringElement;
            str4 = str9;
            ctaPopUpData = ctaPopUpData3;
            bool = bool5;
        } else {
            int i5 = 12;
            Boolean bool6 = null;
            Float f4 = null;
            Boolean bool7 = null;
            Float f5 = null;
            String str13 = null;
            String str14 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            CtaPopUpData ctaPopUpData4 = null;
            CtaButtonStyle ctaButtonStyle4 = null;
            int i6 = 0;
            boolean z = true;
            Boolean bool8 = null;
            String str15 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str7 = str14;
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaPopUpData2 = ctaPopUpData4;
                        z = false;
                        ctaPopUpData4 = ctaPopUpData2;
                        str14 = str7;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 0:
                        str7 = str14;
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaPopUpData2 = (CtaPopUpData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, CtaPopUpData$$serializer.INSTANCE, ctaPopUpData4);
                        i6 |= 1;
                        ctaPopUpData4 = ctaPopUpData2;
                        str14 = str7;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 1:
                        str7 = str14;
                        i6 |= 2;
                        ctaButtonStyle2 = (CtaButtonStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CtaButtonStyle$$serializer.INSTANCE, ctaButtonStyle4);
                        ctaPopUpData2 = ctaPopUpData4;
                        ctaPopUpData4 = ctaPopUpData2;
                        str14 = str7;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 2:
                        str7 = str14;
                        i6 |= 4;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        ctaPopUpData2 = ctaPopUpData4;
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaPopUpData4 = ctaPopUpData2;
                        str14 = str7;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 3:
                        i6 |= 8;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str14);
                        ctaPopUpData2 = ctaPopUpData4;
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaPopUpData4 = ctaPopUpData2;
                        str14 = str7;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 4:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        str7 = str14;
                        ctaPopUpData2 = ctaPopUpData4;
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaPopUpData4 = ctaPopUpData2;
                        str14 = str7;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 5:
                        i6 |= 32;
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool7);
                        str7 = str14;
                        ctaPopUpData2 = ctaPopUpData4;
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaPopUpData4 = ctaPopUpData2;
                        str14 = str7;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 6:
                        i6 |= 64;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str13);
                        str7 = str14;
                        ctaPopUpData2 = ctaPopUpData4;
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaPopUpData4 = ctaPopUpData2;
                        str14 = str7;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 7:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, bool6);
                        i6 |= 128;
                        str7 = str14;
                        ctaPopUpData2 = ctaPopUpData4;
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaPopUpData4 = ctaPopUpData2;
                        str14 = str7;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 8:
                        i6 |= 256;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str15);
                        str7 = str14;
                        ctaPopUpData2 = ctaPopUpData4;
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaPopUpData4 = ctaPopUpData2;
                        str14 = str7;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 9:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str8);
                        i6 |= 512;
                        str7 = str14;
                        ctaPopUpData2 = ctaPopUpData4;
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaPopUpData4 = ctaPopUpData2;
                        str14 = str7;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 10:
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f4);
                        i6 |= 1024;
                        i5 = 12;
                        break;
                    case 11:
                        i6 |= 2048;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, FloatSerializer.INSTANCE, f5);
                        str7 = str14;
                        ctaPopUpData2 = ctaPopUpData4;
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaPopUpData4 = ctaPopUpData2;
                        str14 = str7;
                        ctaButtonStyle4 = ctaButtonStyle2;
                        i5 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 12:
                        i6 |= 4096;
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool8);
                        str7 = str14;
                        ctaPopUpData2 = ctaPopUpData4;
                        ctaButtonStyle2 = ctaButtonStyle4;
                        ctaPopUpData4 = ctaPopUpData2;
                        str14 = str7;
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
            String str16 = str14;
            str = str8;
            bool = bool6;
            ctaButtonStyle = ctaButtonStyle4;
            f = f4;
            str2 = str13;
            str3 = str15;
            str4 = str16;
            i = i6;
            bool2 = bool7;
            ctaPopUpData = ctaPopUpData4;
            String str17 = strDecodeStringElement3;
            f2 = f5;
            str5 = strDecodeStringElement4;
            bool3 = bool8;
            str6 = str17;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NotificationReminder(i, ctaPopUpData, ctaButtonStyle, str5, str4, str6, bool2, str2, bool, str3, str, f, f2, bool3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationReminder.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationReminder, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NotificationReminder notificationReminder) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(notificationReminder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NotificationReminder.write$Self$OKCompliance_ok_compliance_impl(notificationReminder, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
