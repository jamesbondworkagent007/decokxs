package com.okinc.ok_kyc_core.data.remote.networkmodel;

import java.util.ArrayList;
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
public final /* synthetic */ class TableCard$$serializer implements GeneratedSerializer<TableCard> {
    public static final int $stable;
    public static final TableCard$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TableCard$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TableCard$$serializer tableCard$$serializer = new TableCard$$serializer();
        INSTANCE = tableCard$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("table-card", tableCard$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("contentList", true);
        pluginGeneratedSerialDescriptor.addElement("ctaButton", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.TableCard.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = TableCard.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(kSerializerArr[1]);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(CTAButton$$serializer.INSTANCE);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(stringSerializer);
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TableCard deserialize(@NotNull Decoder decoder) {
        int i;
        Float f;
        String str;
        Float f2;
        ArrayList arrayList;
        Boolean bool;
        String str2;
        CTAButton cTAButton;
        String str3;
        Boolean bool2;
        String str4;
        String str5;
        Boolean bool3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TableCard.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        int i5 = 8;
        String str6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            ArrayList arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            CTAButton cTAButton2 = (CTAButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CTAButton$$serializer.INSTANCE, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, floatSerializer, null);
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, null);
            i = 1023;
            str = str10;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            f = f3;
            f2 = f4;
            str3 = str9;
            str2 = str8;
            bool2 = bool4;
            str4 = str7;
            cTAButton = cTAButton2;
            arrayList = arrayList2;
        } else {
            int i6 = 0;
            boolean z = true;
            Float f5 = null;
            String str11 = null;
            Float f6 = null;
            ArrayList arrayList3 = null;
            Boolean bool5 = null;
            CTAButton cTAButton3 = null;
            String str12 = null;
            Boolean bool6 = null;
            String str13 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str5 = str12;
                        bool3 = bool6;
                        z = false;
                        str12 = str5;
                        bool6 = bool3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 0:
                        str5 = str12;
                        bool3 = bool6;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str13);
                        i6 |= 1;
                        str12 = str5;
                        bool6 = bool3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 1:
                        str5 = str12;
                        bool3 = bool6;
                        arrayList3 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], arrayList3);
                        i6 |= 2;
                        str12 = str5;
                        bool6 = bool3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 2:
                        str5 = str12;
                        bool3 = bool6;
                        cTAButton3 = (CTAButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CTAButton$$serializer.INSTANCE, cTAButton3);
                        i6 |= 4;
                        str12 = str5;
                        bool6 = bool3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 3:
                        str5 = str12;
                        bool3 = bool6;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str6);
                        i6 |= 8;
                        str12 = str5;
                        bool6 = bool3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 4:
                        str5 = str12;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool6);
                        i6 |= 16;
                        bool3 = bool6;
                        str12 = str5;
                        bool6 = bool3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 5:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str12);
                        i6 |= 32;
                        bool3 = bool6;
                        str12 = str5;
                        bool6 = bool3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 6:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str11);
                        i6 |= 64;
                        str5 = str12;
                        bool3 = bool6;
                        str12 = str5;
                        bool6 = bool3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 7:
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f5);
                        i6 |= 128;
                        str5 = str12;
                        bool3 = bool6;
                        str12 = str5;
                        bool6 = bool3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 8:
                        f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, FloatSerializer.INSTANCE, f6);
                        i6 |= 256;
                        break;
                    case 9:
                        i6 |= 512;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.INSTANCE, bool5);
                        str5 = str12;
                        bool3 = bool6;
                        str12 = str5;
                        bool6 = bool3;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i6;
            f = f5;
            str = str11;
            f2 = f6;
            arrayList = arrayList3;
            bool = bool5;
            str2 = str6;
            cTAButton = cTAButton3;
            str3 = str12;
            bool2 = bool6;
            str4 = str13;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TableCard(i, str4, arrayList, cTAButton, str2, bool2, str3, str, f, f2, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TableCard tableCard) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tableCard, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TableCard.write$Self$OKCompliance_ok_compliance_impl(tableCard, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
