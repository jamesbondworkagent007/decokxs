package com.okinc.ok_kyc_core.data.remote.networkmodel;

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
public final /* synthetic */ class MergeAccountBottomPopUp$$serializer implements GeneratedSerializer<MergeAccountBottomPopUp> {
    public static final int $stable;
    public static final MergeAccountBottomPopUp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MergeAccountBottomPopUp$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MergeAccountBottomPopUp$$serializer mergeAccountBottomPopUp$$serializer = new MergeAccountBottomPopUp$$serializer();
        INSTANCE = mergeAccountBottomPopUp$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("identify-already-identify-bottom-pop-up", mergeAccountBottomPopUp$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("actionParams", false);
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
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(AccountMergeActionParams$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MergeAccountBottomPopUp deserialize(@NotNull Decoder decoder) {
        int i;
        Boolean bool;
        Float f;
        Float f2;
        String str;
        String str2;
        Boolean bool2;
        AccountMergeActionParams accountMergeActionParams;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        int i3 = 6;
        String str5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            accountMergeActionParams = (AccountMergeActionParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, AccountMergeActionParams$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, floatSerializer, null);
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, floatSerializer, null);
            f2 = f3;
            str = str8;
            bool2 = bool3;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            str3 = str7;
            i = 511;
            str2 = str6;
            str4 = strDecodeStringElement;
        } else {
            int i4 = 0;
            boolean z = true;
            String str9 = null;
            Float f4 = null;
            String str10 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Float f5 = null;
            AccountMergeActionParams accountMergeActionParams2 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 1:
                        accountMergeActionParams2 = (AccountMergeActionParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, AccountMergeActionParams$$serializer.INSTANCE, accountMergeActionParams2);
                        i4 |= 2;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 2:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str5);
                        i4 |= 4;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 3:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool4);
                        i4 |= 8;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 4:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str9);
                        i4 |= 16;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 5:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str10);
                        i4 |= 32;
                        break;
                    case 6:
                        i4 |= 64;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f4);
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 7:
                        i4 |= 128;
                        f5 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FloatSerializer.INSTANCE, f5);
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 8:
                        i4 |= 256;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool5);
                        i2 = 7;
                        i3 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            bool = bool5;
            f = f5;
            f2 = f4;
            str = str10;
            str2 = str5;
            bool2 = bool4;
            accountMergeActionParams = accountMergeActionParams2;
            str3 = str9;
            str4 = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MergeAccountBottomPopUp(i, str4, accountMergeActionParams, str2, bool2, str3, str, f2, f, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.MergeAccountBottomPopUp.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.MergeAccountBottomPopUp, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MergeAccountBottomPopUp mergeAccountBottomPopUp) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(mergeAccountBottomPopUp, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MergeAccountBottomPopUp.write$Self$OKCompliance_ok_compliance_impl(mergeAccountBottomPopUp, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
