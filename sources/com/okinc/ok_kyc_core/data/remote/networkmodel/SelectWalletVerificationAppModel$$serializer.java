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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class SelectWalletVerificationAppModel$$serializer implements GeneratedSerializer<SelectWalletVerificationAppModel> {
    public static final int $stable;
    public static final SelectWalletVerificationAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SelectWalletVerificationAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SelectWalletVerificationAppModel$$serializer selectWalletVerificationAppModel$$serializer = new SelectWalletVerificationAppModel$$serializer();
        INSTANCE = selectWalletVerificationAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.SelectWalletVerificationAppModel", selectWalletVerificationAppModel$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("defaultMethod", true);
        pluginGeneratedSerialDescriptor.addElement("canClose", true);
        pluginGeneratedSerialDescriptor.addElement("canGoBack", true);
        pluginGeneratedSerialDescriptor.addElement("pageTitle", true);
        pluginGeneratedSerialDescriptor.addElement("cardChoice", true);
        pluginGeneratedSerialDescriptor.addElement("quit", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("pageStack", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.SelectWalletVerificationAppModel.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = SelectWalletVerificationAppModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(Quit$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SelectWalletVerificationAppModel deserialize(@NotNull Decoder decoder) {
        String str;
        ArrayList arrayList;
        Quit quit;
        Boolean bool;
        String str2;
        Boolean bool2;
        Boolean bool3;
        String str3;
        Boolean bool4;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        Quit quit2;
        String str8;
        KSerializer[] kSerializerArr;
        String str9;
        Boolean bool5;
        String str10;
        Quit quit3;
        KSerializer[] kSerializerArr2;
        String str11;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = SelectWalletVerificationAppModel.$childSerializers;
        int i2 = 9;
        String str12 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, booleanSerializer, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            ArrayList arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr3[4], null);
            Quit quit4 = (Quit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, Quit$$serializer.INSTANCE, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, booleanSerializer, null);
            quit = quit4;
            str2 = str17;
            bool = bool8;
            str3 = str15;
            str6 = str16;
            str7 = str14;
            str5 = str18;
            bool4 = bool6;
            arrayList = arrayList2;
            bool3 = bool7;
            str4 = str13;
            i = 8191;
        } else {
            int i3 = 12;
            String str19 = null;
            ArrayList arrayList3 = null;
            String str20 = null;
            Boolean bool9 = null;
            String str21 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Quit quit5 = null;
            String str22 = null;
            String str23 = null;
            int i4 = 0;
            boolean z = true;
            String str24 = null;
            Boolean bool12 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        quit2 = quit5;
                        str8 = str23;
                        kSerializerArr = kSerializerArr3;
                        Boolean bool13 = bool11;
                        str9 = str19;
                        String str25 = str22;
                        bool5 = bool13;
                        z = false;
                        str10 = str25;
                        str19 = str9;
                        str23 = str8;
                        kSerializerArr3 = kSerializerArr;
                        bool11 = bool5;
                        str22 = str10;
                        quit5 = quit2;
                        i3 = 12;
                        i2 = 9;
                        break;
                    case 0:
                        quit2 = quit5;
                        str8 = str23;
                        kSerializerArr = kSerializerArr3;
                        Boolean bool14 = bool11;
                        str9 = str19;
                        String str26 = str22;
                        bool5 = bool14;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str26);
                        i4 |= 1;
                        str19 = str9;
                        str23 = str8;
                        kSerializerArr3 = kSerializerArr;
                        bool11 = bool5;
                        str22 = str10;
                        quit5 = quit2;
                        i3 = 12;
                        i2 = 9;
                        break;
                    case 1:
                        quit2 = quit5;
                        str8 = str23;
                        kSerializerArr = kSerializerArr3;
                        Boolean bool15 = bool11;
                        str9 = str19;
                        i4 |= 2;
                        str10 = str22;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, bool15);
                        str19 = str9;
                        str23 = str8;
                        kSerializerArr3 = kSerializerArr;
                        bool11 = bool5;
                        str22 = str10;
                        quit5 = quit2;
                        i3 = 12;
                        i2 = 9;
                        break;
                    case 2:
                        quit3 = quit5;
                        kSerializerArr2 = kSerializerArr3;
                        bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool12);
                        i4 |= 4;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 12;
                        quit5 = quit3;
                        i2 = 9;
                        break;
                    case 3:
                        quit3 = quit5;
                        str11 = str23;
                        kSerializerArr2 = kSerializerArr3;
                        i4 |= 8;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str24);
                        str23 = str11;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 12;
                        quit5 = quit3;
                        i2 = 9;
                        break;
                    case 4:
                        quit3 = quit5;
                        str11 = str23;
                        kSerializerArr2 = kSerializerArr3;
                        i4 |= 16;
                        arrayList3 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr3[4], arrayList3);
                        str23 = str11;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 12;
                        quit5 = quit3;
                        i2 = 9;
                        break;
                    case 5:
                        str11 = str23;
                        quit3 = (Quit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, Quit$$serializer.INSTANCE, quit5);
                        i4 |= 32;
                        kSerializerArr2 = kSerializerArr3;
                        str23 = str11;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 12;
                        quit5 = quit3;
                        i2 = 9;
                        break;
                    case 6:
                        i4 |= 64;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str23);
                        quit3 = quit5;
                        kSerializerArr2 = kSerializerArr3;
                        str23 = str11;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 12;
                        quit5 = quit3;
                        i2 = 9;
                        break;
                    case 7:
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, bool9);
                        i4 |= 128;
                        quit3 = quit5;
                        str11 = str23;
                        kSerializerArr2 = kSerializerArr3;
                        str23 = str11;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 12;
                        quit5 = quit3;
                        i2 = 9;
                        break;
                    case 8:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str19);
                        i4 |= 256;
                        quit3 = quit5;
                        str11 = str23;
                        kSerializerArr2 = kSerializerArr3;
                        str23 = str11;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 12;
                        quit5 = quit3;
                        i2 = 9;
                        break;
                    case 9:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str21);
                        i4 |= 512;
                        quit3 = quit5;
                        str11 = str23;
                        kSerializerArr2 = kSerializerArr3;
                        str23 = str11;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 12;
                        quit5 = quit3;
                        i2 = 9;
                        break;
                    case 10:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str20);
                        i4 |= 1024;
                        quit3 = quit5;
                        str11 = str23;
                        kSerializerArr2 = kSerializerArr3;
                        str23 = str11;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 12;
                        quit5 = quit3;
                        i2 = 9;
                        break;
                    case 11:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str12);
                        i4 |= 2048;
                        quit3 = quit5;
                        str11 = str23;
                        kSerializerArr2 = kSerializerArr3;
                        str23 = str11;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 12;
                        quit5 = quit3;
                        i2 = 9;
                        break;
                    case 12:
                        i4 |= 4096;
                        bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, BooleanSerializer.INSTANCE, bool10);
                        quit3 = quit5;
                        str11 = str23;
                        kSerializerArr2 = kSerializerArr3;
                        str23 = str11;
                        kSerializerArr3 = kSerializerArr2;
                        i3 = 12;
                        quit5 = quit3;
                        i2 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str27 = str23;
            str = str12;
            arrayList = arrayList3;
            quit = quit5;
            bool = bool9;
            str2 = str21;
            bool2 = bool10;
            bool3 = bool12;
            str3 = str27;
            bool4 = bool11;
            str4 = str22;
            str5 = str20;
            str6 = str19;
            str7 = str24;
            i = i4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SelectWalletVerificationAppModel(i, str4, bool4, bool3, str7, arrayList, quit, str3, bool, str6, str2, str5, str, bool2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SelectWalletVerificationAppModel selectWalletVerificationAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(selectWalletVerificationAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SelectWalletVerificationAppModel.write$Self$OKCompliance_ok_compliance_impl(selectWalletVerificationAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
