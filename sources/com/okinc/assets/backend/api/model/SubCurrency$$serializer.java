package com.okinc.assets.backend.api.model;

import com.okinc.assets.backend.api.model.SubCurrency;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class SubCurrency$$serializer implements GeneratedSerializer<SubCurrency> {
    public static final int $stable;
    public static final SubCurrency$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SubCurrency$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SubCurrency$$serializer subCurrency$$serializer = new SubCurrency$$serializer();
        INSTANCE = subCurrency$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.assets.backend.api.model.SubCurrency", subCurrency$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("desc", true);
        pluginGeneratedSerialDescriptor.addElement("subCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("subCurrencyId", true);
        pluginGeneratedSerialDescriptor.addElement("needTag", true);
        pluginGeneratedSerialDescriptor.addElement("specialField", true);
        pluginGeneratedSerialDescriptor.addElement("networkName", true);
        pluginGeneratedSerialDescriptor.addElement("networkIcon", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), IntSerializer.INSTANCE, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(SubCurrency$SpecialField$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SubCurrency deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        SubCurrency.SpecialField specialField;
        String str3;
        String str4;
        boolean z;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            SubCurrency.SpecialField specialField2 = (SubCurrency.SpecialField) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, SubCurrency$SpecialField$$serializer.INSTANCE, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            i2 = 127;
            str2 = str7;
            z = zDecodeBooleanElement;
            specialField = specialField2;
            i = iDecodeIntElement;
            str3 = str5;
            str4 = str6;
        } else {
            int i4 = 0;
            int iDecodeIntElement2 = 0;
            boolean z2 = true;
            String str8 = null;
            String str9 = null;
            SubCurrency.SpecialField specialField3 = null;
            String str10 = null;
            String str11 = null;
            boolean zDecodeBooleanElement2 = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 6;
                        break;
                    case 0:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str10);
                        i4 |= 1;
                        i3 = 6;
                        break;
                    case 1:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str11);
                        i4 |= 2;
                        i3 = 6;
                        break;
                    case 2:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i4 |= 4;
                        i3 = 6;
                        break;
                    case 3:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i4 |= 8;
                        i3 = 6;
                        break;
                    case 4:
                        i4 |= 16;
                        specialField3 = (SubCurrency.SpecialField) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, SubCurrency$SpecialField$$serializer.INSTANCE, specialField3);
                        i3 = 6;
                        break;
                    case 5:
                        i4 |= 32;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str9);
                        i3 = 6;
                        break;
                    case 6:
                        i4 |= 64;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str8);
                        i3 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str8;
            str2 = str9;
            specialField = specialField3;
            str3 = str10;
            str4 = str11;
            z = zDecodeBooleanElement2;
            i = iDecodeIntElement2;
            i2 = i4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SubCurrency(i2, str3, str4, i, z, specialField, str2, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SubCurrency subCurrency) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(subCurrency, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SubCurrency.write$Self$OKAssets_assets_pro_api(subCurrency, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
