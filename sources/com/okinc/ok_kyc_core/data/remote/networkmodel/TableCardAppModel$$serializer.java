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
public final /* synthetic */ class TableCardAppModel$$serializer implements GeneratedSerializer<TableCardAppModel> {
    public static final int $stable;
    public static final TableCardAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TableCardAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TableCardAppModel$$serializer tableCardAppModel$$serializer = new TableCardAppModel$$serializer();
        INSTANCE = tableCardAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.TableCardAppModel", tableCardAppModel$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("contentList", false);
        pluginGeneratedSerialDescriptor.addElement("ctaButton", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.TableCardAppModel.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TableCardAppModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[1], BuiltinSerializersKt.getNullable(CTAButtonAppModel$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TableCardAppModel deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        Float f;
        Boolean bool;
        Float f2;
        ArrayList arrayList;
        String str2;
        Boolean bool2;
        CTAButtonAppModel cTAButtonAppModel;
        String str3;
        String str4;
        Boolean bool3;
        CTAButtonAppModel cTAButtonAppModel2;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TableCardAppModel.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        int i5 = 8;
        ArrayList arrayList2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            ArrayList arrayList3 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            CTAButtonAppModel cTAButtonAppModel3 = (CTAButtonAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CTAButtonAppModel$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, floatSerializer, null);
            Float f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, null);
            i = 1023;
            str = str8;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            f = f3;
            f2 = f4;
            str3 = str7;
            str2 = strDecodeStringElement;
            bool2 = bool4;
            str4 = str6;
            cTAButtonAppModel = cTAButtonAppModel3;
            arrayList = arrayList3;
        } else {
            int i6 = 0;
            boolean z = true;
            String str9 = null;
            String str10 = null;
            Float f5 = null;
            Boolean bool5 = null;
            Float f6 = null;
            String strDecodeStringElement2 = null;
            Boolean bool6 = null;
            CTAButtonAppModel cTAButtonAppModel4 = null;
            String str11 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool3 = bool6;
                        cTAButtonAppModel2 = cTAButtonAppModel4;
                        str5 = str11;
                        z = false;
                        bool6 = bool3;
                        str11 = str5;
                        cTAButtonAppModel4 = cTAButtonAppModel2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 0:
                        bool3 = bool6;
                        cTAButtonAppModel2 = cTAButtonAppModel4;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str11);
                        i6 |= 1;
                        bool6 = bool3;
                        str11 = str5;
                        cTAButtonAppModel4 = cTAButtonAppModel2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 1:
                        bool3 = bool6;
                        cTAButtonAppModel2 = cTAButtonAppModel4;
                        arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], arrayList2);
                        i6 |= 2;
                        str5 = str11;
                        bool6 = bool3;
                        str11 = str5;
                        cTAButtonAppModel4 = cTAButtonAppModel2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 2:
                        bool3 = bool6;
                        cTAButtonAppModel4 = (CTAButtonAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CTAButtonAppModel$$serializer.INSTANCE, cTAButtonAppModel4);
                        i6 |= 4;
                        cTAButtonAppModel2 = cTAButtonAppModel4;
                        str5 = str11;
                        bool6 = bool3;
                        str11 = str5;
                        cTAButtonAppModel4 = cTAButtonAppModel2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 3:
                        bool3 = bool6;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        cTAButtonAppModel2 = cTAButtonAppModel4;
                        str5 = str11;
                        bool6 = bool3;
                        str11 = str5;
                        cTAButtonAppModel4 = cTAButtonAppModel2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 4:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool6);
                        i6 |= 16;
                        cTAButtonAppModel2 = cTAButtonAppModel4;
                        str5 = str11;
                        bool6 = bool3;
                        str11 = str5;
                        cTAButtonAppModel4 = cTAButtonAppModel2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 5:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str10);
                        i6 |= 32;
                        bool3 = bool6;
                        cTAButtonAppModel2 = cTAButtonAppModel4;
                        str5 = str11;
                        bool6 = bool3;
                        str11 = str5;
                        cTAButtonAppModel4 = cTAButtonAppModel2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 6:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str9);
                        i6 |= 64;
                        bool3 = bool6;
                        cTAButtonAppModel2 = cTAButtonAppModel4;
                        str5 = str11;
                        bool6 = bool3;
                        str11 = str5;
                        cTAButtonAppModel4 = cTAButtonAppModel2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 7:
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f5);
                        i6 |= 128;
                        break;
                    case 8:
                        i6 |= 256;
                        f6 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, FloatSerializer.INSTANCE, f6);
                        bool3 = bool6;
                        cTAButtonAppModel2 = cTAButtonAppModel4;
                        str5 = str11;
                        bool6 = bool3;
                        str11 = str5;
                        cTAButtonAppModel4 = cTAButtonAppModel2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 9:
                        i6 |= 512;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.INSTANCE, bool5);
                        bool3 = bool6;
                        cTAButtonAppModel2 = cTAButtonAppModel4;
                        str5 = str11;
                        bool6 = bool3;
                        str11 = str5;
                        cTAButtonAppModel4 = cTAButtonAppModel2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Boolean bool7 = bool6;
            i = i6;
            str = str9;
            f = f5;
            bool = bool5;
            f2 = f6;
            arrayList = arrayList2;
            str2 = strDecodeStringElement2;
            bool2 = bool7;
            cTAButtonAppModel = cTAButtonAppModel4;
            str3 = str10;
            str4 = str11;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TableCardAppModel(i, str4, arrayList, cTAButtonAppModel, str2, bool2, str3, str, f, f2, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TableCardAppModel tableCardAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tableCardAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TableCardAppModel.write$Self$OKCompliance_ok_compliance_impl(tableCardAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
