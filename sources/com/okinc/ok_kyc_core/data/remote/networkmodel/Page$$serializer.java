package com.okinc.ok_kyc_core.data.remote.networkmodel;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class Page$$serializer implements GeneratedSerializer<Page> {
    public static final int $stable;
    public static final Page$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Page$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Page$$serializer page$$serializer = new Page$$serializer();
        INSTANCE = page$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.Page", page$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement("primaryButton", true);
        pluginGeneratedSerialDescriptor.addElement("secondaryButton", true);
        pluginGeneratedSerialDescriptor.addElement("btnTips", true);
        pluginGeneratedSerialDescriptor.addElement("steps", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("stepTitle", true);
        pluginGeneratedSerialDescriptor.addElement("titleAlign", true);
        pluginGeneratedSerialDescriptor.addElement("contentAlign", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = Page.$childSerializers;
        KSerializer nullable = BuiltinSerializersKt.getNullable(kSerializerArr[0]);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(PrimaryButton$$serializer.INSTANCE);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(SecondaryButton$$serializer.INSTANCE);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(BtnTips$$serializer.INSTANCE);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(kSerializerArr[4]);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Page deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        List list;
        PrimaryButton primaryButton;
        List list2;
        int i;
        String str5;
        SecondaryButton secondaryButton;
        BtnTips btnTips;
        PrimaryButton primaryButton2;
        List list3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = Page.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        int i5 = 8;
        String str6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            primaryButton = (PrimaryButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, PrimaryButton$$serializer.INSTANCE, null);
            SecondaryButton secondaryButton2 = (SecondaryButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SecondaryButton$$serializer.INSTANCE, null);
            BtnTips btnTips2 = (BtnTips) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BtnTips$$serializer.INSTANCE, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            list = list5;
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            str = str9;
            str4 = str8;
            str5 = str7;
            btnTips = btnTips2;
            str2 = str10;
            i = 1023;
            secondaryButton = secondaryButton2;
            list2 = list4;
        } else {
            boolean z = true;
            int i6 = 0;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            SecondaryButton secondaryButton3 = null;
            BtnTips btnTips3 = null;
            PrimaryButton primaryButton3 = null;
            List list6 = null;
            List list7 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        primaryButton2 = primaryButton3;
                        list3 = list6;
                        z = false;
                        list6 = list3;
                        primaryButton3 = primaryButton2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 0:
                        primaryButton2 = primaryButton3;
                        list3 = list6;
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], list7);
                        i6 |= 1;
                        list6 = list3;
                        primaryButton3 = primaryButton2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 1:
                        list3 = list6;
                        i6 |= 2;
                        primaryButton2 = (PrimaryButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, PrimaryButton$$serializer.INSTANCE, primaryButton3);
                        list6 = list3;
                        primaryButton3 = primaryButton2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 2:
                        list3 = list6;
                        secondaryButton3 = (SecondaryButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SecondaryButton$$serializer.INSTANCE, secondaryButton3);
                        i6 |= 4;
                        primaryButton2 = primaryButton3;
                        list6 = list3;
                        primaryButton3 = primaryButton2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 3:
                        list3 = list6;
                        btnTips3 = (BtnTips) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BtnTips$$serializer.INSTANCE, btnTips3);
                        i6 |= 8;
                        primaryButton2 = primaryButton3;
                        list6 = list3;
                        primaryButton3 = primaryButton2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 4:
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], list6);
                        i6 |= 16;
                        primaryButton2 = primaryButton3;
                        list3 = list6;
                        list6 = list3;
                        primaryButton3 = primaryButton2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 5:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str14);
                        i6 |= 32;
                        primaryButton2 = primaryButton3;
                        list3 = list6;
                        list6 = list3;
                        primaryButton3 = primaryButton2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 6:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str6);
                        i6 |= 64;
                        primaryButton2 = primaryButton3;
                        list3 = list6;
                        list6 = list3;
                        primaryButton3 = primaryButton2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 7:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str11);
                        i6 |= 128;
                        primaryButton2 = primaryButton3;
                        list3 = list6;
                        list6 = list3;
                        primaryButton3 = primaryButton2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 8:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str12);
                        i6 |= 256;
                        break;
                    case 9:
                        i6 |= 512;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str13);
                        primaryButton2 = primaryButton3;
                        list3 = list6;
                        list6 = list3;
                        primaryButton3 = primaryButton2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            PrimaryButton primaryButton4 = primaryButton3;
            str = str11;
            str2 = str12;
            str3 = str13;
            str4 = str6;
            list = list6;
            primaryButton = primaryButton4;
            list2 = list7;
            i = i6;
            BtnTips btnTips4 = btnTips3;
            str5 = str14;
            secondaryButton = secondaryButton3;
            btnTips = btnTips4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Page(i, list2, primaryButton, secondaryButton, btnTips, list, str5, str4, str, str2, str3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Page page) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(page, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Page.write$Self$OKCompliance_ok_compliance_impl(page, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
